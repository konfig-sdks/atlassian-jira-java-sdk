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
import com.konfigthis.client.model.CreateUpdateRoleRequestBean;
import com.konfigthis.client.model.ProjectRole;
import com.konfigthis.client.model.ProjectRoleDetails;
import java.net.URI;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectRolesApi
 */
@Disabled
public class ProjectRolesApiTest {

    private static ProjectRolesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ProjectRolesApi(apiClient);
    }

    /**
     * Create project role
     *
     * Creates a new project role with no [default actors](https://dac-static.atlassian.com). You can use the [Add default actors to project role](https://dac-static.atlassian.com) operation to add default actors to the project role after creating it.  *Note that although a new project role is available to all projects upon creation, any default actors that are associated with the project role are not added to projects that existed prior to the role being created.*&lt;  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRoleTest() throws ApiException {
        String description = null;
        String name = null;
        ProjectRole response = api.createRole()
                .description(description)
                .name(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete project role
     *
     * Deletes a project role. You must specify a replacement project role if you wish to delete a project role that is in use.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRoleTest() throws ApiException {
        Long id = null;
        Long swap = null;
        api.deleteRole(id)
                .swap(swap)
                .execute();
        // TODO: test validations
    }

    /**
     * Get project role for project
     *
     * Returns a project role&#39;s details and actors associated with the project. The list of actors is sorted by display name.  To check whether a user belongs to a role based on their group memberships, use [Get user](https://dac-static.atlassian.com) with the &#x60;groups&#x60; expand parameter selected. Then check whether the user keys and groups match with the actors returned for the project.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectRoleDetailsTest() throws ApiException {
        String projectIdOrKey = null;
        Long id = null;
        Boolean excludeInactiveUsers = null;
        ProjectRole response = api.getProjectRoleDetails(projectIdOrKey, id)
                .excludeInactiveUsers(excludeInactiveUsers)
                .execute();
        // TODO: test validations
    }

    /**
     * Get project roles for project
     *
     * Returns a list of [project roles](https://support.atlassian.com/jira-cloud-administration/docs/manage-project-roles/) for the project returning the name and self URL for each role.  Note that all project roles are shared with all projects in Jira Cloud. See [Get all project roles](https://dac-static.atlassian.com) for more information.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for any project on the site or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectRoleListTest() throws ApiException {
        String projectIdOrKey = null;
        Map<String, URI> response = api.getProjectRoleList(projectIdOrKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Get project role by ID
     *
     * Gets the project role details and the default actors associated with the role. The list of default actors is sorted by display name.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRoleByIdTest() throws ApiException {
        Long id = null;
        ProjectRole response = api.getRoleById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get project role details
     *
     * Returns all [project roles](https://support.atlassian.com/jira-cloud-administration/docs/manage-project-roles/) and the details for each role. Note that the list of project roles is common to all projects.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRoleDetailsTest() throws ApiException {
        String projectIdOrKey = null;
        Boolean currentMember = null;
        Boolean excludeConnectAddons = null;
        List<ProjectRoleDetails> response = api.getRoleDetails(projectIdOrKey)
                .currentMember(currentMember)
                .excludeConnectAddons(excludeConnectAddons)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all project roles
     *
     * Gets a list of all project roles, complete with project role details and default actors.  ### About project roles ###  [Project roles](https://support.atlassian.com/jira-cloud-administration/docs/manage-project-roles/) are a flexible way to to associate users and groups with projects. In Jira Cloud, the list of project roles is shared globally with all projects, but each project can have a different set of actors associated with it (unlike groups, which have the same membership throughout all Jira applications).  Project roles are used in [permission schemes](https://dac-static.atlassian.com), [email notification schemes](https://dac-static.atlassian.com), [issue security levels](https://dac-static.atlassian.com), [comment visibility](https://dac-static.atlassian.com), and workflow conditions.  #### Members and actors ####  In the Jira REST API, a member of a project role is called an *actor*. An *actor* is a group or user associated with a project role.  Actors may be set as [default members](https://support.atlassian.com/jira-cloud-administration/docs/manage-project-roles/#Specifying-&#39;default-members&#39;-for-a-project-role) of the project role or set at the project level:   *  Default actors: Users and groups that are assigned to the project role for all newly created projects. The default actors can be removed at the project level later if desired.  *  Actors: Users and groups that are associated with a project role for a project, which may differ from the default actors. This enables you to assign a user to different roles in different projects.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listProjectRolesTest() throws ApiException {
        List<ProjectRole> response = api.listProjectRoles()
                .execute();
        // TODO: test validations
    }

    /**
     * Partial update project role
     *
     * Updates either the project role&#39;s name or its description.  You cannot update both the name and description at the same time using this operation. If you send a request with a name and a description only the name is updated.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void partiallyUpdateRoleTest() throws ApiException {
        Long id = null;
        String description = null;
        String name = null;
        ProjectRole response = api.partiallyUpdateRole(id)
                .description(description)
                .name(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Fully update project role
     *
     * Updates the project role&#39;s name and description. You must include both a name and a description in the request.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRolePropertiesTest() throws ApiException {
        Long id = null;
        String description = null;
        String name = null;
        ProjectRole response = api.updateRoleProperties(id)
                .description(description)
                .name(name)
                .execute();
        // TODO: test validations
    }

}
