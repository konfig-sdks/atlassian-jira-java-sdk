# IssueWorklogsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWorklog**](IssueWorklogsApi.md#createWorklog) | **POST** /rest/api/3/issue/{issueIdOrKey}/worklog | Add worklog |
| [**deleteWorklogById**](IssueWorklogsApi.md#deleteWorklogById) | **DELETE** /rest/api/3/issue/{issueIdOrKey}/worklog/{id} | Delete worklog |
| [**getDetailsForList**](IssueWorklogsApi.md#getDetailsForList) | **GET** /rest/api/3/issue/{issueIdOrKey}/worklog | Get issue worklogs |
| [**getUpdatedWorklogIds**](IssueWorklogsApi.md#getUpdatedWorklogIds) | **GET** /rest/api/3/worklog/updated | Get IDs of updated worklogs |
| [**getWorklogDetails**](IssueWorklogsApi.md#getWorklogDetails) | **GET** /rest/api/3/issue/{issueIdOrKey}/worklog/{id} | Get worklog |
| [**getWorklogDetailsForList**](IssueWorklogsApi.md#getWorklogDetailsForList) | **POST** /rest/api/3/worklog/list | Get worklogs |
| [**listDeletedWorklogIds**](IssueWorklogsApi.md#listDeletedWorklogIds) | **GET** /rest/api/3/worklog/deleted | Get IDs of deleted worklogs |
| [**updateWorklog**](IssueWorklogsApi.md#updateWorklog) | **PUT** /rest/api/3/issue/{issueIdOrKey}/worklog/{id} | Update worklog |


<a name="createWorklog"></a>
# **createWorklog**
> Worklog createWorklog(issueIdOrKey, requestBody).notifyUsers(notifyUsers).adjustEstimate(adjustEstimate).newEstimate(newEstimate).reduceBy(reduceBy).expand(expand).overrideEditableFlag(overrideEditableFlag).execute();

Add worklog

Adds a worklog to an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* and *Work on issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueWorklogsApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key the issue.
    UserDetails author = new UserDetails();
    Object comment = null; // A comment about the worklog in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/). Optional when creating or updating a worklog.
    OffsetDateTime created = OffsetDateTime.now(); // The datetime on which the worklog was created.
    String id = "id_example"; // The ID of the worklog record.
    String issueId = "issueId_example"; // The ID of the issue this worklog is for.
    List<EntityProperty> properties = Arrays.asList(); // Details of properties for the worklog. Optional when creating or updating a worklog.
    URI self = new URI(); // The URL of the worklog item.
    OffsetDateTime started = OffsetDateTime.now(); // The datetime on which the worklog effort was started. Required when creating a worklog. Optional when updating a worklog.
    String timeSpent = "timeSpent_example"; // The time spent working on the issue as days (\\\\#d), hours (\\\\#h), or minutes (\\\\#m or \\\\#). Required when creating a worklog if `timeSpentSeconds` isn't provided. Optional when updating a worklog. Cannot be provided if `timeSpentSecond` is provided.
    Long timeSpentSeconds = 56L; // The time in seconds spent working on the issue. Required when creating a worklog if `timeSpent` isn't provided. Optional when updating a worklog. Cannot be provided if `timeSpent` is provided.
    UserDetails updateAuthor = new UserDetails();
    OffsetDateTime updated = OffsetDateTime.now(); // The datetime on which the worklog was last updated.
    Visibility visibility = new Visibility();
    Boolean notifyUsers = true; // Whether users watching the issue are notified by email.
    String adjustEstimate = "new"; // Defines how to update the issue's time estimate, the options are:   *  `new` Sets the estimate to a specific value, defined in `newEstimate`.  *  `leave` Leaves the estimate unchanged.  *  `manual` Reduces the estimate by amount specified in `reduceBy`.  *  `auto` Reduces the estimate by the value of `timeSpent` in the worklog.
    String newEstimate = "newEstimate_example"; // The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `new`.
    String reduceBy = "reduceBy_example"; // The amount to reduce the issue's remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m). For example, *2d*. Required when `adjustEstimate` is `manual`.
    String expand = ""; // Use [expand](https://dac-static.atlassian.com) to include additional information about work logs in the response. This parameter accepts `properties`, which returns worklog properties.
    Boolean overrideEditableFlag = false; // Whether the worklog entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can use this flag.
    try {
      Worklog result = client
              .issueWorklogs
              .createWorklog(issueIdOrKey)
              .author(author)
              .comment(comment)
              .created(created)
              .id(id)
              .issueId(issueId)
              .properties(properties)
              .self(self)
              .started(started)
              .timeSpent(timeSpent)
              .timeSpentSeconds(timeSpentSeconds)
              .updateAuthor(updateAuthor)
              .updated(updated)
              .visibility(visibility)
              .notifyUsers(notifyUsers)
              .adjustEstimate(adjustEstimate)
              .newEstimate(newEstimate)
              .reduceBy(reduceBy)
              .expand(expand)
              .overrideEditableFlag(overrideEditableFlag)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthor());
      System.out.println(result.getComment());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getIssueId());
      System.out.println(result.getProperties());
      System.out.println(result.getSelf());
      System.out.println(result.getStarted());
      System.out.println(result.getTimeSpent());
      System.out.println(result.getTimeSpentSeconds());
      System.out.println(result.getUpdateAuthor());
      System.out.println(result.getUpdated());
      System.out.println(result.getVisibility());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#createWorklog");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Worklog> response = client
              .issueWorklogs
              .createWorklog(issueIdOrKey)
              .author(author)
              .comment(comment)
              .created(created)
              .id(id)
              .issueId(issueId)
              .properties(properties)
              .self(self)
              .started(started)
              .timeSpent(timeSpent)
              .timeSpentSeconds(timeSpentSeconds)
              .updateAuthor(updateAuthor)
              .updated(updated)
              .visibility(visibility)
              .notifyUsers(notifyUsers)
              .adjustEstimate(adjustEstimate)
              .newEstimate(newEstimate)
              .reduceBy(reduceBy)
              .expand(expand)
              .overrideEditableFlag(overrideEditableFlag)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#createWorklog");
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
| **issueIdOrKey** | **String**| The ID or key the issue. | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |
| **notifyUsers** | **Boolean**| Whether users watching the issue are notified by email. | [optional] [default to true] |
| **adjustEstimate** | **String**| Defines how to update the issue&#39;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;manual&#x60; Reduces the estimate by amount specified in &#x60;reduceBy&#x60;.  *  &#x60;auto&#x60; Reduces the estimate by the value of &#x60;timeSpent&#x60; in the worklog. | [optional] [default to auto] [enum: new, leave, manual, auto] |
| **newEstimate** | **String**| The value to set as the issue&#39;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;. | [optional] |
| **reduceBy** | **String**| The amount to reduce the issue&#39;s remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;manual&#x60;. | [optional] |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about work logs in the response. This parameter accepts &#x60;properties&#x60;, which returns worklog properties. | [optional] [default to ] |
| **overrideEditableFlag** | **Boolean**| Whether the worklog entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can use this flag. | [optional] [default to false] |

### Return type

[**Worklog**](Worklog.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is successful. |  -  |
| **400** | Returned if:   *  &#x60;adjustEstimate&#x60; is set to &#x60;new&#x60; but &#x60;newEstimate&#x60; is not provided or is invalid.  *  &#x60;adjustEstimate&#x60; is set to &#x60;manual&#x60; but &#x60;reduceBy&#x60; is not provided or is invalid.  *  the user does not have permission to add the worklog.  *  the request JSON is malformed. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **404** | Returned if the issue is not found or the user does not have permission to view it. |  -  |

<a name="deleteWorklogById"></a>
# **deleteWorklogById**
> deleteWorklogById(issueIdOrKey, id).notifyUsers(notifyUsers).adjustEstimate(adjustEstimate).newEstimate(newEstimate).increaseBy(increaseBy).overrideEditableFlag(overrideEditableFlag).execute();

Delete worklog

Deletes a worklog from an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Delete all worklogs*[project permission](https://confluence.atlassian.com/x/yodKLg) to delete any worklog or *Delete own worklogs* to delete worklogs created by the user,  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueWorklogsApi;
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
    String id = "id_example"; // The ID of the worklog.
    Boolean notifyUsers = true; // Whether users watching the issue are notified by email.
    String adjustEstimate = "new"; // Defines how to update the issue's time estimate, the options are:   *  `new` Sets the estimate to a specific value, defined in `newEstimate`.  *  `leave` Leaves the estimate unchanged.  *  `manual` Increases the estimate by amount specified in `increaseBy`.  *  `auto` Reduces the estimate by the value of `timeSpent` in the worklog.
    String newEstimate = "newEstimate_example"; // The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `new`.
    String increaseBy = "increaseBy_example"; // The amount to increase the issue's remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `manual`.
    Boolean overrideEditableFlag = false; // Whether the work log entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Connect and Forge app users with admin permission can use this flag.
    try {
      client
              .issueWorklogs
              .deleteWorklogById(issueIdOrKey, id)
              .notifyUsers(notifyUsers)
              .adjustEstimate(adjustEstimate)
              .newEstimate(newEstimate)
              .increaseBy(increaseBy)
              .overrideEditableFlag(overrideEditableFlag)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#deleteWorklogById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .issueWorklogs
              .deleteWorklogById(issueIdOrKey, id)
              .notifyUsers(notifyUsers)
              .adjustEstimate(adjustEstimate)
              .newEstimate(newEstimate)
              .increaseBy(increaseBy)
              .overrideEditableFlag(overrideEditableFlag)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#deleteWorklogById");
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
| **id** | **String**| The ID of the worklog. | |
| **notifyUsers** | **Boolean**| Whether users watching the issue are notified by email. | [optional] [default to true] |
| **adjustEstimate** | **String**| Defines how to update the issue&#39;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;manual&#x60; Increases the estimate by amount specified in &#x60;increaseBy&#x60;.  *  &#x60;auto&#x60; Reduces the estimate by the value of &#x60;timeSpent&#x60; in the worklog. | [optional] [default to auto] [enum: new, leave, manual, auto] |
| **newEstimate** | **String**| The value to set as the issue&#39;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;. | [optional] |
| **increaseBy** | **String**| The amount to increase the issue&#39;s remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;manual&#x60;. | [optional] |
| **overrideEditableFlag** | **Boolean**| Whether the work log entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Connect and Forge app users with admin permission can use this flag. | [optional] [default to false] |

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
| **400** | Returned if:   *  &#x60;adjustEstimate&#x60; is set to &#x60;new&#x60; but &#x60;newEstimate&#x60; is not provided or is invalid.  *  &#x60;adjustEstimate&#x60; is set to &#x60;manual&#x60; but &#x60;reduceBy&#x60; is not provided or is invalid.  *  the user does not have permission to delete the worklog. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **404** | Returned if:   *  the issue is not found or user does not have permission to view the issue.  *  the worklog is not found or the user does not have permission to view it.  *  time tracking is disabled. |  -  |

<a name="getDetailsForList"></a>
# **getDetailsForList**
> PageOfWorklogs getDetailsForList(issueIdOrKey).startAt(startAt).maxResults(maxResults).startedAfter(startedAfter).startedBefore(startedBefore).expand(expand).execute();

Get issue worklogs

Returns worklogs for an issue, starting from the oldest worklog or from the worklog started on or after a date and time.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Workloads are only returned where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueWorklogsApi;
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
    Long startAt = 0L; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 5000; // The maximum number of items to return per page.
    Long startedAfter = 56L; // The worklog start date and time, as a UNIX timestamp in milliseconds, after which worklogs are returned.
    Long startedBefore = 56L; // The worklog start date and time, as a UNIX timestamp in milliseconds, before which worklogs are returned.
    String expand = ""; // Use [expand](https://dac-static.atlassian.com) to include additional information about worklogs in the response. This parameter accepts`properties`, which returns worklog properties.
    try {
      PageOfWorklogs result = client
              .issueWorklogs
              .getDetailsForList(issueIdOrKey)
              .startAt(startAt)
              .maxResults(maxResults)
              .startedAfter(startedAfter)
              .startedBefore(startedBefore)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getMaxResults());
      System.out.println(result.getStartAt());
      System.out.println(result.getTotal());
      System.out.println(result.getWorklogs());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#getDetailsForList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageOfWorklogs> response = client
              .issueWorklogs
              .getDetailsForList(issueIdOrKey)
              .startAt(startAt)
              .maxResults(maxResults)
              .startedAfter(startedAfter)
              .startedBefore(startedBefore)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#getDetailsForList");
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
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 5000] |
| **startedAfter** | **Long**| The worklog start date and time, as a UNIX timestamp in milliseconds, after which worklogs are returned. | [optional] |
| **startedBefore** | **Long**| The worklog start date and time, as a UNIX timestamp in milliseconds, before which worklogs are returned. | [optional] |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about worklogs in the response. This parameter accepts&#x60;properties&#x60;, which returns worklog properties. | [optional] [default to ] |

### Return type

[**PageOfWorklogs**](PageOfWorklogs.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if:   *  the issue is not found or the user does not have permission to view the issue.  *  &#x60;startAt&#x60; or &#x60;maxResults&#x60; has non-numeric values.  *  time tracking is disabled. |  -  |

<a name="getUpdatedWorklogIds"></a>
# **getUpdatedWorklogIds**
> ChangedWorklogs getUpdatedWorklogIds().since(since).expand(expand).execute();

Get IDs of updated worklogs

Returns a list of IDs and update timestamps for worklogs updated after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, &#x60;until&#x60; indicates the timestamp of the youngest item on the page. Also, &#x60;nextPage&#x60; provides the URL for the next page of worklogs. The &#x60;lastPage&#x60; parameter is set to true on the last page of worklogs.  This resource does not return worklogs updated during the minute preceding the request.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueWorklogsApi;
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
    Long since = 0L; // The date and time, as a UNIX timestamp in milliseconds, after which updated worklogs are returned.
    String expand = ""; // Use [expand](https://dac-static.atlassian.com) to include additional information about worklogs in the response. This parameter accepts `properties` that returns the properties of each worklog.
    try {
      ChangedWorklogs result = client
              .issueWorklogs
              .getUpdatedWorklogIds()
              .since(since)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getLastPage());
      System.out.println(result.getNextPage());
      System.out.println(result.getSelf());
      System.out.println(result.getSince());
      System.out.println(result.getUntil());
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#getUpdatedWorklogIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangedWorklogs> response = client
              .issueWorklogs
              .getUpdatedWorklogIds()
              .since(since)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#getUpdatedWorklogIds");
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
| **since** | **Long**| The date and time, as a UNIX timestamp in milliseconds, after which updated worklogs are returned. | [optional] [default to 0] |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60; that returns the properties of each worklog. | [optional] [default to ] |

### Return type

[**ChangedWorklogs**](ChangedWorklogs.md)

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

<a name="getWorklogDetails"></a>
# **getWorklogDetails**
> Worklog getWorklogDetails(issueIdOrKey, id).expand(expand).execute();

Get worklog

Returns a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueWorklogsApi;
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
    String id = "id_example"; // The ID of the worklog.
    String expand = ""; // Use [expand](https://dac-static.atlassian.com) to include additional information about work logs in the response. This parameter accepts  `properties`, which returns worklog properties.
    try {
      Worklog result = client
              .issueWorklogs
              .getWorklogDetails(issueIdOrKey, id)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthor());
      System.out.println(result.getComment());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getIssueId());
      System.out.println(result.getProperties());
      System.out.println(result.getSelf());
      System.out.println(result.getStarted());
      System.out.println(result.getTimeSpent());
      System.out.println(result.getTimeSpentSeconds());
      System.out.println(result.getUpdateAuthor());
      System.out.println(result.getUpdated());
      System.out.println(result.getVisibility());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#getWorklogDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Worklog> response = client
              .issueWorklogs
              .getWorklogDetails(issueIdOrKey, id)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#getWorklogDetails");
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
| **id** | **String**| The ID of the worklog. | |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about work logs in the response. This parameter accepts  &#x60;properties&#x60;, which returns worklog properties. | [optional] [default to ] |

### Return type

[**Worklog**](Worklog.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **404** | Returned if:   *  the issue is not found or the user does not have permission to view it.  *  the worklog is not found or the user does not have permission to view it.  *  time tracking is disabled.  . |  -  |

<a name="getWorklogDetailsForList"></a>
# **getWorklogDetailsForList**
> List&lt;Worklog&gt; getWorklogDetailsForList(worklogIdsRequestBean).expand(expand).execute();

Get worklogs

Returns worklog details for a list of worklog IDs.  The returned list of worklogs is limited to 1000 items.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueWorklogsApi;
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
    Set<Long> ids = Arrays.asList(); // A list of worklog IDs.
    String expand = ""; // Use [expand](https://dac-static.atlassian.com) to include additional information about worklogs in the response. This parameter accepts `properties` that returns the properties of each worklog.
    try {
      List<Worklog> result = client
              .issueWorklogs
              .getWorklogDetailsForList(ids)
              .expand(expand)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#getWorklogDetailsForList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Worklog>> response = client
              .issueWorklogs
              .getWorklogDetailsForList(ids)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#getWorklogDetailsForList");
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
| **worklogIdsRequestBean** | [**WorklogIdsRequestBean**](WorklogIdsRequestBean.md)| A JSON object containing a list of worklog IDs. | |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60; that returns the properties of each worklog. | [optional] [default to ] |

### Return type

[**List&lt;Worklog&gt;**](Worklog.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request contains more than 1000 worklog IDs or is empty. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="listDeletedWorklogIds"></a>
# **listDeletedWorklogIds**
> ChangedWorklogs listDeletedWorklogIds().since(since).execute();

Get IDs of deleted worklogs

Returns a list of IDs and delete timestamps for worklogs deleted after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, &#x60;until&#x60; indicates the timestamp of the youngest item on the page. Also, &#x60;nextPage&#x60; provides the URL for the next page of worklogs. The &#x60;lastPage&#x60; parameter is set to true on the last page of worklogs.  This resource does not return worklogs deleted during the minute preceding the request.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueWorklogsApi;
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
    Long since = 0L; // The date and time, as a UNIX timestamp in milliseconds, after which deleted worklogs are returned.
    try {
      ChangedWorklogs result = client
              .issueWorklogs
              .listDeletedWorklogIds()
              .since(since)
              .execute();
      System.out.println(result);
      System.out.println(result.getLastPage());
      System.out.println(result.getNextPage());
      System.out.println(result.getSelf());
      System.out.println(result.getSince());
      System.out.println(result.getUntil());
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#listDeletedWorklogIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangedWorklogs> response = client
              .issueWorklogs
              .listDeletedWorklogIds()
              .since(since)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#listDeletedWorklogIds");
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
| **since** | **Long**| The date and time, as a UNIX timestamp in milliseconds, after which deleted worklogs are returned. | [optional] [default to 0] |

### Return type

[**ChangedWorklogs**](ChangedWorklogs.md)

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

<a name="updateWorklog"></a>
# **updateWorklog**
> Worklog updateWorklog(issueIdOrKey, id, requestBody).notifyUsers(notifyUsers).adjustEstimate(adjustEstimate).newEstimate(newEstimate).expand(expand).overrideEditableFlag(overrideEditableFlag).execute();

Update worklog

Updates a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all worklogs*[project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueWorklogsApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key the issue.
    String id = "id_example"; // The ID of the worklog.
    UserDetails author = new UserDetails();
    Object comment = null; // A comment about the worklog in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/). Optional when creating or updating a worklog.
    OffsetDateTime created = OffsetDateTime.now(); // The datetime on which the worklog was created.
    String id = "id_example"; // The ID of the worklog record.
    String issueId = "issueId_example"; // The ID of the issue this worklog is for.
    List<EntityProperty> properties = Arrays.asList(); // Details of properties for the worklog. Optional when creating or updating a worklog.
    URI self = new URI(); // The URL of the worklog item.
    OffsetDateTime started = OffsetDateTime.now(); // The datetime on which the worklog effort was started. Required when creating a worklog. Optional when updating a worklog.
    String timeSpent = "timeSpent_example"; // The time spent working on the issue as days (\\\\#d), hours (\\\\#h), or minutes (\\\\#m or \\\\#). Required when creating a worklog if `timeSpentSeconds` isn't provided. Optional when updating a worklog. Cannot be provided if `timeSpentSecond` is provided.
    Long timeSpentSeconds = 56L; // The time in seconds spent working on the issue. Required when creating a worklog if `timeSpent` isn't provided. Optional when updating a worklog. Cannot be provided if `timeSpent` is provided.
    UserDetails updateAuthor = new UserDetails();
    OffsetDateTime updated = OffsetDateTime.now(); // The datetime on which the worklog was last updated.
    Visibility visibility = new Visibility();
    Boolean notifyUsers = true; // Whether users watching the issue are notified by email.
    String adjustEstimate = "new"; // Defines how to update the issue's time estimate, the options are:   *  `new` Sets the estimate to a specific value, defined in `newEstimate`.  *  `leave` Leaves the estimate unchanged.  *  `auto` Updates the estimate by the difference between the original and updated value of `timeSpent` or `timeSpentSeconds`.
    String newEstimate = "newEstimate_example"; // The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `new`.
    String expand = ""; // Use [expand](https://dac-static.atlassian.com) to include additional information about worklogs in the response. This parameter accepts `properties`, which returns worklog properties.
    Boolean overrideEditableFlag = false; // Whether the worklog should be added to the issue even if the issue is not editable. For example, because the issue is closed. Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can use this flag.
    try {
      Worklog result = client
              .issueWorklogs
              .updateWorklog(issueIdOrKey, id)
              .author(author)
              .comment(comment)
              .created(created)
              .id(id)
              .issueId(issueId)
              .properties(properties)
              .self(self)
              .started(started)
              .timeSpent(timeSpent)
              .timeSpentSeconds(timeSpentSeconds)
              .updateAuthor(updateAuthor)
              .updated(updated)
              .visibility(visibility)
              .notifyUsers(notifyUsers)
              .adjustEstimate(adjustEstimate)
              .newEstimate(newEstimate)
              .expand(expand)
              .overrideEditableFlag(overrideEditableFlag)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthor());
      System.out.println(result.getComment());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getIssueId());
      System.out.println(result.getProperties());
      System.out.println(result.getSelf());
      System.out.println(result.getStarted());
      System.out.println(result.getTimeSpent());
      System.out.println(result.getTimeSpentSeconds());
      System.out.println(result.getUpdateAuthor());
      System.out.println(result.getUpdated());
      System.out.println(result.getVisibility());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#updateWorklog");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Worklog> response = client
              .issueWorklogs
              .updateWorklog(issueIdOrKey, id)
              .author(author)
              .comment(comment)
              .created(created)
              .id(id)
              .issueId(issueId)
              .properties(properties)
              .self(self)
              .started(started)
              .timeSpent(timeSpent)
              .timeSpentSeconds(timeSpentSeconds)
              .updateAuthor(updateAuthor)
              .updated(updated)
              .visibility(visibility)
              .notifyUsers(notifyUsers)
              .adjustEstimate(adjustEstimate)
              .newEstimate(newEstimate)
              .expand(expand)
              .overrideEditableFlag(overrideEditableFlag)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogsApi#updateWorklog");
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
| **issueIdOrKey** | **String**| The ID or key the issue. | |
| **id** | **String**| The ID of the worklog. | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |
| **notifyUsers** | **Boolean**| Whether users watching the issue are notified by email. | [optional] [default to true] |
| **adjustEstimate** | **String**| Defines how to update the issue&#39;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;auto&#x60; Updates the estimate by the difference between the original and updated value of &#x60;timeSpent&#x60; or &#x60;timeSpentSeconds&#x60;. | [optional] [default to auto] [enum: new, leave, manual, auto] |
| **newEstimate** | **String**| The value to set as the issue&#39;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;. | [optional] |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60;, which returns worklog properties. | [optional] [default to ] |
| **overrideEditableFlag** | **Boolean**| Whether the worklog should be added to the issue even if the issue is not editable. For example, because the issue is closed. Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can use this flag. | [optional] [default to false] |

### Return type

[**Worklog**](Worklog.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful |  -  |
| **400** | Returned if:   *  &#x60;adjustEstimate&#x60; is set to &#x60;new&#x60; but &#x60;newEstimate&#x60; is not provided or is invalid.  *  the user does not have permission to update the worklog.  *  the request JSON is malformed. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **404** | Returned if:   *  the issue is not found or user does not have permission to view the issue.  *  the worklog is not found or the user does not have permission to view it.  *  time tracking is disabled. |  -  |

