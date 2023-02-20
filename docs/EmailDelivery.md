

# EmailDelivery

Represents an email delivery report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailId** | **String** | Unique ID for the related email you&#39;ve previously sent. |  |
|**recipientAddress** | **String** | A recipient&#39;s email address. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Delivery status of the email to the specific recipient address. - &#x60;sending&#x60;: The messaging request is accepted by our system. - &#x60;failed&#x60;: The message failed to be sent from our system. - &#x60;sent&#x60;: The message has been sent from YCloud. - &#x60;delivered&#x60;: YCloud has received a delivery receipt indicating that message is delivered. - &#x60;undelivered&#x60;: YCloud has received a delivery receipt indicating that message is not delivered. |  [optional] |
|**errorCode** | **String** | Error code when the email is undeliverable. |  [optional] |
|**errorMessage** | **String** | Error message when the email is undeliverable. |  [optional] |
|**externalId** | **String** | The &#x60;externalId&#x60; you specified when you sent the email. |  [optional] |
|**bizType** | **String** | This can be either empty or one of &#x60;email&#x60;, or &#x60;verify&#x60;. Defaults to &#x60;email&#x60;. - &#x60;email&#x60;: Indicates that the message is sent via [Email](https://www.ycloud.com/email) product. - &#x60;verify&#x60;: Indicates that the message is sent via [Verify](https://www.ycloud.com/verify) product. |  [optional] |
|**verificationId** | **String** | The verification ID. Included only when &#x60;bizType&#x60; is &#x60;verify&#x60;. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SENDING | &quot;sending&quot; |
| FAILED | &quot;failed&quot; |
| SENT | &quot;sent&quot; |
| DELIVERED | &quot;delivered&quot; |
| UNDELIVERED | &quot;undelivered&quot; |



