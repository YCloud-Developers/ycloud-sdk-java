

# SmsSendRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**to** | **String** | The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
|**text** | **String** | The text of this message. |  |
|**senderId** | **String** | [Sender ID](https://help.ycloud.com/en/articles/3080386) to be used. |  [optional] |
|**signature** | **String** | This parameter is only required for Chinese mainland SMSs. You must specify an approved signature such as &#x60;YCloud&#x60;. It will be added to the beginning of SMS body and wrapped with &#x60;【】&#x60;, e.g. &#x60;【YCloud】Your verification code is 123456&#x60;. |  [optional] |
|**externalId** | **String** | A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems. |  [optional] |
|**callbackUrl** | **String** | Delivery report URL. You can provide a URL, and we will push the updated status report to your server in time. e.g., https://httpbin.org/anything?tag&#x3D;api. Note: We recommend configuring Webhook Endpoints instead. |  [optional] |



