

# WhatsappMessageOrderItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**retailerId** | **String** | Content ID for an item in the order from your catalog. |  [optional] |
|**name** | **String** | The item&#39;s name to be displayed to the user. Cannot exceed 60 characters. |  |
|**image** | [**WhatsappMessageMedia**](WhatsappMessageMedia.md) |  |  [optional] |
|**amount** | [**WhatsappMessageOrderAmount**](WhatsappMessageOrderAmount.md) |  |  |
|**saleAmount** | [**WhatsappMessageOrderAmount**](WhatsappMessageOrderAmount.md) |  |  [optional] |
|**quantity** | **Integer** | The number of items in the order. |  |
|**countryOfOrigin** | **String** | Required if &#x60;catalog_id&#x60; is not present. The country of origin of the product. |  [optional] |
|**importerName** | **String** | Required if &#x60;catalog_id&#x60; is not present. Name of the importer company. |  [optional] |
|**importerAddress** | **String** | Required if &#x60;catalog_id&#x60; is not present. Address of importer company. |  [optional] |



