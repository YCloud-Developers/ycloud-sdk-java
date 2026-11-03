

# AgentEventStatusDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**eventType** | **String** |  |  |
|**errorMessage** | **String** |  |  [optional] |
|**skippedReason** | **String** |  |  [optional] |
|**createdAt** | **String** |  |  |
|**updatedAt** | **String** |  |  |
|**conversationId** | **String** | Optional app-scoped opaque conversation ID, also returned by Conversation Turns. Omitted when unavailable; not an event ID or proof of message delivery. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REQUEST_RECEIVED | &quot;request_received&quot; |
| PROCESSING | &quot;processing&quot; |
| SENT | &quot;sent&quot; |
| FAILED | &quot;failed&quot; |
| SKIPPED | &quot;skipped&quot; |
| SUCCESS | &quot;success&quot; |
