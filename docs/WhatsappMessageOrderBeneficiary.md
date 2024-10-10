

# WhatsappMessageOrderBeneficiary

A beneficiary is an intended recipient for shipping the physical goods in the order. Beneficiary information isn't shown to users but is needed for legal and compliance reasons.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the individual or business receiving the physical goods. Cannot exceed 200 characters. |  |
|**addressLine1** | **String** | Shipping address (Door/Tower Number, Street Name etc.). Cannot exceed 100 characters. |  |
|**addressLine2** | **String** | Shipping address (Landmark, Area, etc.). Cannot exceed 100 characters. |  [optional] |
|**city** | **String** | Name of the city. |  |
|**state** | **String** | Name of the state. |  |
|**country** | **String** | Name of the country. Currently the only supported value is &#x60;India&#x60;. |  |
|**postalCode** | **String** | 6-digit zipcode of shipping address. |  |



