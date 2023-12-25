

# PageCursor

A cursor object is returned only if the endpoint you requested supports cursor pagination.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**after** | **String** | A cursor to fetch the next page in cursor pagination. For example, if you make a list request, receive 100 objects and &#x60;cursor.after&#x3D;id:foo&#x60;, your subsequent call can include &#x60;pageAfter&#x3D;id:foo&#x60; in order to fetch the next page of the list. This field is returned only if there are more items in the list. |  [optional] |



