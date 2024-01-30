

# EmailSendRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | **String** | - The sender&#39;s email. Its domain should be one that has been registered and activated in your account. - The sender&#39;s email address is required while the sender&#39;s name is optional. For example, both &#x60;support@example.com&#x60; and &#x60;Sender&lt;support@example.com&gt;&#x60; work. |  |
|**to** | **String** | - The intended recipients&#39; email addresses. - Supports a comma-separated list of one or more addresses. Max items: 100. |  |
|**subject** | **String** | The email subject, which contains a short string identifying the topic of the message. Max length: 255. |  |
|**content** | **String** | - The email body. Max size: 150 KB. - Variables in the form of &#x60;#var_1#&#x60; are supported, they should be used together with the &#x60;variables&#x60; parameter. Variable keys only support letters, digits, and the underline character (&#x60;_&#x60;). - You can use the [Test Templates](https://help.ycloud.com/en/articles/6006545) provided by YCloud for testing. |  |
|**contentType** | **EmailContentType** |  |  [optional] |
|**variables** | **List&lt;Map&lt;String, String&gt;&gt;** | - The variable key-value pairs that will replace the variable placeholders in &#x60;content&#x60; for each recipient. Variable keys are those that are wrapped with &#x60;#&#x60; as placeholders (e.g., &#x60;#var_1#&#x60;) in &#x60;content&#x60;. The placeholders will be replaced by variable values when sending the email. - The size of the array must be the same as the number of recipients in &#x60;to&#x60;. Be aware that &#x60;cc&#x60; and &#x60;bcc&#x60; addresses are excluded, and they can not receive emails that contain variables. - This parameter&#39;s size will be calculated together with the parameter &#x60;content&#x60;. The whole size must not exceed 150 KB. |  [optional] |
|**cc** | **String** | Recipients who will receive a copy of the email. |  [optional] |
|**bcc** | **String** | Recipients who will receive a blind carbon copy of the email. |  [optional] |
|**replyTo** | **String** | If this field exists, then the reply should go to the addresses indicated in that field and not to the address(es) indicated in the &#x60;from&#x60; field. |  [optional] |
|**summary** | **String** | This is a summary of your email. Max length: 70. |  [optional] |
|**externalId** | **String** | A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems. |  [optional] |
|**callbackUrl** | **String** | Delivery report URL. You can provide a URL, and we will push the updated status report to your server in time. e.g., https://httpbin.org/anything?tag&#x3D;api. Note: We recommend configuring Webhook Endpoints instead. |  [optional] |



