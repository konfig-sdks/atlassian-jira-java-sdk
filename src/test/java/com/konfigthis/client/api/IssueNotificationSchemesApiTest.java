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
import com.konfigthis.client.model.AddNotificationsDetails;
import com.konfigthis.client.model.CreateNotificationSchemeDetails;
import com.konfigthis.client.model.NotificationScheme;
import com.konfigthis.client.model.NotificationSchemeEventDetails;
import com.konfigthis.client.model.NotificationSchemeId;
import com.konfigthis.client.model.PageBeanNotificationScheme;
import com.konfigthis.client.model.PageBeanNotificationSchemeAndProjectMappingJsonBean;
import java.util.Set;
import com.konfigthis.client.model.UpdateNotificationSchemeDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueNotificationSchemesApi
 */
@Disabled
public class IssueNotificationSchemesApiTest {

    private static IssueNotificationSchemesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new IssueNotificationSchemesApi(apiClient);
    }

    /**
     * Add notifications to notification scheme
     *
     * Adds notifications to a notification scheme. You can add up to 1000 notifications per request.  *Deprecated: The notification type &#x60;EmailAddress&#x60; is no longer supported in Cloud. Refer to the [changelog](https://developer.atlassian.com/cloud/jira/platform/changelog/#CHANGE-1031) for more details.*  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNotificationsToSchemeTest() throws ApiException {
        List<NotificationSchemeEventDetails> notificationSchemeEvents = null;
        String id = null;
        Object response = api.addNotificationsToScheme(notificationSchemeEvents, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Create notification scheme
     *
     * Creates a notification scheme with notifications. You can create up to 1000 notifications per request.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNotificationSchemeTest() throws ApiException {
        String name = null;
        String description = null;
        List<NotificationSchemeEventDetails> notificationSchemeEvents = null;
        NotificationSchemeId response = api.createNotificationScheme(name)
                .description(description)
                .notificationSchemeEvents(notificationSchemeEvents)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove notification from notification scheme
     *
     * Removes a notification from a notification scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteNotificationFromSchemeTest() throws ApiException {
        String notificationSchemeId = null;
        String notificationId = null;
        Object response = api.deleteNotificationFromScheme(notificationSchemeId, notificationId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get notification scheme
     *
     * Returns a [notification scheme](https://confluence.atlassian.com/x/8YdKLg), including the list of events and the recipients who will receive notifications for those events.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira, however, the user must have permission to administer at least one project associated with the notification scheme.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsByIdTest() throws ApiException {
        Long id = null;
        String expand = null;
        NotificationScheme response = api.getDetailsById(id)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Get projects using notification schemes paginated
     *
     * Returns a [paginated](https://dac-static.atlassian.com) mapping of project that have notification scheme assigned. You can provide either one or multiple notification scheme IDs or project IDs to filter by. If you don&#39;t provide any, this will return a list of all mappings. Note that only company-managed (classic) projects are supported. This is because team-managed projects don&#39;t have a concept of a default notification scheme. The mappings are ordered by projectId.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectsUsingNotificationSchemesPaginatedTest() throws ApiException {
        String startAt = null;
        String maxResults = null;
        Set<String> notificationSchemeId = null;
        Set<String> projectId = null;
        PageBeanNotificationSchemeAndProjectMappingJsonBean response = api.getProjectsUsingNotificationSchemesPaginated()
                .startAt(startAt)
                .maxResults(maxResults)
                .notificationSchemeId(notificationSchemeId)
                .projectId(projectId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get notification schemes paginated
     *
     * Returns a [paginated](https://dac-static.atlassian.com) list of [notification schemes](https://confluence.atlassian.com/x/8YdKLg) ordered by the display name.  *Note that you should allow for events without recipients to appear in responses.*  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira, however, the user must have permission to administer at least one project associated with a notification scheme for it to be returned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listNotificationSchemesPaginatedTest() throws ApiException {
        String startAt = null;
        String maxResults = null;
        Set<String> id = null;
        Set<String> projectId = null;
        Boolean onlyDefault = null;
        String expand = null;
        PageBeanNotificationScheme response = api.listNotificationSchemesPaginated()
                .startAt(startAt)
                .maxResults(maxResults)
                .id(id)
                .projectId(projectId)
                .onlyDefault(onlyDefault)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete notification scheme
     *
     * Deletes a notification scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeSchemeTest() throws ApiException {
        String notificationSchemeId = null;
        Object response = api.removeScheme(notificationSchemeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update notification scheme
     *
     * Updates a notification scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSchemeTest() throws ApiException {
        String id = null;
        String description = null;
        String name = null;
        Object response = api.updateScheme(id)
                .description(description)
                .name(name)
                .execute();
        // TODO: test validations
    }

}
