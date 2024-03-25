# ProjectRolesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRole**](ProjectRolesApi.md#createRole) | **POST** /rest/api/3/role | Create project role |
| [**deleteRole**](ProjectRolesApi.md#deleteRole) | **DELETE** /rest/api/3/role/{id} | Delete project role |
| [**getProjectRoleDetails**](ProjectRolesApi.md#getProjectRoleDetails) | **GET** /rest/api/3/project/{projectIdOrKey}/role/{id} | Get project role for project |
| [**getProjectRoleList**](ProjectRolesApi.md#getProjectRoleList) | **GET** /rest/api/3/project/{projectIdOrKey}/role | Get project roles for project |
| [**getRoleById**](ProjectRolesApi.md#getRoleById) | **GET** /rest/api/3/role/{id} | Get project role by ID |
| [**getRoleDetails**](ProjectRolesApi.md#getRoleDetails) | **GET** /rest/api/3/project/{projectIdOrKey}/roledetails | Get project role details |
| [**listProjectRoles**](ProjectRolesApi.md#listProjectRoles) | **GET** /rest/api/3/role | Get all project roles |
| [**partiallyUpdateRole**](ProjectRolesApi.md#partiallyUpdateRole) | **POST** /rest/api/3/role/{id} | Partial update project role |
| [**updateRoleProperties**](ProjectRolesApi.md#updateRoleProperties) | **PUT** /rest/api/3/role/{id} | Fully update project role |


<a name="createRole"></a>
# **createRole**
> ProjectRole createRole(createUpdateRoleRequestBean).execute();

Create project role

Creates a new project role with no [default actors](https://dac-static.atlassian.com). You can use the [Add default actors to project role](https://dac-static.atlassian.com) operation to add default actors to the project role after creating it.  *Note that although a new project role is available to all projects upon creation, any default actors that are associated with the project role are not added to projects that existed prior to the role being created.*&lt;  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRolesApi;
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
    String description = "description_example"; // A description of the project role. Required when fully updating a project role. Optional when creating or partially updating a project role.
    String name = "name_example"; // The name of the project role. Must be unique. Cannot begin or end with whitespace. The maximum length is 255 characters. Required when creating a project role. Optional when partially updating a project role.
    try {
      ProjectRole result = client
              .projectRoles
              .createRole()
              .description(description)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getActors());
      System.out.println(result.getAdmin());
      System.out.println(result.getCurrentUserRole());
      System.out.println(result.getDefault());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getRoleConfigurable());
      System.out.println(result.getScope());
      System.out.println(result.getSelf());
      System.out.println(result.getTranslatedName());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#createRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectRole> response = client
              .projectRoles
              .createRole()
              .description(description)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#createRole");
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
| **createUpdateRoleRequestBean** | [**CreateUpdateRoleRequestBean**](CreateUpdateRoleRequestBean.md)|  | |

### Return type

[**ProjectRole**](ProjectRole.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. The &#x60;name&#x60; cannot be empty or start or end with whitespace. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have administrative permissions. |  -  |
| **409** | Returned if a project role with the provided name already exists. |  -  |

<a name="deleteRole"></a>
# **deleteRole**
> deleteRole(id).swap(swap).execute();

Delete project role

Deletes a project role. You must specify a replacement project role if you wish to delete a project role that is in use.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRolesApi;
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
    Long id = 56L; // The ID of the project role to delete. Use [Get all project roles](https://dac-static.atlassian.com) to get a list of project role IDs.
    Long swap = 56L; // The ID of the project role that will replace the one being deleted.
    try {
      client
              .projectRoles
              .deleteRole(id)
              .swap(swap)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#deleteRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .projectRoles
              .deleteRole(id)
              .swap(swap)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#deleteRole");
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
| **id** | **Long**| The ID of the project role to delete. Use [Get all project roles](https://dac-static.atlassian.com) to get a list of project role IDs. | |
| **swap** | **Long**| The ID of the project role that will replace the one being deleted. | [optional] |

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
| **400** | Returned if the request is invalid or if the replacement project role is not found. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have administrative permissions. |  -  |
| **404** | Returned if the project role being deleted is not found. |  -  |
| **409** | Returned if the project role being deleted is in use and a replacement project role is not specified in the request. |  -  |

<a name="getProjectRoleDetails"></a>
# **getProjectRoleDetails**
> ProjectRole getProjectRoleDetails(projectIdOrKey, id).excludeInactiveUsers(excludeInactiveUsers).execute();

Get project role for project

Returns a project role&#39;s details and actors associated with the project. The list of actors is sorted by display name.  To check whether a user belongs to a role based on their group memberships, use [Get user](https://dac-static.atlassian.com) with the &#x60;groups&#x60; expand parameter selected. Then check whether the user keys and groups match with the actors returned for the project.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRolesApi;
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
    String projectIdOrKey = "projectIdOrKey_example"; // The project ID or project key (case sensitive).
    Long id = 56L; // The ID of the project role. Use [Get all project roles](https://dac-static.atlassian.com) to get a list of project role IDs.
    Boolean excludeInactiveUsers = false; // Exclude inactive users.
    try {
      ProjectRole result = client
              .projectRoles
              .getProjectRoleDetails(projectIdOrKey, id)
              .excludeInactiveUsers(excludeInactiveUsers)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getActors());
      System.out.println(result.getAdmin());
      System.out.println(result.getCurrentUserRole());
      System.out.println(result.getDefault());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getRoleConfigurable());
      System.out.println(result.getScope());
      System.out.println(result.getSelf());
      System.out.println(result.getTranslatedName());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#getProjectRoleDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectRole> response = client
              .projectRoles
              .getProjectRoleDetails(projectIdOrKey, id)
              .excludeInactiveUsers(excludeInactiveUsers)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#getProjectRoleDetails");
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
| **projectIdOrKey** | **String**| The project ID or project key (case sensitive). | |
| **id** | **Long**| The ID of the project role. Use [Get all project roles](https://dac-static.atlassian.com) to get a list of project role IDs. | |
| **excludeInactiveUsers** | **Boolean**| Exclude inactive users. | [optional] [default to false] |

### Return type

[**ProjectRole**](ProjectRole.md)

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
| **404** | Returned if:   *  the project or project role is not found.  *  the user does not have administrative permission. |  -  |

<a name="getProjectRoleList"></a>
# **getProjectRoleList**
> Map&lt;String, URI&gt; getProjectRoleList(projectIdOrKey).execute();

Get project roles for project

Returns a list of [project roles](https://support.atlassian.com/jira-cloud-administration/docs/manage-project-roles/) for the project returning the name and self URL for each role.  Note that all project roles are shared with all projects in Jira Cloud. See [Get all project roles](https://dac-static.atlassian.com) for more information.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for any project on the site or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRolesApi;
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
    String projectIdOrKey = "projectIdOrKey_example"; // The project ID or project key (case sensitive).
    try {
      Map<String, URI> result = client
              .projectRoles
              .getProjectRoleList(projectIdOrKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#getProjectRoleList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, URI>> response = client
              .projectRoles
              .getProjectRoleList(projectIdOrKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#getProjectRoleList");
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
| **projectIdOrKey** | **String**| The project ID or project key (case sensitive). | |

### Return type

[**Map&lt;String, URI&gt;**](URI.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing or if the user lacks administrative permissions for the project. |  -  |
| **404** | Returned if the project is not found or or if the user does not have administrative permissions for the project. |  -  |

<a name="getRoleById"></a>
# **getRoleById**
> ProjectRole getRoleById(id).execute();

Get project role by ID

Gets the project role details and the default actors associated with the role. The list of default actors is sorted by display name.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRolesApi;
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
    Long id = 56L; // The ID of the project role. Use [Get all project roles](https://dac-static.atlassian.com) to get a list of project role IDs.
    try {
      ProjectRole result = client
              .projectRoles
              .getRoleById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getActors());
      System.out.println(result.getAdmin());
      System.out.println(result.getCurrentUserRole());
      System.out.println(result.getDefault());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getRoleConfigurable());
      System.out.println(result.getScope());
      System.out.println(result.getSelf());
      System.out.println(result.getTranslatedName());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#getRoleById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectRole> response = client
              .projectRoles
              .getRoleById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#getRoleById");
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
| **id** | **Long**| The ID of the project role. Use [Get all project roles](https://dac-static.atlassian.com) to get a list of project role IDs. | |

### Return type

[**ProjectRole**](ProjectRole.md)

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
| **403** | Returned if the user does not have administrative permissions. |  -  |
| **404** | Returned if the project role is not found. |  -  |

<a name="getRoleDetails"></a>
# **getRoleDetails**
> List&lt;ProjectRoleDetails&gt; getRoleDetails(projectIdOrKey).currentMember(currentMember).excludeConnectAddons(excludeConnectAddons).execute();

Get project role details

Returns all [project roles](https://support.atlassian.com/jira-cloud-administration/docs/manage-project-roles/) and the details for each role. Note that the list of project roles is common to all projects.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRolesApi;
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
    String projectIdOrKey = "projectIdOrKey_example"; // The project ID or project key (case sensitive).
    Boolean currentMember = false; // Whether the roles should be filtered to include only those the user is assigned to.
    Boolean excludeConnectAddons = false;
    try {
      List<ProjectRoleDetails> result = client
              .projectRoles
              .getRoleDetails(projectIdOrKey)
              .currentMember(currentMember)
              .excludeConnectAddons(excludeConnectAddons)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#getRoleDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ProjectRoleDetails>> response = client
              .projectRoles
              .getRoleDetails(projectIdOrKey)
              .currentMember(currentMember)
              .excludeConnectAddons(excludeConnectAddons)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#getRoleDetails");
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
| **projectIdOrKey** | **String**| The project ID or project key (case sensitive). | |
| **currentMember** | **Boolean**| Whether the roles should be filtered to include only those the user is assigned to. | [optional] [default to false] |
| **excludeConnectAddons** | **Boolean**|  | [optional] [default to false] |

### Return type

[**List&lt;ProjectRoleDetails&gt;**](ProjectRoleDetails.md)

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
| **404** | Returned if the project is not found or if the user does not have the necessary permissions for the project. |  -  |

<a name="listProjectRoles"></a>
# **listProjectRoles**
> List&lt;ProjectRole&gt; listProjectRoles().execute();

Get all project roles

Gets a list of all project roles, complete with project role details and default actors.  ### About project roles ###  [Project roles](https://support.atlassian.com/jira-cloud-administration/docs/manage-project-roles/) are a flexible way to to associate users and groups with projects. In Jira Cloud, the list of project roles is shared globally with all projects, but each project can have a different set of actors associated with it (unlike groups, which have the same membership throughout all Jira applications).  Project roles are used in [permission schemes](https://dac-static.atlassian.com), [email notification schemes](https://dac-static.atlassian.com), [issue security levels](https://dac-static.atlassian.com), [comment visibility](https://dac-static.atlassian.com), and workflow conditions.  #### Members and actors ####  In the Jira REST API, a member of a project role is called an *actor*. An *actor* is a group or user associated with a project role.  Actors may be set as [default members](https://support.atlassian.com/jira-cloud-administration/docs/manage-project-roles/#Specifying-&#39;default-members&#39;-for-a-project-role) of the project role or set at the project level:   *  Default actors: Users and groups that are assigned to the project role for all newly created projects. The default actors can be removed at the project level later if desired.  *  Actors: Users and groups that are associated with a project role for a project, which may differ from the default actors. This enables you to assign a user to different roles in different projects.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRolesApi;
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
      List<ProjectRole> result = client
              .projectRoles
              .listProjectRoles()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#listProjectRoles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ProjectRole>> response = client
              .projectRoles
              .listProjectRoles()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#listProjectRoles");
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

[**List&lt;ProjectRole&gt;**](ProjectRole.md)

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
| **403** | Returned if the user does not have administrative permissions. |  -  |

<a name="partiallyUpdateRole"></a>
# **partiallyUpdateRole**
> ProjectRole partiallyUpdateRole(id, createUpdateRoleRequestBean).execute();

Partial update project role

Updates either the project role&#39;s name or its description.  You cannot update both the name and description at the same time using this operation. If you send a request with a name and a description only the name is updated.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRolesApi;
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
    Long id = 56L; // The ID of the project role. Use [Get all project roles](https://dac-static.atlassian.com) to get a list of project role IDs.
    String description = "description_example"; // A description of the project role. Required when fully updating a project role. Optional when creating or partially updating a project role.
    String name = "name_example"; // The name of the project role. Must be unique. Cannot begin or end with whitespace. The maximum length is 255 characters. Required when creating a project role. Optional when partially updating a project role.
    try {
      ProjectRole result = client
              .projectRoles
              .partiallyUpdateRole(id)
              .description(description)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getActors());
      System.out.println(result.getAdmin());
      System.out.println(result.getCurrentUserRole());
      System.out.println(result.getDefault());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getRoleConfigurable());
      System.out.println(result.getScope());
      System.out.println(result.getSelf());
      System.out.println(result.getTranslatedName());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#partiallyUpdateRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectRole> response = client
              .projectRoles
              .partiallyUpdateRole(id)
              .description(description)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#partiallyUpdateRole");
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
| **id** | **Long**| The ID of the project role. Use [Get all project roles](https://dac-static.atlassian.com) to get a list of project role IDs. | |
| **createUpdateRoleRequestBean** | [**CreateUpdateRoleRequestBean**](CreateUpdateRoleRequestBean.md)|  | |

### Return type

[**ProjectRole**](ProjectRole.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have administrative permissions. |  -  |
| **404** | Returned if the project role is not found. |  -  |

<a name="updateRoleProperties"></a>
# **updateRoleProperties**
> ProjectRole updateRoleProperties(id, createUpdateRoleRequestBean).execute();

Fully update project role

Updates the project role&#39;s name and description. You must include both a name and a description in the request.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRolesApi;
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
    Long id = 56L; // The ID of the project role. Use [Get all project roles](https://dac-static.atlassian.com) to get a list of project role IDs.
    String description = "description_example"; // A description of the project role. Required when fully updating a project role. Optional when creating or partially updating a project role.
    String name = "name_example"; // The name of the project role. Must be unique. Cannot begin or end with whitespace. The maximum length is 255 characters. Required when creating a project role. Optional when partially updating a project role.
    try {
      ProjectRole result = client
              .projectRoles
              .updateRoleProperties(id)
              .description(description)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getActors());
      System.out.println(result.getAdmin());
      System.out.println(result.getCurrentUserRole());
      System.out.println(result.getDefault());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getRoleConfigurable());
      System.out.println(result.getScope());
      System.out.println(result.getSelf());
      System.out.println(result.getTranslatedName());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#updateRoleProperties");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectRole> response = client
              .projectRoles
              .updateRoleProperties(id)
              .description(description)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRolesApi#updateRoleProperties");
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
| **id** | **Long**| The ID of the project role. Use [Get all project roles](https://dac-static.atlassian.com) to get a list of project role IDs. | |
| **createUpdateRoleRequestBean** | [**CreateUpdateRoleRequestBean**](CreateUpdateRoleRequestBean.md)|  | |

### Return type

[**ProjectRole**](ProjectRole.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. The &#x60;name&#x60; cannot be empty or start or end with whitespace. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have administrative permissions. |  -  |
| **404** | Returned if the project role is not found. |  -  |

