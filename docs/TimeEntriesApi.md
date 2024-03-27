# TimeEntriesApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewEntry**](TimeEntriesApi.md#createNewEntry) | **POST** /project/v1/time-entries | Create Time Entry |
| [**deleteById**](TimeEntriesApi.md#deleteById) | **DELETE** /project/v1/time-entries/{id} | Delete a Time Entry |
| [**list**](TimeEntriesApi.md#list) | **GET** /project/v1/time-entries | List Time Entries |
| [**startEntry**](TimeEntriesApi.md#startEntry) | **POST** /project/v1/time-entries/start | Time Entry In |
| [**stopTimeEntryOut**](TimeEntriesApi.md#stopTimeEntryOut) | **POST** /project/v1/time-entries/stop | Time Entry Out |
| [**updateEntry**](TimeEntriesApi.md#updateEntry) | **PUT** /project/v1/time-entries/{id} | Update Time Entry |


<a name="createNewEntry"></a>
# **createNewEntry**
> TimeEntriesCreateNewEntryResponse createNewEntry(timeEntriesCreateNewEntryRequest).execute();

Create Time Entry



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeEntriesApi;
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
    TimeEntriesCreateNewEntryRequestTimeEntryIn timeEntryIn = new TimeEntriesCreateNewEntryRequestTimeEntryIn();
    UUID projectId = UUID.randomUUID();
    List<UUID> tagIds = Arrays.asList();
    String comment = "comment_example";
    TimeEntriesCreateNewEntryRequestTimeEntryOut timeEntryOut = new TimeEntriesCreateNewEntryRequestTimeEntryOut();
    try {
      TimeEntriesCreateNewEntryResponse result = client
              .timeEntries
              .createNewEntry(employeeId, timeEntryIn)
              .projectId(projectId)
              .tagIds(tagIds)
              .comment(comment)
              .timeEntryOut(timeEntryOut)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#createNewEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeEntriesCreateNewEntryResponse> response = client
              .timeEntries
              .createNewEntry(employeeId, timeEntryIn)
              .projectId(projectId)
              .tagIds(tagIds)
              .comment(comment)
              .timeEntryOut(timeEntryOut)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#createNewEntry");
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
| **timeEntriesCreateNewEntryRequest** | [**TimeEntriesCreateNewEntryRequest**](TimeEntriesCreateNewEntryRequest.md)| Create a Time Entry | |

### Return type

[**TimeEntriesCreateNewEntryResponse**](TimeEntriesCreateNewEntryResponse.md)

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
> TimeEntriesDeleteByIdResponse deleteById(id).execute();

Delete a Time Entry



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeEntriesApi;
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
    UUID id = UUID.randomUUID(); // Time Entry ID
    try {
      TimeEntriesDeleteByIdResponse result = client
              .timeEntries
              .deleteById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeEntriesDeleteByIdResponse> response = client
              .timeEntries
              .deleteById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#deleteById");
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
| **id** | **UUID**| Time Entry ID | |

### Return type

[**TimeEntriesDeleteByIdResponse**](TimeEntriesDeleteByIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="list"></a>
# **list**
> TimeEntriesListResponse list().employeeId(employeeId).from(from).to(to).employeeStatus(employeeStatus).limit(limit).page(page).execute();

List Time Entries



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeEntriesApi;
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
    LocalDate from = LocalDate.now();
    LocalDate to = LocalDate.now();
    String employeeStatus = "active";
    Integer limit = 56; // Limit results
    Integer page = 56; // Request a specific page
    try {
      TimeEntriesListResponse result = client
              .timeEntries
              .list()
              .employeeId(employeeId)
              .from(from)
              .to(to)
              .employeeStatus(employeeStatus)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeEntriesListResponse> response = client
              .timeEntries
              .list()
              .employeeId(employeeId)
              .from(from)
              .to(to)
              .employeeStatus(employeeStatus)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#list");
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
| **employeeId** | **UUID**|  | [optional] |
| **from** | **LocalDate**|  | [optional] |
| **to** | **LocalDate**|  | [optional] |
| **employeeStatus** | **String**|  | [optional] [default to active] [enum: active, inactive] |
| **limit** | **Integer**| Limit results | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**TimeEntriesListResponse**](TimeEntriesListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="startEntry"></a>
# **startEntry**
> TimeEntriesStartEntryResponse startEntry(timeEntriesStartEntryRequest).execute();

Time Entry In



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeEntriesApi;
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
    UUID projectId = UUID.randomUUID();
    List<UUID> tagIds = Arrays.asList();
    String comment = "comment_example";
    WorkEntriesStartNewEntryRequestWorkEntryInCoordinates coordinates = new WorkEntriesStartNewEntryRequestWorkEntryInCoordinates();
    try {
      TimeEntriesStartEntryResponse result = client
              .timeEntries
              .startEntry(employeeId)
              .projectId(projectId)
              .tagIds(tagIds)
              .comment(comment)
              .coordinates(coordinates)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#startEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeEntriesStartEntryResponse> response = client
              .timeEntries
              .startEntry(employeeId)
              .projectId(projectId)
              .tagIds(tagIds)
              .comment(comment)
              .coordinates(coordinates)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#startEntry");
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
| **timeEntriesStartEntryRequest** | [**TimeEntriesStartEntryRequest**](TimeEntriesStartEntryRequest.md)| Starts a Time Entry | |

### Return type

[**TimeEntriesStartEntryResponse**](TimeEntriesStartEntryResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="stopTimeEntryOut"></a>
# **stopTimeEntryOut**
> TimeEntriesStopTimeEntryOutResponse stopTimeEntryOut(timeEntriesStopTimeEntryOutRequest).execute();

Time Entry Out



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeEntriesApi;
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
    TimeEntriesStopTimeEntryOutRequestCoordinates coordinates = new TimeEntriesStopTimeEntryOutRequestCoordinates();
    try {
      TimeEntriesStopTimeEntryOutResponse result = client
              .timeEntries
              .stopTimeEntryOut()
              .coordinates(coordinates)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#stopTimeEntryOut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeEntriesStopTimeEntryOutResponse> response = client
              .timeEntries
              .stopTimeEntryOut()
              .coordinates(coordinates)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#stopTimeEntryOut");
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
| **timeEntriesStopTimeEntryOutRequest** | [**TimeEntriesStopTimeEntryOutRequest**](TimeEntriesStopTimeEntryOutRequest.md)| Close a Time Entry | |

### Return type

[**TimeEntriesStopTimeEntryOutResponse**](TimeEntriesStopTimeEntryOutResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="updateEntry"></a>
# **updateEntry**
> TimeEntriesUpdateEntryResponse updateEntry(id, timeEntriesUpdateEntryRequest).execute();

Update Time Entry



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeEntriesApi;
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
    TimeEntriesUpdateEntryRequestTimeEntryIn timeEntryIn = new TimeEntriesUpdateEntryRequestTimeEntryIn();
    UUID id = UUID.randomUUID(); // Time Entry ID
    UUID projectId = UUID.randomUUID();
    List<UUID> tagIds = Arrays.asList();
    String comment = "comment_example";
    TimeEntriesUpdateEntryRequestTimeEntryOut timeEntryOut = new TimeEntriesUpdateEntryRequestTimeEntryOut();
    try {
      TimeEntriesUpdateEntryResponse result = client
              .timeEntries
              .updateEntry(timeEntryIn, id)
              .projectId(projectId)
              .tagIds(tagIds)
              .comment(comment)
              .timeEntryOut(timeEntryOut)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#updateEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeEntriesUpdateEntryResponse> response = client
              .timeEntries
              .updateEntry(timeEntryIn, id)
              .projectId(projectId)
              .tagIds(tagIds)
              .comment(comment)
              .timeEntryOut(timeEntryOut)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#updateEntry");
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
| **id** | **UUID**| Time Entry ID | |
| **timeEntriesUpdateEntryRequest** | [**TimeEntriesUpdateEntryRequest**](TimeEntriesUpdateEntryRequest.md)| Update a Time Entry | |

### Return type

[**TimeEntriesUpdateEntryResponse**](TimeEntriesUpdateEntryResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

