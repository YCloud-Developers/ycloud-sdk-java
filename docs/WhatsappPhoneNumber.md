

# WhatsappPhoneNumber

See [WhatsApp Business Phone Number](https://developers.facebook.com/docs/whatsapp/cloud-api/phone-numbers)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Phone number ID. |  [optional] |
|**phoneNumber** | **String** | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  [optional] |
|**displayPhoneNumber** | **String** | Display phone number. |  [optional] |
|**wabaId** | **String** | WhatsApp Business Account ID. |  [optional] |
|**qualityRating** | **WhatsappPhoneNumberQualityRating** |  |  [optional] |
|**messagingLimit** | **String** | Messaging limits determine the maximum number of business-initiated conversations each phone number can start in a rolling 24-hour period. See also [Messaging Limits](https://developers.facebook.com/docs/whatsapp/messaging-limits). - &#x60;TIER_NOT_SET&#x60;: Unknown limit. - &#x60;TIER_50&#x60;: 50 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_250&#x60;: 250 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_1K&#x60;: 1K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_10K&#x60;: 10K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_100K&#x60;: 100K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_UNLIMITED&#x60;: An unlimited number of business-initiated conversations in a rolling 24-hour period. |  [optional] |
|**whatsappBusinessManagerMessagingLimit** | **String** | The owning business portfolio&#39;s messaging limit. Starting October 7, 2025, messaging limits will instead be calculated and set on a business portfolio basis, and will be shared by all business phone numbers within each portfolio. See also [phone_number_quality_update webhook reference](https://developers.facebook.com/docs/whatsapp/cloud-api/webhooks/reference/phone_number_quality_update). - &#x60;TIER_NOT_SET&#x60;: The business phone number has not been used to send a message yet. - &#x60;TIER_50&#x60;: Messaging limit of 50 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_250&#x60;: Messaging limit of 250 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_2K&#x60;: Messaging limit of 2,000 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_10K&#x60;: Messaging limit of 10,000 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_100K&#x60;: Messaging limit of 100,000 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_UNLIMITED&#x60;: The business phone number has higher throughput with unlimited business-initiated conversations. |  [optional] |
|**verifiedName** | **String** | Verified name. |  [optional] |
|**newName** | **String** | The modified name |  [optional] |
|**codeVerificationStatus** | **WhatsappPhoneNumberCodeVerificationStatus** |  |  [optional] |
|**isOfficialBusinessAccount** | **Boolean** | Whether this phone number is an official business account or not. An official business account has a green checkmark badge in its profile and chat thread headers. See [Official Business Account](https://developers.facebook.com/docs/whatsapp/overview/business-accounts#official-business-account) for more information. |  [optional] |
|**status** | **WhatsappPhoneNumberStatus** |  |  [optional] |
|**nameStatus** | **WhatsappPhoneNumberNameStatus** |  |  [optional] |
|**newNameStatus** | **WhatsappPhoneNumberNameStatus** |  |  [optional] |
|**decision** | **WhatsappReviewDecision** |  |  [optional] |
|**requestedVerifiedName** | **String** | Last requested verified name. |  [optional] |
|**rejectionReason** | **String** | Rejection reason. |  [optional] |
|**qualityUpdateEvent** | **WhatsappPhoneNumberQualityUpdateEventEnum** |  |  [optional] |



