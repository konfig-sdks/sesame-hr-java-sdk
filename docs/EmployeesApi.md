# EmployeesApi

All URIs are relative to *https://api-eu1.sesametime.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewEmployee**](EmployeesApi.md#createNewEmployee) | **POST** /core/v3/employees | Create an employee |
| [**getById**](EmployeesApi.md#getById) | **GET** /core/v3/employees/{id} | Get an employee |
| [**list**](EmployeesApi.md#list) | **GET** /core/v3/employees | List employees |
| [**removeById**](EmployeesApi.md#removeById) | **DELETE** /core/v3/employees/{id} | Delete an employee |
| [**updateById**](EmployeesApi.md#updateById) | **PUT** /core/v3/employees/{id} | Update an employee |


<a name="createNewEmployee"></a>
# **createNewEmployee**
> EmployeesCreateNewEmployeeResponse createNewEmployee(employeesCreateNewEmployeeRequest).execute();

Create an employee



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    UUID companyId = UUID.randomUUID(); // The identifier of the company where the employee will belong to
    String firstName = "firstName_example"; // The first name of the employee
    String lastName = "lastName_example"; // The last name of the employee
    Boolean invitation = true; // If true, an invitation email will be send to the email from the email field
    String status = "active"; // default: active
    String description = "description_example"; // 
    String gender = "female"; // 
    String email = "email_example"; // The email for the employee access and notifications (required if invitation is true)
    UUID contractId = UUID.randomUUID(); // The identifier of your internal employee contract
    Integer code = 56; // The code of the employee
    Integer pin = 56; // The pin of the employee
    String nid = "nid_example"; // The National Identity Document of the employee
    String identityNumberType = "dni"; // 
    String ssn = "ssn_example"; // The Social Security Number of the employee
    String phone = "phone_example"; // 
    LocalDate dateOfBirth = LocalDate.now(); // 
    List<EmployeesCreateNewEmployeeRequestCustomFieldsInner> customFields = Arrays.asList(); // Custom Fields to fill
    String nationality = "nationality_example"; // 
    String maritalStatus = "maritalStatus_example"; // 
    String address = "address_example"; // 
    String postalCode = "postalCode_example"; // 
    String emergencyPhone = "emergencyPhone_example"; // 
    Integer childrenCount = 56; // 
    Integer disability = 56; // 
    String personalEmail = "personalEmail_example"; // 
    String city = "city_example"; // 
    String province = "province_example"; // 
    String country = "country_example"; // 
    String salaryRange = "salaryRange_example"; // 
    String studyLevel = "studyLevel_example"; // 
    String professionalCategoryCode = "professionalCategoryCode_example"; // 
    String professionalCategoryDescription = "professionalCategoryDescription_example"; // 
    String bic = "bic_example"; // 
    try {
      EmployeesCreateNewEmployeeResponse result = client
              .employees
              .createNewEmployee(companyId, firstName, lastName, invitation, status)
              .description(description)
              .gender(gender)
              .email(email)
              .contractId(contractId)
              .code(code)
              .pin(pin)
              .nid(nid)
              .identityNumberType(identityNumberType)
              .ssn(ssn)
              .phone(phone)
              .dateOfBirth(dateOfBirth)
              .customFields(customFields)
              .nationality(nationality)
              .maritalStatus(maritalStatus)
              .address(address)
              .postalCode(postalCode)
              .emergencyPhone(emergencyPhone)
              .childrenCount(childrenCount)
              .disability(disability)
              .personalEmail(personalEmail)
              .city(city)
              .province(province)
              .country(country)
              .salaryRange(salaryRange)
              .studyLevel(studyLevel)
              .professionalCategoryCode(professionalCategoryCode)
              .professionalCategoryDescription(professionalCategoryDescription)
              .bic(bic)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#createNewEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesCreateNewEmployeeResponse> response = client
              .employees
              .createNewEmployee(companyId, firstName, lastName, invitation, status)
              .description(description)
              .gender(gender)
              .email(email)
              .contractId(contractId)
              .code(code)
              .pin(pin)
              .nid(nid)
              .identityNumberType(identityNumberType)
              .ssn(ssn)
              .phone(phone)
              .dateOfBirth(dateOfBirth)
              .customFields(customFields)
              .nationality(nationality)
              .maritalStatus(maritalStatus)
              .address(address)
              .postalCode(postalCode)
              .emergencyPhone(emergencyPhone)
              .childrenCount(childrenCount)
              .disability(disability)
              .personalEmail(personalEmail)
              .city(city)
              .province(province)
              .country(country)
              .salaryRange(salaryRange)
              .studyLevel(studyLevel)
              .professionalCategoryCode(professionalCategoryCode)
              .professionalCategoryDescription(professionalCategoryDescription)
              .bic(bic)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#createNewEmployee");
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
| **employeesCreateNewEmployeeRequest** | [**EmployeesCreateNewEmployeeRequest**](EmployeesCreateNewEmployeeRequest.md)| Employee object that needs to be created | |

### Return type

[**EmployeesCreateNewEmployeeResponse**](EmployeesCreateNewEmployeeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

<a name="getById"></a>
# **getById**
> EmployeesGetByIdResponse getById(id).execute();

Get an employee



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    UUID id = UUID.randomUUID(); // Employee ID
    try {
      EmployeesGetByIdResponse result = client
              .employees
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesGetByIdResponse> response = client
              .employees
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getById");
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
| **id** | **UUID**| Employee ID | |

### Return type

[**EmployeesGetByIdResponse**](EmployeesGetByIdResponse.md)

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
> EmployeesListResponse list().code(code).dni(dni).email(email).departmentIds(departmentIds).officeIds(officeIds).limit(limit).page(page).orderBy(orderBy).status(status).execute();

List employees



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    Integer code = 56; // Find Employee by code
    String dni = "dni_example"; // Find Employee by dni
    String email = "email_example"; // Find Employee by email
    List<UUID> departmentIds = Arrays.asList(); // Find Employee by department Ids
    List<UUID> officeIds = Arrays.asList(); // Find Employee by office Ids
    Integer limit = 56; // Limit employees
    Integer page = 56; // Request a specific page
    String orderBy = "orderBy_example"; // field1 asc, field2 desc
    String status = "active"; // <b>Supported operators:</b> in
    try {
      EmployeesListResponse result = client
              .employees
              .list()
              .code(code)
              .dni(dni)
              .email(email)
              .departmentIds(departmentIds)
              .officeIds(officeIds)
              .limit(limit)
              .page(page)
              .orderBy(orderBy)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesListResponse> response = client
              .employees
              .list()
              .code(code)
              .dni(dni)
              .email(email)
              .departmentIds(departmentIds)
              .officeIds(officeIds)
              .limit(limit)
              .page(page)
              .orderBy(orderBy)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#list");
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
| **code** | **Integer**| Find Employee by code | [optional] |
| **dni** | **String**| Find Employee by dni | [optional] |
| **email** | **String**| Find Employee by email | [optional] |
| **departmentIds** | [**List&lt;UUID&gt;**](UUID.md)| Find Employee by department Ids | [optional] |
| **officeIds** | [**List&lt;UUID&gt;**](UUID.md)| Find Employee by office Ids | [optional] |
| **limit** | **Integer**| Limit employees | [optional] |
| **page** | **Integer**| Request a specific page | [optional] |
| **orderBy** | **String**| field1 asc, field2 desc | [optional] |
| **status** | **String**| &lt;b&gt;Supported operators:&lt;/b&gt; in | [optional] [enum: active, inactive] |

### Return type

[**EmployeesListResponse**](EmployeesListResponse.md)

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
> EmployeesRemoveByIdResponse removeById(id).execute();

Delete an employee



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    UUID id = UUID.randomUUID(); // Employee ID
    try {
      EmployeesRemoveByIdResponse result = client
              .employees
              .removeById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesRemoveByIdResponse> response = client
              .employees
              .removeById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#removeById");
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
| **id** | **UUID**| Employee ID | |

### Return type

[**EmployeesRemoveByIdResponse**](EmployeesRemoveByIdResponse.md)

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
> EmployeesUpdateByIdResponse updateById(id, employeesUpdateByIdRequest).execute();

Update an employee



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SesameHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String firstName = "firstName_example"; // The first name of the employee
    String lastName = "lastName_example"; // The last name of the employee
    String status = "active"; // 
    UUID id = UUID.randomUUID(); // Employee ID
    String description = "description_example"; // 
    String gender = "female"; // 
    String email = "email_example"; // The email for the employee access and notifications (required if invitation is true)
    UUID contractId = UUID.randomUUID(); // The identifier of your internal employee contract
    Integer code = 56; // The code of the employee
    Integer pin = 56; // The pin of the employee
    String nid = "nid_example"; // The National Identity Document of the employee
    String identityNumberType = "dni"; // 
    String ssn = "ssn_example"; // The Social Security Number of the employee
    String phone = "phone_example"; // 
    LocalDate dateOfBirth = LocalDate.now(); // 
    List<EmployeesUpdateByIdRequestCustomFieldsInner> customFields = Arrays.asList(); // Custom Fields to fill
    String nationality = "nationality_example"; // 
    String maritalStatus = "maritalStatus_example"; // 
    String address = "address_example"; // 
    String postalCode = "postalCode_example"; // 
    String emergencyPhone = "emergencyPhone_example"; // 
    Integer childrenCount = 56; // 
    Integer disability = 56; // 
    String personalEmail = "personalEmail_example"; // 
    String city = "city_example"; // 
    String province = "province_example"; // 
    String country = "country_example"; // 
    String salaryRange = "salaryRange_example"; // 
    String studyLevel = "studyLevel_example"; // 
    String professionalCategoryCode = "professionalCategoryCode_example"; // 
    String professionalCategoryDescription = "professionalCategoryDescription_example"; // 
    String bic = "bic_example"; // 
    String accountNumber = "accountNumber_example"; // 
    try {
      EmployeesUpdateByIdResponse result = client
              .employees
              .updateById(firstName, lastName, status, id)
              .description(description)
              .gender(gender)
              .email(email)
              .contractId(contractId)
              .code(code)
              .pin(pin)
              .nid(nid)
              .identityNumberType(identityNumberType)
              .ssn(ssn)
              .phone(phone)
              .dateOfBirth(dateOfBirth)
              .customFields(customFields)
              .nationality(nationality)
              .maritalStatus(maritalStatus)
              .address(address)
              .postalCode(postalCode)
              .emergencyPhone(emergencyPhone)
              .childrenCount(childrenCount)
              .disability(disability)
              .personalEmail(personalEmail)
              .city(city)
              .province(province)
              .country(country)
              .salaryRange(salaryRange)
              .studyLevel(studyLevel)
              .professionalCategoryCode(professionalCategoryCode)
              .professionalCategoryDescription(professionalCategoryDescription)
              .bic(bic)
              .accountNumber(accountNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesUpdateByIdResponse> response = client
              .employees
              .updateById(firstName, lastName, status, id)
              .description(description)
              .gender(gender)
              .email(email)
              .contractId(contractId)
              .code(code)
              .pin(pin)
              .nid(nid)
              .identityNumberType(identityNumberType)
              .ssn(ssn)
              .phone(phone)
              .dateOfBirth(dateOfBirth)
              .customFields(customFields)
              .nationality(nationality)
              .maritalStatus(maritalStatus)
              .address(address)
              .postalCode(postalCode)
              .emergencyPhone(emergencyPhone)
              .childrenCount(childrenCount)
              .disability(disability)
              .personalEmail(personalEmail)
              .city(city)
              .province(province)
              .country(country)
              .salaryRange(salaryRange)
              .studyLevel(studyLevel)
              .professionalCategoryCode(professionalCategoryCode)
              .professionalCategoryDescription(professionalCategoryDescription)
              .bic(bic)
              .accountNumber(accountNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateById");
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
| **id** | **UUID**| Employee ID | |
| **employeesUpdateByIdRequest** | [**EmployeesUpdateByIdRequest**](EmployeesUpdateByIdRequest.md)| Employee object that needs to be updated | |

### Return type

[**EmployeesUpdateByIdResponse**](EmployeesUpdateByIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object |  -  |

