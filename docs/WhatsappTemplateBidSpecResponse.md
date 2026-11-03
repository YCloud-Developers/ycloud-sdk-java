

# WhatsappTemplateBidSpecResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxBid** | **String** | Base maximum price per delivered marketing message, in your YCloud billing currency, before country and per-message multipliers. Must be greater than 0, with at most 4 decimal places. This is a price ceiling, not a fixed charge. |  |
|**countryPriceAdjustments** | [**List&lt;WhatsappCountryPriceAdjustment&gt;**](WhatsappCountryPriceAdjustment.md) | Complete list of overrides for up to 50 distinct countries. Unlisted countries use a multiplier of 1. The submitted list replaces the locally stored list; omitting it or sending an empty list does not explicitly clear country overrides already stored by Meta. To remove all bidding settings, edit the template with bidSpec: {}. |  [optional] |
