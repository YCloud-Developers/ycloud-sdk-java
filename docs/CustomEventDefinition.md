

# CustomEventDefinition

Represents a custom event definition.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the custom event definition. |  [optional] |
|**label** | **String** | The label of the event definition, used for display purposes. |  [optional] |
|**description** | **String** | The description of the event definition. |  [optional] |
|**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) | Type of the object that the event will be associated with. - &#x60;CONTACT&#x60;: Indicates that the object is a &#x60;contact&#x60;. |  [optional] |
|**createTime** | **Date** | The time at which this object is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |
|**properties** | [**List&lt;CustomEventDefinitionProperty&gt;**](CustomEventDefinitionProperty.md) | The list of property definitions for the event definition. |  [optional] |



## Enum: ObjectTypeEnum

| Name | Value |
|---- | -----|
| CONTACT | &quot;CONTACT&quot; |



