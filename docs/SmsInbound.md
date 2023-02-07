

# SmsInbound

Represents an inbound SMS message, which means a user replies to your message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID of the message. |  [optional] |
|**from** | **String** | The user&#39;s phone number who sent the message to your registered sender ID, formatted in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  [optional] |
|**to** | **String** | The receiver&#39;s phone number, which is one of your registered Sender IDs. |  [optional] |
|**text** | **String** | The text of this message. |  [optional] |
|**sendTime** | **Date** | The time at which this message was sent, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |



