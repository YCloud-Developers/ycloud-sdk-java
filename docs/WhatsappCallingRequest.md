

# WhatsappCallingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneId** | **String** | The WhatsApp Business phone number ID. |  [optional] |
|**from** | **String** | The caller&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. Required for connect operations when phoneId is empty. |  [optional] |
|**to** | **String** | The callee&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. Required for outbound call connections. |  [optional] |
|**wacid** | **String** | The WhatsApp call ID. Required for inbound call operations. This ID is received from the Call Connect webhook when a WhatsApp user initiates the call. |  [optional] |
|**sdpType** | [**SdpTypeEnum**](#SdpTypeEnum) | The SDP type. For pre-accept and accept operations, must be \&quot;answer\&quot;. |  [optional] |
|**sdp** | **String** | The Session Description Protocol (SDP) information compliant with [RFC 8866](https://datatracker.ietf.org/doc/html/rfc8866). Required for pre-accept and accept operations. Contains media session parameters for the WebRTC connection. |  [optional] |



## Enum: SdpTypeEnum

| Name | Value |
|---- | -----|
| OFFER | &quot;offer&quot; |
| ANSWER | &quot;answer&quot; |



