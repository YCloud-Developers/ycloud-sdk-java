# WhatsappMessagesApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**send**](WhatsappMessagesApi.md#send) | **POST** /whatsapp/messages | Send a WhatsApp message |


<a name="send"></a>
# **send**
> WhatsappMessage send(whatsappMessageSendRequest)

Send a WhatsApp message

Sends an outbound WhatsApp message.

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
| **whatsappMessageSendRequest** | [**WhatsappMessageSendRequest**](WhatsappMessageSendRequest.md)|  | [optional] |

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

