

# WhatsappInboundMessage

WhatsApp inbound message object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the object. |  |
|**wamid** | **String** | The native WhatsApp message ID. |  [optional] |
|**wabaId** | **String** | WhatsApp Business Account ID. |  [optional] |
|**from** | **String** | The customer&#39;s phone number who sent the message to the business, formatted in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  [optional] |
|**customerProfile** | [**WhatsappProfile**](WhatsappProfile.md) |  |  [optional] |
|**to** | **String** | The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  [optional] |
|**sendTime** | **Date** | The time at which this message is sent, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**type** | **WhatsappInboundMessageType** |  |  [optional] |
|**text** | [**WhatsappInboundMessageText**](WhatsappInboundMessageText.md) |  |  [optional] |
|**image** | [**WhatsappInboundMessageMedia**](WhatsappInboundMessageMedia.md) |  |  [optional] |
|**video** | [**WhatsappInboundMessageMedia**](WhatsappInboundMessageMedia.md) |  |  [optional] |
|**audio** | [**WhatsappInboundMessageMedia**](WhatsappInboundMessageMedia.md) |  |  [optional] |
|**document** | [**WhatsappInboundMessageMedia**](WhatsappInboundMessageMedia.md) |  |  [optional] |
|**sticker** | [**WhatsappInboundMessageMedia**](WhatsappInboundMessageMedia.md) |  |  [optional] |
|**interactive** | [**WhatsappInboundMessageInteractive**](WhatsappInboundMessageInteractive.md) |  |  [optional] |
|**location** | [**WhatsappInboundMessageLocation**](WhatsappInboundMessageLocation.md) |  |  [optional] |
|**button** | [**WhatsappInboundMessageButton**](WhatsappInboundMessageButton.md) |  |  [optional] |
|**contacts** | [**List&lt;WhatsappMessageContact&gt;**](WhatsappMessageContact.md) |  |  [optional] |
|**reaction** | [**WhatsappInboundMessageReaction**](WhatsappInboundMessageReaction.md) |  |  [optional] |
|**order** | [**WhatsappInboundMessageOrder**](WhatsappInboundMessageOrder.md) |  |  [optional] |
|**system** | [**WhatsappInboundMessageSystem**](WhatsappInboundMessageSystem.md) |  |  [optional] |
|**errors** | [**List&lt;WhatsappInboundMessageError&gt;**](WhatsappInboundMessageError.md) |  |  [optional] |
|**context** | [**WhatsappInboundMessageContext**](WhatsappInboundMessageContext.md) |  |  [optional] |
|**referral** | [**WhatsappInboundMessageReferral**](WhatsappInboundMessageReferral.md) |  |  [optional] |



