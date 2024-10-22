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
import com.konfigthis.client.model.ConnectModules;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DynamicModulesApi
 */
@Disabled
public class DynamicModulesApiTest {

    private static DynamicModulesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DynamicModulesApi(apiClient);
    }

    /**
     * Get modules
     *
     * Returns all modules registered dynamically by the calling app.  **[Permissions](https://dac-static.atlassian.com) required:** Only Connect apps can make this request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllRegisteredModulesTest() throws ApiException {
        ConnectModules response = api.getAllRegisteredModules()
                .execute();
        // TODO: test validations
    }

    /**
     * Register modules
     *
     * Registers a list of modules.  **[Permissions](https://dac-static.atlassian.com) required:** Only Connect apps can make this request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerModulesTest() throws ApiException {
        List<Object> modules = null;
        api.registerModules(modules)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove modules
     *
     * Remove all or a list of modules registered by the calling app.  **[Permissions](https://dac-static.atlassian.com) required:** Only Connect apps can make this request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTest() throws ApiException {
        List<String> moduleKey = null;
        api.remove()
                .moduleKey(moduleKey)
                .execute();
        // TODO: test validations
    }

}
