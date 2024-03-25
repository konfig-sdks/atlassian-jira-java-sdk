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
import com.konfigthis.client.model.CreateResolutionDetails;
import com.konfigthis.client.model.PageBeanResolutionJsonBean;
import com.konfigthis.client.model.ReorderIssueResolutionsRequest;
import com.konfigthis.client.model.Resolution;
import com.konfigthis.client.model.ResolutionId;
import com.konfigthis.client.model.SetDefaultResolutionRequest;
import com.konfigthis.client.model.UpdateResolutionDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueResolutionsApi
 */
@Disabled
public class IssueResolutionsApiTest {

    private static IssueResolutionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new IssueResolutionsApi(apiClient);
    }

    /**
     * Move resolutions
     *
     * Changes the order of issue resolutions.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changeOrderTest() throws ApiException {
        List<String> ids = null;
        String after = null;
        String position = null;
        Object response = api.changeOrder(ids)
                .after(after)
                .position(position)
                .execute();
        // TODO: test validations
    }

    /**
     * Create resolution
     *
     * Creates an issue resolution.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createIssueResolutionTest() throws ApiException {
        String name = null;
        String description = null;
        ResolutionId response = api.createIssueResolution(name)
                .description(description)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete resolution
     *
     * Deletes an issue resolution.  This operation is [asynchronous](https://dac-static.atlassian.com). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](https://dac-static.atlassian.com) to obtain subsequent updates.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteIssueResolutionTest() throws ApiException {
        String id = null;
        String replaceWith = null;
        api.deleteIssueResolution(id, replaceWith)
                .execute();
        // TODO: test validations
    }

    /**
     * Get resolution
     *
     * Returns an issue resolution value.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String id = null;
        Resolution response = api.getById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get resolutions
     *
     * Returns a list of all issue resolution values.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllValuesTest() throws ApiException {
        List<Resolution> response = api.listAllValues()
                .execute();
        // TODO: test validations
    }

    /**
     * Search resolutions
     *
     * Returns a [paginated](https://dac-static.atlassian.com) list of resolutions. The list can contain all resolutions or a subset determined by any combination of these criteria:   *  a list of resolutions IDs.  *  whether the field configuration is a default. This returns resolutions from company-managed (classic) projects only, as there is no concept of default resolutions in team-managed projects.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        String startAt = null;
        String maxResults = null;
        List<String> id = null;
        Boolean onlyDefault = null;
        PageBeanResolutionJsonBean response = api.search()
                .startAt(startAt)
                .maxResults(maxResults)
                .id(id)
                .onlyDefault(onlyDefault)
                .execute();
        // TODO: test validations
    }

    /**
     * Set default resolution
     *
     * Sets default issue resolution.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setDefaultResolutionTest() throws ApiException {
        String id = null;
        Object response = api.setDefaultResolution(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Update resolution
     *
     * Updates an issue resolution.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateResolutionTest() throws ApiException {
        String name = null;
        String id = null;
        String description = null;
        Object response = api.updateResolution(name, id)
                .description(description)
                .execute();
        // TODO: test validations
    }

}
