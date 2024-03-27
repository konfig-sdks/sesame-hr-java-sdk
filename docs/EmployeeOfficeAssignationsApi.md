# EmployeeOfficeAssignationsApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignEmployeeToOffice**](EmployeeOfficeAssignationsApi.md#assignEmployeeToOffice) | **POST** /core/v3/employee-office-assignations | Assign an employee to an office |
| [**listAssignations**](EmployeeOfficeAssignationsApi.md#listAssignations) | **GET** /core/v3/employee-office-assignations | List employee office assignation |
| [**unassignEmployee**](EmployeeOfficeAssignationsApi.md#unassignEmployee) | **DELETE** /core/v3/employee-office-assignations | Unassign employee from office |


<a name="assignEmployeeToOffice"></a>
# **assignEmployeeToOffice**
> EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse assignEmployeeToOffice(employeeOfficeAssignationsAssignEmployeeToOfficeRequest).execute();

Assign an employee to an office



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeOfficeAssignationsApi;
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
    UUID employeeId = UUID.randomUUID(); // The identifier of the employee
    UUID officeId = UUID.randomUUID(); // The identifier of the office
    try {
      EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse result = client
              .employeeOfficeAssignations
              .assignEmployeeToOffice(employeeId, officeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeOfficeAssignationsApi#assignEmployeeToOffice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse> response = client
              .employeeOfficeAssignations
              .assignEmployeeToOffice(employeeId, officeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeOfficeAssignationsApi#assignEmployeeToOffice");
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
| **employeeOfficeAssignationsAssignEmployeeToOfficeRequest** | [**EmployeeOfficeAssignationsAssignEmployeeToOfficeRequest**](EmployeeOfficeAssignationsAssignEmployeeToOfficeRequest.md)| Employee object needs to be assigned to Office object | |

### Return type

[**EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse**](EmployeeOfficeAssignationsAssignEmployeeToOfficeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="listAssignations"></a>
# **listAssignations**
> EmployeeOfficeAssignationsListAssignationsResponse listAssignations().employeeId(employeeId).officeId(officeId).limit(limit).page(page).execute();

List employee office assignation



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeOfficeAssignationsApi;
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
    UUID employeeId = UUID.randomUUID(); // Find Assignation by employeeId
    UUID officeId = UUID.randomUUID(); // Find Assignation by officeId
    Integer limit = 56; // Limit assignations
    Integer page = 56; // Request a specific page
    try {
      EmployeeOfficeAssignationsListAssignationsResponse result = client
              .employeeOfficeAssignations
              .listAssignations()
              .employeeId(employeeId)
              .officeId(officeId)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeOfficeAssignationsApi#listAssignations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeOfficeAssignationsListAssignationsResponse> response = client
              .employeeOfficeAssignations
              .listAssignations()
              .employeeId(employeeId)
              .officeId(officeId)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeOfficeAssignationsApi#listAssignations");
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
| **employeeId** | **UUID**| Find Assignation by employeeId | [optional] |
| **officeId** | **UUID**| Find Assignation by officeId | [optional] |
| **limit** | **Integer**| Limit assignations | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**EmployeeOfficeAssignationsListAssignationsResponse**](EmployeeOfficeAssignationsListAssignationsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of objects |  -  |

<a name="unassignEmployee"></a>
# **unassignEmployee**
> EmployeeOfficeAssignationsUnassignEmployeeResponse unassignEmployee(employeeOfficeAssignationsUnassignEmployeeRequest).execute();

Unassign employee from office



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeOfficeAssignationsApi;
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
    UUID employeeId = UUID.randomUUID(); // The identifier of the employee
    UUID officeId = UUID.randomUUID(); // The identifier of the office
    try {
      EmployeeOfficeAssignationsUnassignEmployeeResponse result = client
              .employeeOfficeAssignations
              .unassignEmployee(employeeId, officeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeOfficeAssignationsApi#unassignEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeOfficeAssignationsUnassignEmployeeResponse> response = client
              .employeeOfficeAssignations
              .unassignEmployee(employeeId, officeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeOfficeAssignationsApi#unassignEmployee");
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
| **employeeOfficeAssignationsUnassignEmployeeRequest** | [**EmployeeOfficeAssignationsUnassignEmployeeRequest**](EmployeeOfficeAssignationsUnassignEmployeeRequest.md)| Employee object needs to be unassigned to Office object | |

### Return type

[**EmployeeOfficeAssignationsUnassignEmployeeResponse**](EmployeeOfficeAssignationsUnassignEmployeeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

