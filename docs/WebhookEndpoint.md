

# WebhookEndpoint


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the object. |  |
|**url** | **String** | The URL of the webhook endpoint. |  [optional] |
|**enabledEvents** | **List&lt;String&gt;** | The list of events to enable for this endpoint. |  [optional] |
|**eventProperties** | [**List&lt;EventProperty&gt;**](EventProperty.md) | Optional configuration for event properties in webhook payloads. Specifies which properties should be included for specific event types. When &#x60;enabledEvents&#x60; contains &#x60;contact.attributes_changed&#x60;, this field is required and must contain at least one event property configuration for that event type. |  [optional] |
|**description** | **String** | An optional description of what the webhook is used for. |  [optional] |
|**status** | **WebhookEndpointStatus** |  |  [optional] |
|**secret** | **String** | The endpoint&#39;s secret, used to generate webhook signatures. |  [optional] |
|**createTime** | **Date** | The time at which this object was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**updateTime** | **Date** | The time at which this object was updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |



