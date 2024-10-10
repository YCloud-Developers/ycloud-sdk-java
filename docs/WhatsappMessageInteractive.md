

# WhatsappMessageInteractive

Use for `interactive` messages.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | **Required.** The type of interactive message you want to send. - &#x60;button&#x60;: Use for Reply Buttons. - &#x60;list&#x60;: Use for List Messages. - &#x60;cta_url&#x60;: Use for Call-To-Action (CTA) URL Button Messages. - &#x60;product&#x60;: Use for Single Product Messages. - &#x60;product_list&#x60;: Use for Multi-Product Messages. - &#x60;catalog_message&#x60;: Use for Catalog Messages. - &#x60;location_request_message&#x60;: Use for Location Request Messages. - &#x60;order_details&#x60;: Use for Order Details Messages. - &#x60;order_status&#x60;: Use for Order Status Messages. |  [optional] |
|**action** | [**WhatsappMessageInteractiveAction**](WhatsappMessageInteractiveAction.md) |  |  [optional] |
|**body** | [**WhatsappMessageInteractiveBody**](WhatsappMessageInteractiveBody.md) |  |  [optional] |
|**header** | [**WhatsappMessageInteractiveHeader**](WhatsappMessageInteractiveHeader.md) |  |  [optional] |
|**footer** | [**WhatsappMessageInteractiveFooter**](WhatsappMessageInteractiveFooter.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BUTTON | &quot;button&quot; |
| LIST | &quot;list&quot; |
| CTA_URL | &quot;cta_url&quot; |
| PRODUCT | &quot;product&quot; |
| PRODUCT_LIST | &quot;product_list&quot; |
| CATALOG_MESSAGE | &quot;catalog_message&quot; |
| LOCATION_REQUEST_MESSAGE | &quot;location_request_message&quot; |
| ORDER_DETAILS | &quot;order_details&quot; |
| ORDER_STATUS | &quot;order_status&quot; |



