

# WhatsappMessageSendRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | **String** | The sender&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
|**to** | **String** | The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
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
|**externalId** | **String** | A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems. |  [optional] |
|**filterUnsubscribed** | **Boolean** | **Optional.** If set to &#x60;true&#x60;, the message will not be sent to users who have unsubscribed from your account. Defaults to &#x60;false&#x60;.  Only use for &#x60;POST /v2/whatsapp/messages&#x60;. If the user has unsubscribed, we will push webhook notifications with &#x60;whatsappMessage.errorCode&#x60; set to &#x60;RECIPIENT_UNSUBSCRIBED&#x60;.  Not applicable to &#x60;POST /v2/whatsapp/message/sendDirectly&#x60;. |  [optional] |
|**filterBlocked** | **Boolean** | **Optional.** If set to &#x60;true&#x60;, the message will not be sent to users in your block list. Defaults to &#x60;false&#x60;.  Only use for &#x60;POST /v2/whatsapp/messages&#x60;. If the user is in your block list, we will push webhook notifications with &#x60;whatsappMessage.errorCode&#x60; set to &#x60;RECIPIENT_IN_BLOCK_LIST&#x60;.  Not applicable to &#x60;POST /v2/whatsapp/message/sendDirectly&#x60;. |  [optional] |



