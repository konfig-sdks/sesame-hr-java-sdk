/*
 * Sesame Public API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.EmployeesCreateNewEmployeeRequest;
import com.konfigthis.client.model.EmployeesCreateNewEmployeeRequestCustomFieldsInner;
import com.konfigthis.client.model.EmployeesCreateNewEmployeeResponse;
import com.konfigthis.client.model.EmployeesGetByIdResponse;
import com.konfigthis.client.model.EmployeesListResponse;
import com.konfigthis.client.model.EmployeesRemoveByIdResponse;
import com.konfigthis.client.model.EmployeesUpdateByIdRequest;
import com.konfigthis.client.model.EmployeesUpdateByIdRequestCustomFieldsInner;
import com.konfigthis.client.model.EmployeesUpdateByIdResponse;
import java.time.LocalDate;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmployeesApi
 */
@Disabled
public class EmployeesApiTest {

    private static EmployeesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EmployeesApi(apiClient);
    }

    /**
     * Create an employee
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewEmployeeTest() throws ApiException {
        UUID companyId = null;
        String firstName = null;
        String lastName = null;
        Boolean invitation = null;
        String status = null;
        String description = null;
        String gender = null;
        String email = null;
        UUID contractId = null;
        Integer code = null;
        Integer pin = null;
        String nid = null;
        String identityNumberType = null;
        String ssn = null;
        String phone = null;
        LocalDate dateOfBirth = null;
        List<EmployeesCreateNewEmployeeRequestCustomFieldsInner> customFields = null;
        String nationality = null;
        String maritalStatus = null;
        String address = null;
        String postalCode = null;
        String emergencyPhone = null;
        Integer childrenCount = null;
        Integer disability = null;
        String personalEmail = null;
        String city = null;
        String province = null;
        String country = null;
        String salaryRange = null;
        String studyLevel = null;
        String professionalCategoryCode = null;
        String professionalCategoryDescription = null;
        String bic = null;
        EmployeesCreateNewEmployeeResponse response = api.createNewEmployee(companyId, firstName, lastName, invitation, status)
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
        // TODO: test validations
    }

    /**
     * Get an employee
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        UUID id = null;
        EmployeesGetByIdResponse response = api.getById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * List employees
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Integer code = null;
        String dni = null;
        String email = null;
        List<UUID> departmentIds = null;
        List<UUID> officeIds = null;
        Integer limit = null;
        Integer page = null;
        String orderBy = null;
        String status = null;
        EmployeesListResponse response = api.list()
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
        // TODO: test validations
    }

    /**
     * Delete an employee
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdTest() throws ApiException {
        UUID id = null;
        EmployeesRemoveByIdResponse response = api.removeById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an employee
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByIdTest() throws ApiException {
        String firstName = null;
        String lastName = null;
        String status = null;
        UUID id = null;
        String description = null;
        String gender = null;
        String email = null;
        UUID contractId = null;
        Integer code = null;
        Integer pin = null;
        String nid = null;
        String identityNumberType = null;
        String ssn = null;
        String phone = null;
        LocalDate dateOfBirth = null;
        List<EmployeesUpdateByIdRequestCustomFieldsInner> customFields = null;
        String nationality = null;
        String maritalStatus = null;
        String address = null;
        String postalCode = null;
        String emergencyPhone = null;
        Integer childrenCount = null;
        Integer disability = null;
        String personalEmail = null;
        String city = null;
        String province = null;
        String country = null;
        String salaryRange = null;
        String studyLevel = null;
        String professionalCategoryCode = null;
        String professionalCategoryDescription = null;
        String bic = null;
        String accountNumber = null;
        EmployeesUpdateByIdResponse response = api.updateById(firstName, lastName, status, id)
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
        // TODO: test validations
    }

}
