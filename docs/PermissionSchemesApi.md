# PermissionSchemesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPermissionGrant**](PermissionSchemesApi.md#createPermissionGrant) | **POST** /rest/api/3/permissionscheme/{schemeId}/permission | Create permission grant |
| [**createScheme**](PermissionSchemesApi.md#createScheme) | **POST** /rest/api/3/permissionscheme | Create permission scheme |
| [**deletePermissionGrant**](PermissionSchemesApi.md#deletePermissionGrant) | **DELETE** /rest/api/3/permissionscheme/{schemeId}/permission/{permissionId} | Delete permission scheme grant |
| [**deleteScheme**](PermissionSchemesApi.md#deleteScheme) | **DELETE** /rest/api/3/permissionscheme/{schemeId} | Delete permission scheme |
| [**getAll**](PermissionSchemesApi.md#getAll) | **GET** /rest/api/3/permissionscheme | Get all permission schemes |
| [**getAllGrants**](PermissionSchemesApi.md#getAllGrants) | **GET** /rest/api/3/permissionscheme/{schemeId}/permission | Get permission scheme grants |
| [**getPermissionSchemeGrant**](PermissionSchemesApi.md#getPermissionSchemeGrant) | **GET** /rest/api/3/permissionscheme/{schemeId}/permission/{permissionId} | Get permission scheme grant |
| [**getScheme**](PermissionSchemesApi.md#getScheme) | **GET** /rest/api/3/permissionscheme/{schemeId} | Get permission scheme |
| [**updateScheme**](PermissionSchemesApi.md#updateScheme) | **PUT** /rest/api/3/permissionscheme/{schemeId} | Update permission scheme |


<a name="createPermissionGrant"></a>
# **createPermissionGrant**
> PermissionGrant createPermissionGrant(schemeId, requestBody).expand(expand).execute();

Create permission grant

Creates a permission grant in a permission scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionSchemesApi;
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
    Long schemeId = 56L; // The ID of the permission scheme in which to create a new permission grant.
    PermissionHolder holder = new PermissionHolder();
    Long id = 56L; // The ID of the permission granted details.
    String permission = "permission_example"; // The permission to grant. This permission can be one of the built-in permissions or a custom permission added by an app. See [Built-in permissions](../api-group-permission-schemes/#built-in-permissions) in *Get all permission schemes* for more information about the built-in permissions. See the [project permission](https://developer.atlassian.com/cloud/jira/platform/modules/project-permission/) and [global permission](https://developer.atlassian.com/cloud/jira/platform/modules/global-permission/) module documentation for more information about custom permissions.
    URI self = new URI(); // The URL of the permission granted details.
    String expand = "expand_example"; // Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  `permissions` Returns all permission grants for each permission scheme.  *  `user` Returns information about the user who is granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `projectRole` Returns information about the project role granted the permission.  *  `field` Returns information about the custom field granted the permission.  *  `all` Returns all expandable information.
    try {
      PermissionGrant result = client
              .permissionSchemes
              .createPermissionGrant(schemeId)
              .holder(holder)
              .id(id)
              .permission(permission)
              .self(self)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getHolder());
      System.out.println(result.getId());
      System.out.println(result.getPermission());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#createPermissionGrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionGrant> response = client
              .permissionSchemes
              .createPermissionGrant(schemeId)
              .holder(holder)
              .id(id)
              .permission(permission)
              .self(self)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#createPermissionGrant");
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
| **schemeId** | **Long**| The ID of the permission scheme in which to create a new permission grant. | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| The permission grant to create. | |
| **expand** | **String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;user&#x60; Returns information about the user who is granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;all&#x60; Returns all expandable information. | [optional] |

### Return type

[**PermissionGrant**](PermissionGrant.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the scheme permission is created. |  -  |
| **400** | Returned if the value for expand is invalid or the same permission grant is present. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |

<a name="createScheme"></a>
# **createScheme**
> PermissionScheme createScheme(requestBody).expand(expand).execute();

Create permission scheme

Creates a new permission scheme. You can create a permission scheme with or without defining a set of permission grants.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionSchemesApi;
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
    String name = "name_example"; // The name of the permission scheme. Must be unique.
    String description = "description_example"; // A description for the permission scheme.
    String expand = "expand_example"; // The expand options available for the permission scheme.
    Long id = 56L; // The ID of the permission scheme.
    List<PermissionGrant> permissions = Arrays.asList(); // The permission scheme to create or update. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more information.
    Scope scope = new Scope();
    URI self = new URI(); // The URL of the permission scheme.
    String expand = "expand_example"; // Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
    try {
      PermissionScheme result = client
              .permissionSchemes
              .createScheme(name)
              .description(description)
              .expand(expand)
              .id(id)
              .permissions(permissions)
              .scope(scope)
              .self(self)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getExpand());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getPermissions());
      System.out.println(result.getScope());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#createScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionScheme> response = client
              .permissionSchemes
              .createScheme(name)
              .description(description)
              .expand(expand)
              .id(id)
              .permissions(permissions)
              .scope(scope)
              .self(self)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#createScheme");
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
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| The permission scheme to create. | |
| **expand** | **String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional] |

### Return type

[**PermissionScheme**](PermissionScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the permission scheme is created. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission or the feature is not available in the Jira plan. |  -  |

<a name="deletePermissionGrant"></a>
# **deletePermissionGrant**
> deletePermissionGrant(schemeId, permissionId).execute();

Delete permission scheme grant

Deletes a permission grant from a permission scheme. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more details.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionSchemesApi;
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
    Long schemeId = 56L; // The ID of the permission scheme to delete the permission grant from.
    Long permissionId = 56L; // The ID of the permission grant to delete.
    try {
      client
              .permissionSchemes
              .deletePermissionGrant(schemeId, permissionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#deletePermissionGrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .permissionSchemes
              .deletePermissionGrant(schemeId, permissionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#deletePermissionGrant");
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
| **schemeId** | **Long**| The ID of the permission scheme to delete the permission grant from. | |
| **permissionId** | **Long**| The ID of the permission grant to delete. | |

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
| **204** | Returned if the permission grant is deleted. |  -  |
| **400** | Returned if permission grant with the provided ID is not found. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |

<a name="deleteScheme"></a>
# **deleteScheme**
> deleteScheme(schemeId).execute();

Delete permission scheme

Deletes a permission scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionSchemesApi;
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
    Long schemeId = 56L; // The ID of the permission scheme being deleted.
    try {
      client
              .permissionSchemes
              .deleteScheme(schemeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#deleteScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .permissionSchemes
              .deleteScheme(schemeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#deleteScheme");
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
| **schemeId** | **Long**| The ID of the permission scheme being deleted. | |

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
| **204** | Returned if the permission scheme is deleted. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the permission scheme is not found. |  -  |

<a name="getAll"></a>
# **getAll**
> PermissionSchemes getAll().expand(expand).execute();

Get all permission schemes

Returns all permission schemes.  ### About permission schemes and grants ###  A permission scheme is a collection of permission grants. A permission grant consists of a &#x60;holder&#x60; and a &#x60;permission&#x60;.  #### Holder object ####  The &#x60;holder&#x60; object contains information about the user or group being granted the permission. For example, the *Administer projects* permission is granted to a group named *Teams in space administrators*. In this case, the type is &#x60;\&quot;type\&quot;: \&quot;group\&quot;&#x60;, and the parameter is the group name, &#x60;\&quot;parameter\&quot;: \&quot;Teams in space administrators\&quot;&#x60; and the value is group ID, &#x60;\&quot;value\&quot;: \&quot;ca85fac0-d974-40ca-a615-7af99c48d24f\&quot;&#x60;.  The &#x60;holder&#x60; object is defined by the following properties:   *  &#x60;type&#x60; Identifies the user or group (see the list of types below).  *  &#x60;parameter&#x60; As a group&#39;s name can change, use of &#x60;value&#x60; is recommended. The value of this property depends on the &#x60;type&#x60;. For example, if the &#x60;type&#x60; is a group, then you need to specify the group name.  *  &#x60;value&#x60; The value of this property depends on the &#x60;type&#x60;. If the &#x60;type&#x60; is a group, then you need to specify the group ID. For other &#x60;type&#x60; it has the same value as &#x60;parameter&#x60;  The following &#x60;types&#x60; are available. The expected values for &#x60;parameter&#x60; and &#x60;value&#x60; are given in parentheses (some types may not have a &#x60;parameter&#x60; or &#x60;value&#x60;):   *  &#x60;anyone&#x60; Grant for anonymous users.  *  &#x60;applicationRole&#x60; Grant for users with access to the specified application (application name, application name). See [Update product access settings](https://confluence.atlassian.com/x/3YxjL) for more information.  *  &#x60;assignee&#x60; Grant for the user currently assigned to an issue.  *  &#x60;group&#x60; Grant for the specified group (&#x60;parameter&#x60; : group name, &#x60;value&#x60; : group ID).  *  &#x60;groupCustomField&#x60; Grant for a user in the group selected in the specified custom field (&#x60;parameter&#x60; : custom field ID, &#x60;value&#x60; : custom field ID).  *  &#x60;projectLead&#x60; Grant for a project lead.  *  &#x60;projectRole&#x60; Grant for the specified project role (&#x60;parameter&#x60; :project role ID, &#x60;value&#x60; : project role ID).  *  &#x60;reporter&#x60; Grant for the user who reported the issue.  *  &#x60;sd.customer.portal.only&#x60; Jira Service Desk only. Grants customers permission to access the customer portal but not Jira. See [Customizing Jira Service Desk permissions](https://confluence.atlassian.com/x/24dKLg) for more information.  *  &#x60;user&#x60; Grant for the specified user (&#x60;parameter&#x60; : user ID - historically this was the userkey but that is deprecated and the account ID should be used, &#x60;value&#x60; : user ID).  *  &#x60;userCustomField&#x60; Grant for a user selected in the specified custom field (&#x60;parameter&#x60; : custom field ID, &#x60;value&#x60; : custom field ID).  #### Built-in permissions ####  The [built-in Jira permissions](https://confluence.atlassian.com/x/yodKLg) are listed below. Apps can also define custom permissions. See the [project permission](https://developer.atlassian.com/cloud/jira/platform/modules/project-permission/) and [global permission](https://developer.atlassian.com/cloud/jira/platform/modules/global-permission/) module documentation for more information.  **Project permissions**   *  &#x60;ADMINISTER_PROJECTS&#x60;  *  &#x60;BROWSE_PROJECTS&#x60;  *  &#x60;MANAGE_SPRINTS_PERMISSION&#x60; (Jira Software only)  *  &#x60;SERVICEDESK_AGENT&#x60; (Jira Service Desk only)  *  &#x60;VIEW_DEV_TOOLS&#x60; (Jira Software only)  *  &#x60;VIEW_READONLY_WORKFLOW&#x60;  **Issue permissions**   *  &#x60;ASSIGNABLE_USER&#x60;  *  &#x60;ASSIGN_ISSUES&#x60;  *  &#x60;CLOSE_ISSUES&#x60;  *  &#x60;CREATE_ISSUES&#x60;  *  &#x60;DELETE_ISSUES&#x60;  *  &#x60;EDIT_ISSUES&#x60;  *  &#x60;LINK_ISSUES&#x60;  *  &#x60;MODIFY_REPORTER&#x60;  *  &#x60;MOVE_ISSUES&#x60;  *  &#x60;RESOLVE_ISSUES&#x60;  *  &#x60;SCHEDULE_ISSUES&#x60;  *  &#x60;SET_ISSUE_SECURITY&#x60;  *  &#x60;TRANSITION_ISSUES&#x60;  **Voters and watchers permissions**   *  &#x60;MANAGE_WATCHERS&#x60;  *  &#x60;VIEW_VOTERS_AND_WATCHERS&#x60;  **Comments permissions**   *  &#x60;ADD_COMMENTS&#x60;  *  &#x60;DELETE_ALL_COMMENTS&#x60;  *  &#x60;DELETE_OWN_COMMENTS&#x60;  *  &#x60;EDIT_ALL_COMMENTS&#x60;  *  &#x60;EDIT_OWN_COMMENTS&#x60;  **Attachments permissions**   *  &#x60;CREATE_ATTACHMENTS&#x60;  *  &#x60;DELETE_ALL_ATTACHMENTS&#x60;  *  &#x60;DELETE_OWN_ATTACHMENTS&#x60;  **Time tracking permissions**   *  &#x60;DELETE_ALL_WORKLOGS&#x60;  *  &#x60;DELETE_OWN_WORKLOGS&#x60;  *  &#x60;EDIT_ALL_WORKLOGS&#x60;  *  &#x60;EDIT_OWN_WORKLOGS&#x60;  *  &#x60;WORK_ON_ISSUES&#x60;  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionSchemesApi;
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
    String expand = "expand_example"; // Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
    try {
      PermissionSchemes result = client
              .permissionSchemes
              .getAll()
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getPermissionSchemes());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionSchemes> response = client
              .permissionSchemes
              .getAll()
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#getAll");
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
| **expand** | **String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional] |

### Return type

[**PermissionSchemes**](PermissionSchemes.md)

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

<a name="getAllGrants"></a>
# **getAllGrants**
> PermissionGrants getAllGrants(schemeId).expand(expand).execute();

Get permission scheme grants

Returns all permission grants for a permission scheme.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionSchemesApi;
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
    Long schemeId = 56L; // The ID of the permission scheme.
    String expand = "expand_example"; // Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  `permissions` Returns all permission grants for each permission scheme.  *  `user` Returns information about the user who is granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `projectRole` Returns information about the project role granted the permission.  *  `field` Returns information about the custom field granted the permission.  *  `all` Returns all expandable information.
    try {
      PermissionGrants result = client
              .permissionSchemes
              .getAllGrants(schemeId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpand());
      System.out.println(result.getPermissions());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#getAllGrants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionGrants> response = client
              .permissionSchemes
              .getAllGrants(schemeId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#getAllGrants");
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
| **schemeId** | **Long**| The ID of the permission scheme. | |
| **expand** | **String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;user&#x60; Returns information about the user who is granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;all&#x60; Returns all expandable information. | [optional] |

### Return type

[**PermissionGrants**](PermissionGrants.md)

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
| **404** | Returned if the permission schemes is not found or the user does not have the necessary permission. |  -  |

<a name="getPermissionSchemeGrant"></a>
# **getPermissionSchemeGrant**
> PermissionGrant getPermissionSchemeGrant(schemeId, permissionId).expand(expand).execute();

Get permission scheme grant

Returns a permission grant.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionSchemesApi;
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
    Long schemeId = 56L; // The ID of the permission scheme.
    Long permissionId = 56L; // The ID of the permission grant.
    String expand = "expand_example"; // Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
    try {
      PermissionGrant result = client
              .permissionSchemes
              .getPermissionSchemeGrant(schemeId, permissionId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getHolder());
      System.out.println(result.getId());
      System.out.println(result.getPermission());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#getPermissionSchemeGrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionGrant> response = client
              .permissionSchemes
              .getPermissionSchemeGrant(schemeId, permissionId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#getPermissionSchemeGrant");
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
| **schemeId** | **Long**| The ID of the permission scheme. | |
| **permissionId** | **Long**| The ID of the permission grant. | |
| **expand** | **String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional] |

### Return type

[**PermissionGrant**](PermissionGrant.md)

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
| **404** | Returned if the permission scheme or permission grant is not found or the user does not have the necessary permission. |  -  |

<a name="getScheme"></a>
# **getScheme**
> PermissionScheme getScheme(schemeId).expand(expand).execute();

Get permission scheme

Returns a permission scheme.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionSchemesApi;
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
    Long schemeId = 56L; // The ID of the permission scheme to return.
    String expand = "expand_example"; // Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
    try {
      PermissionScheme result = client
              .permissionSchemes
              .getScheme(schemeId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getExpand());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getPermissions());
      System.out.println(result.getScope());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#getScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionScheme> response = client
              .permissionSchemes
              .getScheme(schemeId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#getScheme");
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
| **schemeId** | **Long**| The ID of the permission scheme to return. | |
| **expand** | **String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional] |

### Return type

[**PermissionScheme**](PermissionScheme.md)

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
| **404** | Returned if the permission scheme is not found or the user does not have the necessary permission. |  -  |

<a name="updateScheme"></a>
# **updateScheme**
> PermissionScheme updateScheme(schemeId, requestBody).expand(expand).execute();

Update permission scheme

Updates a permission scheme. Below are some important things to note when using this resource:   *  If a permissions list is present in the request, then it is set in the permission scheme, overwriting *all existing* grants.  *  If you want to update only the name and description, then do not send a permissions list in the request.  *  Sending an empty list will remove all permission grants from the permission scheme.  If you want to add or delete a permission grant instead of updating the whole list, see [Create permission grant](https://dac-static.atlassian.com) or [Delete permission scheme entity](https://dac-static.atlassian.com).  See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more details.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionSchemesApi;
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
    String name = "name_example"; // The name of the permission scheme. Must be unique.
    Long schemeId = 56L; // The ID of the permission scheme to update.
    String description = "description_example"; // A description for the permission scheme.
    String expand = "expand_example"; // The expand options available for the permission scheme.
    Long id = 56L; // The ID of the permission scheme.
    List<PermissionGrant> permissions = Arrays.asList(); // The permission scheme to create or update. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more information.
    Scope scope = new Scope();
    URI self = new URI(); // The URL of the permission scheme.
    String expand = "expand_example"; // Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
    try {
      PermissionScheme result = client
              .permissionSchemes
              .updateScheme(name, schemeId)
              .description(description)
              .expand(expand)
              .id(id)
              .permissions(permissions)
              .scope(scope)
              .self(self)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getExpand());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getPermissions());
      System.out.println(result.getScope());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#updateScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionScheme> response = client
              .permissionSchemes
              .updateScheme(name, schemeId)
              .description(description)
              .expand(expand)
              .id(id)
              .permissions(permissions)
              .scope(scope)
              .self(self)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionSchemesApi#updateScheme");
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
| **schemeId** | **Long**| The ID of the permission scheme to update. | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |
| **expand** | **String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional] |

### Return type

[**PermissionScheme**](PermissionScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the scheme is updated. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if:   *  the user does not have the necessary permission to update permission schemes.  *  the Jira instance is Jira Core Free or Jira Software Free. Permission schemes cannot be updated on free plans. |  -  |
| **404** | Returned if the permission scheme is not found. |  -  |

