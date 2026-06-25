

# WhatsappGroupWebhookSetting

Group setting update detail.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**NameEnum**](#NameEnum) | Setting name. |  [optional] |
|**text** | **String** | Text value for subject or description updates. |  [optional] |
|**updateSuccessful** | **Boolean** | Whether the setting update succeeded. |  [optional] |
|**mimeType** | **String** | MIME type for profile picture updates. |  [optional] |
|**sha256** | **String** | SHA-256 hash for profile picture updates. |  [optional] |
|**errors** | **List&lt;Map&lt;String, Object&gt;&gt;** | Errors returned by WhatsApp for this setting. |  [optional] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| PROFILE_PICTURE | &quot;profile_picture&quot; |
| GROUP_SUBJECT | &quot;group_subject&quot; |
| GROUP_DESCRIPTION | &quot;group_description&quot; |



