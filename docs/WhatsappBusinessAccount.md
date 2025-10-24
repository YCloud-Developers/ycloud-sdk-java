

# WhatsappBusinessAccount

Represents a specific [WhatsApp Business Account (WABA)](https://developers.facebook.com/docs/whatsapp/overview/business-accounts).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | WhatApp Business Account ID. |  [optional] |
|**name** | **String** | User-friendly name to differentiate WhatsApp Business Accounts. |  [optional] |
|**currency** | **String** | The currency in which the payment transactions for the WhatsApp Business Account will be processed. |  [optional] |
|**messageTemplateNamespace** | **String** | Namespace string for the message templates that belong to the WhatsApp Business Account. |  [optional] |
|**accountReviewStatus** | **WhatsappBusinessAccountReviewStatus** |  |  [optional] |
|**businessId** | **String** | Business Portfolio ID. |  [optional] |
|**businessName** | **String** | Business Portfolio Name. |  [optional] |
|**businessStatus** | **String** | Business Portfolio Status,Default:APPROVED |  [optional] |
|**businessVerificationStatus** | **MetaBusinessAccountVerificationStatus** |  |  [optional] |
|**country** | **String** | Country of the WhatsApp Business Account&#39;s owning Meta Business account. |  [optional] |
|**ownershipType** | **String** | Ownership type of the WhatsApp Business Account. |  [optional] |
|**paymentMethodAttached** | **Boolean** | Whether we have attached a payment method to the WhatsApp Business Account. |  [optional] |
|**primaryFundingId** | **String** | Primary funding ID for the WhatsApp Business Account paid service. |  [optional] |
|**purchaseOrderNumber** | **String** | The purchase order number supplied by the business for payment management purposes. |  [optional] |
|**timezoneId** | **String** | The timezone ID of the WhatsApp Business Account. See [Timezone IDs](https://developers.facebook.com/docs/marketing-api/reference/ad-account/timezone-ids). |  [optional] |
|**decision** | **WhatsappReviewDecision** |  |  [optional] |
|**updateEvent** | **WhatsappBusinessAccountUpdateEventEnum** |  |  [optional] |
|**banState** | **WhatsappBusinessAccountBanState** |  |  [optional] |
|**banDate** | **String** | The date when the WABA is banned. |  [optional] |
|**violationType** | **String** | Used to report violations imposed on the WABA. See also [WhatsApp Business Platform Policy Violations](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement/violations). |  [optional] |
|**restrictions** | [**List&lt;WhatsappBusinessAccountRestrictionInfo&gt;**](WhatsappBusinessAccountRestrictionInfo.md) | Used to report restrictions imposed on the WABA, when that WABA violates [WhatsApp Business Platform policies](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement). |  [optional] |
|**authIntlRateEligibilityCountries** | [**List&lt;WhatsappAuthIntlRateEligibilityCountry&gt;**](WhatsappAuthIntlRateEligibilityCountry.md) | Starting June 1, 2024, we are updating our authentication rate card and introducing a new authentication-international rate. This rate will apply in the the following countries: - June 1, 2024 – Indonesia (country calling code +62, country code &#x60;ID&#x60;) - July 1, 2024 – India (country calling code +91, country code &#x60;IN&#x60;)  See also [Authentication-International Rates](https://developers.facebook.com/docs/whatsapp/pricing/authentication-international-rates). |  [optional] |
|**primaryBusinessLocation** | **String** | Your primary business location is the country where your business is based. It will appear in the Business Manager under the Primary Business Location field starting May 1, 2024. [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). |  [optional] |
|**whatsappBusinessManagerMessagingLimit** | **String** | The owning business portfolio&#39;s messaging limit. Starting October 7, 2025, messaging limits will instead be calculated and set on a business portfolio basis, and will be shared by all business phone numbers within each portfolio. See also [phone_number_quality_update webhook reference](https://developers.facebook.com/docs/whatsapp/cloud-api/webhooks/reference/phone_number_quality_update). - &#x60;TIER_NOT_SET&#x60;: The business phone number has not been used to send a message yet. - &#x60;TIER_50&#x60;: Messaging limit of 50 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_250&#x60;: Messaging limit of 250 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_2K&#x60;: Messaging limit of 2,000 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_10K&#x60;: Messaging limit of 10,000 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_100K&#x60;: Messaging limit of 100,000 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_UNLIMITED&#x60;: The business phone number has higher throughput with unlimited business-initiated conversations. |  [optional] |



