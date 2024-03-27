# RecruitmentApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCandidate**](RecruitmentApi.md#createCandidate) | **POST** /recruitment/v1/candidates | Create a candidate |
| [**getCandidateById**](RecruitmentApi.md#getCandidateById) | **GET** /recruitment/v1/candidates/{id} | Get a candidate |
| [**getCandidateStatusList**](RecruitmentApi.md#getCandidateStatusList) | **GET** /recruitment/v1/candidate-status/{vacancyId} | Get candidate status list |
| [**getVacancy**](RecruitmentApi.md#getVacancy) | **GET** /recruitment/v1/vacancies/{id} | Get a vacancy |
| [**listVacancies**](RecruitmentApi.md#listVacancies) | **GET** /recruitment/v1/vacancies | Get vacancies list |
| [**updateCandidate**](RecruitmentApi.md#updateCandidate) | **PUT** /recruitment/v1/candidates/{id} | Update a candidate |
| [**uploadCandidateDocument**](RecruitmentApi.md#uploadCandidateDocument) | **POST** /recruitment/v1/candidates/{id} | Upload candidate document |


<a name="createCandidate"></a>
# **createCandidate**
> RecruitmentCreateCandidateResponse createCandidate(recruitmentCreateCandidateRequest).execute();

Create a candidate



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecruitmentApi;
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
    String firstName = "firstName_example"; // The first name of the candidate
    String lastName = "lastName_example"; // The last name of the candidate
    String email = "email_example";
    String phone = "phone_example"; // The phone number of the candidate
    UUID vacancyId = UUID.randomUUID(); // The identifier of the vacancy where the candidate will be added
    String linkedinURL = "linkedinURL_example"; // The LinkedIn URL of the candidate
    String desiredSalary = "desiredSalary_example"; // The desired salary of the candidate
    String startWorkDate = "startWorkDate_example"; // The start work date of the candidate
    String web = "web_example"; // The web of the candidate
    String location = "location_example"; // The location of the candidate
    UUID statusId = UUID.randomUUID(); // The identifier of the status of the candidate
    try {
      RecruitmentCreateCandidateResponse result = client
              .recruitment
              .createCandidate(firstName, lastName, email, phone, vacancyId)
              .linkedinURL(linkedinURL)
              .desiredSalary(desiredSalary)
              .startWorkDate(startWorkDate)
              .web(web)
              .location(location)
              .statusId(statusId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#createCandidate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecruitmentCreateCandidateResponse> response = client
              .recruitment
              .createCandidate(firstName, lastName, email, phone, vacancyId)
              .linkedinURL(linkedinURL)
              .desiredSalary(desiredSalary)
              .startWorkDate(startWorkDate)
              .web(web)
              .location(location)
              .statusId(statusId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#createCandidate");
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
| **recruitmentCreateCandidateRequest** | [**RecruitmentCreateCandidateRequest**](RecruitmentCreateCandidateRequest.md)| Candidate object that needs to be created | |

### Return type

[**RecruitmentCreateCandidateResponse**](RecruitmentCreateCandidateResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="getCandidateById"></a>
# **getCandidateById**
> RecruitmentGetCandidateByIdResponse getCandidateById(id).execute();

Get a candidate



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecruitmentApi;
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
    UUID id = UUID.randomUUID(); // Candidate ID
    try {
      RecruitmentGetCandidateByIdResponse result = client
              .recruitment
              .getCandidateById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#getCandidateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecruitmentGetCandidateByIdResponse> response = client
              .recruitment
              .getCandidateById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#getCandidateById");
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
| **id** | **UUID**| Candidate ID | |

### Return type

[**RecruitmentGetCandidateByIdResponse**](RecruitmentGetCandidateByIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="getCandidateStatusList"></a>
# **getCandidateStatusList**
> RecruitmentGetCandidateStatusListResponse getCandidateStatusList(vacancyId).execute();

Get candidate status list



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecruitmentApi;
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
    UUID vacancyId = UUID.randomUUID(); // Vacancy ID
    try {
      RecruitmentGetCandidateStatusListResponse result = client
              .recruitment
              .getCandidateStatusList(vacancyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#getCandidateStatusList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecruitmentGetCandidateStatusListResponse> response = client
              .recruitment
              .getCandidateStatusList(vacancyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#getCandidateStatusList");
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
| **vacancyId** | **UUID**| Vacancy ID | |

### Return type

[**RecruitmentGetCandidateStatusListResponse**](RecruitmentGetCandidateStatusListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="getVacancy"></a>
# **getVacancy**
> RecruitmentGetVacancyResponse getVacancy(id).execute();

Get a vacancy



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecruitmentApi;
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
    UUID id = UUID.randomUUID(); // Vacancy ID
    try {
      RecruitmentGetVacancyResponse result = client
              .recruitment
              .getVacancy(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#getVacancy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecruitmentGetVacancyResponse> response = client
              .recruitment
              .getVacancy(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#getVacancy");
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
| **id** | **UUID**| Vacancy ID | |

### Return type

[**RecruitmentGetVacancyResponse**](RecruitmentGetVacancyResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="listVacancies"></a>
# **listVacancies**
> RecruitmentListVacanciesResponse listVacancies().execute();

Get vacancies list



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecruitmentApi;
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
    try {
      RecruitmentListVacanciesResponse result = client
              .recruitment
              .listVacancies()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#listVacancies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecruitmentListVacanciesResponse> response = client
              .recruitment
              .listVacancies()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#listVacancies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RecruitmentListVacanciesResponse**](RecruitmentListVacanciesResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of objects |  -  |

<a name="updateCandidate"></a>
# **updateCandidate**
> RecruitmentUpdateCandidateResponse updateCandidate(id, recruitmentUpdateCandidateRequest).execute();

Update a candidate



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecruitmentApi;
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
    String firstName = "firstName_example"; // The first name of the candidate
    String lastName = "lastName_example"; // The last name of the candidate
    String email = "email_example";
    String phone = "phone_example"; // The phone number of the candidate
    UUID vacancyId = UUID.randomUUID(); // The identifier of the vacancy where the candidate will be added
    UUID id = UUID.randomUUID(); // Candidate ID
    String linkedinURL = "linkedinURL_example"; // The LinkedIn URL of the candidate
    String desiredSalary = "desiredSalary_example"; // The desired salary of the candidate
    String startWorkDate = "startWorkDate_example"; // The start work date of the candidate
    String web = "web_example"; // The web of the candidate
    String location = "location_example"; // The location of the candidate
    UUID statusId = UUID.randomUUID(); // The identifier of the status of the candidate
    try {
      RecruitmentUpdateCandidateResponse result = client
              .recruitment
              .updateCandidate(firstName, lastName, email, phone, vacancyId, id)
              .linkedinURL(linkedinURL)
              .desiredSalary(desiredSalary)
              .startWorkDate(startWorkDate)
              .web(web)
              .location(location)
              .statusId(statusId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#updateCandidate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecruitmentUpdateCandidateResponse> response = client
              .recruitment
              .updateCandidate(firstName, lastName, email, phone, vacancyId, id)
              .linkedinURL(linkedinURL)
              .desiredSalary(desiredSalary)
              .startWorkDate(startWorkDate)
              .web(web)
              .location(location)
              .statusId(statusId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#updateCandidate");
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
| **id** | **UUID**| Candidate ID | |
| **recruitmentUpdateCandidateRequest** | [**RecruitmentUpdateCandidateRequest**](RecruitmentUpdateCandidateRequest.md)| Candidate object that needs to be updated | |

### Return type

[**RecruitmentUpdateCandidateResponse**](RecruitmentUpdateCandidateResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="uploadCandidateDocument"></a>
# **uploadCandidateDocument**
> RecruitmentUploadCandidateDocumentResponse uploadCandidateDocument(id, document, recruitmentUploadCandidateDocumentRequest).execute();

Upload candidate document



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecruitmentApi;
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
    UUID id = UUID.randomUUID(); // Candidate ID
    File document = new File("/path/to/file"); // Document to upload
    try {
      RecruitmentUploadCandidateDocumentResponse result = client
              .recruitment
              .uploadCandidateDocument(id, document)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#uploadCandidateDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecruitmentUploadCandidateDocumentResponse> response = client
              .recruitment
              .uploadCandidateDocument(id, document)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#uploadCandidateDocument");
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
| **id** | **UUID**| Candidate ID | |
| **document** | **File**| Document to upload | |
| **recruitmentUploadCandidateDocumentRequest** | [**RecruitmentUploadCandidateDocumentRequest**](RecruitmentUploadCandidateDocumentRequest.md)| Document to upload | |

### Return type

[**RecruitmentUploadCandidateDocumentResponse**](RecruitmentUploadCandidateDocumentResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

