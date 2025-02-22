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


import com.konfigthis.client.model.EmployeeAgreementsAssignEmployeeRequest;
import com.konfigthis.client.model.EmployeeAgreementsAssignEmployeeResponse;
import com.konfigthis.client.model.EmployeeAgreementsUnassignEmployeeResponse;
import java.time.LocalDate;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EmployeeAgreementsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EmployeeAgreementsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public EmployeeAgreementsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call assignEmployeeCall(EmployeeAgreementsAssignEmployeeRequest employeeAgreementsAssignEmployeeRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = employeeAgreementsAssignEmployeeRequest;

        // create path and map variables
        String localVarPath = "/schedule/v1/agreement-employees";

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
    private okhttp3.Call assignEmployeeValidateBeforeCall(EmployeeAgreementsAssignEmployeeRequest employeeAgreementsAssignEmployeeRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'employeeAgreementsAssignEmployeeRequest' is set
        if (employeeAgreementsAssignEmployeeRequest == null) {
            throw new ApiException("Missing the required parameter 'employeeAgreementsAssignEmployeeRequest' when calling assignEmployee(Async)");
        }

        return assignEmployeeCall(employeeAgreementsAssignEmployeeRequest, _callback);

    }


    private ApiResponse<EmployeeAgreementsAssignEmployeeResponse> assignEmployeeWithHttpInfo(EmployeeAgreementsAssignEmployeeRequest employeeAgreementsAssignEmployeeRequest) throws ApiException {
        okhttp3.Call localVarCall = assignEmployeeValidateBeforeCall(employeeAgreementsAssignEmployeeRequest, null);
        Type localVarReturnType = new TypeToken<EmployeeAgreementsAssignEmployeeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call assignEmployeeAsync(EmployeeAgreementsAssignEmployeeRequest employeeAgreementsAssignEmployeeRequest, final ApiCallback<EmployeeAgreementsAssignEmployeeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = assignEmployeeValidateBeforeCall(employeeAgreementsAssignEmployeeRequest, _callback);
        Type localVarReturnType = new TypeToken<EmployeeAgreementsAssignEmployeeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class AssignEmployeeRequestBuilder {
        private final UUID agreementId;
        private final UUID employeeId;
        private final LocalDate startDate;

        private AssignEmployeeRequestBuilder(UUID agreementId, UUID employeeId, LocalDate startDate) {
            this.agreementId = agreementId;
            this.employeeId = employeeId;
            this.startDate = startDate;
        }

        /**
         * Build call for assignEmployee
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Employee agreement created </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            EmployeeAgreementsAssignEmployeeRequest employeeAgreementsAssignEmployeeRequest = buildBodyParams();
            return assignEmployeeCall(employeeAgreementsAssignEmployeeRequest, _callback);
        }

        private EmployeeAgreementsAssignEmployeeRequest buildBodyParams() {
            EmployeeAgreementsAssignEmployeeRequest employeeAgreementsAssignEmployeeRequest = new EmployeeAgreementsAssignEmployeeRequest();
            employeeAgreementsAssignEmployeeRequest.agreementId(this.agreementId);
            employeeAgreementsAssignEmployeeRequest.employeeId(this.employeeId);
            employeeAgreementsAssignEmployeeRequest.startDate(this.startDate);
            return employeeAgreementsAssignEmployeeRequest;
        }

        /**
         * Execute assignEmployee request
         * @return EmployeeAgreementsAssignEmployeeResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Employee agreement created </td><td>  -  </td></tr>
         </table>
         */
        public EmployeeAgreementsAssignEmployeeResponse execute() throws ApiException {
            EmployeeAgreementsAssignEmployeeRequest employeeAgreementsAssignEmployeeRequest = buildBodyParams();
            ApiResponse<EmployeeAgreementsAssignEmployeeResponse> localVarResp = assignEmployeeWithHttpInfo(employeeAgreementsAssignEmployeeRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute assignEmployee request with HTTP info returned
         * @return ApiResponse&lt;EmployeeAgreementsAssignEmployeeResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Employee agreement created </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EmployeeAgreementsAssignEmployeeResponse> executeWithHttpInfo() throws ApiException {
            EmployeeAgreementsAssignEmployeeRequest employeeAgreementsAssignEmployeeRequest = buildBodyParams();
            return assignEmployeeWithHttpInfo(employeeAgreementsAssignEmployeeRequest);
        }

        /**
         * Execute assignEmployee request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Employee agreement created </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EmployeeAgreementsAssignEmployeeResponse> _callback) throws ApiException {
            EmployeeAgreementsAssignEmployeeRequest employeeAgreementsAssignEmployeeRequest = buildBodyParams();
            return assignEmployeeAsync(employeeAgreementsAssignEmployeeRequest, _callback);
        }
    }

    /**
     * Create employee agreement
     * Assign employee to agreement
     * @param employeeAgreementsAssignEmployeeRequest Data to create an agreement (required)
     * @return AssignEmployeeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Employee agreement created </td><td>  -  </td></tr>
     </table>
     */
    public AssignEmployeeRequestBuilder assignEmployee(UUID agreementId, UUID employeeId, LocalDate startDate) throws IllegalArgumentException {
        if (agreementId == null) throw new IllegalArgumentException("\"agreementId\" is required but got null");
            

        if (employeeId == null) throw new IllegalArgumentException("\"employeeId\" is required but got null");
            

        if (startDate == null) throw new IllegalArgumentException("\"startDate\" is required but got null");
        return new AssignEmployeeRequestBuilder(agreementId, employeeId, startDate);
    }
    private okhttp3.Call unassignEmployeeCall(UUID agreementEmployeeId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/schedule/v1/agreement-employees/{agreementEmployeeId}"
            .replace("{" + "agreementEmployeeId" + "}", localVarApiClient.escapeString(agreementEmployeeId.toString()));

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
    private okhttp3.Call unassignEmployeeValidateBeforeCall(UUID agreementEmployeeId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'agreementEmployeeId' is set
        if (agreementEmployeeId == null) {
            throw new ApiException("Missing the required parameter 'agreementEmployeeId' when calling unassignEmployee(Async)");
        }

        return unassignEmployeeCall(agreementEmployeeId, _callback);

    }


    private ApiResponse<EmployeeAgreementsUnassignEmployeeResponse> unassignEmployeeWithHttpInfo(UUID agreementEmployeeId) throws ApiException {
        okhttp3.Call localVarCall = unassignEmployeeValidateBeforeCall(agreementEmployeeId, null);
        Type localVarReturnType = new TypeToken<EmployeeAgreementsUnassignEmployeeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call unassignEmployeeAsync(UUID agreementEmployeeId, final ApiCallback<EmployeeAgreementsUnassignEmployeeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = unassignEmployeeValidateBeforeCall(agreementEmployeeId, _callback);
        Type localVarReturnType = new TypeToken<EmployeeAgreementsUnassignEmployeeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UnassignEmployeeRequestBuilder {
        private final UUID agreementEmployeeId;

        private UnassignEmployeeRequestBuilder(UUID agreementEmployeeId) {
            this.agreementEmployeeId = agreementEmployeeId;
        }

        /**
         * Build call for unassignEmployee
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Employee agreement deleted </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return unassignEmployeeCall(agreementEmployeeId, _callback);
        }


        /**
         * Execute unassignEmployee request
         * @return EmployeeAgreementsUnassignEmployeeResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Employee agreement deleted </td><td>  -  </td></tr>
         </table>
         */
        public EmployeeAgreementsUnassignEmployeeResponse execute() throws ApiException {
            ApiResponse<EmployeeAgreementsUnassignEmployeeResponse> localVarResp = unassignEmployeeWithHttpInfo(agreementEmployeeId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute unassignEmployee request with HTTP info returned
         * @return ApiResponse&lt;EmployeeAgreementsUnassignEmployeeResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Employee agreement deleted </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EmployeeAgreementsUnassignEmployeeResponse> executeWithHttpInfo() throws ApiException {
            return unassignEmployeeWithHttpInfo(agreementEmployeeId);
        }

        /**
         * Execute unassignEmployee request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Employee agreement deleted </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EmployeeAgreementsUnassignEmployeeResponse> _callback) throws ApiException {
            return unassignEmployeeAsync(agreementEmployeeId, _callback);
        }
    }

    /**
     * Delete employee agreement
     * Unassign employee to agreement
     * @param agreementEmployeeId Employee agreement UUID (required)
     * @return UnassignEmployeeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Employee agreement deleted </td><td>  -  </td></tr>
     </table>
     */
    public UnassignEmployeeRequestBuilder unassignEmployee(UUID agreementEmployeeId) throws IllegalArgumentException {
        if (agreementEmployeeId == null) throw new IllegalArgumentException("\"agreementEmployeeId\" is required but got null");
            

        return new UnassignEmployeeRequestBuilder(agreementEmployeeId);
    }
}
