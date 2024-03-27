# AbsenceDayOffRequestsApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptRequest**](AbsenceDayOffRequestsApi.md#acceptRequest) | **POST** /schedule/v1/absence-day-off-requests/{id}/accept | Accept Absence Day Off Request |
| [**createDayOffRequest**](AbsenceDayOffRequestsApi.md#createDayOffRequest) | **POST** /schedule/v1/absence-day-off-requests | Create Absence Day Off Request |
| [**deleteRequestById**](AbsenceDayOffRequestsApi.md#deleteRequestById) | **DELETE** /schedule/v1/absence-day-off-requests/{id} | Delete Absence Day Off Request |
| [**listDayOffRequests**](AbsenceDayOffRequestsApi.md#listDayOffRequests) | **GET** /schedule/v1/absence-day-off-requests | List Absence Day Off Requests |
| [**rejectRequest**](AbsenceDayOffRequestsApi.md#rejectRequest) | **POST** /schedule/v1/absence-day-off-requests/{id}/reject | Reject Absence Day Off Request |


<a name="acceptRequest"></a>
# **acceptRequest**
> AbsenceDayOffRequestsAcceptRequestResponse acceptRequest(id).absenceDayOffRequestsAcceptRequestRequest(absenceDayOffRequestsAcceptRequestRequest).execute();

Accept Absence Day Off Request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsenceDayOffRequestsApi;
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
    UUID id = UUID.randomUUID(); // Day Off Request Id
    UUID managerId = UUID.randomUUID();
    String resolutionComment = "resolutionComment_example";
    try {
      AbsenceDayOffRequestsAcceptRequestResponse result = client
              .absenceDayOffRequests
              .acceptRequest(id)
              .managerId(managerId)
              .resolutionComment(resolutionComment)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDayOffRequestsApi#acceptRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsenceDayOffRequestsAcceptRequestResponse> response = client
              .absenceDayOffRequests
              .acceptRequest(id)
              .managerId(managerId)
              .resolutionComment(resolutionComment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDayOffRequestsApi#acceptRequest");
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
| **id** | **UUID**| Day Off Request Id | |
| **absenceDayOffRequestsAcceptRequestRequest** | [**AbsenceDayOffRequestsAcceptRequestRequest**](AbsenceDayOffRequestsAcceptRequestRequest.md)|  | [optional] |

### Return type

[**AbsenceDayOffRequestsAcceptRequestResponse**](AbsenceDayOffRequestsAcceptRequestResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="createDayOffRequest"></a>
# **createDayOffRequest**
> AbsenceDayOffRequestsCreateDayOffRequestResponse createDayOffRequest().absenceDayOffRequestsCreateDayOffRequestRequest(absenceDayOffRequestsCreateDayOffRequestRequest).execute();

Create Absence Day Off Request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsenceDayOffRequestsApi;
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
    UUID employeeId = UUID.randomUUID();
    String type = "create";
    List<AbsenceDayOffRequestsCreateDayOffRequestRequestDaysOffInner> daysOff = Arrays.asList();
    UUID absenceTypeId = UUID.randomUUID();
    String comment = "comment_example";
    try {
      AbsenceDayOffRequestsCreateDayOffRequestResponse result = client
              .absenceDayOffRequests
              .createDayOffRequest(employeeId, type, daysOff)
              .absenceTypeId(absenceTypeId)
              .comment(comment)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDayOffRequestsApi#createDayOffRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsenceDayOffRequestsCreateDayOffRequestResponse> response = client
              .absenceDayOffRequests
              .createDayOffRequest(employeeId, type, daysOff)
              .absenceTypeId(absenceTypeId)
              .comment(comment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDayOffRequestsApi#createDayOffRequest");
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
| **absenceDayOffRequestsCreateDayOffRequestRequest** | [**AbsenceDayOffRequestsCreateDayOffRequestRequest**](AbsenceDayOffRequestsCreateDayOffRequestRequest.md)| Create a Absence Day Off Request | [optional] |

### Return type

[**AbsenceDayOffRequestsCreateDayOffRequestResponse**](AbsenceDayOffRequestsCreateDayOffRequestResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="deleteRequestById"></a>
# **deleteRequestById**
> AbsenceDayOffRequestsDeleteRequestByIdResponse deleteRequestById(id).execute();

Delete Absence Day Off Request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsenceDayOffRequestsApi;
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
    UUID id = UUID.randomUUID(); // Day Off Request Id
    try {
      AbsenceDayOffRequestsDeleteRequestByIdResponse result = client
              .absenceDayOffRequests
              .deleteRequestById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDayOffRequestsApi#deleteRequestById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsenceDayOffRequestsDeleteRequestByIdResponse> response = client
              .absenceDayOffRequests
              .deleteRequestById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDayOffRequestsApi#deleteRequestById");
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
| **id** | **UUID**| Day Off Request Id | |

### Return type

[**AbsenceDayOffRequestsDeleteRequestByIdResponse**](AbsenceDayOffRequestsDeleteRequestByIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="listDayOffRequests"></a>
# **listDayOffRequests**
> AbsenceDayOffRequestsListDayOffRequestsResponse listDayOffRequests().employeeId(employeeId).absencesValidator(absencesValidator).fromDayOff(fromDayOff).toDayOff(toDayOff).status(status).limit(limit).page(page).orderBy(orderBy).execute();

List Absence Day Off Requests



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsenceDayOffRequestsApi;
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
    UUID employeeId = UUID.randomUUID(); // The id of the employee
    UUID absencesValidator = UUID.randomUUID(); // The id of the manager
    LocalDate fromDayOff = LocalDate.now(); // First day of search period
    LocalDate toDayOff = LocalDate.now(); // Last day of search period
    String status = "accepted"; // Request status
    Integer limit = 56; // Limit day offs
    Integer page = 56; // Request a specific page
    String orderBy = "orderBy_example"; // field1 asc, field2 desc
    try {
      AbsenceDayOffRequestsListDayOffRequestsResponse result = client
              .absenceDayOffRequests
              .listDayOffRequests()
              .employeeId(employeeId)
              .absencesValidator(absencesValidator)
              .fromDayOff(fromDayOff)
              .toDayOff(toDayOff)
              .status(status)
              .limit(limit)
              .page(page)
              .orderBy(orderBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDayOffRequestsApi#listDayOffRequests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsenceDayOffRequestsListDayOffRequestsResponse> response = client
              .absenceDayOffRequests
              .listDayOffRequests()
              .employeeId(employeeId)
              .absencesValidator(absencesValidator)
              .fromDayOff(fromDayOff)
              .toDayOff(toDayOff)
              .status(status)
              .limit(limit)
              .page(page)
              .orderBy(orderBy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDayOffRequestsApi#listDayOffRequests");
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
| **employeeId** | **UUID**| The id of the employee | [optional] |
| **absencesValidator** | **UUID**| The id of the manager | [optional] |
| **fromDayOff** | **LocalDate**| First day of search period | [optional] |
| **toDayOff** | **LocalDate**| Last day of search period | [optional] |
| **status** | **String**| Request status | [optional] [enum: accepted, rejected, pending] |
| **limit** | **Integer**| Limit day offs | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |
| **orderBy** | **String**| field1 asc, field2 desc | [optional] |

### Return type

[**AbsenceDayOffRequestsListDayOffRequestsResponse**](AbsenceDayOffRequestsListDayOffRequestsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="rejectRequest"></a>
# **rejectRequest**
> AbsenceDayOffRequestsRejectRequestResponse rejectRequest(id).absenceDayOffRequestsRejectRequestRequest(absenceDayOffRequestsRejectRequestRequest).execute();

Reject Absence Day Off Request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsenceDayOffRequestsApi;
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
    UUID id = UUID.randomUUID(); // Day Off Request Id
    String resolutionComment = "resolutionComment_example";
    UUID managerId = UUID.randomUUID();
    try {
      AbsenceDayOffRequestsRejectRequestResponse result = client
              .absenceDayOffRequests
              .rejectRequest(id)
              .resolutionComment(resolutionComment)
              .managerId(managerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDayOffRequestsApi#rejectRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsenceDayOffRequestsRejectRequestResponse> response = client
              .absenceDayOffRequests
              .rejectRequest(id)
              .resolutionComment(resolutionComment)
              .managerId(managerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDayOffRequestsApi#rejectRequest");
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
| **id** | **UUID**| Day Off Request Id | |
| **absenceDayOffRequestsRejectRequestRequest** | [**AbsenceDayOffRequestsRejectRequestRequest**](AbsenceDayOffRequestsRejectRequestRequest.md)|  | [optional] |

### Return type

[**AbsenceDayOffRequestsRejectRequestResponse**](AbsenceDayOffRequestsRejectRequestResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

