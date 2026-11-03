

# PublicUpdateWebsiteRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** |  |  |
|**includedSubDomains** | **List&lt;String&gt;** | Subdomains to include in the website crawl. Omit this field to leave it unspecified. Send &#x60;[]&#x60; to clear it. |  [optional] |
|**includedUrlPatterns** | **List&lt;String&gt;** | URL patterns to include in the website crawl. Omit this field to leave it unspecified. Send &#x60;[]&#x60; to clear it. |  [optional] |
|**excludedSubDomains** | **List&lt;String&gt;** | Subdomains to exclude from the website crawl. Omit this field to leave it unspecified. Send &#x60;[]&#x60; to clear it. |  [optional] |
|**excludedUrlPatterns** | **List&lt;String&gt;** | URL patterns to exclude from the website crawl. Omit this field to leave it unspecified. Send &#x60;[]&#x60; to clear it. |  [optional] |
|**singleUrls** | **List&lt;String&gt;** | Individual URLs to include in the website source. Omit this field to leave it unspecified. Send &#x60;[]&#x60; to clear it. |  [optional] |
