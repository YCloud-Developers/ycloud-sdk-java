

# WhatsappMessageTemplateComponentParameter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | **Required.** Component parameter type. - &#x60;text&#x60;: Used when the template component type is &#x60;BODY&#x60;, or the &#x60;HEADER&#x60; component format is &#x60;TEXT&#x60;. - &#x60;image&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;IMAGE&#x60;. - &#x60;video&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;VIDEO&#x60;. - &#x60;document&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;DOCUMENT&#x60;. - &#x60;payload&#x60;: Used when the template component button type is &#x60;QUICK_REPLY&#x60;. - &#x60;coupon_code&#x60;: Used when the template component button type is &#x60;COPY_CODE&#x60;. - &#x60;limited_time_offer&#x60;: Used when the template component type is &#x60;LIMITED_TIME_OFFER&#x60;. - &#x60;action&#x60;: Used when the template component button type is &#x60;CATALOG&#x60;, &#x60;MPM&#x60;, &#x60;FLOW&#x60;, or &#x60;ORDER_DETAILS&#x60;. - &#x60;order_status&#x60;: Used when the template subcategory is &#x60;ORDER_STATUS&#x60;. |  [optional] |
|**text** | **String** | **Required when &#x60;type&#x60; &#x3D; &#x60;text&#x60;.** The message&#39;s text. For the header component, the character limit is 60 characters. For the body component, the character limit is 1024 characters. For url buttons, it indicates the developer-provided suffix that is appended to the predefined prefix URL in the template. |  [optional] |
|**payload** | **String** | Required for &#x60;quick_reply&#x60; buttons. Developer-defined payload that is returned when the button is clicked in addition to the display text on the button. |  [optional] |
|**couponCode** | **String** | **Required when &#x60;type&#x60; &#x3D; &#x60;coupon_code&#x60;.** The coupon code to be copied when the customer taps the button. |  [optional] |
|**image** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**video** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**document** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**limitedTimeOffer** | [**WhatsappMessageTemplateComponentParameterLimitedTimeOffer**](WhatsappMessageTemplateComponentParameterLimitedTimeOffer.md) |  |  [optional] |
|**action** | [**WhatsappMessageTemplateComponentParameterAction**](WhatsappMessageTemplateComponentParameterAction.md) |  |  [optional] |
|**orderStatus** | [**WhatsappMessageOrderStatus**](WhatsappMessageOrderStatus.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| IMAGE | &quot;image&quot; |
| VIDEO | &quot;video&quot; |
| DOCUMENT | &quot;document&quot; |
| PAYLOAD | &quot;payload&quot; |
| COUPON_CODE | &quot;coupon_code&quot; |
| LIMITED_TIME_OFFER | &quot;limited_time_offer&quot; |
| ACTION | &quot;action&quot; |
| ORDER_STATUS | &quot;order_status&quot; |



