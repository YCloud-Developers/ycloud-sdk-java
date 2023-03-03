

# WhatsappTemplateComponent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | **Required.** Template component type. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | **Required for type &#x60;HEADER&#x60;.** |  [optional] |
|**text** | **String** | **Required for type &#x60;BODY&#x60;, &#x60;FOOTER&#x60;, and format &#x60;TEXT&#x60;.** |  [optional] |
|**buttons** | [**List&lt;WhatsappTemplateComponentButton&gt;**](WhatsappTemplateComponentButton.md) | **Required for type &#x60;BUTTONS&#x60;.** The &#x60;BUTTONS&#x60; component has two types of buttons: Quick Reply, and Call To Action. These button types are exclusive, which means you cannot use both of them in one template. Quick Reply buttons are limited to 3. Call To Actions buttons have at most 1 PHONE_NUMBER button, and at most 1 URL button. |  [optional] |
|**example** | [**WhatsappTemplateComponentExample**](WhatsappTemplateComponentExample.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BODY | &quot;BODY&quot; |
| HEADER | &quot;HEADER&quot; |
| FOOTER | &quot;FOOTER&quot; |
| BUTTONS | &quot;BUTTONS&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;TEXT&quot; |
| IMAGE | &quot;IMAGE&quot; |
| VIDEO | &quot;VIDEO&quot; |
| DOCUMENT | &quot;DOCUMENT&quot; |



