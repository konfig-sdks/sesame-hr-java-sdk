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


import com.konfigthis.client.model.DocumentsListDirectoriesResponse;
import com.konfigthis.client.model.DocumentsUploadNewDocumentRequest;
import com.konfigthis.client.model.DocumentsUploadNewDocumentResponse;
import java.io.File;
import java.time.LocalDate;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DocumentsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DocumentsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public DocumentsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call listDirectoriesCall(UUID employeeId, String parentDirectoryType, Integer limit, Integer page, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/document/v1/directories";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (employeeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employeeId", employeeId));
        }

        if (parentDirectoryType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("parentDirectoryType", parentDirectoryType));
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
    private okhttp3.Call listDirectoriesValidateBeforeCall(UUID employeeId, String parentDirectoryType, Integer limit, Integer page, final ApiCallback _callback) throws ApiException {
        return listDirectoriesCall(employeeId, parentDirectoryType, limit, page, _callback);

    }


    private ApiResponse<DocumentsListDirectoriesResponse> listDirectoriesWithHttpInfo(UUID employeeId, String parentDirectoryType, Integer limit, Integer page) throws ApiException {
        okhttp3.Call localVarCall = listDirectoriesValidateBeforeCall(employeeId, parentDirectoryType, limit, page, null);
        Type localVarReturnType = new TypeToken<DocumentsListDirectoriesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listDirectoriesAsync(UUID employeeId, String parentDirectoryType, Integer limit, Integer page, final ApiCallback<DocumentsListDirectoriesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listDirectoriesValidateBeforeCall(employeeId, parentDirectoryType, limit, page, _callback);
        Type localVarReturnType = new TypeToken<DocumentsListDirectoriesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListDirectoriesRequestBuilder {
        private UUID employeeId;
        private String parentDirectoryType;
        private Integer limit;
        private Integer page;

        private ListDirectoriesRequestBuilder() {
        }

        /**
         * Set employeeId
         * @param employeeId Filter directories by employee id (optional)
         * @return ListDirectoriesRequestBuilder
         */
        public ListDirectoriesRequestBuilder employeeId(UUID employeeId) {
            this.employeeId = employeeId;
            return this;
        }
        
        /**
         * Set parentDirectoryType
         * @param parentDirectoryType Parent directory type (optional)
         * @return ListDirectoriesRequestBuilder
         */
        public ListDirectoriesRequestBuilder parentDirectoryType(String parentDirectoryType) {
            this.parentDirectoryType = parentDirectoryType;
            return this;
        }
        
        /**
         * Set limit
         * @param limit Limit results (optional)
         * @return ListDirectoriesRequestBuilder
         */
        public ListDirectoriesRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set page
         * @param page Request a specific page (optional)
         * @return ListDirectoriesRequestBuilder
         */
        public ListDirectoriesRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Build call for listDirectories
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Company directories </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listDirectoriesCall(employeeId, parentDirectoryType, limit, page, _callback);
        }


        /**
         * Execute listDirectories request
         * @return DocumentsListDirectoriesResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Company directories </td><td>  -  </td></tr>
         </table>
         */
        public DocumentsListDirectoriesResponse execute() throws ApiException {
            ApiResponse<DocumentsListDirectoriesResponse> localVarResp = listDirectoriesWithHttpInfo(employeeId, parentDirectoryType, limit, page);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listDirectories request with HTTP info returned
         * @return ApiResponse&lt;DocumentsListDirectoriesResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Company directories </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<DocumentsListDirectoriesResponse> executeWithHttpInfo() throws ApiException {
            return listDirectoriesWithHttpInfo(employeeId, parentDirectoryType, limit, page);
        }

        /**
         * Execute listDirectories request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Company directories </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<DocumentsListDirectoriesResponse> _callback) throws ApiException {
            return listDirectoriesAsync(employeeId, parentDirectoryType, limit, page, _callback);
        }
    }

    /**
     * List company directories
     * 
     * @return ListDirectoriesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Company directories </td><td>  -  </td></tr>
     </table>
     */
    public ListDirectoriesRequestBuilder listDirectories() throws IllegalArgumentException {
        return new ListDirectoriesRequestBuilder();
    }
    private okhttp3.Call uploadNewDocumentCall(UUID directoryId, File document, DocumentsUploadNewDocumentRequest documentsUploadNewDocumentRequest, LocalDate originalDate, String name, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = documentsUploadNewDocumentRequest;

        // create path and map variables
        String localVarPath = "/document/v1/directories/{directoryId}/documents"
            .replace("{" + "directoryId" + "}", localVarApiClient.escapeString(directoryId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (document != null) {
            localVarFormParams.put("document", document);
        }

        if (originalDate != null) {
            localVarFormParams.put("originalDate", originalDate);
        }

        if (name != null) {
            localVarFormParams.put("name", name);
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

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call uploadNewDocumentValidateBeforeCall(UUID directoryId, File document, DocumentsUploadNewDocumentRequest documentsUploadNewDocumentRequest, LocalDate originalDate, String name, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'directoryId' is set
        if (directoryId == null) {
            throw new ApiException("Missing the required parameter 'directoryId' when calling uploadNewDocument(Async)");
        }

        // verify the required parameter 'document' is set
        if (document == null) {
            throw new ApiException("Missing the required parameter 'document' when calling uploadNewDocument(Async)");
        }

        // verify the required parameter 'documentsUploadNewDocumentRequest' is set
        if (documentsUploadNewDocumentRequest == null) {
            throw new ApiException("Missing the required parameter 'documentsUploadNewDocumentRequest' when calling uploadNewDocument(Async)");
        }

        return uploadNewDocumentCall(directoryId, document, documentsUploadNewDocumentRequest, originalDate, name, _callback);

    }


    private ApiResponse<DocumentsUploadNewDocumentResponse> uploadNewDocumentWithHttpInfo(UUID directoryId, File document, DocumentsUploadNewDocumentRequest documentsUploadNewDocumentRequest, LocalDate originalDate, String name) throws ApiException {
        okhttp3.Call localVarCall = uploadNewDocumentValidateBeforeCall(directoryId, document, documentsUploadNewDocumentRequest, originalDate, name, null);
        Type localVarReturnType = new TypeToken<DocumentsUploadNewDocumentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call uploadNewDocumentAsync(UUID directoryId, File document, DocumentsUploadNewDocumentRequest documentsUploadNewDocumentRequest, LocalDate originalDate, String name, final ApiCallback<DocumentsUploadNewDocumentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadNewDocumentValidateBeforeCall(directoryId, document, documentsUploadNewDocumentRequest, originalDate, name, _callback);
        Type localVarReturnType = new TypeToken<DocumentsUploadNewDocumentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UploadNewDocumentRequestBuilder {
        private final UUID directoryId;
        private final File document;
        private LocalDate originalDate;
        private String name;

        private UploadNewDocumentRequestBuilder(UUID directoryId, File document) {
            this.directoryId = directoryId;
            this.document = document;
        }

        /**
         * Set originalDate
         * @param originalDate Original date of document (Required for payrolls) (optional)
         * @return UploadNewDocumentRequestBuilder
         */
        public UploadNewDocumentRequestBuilder originalDate(LocalDate originalDate) {
            this.originalDate = originalDate;
            return this;
        }
        
        /**
         * Set name
         * @param name Name for the document (optional)
         * @return UploadNewDocumentRequestBuilder
         */
        public UploadNewDocumentRequestBuilder name(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * Build call for uploadNewDocument
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Uploaded document </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            DocumentsUploadNewDocumentRequest documentsUploadNewDocumentRequest = buildBodyParams();
            return uploadNewDocumentCall(directoryId, document, documentsUploadNewDocumentRequest, originalDate, name, _callback);
        }

        private DocumentsUploadNewDocumentRequest buildBodyParams() {
            DocumentsUploadNewDocumentRequest documentsUploadNewDocumentRequest = new DocumentsUploadNewDocumentRequest();
            documentsUploadNewDocumentRequest.document(this.document);
            documentsUploadNewDocumentRequest.originalDate(this.originalDate);
            documentsUploadNewDocumentRequest.name(this.name);
            return documentsUploadNewDocumentRequest;
        }

        /**
         * Execute uploadNewDocument request
         * @return DocumentsUploadNewDocumentResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Uploaded document </td><td>  -  </td></tr>
         </table>
         */
        public DocumentsUploadNewDocumentResponse execute() throws ApiException {
            DocumentsUploadNewDocumentRequest documentsUploadNewDocumentRequest = buildBodyParams();
            ApiResponse<DocumentsUploadNewDocumentResponse> localVarResp = uploadNewDocumentWithHttpInfo(directoryId, document, documentsUploadNewDocumentRequest, originalDate, name);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute uploadNewDocument request with HTTP info returned
         * @return ApiResponse&lt;DocumentsUploadNewDocumentResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Uploaded document </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<DocumentsUploadNewDocumentResponse> executeWithHttpInfo() throws ApiException {
            DocumentsUploadNewDocumentRequest documentsUploadNewDocumentRequest = buildBodyParams();
            return uploadNewDocumentWithHttpInfo(directoryId, document, documentsUploadNewDocumentRequest, originalDate, name);
        }

        /**
         * Execute uploadNewDocument request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Uploaded document </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<DocumentsUploadNewDocumentResponse> _callback) throws ApiException {
            DocumentsUploadNewDocumentRequest documentsUploadNewDocumentRequest = buildBodyParams();
            return uploadNewDocumentAsync(directoryId, document, documentsUploadNewDocumentRequest, originalDate, name, _callback);
        }
    }

    /**
     * Upload document
     * 
     * @param directoryId Directory UUID (required)
     * @param document Document to upload (required)
     * @param documentsUploadNewDocumentRequest Document to upload (required)
     * @return UploadNewDocumentRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Uploaded document </td><td>  -  </td></tr>
     </table>
     */
    public UploadNewDocumentRequestBuilder uploadNewDocument(UUID directoryId, File document) throws IllegalArgumentException {
        if (directoryId == null) throw new IllegalArgumentException("\"directoryId\" is required but got null");
            

        if (document == null) throw new IllegalArgumentException("\"document\" is required but got null");
        return new UploadNewDocumentRequestBuilder(directoryId, document);
    }
}
