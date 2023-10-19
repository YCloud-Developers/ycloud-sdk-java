

# WhatsappTemplateComponent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | **Required.** Template component type. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | **Required for type &#x60;HEADER&#x60;.** |  [optional] |
|**text** | **String** | **Required for type &#x60;BODY&#x60;, &#x60;FOOTER&#x60;, and format &#x60;TEXT&#x60;.** |  [optional] |
|**buttons** | [**List&lt;WhatsappTemplateComponentButton&gt;**](WhatsappTemplateComponentButton.md) | **Required for type &#x60;BUTTONS&#x60;.** Buttons are optional interactive components that perform specific actions when tapped. Templates can have a mixture of up to 10 button components total, although there are limits to individual buttons of the same type as well as combination limits. If a template has more than three buttons, two buttons will appear in the delivered message and the remaining buttons will be replaced with a **See all options** button. Tapping the **See all options** button reveals the remaining buttons. |  [optional] |
|**addSecurityRecommendation** | **Boolean** | **Optional. Only applicable in the &#x60;BODY&#x60; component of an AUTHENTICATION template.** Set to &#x60;true&#x60; if you want the template to include the string, *For your security, do not share this code.* Set to &#x60;false&#x60; to exclude the string. |  [optional] |
|**codeExpirationMinutes** | **Integer** | **Optional. Only applicable in the &#x60;FOOTER&#x60; component of an AUTHENTICATION template.** Indicates number of minutes the password or code is valid. If omitted, the code expiration warning will not be displayed in the delivered message. Minimum 1, maximum 90. |  [optional] |
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



