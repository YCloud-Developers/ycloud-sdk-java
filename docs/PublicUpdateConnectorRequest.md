

# PublicUpdateConnectorRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  |
|**baseUrl** | **String** |  |  |
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) |  |  |
|**authConfig** | [**ConnectorAuthConfigDTO**](ConnectorAuthConfigDTO.md) |  |  [optional] |
|**userAuthInjectionConfig** | [**UserAuthInjectionConfigDTO**](UserAuthInjectionConfigDTO.md) |  |  [optional] |
|**requiresCertificate** | **Boolean** |  |  [optional] |
|**connectorProtocol** | [**ConnectorProtocolEnum**](#ConnectorProtocolEnum) | Connector protocol. Omit on creation to use Meta’s HTTP default. The protocol cannot change after creation; omit on update to preserve it. |  [optional] |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| OAUTH2 | &quot;OAUTH2&quot; |
| OAUTH2_CLIENT_CREDENTIALS | &quot;OAUTH2_CLIENT_CREDENTIALS&quot; |
| API_KEY | &quot;API_KEY&quot; |
| BASIC | &quot;BASIC&quot; |
| CUSTOM | &quot;CUSTOM&quot; |
| NONE | &quot;NONE&quot; |



## Enum: ConnectorProtocolEnum

| Name | Value |
|---- | -----|
| HTTP | &quot;HTTP&quot; |
| MCP | &quot;MCP&quot; |
