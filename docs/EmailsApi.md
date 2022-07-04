# EmailsApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**send**](EmailsApi.md#send) | **POST** /emails | Send an email |


<a name="send"></a>
# **send**
> Email send(emailSendRequest)

Send an email

Sends an outbound email message.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.EmailsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    EmailsApi apiInstance = new EmailsApi(defaultClient);
    EmailSendRequest emailSendRequest = new EmailSendRequest(); // EmailSendRequest | 
    try {
      Email result = apiInstance.send(emailSendRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#send");
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
| **emailSendRequest** | [**EmailSendRequest**](EmailSendRequest.md)|  | |

### Return type

[**Email**](Email.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successfully accepted. |  -  |

