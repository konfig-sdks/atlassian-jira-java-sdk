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
 * API tests for UserPropertiesApi
 */
@Disabled
public class UserPropertiesApiTest {

    private static UserPropertiesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UserPropertiesApi(apiClient);
    }

    /**
     * Delete user property
     *
     * Deletes a property from a user.  Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to delete a property from any user.  *  Access to Jira, to delete a property from the calling user&#39;s record.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePropertyTest() throws ApiException {
        String propertyKey = null;
        String accountId = null;
        String userKey = null;
        String username = null;
        api.deleteProperty(propertyKey)
                .accountId(accountId)
                .userKey(userKey)
                .username(username)
                .execute();
        // TODO: test validations
    }

    /**
     * Get user property
     *
     * Returns the value of a user&#39;s property. If no property key is provided [Get user property keys](https://dac-static.atlassian.com) is called.  Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to get a property from any user.  *  Access to Jira, to get a property from the calling user&#39;s record.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPropertyTest() throws ApiException {
        String propertyKey = null;
        String accountId = null;
        String userKey = null;
        String username = null;
        EntityProperty response = api.getProperty(propertyKey)
                .accountId(accountId)
                .userKey(userKey)
                .username(username)
                .execute();
        // TODO: test validations
    }

    /**
     * Get user property keys
     *
     * Returns the keys of all properties for a user.  Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to access the property keys on any user.  *  Access to Jira, to access the calling user&#39;s property keys.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPropertyKeysTest() throws ApiException {
        String accountId = null;
        String userKey = null;
        String username = null;
        PropertyKeys response = api.getPropertyKeys()
                .accountId(accountId)
                .userKey(userKey)
                .username(username)
                .execute();
        // TODO: test validations
    }

    /**
     * Set user property
     *
     * Sets the value of a user&#39;s property. Use this resource to store custom data against a user.  Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set a property on any user.  *  Access to Jira, to set a property on the calling user&#39;s record.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setUserPropertyTest() throws ApiException {
        String propertyKey = null;
        String accountId = null;
        String userKey = null;
        String username = null;
        Object response = api.setUserProperty(propertyKey)
                .accountId(accountId)
                .userKey(userKey)
                .username(username)
                .execute();
        // TODO: test validations
    }

}
