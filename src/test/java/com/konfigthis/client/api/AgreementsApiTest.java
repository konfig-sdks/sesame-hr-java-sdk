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
import com.konfigthis.client.model.AgreementsCreateNewAgreementRequest;
import com.konfigthis.client.model.AgreementsCreateNewAgreementResponse;
import com.konfigthis.client.model.AgreementsDeleteAgreementResponse;
import com.konfigthis.client.model.AgreementsGetAgreementResponse;
import com.konfigthis.client.model.AgreementsListResponse;
import com.konfigthis.client.model.AgreementsUpdateAgreementRequest;
import com.konfigthis.client.model.AgreementsUpdateAgreementResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AgreementsApi
 */
@Disabled
public class AgreementsApiTest {

    private static AgreementsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AgreementsApi(apiClient);
    }

    /**
     * Create an agreement
     *
     * Create an agreement
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewAgreementTest() throws ApiException {
        String name = null;
        String code = null;
        String color = null;
        Double annualHours = null;
        AgreementsCreateNewAgreementResponse response = api.createNewAgreement(name, code, color, annualHours)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete agreement
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAgreementTest() throws ApiException {
        UUID agreementId = null;
        AgreementsDeleteAgreementResponse response = api.deleteAgreement(agreementId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get agreement
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAgreementTest() throws ApiException {
        UUID agreementId = null;
        Integer limit = null;
        Integer page = null;
        AgreementsGetAgreementResponse response = api.getAgreement(agreementId)
                .limit(limit)
                .page(page)
                .execute();
        // TODO: test validations
    }

    /**
     * List agreements
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Integer limit = null;
        Integer page = null;
        AgreementsListResponse response = api.list()
                .limit(limit)
                .page(page)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an agreement
     *
     * Update an agreement
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAgreementTest() throws ApiException {
        String name = null;
        String code = null;
        String color = null;
        Double annualHours = null;
        UUID agreementId = null;
        AgreementsUpdateAgreementResponse response = api.updateAgreement(name, code, color, annualHours, agreementId)
                .execute();
        // TODO: test validations
    }

}
