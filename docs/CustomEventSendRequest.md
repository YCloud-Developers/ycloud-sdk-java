

# CustomEventSendRequest

Contains the properties of the custom event data to be sent.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventName** | **String** | Name of the event. One of the custom event names you previously defined. |  |
|**occurTime** | **Date** | The time at which the event occurred, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;, if not provided, the current time will be used. |  [optional] |
|**objectId** | **String** | ID of the object that the event is associated with. For events defined with &#x60;objectType&#x60; as &#x60;CONTACT&#x60;, the &#x60;objectId&#x60; should be a &#x60;contact&#x60; ID. Alternatively, you can use the &#x60;contactPhoneNumber&#x60; field to specify the contact. |  [optional] |
|**contactPhoneNumber** | **String** | The phone number of the contact for events defined with &#x60;objectType&#x60; as &#x60;CONTACT&#x60;. |  [optional] |
|**properties** | **Map&lt;String, Object&gt;** | The properties of the custom event. |  [optional] |



