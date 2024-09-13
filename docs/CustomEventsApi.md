# CustomEventsApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDefinition**](CustomEventsApi.md#createDefinition) | **POST** /event/definitions | Create an event definition |
| [**createPropertyDefinition**](CustomEventsApi.md#createPropertyDefinition) | **POST** /event/definitions/{name}/properties | Create an event property definition |
| [**propertyDefinition**](CustomEventsApi.md#propertyDefinition) | **DELETE** /event/definitions/{name}/properties/{propertyName} | Delete an event property definition |
| [**propertyDefinition_0**](CustomEventsApi.md#propertyDefinition_0) | **PATCH** /event/definitions/{name}/properties/{propertyName} | Update an event property definition |
| [**retrieveDefinition**](CustomEventsApi.md#retrieveDefinition) | **GET** /event/definitions/{name} | Retrieve an event definition |
| [**sendEvent**](CustomEventsApi.md#sendEvent) | **POST** /event/events | Send an event |
| [**updateDefinition**](CustomEventsApi.md#updateDefinition) | **PATCH** /event/definitions/{name} | Update an event definition |


<a name="createDefinition"></a>
# **createDefinition**
> CustomEventDefinition createDefinition(customEventDefinitionCreateRequest)

Create an event definition

Creates a custom event definition.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.CustomEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    CustomEventsApi apiInstance = new CustomEventsApi(defaultClient);
    CustomEventDefinitionCreateRequest customEventDefinitionCreateRequest = new CustomEventDefinitionCreateRequest(); // CustomEventDefinitionCreateRequest | 
    try {
      CustomEventDefinition result = apiInstance.createDefinition(customEventDefinitionCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEventsApi#createDefinition");
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
| **customEventDefinitionCreateRequest** | [**CustomEventDefinitionCreateRequest**](CustomEventDefinitionCreateRequest.md)|  | |

### Return type

[**CustomEventDefinition**](CustomEventDefinition.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created an event definition. |  -  |

<a name="createPropertyDefinition"></a>
# **createPropertyDefinition**
> CustomEventDefinitionProperty createPropertyDefinition(name, customEventDefinitionPropertyCreateRequest)

Create an event property definition

Defines a new property for the event definition.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.CustomEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    CustomEventsApi apiInstance = new CustomEventsApi(defaultClient);
    String name = "unique_event_name"; // String | Name of the custom event.
    CustomEventDefinitionPropertyCreateRequest customEventDefinitionPropertyCreateRequest = new CustomEventDefinitionPropertyCreateRequest(); // CustomEventDefinitionPropertyCreateRequest | 
    try {
      CustomEventDefinitionProperty result = apiInstance.createPropertyDefinition(name, customEventDefinitionPropertyCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEventsApi#createPropertyDefinition");
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
| **name** | **String**| Name of the custom event. | |
| **customEventDefinitionPropertyCreateRequest** | [**CustomEventDefinitionPropertyCreateRequest**](CustomEventDefinitionPropertyCreateRequest.md)|  | |

### Return type

[**CustomEventDefinitionProperty**](CustomEventDefinitionProperty.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created an event property. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="propertyDefinition"></a>
# **propertyDefinition**
> propertyDefinition(name, propertyName)

Delete an event property definition

Deletes a property of the event definition.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.CustomEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    CustomEventsApi apiInstance = new CustomEventsApi(defaultClient);
    String name = "unique_event_name"; // String | Name of the custom event.
    String propertyName = "unique_property_name"; // String | Name of the custom event property.
    try {
      apiInstance.propertyDefinition(name, propertyName);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEventsApi#propertyDefinition");
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
| **name** | **String**| Name of the custom event. | |
| **propertyName** | **String**| Name of the custom event property. | |

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
| **200** | Successfully deleted the event property definition. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="propertyDefinition_0"></a>
# **propertyDefinition_0**
> CustomEventDefinitionProperty propertyDefinition_0(name, propertyName, customEventDefinitionPropertyUpdateRequest)

Update an event property definition

Updates an event property definition&#39;s label and description.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.CustomEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    CustomEventsApi apiInstance = new CustomEventsApi(defaultClient);
    String name = "unique_event_name"; // String | Name of the custom event.
    String propertyName = "unique_property_name"; // String | Name of the custom event property.
    CustomEventDefinitionPropertyUpdateRequest customEventDefinitionPropertyUpdateRequest = new CustomEventDefinitionPropertyUpdateRequest(); // CustomEventDefinitionPropertyUpdateRequest | 
    try {
      CustomEventDefinitionProperty result = apiInstance.propertyDefinition_0(name, propertyName, customEventDefinitionPropertyUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEventsApi#propertyDefinition_0");
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
| **name** | **String**| Name of the custom event. | |
| **propertyName** | **String**| Name of the custom event property. | |
| **customEventDefinitionPropertyUpdateRequest** | [**CustomEventDefinitionPropertyUpdateRequest**](CustomEventDefinitionPropertyUpdateRequest.md)|  | |

### Return type

[**CustomEventDefinitionProperty**](CustomEventDefinitionProperty.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the event property definition. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="retrieveDefinition"></a>
# **retrieveDefinition**
> CustomEventDefinition retrieveDefinition(name)

Retrieve an event definition

Retrieves a custom event definition you previously created.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.CustomEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    CustomEventsApi apiInstance = new CustomEventsApi(defaultClient);
    String name = "unique_event_name"; // String | Name of the custom event.
    try {
      CustomEventDefinition result = apiInstance.retrieveDefinition(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEventsApi#retrieveDefinition");
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
| **name** | **String**| Name of the custom event. | |

### Return type

[**CustomEventDefinition**](CustomEventDefinition.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the event definition. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="sendEvent"></a>
# **sendEvent**
> sendEvent(customEventSendRequest)

Send an event

Sends an event.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.CustomEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    CustomEventsApi apiInstance = new CustomEventsApi(defaultClient);
    CustomEventSendRequest customEventSendRequest = new CustomEventSendRequest(); // CustomEventSendRequest | 
    try {
      apiInstance.sendEvent(customEventSendRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEventsApi#sendEvent");
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
| **customEventSendRequest** | [**CustomEventSendRequest**](CustomEventSendRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully sent the event. |  -  |

<a name="updateDefinition"></a>
# **updateDefinition**
> CustomEventDefinition updateDefinition(name, customEventDefinitionUpdateRequest)

Update an event definition

Updates an event definition&#39;s label and description.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.CustomEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    CustomEventsApi apiInstance = new CustomEventsApi(defaultClient);
    String name = "unique_event_name"; // String | Name of the custom event.
    CustomEventDefinitionUpdateRequest customEventDefinitionUpdateRequest = new CustomEventDefinitionUpdateRequest(); // CustomEventDefinitionUpdateRequest | 
    try {
      CustomEventDefinition result = apiInstance.updateDefinition(name, customEventDefinitionUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEventsApi#updateDefinition");
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
| **name** | **String**| Name of the custom event. | |
| **customEventDefinitionUpdateRequest** | [**CustomEventDefinitionUpdateRequest**](CustomEventDefinitionUpdateRequest.md)|  | |

### Return type

[**CustomEventDefinition**](CustomEventDefinition.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the event definition. |  -  |
| **404** | The requested resource does not exist. |  -  |

