

# WhatsappMessageInteractiveHeader

Required for type `product_list`. Optional for other types. See also [WhatsApp Header Object](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/messages#header-object).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | **Required.** The header type you would like to use. - &#x60;text&#x60;: Used for List Messages and Reply Buttons. - &#x60;video&#x60;: Used for Reply Buttons. - &#x60;image&#x60;: Used for Reply Buttons. - &#x60;document&#x60;: Used for Reply Buttons. |  [optional] |
|**text** | **String** | Text for the header. Formatting allows emojis, but not markdown. |  [optional] |
|**image** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**video** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**document** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| IMAGE | &quot;image&quot; |
| VIDEO | &quot;video&quot; |
| DOCUMENT | &quot;document&quot; |



