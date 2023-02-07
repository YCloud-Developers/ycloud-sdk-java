

# WhatsappMessage

WhatsApp outbound message object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the object. |  |
|**wamid** | **String** | The native WhatsApp message ID. |  [optional] |
|**wabaId** | **String** | WhatsApp Business Account ID. |  |
|**from** | **String** | The sender&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
|**to** | **String** | The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
|**conversation** | [**WhatsappConversation**](WhatsappConversation.md) |  |  [optional] |
|**type** | **WhatsappMessageType** |  |  |
|**template** | [**WhatsappMessageTemplate**](WhatsappMessageTemplate.md) |  |  [optional] |
|**text** | [**WhatsappMessageText**](WhatsappMessageText.md) |  |  [optional] |
|**image** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**video** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**audio** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**document** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**location** | [**WhatsappMessageLocation**](WhatsappMessageLocation.md) |  |  [optional] |
|**interactive** | [**WhatsappMessageInteractive**](WhatsappMessageInteractive.md) |  |  [optional] |
|**contacts** | [**List&lt;WhatsappMessageContact&gt;**](WhatsappMessageContact.md) |  |  [optional] |
|**externalId** | **String** | A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems. |  [optional] |
|**status** | **WhatsappMessageStatus** |  |  [optional] |
|**errorCode** | **String** | Error code when the message status is &#x60;failed&#x60;. |  [optional] |
|**errorMessage** | **String** | Error message when the message status is &#x60;failed&#x60;. |  [optional] |
|**createTime** | **Date** | The time at which this message is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**updateTime** | **Date** | The time at which this message is updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**totalPrice** | **Double** | Total price of this message. |  [optional] |
|**currency** | **String** | Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217). |  [optional] |
|**whatsappApiError** | [**WhatsappApiError**](WhatsappApiError.md) |  |  [optional] |



