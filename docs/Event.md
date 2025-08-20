

# Event

Represents a webhook event payload. Every event contains certain common properties: `id`, `type`, `apiVersion`, `createTime`. Each event may also contain some properties unique to the event. For example, `sms` is returned when `type` is `sms.message.updated`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the event. |  |
|**type** | **EventType** |  |  |
|**apiVersion** | **String** | The API version used to render this event. |  |
|**createTime** | **Date** | The time at which this event was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  |
|**emailDelivery** | [**EmailDelivery**](EmailDelivery.md) |  |  [optional] |
|**sms** | [**Sms**](Sms.md) |  |  [optional] |
|**smsInbound** | [**SmsInbound**](SmsInbound.md) |  |  [optional] |
|**voice** | [**Voice**](Voice.md) |  |  [optional] |
|**whatsappBusinessAccount** | [**WhatsappBusinessAccount**](WhatsappBusinessAccount.md) |  |  [optional] |
|**whatsappInboundMessage** | [**WhatsappInboundMessage**](WhatsappInboundMessage.md) |  |  [optional] |
|**whatsappMessage** | [**WhatsappMessage**](WhatsappMessage.md) |  |  [optional] |
|**whatsappPhoneNumber** | [**WhatsappPhoneNumber**](WhatsappPhoneNumber.md) |  |  [optional] |
|**whatsappPayment** | [**WhatsappPayment**](WhatsappPayment.md) |  |  [optional] |
|**whatsappTemplate** | [**WhatsappTemplate**](WhatsappTemplate.md) |  |  [optional] |
|**contactAttributesChanged** | [**ContactAttributesChanged**](ContactAttributesChanged.md) |  |  [optional] |
|**contactCreated** | [**ContactCreated**](ContactCreated.md) |  |  [optional] |
|**contactDeleted** | [**ContactDeleted**](ContactDeleted.md) |  |  [optional] |



