

# WhatsappTemplate

See [WhatsApp Templates](https://developers.facebook.com/docs/whatsapp/business-management-api/message-templates).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**wabaId** | **String** | WhatsApp Business Account ID. |  |
|**name** | **String** | Name of the template. |  |
|**language** | **String** | Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes. |  |
|**category** | **WhatsappTemplateCategory** |  |  [optional] |
|**previousCategory** | **String** | This field indicates the template&#39;s previous category (or &#x60;null&#x60;, for newly created templates after April 1, 2023). Compare this value to the template&#39;s &#x60;category&#x60; field value, which indicates the template&#39;s current category. For more information about template category migration, see also [First template category migration](https://developers.facebook.com/docs/whatsapp/updates-to-pricing/launch-timeline#first-template-category-migration). |  [optional] |
|**messageSendTtlSeconds** | **Integer** | **Use only for template category is &#x60;AUTHENTICATION&#x60;.** If we are unable to deliver an authentication template for an amount of time that exceeds its time-to-live, we will stop retrying and drop the message. Defaults to &#x60;600&#x60; seconds for newly created authentication templates. To override the default value, set this field to a value between &#x60;60&#x60; and &#x60;600&#x60; seconds. Or set it to &#x60;-1&#x60; resulting in a 24-hour time-to-live. |  [optional] |
|**components** | [**List&lt;WhatsappTemplateComponent&gt;**](WhatsappTemplateComponent.md) | Template components. A template consists of &#x60;HEADER&#x60;, &#x60;BODY&#x60;, &#x60;FOOTER&#x60;, and &#x60;BUTTONS&#x60; components. &#x60;BODY&#x60; component is required, the other types are optional. |  [optional] |
|**status** | **WhatsappTemplateStatus** |  |  [optional] |
|**qualityRating** | **WhatsappTemplateQualityRating** |  |  [optional] |
|**reason** | **String** | The reason why the template is rejected. |  [optional] |
|**createTime** | **Date** | The time at which this object is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**updateTime** | **Date** | The time at which this object is updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**statusUpdateEvent** | **WhatsappTemplateStatusUpdateEventEnum** |  |  [optional] |
|**disableDate** | **String** | The date at which the template will be disabled. When a WhatsApp template &#x60;FLAGGED&#x60; event is received, this field is set. |  [optional] |
|**whatsappApiError** | [**WhatsappApiError**](WhatsappApiError.md) |  |  [optional] |



