

# CallingMediaUpdated

Terminal recording or transcription state for an API-sourced WhatsApp call.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**wacid** | **String** | WhatsApp call ID. |  |
|**phoneId** | **String** | WhatsApp business phone number ID used for authorized-asset delivery. |  |
|**mediaAssetId** | **String** | YCloud media asset ID used with the call media download API. |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**error** | [**CallingMediaUpdatedError**](CallingMediaUpdatedError.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| FAILED | &quot;FAILED&quot; |
