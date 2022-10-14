

# VoiceSendRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**to** | **String** | The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
|**verificationCode** | **String** | The verification code to be sent, 4 to 6 digits. |  |
|**language** | **String** | [ISO 639 Language Code](https://www.iso.org/iso-639-language-codes.html). If not specified, language will be set as &#x60;en&#x60; by default. Notably, in certain countries or regions, language will be automatically set as the local language due to the regional restrictions. Applicable languages: &#x60;ar&#x60;: Arabic &#x60;de&#x60;: German &#x60;en&#x60;: English &#x60;es&#x60;: Spanish &#x60;fr&#x60;: French &#x60;id&#x60;: Indonesian &#x60;it&#x60;: Italian &#x60;pt&#x60;: Portuguese &#x60;ru&#x60;: Russian &#x60;tr&#x60;: Turkish &#x60;vi&#x60;: Vietnamese &#x60;zh&#x60;: Chinese |  [optional] |
|**externalId** | **String** | A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems. |  [optional] |
|**callbackUrl** | **String** | Delivery report URL. You can provide a URL, and we will push the updated status report to your server in time. e.g., https://httpbin.org/anything?tag&#x3D;api. Note: We recommend configuring Webhook Endpoints instead. |  [optional] |



