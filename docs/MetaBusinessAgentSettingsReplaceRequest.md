

# MetaBusinessAgentSettingsReplaceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentId** | **String** |  |  [optional] |
|**rollout** | [**MetaBusinessAgentSettingsRollout**](MetaBusinessAgentSettingsRollout.md) |  |  [optional] |
|**handoff** | [**MetaBusinessAgentSettingsHandoff**](MetaBusinessAgentSettingsHandoff.md) |  |  [optional] |
|**followup** | [**MetaBusinessAgentSettingsFollowup**](MetaBusinessAgentSettingsFollowup.md) |  |  [optional] |
|**aiAudience** | [**AiAudienceEnum**](#AiAudienceEnum) |  |  [optional] |
|**neverSayPhrases** | **List&lt;String&gt;** | Omit to preserve, send an empty array to clear, or send the complete replacement list. |  [optional] |



## Enum: AiAudienceEnum

| Name | Value |
|---- | -----|
| ALLOWLISTED_ONLY | &quot;ALLOWLISTED_ONLY&quot; |
| EVERYONE | &quot;EVERYONE&quot; |
