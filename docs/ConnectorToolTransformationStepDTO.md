

# ConnectorToolTransformationStepDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kind** | [**KindEnum**](#KindEnum) |  |  |
|**target** | **String** |  |  [optional] |
|**params** | **String** | Kind-specific parameters as a JSON object encoded in a string. A math expression supports at most four nested levels. Parameters are forwarded without evaluation or rewriting. |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| ALLOWLIST | &quot;allowlist&quot; |
| CASE | &quot;case&quot; |
| CATALOG | &quot;catalog&quot; |
| DECORATE_URL | &quot;decorate_url&quot; |
| DEDUPE | &quot;dedupe&quot; |
| DEHYDRATE | &quot;dehydrate&quot; |
| FILTER | &quot;filter&quot; |
| FIRST_NONEMPTY | &quot;first_nonempty&quot; |
| FIRST_NONNULL | &quot;first_nonnull&quot; |
| FIRST_NONZERO | &quot;first_nonzero&quot; |
| FORMAT | &quot;format&quot; |
| HTML_ESCAPE | &quot;html_escape&quot; |
| LOOKUP | &quot;lookup&quot; |
| MATH | &quot;math&quot; |
| PROXY_IMAGE | &quot;proxy_image&quot; |
| RESHAPE | &quot;reshape&quot; |
| SHADOW_ALLOWLIST | &quot;shadow_allowlist&quot; |
| STRING_REPLACE | &quot;string_replace&quot; |
| TRUNCATE | &quot;truncate&quot; |
