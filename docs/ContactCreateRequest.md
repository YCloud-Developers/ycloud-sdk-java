

# ContactCreateRequest

Contains the properties of the contact to be created.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**remarkName** | **String** | Contact&#39;s remark name. Maximum length: 250 characters. |  [optional] |
|**nickname** | **String** | Deprecated compatibility alias for &#x60;remarkName&#x60;. When &#x60;remarkName&#x60; is absent, this value is saved as the contact&#39;s remark name. It does not update the read-only WhatsApp nickname. Maximum length: 250 characters. |  [optional] |
|**phoneNumber** | **String** | Unique Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
|**countryCode** | **String** | Two-letter country abbreviation. See [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). |  [optional] |
|**email** | **String** | Contact&#39;s email address. If present, the email address must be unique. |  [optional] |
|**tags** | **List&lt;String&gt;** | Contact&#39;s tags. Max items: 50. Max characters per tag: 50. |  [optional] |
|**customAttributes** | [**List&lt;ContactCustomAttribute&gt;**](ContactCustomAttribute.md) | Contact&#39;s custom attributes. |  [optional] |
|**ownerEmail** | **String** | The email address of the contact&#39;s owner. |  [optional] |
|**notes** | [**List&lt;ContactNoteCreateInput&gt;**](ContactNoteCreateInput.md) | Optional notes created atomically with the contact. The response remains the Contact schema; use the List Contact Notes endpoint to retrieve generated note IDs. |  [optional] |
