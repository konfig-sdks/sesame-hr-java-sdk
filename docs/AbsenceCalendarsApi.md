# AbsenceCalendarsApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCalendar**](AbsenceCalendarsApi.md#createCalendar) | **POST** /schedule/v1/absence-calendars | Create Absence Calendar |
| [**list**](AbsenceCalendarsApi.md#list) | **GET** /schedule/v1/absence-calendars | List Absence Calendars |
| [**updateById**](AbsenceCalendarsApi.md#updateById) | **PUT** /schedule/v1/absence-calendars/{id} | Update Absence Calendar |


<a name="createCalendar"></a>
# **createCalendar**
> AbsenceCalendarsCreateCalendarResponse createCalendar().absenceCalendarsCreateCalendarRequest(absenceCalendarsCreateCalendarRequest).execute();

Create Absence Calendar



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsenceCalendarsApi;
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
    UUID absenceTypeId = UUID.randomUUID();
    Integer year = 56;
    List<AbsenceCalendarsCreateCalendarRequestDaysOffInner> daysOff = Arrays.asList(); // array of AbsenceCalendarDayOff
    try {
      AbsenceCalendarsCreateCalendarResponse result = client
              .absenceCalendars
              .createCalendar(employeeId, absenceTypeId, year, daysOff)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceCalendarsApi#createCalendar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsenceCalendarsCreateCalendarResponse> response = client
              .absenceCalendars
              .createCalendar(employeeId, absenceTypeId, year, daysOff)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceCalendarsApi#createCalendar");
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
| **absenceCalendarsCreateCalendarRequest** | [**AbsenceCalendarsCreateCalendarRequest**](AbsenceCalendarsCreateCalendarRequest.md)| Create a Absence Calendar | [optional] |

### Return type

[**AbsenceCalendarsCreateCalendarResponse**](AbsenceCalendarsCreateCalendarResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="list"></a>
# **list**
> AbsenceCalendarsListResponse list().employeeId(employeeId).type(type).yearIn(yearIn).limit(limit).page(page).execute();

List Absence Calendars



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsenceCalendarsApi;
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
    UUID type = UUID.randomUUID(); // Absence Type ID
    List<Integer> yearIn = Arrays.asList(); // Year calendar
    Integer limit = 20; // Limit results
    Integer page = 56; // Request a specific page
    try {
      AbsenceCalendarsListResponse result = client
              .absenceCalendars
              .list()
              .employeeId(employeeId)
              .type(type)
              .yearIn(yearIn)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceCalendarsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsenceCalendarsListResponse> response = client
              .absenceCalendars
              .list()
              .employeeId(employeeId)
              .type(type)
              .yearIn(yearIn)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceCalendarsApi#list");
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
| **employeeId** | **UUID**| Employee ID | [optional] |
| **type** | **UUID**| Absence Type ID | [optional] |
| **yearIn** | [**List&lt;Integer&gt;**](Integer.md)| Year calendar | [optional] |
| **limit** | **Integer**| Limit results | [optional] [default to 20] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**AbsenceCalendarsListResponse**](AbsenceCalendarsListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="updateById"></a>
# **updateById**
> AbsenceCalendarsUpdateByIdResponse updateById(id).absenceCalendarsUpdateByIdRequest(absenceCalendarsUpdateByIdRequest).execute();

Update Absence Calendar



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsenceCalendarsApi;
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
    List<AbsenceCalendarsUpdateByIdRequestDaysOffInner> daysOff = Arrays.asList(); // array of AbsenceCalendarDayOff
    UUID id = UUID.randomUUID(); // Calendar ID
    try {
      AbsenceCalendarsUpdateByIdResponse result = client
              .absenceCalendars
              .updateById(daysOff, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceCalendarsApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsenceCalendarsUpdateByIdResponse> response = client
              .absenceCalendars
              .updateById(daysOff, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceCalendarsApi#updateById");
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
| **id** | **UUID**| Calendar ID | |
| **absenceCalendarsUpdateByIdRequest** | [**AbsenceCalendarsUpdateByIdRequest**](AbsenceCalendarsUpdateByIdRequest.md)| Absence Calendar object that needs to be updated | [optional] |

### Return type

[**AbsenceCalendarsUpdateByIdResponse**](AbsenceCalendarsUpdateByIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

