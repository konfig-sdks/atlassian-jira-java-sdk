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
import com.konfigthis.client.model.BulkIssuePropertyUpdateRequest;
import com.konfigthis.client.model.EntityProperty;
import com.konfigthis.client.model.IssueEntityProperties;
import com.konfigthis.client.model.IssueEntityPropertiesForMultiUpdate;
import com.konfigthis.client.model.IssueFilterForBulkPropertyDelete;
import com.konfigthis.client.model.IssueFilterForBulkPropertySet;
import com.konfigthis.client.model.JsonNode;
import com.konfigthis.client.model.MultiIssueEntityProperties;
import com.konfigthis.client.model.PropertyKeys;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssuePropertiesApi
 */
@Disabled
public class IssuePropertiesApiTest {

    private static IssuePropertiesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new IssuePropertiesApi(apiClient);
    }

    /**
     * Bulk delete issue property
     *
     * Deletes a property value from multiple issues. The issues to be updated can be specified by filter criteria.  The criteria the filter used to identify eligible issues are:   *  &#x60;entityIds&#x60; Only issues from this list are eligible.  *  &#x60;currentValue&#x60; Only issues with the property set to this value are eligible.  If both criteria is specified, they are joined with the logical *AND*: only issues that satisfy both criteria are considered eligible.  If no filter criteria are specified, all the issues visible to the user and where the user has the EDIT\\_ISSUES permission for the issue are considered eligible.  This operation is:   *  transactional, either the property is deleted from all eligible issues or, when errors occur, no properties are deleted.  *  [asynchronous](https://dac-static.atlassian.com). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](https://dac-static.atlassian.com) to obtain subsequent updates.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for each project containing issues.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for each issue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkDeleteIssuePropertyByFilterTest() throws ApiException {
        String propertyKey = null;
        Object currentValue = null;
        Set<Long> entityIds = null;
        api.bulkDeleteIssuePropertyByFilter(propertyKey)
                .currentValue(currentValue)
                .entityIds(entityIds)
                .execute();
        // TODO: test validations
    }

    /**
     * Bulk set issue property
     *
     * Sets a property value on multiple issues.  The value set can be a constant or determined by a [Jira expression](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/). Expressions must be computable with constant complexity when applied to a set of issues. Expressions must also comply with the [restrictions](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#restrictions) that apply to all Jira expressions.  The issues to be updated can be specified by a filter.  The filter identifies issues eligible for update using these criteria:   *  &#x60;entityIds&#x60; Only issues from this list are eligible.  *  &#x60;currentValue&#x60; Only issues with the property set to this value are eligible.  *  &#x60;hasProperty&#x60;:           *  If *true*, only issues with the property are eligible.      *  If *false*, only issues without the property are eligible.  If more than one criteria is specified, they are joined with the logical *AND*: only issues that satisfy all criteria are eligible.  If an invalid combination of criteria is provided, an error is returned. For example, specifying a &#x60;currentValue&#x60; and &#x60;hasProperty&#x60; as *false* would not match any issues (because without the property the property cannot have a value).  The filter is optional. Without the filter all the issues visible to the user and where the user has the EDIT\\_ISSUES permission for the issue are considered eligible.  This operation is:   *  transactional, either all eligible issues are updated or, when errors occur, none are updated.  *  [asynchronous](https://dac-static.atlassian.com). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](https://dac-static.atlassian.com) to obtain subsequent updates.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for each project containing issues.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for each issue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkSetIssuePropertyByListTest() throws ApiException {
        String propertyKey = null;
        String expression = null;
        IssueFilterForBulkPropertySet filter = null;
        Object value = null;
        api.bulkSetIssuePropertyByList(propertyKey)
                .expression(expression)
                .filter(filter)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * Bulk set issue properties by issue
     *
     * Sets or updates entity property values on issues. Up to 10 entity properties can be specified for each issue and up to 100 issues included in the request.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON.  This operation is:   *  [asynchronous](https://dac-static.atlassian.com). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](https://dac-static.atlassian.com) to obtain subsequent updates.  *  non-transactional. Updating some entities may fail. Such information will available in the task result.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkSetPropertiesByIssueTest() throws ApiException {
        List<IssueEntityPropertiesForMultiUpdate> issues = null;
        api.bulkSetPropertiesByIssue()
                .issues(issues)
                .execute();
        // TODO: test validations
    }

    /**
     * Bulk set issues properties by list
     *
     * Sets or updates a list of entity property values on issues. A list of up to 10 entity properties can be specified along with up to 10,000 issues on which to set or update that list of entity properties.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON. The maximum length of single issue property value is 32768 characters. This operation can be accessed anonymously.  This operation is:   *  transactional, either all properties are updated in all eligible issues or, when errors occur, no properties are updated.  *  [asynchronous](https://dac-static.atlassian.com). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](https://dac-static.atlassian.com) to obtain subsequent updates.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkSetPropertiesByListTest() throws ApiException {
        Set<Long> entitiesIds = null;
        Map<String, JsonNode> properties = null;
        api.bulkSetPropertiesByList()
                .entitiesIds(entitiesIds)
                .properties(properties)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete issue property
     *
     * Deletes an issue&#39;s property.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePropertyTest() throws ApiException {
        String issueIdOrKey = null;
        String propertyKey = null;
        api.deleteProperty(issueIdOrKey, propertyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Get issue property
     *
     * Returns the key and value of an issue&#39;s property.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByKeyAndValueTest() throws ApiException {
        String issueIdOrKey = null;
        String propertyKey = null;
        EntityProperty response = api.getByKeyAndValue(issueIdOrKey, propertyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Get issue property keys
     *
     * Returns the URLs and keys of an issue&#39;s properties.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Property details are only returned where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getKeysTest() throws ApiException {
        String issueIdOrKey = null;
        PropertyKeys response = api.getKeys(issueIdOrKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Set issue property
     *
     * Sets the value of an issue&#39;s property. Use this resource to store custom data against an issue.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setIssuePropertyTest() throws ApiException {
        String issueIdOrKey = null;
        String propertyKey = null;
        Object response = api.setIssueProperty(issueIdOrKey, propertyKey)
                .execute();
        // TODO: test validations
    }

}
