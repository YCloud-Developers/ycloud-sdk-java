

# WhatsappInboundMessageMedia

When a message with media (`image` | `document` | `audio` | `video` | `sticker`) is received, the WhatsApp Business API client will download the media. Once the media is downloaded, a notification is sent to your Webhook. This message contains information that identifies the media object and enables you to find and download the object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**link** | **String** | The protocol and URL of the media. |  [optional] |
|**caption** | **String** | The provided caption for the media. Only present if specified. |  [optional] |
|**filename** | **String** | Filename on the sender&#39;s device. This will only be present in &#x60;document&#x60; media messages. |  [optional] |
|**id** | **String** | ID of the media. Can be used to delete the media if stored locally on the client. |  [optional] |
|**metadata** | **String** | Metadata pertaining to &#x60;sticker&#x60; media. |  [optional] |
|**mimeType** | **String** | Mime type of the media. |  [optional] |
|**sha256** | **String** | Checksum. |  [optional] |



