

# ContactCreated

Represents a contact created event. Contains the full contact information that was created.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the object. |  |
|**nickName** | **String** | Contact&#39;s nickname. |  [optional] |
|**realName** | **String** | Contact&#39;s real name. |  [optional] |
|**phoneNumber** | **String** | Unique Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  [optional] |
|**countryCode** | **String** | Two-letter country abbreviation. See [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). |  [optional] |
|**countryName** | **String** | Full country name. |  [optional] |
|**email** | **String** | The contact&#39;s email address. If present, the email address must be unique. |  [optional] |
|**sourceType** | **String** | The source type where the contact was created. |  [optional] |
|**sourceId** | **String** | The source ID where the contact was created. |  [optional] |
|**sourceUrl** | **String** | The source URL where the contact was created. |  [optional] |
|**lastSeen** | **Date** | The time at which the contact last sent a message to your business, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**lastConnectedNumber** | **String** | The business phone number that the contact last connected to. |  [optional] |
|**ownerEmail** | **String** | The email address of the contact&#39;s owner. |  [optional] |
|**tags** | **List&lt;String&gt;** | Contact&#39;s tags. |  [optional] |
|**createTime** | **Date** | The time at which the contact was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**updateTime** | **Date** | The time at which the contact was last updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**blocked** | **Boolean** | Whether the contact is blocked. |  [optional] |
|**customAttributes** | **Map&lt;String, Object&gt;** | Contact&#39;s custom attributes as key-value pairs. |  [optional] |



