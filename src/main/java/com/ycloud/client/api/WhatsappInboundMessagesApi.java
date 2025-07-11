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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WhatsappInboundMessagesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WhatsappInboundMessagesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WhatsappInboundMessagesApi(ApiClient apiClient) {
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
     * Build call for markAsRead
     * @param id ID of the message.  A wamid (i.e., the original message ID on WhatsApp&#39;s platform) is also acceptable. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully marked the message as read. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call markAsReadCall(String id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/whatsapp/inboundMessages/{id}/markAsRead"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call markAsReadValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling markAsRead(Async)");
        }
        

        okhttp3.Call localVarCall = markAsReadCall(id, _callback);
        return localVarCall;

    }

    /**
     * Mark message as read
     * <p>
     * When you receive an inbound message from webhooks, you can use this endpoint to mark the message as read. Messages marked as read display two blue check marks alongside their timestamp.  Marking a message as read will also mark earlier messages in the conversation as read.
     * @param id ID of the message.  A wamid (i.e., the original message ID on WhatsApp&#39;s platform) is also acceptable. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully marked the message as read. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist. </td><td>  -  </td></tr>
     </table>
     */
    public void markAsRead(String id) throws ApiException {
        markAsReadWithHttpInfo(id);
    }

    /**
     * Mark message as read
     * <p>
     * When you receive an inbound message from webhooks, you can use this endpoint to mark the message as read. Messages marked as read display two blue check marks alongside their timestamp.  Marking a message as read will also mark earlier messages in the conversation as read.
     * @param id ID of the message.  A wamid (i.e., the original message ID on WhatsApp&#39;s platform) is also acceptable. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully marked the message as read. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> markAsReadWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = markAsReadValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Mark message as read (asynchronously)
     * <p>
     * When you receive an inbound message from webhooks, you can use this endpoint to mark the message as read. Messages marked as read display two blue check marks alongside their timestamp.  Marking a message as read will also mark earlier messages in the conversation as read.
     * @param id ID of the message.  A wamid (i.e., the original message ID on WhatsApp&#39;s platform) is also acceptable. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully marked the message as read. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call markAsReadAsync(String id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = markAsReadValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for typingIndicator
     * @param id ID of the message.  A wamid (i.e., the original message ID on WhatsApp&#39;s platform) is also acceptable. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully marked the message as read. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call typingIndicatorCall(String id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/whatsapp/inboundMessages/{id}/typingIndicator"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call typingIndicatorValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling typingIndicator(Async)");
        }
        

        okhttp3.Call localVarCall = typingIndicatorCall(id, _callback);
        return localVarCall;

    }

    /**
     * Mark message as read and display a typing indicator
     * <p>
     * When you receive an inbound message from webhooks, you can use this endpoint to mark the message as read and display a typing indicator so the WhatsApp user knows you are preparing a response. Messages marked as read display two blue check marks alongside their timestamp.The typing indicator will be dismissed once you respond, or after 25 seconds, whichever comes first. To prevent a poor user experience, only display a typing indicator if you are going to respond.  Marking a message as read will also mark earlier messages in the conversation as read.
     * @param id ID of the message.  A wamid (i.e., the original message ID on WhatsApp&#39;s platform) is also acceptable. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully marked the message as read. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist. </td><td>  -  </td></tr>
     </table>
     */
    public void typingIndicator(String id) throws ApiException {
        typingIndicatorWithHttpInfo(id);
    }

    /**
     * Mark message as read and display a typing indicator
     * <p>
     * When you receive an inbound message from webhooks, you can use this endpoint to mark the message as read and display a typing indicator so the WhatsApp user knows you are preparing a response. Messages marked as read display two blue check marks alongside their timestamp.The typing indicator will be dismissed once you respond, or after 25 seconds, whichever comes first. To prevent a poor user experience, only display a typing indicator if you are going to respond.  Marking a message as read will also mark earlier messages in the conversation as read.
     * @param id ID of the message.  A wamid (i.e., the original message ID on WhatsApp&#39;s platform) is also acceptable. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully marked the message as read. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> typingIndicatorWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = typingIndicatorValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Mark message as read and display a typing indicator (asynchronously)
     * <p>
     * When you receive an inbound message from webhooks, you can use this endpoint to mark the message as read and display a typing indicator so the WhatsApp user knows you are preparing a response. Messages marked as read display two blue check marks alongside their timestamp.The typing indicator will be dismissed once you respond, or after 25 seconds, whichever comes first. To prevent a poor user experience, only display a typing indicator if you are going to respond.  Marking a message as read will also mark earlier messages in the conversation as read.
     * @param id ID of the message.  A wamid (i.e., the original message ID on WhatsApp&#39;s platform) is also acceptable. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully marked the message as read. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call typingIndicatorAsync(String id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = typingIndicatorValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
