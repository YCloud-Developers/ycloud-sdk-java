/*
 * YCloud API
 * The [YCloud](https://ycloud.com) API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer). Our API is designed to have predictable, resource-oriented URLs, return [JSON](https://www.json.org) responses, and use standard HTTP response codes and verbs.
 *
 * The version of the OpenAPI document: v2
 * Contact: service@ycloud.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ycloud.client.api;

import com.ycloud.client.ApiCallback;
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.ApiResponse;
import com.ycloud.client.Configuration;
import com.ycloud.client.Pair;
import com.ycloud.client.ProgressRequestBody;
import com.ycloud.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ycloud.client.model.ErrorResponse;
import java.io.File;
import com.ycloud.client.model.WhatsappMediaUpload200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WhatsappMediaApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WhatsappMediaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WhatsappMediaApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for upload
     * @param phoneNumber Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format to use for the upload. (required)
     * @param file The media file to upload. Only one file is supported. If multiple files are uploaded, only the first file will be processed. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully uploaded the media. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. The file may be invalid or exceed size limits. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadCall(String phoneNumber, File file, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/whatsapp/media/{phoneNumber}/upload"
            .replaceAll("\\{" + "phoneNumber" + "\\}", localVarApiClient.escapeString(phoneNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (file != null) {
            localVarFormParams.put("file", file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call uploadValidateBeforeCall(String phoneNumber, File file, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'phoneNumber' is set
        if (phoneNumber == null) {
            throw new ApiException("Missing the required parameter 'phoneNumber' when calling upload(Async)");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling upload(Async)");
        }
        

        okhttp3.Call localVarCall = uploadCall(phoneNumber, file, _callback);
        return localVarCall;

    }

    /**
     * Upload media
     * <p>
     * Uploads media that can later be sent in WhatsApp messages. This endpoint interfaces with Meta&#39;s WhatsApp Business API media endpoints. All media files sent through this endpoint are encrypted and persist for 30 days.  For supported media types and size limitations, please refer to [Supported Media Types](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/media#supported-media-types).  For more information, refer to [Meta&#39;s WhatsApp Cloud API Media documentation](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/media).  Note that all interactive messages cannot send images, documents, videos, or audio using a Media ID in the header section. These elements must be sent using a link.
     * @param phoneNumber Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format to use for the upload. (required)
     * @param file The media file to upload. Only one file is supported. If multiple files are uploaded, only the first file will be processed. (required)
     * @return WhatsappMediaUpload200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully uploaded the media. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. The file may be invalid or exceed size limits. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist. </td><td>  -  </td></tr>
     </table>
     */
    public WhatsappMediaUpload200Response upload(String phoneNumber, File file) throws ApiException {
        ApiResponse<WhatsappMediaUpload200Response> localVarResp = uploadWithHttpInfo(phoneNumber, file);
        return localVarResp.getData();
    }

    /**
     * Upload media
     * <p>
     * Uploads media that can later be sent in WhatsApp messages. This endpoint interfaces with Meta&#39;s WhatsApp Business API media endpoints. All media files sent through this endpoint are encrypted and persist for 30 days.  For supported media types and size limitations, please refer to [Supported Media Types](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/media#supported-media-types).  For more information, refer to [Meta&#39;s WhatsApp Cloud API Media documentation](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/media).  Note that all interactive messages cannot send images, documents, videos, or audio using a Media ID in the header section. These elements must be sent using a link.
     * @param phoneNumber Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format to use for the upload. (required)
     * @param file The media file to upload. Only one file is supported. If multiple files are uploaded, only the first file will be processed. (required)
     * @return ApiResponse&lt;WhatsappMediaUpload200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully uploaded the media. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. The file may be invalid or exceed size limits. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WhatsappMediaUpload200Response> uploadWithHttpInfo(String phoneNumber, File file) throws ApiException {
        okhttp3.Call localVarCall = uploadValidateBeforeCall(phoneNumber, file, null);
        Type localVarReturnType = new TypeToken<WhatsappMediaUpload200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upload media (asynchronously)
     * <p>
     * Uploads media that can later be sent in WhatsApp messages. This endpoint interfaces with Meta&#39;s WhatsApp Business API media endpoints. All media files sent through this endpoint are encrypted and persist for 30 days.  For supported media types and size limitations, please refer to [Supported Media Types](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/media#supported-media-types).  For more information, refer to [Meta&#39;s WhatsApp Cloud API Media documentation](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/media).  Note that all interactive messages cannot send images, documents, videos, or audio using a Media ID in the header section. These elements must be sent using a link.
     * @param phoneNumber Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format to use for the upload. (required)
     * @param file The media file to upload. Only one file is supported. If multiple files are uploaded, only the first file will be processed. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully uploaded the media. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. The file may be invalid or exceed size limits. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadAsync(String phoneNumber, File file, final ApiCallback<WhatsappMediaUpload200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadValidateBeforeCall(phoneNumber, file, _callback);
        Type localVarReturnType = new TypeToken<WhatsappMediaUpload200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
