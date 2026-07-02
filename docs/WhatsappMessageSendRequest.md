

# WhatsappMessageSendRequest

Provide exactly one of `to` or `recipient`. If both are provided, `to` takes precedence and `recipient` is ignored.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | **String** | The sender&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
|**to** | **String** | The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. Required when &#x60;recipient&#x60; is not provided. |  [optional] |
|**recipient** | **String** | The recipient&#39;s WhatsApp Business-scoped user ID (BSUID) or parent BSUID. Required when &#x60;to&#x60; is not provided. |  [optional] |
|**customerProfile** | [**WhatsappProfile**](WhatsappProfile.md) |  |  [optional] |
|**type** | **WhatsappMessageType** |  |  |
|**template** | [**WhatsappMessageTemplate**](WhatsappMessageTemplate.md) |  |  [optional] |
|**text** | [**WhatsappMessageText**](WhatsappMessageText.md) |  |  [optional] |
|**image** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**video** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**audio** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**document** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**sticker** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**location** | [**WhatsappMessageLocation**](WhatsappMessageLocation.md) |  |  [optional] |
|**interactive** | [**WhatsappMessageInteractive**](WhatsappMessageInteractive.md) |  |  [optional] |
|**contacts** | [**List&lt;WhatsappMessageContact&gt;**](WhatsappMessageContact.md) | Required when &#x60;type&#x60; is &#x60;contacts&#x60;. |  [optional] |
|**reaction** | [**WhatsappMessageReaction**](WhatsappMessageReaction.md) |  |  [optional] |
|**context** | [**WhatsappMessageContext**](WhatsappMessageContext.md) |  |  [optional] |
|**externalId** | **String** | A unique (recommended) string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems. |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) | **Optional.** Indicates the category of the message to be sent with Direct Send. Supported values are &#x60;utility&#x60; and &#x60;authentication&#x60;.  Use &#x60;utility&#x60; for business-initiated utility messages. Messages sent with &#x60;utility&#x60; are charged at utility rates.  Use &#x60;authentication&#x60; for business-initiated authentication messages. Messages sent with &#x60;authentication&#x60; are charged at authentication rates. Authentication Direct Send only supports &#x60;text&#x60; messages. |  [optional] |
|**ttlSeconds** | **Integer** | **Optional.** Message time-to-live in seconds for Direct Send &#x60;utility&#x60; or &#x60;authentication&#x60; messages.  The supported range is 30 seconds to 43200 seconds (12 hours). If omitted, the default Direct Send TTL is used. |  [optional] |
|**useDirectSend** | **Boolean** | **Optional.** Whether to send the message through Direct Send. Defaults to &#x60;false&#x60;.  Set this to &#x60;true&#x60; to send the message through Direct Send when the sender WABA is enabled for Direct Send.  For template messages, the template must be convertible to a Direct Send message type. Supported Direct Send message types for template conversion are:  - Text messages - Interactive Call-to-Action URL button messages - Interactive reply button messages |  [optional] |
|**filterUnsubscribed** | **Boolean** | **Optional.** If set to &#x60;true&#x60;, the message will not be sent to users who have unsubscribed from your account. Defaults to &#x60;false&#x60;.  Only use for &#x60;POST /v2/whatsapp/messages&#x60;. If the user has unsubscribed, we will push webhook notifications with &#x60;whatsappMessage.errorCode&#x60; set to &#x60;RECIPIENT_UNSUBSCRIBED&#x60;.  Not applicable to &#x60;POST /v2/whatsapp/messages/sendDirectly&#x60;. |  [optional] |
|**filterBlocked** | **Boolean** | **Optional.** If set to &#x60;true&#x60;, the message will not be sent to users in your block list. Defaults to &#x60;false&#x60;.  Only use for &#x60;POST /v2/whatsapp/messages&#x60;. If the user is in your block list, we will push webhook notifications with &#x60;whatsappMessage.errorCode&#x60; set to &#x60;RECIPIENT_IN_BLOCK_LIST&#x60;.  Not applicable to &#x60;POST /v2/whatsapp/messages/sendDirectly&#x60;. |  [optional] |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| UTILITY | &quot;utility&quot; |
| AUTHENTICATION | &quot;authentication&quot; |
