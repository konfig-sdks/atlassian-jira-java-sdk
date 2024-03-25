# IssueRemoteLinksApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrUpdateRemoteIssueLink**](IssueRemoteLinksApi.md#createOrUpdateRemoteIssueLink) | **POST** /rest/api/3/issue/{issueIdOrKey}/remotelink | Create or update remote issue link |
| [**deleteByGlobalId**](IssueRemoteLinksApi.md#deleteByGlobalId) | **DELETE** /rest/api/3/issue/{issueIdOrKey}/remotelink | Delete remote issue link by global ID |
| [**deleteById**](IssueRemoteLinksApi.md#deleteById) | **DELETE** /rest/api/3/issue/{issueIdOrKey}/remotelink/{linkId} | Delete remote issue link by ID |
| [**getAll**](IssueRemoteLinksApi.md#getAll) | **GET** /rest/api/3/issue/{issueIdOrKey}/remotelink | Get remote issue links |
| [**getByLinkId**](IssueRemoteLinksApi.md#getByLinkId) | **GET** /rest/api/3/issue/{issueIdOrKey}/remotelink/{linkId} | Get remote issue link by ID |
| [**updateById**](IssueRemoteLinksApi.md#updateById) | **PUT** /rest/api/3/issue/{issueIdOrKey}/remotelink/{linkId} | Update remote issue link by ID |


<a name="createOrUpdateRemoteIssueLink"></a>
# **createOrUpdateRemoteIssueLink**
> RemoteIssueLinkIdentifies createOrUpdateRemoteIssueLink(issueIdOrKey, requestBody).execute();

Create or update remote issue link

Creates or updates a remote issue link for an issue.  If a &#x60;globalId&#x60; is provided and a remote issue link with that global ID is found it is updated. Any fields without values in the request are set to null. Otherwise, the remote issue link is created.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueRemoteLinksApi;
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
    RemoteObject _object = new RemoteObject();
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key of the issue.
    Application application = new Application();
    String globalId = "globalId_example"; // An identifier for the remote item in the remote system. For example, the global ID for a remote item in Confluence would consist of the app ID and page ID, like this: `appId=456&pageId=123`.  Setting this field enables the remote issue link details to be updated or deleted using remote system and item details as the record identifier, rather than using the record's Jira ID.  The maximum length is 255 characters.
    String relationship = "relationship_example"; // Description of the relationship between the issue and the linked item. If not set, the relationship description \\\"links to\\\" is used in Jira.
    try {
      RemoteIssueLinkIdentifies result = client
              .issueRemoteLinks
              .createOrUpdateRemoteIssueLink(_object, issueIdOrKey)
              .application(application)
              .globalId(globalId)
              .relationship(relationship)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueRemoteLinksApi#createOrUpdateRemoteIssueLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RemoteIssueLinkIdentifies> response = client
              .issueRemoteLinks
              .createOrUpdateRemoteIssueLink(_object, issueIdOrKey)
              .application(application)
              .globalId(globalId)
              .relationship(relationship)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueRemoteLinksApi#createOrUpdateRemoteIssueLink");
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

[**RemoteIssueLinkIdentifies**](RemoteIssueLinkIdentifies.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the remote issue link is updated. |  -  |
| **201** | Returned if the remote issue link is created. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have permission to link issues. |  -  |
| **404** | Returned if the issue is not found or the user does not have permission to view the issue. |  -  |

<a name="deleteByGlobalId"></a>
# **deleteByGlobalId**
> deleteByGlobalId(issueIdOrKey, globalId).execute();

Delete remote issue link by global ID

Deletes the remote issue link from the issue using the link&#39;s global ID. Where the global ID includes reserved URL characters these must be escaped in the request. For example, pass &#x60;system&#x3D;http://www.mycompany.com/support&amp;id&#x3D;1&#x60; as &#x60;system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1&#x60;.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is implemented, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueRemoteLinksApi;
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
    String issueIdOrKey = "10000"; // The ID or key of the issue.
    String globalId = "system=http://www.mycompany.com/support&id=1"; // The global ID of a remote issue link.
    try {
      client
              .issueRemoteLinks
              .deleteByGlobalId(issueIdOrKey, globalId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueRemoteLinksApi#deleteByGlobalId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .issueRemoteLinks
              .deleteByGlobalId(issueIdOrKey, globalId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueRemoteLinksApi#deleteByGlobalId");
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
| **globalId** | **String**| The global ID of a remote issue link. | |

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
| **400** | Returned if a global ID isn&#39;t provided. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have permission to link issues. |  -  |
| **404** | Returned if the issue or remote issue link is not found or the user does not have permission to view the issue. |  -  |

<a name="deleteById"></a>
# **deleteById**
> deleteById(issueIdOrKey, linkId).execute();

Delete remote issue link by ID

Deletes a remote issue link from an issue.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects*, *Edit issues*, and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueRemoteLinksApi;
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
    String issueIdOrKey = "10000"; // The ID or key of the issue.
    String linkId = "10000"; // The ID of a remote issue link.
    try {
      client
              .issueRemoteLinks
              .deleteById(issueIdOrKey, linkId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueRemoteLinksApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .issueRemoteLinks
              .deleteById(issueIdOrKey, linkId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueRemoteLinksApi#deleteById");
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
| **linkId** | **String**| The ID of a remote issue link. | |

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
| **400** | Returned if the link ID is invalid or the remote issue link does not belong to the issue. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have permission to link issues. |  -  |
| **404** | Returned if the issue or remote issue link is not found or the user does not have permission to view the issue. |  -  |

<a name="getAll"></a>
# **getAll**
> RemoteIssueLink getAll(issueIdOrKey).globalId(globalId).execute();

Get remote issue links

Returns the remote issue links for an issue. When a remote issue link global ID is provided the record with that global ID is returned, otherwise all remote issue links are returned. Where a global ID includes reserved URL characters these must be escaped in the request. For example, pass &#x60;system&#x3D;http://www.mycompany.com/support&amp;id&#x3D;1&#x60; as &#x60;system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1&#x60;.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueRemoteLinksApi;
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
    String issueIdOrKey = "10000"; // The ID or key of the issue.
    String globalId = "globalId_example"; // The global ID of the remote issue link.
    try {
      RemoteIssueLink result = client
              .issueRemoteLinks
              .getAll(issueIdOrKey)
              .globalId(globalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getApplication());
      System.out.println(result.getGlobalId());
      System.out.println(result.getId());
      System.out.println(result.getObject());
      System.out.println(result.getRelationship());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueRemoteLinksApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RemoteIssueLink> response = client
              .issueRemoteLinks
              .getAll(issueIdOrKey)
              .globalId(globalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueRemoteLinksApi#getAll");
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
| **globalId** | **String**| The global ID of the remote issue link. | [optional] |

### Return type

[**RemoteIssueLink**](RemoteIssueLink.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if issue linking is disabled. |  -  |
| **404** | Returned if the issue or remote issue link is not found or the user does not have permission to view the issue. |  -  |

<a name="getByLinkId"></a>
# **getByLinkId**
> RemoteIssueLink getByLinkId(issueIdOrKey, linkId).execute();

Get remote issue link by ID

Returns a remote issue link for an issue.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueRemoteLinksApi;
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
    String linkId = "linkId_example"; // The ID of the remote issue link.
    try {
      RemoteIssueLink result = client
              .issueRemoteLinks
              .getByLinkId(issueIdOrKey, linkId)
              .execute();
      System.out.println(result);
      System.out.println(result.getApplication());
      System.out.println(result.getGlobalId());
      System.out.println(result.getId());
      System.out.println(result.getObject());
      System.out.println(result.getRelationship());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueRemoteLinksApi#getByLinkId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RemoteIssueLink> response = client
              .issueRemoteLinks
              .getByLinkId(issueIdOrKey, linkId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueRemoteLinksApi#getByLinkId");
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
| **linkId** | **String**| The ID of the remote issue link. | |

### Return type

[**RemoteIssueLink**](RemoteIssueLink.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the link ID is invalid or the remote issue link does not belong to the issue. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if issue linking is disabled. |  -  |
| **404** | Returned if the issue or remote issue link is not found or the user does not have permission to view the issue. |  -  |

<a name="updateById"></a>
# **updateById**
> Object updateById(issueIdOrKey, linkId, requestBody).execute();

Update remote issue link by ID

Updates a remote issue link for an issue.  Note: Fields without values in the request are set to null.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueRemoteLinksApi;
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
    RemoteObject _object = new RemoteObject();
    String issueIdOrKey = "10000"; // The ID or key of the issue.
    String linkId = "10000"; // The ID of the remote issue link.
    Application application = new Application();
    String globalId = "globalId_example"; // An identifier for the remote item in the remote system. For example, the global ID for a remote item in Confluence would consist of the app ID and page ID, like this: `appId=456&pageId=123`.  Setting this field enables the remote issue link details to be updated or deleted using remote system and item details as the record identifier, rather than using the record's Jira ID.  The maximum length is 255 characters.
    String relationship = "relationship_example"; // Description of the relationship between the issue and the linked item. If not set, the relationship description \\\"links to\\\" is used in Jira.
    try {
      Object result = client
              .issueRemoteLinks
              .updateById(_object, issueIdOrKey, linkId)
              .application(application)
              .globalId(globalId)
              .relationship(relationship)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueRemoteLinksApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issueRemoteLinks
              .updateById(_object, issueIdOrKey, linkId)
              .application(application)
              .globalId(globalId)
              .relationship(relationship)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueRemoteLinksApi#updateById");
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
| **linkId** | **String**| The ID of the remote issue link. | |
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
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have permission to link issues. |  -  |
| **404** | Returned if the issue or remote issue link is not found or the user does not have permission to view the issue. |  -  |

