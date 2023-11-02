

# WhatsappTemplateEditRequest

The request body to edit a WhatsApp template.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**components** | [**List&lt;WhatsappTemplateComponent&gt;**](WhatsappTemplateComponent.md) |  |  |
|**messageSendTtlSeconds** | **Integer** | **Use only for template category is &#x60;AUTHENTICATION&#x60;.** If we are unable to deliver an authentication template for an amount of time that exceeds its time-to-live, we will stop retrying and drop the message. Defaults to &#x60;600&#x60; seconds for newly created authentication templates. To override the default value, set this field to a value between &#x60;60&#x60; and &#x60;600&#x60; seconds. Or set it to &#x60;-1&#x60; resulting in a 24-hour time-to-live. |  [optional] |



