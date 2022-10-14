

# VerificationSendRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | **VerificationChannel** |  |  |
|**to** | **String** | The recipient&#39;s phone number or email address depending on &#x60;channel&#x60;. - Phone number: In [E.164](https://en.wikipedia.org/wiki/E.164) format. Applicable when &#x60;channel&#x60; is &#x60;sms&#x60; or &#x60;voice&#x60;. - Email address: For example, &#x60;tom@example.com&#x60;. Applicable when &#x60;channel&#x60; is &#x60;email_code&#x60;. |  |
|**code** | **String** | Verification code to be sent. This field is optional. If not provided, YCloud will automatically generate a code. |  [optional] |
|**senderId** | **String** | [Sender ID](https://help.ycloud.com/en/articles/3080386) to be used. |  [optional] |
|**signature** | **String** | This parameter is only required for Chinese mainland SMS messages. You must specify an approved signature such as &#x60;YCloud&#x60;. It will be added to the beginning of SMS body and wrapped with &#x60;【】&#x60;, e.g. &#x60;【YCloud】Your verification code is 123456&#x60;. |  [optional] |
|**language** | **String** | [ISO 639 Language Code](https://www.iso.org/iso-639-language-codes.html). If not specified, language will be set as &#x60;en&#x60; by default. Notably, in certain countries or regions, language will be automatically set as the local language due to the regional restrictions. Applicable languages: &#x60;ar&#x60;: Arabic &#x60;de&#x60;: German &#x60;en&#x60;: English &#x60;es&#x60;: Spanish &#x60;fr&#x60;: French &#x60;id&#x60;: Indonesian &#x60;it&#x60;: Italian &#x60;pt_BR&#x60;: Portuguese. Not applicable when &#x60;channel&#x60; is &#x60;whatsapp&#x60;. &#x60;ru&#x60;: Russian &#x60;tr&#x60;: Turkish &#x60;vi&#x60;: Vietnamese &#x60;zh_CN&#x60;: Simplified Chinese &#x60;zh_HK&#x60;: Traditional Chinese |  [optional] |



