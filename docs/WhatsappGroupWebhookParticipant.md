

# WhatsappGroupWebhookParticipant

Participant information included in group webhook payloads.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**input** | **String** | The original participant input. |  [optional] |
|**waId** | **String** | WhatsApp user ID. |  [optional] |
|**recipientUserId** | **String** | Business-scoped user ID. |  [optional] |
|**parentRecipientUserId** | **String** | Parent business-scoped user ID. |  [optional] |
|**customerProfile** | [**WhatsappGroupCustomerProfile**](WhatsappGroupCustomerProfile.md) |  |  [optional] |
|**errors** | **List&lt;Map&lt;String, Object&gt;&gt;** | Errors returned by WhatsApp for this participant. |  [optional] |



