

# EmailDelivery

Represents an email delivery report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailId** | **String** | Unique ID for the related email you&#39;ve previously sent. |  |
|**recipientAddress** | **String** | A recipient&#39;s email address. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Delivery status of the email to the specific recipient address. |  [optional] |
|**errorCode** | **String** | Error code when the email is undeliverable. |  [optional] |
|**errorMessage** | **String** | Error message when the email is undeliverable. |  [optional] |
|**externalId** | **String** | The &#x60;externalId&#x60; you specified when you sent the email. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SENDING | &quot;sending&quot; |
| SENT | &quot;sent&quot; |
| DELIVERED | &quot;delivered&quot; |
| FAILED | &quot;failed&quot; |



