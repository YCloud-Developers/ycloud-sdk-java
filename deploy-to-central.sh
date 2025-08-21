#!/bin/bash

# ================================================================
# Maven Central 发布自动化脚本
# 用途：自动检查发布条件并执行发布流程
# ================================================================

set -e  # 遇到错误立即停止

# 颜色定义
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# 日志函数
log_info() {
    echo -e "${BLUE}[INFO]${NC} $1"
}

log_success() {
    echo -e "${GREEN}[SUCCESS]${NC} $1"
}

log_warning() {
    echo -e "${YELLOW}[WARNING]${NC} $1"
}

log_error() {
    echo -e "${RED}[ERROR]${NC} $1"
}

# 检查命令是否存在
check_command() {
    if ! command -v $1 &> /dev/null; then
        log_error "命令 '$1' 未找到，请先安装"
        exit 1
    fi
}

# 检查文件是否存在
check_file() {
    if [ ! -f "$1" ]; then
        log_error "文件 '$1' 不存在"
        return 1
    fi
    return 0
}

# 检查目录是否存在
check_directory() {
    if [ ! -d "$1" ]; then
        log_error "目录 '$1' 不存在"
        return 1
    fi
    return 0
}

echo "================================================================"
echo "🚀 Maven Central 发布检查和部署脚本"
echo "================================================================"

# ================================================================
# 1. 基础环境检查
# ================================================================
log_info "1. 检查基础环境..."

# 检查必要命令
check_command "mvn"
check_command "gpg"
check_command "curl"

# 检查Java环境
if [ -z "$JAVA_HOME" ]; then
    log_warning "JAVA_HOME 未设置，使用系统默认Java"
else
    log_success "JAVA_HOME: $JAVA_HOME"
fi

java -version 2>&1 | head -1
mvn --version | head -1

# ================================================================
# 2. 项目文件检查
# ================================================================
log_info "2. 检查项目文件..."

# 检查核心文件
check_file "pom.xml" || exit 1
check_file "settings-deploy.xml" || {
    log_error "settings-deploy.xml 不存在，请先创建此文件"
    log_info "参考内容应包含 central server 的认证配置"
    exit 1
}

log_success "项目核心文件检查通过"

# ================================================================
# 3. POM.xml 配置检查
# ================================================================
log_info "3. 检查 pom.xml 配置..."

# 检查必要的Maven插件和配置
required_configs=(
    "distributionManagement"
    "maven-source-plugin"
    "maven-javadoc-plugin"
    "maven-gpg-plugin"
    "central-publishing-maven-plugin"
)

for config in "${required_configs[@]}"; do
    if grep -q "$config" pom.xml; then
        log_success "✓ $config 配置存在"
    else
        log_error "✗ $config 配置缺失"
        exit 1
    fi
done

# 检查版本号
version=$(mvn help:evaluate -Dexpression=project.version -q -DforceStdout)
if [[ "$version" == *"SNAPSHOT"* ]]; then
    log_warning "当前版本是SNAPSHOT: $version"
    log_warning "Maven Central不接受SNAPSHOT版本，建议使用正式版本号"
else
    log_success "版本号: $version"
fi

# 检查groupId
groupId=$(mvn help:evaluate -Dexpression=project.groupId -q -DforceStdout)
log_info "GroupId: $groupId"

# 检查artifactId
artifactId=$(mvn help:evaluate -Dexpression=project.artifactId -q -DforceStdout)
log_info "ArtifactId: $artifactId"

# ================================================================
# 4. GPG 签名检查
# ================================================================
log_info "4. 检查 GPG 签名配置..."

# 检查GPG密钥
if gpg --list-secret-keys --keyid-format=long | grep -q "sec"; then
    log_success "GPG 私钥存在"
    gpg --list-secret-keys --keyid-format=long | grep "sec" | head -1
else
    log_error "未找到GPG私钥，请先生成GPG密钥对"
    log_info "生成命令: gpg --gen-key"
    exit 1
fi

# 测试GPG签名
test_file="/tmp/gpg-test-$$"
echo "test" > "$test_file"
if gpg --armor --detach-sign "$test_file" 2>/dev/null; then
    log_success "GPG 签名测试通过"
    rm -f "$test_file" "$test_file.asc"
else
    log_error "GPG 签名测试失败"
    rm -f "$test_file"
    exit 1
fi

# ================================================================
# 5. Settings.xml 认证检查
# ================================================================
log_info "5. 检查 settings-deploy.xml 认证配置..."

if grep -q "<username>" settings-deploy.xml && grep -q "<password>" settings-deploy.xml; then
    log_success "settings-deploy.xml 包含认证信息"
    
    # 提取用户名进行验证（不显示密码）
    username=$(grep -o '<username>[^<]*</username>' settings-deploy.xml | sed 's/<username>//;s/<\/username>//')
    if [ ! -z "$username" ]; then
        log_success "用户名: $username"
        
        # 测试认证是否有效
        log_info "测试 Sonatype 认证..."
        if curl -s -f --user "$username:$(grep -o '<password>[^<]*</password>' settings-deploy.xml | sed 's/<password>//;s/<\/password>//')" \
           "https://s01.oss.sonatype.org/service/local/staging/profiles" > /dev/null; then
            log_success "Sonatype 认证有效"
        else
            log_error "Sonatype 认证失败，请检查用户名和密码"
            exit 1
        fi
    else
        log_error "settings-deploy.xml 中未找到有效的用户名"
        exit 1
    fi
else
    log_error "settings-deploy.xml 缺少认证信息"
    exit 1
fi

# ================================================================
# 6. 清理和编译检查
# ================================================================
log_info "6. 执行清理和编译..."

log_info "清理旧的构建文件..."
mvn clean -q

log_info "执行编译和测试..."
if mvn compile test-compile -q; then
    log_success "编译成功"
else
    log_error "编译失败"
    exit 1
fi

# ================================================================
# 7. 打包检查
# ================================================================
log_info "7. 执行打包..."

log_info "生成所有必要的包（源码包、文档包、签名文件）..."
if mvn package -DskipTests -Psign-artifacts -q; then
    log_success "打包成功"
else
    log_error "打包失败"
    exit 1
fi

# 检查生成的文件
log_info "检查生成的文件..."
target_files=(
    "target/${artifactId}-${version}.jar"
    "target/${artifactId}-${version}.pom"
    "target/${artifactId}-${version}-sources.jar"
    "target/${artifactId}-${version}-javadoc.jar"
)

for file in "${target_files[@]}"; do
    if [ -f "$file" ]; then
        log_success "✓ $file"
        # 检查对应的签名文件
        if [ -f "$file.asc" ]; then
            log_success "✓ $file.asc"
        else
            log_error "✗ $file.asc 签名文件缺失"
            exit 1
        fi
    else
        log_error "✗ $file 缺失"
        exit 1
    fi
done

# ================================================================
# 8. 部署前确认
# ================================================================
echo ""
log_warning "准备部署到 Maven Central..."
log_info "项目: $groupId:$artifactId:$version"
echo ""
read -p "确认要继续部署吗？(y/N): " -n 1 -r
echo ""

if [[ ! $REPLY =~ ^[Yy]$ ]]; then
    log_info "部署已取消"
    exit 0
fi

# ================================================================
# 9. 执行部署
# ================================================================
log_info "8. 执行部署到 Maven Central..."

log_info "开始部署，这可能需要几分钟..."
if mvn deploy -DskipTests -s settings-deploy.xml -Psign-artifacts; then
    log_success "🎉 部署成功！"
    
    echo ""
    echo "================================================================"
    log_success "✅ 部署完成！接下来的步骤："
    echo "================================================================"
    log_info "1. 访问: https://central.sonatype.com/publishing/deployments"
    log_info "2. 使用您的 Sonatype 账户登录"
    log_info "3. 找到刚才的部署记录"
    log_info "4. 点击 'Publish' 按钮完成发布"
    log_info "5. 发布后约需要10-30分钟同步到 Maven Central"
    echo ""
    log_info "🔍 可以在这里搜索您的包："
    log_info "   https://search.maven.org/search?q=g:$groupId%20AND%20a:$artifactId"
    echo "================================================================"
else
    log_error "部署失败，请检查错误信息"
    exit 1
fi
