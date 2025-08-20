# WhatsappCallingApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accept**](WhatsappCallingApi.md#accept) | **POST** /whatsapp/calls/accept | Accept a call |
| [**connect**](WhatsappCallingApi.md#connect) | **POST** /whatsapp/calls/connect | Connect a call |
| [**preAccept**](WhatsappCallingApi.md#preAccept) | **POST** /whatsapp/calls/preAccept | Pre-accept a call |
| [**reject**](WhatsappCallingApi.md#reject) | **POST** /whatsapp/calls/reject | Reject a call |
| [**terminate**](WhatsappCallingApi.md#terminate) | **POST** /whatsapp/calls/terminate | Terminate a call |


<a name="accept"></a>
# **accept**
> WhatsappCallingResponse accept(whatsappCallingPreAcceptRequest)

Accept a call

Accepts an inbound WhatsApp call.  Once the WebRTC connection is made, this endpoint is used to accept the call. Media will begin flowing immediately since the connection was established prior to call connect.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappCallingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappCallingApi apiInstance = new WhatsappCallingApi(defaultClient);
    WhatsappCallingPreAcceptRequest whatsappCallingPreAcceptRequest = new WhatsappCallingPreAcceptRequest(); // WhatsappCallingPreAcceptRequest | 
    try {
      WhatsappCallingResponse result = apiInstance.accept(whatsappCallingPreAcceptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappCallingApi#accept");
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
| **whatsappCallingPreAcceptRequest** | [**WhatsappCallingPreAcceptRequest**](WhatsappCallingPreAcceptRequest.md)|  | |

### Return type

[**WhatsappCallingResponse**](WhatsappCallingResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The call accept request is successfully processed. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="connect"></a>
# **connect**
> WhatsappCallingResponse connect(whatsappCallingConnectRequest)

Connect a call

Initiates a WhatsApp call connection.  Establishes the initial connection for a WhatsApp call by providing SDP offer information. This endpoint is used for business-initiated calling scenarios.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappCallingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappCallingApi apiInstance = new WhatsappCallingApi(defaultClient);
    WhatsappCallingConnectRequest whatsappCallingConnectRequest = new WhatsappCallingConnectRequest(); // WhatsappCallingConnectRequest | 
    try {
      WhatsappCallingResponse result = apiInstance.connect(whatsappCallingConnectRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappCallingApi#connect");
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
| **whatsappCallingConnectRequest** | [**WhatsappCallingConnectRequest**](WhatsappCallingConnectRequest.md)|  | |

### Return type

[**WhatsappCallingResponse**](WhatsappCallingResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The call connection request is successfully accepted. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="preAccept"></a>
# **preAccept**
> WhatsappCallingResponse preAccept(whatsappCallingPreAcceptRequest)

Pre-accept a call

Pre-accepts an inbound WhatsApp call.  Pre-accepting calls allows the calling media connection to be established before attempting to send call media through the connection. This facilitates faster connection times and avoids audio clipping issues.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappCallingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappCallingApi apiInstance = new WhatsappCallingApi(defaultClient);
    WhatsappCallingPreAcceptRequest whatsappCallingPreAcceptRequest = new WhatsappCallingPreAcceptRequest(); // WhatsappCallingPreAcceptRequest | 
    try {
      WhatsappCallingResponse result = apiInstance.preAccept(whatsappCallingPreAcceptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappCallingApi#preAccept");
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
| **whatsappCallingPreAcceptRequest** | [**WhatsappCallingPreAcceptRequest**](WhatsappCallingPreAcceptRequest.md)|  | |

### Return type

[**WhatsappCallingResponse**](WhatsappCallingResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The call pre-accept request is successfully processed. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="reject"></a>
# **reject**
> WhatsappCallingResponse reject(whatsappCallingTerminateRequest)

Reject a call

Rejects an inbound WhatsApp call.  This endpoint is used to reject an incoming call from a WhatsApp user. The call will be terminated on the WhatsApp user side with appropriate notification.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappCallingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappCallingApi apiInstance = new WhatsappCallingApi(defaultClient);
    WhatsappCallingTerminateRequest whatsappCallingTerminateRequest = new WhatsappCallingTerminateRequest(); // WhatsappCallingTerminateRequest | 
    try {
      WhatsappCallingResponse result = apiInstance.reject(whatsappCallingTerminateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappCallingApi#reject");
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
| **whatsappCallingTerminateRequest** | [**WhatsappCallingTerminateRequest**](WhatsappCallingTerminateRequest.md)|  | |

### Return type

[**WhatsappCallingResponse**](WhatsappCallingResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The call rejection request is successfully processed. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="terminate"></a>
# **terminate**
> WhatsappCallingResponse terminate(whatsappCallingTerminateRequest)

Terminate a call

Terminates an active WhatsApp call.  Both the business or the WhatsApp user can terminate the call at any time. This endpoint is used by the business to end the call.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappCallingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappCallingApi apiInstance = new WhatsappCallingApi(defaultClient);
    WhatsappCallingTerminateRequest whatsappCallingTerminateRequest = new WhatsappCallingTerminateRequest(); // WhatsappCallingTerminateRequest | 
    try {
      WhatsappCallingResponse result = apiInstance.terminate(whatsappCallingTerminateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappCallingApi#terminate");
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
| **whatsappCallingTerminateRequest** | [**WhatsappCallingTerminateRequest**](WhatsappCallingTerminateRequest.md)|  | |

### Return type

[**WhatsappCallingResponse**](WhatsappCallingResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The call termination request is successfully processed. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |
| **404** | The requested resource does not exist. |  -  |

