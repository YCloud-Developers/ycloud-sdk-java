

# Sms


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the object. |  |
|**to** | **String** | The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
|**text** | **String** | The text of this message. |  [optional] |
|**senderId** | **String** | Sender ID to be used. |  [optional] |
|**regionCode** | **String** | [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) |  [optional] |
|**totalSegments** | **Integer** | Number of message segments. See [SMS character encoding](https://help.ycloud.com/en/articles/3083427-sms-character-encoding) for more info. |  [optional] |
|**totalPrice** | **Double** | Total price of this message. |  [optional] |
|**currency** | **String** | Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217). |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Delivery status. One of &#x60;accepted&#x60;, &#x60;sent&#x60;, &#x60;delivered&#x60;, &#x60;undelivered&#x60;, or &#x60;failed&#x60;. - &#x60;accepted&#x60;: The messaging request is accepted by our system. - &#x60;failed&#x60;: The message failed to be sent from our system. - &#x60;sent&#x60;: The message has been sent from our system. - &#x60;delivered&#x60;: YCloud has received a delivery receipt indicating that message is delivered. - &#x60;undelivered&#x60;: YCloud has received a delivery receipt indicating that message is not delivered. |  [optional] |
|**errorCode** | **String** | Error code when the message is undeliverable. |  [optional] |
|**createTime** | **Date** | The time at which this message was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-03-01T12:00:00.000Z&#x60;. |  [optional] |
|**updateTime** | **Date** | The time at which the delivery report for this message was updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-03-01T12:00:00.000Z&#x60;. |  [optional] |
|**externalId** | **String** | A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems. |  [optional] |
|**callbackUrl** | **String** | Delivery report URL. You can provide a URL, and we will push the updated status report to your server in time. e.g., https://httpbin.org/anything?tag&#x3D;api. Note: We recommend configuring Webhook Endpoints instead. |  [optional] |
|**bizType** | **String** | This can be either empty or one of &#x60;sms&#x60;, or &#x60;verify&#x60;. Defaults to &#x60;sms&#x60;. - &#x60;sms&#x60;: Indicates that the message is sent via [Email](https://www.ycloud.com/sms) product. - &#x60;verify&#x60;: Indicates that the message is sent via [Verify](https://www.ycloud.com/verify) product. |  [optional] |
|**verificationId** | **String** | The verification ID. Included only when &#x60;bizType&#x60; is &#x60;verify&#x60;. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| FAILED | &quot;failed&quot; |
| SENT | &quot;sent&quot; |
| DELIVERED | &quot;delivered&quot; |
| UNDELIVERED | &quot;undelivered&quot; |



