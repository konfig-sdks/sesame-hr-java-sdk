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


import com.konfigthis.client.model.EmployeeOfficeAssignationsAssignEmployeeToOfficeRequest;
import com.konfigthis.client.model.EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse;
import com.konfigthis.client.model.EmployeeOfficeAssignationsListAssignationsResponse;
import com.konfigthis.client.model.EmployeeOfficeAssignationsUnassignEmployeeRequest;
import com.konfigthis.client.model.EmployeeOfficeAssignationsUnassignEmployeeResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EmployeeOfficeAssignationsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EmployeeOfficeAssignationsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public EmployeeOfficeAssignationsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call assignEmployeeToOfficeCall(EmployeeOfficeAssignationsAssignEmployeeToOfficeRequest employeeOfficeAssignationsAssignEmployeeToOfficeRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = employeeOfficeAssignationsAssignEmployeeToOfficeRequest;

        // create path and map variables
        String localVarPath = "/core/v3/employee-office-assignations";

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
    private okhttp3.Call assignEmployeeToOfficeValidateBeforeCall(EmployeeOfficeAssignationsAssignEmployeeToOfficeRequest employeeOfficeAssignationsAssignEmployeeToOfficeRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'employeeOfficeAssignationsAssignEmployeeToOfficeRequest' is set
        if (employeeOfficeAssignationsAssignEmployeeToOfficeRequest == null) {
            throw new ApiException("Missing the required parameter 'employeeOfficeAssignationsAssignEmployeeToOfficeRequest' when calling assignEmployeeToOffice(Async)");
        }

        return assignEmployeeToOfficeCall(employeeOfficeAssignationsAssignEmployeeToOfficeRequest, _callback);

    }


    private ApiResponse<EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse> assignEmployeeToOfficeWithHttpInfo(EmployeeOfficeAssignationsAssignEmployeeToOfficeRequest employeeOfficeAssignationsAssignEmployeeToOfficeRequest) throws ApiException {
        okhttp3.Call localVarCall = assignEmployeeToOfficeValidateBeforeCall(employeeOfficeAssignationsAssignEmployeeToOfficeRequest, null);
        Type localVarReturnType = new TypeToken<EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call assignEmployeeToOfficeAsync(EmployeeOfficeAssignationsAssignEmployeeToOfficeRequest employeeOfficeAssignationsAssignEmployeeToOfficeRequest, final ApiCallback<EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = assignEmployeeToOfficeValidateBeforeCall(employeeOfficeAssignationsAssignEmployeeToOfficeRequest, _callback);
        Type localVarReturnType = new TypeToken<EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class AssignEmployeeToOfficeRequestBuilder {
        private final UUID employeeId;
        private final UUID officeId;

        private AssignEmployeeToOfficeRequestBuilder(UUID employeeId, UUID officeId) {
            this.employeeId = employeeId;
            this.officeId = officeId;
        }

        /**
         * Build call for assignEmployeeToOffice
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
            EmployeeOfficeAssignationsAssignEmployeeToOfficeRequest employeeOfficeAssignationsAssignEmployeeToOfficeRequest = buildBodyParams();
            return assignEmployeeToOfficeCall(employeeOfficeAssignationsAssignEmployeeToOfficeRequest, _callback);
        }

        private EmployeeOfficeAssignationsAssignEmployeeToOfficeRequest buildBodyParams() {
            EmployeeOfficeAssignationsAssignEmployeeToOfficeRequest employeeOfficeAssignationsAssignEmployeeToOfficeRequest = new EmployeeOfficeAssignationsAssignEmployeeToOfficeRequest();
            employeeOfficeAssignationsAssignEmployeeToOfficeRequest.employeeId(this.employeeId);
            employeeOfficeAssignationsAssignEmployeeToOfficeRequest.officeId(this.officeId);
            return employeeOfficeAssignationsAssignEmployeeToOfficeRequest;
        }

        /**
         * Execute assignEmployeeToOffice request
         * @return EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse execute() throws ApiException {
            EmployeeOfficeAssignationsAssignEmployeeToOfficeRequest employeeOfficeAssignationsAssignEmployeeToOfficeRequest = buildBodyParams();
            ApiResponse<EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse> localVarResp = assignEmployeeToOfficeWithHttpInfo(employeeOfficeAssignationsAssignEmployeeToOfficeRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute assignEmployeeToOffice request with HTTP info returned
         * @return ApiResponse&lt;EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse> executeWithHttpInfo() throws ApiException {
            EmployeeOfficeAssignationsAssignEmployeeToOfficeRequest employeeOfficeAssignationsAssignEmployeeToOfficeRequest = buildBodyParams();
            return assignEmployeeToOfficeWithHttpInfo(employeeOfficeAssignationsAssignEmployeeToOfficeRequest);
        }

        /**
         * Execute assignEmployeeToOffice request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse> _callback) throws ApiException {
            EmployeeOfficeAssignationsAssignEmployeeToOfficeRequest employeeOfficeAssignationsAssignEmployeeToOfficeRequest = buildBodyParams();
            return assignEmployeeToOfficeAsync(employeeOfficeAssignationsAssignEmployeeToOfficeRequest, _callback);
        }
    }

    /**
     * Assign an employee to an office
     * 
     * @param employeeOfficeAssignationsAssignEmployeeToOfficeRequest Employee object needs to be assigned to Office object (required)
     * @return AssignEmployeeToOfficeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
     </table>
     */
    public AssignEmployeeToOfficeRequestBuilder assignEmployeeToOffice(UUID employeeId, UUID officeId) throws IllegalArgumentException {
        if (employeeId == null) throw new IllegalArgumentException("\"employeeId\" is required but got null");
            

        if (officeId == null) throw new IllegalArgumentException("\"officeId\" is required but got null");
            

        return new AssignEmployeeToOfficeRequestBuilder(employeeId, officeId);
    }
    private okhttp3.Call listAssignationsCall(UUID employeeId, UUID officeId, Integer limit, Integer page, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/core/v3/employee-office-assignations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (employeeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employeeId", employeeId));
        }

        if (officeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("officeId", officeId));
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
    private okhttp3.Call listAssignationsValidateBeforeCall(UUID employeeId, UUID officeId, Integer limit, Integer page, final ApiCallback _callback) throws ApiException {
        return listAssignationsCall(employeeId, officeId, limit, page, _callback);

    }


    private ApiResponse<EmployeeOfficeAssignationsListAssignationsResponse> listAssignationsWithHttpInfo(UUID employeeId, UUID officeId, Integer limit, Integer page) throws ApiException {
        okhttp3.Call localVarCall = listAssignationsValidateBeforeCall(employeeId, officeId, limit, page, null);
        Type localVarReturnType = new TypeToken<EmployeeOfficeAssignationsListAssignationsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAssignationsAsync(UUID employeeId, UUID officeId, Integer limit, Integer page, final ApiCallback<EmployeeOfficeAssignationsListAssignationsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAssignationsValidateBeforeCall(employeeId, officeId, limit, page, _callback);
        Type localVarReturnType = new TypeToken<EmployeeOfficeAssignationsListAssignationsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListAssignationsRequestBuilder {
        private UUID employeeId;
        private UUID officeId;
        private Integer limit;
        private Integer page;

        private ListAssignationsRequestBuilder() {
        }

        /**
         * Set employeeId
         * @param employeeId Find Assignation by employeeId (optional)
         * @return ListAssignationsRequestBuilder
         */
        public ListAssignationsRequestBuilder employeeId(UUID employeeId) {
            this.employeeId = employeeId;
            return this;
        }
        
        /**
         * Set officeId
         * @param officeId Find Assignation by officeId (optional)
         * @return ListAssignationsRequestBuilder
         */
        public ListAssignationsRequestBuilder officeId(UUID officeId) {
            this.officeId = officeId;
            return this;
        }
        
        /**
         * Set limit
         * @param limit Limit assignations (optional)
         * @return ListAssignationsRequestBuilder
         */
        public ListAssignationsRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set page
         * @param page Request a specific page (optional)
         * @return ListAssignationsRequestBuilder
         */
        public ListAssignationsRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Build call for listAssignations
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
            return listAssignationsCall(employeeId, officeId, limit, page, _callback);
        }


        /**
         * Execute listAssignations request
         * @return EmployeeOfficeAssignationsListAssignationsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Array of objects </td><td>  -  </td></tr>
         </table>
         */
        public EmployeeOfficeAssignationsListAssignationsResponse execute() throws ApiException {
            ApiResponse<EmployeeOfficeAssignationsListAssignationsResponse> localVarResp = listAssignationsWithHttpInfo(employeeId, officeId, limit, page);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listAssignations request with HTTP info returned
         * @return ApiResponse&lt;EmployeeOfficeAssignationsListAssignationsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Array of objects </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EmployeeOfficeAssignationsListAssignationsResponse> executeWithHttpInfo() throws ApiException {
            return listAssignationsWithHttpInfo(employeeId, officeId, limit, page);
        }

        /**
         * Execute listAssignations request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Array of objects </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EmployeeOfficeAssignationsListAssignationsResponse> _callback) throws ApiException {
            return listAssignationsAsync(employeeId, officeId, limit, page, _callback);
        }
    }

    /**
     * List employee office assignation
     * 
     * @return ListAssignationsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Array of objects </td><td>  -  </td></tr>
     </table>
     */
    public ListAssignationsRequestBuilder listAssignations() throws IllegalArgumentException {
        return new ListAssignationsRequestBuilder();
    }
    private okhttp3.Call unassignEmployeeCall(EmployeeOfficeAssignationsUnassignEmployeeRequest employeeOfficeAssignationsUnassignEmployeeRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = employeeOfficeAssignationsUnassignEmployeeRequest;

        // create path and map variables
        String localVarPath = "/core/v3/employee-office-assignations";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call unassignEmployeeValidateBeforeCall(EmployeeOfficeAssignationsUnassignEmployeeRequest employeeOfficeAssignationsUnassignEmployeeRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'employeeOfficeAssignationsUnassignEmployeeRequest' is set
        if (employeeOfficeAssignationsUnassignEmployeeRequest == null) {
            throw new ApiException("Missing the required parameter 'employeeOfficeAssignationsUnassignEmployeeRequest' when calling unassignEmployee(Async)");
        }

        return unassignEmployeeCall(employeeOfficeAssignationsUnassignEmployeeRequest, _callback);

    }


    private ApiResponse<EmployeeOfficeAssignationsUnassignEmployeeResponse> unassignEmployeeWithHttpInfo(EmployeeOfficeAssignationsUnassignEmployeeRequest employeeOfficeAssignationsUnassignEmployeeRequest) throws ApiException {
        okhttp3.Call localVarCall = unassignEmployeeValidateBeforeCall(employeeOfficeAssignationsUnassignEmployeeRequest, null);
        Type localVarReturnType = new TypeToken<EmployeeOfficeAssignationsUnassignEmployeeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call unassignEmployeeAsync(EmployeeOfficeAssignationsUnassignEmployeeRequest employeeOfficeAssignationsUnassignEmployeeRequest, final ApiCallback<EmployeeOfficeAssignationsUnassignEmployeeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = unassignEmployeeValidateBeforeCall(employeeOfficeAssignationsUnassignEmployeeRequest, _callback);
        Type localVarReturnType = new TypeToken<EmployeeOfficeAssignationsUnassignEmployeeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UnassignEmployeeRequestBuilder {
        private final UUID employeeId;
        private final UUID officeId;

        private UnassignEmployeeRequestBuilder(UUID employeeId, UUID officeId) {
            this.employeeId = employeeId;
            this.officeId = officeId;
        }

        /**
         * Build call for unassignEmployee
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
            EmployeeOfficeAssignationsUnassignEmployeeRequest employeeOfficeAssignationsUnassignEmployeeRequest = buildBodyParams();
            return unassignEmployeeCall(employeeOfficeAssignationsUnassignEmployeeRequest, _callback);
        }

        private EmployeeOfficeAssignationsUnassignEmployeeRequest buildBodyParams() {
            EmployeeOfficeAssignationsUnassignEmployeeRequest employeeOfficeAssignationsUnassignEmployeeRequest = new EmployeeOfficeAssignationsUnassignEmployeeRequest();
            employeeOfficeAssignationsUnassignEmployeeRequest.employeeId(this.employeeId);
            employeeOfficeAssignationsUnassignEmployeeRequest.officeId(this.officeId);
            return employeeOfficeAssignationsUnassignEmployeeRequest;
        }

        /**
         * Execute unassignEmployee request
         * @return EmployeeOfficeAssignationsUnassignEmployeeResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public EmployeeOfficeAssignationsUnassignEmployeeResponse execute() throws ApiException {
            EmployeeOfficeAssignationsUnassignEmployeeRequest employeeOfficeAssignationsUnassignEmployeeRequest = buildBodyParams();
            ApiResponse<EmployeeOfficeAssignationsUnassignEmployeeResponse> localVarResp = unassignEmployeeWithHttpInfo(employeeOfficeAssignationsUnassignEmployeeRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute unassignEmployee request with HTTP info returned
         * @return ApiResponse&lt;EmployeeOfficeAssignationsUnassignEmployeeResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EmployeeOfficeAssignationsUnassignEmployeeResponse> executeWithHttpInfo() throws ApiException {
            EmployeeOfficeAssignationsUnassignEmployeeRequest employeeOfficeAssignationsUnassignEmployeeRequest = buildBodyParams();
            return unassignEmployeeWithHttpInfo(employeeOfficeAssignationsUnassignEmployeeRequest);
        }

        /**
         * Execute unassignEmployee request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EmployeeOfficeAssignationsUnassignEmployeeResponse> _callback) throws ApiException {
            EmployeeOfficeAssignationsUnassignEmployeeRequest employeeOfficeAssignationsUnassignEmployeeRequest = buildBodyParams();
            return unassignEmployeeAsync(employeeOfficeAssignationsUnassignEmployeeRequest, _callback);
        }
    }

    /**
     * Unassign employee from office
     * 
     * @param employeeOfficeAssignationsUnassignEmployeeRequest Employee object needs to be unassigned to Office object (required)
     * @return UnassignEmployeeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Object </td><td>  -  </td></tr>
     </table>
     */
    public UnassignEmployeeRequestBuilder unassignEmployee(UUID employeeId, UUID officeId) throws IllegalArgumentException {
        if (employeeId == null) throw new IllegalArgumentException("\"employeeId\" is required but got null");
            

        if (officeId == null) throw new IllegalArgumentException("\"officeId\" is required but got null");
            

        return new UnassignEmployeeRequestBuilder(employeeId, officeId);
    }
}
