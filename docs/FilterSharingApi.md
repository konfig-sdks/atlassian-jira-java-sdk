# FilterSharingApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSharePermission**](FilterSharingApi.md#addSharePermission) | **POST** /rest/api/3/filter/{id}/permission | Add share permission |
| [**deleteSharePermission**](FilterSharingApi.md#deleteSharePermission) | **DELETE** /rest/api/3/filter/{id}/permission/{permissionId} | Delete share permission |
| [**getDefaultShareScope**](FilterSharingApi.md#getDefaultShareScope) | **GET** /rest/api/3/filter/defaultShareScope | Get default share scope |
| [**getSharePermission**](FilterSharingApi.md#getSharePermission) | **GET** /rest/api/3/filter/{id}/permission/{permissionId} | Get share permission |
| [**getSharePermissions**](FilterSharingApi.md#getSharePermissions) | **GET** /rest/api/3/filter/{id}/permission | Get share permissions |
| [**setDefaultShareScope**](FilterSharingApi.md#setDefaultShareScope) | **PUT** /rest/api/3/filter/defaultShareScope | Set default share scope |


<a name="addSharePermission"></a>
# **addSharePermission**
> List&lt;SharePermission&gt; addSharePermission(id, sharePermissionInputBean).execute();

Add share permission

Add a share permissions to a filter. If you add a global share permission (one for all logged-in users or the public) it will overwrite all share permissions for the filter.  Be aware that this operation uses different objects for updating share permissions compared to [Update filter](https://dac-static.atlassian.com).  **[Permissions](https://dac-static.atlassian.com) required:** *Share dashboards and filters* [global permission](https://confluence.atlassian.com/x/x4dKLg) and the user must own the filter.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilterSharingApi;
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
    String type = "user"; // The type of the share permission.Specify the type as follows:   *  `user` Share with a user.  *  `group` Share with a group. Specify `groupname` as well.  *  `project` Share with a project. Specify `projectId` as well.  *  `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.  *  `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
    Long id = 56L; // The ID of the filter.
    String accountId = "accountId_example"; // The user account ID that the filter is shared with. For a request, specify the `accountId` property for the user.
    String groupId = "groupId_example"; // The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with `groupname`.
    String groupname = "groupname_example"; // The name of the group to share the filter with. Set `type` to `group`. Please note that the name of a group is mutable, to reliably identify a group use `groupId`.
    String projectId = "projectId_example"; // The ID of the project to share the filter with. Set `type` to `project`.
    String projectRoleId = "projectRoleId_example"; // The ID of the project role to share the filter with. Set `type` to `projectRole` and the `projectId` for the project that the role is in.
    Integer rights = 56; // The rights for the share permission.
    try {
      List<SharePermission> result = client
              .filterSharing
              .addSharePermission(type, id)
              .accountId(accountId)
              .groupId(groupId)
              .groupname(groupname)
              .projectId(projectId)
              .projectRoleId(projectRoleId)
              .rights(rights)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilterSharingApi#addSharePermission");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<SharePermission>> response = client
              .filterSharing
              .addSharePermission(type, id)
              .accountId(accountId)
              .groupId(groupId)
              .groupname(groupname)
              .projectId(projectId)
              .projectRoleId(projectRoleId)
              .rights(rights)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilterSharingApi#addSharePermission");
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
| **id** | **Long**| The ID of the filter. | |
| **sharePermissionInputBean** | [**SharePermissionInputBean**](SharePermissionInputBean.md)|  | |

### Return type

[**List&lt;SharePermission&gt;**](SharePermission.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is successful. |  -  |
| **400** | Returned if:   *  the request object is invalid. For example, it contains an invalid type, the ID does not match the type, or the project or group is not found.  *  the user does not own the filter.  *  the user does not have the required permissions. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if:   *  the filter is not found.  *  the user does not have permission to view the filter. |  -  |

<a name="deleteSharePermission"></a>
# **deleteSharePermission**
> deleteSharePermission(id, permissionId).execute();

Delete share permission

Deletes a share permission from a filter.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira and the user must own the filter.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilterSharingApi;
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
    Long id = 56L; // The ID of the filter.
    Long permissionId = 56L; // The ID of the share permission.
    try {
      client
              .filterSharing
              .deleteSharePermission(id, permissionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FilterSharingApi#deleteSharePermission");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .filterSharing
              .deleteSharePermission(id, permissionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FilterSharingApi#deleteSharePermission");
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
| **id** | **Long**| The ID of the filter. | |
| **permissionId** | **Long**| The ID of the share permission. | |

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
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if:   *  the filter is not found.  *  the user does not own the filter. |  -  |

<a name="getDefaultShareScope"></a>
# **getDefaultShareScope**
> DefaultShareScope getDefaultShareScope().execute();

Get default share scope

Returns the default sharing settings for new filters and dashboards for a user.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilterSharingApi;
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
      DefaultShareScope result = client
              .filterSharing
              .getDefaultShareScope()
              .execute();
      System.out.println(result);
      System.out.println(result.getScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilterSharingApi#getDefaultShareScope");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DefaultShareScope> response = client
              .filterSharing
              .getDefaultShareScope()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilterSharingApi#getDefaultShareScope");
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

[**DefaultShareScope**](DefaultShareScope.md)

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

<a name="getSharePermission"></a>
# **getSharePermission**
> SharePermission getSharePermission(id, permissionId).execute();

Get share permission

Returns a share permission for a filter. A filter can be shared with groups, projects, all logged-in users, or the public. Sharing with all logged-in users or the public is known as a global share permission.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None, however, a share permission is only returned for:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilterSharingApi;
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
    Long id = 56L; // The ID of the filter.
    Long permissionId = 56L; // The ID of the share permission.
    try {
      SharePermission result = client
              .filterSharing
              .getSharePermission(id, permissionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getGroup());
      System.out.println(result.getId());
      System.out.println(result.getProject());
      System.out.println(result.getRole());
      System.out.println(result.getType());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilterSharingApi#getSharePermission");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SharePermission> response = client
              .filterSharing
              .getSharePermission(id, permissionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilterSharingApi#getSharePermission");
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
| **id** | **Long**| The ID of the filter. | |
| **permissionId** | **Long**| The ID of the share permission. | |

### Return type

[**SharePermission**](SharePermission.md)

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
| **404** | Returned if:   *  the filter is not found.  *  the permission is not found.  *  the user does not have permission to view the filter. |  -  |

<a name="getSharePermissions"></a>
# **getSharePermissions**
> List&lt;SharePermission&gt; getSharePermissions(id).execute();

Get share permissions

Returns the share permissions for a filter. A filter can be shared with groups, projects, all logged-in users, or the public. Sharing with all logged-in users or the public is known as a global share permission.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None, however, share permissions are only returned for:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilterSharingApi;
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
    Long id = 56L; // The ID of the filter.
    try {
      List<SharePermission> result = client
              .filterSharing
              .getSharePermissions(id)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilterSharingApi#getSharePermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<SharePermission>> response = client
              .filterSharing
              .getSharePermissions(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilterSharingApi#getSharePermissions");
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
| **id** | **Long**| The ID of the filter. | |

### Return type

[**List&lt;SharePermission&gt;**](SharePermission.md)

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
| **404** | Returned if:   *  the filter is not found.  *  the user does not have permission to view the filter. |  -  |

<a name="setDefaultShareScope"></a>
# **setDefaultShareScope**
> DefaultShareScope setDefaultShareScope(defaultShareScope).execute();

Set default share scope

Sets the default sharing for new filters and dashboards for a user.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilterSharingApi;
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
    String scope = "GLOBAL"; // The scope of the default sharing for new filters and dashboards:   *  `AUTHENTICATED` Shared with all logged-in users.  *  `GLOBAL` Shared with all logged-in users. This shows as `AUTHENTICATED` in the response.  *  `PRIVATE` Not shared with any users.
    try {
      DefaultShareScope result = client
              .filterSharing
              .setDefaultShareScope(scope)
              .execute();
      System.out.println(result);
      System.out.println(result.getScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilterSharingApi#setDefaultShareScope");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DefaultShareScope> response = client
              .filterSharing
              .setDefaultShareScope(scope)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilterSharingApi#setDefaultShareScope");
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
| **defaultShareScope** | [**DefaultShareScope**](DefaultShareScope.md)|  | |

### Return type

[**DefaultShareScope**](DefaultShareScope.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if an invalid scope is set. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

