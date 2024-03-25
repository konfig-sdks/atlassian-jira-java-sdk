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
import com.konfigthis.client.model.PageBeanScreenScheme;
import com.konfigthis.client.model.ScreenSchemeDetails;
import com.konfigthis.client.model.ScreenSchemeId;
import com.konfigthis.client.model.ScreenTypes;
import java.util.Set;
import com.konfigthis.client.model.UpdateScreenSchemeDetails;
import com.konfigthis.client.model.UpdateScreenTypes;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScreenSchemesApi
 */
@Disabled
public class ScreenSchemesApiTest {

    private static ScreenSchemesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ScreenSchemesApi(apiClient);
    }

    /**
     * Create screen scheme
     *
     * Creates a screen scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createScreenSchemeTest() throws ApiException {
        String name = null;
        ScreenTypes screens = null;
        String description = null;
        ScreenSchemeId response = api.createScreenScheme(name, screens)
                .description(description)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete screen scheme
     *
     * Deletes a screen scheme. A screen scheme cannot be deleted if it is used in an issue type screen scheme.  Only screens schemes used in classic projects can be deleted.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSchemeByIdTest() throws ApiException {
        String screenSchemeId = null;
        api.deleteSchemeById(screenSchemeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get screen schemes
     *
     * Returns a [paginated](https://dac-static.atlassian.com) list of screen schemes.  Only screen schemes used in classic projects are returned.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listScreenSchemesTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        Set<Long> id = null;
        String expand = null;
        String queryString = null;
        String orderBy = null;
        PageBeanScreenScheme response = api.listScreenSchemes()
                .startAt(startAt)
                .maxResults(maxResults)
                .id(id)
                .expand(expand)
                .queryString(queryString)
                .orderBy(orderBy)
                .execute();
        // TODO: test validations
    }

    /**
     * Update screen scheme
     *
     * Updates a screen scheme. Only screen schemes used in classic projects can be updated.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSchemeByIdTest() throws ApiException {
        String screenSchemeId = null;
        String description = null;
        String name = null;
        UpdateScreenTypes screens = null;
        Object response = api.updateSchemeById(screenSchemeId)
                .description(description)
                .name(name)
                .screens(screens)
                .execute();
        // TODO: test validations
    }

}