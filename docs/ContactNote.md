

# ContactNote

Represents an internal note attached to a contact.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the contact note. |  |
|**contactId** | **String** | Unique ID of the contact that owns this note. |  |
|**content** | **String** | Note content. |  |
|**operatorId** | **String** | ID of the actor who created the note. |  [optional] |
|**updateOperatorId** | **String** | ID of the actor who last updated the note. |  [optional] |
|**createTime** | **Date** | The time at which the note was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**updateTime** | **Date** | The time at which the note was last updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
