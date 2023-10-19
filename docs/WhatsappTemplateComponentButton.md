

# WhatsappTemplateComponentButton


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **WhatsappTemplateComponentButtonType** |  |  |
|**text** | **String** | **Required for button type &#x60;PHONE_NUMBER&#x60; or &#x60;URL&#x60;.** Button text. For &#x60;CODE_CODE&#x60; buttons, the text is a pre-set value and cannot be customized. For &#x60;OTP&#x60; buttons, if omitted, the text will default to a pre-set value localized to the template&#39;s language. For example, &#x60;Copy Code&#x60; for English (US). If your template is using a one-tap autofill button and you supply this value, the authentication template message will display a copy code button with this text if we are unable to validate your [handshake](https://developers.facebook.com/docs/whatsapp/business-management-api/authentication-templates#handshake). Maximum 25 characters. |  [optional] |
|**url** | **String** | **Required for button type &#x60;URL&#x60;.** URL of website. There can be at most 1 variable at the end of the URL. Example: &#x60;https://www.luckyshrub.com/shop?promo&#x3D;{{1}}&#x60;. 2000 characters maximum. |  [optional] |
|**phoneNumber** | **String** | **Required for button type &#x60;PHONE_NUMBER&#x60;.** Alphanumeric string. Business phone number to be (display phone number) called when the user taps the button. 20 characters maximum. |  [optional] |
|**otpType** | **WhatsappTemplateComponentButtonOtpType** |  |  [optional] |
|**autofillText** | **String** | **One-tap buttons only.** One-tap button text. Maximum 25 characters. |  [optional] |
|**packageName** | **String** | **One-tap buttons only.** Your Android app&#39;s package name. |  [optional] |
|**signatureHash** | **String** | **One-tap buttons only.** Your app signing key hash. See [App Signing Key Hash](https://developers.facebook.com/docs/whatsapp/business-management-api/authentication-templates#app-signing-key-hash). |  [optional] |
|**example** | **List&lt;String&gt;** | Sample full URL for a &#x60;URL&#x60; button with a variable. |  [optional] |



