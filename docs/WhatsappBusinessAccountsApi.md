# WhatsappBusinessAccountsApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](WhatsappBusinessAccountsApi.md#list) | **GET** /whatsapp/businessAccounts | List WABAs |
| [**retrieve**](WhatsappBusinessAccountsApi.md#retrieve) | **GET** /whatsapp/businessAccounts/{id} | Retrieve a WABA |


<a name="list"></a>
# **list**
> WhatsappBusinessAccountPage list().filterAccountReviewStatus(filterAccountReviewStatus).execute();

List WABAs

Returns a paginated list of WhatsApp business accounts you&#39;ve registered on YCloud.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappBusinessAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappBusinessAccountsApi apiInstance = new WhatsappBusinessAccountsApi(defaultClient);
    String filterAccountReviewStatus = "APPROVED"; // String | WhatsApp Business Account review status.
    try {
      WhatsappBusinessAccountPage result = apiInstance.list()
            .filterAccountReviewStatus(filterAccountReviewStatus)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappBusinessAccountsApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filterAccountReviewStatus** | **String**| WhatsApp Business Account review status. | [optional] |

### Return type

[**WhatsappBusinessAccountPage**](WhatsappBusinessAccountPage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved a paginated list of objects. |  -  |

<a name="retrieve"></a>
# **retrieve**
> WhatsappBusinessAccount retrieve(id)

Retrieve a WABA

Retrieves a WABA you&#39;ve registered on YCloud.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappBusinessAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappBusinessAccountsApi apiInstance = new WhatsappBusinessAccountsApi(defaultClient);
    String id = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    try {
      WhatsappBusinessAccount result = apiInstance.retrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappBusinessAccountsApi#retrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| WhatsApp Business Account ID. | |

### Return type

[**WhatsappBusinessAccount**](WhatsappBusinessAccount.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the WABA. |  -  |
| **404** | The requested resource does not exist. |  -  |

