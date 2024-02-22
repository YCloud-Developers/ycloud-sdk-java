# WhatsappInboundMessagesApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**markAsRead**](WhatsappInboundMessagesApi.md#markAsRead) | **POST** /whatsapp/inboundMessages/{id}/markAsRead | Mark message as read |


<a name="markAsRead"></a>
# **markAsRead**
> markAsRead(id)

Mark message as read

When you receive an inbound message from webhooks, you can use this endpoint to mark the message as read. Messages marked as read display two blue check marks alongside their timestamp.  Marking a message as read will also mark earlier messages in the conversation as read.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappInboundMessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappInboundMessagesApi apiInstance = new WhatsappInboundMessagesApi(defaultClient);
    String id = "627c8640675de8fc689ab9d9"; // String | ID of the message.  A wamid (i.e., the original message ID on WhatsApp's platform) is also acceptable.
    try {
      apiInstance.markAsRead(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappInboundMessagesApi#markAsRead");
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
| **id** | **String**| ID of the message.  A wamid (i.e., the original message ID on WhatsApp&#39;s platform) is also acceptable. | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully marked the message as read. |  -  |
| **404** | The requested resource does not exist. |  -  |

