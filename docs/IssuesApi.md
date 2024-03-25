# IssuesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archiveByIdsPut**](IssuesApi.md#archiveByIdsPut) | **PUT** /rest/api/3/issue/archive | Archive issue(s) by issue ID/key |
| [**archiveByJqlPost**](IssuesApi.md#archiveByJqlPost) | **POST** /rest/api/3/issue/archive | Archive issue(s) by JQL |
| [**assignIssueToUser**](IssuesApi.md#assignIssueToUser) | **PUT** /rest/api/3/issue/{issueIdOrKey}/assignee | Assign issue |
| [**bulkCreateIssue**](IssuesApi.md#bulkCreateIssue) | **POST** /rest/api/3/issue/bulk | Bulk create issue |
| [**createOrUpdateIssue**](IssuesApi.md#createOrUpdateIssue) | **POST** /rest/api/3/issue | Create issue |
| [**deleteIssueByIdOrKey**](IssuesApi.md#deleteIssueByIdOrKey) | **DELETE** /rest/api/3/issue/{issueIdOrKey} | Delete issue |
| [**editIssueByIdOrKey**](IssuesApi.md#editIssueByIdOrKey) | **PUT** /rest/api/3/issue/{issueIdOrKey} | Edit issue |
| [**exportArchivedIssues**](IssuesApi.md#exportArchivedIssues) | **PUT** /rest/api/3/issues/archive/export | Export archived issue(s) |
| [**getChangelogs**](IssuesApi.md#getChangelogs) | **GET** /rest/api/3/issue/{issueIdOrKey}/changelog | Get changelogs |
| [**getChangelogsByIds**](IssuesApi.md#getChangelogsByIds) | **POST** /rest/api/3/issue/{issueIdOrKey}/changelog/list | Get changelogs by IDs |
| [**getCreateIssueMeta**](IssuesApi.md#getCreateIssueMeta) | **GET** /rest/api/3/issue/createmeta | Get create issue metadata |
| [**getEditMeta**](IssuesApi.md#getEditMeta) | **GET** /rest/api/3/issue/{issueIdOrKey}/editmeta | Get edit issue metadata |
| [**getFieldMetadataForProjectAndIssueType**](IssuesApi.md#getFieldMetadataForProjectAndIssueType) | **GET** /rest/api/3/issue/createmeta/{projectIdOrKey}/issuetypes/{issueTypeId} | Get create field metadata for a project and issue type id |
| [**getIssueDetailsByIdOrKey**](IssuesApi.md#getIssueDetailsByIdOrKey) | **GET** /rest/api/3/issue/{issueIdOrKey} | Get issue |
| [**getMetaIssueTypesForProject**](IssuesApi.md#getMetaIssueTypesForProject) | **GET** /rest/api/3/issue/createmeta/{projectIdOrKey}/issuetypes | Get create metadata issue types for a project |
| [**getTransitions**](IssuesApi.md#getTransitions) | **GET** /rest/api/3/issue/{issueIdOrKey}/transitions | Get transitions |
| [**listAllEvents**](IssuesApi.md#listAllEvents) | **GET** /rest/api/3/events | Get events |
| [**notifyEmail**](IssuesApi.md#notifyEmail) | **POST** /rest/api/3/issue/{issueIdOrKey}/notify | Send notification for issue |
| [**transitionIssue**](IssuesApi.md#transitionIssue) | **POST** /rest/api/3/issue/{issueIdOrKey}/transitions | Transition issue |
| [**unarchiveIssueByIdsPut**](IssuesApi.md#unarchiveIssueByIdsPut) | **PUT** /rest/api/3/issue/unarchive | Unarchive issue(s) by issue keys/ID |


<a name="archiveByIdsPut"></a>
# **archiveByIdsPut**
> IssueArchivalSyncResponse archiveByIdsPut(issueArchivalSyncRequest).execute();

Archive issue(s) by issue ID/key

Enables admins to archive up to 1000 issues in a single request using issue ID/key, returning details of the issue(s) archived in the process and the errors encountered, if any.  **Note that:**   *  you can&#39;t archive subtasks directly, only through their parent issues  *  you can only archive issues from software, service management, and business projects  **[Permissions](https://dac-static.atlassian.com) required:** Jira admin or site admin: [global permission](https://confluence.atlassian.com/x/x4dKLg)  **License required:** Premium or Enterprise  **Signed-in users only:** This API can&#39;t be accessed anonymously.     

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    List<String> issueIdsOrKeys = Arrays.asList();
    try {
      IssueArchivalSyncResponse result = client
              .issues
              .archiveByIdsPut()
              .issueIdsOrKeys(issueIdsOrKeys)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrors());
      System.out.println(result.getNumberOfIssuesUpdated());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#archiveByIdsPut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueArchivalSyncResponse> response = client
              .issues
              .archiveByIdsPut()
              .issueIdsOrKeys(issueIdsOrKeys)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#archiveByIdsPut");
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
| **issueArchivalSyncRequest** | [**IssueArchivalSyncRequest**](IssueArchivalSyncRequest.md)| Contains a list of issue keys or IDs to be archived. | |

### Return type

[**IssueArchivalSyncResponse**](IssueArchivalSyncResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if there is at least one valid issue to archive in the request. The return message will include the count of archived issues and subtasks, as well as error details for issues which failed to get archived. |  -  |

<a name="archiveByJqlPost"></a>
# **archiveByJqlPost**
> String archiveByJqlPost(archiveIssueAsyncRequest).execute();

Archive issue(s) by JQL

Enables admins to archive up to 100,000 issues in a single request using JQL, returning the URL to check the status of the submitted request.  You can use the [get task](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-tasks/#api-rest-api-3-task-taskid-get) and [cancel task](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-tasks/#api-rest-api-3-task-taskid-cancel-post) APIs to manage the request.  **Note that:**   *  you can&#39;t archive subtasks directly, only through their parent issues  *  you can only archive issues from software, service management, and business projects  **[Permissions](https://dac-static.atlassian.com) required:** Jira admin or site admin: [global permission](https://confluence.atlassian.com/x/x4dKLg)  **License required:** Premium or Enterprise  **Signed-in users only:** This API can&#39;t be accessed anonymously.  **Rate limiting:** Only a single request per jira instance can be active at any given time.     

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String jql = "jql_example";
    try {
      String result = client
              .issues
              .archiveByJqlPost()
              .jql(jql)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#archiveByJqlPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .issues
              .archiveByJqlPost()
              .jql(jql)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#archiveByJqlPost");
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
| **archiveIssueAsyncRequest** | [**ArchiveIssueAsyncRequest**](ArchiveIssueAsyncRequest.md)| A JQL query specifying the issues to archive. Note that subtasks can only be archived through their parent issues. | |

### Return type

**String**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns the URL to check the status of the submitted request. |  -  |

<a name="assignIssueToUser"></a>
# **assignIssueToUser**
> Object assignIssueToUser(issueIdOrKey, user).execute();

Assign issue

Assigns an issue to a user. Use this operation when the calling user does not have the *Edit Issues* permission but has the *Assign issue* permission for the project that the issue is in.  If &#x60;name&#x60; or &#x60;accountId&#x60; is set to:   *  &#x60;\&quot;-1\&quot;&#x60;, the issue is assigned to the default assignee for the project.  *  &#x60;null&#x60;, the issue is set to unassigned.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse Projects* and *Assign Issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key of the issue to be assigned.
    String accountId = "accountId_example"; // The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.
    String accountType = "atlassian"; // The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk
    Boolean active = true; // Whether the user is active.
    SimpleListWrapperApplicationRole applicationRoles = new SimpleListWrapperApplicationRole(); // The application roles the user is assigned to.
    AvatarUrlsBean avatarUrls = new AvatarUrlsBean(); // The avatars of the user.
    String displayName = "displayName_example"; // The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
    String emailAddress = "emailAddress_example"; // The email address of the user. Depending on the user’s privacy setting, this may be returned as null.
    String expand = "expand_example"; // Expand options that include additional user details in the response.
    SimpleListWrapperGroupName groups = new SimpleListWrapperGroupName(); // The groups that the user belongs to.
    String key = "key_example"; // This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    String locale = "locale_example"; // The locale of the user. Depending on the user’s privacy setting, this may be returned as null.
    String name = "name_example"; // This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    URI self = new URI(); // The URL of the user.
    String timeZone = "timeZone_example"; // The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null.
    try {
      Object result = client
              .issues
              .assignIssueToUser(issueIdOrKey)
              .accountId(accountId)
              .accountType(accountType)
              .active(active)
              .applicationRoles(applicationRoles)
              .avatarUrls(avatarUrls)
              .displayName(displayName)
              .emailAddress(emailAddress)
              .expand(expand)
              .groups(groups)
              .key(key)
              .locale(locale)
              .name(name)
              .self(self)
              .timeZone(timeZone)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#assignIssueToUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issues
              .assignIssueToUser(issueIdOrKey)
              .accountId(accountId)
              .accountType(accountType)
              .active(active)
              .applicationRoles(applicationRoles)
              .avatarUrls(avatarUrls)
              .displayName(displayName)
              .emailAddress(emailAddress)
              .expand(expand)
              .groups(groups)
              .key(key)
              .locale(locale)
              .name(name)
              .self(self)
              .timeZone(timeZone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#assignIssueToUser");
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
| **issueIdOrKey** | **String**| The ID or key of the issue to be assigned. | |
| **user** | [**User**](User.md)| The request object with the user that the issue is assigned to. | |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the request is successful. |  -  |
| **400** | Returned if:   *  the user is not found.  *  &#x60;name&#x60;, &#x60;key&#x60;, or &#x60;accountId&#x60; is missing.  *  more than one of &#x60;name&#x60;, &#x60;key&#x60;, and &#x60;accountId&#x60; are provided. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the issue is not found. |  -  |

<a name="bulkCreateIssue"></a>
# **bulkCreateIssue**
> CreatedIssues bulkCreateIssue(requestBody).execute();

Bulk create issue

Creates upto **50** issues and, where the option to create subtasks is enabled in Jira, subtasks. Transitions may be applied, to move the issues or subtasks to a workflow step other than the default start step, and issue properties set.  The content of each issue or subtask is defined using &#x60;update&#x60; and &#x60;fields&#x60;. The fields that can be set in the issue or subtask are determined using the [Get create issue metadata](https://dac-static.atlassian.com). These are the same fields that appear on the issues&#39; create screens. Note that the &#x60;description&#x60;, &#x60;environment&#x60;, and any &#x60;textarea&#x60; type custom fields (multi-line text fields) take Atlassian Document Format content. Single line custom fields (&#x60;textfield&#x60;) accept a string and don&#39;t handle Atlassian Document Format content.  Creating a subtask differs from creating an issue as follows:   *  &#x60;issueType&#x60; must be set to a subtask issue type (use [Get create issue metadata](https://dac-static.atlassian.com) to find subtask issue types).  *  &#x60;parent&#x60; the must contain the ID or key of the parent issue.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* and *Create issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project in which each issue or subtask is created.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    List<IssueUpdateDetails> issueUpdates = Arrays.asList();
    try {
      CreatedIssues result = client
              .issues
              .bulkCreateIssue()
              .issueUpdates(issueUpdates)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrors());
      System.out.println(result.getIssues());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#bulkCreateIssue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreatedIssues> response = client
              .issues
              .bulkCreateIssue()
              .issueUpdates(issueUpdates)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#bulkCreateIssue");
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
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |

### Return type

[**CreatedIssues**](CreatedIssues.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if any of the issue or subtask creation requests were successful. A request may be unsuccessful when it:   *  is missing required fields.  *  contains invalid field values.  *  contains fields that cannot be set for the issue type.  *  is by a user who does not have the necessary permission.  *  is to create a subtype in a project different that of the parent issue.  *  is for a subtask when the option to create subtasks is disabled.  *  is invalid for any other reason. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="createOrUpdateIssue"></a>
# **createOrUpdateIssue**
> CreatedIssue createOrUpdateIssue(requestBody).updateHistory(updateHistory).execute();

Create issue

Creates an issue or, where the option to create subtasks is enabled in Jira, a subtask. A transition may be applied, to move the issue or subtask to a workflow step other than the default start step, and issue properties set.  The content of the issue or subtask is defined using &#x60;update&#x60; and &#x60;fields&#x60;. The fields that can be set in the issue or subtask are determined using the [Get create issue metadata](https://dac-static.atlassian.com). These are the same fields that appear on the issue&#39;s create screen. Note that the &#x60;description&#x60;, &#x60;environment&#x60;, and any &#x60;textarea&#x60; type custom fields (multi-line text fields) take Atlassian Document Format content. Single line custom fields (&#x60;textfield&#x60;) accept a string and don&#39;t handle Atlassian Document Format content.  Creating a subtask differs from creating an issue as follows:   *  &#x60;issueType&#x60; must be set to a subtask issue type (use [Get create issue metadata](https://dac-static.atlassian.com) to find subtask issue types).  *  &#x60;parent&#x60; must contain the ID or key of the parent issue.  In a next-gen project any issue may be made a child providing that the parent and child are members of the same project.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* and *Create issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project in which the issue or subtask is created.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    Map<String, Object> fields = new HashMap(); // List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use `update`. Fields included in here cannot be included in `update`.
    HistoryMetadata historyMetadata = new HistoryMetadata();
    List<EntityProperty> properties = Arrays.asList(); // Details of issue properties to be add or update.
    IssueTransition transition = new IssueTransition();
    Map<String, List<FieldUpdateOperation>> update = new HashMap(); // A Map containing the field field name and a list of operations to perform on the issue screen field. Note that fields included in here cannot be included in `fields`.
    Boolean updateHistory = false; // Whether the project in which the issue is created is added to the user's **Recently viewed** project list, as shown under **Projects** in Jira. When provided, the issue type and request type are added to the user's history for a project. These values are then used to provide defaults on the issue create screen.
    try {
      CreatedIssue result = client
              .issues
              .createOrUpdateIssue()
              .fields(fields)
              .historyMetadata(historyMetadata)
              .properties(properties)
              .transition(transition)
              .update(update)
              .updateHistory(updateHistory)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getKey());
      System.out.println(result.getSelf());
      System.out.println(result.getTransition());
      System.out.println(result.getWatchers());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#createOrUpdateIssue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreatedIssue> response = client
              .issues
              .createOrUpdateIssue()
              .fields(fields)
              .historyMetadata(historyMetadata)
              .properties(properties)
              .transition(transition)
              .update(update)
              .updateHistory(updateHistory)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#createOrUpdateIssue");
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
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |
| **updateHistory** | **Boolean**| Whether the project in which the issue is created is added to the user&#39;s **Recently viewed** project list, as shown under **Projects** in Jira. When provided, the issue type and request type are added to the user&#39;s history for a project. These values are then used to provide defaults on the issue create screen. | [optional] [default to false] |

### Return type

[**CreatedIssue**](CreatedIssue.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is successful. |  -  |

<a name="deleteIssueByIdOrKey"></a>
# **deleteIssueByIdOrKey**
> deleteIssueByIdOrKey(issueIdOrKey).deleteSubtasks(deleteSubtasks).execute();

Delete issue

Deletes an issue.  An issue cannot be deleted if it has one or more subtasks. To delete an issue with subtasks, set &#x60;deleteSubtasks&#x60;. This causes the issue&#39;s subtasks to be deleted with the issue.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* and *Delete issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key of the issue.
    String deleteSubtasks = "true"; // Whether the issue's subtasks are deleted when the issue is deleted.
    try {
      client
              .issues
              .deleteIssueByIdOrKey(issueIdOrKey)
              .deleteSubtasks(deleteSubtasks)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#deleteIssueByIdOrKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .issues
              .deleteIssueByIdOrKey(issueIdOrKey)
              .deleteSubtasks(deleteSubtasks)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#deleteIssueByIdOrKey");
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
| **issueIdOrKey** | **String**| The ID or key of the issue. | |
| **deleteSubtasks** | **String**| Whether the issue&#39;s subtasks are deleted when the issue is deleted. | [optional] [default to false] [enum: true, false] |

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
| **204** | Returned if the request is successful. |  -  |
| **400** | Returned if the issue has subtasks and &#x60;deleteSubtasks&#x60; is not set to *true*. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **403** | Returned if the user does not have permission to delete the issue. |  -  |
| **404** | Returned if the issue is not found or the user does not have permission to view the issue. |  -  |

<a name="editIssueByIdOrKey"></a>
# **editIssueByIdOrKey**
> Object editIssueByIdOrKey(issueIdOrKey, requestBody).notifyUsers(notifyUsers).overrideScreenSecurity(overrideScreenSecurity).overrideEditableFlag(overrideEditableFlag).returnIssue(returnIssue).expand(expand).execute();

Edit issue

Edits an issue. Issue properties may be updated as part of the edit. Please note that issue transition will be ignored as it is not supported yet.  The edits to the issue&#39;s fields are defined using &#x60;update&#x60; and &#x60;fields&#x60;. The fields that can be edited are determined using [Get edit issue metadata](https://dac-static.atlassian.com).  The parent field may be set by key or ID. For standard issue types, the parent may be removed by setting &#x60;update.parent.set.none&#x60; to *true*. Note that the &#x60;description&#x60;, &#x60;environment&#x60;, and any &#x60;textarea&#x60; type custom fields (multi-line text fields) take Atlassian Document Format content. Single line custom fields (&#x60;textfield&#x60;) accept a string and don&#39;t handle Atlassian Document Format content.  Connect apps having an app user with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), can override the screen security configuration using &#x60;overrideScreenSecurity&#x60; and &#x60;overrideEditableFlag&#x60;.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* and *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key of the issue.
    Map<String, Object> fields = new HashMap(); // List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use `update`. Fields included in here cannot be included in `update`.
    HistoryMetadata historyMetadata = new HistoryMetadata();
    List<EntityProperty> properties = Arrays.asList(); // Details of issue properties to be add or update.
    IssueTransition transition = new IssueTransition();
    Map<String, List<FieldUpdateOperation>> update = new HashMap(); // A Map containing the field field name and a list of operations to perform on the issue screen field. Note that fields included in here cannot be included in `fields`.
    Boolean notifyUsers = true; // Whether a notification email about the issue update is sent to all watchers. To disable the notification, administer Jira or administer project permissions are required. If the user doesn't have the necessary permission the request is ignored.
    Boolean overrideScreenSecurity = false; // Whether screen security is overridden to enable hidden fields to be edited. Available to Connect app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
    Boolean overrideEditableFlag = false; // Whether screen security is overridden to enable uneditable fields to be edited. Available to Connect app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
    Boolean returnIssue = false; // Whether the response should contain the issue with fields edited in this request. The returned issue will have the same format as in the [Get issue API](https://dac-static.atlassian.com).
    String expand = ""; // The Get issue API expand parameter to use in the response if the `returnIssue` parameter is `true`.
    try {
      Object result = client
              .issues
              .editIssueByIdOrKey(issueIdOrKey)
              .fields(fields)
              .historyMetadata(historyMetadata)
              .properties(properties)
              .transition(transition)
              .update(update)
              .notifyUsers(notifyUsers)
              .overrideScreenSecurity(overrideScreenSecurity)
              .overrideEditableFlag(overrideEditableFlag)
              .returnIssue(returnIssue)
              .expand(expand)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#editIssueByIdOrKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issues
              .editIssueByIdOrKey(issueIdOrKey)
              .fields(fields)
              .historyMetadata(historyMetadata)
              .properties(properties)
              .transition(transition)
              .update(update)
              .notifyUsers(notifyUsers)
              .overrideScreenSecurity(overrideScreenSecurity)
              .overrideEditableFlag(overrideEditableFlag)
              .returnIssue(returnIssue)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#editIssueByIdOrKey");
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
| **issueIdOrKey** | **String**| The ID or key of the issue. | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |
| **notifyUsers** | **Boolean**| Whether a notification email about the issue update is sent to all watchers. To disable the notification, administer Jira or administer project permissions are required. If the user doesn&#39;t have the necessary permission the request is ignored. | [optional] [default to true] |
| **overrideScreenSecurity** | **Boolean**| Whether screen security is overridden to enable hidden fields to be edited. Available to Connect app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). | [optional] [default to false] |
| **overrideEditableFlag** | **Boolean**| Whether screen security is overridden to enable uneditable fields to be edited. Available to Connect app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). | [optional] [default to false] |
| **returnIssue** | **Boolean**| Whether the response should contain the issue with fields edited in this request. The returned issue will have the same format as in the [Get issue API](https://dac-static.atlassian.com). | [optional] [default to false] |
| **expand** | **String**| The Get issue API expand parameter to use in the response if the &#x60;returnIssue&#x60; parameter is &#x60;true&#x60;. | [optional] [default to ] |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful and the &#x60;returnIssue&#x60; parameter is &#x60;true&#x60; |  -  |
| **204** | Returned if the request is successful. |  -  |
| **400** | Returned if:   *  the request body is missing.  *  the user does not have the necessary permission to edit one or more fields.  *  the request includes one or more fields that are not found or are not associated with the issue&#39;s edit screen.  *  the request includes an invalid transition. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user uses &#x60;overrideScreenSecurity&#x60; or &#x60;overrideEditableFlag&#x60; but doesn&#39;t have the necessary permission. |  -  |
| **404** | Returned if the issue is not found or the user does not have permission to view it. |  -  |
| **409** | Returned if the issue could not be updated due to a conflicting update. (refer to the [changelog](https://developer.atlassian.com/changelog/#CHANGE-1364) *for more details.* |  -  |
| **422** | Returned if a configuration problem prevents the issue being updated. (refer to the [changelog](https://developer.atlassian.com/changelog/#CHANGE-1364) *for more details.* |  -  |

<a name="exportArchivedIssues"></a>
# **exportArchivedIssues**
> ExportArchivedIssuesTaskProgressResponse exportArchivedIssues(requestBody).execute();

Export archived issue(s)

Enables admins to retrieve details of all archived issues. Upon a successful request, the admin who submitted it will receive an email with a link to download a CSV file with the issue details.  Note that this API only exports the values of system fields and archival-specific fields (&#x60;ArchivedBy&#x60; and &#x60;ArchivedDate&#x60;). Custom fields aren&#39;t supported.  **[Permissions](https://dac-static.atlassian.com) required:** Jira admin or site admin: [global permission](https://confluence.atlassian.com/x/x4dKLg)  **License required:** Premium or Enterprise  **Signed-in users only:** This API can&#39;t be accessed anonymously.  **Rate limiting:** Only a single request can be active at any given time.     

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    List<String> archivedBy = Arrays.asList(); // List archived issues archived by a specified account ID.
    DateRangeFilterRequest archivedDateRange = new DateRangeFilterRequest();
    List<String> issueTypes = Arrays.asList(); // List archived issues with a specified issue type ID.
    List<String> projects = Arrays.asList(); // List archived issues with a specified project key.
    List<String> reporters = Arrays.asList(); // List archived issues where the reporter is a specified account ID.
    try {
      ExportArchivedIssuesTaskProgressResponse result = client
              .issues
              .exportArchivedIssues()
              .archivedBy(archivedBy)
              .archivedDateRange(archivedDateRange)
              .issueTypes(issueTypes)
              .projects(projects)
              .reporters(reporters)
              .execute();
      System.out.println(result);
      System.out.println(result.getFileUrl());
      System.out.println(result.getPayload());
      System.out.println(result.getProgress());
      System.out.println(result.getStatus());
      System.out.println(result.getSubmittedTime());
      System.out.println(result.getTaskId());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#exportArchivedIssues");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExportArchivedIssuesTaskProgressResponse> response = client
              .issues
              .exportArchivedIssues()
              .archivedBy(archivedBy)
              .archivedDateRange(archivedDateRange)
              .issueTypes(issueTypes)
              .projects(projects)
              .reporters(reporters)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#exportArchivedIssues");
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
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| You can filter the issues in your request by the &#x60;projects&#x60;, &#x60;archivedBy&#x60;, &#x60;archivedDate&#x60;, &#x60;issueTypes&#x60;, and &#x60;reporters&#x60; fields. All filters are optional. If you don&#39;t provide any filters, you&#39;ll get a list of up to one million archived issues. | |

### Return type

[**ExportArchivedIssuesTaskProgressResponse**](ExportArchivedIssuesTaskProgressResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns the details of your export task. You can use the [get task](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-tasks/#api-rest-api-3-task-taskid-get) API to view the progress of your request. |  -  |

<a name="getChangelogs"></a>
# **getChangelogs**
> PageBeanChangelog getChangelogs(issueIdOrKey).startAt(startAt).maxResults(maxResults).execute();

Get changelogs

Returns a [paginated](https://dac-static.atlassian.com) list of all changelogs for an issue sorted by date, starting from the oldest.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key of the issue.
    Integer startAt = 0; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 100; // The maximum number of items to return per page.
    try {
      PageBeanChangelog result = client
              .issues
              .getChangelogs(issueIdOrKey)
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
      System.err.println("Exception when calling IssuesApi#getChangelogs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanChangelog> response = client
              .issues
              .getChangelogs(issueIdOrKey)
              .startAt(startAt)
              .maxResults(maxResults)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getChangelogs");
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
| **issueIdOrKey** | **String**| The ID or key of the issue. | |
| **startAt** | **Integer**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 100] |

### Return type

[**PageBeanChangelog**](PageBeanChangelog.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **404** | Returned if the issue is not found or the user does not have permission to view it. |  -  |

<a name="getChangelogsByIds"></a>
# **getChangelogsByIds**
> PageOfChangelogs getChangelogsByIds(issueIdOrKey, issueChangelogIds).execute();

Get changelogs by IDs

Returns changelogs for an issue specified by a list of changelog IDs.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    Set<Long> changelogIds = Arrays.asList(); // The list of changelog IDs.
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key of the issue.
    try {
      PageOfChangelogs result = client
              .issues
              .getChangelogsByIds(changelogIds, issueIdOrKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getHistories());
      System.out.println(result.getMaxResults());
      System.out.println(result.getStartAt());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getChangelogsByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageOfChangelogs> response = client
              .issues
              .getChangelogsByIds(changelogIds, issueIdOrKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getChangelogsByIds");
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
| **issueIdOrKey** | **String**| The ID or key of the issue. | |
| **issueChangelogIds** | [**IssueChangelogIds**](IssueChangelogIds.md)|  | |

### Return type

[**PageOfChangelogs**](PageOfChangelogs.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **404** | Returned if the issue is not found or the user does not have the necessary permission. |  -  |

<a name="getCreateIssueMeta"></a>
# **getCreateIssueMeta**
> IssueCreateMetadata getCreateIssueMeta().projectIds(projectIds).projectKeys(projectKeys).issuetypeIds(issuetypeIds).issuetypeNames(issuetypeNames).expand(expand).execute();

Get create issue metadata

Returns details of projects, issue types within projects, and, when requested, the create screen fields for each issue type for the user. Use the information to populate the requests in [Create issue](https://dac-static.atlassian.com) and [Create issues](https://dac-static.atlassian.com).  Deprecated, see [Create Issue Meta Endpoint Deprecation Notice](https://developer.atlassian.com/cloud/jira/platform/changelog/#CHANGE-1304).  The request can be restricted to specific projects or issue types using the query parameters. The response will contain information for the valid projects, issue types, or project and issue type combinations requested. Note that invalid project, issue type, or project and issue type combinations do not generate errors.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Create issues* [project permission](https://confluence.atlassian.com/x/yodKLg) in the requested projects.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    List<String> projectIds = Arrays.asList(); // List of project IDs. This parameter accepts a comma-separated list. Multiple project IDs can also be provided using an ampersand-separated list. For example, `projectIds=10000,10001&projectIds=10020,10021`. This parameter may be provided with `projectKeys`.
    List<String> projectKeys = Arrays.asList(); // List of project keys. This parameter accepts a comma-separated list. Multiple project keys can also be provided using an ampersand-separated list. For example, `projectKeys=proj1,proj2&projectKeys=proj3`. This parameter may be provided with `projectIds`.
    List<String> issuetypeIds = Arrays.asList(); // List of issue type IDs. This parameter accepts a comma-separated list. Multiple issue type IDs can also be provided using an ampersand-separated list. For example, `issuetypeIds=10000,10001&issuetypeIds=10020,10021`. This parameter may be provided with `issuetypeNames`.
    List<String> issuetypeNames = Arrays.asList(); // List of issue type names. This parameter accepts a comma-separated list. Multiple issue type names can also be provided using an ampersand-separated list. For example, `issuetypeNames=name1,name2&issuetypeNames=name3`. This parameter may be provided with `issuetypeIds`.
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information about issue metadata in the response. This parameter accepts `projects.issuetypes.fields`, which returns information about the fields in the issue creation screen for each issue type. Fields hidden from the screen are not returned. Use the information to populate the `fields` and `update` fields in [Create issue](https://dac-static.atlassian.com) and [Create issues](https://dac-static.atlassian.com).
    try {
      IssueCreateMetadata result = client
              .issues
              .getCreateIssueMeta()
              .projectIds(projectIds)
              .projectKeys(projectKeys)
              .issuetypeIds(issuetypeIds)
              .issuetypeNames(issuetypeNames)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpand());
      System.out.println(result.getProjects());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getCreateIssueMeta");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueCreateMetadata> response = client
              .issues
              .getCreateIssueMeta()
              .projectIds(projectIds)
              .projectKeys(projectKeys)
              .issuetypeIds(issuetypeIds)
              .issuetypeNames(issuetypeNames)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getCreateIssueMeta");
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
| **projectIds** | [**List&lt;String&gt;**](String.md)| List of project IDs. This parameter accepts a comma-separated list. Multiple project IDs can also be provided using an ampersand-separated list. For example, &#x60;projectIds&#x3D;10000,10001&amp;projectIds&#x3D;10020,10021&#x60;. This parameter may be provided with &#x60;projectKeys&#x60;. | [optional] |
| **projectKeys** | [**List&lt;String&gt;**](String.md)| List of project keys. This parameter accepts a comma-separated list. Multiple project keys can also be provided using an ampersand-separated list. For example, &#x60;projectKeys&#x3D;proj1,proj2&amp;projectKeys&#x3D;proj3&#x60;. This parameter may be provided with &#x60;projectIds&#x60;. | [optional] |
| **issuetypeIds** | [**List&lt;String&gt;**](String.md)| List of issue type IDs. This parameter accepts a comma-separated list. Multiple issue type IDs can also be provided using an ampersand-separated list. For example, &#x60;issuetypeIds&#x3D;10000,10001&amp;issuetypeIds&#x3D;10020,10021&#x60;. This parameter may be provided with &#x60;issuetypeNames&#x60;. | [optional] |
| **issuetypeNames** | [**List&lt;String&gt;**](String.md)| List of issue type names. This parameter accepts a comma-separated list. Multiple issue type names can also be provided using an ampersand-separated list. For example, &#x60;issuetypeNames&#x3D;name1,name2&amp;issuetypeNames&#x3D;name3&#x60;. This parameter may be provided with &#x60;issuetypeIds&#x60;. | [optional] |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about issue metadata in the response. This parameter accepts &#x60;projects.issuetypes.fields&#x60;, which returns information about the fields in the issue creation screen for each issue type. Fields hidden from the screen are not returned. Use the information to populate the &#x60;fields&#x60; and &#x60;update&#x60; fields in [Create issue](https://dac-static.atlassian.com) and [Create issues](https://dac-static.atlassian.com). | [optional] |

### Return type

[**IssueCreateMetadata**](IssueCreateMetadata.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="getEditMeta"></a>
# **getEditMeta**
> IssueUpdateMetadata getEditMeta(issueIdOrKey).overrideScreenSecurity(overrideScreenSecurity).overrideEditableFlag(overrideEditableFlag).execute();

Get edit issue metadata

Returns the edit screen fields for an issue that are visible to and editable by the user. Use the information to populate the requests in [Edit issue](https://dac-static.atlassian.com).  This endpoint will check for these conditions:  1.  Field is available on a field screen - through screen, screen scheme, issue type screen scheme, and issue type scheme configuration. &#x60;overrideScreenSecurity&#x3D;true&#x60; skips this condition. 2.  Field is visible in the [field configuration](https://support.atlassian.com/jira-cloud-administration/docs/change-a-field-configuration/). &#x60;overrideScreenSecurity&#x3D;true&#x60; skips this condition. 3.  Field is shown on the issue: each field has different conditions here. For example: Attachment field only shows if attachments are enabled. Assignee only shows if user has permissions to assign the issue. 4.  If a field is custom then it must have valid custom field context, applicable for its project and issue type. All system fields are assumed to have context in all projects and all issue types. 5.  Issue has a project, issue type, and status defined. 6.  Issue is assigned to a valid workflow, and the current status has assigned a workflow step. &#x60;overrideEditableFlag&#x3D;true&#x60; skips this condition. 7.  The current workflow step is editable. This is true by default, but [can be disabled by setting](https://support.atlassian.com/jira-cloud-administration/docs/use-workflow-properties/) the &#x60;jira.issue.editable&#x60; property to &#x60;false&#x60;. &#x60;overrideEditableFlag&#x3D;true&#x60; skips this condition. 8.  User has [Edit issues permission](https://support.atlassian.com/jira-cloud-administration/docs/permissions-for-company-managed-projects/). 9.  Workflow permissions allow editing a field. This is true by default but [can be modified](https://support.atlassian.com/jira-cloud-administration/docs/use-workflow-properties/) using &#x60;jira.permission.*&#x60; workflow properties.  Fields hidden using [Issue layout settings page](https://support.atlassian.com/jira-software-cloud/docs/configure-field-layout-in-the-issue-view/) remain editable.  Connect apps having an app user with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), can return additional details using:   *  &#x60;overrideScreenSecurity&#x60; When this flag is &#x60;true&#x60;, then this endpoint skips checking if fields are available through screens, and field configuration (conditions 1. and 2. from the list above).  *  &#x60;overrideEditableFlag&#x60; When this flag is &#x60;true&#x60;, then this endpoint skips checking if workflow is present and if the current step is editable (conditions 6. and 7. from the list above).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  Note: For any fields to be editable the user must have the *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key of the issue.
    Boolean overrideScreenSecurity = false; // Whether hidden fields are returned. Available to Connect app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
    Boolean overrideEditableFlag = false; // Whether non-editable fields are returned. Available to Connect app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
    try {
      IssueUpdateMetadata result = client
              .issues
              .getEditMeta(issueIdOrKey)
              .overrideScreenSecurity(overrideScreenSecurity)
              .overrideEditableFlag(overrideEditableFlag)
              .execute();
      System.out.println(result);
      System.out.println(result.getFields());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getEditMeta");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueUpdateMetadata> response = client
              .issues
              .getEditMeta(issueIdOrKey)
              .overrideScreenSecurity(overrideScreenSecurity)
              .overrideEditableFlag(overrideEditableFlag)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getEditMeta");
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
| **issueIdOrKey** | **String**| The ID or key of the issue. | |
| **overrideScreenSecurity** | **Boolean**| Whether hidden fields are returned. Available to Connect app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). | [optional] [default to false] |
| **overrideEditableFlag** | **Boolean**| Whether non-editable fields are returned. Available to Connect app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). | [optional] [default to false] |

### Return type

[**IssueUpdateMetadata**](IssueUpdateMetadata.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user uses an override parameter but doesn&#39;t have permission to do so. |  -  |
| **404** | Returned if the issue is not found or the user does not have permission to view it. |  -  |

<a name="getFieldMetadataForProjectAndIssueType"></a>
# **getFieldMetadataForProjectAndIssueType**
> PageOfCreateMetaIssueTypeWithField getFieldMetadataForProjectAndIssueType(projectIdOrKey, issueTypeId).startAt(startAt).maxResults(maxResults).execute();

Get create field metadata for a project and issue type id

Returns a page of field metadata for a specified project and issuetype id. Use the information to populate the requests in [Create issue](https://dac-static.atlassian.com) and [Create issues](https://dac-static.atlassian.com).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Create issues* [project permission](https://confluence.atlassian.com/x/yodKLg) in the requested projects.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String projectIdOrKey = "projectIdOrKey_example"; // The ID or key of the project.
    String issueTypeId = "issueTypeId_example"; // The issuetype ID.
    Integer startAt = 0; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // The maximum number of items to return per page.
    try {
      PageOfCreateMetaIssueTypeWithField result = client
              .issues
              .getFieldMetadataForProjectAndIssueType(projectIdOrKey, issueTypeId)
              .startAt(startAt)
              .maxResults(maxResults)
              .execute();
      System.out.println(result);
      System.out.println(result.getFields());
      System.out.println(result.getMaxResults());
      System.out.println(result.getResults());
      System.out.println(result.getStartAt());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getFieldMetadataForProjectAndIssueType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageOfCreateMetaIssueTypeWithField> response = client
              .issues
              .getFieldMetadataForProjectAndIssueType(projectIdOrKey, issueTypeId)
              .startAt(startAt)
              .maxResults(maxResults)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getFieldMetadataForProjectAndIssueType");
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
| **projectIdOrKey** | **String**| The ID or key of the project. | |
| **issueTypeId** | **String**| The issuetype ID. | |
| **startAt** | **Integer**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |

### Return type

[**PageOfCreateMetaIssueTypeWithField**](PageOfCreateMetaIssueTypeWithField.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="getIssueDetailsByIdOrKey"></a>
# **getIssueDetailsByIdOrKey**
> IssueBean getIssueDetailsByIdOrKey(issueIdOrKey).fields(fields).fieldsByKeys(fieldsByKeys).expand(expand).properties(properties).updateHistory(updateHistory).execute();

Get issue

Returns the details for an issue.  The issue is identified by its ID or key, however, if the identifier doesn&#39;t match an issue, a case-insensitive search and check for moved issues is performed. If a matching issue is found its details are returned, a 302 or other redirect is **not** returned. The issue key returned in the response is the key of the issue found.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key of the issue.
    List<String> fields = Arrays.asList(""*all""); // A list of fields to return for the issue. This parameter accepts a comma-separated list. Use it to retrieve a subset of fields. Allowed values:   *  `*all` Returns all fields.  *  `*navigable` Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  `summary,comment` Returns only the summary and comments fields.  *  `-description` Returns all (default) fields except description.  *  `*navigable,-comment` Returns all navigable fields except comment.  This parameter may be specified multiple times. For example, `fields=field1,field2& fields=field3`.  Note: All fields are returned by default. This differs from [Search for issues using JQL (GET)](https://dac-static.atlassian.com) and [Search for issues using JQL (POST)](https://dac-static.atlassian.com) where the default is all navigable fields.
    Boolean fieldsByKeys = false; // Whether fields in `fields` are referenced by keys rather than IDs. This parameter is useful where fields have been added by a connect app and a field's key may differ from its ID.
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information about the issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  `renderedFields` Returns field values rendered in HTML format.  *  `names` Returns the display name of each field.  *  `schema` Returns the schema describing a field type.  *  `transitions` Returns all possible transitions for the issue.  *  `editmeta` Returns information about how each field can be edited.  *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  `versionedRepresentations` Returns a JSON array for each version of a field's value, with the highest number representing the most recent version. Note: When included in the request, the `fields` parameter is ignored.
    List<String> properties = Arrays.asList(""null""); // A list of issue properties to return for the issue. This parameter accepts a comma-separated list. Allowed values:   *  `*all` Returns all issue properties.  *  Any issue property key, prefixed with a minus to exclude.  Examples:   *  `*all` Returns all properties.  *  `*all,-prop1` Returns all properties except `prop1`.  *  `prop1,prop2` Returns `prop1` and `prop2` properties.  This parameter may be specified multiple times. For example, `properties=prop1,prop2& properties=prop3`.
    Boolean updateHistory = false; // Whether the project in which the issue is created is added to the user's **Recently viewed** project list, as shown under **Projects** in Jira. This also populates the [JQL issues search](https://dac-static.atlassian.com) `lastViewed` field.
    try {
      IssueBean result = client
              .issues
              .getIssueDetailsByIdOrKey(issueIdOrKey)
              .fields(fields)
              .fieldsByKeys(fieldsByKeys)
              .expand(expand)
              .properties(properties)
              .updateHistory(updateHistory)
              .execute();
      System.out.println(result);
      System.out.println(result.getChangelog());
      System.out.println(result.getEditmeta());
      System.out.println(result.getExpand());
      System.out.println(result.getFields());
      System.out.println(result.getFieldsToInclude());
      System.out.println(result.getId());
      System.out.println(result.getKey());
      System.out.println(result.getNames());
      System.out.println(result.getOperations());
      System.out.println(result.getProperties());
      System.out.println(result.getRenderedFields());
      System.out.println(result.getSchema());
      System.out.println(result.getSelf());
      System.out.println(result.getTransitions());
      System.out.println(result.getVersionedRepresentations());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getIssueDetailsByIdOrKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueBean> response = client
              .issues
              .getIssueDetailsByIdOrKey(issueIdOrKey)
              .fields(fields)
              .fieldsByKeys(fieldsByKeys)
              .expand(expand)
              .properties(properties)
              .updateHistory(updateHistory)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getIssueDetailsByIdOrKey");
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
| **issueIdOrKey** | **String**| The ID or key of the issue. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A list of fields to return for the issue. This parameter accepts a comma-separated list. Use it to retrieve a subset of fields. Allowed values:   *  &#x60;*all&#x60; Returns all fields.  *  &#x60;*navigable&#x60; Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  &#x60;summary,comment&#x60; Returns only the summary and comments fields.  *  &#x60;-description&#x60; Returns all (default) fields except description.  *  &#x60;*navigable,-comment&#x60; Returns all navigable fields except comment.  This parameter may be specified multiple times. For example, &#x60;fields&#x3D;field1,field2&amp; fields&#x3D;field3&#x60;.  Note: All fields are returned by default. This differs from [Search for issues using JQL (GET)](https://dac-static.atlassian.com) and [Search for issues using JQL (POST)](https://dac-static.atlassian.com) where the default is all navigable fields. | [optional] |
| **fieldsByKeys** | **Boolean**| Whether fields in &#x60;fields&#x60; are referenced by keys rather than IDs. This parameter is useful where fields have been added by a connect app and a field&#39;s key may differ from its ID. | [optional] [default to false] |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about the issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;renderedFields&#x60; Returns field values rendered in HTML format.  *  &#x60;names&#x60; Returns the display name of each field.  *  &#x60;schema&#x60; Returns the schema describing a field type.  *  &#x60;transitions&#x60; Returns all possible transitions for the issue.  *  &#x60;editmeta&#x60; Returns information about how each field can be edited.  *  &#x60;changelog&#x60; Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  &#x60;versionedRepresentations&#x60; Returns a JSON array for each version of a field&#39;s value, with the highest number representing the most recent version. Note: When included in the request, the &#x60;fields&#x60; parameter is ignored. | [optional] |
| **properties** | [**List&lt;String&gt;**](String.md)| A list of issue properties to return for the issue. This parameter accepts a comma-separated list. Allowed values:   *  &#x60;*all&#x60; Returns all issue properties.  *  Any issue property key, prefixed with a minus to exclude.  Examples:   *  &#x60;*all&#x60; Returns all properties.  *  &#x60;*all,-prop1&#x60; Returns all properties except &#x60;prop1&#x60;.  *  &#x60;prop1,prop2&#x60; Returns &#x60;prop1&#x60; and &#x60;prop2&#x60; properties.  This parameter may be specified multiple times. For example, &#x60;properties&#x3D;prop1,prop2&amp; properties&#x3D;prop3&#x60;. | [optional] |
| **updateHistory** | **Boolean**| Whether the project in which the issue is created is added to the user&#39;s **Recently viewed** project list, as shown under **Projects** in Jira. This also populates the [JQL issues search](https://dac-static.atlassian.com) &#x60;lastViewed&#x60; field. | [optional] [default to false] |

### Return type

[**IssueBean**](IssueBean.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if the issue is not found or the user does not have permission to view it. |  -  |

<a name="getMetaIssueTypesForProject"></a>
# **getMetaIssueTypesForProject**
> PageOfCreateMetaIssueTypes getMetaIssueTypesForProject(projectIdOrKey).startAt(startAt).maxResults(maxResults).execute();

Get create metadata issue types for a project

Returns a page of issue type metadata for a specified project. Use the information to populate the requests in [Create issue](https://dac-static.atlassian.com) and [Create issues](https://dac-static.atlassian.com).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Create issues* [project permission](https://confluence.atlassian.com/x/yodKLg) in the requested projects.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String projectIdOrKey = "projectIdOrKey_example"; // The ID or key of the project.
    Integer startAt = 0; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // The maximum number of items to return per page.
    try {
      PageOfCreateMetaIssueTypes result = client
              .issues
              .getMetaIssueTypesForProject(projectIdOrKey)
              .startAt(startAt)
              .maxResults(maxResults)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreateMetaIssueType());
      System.out.println(result.getIssueTypes());
      System.out.println(result.getMaxResults());
      System.out.println(result.getStartAt());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getMetaIssueTypesForProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageOfCreateMetaIssueTypes> response = client
              .issues
              .getMetaIssueTypesForProject(projectIdOrKey)
              .startAt(startAt)
              .maxResults(maxResults)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getMetaIssueTypesForProject");
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
| **projectIdOrKey** | **String**| The ID or key of the project. | |
| **startAt** | **Integer**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |

### Return type

[**PageOfCreateMetaIssueTypes**](PageOfCreateMetaIssueTypes.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="getTransitions"></a>
# **getTransitions**
> Transitions getTransitions(issueIdOrKey).expand(expand).transitionId(transitionId).skipRemoteOnlyCondition(skipRemoteOnlyCondition).includeUnavailableTransitions(includeUnavailableTransitions).sortByOpsBarAndStatus(sortByOpsBarAndStatus).execute();

Get transitions

Returns either all transitions or a transition that can be performed by the user on an issue, based on the issue&#39;s status.  Note, if a request is made for a transition that does not exist or cannot be performed on the issue, given its status, the response will return any empty transitions list.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required: A list or transition is returned only when the user has:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  However, if the user does not have the *Transition issues* [project permission](https://confluence.atlassian.com/x/yodKLg) the response will not list any transitions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key of the issue.
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information about transitions in the response. This parameter accepts `transitions.fields`, which returns information about the fields in the transition screen for each transition. Fields hidden from the screen are not returned. Use this information to populate the `fields` and `update` fields in [Transition issue](https://dac-static.atlassian.com).
    String transitionId = "transitionId_example"; // The ID of the transition.
    Boolean skipRemoteOnlyCondition = false; // Whether transitions with the condition *Hide From User Condition* are included in the response.
    Boolean includeUnavailableTransitions = false; // Whether details of transitions that fail a condition are included in the response
    Boolean sortByOpsBarAndStatus = false; // Whether the transitions are sorted by ops-bar sequence value first then category order (Todo, In Progress, Done) or only by ops-bar sequence value.
    try {
      Transitions result = client
              .issues
              .getTransitions(issueIdOrKey)
              .expand(expand)
              .transitionId(transitionId)
              .skipRemoteOnlyCondition(skipRemoteOnlyCondition)
              .includeUnavailableTransitions(includeUnavailableTransitions)
              .sortByOpsBarAndStatus(sortByOpsBarAndStatus)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpand());
      System.out.println(result.getTransitions());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getTransitions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transitions> response = client
              .issues
              .getTransitions(issueIdOrKey)
              .expand(expand)
              .transitionId(transitionId)
              .skipRemoteOnlyCondition(skipRemoteOnlyCondition)
              .includeUnavailableTransitions(includeUnavailableTransitions)
              .sortByOpsBarAndStatus(sortByOpsBarAndStatus)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getTransitions");
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
| **issueIdOrKey** | **String**| The ID or key of the issue. | |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about transitions in the response. This parameter accepts &#x60;transitions.fields&#x60;, which returns information about the fields in the transition screen for each transition. Fields hidden from the screen are not returned. Use this information to populate the &#x60;fields&#x60; and &#x60;update&#x60; fields in [Transition issue](https://dac-static.atlassian.com). | [optional] |
| **transitionId** | **String**| The ID of the transition. | [optional] |
| **skipRemoteOnlyCondition** | **Boolean**| Whether transitions with the condition *Hide From User Condition* are included in the response. | [optional] [default to false] |
| **includeUnavailableTransitions** | **Boolean**| Whether details of transitions that fail a condition are included in the response | [optional] [default to false] |
| **sortByOpsBarAndStatus** | **Boolean**| Whether the transitions are sorted by ops-bar sequence value first then category order (Todo, In Progress, Done) or only by ops-bar sequence value. | [optional] [default to false] |

### Return type

[**Transitions**](Transitions.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if the issue is not found or the user does not have permission to view it. |  -  |

<a name="listAllEvents"></a>
# **listAllEvents**
> List&lt;IssueEvent&gt; listAllEvents().execute();

Get events

Returns all issue events.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    try {
      List<IssueEvent> result = client
              .issues
              .listAllEvents()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#listAllEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<IssueEvent>> response = client
              .issues
              .listAllEvents()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#listAllEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;IssueEvent&gt;**](IssueEvent.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have permission to complete this request. |  -  |

<a name="notifyEmail"></a>
# **notifyEmail**
> Object notifyEmail(issueIdOrKey, requestBody).execute();

Send notification for issue

Creates an email notification for an issue and adds it to the mail queue.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // ID or key of the issue that the notification is sent for.
    String htmlBody = "htmlBody_example"; // The HTML body of the email notification for the issue.
    NotificationRecipientsRestrictions restrict = new NotificationRecipientsRestrictions();
    String subject = "subject_example"; // The subject of the email notification for the issue. If this is not specified, then the subject is set to the issue key and summary.
    String textBody = "textBody_example"; // The plain text body of the email notification for the issue.
    NotificationRecipients to = new NotificationRecipients();
    try {
      Object result = client
              .issues
              .notifyEmail(issueIdOrKey)
              .htmlBody(htmlBody)
              .restrict(restrict)
              .subject(subject)
              .textBody(textBody)
              .to(to)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#notifyEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issues
              .notifyEmail(issueIdOrKey)
              .htmlBody(htmlBody)
              .restrict(restrict)
              .subject(subject)
              .textBody(textBody)
              .to(to)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#notifyEmail");
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
| **issueIdOrKey** | **String**| ID or key of the issue that the notification is sent for. | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| The request object for the notification and recipients. | |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the email is queued for sending. |  -  |
| **400** | Returned if:   *  the recipient is the same as the calling user.  *  the recipient is invalid. For example, the recipient is set to the assignee, but the issue is unassigned.  *  the request is invalid. For example, required fields are missing or have invalid values. |  -  |
| **403** | Returned if:   *  outgoing emails are disabled.  *  no SMTP server is configured. |  -  |
| **404** | Returned if the issue is not found. |  -  |

<a name="transitionIssue"></a>
# **transitionIssue**
> Object transitionIssue(issueIdOrKey, requestBody).execute();

Transition issue

Performs an issue transition and, if the transition has a screen, updates the fields from the transition screen.  sortByCategory To update the fields on the transition screen, specify the fields in the &#x60;fields&#x60; or &#x60;update&#x60; parameters in the request body. Get details about the fields using [Get transitions](https://dac-static.atlassian.com) with the &#x60;transitions.fields&#x60; expand.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* and *Transition issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key of the issue.
    Map<String, Object> fields = new HashMap(); // List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use `update`. Fields included in here cannot be included in `update`.
    HistoryMetadata historyMetadata = new HistoryMetadata();
    List<EntityProperty> properties = Arrays.asList(); // Details of issue properties to be add or update.
    IssueTransition transition = new IssueTransition();
    Map<String, List<FieldUpdateOperation>> update = new HashMap(); // A Map containing the field field name and a list of operations to perform on the issue screen field. Note that fields included in here cannot be included in `fields`.
    try {
      Object result = client
              .issues
              .transitionIssue(issueIdOrKey)
              .fields(fields)
              .historyMetadata(historyMetadata)
              .properties(properties)
              .transition(transition)
              .update(update)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#transitionIssue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issues
              .transitionIssue(issueIdOrKey)
              .fields(fields)
              .historyMetadata(historyMetadata)
              .properties(properties)
              .transition(transition)
              .update(update)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#transitionIssue");
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
| **issueIdOrKey** | **String**| The ID or key of the issue. | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the request is successful. |  -  |
| **400** | Returned if:   *  no transition is specified.  *  the user does not have permission to transition the issue.  *  a field that isn&#39;t included on the transition screen is defined in &#x60;fields&#x60; or &#x60;update&#x60;.  *  a field is specified in both &#x60;fields&#x60; and &#x60;update&#x60;.  *  the request is invalid for any other reason. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if the issue is not found or the user does not have permission to view it. |  -  |
| **409** | Returned if the issue could not be updated due to a conflicting update. (refer to the [changelog](https://developer.atlassian.com/changelog/#CHANGE-1364) *for more details.* |  -  |
| **422** | Returned if a configuration problem prevents the creation of the issue. (refer to the [changelog](https://developer.atlassian.com/changelog/#CHANGE-1364) *for more details.* |  -  |

<a name="unarchiveIssueByIdsPut"></a>
# **unarchiveIssueByIdsPut**
> IssueArchivalSyncResponse unarchiveIssueByIdsPut(issueArchivalSyncRequest).execute();

Unarchive issue(s) by issue keys/ID

Enables admins to unarchive up to 1000 issues in a single request using issue ID/key, returning details of the issue(s) unarchived in the process and the errors encountered, if any.  **Note that:**   *  you can&#39;t unarchive subtasks directly, only through their parent issues  *  you can only unarchive issues from software, service management, and business projects  **[Permissions](https://dac-static.atlassian.com) required:** Jira admin or site admin: [global permission](https://confluence.atlassian.com/x/x4dKLg)  **License required:** Premium or Enterprise  **Signed-in users only:** This API can&#39;t be accessed anonymously.     

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    List<String> issueIdsOrKeys = Arrays.asList();
    try {
      IssueArchivalSyncResponse result = client
              .issues
              .unarchiveIssueByIdsPut()
              .issueIdsOrKeys(issueIdsOrKeys)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrors());
      System.out.println(result.getNumberOfIssuesUpdated());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#unarchiveIssueByIdsPut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueArchivalSyncResponse> response = client
              .issues
              .unarchiveIssueByIdsPut()
              .issueIdsOrKeys(issueIdsOrKeys)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#unarchiveIssueByIdsPut");
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
| **issueArchivalSyncRequest** | [**IssueArchivalSyncRequest**](IssueArchivalSyncRequest.md)| Contains a list of issue keys or IDs to be unarchived. | |

### Return type

[**IssueArchivalSyncResponse**](IssueArchivalSyncResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if there is at least one valid issue to unarchive in the request. It will return the count of unarchived issues, which also includes the count of the subtasks unarchived, and it will show the detailed errors for those issues which are not unarchived. |  -  |

