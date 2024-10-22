/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT-9aad01a33a3dae75a5b6aedf98c77d2cbd2f865d
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.DataClassificationLevelsBean;
import java.util.Set;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClassificationLevelsApi
 */
@Disabled
public class ClassificationLevelsApiTest {

    private static ClassificationLevelsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ClassificationLevelsApi(apiClient);
    }

    /**
     * Get all classification levels
     *
     * Returns all classification levels.  **[Permissions](https://dac-static.atlassian.com) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        Set<String> status = null;
        String orderBy = null;
        DataClassificationLevelsBean response = api.getAll()
                .status(status)
                .orderBy(orderBy)
                .execute();
        // TODO: test validations
    }

}
