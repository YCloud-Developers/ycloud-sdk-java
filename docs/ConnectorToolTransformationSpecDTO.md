

# ConnectorToolTransformationSpecDTO

Ordered response transformation. On create, omission or null means no transformation. On update, omission preserves the current transformation, null deletes it, and an object sets it. Responses contain Meta’s returned configuration; absence does not confirm a submitted configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | [**VersionEnum**](#VersionEnum) |  |  |
|**steps** | [**List&lt;ConnectorToolTransformationStepDTO&gt;**](ConnectorToolTransformationStepDTO.md) |  |  |



## Enum: VersionEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
