

# WhatsappMessageInteractiveAction

**Required.** Action you want the user to perform after reading the `interactive` message. See also [WhatsApp Interactive Action Object](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/messages#action-object).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buttons** | [**List&lt;WhatsappMessageInteractiveActionButton&gt;**](WhatsappMessageInteractiveActionButton.md) | Required for Reply Buttons. You can have up to 3 buttons. |  [optional] |
|**button** | **String** | Required for List Messages. Button content. It cannot be an empty string and must be unique within the message. Emojis are supported, markdown is not. Maximum length: 20 characters. |  [optional] |
|**catalogId** | **String** | Required for Single Product Messages and Multi-Product Messages. Unique identifier of the Facebook catalog linked to your WhatsApp Business Account. This ID can be retrieved via the [Meta Commerce Manager](https://business.facebook.com/commerce/). |  [optional] |
|**productRetailerId** | **String** | Required for Single Product Messages and Multi-Product Messages. Unique identifier of the product in a catalog. |  [optional] |
|**sections** | [**List&lt;WhatsappMessageInteractiveActionSection&gt;**](WhatsappMessageInteractiveActionSection.md) | Required for List Messages and Multi-Product Messages. Array of section objects. Minimum of 1, maximum of 10. |  [optional] |
|**name** | [**NameEnum**](#NameEnum) | Action name. Required for Call-To-Action (CTA) URL Button Messages. - &#x60;cta_url&#x60;: Use for Call-To-Action (CTA) URL Buttons. - &#x60;send_location&#x60;: Use for Location Request Messages. |  [optional] |
|**parameters** | [**WhatsappMessageInteractiveActionParameters**](WhatsappMessageInteractiveActionParameters.md) |  |  [optional] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| CTA_URL | &quot;cta_url&quot; |
| SEND_LOCATION | &quot;send_location&quot; |



