# ProjectRoleActorsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addActorsToRole**](ProjectRoleActorsApi.md#addActorsToRole) | **POST** /rest/api/3/project/{projectIdOrKey}/role/{id} | Add actors to project role |
| [**addDefaultActorsToRole**](ProjectRoleActorsApi.md#addDefaultActorsToRole) | **POST** /rest/api/3/role/{id}/actors | Add default actors to project role |
| [**getDefaultActorsForRole**](ProjectRoleActorsApi.md#getDefaultActorsForRole) | **GET** /rest/api/3/role/{id}/actors | Get default actors for project role |
| [**removeActorsFromRole**](ProjectRoleActorsApi.md#removeActorsFromRole) | **DELETE** /rest/api/3/project/{projectIdOrKey}/role/{id} | Delete actors from project role |
| [**removeDefaultActors**](ProjectRoleActorsApi.md#removeDefaultActors) | **DELETE** /rest/api/3/role/{id}/actors | Delete default actors from project role |
| [**setActorsForRole**](ProjectRoleActorsApi.md#setActorsForRole) | **PUT** /rest/api/3/project/{projectIdOrKey}/role/{id} | Set actors for project role |


<a name="addActorsToRole"></a>
# **addActorsToRole**
> ProjectRole addActorsToRole(projectIdOrKey, id, actorsMap).execute();

Add actors to project role

Adds actors to a project role for the project.  To replace all actors for the project, use [Set actors for project role](https://dac-static.atlassian.com).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRoleActorsApi;
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
    List<String> group = Arrays.asList(); // The name of the group to add. This parameter cannot be used with the `groupId` parameter. As a group's name can change, use of `groupId` is recommended.
    List<String> groupId = Arrays.asList(); // The ID of the group to add. This parameter cannot be used with the `group` parameter.
    List<String> user = Arrays.asList(); // The user account ID of the user to add.
    try {
      ProjectRole result = client
              .projectRoleActors
              .addActorsToRole(projectIdOrKey, id)
              .group(group)
              .groupId(groupId)
              .user(user)
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
      System.err.println("Exception when calling ProjectRoleActorsApi#addActorsToRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectRole> response = client
              .projectRoleActors
              .addActorsToRole(projectIdOrKey, id)
              .group(group)
              .groupId(groupId)
              .user(user)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRoleActorsApi#addActorsToRole");
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
| **actorsMap** | [**ActorsMap**](ActorsMap.md)| The groups or users to associate with the project role for this project. Provide the user account ID, group name, or group ID. As a group&#39;s name can change, use of group ID is recommended. | |

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
| **200** | Returned if the request is successful. The complete list of actors for the project is returned.  For example, the cURL request above adds a group, *jira-developers*. For the response below to be returned as a result of that request, the user *Mia Krystof* would have previously been added as a &#x60;user&#x60; actor for this project. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing or if the calling user lacks administrative permissions for the project. |  -  |
| **404** | Returned if:   *  the project is not found.  *  the user or group is not found.  *  the group or user is not active. |  -  |

<a name="addDefaultActorsToRole"></a>
# **addDefaultActorsToRole**
> ProjectRole addDefaultActorsToRole(id, actorInputBean).execute();

Add default actors to project role

Adds [default actors](https://dac-static.atlassian.com) to a role. You may add groups or users, but you cannot add groups and users in the same request.  Changing a project role&#39;s default actors does not affect project role members for projects already created.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRoleActorsApi;
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
    List<String> group = Arrays.asList(); // The name of the group to add as a default actor. This parameter cannot be used with the `groupId` parameter. As a group's name can change,use of `groupId` is recommended. This parameter accepts a comma-separated list. For example, `\\\"group\\\":[\\\"project-admin\\\", \\\"jira-developers\\\"]`.
    List<String> groupId = Arrays.asList(); // The ID of the group to add as a default actor. This parameter cannot be used with the `group` parameter This parameter accepts a comma-separated list. For example, `\\\"groupId\\\":[\\\"77f6ab39-e755-4570-a6ae-2d7a8df0bcb8\\\", \\\"0c011f85-69ed-49c4-a801-3b18d0f771bc\\\"]`.
    List<String> user = Arrays.asList(); // The account IDs of the users to add as default actors. This parameter accepts a comma-separated list. For example, `\\\"user\\\":[\\\"5b10a2844c20165700ede21g\\\", \\\"5b109f2e9729b51b54dc274d\\\"]`.
    try {
      ProjectRole result = client
              .projectRoleActors
              .addDefaultActorsToRole(id)
              .group(group)
              .groupId(groupId)
              .user(user)
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
      System.err.println("Exception when calling ProjectRoleActorsApi#addDefaultActorsToRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectRole> response = client
              .projectRoleActors
              .addDefaultActorsToRole(id)
              .group(group)
              .groupId(groupId)
              .user(user)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRoleActorsApi#addDefaultActorsToRole");
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
| **actorInputBean** | [**ActorInputBean**](ActorInputBean.md)|  | |

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

<a name="getDefaultActorsForRole"></a>
# **getDefaultActorsForRole**
> ProjectRole getDefaultActorsForRole(id).execute();

Get default actors for project role

Returns the [default actors](https://dac-static.atlassian.com) for the project role.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRoleActorsApi;
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
              .projectRoleActors
              .getDefaultActorsForRole(id)
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
      System.err.println("Exception when calling ProjectRoleActorsApi#getDefaultActorsForRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectRole> response = client
              .projectRoleActors
              .getDefaultActorsForRole(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRoleActorsApi#getDefaultActorsForRole");
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
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have administrative permissions. |  -  |
| **404** | Returned if the project role is not found. |  -  |

<a name="removeActorsFromRole"></a>
# **removeActorsFromRole**
> removeActorsFromRole(projectIdOrKey, id).user(user).group(group).groupId(groupId).execute();

Delete actors from project role

Deletes actors from a project role for the project.  To remove default actors from the project role, use [Delete default actors from project role](https://dac-static.atlassian.com).  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRoleActorsApi;
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
    String user = "5b10ac8d82e05b22cc7d4ef5"; // The user account ID of the user to remove from the project role.
    String group = "group_example"; // The name of the group to remove from the project role. This parameter cannot be used with the `groupId` parameter. As a group's name can change, use of `groupId` is recommended.
    String groupId = "groupId_example"; // The ID of the group to remove from the project role. This parameter cannot be used with the `group` parameter.
    try {
      client
              .projectRoleActors
              .removeActorsFromRole(projectIdOrKey, id)
              .user(user)
              .group(group)
              .groupId(groupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRoleActorsApi#removeActorsFromRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .projectRoleActors
              .removeActorsFromRole(projectIdOrKey, id)
              .user(user)
              .group(group)
              .groupId(groupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRoleActorsApi#removeActorsFromRole");
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
| **user** | **String**| The user account ID of the user to remove from the project role. | [optional] |
| **group** | **String**| The name of the group to remove from the project role. This parameter cannot be used with the &#x60;groupId&#x60; parameter. As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended. | [optional] |
| **groupId** | **String**| The ID of the group to remove from the project role. This parameter cannot be used with the &#x60;group&#x60; parameter. | [optional] |

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
| **400** | Returned if the request is not valid. |  -  |
| **404** | Returned if:   *  the project or project role is not found.  *  the calling user does not have administrative permission. |  -  |

<a name="removeDefaultActors"></a>
# **removeDefaultActors**
> ProjectRole removeDefaultActors(id).user(user).groupId(groupId).group(group).execute();

Delete default actors from project role

Deletes the [default actors](https://dac-static.atlassian.com) from a project role. You may delete a group or user, but you cannot delete a group and a user in the same request.  Changing a project role&#39;s default actors does not affect project role members for projects already created.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRoleActorsApi;
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
    String user = "5b10ac8d82e05b22cc7d4ef5"; // The user account ID of the user to remove as a default actor.
    String groupId = "groupId_example"; // The group ID of the group to be removed as a default actor. This parameter cannot be used with the `group` parameter.
    String group = "group_example"; // The group name of the group to be removed as a default actor.This parameter cannot be used with the `groupId` parameter. As a group's name can change, use of `groupId` is recommended.
    try {
      ProjectRole result = client
              .projectRoleActors
              .removeDefaultActors(id)
              .user(user)
              .groupId(groupId)
              .group(group)
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
      System.err.println("Exception when calling ProjectRoleActorsApi#removeDefaultActors");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectRole> response = client
              .projectRoleActors
              .removeDefaultActors(id)
              .user(user)
              .groupId(groupId)
              .group(group)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRoleActorsApi#removeDefaultActors");
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
| **user** | **String**| The user account ID of the user to remove as a default actor. | [optional] |
| **groupId** | **String**| The group ID of the group to be removed as a default actor. This parameter cannot be used with the &#x60;group&#x60; parameter. | [optional] |
| **group** | **String**| The group name of the group to be removed as a default actor.This parameter cannot be used with the &#x60;groupId&#x60; parameter. As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended. | [optional] |

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
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have administrative permissions. |  -  |
| **404** | Returned if the project role is not found. |  -  |

<a name="setActorsForRole"></a>
# **setActorsForRole**
> ProjectRole setActorsForRole(projectIdOrKey, id, projectRoleActorsUpdateBean).execute();

Set actors for project role

Sets the actors for a project role for a project, replacing all existing actors.  To add actors to the project without overwriting the existing list, use [Add actors to project role](https://dac-static.atlassian.com).  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectRoleActorsApi;
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
    Map<String, List<String>> categorisedActors = new HashMap(); // The actors to add to the project role.  Add groups using:   *  `atlassian-group-role-actor` and a list of group names.  *  `atlassian-group-role-actor-id` and a list of group IDs.  As a group's name can change, use of `atlassian-group-role-actor-id` is recommended. For example, `\\\"atlassian-group-role-actor-id\\\":[\\\"eef79f81-0b89-4fca-a736-4be531a10869\\\",\\\"77f6ab39-e755-4570-a6ae-2d7a8df0bcb8\\\"]`.  Add users using `atlassian-user-role-actor` and a list of account IDs. For example, `\\\"atlassian-user-role-actor\\\":[\\\"12345678-9abc-def1-2345-6789abcdef12\\\", \\\"abcdef12-3456-789a-bcde-f123456789ab\\\"]`.
    Long id = 56L; // The ID of the project role. Use [Get all project roles](https://dac-static.atlassian.com) to get a list of project role IDs.
    try {
      ProjectRole result = client
              .projectRoleActors
              .setActorsForRole(projectIdOrKey, id)
              .categorisedActors(categorisedActors)
              .id(id)
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
      System.err.println("Exception when calling ProjectRoleActorsApi#setActorsForRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectRole> response = client
              .projectRoleActors
              .setActorsForRole(projectIdOrKey, id)
              .categorisedActors(categorisedActors)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectRoleActorsApi#setActorsForRole");
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
| **projectRoleActorsUpdateBean** | [**ProjectRoleActorsUpdateBean**](ProjectRoleActorsUpdateBean.md)| The groups or users to associate with the project role for this project. Provide the user account ID, group name, or group ID. As a group&#39;s name can change, use of group ID is recommended. | |

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
| **200** | Returned if the request is successful. The complete list of actors for the project is returned. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing or if the calling user lacks administrative permissions for the project. |  -  |
| **404** | Returned if:   *  the project is not found.  *  a user or group is not found.  *  a group or user is not active. |  -  |

