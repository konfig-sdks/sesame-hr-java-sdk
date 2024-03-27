/*
 * Sesame Public API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.CompanyUpdateByIdRequest;
import com.konfigthis.client.model.CompanyUpdateByIdResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CompanyApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CompanyApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CompanyApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call updateByIdCall(UUID id, CompanyUpdateByIdRequest companyUpdateByIdRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = companyUpdateByIdRequest;

        // create path and map variables
        String localVarPath = "/core/v3/companies/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

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

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateByIdValidateBeforeCall(UUID id, CompanyUpdateByIdRequest companyUpdateByIdRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateById(Async)");
        }

        // verify the required parameter 'companyUpdateByIdRequest' is set
        if (companyUpdateByIdRequest == null) {
            throw new ApiException("Missing the required parameter 'companyUpdateByIdRequest' when calling updateById(Async)");
        }

        return updateByIdCall(id, companyUpdateByIdRequest, _callback);

    }


    private ApiResponse<CompanyUpdateByIdResponse> updateByIdWithHttpInfo(UUID id, CompanyUpdateByIdRequest companyUpdateByIdRequest) throws ApiException {
        okhttp3.Call localVarCall = updateByIdValidateBeforeCall(id, companyUpdateByIdRequest, null);
        Type localVarReturnType = new TypeToken<CompanyUpdateByIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateByIdAsync(UUID id, CompanyUpdateByIdRequest companyUpdateByIdRequest, final ApiCallback<CompanyUpdateByIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateByIdValidateBeforeCall(id, companyUpdateByIdRequest, _callback);
        Type localVarReturnType = new TypeToken<CompanyUpdateByIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UpdateByIdRequestBuilder {
        private final String name;
        private final String notificationEmail;
        private final String language;
        private final UUID id;

        private UpdateByIdRequestBuilder(String name, String notificationEmail, String language, UUID id) {
            this.name = name;
            this.notificationEmail = notificationEmail;
            this.language = language;
            this.id = id;
        }

        /**
         * Build call for updateById
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CompanyUpdateByIdRequest companyUpdateByIdRequest = buildBodyParams();
            return updateByIdCall(id, companyUpdateByIdRequest, _callback);
        }

        private CompanyUpdateByIdRequest buildBodyParams() {
            CompanyUpdateByIdRequest companyUpdateByIdRequest = new CompanyUpdateByIdRequest();
            companyUpdateByIdRequest.name(this.name);
            companyUpdateByIdRequest.notificationEmail(this.notificationEmail);
            companyUpdateByIdRequest.language(this.language);
            return companyUpdateByIdRequest;
        }

        /**
         * Execute updateById request
         * @return CompanyUpdateByIdResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public CompanyUpdateByIdResponse execute() throws ApiException {
            CompanyUpdateByIdRequest companyUpdateByIdRequest = buildBodyParams();
            ApiResponse<CompanyUpdateByIdResponse> localVarResp = updateByIdWithHttpInfo(id, companyUpdateByIdRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute updateById request with HTTP info returned
         * @return ApiResponse&lt;CompanyUpdateByIdResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CompanyUpdateByIdResponse> executeWithHttpInfo() throws ApiException {
            CompanyUpdateByIdRequest companyUpdateByIdRequest = buildBodyParams();
            return updateByIdWithHttpInfo(id, companyUpdateByIdRequest);
        }

        /**
         * Execute updateById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CompanyUpdateByIdResponse> _callback) throws ApiException {
            CompanyUpdateByIdRequest companyUpdateByIdRequest = buildBodyParams();
            return updateByIdAsync(id, companyUpdateByIdRequest, _callback);
        }
    }

    /**
     * Update a company
     * 
     * @param id Company ID (required)
     * @param companyUpdateByIdRequest Company object that needs to be updated (required)
     * @return UpdateByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
     </table>
     */
    public UpdateByIdRequestBuilder updateById(String name, String notificationEmail, String language, UUID id) throws IllegalArgumentException {
        if (name == null) throw new IllegalArgumentException("\"name\" is required but got null");
            

        if (notificationEmail == null) throw new IllegalArgumentException("\"notificationEmail\" is required but got null");
            

        if (language == null) throw new IllegalArgumentException("\"language\" is required but got null");
            

        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        return new UpdateByIdRequestBuilder(name, notificationEmail, language, id);
    }
}
