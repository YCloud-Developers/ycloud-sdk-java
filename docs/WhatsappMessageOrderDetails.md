

# WhatsappMessageOrderDetails

Contains the order details when sending a template message with a `order_details` button.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | The currency for this order. Currently the only supported value is &#x60;INR&#x60;. |  |
|**order** | [**WhatsappMessageOrderInfo**](WhatsappMessageOrderInfo.md) |  |  |
|**referenceId** | **String** | Unique identifier for the order provided by the business. It is case sensitive and cannot be an empty string and can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters.  The &#x60;reference_id&#x60; must be unique for each order_details message for a given business. If there is a need to send multiple order_details messages for the same order, it is recommended to include a sequence number in the reference_id (for example, \&quot;BM345A-12\&quot;) to ensure reference_id uniqueness. |  |
|**totalAmount** | [**WhatsappMessageOrderAmount**](WhatsappMessageOrderAmount.md) |  |  |
|**type** | **String** | The type of goods being paid for in this order. Current supported options are &#x60;digital-goods&#x60; and &#x60;physical-goods&#x60;. |  |
|**paymentSettings** | [**List&lt;WhatsappMessageOrderPaymentSetting&gt;**](WhatsappMessageOrderPaymentSetting.md) | Payment settings for the order. |  |



