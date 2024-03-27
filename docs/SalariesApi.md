# SalariesApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSalary**](SalariesApi.md#createSalary) | **POST** /contract/v1/salaries | Create Salary |
| [**deleteSalary**](SalariesApi.md#deleteSalary) | **DELETE** /contract/v1/salaries/{salaryId} | Delete a salary |
| [**list**](SalariesApi.md#list) | **GET** /contract/v1/salaries | List Salaries |
| [**listContributionGroups**](SalariesApi.md#listContributionGroups) | **GET** /contract/v1/contribution-groups | List Contribution Groups |
| [**updateSalary**](SalariesApi.md#updateSalary) | **PUT** /contract/v1/salaries/{salaryId} | Update a salary |


<a name="createSalary"></a>
# **createSalary**
> SalariesCreateSalaryResponse createSalary(salariesCreateSalaryRequest).execute();

Create Salary



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SalariesApi;
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
    UUID employeeId = UUID.randomUUID(); // The ID of the employee
    String payPeriod = "daily"; // Payment period of contract
    String currency = "currency_example"; // Currency of contract
    Float grossSalary = 3.4F; // Salary amount
    Integer payments = 56; // Number of payments
    UUID contributionGroupId = UUID.randomUUID(); // Contribution group id
    LocalDate startDate = LocalDate.now(); // Salary start date
    LocalDate endDate = LocalDate.now(); // Salary end date
    String comments = "comments_example"; // Comments
    try {
      SalariesCreateSalaryResponse result = client
              .salaries
              .createSalary(employeeId, payPeriod, currency, grossSalary, payments, contributionGroupId, startDate)
              .endDate(endDate)
              .comments(comments)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling SalariesApi#createSalary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SalariesCreateSalaryResponse> response = client
              .salaries
              .createSalary(employeeId, payPeriod, currency, grossSalary, payments, contributionGroupId, startDate)
              .endDate(endDate)
              .comments(comments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SalariesApi#createSalary");
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
| **salariesCreateSalaryRequest** | [**SalariesCreateSalaryRequest**](SalariesCreateSalaryRequest.md)| Salary object that needs to be created | |

### Return type

[**SalariesCreateSalaryResponse**](SalariesCreateSalaryResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="deleteSalary"></a>
# **deleteSalary**
> SalariesDeleteSalaryResponse deleteSalary(salaryId).execute();

Delete a salary



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SalariesApi;
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
    UUID salaryId = UUID.randomUUID(); // Salary ID
    try {
      SalariesDeleteSalaryResponse result = client
              .salaries
              .deleteSalary(salaryId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling SalariesApi#deleteSalary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SalariesDeleteSalaryResponse> response = client
              .salaries
              .deleteSalary(salaryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SalariesApi#deleteSalary");
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
| **salaryId** | **UUID**| Salary ID | |

### Return type

[**SalariesDeleteSalaryResponse**](SalariesDeleteSalaryResponse.md)

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
> SalariesListResponse list(employeeId).salaryId(salaryId).payPeriod(payPeriod).grossSalary(grossSalary).payments(payments).contributionGroup(contributionGroup).startDate(startDate).endDate(endDate).limit(limit).page(page).execute();

List Salaries



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SalariesApi;
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
    UUID employeeId = UUID.randomUUID(); // Employee ID
    UUID salaryId = UUID.randomUUID(); // Salary ID
    String payPeriod = "daily"; // Pay Period
    Integer grossSalary = 56; // Gross Salary
    Integer payments = 56; // Payments
    String contributionGroup = "contributionGroup_example"; // Contribution Group
    LocalDate startDate = LocalDate.now(); // Start Date
    LocalDate endDate = LocalDate.now(); // End Date
    Integer limit = 56; // Limit results
    Integer page = 56; // Request a specific page
    try {
      SalariesListResponse result = client
              .salaries
              .list(employeeId)
              .salaryId(salaryId)
              .payPeriod(payPeriod)
              .grossSalary(grossSalary)
              .payments(payments)
              .contributionGroup(contributionGroup)
              .startDate(startDate)
              .endDate(endDate)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling SalariesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SalariesListResponse> response = client
              .salaries
              .list(employeeId)
              .salaryId(salaryId)
              .payPeriod(payPeriod)
              .grossSalary(grossSalary)
              .payments(payments)
              .contributionGroup(contributionGroup)
              .startDate(startDate)
              .endDate(endDate)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SalariesApi#list");
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
| **employeeId** | **UUID**| Employee ID | |
| **salaryId** | **UUID**| Salary ID | [optional] |
| **payPeriod** | **String**| Pay Period | [optional] [enum: daily, weekly, biweekly, monthly, yearly] |
| **grossSalary** | **Integer**| Gross Salary | [optional] |
| **payments** | **Integer**| Payments | [optional] |
| **contributionGroup** | **String**| Contribution Group | [optional] |
| **startDate** | **LocalDate**| Start Date | [optional] |
| **endDate** | **LocalDate**| End Date | [optional] |
| **limit** | **Integer**| Limit results | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**SalariesListResponse**](SalariesListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="listContributionGroups"></a>
# **listContributionGroups**
> SalariesListContributionGroupsResponse listContributionGroups().limit(limit).page(page).execute();

List Contribution Groups



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SalariesApi;
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
    Integer limit = 56; // Limit results
    Integer page = 56; // Request a specific page
    try {
      SalariesListContributionGroupsResponse result = client
              .salaries
              .listContributionGroups()
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling SalariesApi#listContributionGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SalariesListContributionGroupsResponse> response = client
              .salaries
              .listContributionGroups()
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SalariesApi#listContributionGroups");
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
| **limit** | **Integer**| Limit results | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**SalariesListContributionGroupsResponse**](SalariesListContributionGroupsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="updateSalary"></a>
# **updateSalary**
> SalariesUpdateSalaryResponse updateSalary(salaryId, salariesUpdateSalaryRequest).execute();

Update a salary



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SalariesApi;
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
    UUID salaryId = UUID.randomUUID(); // Salary ID
    LocalDate endDate = LocalDate.now(); // End date of salary
    String comments = "comments_example"; // Comments
    try {
      SalariesUpdateSalaryResponse result = client
              .salaries
              .updateSalary(salaryId)
              .endDate(endDate)
              .comments(comments)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling SalariesApi#updateSalary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SalariesUpdateSalaryResponse> response = client
              .salaries
              .updateSalary(salaryId)
              .endDate(endDate)
              .comments(comments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SalariesApi#updateSalary");
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
| **salaryId** | **UUID**| Salary ID | |
| **salariesUpdateSalaryRequest** | [**SalariesUpdateSalaryRequest**](SalariesUpdateSalaryRequest.md)| Salary object that needs to be updated | |

### Return type

[**SalariesUpdateSalaryResponse**](SalariesUpdateSalaryResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

