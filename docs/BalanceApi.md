# BalanceApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**retrieve**](BalanceApi.md#retrieve) | **GET** /balance | Retrieve balance |


<a name="retrieve"></a>
# **retrieve**
> Balance retrieve()

Retrieve balance

Retrieves the current account balance.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.BalanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    BalanceApi apiInstance = new BalanceApi(defaultClient);
    try {
      Balance result = apiInstance.retrieve();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceApi#retrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Balance**](Balance.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved balance. |  -  |

