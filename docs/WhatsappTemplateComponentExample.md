

# WhatsappTemplateComponentExample

**Required** when: - `type` is `HEADER`, and `format` is one of `IMAGE`, `VIDEO`, or `DOCUMENT`. You need to provide a sample media URL in `header_url`. - `type` is `HEADER`, `format` is `TEXT`, and a variable is used in `text`. You need to provide a sample value for that variable in `header_text`. There can be at most 1 variable in `HEADER` text. - `type` is `BODY`, and variables are used in `text`. You need to provide sample values for those variables in `body_text`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bodyText** | **List&lt;List&lt;String&gt;&gt;** | Sample values for variables in &#x60;text&#x60; of a &#x60;BODY&#x60; component. |  [optional] |
|**headerText** | **List&lt;String&gt;** | Sample value for the variable in &#x60;text&#x60; of a &#x60;HEADER&#x60; component. |  [optional] |
|**headerUrl** | **List&lt;String&gt;** | Sample media URL for a &#x60;HEADER&#x60; component whose format is one of &#x60;IMAGE&#x60;, &#x60;VIDEO&#x60;, or &#x60;DOCUMENT&#x60;. Supported types: - For &#x60;IMAGE&#x60;, the URL must end with one of &#x60;.jpg&#x60;, &#x60;.jpeg&#x60;, or &#x60;.png&#x60;, size limit is 5MB. - For &#x60;VIDEO&#x60;, the URL must end with &#x60;.mp4&#x60;, size limit is 16MB. - For &#x60;DOCUMENT&#x60;, the URL must end with &#x60;.pdf&#x60;, size limit is 100MB. |  [optional] |



