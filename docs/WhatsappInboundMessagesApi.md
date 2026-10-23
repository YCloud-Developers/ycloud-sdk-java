# WhatsappInboundMessagesApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**markAsRead**](WhatsappInboundMessagesApi.md#markAsRead) | **POST** /whatsapp/inboundMessages/{id}/markAsRead | Mark message as read |
| [**typing**](WhatsappInboundMessagesApi.md#typing) | **POST** /whatsapp/inboundMessages/{id}/typing | Mark message as read and display a typing indicator with a JSON response |


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

<a name="typing"></a>
# **typing**
> WhatsappInboundMessageTypingResponse typing(id)

Mark message as read and display a typing indicator with a JSON response

Marks an inbound message as read and displays a typing indicator so the WhatsApp user knows you are preparing a response. Messages marked as read display two blue check marks alongside their timestamp. The typing indicator is dismissed once you respond, or after 25 seconds, whichever comes first.  Marking a message as read also marks earlier messages in the conversation as read. Repeating this request sends another typing-indicator request and refreshes the indicator; this endpoint does not provide an idempotency key.  A successful request returns &#x60;WhatsappInboundMessageTypingResponse&#x60;. Errors reuse the standard &#x60;ErrorResponse&#x60;.

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
      WhatsappInboundMessageTypingResponse result = apiInstance.typing(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappInboundMessagesApi#typing");
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

[**WhatsappInboundMessageTypingResponse**](WhatsappInboundMessageTypingResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully marked the message as read and displayed a typing indicator. |  -  |
| **400** | The inbound message cannot be used to send a typing indicator, or the upstream request is invalid. |  -  |
| **401** | Authentication failed because the API key is missing or invalid. |  -  |
| **403** | You do not have access to the inbound message or permission to use this endpoint. |  -  |
| **404** | The requested inbound message does not exist. |  -  |
| **429** | Too many requests were sent in a given amount of time. |  -  |
| **500** | The typing indicator could not be sent because of an internal or upstream error. |  -  |
