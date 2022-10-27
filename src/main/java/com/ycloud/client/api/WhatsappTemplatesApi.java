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


import com.ycloud.client.model.WhatsappTemplate;
import com.ycloud.client.model.WhatsappTemplateCreateRequest;
import com.ycloud.client.model.WhatsappTemplatePage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WhatsappTemplatesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WhatsappTemplatesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WhatsappTemplatesApi(ApiClient apiClient) {
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
     * Build call for create
     * @param whatsappTemplateCreateRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The template is successfully created. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCall(WhatsappTemplateCreateRequest whatsappTemplateCreateRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = whatsappTemplateCreateRequest;

        // create path and map variables
        String localVarPath = "/whatsapp/templates";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createValidateBeforeCall(WhatsappTemplateCreateRequest whatsappTemplateCreateRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'whatsappTemplateCreateRequest' is set
        if (whatsappTemplateCreateRequest == null) {
            throw new ApiException("Missing the required parameter 'whatsappTemplateCreateRequest' when calling create(Async)");
        }
        

        okhttp3.Call localVarCall = createCall(whatsappTemplateCreateRequest, _callback);
        return localVarCall;

    }

    /**
     * Create a WhatsApp template
     * <p>
     * Creates a WhatsApp template. See also [Create Message Templates](https://developers.facebook.com/docs/whatsapp/business-management-api/message-templates/#create-message-templates).
     * @param whatsappTemplateCreateRequest  (required)
     * @return WhatsappTemplate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The template is successfully created. </td><td>  -  </td></tr>
     </table>
     */
    public WhatsappTemplate create(WhatsappTemplateCreateRequest whatsappTemplateCreateRequest) throws ApiException {
        ApiResponse<WhatsappTemplate> localVarResp = createWithHttpInfo(whatsappTemplateCreateRequest);
        return localVarResp.getData();
    }

    /**
     * Create a WhatsApp template
     * <p>
     * Creates a WhatsApp template. See also [Create Message Templates](https://developers.facebook.com/docs/whatsapp/business-management-api/message-templates/#create-message-templates).
     * @param whatsappTemplateCreateRequest  (required)
     * @return ApiResponse&lt;WhatsappTemplate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The template is successfully created. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WhatsappTemplate> createWithHttpInfo(WhatsappTemplateCreateRequest whatsappTemplateCreateRequest) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(whatsappTemplateCreateRequest, null);
        Type localVarReturnType = new TypeToken<WhatsappTemplate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a WhatsApp template (asynchronously)
     * <p>
     * Creates a WhatsApp template. See also [Create Message Templates](https://developers.facebook.com/docs/whatsapp/business-management-api/message-templates/#create-message-templates).
     * @param whatsappTemplateCreateRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The template is successfully created. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAsync(WhatsappTemplateCreateRequest whatsappTemplateCreateRequest, final ApiCallback<WhatsappTemplate> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(whatsappTemplateCreateRequest, _callback);
        Type localVarReturnType = new TypeToken<WhatsappTemplate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteByName
     * @param wabaId WhatsApp Business Account ID. (required)
     * @param name Name of the template. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The template(s) is successfully deleted. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteByNameCall(String wabaId, String name, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/whatsapp/templates/{wabaId}/{name}"
            .replaceAll("\\{" + "wabaId" + "\\}", localVarApiClient.escapeString(wabaId.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteByNameValidateBeforeCall(String wabaId, String name, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'wabaId' is set
        if (wabaId == null) {
            throw new ApiException("Missing the required parameter 'wabaId' when calling deleteByName(Async)");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteByName(Async)");
        }
        

        okhttp3.Call localVarCall = deleteByNameCall(wabaId, name, _callback);
        return localVarCall;

    }

    /**
     * Delete WhatsApp templates by name
     * <p>
     * Deletes WhatsApp templates by name. If that template name exists in multiple languages, all languages will be deleted. HTTP status &#x60;404&#x60; is returned if no templates are found for the specific name.
     * @param wabaId WhatsApp Business Account ID. (required)
     * @param name Name of the template. (required)
     * @return List&lt;WhatsappTemplate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The template(s) is successfully deleted. </td><td>  -  </td></tr>
     </table>
     */
    public List<WhatsappTemplate> deleteByName(String wabaId, String name) throws ApiException {
        ApiResponse<List<WhatsappTemplate>> localVarResp = deleteByNameWithHttpInfo(wabaId, name);
        return localVarResp.getData();
    }

    /**
     * Delete WhatsApp templates by name
     * <p>
     * Deletes WhatsApp templates by name. If that template name exists in multiple languages, all languages will be deleted. HTTP status &#x60;404&#x60; is returned if no templates are found for the specific name.
     * @param wabaId WhatsApp Business Account ID. (required)
     * @param name Name of the template. (required)
     * @return ApiResponse&lt;List&lt;WhatsappTemplate&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The template(s) is successfully deleted. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WhatsappTemplate>> deleteByNameWithHttpInfo(String wabaId, String name) throws ApiException {
        okhttp3.Call localVarCall = deleteByNameValidateBeforeCall(wabaId, name, null);
        Type localVarReturnType = new TypeToken<List<WhatsappTemplate>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete WhatsApp templates by name (asynchronously)
     * <p>
     * Deletes WhatsApp templates by name. If that template name exists in multiple languages, all languages will be deleted. HTTP status &#x60;404&#x60; is returned if no templates are found for the specific name.
     * @param wabaId WhatsApp Business Account ID. (required)
     * @param name Name of the template. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The template(s) is successfully deleted. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteByNameAsync(String wabaId, String name, final ApiCallback<List<WhatsappTemplate>> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteByNameValidateBeforeCall(wabaId, name, _callback);
        Type localVarReturnType = new TypeToken<List<WhatsappTemplate>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    private okhttp3.Call listCall(Integer page, Integer limit, Boolean includeTotal, String filterWabaId, String filterName, String filterLanguage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/whatsapp/templates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (includeTotal != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeTotal", includeTotal));
        }

        if (filterWabaId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter.wabaId", filterWabaId));
        }

        if (filterName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter.name", filterName));
        }

        if (filterLanguage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter.language", filterLanguage));
        }

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listValidateBeforeCall(Integer page, Integer limit, Boolean includeTotal, String filterWabaId, String filterName, String filterLanguage, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listCall(page, limit, includeTotal, filterWabaId, filterName, filterLanguage, _callback);
        return localVarCall;

    }


    private ApiResponse<WhatsappTemplatePage> listWithHttpInfo(Integer page, Integer limit, Boolean includeTotal, String filterWabaId, String filterName, String filterLanguage) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(page, limit, includeTotal, filterWabaId, filterName, filterLanguage, null);
        Type localVarReturnType = new TypeToken<WhatsappTemplatePage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(Integer page, Integer limit, Boolean includeTotal, String filterWabaId, String filterName, String filterLanguage, final ApiCallback<WhatsappTemplatePage> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(page, limit, includeTotal, filterWabaId, filterName, filterLanguage, _callback);
        Type localVarReturnType = new TypeToken<WhatsappTemplatePage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ApiListRequest {
        private Integer page;
        private Integer limit;
        private Boolean includeTotal;
        private String filterWabaId;
        private String filterName;
        private String filterLanguage;

        private ApiListRequest() {
        }

        /**
         * Set page
         * @param page Page number of the results to be returned, 1-based. (optional, default to 1)
         * @return ApiListRequest
         */
        public ApiListRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Set limit
         * @param limit A limit on the number of results to be returned, or number of results per page, between 1 and 100, defaults to 10. (optional, default to 10)
         * @return ApiListRequest
         */
        public ApiListRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set includeTotal
         * @param includeTotal Return results inside an object that contains the total result count or not. (optional, default to false)
         * @return ApiListRequest
         */
        public ApiListRequest includeTotal(Boolean includeTotal) {
            this.includeTotal = includeTotal;
            return this;
        }

        /**
         * Set filterWabaId
         * @param filterWabaId WhatsApp Business Account ID. (optional)
         * @return ApiListRequest
         */
        public ApiListRequest filterWabaId(String filterWabaId) {
            this.filterWabaId = filterWabaId;
            return this;
        }

        /**
         * Set filterName
         * @param filterName Name of the template. (optional)
         * @return ApiListRequest
         */
        public ApiListRequest filterName(String filterName) {
            this.filterName = filterName;
            return this;
        }

        /**
         * Set filterLanguage
         * @param filterLanguage Language of the template. (optional)
         * @return ApiListRequest
         */
        public ApiListRequest filterLanguage(String filterLanguage) {
            this.filterLanguage = filterLanguage;
            return this;
        }

        /**
         * Build call for list
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved a paginated list of objects. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCall(page, limit, includeTotal, filterWabaId, filterName, filterLanguage, _callback);
        }

        /**
         * Execute list request
         * @return WhatsappTemplatePage
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved a paginated list of objects. </td><td>  -  </td></tr>
         </table>
         */
        public WhatsappTemplatePage execute() throws ApiException {
            ApiResponse<WhatsappTemplatePage> localVarResp = listWithHttpInfo(page, limit, includeTotal, filterWabaId, filterName, filterLanguage);
            return localVarResp.getData();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;WhatsappTemplatePage&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved a paginated list of objects. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<WhatsappTemplatePage> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(page, limit, includeTotal, filterWabaId, filterName, filterLanguage);
        }

        /**
         * Execute list request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved a paginated list of objects. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<WhatsappTemplatePage> _callback) throws ApiException {
            return listAsync(page, limit, includeTotal, filterWabaId, filterName, filterLanguage, _callback);
        }
    }

    /**
     * List WhatsApp templates
     * <p>
     * Returns a paginated list of WhatsApp templates you&#39;ve previously created.
     * @return ApiListRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved a paginated list of objects. </td><td>  -  </td></tr>
     </table>
     */
    public ApiListRequest list() {
        return new ApiListRequest();
    }
    /**
     * Build call for retrieveByNameAndLanguage
     * @param wabaId WhatsApp Business Account ID. (required)
     * @param name Name of the template. (required)
     * @param language Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages-) for all codes. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The WhatsApp template is successfully retrieved. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveByNameAndLanguageCall(String wabaId, String name, String language, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/whatsapp/templates/{wabaId}/{name}/{language}"
            .replaceAll("\\{" + "wabaId" + "\\}", localVarApiClient.escapeString(wabaId.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "language" + "\\}", localVarApiClient.escapeString(language.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call retrieveByNameAndLanguageValidateBeforeCall(String wabaId, String name, String language, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'wabaId' is set
        if (wabaId == null) {
            throw new ApiException("Missing the required parameter 'wabaId' when calling retrieveByNameAndLanguage(Async)");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling retrieveByNameAndLanguage(Async)");
        }
        
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling retrieveByNameAndLanguage(Async)");
        }
        

        okhttp3.Call localVarCall = retrieveByNameAndLanguageCall(wabaId, name, language, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a WhatsApp template
     * <p>
     * Retrieves a WhatsApp template by name and language.
     * @param wabaId WhatsApp Business Account ID. (required)
     * @param name Name of the template. (required)
     * @param language Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages-) for all codes. (required)
     * @return WhatsappTemplate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The WhatsApp template is successfully retrieved. </td><td>  -  </td></tr>
     </table>
     */
    public WhatsappTemplate retrieveByNameAndLanguage(String wabaId, String name, String language) throws ApiException {
        ApiResponse<WhatsappTemplate> localVarResp = retrieveByNameAndLanguageWithHttpInfo(wabaId, name, language);
        return localVarResp.getData();
    }

    /**
     * Retrieve a WhatsApp template
     * <p>
     * Retrieves a WhatsApp template by name and language.
     * @param wabaId WhatsApp Business Account ID. (required)
     * @param name Name of the template. (required)
     * @param language Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages-) for all codes. (required)
     * @return ApiResponse&lt;WhatsappTemplate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The WhatsApp template is successfully retrieved. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WhatsappTemplate> retrieveByNameAndLanguageWithHttpInfo(String wabaId, String name, String language) throws ApiException {
        okhttp3.Call localVarCall = retrieveByNameAndLanguageValidateBeforeCall(wabaId, name, language, null);
        Type localVarReturnType = new TypeToken<WhatsappTemplate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a WhatsApp template (asynchronously)
     * <p>
     * Retrieves a WhatsApp template by name and language.
     * @param wabaId WhatsApp Business Account ID. (required)
     * @param name Name of the template. (required)
     * @param language Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages-) for all codes. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The WhatsApp template is successfully retrieved. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveByNameAndLanguageAsync(String wabaId, String name, String language, final ApiCallback<WhatsappTemplate> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveByNameAndLanguageValidateBeforeCall(wabaId, name, language, _callback);
        Type localVarReturnType = new TypeToken<WhatsappTemplate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
