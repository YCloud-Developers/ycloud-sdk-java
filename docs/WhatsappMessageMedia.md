

# WhatsappMessageMedia

Use for `image`, `video`, `audio`, `document`, or `sticker` messages.  See also [Supported Media Types](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/media#supported-media-types).  **Note**: Either `id` or `link` must be provided, but not both. These parameters are mutually exclusive.  Reference: [WhatsApp Cloud API Media Object](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/messages#media-object)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Required when using media that has been uploaded to WhatsApp servers.  Provide the media object ID obtained from WhatsApp media upload API (https://docs.ycloud.com/update/reference/whatsapp_media-upload#/). |  |
|**link** | **String** | Required when sending media directly from your server.  The protocol and URL of the media to be sent. Use only with HTTP/HTTPS URLs. Note: WhatsApp Cloud API caches media resources for 10 minutes. To ensure latest content, add random query strings to the URL. |  |
|**caption** | **String** | Describes the specified &#x60;image&#x60;, &#x60;video&#x60;, or &#x60;document&#x60; media. Not applicable in the &#x60;header&#x60; of &#x60;template&#x60; or &#x60;interactive&#x60; messages. |  [optional] |
|**filename** | **String** | Describes the filename for the specific document. Use only with &#x60;document&#x60; media. |  [optional] |



