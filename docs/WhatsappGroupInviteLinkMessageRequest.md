

# WhatsappGroupInviteLinkMessageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**to** | **String** | The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
|**templateName** | **String** | The name of the approved WhatsApp template. |  |
|**languageCode** | **String** | The template language code. |  |
|**parameters** | [**List&lt;WhatsappMessageTemplateComponentParameter&gt;**](WhatsappMessageTemplateComponentParameter.md) | Template body parameters in template variable order. Must include one group invite link parameter with &#x60;type&#x3D;group_id&#x60; and &#x60;group_id&#x3D;&lt;groupId&gt;&#x60;. |  |



