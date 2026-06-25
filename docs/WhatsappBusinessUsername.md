

# WhatsappBusinessUsername

Business Username state for a WhatsApp business phone number.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Phone number ID. |  [optional] |
|**wabaId** | **String** | WhatsApp Business Account ID. |  [optional] |
|**phoneNumber** | **String** | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  [optional] |
|**displayPhoneNumber** | **String** | Display phone number. |  [optional] |
|**businessUsername** | **String** | Active Business Username. The value is a plain username without &#x60;@&#x60;. |  [optional] |
|**businessUsernameStatus** | **WhatsappBusinessUsernameStatus** |  |  [optional] |
|**requestedBusinessUsername** | **String** | Last requested Business Username that is still under review. This value can coexist with an active &#x60;businessUsername&#x60; while the new request is pending. |  [optional] |
|**businessUsernameUpdatedAt** | **Date** | The time when the Business Username state was last updated. |  [optional] |



