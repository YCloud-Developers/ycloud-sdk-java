

# WhatsappBusinessAccountRestrictionInfo

Used to report restrictions imposed on a specific WABA, when that WABA violates [WhatsApp Business Platform policies](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**restrictionType** | [**RestrictionTypeEnum**](#RestrictionTypeEnum) | Restriction type. |  [optional] |
|**expiration** | **Date** | The time at which this restriction expires, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |



## Enum: RestrictionTypeEnum

| Name | Value |
|---- | -----|
| ADD_PHONE_NUMBER_ACTION | &quot;RESTRICTED_ADD_PHONE_NUMBER_ACTION&quot; |
| BIZ_INITIATED_MESSAGING | &quot;RESTRICTED_BIZ_INITIATED_MESSAGING&quot; |
| CUSTOMER_INITIATED_MESSAGING | &quot;RESTRICTED_CUSTOMER_INITIATED_MESSAGING&quot; |



