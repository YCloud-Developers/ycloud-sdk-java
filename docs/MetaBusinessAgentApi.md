# MetaBusinessAgentApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**budgetReplace**](MetaBusinessAgentApi.md#budgetReplace) | **PUT** /metaBusinessAgents/{entityId}/budgets | Replace Meta Business Agent budgets |
| [**budgetRetrieve**](MetaBusinessAgentApi.md#budgetRetrieve) | **GET** /metaBusinessAgents/{entityId}/budgets | Retrieve Meta Business Agent budgets |
| [**businessAgentCreateConnector**](MetaBusinessAgentApi.md#businessAgentCreateConnector) | **POST** /metaBusinessAgents/{entityId}/connectors | Create Connector |
| [**businessAgentCreateConnectorTool**](MetaBusinessAgentApi.md#businessAgentCreateConnectorTool) | **POST** /metaBusinessAgents/{entityId}/connectors/{connectorId}/tools | Create Connector Tool |
| [**businessAgentDeleteConnector**](MetaBusinessAgentApi.md#businessAgentDeleteConnector) | **DELETE** /metaBusinessAgents/{entityId}/connectors/{connectorId} | Delete Connector |
| [**businessAgentDeleteConnectorTool**](MetaBusinessAgentApi.md#businessAgentDeleteConnectorTool) | **DELETE** /metaBusinessAgents/{entityId}/connectors/{connectorId}/tools/{toolId} | Delete Connector Tool |
| [**businessAgentGetConnector**](MetaBusinessAgentApi.md#businessAgentGetConnector) | **GET** /metaBusinessAgents/{entityId}/connectors/{connectorId} | Get Connector |
| [**businessAgentGetConnectorTool**](MetaBusinessAgentApi.md#businessAgentGetConnectorTool) | **GET** /metaBusinessAgents/{entityId}/connectors/{connectorId}/tools/{toolId} | Get Connector Tool |
| [**businessAgentListConnectorLogs**](MetaBusinessAgentApi.md#businessAgentListConnectorLogs) | **GET** /metaBusinessAgents/{entityId}/connectors/{connectorId}/logs | List Connector Logs |
| [**businessAgentListConnectorTools**](MetaBusinessAgentApi.md#businessAgentListConnectorTools) | **GET** /metaBusinessAgents/{entityId}/connectors/{connectorId}/tools | List Connector Tools |
| [**businessAgentListConnectors**](MetaBusinessAgentApi.md#businessAgentListConnectors) | **GET** /metaBusinessAgents/{entityId}/connectors | List Connectors |
| [**businessAgentRefreshConnectorMcpTools**](MetaBusinessAgentApi.md#businessAgentRefreshConnectorMcpTools) | **POST** /metaBusinessAgents/{entityId}/connectors/{connectorId}/refreshMCPTools | Refresh MCP Connector Tools |
| [**businessAgentRunConnectorTool**](MetaBusinessAgentApi.md#businessAgentRunConnectorTool) | **POST** /metaBusinessAgents/{entityId}/connectors/{connectorId}/tools/{toolId}/runs | Run Connector Tool |
| [**businessAgentUpdateConnector**](MetaBusinessAgentApi.md#businessAgentUpdateConnector) | **PATCH** /metaBusinessAgents/{entityId}/connectors/{connectorId} | Update Connector |
| [**businessAgentUpdateConnectorTool**](MetaBusinessAgentApi.md#businessAgentUpdateConnectorTool) | **PATCH** /metaBusinessAgents/{entityId}/connectors/{connectorId}/tools/{toolId} | Update Connector Tool |
| [**businessAgentUpsertConnectorApiKey**](MetaBusinessAgentApi.md#businessAgentUpsertConnectorApiKey) | **PUT** /metaBusinessAgents/{entityId}/connectors/{connectorId}/credentials/apiKey | Upsert Connector Api Key |
| [**businessAgentUpsertConnectorCertificate**](MetaBusinessAgentApi.md#businessAgentUpsertConnectorCertificate) | **PUT** /metaBusinessAgents/{entityId}/connectors/{connectorId}/credentials/certificate | Upsert Connector Certificate |
| [**businessAgentUpsertConnectorOAuth**](MetaBusinessAgentApi.md#businessAgentUpsertConnectorOAuth) | **PUT** /metaBusinessAgents/{entityId}/connectors/{connectorId}/credentials/oauth | Upsert Connector O Auth |
| [**conversationTurnsRetrieve**](MetaBusinessAgentApi.md#conversationTurnsRetrieve) | **GET** /metaBusinessAgents/{entityId}/conversationTurns | Retrieve Meta Business Agent conversation turns |
| [**settingsReplace**](MetaBusinessAgentApi.md#settingsReplace) | **PUT** /metaBusinessAgents/{entityId}/settings | Replace Meta Business Agent settings |
| [**settingsRetrieve**](MetaBusinessAgentApi.md#settingsRetrieve) | **GET** /metaBusinessAgents/{entityId}/settings | Retrieve Meta Business Agent settings |


<a name="budgetReplace"></a>
# **budgetReplace**
> MetaBusinessAgentBudgetResponse budgetReplace(entityId, metaBusinessAgentBudgetReplaceRequest)

Replace Meta Business Agent budgets

Replaces the complete Budget collection. Include both &#x60;token&#x60; and &#x60;ai_turn&#x60; entries that should remain. An empty collection removes all limits and restores unlimited usage.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "1249005978294267"; // String | Endpoint-specific Meta Business Agent entity ID. Budget and Conversation Turns operations use the tenant-owned WhatsApp Business Phone Number ID.
    MetaBusinessAgentBudgetReplaceRequest metaBusinessAgentBudgetReplaceRequest = new MetaBusinessAgentBudgetReplaceRequest(); // MetaBusinessAgentBudgetReplaceRequest |
    try {
      MetaBusinessAgentBudgetResponse result = apiInstance.budgetReplace(entityId, metaBusinessAgentBudgetReplaceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#budgetReplace");
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
| **entityId** | **String**| Endpoint-specific Meta Business Agent entity ID. Budget and Conversation Turns operations use the tenant-owned WhatsApp Business Phone Number ID. | |
| **metaBusinessAgentBudgetReplaceRequest** | [**MetaBusinessAgentBudgetReplaceRequest**](MetaBusinessAgentBudgetReplaceRequest.md)|  | |

### Return type

[**MetaBusinessAgentBudgetResponse**](MetaBusinessAgentBudgetResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully replaced the Budget collection. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **422** | The request is well-formed but cannot be processed. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="budgetRetrieve"></a>
# **budgetRetrieve**
> MetaBusinessAgentBudgetResponse budgetRetrieve(entityId)

Retrieve Meta Business Agent budgets

Retrieves the complete Budget collection for the Business Manager associated with the specified WhatsApp Business Phone Number ID.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "1249005978294267"; // String | Endpoint-specific Meta Business Agent entity ID. Budget and Conversation Turns operations use the tenant-owned WhatsApp Business Phone Number ID.
    try {
      MetaBusinessAgentBudgetResponse result = apiInstance.budgetRetrieve(entityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#budgetRetrieve");
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
| **entityId** | **String**| Endpoint-specific Meta Business Agent entity ID. Budget and Conversation Turns operations use the tenant-owned WhatsApp Business Phone Number ID. | |

### Return type

[**MetaBusinessAgentBudgetResponse**](MetaBusinessAgentBudgetResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the Budget collection. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **422** | The request is well-formed but cannot be processed. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentCreateConnector"></a>
# **businessAgentCreateConnector**
> ConnectorDTO businessAgentCreateConnector(entityId, publicCreateConnectorRequest)

Create Connector

Creates an external API connector with its name, description, base URL, authentication type, and optional user-auth or certificate configuration. For MCP, base_url is the remote MCP server address and authentication uses the existing auth fields. Creating a connector does not guarantee discovered tools are immediately ready; inspect mcp_tool_sync when returned.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    PublicCreateConnectorRequest publicCreateConnectorRequest = new PublicCreateConnectorRequest(); // PublicCreateConnectorRequest |
    try {
      ConnectorDTO result = apiInstance.businessAgentCreateConnector(entityId, publicCreateConnectorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentCreateConnector");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **publicCreateConnectorRequest** | [**PublicCreateConnectorRequest**](PublicCreateConnectorRequest.md)|  | |

### Return type

[**ConnectorDTO**](ConnectorDTO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentCreateConnectorTool"></a>
# **businessAgentCreateConnectorTool**
> ConnectorToolDTO businessAgentCreateConnectorTool(entityId, connectorId, publicCreateConnectorToolRequest)

Create Connector Tool

Creates a tool under &#x60;connectorId&#x60;, including its agent-facing description, outbound request definition, and optional user-auth extraction configuration. transformation_spec is optional: omit it to preserve an existing transformation on update, send null to delete it, or send an object to set it.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    String connectorId = "connectorId_example"; // String | Connector resource ID.
    PublicCreateConnectorToolRequest publicCreateConnectorToolRequest = new PublicCreateConnectorToolRequest(); // PublicCreateConnectorToolRequest |
    try {
      ConnectorToolDTO result = apiInstance.businessAgentCreateConnectorTool(entityId, connectorId, publicCreateConnectorToolRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentCreateConnectorTool");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **connectorId** | **String**| Connector resource ID. | |
| **publicCreateConnectorToolRequest** | [**PublicCreateConnectorToolRequest**](PublicCreateConnectorToolRequest.md)|  | |

### Return type

[**ConnectorToolDTO**](ConnectorToolDTO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentDeleteConnector"></a>
# **businessAgentDeleteConnector**
> businessAgentDeleteConnector(entityId, connectorId)

Delete Connector

Deletes the external API connector identified by &#x60;connectorId&#x60; from the agent configuration.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    String connectorId = "connectorId_example"; // String | Connector resource ID.
    try {
      apiInstance.businessAgentDeleteConnector(entityId, connectorId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentDeleteConnector");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **connectorId** | **String**| Connector resource ID. | |

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
| **204** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentDeleteConnectorTool"></a>
# **businessAgentDeleteConnectorTool**
> businessAgentDeleteConnectorTool(entityId, connectorId, toolId)

Delete Connector Tool

Deletes the tool identified by &#x60;toolId&#x60; from &#x60;connectorId&#x60;.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    String connectorId = "connectorId_example"; // String | Connector resource ID.
    String toolId = "toolId_example"; // String | Connector tool resource ID.
    try {
      apiInstance.businessAgentDeleteConnectorTool(entityId, connectorId, toolId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentDeleteConnectorTool");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **connectorId** | **String**| Connector resource ID. | |
| **toolId** | **String**| Connector tool resource ID. | |

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
| **204** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentGetConnector"></a>
# **businessAgentGetConnector**
> ConnectorDTO businessAgentGetConnector(entityId, connectorId)

Get Connector

Retrieves the external API connector identified by &#x60;connectorId&#x60;.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    String connectorId = "connectorId_example"; // String | Connector resource ID.
    try {
      ConnectorDTO result = apiInstance.businessAgentGetConnector(entityId, connectorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentGetConnector");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **connectorId** | **String**| Connector resource ID. | |

### Return type

[**ConnectorDTO**](ConnectorDTO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentGetConnectorTool"></a>
# **businessAgentGetConnectorTool**
> ConnectorToolDTO businessAgentGetConnectorTool(entityId, connectorId, toolId)

Get Connector Tool

Retrieves the connector tool identified by &#x60;toolId&#x60;, including its outbound request and user-auth definitions.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    String connectorId = "connectorId_example"; // String | Connector resource ID.
    String toolId = "toolId_example"; // String | Connector tool resource ID.
    try {
      ConnectorToolDTO result = apiInstance.businessAgentGetConnectorTool(entityId, connectorId, toolId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentGetConnectorTool");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **connectorId** | **String**| Connector resource ID. | |
| **toolId** | **String**| Connector tool resource ID. | |

### Return type

[**ConnectorToolDTO**](ConnectorToolDTO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentListConnectorLogs"></a>
# **businessAgentListConnectorLogs**
> ConnectorLogStatsDTO businessAgentListConnectorLogs(entityId, connectorId, startTime, endTime, limit, toolId, includeStats, summaryOnly, topN)

List Connector Logs

Retrieves third-party connector error logs for the requested time and tool filters. It can return individual entries, aggregated failure patterns, and optional success-rate or latency statistics; Meta limits the query window and retention to seven days.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    String connectorId = "connectorId_example"; // String | Connector resource ID.
    Long startTime = 56L; // Long |
    Long endTime = 56L; // Long |
    Integer limit = 56; // Integer |
    String toolId = "toolId_example"; // String |
    Boolean includeStats = true; // Boolean |
    Boolean summaryOnly = true; // Boolean |
    Integer topN = 56; // Integer |
    try {
      ConnectorLogStatsDTO result = apiInstance.businessAgentListConnectorLogs(entityId, connectorId, startTime, endTime, limit, toolId, includeStats, summaryOnly, topN);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentListConnectorLogs");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **connectorId** | **String**| Connector resource ID. | |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **toolId** | **String**|  | [optional] |
| **includeStats** | **Boolean**|  | [optional] |
| **summaryOnly** | **Boolean**|  | [optional] |
| **topN** | **Integer**|  | [optional] |

### Return type

[**ConnectorLogStatsDTO**](ConnectorLogStatsDTO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentListConnectorTools"></a>
# **businessAgentListConnectorTools**
> List&lt;ConnectorToolDTO&gt; businessAgentListConnectorTools(entityId, connectorId)

List Connector Tools

Lists the tool operations defined under &#x60;connectorId&#x60; that the agent can use to call the external service.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    String connectorId = "connectorId_example"; // String | Connector resource ID.
    try {
      List<ConnectorToolDTO> result = apiInstance.businessAgentListConnectorTools(entityId, connectorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentListConnectorTools");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **connectorId** | **String**| Connector resource ID. | |

### Return type

[**List&lt;ConnectorToolDTO&gt;**](ConnectorToolDTO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentListConnectors"></a>
# **businessAgentListConnectors**
> List&lt;ConnectorDTO&gt; businessAgentListConnectors(entityId)

List Connectors

Lists the external API connectors configured for the agent, including their endpoint and authentication definitions.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    try {
      List<ConnectorDTO> result = apiInstance.businessAgentListConnectors(entityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentListConnectors");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |

### Return type

[**List&lt;ConnectorDTO&gt;**](ConnectorDTO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentRefreshConnectorMcpTools"></a>
# **businessAgentRefreshConnectorMcpTools**
> ConnectorDTO businessAgentRefreshConnectorMcpTools(entityId, connectorId)

Refresh MCP Connector Tools

Triggers Meta to rediscover the MCP tools exposed by this connector. The request has no body. A successful HTTP 200 returns the current Connector; inspect mcp_tool_sync.status because remote discovery or provisioning failure can still return HTTP 200 with status ERROR. This operation has no idempotency key. Do not retry it automatically; after a timeout, query the Connector because the refresh outcome is uncertain.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    String connectorId = "connectorId_example"; // String | Meta Connector ID returned by the Connector API. This is not a YCloud local Connector UUID.
    try {
      ConnectorDTO result = apiInstance.businessAgentRefreshConnectorMcpTools(entityId, connectorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentRefreshConnectorMcpTools");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **connectorId** | **String**| Meta Connector ID returned by the Connector API. This is not a YCloud local Connector UUID. | |

### Return type

[**ConnectorDTO**](ConnectorDTO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Refresh request completed. Inspect mcp_tool_sync.status for discovery outcome. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentRunConnectorTool"></a>
# **businessAgentRunConnectorTool**
> ConnectorToolRunResultDTO businessAgentRunConnectorTool(entityId, connectorId, toolId, publicRunConnectorToolRequest)

Run Connector Tool

Executes the connector tool identified by &#x60;toolId&#x60; with the supplied &#x60;input&#x60; and returns the upstream API result exposed by Meta.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    String connectorId = "connectorId_example"; // String | Connector resource ID.
    String toolId = "toolId_example"; // String | Connector tool resource ID.
    PublicRunConnectorToolRequest publicRunConnectorToolRequest = new PublicRunConnectorToolRequest(); // PublicRunConnectorToolRequest |
    try {
      ConnectorToolRunResultDTO result = apiInstance.businessAgentRunConnectorTool(entityId, connectorId, toolId, publicRunConnectorToolRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentRunConnectorTool");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **connectorId** | **String**| Connector resource ID. | |
| **toolId** | **String**| Connector tool resource ID. | |
| **publicRunConnectorToolRequest** | [**PublicRunConnectorToolRequest**](PublicRunConnectorToolRequest.md)|  | |

### Return type

[**ConnectorToolRunResultDTO**](ConnectorToolRunResultDTO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentUpdateConnector"></a>
# **businessAgentUpdateConnector**
> ConnectorDTO businessAgentUpdateConnector(entityId, connectorId, publicUpdateConnectorRequest)

Update Connector

Updates the connector definition identified by &#x60;connectorId&#x60;, including its descriptive, endpoint, authentication, and certificate requirement fields. connector_protocol cannot be changed after creation.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    String connectorId = "connectorId_example"; // String | Connector resource ID.
    PublicUpdateConnectorRequest publicUpdateConnectorRequest = new PublicUpdateConnectorRequest(); // PublicUpdateConnectorRequest |
    try {
      ConnectorDTO result = apiInstance.businessAgentUpdateConnector(entityId, connectorId, publicUpdateConnectorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentUpdateConnector");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **connectorId** | **String**| Connector resource ID. | |
| **publicUpdateConnectorRequest** | [**PublicUpdateConnectorRequest**](PublicUpdateConnectorRequest.md)|  | |

### Return type

[**ConnectorDTO**](ConnectorDTO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentUpdateConnectorTool"></a>
# **businessAgentUpdateConnectorTool**
> ConnectorToolDTO businessAgentUpdateConnectorTool(entityId, connectorId, toolId, publicUpdateConnectorToolRequest)

Update Connector Tool

Updates the name, description, outbound request definition, and user-auth configuration of the connector tool identified by &#x60;toolId&#x60;. transformation_spec is optional: omit it to preserve an existing transformation on update, send null to delete it, or send an object to set it.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    String connectorId = "connectorId_example"; // String | Connector resource ID.
    String toolId = "toolId_example"; // String | Connector tool resource ID.
    PublicUpdateConnectorToolRequest publicUpdateConnectorToolRequest = new PublicUpdateConnectorToolRequest(); // PublicUpdateConnectorToolRequest |
    try {
      ConnectorToolDTO result = apiInstance.businessAgentUpdateConnectorTool(entityId, connectorId, toolId, publicUpdateConnectorToolRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentUpdateConnectorTool");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **connectorId** | **String**| Connector resource ID. | |
| **toolId** | **String**| Connector tool resource ID. | |
| **publicUpdateConnectorToolRequest** | [**PublicUpdateConnectorToolRequest**](PublicUpdateConnectorToolRequest.md)|  | |

### Return type

[**ConnectorToolDTO**](ConnectorToolDTO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentUpsertConnectorApiKey"></a>
# **businessAgentUpsertConnectorApiKey**
> ConnectorDTO businessAgentUpsertConnectorApiKey(entityId, connectorId, publicUpsertConnectorApiKeyRequest)

Upsert Connector Api Key

Sets or rotates the API key credentials for &#x60;connectorId&#x60;. Existing API key credentials are replaced, and the updated connector is returned.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    String connectorId = "connectorId_example"; // String | Connector resource ID.
    PublicUpsertConnectorApiKeyRequest publicUpsertConnectorApiKeyRequest = new PublicUpsertConnectorApiKeyRequest(); // PublicUpsertConnectorApiKeyRequest |
    try {
      ConnectorDTO result = apiInstance.businessAgentUpsertConnectorApiKey(entityId, connectorId, publicUpsertConnectorApiKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentUpsertConnectorApiKey");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **connectorId** | **String**| Connector resource ID. | |
| **publicUpsertConnectorApiKeyRequest** | [**PublicUpsertConnectorApiKeyRequest**](PublicUpsertConnectorApiKeyRequest.md)|  | |

### Return type

[**ConnectorDTO**](ConnectorDTO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentUpsertConnectorCertificate"></a>
# **businessAgentUpsertConnectorCertificate**
> ConnectorDTO businessAgentUpsertConnectorCertificate(entityId, connectorId, publicUpsertConnectorCertificateRequest)

Upsert Connector Certificate

Uploads or rotates the mTLS client certificate, private key, and optional CA certificate for &#x60;connectorId&#x60;, then returns the updated connector.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    String connectorId = "connectorId_example"; // String | Connector resource ID.
    PublicUpsertConnectorCertificateRequest publicUpsertConnectorCertificateRequest = new PublicUpsertConnectorCertificateRequest(); // PublicUpsertConnectorCertificateRequest |
    try {
      ConnectorDTO result = apiInstance.businessAgentUpsertConnectorCertificate(entityId, connectorId, publicUpsertConnectorCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentUpsertConnectorCertificate");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **connectorId** | **String**| Connector resource ID. | |
| **publicUpsertConnectorCertificateRequest** | [**PublicUpsertConnectorCertificateRequest**](PublicUpsertConnectorCertificateRequest.md)|  | |

### Return type

[**ConnectorDTO**](ConnectorDTO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="businessAgentUpsertConnectorOAuth"></a>
# **businessAgentUpsertConnectorOAuth**
> ConnectorDTO businessAgentUpsertConnectorOAuth(entityId, connectorId, publicUpsertConnectorOAuthRequest)

Upsert Connector O Auth

Sets or rotates the OAuth 2.0 client credentials for &#x60;connectorId&#x60;. Existing OAuth credentials are replaced, and the updated connector is returned.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "entityId_example"; // String | WhatsApp Business Phone Number ID that owns the Meta Business Agent.
    String connectorId = "connectorId_example"; // String | Connector resource ID.
    PublicUpsertConnectorOAuthRequest publicUpsertConnectorOAuthRequest = new PublicUpsertConnectorOAuthRequest(); // PublicUpsertConnectorOAuthRequest |
    try {
      ConnectorDTO result = apiInstance.businessAgentUpsertConnectorOAuth(entityId, connectorId, publicUpsertConnectorOAuthRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#businessAgentUpsertConnectorOAuth");
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
| **entityId** | **String**| WhatsApp Business Phone Number ID that owns the Meta Business Agent. | |
| **connectorId** | **String**| Connector resource ID. | |
| **publicUpsertConnectorOAuthRequest** | [**PublicUpsertConnectorOAuthRequest**](PublicUpsertConnectorOAuthRequest.md)|  | |

### Return type

[**ConnectorDTO**](ConnectorDTO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation completed successfully. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **409** | The requested operation conflicts with the current resource state. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="conversationTurnsRetrieve"></a>
# **conversationTurnsRetrieve**
> MetaBusinessAgentConversationTurnPage conversationTurnsRetrieve(entityId, userPhoneNumber).startTimestampMs(startTimestampMs).endTimestampMs(endTimestampMs).before(before).after(after).limit(limit).execute();

Retrieve Meta Business Agent conversation turns

Retrieves conversation turns for one WhatsApp user. &#x60;entityId&#x60; is the WhatsApp Business Phone Number ID. Timestamp boundaries are inclusive and use Unix epoch milliseconds. Supply at most one of &#x60;before&#x60; and &#x60;after&#x60;; cursors are opaque. Continue pagination while &#x60;paging.next&#x60; is present, including when the current &#x60;data&#x60; array is empty.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "1249005978294267"; // String | Endpoint-specific Meta Business Agent entity ID. Budget and Conversation Turns operations use the tenant-owned WhatsApp Business Phone Number ID.
    String userPhoneNumber = "14155550123"; // String | WhatsApp user phone number including the country code, with digits only and no leading `+`, spaces, or separators.
    Long startTimestampMs = 56L; // Long | Inclusive start time as Unix epoch milliseconds.
    Long endTimestampMs = 56L; // Long | Inclusive end time as Unix epoch milliseconds. Must be greater than or equal to `start_timestamp_ms` when both are supplied.
    String before = "before_example"; // String | Opaque backward-pagination cursor. Do not combine with `after`.
    String after = "after_example"; // String | Opaque forward-pagination cursor. Do not combine with `before`.
    Integer limit = 56; // Integer | Maximum number of conversation turns to return.
    try {
      MetaBusinessAgentConversationTurnPage result = apiInstance.conversationTurnsRetrieve(entityId, userPhoneNumber)
            .startTimestampMs(startTimestampMs)
            .endTimestampMs(endTimestampMs)
            .before(before)
            .after(after)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#conversationTurnsRetrieve");
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
| **entityId** | **String**| Endpoint-specific Meta Business Agent entity ID. Budget and Conversation Turns operations use the tenant-owned WhatsApp Business Phone Number ID. | |
| **userPhoneNumber** | **String**| WhatsApp user phone number including the country code, with digits only and no leading &#x60;+&#x60;, spaces, or separators. | |
| **startTimestampMs** | **Long**| Inclusive start time as Unix epoch milliseconds. | [optional] |
| **endTimestampMs** | **Long**| Inclusive end time as Unix epoch milliseconds. Must be greater than or equal to &#x60;start_timestamp_ms&#x60; when both are supplied. | [optional] |
| **before** | **String**| Opaque backward-pagination cursor. Do not combine with &#x60;after&#x60;. | [optional] |
| **after** | **String**| Opaque forward-pagination cursor. Do not combine with &#x60;before&#x60;. | [optional] |
| **limit** | **Integer**| Maximum number of conversation turns to return. | [optional] |

### Return type

[**MetaBusinessAgentConversationTurnPage**](MetaBusinessAgentConversationTurnPage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved conversation turns. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **404** | The requested Meta Business Agent resource was not found. |  -  |
| **422** | The request is well-formed but cannot be processed. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="settingsReplace"></a>
# **settingsReplace**
> MetaBusinessAgentSettings settingsReplace(entityId, metaBusinessAgentSettingsReplaceRequest)

Replace Meta Business Agent settings

Replaces the supplied settings fields. Omitting &#x60;never_say_phrases&#x60; preserves the current list, an empty list clears it, and a non-empty list fully replaces it.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "1249005978294267"; // String | Endpoint-specific Meta Business Agent entity ID. Budget and Conversation Turns operations use the tenant-owned WhatsApp Business Phone Number ID.
    MetaBusinessAgentSettingsReplaceRequest metaBusinessAgentSettingsReplaceRequest = new MetaBusinessAgentSettingsReplaceRequest(); // MetaBusinessAgentSettingsReplaceRequest |
    try {
      MetaBusinessAgentSettings result = apiInstance.settingsReplace(entityId, metaBusinessAgentSettingsReplaceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#settingsReplace");
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
| **entityId** | **String**| Endpoint-specific Meta Business Agent entity ID. Budget and Conversation Turns operations use the tenant-owned WhatsApp Business Phone Number ID. | |
| **metaBusinessAgentSettingsReplaceRequest** | [**MetaBusinessAgentSettingsReplaceRequest**](MetaBusinessAgentSettingsReplaceRequest.md)|  | |

### Return type

[**MetaBusinessAgentSettings**](MetaBusinessAgentSettings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully replaced the settings. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |

<a name="settingsRetrieve"></a>
# **settingsRetrieve**
> List&lt;MetaBusinessAgentSettings&gt; settingsRetrieve(entityId).agentId(agentId).execute();

Retrieve Meta Business Agent settings

Retrieves the settings associated with the specified Meta Business Agent entity.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.MetaBusinessAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");

    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetaBusinessAgentApi apiInstance = new MetaBusinessAgentApi(defaultClient);
    String entityId = "1249005978294267"; // String | Endpoint-specific Meta Business Agent entity ID. Budget and Conversation Turns operations use the tenant-owned WhatsApp Business Phone Number ID.
    String agentId = "agentId_example"; // String | Optional Meta Agent ID used to select one settings record.
    try {
      List<MetaBusinessAgentSettings> result = apiInstance.settingsRetrieve(entityId)
            .agentId(agentId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaBusinessAgentApi#settingsRetrieve");
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
| **entityId** | **String**| Endpoint-specific Meta Business Agent entity ID. Budget and Conversation Turns operations use the tenant-owned WhatsApp Business Phone Number ID. | |
| **agentId** | **String**| Optional Meta Agent ID used to select one settings record. | [optional] |

### Return type

[**List&lt;MetaBusinessAgentSettings&gt;**](MetaBusinessAgentSettings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the settings. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | A valid API key is required. |  -  |
| **403** | The tenant does not own the requested resource or lacks the required Meta permission. |  -  |
| **429** | Too many requests were sent to YCloud or Meta. |  -  |
| **500** | An internal server error occurred. |  -  |
| **502** | Meta Business Agent returned an invalid or unavailable upstream response. |  -  |
