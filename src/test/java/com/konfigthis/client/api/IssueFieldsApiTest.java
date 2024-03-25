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
import com.konfigthis.client.model.CustomFieldDefinitionJsonBean;
import com.konfigthis.client.model.FieldDetails;
import com.konfigthis.client.model.PageBeanContext;
import com.konfigthis.client.model.PageBeanField;
import java.util.Set;
import com.konfigthis.client.model.UpdateCustomFieldDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueFieldsApi
 */
@Disabled
public class IssueFieldsApiTest {

    private static IssueFieldsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new IssueFieldsApi(apiClient);
    }

    /**
     * Create custom field
     *
     * Creates a custom field.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCustomFieldTest() throws ApiException {
        String name = null;
        String type = null;
        String description = null;
        String searcherKey = null;
        FieldDetails response = api.createCustomField(name, type)
                .description(description)
                .searcherKey(searcherKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete custom field
     *
     * Deletes a custom field. The custom field is deleted whether it is in the trash or not. See [Edit or delete a custom field](https://confluence.atlassian.com/x/Z44fOw) for more information on trashing and deleting custom fields.  This operation is [asynchronous](https://dac-static.atlassian.com). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](https://dac-static.atlassian.com) to obtain subsequent updates.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCustomFieldTest() throws ApiException {
        String id = null;
        api.deleteCustomField(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get contexts for a field
     *
     * Returns a [paginated](https://dac-static.atlassian.com) list of the contexts a field is used in. Deprecated, use [Get custom field contexts](https://dac-static.atlassian.com).  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getContextsForFieldTest() throws ApiException {
        String fieldId = null;
        Long startAt = null;
        Integer maxResults = null;
        PageBeanContext response = api.getContextsForField(fieldId)
                .startAt(startAt)
                .maxResults(maxResults)
                .execute();
        // TODO: test validations
    }

    /**
     * Get fields paginated
     *
     * Returns a [paginated](https://dac-static.atlassian.com) list of fields for Classic Jira projects. The list can include:   *  all fields  *  specific fields, by defining &#x60;id&#x60;  *  fields that contain a string in the field name or description, by defining &#x60;query&#x60;  *  specific fields that contain a string in the field name or description, by defining &#x60;id&#x60; and &#x60;query&#x60;  Only custom fields can be queried, &#x60;type&#x60; must be set to &#x60;custom&#x60;.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFieldsPaginatedTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        List<String> type = null;
        Set<String> id = null;
        String query = null;
        String orderBy = null;
        String expand = null;
        PageBeanField response = api.getFieldsPaginated()
                .startAt(startAt)
                .maxResults(maxResults)
                .type(type)
                .id(id)
                .query(query)
                .orderBy(orderBy)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Get fields
     *
     * Returns system and custom issue fields according to the following rules:   *  Fields that cannot be added to the issue navigator are always returned.  *  Fields that cannot be placed on an issue screen are always returned.  *  Fields that depend on global Jira settings are only returned if the setting is enabled. That is, timetracking fields, subtasks, votes, and watches.  *  For all other fields, this operation only returns the fields that the user has permission to view (that is, the field is used in at least one project that the user has *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.)  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSystemAndCustomFieldsTest() throws ApiException {
        List<FieldDetails> response = api.getSystemAndCustomFields()
                .execute();
        // TODO: test validations
    }

    /**
     * Get fields in trash paginated
     *
     * Returns a [paginated](https://dac-static.atlassian.com) list of fields in the trash. The list may be restricted to fields whose field name or description partially match a string.  Only custom fields can be queried, &#x60;type&#x60; must be set to &#x60;custom&#x60;.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFieldsInTrashPaginatedTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        Set<String> id = null;
        String query = null;
        String expand = null;
        String orderBy = null;
        PageBeanField response = api.listFieldsInTrashPaginated()
                .startAt(startAt)
                .maxResults(maxResults)
                .id(id)
                .query(query)
                .expand(expand)
                .orderBy(orderBy)
                .execute();
        // TODO: test validations
    }

    /**
     * Move custom field to trash
     *
     * Moves a custom field to trash. See [Edit or delete a custom field](https://confluence.atlassian.com/x/Z44fOw) for more information on trashing and deleting custom fields.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void moveCustomFieldToTrashTest() throws ApiException {
        String id = null;
        Object response = api.moveCustomFieldToTrash(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Restore custom field from trash
     *
     * Restores a custom field from trash. See [Edit or delete a custom field](https://confluence.atlassian.com/x/Z44fOw) for more information on trashing and deleting custom fields.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void restoreCustomFieldFromTrashTest() throws ApiException {
        String id = null;
        Object response = api.restoreCustomFieldFromTrash(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Update custom field
     *
     * Updates a custom field.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCustomFieldTest() throws ApiException {
        String fieldId = null;
        String description = null;
        String name = null;
        String searcherKey = null;
        Object response = api.updateCustomField(fieldId)
                .description(description)
                .name(name)
                .searcherKey(searcherKey)
                .execute();
        // TODO: test validations
    }

}
