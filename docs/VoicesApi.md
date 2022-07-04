# VoicesApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](VoicesApi.md#list) | **GET** /voices | List voice records |
| [**send**](VoicesApi.md#send) | **POST** /voices | Send a voice code |


<a name="list"></a>
# **list**
> VoicePage list().page(page).limit(limit).includeTotal(includeTotal).filterCreateTimeGte(filterCreateTimeGte).filterCreateTimeLte(filterCreateTimeLte).filterId(filterId).execute();

List voice records

Returns a paginated list of voice calls you&#39;ve previously sent.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.VoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VoicesApi apiInstance = new VoicesApi(defaultClient);
    Integer page = 1; // Integer | Page number of the results to be returned, 1-based.
    Integer limit = 10; // Integer | A limit on the number of results to be returned, or number of results per page, between 1 and 100, defaults to 10.
    Boolean includeTotal = false; // Boolean | Return results inside an object that contains the total result count or not.
    Date filterCreateTimeGte = new Date(); // Date | Return results where the `createTime` field is greater than or equal to this value. Default: One day ago from now.
    Date filterCreateTimeLte = new Date(); // Date | Return results where the `createTime` field is less than or equal to this value.
    String filterId = "filterId_example"; // String | Unique object ID on our side. Other filter parameters will be ignored if this parameter is present.
    try {
      VoicePage result = apiInstance.list()
            .page(page)
            .limit(limit)
            .includeTotal(includeTotal)
            .filterCreateTimeGte(filterCreateTimeGte)
            .filterCreateTimeLte(filterCreateTimeLte)
            .filterId(filterId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#list");
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
| **filterCreateTimeGte** | **Date**| Return results where the &#x60;createTime&#x60; field is greater than or equal to this value. Default: One day ago from now. | [optional] |
| **filterCreateTimeLte** | **Date**| Return results where the &#x60;createTime&#x60; field is less than or equal to this value. | [optional] |
| **filterId** | **String**| Unique object ID on our side. Other filter parameters will be ignored if this parameter is present. | [optional] |

### Return type

[**VoicePage**](VoicePage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved a paginated list of objects. |  -  |

<a name="send"></a>
# **send**
> Voice send(voiceSendRequest)

Send a voice code

Sends an outbound voice call verification code.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.VoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VoicesApi apiInstance = new VoicesApi(defaultClient);
    VoiceSendRequest voiceSendRequest = new VoiceSendRequest(); // VoiceSendRequest | Voice call request that needs to be sent.
    try {
      Voice result = apiInstance.send(voiceSendRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#send");
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
| **voiceSendRequest** | [**VoiceSendRequest**](VoiceSendRequest.md)| Voice call request that needs to be sent. | |

### Return type

[**Voice**](Voice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successfully accepted. |  -  |

