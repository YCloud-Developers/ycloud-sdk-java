# WhatsappTemplatesApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](WhatsappTemplatesApi.md#create) | **POST** /whatsapp/templates | Create a template |
| [**deleteByName**](WhatsappTemplatesApi.md#deleteByName) | **DELETE** /whatsapp/templates/{wabaId}/{name} | Delete templates by name |
| [**deleteByNameAndLanguage**](WhatsappTemplatesApi.md#deleteByNameAndLanguage) | **DELETE** /whatsapp/templates/{wabaId}/{name}/{language} | Delete a template |
| [**editByNameAndLanguage**](WhatsappTemplatesApi.md#editByNameAndLanguage) | **PATCH** /whatsapp/templates/{wabaId}/{name}/{language} | Edit a template |
| [**list**](WhatsappTemplatesApi.md#list) | **GET** /whatsapp/templates | List templates |
| [**retrieveByNameAndLanguage**](WhatsappTemplatesApi.md#retrieveByNameAndLanguage) | **GET** /whatsapp/templates/{wabaId}/{name}/{language} | Retrieve a template |


<a name="create"></a>
# **create**
> WhatsappTemplate create(whatsappTemplateCreateRequest)

Create a template

Creates a WhatsApp template.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappTemplatesApi apiInstance = new WhatsappTemplatesApi(defaultClient);
    WhatsappTemplateCreateRequest whatsappTemplateCreateRequest = new WhatsappTemplateCreateRequest(); // WhatsappTemplateCreateRequest | 
    try {
      WhatsappTemplate result = apiInstance.create(whatsappTemplateCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappTemplatesApi#create");
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
| **whatsappTemplateCreateRequest** | [**WhatsappTemplateCreateRequest**](WhatsappTemplateCreateRequest.md)|  | |

### Return type

[**WhatsappTemplate**](WhatsappTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a WhatsApp template. |  -  |

<a name="deleteByName"></a>
# **deleteByName**
> List&lt;WhatsappTemplate&gt; deleteByName(wabaId, name)

Delete templates by name

Deletes WhatsApp templates by name. If that template name exists in multiple languages, all languages will be deleted. HTTP status &#x60;404&#x60; is returned if no templates are found for the specific name.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappTemplatesApi apiInstance = new WhatsappTemplatesApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String name = "sample_whatsapp_template"; // String | Name of the template.
    try {
      List<WhatsappTemplate> result = apiInstance.deleteByName(wabaId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappTemplatesApi#deleteByName");
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
| **name** | **String**| Name of the template. | |

### Return type

[**List&lt;WhatsappTemplate&gt;**](WhatsappTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the template(s). |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="deleteByNameAndLanguage"></a>
# **deleteByNameAndLanguage**
> WhatsappTemplate deleteByNameAndLanguage(wabaId, name, language)

Delete a template

Deletes a WhatsApp template by name and language.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappTemplatesApi apiInstance = new WhatsappTemplatesApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String name = "sample_whatsapp_template"; // String | Name of the template.
    String language = "en_US"; // String | Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes.
    try {
      WhatsappTemplate result = apiInstance.deleteByNameAndLanguage(wabaId, name, language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappTemplatesApi#deleteByNameAndLanguage");
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
| **name** | **String**| Name of the template. | |
| **language** | **String**| Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes. | |

### Return type

[**WhatsappTemplate**](WhatsappTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the template. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="editByNameAndLanguage"></a>
# **editByNameAndLanguage**
> WhatsappTemplate editByNameAndLanguage(wabaId, name, language, whatsappTemplateEditRequest)

Edit a template

Edits a WhatsApp template by name and language. Editing a template replaces its old contents entirely, so include any components you wish to preserve as well as components you wish to update using the components parameter.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappTemplatesApi apiInstance = new WhatsappTemplatesApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String name = "sample_whatsapp_template"; // String | Name of the template.
    String language = "en_US"; // String | Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes.
    WhatsappTemplateEditRequest whatsappTemplateEditRequest = new WhatsappTemplateEditRequest(); // WhatsappTemplateEditRequest | 
    try {
      WhatsappTemplate result = apiInstance.editByNameAndLanguage(wabaId, name, language, whatsappTemplateEditRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappTemplatesApi#editByNameAndLanguage");
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
| **name** | **String**| Name of the template. | |
| **language** | **String**| Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes. | |
| **whatsappTemplateEditRequest** | [**WhatsappTemplateEditRequest**](WhatsappTemplateEditRequest.md)|  | [optional] |

### Return type

[**WhatsappTemplate**](WhatsappTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully edited the template. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="list"></a>
# **list**
> WhatsappTemplatePage list().page(page).limit(limit).includeTotal(includeTotal).filterWabaId(filterWabaId).filterName(filterName).filterLanguage(filterLanguage).execute();

List templates

Returns a paginated list of WhatsApp templates you&#39;ve previously created.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappTemplatesApi apiInstance = new WhatsappTemplatesApi(defaultClient);
    Integer page = 1; // Integer | Page number of the results to be returned, 1-based.
    Integer limit = 10; // Integer | A limit on the number of results to be returned, or number of results per page, between 1 and 100, defaults to 10.
    Boolean includeTotal = false; // Boolean | Return results inside an object that contains the total result count or not.
    String filterWabaId = "whatsapp-business-account-id"; // String | **Required if you have more than 100 WABAs.** WhatsApp Business Account ID.
    String filterName = "sample_whatsapp_template"; // String | Name of the template.
    String filterLanguage = "en_US"; // String | Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes.
    try {
      WhatsappTemplatePage result = apiInstance.list()
            .page(page)
            .limit(limit)
            .includeTotal(includeTotal)
            .filterWabaId(filterWabaId)
            .filterName(filterName)
            .filterLanguage(filterLanguage)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappTemplatesApi#list");
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
| **filterName** | **String**| Name of the template. | [optional] |
| **filterLanguage** | **String**| Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes. | [optional] |

### Return type

[**WhatsappTemplatePage**](WhatsappTemplatePage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved a paginated list of objects. |  -  |

<a name="retrieveByNameAndLanguage"></a>
# **retrieveByNameAndLanguage**
> WhatsappTemplate retrieveByNameAndLanguage(wabaId, name, language)

Retrieve a template

Retrieves a WhatsApp template by name and language.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappTemplatesApi apiInstance = new WhatsappTemplatesApi(defaultClient);
    String wabaId = "whatsapp-business-account-id"; // String | WhatsApp Business Account ID.
    String name = "sample_whatsapp_template"; // String | Name of the template.
    String language = "en_US"; // String | Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes.
    try {
      WhatsappTemplate result = apiInstance.retrieveByNameAndLanguage(wabaId, name, language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappTemplatesApi#retrieveByNameAndLanguage");
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
| **name** | **String**| Name of the template. | |
| **language** | **String**| Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages) for all codes. | |

### Return type

[**WhatsappTemplate**](WhatsappTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the template. |  -  |
| **404** | The requested resource does not exist. |  -  |

