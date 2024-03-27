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
import com.konfigthis.client.model.DepartmentsCreateNewDepartmentRequest;
import com.konfigthis.client.model.DepartmentsCreateNewDepartmentResponse;
import com.konfigthis.client.model.DepartmentsListResponse;
import com.konfigthis.client.model.DepartmentsRemoveByIdResponse;
import com.konfigthis.client.model.DepartmentsUpdateByIdRequest;
import com.konfigthis.client.model.DepartmentsUpdateByIdResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DepartmentsApi
 */
@Disabled
public class DepartmentsApiTest {

    private static DepartmentsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DepartmentsApi(apiClient);
    }

    /**
     * Create a department
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewDepartmentTest() throws ApiException {
        UUID companyId = null;
        String name = null;
        DepartmentsCreateNewDepartmentResponse response = api.createNewDepartment(companyId, name)
                .execute();
        // TODO: test validations
    }

    /**
     * List departments
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        String name = null;
        Integer limit = null;
        Integer page = null;
        String orderBy = null;
        DepartmentsListResponse response = api.list()
                .name(name)
                .limit(limit)
                .page(page)
                .orderBy(orderBy)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a department
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdTest() throws ApiException {
        UUID id = null;
        DepartmentsRemoveByIdResponse response = api.removeById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a department
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByIdTest() throws ApiException {
        String name = null;
        UUID id = null;
        DepartmentsUpdateByIdResponse response = api.updateById(name, id)
                .execute();
        // TODO: test validations
    }

}
