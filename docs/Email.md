

# Email


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the object. |  |
|**from** | [**Mailbox**](Mailbox.md) |  |  [optional] |
|**to** | [**List&lt;Mailbox&gt;**](Mailbox.md) | The intended recipients&#39; email addresses. |  [optional] |
|**cc** | [**List&lt;Mailbox&gt;**](Mailbox.md) | Recipients who will receive a copy of the email. |  [optional] |
|**bcc** | [**List&lt;Mailbox&gt;**](Mailbox.md) | Recipients who will receive a blind carbon copy of the email. |  [optional] |
|**replyTo** | [**List&lt;Mailbox&gt;**](Mailbox.md) | If this field exists, then the reply should go to the addresses indicated in that field and not to the address(es) indicated in the &#x60;from&#x60; field. |  [optional] |
|**subject** | **String** | The email subject, which contains a short string identifying the topic of the message. |  [optional] |
|**summary** | **String** | This is a summary of your email. Max length: 70. |  [optional] |
|**contentType** | **EmailContentType** |  |  [optional] |
|**externalId** | **String** | A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems. |  [optional] |
|**callbackUrl** | **String** | Delivery report URL. You can provide a URL, and we will push the updated status report to your server in time. e.g., https://httpbin.org/anything?tag&#x3D;api. Note: We recommend configuring Webhook Endpoints instead. |  [optional] |
|**createTime** | **Date** | The time at which this message was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**totalRecipients** | **Integer** | Total recipients of this message, including &#x60;to&#x60;, &#x60;cc&#x60; and &#x60;bcc&#x60;. |  [optional] |
|**totalPrice** | **Double** | Total price of this message. |  [optional] |
|**currency** | **String** | Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217). |  [optional] |



