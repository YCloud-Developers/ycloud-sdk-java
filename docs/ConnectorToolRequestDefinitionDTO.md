

# ConnectorToolRequestDefinitionDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**method** | [**MethodEnum**](#MethodEnum) |  |  |
|**path** | **String** |  |  |
|**pathParameters** | [**Map&lt;String, ParameterNodeDTO&gt;**](ParameterNodeDTO.md) |  |  [optional] |
|**queryParameters** | [**Map&lt;String, ParameterNodeDTO&gt;**](ParameterNodeDTO.md) |  |  [optional] |
|**headers** | [**Map&lt;String, ParameterNodeDTO&gt;**](ParameterNodeDTO.md) |  |  [optional] |
|**body** | [**RequestBodyDefinitionDTO**](RequestBodyDefinitionDTO.md) |  |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |
| PUT | &quot;PUT&quot; |
| DELETE | &quot;DELETE&quot; |
| PATCH | &quot;PATCH&quot; |
