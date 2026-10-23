

# MetaBusinessAgentConversationTurn


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**turnId** | **String** |  |  |
|**conversationId** | **String** | App-scoped opaque identifier for the conversation containing this turn. |  |
|**messageId** | **String** | WhatsApp Cloud API message ID associated with this turn, when available. |  [optional] |
|**e2eLatencyMs** | **Long** |  |  [optional] |
|**timestamp** | **Long** | Turn timestamp as Unix epoch milliseconds. |  [optional] |
|**steps** | [**List&lt;MetaBusinessAgentConversationTurnStep&gt;**](MetaBusinessAgentConversationTurnStep.md) |  |  |
