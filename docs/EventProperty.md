

# EventProperty

Represents event property configuration for webhook endpoints. Specifies which properties should be included in the webhook payload for a specific event type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**event** | **String** | The event type for which properties are configured. This field accepts any valid event type that supports property configuration. |  |
|**properties** | **List&lt;String&gt;** | A list of property names that should be included in the webhook payload for the specified event type. The available properties depend on the specific event type configured. |  |



