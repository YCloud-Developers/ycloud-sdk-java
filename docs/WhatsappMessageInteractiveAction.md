

# WhatsappMessageInteractiveAction

[WhatsApp Interactive Action Object](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/messages#action-object).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buttons** | [**List&lt;WhatsappMessageInteractiveActionButtonsInner&gt;**](WhatsappMessageInteractiveActionButtonsInner.md) | Required for Reply Buttons. |  [optional] |
|**button** | **String** | Required for List Messages. Button content. It cannot be an empty string and must be unique within the message. Emojis are supported, markdown is not. |  [optional] |
|**sections** | [**List&lt;WhatsappMessageInteractiveActionSectionsInner&gt;**](WhatsappMessageInteractiveActionSectionsInner.md) | Required for List Messages. |  [optional] |



