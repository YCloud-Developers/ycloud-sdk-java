

# WhatsappTemplateCreateRequest

See [WhatsApp Templates](https://developers.facebook.com/docs/whatsapp/business-management-api/message-templates).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**wabaId** | **String** | WhatsApp Business Account ID. |  |
|**name** | **String** | Name of the template. |  |
|**language** | **String** | Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes. |  |
|**category** | **WhatsappTemplateCategory** |  |  |
|**subCategory** | **WhatsappTemplateSubCategory** |  |  [optional] |
|**messageSendTtlSeconds** | **Integer** | If we are unable to deliver a message for an amount of time that exceeds its time-to-live, we will stop retrying and drop the message. By default, messages that use an authentication template have a default TTL of **10 minutes**, and messages that use a utility or marketing template have a default TTL of **30 days**. Set its value between &#x60;30&#x60; and &#x60;900&#x60; seconds (i.e., 30 seconds to 15 minutes) for authentication templates, or &#x60;30&#x60; and &#x60;43200&#x60; seconds (i.e., 30 seconds to 12 hours) for utility templates, or &#x60;43200&#x60; and &#x60;2592000&#x60; seconds (i.e., 12 hours to 30 days) for marketing templates. Alternatively, you can set this value to &#x60;-1&#x60;, which will set a custom TTL of 30 days for either type of template. We encourage you to set a time-to-live for all of your authentication templates, preferably equal to or less than your code expiration time, to ensure your customers only get a message when a code is still usable. Authentication templates created before October 23, 2024, have a default TTL of 30 days. |  [optional] |
|**components** | [**List&lt;WhatsappTemplateComponent&gt;**](WhatsappTemplateComponent.md) |  |  |
|**ctaUrlLinkTrackingOptedOut** | **Boolean** | **Optional.** Indicates if template button click tracking is disabled. Set to &#x60;true&#x60; to disable button click tracking on the template, or &#x60;false&#x60; to enable. You can disable button click tracking on an individual template by setting this field to &#x60;true&#x60;. Once disabled, button engagement/clicks will not be displayed in the WhatsApp Manager when viewing the template&#39;s insights. If not provided, this value defaults to &#x60;false&#x60;, which means button click tracking is enabled by default. |  [optional] |



