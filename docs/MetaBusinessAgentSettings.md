

# MetaBusinessAgentSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentId** | **String** |  |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) |  |  [optional] |
|**rollout** | [**MetaBusinessAgentSettingsRollout**](MetaBusinessAgentSettingsRollout.md) |  |  [optional] |
|**handoff** | [**MetaBusinessAgentSettingsHandoff**](MetaBusinessAgentSettingsHandoff.md) |  |  [optional] |
|**followup** | [**MetaBusinessAgentSettingsFollowup**](MetaBusinessAgentSettingsFollowup.md) |  |  [optional] |
|**aiAudience** | [**AiAudienceEnum**](#AiAudienceEnum) |  |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;email&quot; |
| INSTAGRAM | &quot;instagram&quot; |
| LINE | &quot;line&quot; |
| MESSENGER | &quot;messenger&quot; |
| SMS | &quot;sms&quot; |
| TIKTOK | &quot;tiktok&quot; |
| UNKNOWN | &quot;unknown&quot; |
| WEBCHAT | &quot;webchat&quot; |
| WHATSAPP | &quot;whatsapp&quot; |



## Enum: AiAudienceEnum

| Name | Value |
|---- | -----|
| ALLOWLISTED_ONLY | &quot;ALLOWLISTED_ONLY&quot; |
| EVERYONE | &quot;EVERYONE&quot; |
