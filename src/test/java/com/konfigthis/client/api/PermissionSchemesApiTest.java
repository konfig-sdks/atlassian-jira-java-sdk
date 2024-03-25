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
import com.konfigthis.client.model.PermissionGrant;
import com.konfigthis.client.model.PermissionGrants;
import com.konfigthis.client.model.PermissionHolder;
import com.konfigthis.client.model.PermissionScheme;
import com.konfigthis.client.model.PermissionSchemes;
import com.konfigthis.client.model.Scope;
import java.net.URI;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PermissionSchemesApi
 */
@Disabled
public class PermissionSchemesApiTest {

    private static PermissionSchemesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PermissionSchemesApi(apiClient);
    }

    /**
     * Create permission grant
     *
     * Creates a permission grant in a permission scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPermissionGrantTest() throws ApiException {
        Long schemeId = null;
        PermissionHolder holder = null;
        Long id = null;
        String permission = null;
        URI self = null;
        String expand = null;
        PermissionGrant response = api.createPermissionGrant(schemeId)
                .holder(holder)
                .id(id)
                .permission(permission)
                .self(self)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Create permission scheme
     *
     * Creates a new permission scheme. You can create a permission scheme with or without defining a set of permission grants.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSchemeTest() throws ApiException {
        String name = null;
        String description = null;
        String expand = null;
        Long id = null;
        List<PermissionGrant> permissions = null;
        Scope scope = null;
        URI self = null;
        String expand = null;
        PermissionScheme response = api.createScheme(name)
                .description(description)
                .expand(expand)
                .id(id)
                .permissions(permissions)
                .scope(scope)
                .self(self)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete permission scheme grant
     *
     * Deletes a permission grant from a permission scheme. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more details.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePermissionGrantTest() throws ApiException {
        Long schemeId = null;
        Long permissionId = null;
        api.deletePermissionGrant(schemeId, permissionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete permission scheme
     *
     * Deletes a permission scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSchemeTest() throws ApiException {
        Long schemeId = null;
        api.deleteScheme(schemeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all permission schemes
     *
     * Returns all permission schemes.  ### About permission schemes and grants ###  A permission scheme is a collection of permission grants. A permission grant consists of a &#x60;holder&#x60; and a &#x60;permission&#x60;.  #### Holder object ####  The &#x60;holder&#x60; object contains information about the user or group being granted the permission. For example, the *Administer projects* permission is granted to a group named *Teams in space administrators*. In this case, the type is &#x60;\&quot;type\&quot;: \&quot;group\&quot;&#x60;, and the parameter is the group name, &#x60;\&quot;parameter\&quot;: \&quot;Teams in space administrators\&quot;&#x60; and the value is group ID, &#x60;\&quot;value\&quot;: \&quot;ca85fac0-d974-40ca-a615-7af99c48d24f\&quot;&#x60;.  The &#x60;holder&#x60; object is defined by the following properties:   *  &#x60;type&#x60; Identifies the user or group (see the list of types below).  *  &#x60;parameter&#x60; As a group&#39;s name can change, use of &#x60;value&#x60; is recommended. The value of this property depends on the &#x60;type&#x60;. For example, if the &#x60;type&#x60; is a group, then you need to specify the group name.  *  &#x60;value&#x60; The value of this property depends on the &#x60;type&#x60;. If the &#x60;type&#x60; is a group, then you need to specify the group ID. For other &#x60;type&#x60; it has the same value as &#x60;parameter&#x60;  The following &#x60;types&#x60; are available. The expected values for &#x60;parameter&#x60; and &#x60;value&#x60; are given in parentheses (some types may not have a &#x60;parameter&#x60; or &#x60;value&#x60;):   *  &#x60;anyone&#x60; Grant for anonymous users.  *  &#x60;applicationRole&#x60; Grant for users with access to the specified application (application name, application name). See [Update product access settings](https://confluence.atlassian.com/x/3YxjL) for more information.  *  &#x60;assignee&#x60; Grant for the user currently assigned to an issue.  *  &#x60;group&#x60; Grant for the specified group (&#x60;parameter&#x60; : group name, &#x60;value&#x60; : group ID).  *  &#x60;groupCustomField&#x60; Grant for a user in the group selected in the specified custom field (&#x60;parameter&#x60; : custom field ID, &#x60;value&#x60; : custom field ID).  *  &#x60;projectLead&#x60; Grant for a project lead.  *  &#x60;projectRole&#x60; Grant for the specified project role (&#x60;parameter&#x60; :project role ID, &#x60;value&#x60; : project role ID).  *  &#x60;reporter&#x60; Grant for the user who reported the issue.  *  &#x60;sd.customer.portal.only&#x60; Jira Service Desk only. Grants customers permission to access the customer portal but not Jira. See [Customizing Jira Service Desk permissions](https://confluence.atlassian.com/x/24dKLg) for more information.  *  &#x60;user&#x60; Grant for the specified user (&#x60;parameter&#x60; : user ID - historically this was the userkey but that is deprecated and the account ID should be used, &#x60;value&#x60; : user ID).  *  &#x60;userCustomField&#x60; Grant for a user selected in the specified custom field (&#x60;parameter&#x60; : custom field ID, &#x60;value&#x60; : custom field ID).  #### Built-in permissions ####  The [built-in Jira permissions](https://confluence.atlassian.com/x/yodKLg) are listed below. Apps can also define custom permissions. See the [project permission](https://developer.atlassian.com/cloud/jira/platform/modules/project-permission/) and [global permission](https://developer.atlassian.com/cloud/jira/platform/modules/global-permission/) module documentation for more information.  **Project permissions**   *  &#x60;ADMINISTER_PROJECTS&#x60;  *  &#x60;BROWSE_PROJECTS&#x60;  *  &#x60;MANAGE_SPRINTS_PERMISSION&#x60; (Jira Software only)  *  &#x60;SERVICEDESK_AGENT&#x60; (Jira Service Desk only)  *  &#x60;VIEW_DEV_TOOLS&#x60; (Jira Software only)  *  &#x60;VIEW_READONLY_WORKFLOW&#x60;  **Issue permissions**   *  &#x60;ASSIGNABLE_USER&#x60;  *  &#x60;ASSIGN_ISSUES&#x60;  *  &#x60;CLOSE_ISSUES&#x60;  *  &#x60;CREATE_ISSUES&#x60;  *  &#x60;DELETE_ISSUES&#x60;  *  &#x60;EDIT_ISSUES&#x60;  *  &#x60;LINK_ISSUES&#x60;  *  &#x60;MODIFY_REPORTER&#x60;  *  &#x60;MOVE_ISSUES&#x60;  *  &#x60;RESOLVE_ISSUES&#x60;  *  &#x60;SCHEDULE_ISSUES&#x60;  *  &#x60;SET_ISSUE_SECURITY&#x60;  *  &#x60;TRANSITION_ISSUES&#x60;  **Voters and watchers permissions**   *  &#x60;MANAGE_WATCHERS&#x60;  *  &#x60;VIEW_VOTERS_AND_WATCHERS&#x60;  **Comments permissions**   *  &#x60;ADD_COMMENTS&#x60;  *  &#x60;DELETE_ALL_COMMENTS&#x60;  *  &#x60;DELETE_OWN_COMMENTS&#x60;  *  &#x60;EDIT_ALL_COMMENTS&#x60;  *  &#x60;EDIT_OWN_COMMENTS&#x60;  **Attachments permissions**   *  &#x60;CREATE_ATTACHMENTS&#x60;  *  &#x60;DELETE_ALL_ATTACHMENTS&#x60;  *  &#x60;DELETE_OWN_ATTACHMENTS&#x60;  **Time tracking permissions**   *  &#x60;DELETE_ALL_WORKLOGS&#x60;  *  &#x60;DELETE_OWN_WORKLOGS&#x60;  *  &#x60;EDIT_ALL_WORKLOGS&#x60;  *  &#x60;EDIT_OWN_WORKLOGS&#x60;  *  &#x60;WORK_ON_ISSUES&#x60;  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        String expand = null;
        PermissionSchemes response = api.getAll()
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Get permission scheme grants
     *
     * Returns all permission grants for a permission scheme.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllGrantsTest() throws ApiException {
        Long schemeId = null;
        String expand = null;
        PermissionGrants response = api.getAllGrants(schemeId)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Get permission scheme grant
     *
     * Returns a permission grant.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPermissionSchemeGrantTest() throws ApiException {
        Long schemeId = null;
        Long permissionId = null;
        String expand = null;
        PermissionGrant response = api.getPermissionSchemeGrant(schemeId, permissionId)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Get permission scheme
     *
     * Returns a permission scheme.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSchemeTest() throws ApiException {
        Long schemeId = null;
        String expand = null;
        PermissionScheme response = api.getScheme(schemeId)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Update permission scheme
     *
     * Updates a permission scheme. Below are some important things to note when using this resource:   *  If a permissions list is present in the request, then it is set in the permission scheme, overwriting *all existing* grants.  *  If you want to update only the name and description, then do not send a permissions list in the request.  *  Sending an empty list will remove all permission grants from the permission scheme.  If you want to add or delete a permission grant instead of updating the whole list, see [Create permission grant](https://dac-static.atlassian.com) or [Delete permission scheme entity](https://dac-static.atlassian.com).  See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more details.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSchemeTest() throws ApiException {
        String name = null;
        Long schemeId = null;
        String description = null;
        String expand = null;
        Long id = null;
        List<PermissionGrant> permissions = null;
        Scope scope = null;
        URI self = null;
        String expand = null;
        PermissionScheme response = api.updateScheme(name, schemeId)
                .description(description)
                .expand(expand)
                .id(id)
                .permissions(permissions)
                .scope(scope)
                .self(self)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

}
