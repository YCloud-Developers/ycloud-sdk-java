# WhatsappMediaApi

All URIs are relative to *https://api.ycloud.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**upload**](WhatsappMediaApi.md#upload) | **POST** /whatsapp/media/{phoneNumber}/upload | Upload media |


<a name="upload"></a>
# **upload**
> WhatsappMediaUpload200Response upload(phoneNumber, file)

Upload media

Uploads media that can later be sent in WhatsApp messages. This endpoint interfaces with Meta&#39;s WhatsApp Business API media endpoints. All media files sent through this endpoint are encrypted and persist for 30 days.  For supported media types and size limitations, please refer to [Supported Media Types](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/media#supported-media-types).  For more information, refer to [Meta&#39;s WhatsApp Cloud API Media documentation](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/media).  Note that all interactive messages cannot send images, documents, videos, or audio using a Media ID in the header section. These elements must be sent using a link.

### Example
```java
// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.WhatsappMediaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WhatsappMediaApi apiInstance = new WhatsappMediaApi(defaultClient);
    String phoneNumber = "+16315551111"; // String | Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format to use for the upload.
    File file = new File("/path/to/file"); // File | The media file to upload. Only one file is supported. If multiple files are uploaded, only the first file will be processed.
    try {
      WhatsappMediaUpload200Response result = apiInstance.upload(phoneNumber, file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsappMediaApi#upload");
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
| **phoneNumber** | **String**| Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format to use for the upload. | |
| **file** | **File**| The media file to upload. Only one file is supported. If multiple files are uploaded, only the first file will be processed. | |

### Return type

[**WhatsappMediaUpload200Response**](WhatsappMediaUpload200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully uploaded the media. |  -  |
| **400** | Bad request. The file may be invalid or exceed size limits. |  -  |
| **404** | The requested resource does not exist. |  -  |

