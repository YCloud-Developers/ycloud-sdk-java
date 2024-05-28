

# WhatsappMessageInteractiveActionSection

WhatsApp Message Interactive Section Object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | **Required if the message has more than one section.** Title of the section. Maximum length: 24 characters. |  [optional] |
|**rows** | [**List&lt;WhatsappMessageInteractiveActionSectionRow&gt;**](WhatsappMessageInteractiveActionSectionRow.md) | Contains a list of rows. You can have a total of 10 rows across your sections. Each row must have a title (Maximum length: 24 characters) and an ID (Maximum length: 200 characters). You can add a description (Maximum length: 72 characters), but it is optional. |  [optional] |
|**productItems** | [**List&lt;WhatsappMessageInteractiveActionSectionProductItem&gt;**](WhatsappMessageInteractiveActionSectionProductItem.md) | Required for Multi-Product Messages. Array of product objects. There is a minimum of 1 product per section and a maximum of 30 products across all sections. |  [optional] |



