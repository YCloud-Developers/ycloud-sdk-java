

# WhatsappTemplateComponentLimitedTimeOffer

Use for `LIMITED_TIME_OFFER` components.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**text** | **String** | **Required.** Offer details text. Maximum 16 characters. |  [optional] |
|**hasExpiration** | **Boolean** | **Optional.** Set to &#x60;true&#x60; to have the [offer expiration details](https://developers.facebook.com/docs/whatsapp/business-management-api/message-templates/limited-time-offer-templates#offer-expiration-details) appear in the delivered message. If set to &#x60;true&#x60;, the copy code button component must be included in the &#x60;buttons&#x60; array, and must appear first in the array. If set to &#x60;false&#x60;, offer expiration details will not appear in the delivered message and the copy code button component is optional. If including the copy code button, it must appear first in the &#x60;buttons&#x60; array. |  [optional] |



