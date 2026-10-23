

# ConnectorDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**baseUrl** | **String** |  |  [optional] |
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) |  |  [optional] |
|**authConfig** | [**ConnectorAuthConfigDTO**](ConnectorAuthConfigDTO.md) |  |  [optional] |
|**mtlsConfig** | [**MtlsConfigDTO**](MtlsConfigDTO.md) |  |  [optional] |
|**connectionStatus** | [**ConnectionStatusDTO**](ConnectionStatusDTO.md) |  |  [optional] |
|**userAuthInjectionConfig** | [**UserAuthInjectionConfigDTO**](UserAuthInjectionConfigDTO.md) |  |  [optional] |
|**connectorProtocol** | [**ConnectorProtocolEnum**](#ConnectorProtocolEnum) | Connector protocol. Omit on creation to use Meta’s HTTP default. The protocol cannot change after creation; omit on update to preserve it. |  [optional] |
|**mcpToolSync** | [**ConnectorMcpToolSyncDTO**](ConnectorMcpToolSyncDTO.md) |  |  [optional] |



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
