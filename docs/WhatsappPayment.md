

# WhatsappPayment

Represents a payment object. Businesses receive updates via webhooks when the status of the user-initiated transaction changes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**wabaId** | **String** | WhatsApp Business Account ID. |  |
|**referenceId** | **String** | Unique identifier for the payment provided by the business. It is case sensitive and cannot be an empty string and can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters. |  |
|**status** | **WhatsappPaymentStatus** |  |  |
|**transactions** | [**List&lt;WhatsappPaymentTransaction&gt;**](WhatsappPaymentTransaction.md) | Contains the latest transaction attempt for this payment. |  [optional] |



