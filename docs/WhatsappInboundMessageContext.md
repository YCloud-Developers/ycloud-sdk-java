

# WhatsappInboundMessageContext

Message context.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**forwarded** | **Boolean** | **Added to Webhooks if message was forwarded.**  Set to &#x60;true&#x60; if the received message has been forwarded. |  [optional] |
|**frequentlyForwarded** | **Boolean** | **Added to Webhooks if message has been frequently forwarded.**  Set to &#x60;true&#x60; if the received message has been forwarded more than five times. |  [optional] |
|**from** | **String** | **Added to Webhooks if message is an inbound reply to a sent message.**  The WhatsApp ID (a phone number without the &#39;+&#39; prefix) of the sender of the sent message. |  [optional] |
|**id** | **String** | **Optional.**  The &#x60;wamid&#x60; for the sent message for an inbound reply. &#x60;wamid&#x60; is the original message ID on WhatsApp’s platform. |  [optional] |
|**referredProduct** | [**WhatsappInboundMessageReferredProduct**](WhatsappInboundMessageReferredProduct.md) |  |  [optional] |



