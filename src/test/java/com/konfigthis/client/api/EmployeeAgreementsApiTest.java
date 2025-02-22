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
import com.konfigthis.client.model.EmployeeAgreementsAssignEmployeeRequest;
import com.konfigthis.client.model.EmployeeAgreementsAssignEmployeeResponse;
import com.konfigthis.client.model.EmployeeAgreementsUnassignEmployeeResponse;
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
 * API tests for EmployeeAgreementsApi
 */
@Disabled
public class EmployeeAgreementsApiTest {

    private static EmployeeAgreementsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EmployeeAgreementsApi(apiClient);
    }

    /**
     * Create employee agreement
     *
     * Assign employee to agreement
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignEmployeeTest() throws ApiException {
        UUID agreementId = null;
        UUID employeeId = null;
        LocalDate startDate = null;
        EmployeeAgreementsAssignEmployeeResponse response = api.assignEmployee(agreementId, employeeId, startDate)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete employee agreement
     *
     * Unassign employee to agreement
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unassignEmployeeTest() throws ApiException {
        UUID agreementEmployeeId = null;
        EmployeeAgreementsUnassignEmployeeResponse response = api.unassignEmployee(agreementEmployeeId)
                .execute();
        // TODO: test validations
    }

}
