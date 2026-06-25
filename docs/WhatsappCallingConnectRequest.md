

# WhatsappCallingConnectRequest

Provide exactly one of `to` or `recipient`. If both are provided, `to` takes precedence and `recipient` is ignored.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | **String** | The caller&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  |
|**to** | **String** | The callee&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. Required when &#x60;recipient&#x60; is not provided. |  [optional] |
|**recipient** | **String** | The callee&#39;s WhatsApp Business-scoped user ID (BSUID) or parent BSUID. Required when &#x60;to&#x60; is not provided. |  [optional] |
|**sdpType** | [**SdpTypeEnum**](#SdpTypeEnum) | The SDP type, must be \&quot;offer\&quot; for connection requests. |  |
|**sdp** | **String** | The Session Description Protocol (SDP) offer information compliant with [RFC 8866](https://datatracker.ietf.org/doc/html/rfc8866). Contains media session parameters for establishing the WebRTC connection. |  |



## Enum: SdpTypeEnum

| Name | Value |
|---- | -----|
| OFFER | &quot;offer&quot; |



