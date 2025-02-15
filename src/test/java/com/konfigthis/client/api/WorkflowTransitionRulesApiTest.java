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
import com.konfigthis.client.model.PageBeanWorkflowTransitionRules;
import java.util.Set;
import com.konfigthis.client.model.WorkflowTransitionRules;
import com.konfigthis.client.model.WorkflowTransitionRulesDetails;
import com.konfigthis.client.model.WorkflowTransitionRulesUpdate;
import com.konfigthis.client.model.WorkflowTransitionRulesUpdateErrors;
import com.konfigthis.client.model.WorkflowsWithTransitionRulesDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowTransitionRulesApi
 */
@Disabled
public class WorkflowTransitionRulesApiTest {

    private static WorkflowTransitionRulesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new WorkflowTransitionRulesApi(apiClient);
    }

    /**
     * Delete workflow transition rule configurations
     *
     * Deletes workflow transition rules from one or more workflows. These rule types are supported:   *  [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)  *  [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)  *  [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)  Only rules created by the calling Connect app can be deleted.  **[Permissions](https://dac-static.atlassian.com) required:** Only Connect apps can use this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTransitionConfigurationsTest() throws ApiException {
        List<WorkflowTransitionRulesDetails> workflows = null;
        WorkflowTransitionRulesUpdateErrors response = api.deleteTransitionConfigurations(workflows)
                .execute();
        // TODO: test validations
    }

    /**
     * Get workflow transition rule configurations
     *
     * Returns a [paginated](https://dac-static.atlassian.com) list of workflows with transition rules. The workflows can be filtered to return only those containing workflow transition rules:   *  of one or more transition rule types, such as [workflow post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/).  *  matching one or more transition rule keys.  Only workflows containing transition rules created by the calling [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) app are returned.  Due to server-side optimizations, workflows with an empty list of rules may be returned; these workflows can be ignored.  **[Permissions](https://dac-static.atlassian.com) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) apps can use this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigurationsTest() throws ApiException {
        Set<String> types = null;
        Long startAt = null;
        Integer maxResults = null;
        Set<String> keys = null;
        Set<String> workflowNames = null;
        Set<String> withTags = null;
        Boolean draft = null;
        String expand = null;
        PageBeanWorkflowTransitionRules response = api.getConfigurations(types)
                .startAt(startAt)
                .maxResults(maxResults)
                .keys(keys)
                .workflowNames(workflowNames)
                .withTags(withTags)
                .draft(draft)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Update workflow transition rule configurations
     *
     * Updates configuration of workflow transition rules. The following rule types are supported:   *  [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)  *  [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)  *  [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)  Only rules created by the calling [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) app can be updated.  To assist with app migration, this operation can be used to:   *  Disable a rule.  *  Add a &#x60;tag&#x60;. Use this to filter rules in the [Get workflow transition rule configurations](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-workflow-transition-rules/#api-rest-api-3-workflow-rule-config-get).  Rules are enabled if the &#x60;disabled&#x60; parameter is not provided.  **[Permissions](https://dac-static.atlassian.com) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) apps can use this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTransitionRuleConfigurationsTest() throws ApiException {
        List<WorkflowTransitionRules> workflows = null;
        WorkflowTransitionRulesUpdateErrors response = api.updateTransitionRuleConfigurations(workflows)
                .execute();
        // TODO: test validations
    }

}
