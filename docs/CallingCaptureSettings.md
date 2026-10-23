

# CallingCaptureSettings

Phone-number-level recording and transcription capture settings used for new WhatsApp calls.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordingEnabled** | **Boolean** | Whether recording capture is enabled. |  |
|**transcriptionEnabled** | **Boolean** | Whether transcription capture is enabled. |  |
|**purpose** | **String** | Customer-defined capture purpose passed to the Calling provider configuration. Required when either capture switch is enabled. |  [optional] |
|**announcementLanguage** | [**AnnouncementLanguageEnum**](#AnnouncementLanguageEnum) | Meta-supported announcement language. Required when either capture switch is enabled. |  [optional] |



## Enum: AnnouncementLanguageEnum

| Name | Value |
|---- | -----|
| EN | &quot;en&quot; |
| EN_US | &quot;en_US&quot; |
| EN_AU | &quot;en_AU&quot; |
| EN_CA | &quot;en_CA&quot; |
| EN_GB | &quot;en_GB&quot; |
| EN_IN | &quot;en_IN&quot; |
| EN_NZ | &quot;en_NZ&quot; |
| NL | &quot;nl&quot; |
| FR | &quot;fr&quot; |
| DE | &quot;de&quot; |
| HI | &quot;hi&quot; |
| IT | &quot;it&quot; |
| KN | &quot;kn&quot; |
| PT | &quot;pt&quot; |
| ES | &quot;es&quot; |
| ES_ES | &quot;es_ES&quot; |
| TE | &quot;te&quot; |
| VI | &quot;vi&quot; |
