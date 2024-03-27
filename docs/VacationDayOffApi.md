# VacationDayOffApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](VacationDayOffApi.md#list) | **GET** /schedule/v1/vacation-day-off | List Vacation Day Off |


<a name="list"></a>
# **list**
> VacationDayOffListResponse list().employeeIds(employeeIds).from(from).to(to).page(page).limit(limit).orderBy(orderBy).execute();

List Vacation Day Off



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VacationDayOffApi;
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
    Integer page = 56; // Request a specific page
    Integer limit = 56; // Limit vacation requests
    String orderBy = "orderBy_example"; // field1 asc, field2 desc
    try {
      VacationDayOffListResponse result = client
              .vacationDayOff
              .list()
              .employeeIds(employeeIds)
              .from(from)
              .to(to)
              .page(page)
              .limit(limit)
              .orderBy(orderBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationDayOffApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VacationDayOffListResponse> response = client
              .vacationDayOff
              .list()
              .employeeIds(employeeIds)
              .from(from)
              .to(to)
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
      System.err.println("Exception when calling VacationDayOffApi#list");
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
| **page** | **Integer**| Request a specific page | [optional] |
| **limit** | **Integer**| Limit vacation requests | [optional] |
| **orderBy** | **String**| field1 asc, field2 desc | [optional] |

### Return type

[**VacationDayOffListResponse**](VacationDayOffListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

