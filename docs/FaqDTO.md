

# FaqDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | FAQ resource ID. |  |
|**question** | **String** | Customer question written in natural language. |  |
|**answer** | **String** | Factual answer the agent should use. |  |
|**createdAt** | **Long** | Meta timestamp. When an update changes the FAQ ID, this resets to the update time. |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | String metadata retained with the FAQ. |  [optional] |
