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
import com.konfigthis.client.model.CreateProjectDetails;
import com.konfigthis.client.model.IssueTypeWithStatus;
import com.konfigthis.client.model.NotificationScheme;
import com.konfigthis.client.model.PageBeanProject;
import com.konfigthis.client.model.Project;
import com.konfigthis.client.model.ProjectIdentifiers;
import com.konfigthis.client.model.ProjectIssueTypeHierarchy;
import java.util.Set;
import com.konfigthis.client.model.UpdateProjectDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
@Disabled
public class ProjectsApiTest {

    private static ProjectsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ProjectsApi(apiClient);
    }

    /**
     * Archive project
     *
     * Archives a project. You can&#39;t delete a project if it&#39;s archived. To delete an archived project, restore the project and then delete it. To restore a project, use the Jira UI.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void archiveProjectTest() throws ApiException {
        String projectIdOrKey = null;
        Object response = api.archiveProject(projectIdOrKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Create project
     *
     * Creates a project based on a project type template, as shown in the following table:  | Project Type Key | Project Template Key |   |--|--|   | &#x60;business&#x60; | &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-content-management&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-process-control&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-procurement&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-project-management&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-task-tracking&#x60; |   | &#x60;service_desk&#x60; | &#x60;com.atlassian.servicedesk:simplified-it-service-management&#x60;, &#x60;com.atlassian.servicedesk:simplified-general-service-desk-it&#x60;, &#x60;com.atlassian.servicedesk:simplified-general-service-desk-business&#x60;, &#x60;com.atlassian.servicedesk:simplified-external-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-hr-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-facilities-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-legal-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-analytics-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-marketing-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-design-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-sales-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-blank-project-business&#x60;, &#x60;com.atlassian.servicedesk:simplified-blank-project-it&#x60;, &#x60;com.atlassian.servicedesk:simplified-finance-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-it-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-hr-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-legal-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-marketing-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-facilities-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-general-it-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-general-business-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-analytics-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-finance-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-design-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-sales-service-desk&#x60; |   | &#x60;software&#x60; | &#x60;com.pyxis.greenhopper.jira:gh-simplified-agility-kanban&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-agility-scrum&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-basic&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-kanban-classic&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-scrum-classic&#x60; |   The project types are available according to the installed Jira features as follows:   *  Jira Core, the default, enables &#x60;business&#x60; projects.  *  Jira Service Management enables &#x60;service_desk&#x60; projects.  *  Jira Software enables &#x60;software&#x60; projects.  To determine which features are installed, go to **Jira settings** &gt; **Apps** &gt; **Manage apps** and review the System Apps list. To add Jira Software or Jira Service Management into a JIRA instance, use **Jira settings** &gt; **Apps** &gt; **Finding new apps**. For more information, see [Managing add-ons](https://confluence.atlassian.com/x/S31NLg).  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectBasedOnTemplateTest() throws ApiException {
        String key = null;
        String name = null;
        String description = null;
        String assigneeType = null;
        Long avatarId = null;
        Long categoryId = null;
        Long fieldConfigurationScheme = null;
        Long issueSecurityScheme = null;
        Long issueTypeScheme = null;
        Long issueTypeScreenScheme = null;
        String lead = null;
        String leadAccountId = null;
        Long notificationScheme = null;
        Long permissionScheme = null;
        String projectTemplateKey = null;
        String projectTypeKey = null;
        String url = null;
        Long workflowScheme = null;
        ProjectIdentifiers response = api.createProjectBasedOnTemplate(key, name)
                .description(description)
                .assigneeType(assigneeType)
                .avatarId(avatarId)
                .categoryId(categoryId)
                .fieldConfigurationScheme(fieldConfigurationScheme)
                .issueSecurityScheme(issueSecurityScheme)
                .issueTypeScheme(issueTypeScheme)
                .issueTypeScreenScheme(issueTypeScreenScheme)
                .lead(lead)
                .leadAccountId(leadAccountId)
                .notificationScheme(notificationScheme)
                .permissionScheme(permissionScheme)
                .projectTemplateKey(projectTemplateKey)
                .projectTypeKey(projectTypeKey)
                .url(url)
                .workflowScheme(workflowScheme)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete project asynchronously
     *
     * Deletes a project asynchronously.  This operation is:   *  transactional, that is, if part of the delete fails the project is not deleted.  *  [asynchronous](https://dac-static.atlassian.com). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](https://dac-static.atlassian.com) to obtain subsequent updates.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectAsyncTest() throws ApiException {
        String projectIdOrKey = null;
        api.deleteProjectAsync(projectIdOrKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete project
     *
     * Deletes a project.  You can&#39;t delete a project if it&#39;s archived. To delete an archived project, restore the project and then delete it. To restore a project, use the Jira UI.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectByIdOrKeyTest() throws ApiException {
        String projectIdOrKey = null;
        Boolean enableUndo = null;
        api.deleteProjectByIdOrKey(projectIdOrKey)
                .enableUndo(enableUndo)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all projects
     *
     * Returns all projects visible to the user. Deprecated, use [Get projects paginated](https://dac-static.atlassian.com) that supports search and pagination.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Projects are returned only where the user has *Browse Projects* or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        String expand = null;
        Integer recent = null;
        List<String> properties = null;
        List<Project> response = api.getAll()
                .expand(expand)
                .recent(recent)
                .properties(properties)
                .execute();
        // TODO: test validations
    }

    /**
     * Get project issue type hierarchy
     *
     * Get the issue type hierarchy for a next-gen project.  The issue type hierarchy for a project consists of:   *  *Epic* at level 1 (optional).  *  One or more issue types at level 0 such as *Story*, *Task*, or *Bug*. Where the issue type *Epic* is defined, these issue types are used to break down the content of an epic.  *  *Subtask* at level -1 (optional). This issue type enables level 0 issue types to be broken down into components. Issues based on a level -1 issue type must have a parent issue.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIssueTypeHierarchyTest() throws ApiException {
        Long projectId = null;
        ProjectIssueTypeHierarchy response = api.getIssueTypeHierarchy(projectId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get project notification scheme
     *
     * Gets a [notification scheme](https://confluence.atlassian.com/x/8YdKLg) associated with the project.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNotificationSchemeTest() throws ApiException {
        String projectKeyOrId = null;
        String expand = null;
        NotificationScheme response = api.getNotificationScheme(projectKeyOrId)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Get project
     *
     * Returns the [project details](https://confluence.atlassian.com/x/ahLpNw) for a project.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectDetailsByIdOrKeyTest() throws ApiException {
        String projectIdOrKey = null;
        String expand = null;
        List<String> properties = null;
        Project response = api.getProjectDetailsByIdOrKey(projectIdOrKey)
                .expand(expand)
                .properties(properties)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all statuses for project
     *
     * Returns the valid statuses for a project. The statuses are grouped by issue type, as each project has a set of valid issue types and each issue type has a set of valid statuses.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatusesForProjectTest() throws ApiException {
        String projectIdOrKey = null;
        List<IssueTypeWithStatus> response = api.getStatusesForProject(projectIdOrKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Get recent projects
     *
     * Returns a list of up to 20 projects recently viewed by the user that are still visible to the user.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Projects are returned only where the user has one of:   *  *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listRecentProjectsTest() throws ApiException {
        String expand = null;
        List<Object> properties = null;
        List<Project> response = api.listRecentProjects()
                .expand(expand)
                .properties(properties)
                .execute();
        // TODO: test validations
    }

    /**
     * Get projects paginated
     *
     * Returns a [paginated](https://dac-static.atlassian.com) list of projects visible to the user.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Projects are returned only where the user has one of:   *  *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listVisibleProjectsTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        String orderBy = null;
        Set<Long> id = null;
        Set<String> keys = null;
        String query = null;
        String typeKey = null;
        Long categoryId = null;
        String action = null;
        String expand = null;
        List<String> status = null;
        List<Object> properties = null;
        String propertyQuery = null;
        PageBeanProject response = api.listVisibleProjects()
                .startAt(startAt)
                .maxResults(maxResults)
                .orderBy(orderBy)
                .id(id)
                .keys(keys)
                .query(query)
                .typeKey(typeKey)
                .categoryId(categoryId)
                .action(action)
                .expand(expand)
                .status(status)
                .properties(properties)
                .propertyQuery(propertyQuery)
                .execute();
        // TODO: test validations
    }

    /**
     * Restore deleted or archived project
     *
     * Restores a project that has been archived or placed in the Jira recycle bin.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg)for Company managed projects.  *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project for Team managed projects.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void restoreProjectTest() throws ApiException {
        String projectIdOrKey = null;
        Project response = api.restoreProject(projectIdOrKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Update project
     *
     * Updates the [project details](https://confluence.atlassian.com/x/ahLpNw) of a project.  All parameters are optional in the body of the request. Schemes will only be updated if they are included in the request, any omitted schemes will be left unchanged.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). is only needed when changing the schemes or project key. Otherwise you will only need *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProjectDetailsTest() throws ApiException {
        String projectIdOrKey = null;
        String description = null;
        String assigneeType = null;
        Long avatarId = null;
        Long categoryId = null;
        Long issueSecurityScheme = null;
        String key = null;
        String lead = null;
        String leadAccountId = null;
        String name = null;
        Long notificationScheme = null;
        Long permissionScheme = null;
        String url = null;
        String expand = null;
        Project response = api.updateProjectDetails(projectIdOrKey)
                .description(description)
                .assigneeType(assigneeType)
                .avatarId(avatarId)
                .categoryId(categoryId)
                .issueSecurityScheme(issueSecurityScheme)
                .key(key)
                .lead(lead)
                .leadAccountId(leadAccountId)
                .name(name)
                .notificationScheme(notificationScheme)
                .permissionScheme(permissionScheme)
                .url(url)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

}
