# AbsenceDayOffApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](AbsenceDayOffApi.md#list) | **GET** /schedule/v1/absence-day-off | List Absence Day Off |


<a name="list"></a>
# **list**
> AbsenceDayOffListResponse list().employeeIds(employeeIds).from(from).to(to).limit(limit).page(page).orderBy(orderBy).execute();

List Absence Day Off



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsenceDayOffApi;
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
    List<UUID> employeeIds = Arrays.asList(); // The id of the employees
    LocalDate from = LocalDate.now(); // First day of search period
    LocalDate to = LocalDate.now(); // Last day of search period
    Integer limit = 56; // Limit day offs
    Integer page = 56; // Request a specific page
    String orderBy = "orderBy_example"; // field1 asc, field2 desc
    try {
      AbsenceDayOffListResponse result = client
              .absenceDayOff
              .list()
              .employeeIds(employeeIds)
              .from(from)
              .to(to)
              .limit(limit)
              .page(page)
              .orderBy(orderBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDayOffApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsenceDayOffListResponse> response = client
              .absenceDayOff
              .list()
              .employeeIds(employeeIds)
              .from(from)
              .to(to)
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
      System.err.println("Exception when calling AbsenceDayOffApi#list");
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
| **employeeIds** | [**List&lt;UUID&gt;**](UUID.md)| The id of the employees | [optional] |
| **from** | **LocalDate**| First day of search period | [optional] |
| **to** | **LocalDate**| Last day of search period | [optional] |
| **limit** | **Integer**| Limit day offs | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |
| **orderBy** | **String**| field1 asc, field2 desc | [optional] |

### Return type

[**AbsenceDayOffListResponse**](AbsenceDayOffListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

