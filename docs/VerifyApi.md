# VerifyApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**check**](VerifyApi.md#check) | **POST** /verify/verificationChecks | Check a verification |
| [**send**](VerifyApi.md#send) | **POST** /verify/verifications | Start a verification |


<a name="check"></a>
# **check**
> VerificationCheck check(verificationCheckRequest)

Check a verification

Checks a verification with a phone number, an email address, or a verification ID. A &#x60;pending&#x60; verification status changes to &#x60;approved&#x60; once you receive a response with the &#x60;valid&#x60; parameter is &#x60;true&#x60;. An approved verification cannot be checked anymore.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.VerifyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VerifyApi apiInstance = new VerifyApi(defaultClient);
    VerificationCheckRequest verificationCheckRequest = new VerificationCheckRequest(); // VerificationCheckRequest | 
    try {
      VerificationCheck result = apiInstance.check(verificationCheckRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyApi#check");
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
| **verificationCheckRequest** | [**VerificationCheckRequest**](VerificationCheckRequest.md)|  | |

### Return type

[**VerificationCheck**](VerificationCheck.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The verification check is successfully processed. |  -  |

<a name="send"></a>
# **send**
> Verification send(verificationSendRequest)

Start a verification

Starts a verification by sending an SMS, voice, or email message to the recipient. This verification is charged once the message is sent successfully.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.VerifyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VerifyApi apiInstance = new VerifyApi(defaultClient);
    VerificationSendRequest verificationSendRequest = new VerificationSendRequest(); // VerificationSendRequest | Verification request that needs to be sent.
    try {
      Verification result = apiInstance.send(verificationSendRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyApi#send");
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
| **verificationSendRequest** | [**VerificationSendRequest**](VerificationSendRequest.md)| Verification request that needs to be sent. | |

### Return type

[**Verification**](Verification.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successfully accepted. |  -  |

