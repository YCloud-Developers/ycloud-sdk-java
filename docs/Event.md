

# Event

Represents a webhook event payload. Every event contains certain common properties: `id`, `type`, `apiVersion`, `createTime`. Each event may also contain some properties unique to the event. For example, `sms` is returned when `type` is `sms.message.updated`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the event. |  |
|**type** | **EventType** |  |  |
|**apiVersion** | **String** | The API version used to render this event. |  |
|**createTime** | **Date** | The time at which this event was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  |
|**phase** | **Integer** | Included when &#x60;type&#x60; is &#x60;whatsapp.smb.history&#x60; and the event was generated from a Meta history chunk. Identifies the chunk&#39;s synchronization phase. |  [optional] |
|**progress** | **Integer** | Included when &#x60;type&#x60; is &#x60;whatsapp.smb.history&#x60; and the event was generated from a Meta history chunk. Reports the chunk&#39;s synchronization progress. |  [optional] |
|**emailDelivery** | [**EmailDelivery**](EmailDelivery.md) |  |  [optional] |
|**sms** | [**Sms**](Sms.md) |  |  [optional] |
|**smsInbound** | [**SmsInbound**](SmsInbound.md) |  |  [optional] |
|**voice** | [**Voice**](Voice.md) |  |  [optional] |
|**whatsappBusinessAccount** | [**WhatsappBusinessAccount**](WhatsappBusinessAccount.md) |  |  [optional] |
|**whatsappInboundMessage** | [**WhatsappInboundMessage**](WhatsappInboundMessage.md) |  |  [optional] |
|**whatsappMessage** | [**WhatsappMessage**](WhatsappMessage.md) |  |  [optional] |
|**whatsappGroup** | [**WhatsappGroupWebhook**](WhatsappGroupWebhook.md) |  |  [optional] |
|**whatsappPhoneNumber** | [**WhatsappPhoneNumber**](WhatsappPhoneNumber.md) |  |  [optional] |
|**whatsappPayment** | [**WhatsappPayment**](WhatsappPayment.md) |  |  [optional] |
|**whatsappTemplate** | [**WhatsappTemplate**](WhatsappTemplate.md) |  |  [optional] |
|**contactAttributesChanged** | [**ContactAttributesChanged**](ContactAttributesChanged.md) |  |  [optional] |
|**contactCreated** | [**ContactCreated**](ContactCreated.md) |  |  [optional] |
|**contactDeleted** | [**ContactDeleted**](ContactDeleted.md) |  |  [optional] |
|**contactNote** | [**ContactNoteWebhookPayload**](ContactNoteWebhookPayload.md) |  |  [optional] |
|**contactUnsubscribeCreated** | [**ContactUnsubscribeCreated**](ContactUnsubscribeCreated.md) |  |  [optional] |
|**contactUnsubscribeDeleted** | [**ContactUnsubscribeDeleted**](ContactUnsubscribeDeleted.md) |  |  [optional] |
|**whatsappUserPreference** | [**WhatsappUserPreference**](WhatsappUserPreference.md) |  |  [optional] |
|**callingRecording** | [**CallingMediaUpdated**](CallingMediaUpdated.md) |  |  [optional] |
|**callingTranscription** | [**CallingMediaUpdated**](CallingMediaUpdated.md) |  |  [optional] |
