

# WhatsappInboundMessageSystem

When the message type is set to `system`, this field is included. This object is added to Webhooks if a user has changed their phone number and if a user’s identity has potentially changed on WhatsApp.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**body** | **String** | Describes the system message event. Supported use cases are: - Phone number update: for when a user changes from an old number to a new number. - Identity update: for when a user identity has changed. |  [optional] |
|**newWaId** | **String** | **Added to Webhooks for phone number updates.**  New WhatsApp ID of the customer. |  [optional] |
|**type** | **String** | Supported types are: - &#x60;user_changed_number&#x60;: for a user changed number notification. - &#x60;user_identity_changed&#x60;: for user identity changed notification. |  [optional] |
|**user** | **String** | **Added to Webhooks for identity updates.**  The new WhatsApp user ID of the customer. |  [optional] |



