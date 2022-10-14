

# WhatsappMessageInteractive

[WhatsApp Interactive Object](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/messages#interactive-object).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of interactive message you want to send. - &#x60;list&#x60;: Use it for List Messages. - &#x60;button&#x60;: Use it for Reply Buttons. |  |
|**action** | [**WhatsappMessageInteractiveAction**](WhatsappMessageInteractiveAction.md) |  |  |
|**body** | [**WhatsappMessageInteractiveBody**](WhatsappMessageInteractiveBody.md) |  |  |
|**header** | [**WhatsappMessageInteractiveHeader**](WhatsappMessageInteractiveHeader.md) |  |  [optional] |
|**footer** | [**WhatsappMessageInteractiveFooter**](WhatsappMessageInteractiveFooter.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BUTTON | &quot;button&quot; |
| LIST | &quot;list&quot; |



