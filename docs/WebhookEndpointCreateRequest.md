

# WebhookEndpointCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | The URL of the webhook endpoint. |  |
|**enabledEvents** | **List&lt;EventType&gt;** | The list of events to enable for this endpoint. |  |
|**eventProperties** | [**List&lt;EventProperty&gt;**](EventProperty.md) | Optional configuration for event properties in webhook payloads. Specifies which properties should be included for specific event types. When &#x60;enabledEvents&#x60; contains &#x60;contact.attributes_changed&#x60;, this field is required and must contain at least one event property configuration for that event type. |  [optional] |
|**description** | **String** | An optional description of what the webhook is used for. |  [optional] |
|**status** | **WebhookEndpointStatus** |  |  [optional] |



