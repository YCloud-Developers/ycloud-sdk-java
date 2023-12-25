# UnsubscribersApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](UnsubscribersApi.md#create) | **POST** /unsubscribers | Create an unsubscriber |
| [**deleteByCustomerAndChannel**](UnsubscribersApi.md#deleteByCustomerAndChannel) | **DELETE** /unsubscribers/{customer}/{channel} | Delete an unsubscriber |
| [**list**](UnsubscribersApi.md#list) | **GET** /unsubscribers | List unsubscribers |
| [**listAllByCustomer**](UnsubscribersApi.md#listAllByCustomer) | **GET** /unsubscribers/{customer} | List all unsubscribers by customer |
| [**retrieveByCustomerAndChannel**](UnsubscribersApi.md#retrieveByCustomerAndChannel) | **GET** /unsubscribers/{customer}/{channel} | Retrieve an unsubscriber |


<a name="create"></a>
# **create**
> Unsubscriber create(unsubscriberCreateRequest)

Create an unsubscriber

Creates an unsubscriber. An unsubscriber is a configuration item representing that customers opt out of receiving messages from your business. **A customer and a channel form a unique identifier for an unsubscriber.**

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.UnsubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    UnsubscribersApi apiInstance = new UnsubscribersApi(defaultClient);
    UnsubscriberCreateRequest unsubscriberCreateRequest = new UnsubscriberCreateRequest(); // UnsubscriberCreateRequest | 
    try {
      Unsubscriber result = apiInstance.create(unsubscriberCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnsubscribersApi#create");
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
| **unsubscriberCreateRequest** | [**UnsubscriberCreateRequest**](UnsubscriberCreateRequest.md)|  | |

### Return type

[**Unsubscriber**](Unsubscriber.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created an unsubscriber. |  -  |

<a name="deleteByCustomerAndChannel"></a>
# **deleteByCustomerAndChannel**
> Unsubscriber deleteByCustomerAndChannel(customer, channel)

Delete an unsubscriber

Deletes the unsubscriber for the specified customer and channel.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.UnsubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    UnsubscribersApi apiInstance = new UnsubscribersApi(defaultClient);
    String customer = "+447901614024"; // String | The customer who has opted out.
    UnsubscriberChannel channel = UnsubscriberChannel.fromValue("whatsapp"); // UnsubscriberChannel | 
    try {
      Unsubscriber result = apiInstance.deleteByCustomerAndChannel(customer, channel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnsubscribersApi#deleteByCustomerAndChannel");
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
| **customer** | **String**| The customer who has opted out. | |
| **channel** | [**UnsubscriberChannel**](.md)|  | [enum: whatsapp] |

### Return type

[**Unsubscriber**](Unsubscriber.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the unsubscriber. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="list"></a>
# **list**
> UnsubscriberPage list().page(page).limit(limit).includeTotal(includeTotal).pageAfter(pageAfter).filterCustomer(filterCustomer).filterChannel(filterChannel).filterRegionCode(filterRegionCode).execute();

List unsubscribers

Returns a paginated list of unsubscribers.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.UnsubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    UnsubscribersApi apiInstance = new UnsubscribersApi(defaultClient);
    Integer page = 1; // Integer | Page number of the results to be returned, 1-based.
    Integer limit = 10; // Integer | A limit on the number of results to be returned, or number of results per page, between 1 and 100, defaults to 10.
    Boolean includeTotal = false; // Boolean | Return results inside an object that contains the total result count or not.
    String pageAfter = "id:foo"; // String | A cursor to fetch the next page in cursor pagination. For example, if you make a list request, receive 100 objects and `cursor.after=id:foo`, your subsequent call can include `pageAfter=id:foo` in order to fetch the next page of the list.
    String filterCustomer = "+447901614024"; // String | 
    UnsubscriberChannel filterChannel = UnsubscriberChannel.fromValue("whatsapp"); // UnsubscriberChannel | 
    String filterRegionCode = "filterRegionCode_example"; // String | 
    try {
      UnsubscriberPage result = apiInstance.list()
            .page(page)
            .limit(limit)
            .includeTotal(includeTotal)
            .pageAfter(pageAfter)
            .filterCustomer(filterCustomer)
            .filterChannel(filterChannel)
            .filterRegionCode(filterRegionCode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnsubscribersApi#list");
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
| **pageAfter** | **String**| A cursor to fetch the next page in cursor pagination. For example, if you make a list request, receive 100 objects and &#x60;cursor.after&#x3D;id:foo&#x60;, your subsequent call can include &#x60;pageAfter&#x3D;id:foo&#x60; in order to fetch the next page of the list. | [optional] |
| **filterCustomer** | **String**|  | [optional] |
| **filterChannel** | [**UnsubscriberChannel**](.md)|  | [optional] [enum: whatsapp] |
| **filterRegionCode** | **String**|  | [optional] |

### Return type

[**UnsubscriberPage**](UnsubscriberPage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved a paginated list of objects. |  -  |

<a name="listAllByCustomer"></a>
# **listAllByCustomer**
> List&lt;Unsubscriber&gt; listAllByCustomer(customer)

List all unsubscribers by customer

Returns all unsubscribers for the specified customer.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.UnsubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    UnsubscribersApi apiInstance = new UnsubscribersApi(defaultClient);
    String customer = "+447901614024"; // String | The customer who has opted out.
    try {
      List<Unsubscriber> result = apiInstance.listAllByCustomer(customer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnsubscribersApi#listAllByCustomer");
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
| **customer** | **String**| The customer who has opted out. | |

### Return type

[**List&lt;Unsubscriber&gt;**](Unsubscriber.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the unsubscribers. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="retrieveByCustomerAndChannel"></a>
# **retrieveByCustomerAndChannel**
> Unsubscriber retrieveByCustomerAndChannel(customer, channel)

Retrieve an unsubscriber

Retrieves the unsubscriber for the specified customer and channel.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.UnsubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    UnsubscribersApi apiInstance = new UnsubscribersApi(defaultClient);
    String customer = "+447901614024"; // String | The customer who has opted out.
    UnsubscriberChannel channel = UnsubscriberChannel.fromValue("whatsapp"); // UnsubscriberChannel | 
    try {
      Unsubscriber result = apiInstance.retrieveByCustomerAndChannel(customer, channel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnsubscribersApi#retrieveByCustomerAndChannel");
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
| **customer** | **String**| The customer who has opted out. | |
| **channel** | [**UnsubscriberChannel**](.md)|  | [enum: whatsapp] |

### Return type

[**Unsubscriber**](Unsubscriber.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the unsubscribers. |  -  |
| **404** | The requested resource does not exist. |  -  |

