

# WhatsappTemplateComponent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | **Required.** Template component type. - &#x60;BODY&#x60;: Body components are text-only components and are required by all templates. Templates are limited to one body component. - &#x60;HEADER&#x60;: Headers are optional components that appear at the top of template messages. Headers support text, media (images, videos, documents). Templates are limited to one header component. - &#x60;FOOTER&#x60;: Footers are optional text-only components that appear immediately after the body component. Templates are limited to one footer component. - &#x60;BUTTONS&#x60;: Buttons are optional interactive components that perform specific actions when tapped. - &#x60;LIMITED_TIME_OFFER&#x60;: Use for limited-time offer templates. The delivered message can display an offer expiration details section with a heading, an optional expiration timer, and the offer code itself. - &#x60;CAROUSEL&#x60;: Carousel templates allow you to send a single text message (1), accompanied by a set of up to 10 carousel cards (2) in a horizontally scrollable view. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | **Required for type &#x60;HEADER&#x60;.** |  [optional] |
|**text** | **String** | For body text (type &#x3D; &#x60;BODY&#x60;), maximum 1024 characters. For header text (type &#x3D; &#x60;HEADER&#x60;, format &#x3D; &#x60;TEXT&#x60;), maximum 60 characters. For footer text (type &#x3D; &#x60;FOOTER&#x60;), maximum 60 characters. For card body text (&#x60;CAROUSEL&#x60; card component type &#x3D; &#x60;BODY&#x60;), maximum 160 characters. |  [optional] |
|**buttons** | [**List&lt;WhatsappTemplateComponentButton&gt;**](WhatsappTemplateComponentButton.md) | **Required for type &#x60;BUTTONS&#x60;.** Buttons are optional interactive components that perform specific actions when tapped. Templates can have a mixture of up to 10 button components total, although there are limits to individual buttons of the same type as well as combination limits. If a template has more than three buttons, two buttons will appear in the delivered message and the remaining buttons will be replaced with a **See all options** button. Tapping the **See all options** button reveals the remaining buttons. |  [optional] |
|**addSecurityRecommendation** | **Boolean** | **Optional. Only applicable in the &#x60;BODY&#x60; component of an AUTHENTICATION template.** Set to &#x60;true&#x60; if you want the template to include the string, *For your security, do not share this code.* Set to &#x60;false&#x60; to exclude the string. |  [optional] |
|**codeExpirationMinutes** | **Integer** | **Optional. Only applicable in the &#x60;FOOTER&#x60; component of an AUTHENTICATION template.** Indicates number of minutes the password or code is valid. If omitted, the code expiration warning will not be displayed in the delivered message. Minimum 1, maximum 90. |  [optional] |
|**limitedTimeOffer** | [**WhatsappTemplateComponentLimitedTimeOffer**](WhatsappTemplateComponentLimitedTimeOffer.md) |  |  [optional] |
|**example** | [**WhatsappTemplateComponentExample**](WhatsappTemplateComponentExample.md) |  |  [optional] |
|**cards** | [**List&lt;WhatsappTemplateComponentCard&gt;**](WhatsappTemplateComponentCard.md) | **Required for type &#x60;CAROUSEL&#x60;.** Carousel templates support up to 10 carousel cards. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BODY | &quot;BODY&quot; |
| HEADER | &quot;HEADER&quot; |
| FOOTER | &quot;FOOTER&quot; |
| BUTTONS | &quot;BUTTONS&quot; |
| LIMITED_TIME_OFFER | &quot;LIMITED_TIME_OFFER&quot; |
| CAROUSEL | &quot;CAROUSEL&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;TEXT&quot; |
| IMAGE | &quot;IMAGE&quot; |
| VIDEO | &quot;VIDEO&quot; |
| DOCUMENT | &quot;DOCUMENT&quot; |



