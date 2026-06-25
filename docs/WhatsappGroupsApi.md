# WhatsappGroupsApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveJoinRequests**](WhatsappGroupsApi.md#approveJoinRequests) | **POST** /whatsapp/{businessPhoneNumber}/groups/{groupId}/joinRequests/approve | Approve group join requests |
| [**create**](WhatsappGroupsApi.md#create) | **POST** /whatsapp/{businessPhoneNumber}/groups | Create a group |
| [**delete**](WhatsappGroupsApi.md#delete) | **DELETE** /whatsapp/{businessPhoneNumber}/groups/{groupId} | Delete a group |
| [**list**](WhatsappGroupsApi.md#list) | **GET** /whatsapp/{businessPhoneNumber}/groups | List groups |
| [**listJoinRequests**](WhatsappGroupsApi.md#listJoinRequests) | **GET** /whatsapp/{businessPhoneNumber}/groups/{groupId}/joinRequests | List group join requests |
| [**rejectJoinRequests**](WhatsappGroupsApi.md#rejectJoinRequests) | **POST** /whatsapp/{businessPhoneNumber}/groups/{groupId}/joinRequests/reject | Reject group join requests |
| [**removeParticipants**](WhatsappGroupsApi.md#removeParticipants) | **POST** /whatsapp/groups/{groupId}/participants/remove | Remove group participants |
| [**resetInviteLink**](WhatsappGroupsApi.md#resetInviteLink) | **POST** /whatsapp/{businessPhoneNumber}/groups/{groupId}/inviteLink/reset | Reset a group invite link |
| [**retrieve**](WhatsappGroupsApi.md#retrieve) | **GET** /whatsapp/{businessPhoneNumber}/groups/{groupId} | Retrieve a group |
| [**retrieveInviteLink**](WhatsappGroupsApi.md#retrieveInviteLink) | **GET** /whatsapp/{businessPhoneNumber}/groups/{groupId}/inviteLink | Retrieve a group invite link |
| [**sendInviteLinkMessage**](WhatsappGroupsApi.md#sendInviteLinkMessage) | **POST** /whatsapp/{businessPhoneNumber}/groups/inviteLink/messages | Send a group invite link message |
| [**updateSettings**](WhatsappGroupsApi.md#updateSettings) | **PATCH** /whatsapp/{businessPhoneNumber}/groups/{groupId}/settings | Update group settings |


<a name="approveJoinRequests"></a>
# **approveJoinRequests**
> WhatsappGroupJoinRequestActionResponse approveJoinRequests(businessPhoneNumber, groupId, whatsappGroupJoinRequestActionRequest)

Approve group join requests

Approves one or more pending join requests for a WhatsApp group.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappGroupsApi apiInstance = new WhatsappGroupsApi(defaultClient);
    String businessPhoneNumber = "+16315551111"; // String | The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    String groupId = "120363345678901234@g.us"; // String | WhatsApp group ID.
    WhatsappGroupJoinRequestActionRequest whatsappGroupJoinRequestActionRequest = new WhatsappGroupJoinRequestActionRequest(); // WhatsappGroupJoinRequestActionRequest | 
    try {
      WhatsappGroupJoinRequestActionResponse result = apiInstance.approveJoinRequests(businessPhoneNumber, groupId, whatsappGroupJoinRequestActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappGroupsApi#approveJoinRequests");
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
| **businessPhoneNumber** | **String**| The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **groupId** | **String**| WhatsApp group ID. | |
| **whatsappGroupJoinRequestActionRequest** | [**WhatsappGroupJoinRequestActionRequest**](WhatsappGroupJoinRequestActionRequest.md)|  | |

### Return type

[**WhatsappGroupJoinRequestActionResponse**](WhatsappGroupJoinRequestActionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully processed the join request approval. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |

<a name="create"></a>
# **create**
> WhatsappGroupAsyncResponse create(businessPhoneNumber, whatsappGroupCreateRequest)

Create a group

Creates a WhatsApp group for the specified business phone number.  The request is processed asynchronously. Use webhooks to receive the final group lifecycle result.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappGroupsApi apiInstance = new WhatsappGroupsApi(defaultClient);
    String businessPhoneNumber = "+16315551111"; // String | The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    WhatsappGroupCreateRequest whatsappGroupCreateRequest = new WhatsappGroupCreateRequest(); // WhatsappGroupCreateRequest | 
    try {
      WhatsappGroupAsyncResponse result = apiInstance.create(businessPhoneNumber, whatsappGroupCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappGroupsApi#create");
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
| **businessPhoneNumber** | **String**| The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **whatsappGroupCreateRequest** | [**WhatsappGroupCreateRequest**](WhatsappGroupCreateRequest.md)|  | |

### Return type

[**WhatsappGroupAsyncResponse**](WhatsappGroupAsyncResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The group creation request is successfully accepted. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |

<a name="delete"></a>
# **delete**
> WhatsappGroupAsyncResponse delete(businessPhoneNumber, groupId)

Delete a group

Deletes a WhatsApp group.  The request is processed asynchronously. Use webhooks to receive the final group lifecycle result.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappGroupsApi apiInstance = new WhatsappGroupsApi(defaultClient);
    String businessPhoneNumber = "+16315551111"; // String | The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    String groupId = "120363345678901234@g.us"; // String | WhatsApp group ID.
    try {
      WhatsappGroupAsyncResponse result = apiInstance.delete(businessPhoneNumber, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappGroupsApi#delete");
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
| **businessPhoneNumber** | **String**| The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **groupId** | **String**| WhatsApp group ID. | |

### Return type

[**WhatsappGroupAsyncResponse**](WhatsappGroupAsyncResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The group deletion request is successfully accepted. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="list"></a>
# **list**
> WhatsappGroupListResponse list(businessPhoneNumber).limit(limit).before(before).after(after).execute();

List groups

Returns a cursor-paginated list of active WhatsApp groups.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappGroupsApi apiInstance = new WhatsappGroupsApi(defaultClient);
    String businessPhoneNumber = "+16315551111"; // String | The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    Integer limit = 25; // Integer | A limit on the number of results to be returned, between 1 and 1024. Defaults to 25.
    String before = "eyJvIjoiYmVmb3JlIn0"; // String | A cursor to fetch the previous page.
    String after = "eyJvIjoiYWZ0ZXIifQ"; // String | A cursor to fetch the next page.
    try {
      WhatsappGroupListResponse result = apiInstance.list(businessPhoneNumber)
            .limit(limit)
            .before(before)
            .after(after)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappGroupsApi#list");
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
| **businessPhoneNumber** | **String**| The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **limit** | **Integer**| A limit on the number of results to be returned, between 1 and 1024. Defaults to 25. | [optional] [default to 25] |
| **before** | **String**| A cursor to fetch the previous page. | [optional] |
| **after** | **String**| A cursor to fetch the next page. | [optional] |

### Return type

[**WhatsappGroupListResponse**](WhatsappGroupListResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved groups. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |

<a name="listJoinRequests"></a>
# **listJoinRequests**
> WhatsappGroupJoinRequestListResponse listJoinRequests(businessPhoneNumber, groupId).limit(limit).before(before).after(after).execute();

List group join requests

Returns a cursor-paginated list of pending join requests for a WhatsApp group.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappGroupsApi apiInstance = new WhatsappGroupsApi(defaultClient);
    String businessPhoneNumber = "+16315551111"; // String | The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    String groupId = "120363345678901234@g.us"; // String | WhatsApp group ID.
    Integer limit = 25; // Integer | A limit on the number of results to be returned, between 1 and 1024. Defaults to 25.
    String before = "eyJvIjoiYmVmb3JlIn0"; // String | A cursor to fetch the previous page.
    String after = "eyJvIjoiYWZ0ZXIifQ"; // String | A cursor to fetch the next page.
    try {
      WhatsappGroupJoinRequestListResponse result = apiInstance.listJoinRequests(businessPhoneNumber, groupId)
            .limit(limit)
            .before(before)
            .after(after)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappGroupsApi#listJoinRequests");
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
| **businessPhoneNumber** | **String**| The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **groupId** | **String**| WhatsApp group ID. | |
| **limit** | **Integer**| A limit on the number of results to be returned, between 1 and 1024. Defaults to 25. | [optional] [default to 25] |
| **before** | **String**| A cursor to fetch the previous page. | [optional] |
| **after** | **String**| A cursor to fetch the next page. | [optional] |

### Return type

[**WhatsappGroupJoinRequestListResponse**](WhatsappGroupJoinRequestListResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved group join requests. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |

<a name="rejectJoinRequests"></a>
# **rejectJoinRequests**
> WhatsappGroupJoinRequestActionResponse rejectJoinRequests(businessPhoneNumber, groupId, whatsappGroupJoinRequestActionRequest)

Reject group join requests

Rejects one or more pending join requests for a WhatsApp group.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappGroupsApi apiInstance = new WhatsappGroupsApi(defaultClient);
    String businessPhoneNumber = "+16315551111"; // String | The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    String groupId = "120363345678901234@g.us"; // String | WhatsApp group ID.
    WhatsappGroupJoinRequestActionRequest whatsappGroupJoinRequestActionRequest = new WhatsappGroupJoinRequestActionRequest(); // WhatsappGroupJoinRequestActionRequest | 
    try {
      WhatsappGroupJoinRequestActionResponse result = apiInstance.rejectJoinRequests(businessPhoneNumber, groupId, whatsappGroupJoinRequestActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappGroupsApi#rejectJoinRequests");
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
| **businessPhoneNumber** | **String**| The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **groupId** | **String**| WhatsApp group ID. | |
| **whatsappGroupJoinRequestActionRequest** | [**WhatsappGroupJoinRequestActionRequest**](WhatsappGroupJoinRequestActionRequest.md)|  | |

### Return type

[**WhatsappGroupJoinRequestActionResponse**](WhatsappGroupJoinRequestActionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully processed the join request rejection. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |

<a name="removeParticipants"></a>
# **removeParticipants**
> WhatsappGroupAsyncResponse removeParticipants(groupId, whatsappGroupRemoveParticipantsRequest)

Remove group participants

Removes one or more participants from a WhatsApp group.  The request is processed asynchronously. Use webhooks to receive the final participants update result.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappGroupsApi apiInstance = new WhatsappGroupsApi(defaultClient);
    String groupId = "120363345678901234@g.us"; // String | WhatsApp group ID.
    WhatsappGroupRemoveParticipantsRequest whatsappGroupRemoveParticipantsRequest = new WhatsappGroupRemoveParticipantsRequest(); // WhatsappGroupRemoveParticipantsRequest | 
    try {
      WhatsappGroupAsyncResponse result = apiInstance.removeParticipants(groupId, whatsappGroupRemoveParticipantsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappGroupsApi#removeParticipants");
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
| **groupId** | **String**| WhatsApp group ID. | |
| **whatsappGroupRemoveParticipantsRequest** | [**WhatsappGroupRemoveParticipantsRequest**](WhatsappGroupRemoveParticipantsRequest.md)|  | |

### Return type

[**WhatsappGroupAsyncResponse**](WhatsappGroupAsyncResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The participant removal request is successfully accepted. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |

<a name="resetInviteLink"></a>
# **resetInviteLink**
> WhatsappGroupInviteLink resetInviteLink(businessPhoneNumber, groupId)

Reset a group invite link

Resets and returns the invite link for a WhatsApp group.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappGroupsApi apiInstance = new WhatsappGroupsApi(defaultClient);
    String businessPhoneNumber = "+16315551111"; // String | The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    String groupId = "120363345678901234@g.us"; // String | WhatsApp group ID.
    try {
      WhatsappGroupInviteLink result = apiInstance.resetInviteLink(businessPhoneNumber, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappGroupsApi#resetInviteLink");
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
| **businessPhoneNumber** | **String**| The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **groupId** | **String**| WhatsApp group ID. | |

### Return type

[**WhatsappGroupInviteLink**](WhatsappGroupInviteLink.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully reset the group invite link. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="retrieve"></a>
# **retrieve**
> WhatsappGroup retrieve(businessPhoneNumber, groupId)

Retrieve a group

Retrieves a WhatsApp group.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappGroupsApi apiInstance = new WhatsappGroupsApi(defaultClient);
    String businessPhoneNumber = "+16315551111"; // String | The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    String groupId = "120363345678901234@g.us"; // String | WhatsApp group ID.
    try {
      WhatsappGroup result = apiInstance.retrieve(businessPhoneNumber, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappGroupsApi#retrieve");
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
| **businessPhoneNumber** | **String**| The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **groupId** | **String**| WhatsApp group ID. | |

### Return type

[**WhatsappGroup**](WhatsappGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the group. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="retrieveInviteLink"></a>
# **retrieveInviteLink**
> WhatsappGroupInviteLink retrieveInviteLink(businessPhoneNumber, groupId)

Retrieve a group invite link

Retrieves the invite link for a WhatsApp group.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappGroupsApi apiInstance = new WhatsappGroupsApi(defaultClient);
    String businessPhoneNumber = "+16315551111"; // String | The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    String groupId = "120363345678901234@g.us"; // String | WhatsApp group ID.
    try {
      WhatsappGroupInviteLink result = apiInstance.retrieveInviteLink(businessPhoneNumber, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappGroupsApi#retrieveInviteLink");
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
| **businessPhoneNumber** | **String**| The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **groupId** | **String**| WhatsApp group ID. | |

### Return type

[**WhatsappGroupInviteLink**](WhatsappGroupInviteLink.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the group invite link. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |
| **404** | The requested resource does not exist. |  -  |

<a name="sendInviteLinkMessage"></a>
# **sendInviteLinkMessage**
> WhatsappMessage sendInviteLinkMessage(businessPhoneNumber, whatsappGroupInviteLinkMessageRequest)

Send a group invite link message

Sends a WhatsApp template message that contains the group invite link parameter.  This sends a message to an individual WhatsApp user. It does not send a message into the group conversation.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappGroupsApi apiInstance = new WhatsappGroupsApi(defaultClient);
    String businessPhoneNumber = "+16315551111"; // String | The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    WhatsappGroupInviteLinkMessageRequest whatsappGroupInviteLinkMessageRequest = new WhatsappGroupInviteLinkMessageRequest(); // WhatsappGroupInviteLinkMessageRequest | 
    try {
      WhatsappMessage result = apiInstance.sendInviteLinkMessage(businessPhoneNumber, whatsappGroupInviteLinkMessageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappGroupsApi#sendInviteLinkMessage");
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
| **businessPhoneNumber** | **String**| The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **whatsappGroupInviteLinkMessageRequest** | [**WhatsappGroupInviteLinkMessageRequest**](WhatsappGroupInviteLinkMessageRequest.md)|  | |

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
| **200** | The message request is successfully accepted. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |

<a name="updateSettings"></a>
# **updateSettings**
> WhatsappGroupAsyncResponse updateSettings(businessPhoneNumber, groupId, whatsappGroupUpdateSettingsRequest)

Update group settings

Updates a WhatsApp group&#39;s settings, such as subject or description.  The request is processed asynchronously. Use webhooks to receive the final settings update result.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappGroupsApi apiInstance = new WhatsappGroupsApi(defaultClient);
    String businessPhoneNumber = "+16315551111"; // String | The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    String groupId = "120363345678901234@g.us"; // String | WhatsApp group ID.
    WhatsappGroupUpdateSettingsRequest whatsappGroupUpdateSettingsRequest = new WhatsappGroupUpdateSettingsRequest(); // WhatsappGroupUpdateSettingsRequest | 
    try {
      WhatsappGroupAsyncResponse result = apiInstance.updateSettings(businessPhoneNumber, groupId, whatsappGroupUpdateSettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappGroupsApi#updateSettings");
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
| **businessPhoneNumber** | **String**| The WhatsApp business phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. | |
| **groupId** | **String**| WhatsApp group ID. | |
| **whatsappGroupUpdateSettingsRequest** | [**WhatsappGroupUpdateSettingsRequest**](WhatsappGroupUpdateSettingsRequest.md)|  | |

### Return type

[**WhatsappGroupAsyncResponse**](WhatsappGroupAsyncResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The group settings update request is successfully accepted. |  -  |
| **400** | Bad request. Invalid request parameters. |  -  |

