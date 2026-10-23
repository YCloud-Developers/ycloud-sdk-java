# WhatsappBusinessAccountsApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](WhatsappBusinessAccountsApi.md#list) | **GET** /whatsapp/businessAccounts | List WABAs |
| [**retrieve**](WhatsappBusinessAccountsApi.md#retrieve) | **GET** /whatsapp/businessAccounts/{id} | Retrieve a WABA |
| [**retrieveAutomaticCreativeOptimizations**](WhatsappBusinessAccountsApi.md#retrieveAutomaticCreativeOptimizations) | **GET** /whatsapp/businessAccounts/{wabaId}/automatic-creative-optimizations | Retrieve WABA automatic creative optimizations |
| [**updateAutomaticCreativeOptimizations**](WhatsappBusinessAccountsApi.md#updateAutomaticCreativeOptimizations) | **PATCH** /whatsapp/businessAccounts/{wabaId}/automatic-creative-optimizations | Update WABA automatic creative optimizations |


<a name="list"></a>
# **list**
> WhatsappBusinessAccountPage list().page(page).limit(limit).includeTotal(includeTotal).filterAccountReviewStatus(filterAccountReviewStatus).execute();

List WABAs

Returns a paginated list of WhatsApp business accounts you&#39;ve registered.

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
    Integer page = 1; // Integer | Page number of the results to be returned, 1-based.
    Integer limit = 10; // Integer | A limit on the number of results to be returned, or number of results per page, between 1 and 100, defaults to 10.
    Boolean includeTotal = false; // Boolean | Return results inside an object that contains the total result count or not.
    String filterAccountReviewStatus = "APPROVED"; // String | WhatsApp Business Account review status.
    try {
      WhatsappBusinessAccountPage result = apiInstance.list()
            .page(page)
            .limit(limit)
            .includeTotal(includeTotal)
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
| **page** | **Integer**| Page number of the results to be returned, 1-based. | [optional] [default to 1] |
| **limit** | **Integer**| A limit on the number of results to be returned, or number of results per page, between 1 and 100, defaults to 10. | [optional] [default to 10] |
| **includeTotal** | **Boolean**| Return results inside an object that contains the total result count or not. | [optional] [default to false] |
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

Retrieves a WABA you&#39;ve registered.

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

<a name="retrieveAutomaticCreativeOptimizations"></a>
# **retrieveAutomaticCreativeOptimizations**
> WhatsappAutomaticCreativeOptimizationRetrieveResponse retrieveAutomaticCreativeOptimizations(wabaId)

Retrieve WABA automatic creative optimizations

Retrieves current automatic creative optimization feature enrollment for a WhatsApp Business Account from Meta.  This endpoint does not persist feature enrollment locally. If Meta returns &#x60;degrees_of_freedom_spec.data[0].creative_features_spec[0]&#x60; as an object, its string fields are returned as &#x60;creativeOptimizationFeatures&#x60; without feature-key filtering, status-value validation, or case normalization. If Meta returns success without a valid &#x60;creative_features_spec[0]&#x60; object, &#x60;creativeOptimizationFeatures&#x60; is returned as an empty object.

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
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    try {
      WhatsappAutomaticCreativeOptimizationRetrieveResponse result = apiInstance.retrieveAutomaticCreativeOptimizations(wabaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappBusinessAccountsApi#retrieveAutomaticCreativeOptimizations");
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
| **wabaId** | **String**| WhatsApp Business Account ID. | |

### Return type

[**WhatsappAutomaticCreativeOptimizationRetrieveResponse**](WhatsappAutomaticCreativeOptimizationRetrieveResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved current automatic creative optimization features. |  -  |
| **400** | Meta returned an error for the WABA automatic creative optimization query. |  -  |
| **403** | You have no access to the requested WABA. |  -  |

<a name="updateAutomaticCreativeOptimizations"></a>
# **updateAutomaticCreativeOptimizations**
> WhatsappAutomaticCreativeOptimizationUpdateResponse updateAutomaticCreativeOptimizations(wabaId, whatsappAutomaticCreativeOptimizationUpdateRequest)

Update WABA automatic creative optimizations

Partially updates automatic creative optimization feature enrollment for a WhatsApp Business Account.  Only submitted feature keys are updated. This endpoint does not persist feature enrollment locally and does not check whether the WABA has completed Meta MM Lite / ACO onboarding before forwarding the request to Meta.

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
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    WhatsappAutomaticCreativeOptimizationUpdateRequest whatsappAutomaticCreativeOptimizationUpdateRequest = new WhatsappAutomaticCreativeOptimizationUpdateRequest(); // WhatsappAutomaticCreativeOptimizationUpdateRequest |
    try {
      WhatsappAutomaticCreativeOptimizationUpdateResponse result = apiInstance.updateAutomaticCreativeOptimizations(wabaId, whatsappAutomaticCreativeOptimizationUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappBusinessAccountsApi#updateAutomaticCreativeOptimizations");
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
| **wabaId** | **String**| WhatsApp Business Account ID. | |
| **whatsappAutomaticCreativeOptimizationUpdateRequest** | [**WhatsappAutomaticCreativeOptimizationUpdateRequest**](WhatsappAutomaticCreativeOptimizationUpdateRequest.md)|  | |

### Return type

[**WhatsappAutomaticCreativeOptimizationUpdateResponse**](WhatsappAutomaticCreativeOptimizationUpdateResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated submitted automatic creative optimization features. |  -  |
| **400** | One or more request parameters are invalid, or Meta returned an error for the WABA automatic creative optimization update. |  -  |
| **403** | You have no access to the requested WABA. |  -  |
