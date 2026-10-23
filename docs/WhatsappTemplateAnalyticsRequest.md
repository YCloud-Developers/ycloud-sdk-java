

# WhatsappTemplateAnalyticsRequest

Specify exactly one template selector: either officialTemplateId alone, or templateName together with language. officialTemplateId cannot be combined with templateName or language.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**wabaId** | **String** |  |  |
|**officialTemplateId** | **String** | Official WhatsApp/Meta template ID exposed by the existing template REST APIs. |  [optional] |
|**templateName** | **String** | Exact template name. Must be provided together with language when officialTemplateId is absent. |  [optional] |
|**language** | **String** | Template language code. Must be provided together with templateName when officialTemplateId is absent. |  [optional] |
|**startDate** | **Date** | Inclusive start date interpreted in the WABA timezone. |  |
|**endDate** | **Date** | Inclusive end date interpreted in the WABA timezone. The inclusive range must not exceed 90 calendar days. |  |
