# EmployeeScheduleTemplatesApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmployeeScheduleTemplate**](EmployeeScheduleTemplatesApi.md#createEmployeeScheduleTemplate) | **POST** /schedule/v1/entity-schedule-templates | Create employee schedule template |
| [**listTemplates**](EmployeeScheduleTemplatesApi.md#listTemplates) | **GET** /schedule/v1/employees/{employeeId}/schedule-templates | List employee schedule template |
| [**unassign**](EmployeeScheduleTemplatesApi.md#unassign) | **DELETE** /schedule/v1/entity-schedule-templates/{entityScheduleTemplateId} | Delete employee schedule template |


<a name="createEmployeeScheduleTemplate"></a>
# **createEmployeeScheduleTemplate**
> EmployeeScheduleTemplatesCreateEmployeeScheduleTemplateResponse createEmployeeScheduleTemplate(employeeScheduleTemplatesCreateEmployeeScheduleTemplateRequest).execute();

Create employee schedule template

Assign employee to schedule template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeScheduleTemplatesApi;
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
    UUID employeeId = UUID.randomUUID(); // Employee UUID
    UUID scheduleTemplateId = UUID.randomUUID(); // Schedule template UUID
    LocalDate startDate = LocalDate.now(); // Start date
    LocalDate endDate = LocalDate.now(); // End date
    try {
      EmployeeScheduleTemplatesCreateEmployeeScheduleTemplateResponse result = client
              .employeeScheduleTemplates
              .createEmployeeScheduleTemplate(employeeId, scheduleTemplateId, startDate)
              .endDate(endDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeScheduleTemplatesApi#createEmployeeScheduleTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeScheduleTemplatesCreateEmployeeScheduleTemplateResponse> response = client
              .employeeScheduleTemplates
              .createEmployeeScheduleTemplate(employeeId, scheduleTemplateId, startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeScheduleTemplatesApi#createEmployeeScheduleTemplate");
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
| **employeeScheduleTemplatesCreateEmployeeScheduleTemplateRequest** | [**EmployeeScheduleTemplatesCreateEmployeeScheduleTemplateRequest**](EmployeeScheduleTemplatesCreateEmployeeScheduleTemplateRequest.md)| Data to create a employee schedule template | |

### Return type

[**EmployeeScheduleTemplatesCreateEmployeeScheduleTemplateResponse**](EmployeeScheduleTemplatesCreateEmployeeScheduleTemplateResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Employee schedule template created |  -  |

<a name="listTemplates"></a>
# **listTemplates**
> EmployeeScheduleTemplatesListTemplatesResponse listTemplates(employeeId).from(from).to(to).limit(limit).page(page).execute();

List employee schedule template

List employee schedule template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeScheduleTemplatesApi;
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
    LocalDate from = LocalDate.now();
    LocalDate to = LocalDate.now();
    Integer limit = 56; // Limit results
    Integer page = 56; // Request a specific page
    try {
      EmployeeScheduleTemplatesListTemplatesResponse result = client
              .employeeScheduleTemplates
              .listTemplates(employeeId)
              .from(from)
              .to(to)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeScheduleTemplatesApi#listTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeScheduleTemplatesListTemplatesResponse> response = client
              .employeeScheduleTemplates
              .listTemplates(employeeId)
              .from(from)
              .to(to)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeScheduleTemplatesApi#listTemplates");
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
| **from** | **LocalDate**|  | [optional] |
| **to** | **LocalDate**|  | [optional] |
| **limit** | **Integer**| Limit results | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**EmployeeScheduleTemplatesListTemplatesResponse**](EmployeeScheduleTemplatesListTemplatesResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of employee to schedule templates |  -  |

<a name="unassign"></a>
# **unassign**
> EmployeeScheduleTemplatesUnassignResponse unassign(entityScheduleTemplateId).execute();

Delete employee schedule template

Unassign employee to schedule template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeScheduleTemplatesApi;
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
    UUID entityScheduleTemplateId = UUID.randomUUID(); // Employee schedule template UUID
    try {
      EmployeeScheduleTemplatesUnassignResponse result = client
              .employeeScheduleTemplates
              .unassign(entityScheduleTemplateId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeScheduleTemplatesApi#unassign");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeScheduleTemplatesUnassignResponse> response = client
              .employeeScheduleTemplates
              .unassign(entityScheduleTemplateId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeScheduleTemplatesApi#unassign");
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
| **entityScheduleTemplateId** | **UUID**| Employee schedule template UUID | |

### Return type

[**EmployeeScheduleTemplatesUnassignResponse**](EmployeeScheduleTemplatesUnassignResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Employee schedule template deleted |  -  |

