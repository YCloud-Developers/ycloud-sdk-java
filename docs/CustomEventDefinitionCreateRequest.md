

# CustomEventDefinitionCreateRequest

Contains the properties of the custom event definition to be created.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The unique name of the custom event. |  |
|**label** | **String** | The label of the custom event. |  |
|**description** | **String** | The description of the event. |  [optional] |
|**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) | Type of the object that the event will be associated with. - &#x60;CONTACT&#x60;: Indicates that the object is a &#x60;contact&#x60;. |  |
|**properties** | [**List&lt;CustomEventDefinitionPropertyCreateRequest&gt;**](CustomEventDefinitionPropertyCreateRequest.md) | A list of property definitions for the event. |  [optional] |



## Enum: ObjectTypeEnum

| Name | Value |
|---- | -----|
| CONTACT | &quot;CONTACT&quot; |



