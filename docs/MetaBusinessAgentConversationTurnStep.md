

# MetaBusinessAgentConversationTurnStep


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**latencyMs** | **Long** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**llmOutputPreview** | **String** |  |  [optional] |
|**toolName** | **String** |  |  [optional] |
|**toolInput** | **String** |  |  [optional] |
|**toolOutput** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LLM_CALL | &quot;LLM_CALL&quot; |
| TOOL_CALL | &quot;TOOL_CALL&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| ERROR | &quot;ERROR&quot; |
| TIMEOUT | &quot;TIMEOUT&quot; |
