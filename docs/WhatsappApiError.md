

# WhatsappApiError

The original error object returned by WhatsApp. See [Handling Errors](https://developers.facebook.com/docs/graph-api/guides/error-handling), [Cloud API Error Codes](https://developers.facebook.com/docs/whatsapp/cloud-api/support/error-codes).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | A human-readable description of the error. |  |
|**code** | **String** | An error code. |  |
|**type** | **String** | Error type. |  [optional] |
|**errorSubcode** | **String** | Additional code about the error. |  [optional] |
|**errorUserMsg** | **String** | The message to display to the user. The language of the message is based on the locale of the API request. |  [optional] |
|**errorUserTitle** | **String** | The title of the dialog, if shown. The language of the message is based on the locale of the API request. |  [optional] |
|**fbtraceId** | **String** | Internal support identifier. When reporting a bug related to a Graph API call, include the fbtrace_id to help us find log data for debugging. |  [optional] |
|**errorData** | **Object** | Additional data about the error. A string or map. - For template APIs, this field is a string describing the reason for the error.   - For message APIs, this field is a map with property &#x60;details&#x60; describing the reason for the error. |  [optional] |



