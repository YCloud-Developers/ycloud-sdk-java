

# WhatsappMessage

WhatsApp outbound message object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID of the message. |  |
|**wamid** | **String** | The original message ID on WhatsApp&#39;s platform. |  [optional] |
|**wabaId** | **String** | WhatsApp Business Account ID. |  |
|**from** | **String** | The sender&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
|**to** | **String** | The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
|**conversation** | [**WhatsappConversation**](WhatsappConversation.md) |  |  [optional] |
|**type** | **WhatsappMessageType** |  |  [optional] |
|**template** | [**WhatsappMessageTemplate**](WhatsappMessageTemplate.md) |  |  [optional] |
|**text** | [**WhatsappMessageText**](WhatsappMessageText.md) |  |  [optional] |
|**image** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**video** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**audio** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**document** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**sticker** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**location** | [**WhatsappMessageLocation**](WhatsappMessageLocation.md) |  |  [optional] |
|**interactive** | [**WhatsappMessageInteractive**](WhatsappMessageInteractive.md) |  |  [optional] |
|**contacts** | [**List&lt;WhatsappMessageContact&gt;**](WhatsappMessageContact.md) |  |  [optional] |
|**reaction** | [**WhatsappMessageReaction**](WhatsappMessageReaction.md) |  |  [optional] |
|**context** | [**WhatsappMessageContext**](WhatsappMessageContext.md) |  |  [optional] |
|**externalId** | **String** | A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems. |  [optional] |
|**status** | **WhatsappMessageStatus** |  |  [optional] |
|**errorCode** | **String** | Error code when the message status is &#x60;failed&#x60;. |  [optional] |
|**errorMessage** | **String** | Error message when the message status is &#x60;failed&#x60;. |  [optional] |
|**createTime** | **Date** | The time at which this message is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**updateTime** | **Date** | The time at which this message is updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**sendTime** | **Date** | The time at which this message &#x60;status&#x60; changed to &#x60;sent&#x60;, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**deliverTime** | **Date** | The time at which this message &#x60;status&#x60; changed to &#x60;delivered&#x60;, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**readTime** | **Date** | The time at which this message &#x60;status&#x60; changed to &#x60;read&#x60;, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**totalPrice** | **Double** | Total price of this message. **Note: It&#39;s only an estimated price when the &#x60;status&#x60; is &#x60;accepted&#x60; or &#x60;sent&#x60;. It becomes the final price after the message is delivered, i.e., the &#x60;status&#x60; is &#x60;delivered&#x60; or &#x60;read&#x60;.** |  [optional] |
|**currency** | **String** | Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217). |  [optional] |
|**regionCode** | **String** | The [region code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) of the recipient phone number. |  [optional] |
|**whatsappApiError** | [**WhatsappApiError**](WhatsappApiError.md) |  |  [optional] |
|**bizType** | **String** | This can be either empty or one of &#x60;whatsapp&#x60;, or &#x60;verify&#x60;. Defaults to &#x60;whatsapp&#x60;. - &#x60;whatsapp&#x60;: Indicates that the message is sent via the **WhatsApp** product. - &#x60;verify&#x60;: Indicates that the message is sent via the **Verify** product. |  [optional] |
|**verificationId** | **String** | The verification ID. Included only when &#x60;bizType&#x60; is &#x60;verify&#x60;. |  [optional] |



