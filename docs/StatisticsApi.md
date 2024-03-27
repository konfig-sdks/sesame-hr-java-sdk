# StatisticsApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listWorkedAbsenceDaysByEmployee**](StatisticsApi.md#listWorkedAbsenceDaysByEmployee) | **GET** /schedule/v1/reports/worked-absence-days | List Worked Absence Days By Employee |
| [**listWorkedHoursByEmployee**](StatisticsApi.md#listWorkedHoursByEmployee) | **GET** /schedule/v1/reports/worked-hours | List Worked Hours By Employee |
| [**listWorkedHoursByWeekDay**](StatisticsApi.md#listWorkedHoursByWeekDay) | **GET** /schedule/v1/reports/worked-hours-by-week-day | List Worked Hours By Employee and Week Day |
| [**listWorkedNightHours**](StatisticsApi.md#listWorkedNightHours) | **GET** /schedule/v1/reports/worked-night-hours | List Worked Hours By Employee In Night Hours |


<a name="listWorkedAbsenceDaysByEmployee"></a>
# **listWorkedAbsenceDaysByEmployee**
> StatisticsListWorkedAbsenceDaysByEmployeeResponse listWorkedAbsenceDaysByEmployee(from, to).employeeIdsIn(employeeIdsIn).limit(limit).page(page).execute();

List Worked Absence Days By Employee



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatisticsApi;
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
    LocalDate from = LocalDate.now(); // Y-m-d
    LocalDate to = LocalDate.now(); // Y-m-d
    List<UUID> employeeIdsIn = Arrays.asList(); // Array of employee ids
    Integer limit = 56; // Limit employees
    Integer page = 56; // Request a specific page
    try {
      StatisticsListWorkedAbsenceDaysByEmployeeResponse result = client
              .statistics
              .listWorkedAbsenceDaysByEmployee(from, to)
              .employeeIdsIn(employeeIdsIn)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#listWorkedAbsenceDaysByEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StatisticsListWorkedAbsenceDaysByEmployeeResponse> response = client
              .statistics
              .listWorkedAbsenceDaysByEmployee(from, to)
              .employeeIdsIn(employeeIdsIn)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#listWorkedAbsenceDaysByEmployee");
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
| **from** | **LocalDate**| Y-m-d | |
| **to** | **LocalDate**| Y-m-d | |
| **employeeIdsIn** | [**List&lt;UUID&gt;**](UUID.md)| Array of employee ids | [optional] |
| **limit** | **Integer**| Limit employees | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**StatisticsListWorkedAbsenceDaysByEmployeeResponse**](StatisticsListWorkedAbsenceDaysByEmployeeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="listWorkedHoursByEmployee"></a>
# **listWorkedHoursByEmployee**
> StatisticsListWorkedHoursByEmployeeResponse listWorkedHoursByEmployee(from, to).employeeIdsIn(employeeIdsIn).withChecks(withChecks).limit(limit).page(page).execute();

List Worked Hours By Employee



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatisticsApi;
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
    LocalDate from = LocalDate.now(); // Y-m-d
    LocalDate to = LocalDate.now(); // Y-m-d
    List<UUID> employeeIdsIn = Arrays.asList(); // Array of employee ids
    Boolean withChecks = true; // true or false
    Integer limit = 56; // Limit employees
    Integer page = 56; // Request a specific page
    try {
      StatisticsListWorkedHoursByEmployeeResponse result = client
              .statistics
              .listWorkedHoursByEmployee(from, to)
              .employeeIdsIn(employeeIdsIn)
              .withChecks(withChecks)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#listWorkedHoursByEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StatisticsListWorkedHoursByEmployeeResponse> response = client
              .statistics
              .listWorkedHoursByEmployee(from, to)
              .employeeIdsIn(employeeIdsIn)
              .withChecks(withChecks)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#listWorkedHoursByEmployee");
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
| **from** | **LocalDate**| Y-m-d | |
| **to** | **LocalDate**| Y-m-d | |
| **employeeIdsIn** | [**List&lt;UUID&gt;**](UUID.md)| Array of employee ids | [optional] |
| **withChecks** | **Boolean**| true or false | [optional] |
| **limit** | **Integer**| Limit employees | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**StatisticsListWorkedHoursByEmployeeResponse**](StatisticsListWorkedHoursByEmployeeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="listWorkedHoursByWeekDay"></a>
# **listWorkedHoursByWeekDay**
> StatisticsListWorkedHoursByWeekDayResponse listWorkedHoursByWeekDay(from, to).employeeIdsIn(employeeIdsIn).limit(limit).page(page).execute();

List Worked Hours By Employee and Week Day



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatisticsApi;
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
    LocalDate from = LocalDate.now(); // Y-m-d
    LocalDate to = LocalDate.now(); // Y-m-d
    List<UUID> employeeIdsIn = Arrays.asList(); // Array of employee ids
    Integer limit = 56; // Limit employees
    Integer page = 56; // Request a specific page
    try {
      StatisticsListWorkedHoursByWeekDayResponse result = client
              .statistics
              .listWorkedHoursByWeekDay(from, to)
              .employeeIdsIn(employeeIdsIn)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#listWorkedHoursByWeekDay");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StatisticsListWorkedHoursByWeekDayResponse> response = client
              .statistics
              .listWorkedHoursByWeekDay(from, to)
              .employeeIdsIn(employeeIdsIn)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#listWorkedHoursByWeekDay");
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
| **from** | **LocalDate**| Y-m-d | |
| **to** | **LocalDate**| Y-m-d | |
| **employeeIdsIn** | [**List&lt;UUID&gt;**](UUID.md)| Array of employee ids | [optional] |
| **limit** | **Integer**| Limit employees | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**StatisticsListWorkedHoursByWeekDayResponse**](StatisticsListWorkedHoursByWeekDayResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="listWorkedNightHours"></a>
# **listWorkedNightHours**
> StatisticsListWorkedNightHoursResponse listWorkedNightHours(from, to).employeeIdsIn(employeeIdsIn).withChecks(withChecks).limit(limit).page(page).execute();

List Worked Hours By Employee In Night Hours



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatisticsApi;
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
    LocalDate from = LocalDate.now(); // Y-m-d
    LocalDate to = LocalDate.now(); // Y-m-d
    List<UUID> employeeIdsIn = Arrays.asList(); // Array of employee ids
    Boolean withChecks = true; // true or false
    Integer limit = 56; // Limit employees
    Integer page = 56; // Request a specific page
    try {
      StatisticsListWorkedNightHoursResponse result = client
              .statistics
              .listWorkedNightHours(from, to)
              .employeeIdsIn(employeeIdsIn)
              .withChecks(withChecks)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#listWorkedNightHours");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StatisticsListWorkedNightHoursResponse> response = client
              .statistics
              .listWorkedNightHours(from, to)
              .employeeIdsIn(employeeIdsIn)
              .withChecks(withChecks)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#listWorkedNightHours");
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
| **from** | **LocalDate**| Y-m-d | |
| **to** | **LocalDate**| Y-m-d | |
| **employeeIdsIn** | [**List&lt;UUID&gt;**](UUID.md)| Array of employee ids | [optional] |
| **withChecks** | **Boolean**| true or false | [optional] |
| **limit** | **Integer**| Limit employees | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**StatisticsListWorkedNightHoursResponse**](StatisticsListWorkedNightHoursResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

