# CheckValidationApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listByEmployeesAndStatus**](CheckValidationApi.md#listByEmployeesAndStatus) | **GET** /schedule/v1/check-validation | List Check Validation By Employees and Status |


<a name="listByEmployeesAndStatus"></a>
# **listByEmployeesAndStatus**
> CheckValidationListByEmployeesAndStatusResponse listByEmployeesAndStatus().employeeIdsIn(employeeIdsIn).status(status).from(from).to(to).limit(limit).page(page).execute();

List Check Validation By Employees and Status



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckValidationApi;
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
    List<UUID> employeeIdsIn = Arrays.asList(); // EmployeeIds to query
    String status = "unsent"; // Allowed Status
    LocalDate from = LocalDate.parse("2021-01-01"); // Request a date from
    LocalDate to = LocalDate.parse("2021-12-31"); // Request a date to
    Integer limit = 56; // Limit results
    Integer page = 56; // Request a specific page
    try {
      CheckValidationListByEmployeesAndStatusResponse result = client
              .checkValidation
              .listByEmployeesAndStatus()
              .employeeIdsIn(employeeIdsIn)
              .status(status)
              .from(from)
              .to(to)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckValidationApi#listByEmployeesAndStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckValidationListByEmployeesAndStatusResponse> response = client
              .checkValidation
              .listByEmployeesAndStatus()
              .employeeIdsIn(employeeIdsIn)
              .status(status)
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
      System.err.println("Exception when calling CheckValidationApi#listByEmployeesAndStatus");
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
| **employeeIdsIn** | [**List&lt;UUID&gt;**](UUID.md)| EmployeeIds to query | [optional] |
| **status** | **String**| Allowed Status | [optional] [enum: unsent, sent, accepted, rejected] |
| **from** | **LocalDate**| Request a date from | [optional] |
| **to** | **LocalDate**| Request a date to | [optional] |
| **limit** | **Integer**| Limit results | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**CheckValidationListByEmployeesAndStatusResponse**](CheckValidationListByEmployeesAndStatusResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

