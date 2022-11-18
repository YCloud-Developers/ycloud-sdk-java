

# Error


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **Integer** | HTTP status code, [RFC 7231, Section 6](https://datatracker.ietf.org/doc/html/rfc7231#section-6). It conveys the HTTP status code used for the convenience of the consumer. |  |
|**code** | **String** | One of a server-defined error codes. Some &#x60;4xx&#x60; errors that could be handled programmatically include an error code that briefly explains the error reported. |  |
|**message** | **String** | A human-readable representation of the error. It is intended as an aid to developers and is not suitable for exposure to end users. |  [optional] |
|**target** | **String** | The target of the error. |  [optional] |
|**docUrl** | **String** | A URL to more information about the error. |  [optional] |



