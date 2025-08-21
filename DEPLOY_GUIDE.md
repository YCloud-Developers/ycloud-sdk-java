# Maven Central 发布指南

## 🚀 自动化发布脚本

我们提供了一个自动化脚本 `deploy-to-central.sh` 来简化 Maven Central 发布流程。

### 使用方法

```bash
# 直接运行脚本
./deploy-to-central.sh
```

### 脚本功能

这个脚本会自动执行以下检查和操作：

#### ✅ 1. 基础环境检查
- Maven 是否安装
- GPG 是否安装  
- Java 环境检查

#### ✅ 2. 项目文件检查
- `pom.xml` 是否存在
- `settings-deploy.xml` 是否存在

#### ✅ 3. POM.xml 配置检查
- `distributionManagement` 配置
- `maven-source-plugin` 插件
- `maven-javadoc-plugin` 插件
- `maven-gpg-plugin` 插件
- `central-publishing-maven-plugin` 插件
- 版本号检查（警告SNAPSHOT版本）

#### ✅ 4. GPG 签名检查
- GPG 私钥是否存在
- GPG 签名功能测试

#### ✅ 5. 认证配置检查
- `settings-deploy.xml` 中的认证信息
- Sonatype 认证有效性测试

#### ✅ 6. 编译检查
- 清理旧构建
- 编译和测试编译

#### ✅ 7. 打包检查
- 生成所有必要的包（jar、sources、javadoc）
- 生成GPG签名文件
- 验证所有文件存在

#### ✅ 8. 部署执行
- 用户确认
- 执行部署到 Maven Central

### 前置要求

在运行脚本之前，请确保：

1. **GPG 密钥已配置**
   ```bash
   # 检查GPG密钥
   gpg --list-secret-keys --keyid-format=long
   
   # 如果没有，生成新密钥
   gpg --gen-key
   ```

2. **settings-deploy.xml 已配置**
   
   确保文件包含您的 Sonatype User Token：
   ```xml
   <servers>
     <server>
       <id>central</id> 
       <username>您的用户名</username>
       <password>您的密码</password>
     </server>
   </servers>
   ```

3. **Sonatype 账户权限**
   
   确保您的账户有 `com.ycloud` groupId 的发布权限

### 手动发布步骤

如果您想手动执行，可以使用：

```bash
# 1. 清理和打包
mvn clean package -DskipTests -Psign-artifacts

# 2. 部署
mvn deploy -DskipTests -s settings-deploy.xml -Psign-artifacts
```

### 发布后步骤

脚本成功后，您需要：

1. 访问 [Sonatype Central Portal](https://central.sonatype.com/publishing/deployments)
2. 登录您的账户
3. 找到刚才的部署记录
4. 点击 **"Publish"** 按钮
5. 等待 10-30 分钟同步到 Maven Central

### 验证发布

发布完成后，可以在以下地址搜索您的包：

- [Maven Central Search](https://search.maven.org)
- 搜索：`g:com.ycloud AND a:ycloud-sdk-java`

### 故障排除

#### 常见问题：

1. **GPG 签名失败**
   - 检查GPG密钥是否存在
   - 确认GPG密钥没有设置密码，或者密码已正确配置

2. **认证失败**
   - 确认 User Token 是否正确
   - 检查网络连接

3. **权限错误**
   - 确认您的账户有对应 groupId 的发布权限
   - 联系 Sonatype 支持

4. **Mirror 冲突**
   - 脚本使用独立的 `settings-deploy.xml`，避免了公司内部mirror配置的冲突

#### 获取帮助：

如果遇到问题，可以：
1. 查看脚本输出的详细错误信息
2. 检查 [Sonatype 文档](https://central.sonatype.org/publish/)
3. 联系开发团队

### 示例输出

成功的脚本运行会显示类似：

```
================================================================
🚀 Maven Central 发布检查和部署脚本
================================================================
[INFO] 1. 检查基础环境...
[SUCCESS] JAVA_HOME: /usr/lib/jvm/java-11-openjdk
[INFO] 2. 检查项目文件...
[SUCCESS] 项目核心文件检查通过
[INFO] 3. 检查 pom.xml 配置...
[SUCCESS] ✓ distributionManagement 配置存在
...
[SUCCESS] 🎉 部署成功！
```

---

**注意**: 首次发布到新的 groupId 时，可能需要额外的验证步骤。请参考 [Sonatype 官方文档](https://central.sonatype.org/publish/) 了解详细要求。
