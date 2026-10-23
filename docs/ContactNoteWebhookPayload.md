

# ContactNoteWebhookPayload

Customer-facing Contact Note webhook snapshot. Internal operator identifiers are not exposed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique 24-character ObjectId for the contact note. IDs remain unchanged after storage migration. |  |
|**contactId** | **String** | Unique ID of the contact that owns this note. |  |
|**username** | **String** | Username of the contact that owns this note, without the leading &#x60;@&#x60;. |  |
|**phoneNumber** | **String** | Phone number of the contact that owns this note in E.164 format. |  |
|**content** | **String** | Note content. |  |
|**createTime** | **Date** | The time at which the note was created, formatted in RFC 3339. |  |
|**updateTime** | **Date** | The time at which the note was last updated, formatted in RFC 3339. |  |
