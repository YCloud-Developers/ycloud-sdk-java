

# WhatsappMessageReaction

When a user reacts to messages with an emoji, the message type is set to `reaction`, and this field is included.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageId** | **String** | Specifies the &#x60;wamid&#x60; of the message received that contained the reaction. |  |
|**emoji** | **String** | **Required** when you send a &#x60;reaction&#x60; message. Set it to &#x60;\&quot;\&quot;&#x60; if you want to remove the emoji. **Optional** when you received a message from a user. This field is included when a user reacts to messages with an emoji. Otherwise, it indicates a user removed the emoji. |  [optional] |



