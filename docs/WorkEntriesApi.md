# WorkEntriesApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewEntry**](WorkEntriesApi.md#createNewEntry) | **POST** /schedule/v1/work-entries | Create Work Entry |
| [**deleteById**](WorkEntriesApi.md#deleteById) | **DELETE** /schedule/v1/work-entries/{id} | Delete Work Entry |
| [**endLastEntry**](WorkEntriesApi.md#endLastEntry) | **POST** /schedule/v1/work-entries/clock-out | Ends the last work entry |
| [**list**](WorkEntriesApi.md#list) | **GET** /schedule/v1/work-entries | List Company Work Entries |
| [**startNewEntry**](WorkEntriesApi.md#startNewEntry) | **POST** /schedule/v1/work-entries/clock-in | Starts a new work entry right now |
| [**updateWorkEntry**](WorkEntriesApi.md#updateWorkEntry) | **PUT** /schedule/v1/work-entries/{id} | Update Work Entry |


<a name="createNewEntry"></a>
# **createNewEntry**
> WorkEntriesCreateNewEntryResponse createNewEntry(workEntriesCreateNewEntryRequest).execute();

Create Work Entry



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkEntriesApi;
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
    String workEntryType = "work";
    WorkEntriesCreateNewEntryRequestWorkEntryIn workEntryIn = new WorkEntriesCreateNewEntryRequestWorkEntryIn();
    UUID workBreakId = UUID.randomUUID();
    UUID workCheckTypeId = UUID.randomUUID();
    WorkEntriesCreateNewEntryRequestWorkEntryOut workEntryOut = new WorkEntriesCreateNewEntryRequestWorkEntryOut();
    try {
      WorkEntriesCreateNewEntryResponse result = client
              .workEntries
              .createNewEntry(employeeId, workEntryType, workEntryIn)
              .workBreakId(workBreakId)
              .workCheckTypeId(workCheckTypeId)
              .workEntryOut(workEntryOut)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkEntriesApi#createNewEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkEntriesCreateNewEntryResponse> response = client
              .workEntries
              .createNewEntry(employeeId, workEntryType, workEntryIn)
              .workBreakId(workBreakId)
              .workCheckTypeId(workCheckTypeId)
              .workEntryOut(workEntryOut)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkEntriesApi#createNewEntry");
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
| **workEntriesCreateNewEntryRequest** | [**WorkEntriesCreateNewEntryRequest**](WorkEntriesCreateNewEntryRequest.md)| Create a Work Entry | |

### Return type

[**WorkEntriesCreateNewEntryResponse**](WorkEntriesCreateNewEntryResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="deleteById"></a>
# **deleteById**
> WorkEntriesDeleteByIdResponse deleteById(id).execute();

Delete Work Entry



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkEntriesApi;
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
    UUID id = UUID.randomUUID(); // Work Entry ID
    try {
      WorkEntriesDeleteByIdResponse result = client
              .workEntries
              .deleteById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkEntriesApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkEntriesDeleteByIdResponse> response = client
              .workEntries
              .deleteById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkEntriesApi#deleteById");
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
| **id** | **UUID**| Work Entry ID | |

### Return type

[**WorkEntriesDeleteByIdResponse**](WorkEntriesDeleteByIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="endLastEntry"></a>
# **endLastEntry**
> WorkEntriesEndLastEntryResponse endLastEntry(workEntriesEndLastEntryRequest).execute();

Ends the last work entry



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkEntriesApi;
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
    WorkEntriesStartNewEntryRequestWorkEntryIn workEntryOut = new WorkEntriesStartNewEntryRequestWorkEntryIn();
    try {
      WorkEntriesEndLastEntryResponse result = client
              .workEntries
              .endLastEntry(employeeId)
              .workEntryOut(workEntryOut)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkEntriesApi#endLastEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkEntriesEndLastEntryResponse> response = client
              .workEntries
              .endLastEntry(employeeId)
              .workEntryOut(workEntryOut)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkEntriesApi#endLastEntry");
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
| **workEntriesEndLastEntryRequest** | [**WorkEntriesEndLastEntryRequest**](WorkEntriesEndLastEntryRequest.md)|  | |

### Return type

[**WorkEntriesEndLastEntryResponse**](WorkEntriesEndLastEntryResponse.md)

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
> WorkEntriesListResponse list().employeeId(employeeId).from(from).to(to).updatedAtGte(updatedAtGte).updatedAtLte(updatedAtLte).onlyReturn(onlyReturn).limit(limit).page(page).orderBy(orderBy).execute();

List Company Work Entries



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkEntriesApi;
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
    UUID employeeId = UUID.randomUUID(); // The id of the employee
    LocalDate from = LocalDate.now(); // Y-m-d
    LocalDate to = LocalDate.now(); // Y-m-d
    String updatedAtGte = "2020-01-01T10:00:00+01:00"; // UpdatedAt greater or equal
    String updatedAtLte = "2020-01-01T10:00:00+01:00"; // UpdatedAt lesser or equal
    String onlyReturn = "all"; // Return specific users
    Integer limit = 20; // Limit work entries
    Integer page = 56; // Request a specific page
    String orderBy = "orderBy_example"; // field1 asc, field2 desc
    try {
      WorkEntriesListResponse result = client
              .workEntries
              .list()
              .employeeId(employeeId)
              .from(from)
              .to(to)
              .updatedAtGte(updatedAtGte)
              .updatedAtLte(updatedAtLte)
              .onlyReturn(onlyReturn)
              .limit(limit)
              .page(page)
              .orderBy(orderBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkEntriesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkEntriesListResponse> response = client
              .workEntries
              .list()
              .employeeId(employeeId)
              .from(from)
              .to(to)
              .updatedAtGte(updatedAtGte)
              .updatedAtLte(updatedAtLte)
              .onlyReturn(onlyReturn)
              .limit(limit)
              .page(page)
              .orderBy(orderBy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkEntriesApi#list");
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
| **employeeId** | **UUID**| The id of the employee | [optional] |
| **from** | **LocalDate**| Y-m-d | [optional] |
| **to** | **LocalDate**| Y-m-d | [optional] |
| **updatedAtGte** | **String**| UpdatedAt greater or equal | [optional] |
| **updatedAtLte** | **String**| UpdatedAt lesser or equal | [optional] |
| **onlyReturn** | **String**| Return specific users | [optional] [default to not_deleted] [enum: all, not_deleted, deleted] |
| **limit** | **Integer**| Limit work entries | [optional] [default to 20] |
| **page** | **Integer**| Request a specific page | [optional] |
| **orderBy** | **String**| field1 asc, field2 desc | [optional] |

### Return type

[**WorkEntriesListResponse**](WorkEntriesListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="startNewEntry"></a>
# **startNewEntry**
> WorkEntriesStartNewEntryResponse startNewEntry(workEntriesStartNewEntryRequest).execute();

Starts a new work entry right now



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkEntriesApi;
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
    WorkEntriesStartNewEntryRequestWorkEntryIn workEntryIn = new WorkEntriesStartNewEntryRequestWorkEntryIn();
    UUID workCheckTypeId = UUID.randomUUID();
    UUID workBreakId = UUID.randomUUID();
    try {
      WorkEntriesStartNewEntryResponse result = client
              .workEntries
              .startNewEntry(employeeId)
              .workEntryIn(workEntryIn)
              .workCheckTypeId(workCheckTypeId)
              .workBreakId(workBreakId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkEntriesApi#startNewEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkEntriesStartNewEntryResponse> response = client
              .workEntries
              .startNewEntry(employeeId)
              .workEntryIn(workEntryIn)
              .workCheckTypeId(workCheckTypeId)
              .workBreakId(workBreakId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkEntriesApi#startNewEntry");
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
| **workEntriesStartNewEntryRequest** | [**WorkEntriesStartNewEntryRequest**](WorkEntriesStartNewEntryRequest.md)| Starts a work entry | |

### Return type

[**WorkEntriesStartNewEntryResponse**](WorkEntriesStartNewEntryResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="updateWorkEntry"></a>
# **updateWorkEntry**
> WorkEntriesUpdateWorkEntryResponse updateWorkEntry(id, workEntriesUpdateWorkEntryRequest).execute();

Update Work Entry



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkEntriesApi;
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
    String workEntryType = "workEntryType_example"; // value should be \\\"work\\\"
    WorkEntriesUpdateWorkEntryRequestWorkEntryIn workEntryIn = new WorkEntriesUpdateWorkEntryRequestWorkEntryIn();
    UUID id = UUID.randomUUID(); // Work Entry ID
    WorkEntriesUpdateWorkEntryRequestWorkEntryOut workEntryOut = new WorkEntriesUpdateWorkEntryRequestWorkEntryOut();
    try {
      WorkEntriesUpdateWorkEntryResponse result = client
              .workEntries
              .updateWorkEntry(workEntryType, workEntryIn, id)
              .workEntryOut(workEntryOut)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkEntriesApi#updateWorkEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkEntriesUpdateWorkEntryResponse> response = client
              .workEntries
              .updateWorkEntry(workEntryType, workEntryIn, id)
              .workEntryOut(workEntryOut)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkEntriesApi#updateWorkEntry");
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
| **id** | **UUID**| Work Entry ID | |
| **workEntriesUpdateWorkEntryRequest** | [**WorkEntriesUpdateWorkEntryRequest**](WorkEntriesUpdateWorkEntryRequest.md)| Update a Work Entry | |

### Return type

[**WorkEntriesUpdateWorkEntryResponse**](WorkEntriesUpdateWorkEntryResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

