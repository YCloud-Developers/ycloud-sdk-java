

# ConnectorMcpToolSyncDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Tool discovery state. ERROR indicates discovery failure even when the connector operation succeeds. |  |
|**lastAttemptedAt** | **Long** | Last discovery attempt, in Unix seconds. |  [optional] |
|**lastSuccessfulAt** | **Long** | Last successful discovery, in Unix seconds. |  [optional] |
|**fingerprint** | **String** |  |  [optional] |
|**toolCount** | **Integer** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ERROR | &quot;ERROR&quot; |
| PENDING | &quot;PENDING&quot; |
| READY | &quot;READY&quot; |
