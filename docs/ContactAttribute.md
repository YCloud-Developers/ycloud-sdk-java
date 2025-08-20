

# ContactAttribute

Represents a contact attribute configuration. Contains information about the attribute's metadata and available values.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the contact attribute. |  |
|**name** | **String** | Display name of the contact attribute. |  |
|**key** | **String** | Key name used to reference this attribute. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Data type of the contact attribute. |  |
|**desc** | **String** | Description of the contact attribute. |  [optional] |
|**values** | **List&lt;String&gt;** | Array of possible values for this attribute. Only present when type is \&quot;ARRAY\&quot;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BOOLEAN | &quot;BOOLEAN&quot; |
| TEXT | &quot;TEXT&quot; |
| TIME | &quot;TIME&quot; |
| ARRAY | &quot;ARRAY&quot; |



