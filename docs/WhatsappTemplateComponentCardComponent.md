

# WhatsappTemplateComponentCardComponent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | **Required.** Card component type. - &#x60;BODY&#x60;: Body components are text-only components. Cards must have body text. - &#x60;HEADER&#x60;: Cards must have a media header (image or video). - &#x60;BUTTONS&#x60;: Buttons are interactive components that perform specific actions when tapped. Cards must have at least one button, up to 2 buttons. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | **Required for type &#x60;HEADER&#x60;.** Cards must have a media header (image or video). |  [optional] |
|**text** | **String** | **Required for type &#x60;BODY&#x60;.** Card body text supports variables. Maximum 160 characters. |  [optional] |
|**buttons** | [**List&lt;WhatsappTemplateComponentButton&gt;**](WhatsappTemplateComponentButton.md) | **Required for type &#x60;BUTTONS&#x60;.** Cards must have at least one button. Supports 2 buttons. Buttons can be the same or a mix of quick reply buttons, phone number buttons, or URL buttons. |  [optional] |
|**example** | [**WhatsappTemplateComponentExample**](WhatsappTemplateComponentExample.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BODY | &quot;BODY&quot; |
| HEADER | &quot;HEADER&quot; |
| BUTTONS | &quot;BUTTONS&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| IMAGE | &quot;IMAGE&quot; |
| VIDEO | &quot;VIDEO&quot; |



