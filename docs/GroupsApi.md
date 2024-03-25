# GroupsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addUserToGroup**](GroupsApi.md#addUserToGroup) | **POST** /rest/api/3/group/user | Add user to group |
| [**createGroup**](GroupsApi.md#createGroup) | **POST** /rest/api/3/group | Create group |
| [**findMatchingGroups**](GroupsApi.md#findMatchingGroups) | **GET** /rest/api/3/groups/picker | Find groups |
| [**getGroupMembers**](GroupsApi.md#getGroupMembers) | **GET** /rest/api/3/group | Get group |
| [**getGroupMembers_0**](GroupsApi.md#getGroupMembers_0) | **GET** /rest/api/3/group/member | Get users from group |
| [**getPaginatedList**](GroupsApi.md#getPaginatedList) | **GET** /rest/api/3/group/bulk | Bulk get groups |
| [**removeGroup**](GroupsApi.md#removeGroup) | **DELETE** /rest/api/3/group | Remove group |
| [**removeUserFromGroup**](GroupsApi.md#removeUserFromGroup) | **DELETE** /rest/api/3/group/user | Remove user from group |


<a name="addUserToGroup"></a>
# **addUserToGroup**
> Group addUserToGroup(requestBody).groupname(groupname).groupId(groupId).execute();

Add user to group

Adds a user to a group.  **[Permissions](https://dac-static.atlassian.com) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    AtlassianJira client = new AtlassianJira(configuration);
    String accountId = "accountId_example"; // The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
    String name = "name_example"; // This property is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    String groupname = "groupname_example"; // As a group's name can change, use of `groupId` is recommended to identify a group.   The name of the group. This parameter cannot be used with the `groupId` parameter.
    String groupId = "groupId_example"; // The ID of the group. This parameter cannot be used with the `groupName` parameter.
    try {
      Group result = client
              .groups
              .addUserToGroup()
              .accountId(accountId)
              .name(name)
              .groupname(groupname)
              .groupId(groupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpand());
      System.out.println(result.getGroupId());
      System.out.println(result.getName());
      System.out.println(result.getSelf());
      System.out.println(result.getUsers());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#addUserToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Group> response = client
              .groups
              .addUserToGroup()
              .accountId(accountId)
              .name(name)
              .groupname(groupname)
              .groupId(groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#addUserToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| The user to add to the group. | |
| **groupname** | **String**| As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended to identify a group.   The name of the group. This parameter cannot be used with the &#x60;groupId&#x60; parameter. | [optional] |
| **groupId** | **String**| The ID of the group. This parameter cannot be used with the &#x60;groupName&#x60; parameter. | [optional] |

### Return type

[**Group**](Group.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is successful. |  -  |
| **400** | Returned if:   *  &#x60;groupname&#x60; is not provided.  *  &#x60;accountId&#x60; is missing. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing from the request. |  -  |
| **403** | Returned if the calling user does not have the necessary permission. |  -  |
| **404** | Returned if the group or user are not found. |  -  |

<a name="createGroup"></a>
# **createGroup**
> Group createGroup(requestBody).execute();

Create group

Creates a group.  **[Permissions](https://dac-static.atlassian.com) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    AtlassianJira client = new AtlassianJira(configuration);
    String name = "name_example"; // The name of the group.
    try {
      Group result = client
              .groups
              .createGroup(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpand());
      System.out.println(result.getGroupId());
      System.out.println(result.getName());
      System.out.println(result.getSelf());
      System.out.println(result.getUsers());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Group> response = client
              .groups
              .createGroup(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| The name of the group. | |

### Return type

[**Group**](Group.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is successful. |  -  |
| **400** | Returned if group name is not specified or the group name is in use. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |

<a name="findMatchingGroups"></a>
# **findMatchingGroups**
> FoundGroups findMatchingGroups().accountId(accountId).query(query).exclude(exclude).excludeId(excludeId).maxResults(maxResults).caseInsensitive(caseInsensitive).userName(userName).execute();

Find groups

Returns a list of groups whose names contain a query string. A list of group names can be provided to exclude groups from the results.  The primary use case for this resource is to populate a group picker suggestions list. To this end, the returned object includes the &#x60;html&#x60; field where the matched query term is highlighted in the group name with the HTML strong tag. Also, the groups list is wrapped in a response object that contains a header for use in the picker, specifically *Showing X of Y matching groups*.  The list returns with the groups sorted. If no groups match the list criteria, an empty list is returned.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg). Anonymous calls and calls by users without the required permission return an empty list.  *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Without this permission, calls where query is not an exact match to an existing group will return an empty list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    AtlassianJira client = new AtlassianJira(configuration);
    String accountId = "accountId_example"; // This parameter is deprecated, setting it does not affect the results. To find groups containing a particular user, use [Get user groups](https://dac-static.atlassian.com).
    String query = "query"; // The string to find in group names.
    List<String> exclude = Arrays.asList(); // As a group's name can change, use of `excludeGroupIds` is recommended to identify a group.   A group to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, `exclude=group1&exclude=group2`. This parameter cannot be used with the `excludeGroupIds` parameter.
    List<String> excludeId = Arrays.asList(); // A group ID to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, `excludeId=group1-id&excludeId=group2-id`. This parameter cannot be used with the `excludeGroups` parameter.
    Integer maxResults = 56; // The maximum number of groups to return. The maximum number of groups that can be returned is limited by the system property `jira.ajax.autocomplete.limit`.
    Boolean caseInsensitive = false; // Whether the search for groups should be case insensitive.
    String userName = "userName_example"; // This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    try {
      FoundGroups result = client
              .groups
              .findMatchingGroups()
              .accountId(accountId)
              .query(query)
              .exclude(exclude)
              .excludeId(excludeId)
              .maxResults(maxResults)
              .caseInsensitive(caseInsensitive)
              .userName(userName)
              .execute();
      System.out.println(result);
      System.out.println(result.getGroups());
      System.out.println(result.getHeader());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#findMatchingGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FoundGroups> response = client
              .groups
              .findMatchingGroups()
              .accountId(accountId)
              .query(query)
              .exclude(exclude)
              .excludeId(excludeId)
              .maxResults(maxResults)
              .caseInsensitive(caseInsensitive)
              .userName(userName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#findMatchingGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| This parameter is deprecated, setting it does not affect the results. To find groups containing a particular user, use [Get user groups](https://dac-static.atlassian.com). | [optional] |
| **query** | **String**| The string to find in group names. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| As a group&#39;s name can change, use of &#x60;excludeGroupIds&#x60; is recommended to identify a group.   A group to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, &#x60;exclude&#x3D;group1&amp;exclude&#x3D;group2&#x60;. This parameter cannot be used with the &#x60;excludeGroupIds&#x60; parameter. | [optional] |
| **excludeId** | [**List&lt;String&gt;**](String.md)| A group ID to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, &#x60;excludeId&#x3D;group1-id&amp;excludeId&#x3D;group2-id&#x60;. This parameter cannot be used with the &#x60;excludeGroups&#x60; parameter. | [optional] |
| **maxResults** | **Integer**| The maximum number of groups to return. The maximum number of groups that can be returned is limited by the system property &#x60;jira.ajax.autocomplete.limit&#x60;. | [optional] |
| **caseInsensitive** | **Boolean**| Whether the search for groups should be case insensitive. | [optional] [default to false] |
| **userName** | **String**| This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional] |

### Return type

[**FoundGroups**](FoundGroups.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="getGroupMembers"></a>
# **getGroupMembers**
> Group getGroupMembers().groupname(groupname).groupId(groupId).expand(expand).execute();

Get group

This operation is deprecated, use [&#x60;group/member&#x60;](https://dac-static.atlassian.com).  Returns all users in a group.  **[Permissions](https://dac-static.atlassian.com) required:** either of:   *  *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    AtlassianJira client = new AtlassianJira(configuration);
    String groupname = "groupname_example"; // As a group's name can change, use of `groupId` is recommended to identify a group.   The name of the group. This parameter cannot be used with the `groupId` parameter.
    String groupId = "groupId_example"; // The ID of the group. This parameter cannot be used with the `groupName` parameter.
    String expand = "expand_example"; // List of fields to expand.
    try {
      Group result = client
              .groups
              .getGroupMembers()
              .groupname(groupname)
              .groupId(groupId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpand());
      System.out.println(result.getGroupId());
      System.out.println(result.getName());
      System.out.println(result.getSelf());
      System.out.println(result.getUsers());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupMembers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Group> response = client
              .groups
              .getGroupMembers()
              .groupname(groupname)
              .groupId(groupId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupMembers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupname** | **String**| As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended to identify a group.   The name of the group. This parameter cannot be used with the &#x60;groupId&#x60; parameter. | [optional] |
| **groupId** | **String**| The ID of the group. This parameter cannot be used with the &#x60;groupName&#x60; parameter. | [optional] |
| **expand** | **String**| List of fields to expand. | [optional] |

### Return type

[**Group**](Group.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the group name is not specified. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the calling user does not have the Administer Jira global permission. |  -  |
| **404** | Returned if the group is not found. |  -  |

<a name="getGroupMembers_0"></a>
# **getGroupMembers_0**
> PageBeanUserDetails getGroupMembers_0().groupname(groupname).groupId(groupId).includeInactiveUsers(includeInactiveUsers).startAt(startAt).maxResults(maxResults).execute();

Get users from group

Returns a [paginated](https://dac-static.atlassian.com) list of all users in a group.  Note that users are ordered by username, however the username is not returned in the results due to privacy reasons.  **[Permissions](https://dac-static.atlassian.com) required:** either of:   *  *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    AtlassianJira client = new AtlassianJira(configuration);
    String groupname = "groupname_example"; // As a group's name can change, use of `groupId` is recommended to identify a group.   The name of the group. This parameter cannot be used with the `groupId` parameter.
    String groupId = "groupId_example"; // The ID of the group. This parameter cannot be used with the `groupName` parameter.
    Boolean includeInactiveUsers = false; // Include inactive users.
    Long startAt = 0L; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // The maximum number of items to return per page.
    try {
      PageBeanUserDetails result = client
              .groups
              .getGroupMembers_0()
              .groupname(groupname)
              .groupId(groupId)
              .includeInactiveUsers(includeInactiveUsers)
              .startAt(startAt)
              .maxResults(maxResults)
              .execute();
      System.out.println(result);
      System.out.println(result.getIsLast());
      System.out.println(result.getMaxResults());
      System.out.println(result.getNextPage());
      System.out.println(result.getSelf());
      System.out.println(result.getStartAt());
      System.out.println(result.getTotal());
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupMembers_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanUserDetails> response = client
              .groups
              .getGroupMembers_0()
              .groupname(groupname)
              .groupId(groupId)
              .includeInactiveUsers(includeInactiveUsers)
              .startAt(startAt)
              .maxResults(maxResults)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupMembers_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupname** | **String**| As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended to identify a group.   The name of the group. This parameter cannot be used with the &#x60;groupId&#x60; parameter. | [optional] |
| **groupId** | **String**| The ID of the group. This parameter cannot be used with the &#x60;groupName&#x60; parameter. | [optional] |
| **includeInactiveUsers** | **Boolean**| Include inactive users. | [optional] [default to false] |
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |

### Return type

[**PageBeanUserDetails**](PageBeanUserDetails.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the group name is not specified. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the calling user does not have the Administer Jira global permission. |  -  |
| **404** | Returned if the group is not found. |  -  |

<a name="getPaginatedList"></a>
# **getPaginatedList**
> PageBeanGroupDetails getPaginatedList().startAt(startAt).maxResults(maxResults).groupId(groupId).groupName(groupName).accessType(accessType).applicationKey(applicationKey).execute();

Bulk get groups

Returns a [paginated](https://dac-static.atlassian.com) list of groups.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    AtlassianJira client = new AtlassianJira(configuration);
    Long startAt = 0L; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // The maximum number of items to return per page.
    Set<String> groupId = Arrays.asList(""""); // The ID of a group. To specify multiple IDs, pass multiple `groupId` parameters. For example, `groupId=5b10a2844c20165700ede21g&groupId=5b10ac8d82e05b22cc7d4ef5`.
    Set<String> groupName = Arrays.asList(""""); // The name of a group. To specify multiple names, pass multiple `groupName` parameters. For example, `groupName=administrators&groupName=jira-software-users`.
    String accessType = "accessType_example"; // The access level of a group. Valid values: 'site-admin', 'admin', 'user'.
    String applicationKey = "applicationKey_example"; // The application key of the product user groups to search for. Valid values: 'jira-servicedesk', 'jira-software', 'jira-product-discovery', 'jira-core'.
    try {
      PageBeanGroupDetails result = client
              .groups
              .getPaginatedList()
              .startAt(startAt)
              .maxResults(maxResults)
              .groupId(groupId)
              .groupName(groupName)
              .accessType(accessType)
              .applicationKey(applicationKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getIsLast());
      System.out.println(result.getMaxResults());
      System.out.println(result.getNextPage());
      System.out.println(result.getSelf());
      System.out.println(result.getStartAt());
      System.out.println(result.getTotal());
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getPaginatedList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanGroupDetails> response = client
              .groups
              .getPaginatedList()
              .startAt(startAt)
              .maxResults(maxResults)
              .groupId(groupId)
              .groupName(groupName)
              .accessType(accessType)
              .applicationKey(applicationKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getPaginatedList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |
| **groupId** | [**Set&lt;String&gt;**](String.md)| The ID of a group. To specify multiple IDs, pass multiple &#x60;groupId&#x60; parameters. For example, &#x60;groupId&#x3D;5b10a2844c20165700ede21g&amp;groupId&#x3D;5b10ac8d82e05b22cc7d4ef5&#x60;. | [optional] |
| **groupName** | [**Set&lt;String&gt;**](String.md)| The name of a group. To specify multiple names, pass multiple &#x60;groupName&#x60; parameters. For example, &#x60;groupName&#x3D;administrators&amp;groupName&#x3D;jira-software-users&#x60;. | [optional] |
| **accessType** | **String**| The access level of a group. Valid values: &#39;site-admin&#39;, &#39;admin&#39;, &#39;user&#39;. | [optional] |
| **applicationKey** | **String**| The application key of the product user groups to search for. Valid values: &#39;jira-servicedesk&#39;, &#39;jira-software&#39;, &#39;jira-product-discovery&#39;, &#39;jira-core&#39;. | [optional] |

### Return type

[**PageBeanGroupDetails**](PageBeanGroupDetails.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="removeGroup"></a>
# **removeGroup**
> removeGroup().groupname(groupname).groupId(groupId).swapGroup(swapGroup).swapGroupId(swapGroupId).execute();

Remove group

Deletes a group.  **[Permissions](https://dac-static.atlassian.com) required:** Site administration (that is, member of the *site-admin* strategic [group](https://confluence.atlassian.com/x/24xjL)).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    AtlassianJira client = new AtlassianJira(configuration);
    String groupname = "groupname_example";
    String groupId = "groupId_example"; // The ID of the group. This parameter cannot be used with the `groupname` parameter.
    String swapGroup = "swapGroup_example"; // As a group's name can change, use of `swapGroupId` is recommended to identify a group.   The group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. This parameter cannot be used with the `swapGroupId` parameter.
    String swapGroupId = "swapGroupId_example"; // The ID of the group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. This parameter cannot be used with the `swapGroup` parameter.
    try {
      client
              .groups
              .removeGroup()
              .groupname(groupname)
              .groupId(groupId)
              .swapGroup(swapGroup)
              .swapGroupId(swapGroupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#removeGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .groups
              .removeGroup()
              .groupname(groupname)
              .groupId(groupId)
              .swapGroup(swapGroup)
              .swapGroupId(swapGroupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#removeGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupname** | **String**|  | [optional] |
| **groupId** | **String**| The ID of the group. This parameter cannot be used with the &#x60;groupname&#x60; parameter. | [optional] |
| **swapGroup** | **String**| As a group&#39;s name can change, use of &#x60;swapGroupId&#x60; is recommended to identify a group.   The group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. This parameter cannot be used with the &#x60;swapGroupId&#x60; parameter. | [optional] |
| **swapGroupId** | **String**| The ID of the group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. This parameter cannot be used with the &#x60;swapGroup&#x60; parameter. | [optional] |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the group name is not specified. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing from the request. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the group is not found. |  -  |

<a name="removeUserFromGroup"></a>
# **removeUserFromGroup**
> removeUserFromGroup(accountId).groupname(groupname).groupId(groupId).username(username).execute();

Remove user from group

Removes a user from a group.  **[Permissions](https://dac-static.atlassian.com) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    AtlassianJira client = new AtlassianJira(configuration);
    String accountId = "5b10ac8d82e05b22cc7d4ef5"; // The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
    String groupname = "groupname_example"; // As a group's name can change, use of `groupId` is recommended to identify a group.   The name of the group. This parameter cannot be used with the `groupId` parameter.
    String groupId = "groupId_example"; // The ID of the group. This parameter cannot be used with the `groupName` parameter.
    String username = "username_example"; // This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    try {
      client
              .groups
              .removeUserFromGroup(accountId)
              .groupname(groupname)
              .groupId(groupId)
              .username(username)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#removeUserFromGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .groups
              .removeUserFromGroup(accountId)
              .groupname(groupname)
              .groupId(groupId)
              .username(username)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#removeUserFromGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. | |
| **groupname** | **String**| As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended to identify a group.   The name of the group. This parameter cannot be used with the &#x60;groupId&#x60; parameter. | [optional] |
| **groupId** | **String**| The ID of the group. This parameter cannot be used with the &#x60;groupName&#x60; parameter. | [optional] |
| **username** | **String**| This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional] |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if:   *  &#x60;groupName&#x60; is missing.  *  &#x60;accountId&#x60; is missing. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing from the request. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the group or user are not found. |  -  |

