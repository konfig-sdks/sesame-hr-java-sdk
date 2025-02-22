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
import com.konfigthis.client.model.EmployeeDepartmentAssignationsAssignDepartmentToEmployeeRequest;
import com.konfigthis.client.model.EmployeeDepartmentAssignationsAssignDepartmentToEmployeeResponse;
import com.konfigthis.client.model.EmployeeDepartmentAssignationsListResponse;
import com.konfigthis.client.model.EmployeeDepartmentAssignationsUnassignRequest;
import com.konfigthis.client.model.EmployeeDepartmentAssignationsUnassignResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmployeeDepartmentAssignationsApi
 */
@Disabled
public class EmployeeDepartmentAssignationsApiTest {

    private static EmployeeDepartmentAssignationsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EmployeeDepartmentAssignationsApi(apiClient);
    }

    /**
     * Assign an employee to a department
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignDepartmentToEmployeeTest() throws ApiException {
        UUID employeeId = null;
        UUID departmentId = null;
        EmployeeDepartmentAssignationsAssignDepartmentToEmployeeResponse response = api.assignDepartmentToEmployee(employeeId, departmentId)
                .execute();
        // TODO: test validations
    }

    /**
     * List employee department assignation
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        UUID employeeId = null;
        UUID departmentId = null;
        Integer limit = null;
        Integer page = null;
        EmployeeDepartmentAssignationsListResponse response = api.list()
                .employeeId(employeeId)
                .departmentId(departmentId)
                .limit(limit)
                .page(page)
                .execute();
        // TODO: test validations
    }

    /**
     * Unassign employee from department
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unassignTest() throws ApiException {
        UUID employeeId = null;
        UUID departmentId = null;
        EmployeeDepartmentAssignationsUnassignResponse response = api.unassign(employeeId, departmentId)
                .execute();
        // TODO: test validations
    }

}
