# HolidayCalendarsApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewCalendar**](HolidayCalendarsApi.md#createNewCalendar) | **POST** /schedule/v1/holiday-calendar | Create Holidays Calendar |
| [**getById**](HolidayCalendarsApi.md#getById) | **GET** /schedule/v1/holiday-calendar/{holidayCalendarId} | List Holiday Calendar |
| [**listCalendar**](HolidayCalendarsApi.md#listCalendar) | **GET** /schedule/v1/holiday-calendar | List Holidays Calendar |
| [**removeById**](HolidayCalendarsApi.md#removeById) | **DELETE** /schedule/v1/holiday-calendar/{holidayCalendarId} | Delete Holidays Calendar |
| [**updateById**](HolidayCalendarsApi.md#updateById) | **PUT** /schedule/v1/holiday-calendar/{holidayCalendarId} | Update Holidays Calendar |


<a name="createNewCalendar"></a>
# **createNewCalendar**
> HolidayCalendarsCreateNewCalendarResponse createNewCalendar().holidayCalendarsCreateNewCalendarRequest(holidayCalendarsCreateNewCalendarRequest).execute();

Create Holidays Calendar



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidayCalendarsApi;
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
    String name = "name_example"; // The name of the holidays
    List<HolidayCalendarsCreateNewCalendarRequestDaysOffInner> daysOff = Arrays.asList();
    try {
      HolidayCalendarsCreateNewCalendarResponse result = client
              .holidayCalendars
              .createNewCalendar(name, daysOff)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayCalendarsApi#createNewCalendar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidayCalendarsCreateNewCalendarResponse> response = client
              .holidayCalendars
              .createNewCalendar(name, daysOff)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayCalendarsApi#createNewCalendar");
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
| **holidayCalendarsCreateNewCalendarRequest** | [**HolidayCalendarsCreateNewCalendarRequest**](HolidayCalendarsCreateNewCalendarRequest.md)| Create a Holidays Calendar | [optional] |

### Return type

[**HolidayCalendarsCreateNewCalendarResponse**](HolidayCalendarsCreateNewCalendarResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="getById"></a>
# **getById**
> HolidayCalendarsGetByIdResponse getById(holidayCalendarId).limit(limit).page(page).execute();

List Holiday Calendar



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidayCalendarsApi;
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
    UUID holidayCalendarId = UUID.randomUUID(); // Holiday Calendar Id
    Integer limit = 56; // Limit results
    Integer page = 56; // Request a specific page
    try {
      HolidayCalendarsGetByIdResponse result = client
              .holidayCalendars
              .getById(holidayCalendarId)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayCalendarsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidayCalendarsGetByIdResponse> response = client
              .holidayCalendars
              .getById(holidayCalendarId)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayCalendarsApi#getById");
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
| **holidayCalendarId** | **UUID**| Holiday Calendar Id | |
| **limit** | **Integer**| Limit results | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**HolidayCalendarsGetByIdResponse**](HolidayCalendarsGetByIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="listCalendar"></a>
# **listCalendar**
> HolidayCalendarsListCalendarResponse listCalendar().limit(limit).page(page).nameContains(nameContains).execute();

List Holidays Calendar



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidayCalendarsApi;
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
    Integer limit = 20; // Limit results
    Integer page = 56; // Request a specific page
    String nameContains = "Some name"; // Filter by name
    try {
      HolidayCalendarsListCalendarResponse result = client
              .holidayCalendars
              .listCalendar()
              .limit(limit)
              .page(page)
              .nameContains(nameContains)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayCalendarsApi#listCalendar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidayCalendarsListCalendarResponse> response = client
              .holidayCalendars
              .listCalendar()
              .limit(limit)
              .page(page)
              .nameContains(nameContains)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayCalendarsApi#listCalendar");
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
| **limit** | **Integer**| Limit results | [optional] [default to 20] |
| **page** | **Integer**| Request a specific page | [optional] |
| **nameContains** | **String**| Filter by name | [optional] |

### Return type

[**HolidayCalendarsListCalendarResponse**](HolidayCalendarsListCalendarResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

<a name="removeById"></a>
# **removeById**
> HolidayCalendarsRemoveByIdResponse removeById(holidayCalendarId).execute();

Delete Holidays Calendar



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidayCalendarsApi;
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
    UUID holidayCalendarId = UUID.randomUUID(); // Holiday Calendar Id
    try {
      HolidayCalendarsRemoveByIdResponse result = client
              .holidayCalendars
              .removeById(holidayCalendarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayCalendarsApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidayCalendarsRemoveByIdResponse> response = client
              .holidayCalendars
              .removeById(holidayCalendarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayCalendarsApi#removeById");
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
| **holidayCalendarId** | **UUID**| Holiday Calendar Id | |

### Return type

[**HolidayCalendarsRemoveByIdResponse**](HolidayCalendarsRemoveByIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="updateById"></a>
# **updateById**
> HolidayCalendarsUpdateByIdResponse updateById(holidayCalendarId, holidayCalendarsUpdateByIdRequest).execute();

Update Holidays Calendar



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidayCalendarsApi;
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
    String name = "name_example"; // The name of the holidays
    List<HolidayCalendarsUpdateByIdRequestDaysOffInner> daysOff = Arrays.asList();
    UUID holidayCalendarId = UUID.randomUUID(); // Holiday Calendar Id
    try {
      HolidayCalendarsUpdateByIdResponse result = client
              .holidayCalendars
              .updateById(name, daysOff, holidayCalendarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayCalendarsApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidayCalendarsUpdateByIdResponse> response = client
              .holidayCalendars
              .updateById(name, daysOff, holidayCalendarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayCalendarsApi#updateById");
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
| **holidayCalendarId** | **UUID**| Holiday Calendar Id | |
| **holidayCalendarsUpdateByIdRequest** | [**HolidayCalendarsUpdateByIdRequest**](HolidayCalendarsUpdateByIdRequest.md)| Custom field object that needs to be updated | |

### Return type

[**HolidayCalendarsUpdateByIdResponse**](HolidayCalendarsUpdateByIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Objects |  -  |

