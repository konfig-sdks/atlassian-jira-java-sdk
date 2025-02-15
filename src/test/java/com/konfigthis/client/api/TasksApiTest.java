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
import com.konfigthis.client.model.TaskProgressBeanObject;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TasksApi
 */
@Disabled
public class TasksApiTest {

    private static TasksApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TasksApi(apiClient);
    }

    /**
     * Cancel task
     *
     * Cancels a task.  **[Permissions](https://dac-static.atlassian.com) required:** either of:   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  Creator of the task.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelTaskTest() throws ApiException {
        String taskId = null;
        Object response = api.cancelTask(taskId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get task
     *
     * Returns the status of a [long-running asynchronous task](https://dac-static.atlassian.com).  When a task has finished, this operation returns the JSON blob applicable to the task. See the documentation of the operation that created the task for details. Task details are not permanently retained. As of September 2019, details are retained for 14 days although this period may change without notice.  **Deprecation notice:** The required OAuth 2.0 scopes will be updated on June 15, 2024.   *  &#x60;read:jira-work&#x60;  **[Permissions](https://dac-static.atlassian.com) required:** either of:   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  Creator of the task.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatusTest() throws ApiException {
        String taskId = null;
        TaskProgressBeanObject response = api.getStatus(taskId)
                .execute();
        // TODO: test validations
    }

}
