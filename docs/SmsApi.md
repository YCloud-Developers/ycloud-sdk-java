# SmsApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](SmsApi.md#list) | **GET** /sms | List SMS records |
| [**send**](SmsApi.md#send) | **POST** /sms | Send an SMS |


<a name="list"></a>
# **list**
> SmsPage list().page(page).limit(limit).includeTotal(includeTotal).filterCreateTimeGte(filterCreateTimeGte).filterCreateTimeLte(filterCreateTimeLte).filterId(filterId).execute();

List SMS records

Returns a paginated list of SMS messages you&#39;ve previously sent.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.SmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SmsApi apiInstance = new SmsApi(defaultClient);
    Integer page = 1; // Integer | Page number of the results to be returned, 1-based.
    Integer limit = 10; // Integer | A limit on the number of results to be returned, or number of results per page, between 1 and 100, defaults to 10.
    Boolean includeTotal = false; // Boolean | Return results inside an object that contains the total result count or not.
    Date filterCreateTimeGte = new Date(); // Date | Return results where the `createTime` field is greater than or equal to this value. Default: One day ago from now.
    Date filterCreateTimeLte = new Date(); // Date | Return results where the `createTime` field is less than or equal to this value.
    String filterId = "filterId_example"; // String | Unique object ID on our side. Other filter parameters will be ignored if this parameter is present.
    try {
      SmsPage result = apiInstance.list()
            .page(page)
            .limit(limit)
            .includeTotal(includeTotal)
            .filterCreateTimeGte(filterCreateTimeGte)
            .filterCreateTimeLte(filterCreateTimeLte)
            .filterId(filterId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsApi#list");
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

[**SmsPage**](SmsPage.md)

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
> Sms send(smsSendRequest)

Send an SMS

Sends an outbound text message.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.SmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SmsApi apiInstance = new SmsApi(defaultClient);
    SmsSendRequest smsSendRequest = new SmsSendRequest(); // SmsSendRequest | SMS request that needs to be sent.
    try {
      Sms result = apiInstance.send(smsSendRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsApi#send");
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
| **smsSendRequest** | [**SmsSendRequest**](SmsSendRequest.md)| SMS request that needs to be sent. | |

### Return type

[**Sms**](Sms.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successfully accepted. |  -  |

