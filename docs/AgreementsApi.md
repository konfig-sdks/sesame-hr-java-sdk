# AgreementsApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewAgreement**](AgreementsApi.md#createNewAgreement) | **POST** /schedule/v1/agreements | Create an agreement |
| [**deleteAgreement**](AgreementsApi.md#deleteAgreement) | **DELETE** /schedule/v1/agreements/{agreementId} | Delete agreement |
| [**getAgreement**](AgreementsApi.md#getAgreement) | **GET** /schedule/v1/agreements/{agreementId} | Get agreement |
| [**list**](AgreementsApi.md#list) | **GET** /schedule/v1/agreements | List agreements |
| [**updateAgreement**](AgreementsApi.md#updateAgreement) | **PUT** /schedule/v1/agreements/{agreementId} | Update an agreement |


<a name="createNewAgreement"></a>
# **createNewAgreement**
> AgreementsCreateNewAgreementResponse createNewAgreement(agreementsCreateNewAgreementRequest).execute();

Create an agreement

Create an agreement

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AgreementsApi;
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
    String name = "name_example"; // Agreement name
    String code = "code_example"; // Agreement code
    String color = "color_example"; // Color of agreement
    Double annualHours = 3.4D; // Annual hours
    try {
      AgreementsCreateNewAgreementResponse result = client
              .agreements
              .createNewAgreement(name, code, color, annualHours)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementsApi#createNewAgreement");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AgreementsCreateNewAgreementResponse> response = client
              .agreements
              .createNewAgreement(name, code, color, annualHours)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementsApi#createNewAgreement");
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
| **agreementsCreateNewAgreementRequest** | [**AgreementsCreateNewAgreementRequest**](AgreementsCreateNewAgreementRequest.md)| Data to create an agreement | |

### Return type

[**AgreementsCreateNewAgreementResponse**](AgreementsCreateNewAgreementResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Agreement created |  -  |

<a name="deleteAgreement"></a>
# **deleteAgreement**
> AgreementsDeleteAgreementResponse deleteAgreement(agreementId).execute();

Delete agreement



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AgreementsApi;
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
    UUID agreementId = UUID.randomUUID(); // Agreement UUID
    try {
      AgreementsDeleteAgreementResponse result = client
              .agreements
              .deleteAgreement(agreementId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementsApi#deleteAgreement");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AgreementsDeleteAgreementResponse> response = client
              .agreements
              .deleteAgreement(agreementId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementsApi#deleteAgreement");
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
| **agreementId** | **UUID**| Agreement UUID | |

### Return type

[**AgreementsDeleteAgreementResponse**](AgreementsDeleteAgreementResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Agreement deleted |  -  |

<a name="getAgreement"></a>
# **getAgreement**
> AgreementsGetAgreementResponse getAgreement(agreementId).limit(limit).page(page).execute();

Get agreement



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AgreementsApi;
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
    UUID agreementId = UUID.randomUUID(); // Agreement UUID
    Integer limit = 56; // Limit results
    Integer page = 56; // Request a specific page
    try {
      AgreementsGetAgreementResponse result = client
              .agreements
              .getAgreement(agreementId)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCompanyId());
      System.out.println(result.getName());
      System.out.println(result.getCode());
      System.out.println(result.getColor());
      System.out.println(result.getAnnualHours());
      System.out.println(result.getAdditionalHoursPercent());
      System.out.println(result.getTotalAdditionalHours());
      System.out.println(result.getMaxDaysToWork());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementsApi#getAgreement");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AgreementsGetAgreementResponse> response = client
              .agreements
              .getAgreement(agreementId)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementsApi#getAgreement");
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
| **agreementId** | **UUID**| Agreement UUID | |
| **limit** | **Integer**| Limit results | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |

### Return type

[**AgreementsGetAgreementResponse**](AgreementsGetAgreementResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get agreement |  -  |

<a name="list"></a>
# **list**
> AgreementsListResponse list().limit(limit).page(page).execute();

List agreements



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AgreementsApi;
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
      AgreementsListResponse result = client
              .agreements
              .list()
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AgreementsListResponse> response = client
              .agreements
              .list()
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementsApi#list");
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

[**AgreementsListResponse**](AgreementsListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of agreements |  -  |

<a name="updateAgreement"></a>
# **updateAgreement**
> AgreementsUpdateAgreementResponse updateAgreement(agreementId, agreementsUpdateAgreementRequest).execute();

Update an agreement

Update an agreement

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AgreementsApi;
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
    String name = "name_example"; // Agreement name
    String code = "code_example"; // Agreement code
    String color = "color_example"; // Color of agreement
    Double annualHours = 3.4D; // Annual hours
    UUID agreementId = UUID.randomUUID(); // Agreement UUID
    try {
      AgreementsUpdateAgreementResponse result = client
              .agreements
              .updateAgreement(name, code, color, annualHours, agreementId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementsApi#updateAgreement");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AgreementsUpdateAgreementResponse> response = client
              .agreements
              .updateAgreement(name, code, color, annualHours, agreementId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementsApi#updateAgreement");
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
| **agreementId** | **UUID**| Agreement UUID | |
| **agreementsUpdateAgreementRequest** | [**AgreementsUpdateAgreementRequest**](AgreementsUpdateAgreementRequest.md)| Data to update an agreement | |

### Return type

[**AgreementsUpdateAgreementResponse**](AgreementsUpdateAgreementResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Agreement updated |  -  |

