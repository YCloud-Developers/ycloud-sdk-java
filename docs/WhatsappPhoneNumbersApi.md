# WhatsappPhoneNumbersApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteBusinessUsername**](WhatsappPhoneNumbersApi.md#deleteBusinessUsername) | **DELETE** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/businessUsername | Delete a phone number business username |
| [**list**](WhatsappPhoneNumbersApi.md#list) | **GET** /whatsapp/phoneNumbers | List phone numbers |
| [**register**](WhatsappPhoneNumbersApi.md#register) | **POST** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/register | Register a phone number |
| [**retrieve**](WhatsappPhoneNumbersApi.md#retrieve) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber} | Retrieve a phone number |
| [**retrieveBusinessUsername**](WhatsappPhoneNumbersApi.md#retrieveBusinessUsername) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/businessUsername | Retrieve a phone number business username |
| [**retrieveBusinessUsernameSuggestions**](WhatsappPhoneNumbersApi.md#retrieveBusinessUsernameSuggestions) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/businessUsername/suggestions | Retrieve phone number business username suggestions |
| [**retrieveCommerceSettings**](WhatsappPhoneNumbersApi.md#retrieveCommerceSettings) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/whatsappCommerceSettings | Retrieve commerce settings |
| [**retrieveProfile**](WhatsappPhoneNumbersApi.md#retrieveProfile) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/profile | Retrieve a phone number profile |
| [**retrieveSettings**](WhatsappPhoneNumbersApi.md#retrieveSettings) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/settings | Retrieve phone number settings |
| [**saveSettings**](WhatsappPhoneNumbersApi.md#saveSettings) | **POST** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/settings | Save phone number settings |
| [**updateBusinessUsername**](WhatsappPhoneNumbersApi.md#updateBusinessUsername) | **PATCH** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/businessUsername | Update a phone number business username |
| [**updateCommerceSettings**](WhatsappPhoneNumbersApi.md#updateCommerceSettings) | **PATCH** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/whatsappCommerceSettings | Update commerce settings |
| [**updateDisplayName**](WhatsappPhoneNumbersApi.md#updateDisplayName) | **PATCH** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/displayName | Update a phone number display name |
| [**updateProfile**](WhatsappPhoneNumbersApi.md#updateProfile) | **PATCH** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/profile | Update a phone number profile |


<a name="deleteBusinessUsername"></a>
# **deleteBusinessUsername**
> WhatsappBusinessUsernameDeleteResult deleteBusinessUsername(wabaId, phoneNumber)

Delete a phone number business username

Deletes the active Business Username for a WhatsApp business phone number. This operation removes the currently active Business Username. It does not cancel or remove a pending Business Username request. If a pending request still exists after deletion, the returned &#x60;businessUsernameStatus&#x60; remains &#x60;pending_review&#x60;; otherwise it becomes &#x60;not_set&#x60;.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappPhoneNumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappPhoneNumbersApi apiInstance = new WhatsappPhoneNumbersApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String phoneNumber = "+16315551111"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    try {
      WhatsappBusinessUsernameDeleteResult result = apiInstance.deleteBusinessUsername(wabaId, phoneNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappPhoneNumbersApi#deleteBusinessUsername");
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
| **phoneNumber** | **String**| Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |

### Return type

[**WhatsappBusinessUsernameDeleteResult**](WhatsappBusinessUsernameDeleteResult.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the business username. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="list"></a>
# **list**
> WhatsappPhoneNumberPage list().page(page).limit(limit).includeTotal(includeTotal).filterWabaId(filterWabaId).execute();

List phone numbers

Returns a paginated list of WhatsApp business phone numbers you&#39;ve registered.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappPhoneNumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappPhoneNumbersApi apiInstance = new WhatsappPhoneNumbersApi(defaultClient);
    Integer page = 1; // Integer | Page number of the results to be returned, 1-based.
    Integer limit = 10; // Integer | A limit on the number of results to be returned, or number of results per page, between 1 and 100, defaults to 10.
    Boolean includeTotal = false; // Boolean | Return results inside an object that contains the total result count or not.
    String filterWabaId = "whatsapp-business-account-id"; // String | **Required if you have more than 100 WABAs.** WhatsApp Business Account ID.
    try {
      WhatsappPhoneNumberPage result = apiInstance.list()
            .page(page)
            .limit(limit)
            .includeTotal(includeTotal)
            .filterWabaId(filterWabaId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappPhoneNumbersApi#list");
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
| **filterWabaId** | **String**| **Required if you have more than 100 WABAs.** WhatsApp Business Account ID. | [optional] |

### Return type

[**WhatsappPhoneNumberPage**](WhatsappPhoneNumberPage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved a paginated list of objects. |  -  |

<a name="register"></a>
# **register**
> WhatsappPhoneNumber register(wabaId, phoneNumber)

Register a phone number

Registers a WhatsApp business phone number.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappPhoneNumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappPhoneNumbersApi apiInstance = new WhatsappPhoneNumbersApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String phoneNumber = "1234567890123456"; // String | Phone number ID.
    try {
      WhatsappPhoneNumber result = apiInstance.register(wabaId, phoneNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappPhoneNumbersApi#register");
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
| **phoneNumber** | **String**| Phone number ID. | |

### Return type

[**WhatsappPhoneNumber**](WhatsappPhoneNumber.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully registered the phone number. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="retrieve"></a>
# **retrieve**
> WhatsappPhoneNumber retrieve(wabaId, phoneNumber)

Retrieve a phone number

Retrieves a WhatsApp business phone number you&#39;ve registered.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappPhoneNumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappPhoneNumbersApi apiInstance = new WhatsappPhoneNumbersApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String phoneNumber = "+16315551111"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    try {
      WhatsappPhoneNumber result = apiInstance.retrieve(wabaId, phoneNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappPhoneNumbersApi#retrieve");
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
| **phoneNumber** | **String**| Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |

### Return type

[**WhatsappPhoneNumber**](WhatsappPhoneNumber.md)

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

<a name="retrieveBusinessUsername"></a>
# **retrieveBusinessUsername**
> WhatsappBusinessUsername retrieveBusinessUsername(wabaId, phoneNumber)

Retrieve a phone number business username

Retrieves the Business Username state for a WhatsApp business phone number. The response reflects YCloud&#39;s latest known phone number state. If the phone number has no locally stored Business Username state, YCloud may sync the current username state from Meta before returning the response.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappPhoneNumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappPhoneNumbersApi apiInstance = new WhatsappPhoneNumbersApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String phoneNumber = "+16315551111"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    try {
      WhatsappBusinessUsername result = apiInstance.retrieveBusinessUsername(wabaId, phoneNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappPhoneNumbersApi#retrieveBusinessUsername");
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
| **phoneNumber** | **String**| Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |

### Return type

[**WhatsappBusinessUsername**](WhatsappBusinessUsername.md)

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

<a name="retrieveBusinessUsernameSuggestions"></a>
# **retrieveBusinessUsernameSuggestions**
> WhatsappBusinessUsernameSuggestions retrieveBusinessUsernameSuggestions(wabaId, phoneNumber)

Retrieve phone number business username suggestions

Retrieves reserved Business Username suggestions for a WhatsApp business phone number. The response flattens Meta username suggestions into a string array. If no suggestions are available, &#x60;data&#x60; is an empty array.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappPhoneNumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappPhoneNumbersApi apiInstance = new WhatsappPhoneNumbersApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String phoneNumber = "+16315551111"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    try {
      WhatsappBusinessUsernameSuggestions result = apiInstance.retrieveBusinessUsernameSuggestions(wabaId, phoneNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappPhoneNumbersApi#retrieveBusinessUsernameSuggestions");
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
| **phoneNumber** | **String**| Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |

### Return type

[**WhatsappBusinessUsernameSuggestions**](WhatsappBusinessUsernameSuggestions.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the suggestions. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="retrieveCommerceSettings"></a>
# **retrieveCommerceSettings**
> WhatsappCommerceSettings retrieveCommerceSettings(wabaId, phoneNumber)

Retrieve commerce settings

Retrieves a WhatsApp business phone number&#39;s commerce settings.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappPhoneNumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappPhoneNumbersApi apiInstance = new WhatsappPhoneNumbersApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String phoneNumber = "+16315551111"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    try {
      WhatsappCommerceSettings result = apiInstance.retrieveCommerceSettings(wabaId, phoneNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappPhoneNumbersApi#retrieveCommerceSettings");
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
| **phoneNumber** | **String**| Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |

### Return type

[**WhatsappCommerceSettings**](WhatsappCommerceSettings.md)

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

<a name="retrieveProfile"></a>
# **retrieveProfile**
> WhatsappPhoneNumberProfile retrieveProfile(wabaId, phoneNumber)

Retrieve a phone number profile

Retrieves a WhatsApp business phone number&#39;s profile. Customers can view your business profile by clicking your business&#39;s name or number in a conversation thread.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappPhoneNumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappPhoneNumbersApi apiInstance = new WhatsappPhoneNumbersApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String phoneNumber = "+16315551111"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    try {
      WhatsappPhoneNumberProfile result = apiInstance.retrieveProfile(wabaId, phoneNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappPhoneNumbersApi#retrieveProfile");
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
| **phoneNumber** | **String**| Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |

### Return type

[**WhatsappPhoneNumberProfile**](WhatsappPhoneNumberProfile.md)

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

<a name="retrieveSettings"></a>
# **retrieveSettings**
> WhatsappPhoneNumberSettings retrieveSettings(wabaId, phoneNumber)

Retrieve phone number settings

Retrieves phone number specific settings.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappPhoneNumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappPhoneNumbersApi apiInstance = new WhatsappPhoneNumbersApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String phoneNumber = "+6283138205170"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    try {
      WhatsappPhoneNumberSettings result = apiInstance.retrieveSettings(wabaId, phoneNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappPhoneNumbersApi#retrieveSettings");
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
| **phoneNumber** | **String**| Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |

### Return type

[**WhatsappPhoneNumberSettings**](WhatsappPhoneNumberSettings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the phone number settings. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="saveSettings"></a>
# **saveSettings**
> WhatsappPhoneNumberSettings saveSettings(wabaId, phoneNumber, whatsappPhoneNumberSettings)

Save phone number settings

Saves phone number specific settings.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappPhoneNumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappPhoneNumbersApi apiInstance = new WhatsappPhoneNumbersApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String phoneNumber = "+6283138205150"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    WhatsappPhoneNumberSettings whatsappPhoneNumberSettings = new WhatsappPhoneNumberSettings(); // WhatsappPhoneNumberSettings | Phone number settings to save.
    try {
      WhatsappPhoneNumberSettings result = apiInstance.saveSettings(wabaId, phoneNumber, whatsappPhoneNumberSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappPhoneNumbersApi#saveSettings");
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
| **phoneNumber** | **String**| Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **whatsappPhoneNumberSettings** | [**WhatsappPhoneNumberSettings**](WhatsappPhoneNumberSettings.md)| Phone number settings to save. | |

### Return type

[**WhatsappPhoneNumberSettings**](WhatsappPhoneNumberSettings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully saved the phone number settings. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="updateBusinessUsername"></a>
# **updateBusinessUsername**
> WhatsappBusinessUsername updateBusinessUsername(wabaId, phoneNumber, whatsappBusinessUsernameUpdateRequest)

Update a phone number business username

Requests a Business Username update for a WhatsApp business phone number. The requested username may require Meta review before it becomes active. If Meta accepts the request for review, the response status is usually &#x60;pending_review&#x60;; if Meta returns an error, YCloud returns the error and does not change the stored Business Username state.  The &#x60;username&#x60; value is a plain username without &#x60;@&#x60;. YCloud trims leading and trailing whitespace and normalizes the value to lowercase before validation and submission.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappPhoneNumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappPhoneNumbersApi apiInstance = new WhatsappPhoneNumbersApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String phoneNumber = "+16315551111"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    WhatsappBusinessUsernameUpdateRequest whatsappBusinessUsernameUpdateRequest = new WhatsappBusinessUsernameUpdateRequest(); // WhatsappBusinessUsernameUpdateRequest | 
    try {
      WhatsappBusinessUsername result = apiInstance.updateBusinessUsername(wabaId, phoneNumber, whatsappBusinessUsernameUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappPhoneNumbersApi#updateBusinessUsername");
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
| **phoneNumber** | **String**| Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **whatsappBusinessUsernameUpdateRequest** | [**WhatsappBusinessUsernameUpdateRequest**](WhatsappBusinessUsernameUpdateRequest.md)|  | |

### Return type

[**WhatsappBusinessUsername**](WhatsappBusinessUsername.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully submitted the update request. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="updateCommerceSettings"></a>
# **updateCommerceSettings**
> WhatsappCommerceSettings updateCommerceSettings(wabaId, phoneNumber, whatsappCommerceSettingsUpdateRequest)

Update commerce settings

Updates a WhatsApp business phone number&#39;s commerce settings. Use this endpoint to enable or disable the shopping cart or the product catalog for a specific business phone number.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappPhoneNumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappPhoneNumbersApi apiInstance = new WhatsappPhoneNumbersApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String phoneNumber = "+16315551111"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    WhatsappCommerceSettingsUpdateRequest whatsappCommerceSettingsUpdateRequest = new WhatsappCommerceSettingsUpdateRequest(); // WhatsappCommerceSettingsUpdateRequest | 
    try {
      WhatsappCommerceSettings result = apiInstance.updateCommerceSettings(wabaId, phoneNumber, whatsappCommerceSettingsUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappPhoneNumbersApi#updateCommerceSettings");
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
| **phoneNumber** | **String**| Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **whatsappCommerceSettingsUpdateRequest** | [**WhatsappCommerceSettingsUpdateRequest**](WhatsappCommerceSettingsUpdateRequest.md)|  | |

### Return type

[**WhatsappCommerceSettings**](WhatsappCommerceSettings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the object. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="updateDisplayName"></a>
# **updateDisplayName**
> WhatsappPhoneNameUpdateResponse updateDisplayName(wabaId, phoneNumber, whatsappPhoneNameUpdateRequest)

Update a phone number display name

Updates a WhatsApp business phone number display name.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappPhoneNumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappPhoneNumbersApi apiInstance = new WhatsappPhoneNumbersApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String phoneNumber = "+16315551111"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    WhatsappPhoneNameUpdateRequest whatsappPhoneNameUpdateRequest = new WhatsappPhoneNameUpdateRequest(); // WhatsappPhoneNameUpdateRequest | 
    try {
      WhatsappPhoneNameUpdateResponse result = apiInstance.updateDisplayName(wabaId, phoneNumber, whatsappPhoneNameUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappPhoneNumbersApi#updateDisplayName");
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
| **phoneNumber** | **String**| Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **whatsappPhoneNameUpdateRequest** | [**WhatsappPhoneNameUpdateRequest**](WhatsappPhoneNameUpdateRequest.md)|  | |

### Return type

[**WhatsappPhoneNameUpdateResponse**](WhatsappPhoneNameUpdateResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the object. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="updateProfile"></a>
# **updateProfile**
> WhatsappPhoneNumberProfile updateProfile(wabaId, phoneNumber, whatsappPhoneNumberProfileUpdateRequest)

Update a phone number profile

Updates a WhatsApp business phone number profile.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappPhoneNumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappPhoneNumbersApi apiInstance = new WhatsappPhoneNumbersApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String phoneNumber = "+16315551111"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    WhatsappPhoneNumberProfileUpdateRequest whatsappPhoneNumberProfileUpdateRequest = new WhatsappPhoneNumberProfileUpdateRequest(); // WhatsappPhoneNumberProfileUpdateRequest | 
    try {
      WhatsappPhoneNumberProfile result = apiInstance.updateProfile(wabaId, phoneNumber, whatsappPhoneNumberProfileUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappPhoneNumbersApi#updateProfile");
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
| **phoneNumber** | **String**| Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **whatsappPhoneNumberProfileUpdateRequest** | [**WhatsappPhoneNumberProfileUpdateRequest**](WhatsappPhoneNumberProfileUpdateRequest.md)|  | |

### Return type

[**WhatsappPhoneNumberProfile**](WhatsappPhoneNumberProfile.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the object. |  -  |
| **404** | The requested resource does not exist. |  -  |

