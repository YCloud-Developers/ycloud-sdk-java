

# WhatsappInboundMessageInteractiveCallPermissionReply

Sent when a customer responds to a call permission request. Returned when `type` is `call_permission_reply`. This occurs when WhatsApp prompts users to grant callback permissions after they call your business.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**response** | [**ResponseEnum**](#ResponseEnum) | The customer&#39;s response to the call permission request. - &#x60;accept&#x60;: User granted permission for business to call back - &#x60;reject&#x60;: User rejected permission for business to call back |  [optional] |
|**expirationTimestamp** | **Long** | The timestamp (in seconds) when the call permission expires. Only present when response is \&quot;accept\&quot; and is_permanent is false. |  [optional] |
|**isPermanent** | **Boolean** | Whether the permission is permanent or temporary. - &#x60;true&#x60;: Permanent authorization (no expiration) - &#x60;false&#x60;: Temporary authorization (expires at expiration_timestamp) |  [optional] |
|**responseSource** | [**ResponseSourceEnum**](#ResponseSourceEnum) | The source of this permission response. - &#x60;user_action&#x60;: User explicitly approved or rejected the permission - &#x60;automatic&#x60;: Automatic permission approval due to the WhatsApp user initiating the call |  [optional] |



## Enum: ResponseEnum

| Name | Value |
|---- | -----|
| ACCEPT | &quot;accept&quot; |
| REJECT | &quot;reject&quot; |



## Enum: ResponseSourceEnum

| Name | Value |
|---- | -----|
| USER_ACTION | &quot;user_action&quot; |
| AUTOMATIC | &quot;automatic&quot; |



