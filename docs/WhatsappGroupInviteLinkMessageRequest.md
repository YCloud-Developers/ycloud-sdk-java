

# WhatsappGroupInviteLinkMessageRequest

Provide exactly one of `to` or `recipient`. If both are provided, `to` takes precedence and `recipient` is ignored.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**to** | **String** | The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. Required when &#x60;recipient&#x60; is not provided. |  [optional] |
|**recipient** | **String** | The recipient&#39;s WhatsApp Business-scoped user ID (BSUID) or parent BSUID. Required when &#x60;to&#x60; is not provided. |  [optional] |
|**templateName** | **String** | The name of the approved WhatsApp template. |  |
|**languageCode** | **String** | The template language code. |  |
|**parameters** | [**List&lt;WhatsappMessageTemplateComponentParameter&gt;**](WhatsappMessageTemplateComponentParameter.md) | Template body parameters in template variable order. Must include one group invite link parameter with &#x60;type&#x3D;group_id&#x60; and &#x60;group_id&#x3D;&lt;groupId&gt;&#x60;. |  |



