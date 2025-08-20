# WhatsappFlowsApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](WhatsappFlowsApi.md#create) | **POST** /whatsapp/flows | Create a flow |
| [**delete**](WhatsappFlowsApi.md#delete) | **DELETE** /whatsapp/flows/{flowId} | Delete a flow |
| [**deprecate**](WhatsappFlowsApi.md#deprecate) | **POST** /whatsapp/flows/{flowId}/deprecate | Deprecate a flow |
| [**list**](WhatsappFlowsApi.md#list) | **GET** /whatsapp/flows | List flows |
| [**preview**](WhatsappFlowsApi.md#preview) | **GET** /whatsapp/flows/{flowId}/preview | generate a web preview URL with this flow. |
| [**publish**](WhatsappFlowsApi.md#publish) | **POST** /whatsapp/flows/{flowId}/publish | Publish a flow |
| [**retrieve**](WhatsappFlowsApi.md#retrieve) | **GET** /whatsapp/flows/{flowId} | Retrieve a flow |
| [**updateMetadata**](WhatsappFlowsApi.md#updateMetadata) | **PATCH** /whatsapp/flows/{flowId}/metadata | Update flow metadata |
| [**updateStructure**](WhatsappFlowsApi.md#updateStructure) | **PATCH** /whatsapp/flows/{flowId}/assets | Update flow structure |


<a name="create"></a>
# **create**
> WhatsappFlowCreate200Response create(whatsappFlowCreateRequest)

Create a flow

Creates a new WhatsApp Flow. New Flows are by default created in DRAFT state. You can create a new published Flow in single request by specifying flowJson and publish parameters.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappFlowsApi apiInstance = new WhatsappFlowsApi(defaultClient);
    WhatsappFlowCreateRequest whatsappFlowCreateRequest = new WhatsappFlowCreateRequest(); // WhatsappFlowCreateRequest | 
    try {
      WhatsappFlowCreate200Response result = apiInstance.create(whatsappFlowCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappFlowsApi#create");
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
| **whatsappFlowCreateRequest** | [**WhatsappFlowCreateRequest**](WhatsappFlowCreateRequest.md)|  | |

### Return type

[**WhatsappFlowCreate200Response**](WhatsappFlowCreate200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a flow. |  -  |
| **400** | Bad request. The Flow may be invalid. |  -  |

<a name="delete"></a>
# **delete**
> WhatsappFlowUpdateMetadata200Response delete(flowId)

Delete a flow

Deletes a WhatsApp Flow. Only Flows in DRAFT status can be deleted.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappFlowsApi apiInstance = new WhatsappFlowsApi(defaultClient);
    String flowId = "flow-1"; // String | Flow ID.
    try {
      WhatsappFlowUpdateMetadata200Response result = apiInstance.delete(flowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappFlowsApi#delete");
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
| **flowId** | **String**| Flow ID. | |

### Return type

[**WhatsappFlowUpdateMetadata200Response**](WhatsappFlowUpdateMetadata200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the flow. |  -  |

<a name="deprecate"></a>
# **deprecate**
> WhatsappFlowUpdateMetadata200Response deprecate(flowId)

Deprecate a flow

Marks a published Flow as deprecated. Once a Flow is published, it cannot be modified or deleted, but can be marked as deprecated.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappFlowsApi apiInstance = new WhatsappFlowsApi(defaultClient);
    String flowId = "flow-1"; // String | Flow ID.
    try {
      WhatsappFlowUpdateMetadata200Response result = apiInstance.deprecate(flowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappFlowsApi#deprecate");
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
| **flowId** | **String**| Flow ID. | |

### Return type

[**WhatsappFlowUpdateMetadata200Response**](WhatsappFlowUpdateMetadata200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deprecated the flow. |  -  |

<a name="list"></a>
# **list**
> WhatsappFlowList200Response list(wabaId)

List flows

Returns a list of WhatsApp Flows under a WhatsApp Business Account (WABA).

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappFlowsApi apiInstance = new WhatsappFlowsApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    try {
      WhatsappFlowList200Response result = apiInstance.list(wabaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappFlowsApi#list");
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

[**WhatsappFlowList200Response**](WhatsappFlowList200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of flows. |  -  |

<a name="preview"></a>
# **preview**
> WhatsappFlowPreviewUrl preview(flowId, invalidate)

generate a web preview URL with this flow.

In order to visualize the Flows created, you can generate a web preview URL with this request. **The preview URL is public and can be shared with different stakeholders to visualize the Flow.**.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappFlowsApi apiInstance = new WhatsappFlowsApi(defaultClient);
    String flowId = "flow-1"; // String | Flow ID.
    Boolean invalidate = false; // Boolean | the link will expire in 30 days in default, or if you set with invalidate=true which will generate a new link.
    try {
      WhatsappFlowPreviewUrl result = apiInstance.preview(flowId, invalidate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappFlowsApi#preview");
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
| **flowId** | **String**| Flow ID. | |
| **invalidate** | **Boolean**| the link will expire in 30 days in default, or if you set with invalidate&#x3D;true which will generate a new link. | [optional] |

### Return type

[**WhatsappFlowPreviewUrl**](WhatsappFlowPreviewUrl.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully generate the flow preview url. |  -  |

<a name="publish"></a>
# **publish**
> WhatsappFlowUpdateMetadata200Response publish(flowId)

Publish a flow

Updates the status of the Flow to \&quot;PUBLISHED\&quot;. You can either edit this flow in the future and turn it back to the \&quot;DRAFT\&quot; state, or create a new flow by specifying the existing Flow ID as the cloneFlowId parameter.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappFlowsApi apiInstance = new WhatsappFlowsApi(defaultClient);
    String flowId = "flow-1"; // String | Flow ID.
    try {
      WhatsappFlowUpdateMetadata200Response result = apiInstance.publish(flowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappFlowsApi#publish");
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
| **flowId** | **String**| Flow ID. | |

### Return type

[**WhatsappFlowUpdateMetadata200Response**](WhatsappFlowUpdateMetadata200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully published the flow. |  -  |

<a name="retrieve"></a>
# **retrieve**
> WhatsappFlow retrieve(flowId)

Retrieve a flow

Retrieves a WhatsApp Flow&#39;s details.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappFlowsApi apiInstance = new WhatsappFlowsApi(defaultClient);
    String flowId = "flow-1"; // String | Flow ID.
    try {
      WhatsappFlow result = apiInstance.retrieve(flowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappFlowsApi#retrieve");
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
| **flowId** | **String**| Flow ID. | |

### Return type

[**WhatsappFlow**](WhatsappFlow.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the flow. |  -  |

<a name="updateMetadata"></a>
# **updateMetadata**
> WhatsappFlowUpdateMetadata200Response updateMetadata(flowId, whatsappFlowUpdateMetadataRequest)

Update flow metadata

Updates a WhatsApp Flow&#39;s metadata (name or categories).

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappFlowsApi apiInstance = new WhatsappFlowsApi(defaultClient);
    String flowId = "flow-1"; // String | Flow ID.
    WhatsappFlowUpdateMetadataRequest whatsappFlowUpdateMetadataRequest = new WhatsappFlowUpdateMetadataRequest(); // WhatsappFlowUpdateMetadataRequest | 
    try {
      WhatsappFlowUpdateMetadata200Response result = apiInstance.updateMetadata(flowId, whatsappFlowUpdateMetadataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappFlowsApi#updateMetadata");
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
| **flowId** | **String**| Flow ID. | |
| **whatsappFlowUpdateMetadataRequest** | [**WhatsappFlowUpdateMetadataRequest**](WhatsappFlowUpdateMetadataRequest.md)|  | |

### Return type

[**WhatsappFlowUpdateMetadata200Response**](WhatsappFlowUpdateMetadata200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the flow metadata. |  -  |

<a name="updateStructure"></a>
# **updateStructure**
> WhatsappFlowUpdateMetadata200Response updateStructure(flowId, flowJson)

Update flow structure

Updates a WhatsApp Flow&#39;s structure. Note that the file must be attached as form-data.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappFlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappFlowsApi apiInstance = new WhatsappFlowsApi(defaultClient);
    String flowId = "flow-1"; // String | Flow ID.
    File flowJson = new File("/path/to/file"); // File | JSON file containing the Flow structure.
    try {
      WhatsappFlowUpdateMetadata200Response result = apiInstance.updateStructure(flowId, flowJson);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappFlowsApi#updateStructure");
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
| **flowId** | **String**| Flow ID. | |
| **flowJson** | **File**| JSON file containing the Flow structure. | |

### Return type

[**WhatsappFlowUpdateMetadata200Response**](WhatsappFlowUpdateMetadata200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the flow structure. |  -  |
| **400** | Bad request. The Flow structure may be invalid. |  -  |

