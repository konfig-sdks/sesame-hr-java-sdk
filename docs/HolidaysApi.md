# HolidaysApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignToEmployee**](HolidaysApi.md#assignToEmployee) | **POST** /schedule/v1/holidays/{holidayCalendarId}/employees | Assign Holiday Calendar To Employee |
| [**getByHolidayCalendarEmployees**](HolidaysApi.md#getByHolidayCalendarEmployees) | **GET** /schedule/v1/holidays/{holidayCalendarId}/employees | Get Employees By Holiday Calendar |
| [**list**](HolidaysApi.md#list) | **GET** /schedule/v1/holidays | List Holidays |
| [**unassignHolidayCalendarToEmployee**](HolidaysApi.md#unassignHolidayCalendarToEmployee) | **DELETE** /schedule/v1/holidays/{holidayCalendarId}/employees | Unassign Holiday Calendar To Employee |


<a name="assignToEmployee"></a>
# **assignToEmployee**
> HolidaysAssignToEmployeeResponse assignToEmployee(holidayCalendarId).holidaysAssignToEmployeeRequest(holidaysAssignToEmployeeRequest).execute();

Assign Holiday Calendar To Employee



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidaysApi;
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
    UUID holidayCalendarId = UUID.randomUUID(); // Holiday Calendar Id
    List<UUID> employees = Arrays.asList();
    LocalDate startDate = LocalDate.now();
    try {
      HolidaysAssignToEmployeeResponse result = client
              .holidays
              .assignToEmployee(holidayCalendarId)
              .employees(employees)
              .startDate(startDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidaysApi#assignToEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidaysAssignToEmployeeResponse> response = client
              .holidays
              .assignToEmployee(holidayCalendarId)
              .employees(employees)
              .startDate(startDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidaysApi#assignToEmployee");
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
| **holidayCalendarId** | **UUID**| Holiday Calendar Id | |
| **holidaysAssignToEmployeeRequest** | [**HolidaysAssignToEmployeeRequest**](HolidaysAssignToEmployeeRequest.md)| Assign Holiday Calendar To Employee | [optional] |

### Return type

[**HolidaysAssignToEmployeeResponse**](HolidaysAssignToEmployeeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="getByHolidayCalendarEmployees"></a>
# **getByHolidayCalendarEmployees**
> HolidaysGetByHolidayCalendarEmployeesResponse getByHolidayCalendarEmployees(holidayCalendarId).limit(limit).page(page).execute();

Get Employees By Holiday Calendar



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidaysApi;
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
    UUID holidayCalendarId = UUID.randomUUID(); // Holiday Calendar Id
    Integer limit = 56; // Limit results
    Integer page = 56; // Request a specific page
    try {
      HolidaysGetByHolidayCalendarEmployeesResponse result = client
              .holidays
              .getByHolidayCalendarEmployees(holidayCalendarId)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidaysApi#getByHolidayCalendarEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidaysGetByHolidayCalendarEmployeesResponse> response = client
              .holidays
              .getByHolidayCalendarEmployees(holidayCalendarId)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidaysApi#getByHolidayCalendarEmployees");
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
| **holidayCalendarId** | **UUID**| Holiday Calendar Id | |
| **limit** | **Integer**| Limit results | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**HolidaysGetByHolidayCalendarEmployeesResponse**](HolidaysGetByHolidayCalendarEmployeesResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="list"></a>
# **list**
> HolidaysListResponse list(employeeId, year).limit(limit).page(page).execute();

List Holidays



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidaysApi;
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
    UUID employeeId = UUID.randomUUID(); // Employee ID
    Integer year = 2021; // 
    Integer limit = 56; // Limit results
    Integer page = 56; // Request a specific page
    try {
      HolidaysListResponse result = client
              .holidays
              .list(employeeId, year)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidaysApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidaysListResponse> response = client
              .holidays
              .list(employeeId, year)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidaysApi#list");
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
| **employeeId** | **UUID**| Employee ID | |
| **year** | **Integer**|  | |
| **limit** | **Integer**| Limit results | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**HolidaysListResponse**](HolidaysListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="unassignHolidayCalendarToEmployee"></a>
# **unassignHolidayCalendarToEmployee**
> HolidaysUnassignHolidayCalendarToEmployeeResponse unassignHolidayCalendarToEmployee(holidayCalendarId).holidaysUnassignHolidayCalendarToEmployeeRequest(holidaysUnassignHolidayCalendarToEmployeeRequest).execute();

Unassign Holiday Calendar To Employee



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidaysApi;
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
    UUID holidayCalendarId = UUID.randomUUID(); // Holiday Calendar Id
    List<UUID> employees = Arrays.asList();
    try {
      HolidaysUnassignHolidayCalendarToEmployeeResponse result = client
              .holidays
              .unassignHolidayCalendarToEmployee(holidayCalendarId)
              .employees(employees)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidaysApi#unassignHolidayCalendarToEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidaysUnassignHolidayCalendarToEmployeeResponse> response = client
              .holidays
              .unassignHolidayCalendarToEmployee(holidayCalendarId)
              .employees(employees)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidaysApi#unassignHolidayCalendarToEmployee");
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
| **holidayCalendarId** | **UUID**| Holiday Calendar Id | |
| **holidaysUnassignHolidayCalendarToEmployeeRequest** | [**HolidaysUnassignHolidayCalendarToEmployeeRequest**](HolidaysUnassignHolidayCalendarToEmployeeRequest.md)| Assign Holiday Calendar To Employee | [optional] |

### Return type

[**HolidaysUnassignHolidayCalendarToEmployeeResponse**](HolidaysUnassignHolidayCalendarToEmployeeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

