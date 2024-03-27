# VacationDayOffRequestsApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptRequest**](VacationDayOffRequestsApi.md#acceptRequest) | **POST** /schedule/v1/vacation-day-off-requests/{id}/accept | Accept Vacation Day Off Request |
| [**createRequest**](VacationDayOffRequestsApi.md#createRequest) | **POST** /schedule/v1/vacation-day-off-requests | Create Vacation Day Off Request |
| [**deleteById**](VacationDayOffRequestsApi.md#deleteById) | **DELETE** /schedule/v1/vacation-day-off-requests/{id} | Delete Vacation Day Off Request |
| [**list**](VacationDayOffRequestsApi.md#list) | **GET** /schedule/v1/vacation-day-off-requests | List Vacation Day Off Requests |
| [**rejectRequest**](VacationDayOffRequestsApi.md#rejectRequest) | **POST** /schedule/v1/vacation-day-off-requests/{id}/reject | Reject Vacation Day Off Request |


<a name="acceptRequest"></a>
# **acceptRequest**
> VacationDayOffRequestsAcceptRequestResponse acceptRequest(id).vacationDayOffRequestsAcceptRequestRequest(vacationDayOffRequestsAcceptRequestRequest).execute();

Accept Vacation Day Off Request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VacationDayOffRequestsApi;
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
    try {
      VacationDayOffRequestsAcceptRequestResponse result = client
              .vacationDayOffRequests
              .acceptRequest(id)
              .managerId(managerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationDayOffRequestsApi#acceptRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VacationDayOffRequestsAcceptRequestResponse> response = client
              .vacationDayOffRequests
              .acceptRequest(id)
              .managerId(managerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationDayOffRequestsApi#acceptRequest");
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
| **vacationDayOffRequestsAcceptRequestRequest** | [**VacationDayOffRequestsAcceptRequestRequest**](VacationDayOffRequestsAcceptRequestRequest.md)|  | [optional] |

### Return type

[**VacationDayOffRequestsAcceptRequestResponse**](VacationDayOffRequestsAcceptRequestResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="createRequest"></a>
# **createRequest**
> VacationDayOffRequestsCreateRequestResponse createRequest().vacationDayOffRequestsCreateRequestRequest(vacationDayOffRequestsCreateRequestRequest).execute();

Create Vacation Day Off Request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VacationDayOffRequestsApi;
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
    UUID calendarId = UUID.randomUUID();
    String type = "create";
    List<VacationCalendarsCreateNewCalendarRequestDaysOffInner> daysOff = Arrays.asList();
    String comment = "comment_example";
    try {
      VacationDayOffRequestsCreateRequestResponse result = client
              .vacationDayOffRequests
              .createRequest(employeeId, calendarId, type, daysOff)
              .comment(comment)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationDayOffRequestsApi#createRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VacationDayOffRequestsCreateRequestResponse> response = client
              .vacationDayOffRequests
              .createRequest(employeeId, calendarId, type, daysOff)
              .comment(comment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationDayOffRequestsApi#createRequest");
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
| **vacationDayOffRequestsCreateRequestRequest** | [**VacationDayOffRequestsCreateRequestRequest**](VacationDayOffRequestsCreateRequestRequest.md)| Create a Vacation Day Off Request | [optional] |

### Return type

[**VacationDayOffRequestsCreateRequestResponse**](VacationDayOffRequestsCreateRequestResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="deleteById"></a>
# **deleteById**
> VacationDayOffRequestsDeleteByIdResponse deleteById(id).execute();

Delete Vacation Day Off Request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VacationDayOffRequestsApi;
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
      VacationDayOffRequestsDeleteByIdResponse result = client
              .vacationDayOffRequests
              .deleteById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationDayOffRequestsApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VacationDayOffRequestsDeleteByIdResponse> response = client
              .vacationDayOffRequests
              .deleteById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationDayOffRequestsApi#deleteById");
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

[**VacationDayOffRequestsDeleteByIdResponse**](VacationDayOffRequestsDeleteByIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="list"></a>
# **list**
> VacationDayOffRequestsListResponse list().employeeId(employeeId).absencesValidator(absencesValidator).fromDayOff(fromDayOff).toDayOff(toDayOff).status(status).page(page).limit(limit).orderBy(orderBy).execute();

List Vacation Day Off Requests



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VacationDayOffRequestsApi;
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
    Integer page = 56; // Request a specific page
    Integer limit = 56; // Limit vacation requests
    String orderBy = "orderBy_example"; // field1 asc, field2 desc
    try {
      VacationDayOffRequestsListResponse result = client
              .vacationDayOffRequests
              .list()
              .employeeId(employeeId)
              .absencesValidator(absencesValidator)
              .fromDayOff(fromDayOff)
              .toDayOff(toDayOff)
              .status(status)
              .page(page)
              .limit(limit)
              .orderBy(orderBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationDayOffRequestsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VacationDayOffRequestsListResponse> response = client
              .vacationDayOffRequests
              .list()
              .employeeId(employeeId)
              .absencesValidator(absencesValidator)
              .fromDayOff(fromDayOff)
              .toDayOff(toDayOff)
              .status(status)
              .page(page)
              .limit(limit)
              .orderBy(orderBy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationDayOffRequestsApi#list");
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
| **page** | **Integer**| Request a specific page | [optional] |
| **limit** | **Integer**| Limit vacation requests | [optional] |
| **orderBy** | **String**| field1 asc, field2 desc | [optional] |

### Return type

[**VacationDayOffRequestsListResponse**](VacationDayOffRequestsListResponse.md)

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
> VacationDayOffRequestsRejectRequestResponse rejectRequest(id).vacationDayOffRequestsRejectRequestRequest(vacationDayOffRequestsRejectRequestRequest).execute();

Reject Vacation Day Off Request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VacationDayOffRequestsApi;
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
      VacationDayOffRequestsRejectRequestResponse result = client
              .vacationDayOffRequests
              .rejectRequest(id)
              .resolutionComment(resolutionComment)
              .managerId(managerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationDayOffRequestsApi#rejectRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VacationDayOffRequestsRejectRequestResponse> response = client
              .vacationDayOffRequests
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
      System.err.println("Exception when calling VacationDayOffRequestsApi#rejectRequest");
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
| **vacationDayOffRequestsRejectRequestRequest** | [**VacationDayOffRequestsRejectRequestRequest**](VacationDayOffRequestsRejectRequestRequest.md)|  | [optional] |

### Return type

[**VacationDayOffRequestsRejectRequestResponse**](VacationDayOffRequestsRejectRequestResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

