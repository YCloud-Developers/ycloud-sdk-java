

# WhatsappMessageInteractive

Use for `interactive` messages. See also [WhatsApp Interactive Object](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/messages#interactive-object).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of interactive message you want to send. - &#x60;list&#x60;: Use it for List Messages. - &#x60;button&#x60;: Use it for Reply Buttons. - &#x60;product&#x60;: Use for Single Product Messages. - &#x60;product_list&#x60;: Use for Multi-Product Messages. |  |
|**action** | [**WhatsappMessageInteractiveAction**](WhatsappMessageInteractiveAction.md) |  |  |
|**body** | [**WhatsappMessageInteractiveBody**](WhatsappMessageInteractiveBody.md) |  |  [optional] |
|**header** | [**WhatsappMessageInteractiveHeader**](WhatsappMessageInteractiveHeader.md) |  |  [optional] |
|**footer** | [**WhatsappMessageInteractiveFooter**](WhatsappMessageInteractiveFooter.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BUTTON | &quot;button&quot; |
| LIST | &quot;list&quot; |
| PRODUCT | &quot;product&quot; |
| PRODUCT_LIST | &quot;product_list&quot; |



