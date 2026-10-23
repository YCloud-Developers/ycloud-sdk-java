

# WhatsappTemplateAnalyticsDataPoint


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **Date** |  |  |
|**sent** | **Long** | Number of messages created on this date for the selected template. |  |
|**delivered** | **Long** | Number of those messages that were delivered. |  |
|**failed** | **Long** | Number of those messages whose status is failed or expired. |  |
|**read** | **Long** | Number of those messages that were read. |  |
|**clicks** | **Long** | Total number of clicks recorded for this template on this date. Interpret zero together with analyticsStatus. |  |
|**uniqueReplies** | **Long** | Number of unique replies recorded for this template on this date. This is mapped from Meta replied and is a Meta Template Insights metric. |  |
|**buttonClicks** | [**List&lt;WhatsappTemplateAnalyticsButtonClick&gt;**](WhatsappTemplateAnalyticsButtonClick.md) | Button click breakdown for this template on this date. Empty when no details are available. |  |
