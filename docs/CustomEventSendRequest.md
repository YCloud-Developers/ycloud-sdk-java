

# CustomEventSendRequest

Contains the properties of the custom event data to be sent. For events defined with `objectType` as `CONTACT`, provide one of `objectId`, `contactPhoneNumber`, or `contactUsername` to identify the contact. Only one identifier is used per event. If multiple identifiers are provided, a numeric `objectId` takes precedence, followed by a non-blank `contactPhoneNumber`, then `contactUsername`. Contact identifier requirements and precedence are validated by the server.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventName** | **String** | Name of the event. One of the custom event names you previously defined. |  |
|**occurTime** | **Date** | The time at which the event occurred, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;, if not provided, the current time will be used. |  [optional] |
|**objectId** | **String** | ID of the object that the event is associated with. For events defined with &#x60;objectType&#x60; as &#x60;CONTACT&#x60;, provide the numeric ID of an existing contact in your account. A numeric &#x60;objectId&#x60; takes precedence over &#x60;contactPhoneNumber&#x60; and &#x60;contactUsername&#x60;. If that contact is not found, the request fails without trying another identifier. |  [optional] |
|**contactPhoneNumber** | **String** | The contact&#39;s phone number in E.164 format for events defined with &#x60;objectType&#x60; as &#x60;CONTACT&#x60;. Used when no numeric &#x60;objectId&#x60; is provided. Looks up a contact in your account by phone number and creates one if no match exists. Takes precedence over &#x60;contactUsername&#x60;. |  [optional] |
|**contactUsername** | **String** | The Meta username of an existing contact in your account for events defined with &#x60;objectType&#x60; as &#x60;CONTACT&#x60;. Provide the username saved on the contact, without the leading &#x60;@&#x60;. Used when neither a numeric &#x60;objectId&#x60; nor a non-blank &#x60;contactPhoneNumber&#x60; is provided. If no matching contact exists, the request fails. A username does not automatically create a contact. |  [optional] |
|**properties** | **Map&lt;String, Object&gt;** | The properties of the custom event. |  [optional] |
