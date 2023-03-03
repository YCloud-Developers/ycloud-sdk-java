

# WhatsappMessageTemplate

Use for sending a WhatsApp `template` message. See also [WhatsApp Template Object](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/messages#template-object).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the template. |  |
|**language** | [**WhatsappMessageTemplateLanguage**](WhatsappMessageTemplateLanguage.md) |  |  |
|**components** | [**List&lt;WhatsappMessageTemplateComponent&gt;**](WhatsappMessageTemplateComponent.md) | **Required when the specified template contains variables or media.** Array of components objects containing the parameters of the message. |  [optional] |



