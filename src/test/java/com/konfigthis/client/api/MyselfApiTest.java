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
import com.konfigthis.client.model.Locale;
import com.konfigthis.client.model.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MyselfApi
 */
@Disabled
public class MyselfApiTest {

    private static MyselfApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new MyselfApi(apiClient);
    }

    /**
     * Delete locale
     *
     * Deprecated, use [Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API instead.  Deletes the locale of the user, which restores the default setting.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserLocaleTest() throws ApiException {
        Object response = api.deleteUserLocale()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete preference
     *
     * Deletes a preference of the user, which restores the default value of system defined settings.  Note that these keys are deprecated:   *  *jira.user.locale* The locale of the user. By default, not set. The user takes the instance locale.  *  *jira.user.timezone* The time zone of the user. By default, not set. The user takes the instance timezone.  Use [Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API to manage timezone and locale instead.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserPreferenceTest() throws ApiException {
        String key = null;
        api.deleteUserPreference(key)
                .execute();
        // TODO: test validations
    }

    /**
     * Get current user
     *
     * Returns details for the current user.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentUserDetailsTest() throws ApiException {
        String expand = null;
        User response = api.getCurrentUserDetails()
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Get preference
     *
     * Returns the value of a preference of the current user.  Note that these keys are deprecated:   *  *jira.user.locale* The locale of the user. By default this is not set and the user takes the locale of the instance.  *  *jira.user.timezone* The time zone of the user. By default this is not set and the user takes the timezone of the instance.  These system preferences keys will be deprecated by 15/07/2024. You can still retrieve these keys, but it will not have any impact on Notification behaviour.   *  *user.notifiy.own.changes* Whether the user gets notified of their own changes.  *  *user.notifications.watcher* Whether the user gets notified when they are watcher.  *  *user.notifications.assignee* Whether the user gets notified when they are assignee.  *  *user.notifications.reporter* Whether the user gets notified when they are reporter.  *  *user.notifications.mentions* Whether the user gets notified when they are mentions.  Use [Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API to manage timezone and locale instead.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPreferenceValueTest() throws ApiException {
        String key = null;
        String response = api.getPreferenceValue(key)
                .execute();
        // TODO: test validations
    }

    /**
     * Get locale
     *
     * Returns the locale for the user.  If the user has no language preference set (which is the default setting) or this resource is accessed anonymous, the browser locale detected by Jira is returned. Jira detects the browser locale using the *Accept-Language* header in the request. However, if this doesn&#39;t match a locale available Jira, the site default locale is returned.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserLocaleTest() throws ApiException {
        Locale response = api.getUserLocale()
                .execute();
        // TODO: test validations
    }

    /**
     * Set locale
     *
     * Deprecated, use [Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API instead.  Sets the locale of the user. The locale must be one supported by the instance of Jira.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setUserLocaleTest() throws ApiException {
        String locale = null;
        Object response = api.setUserLocale()
                .locale(locale)
                .execute();
        // TODO: test validations
    }

    /**
     * Set preference
     *
     * Creates a preference for the user or updates a preference&#39;s value by sending a plain text string. For example, &#x60;false&#x60;. An arbitrary preference can be created with the value containing up to 255 characters. In addition, the following keys define system preferences that can be set or created:   *  *user.notifications.mimetype* The mime type used in notifications sent to the user. Defaults to &#x60;html&#x60;.  *  *user.default.share.private* Whether new [filters](https://confluence.atlassian.com/x/eQiiLQ) are set to private. Defaults to &#x60;true&#x60;.  *  *user.keyboard.shortcuts.disabled* Whether keyboard shortcuts are disabled. Defaults to &#x60;false&#x60;.  *  *user.autowatch.disabled* Whether the user automatically watches issues they create or add a comment to. By default, not set: the user takes the instance autowatch setting.  Note that these keys are deprecated:   *  *jira.user.locale* The locale of the user. By default, not set. The user takes the instance locale.  *  *jira.user.timezone* The time zone of the user. By default, not set. The user takes the instance timezone.  These system preferences keys will be deprecated by 15/07/2024. You can still use these keys to create arbitrary preferences, but it will not have any impact on Notification behaviour.   *  *user.notifiy.own.changes* Whether the user gets notified of their own changes.  *  *user.notifications.watcher* Whether the user gets notified when they are watcher.  *  *user.notifications.assignee* Whether the user gets notified when they are assignee.  *  *user.notifications.reporter* Whether the user gets notified when they are reporter.  *  *user.notifications.mentions* Whether the user gets notified when they are mentions.  Use [Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API to manage timezone and locale instead.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePreferenceValueTest() throws ApiException {
        String key = null;
        Object response = api.updatePreferenceValue(key)
                .execute();
        // TODO: test validations
    }

}
