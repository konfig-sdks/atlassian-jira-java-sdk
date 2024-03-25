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
import com.konfigthis.client.model.AddGroupBean;
import com.konfigthis.client.model.FoundGroups;
import com.konfigthis.client.model.Group;
import com.konfigthis.client.model.PageBeanGroupDetails;
import com.konfigthis.client.model.PageBeanUserDetails;
import java.util.Set;
import com.konfigthis.client.model.UpdateUserToGroupBean;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
@Disabled
public class GroupsApiTest {

    private static GroupsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GroupsApi(apiClient);
    }

    /**
     * Add user to group
     *
     * Adds a user to a group.  **[Permissions](https://dac-static.atlassian.com) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addUserToGroupTest() throws ApiException {
        String accountId = null;
        String name = null;
        String groupname = null;
        String groupId = null;
        Group response = api.addUserToGroup()
                .accountId(accountId)
                .name(name)
                .groupname(groupname)
                .groupId(groupId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create group
     *
     * Creates a group.  **[Permissions](https://dac-static.atlassian.com) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createGroupTest() throws ApiException {
        String name = null;
        Group response = api.createGroup(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Find groups
     *
     * Returns a list of groups whose names contain a query string. A list of group names can be provided to exclude groups from the results.  The primary use case for this resource is to populate a group picker suggestions list. To this end, the returned object includes the &#x60;html&#x60; field where the matched query term is highlighted in the group name with the HTML strong tag. Also, the groups list is wrapped in a response object that contains a header for use in the picker, specifically *Showing X of Y matching groups*.  The list returns with the groups sorted. If no groups match the list criteria, an empty list is returned.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg). Anonymous calls and calls by users without the required permission return an empty list.  *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Without this permission, calls where query is not an exact match to an existing group will return an empty list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findMatchingGroupsTest() throws ApiException {
        String accountId = null;
        String query = null;
        List<String> exclude = null;
        List<String> excludeId = null;
        Integer maxResults = null;
        Boolean caseInsensitive = null;
        String userName = null;
        FoundGroups response = api.findMatchingGroups()
                .accountId(accountId)
                .query(query)
                .exclude(exclude)
                .excludeId(excludeId)
                .maxResults(maxResults)
                .caseInsensitive(caseInsensitive)
                .userName(userName)
                .execute();
        // TODO: test validations
    }

    /**
     * Get group
     *
     * This operation is deprecated, use [&#x60;group/member&#x60;](https://dac-static.atlassian.com).  Returns all users in a group.  **[Permissions](https://dac-static.atlassian.com) required:** either of:   *  *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupMembersTest() throws ApiException {
        String groupname = null;
        String groupId = null;
        String expand = null;
        Group response = api.getGroupMembers()
                .groupname(groupname)
                .groupId(groupId)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Get users from group
     *
     * Returns a [paginated](https://dac-static.atlassian.com) list of all users in a group.  Note that users are ordered by username, however the username is not returned in the results due to privacy reasons.  **[Permissions](https://dac-static.atlassian.com) required:** either of:   *  *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupMembers_0Test() throws ApiException {
        String groupname = null;
        String groupId = null;
        Boolean includeInactiveUsers = null;
        Long startAt = null;
        Integer maxResults = null;
        PageBeanUserDetails response = api.getGroupMembers_0()
                .groupname(groupname)
                .groupId(groupId)
                .includeInactiveUsers(includeInactiveUsers)
                .startAt(startAt)
                .maxResults(maxResults)
                .execute();
        // TODO: test validations
    }

    /**
     * Bulk get groups
     *
     * Returns a [paginated](https://dac-static.atlassian.com) list of groups.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPaginatedListTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        Set<String> groupId = null;
        Set<String> groupName = null;
        String accessType = null;
        String applicationKey = null;
        PageBeanGroupDetails response = api.getPaginatedList()
                .startAt(startAt)
                .maxResults(maxResults)
                .groupId(groupId)
                .groupName(groupName)
                .accessType(accessType)
                .applicationKey(applicationKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove group
     *
     * Deletes a group.  **[Permissions](https://dac-static.atlassian.com) required:** Site administration (that is, member of the *site-admin* strategic [group](https://confluence.atlassian.com/x/24xjL)).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeGroupTest() throws ApiException {
        String groupname = null;
        String groupId = null;
        String swapGroup = null;
        String swapGroupId = null;
        api.removeGroup()
                .groupname(groupname)
                .groupId(groupId)
                .swapGroup(swapGroup)
                .swapGroupId(swapGroupId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove user from group
     *
     * Removes a user from a group.  **[Permissions](https://dac-static.atlassian.com) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeUserFromGroupTest() throws ApiException {
        String accountId = null;
        String groupname = null;
        String groupId = null;
        String username = null;
        api.removeUserFromGroup(accountId)
                .groupname(groupname)
                .groupId(groupId)
                .username(username)
                .execute();
        // TODO: test validations
    }

}