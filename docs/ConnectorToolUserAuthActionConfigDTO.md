

# ConnectorToolUserAuthActionConfigDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userActionToolType** | [**UserActionToolTypeEnum**](#UserActionToolTypeEnum) |  |  |
|**userAuthTokenPath** | **String** |  |  |
|**refreshTokenPath** | **String** |  |  [optional] |
|**expiresAtPath** | **String** |  |  [optional] |
|**expiresAtType** | [**ExpiresAtTypeEnum**](#ExpiresAtTypeEnum) |  |  [optional] |



## Enum: UserActionToolTypeEnum

| Name | Value |
|---- | -----|
| AUTH | &quot;auth&quot; |
| REFRESH | &quot;refresh&quot; |



## Enum: ExpiresAtTypeEnum

| Name | Value |
|---- | -----|
| ABSOLUTE | &quot;absolute&quot; |
| RELATIVE_SECONDS | &quot;relative_seconds&quot; |
