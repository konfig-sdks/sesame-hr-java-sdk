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
import com.konfigthis.client.model.OfficesCreateOfficeRequest;
import com.konfigthis.client.model.OfficesCreateOfficeRequestCoordinates;
import com.konfigthis.client.model.OfficesCreateOfficeResponse;
import com.konfigthis.client.model.OfficesGetAllResponse;
import com.konfigthis.client.model.OfficesRemoveByIdResponse;
import com.konfigthis.client.model.OfficesUpdateByIdRequest;
import com.konfigthis.client.model.OfficesUpdateByIdResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OfficesApi
 */
@Disabled
public class OfficesApiTest {

    private static OfficesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new OfficesApi(apiClient);
    }

    /**
     * Create a office
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOfficeTest() throws ApiException {
        UUID companyId = null;
        String name = null;
        String description = null;
        String address = null;
        OfficesCreateOfficeRequestCoordinates coordinates = null;
        Integer radio = null;
        OfficesCreateOfficeResponse response = api.createOffice(companyId, name)
                .description(description)
                .address(address)
                .coordinates(coordinates)
                .radio(radio)
                .execute();
        // TODO: test validations
    }

    /**
     * List offices
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        String name = null;
        Integer limit = null;
        Integer page = null;
        String orderBy = null;
        OfficesGetAllResponse response = api.getAll()
                .name(name)
                .limit(limit)
                .page(page)
                .orderBy(orderBy)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete an office
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdTest() throws ApiException {
        UUID id = null;
        OfficesRemoveByIdResponse response = api.removeById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an office
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByIdTest() throws ApiException {
        String name = null;
        UUID id = null;
        String description = null;
        String address = null;
        OfficesCreateOfficeRequestCoordinates coordinates = null;
        Integer radio = null;
        OfficesUpdateByIdResponse response = api.updateById(name, id)
                .description(description)
                .address(address)
                .coordinates(coordinates)
                .radio(radio)
                .execute();
        // TODO: test validations
    }

}
