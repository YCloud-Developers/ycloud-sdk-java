

# CustomEventDefinitionPropertyCreateRequest

Contains the properties of the custom event property definition to be created.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The unique name of the custom property. |  |
|**label** | **String** | The label of the property. |  |
|**description** | **String** | The description of the property. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the property. - &#x60;STRING&#x60;: Indicates a property that receives plain text strings. - &#x60;NUMBER&#x60;: Indicates a property that receives numeric values with up to one decimal. - &#x60;TIMESTAMP&#x60;: Indicates a property that receives epoch millisecond. - &#x60;URL&#x60;: Indicates a property that receives URLs, formatted as strings starting with &#x60;http://&#x60; or &#x60;https://&#x60;. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;STRING&quot; |
| NUMBER | &quot;NUMBER&quot; |
| TIMESTAMP | &quot;TIMESTAMP&quot; |
| URL | &quot;URL&quot; |



