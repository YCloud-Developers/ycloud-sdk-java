# WhatsappMessagesApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**retrieve**](WhatsappMessagesApi.md#retrieve) | **GET** /whatsapp/messages/{id} | Retrieve a WhatsApp message |
| [**send**](WhatsappMessagesApi.md#send) | **POST** /whatsapp/messages | Enqueue a WhatsApp message |
| [**sendDirectly**](WhatsappMessagesApi.md#sendDirectly) | **POST** /whatsapp/messages/sendDirectly | Send a WhatsApp message directly |


<a name="retrieve"></a>
# **retrieve**
> WhatsappMessage retrieve(id)

Retrieve a WhatsApp message

Retrieves a WhatsApp message you&#39;ve previously sent.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappMessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappMessagesApi apiInstance = new WhatsappMessagesApi(defaultClient);
    String id = "627c8640675de8fc689ab9d9"; // String | ID of the object.
    try {
      WhatsappMessage result = apiInstance.retrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappMessagesApi#retrieve");
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
| **id** | **String**| ID of the object. | |

### Return type

[**WhatsappMessage**](WhatsappMessage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the object. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="send"></a>
# **send**
> WhatsappMessage send(whatsappMessageSendRequest)

Enqueue a WhatsApp message

Enqueues an outbound WhatsApp message for sending.  Queued messages will be submitted to the WhatsApp Business API asynchronously.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappMessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappMessagesApi apiInstance = new WhatsappMessagesApi(defaultClient);
    WhatsappMessageSendRequest whatsappMessageSendRequest = new WhatsappMessageSendRequest(); // WhatsappMessageSendRequest | 
    try {
      WhatsappMessage result = apiInstance.send(whatsappMessageSendRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappMessagesApi#send");
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
| **whatsappMessageSendRequest** | [**WhatsappMessageSendRequest**](WhatsappMessageSendRequest.md)|  | |

### Return type

[**WhatsappMessage**](WhatsappMessage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successfully accepted. |  -  |

<a name="sendDirectly"></a>
# **sendDirectly**
> WhatsappMessage sendDirectly(whatsappMessageSendRequest)

Send a WhatsApp message directly

Sends an outbound WhatsApp message directly.  The message is submitted to the WhatsApp Business API synchronously. Typically used for sending OTP and instant messages.  The response body field &#x60;error.whatsappApiError&#x60; is included if we tried to request the WhatsApp Business API and got an error response.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappMessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappMessagesApi apiInstance = new WhatsappMessagesApi(defaultClient);
    WhatsappMessageSendRequest whatsappMessageSendRequest = new WhatsappMessageSendRequest(); // WhatsappMessageSendRequest | 
    try {
      WhatsappMessage result = apiInstance.sendDirectly(whatsappMessageSendRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappMessagesApi#sendDirectly");
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
| **whatsappMessageSendRequest** | [**WhatsappMessageSendRequest**](WhatsappMessageSendRequest.md)|  | |

### Return type

[**WhatsappMessage**](WhatsappMessage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successfully accepted. |  -  |

