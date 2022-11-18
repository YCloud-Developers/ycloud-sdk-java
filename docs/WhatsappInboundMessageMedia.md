

# WhatsappInboundMessageMedia

When a message with media (`image` | `document` | `audio` | `video` | `sticker`) is received, the WhatsApp Business API client will download the media. Once the media is downloaded, a notification is sent to your Webhook. This message contains information that identifies the media object and enables you to find and download the object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the media. Can be used to delete the media if stored locally on the client. |  [optional] |
|**link** | **String** | The url to download the media file. Note that This link can be directly accessed in a few minutes for the convenience of the consumer, but you should always include an &#x60;X-API-Key&#x60; header to download this file within a month. |  [optional] |
|**caption** | **String** | The provided caption for the media. Only present if specified. |  [optional] |
|**filename** | **String** | Filename on the sender&#39;s device. This will only be present in &#x60;document&#x60; media messages. |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Metadata pertaining to &#x60;sticker&#x60; media. |  [optional] |
|**mimeType** | **String** | Mime type of the media. |  [optional] |
|**sha256** | **String** | Checksum. |  [optional] |



