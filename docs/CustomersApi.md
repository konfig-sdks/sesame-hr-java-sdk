# CustomersApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewCustomer**](CustomersApi.md#createNewCustomer) | **POST** /project/v1/customers | Create a customer |
| [**list**](CustomersApi.md#list) | **GET** /project/v1/customers | List customers |
| [**removeById**](CustomersApi.md#removeById) | **DELETE** /project/v1/customers/{id} | Delete a customer |
| [**updateCustomer**](CustomersApi.md#updateCustomer) | **PUT** /project/v1/customers/{id} | Update a customer |


<a name="createNewCustomer"></a>
# **createNewCustomer**
> CustomersCreateNewCustomerResponse createNewCustomer(customersCreateNewCustomerRequest).execute();

Create a customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomersApi;
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
    UUID companyId = UUID.randomUUID(); // The id of the company where you will create the customer
    String customerName = "customerName_example"; // The name of the customer
    String description = "description_example"; // A description
    String firstName = "firstName_example"; // The first name of the contact person
    String lastName = "lastName_example"; // The last name of the contact person
    String email = "email_example"; // The email of the contact person
    String phone = "phone_example"; // The phone of the contact person
    try {
      CustomersCreateNewCustomerResponse result = client
              .customers
              .createNewCustomer(companyId, customerName)
              .description(description)
              .firstName(firstName)
              .lastName(lastName)
              .email(email)
              .phone(phone)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#createNewCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomersCreateNewCustomerResponse> response = client
              .customers
              .createNewCustomer(companyId, customerName)
              .description(description)
              .firstName(firstName)
              .lastName(lastName)
              .email(email)
              .phone(phone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#createNewCustomer");
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
| **customersCreateNewCustomerRequest** | [**CustomersCreateNewCustomerRequest**](CustomersCreateNewCustomerRequest.md)| Customer object that needs to be updated | |

### Return type

[**CustomersCreateNewCustomerResponse**](CustomersCreateNewCustomerResponse.md)

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
> CustomersListResponse list().limit(limit).page(page).orderBy(orderBy).execute();

List customers



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomersApi;
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
    Integer limit = 56;
    Integer page = 56; // Request a specific page
    String orderBy = "orderBy_example"; // field1 asc, field2 desc
    try {
      CustomersListResponse result = client
              .customers
              .list()
              .limit(limit)
              .page(page)
              .orderBy(orderBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomersListResponse> response = client
              .customers
              .list()
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
      System.err.println("Exception when calling CustomersApi#list");
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
| **limit** | **Integer**|  | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |
| **orderBy** | **String**| field1 asc, field2 desc | [optional] |

### Return type

[**CustomersListResponse**](CustomersListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of objects |  -  |

<a name="removeById"></a>
# **removeById**
> CustomersRemoveByIdResponse removeById(id).execute();

Delete a customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomersApi;
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
    UUID id = UUID.randomUUID(); // Customer ID
    try {
      CustomersRemoveByIdResponse result = client
              .customers
              .removeById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomersRemoveByIdResponse> response = client
              .customers
              .removeById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#removeById");
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
| **id** | **UUID**| Customer ID | |

### Return type

[**CustomersRemoveByIdResponse**](CustomersRemoveByIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="updateCustomer"></a>
# **updateCustomer**
> CustomersUpdateCustomerResponse updateCustomer(id, customersUpdateCustomerRequest).execute();

Update a customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomersApi;
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
    String customerName = "customerName_example"; // The name of the customer
    UUID id = UUID.randomUUID(); // Customer ID
    String description = "description_example"; // A description
    String firstName = "firstName_example"; // The first name of the contact person
    String lastName = "lastName_example"; // The last name of the contact person
    String email = "email_example"; // The email of the contact person
    String phone = "phone_example"; // The phone of the contact person
    try {
      CustomersUpdateCustomerResponse result = client
              .customers
              .updateCustomer(customerName, id)
              .description(description)
              .firstName(firstName)
              .lastName(lastName)
              .email(email)
              .phone(phone)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#updateCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomersUpdateCustomerResponse> response = client
              .customers
              .updateCustomer(customerName, id)
              .description(description)
              .firstName(firstName)
              .lastName(lastName)
              .email(email)
              .phone(phone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#updateCustomer");
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
| **id** | **UUID**| Customer ID | |
| **customersUpdateCustomerRequest** | [**CustomersUpdateCustomerRequest**](CustomersUpdateCustomerRequest.md)| Customer object that needs to be updated | |

### Return type

[**CustomersUpdateCustomerResponse**](CustomersUpdateCustomerResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

