# ContactsApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attributesList**](ContactsApi.md#attributesList) | **GET** /contact/contacts/attributes | List contact attributes |
| [**create**](ContactsApi.md#create) | **POST** /contact/contacts | Create a contact |
| [**delete**](ContactsApi.md#delete) | **DELETE** /contact/contacts/{id} | Delete a contact |
| [**list**](ContactsApi.md#list) | **GET** /contact/contacts | List contacts |
| [**retrieve**](ContactsApi.md#retrieve) | **GET** /contact/contacts/{id} | Retrieve a contact |
| [**update**](ContactsApi.md#update) | **PATCH** /contact/contacts/{id} | Update a contact |


<a name="attributesList"></a>
# **attributesList**
> List&lt;ContactAttribute&gt; attributesList()

List contact attributes

Returns a list of all available contact attributes and their configurations.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    try {
      List<ContactAttribute> result = apiInstance.attributesList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#attributesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ContactAttribute&gt;**](ContactAttribute.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved contact attributes. |  -  |

<a name="create"></a>
# **create**
> Contact create(contactCreateRequest)

Create a contact

Creates a contact.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    ContactCreateRequest contactCreateRequest = new ContactCreateRequest(); // ContactCreateRequest | 
    try {
      Contact result = apiInstance.create(contactCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#create");
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
| **contactCreateRequest** | [**ContactCreateRequest**](ContactCreateRequest.md)|  | |

### Return type

[**Contact**](Contact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a contact. |  -  |

<a name="delete"></a>
# **delete**
> Contact delete(id)

Delete a contact

Deletes a contact.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String id = "1693364594105000026"; // String | ID of the contact.
    try {
      Contact result = apiInstance.delete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#delete");
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
| **id** | **String**| ID of the contact. | |

### Return type

[**Contact**](Contact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the contact. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="list"></a>
# **list**
> ContactPage list().page(page).limit(limit).includeTotal(includeTotal).filterTags(filterTags).filterCountryCode(filterCountryCode).filterPhoneNumber(filterPhoneNumber).filterEmail(filterEmail).execute();

List contacts

Returns a paginated list of contacts.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Integer page = 1; // Integer | Page number of the results to be returned, 1-based.
    Integer limit = 10; // Integer | A limit on the number of results to be returned, or number of results per page, between 1 and 100, defaults to 10.
    Boolean includeTotal = false; // Boolean | Return results inside an object that contains the total result count or not.
    String filterTags = "tag1,tag2"; // String | Comma-separated list of tags.
    String filterCountryCode = "US"; // String | Two-letter country abbreviation. See [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
    String filterPhoneNumber = "+16315551111"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    String filterEmail = "support@example.com"; // String | The contact's email address.
    try {
      ContactPage result = apiInstance.list()
            .page(page)
            .limit(limit)
            .includeTotal(includeTotal)
            .filterTags(filterTags)
            .filterCountryCode(filterCountryCode)
            .filterPhoneNumber(filterPhoneNumber)
            .filterEmail(filterEmail)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#list");
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
| **filterTags** | **String**| Comma-separated list of tags. | [optional] |
| **filterCountryCode** | **String**| Two-letter country abbreviation. See [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). | [optional] |
| **filterPhoneNumber** | **String**| Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | [optional] |
| **filterEmail** | **String**| The contact&#39;s email address. | [optional] |

### Return type

[**ContactPage**](ContactPage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved a paginated list of objects. |  -  |

<a name="retrieve"></a>
# **retrieve**
> Contact retrieve(id)

Retrieve a contact

Retrieves a contact.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String id = "1693364594105000026"; // String | ID of the contact.
    try {
      Contact result = apiInstance.retrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#retrieve");
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
| **id** | **String**| ID of the contact. | |

### Return type

[**Contact**](Contact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the contact. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="update"></a>
# **update**
> Contact update(id, contactUpdateRequest)

Update a contact

Updates a contact.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String id = "1693364594105000026"; // String | ID of the contact.
    ContactUpdateRequest contactUpdateRequest = new ContactUpdateRequest(); // ContactUpdateRequest | 
    try {
      Contact result = apiInstance.update(id, contactUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#update");
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
| **id** | **String**| ID of the contact. | |
| **contactUpdateRequest** | [**ContactUpdateRequest**](ContactUpdateRequest.md)|  | [optional] |

### Return type

[**Contact**](Contact.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the contact. |  -  |
| **404** | The requested resource does not exist. |  -  |

