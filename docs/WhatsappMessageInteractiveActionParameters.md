

# WhatsappMessageInteractiveActionParameters

Action parameters. Required for Call-To-Action (CTA) buttons.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayText** | **String** | Text of the CTA URL button. Maximum length: 20 bytes. |  [optional] |
|**url** | **String** | URL of the CTA URL button. |  [optional] |
|**thumbnailProductRetailerId** | **String** | Item SKU number. Labeled as **Content ID** in the [Commerce Manager](https://business.facebook.com/commerce). The thumbnail of this item will be used as the message&#39;s header image. |  [optional] |
|**flowMessageVersion** | **String** | Use for &#x60;flow&#x60; buttons. Value must be \&quot;3\&quot;. |  [optional] |
|**flowToken** | **String** | Use for &#x60;flow&#x60; buttons. Flow token that is generated by the business to serve as an identifier. Defaults to &#x60;unused&#x60;. |  [optional] |
|**flowId** | **String** | Conditionally required for &#x60;flow&#x60; buttons. Unique ID of the Flow provided by WhatsApp. Cannot be used with the &#x60;flow_name&#x60; parameter. |  [optional] |
|**flowName** | **String** | Conditionally required for &#x60;flow&#x60; buttons. The name of the Flow that you created. Cannot be used with the &#x60;flow_id&#x60; parameter. Changing the Flow name will require updating this parameter to match the new name. |  [optional] |
|**flowCta** | **String** | Required for &#x60;flow&#x60; buttons. Text on the CTA button. For example: \&quot;Open flow!\&quot;. Maximum length: 20 characters. |  [optional] |
|**flowAction** | **String** | Use for &#x60;flow&#x60; buttons. Either &#x60;navigate&#x60; or &#x60;data_exchange&#x60;. Defaults to &#x60;navigate&#x60;. |  [optional] |
|**flowActionPayload** | [**WhatsappMessageInteractiveActionParametersFlowActionPayload**](WhatsappMessageInteractiveActionParametersFlowActionPayload.md) |  |  [optional] |
|**referenceId** | **String** | Required for &#x60;review_and_pay&#x60; buttons. Unique identifier for the order provided by the business. It is case sensitive and cannot be an empty string and can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters.  The &#x60;reference_id&#x60; must be unique for each order_details message for a given business. If there is a need to send multiple order_details messages for the same order, it is recommended to include a sequence number in the reference_id (for example, \&quot;BM345A-12\&quot;) to ensure reference_id uniqueness. |  [optional] |
|**type** | **String** | Required for &#x60;review_and_pay&#x60; buttons. The type of goods being paid for in this order. Current supported options are &#x60;digital-goods&#x60; and &#x60;physical-goods&#x60;. |  [optional] |
|**beneficiaries** | [**List&lt;WhatsappMessageOrderBeneficiary&gt;**](WhatsappMessageOrderBeneficiary.md) | Required for &#x60;review_and_pay&#x60; buttons. An array of beneficiaries for this order. A beneficiary is an intended recipient for shipping the physical goods in the order. Beneficiary information isn&#39;t shown to users but is needed for legal and compliance reasons. |  [optional] |
|**currency** | **String** | Required for &#x60;review_and_pay&#x60; buttons. The currency for this order. Currently the only supported value is &#x60;INR&#x60;. |  [optional] |
|**totalAmount** | [**WhatsappMessageOrderAmount**](WhatsappMessageOrderAmount.md) |  |  [optional] |
|**order** | [**WhatsappMessageOrderInfo**](WhatsappMessageOrderInfo.md) |  |  [optional] |
|**paymentSettings** | [**List&lt;WhatsappMessageOrderPaymentSetting&gt;**](WhatsappMessageOrderPaymentSetting.md) | Required for &#x60;review_and_pay&#x60; buttons. Payment settings for the order. |  [optional] |



