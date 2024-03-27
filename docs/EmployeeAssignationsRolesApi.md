# EmployeeAssignationsRolesApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignRole**](EmployeeAssignationsRolesApi.md#assignRole) | **POST** /core/v3/roles/assignation | Assign Role |
| [**listByEmployee**](EmployeeAssignationsRolesApi.md#listByEmployee) | **GET** /core/v3/roles/assignation/{employeeId} | List Assignations Roles by Employee |
| [**unassignRole**](EmployeeAssignationsRolesApi.md#unassignRole) | **DELETE** /core/v3/roles/assignation | Unassign Role |


<a name="assignRole"></a>
# **assignRole**
> EmployeeAssignationsRolesAssignRoleResponse assignRole(employeeAssignationsRolesAssignRoleRequest).execute();

Assign Role



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAssignationsRolesApi;
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
    UUID roleId = UUID.randomUUID(); // Role Id
    UUID employeeId = UUID.randomUUID(); // The id of the employee to assign the role
    UUID entityAffectedId = UUID.randomUUID(); // The id of the entity to manage
    try {
      EmployeeAssignationsRolesAssignRoleResponse result = client
              .employeeAssignationsRoles
              .assignRole(roleId, employeeId, entityAffectedId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAssignationsRolesApi#assignRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeAssignationsRolesAssignRoleResponse> response = client
              .employeeAssignationsRoles
              .assignRole(roleId, employeeId, entityAffectedId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAssignationsRolesApi#assignRole");
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
| **employeeAssignationsRolesAssignRoleRequest** | [**EmployeeAssignationsRolesAssignRoleRequest**](EmployeeAssignationsRolesAssignRoleRequest.md)| Assign object | |

### Return type

[**EmployeeAssignationsRolesAssignRoleResponse**](EmployeeAssignationsRolesAssignRoleResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="listByEmployee"></a>
# **listByEmployee**
> EmployeeAssignationsRolesListByEmployeeResponse listByEmployee(employeeId).limit(limit).page(page).execute();

List Assignations Roles by Employee



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAssignationsRolesApi;
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
    UUID employeeId = UUID.randomUUID(); // Employee Id
    Integer limit = 56; // Limit departments
    Integer page = 56; // Request a specific page
    try {
      EmployeeAssignationsRolesListByEmployeeResponse result = client
              .employeeAssignationsRoles
              .listByEmployee(employeeId)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAssignationsRolesApi#listByEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeAssignationsRolesListByEmployeeResponse> response = client
              .employeeAssignationsRoles
              .listByEmployee(employeeId)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAssignationsRolesApi#listByEmployee");
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
| **employeeId** | **UUID**| Employee Id | |
| **limit** | **Integer**| Limit departments | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**EmployeeAssignationsRolesListByEmployeeResponse**](EmployeeAssignationsRolesListByEmployeeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Assigned Roles by Employee |  -  |

<a name="unassignRole"></a>
# **unassignRole**
> EmployeeAssignationsRolesUnassignRoleResponse unassignRole(employeeAssignationsRolesUnassignRoleRequest).execute();

Unassign Role



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAssignationsRolesApi;
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
    UUID assignationId = UUID.randomUUID(); // Role Id
    try {
      EmployeeAssignationsRolesUnassignRoleResponse result = client
              .employeeAssignationsRoles
              .unassignRole(assignationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAssignationsRolesApi#unassignRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeAssignationsRolesUnassignRoleResponse> response = client
              .employeeAssignationsRoles
              .unassignRole(assignationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAssignationsRolesApi#unassignRole");
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
| **employeeAssignationsRolesUnassignRoleRequest** | [**EmployeeAssignationsRolesUnassignRoleRequest**](EmployeeAssignationsRolesUnassignRoleRequest.md)| Unassign object | |

### Return type

[**EmployeeAssignationsRolesUnassignRoleResponse**](EmployeeAssignationsRolesUnassignRoleResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

