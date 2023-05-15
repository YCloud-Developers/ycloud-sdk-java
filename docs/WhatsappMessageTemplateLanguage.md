

# WhatsappMessageTemplateLanguage

Contains a language object. Specifies the language the template may be rendered in.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The code of the language or locale to use. Accepts both language and language_locale formats (e.g., en and en_US). See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes. |  |
|**policy** | **String** | The language policy the message should follow. Default (and only supported option): &#x60;deterministic&#x60;, which means that WhatsApp delivers the message template in exactly the language and locale asked for. |  [optional] |



