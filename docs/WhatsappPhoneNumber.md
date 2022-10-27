

# WhatsappPhoneNumber

A WhatsApp Business Account (WABA) phone number. See also [WhatsApp Retrieve Phone Numbers](https://developers.facebook.com/docs/whatsapp/business-management-api/manage-phone-numbers).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  [optional] |
|**displayPhoneNumber** | **String** | Display phone number. |  [optional] |
|**wabaId** | **String** | WhatsApp Business Account ID. |  [optional] |
|**qualityRating** | **WhatsappPhoneNumberQualityRating** |  |  [optional] |
|**messagingLimit** | **String** | Messaging limits determine the maximum number of business-initiated conversations each phone number can start in a rolling 24-hour period. See also [Messaging Limits](https://developers.facebook.com/docs/whatsapp/messaging-limits#messaging-limits). - &#x60;TIER_50&#x60;: 50 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_250&#x60;: 250 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_1K&#x60;: 1K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_10K&#x60;: 10K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_100K&#x60;: 100K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_UNLIMITED&#x60;: An unlimited number of business-initiated conversations in a rolling 24-hour period. |  [optional] |
|**verifiedName** | **String** | Verified name. |  [optional] |
|**codeVerificationStatus** | **WhatsappPhoneNumberCodeVerificationStatus** |  |  [optional] |
|**status** | **WhatsappPhoneNumberStatus** |  |  [optional] |
|**nameStatus** | **WhatsappPhoneNumberNameStatus** |  |  [optional] |
|**newNameStatus** | **WhatsappPhoneNumberNameStatus** |  |  [optional] |
|**decision** | **String** | Decision. See [Phone Number Name Update](https://developers.facebook.com/docs/graph-api/webhooks/reference/whatsapp-business-account/#phone_number_name_update). |  [optional] |
|**requestedVerifiedName** | **String** | Last requested verified name. See [Phone Number Name Update](https://developers.facebook.com/docs/graph-api/webhooks/reference/whatsapp-business-account/#phone_number_name_update). |  [optional] |
|**rejectionReason** | **String** | Rejection reason. See [Phone Number Name Update](https://developers.facebook.com/docs/graph-api/webhooks/reference/whatsapp-business-account/#phone_number_name_update). |  [optional] |



