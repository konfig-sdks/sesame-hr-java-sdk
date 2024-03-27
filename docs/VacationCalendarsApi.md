# VacationCalendarsApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewCalendar**](VacationCalendarsApi.md#createNewCalendar) | **POST** /schedule/v1/vacation-calendars | Create Vacation Calendar |
| [**listCalendars**](VacationCalendarsApi.md#listCalendars) | **GET** /schedule/v1/vacation-calendars | List Vacation Calendars |
| [**updateCalendar**](VacationCalendarsApi.md#updateCalendar) | **PUT** /schedule/v1/vacation-calendars/{id} | Update Vacation Calendar |


<a name="createNewCalendar"></a>
# **createNewCalendar**
> VacationCalendarsCreateNewCalendarResponse createNewCalendar().vacationCalendarsCreateNewCalendarRequest(vacationCalendarsCreateNewCalendarRequest).execute();

Create Vacation Calendar



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VacationCalendarsApi;
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
    UUID vacationConfigurationId = UUID.randomUUID();
    Integer year = 56;
    List<VacationCalendarsCreateNewCalendarRequestDaysOffInner> daysOff = Arrays.asList(); // array of VacationCalendarDayOff
    try {
      VacationCalendarsCreateNewCalendarResponse result = client
              .vacationCalendars
              .createNewCalendar(employeeId, vacationConfigurationId, year, daysOff)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationCalendarsApi#createNewCalendar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VacationCalendarsCreateNewCalendarResponse> response = client
              .vacationCalendars
              .createNewCalendar(employeeId, vacationConfigurationId, year, daysOff)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationCalendarsApi#createNewCalendar");
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
| **vacationCalendarsCreateNewCalendarRequest** | [**VacationCalendarsCreateNewCalendarRequest**](VacationCalendarsCreateNewCalendarRequest.md)| Create a Vacation Calendar | [optional] |

### Return type

[**VacationCalendarsCreateNewCalendarResponse**](VacationCalendarsCreateNewCalendarResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="listCalendars"></a>
# **listCalendars**
> VacationCalendarsListCalendarsResponse listCalendars().employeeId(employeeId).yearIn(yearIn).limit(limit).page(page).execute();

List Vacation Calendars



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VacationCalendarsApi;
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
    List<Integer> yearIn = Arrays.asList(); // Year calendar
    Integer limit = 20; // Limit results
    Integer page = 56; // Request a specific page
    try {
      VacationCalendarsListCalendarsResponse result = client
              .vacationCalendars
              .listCalendars()
              .employeeId(employeeId)
              .yearIn(yearIn)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationCalendarsApi#listCalendars");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VacationCalendarsListCalendarsResponse> response = client
              .vacationCalendars
              .listCalendars()
              .employeeId(employeeId)
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
      System.err.println("Exception when calling VacationCalendarsApi#listCalendars");
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
| **yearIn** | [**List&lt;Integer&gt;**](Integer.md)| Year calendar | [optional] |
| **limit** | **Integer**| Limit results | [optional] [default to 20] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**VacationCalendarsListCalendarsResponse**](VacationCalendarsListCalendarsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="updateCalendar"></a>
# **updateCalendar**
> VacationCalendarsUpdateCalendarResponse updateCalendar(id, vacationCalendarsUpdateCalendarRequest).execute();

Update Vacation Calendar



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VacationCalendarsApi;
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
    UUID id = UUID.randomUUID(); // Calendar ID
    List<VacationCalendarsUpdateCalendarRequestDaysOffInner> daysOff = Arrays.asList(); // array of VacationCalendarDayOff
    Integer maxDaysOff = 56; // This limit will have priority over the Vacation Configuration maxDaysOff limit
    try {
      VacationCalendarsUpdateCalendarResponse result = client
              .vacationCalendars
              .updateCalendar(id)
              .daysOff(daysOff)
              .maxDaysOff(maxDaysOff)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationCalendarsApi#updateCalendar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VacationCalendarsUpdateCalendarResponse> response = client
              .vacationCalendars
              .updateCalendar(id)
              .daysOff(daysOff)
              .maxDaysOff(maxDaysOff)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationCalendarsApi#updateCalendar");
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
| **vacationCalendarsUpdateCalendarRequest** | [**VacationCalendarsUpdateCalendarRequest**](VacationCalendarsUpdateCalendarRequest.md)| Vacation Calendar object that needs to be updated | |

### Return type

[**VacationCalendarsUpdateCalendarResponse**](VacationCalendarsUpdateCalendarResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

