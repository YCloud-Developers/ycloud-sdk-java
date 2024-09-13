

# Contact

Represents a contact.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the object. |  |
|**nickname** | **String** | Contact&#39;s nickname. |  [optional] |
|**countryCode** | **String** | Two-letter country abbreviation. See [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). |  [optional] |
|**countryName** | **String** | Full country name. |  [optional] |
|**phoneNumber** | **String** | Unique Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  [optional] |
|**email** | **String** | The contact&#39;s email address. If present, the email address must be unique. |  [optional] |
|**lastSeen** | **Date** | The time at which the contact last sent a message to your business, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**lastMessageToPhoneNumber** | **String** | The business phone number that the contact last sent a message to. |  [optional] |
|**tags** | **List&lt;String&gt;** | Contact&#39;s tags. |  [optional] |
|**createTime** | **Date** | The time at which the contact was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**customAttributes** | [**List&lt;ContactCustomAttribute&gt;**](ContactCustomAttribute.md) | Contact&#39;s custom attributes. |  [optional] |
|**ownerEmail** | **String** | The email address of the contact&#39;s owner. |  [optional] |



