

# WhatsappInboundMessageInteractive

When a customer has interacted with your message, this object is included in the message object. See also [WhatsApp webhook messages object](https://developers.facebook.com/docs/whatsapp/cloud-api/webhooks/components#messages-object), and [payload examples](https://developers.facebook.com/docs/whatsapp/cloud-api/webhooks/payload-examples#webhook-notification-payload-examples).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of interactive message received. - &#x60;button_reply&#x60;: Sent when a customer clicks a button. - &#x60;list_reply&#x60;: Sent when a customer selects an item from a list. |  [optional] |
|**buttonReply** | [**WhatsappInboundMessageInteractiveButtonReply**](WhatsappInboundMessageInteractiveButtonReply.md) |  |  [optional] |
|**listReply** | [**WhatsappInboundMessageInteractiveListReply**](WhatsappInboundMessageInteractiveListReply.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BUTTON_REPLY | &quot;button_reply&quot; |
| LIST_REPLY | &quot;list_reply&quot; |



