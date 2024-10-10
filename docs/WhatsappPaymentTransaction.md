

# WhatsappPaymentTransaction

Represents a transaction attempt for a payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Transaction ID. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The payment type for this transactions. One of &#x60;billdesk&#x60;, &#x60;razorpay&#x60;, &#x60;payu&#x60;, or &#x60;zaakpay&#x60;. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the transaction. One of &#x60;pending&#x60;, &#x60;success&#x60; or &#x60;failed&#x60;. |  |
|**createdTimestamp** | **Long** | Time when transaction was created in epoch milliseconds. |  |
|**updatedTimestamp** | **Long** | Time when transaction was last updated in epoch milliseconds. |  |
|**amount** | [**WhatsappMessageOrderAmount**](WhatsappMessageOrderAmount.md) |  |  |
|**currency** | **String** | The currency for this payment. Currently the only supported value is &#x60;INR&#x60;. |  |
|**methodType** | **String** | Describes the type of payment method used by consumer to pay for the order. Can be one of &#x60;upi&#x60;, &#x60;card&#x60;, &#x60;wallet&#x60;, or &#x60;netbanking&#x60;. The payment method information might not be available for failed payments. |  [optional] |
|**error** | [**WhatsappPaymentTransactionError**](WhatsappPaymentTransactionError.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BILLDESK | &quot;billdesk&quot; |
| RAZORPAY | &quot;razorpay&quot; |
| PAYU | &quot;payu&quot; |
| ZAAKPAY | &quot;zaakpay&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCESS | &quot;success&quot; |
| FAILED | &quot;failed&quot; |



