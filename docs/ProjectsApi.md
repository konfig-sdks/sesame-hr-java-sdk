# ProjectsApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProject**](ProjectsApi.md#createProject) | **POST** /project/v1/projects | Create a project |
| [**list**](ProjectsApi.md#list) | **GET** /project/v1/projects | List projects |
| [**removeById**](ProjectsApi.md#removeById) | **DELETE** /project/v1/projects/{id} | Delete a project |
| [**updateProjectById**](ProjectsApi.md#updateProjectById) | **PUT** /project/v1/projects/{id} | Update a project |


<a name="createProject"></a>
# **createProject**
> ProjectsCreateProjectResponse createProject(projectsCreateProjectRequest).execute();

Create a project



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    UUID companyId = UUID.randomUUID(); // The id of the company
    String name = "name_example"; // The name of the project
    String description = "description_example"; // The description of the project
    UUID parentProjectId = UUID.randomUUID(); // The id of the parent project
    UUID customerId = UUID.randomUUID(); // The id of the customer
    Float price = 3.4F; // The price of the project
    LocalDate startDate = LocalDate.now(); // The start date of the project
    LocalDate endDate = LocalDate.now(); // The end date of the project
    UUID managerId = UUID.randomUUID(); // The id of the employee manager
    String status = "active"; // The status of the project
    try {
      ProjectsCreateProjectResponse result = client
              .projects
              .createProject(companyId, name)
              .description(description)
              .parentProjectId(parentProjectId)
              .customerId(customerId)
              .price(price)
              .startDate(startDate)
              .endDate(endDate)
              .managerId(managerId)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsCreateProjectResponse> response = client
              .projects
              .createProject(companyId, name)
              .description(description)
              .parentProjectId(parentProjectId)
              .customerId(customerId)
              .price(price)
              .startDate(startDate)
              .endDate(endDate)
              .managerId(managerId)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProject");
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
| **projectsCreateProjectRequest** | [**ProjectsCreateProjectRequest**](ProjectsCreateProjectRequest.md)| Project object that needs to be updated | |

### Return type

[**ProjectsCreateProjectResponse**](ProjectsCreateProjectResponse.md)

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
> ProjectsListResponse list(id).page(page).limit(limit).orderBy(orderBy).execute();

List projects



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    UUID id = UUID.randomUUID(); // Company ID
    Integer page = 56; // Request a specific page
    Integer limit = 56; // Limit results
    String orderBy = "orderBy_example"; // field1 asc, field2 desc
    try {
      ProjectsListResponse result = client
              .projects
              .list(id)
              .page(page)
              .limit(limit)
              .orderBy(orderBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsListResponse> response = client
              .projects
              .list(id)
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
      System.err.println("Exception when calling ProjectsApi#list");
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
| **id** | **UUID**| Company ID | |
| **page** | **Integer**| Request a specific page | [optional] |
| **limit** | **Integer**| Limit results | [optional] |
| **orderBy** | **String**| field1 asc, field2 desc | [optional] |

### Return type

[**ProjectsListResponse**](ProjectsListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="removeById"></a>
# **removeById**
> ProjectsRemoveByIdResponse removeById(id).execute();

Delete a project



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    UUID id = UUID.randomUUID(); // Project ID
    try {
      ProjectsRemoveByIdResponse result = client
              .projects
              .removeById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsRemoveByIdResponse> response = client
              .projects
              .removeById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#removeById");
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
| **id** | **UUID**| Project ID | |

### Return type

[**ProjectsRemoveByIdResponse**](ProjectsRemoveByIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="updateProjectById"></a>
# **updateProjectById**
> ProjectsUpdateProjectByIdResponse updateProjectById(id, projectsUpdateProjectByIdRequest).execute();

Update a project



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    String name = "name_example"; // The name of the project
    UUID id = UUID.randomUUID(); // Project ID
    String description = "description_example"; // The description of the project
    UUID parentProjectId = UUID.randomUUID(); // The id of the parent project
    UUID customerId = UUID.randomUUID(); // The id of the customer
    Float price = 3.4F; // The price of the project
    LocalDate startDate = LocalDate.now(); // The start date of the project
    LocalDate endDate = LocalDate.now(); // The end date of the project
    UUID managerId = UUID.randomUUID(); // The id of the employee manager
    String status = "active"; // The status of the project
    try {
      ProjectsUpdateProjectByIdResponse result = client
              .projects
              .updateProjectById(name, id)
              .description(description)
              .parentProjectId(parentProjectId)
              .customerId(customerId)
              .price(price)
              .startDate(startDate)
              .endDate(endDate)
              .managerId(managerId)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateProjectById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsUpdateProjectByIdResponse> response = client
              .projects
              .updateProjectById(name, id)
              .description(description)
              .parentProjectId(parentProjectId)
              .customerId(customerId)
              .price(price)
              .startDate(startDate)
              .endDate(endDate)
              .managerId(managerId)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateProjectById");
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
| **id** | **UUID**| Project ID | |
| **projectsUpdateProjectByIdRequest** | [**ProjectsUpdateProjectByIdRequest**](ProjectsUpdateProjectByIdRequest.md)| Department object that needs to be updated | |

### Return type

[**ProjectsUpdateProjectByIdResponse**](ProjectsUpdateProjectByIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

