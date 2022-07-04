

# Event

Represents a webhook event payload. Every event contains certain common properties: `id`, `type`, `apiVersion`, `createTime`. Each event may also contain some properties unique to the event. For example, `sms` is returned when `type` is `sms.message.updated`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the object. |  |
|**type** | **String** | Type of this event. |  |
|**apiVersion** | **String** | The API version used to render this event. |  |
|**createTime** | **Date** | The time at which this event was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  |
|**emailDelivery** | [**EmailDelivery**](EmailDelivery.md) |  |  [optional] |
|**sms** | [**Sms**](Sms.md) |  |  [optional] |
|**voice** | [**Voice**](Voice.md) |  |  [optional] |



