

# ContactAttributeChange

Represents a single attribute change, containing the old value, new value, and change actions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**oldValue** | **Object** | The previous value of the attribute before the change. Can be a string, number, array, or boolean depending on the attribute type. This field is not included when the value is null. |  [optional] |
|**newValue** | **Object** | The new value of the attribute after the change. Can be a string, number, array, or boolean depending on the attribute type. This field is not included when the value is null. |  [optional] |
|**extra** | [**List&lt;AttributeChangeAction&gt;**](AttributeChangeAction.md) | An array of change actions that describe what operations were performed on this attribute. |  [optional] |



