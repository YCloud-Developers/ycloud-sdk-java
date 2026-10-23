

# WhatsappTemplateAnalytics


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**wabaId** | **String** | WhatsApp Business Account ID. |  |
|**officialTemplateId** | **String** | Resolved official WhatsApp/Meta template ID. Successful queries resolve a current template; the property remains nullable for contract compatibility. |  |
|**templateName** | **String** | Template name used for the statistics query. |  |
|**language** | **String** | Template language used for the statistics query. |  |
|**timezone** | **String** | IANA timezone resolved from the WABA configuration and used to interpret the date range. |  |
|**analyticsStatus** | [**AnalyticsStatusEnum**](#AnalyticsStatusEnum) | Meta Template Insights status only; it does not describe YCloud message metrics. NO_DATA means the Meta query completed without data for the requested date range. ERROR indicates that Template Insights are unavailable because of an error after the current template was successfully resolved and validated. |  |
|**startDate** | **Date** | Inclusive start date from the request. |  |
|**endDate** | **Date** | Inclusive end date from the request. |  |
|**dataPoints** | [**List&lt;WhatsappTemplateAnalyticsDataPoint&gt;**](WhatsappTemplateAnalyticsDataPoint.md) | One item for every date in the requested range, ordered by date ascending. Missing metrics are returned as zero and missing button details as an empty array. |  |



## Enum: AnalyticsStatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;ENABLED&quot; |
| NOT_ENABLED | &quot;NOT_ENABLED&quot; |
| UNSUPPORTED_REGION | &quot;UNSUPPORTED_REGION&quot; |
| PERMISSION_DENIED | &quot;PERMISSION_DENIED&quot; |
| NO_DATA | &quot;NO_DATA&quot; |
| ERROR | &quot;ERROR&quot; |
