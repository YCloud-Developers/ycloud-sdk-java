

# ContactUpdateRequest

Contains the properties of the contact to be updated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nickname** | **String** | Contact&#39;s nickname. Maximum length: 250 characters. |  [optional] |
|**phoneNumber** | **String** | Unique Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  [optional] |
|**countryCode** | **String** | Two-letter country abbreviation. See [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). |  [optional] |
|**email** | **String** | The contact&#39;s email address. If present, the email address must be unique. |  [optional] |
|**tags** | **List&lt;String&gt;** | Contact&#39;s tags. Maximum items: 50. |  [optional] |
|**customAttributes** | [**List&lt;ContactCreateRequestCustomAttributesInner&gt;**](ContactCreateRequestCustomAttributesInner.md) | Contact&#39;s custom attributes. If present (i.e., not &#x60;null&#x60;), all previous attributes of this contact will be replaced. |  [optional] |



