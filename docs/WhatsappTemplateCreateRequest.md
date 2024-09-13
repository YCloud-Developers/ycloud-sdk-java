

# WhatsappTemplateCreateRequest

See [WhatsApp Templates](https://developers.facebook.com/docs/whatsapp/business-management-api/message-templates).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**wabaId** | **String** | WhatsApp Business Account ID. |  |
|**name** | **String** | Name of the template. |  |
|**language** | **String** | Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes. |  |
|**category** | **WhatsappTemplateCategory** |  |  |
|**messageSendTtlSeconds** | **Integer** | **Use only for template category is &#x60;AUTHENTICATION&#x60; or &#x60;UTILITY&#x60;.** If we are unable to deliver a message for an amount of time that exceeds its time-to-live, we will stop retrying and drop the message. By default, messages that use an authentication template have a default TTL of **10 minutes**, and messages that use a utility template have a default TTL of **30 days**. Set its value between &#x60;60&#x60; and &#x60;600&#x60; seconds (i.e., 1 to 10 minutes) for authentication templates, or &#x60;60&#x60; and &#x60;3600&#x60; seconds (i.e., 1 to 60 minutes) for utility templates. Alternatively, you can set this value to &#x60;-1&#x60;, which will set a custom TTL of 30 days for either type of template. We encourage you to set a time-to-live for all of your authentication templates, preferably equal to or less than your code expiration time, to ensure your customers only get a message when a code is still usable. Authentication templates created before October 23, 2024, have a default TTL of 30 days. |  [optional] |
|**components** | [**List&lt;WhatsappTemplateComponent&gt;**](WhatsappTemplateComponent.md) |  |  |



