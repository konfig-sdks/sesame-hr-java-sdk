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


import com.konfigthis.client.model.AbsenceDayOffListResponse;
import java.time.LocalDate;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AbsenceDayOffApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AbsenceDayOffApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AbsenceDayOffApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call listCall(List<UUID> employeeIds, LocalDate from, LocalDate to, Integer limit, Integer page, String orderBy, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/schedule/v1/absence-day-off";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (employeeIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "employeeIds", employeeIds));
        }

        if (from != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from", from));
        }

        if (to != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("to", to));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderBy", orderBy));
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
    private okhttp3.Call listValidateBeforeCall(List<UUID> employeeIds, LocalDate from, LocalDate to, Integer limit, Integer page, String orderBy, final ApiCallback _callback) throws ApiException {
        return listCall(employeeIds, from, to, limit, page, orderBy, _callback);

    }


    private ApiResponse<AbsenceDayOffListResponse> listWithHttpInfo(List<UUID> employeeIds, LocalDate from, LocalDate to, Integer limit, Integer page, String orderBy) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(employeeIds, from, to, limit, page, orderBy, null);
        Type localVarReturnType = new TypeToken<AbsenceDayOffListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(List<UUID> employeeIds, LocalDate from, LocalDate to, Integer limit, Integer page, String orderBy, final ApiCallback<AbsenceDayOffListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(employeeIds, from, to, limit, page, orderBy, _callback);
        Type localVarReturnType = new TypeToken<AbsenceDayOffListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private List<UUID> employeeIds;
        private LocalDate from;
        private LocalDate to;
        private Integer limit;
        private Integer page;
        private String orderBy;

        private ListRequestBuilder() {
        }

        /**
         * Set employeeIds
         * @param employeeIds The id of the employees (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder employeeIds(List<UUID> employeeIds) {
            this.employeeIds = employeeIds;
            return this;
        }
        
        /**
         * Set from
         * @param from First day of search period (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder from(LocalDate from) {
            this.from = from;
            return this;
        }
        
        /**
         * Set to
         * @param to Last day of search period (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder to(LocalDate to) {
            this.to = to;
            return this;
        }
        
        /**
         * Set limit
         * @param limit Limit day offs (optional)
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
         * Set orderBy
         * @param orderBy field1 asc, field2 desc (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder orderBy(String orderBy) {
            this.orderBy = orderBy;
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
            <tr><td> 200 </td><td> Array of Objects </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCall(employeeIds, from, to, limit, page, orderBy, _callback);
        }


        /**
         * Execute list request
         * @return AbsenceDayOffListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Array of Objects </td><td>  -  </td></tr>
         </table>
         */
        public AbsenceDayOffListResponse execute() throws ApiException {
            ApiResponse<AbsenceDayOffListResponse> localVarResp = listWithHttpInfo(employeeIds, from, to, limit, page, orderBy);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;AbsenceDayOffListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Array of Objects </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AbsenceDayOffListResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(employeeIds, from, to, limit, page, orderBy);
        }

        /**
         * Execute list request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Array of Objects </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AbsenceDayOffListResponse> _callback) throws ApiException {
            return listAsync(employeeIds, from, to, limit, page, orderBy, _callback);
        }
    }

    /**
     * List Absence Day Off
     * 
     * @return ListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Array of Objects </td><td>  -  </td></tr>
     </table>
     */
    public ListRequestBuilder list() throws IllegalArgumentException {
        return new ListRequestBuilder();
    }
}
