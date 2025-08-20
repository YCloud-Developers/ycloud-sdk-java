

# AttributeChangeAction

Represents a single change action performed on an attribute. For tag attributes, includes additional id and value fields.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | The type of change action performed. |  |
|**id** | **String** | The ID of the item when the attribute is &#39;tags&#39;.  This field is only present for tag-related changes. |  [optional] |
|**value** | **String** | The value of the item when the attribute is &#39;tags&#39;.  This field is only present for tag-related changes. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ADDED | &quot;ADDED&quot; |
| REMOVED | &quot;REMOVED&quot; |
| CHANGED | &quot;CHANGED&quot; |



