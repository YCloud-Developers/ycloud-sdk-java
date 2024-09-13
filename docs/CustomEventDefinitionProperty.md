

# CustomEventDefinitionProperty

Represents a custom property of a custom event definition.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the custom property. |  [optional] |
|**label** | **String** | The label of the property, used for display purposes. |  [optional] |
|**description** | **String** | The description of the property. |  [optional] |
|**createTime** | **Date** | The time at which this object is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The data type of the property. - &#x60;STRING&#x60;: Indicates a property that receives plain text strings. - &#x60;NUMBER&#x60;: Indicates a property that receives numeric values with up to one decimal. - &#x60;TIMESTAMP&#x60;: Indicates a property that receives epoch millisecond. - &#x60;URL&#x60;: Indicates a property that receives URLs, formatted as strings starting with &#x60;http://&#x60; or &#x60;https://&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;STRING&quot; |
| NUMBER | &quot;NUMBER&quot; |
| TIMESTAMP | &quot;TIMESTAMP&quot; |
| URL | &quot;URL&quot; |



