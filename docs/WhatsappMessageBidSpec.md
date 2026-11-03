

# WhatsappMessageBidSpec

Per-message bid adjustment for a Max Price marketing template sent through Marketing Messages Lite. Effective Max Price = template maxBid x recipient-country multiplier x this message multiplier. Omit the entire bidSpec object to use a message multiplier of 1; an empty object is invalid. Supported by synchronous sending and asynchronous enqueueing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**perMessageBidMultiplier** | **String** | Supplemental bid multiplier for this message, greater than 0 and at most 999.999, with at most 3 decimal places. Values above 1 raise the ceiling; values below 1 lower it. Required whenever the message bidSpec object is provided. |  |
