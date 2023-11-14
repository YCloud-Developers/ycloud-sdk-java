

# WhatsappTemplateComponentCardComponent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | **Required.** Card component type. - &#x60;BODY&#x60;: Body components are text-only components. Cards can optionally include body text. - &#x60;HEADER&#x60;: Cards must have a media header (image or video). - &#x60;BUTTONS&#x60;: Buttons are optional interactive components that perform specific actions when tapped. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | **Required for type &#x60;HEADER&#x60;.** Cards must have a media header (image or video). |  [optional] |
|**text** | **String** | Card body text supports variables. There is no maximum character limit on variables, but they count against the card body text limit of 160 characters. |  [optional] |
|**buttons** | [**List&lt;WhatsappTemplateComponentButton&gt;**](WhatsappTemplateComponentButton.md) | **Required for type &#x60;BUTTONS&#x60;.** Cards can optionally include up to 2 quick reply buttons, phone number buttons, or URL buttons (button types can be mixed). |  [optional] |
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



