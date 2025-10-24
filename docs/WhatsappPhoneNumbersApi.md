# WhatsappPhoneNumbersApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](WhatsappPhoneNumbersApi.md#list) | **GET** /whatsapp/phoneNumbers | List phone numbers |
| [**register**](WhatsappPhoneNumbersApi.md#register) | **POST** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/register | Register a phone number |
| [**retrieve**](WhatsappPhoneNumbersApi.md#retrieve) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber} | Retrieve a phone number |
| [**retrieveCommerceSettings**](WhatsappPhoneNumbersApi.md#retrieveCommerceSettings) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/whatsappCommerceSettings | Retrieve commerce settings |
| [**retrieveProfile**](WhatsappPhoneNumbersApi.md#retrieveProfile) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/profile | Retrieve a phone number profile |
| [**retrieveSettings**](WhatsappPhoneNumbersApi.md#retrieveSettings) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/settings | Retrieve phone number settings |
| [**saveSettings**](WhatsappPhoneNumbersApi.md#saveSettings) | **POST** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/settings | Save phone number settings |
| [**updateCommerceSettings**](WhatsappPhoneNumbersApi.md#updateCommerceSettings) | **PATCH** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/whatsappCommerceSettings | Update commerce settings |
| [**updateDisplayName**](WhatsappPhoneNumbersApi.md#updateDisplayName) | **PATCH** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/displayName | Update a phone number display name |
| [**updateProfile**](WhatsappPhoneNumbersApi.md#updateProfile) | **PATCH** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/profile | Update a phone number profile |


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

