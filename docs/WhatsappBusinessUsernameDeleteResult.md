

# WhatsappBusinessUsernameDeleteResult

Business Username deletion result. Deleting the active username does not cancel a pending Business Username request. If a pending request still exists, the returned `businessUsernameStatus` is `pending_review`; otherwise it is `not_set`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** | Whether the delete request was accepted. |  [optional] |
|**id** | **String** | Phone number ID. |  [optional] |
|**wabaId** | **String** | WhatsApp Business Account ID. |  [optional] |
|**phoneNumber** | **String** | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  [optional] |
|**businessUsernameStatus** | **WhatsappBusinessUsernameStatus** |  |  [optional] |
|**businessUsernameUpdatedAt** | **Date** | The time when the Business Username state was last updated. |  [optional] |



