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


import com.konfigthis.client.model.EmployeeManagersAssignRequest;
import com.konfigthis.client.model.EmployeeManagersAssignResponse;
import com.konfigthis.client.model.EmployeeManagersListResponse;
import com.konfigthis.client.model.EmployeeManagersRemoveByIdResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EmployeeManagersApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EmployeeManagersApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public EmployeeManagersApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call assignCall(EmployeeManagersAssignRequest employeeManagersAssignRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = employeeManagersAssignRequest;

        // create path and map variables
        String localVarPath = "/core/v3/employee-managers";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call assignValidateBeforeCall(EmployeeManagersAssignRequest employeeManagersAssignRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'employeeManagersAssignRequest' is set
        if (employeeManagersAssignRequest == null) {
            throw new ApiException("Missing the required parameter 'employeeManagersAssignRequest' when calling assign(Async)");
        }

        return assignCall(employeeManagersAssignRequest, _callback);

    }


    private ApiResponse<EmployeeManagersAssignResponse> assignWithHttpInfo(EmployeeManagersAssignRequest employeeManagersAssignRequest) throws ApiException {
        okhttp3.Call localVarCall = assignValidateBeforeCall(employeeManagersAssignRequest, null);
        Type localVarReturnType = new TypeToken<EmployeeManagersAssignResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call assignAsync(EmployeeManagersAssignRequest employeeManagersAssignRequest, final ApiCallback<EmployeeManagersAssignResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = assignValidateBeforeCall(employeeManagersAssignRequest, _callback);
        Type localVarReturnType = new TypeToken<EmployeeManagersAssignResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class AssignRequestBuilder {
        private final UUID employeeId;
        private final UUID managerId;
        private final String permission;
        private final Integer order;

        private AssignRequestBuilder(UUID employeeId, UUID managerId, String permission, Integer order) {
            this.employeeId = employeeId;
            this.managerId = managerId;
            this.permission = permission;
            this.order = order;
        }

        /**
         * Build call for assign
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
            EmployeeManagersAssignRequest employeeManagersAssignRequest = buildBodyParams();
            return assignCall(employeeManagersAssignRequest, _callback);
        }

        private EmployeeManagersAssignRequest buildBodyParams() {
            EmployeeManagersAssignRequest employeeManagersAssignRequest = new EmployeeManagersAssignRequest();
            employeeManagersAssignRequest.employeeId(this.employeeId);
            employeeManagersAssignRequest.managerId(this.managerId);
            if (this.permission != null)
            employeeManagersAssignRequest.permission(EmployeeManagersAssignRequest.PermissionEnum.fromValue(this.permission));
            if (this.order != null)
            employeeManagersAssignRequest.order(EmployeeManagersAssignRequest.OrderEnum.fromValue(this.order));
            return employeeManagersAssignRequest;
        }

        /**
         * Execute assign request
         * @return EmployeeManagersAssignResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public EmployeeManagersAssignResponse execute() throws ApiException {
            EmployeeManagersAssignRequest employeeManagersAssignRequest = buildBodyParams();
            ApiResponse<EmployeeManagersAssignResponse> localVarResp = assignWithHttpInfo(employeeManagersAssignRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute assign request with HTTP info returned
         * @return ApiResponse&lt;EmployeeManagersAssignResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EmployeeManagersAssignResponse> executeWithHttpInfo() throws ApiException {
            EmployeeManagersAssignRequest employeeManagersAssignRequest = buildBodyParams();
            return assignWithHttpInfo(employeeManagersAssignRequest);
        }

        /**
         * Execute assign request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EmployeeManagersAssignResponse> _callback) throws ApiException {
            EmployeeManagersAssignRequest employeeManagersAssignRequest = buildBodyParams();
            return assignAsync(employeeManagersAssignRequest, _callback);
        }
    }

    /**
     * Assign an employee manager
     * 
     * @param employeeManagersAssignRequest Employee manager object that needs to be created (required)
     * @return AssignRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
     </table>
     */
    public AssignRequestBuilder assign(UUID employeeId, UUID managerId, String permission, Integer order) throws IllegalArgumentException {
        if (employeeId == null) throw new IllegalArgumentException("\"employeeId\" is required but got null");
            

        if (managerId == null) throw new IllegalArgumentException("\"managerId\" is required but got null");
            

        if (permission == null) throw new IllegalArgumentException("\"permission\" is required but got null");
            

        if (order == null) throw new IllegalArgumentException("\"order\" is required but got null");
        return new AssignRequestBuilder(employeeId, managerId, permission, order);
    }
    private okhttp3.Call listCall(UUID employeeId, UUID managerId, String permission, Integer limit, Integer page, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/core/v3/employee-managers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (employeeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employeeId", employeeId));
        }

        if (managerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("managerId", managerId));
        }

        if (permission != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("permission", permission));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
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

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listValidateBeforeCall(UUID employeeId, UUID managerId, String permission, Integer limit, Integer page, final ApiCallback _callback) throws ApiException {
        return listCall(employeeId, managerId, permission, limit, page, _callback);

    }


    private ApiResponse<EmployeeManagersListResponse> listWithHttpInfo(UUID employeeId, UUID managerId, String permission, Integer limit, Integer page) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(employeeId, managerId, permission, limit, page, null);
        Type localVarReturnType = new TypeToken<EmployeeManagersListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(UUID employeeId, UUID managerId, String permission, Integer limit, Integer page, final ApiCallback<EmployeeManagersListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(employeeId, managerId, permission, limit, page, _callback);
        Type localVarReturnType = new TypeToken<EmployeeManagersListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private UUID employeeId;
        private UUID managerId;
        private String permission;
        private Integer limit;
        private Integer page;

        private ListRequestBuilder() {
        }

        /**
         * Set employeeId
         * @param employeeId Find employee managers by employeeId (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder employeeId(UUID employeeId) {
            this.employeeId = employeeId;
            return this;
        }
        
        /**
         * Set managerId
         * @param managerId Find employee managers by managerId (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder managerId(UUID managerId) {
            this.managerId = managerId;
            return this;
        }
        
        /**
         * Set permission
         * @param permission &lt;b&gt;Supported operators:&lt;/b&gt; in (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder permission(String permission) {
            this.permission = permission;
            return this;
        }
        
        /**
         * Set limit
         * @param limit Limit departments (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set page
         * @param page Request a specific page (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder page(Integer page) {
            this.page = page;
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
            <tr><td> 200 </td><td> Array of objects </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCall(employeeId, managerId, permission, limit, page, _callback);
        }


        /**
         * Execute list request
         * @return EmployeeManagersListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Array of objects </td><td>  -  </td></tr>
         </table>
         */
        public EmployeeManagersListResponse execute() throws ApiException {
            ApiResponse<EmployeeManagersListResponse> localVarResp = listWithHttpInfo(employeeId, managerId, permission, limit, page);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;EmployeeManagersListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Array of objects </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EmployeeManagersListResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(employeeId, managerId, permission, limit, page);
        }

        /**
         * Execute list request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Array of objects </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EmployeeManagersListResponse> _callback) throws ApiException {
            return listAsync(employeeId, managerId, permission, limit, page, _callback);
        }
    }

    /**
     * List employee managers
     * 
     * @return ListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Array of objects </td><td>  -  </td></tr>
     </table>
     */
    public ListRequestBuilder list() throws IllegalArgumentException {
        return new ListRequestBuilder();
    }
    private okhttp3.Call removeByIdCall(UUID id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/core/v3/employee-managers/{id}"
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeByIdValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling removeById(Async)");
        }

        return removeByIdCall(id, _callback);

    }


    private ApiResponse<EmployeeManagersRemoveByIdResponse> removeByIdWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = removeByIdValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<EmployeeManagersRemoveByIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call removeByIdAsync(UUID id, final ApiCallback<EmployeeManagersRemoveByIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeByIdValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<EmployeeManagersRemoveByIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class RemoveByIdRequestBuilder {
        private final UUID id;

        private RemoveByIdRequestBuilder(UUID id) {
            this.id = id;
        }

        /**
         * Build call for removeById
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
            return removeByIdCall(id, _callback);
        }


        /**
         * Execute removeById request
         * @return EmployeeManagersRemoveByIdResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public EmployeeManagersRemoveByIdResponse execute() throws ApiException {
            ApiResponse<EmployeeManagersRemoveByIdResponse> localVarResp = removeByIdWithHttpInfo(id);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute removeById request with HTTP info returned
         * @return ApiResponse&lt;EmployeeManagersRemoveByIdResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EmployeeManagersRemoveByIdResponse> executeWithHttpInfo() throws ApiException {
            return removeByIdWithHttpInfo(id);
        }

        /**
         * Execute removeById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EmployeeManagersRemoveByIdResponse> _callback) throws ApiException {
            return removeByIdAsync(id, _callback);
        }
    }

    /**
     * Delete an employee manager
     * 
     * @param id Employee manager ID (required)
     * @return RemoveByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
     </table>
     */
    public RemoveByIdRequestBuilder removeById(UUID id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        return new RemoveByIdRequestBuilder(id);
    }
}
