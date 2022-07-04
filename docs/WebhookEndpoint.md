

# WebhookEndpoint


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the object. |  |
|**url** | **String** | The URL of the webhook endpoint. |  [optional] |
|**enabledEvents** | **List&lt;String&gt;** | The list of events to enable for this endpoint. |  [optional] |
|**description** | **String** | An optional description of what the webhook is used for. |  [optional] |
|**status** | **WebhookEndpointStatus** |  |  [optional] |
|**secret** | **String** | The endpoint&#39;s secret, used to generate webhook signatures. |  [optional] |
|**createTime** | **Date** | The time at which this object was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**updateTime** | **Date** | The time at which this object was updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |



