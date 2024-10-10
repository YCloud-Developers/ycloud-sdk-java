

# WhatsappMessageOrderInfo

Order info.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **WhatsappMessageOrderStatusEnum** |  |  [optional] |
|**type** | **String** | Only supported value is &#x60;quick_pay&#x60;. When this field is passed in we hide the \&quot;Review and Pay\&quot; button and only show the \&quot;Pay Now\&quot; button in the order details bubble. |  [optional] |
|**catalogId** | **String** | Unique identifier of the Facebook catalog being used by the business. If you do not provide this field, you must provide the following fields inside the items object: &#x60;country_of_origin&#x60;, &#x60;importer_name&#x60;, and &#x60;importer_address&#x60;. |  [optional] |
|**items** | [**List&lt;WhatsappMessageOrderItem&gt;**](WhatsappMessageOrderItem.md) | Array of items in the order. |  [optional] |
|**subtotal** | [**WhatsappMessageOrderAmount**](WhatsappMessageOrderAmount.md) |  |  [optional] |
|**tax** | [**WhatsappMessageOrderAmount**](WhatsappMessageOrderAmount.md) |  |  [optional] |
|**shipping** | [**WhatsappMessageOrderAmount**](WhatsappMessageOrderAmount.md) |  |  [optional] |
|**discount** | [**WhatsappMessageOrderAmount**](WhatsappMessageOrderAmount.md) |  |  [optional] |
|**expiration** | [**WhatsappMessageOrderExpiration**](WhatsappMessageOrderExpiration.md) |  |  [optional] |
|**description** | **String** | **Optional.** Text for sharing status related information. Could be useful while sending cancellation. Max character limit is 120 characters. |  [optional] |



