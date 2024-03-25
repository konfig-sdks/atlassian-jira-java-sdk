# PermissionsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllPermissions**](PermissionsApi.md#getAllPermissions) | **GET** /rest/api/3/permissions | Get all permissions |
| [**getBulkPermissions**](PermissionsApi.md#getBulkPermissions) | **POST** /rest/api/3/permissions/check | Get bulk permissions |
| [**getPermittedProjects**](PermissionsApi.md#getPermittedProjects) | **POST** /rest/api/3/permissions/project | Get permitted projects |
| [**getUserPermissions**](PermissionsApi.md#getUserPermissions) | **GET** /rest/api/3/mypermissions | Get my permissions |


<a name="getAllPermissions"></a>
# **getAllPermissions**
> Permissions getAllPermissions().execute();

Get all permissions

Returns all permissions, including:   *  global permissions.  *  project permissions.  *  global permissions added by plugins.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionsApi;
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
      Permissions result = client
              .permissions
              .getAllPermissions()
              .execute();
      System.out.println(result);
      System.out.println(result.getPermissions());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getAllPermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Permissions> response = client
              .permissions
              .getAllPermissions()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getAllPermissions");
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

[**Permissions**](Permissions.md)

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
| **403** | Returned if the user does not have the necessary permission. |  -  |

<a name="getBulkPermissions"></a>
# **getBulkPermissions**
> BulkPermissionGrants getBulkPermissions(bulkPermissionsRequestBean).execute();

Get bulk permissions

Returns:   *  for a list of global permissions, the global permissions granted to a user.  *  for a list of project permissions and lists of projects and issues, for each project permission a list of the projects and issues a user can access or manipulate.  If no account ID is provided, the operation returns details for the logged in user.  Note that:   *  Invalid project and issue IDs are ignored.  *  A maximum of 1000 projects and 1000 issues can be checked.  *  Null values in &#x60;globalPermissions&#x60;, &#x60;projectPermissions&#x60;, &#x60;projectPermissions.projects&#x60;, and &#x60;projectPermissions.issues&#x60; are ignored.  *  Empty strings in &#x60;projectPermissions.permissions&#x60; are ignored.  **Deprecation notice:** The required OAuth 2.0 scopes will be updated on June 15, 2024.   *  **Classic**: &#x60;read:jira-work&#x60;  *  **Granular**: &#x60;read:permission:jira&#x60;  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to check the permissions for other users, otherwise none. However, Connect apps can make a call from the app server to the product to obtain permission details for any user, without admin permission. This Connect app ability doesn&#39;t apply to calls made using AP.request() in a browser.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionsApi;
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
    String accountId = "accountId_example"; // The account ID of a user.
    Set<String> globalPermissions = Arrays.asList(); // Global permissions to look up.
    Set<BulkProjectPermissions> projectPermissions = Arrays.asList(); // Project permissions with associated projects and issues to look up.
    try {
      BulkPermissionGrants result = client
              .permissions
              .getBulkPermissions()
              .accountId(accountId)
              .globalPermissions(globalPermissions)
              .projectPermissions(projectPermissions)
              .execute();
      System.out.println(result);
      System.out.println(result.getGlobalPermissions());
      System.out.println(result.getProjectPermissions());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getBulkPermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BulkPermissionGrants> response = client
              .permissions
              .getBulkPermissions()
              .accountId(accountId)
              .globalPermissions(globalPermissions)
              .projectPermissions(projectPermissions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getBulkPermissions");
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
| **bulkPermissionsRequestBean** | [**BulkPermissionsRequestBean**](BulkPermissionsRequestBean.md)| Details of the permissions to check. | |

### Return type

[**BulkPermissionGrants**](BulkPermissionGrants.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="getPermittedProjects"></a>
# **getPermittedProjects**
> PermittedProjects getPermittedProjects(permissionsKeysBean).execute();

Get permitted projects

Returns all the projects where the user is granted a list of project permissions.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionsApi;
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
    List<String> permissions = Arrays.asList(); // A list of permission keys.
    try {
      PermittedProjects result = client
              .permissions
              .getPermittedProjects(permissions)
              .execute();
      System.out.println(result);
      System.out.println(result.getProjects());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getPermittedProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermittedProjects> response = client
              .permissions
              .getPermittedProjects(permissions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getPermittedProjects");
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
| **permissionsKeysBean** | [**PermissionsKeysBean**](PermissionsKeysBean.md)|  | |

### Return type

[**PermittedProjects**](PermittedProjects.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if a project permission is not found. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="getUserPermissions"></a>
# **getUserPermissions**
> Permissions getUserPermissions().projectKey(projectKey).projectId(projectId).issueKey(issueKey).issueId(issueId).permissions(permissions).projectUuid(projectUuid).projectConfigurationUuid(projectConfigurationUuid).commentId(commentId).execute();

Get my permissions

Returns a list of permissions indicating which permissions the user has. Details of the user&#39;s permissions can be obtained in a global, project, issue or comment context.  The user is reported as having a project permission:   *  in the global context, if the user has the project permission in any project.  *  for a project, where the project permission is determined using issue data, if the user meets the permission&#39;s criteria for any issue in the project. Otherwise, if the user has the project permission in the project.  *  for an issue, where a project permission is determined using issue data, if the user has the permission in the issue. Otherwise, if the user has the project permission in the project containing the issue.  *  for a comment, where the user has both the permission to browse the comment and the project permission for the comment&#39;s parent issue. Only the BROWSE\\_PROJECTS permission is supported. If a &#x60;commentId&#x60; is provided whose &#x60;permissions&#x60; does not equal BROWSE\\_PROJECTS, a 400 error will be returned.  This means that users may be shown as having an issue permission (such as EDIT\\_ISSUES) in the global context or a project context but may not have the permission for any or all issues. For example, if Reporters have the EDIT\\_ISSUES permission a user would be shown as having this permission in the global context or the context of a project, because any user can be a reporter. However, if they are not the user who reported the issue queried they would not have EDIT\\_ISSUES permission for that issue.  Global permissions are unaffected by context.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionsApi;
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
    String projectKey = "projectKey_example"; // The key of project. Ignored if `projectId` is provided.
    String projectId = "projectId_example"; // The ID of project.
    String issueKey = "issueKey_example"; // The key of the issue. Ignored if `issueId` is provided.
    String issueId = "issueId_example"; // The ID of the issue.
    String permissions = "BROWSE_PROJECTS,EDIT_ISSUES"; // A list of permission keys. (Required) This parameter accepts a comma-separated list. To get the list of available permissions, use [Get all permissions](https://dac-static.atlassian.com).
    String projectUuid = "projectUuid_example";
    String projectConfigurationUuid = "projectConfigurationUuid_example";
    String commentId = "commentId_example"; // The ID of the comment.
    try {
      Permissions result = client
              .permissions
              .getUserPermissions()
              .projectKey(projectKey)
              .projectId(projectId)
              .issueKey(issueKey)
              .issueId(issueId)
              .permissions(permissions)
              .projectUuid(projectUuid)
              .projectConfigurationUuid(projectConfigurationUuid)
              .commentId(commentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPermissions());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getUserPermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Permissions> response = client
              .permissions
              .getUserPermissions()
              .projectKey(projectKey)
              .projectId(projectId)
              .issueKey(issueKey)
              .issueId(issueId)
              .permissions(permissions)
              .projectUuid(projectUuid)
              .projectConfigurationUuid(projectConfigurationUuid)
              .commentId(commentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getUserPermissions");
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
| **projectKey** | **String**| The key of project. Ignored if &#x60;projectId&#x60; is provided. | [optional] |
| **projectId** | **String**| The ID of project. | [optional] |
| **issueKey** | **String**| The key of the issue. Ignored if &#x60;issueId&#x60; is provided. | [optional] |
| **issueId** | **String**| The ID of the issue. | [optional] |
| **permissions** | **String**| A list of permission keys. (Required) This parameter accepts a comma-separated list. To get the list of available permissions, use [Get all permissions](https://dac-static.atlassian.com). | [optional] |
| **projectUuid** | **String**|  | [optional] |
| **projectConfigurationUuid** | **String**|  | [optional] |
| **commentId** | **String**| The ID of the comment. | [optional] |

### Return type

[**Permissions**](Permissions.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

