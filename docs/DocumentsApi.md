# DocumentsApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listDirectories**](DocumentsApi.md#listDirectories) | **GET** /document/v1/directories | List company directories |
| [**uploadNewDocument**](DocumentsApi.md#uploadNewDocument) | **POST** /document/v1/directories/{directoryId}/documents | Upload document |


<a name="listDirectories"></a>
# **listDirectories**
> DocumentsListDirectoriesResponse listDirectories().employeeId(employeeId).parentDirectoryType(parentDirectoryType).limit(limit).page(page).execute();

List company directories



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-eu1.sesametime.com";
    
    // Configure HTTP bearer authorization: Bearer
    configuration.token = "BEARER TOKEN";
    SesameHr client = new SesameHr(configuration);
    UUID employeeId = UUID.randomUUID(); // Filter directories by employee id
    String parentDirectoryType = "parentDirectoryType_example"; // Parent directory type
    Integer limit = 56; // Limit results
    Integer page = 56; // Request a specific page
    try {
      DocumentsListDirectoriesResponse result = client
              .documents
              .listDirectories()
              .employeeId(employeeId)
              .parentDirectoryType(parentDirectoryType)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#listDirectories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocumentsListDirectoriesResponse> response = client
              .documents
              .listDirectories()
              .employeeId(employeeId)
              .parentDirectoryType(parentDirectoryType)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#listDirectories");
      System.err.println("Status code: " + e.getStatusCode());
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
| **employeeId** | **UUID**| Filter directories by employee id | [optional] |
| **parentDirectoryType** | **String**| Parent directory type | [optional] |
| **limit** | **Integer**| Limit results | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**DocumentsListDirectoriesResponse**](DocumentsListDirectoriesResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Company directories |  -  |

<a name="uploadNewDocument"></a>
# **uploadNewDocument**
> DocumentsUploadNewDocumentResponse uploadNewDocument(directoryId, document, documentsUploadNewDocumentRequest).originalDate(originalDate).name(name).execute();

Upload document



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-eu1.sesametime.com";
    
    // Configure HTTP bearer authorization: Bearer
    configuration.token = "BEARER TOKEN";
    SesameHr client = new SesameHr(configuration);
    UUID directoryId = UUID.randomUUID(); // Directory UUID
    File document = new File("/path/to/file"); // Document to upload
    LocalDate originalDate = LocalDate.now(); // Original date of document (Required for payrolls)
    String name = "name_example"; // Name for the document
    try {
      DocumentsUploadNewDocumentResponse result = client
              .documents
              .uploadNewDocument(directoryId, document)
              .originalDate(originalDate)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadNewDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocumentsUploadNewDocumentResponse> response = client
              .documents
              .uploadNewDocument(directoryId, document)
              .originalDate(originalDate)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadNewDocument");
      System.err.println("Status code: " + e.getStatusCode());
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
| **directoryId** | **UUID**| Directory UUID | |
| **document** | **File**| Document to upload | |
| **documentsUploadNewDocumentRequest** | [**DocumentsUploadNewDocumentRequest**](DocumentsUploadNewDocumentRequest.md)| Document to upload | |
| **originalDate** | **LocalDate**| Original date of document (Required for payrolls) | [optional] |
| **name** | **String**| Name for the document | [optional] |

### Return type

[**DocumentsUploadNewDocumentResponse**](DocumentsUploadNewDocumentResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Uploaded document |  -  |

