# ContactsApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attributesList**](ContactsApi.md#attributesList) | **GET** /contact/contacts/attributes | List contact attributes |
| [**create**](ContactsApi.md#create) | **POST** /contact/contacts | Create a contact |
| [**delete**](ContactsApi.md#delete) | **DELETE** /contact/contacts/{id} | Delete a contact |
| [**list**](ContactsApi.md#list) | **GET** /contact/contacts | List contacts |
| [**noteCreate**](ContactsApi.md#noteCreate) | **POST** /contact/contacts/{contactIdentifier}/notes | Create a contact note |
| [**noteDelete**](ContactsApi.md#noteDelete) | **DELETE** /contact/notes/{noteId} | Delete a contact note |
| [**noteUpdate**](ContactsApi.md#noteUpdate) | **PATCH** /contact/notes/{noteId} | Update a contact note |
| [**notesList**](ContactsApi.md#notesList) | **GET** /contact/contacts/{contactIdentifier}/notes | List contact notes |
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
| **400** | The notes array or note content is invalid. |  -  |

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
    String id = "alice_01"; // String | Identifier of the contact. Supports a contact ID, a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format starting with `+` (for example, `+16315551111`), or a Meta username without the leading `@`. A Meta username must contain 3 to 35 letters, digits, periods, or underscores. If a numeric value can be interpreted as both a Meta username and a contact ID, it is resolved as a Meta username first. If no contact has that Meta username, the value is resolved as a contact ID.
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
| **id** | **String**| Identifier of the contact. Supports a contact ID, a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format starting with &#x60;+&#x60; (for example, &#x60;+16315551111&#x60;), or a Meta username without the leading &#x60;@&#x60;. A Meta username must contain 3 to 35 letters, digits, periods, or underscores. If a numeric value can be interpreted as both a Meta username and a contact ID, it is resolved as a Meta username first. If no contact has that Meta username, the value is resolved as a contact ID. | |

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
> ContactPage list().page(page).limit(limit).includeTotal(includeTotal).pageAfter(pageAfter).filterTags(filterTags).filterCountryCode(filterCountryCode).filterPhoneNumber(filterPhoneNumber).filterEmail(filterEmail).execute();

List contacts

Returns a paginated list of contacts.  Omit &#x60;pageAfter&#x60; to use the existing page-based pagination. To use forward cursor pagination, set &#x60;pageAfter&#x3D;0&#x60; for the first page, then pass the exact &#x60;cursor.after&#x60; value returned by the previous response. Cursor results are ordered by contact ID in ascending order.  Do not combine &#x60;pageAfter&#x60; with &#x60;page&#x60;, &#x60;pageBefore&#x60;, &#x60;offset&#x60;, or &#x60;sort&#x60;. Keep all filters unchanged while following a cursor. Concurrent contact inserts, deletions, or filter-field updates use weak consistency; restart a full traversal with &#x60;pageAfter&#x3D;0&#x60; when a fresh snapshot is required.

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
    String pageAfter = "0"; // String | Contact ID cursor for forward pagination. Use `0` to start a new cursor traversal. For each subsequent page, pass the exact `cursor.after` value from the previous response. The value must be a non-negative decimal integer in the signed 64-bit range (`0` through `9223372036854775807`). It cannot be combined with `page`, `pageBefore`, `offset`, or `sort`.
    String filterTags = "tag1,tag2"; // String | Comma-separated list of tag names. If any tag does not exist, the request fails with a parameter error.
    String filterCountryCode = "US"; // String | Two-letter country abbreviation. See [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
    String filterPhoneNumber = "+16315551111"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    String filterEmail = "support@example.com"; // String | The contact's email address.
    try {
      ContactPage result = apiInstance.list()
            .page(page)
            .limit(limit)
            .includeTotal(includeTotal)
            .pageAfter(pageAfter)
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
| **pageAfter** | **String**| Contact ID cursor for forward pagination. Use &#x60;0&#x60; to start a new cursor traversal. For each subsequent page, pass the exact &#x60;cursor.after&#x60; value from the previous response. The value must be a non-negative decimal integer in the signed 64-bit range (&#x60;0&#x60; through &#x60;9223372036854775807&#x60;). It cannot be combined with &#x60;page&#x60;, &#x60;pageBefore&#x60;, &#x60;offset&#x60;, or &#x60;sort&#x60;. | [optional] |
| **filterTags** | **String**| Comma-separated list of tag names. If any tag does not exist, the request fails with a parameter error. | [optional] |
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
| **400** | One or more query parameters are invalid, including an invalid cursor, incompatible pagination parameters, an out-of-range limit, or an unknown tag. |  -  |

<a name="noteCreate"></a>
# **noteCreate**
> ContactNote noteCreate(contactIdentifier, contactNoteWriteRequest)

Create a contact note

Creates one note for the contact and returns the created note. Leading and trailing whitespace is removed before storage. This operation does not use a client idempotency key; repeating the request creates another note with a different ID.

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
    String contactIdentifier = "alice_01"; // String | Identifier of the contact that owns the note. Supports a contact ID, a username without the leading `@`, or a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format starting with `+`. Usernames contain 3 to 35 letters, digits, periods, or underscores. A numeric value is resolved as a username first and then as a contact ID when no matching username exists.
    ContactNoteWriteRequest contactNoteWriteRequest = new ContactNoteWriteRequest(); // ContactNoteWriteRequest |
    try {
      ContactNote result = apiInstance.noteCreate(contactIdentifier, contactNoteWriteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#noteCreate");
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
| **contactIdentifier** | **String**| Identifier of the contact that owns the note. Supports a contact ID, a username without the leading &#x60;@&#x60;, or a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format starting with &#x60;+&#x60;. Usernames contain 3 to 35 letters, digits, periods, or underscores. A numeric value is resolved as a username first and then as a contact ID when no matching username exists. | |
| **contactNoteWriteRequest** | [**ContactNoteWriteRequest**](ContactNoteWriteRequest.md)|  | |

### Return type

[**ContactNote**](ContactNote.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created the contact note. |  -  |
| **400** | The contact identifier or note content is invalid, or the contact already has 50 notes. |  -  |
| **404** | The contact does not exist. |  -  |

<a name="noteDelete"></a>
# **noteDelete**
> ContactNote noteDelete(noteId)

Delete a contact note

Deletes one note in the current tenant by note ID and returns its snapshot before deletion. Deleting the same note again returns &#x60;404&#x60;; the operation does not use a client idempotency key.

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
    String noteId = "6a3de646e18f344f743aaa4d"; // String | The 24-character ObjectId of the contact note.
    try {
      ContactNote result = apiInstance.noteDelete(noteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#noteDelete");
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
| **noteId** | **String**| The 24-character ObjectId of the contact note. | |

### Return type

[**ContactNote**](ContactNote.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the contact note. |  -  |
| **400** | The contact note ID is invalid. |  -  |
| **404** | The contact note does not exist in the current tenant. |  -  |

<a name="noteUpdate"></a>
# **noteUpdate**
> ContactNote noteUpdate(noteId, contactNoteWriteRequest)

Update a contact note

Updates one note in the current tenant by note ID and returns the updated note. Repeating the same request leaves the stored content unchanged, but an accepted update may still produce another &#x60;contact.note.updated&#x60; event.

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
    String noteId = "6a3de646e18f344f743aaa4d"; // String | The 24-character ObjectId of the contact note.
    ContactNoteWriteRequest contactNoteWriteRequest = new ContactNoteWriteRequest(); // ContactNoteWriteRequest |
    try {
      ContactNote result = apiInstance.noteUpdate(noteId, contactNoteWriteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#noteUpdate");
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
| **noteId** | **String**| The 24-character ObjectId of the contact note. | |
| **contactNoteWriteRequest** | [**ContactNoteWriteRequest**](ContactNoteWriteRequest.md)|  | |

### Return type

[**ContactNote**](ContactNote.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the contact note. |  -  |
| **400** | The contact note ID or content is invalid. |  -  |
| **404** | The contact note does not exist in the current tenant. |  -  |

<a name="notesList"></a>
# **notesList**
> List&lt;ContactNote&gt; notesList(contactIdentifier)

List contact notes

Returns all notes for a contact, ordered by creation time descending. The &#x60;{contactIdentifier}&#x60; path parameter supports a contact ID, a phone number in E.164 format starting with &#x60;+&#x60;, or a Meta username without the leading &#x60;@&#x60;. Ambiguous numeric values are resolved as Meta usernames first and fall back to contact IDs only when no matching Meta username exists. Contact retrieve, list, and search responses do not include notes; use this endpoint to read contact notes.

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
    String contactIdentifier = "alice_01"; // String | Identifier of the contact that owns the note. Supports a contact ID, a username without the leading `@`, or a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format starting with `+`. Usernames contain 3 to 35 letters, digits, periods, or underscores. A numeric value is resolved as a username first and then as a contact ID when no matching username exists.
    try {
      List<ContactNote> result = apiInstance.notesList(contactIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#notesList");
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
| **contactIdentifier** | **String**| Identifier of the contact that owns the note. Supports a contact ID, a username without the leading &#x60;@&#x60;, or a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format starting with &#x60;+&#x60;. Usernames contain 3 to 35 letters, digits, periods, or underscores. A numeric value is resolved as a username first and then as a contact ID when no matching username exists. | |

### Return type

[**List&lt;ContactNote&gt;**](ContactNote.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved contact notes. |  -  |
| **400** | The contact identifier is invalid. |  -  |
| **404** | The requested resource does not exist. |  -  |

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
    String id = "alice_01"; // String | Identifier of the contact. Supports a contact ID, a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format starting with `+` (for example, `+16315551111`), or a Meta username without the leading `@`. A Meta username must contain 3 to 35 letters, digits, periods, or underscores. If a numeric value can be interpreted as both a Meta username and a contact ID, it is resolved as a Meta username first. If no contact has that Meta username, the value is resolved as a contact ID.
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
| **id** | **String**| Identifier of the contact. Supports a contact ID, a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format starting with &#x60;+&#x60; (for example, &#x60;+16315551111&#x60;), or a Meta username without the leading &#x60;@&#x60;. A Meta username must contain 3 to 35 letters, digits, periods, or underscores. If a numeric value can be interpreted as both a Meta username and a contact ID, it is resolved as a Meta username first. If no contact has that Meta username, the value is resolved as a contact ID. | |

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

Updates a contact. If every supplied persisted contact field already has the requested value, the contact is not updated and no &#x60;contact.attributes_changed&#x60; event is emitted. Note mutations in the same request are still applied.

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
    String id = "alice_01"; // String | Identifier of the contact. Supports a contact ID, a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format starting with `+` (for example, `+16315551111`), or a Meta username without the leading `@`. A Meta username must contain 3 to 35 letters, digits, periods, or underscores. If a numeric value can be interpreted as both a Meta username and a contact ID, it is resolved as a Meta username first. If no contact has that Meta username, the value is resolved as a contact ID.
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
| **id** | **String**| Identifier of the contact. Supports a contact ID, a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format starting with &#x60;+&#x60; (for example, &#x60;+16315551111&#x60;), or a Meta username without the leading &#x60;@&#x60;. A Meta username must contain 3 to 35 letters, digits, periods, or underscores. If a numeric value can be interpreted as both a Meta username and a contact ID, it is resolved as a Meta username first. If no contact has that Meta username, the value is resolved as a contact ID. | |
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
| **400** | The notes array, note ID, or note content is invalid. |  -  |
| **404** | The contact or referenced contact note does not exist, or the note is not owned by the contact. |  -  |
