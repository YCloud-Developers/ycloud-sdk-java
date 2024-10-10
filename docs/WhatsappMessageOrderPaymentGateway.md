

# WhatsappMessageOrderPaymentGateway

An object that describes payment account information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Payment type. Must set this to &#x60;billdesk&#x60;, &#x60;razorpay&#x60;, &#x60;payu&#x60;, or &#x60;zaakpay&#x60;, if you have linked your BillDesk, Razorpay, PayU, or Zaakpay payment gateway to accept payments. |  |
|**configurationName** | **String** | The name of the pre-configured payment configuration to use for this order and must not exceed 60 characters. This value must match with a payment configuration set up on the WhatsApp Business Manager. |  |
|**billdesk** | [**WhatsappMessageOrderPaymentSettingPaymentGatewayBilldesk**](WhatsappMessageOrderPaymentSettingPaymentGatewayBilldesk.md) |  |  [optional] |
|**payu** | [**WhatsappMessageOrderPaymentSettingPaymentGatewayPayu**](WhatsappMessageOrderPaymentSettingPaymentGatewayPayu.md) |  |  [optional] |
|**razorpay** | [**WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay**](WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay.md) |  |  [optional] |
|**zaakpay** | [**WhatsappMessageOrderPaymentSettingPaymentGatewayZaakpay**](WhatsappMessageOrderPaymentSettingPaymentGatewayZaakpay.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BILLDESK | &quot;billdesk&quot; |
| RAZORPAY | &quot;razorpay&quot; |
| PAYU | &quot;payu&quot; |
| ZAAKPAY | &quot;zaakpay&quot; |



