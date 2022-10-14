

# WhatsappMessage

WhatsApp outbound message object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the object. |  |
|**from** | **String** | The sender&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
|**to** | **String** | The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
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
|**status** | **String** | One of &#x60;accepted&#x60;, &#x60;sent&#x60;, &#x60;failed&#x60;, &#x60;delivered&#x60;, &#x60;read&#x60;. - &#x60;accepted&#x60;: The messaging request is accepted by our system. - &#x60;sent&#x60;: A message sent by your business is in transit within WhatsApp&#39;s systems. - &#x60;failed&#x60;: A message sent by your business failed to send. - &#x60;delivered&#x60;: A message sent by your business was delivered to the user&#39;s device. - &#x60;read&#x60;: A message sent by your business was read by the user. |  [optional] |
|**errorCode** | **String** | Error code when the message status is &#x60;failed&#x60;. |  [optional] |
|**errorMessage** | **String** | Error message when the message status is &#x60;failed&#x60;. |  [optional] |
|**createTime** | **Date** | The time at which this message is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**updateTime** | **Date** | The time at which this message is updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |



