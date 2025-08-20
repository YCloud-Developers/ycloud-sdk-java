

# ContactAttributesChanged

Represents a contact attributes changed event. Contains information about which contact attributes were modified and their old/new values.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the contact whose attributes were changed. |  |
|**updateTime** | **Date** | The time at which the contact attributes were updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  |
|**changedAttributes** | [**Map&lt;String, ContactAttributeChange&gt;**](ContactAttributeChange.md) | An object containing the changed attributes. Each key represents the name of the changed attribute, and the value contains the old value, new value, and change actions. |  |



