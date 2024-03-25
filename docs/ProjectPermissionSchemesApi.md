# ProjectPermissionSchemesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignSchemeToProject**](ProjectPermissionSchemesApi.md#assignSchemeToProject) | **PUT** /rest/api/3/project/{projectKeyOrId}/permissionscheme | Assign permission scheme |
| [**getAssignedPermissionScheme**](ProjectPermissionSchemesApi.md#getAssignedPermissionScheme) | **GET** /rest/api/3/project/{projectKeyOrId}/permissionscheme | Get assigned permission scheme |
| [**getIssueSecurityLevels**](ProjectPermissionSchemesApi.md#getIssueSecurityLevels) | **GET** /rest/api/3/project/{projectKeyOrId}/securitylevel | Get project issue security levels |
| [**getIssueSecurityScheme**](ProjectPermissionSchemesApi.md#getIssueSecurityScheme) | **GET** /rest/api/3/project/{projectKeyOrId}/issuesecuritylevelscheme | Get project issue security scheme |


<a name="assignSchemeToProject"></a>
# **assignSchemeToProject**
> PermissionScheme assignSchemeToProject(projectKeyOrId, idBean).expand(expand).execute();

Assign permission scheme

Assigns a permission scheme with a project. See [Managing project permissions](https://confluence.atlassian.com/x/yodKLg) for more information about permission schemes.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectPermissionSchemesApi;
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
    Long id = 56L; // The ID of the permission scheme to associate with the project. Use the [Get all permission schemes](https://dac-static.atlassian.com) resource to get a list of permission scheme IDs.
    String projectKeyOrId = "projectKeyOrId_example"; // The project ID or project key (case sensitive).
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
    try {
      PermissionScheme result = client
              .projectPermissionSchemes
              .assignSchemeToProject(id, projectKeyOrId)
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
      System.err.println("Exception when calling ProjectPermissionSchemesApi#assignSchemeToProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionScheme> response = client
              .projectPermissionSchemes
              .assignSchemeToProject(id, projectKeyOrId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectPermissionSchemesApi#assignSchemeToProject");
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
| **projectKeyOrId** | **String**| The project ID or project key (case sensitive). | |
| **idBean** | [**IdBean**](IdBean.md)|  | |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional] |

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
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if:   *  the user does not have the necessary permission to edit the project&#39;s configuration.  *  the Jira instance is Jira Core Free or Jira Software Free. Permission schemes cannot be assigned to projects on free plans. |  -  |
| **404** | Returned if the project or permission scheme is not found. |  -  |

<a name="getAssignedPermissionScheme"></a>
# **getAssignedPermissionScheme**
> PermissionScheme getAssignedPermissionScheme(projectKeyOrId).expand(expand).execute();

Get assigned permission scheme

Gets the [permission scheme](https://confluence.atlassian.com/x/yodKLg) associated with the project.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectPermissionSchemesApi;
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
    String projectKeyOrId = "projectKeyOrId_example"; // The project ID or project key (case sensitive).
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
    try {
      PermissionScheme result = client
              .projectPermissionSchemes
              .getAssignedPermissionScheme(projectKeyOrId)
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
      System.err.println("Exception when calling ProjectPermissionSchemesApi#getAssignedPermissionScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionScheme> response = client
              .projectPermissionSchemes
              .getAssignedPermissionScheme(projectKeyOrId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectPermissionSchemesApi#getAssignedPermissionScheme");
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
| **projectKeyOrId** | **String**| The project ID or project key (case sensitive). | |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional] |

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
| **403** | Returned if the user does not have permission to view the project&#39;s configuration. |  -  |
| **404** | Returned if the project is not found or the user does not have permission to view the project. |  -  |

<a name="getIssueSecurityLevels"></a>
# **getIssueSecurityLevels**
> ProjectIssueSecurityLevels getIssueSecurityLevels(projectKeyOrId).execute();

Get project issue security levels

Returns all [issue security](https://confluence.atlassian.com/x/J4lKLg) levels for the project that the user has access to.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project, however, issue security levels are only returned for authenticated user with *Set Issue Security* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectPermissionSchemesApi;
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
    String projectKeyOrId = "projectKeyOrId_example"; // The project ID or project key (case sensitive).
    try {
      ProjectIssueSecurityLevels result = client
              .projectPermissionSchemes
              .getIssueSecurityLevels(projectKeyOrId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLevels());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectPermissionSchemesApi#getIssueSecurityLevels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectIssueSecurityLevels> response = client
              .projectPermissionSchemes
              .getIssueSecurityLevels(projectKeyOrId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectPermissionSchemesApi#getIssueSecurityLevels");
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
| **projectKeyOrId** | **String**| The project ID or project key (case sensitive). | |

### Return type

[**ProjectIssueSecurityLevels**](ProjectIssueSecurityLevels.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **404** | Returned if the project is not found or the user does not have permission to view it. |  -  |

<a name="getIssueSecurityScheme"></a>
# **getIssueSecurityScheme**
> SecurityScheme getIssueSecurityScheme(projectKeyOrId).execute();

Get project issue security scheme

Returns the [issue security scheme](https://confluence.atlassian.com/x/J4lKLg) associated with the project.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or the *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectPermissionSchemesApi;
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
    String projectKeyOrId = "projectKeyOrId_example"; // The project ID or project key (case sensitive).
    try {
      SecurityScheme result = client
              .projectPermissionSchemes
              .getIssueSecurityScheme(projectKeyOrId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getDefaultSecurityLevelId());
      System.out.println(result.getId());
      System.out.println(result.getLevels());
      System.out.println(result.getName());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectPermissionSchemesApi#getIssueSecurityScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SecurityScheme> response = client
              .projectPermissionSchemes
              .getIssueSecurityScheme(projectKeyOrId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectPermissionSchemesApi#getIssueSecurityScheme");
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
| **projectKeyOrId** | **String**| The project ID or project key (case sensitive). | |

### Return type

[**SecurityScheme**](SecurityScheme.md)

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
| **403** | Returned if the project is visible to the user but the user doesn&#39;t have administrative permissions. |  -  |
| **404** | Returned if the project is not found or the user does not have permission to view it. |  -  |

