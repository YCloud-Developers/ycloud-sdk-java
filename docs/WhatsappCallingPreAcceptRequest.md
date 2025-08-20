

# WhatsappCallingPreAcceptRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneId** | **String** | The WhatsApp Business phone number ID. |  |
|**wacid** | **String** | The WhatsApp call ID. Required for inbound call operations. This ID is received from the Call Connect webhook when a WhatsApp user initiates the call. |  |
|**sdpType** | [**SdpTypeEnum**](#SdpTypeEnum) | The SDP type for pre-accept operations. Must be \&quot;answer\&quot;. |  |
|**sdp** | **String** | The Session Description Protocol (SDP) information compliant with [RFC 8866](https://datatracker.ietf.org/doc/html/rfc8866). Contains media session parameters for the WebRTC connection. |  |



## Enum: SdpTypeEnum

| Name | Value |
|---- | -----|
| ANSWER | &quot;answer&quot; |



