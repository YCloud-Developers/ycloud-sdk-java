

# WhatsappInboundMessageInteractive

When a customer has interacted with your message, this object is included in the message object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of interactive message received. - &#x60;button_reply&#x60;: Sent when a customer clicks a button. - &#x60;list_reply&#x60;: Sent when a customer selects an item from a list. - &#x60;nfm_reply&#x60;: Sent when a customer responds to a WhatsApp Flow (Next Feature Messaging). - &#x60;call_permission_reply&#x60;: Sent when a customer responds to a call permission request. |  [optional] |
|**buttonReply** | [**WhatsappInboundMessageInteractiveButtonReply**](WhatsappInboundMessageInteractiveButtonReply.md) |  |  [optional] |
|**listReply** | [**WhatsappInboundMessageInteractiveListReply**](WhatsappInboundMessageInteractiveListReply.md) |  |  [optional] |
|**nfmReply** | [**WhatsappInboundMessageInteractiveNfmReply**](WhatsappInboundMessageInteractiveNfmReply.md) |  |  [optional] |
|**callPermissionReply** | [**WhatsappInboundMessageInteractiveCallPermissionReply**](WhatsappInboundMessageInteractiveCallPermissionReply.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BUTTON_REPLY | &quot;button_reply&quot; |
| LIST_REPLY | &quot;list_reply&quot; |
| NFM_REPLY | &quot;nfm_reply&quot; |
| CALL_PERMISSION_REPLY | &quot;call_permission_reply&quot; |



