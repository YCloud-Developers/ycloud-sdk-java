

# WebsiteDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Website resource ID. |  |
|**url** | **String** | Source website URL. |  |
|**crawlStatus** | **String** | Current Meta crawl state. |  [optional] |
|**pagesCrawled** | **Integer** | Number of pages Meta has processed. |  [optional] |
|**lastCrawledAt** | **Long** | Most recent crawl timestamp. |  [optional] |
|**createdAt** | **Long** | Resource creation timestamp. |  [optional] |
|**includedSubDomains** | **List&lt;String&gt;** | Subdomains included in the website crawl, when returned by Meta. |  [optional] |
|**includedUrlPatterns** | **List&lt;String&gt;** | URL patterns included in the website crawl, when returned by Meta. |  [optional] |
|**excludedSubDomains** | **List&lt;String&gt;** | Subdomains excluded from the website crawl, when returned by Meta. |  [optional] |
|**excludedUrlPatterns** | **List&lt;String&gt;** | URL patterns excluded from the website crawl, when returned by Meta. |  [optional] |
|**singleUrls** | **List&lt;String&gt;** | Individual URLs included in the website source, when returned by Meta. |  [optional] |
|**crawlError** | **String** | Optional crawl error reported by Meta; an empty string is preserved. |  [optional] |
