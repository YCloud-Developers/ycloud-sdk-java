

# WhatsappMessageContact

When the message type filed is set to `contacts`, this object is included in the message object. See also [WhatsApp message contacts object](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/messages#contacts-object).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addresses** | [**List&lt;WhatsappMessageContactAddressesInner&gt;**](WhatsappMessageContactAddressesInner.md) |  |  [optional] |
|**birthday** | **String** | &#x60;YYYY-MM-DD&#x60; formatted string. |  [optional] |
|**emails** | [**List&lt;WhatsappMessageContactEmailsInner&gt;**](WhatsappMessageContactEmailsInner.md) |  |  [optional] |
|**name** | [**WhatsappMessageContactName**](WhatsappMessageContactName.md) |  |  [optional] |
|**org** | [**WhatsappMessageContactOrg**](WhatsappMessageContactOrg.md) |  |  [optional] |
|**phones** | [**List&lt;WhatsappMessageContactPhonesInner&gt;**](WhatsappMessageContactPhonesInner.md) | Contact phone number(s) formatted as a phone object. |  [optional] |
|**urls** | [**List&lt;WhatsappMessageContactUrlsInner&gt;**](WhatsappMessageContactUrlsInner.md) | Contact URL(s) formatted as a urls object. |  [optional] |



