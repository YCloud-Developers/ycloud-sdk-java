

# Verification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the verification. |  |
|**status** | **VerificationStatus** |  |  [optional] |
|**to** | **String** | Recipient of the verification. |  [optional] |
|**channel** | **VerificationChannel** |  |  [optional] |
|**sendTime** | **Date** | The time at which this verification was sent, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**totalPrice** | **Double** | Total price of this verification. |  [optional] |
|**currency** | **String** | Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217). |  [optional] |
|**smsFallbackEnabled** | **Boolean** | Whether sms fallback is enabled or not. Applicable when &#x60;channel&#x60; is &#x60;whatsapp&#x60;. If enabled, we will try to send the verification code via sms when the WhatsApp message is failed. |  [optional] |
|**smsFallback** | [**VerificationFallback**](VerificationFallback.md) |  |  [optional] |
|**externalId** | **String** | A unique (recommended) string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems. |  [optional] |



