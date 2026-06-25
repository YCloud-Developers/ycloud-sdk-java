

# WhatsappGroupWebhook

WhatsApp group webhook payload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**wabaId** | **String** | WhatsApp Business Account ID. |  [optional] |
|**displayPhoneNumber** | **String** | The display phone number from WhatsApp webhook metadata. |  [optional] |
|**phoneNumberId** | **String** | WhatsApp phone number ID. |  [optional] |
|**field** | **WhatsappGroupWebhookField** |  |  [optional] |
|**type** | **WhatsappGroupWebhookType** |  |  [optional] |
|**requestId** | **String** | The request ID returned by an asynchronous group API operation. |  [optional] |
|**status** | **WhatsappGroupWebhookStatus** |  |  [optional] |
|**groupId** | **String** | WhatsApp group ID. |  [optional] |
|**inviteLink** | **String** | The group invite link. |  [optional] |
|**reason** | **String** | The reason for a participant, join request, or removal event. |  [optional] |
|**initiatedBy** | [**InitiatedByEnum**](#InitiatedByEnum) | Indicates who initiated a participant removal event. |  [optional] |
|**joinRequestId** | **String** | The join request ID. |  [optional] |
|**waId** | **String** | WhatsApp user ID for a single participant event. |  [optional] |
|**recipientUserId** | **String** | Business-scoped user ID for a single participant event. |  [optional] |
|**parentRecipientUserId** | **String** | Parent business-scoped user ID for a single participant event. |  [optional] |
|**customerProfile** | [**WhatsappGroupCustomerProfile**](WhatsappGroupCustomerProfile.md) |  |  [optional] |
|**subject** | **String** | The group subject. |  [optional] |
|**description** | **String** | The group description. |  [optional] |
|**joinApprovalMode** | **WhatsappGroupJoinApprovalMode** |  |  [optional] |
|**addedParticipants** | [**List&lt;WhatsappGroupWebhookParticipant&gt;**](WhatsappGroupWebhookParticipant.md) | Participants added to the group. |  [optional] |
|**removedParticipants** | [**List&lt;WhatsappGroupWebhookParticipant&gt;**](WhatsappGroupWebhookParticipant.md) | Participants removed from the group. |  [optional] |
|**failedParticipants** | [**List&lt;WhatsappGroupWebhookParticipant&gt;**](WhatsappGroupWebhookParticipant.md) | Participants that failed to be added or removed. |  [optional] |
|**settings** | [**List&lt;WhatsappGroupWebhookSetting&gt;**](WhatsappGroupWebhookSetting.md) | Group setting update details. |  [optional] |
|**errors** | **List&lt;Map&lt;String, Object&gt;&gt;** | Errors returned by WhatsApp. |  [optional] |
|**contacts** | [**List&lt;WhatsappGroupWebhookStatusContact&gt;**](WhatsappGroupWebhookStatusContact.md) | Contacts included in group message status webhooks. |  [optional] |
|**statuses** | [**List&lt;WhatsappGroupWebhookMessageStatus&gt;**](WhatsappGroupWebhookMessageStatus.md) | Group message status details. |  [optional] |
|**webhookTime** | **Date** | The time at which WhatsApp triggered this webhook. |  [optional] |
|**dedupeKey** | **String** | Idempotency key for deduplicating group webhook events. |  [optional] |



## Enum: InitiatedByEnum

| Name | Value |
|---- | -----|
| BUSINESS | &quot;business&quot; |
| PARTICIPANT | &quot;participant&quot; |



