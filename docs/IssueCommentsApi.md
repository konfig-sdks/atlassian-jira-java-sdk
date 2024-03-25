# IssueCommentsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCommentToIssue**](IssueCommentsApi.md#addCommentToIssue) | **POST** /rest/api/3/issue/{issueIdOrKey}/comment | Add comment |
| [**deleteComment**](IssueCommentsApi.md#deleteComment) | **DELETE** /rest/api/3/issue/{issueIdOrKey}/comment/{id} | Delete comment |
| [**getCommentById**](IssueCommentsApi.md#getCommentById) | **GET** /rest/api/3/issue/{issueIdOrKey}/comment/{id} | Get comment |
| [**getCommentsByIds**](IssueCommentsApi.md#getCommentsByIds) | **POST** /rest/api/3/comment/list | Get comments by IDs |
| [**listGet**](IssueCommentsApi.md#listGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/comment | Get comments |
| [**updateComment**](IssueCommentsApi.md#updateComment) | **PUT** /rest/api/3/issue/{issueIdOrKey}/comment/{id} | Update comment |


<a name="addCommentToIssue"></a>
# **addCommentToIssue**
> Comment addCommentToIssue(issueIdOrKey, requestBody).expand(expand).execute();

Add comment

Adds a comment to an issue.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* and *Add comments* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCommentsApi;
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
    UserDetails author = new UserDetails();
    Object body = null; // The comment text in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/).
    OffsetDateTime created = OffsetDateTime.now(); // The date and time at which the comment was created.
    String id = "id_example"; // The ID of the comment.
    Boolean jsdAuthorCanSeeRequest = true; // Whether the comment was added from an email sent by a person who is not part of the issue. See [Allow external emails to be added as comments on issues](https://support.atlassian.com/jira-service-management-cloud/docs/allow-external-emails-to-be-added-as-comments-on-issues/)for information on setting up this feature.
    Boolean jsdPublic = true; // Whether the comment is visible in Jira Service Desk. Defaults to true when comments are created in the Jira Cloud Platform. This includes when the site doesn't use Jira Service Desk or the project isn't a Jira Service Desk project and, therefore, there is no Jira Service Desk for the issue to be visible on. To create a comment with its visibility in Jira Service Desk set to false, use the Jira Service Desk REST API [Create request comment](https://developer.atlassian.com/cloud/jira/service-desk/rest/#api-rest-servicedeskapi-request-issueIdOrKey-comment-post) operation.
    List<EntityProperty> properties = Arrays.asList(); // A list of comment properties. Optional on create and update.
    String renderedBody = "renderedBody_example"; // The rendered version of the comment.
    String self = "self_example"; // The URL of the comment.
    UserDetails updateAuthor = new UserDetails();
    OffsetDateTime updated = OffsetDateTime.now(); // The date and time at which the comment was updated last.
    Visibility visibility = new Visibility();
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information about comments in the response. This parameter accepts `renderedBody`, which returns the comment body rendered in HTML.
    try {
      Comment result = client
              .issueComments
              .addCommentToIssue(issueIdOrKey)
              .author(author)
              .body(body)
              .created(created)
              .id(id)
              .jsdAuthorCanSeeRequest(jsdAuthorCanSeeRequest)
              .jsdPublic(jsdPublic)
              .properties(properties)
              .renderedBody(renderedBody)
              .self(self)
              .updateAuthor(updateAuthor)
              .updated(updated)
              .visibility(visibility)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthor());
      System.out.println(result.getBody());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getJsdAuthorCanSeeRequest());
      System.out.println(result.getJsdPublic());
      System.out.println(result.getProperties());
      System.out.println(result.getRenderedBody());
      System.out.println(result.getSelf());
      System.out.println(result.getUpdateAuthor());
      System.out.println(result.getUpdated());
      System.out.println(result.getVisibility());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCommentsApi#addCommentToIssue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Comment> response = client
              .issueComments
              .addCommentToIssue(issueIdOrKey)
              .author(author)
              .body(body)
              .created(created)
              .id(id)
              .jsdAuthorCanSeeRequest(jsdAuthorCanSeeRequest)
              .jsdPublic(jsdPublic)
              .properties(properties)
              .renderedBody(renderedBody)
              .self(self)
              .updateAuthor(updateAuthor)
              .updated(updated)
              .visibility(visibility)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCommentsApi#addCommentToIssue");
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
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about comments in the response. This parameter accepts &#x60;renderedBody&#x60;, which returns the comment body rendered in HTML. | [optional] |

### Return type

[**Comment**](Comment.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **404** | Returned if the issue is not found or the user does not have permission to view it. |  -  |

<a name="deleteComment"></a>
# **deleteComment**
> deleteComment(issueIdOrKey, id).execute();

Delete comment

Deletes a comment.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Delete all comments*[project permission](https://confluence.atlassian.com/x/yodKLg) to delete any comment or *Delete own comments* to delete comment created by the user,  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCommentsApi;
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
    String id = "id_example"; // The ID of the comment.
    try {
      client
              .issueComments
              .deleteComment(issueIdOrKey, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCommentsApi#deleteComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .issueComments
              .deleteComment(issueIdOrKey, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCommentsApi#deleteComment");
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
| **id** | **String**| The ID of the comment. | |

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
| **400** | Returned if the user does not have permission to delete the comment. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if the issue or comment is not found or the user does not have permission to view the issue or comment. |  -  |
| **405** | Returned if an anonymous call is made to the operation. |  -  |

<a name="getCommentById"></a>
# **getCommentById**
> Comment getCommentById(issueIdOrKey, id).expand(expand).execute();

Get comment

Returns a comment.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCommentsApi;
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
    String id = "id_example"; // The ID of the comment.
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information about comments in the response. This parameter accepts `renderedBody`, which returns the comment body rendered in HTML.
    try {
      Comment result = client
              .issueComments
              .getCommentById(issueIdOrKey, id)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthor());
      System.out.println(result.getBody());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getJsdAuthorCanSeeRequest());
      System.out.println(result.getJsdPublic());
      System.out.println(result.getProperties());
      System.out.println(result.getRenderedBody());
      System.out.println(result.getSelf());
      System.out.println(result.getUpdateAuthor());
      System.out.println(result.getUpdated());
      System.out.println(result.getVisibility());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCommentsApi#getCommentById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Comment> response = client
              .issueComments
              .getCommentById(issueIdOrKey, id)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCommentsApi#getCommentById");
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
| **id** | **String**| The ID of the comment. | |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about comments in the response. This parameter accepts &#x60;renderedBody&#x60;, which returns the comment body rendered in HTML. | [optional] |

### Return type

[**Comment**](Comment.md)

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
| **404** | Returned if the issue or comment is not found or the user does not have permission to view the issue or comment. |  -  |

<a name="getCommentsByIds"></a>
# **getCommentsByIds**
> PageBeanComment getCommentsByIds(issueCommentListRequestBean).expand(expand).execute();

Get comments by IDs

Returns a [paginated](https://dac-static.atlassian.com) list of comments specified by a list of comment IDs.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Comments are returned where the user:   *  has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCommentsApi;
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
    Set<Long> ids = Arrays.asList(); // The list of comment IDs. A maximum of 1000 IDs can be specified.
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information about comments in the response. This parameter accepts a comma-separated list. Expand options include:   *  `renderedBody` Returns the comment body rendered in HTML.  *  `properties` Returns the comment's properties.
    try {
      PageBeanComment result = client
              .issueComments
              .getCommentsByIds(ids)
              .expand(expand)
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
      System.err.println("Exception when calling IssueCommentsApi#getCommentsByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanComment> response = client
              .issueComments
              .getCommentsByIds(ids)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCommentsApi#getCommentsByIds");
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
| **issueCommentListRequestBean** | [**IssueCommentListRequestBean**](IssueCommentListRequestBean.md)| The list of comment IDs. | |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about comments in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;renderedBody&#x60; Returns the comment body rendered in HTML.  *  &#x60;properties&#x60; Returns the comment&#39;s properties. | [optional] |

### Return type

[**PageBeanComment**](PageBeanComment.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request contains more than 1000 IDs or is empty. |  -  |

<a name="listGet"></a>
# **listGet**
> PageOfComments listGet(issueIdOrKey).startAt(startAt).maxResults(maxResults).orderBy(orderBy).expand(expand).execute();

Get comments

Returns all comments for an issue.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Comments are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is role visibility is restricted to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCommentsApi;
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
    String orderBy = "created"; // [Order](https://dac-static.atlassian.com) the results by a field. Accepts *created* to sort comments by their created date.
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information about comments in the response. This parameter accepts `renderedBody`, which returns the comment body rendered in HTML.
    try {
      PageOfComments result = client
              .issueComments
              .listGet(issueIdOrKey)
              .startAt(startAt)
              .maxResults(maxResults)
              .orderBy(orderBy)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getComments());
      System.out.println(result.getMaxResults());
      System.out.println(result.getStartAt());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCommentsApi#listGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageOfComments> response = client
              .issueComments
              .listGet(issueIdOrKey)
              .startAt(startAt)
              .maxResults(maxResults)
              .orderBy(orderBy)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCommentsApi#listGet");
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
| **orderBy** | **String**| [Order](https://dac-static.atlassian.com) the results by a field. Accepts *created* to sort comments by their created date. | [optional] [enum: created, -created, +created] |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about comments in the response. This parameter accepts &#x60;renderedBody&#x60;, which returns the comment body rendered in HTML. | [optional] |

### Return type

[**PageOfComments**](PageOfComments.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if &#x60;orderBy&#x60; is set to a value other than *created*. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if the issue is not found or the user does not have permission to view it. |  -  |

<a name="updateComment"></a>
# **updateComment**
> Comment updateComment(issueIdOrKey, id, requestBody).notifyUsers(notifyUsers).overrideEditableFlag(overrideEditableFlag).expand(expand).execute();

Update comment

Updates a comment.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all comments*[project permission](https://confluence.atlassian.com/x/yodKLg) to update any comment or *Edit own comments* to update comment created by the user.  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCommentsApi;
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
    String id = "id_example"; // The ID of the comment.
    UserDetails author = new UserDetails();
    Object body = null; // The comment text in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/).
    OffsetDateTime created = OffsetDateTime.now(); // The date and time at which the comment was created.
    String id = "id_example"; // The ID of the comment.
    Boolean jsdAuthorCanSeeRequest = true; // Whether the comment was added from an email sent by a person who is not part of the issue. See [Allow external emails to be added as comments on issues](https://support.atlassian.com/jira-service-management-cloud/docs/allow-external-emails-to-be-added-as-comments-on-issues/)for information on setting up this feature.
    Boolean jsdPublic = true; // Whether the comment is visible in Jira Service Desk. Defaults to true when comments are created in the Jira Cloud Platform. This includes when the site doesn't use Jira Service Desk or the project isn't a Jira Service Desk project and, therefore, there is no Jira Service Desk for the issue to be visible on. To create a comment with its visibility in Jira Service Desk set to false, use the Jira Service Desk REST API [Create request comment](https://developer.atlassian.com/cloud/jira/service-desk/rest/#api-rest-servicedeskapi-request-issueIdOrKey-comment-post) operation.
    List<EntityProperty> properties = Arrays.asList(); // A list of comment properties. Optional on create and update.
    String renderedBody = "renderedBody_example"; // The rendered version of the comment.
    String self = "self_example"; // The URL of the comment.
    UserDetails updateAuthor = new UserDetails();
    OffsetDateTime updated = OffsetDateTime.now(); // The date and time at which the comment was updated last.
    Visibility visibility = new Visibility();
    Boolean notifyUsers = true; // Whether users are notified when a comment is updated.
    Boolean overrideEditableFlag = false; // Whether screen security is overridden to enable uneditable fields to be edited. Available to Connect app users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information about comments in the response. This parameter accepts `renderedBody`, which returns the comment body rendered in HTML.
    try {
      Comment result = client
              .issueComments
              .updateComment(issueIdOrKey, id)
              .author(author)
              .body(body)
              .created(created)
              .id(id)
              .jsdAuthorCanSeeRequest(jsdAuthorCanSeeRequest)
              .jsdPublic(jsdPublic)
              .properties(properties)
              .renderedBody(renderedBody)
              .self(self)
              .updateAuthor(updateAuthor)
              .updated(updated)
              .visibility(visibility)
              .notifyUsers(notifyUsers)
              .overrideEditableFlag(overrideEditableFlag)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthor());
      System.out.println(result.getBody());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getJsdAuthorCanSeeRequest());
      System.out.println(result.getJsdPublic());
      System.out.println(result.getProperties());
      System.out.println(result.getRenderedBody());
      System.out.println(result.getSelf());
      System.out.println(result.getUpdateAuthor());
      System.out.println(result.getUpdated());
      System.out.println(result.getVisibility());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCommentsApi#updateComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Comment> response = client
              .issueComments
              .updateComment(issueIdOrKey, id)
              .author(author)
              .body(body)
              .created(created)
              .id(id)
              .jsdAuthorCanSeeRequest(jsdAuthorCanSeeRequest)
              .jsdPublic(jsdPublic)
              .properties(properties)
              .renderedBody(renderedBody)
              .self(self)
              .updateAuthor(updateAuthor)
              .updated(updated)
              .visibility(visibility)
              .notifyUsers(notifyUsers)
              .overrideEditableFlag(overrideEditableFlag)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCommentsApi#updateComment");
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
| **id** | **String**| The ID of the comment. | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |
| **notifyUsers** | **Boolean**| Whether users are notified when a comment is updated. | [optional] [default to true] |
| **overrideEditableFlag** | **Boolean**| Whether screen security is overridden to enable uneditable fields to be edited. Available to Connect app users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). | [optional] [default to false] |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about comments in the response. This parameter accepts &#x60;renderedBody&#x60;, which returns the comment body rendered in HTML. | [optional] |

### Return type

[**Comment**](Comment.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the user does not have permission to edit the comment or the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if the issue or comment is not found or the user does not have permission to view the issue or comment. |  -  |

