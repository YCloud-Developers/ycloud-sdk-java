

# WhatsappMessageInteractiveAction

Action you want the user to perform after reading the `interactive` message. See also [WhatsApp Interactive Action Object](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/messages#action-object).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buttons** | [**List&lt;WhatsappMessageInteractiveActionButton&gt;**](WhatsappMessageInteractiveActionButton.md) | Required for Reply Buttons. |  [optional] |
|**button** | **String** | Required for List Messages. Button content. It cannot be an empty string and must be unique within the message. Emojis are supported, markdown is not. |  [optional] |
|**catalogId** | **String** | Required for Single Product Messages and Multi-Product Messages. Unique identifier of the Facebook catalog linked to your WhatsApp Business Account. This ID can be retrieved via the [Meta Commerce Manager](https://business.facebook.com/commerce/). |  [optional] |
|**productRetailerId** | **String** | Required for Single Product Messages and Multi-Product Messages. Unique identifier of the product in a catalog. |  [optional] |
|**sections** | [**List&lt;WhatsappMessageInteractiveActionSection&gt;**](WhatsappMessageInteractiveActionSection.md) | Required for List Messages and Multi-Product Messages. Array of section objects. Minimum of 1, maximum of 10. |  [optional] |



