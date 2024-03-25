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
import com.konfigthis.client.model.EntityProperty;
import com.konfigthis.client.model.PropertyKeys;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectPropertiesApi
 */
@Disabled
public class ProjectPropertiesApiTest {

    private static ProjectPropertiesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ProjectPropertiesApi(apiClient);
    }

    /**
     * Delete project property
     *
     * Deletes the [property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) from a project.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the property.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePropertyTest() throws ApiException {
        String projectIdOrKey = null;
        String propertyKey = null;
        api.deleteProperty(projectIdOrKey, propertyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Get project property
     *
     * Returns the value of a [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the property.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByKeyAndPropertyTest() throws ApiException {
        String projectIdOrKey = null;
        String propertyKey = null;
        EntityProperty response = api.getByKeyAndProperty(projectIdOrKey, propertyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Get project property keys
     *
     * Returns all [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) keys for the project.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPropertyKeysTest() throws ApiException {
        String projectIdOrKey = null;
        PropertyKeys response = api.getPropertyKeys(projectIdOrKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Set project property
     *
     * Sets the value of the [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties). You can use project properties to store custom data against the project.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the property is created.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setProjectPropertyTest() throws ApiException {
        String projectIdOrKey = null;
        String propertyKey = null;
        Object response = api.setProjectProperty(projectIdOrKey, propertyKey)
                .execute();
        // TODO: test validations
    }

}