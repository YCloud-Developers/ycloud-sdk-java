

# WhatsappGroupWebhookMessageStatus

Group message status detail.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | WhatsApp message ID. |  [optional] |
|**status** | **String** | Message status. |  [optional] |
|**timestamp** | **Long** | Unix timestamp indicating when the message status was updated. |  [optional] |
|**recipientId** | **String** | Recipient group ID. |  [optional] |
|**recipientType** | [**RecipientTypeEnum**](#RecipientTypeEnum) | Recipient type. |  [optional] |
|**recipientParticipantId** | **String** | WhatsApp user ID of the recipient participant. |  [optional] |
|**recipientUserId** | **String** | Business-scoped user ID of the recipient participant. |  [optional] |
|**parentRecipientUserId** | **String** | Parent business-scoped user ID of the recipient participant. |  [optional] |
|**conversation** | [**WhatsappGroupWebhookConversation**](WhatsappGroupWebhookConversation.md) |  |  [optional] |
|**pricing** | [**WhatsappGroupWebhookPricing**](WhatsappGroupWebhookPricing.md) |  |  [optional] |
|**errors** | **List&lt;Map&lt;String, Object&gt;&gt;** | Errors returned by WhatsApp. |  [optional] |



## Enum: RecipientTypeEnum

| Name | Value |
|---- | -----|
| GROUP | &quot;group&quot; |



