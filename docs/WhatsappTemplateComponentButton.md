

# WhatsappTemplateComponentButton


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **WhatsappTemplateComponentButtonType** |  |  |
|**text** | **String** | **Required.** Button text. For &#x60;OTP&#x60; buttons, note that even if your template is using a one-tap autofill button, this value must still be supplied. If we are unable to validate your handshake the authentication template message will display a copy code button with this text instead. Maximum 25 characters. |  |
|**url** | **String** | **Required for button type &#x60;URL&#x60;.**  There can be at most 1 variable at the end of the URL. |  [optional] |
|**phoneNumber** | **String** | **Required for button type &#x60;PHONE_NUMBER&#x60;.** |  [optional] |
|**otpType** | **WhatsappTemplateComponentButtonOtpType** |  |  [optional] |
|**autofillText** | **String** | **One-tap buttons only.** One-tap button text. Maximum 25 characters. |  [optional] |
|**packageName** | **String** | **One-tap buttons only.** Your Android app&#39;s package name. |  [optional] |
|**signatureHash** | **String** | **One-tap buttons only.** Your app signing key hash. See [App Signing Key Hash](https://developers.facebook.com/docs/whatsapp/business-management-api/authentication-templates#app-signing-key-hash). |  [optional] |
|**example** | **List&lt;String&gt;** | Sample full URL for a &#x60;URL&#x60; button with a variable. |  [optional] |



