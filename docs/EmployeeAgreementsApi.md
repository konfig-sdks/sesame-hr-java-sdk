# EmployeeAgreementsApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignEmployee**](EmployeeAgreementsApi.md#assignEmployee) | **POST** /schedule/v1/agreement-employees | Create employee agreement |
| [**unassignEmployee**](EmployeeAgreementsApi.md#unassignEmployee) | **DELETE** /schedule/v1/agreement-employees/{agreementEmployeeId} | Delete employee agreement |


<a name="assignEmployee"></a>
# **assignEmployee**
> EmployeeAgreementsAssignEmployeeResponse assignEmployee(employeeAgreementsAssignEmployeeRequest).execute();

Create employee agreement

Assign employee to agreement

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAgreementsApi;
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
    UUID agreementId = UUID.randomUUID(); // Agreement UUID
    UUID employeeId = UUID.randomUUID(); // Employee UUID
    LocalDate startDate = LocalDate.now(); // Start date
    try {
      EmployeeAgreementsAssignEmployeeResponse result = client
              .employeeAgreements
              .assignEmployee(agreementId, employeeId, startDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAgreementsApi#assignEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeAgreementsAssignEmployeeResponse> response = client
              .employeeAgreements
              .assignEmployee(agreementId, employeeId, startDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAgreementsApi#assignEmployee");
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
| **employeeAgreementsAssignEmployeeRequest** | [**EmployeeAgreementsAssignEmployeeRequest**](EmployeeAgreementsAssignEmployeeRequest.md)| Data to create an agreement | |

### Return type

[**EmployeeAgreementsAssignEmployeeResponse**](EmployeeAgreementsAssignEmployeeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Employee agreement created |  -  |

<a name="unassignEmployee"></a>
# **unassignEmployee**
> EmployeeAgreementsUnassignEmployeeResponse unassignEmployee(agreementEmployeeId).execute();

Delete employee agreement

Unassign employee to agreement

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAgreementsApi;
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
    UUID agreementEmployeeId = UUID.randomUUID(); // Employee agreement UUID
    try {
      EmployeeAgreementsUnassignEmployeeResponse result = client
              .employeeAgreements
              .unassignEmployee(agreementEmployeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAgreementsApi#unassignEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeAgreementsUnassignEmployeeResponse> response = client
              .employeeAgreements
              .unassignEmployee(agreementEmployeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAgreementsApi#unassignEmployee");
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
| **agreementEmployeeId** | **UUID**| Employee agreement UUID | |

### Return type

[**EmployeeAgreementsUnassignEmployeeResponse**](EmployeeAgreementsUnassignEmployeeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Employee agreement deleted |  -  |

