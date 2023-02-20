

# VerificationFallback

Contains information about verification fallback. For example, you can enable sms fallback for WhatsApp verification messages.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**supported** | **Boolean** | Whether this fallback you requested is supported. If &#x60;false&#x60; is returned, it means that there are errors for this fallback, and this fallback will not be triggered. |  [optional] |
|**unsupportedReason** | **String** | The reason why the fallback is unsupported, e.g, &#x60;PARAM_INVALID&#x60;, &#x60;SMS_SIGNATURE_UNAVAILABLE&#x60;, &#x60;SENDER_ID_UNAVAILABLE&#x60;, or &#x60;MESSAGING_REGION_UNSUPPORTED&#x60;. |  [optional] |
|**unsupportedDetail** | **String** | The detail message why the fallback is unsupported. |  [optional] |



