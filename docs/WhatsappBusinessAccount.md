

# WhatsappBusinessAccount

Represents a specific [WhatsApp Business Account (WABA)](https://www.facebook.com/business/help/1499554293524119).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the WhatApp Business Account. |  [optional] |
|**name** | **String** | User-friendly name to differentiate WhatsApp Business Accounts. |  [optional] |
|**currency** | **String** | The currency in which the payment transactions for the WhatsApp Business Account will be processed. |  [optional] |
|**messageTemplateNamespace** | **String** | Namespace string for the message templates that belong to the WhatsApp Business Account. |  [optional] |
|**accountReviewStatus** | **WhatsappBusinessAccountReviewStatus** |  |  [optional] |
|**businessVerificationStatus** | **MetaBusinessAccountVerificationStatus** |  |  [optional] |
|**country** | **String** | Country of the WhatsApp Business Account&#39;s owning Meta Business account. |  [optional] |
|**ownershipType** | **String** | Ownership type of the WhatsApp Business Account. |  [optional] |
|**primaryFundingId** | **String** | Primary funding ID for the WhatsApp Business Account paid service. |  [optional] |
|**purchaseOrderNumber** | **String** | The purchase order number supplied by the business for payment management purposes. |  [optional] |
|**timezoneId** | **String** | The timezone ID of the WhatsApp Business Account. See [Timezone IDs](https://developers.facebook.com/docs/marketing-api/reference/ad-account/timezone-ids). |  [optional] |
|**decision** | **WhatsappReviewDecision** |  |  [optional] |
|**updateEvent** | **WhatsappBusinessAccountUpdateEventEnum** |  |  [optional] |
|**banState** | **WhatsappBusinessAccountBanState** |  |  [optional] |
|**banDate** | **String** | The date when the WABA is banned. |  [optional] |
|**violationType** | **String** | Used to report violations imposed on the WABA. See also [WhatsApp Business Platform Policy Violations](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement/violations). |  [optional] |
|**restrictions** | [**List&lt;WhatsappBusinessAccountRestrictionInfo&gt;**](WhatsappBusinessAccountRestrictionInfo.md) | Used to report restrictions imposed on the WABA, when that WABA violates [WhatsApp Business Platform policies](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement). |  [optional] |



