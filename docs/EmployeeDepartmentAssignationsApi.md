# EmployeeDepartmentAssignationsApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignDepartmentToEmployee**](EmployeeDepartmentAssignationsApi.md#assignDepartmentToEmployee) | **POST** /core/v3/employee-department-assignations | Assign an employee to a department |
| [**list**](EmployeeDepartmentAssignationsApi.md#list) | **GET** /core/v3/employee-department-assignations | List employee department assignation |
| [**unassign**](EmployeeDepartmentAssignationsApi.md#unassign) | **DELETE** /core/v3/employee-department-assignations | Unassign employee from department |


<a name="assignDepartmentToEmployee"></a>
# **assignDepartmentToEmployee**
> EmployeeDepartmentAssignationsAssignDepartmentToEmployeeResponse assignDepartmentToEmployee(employeeDepartmentAssignationsAssignDepartmentToEmployeeRequest).execute();

Assign an employee to a department



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDepartmentAssignationsApi;
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
    UUID departmentId = UUID.randomUUID(); // The identifier of the department
    try {
      EmployeeDepartmentAssignationsAssignDepartmentToEmployeeResponse result = client
              .employeeDepartmentAssignations
              .assignDepartmentToEmployee(employeeId, departmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDepartmentAssignationsApi#assignDepartmentToEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeDepartmentAssignationsAssignDepartmentToEmployeeResponse> response = client
              .employeeDepartmentAssignations
              .assignDepartmentToEmployee(employeeId, departmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDepartmentAssignationsApi#assignDepartmentToEmployee");
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
| **employeeDepartmentAssignationsAssignDepartmentToEmployeeRequest** | [**EmployeeDepartmentAssignationsAssignDepartmentToEmployeeRequest**](EmployeeDepartmentAssignationsAssignDepartmentToEmployeeRequest.md)| Employee object needs to be assigned to Department object | |

### Return type

[**EmployeeDepartmentAssignationsAssignDepartmentToEmployeeResponse**](EmployeeDepartmentAssignationsAssignDepartmentToEmployeeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="list"></a>
# **list**
> EmployeeDepartmentAssignationsListResponse list().employeeId(employeeId).departmentId(departmentId).limit(limit).page(page).execute();

List employee department assignation



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDepartmentAssignationsApi;
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
    UUID departmentId = UUID.randomUUID(); // Find Assignation by departmentId
    Integer limit = 56; // Limit assignations
    Integer page = 56; // Request a specific page
    try {
      EmployeeDepartmentAssignationsListResponse result = client
              .employeeDepartmentAssignations
              .list()
              .employeeId(employeeId)
              .departmentId(departmentId)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDepartmentAssignationsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeDepartmentAssignationsListResponse> response = client
              .employeeDepartmentAssignations
              .list()
              .employeeId(employeeId)
              .departmentId(departmentId)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDepartmentAssignationsApi#list");
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
| **departmentId** | **UUID**| Find Assignation by departmentId | [optional] |
| **limit** | **Integer**| Limit assignations | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**EmployeeDepartmentAssignationsListResponse**](EmployeeDepartmentAssignationsListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of objects |  -  |

<a name="unassign"></a>
# **unassign**
> EmployeeDepartmentAssignationsUnassignResponse unassign(employeeDepartmentAssignationsUnassignRequest).execute();

Unassign employee from department



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDepartmentAssignationsApi;
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
    UUID departmentId = UUID.randomUUID(); // The identifier of the department
    try {
      EmployeeDepartmentAssignationsUnassignResponse result = client
              .employeeDepartmentAssignations
              .unassign(employeeId, departmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDepartmentAssignationsApi#unassign");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeDepartmentAssignationsUnassignResponse> response = client
              .employeeDepartmentAssignations
              .unassign(employeeId, departmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDepartmentAssignationsApi#unassign");
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
| **employeeDepartmentAssignationsUnassignRequest** | [**EmployeeDepartmentAssignationsUnassignRequest**](EmployeeDepartmentAssignationsUnassignRequest.md)| Employee object needs to be unassigned to Department object | |

### Return type

[**EmployeeDepartmentAssignationsUnassignResponse**](EmployeeDepartmentAssignationsUnassignResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

