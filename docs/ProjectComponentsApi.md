# ProjectComponentsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createComponent**](ProjectComponentsApi.md#createComponent) | **POST** /rest/api/3/component | Create component |
| [**deleteComponentById**](ProjectComponentsApi.md#deleteComponentById) | **DELETE** /rest/api/3/component/{id} | Delete component |
| [**findComponentsForProjects**](ProjectComponentsApi.md#findComponentsForProjects) | **GET** /rest/api/3/component | Find components for projects |
| [**getById**](ProjectComponentsApi.md#getById) | **GET** /rest/api/3/component/{id} | Get component |
| [**getRelatedIssueCounts**](ProjectComponentsApi.md#getRelatedIssueCounts) | **GET** /rest/api/3/component/{id}/relatedIssueCounts | Get component issues count |
| [**listComponents**](ProjectComponentsApi.md#listComponents) | **GET** /rest/api/3/project/{projectIdOrKey}/components | Get project components |
| [**listPaginated**](ProjectComponentsApi.md#listPaginated) | **GET** /rest/api/3/project/{projectIdOrKey}/component | Get project components paginated |
| [**updateComponentById**](ProjectComponentsApi.md#updateComponentById) | **PUT** /rest/api/3/component/{id} | Update component |


<a name="createComponent"></a>
# **createComponent**
> ProjectComponent createComponent(projectComponent).execute();

Create component

Creates a component. Use components to provide containers for issues within a project. Use components to provide containers for issues within a project.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the component is created or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectComponentsApi;
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
    String description = "description_example"; // The description for the component. Optional when creating or updating a component.
    String ari = "ari_example"; // Compass component's ID. Can't be updated. Not required for creating a Project Component.
    User assignee = new User(); // The details of the user associated with `assigneeType`, if any. See `realAssignee` for details of the user assigned to issues created with this component.
    String assigneeType = "PROJECT_DEFAULT"; // The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: `PROJECT_DEFAULT`.   Optional when creating or updating a component.
    String id = "id_example"; // The unique identifier for the component.
    Boolean isAssigneeTypeValid = true; // Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.
    User lead = new User(); // The user details for the component's lead user.
    String leadAccountId = "leadAccountId_example"; // The accountId of the component's lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
    String leadUserName = "leadUserName_example"; // This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    Map<String, String> metadata = new HashMap(); // Compass component's metadata. Can't be updated. Not required for creating a Project Component.
    String name = "name_example"; // The unique name for the component in the project. Required when creating a component. Optional when updating a component. The maximum length is 255 characters.
    String project = "project_example"; // The key of the project the component is assigned to. Required when creating a component. Can't be updated.
    Long projectId = 56L; // The ID of the project the component is assigned to.
    User realAssignee = new User(); // The user assigned to issues created with this component, when `assigneeType` does not identify a valid assignee.
    String realAssigneeType = "PROJECT_DEFAULT"; // The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true.
    URI self = new URI(); // The URL of the component.
    try {
      ProjectComponent result = client
              .projectComponents
              .createComponent()
              .description(description)
              .ari(ari)
              .assignee(assignee)
              .assigneeType(assigneeType)
              .id(id)
              .isAssigneeTypeValid(isAssigneeTypeValid)
              .lead(lead)
              .leadAccountId(leadAccountId)
              .leadUserName(leadUserName)
              .metadata(metadata)
              .name(name)
              .project(project)
              .projectId(projectId)
              .realAssignee(realAssignee)
              .realAssigneeType(realAssigneeType)
              .self(self)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAri());
      System.out.println(result.getAssignee());
      System.out.println(result.getAssigneeType());
      System.out.println(result.getId());
      System.out.println(result.getIsAssigneeTypeValid());
      System.out.println(result.getLead());
      System.out.println(result.getLeadAccountId());
      System.out.println(result.getLeadUserName());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getProject());
      System.out.println(result.getProjectId());
      System.out.println(result.getRealAssignee());
      System.out.println(result.getRealAssigneeType());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectComponentsApi#createComponent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectComponent> response = client
              .projectComponents
              .createComponent()
              .description(description)
              .ari(ari)
              .assignee(assignee)
              .assigneeType(assigneeType)
              .id(id)
              .isAssigneeTypeValid(isAssigneeTypeValid)
              .lead(lead)
              .leadAccountId(leadAccountId)
              .leadUserName(leadUserName)
              .metadata(metadata)
              .name(name)
              .project(project)
              .projectId(projectId)
              .realAssignee(realAssignee)
              .realAssigneeType(realAssigneeType)
              .self(self)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectComponentsApi#createComponent");
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
| **projectComponent** | [**ProjectComponent**](ProjectComponent.md)|  | |

### Return type

[**ProjectComponent**](ProjectComponent.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is successful. |  -  |
| **400** | Returned if:   *  the user is not found.  *  &#x60;name&#x60; is not provided.  *  &#x60;name&#x60; is over 255 characters in length.  *  &#x60;projectId&#x60; is not provided.  *  &#x60;assigneeType&#x60; is an invalid value. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have permission to manage the project containing the component or does not have permission to administer Jira. |  -  |
| **404** | Returned if the project is not found or the user does not have permission to browse the project containing the component. |  -  |

<a name="deleteComponentById"></a>
# **deleteComponentById**
> deleteComponentById(id).moveIssuesTo(moveIssuesTo).execute();

Delete component

Deletes a component.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectComponentsApi;
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
    String id = "id_example"; // The ID of the component.
    String moveIssuesTo = "moveIssuesTo_example"; // The ID of the component to replace the deleted component. If this value is null no replacement is made.
    try {
      client
              .projectComponents
              .deleteComponentById(id)
              .moveIssuesTo(moveIssuesTo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectComponentsApi#deleteComponentById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .projectComponents
              .deleteComponentById(id)
              .moveIssuesTo(moveIssuesTo)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectComponentsApi#deleteComponentById");
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
| **id** | **String**| The ID of the component. | |
| **moveIssuesTo** | **String**| The ID of the component to replace the deleted component. If this value is null no replacement is made. | [optional] |

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
| **403** | Returned if the user does not have permission to manage the project containing the component or does not have permission to administer Jira. |  -  |
| **404** | Returned if:   *  the component is not found.  *  the replacement component is not found.  *  the user does not have permission to browse the project containing the component. |  -  |

<a name="findComponentsForProjects"></a>
# **findComponentsForProjects**
> PageBean2ComponentJsonBean findComponentsForProjects(projectIdsOrKeys).startAt(startAt).maxResults(maxResults).orderBy(orderBy).query(query).execute();

Find components for projects

Returns a [paginated](https://dac-static.atlassian.com) list of all components in a project, including global (Compass) components when applicable.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectComponentsApi;
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
    List<String> projectIdsOrKeys = Arrays.asList(); // The project IDs and/or project keys (case sensitive).
    Long startAt = 0L; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // The maximum number of items to return per page.
    String orderBy = "description"; // [Order](https://dac-static.atlassian.com) the results by a field:   *  `description` Sorts by the component description.  *  `name` Sorts by component name.
    String query = "query_example"; // Filter the results using a literal string. Components with a matching `name` or `description` are returned (case insensitive).
    try {
      PageBean2ComponentJsonBean result = client
              .projectComponents
              .findComponentsForProjects(projectIdsOrKeys)
              .startAt(startAt)
              .maxResults(maxResults)
              .orderBy(orderBy)
              .query(query)
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
      System.err.println("Exception when calling ProjectComponentsApi#findComponentsForProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBean2ComponentJsonBean> response = client
              .projectComponents
              .findComponentsForProjects(projectIdsOrKeys)
              .startAt(startAt)
              .maxResults(maxResults)
              .orderBy(orderBy)
              .query(query)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectComponentsApi#findComponentsForProjects");
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
| **projectIdsOrKeys** | [**List&lt;String&gt;**](String.md)| The project IDs and/or project keys (case sensitive). | |
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |
| **orderBy** | **String**| [Order](https://dac-static.atlassian.com) the results by a field:   *  &#x60;description&#x60; Sorts by the component description.  *  &#x60;name&#x60; Sorts by component name. | [optional] [enum: description, -description, +description, name, -name, +name] |
| **query** | **String**| Filter the results using a literal string. Components with a matching &#x60;name&#x60; or &#x60;description&#x60; are returned (case insensitive). | [optional] |

### Return type

[**PageBean2ComponentJsonBean**](PageBean2ComponentJsonBean.md)

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
| **404** | Returned if the project is not found or the user does not have permission to view it. |  -  |

<a name="getById"></a>
# **getById**
> ProjectComponent getById(id).execute();

Get component

Returns a component.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for project containing the component.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectComponentsApi;
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
    String id = "id_example"; // The ID of the component.
    try {
      ProjectComponent result = client
              .projectComponents
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAri());
      System.out.println(result.getAssignee());
      System.out.println(result.getAssigneeType());
      System.out.println(result.getId());
      System.out.println(result.getIsAssigneeTypeValid());
      System.out.println(result.getLead());
      System.out.println(result.getLeadAccountId());
      System.out.println(result.getLeadUserName());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getProject());
      System.out.println(result.getProjectId());
      System.out.println(result.getRealAssignee());
      System.out.println(result.getRealAssigneeType());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectComponentsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectComponent> response = client
              .projectComponents
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectComponentsApi#getById");
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
| **id** | **String**| The ID of the component. | |

### Return type

[**ProjectComponent**](ProjectComponent.md)

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
| **404** | Returned if the component is not found or the user does not have permission to browse the project containing the component. |  -  |

<a name="getRelatedIssueCounts"></a>
# **getRelatedIssueCounts**
> ComponentIssuesCount getRelatedIssueCounts(id).execute();

Get component issues count

Returns the counts of issues assigned to the component.  This operation can be accessed anonymously.  **Deprecation notice:** The required OAuth 2.0 scopes will be updated on June 15, 2024.   *  **Classic**: &#x60;read:jira-work&#x60;  *  **Granular**: &#x60;read:field:jira&#x60;, &#x60;read:project.component:jira&#x60;  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectComponentsApi;
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
    String id = "id_example"; // The ID of the component.
    try {
      ComponentIssuesCount result = client
              .projectComponents
              .getRelatedIssueCounts(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getIssueCount());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectComponentsApi#getRelatedIssueCounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ComponentIssuesCount> response = client
              .projectComponents
              .getRelatedIssueCounts(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectComponentsApi#getRelatedIssueCounts");
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
| **id** | **String**| The ID of the component. | |

### Return type

[**ComponentIssuesCount**](ComponentIssuesCount.md)

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
| **404** | Returned if the component is not found. |  -  |

<a name="listComponents"></a>
# **listComponents**
> List&lt;ProjectComponent&gt; listComponents(projectIdOrKey).componentSource(componentSource).execute();

Get project components

Returns all components in a project. See the [Get project components paginated](https://dac-static.atlassian.com) resource if you want to get a full list of components with pagination.  If your project uses Compass components, this API will return a paginated list of Compass components that are linked to issues in that project.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectComponentsApi;
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
    String componentSource = "jira"; // The source of the components to return. Can be `jira` (default), `compass` or `auto`. When `auto` is specified, the API will return connected Compass components if the project is opted into Compass, otherwise it will return Jira components. Defaults to `jira`.
    try {
      List<ProjectComponent> result = client
              .projectComponents
              .listComponents(projectIdOrKey)
              .componentSource(componentSource)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectComponentsApi#listComponents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ProjectComponent>> response = client
              .projectComponents
              .listComponents(projectIdOrKey)
              .componentSource(componentSource)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectComponentsApi#listComponents");
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
| **componentSource** | **String**| The source of the components to return. Can be &#x60;jira&#x60; (default), &#x60;compass&#x60; or &#x60;auto&#x60;. When &#x60;auto&#x60; is specified, the API will return connected Compass components if the project is opted into Compass, otherwise it will return Jira components. Defaults to &#x60;jira&#x60;. | [optional] [default to jira] [enum: jira, compass, auto] |

### Return type

[**List&lt;ProjectComponent&gt;**](ProjectComponent.md)

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
| **404** | Returned if the project is not found or the user does not have permission to view it. |  -  |

<a name="listPaginated"></a>
# **listPaginated**
> PageBeanComponentWithIssueCount listPaginated(projectIdOrKey).startAt(startAt).maxResults(maxResults).orderBy(orderBy).componentSource(componentSource).query(query).execute();

Get project components paginated

Returns a [paginated](https://dac-static.atlassian.com) list of all components in a project. See the [Get project components](https://dac-static.atlassian.com) resource if you want to get a full list of versions without pagination.  If your project uses Compass components, this API will return a list of Compass components that are linked to issues in that project.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectComponentsApi;
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
    Long startAt = 0L; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // The maximum number of items to return per page.
    String orderBy = "description"; // [Order](https://dac-static.atlassian.com) the results by a field:   *  `description` Sorts by the component description.  *  `issueCount` Sorts by the count of issues associated with the component.  *  `lead` Sorts by the user key of the component's project lead.  *  `name` Sorts by component name.
    String componentSource = "jira"; // The source of the components to return. Can be `jira` (default), `compass` or `auto`. When `auto` is specified, the API will return connected Compass components if the project is opted into Compass, otherwise it will return Jira components. Defaults to `jira`.
    String query = "query_example"; // Filter the results using a literal string. Components with a matching `name` or `description` are returned (case insensitive).
    try {
      PageBeanComponentWithIssueCount result = client
              .projectComponents
              .listPaginated(projectIdOrKey)
              .startAt(startAt)
              .maxResults(maxResults)
              .orderBy(orderBy)
              .componentSource(componentSource)
              .query(query)
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
      System.err.println("Exception when calling ProjectComponentsApi#listPaginated");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanComponentWithIssueCount> response = client
              .projectComponents
              .listPaginated(projectIdOrKey)
              .startAt(startAt)
              .maxResults(maxResults)
              .orderBy(orderBy)
              .componentSource(componentSource)
              .query(query)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectComponentsApi#listPaginated");
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
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |
| **orderBy** | **String**| [Order](https://dac-static.atlassian.com) the results by a field:   *  &#x60;description&#x60; Sorts by the component description.  *  &#x60;issueCount&#x60; Sorts by the count of issues associated with the component.  *  &#x60;lead&#x60; Sorts by the user key of the component&#39;s project lead.  *  &#x60;name&#x60; Sorts by component name. | [optional] [enum: description, -description, +description, issueCount, -issueCount, +issueCount, lead, -lead, +lead, name, -name, +name] |
| **componentSource** | **String**| The source of the components to return. Can be &#x60;jira&#x60; (default), &#x60;compass&#x60; or &#x60;auto&#x60;. When &#x60;auto&#x60; is specified, the API will return connected Compass components if the project is opted into Compass, otherwise it will return Jira components. Defaults to &#x60;jira&#x60;. | [optional] [default to jira] [enum: jira, compass, auto] |
| **query** | **String**| Filter the results using a literal string. Components with a matching &#x60;name&#x60; or &#x60;description&#x60; are returned (case insensitive). | [optional] |

### Return type

[**PageBeanComponentWithIssueCount**](PageBeanComponentWithIssueCount.md)

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
| **404** | Returned if the project is not found or the user does not have permission to view it. |  -  |

<a name="updateComponentById"></a>
# **updateComponentById**
> ProjectComponent updateComponentById(id, projectComponent).execute();

Update component

Updates a component. Any fields included in the request are overwritten. If &#x60;leadAccountId&#x60; is an empty string (\&quot;\&quot;) the component lead is removed.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectComponentsApi;
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
    String id = "id_example"; // The ID of the component.
    String description = "description_example"; // The description for the component. Optional when creating or updating a component.
    String ari = "ari_example"; // Compass component's ID. Can't be updated. Not required for creating a Project Component.
    User assignee = new User(); // The details of the user associated with `assigneeType`, if any. See `realAssignee` for details of the user assigned to issues created with this component.
    String assigneeType = "PROJECT_DEFAULT"; // The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: `PROJECT_DEFAULT`.   Optional when creating or updating a component.
    String id = "id_example"; // The unique identifier for the component.
    Boolean isAssigneeTypeValid = true; // Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.
    User lead = new User(); // The user details for the component's lead user.
    String leadAccountId = "leadAccountId_example"; // The accountId of the component's lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
    String leadUserName = "leadUserName_example"; // This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    Map<String, String> metadata = new HashMap(); // Compass component's metadata. Can't be updated. Not required for creating a Project Component.
    String name = "name_example"; // The unique name for the component in the project. Required when creating a component. Optional when updating a component. The maximum length is 255 characters.
    String project = "project_example"; // The key of the project the component is assigned to. Required when creating a component. Can't be updated.
    Long projectId = 56L; // The ID of the project the component is assigned to.
    User realAssignee = new User(); // The user assigned to issues created with this component, when `assigneeType` does not identify a valid assignee.
    String realAssigneeType = "PROJECT_DEFAULT"; // The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true.
    URI self = new URI(); // The URL of the component.
    try {
      ProjectComponent result = client
              .projectComponents
              .updateComponentById(id)
              .description(description)
              .ari(ari)
              .assignee(assignee)
              .assigneeType(assigneeType)
              .id(id)
              .isAssigneeTypeValid(isAssigneeTypeValid)
              .lead(lead)
              .leadAccountId(leadAccountId)
              .leadUserName(leadUserName)
              .metadata(metadata)
              .name(name)
              .project(project)
              .projectId(projectId)
              .realAssignee(realAssignee)
              .realAssigneeType(realAssigneeType)
              .self(self)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAri());
      System.out.println(result.getAssignee());
      System.out.println(result.getAssigneeType());
      System.out.println(result.getId());
      System.out.println(result.getIsAssigneeTypeValid());
      System.out.println(result.getLead());
      System.out.println(result.getLeadAccountId());
      System.out.println(result.getLeadUserName());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getProject());
      System.out.println(result.getProjectId());
      System.out.println(result.getRealAssignee());
      System.out.println(result.getRealAssigneeType());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectComponentsApi#updateComponentById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectComponent> response = client
              .projectComponents
              .updateComponentById(id)
              .description(description)
              .ari(ari)
              .assignee(assignee)
              .assigneeType(assigneeType)
              .id(id)
              .isAssigneeTypeValid(isAssigneeTypeValid)
              .lead(lead)
              .leadAccountId(leadAccountId)
              .leadUserName(leadUserName)
              .metadata(metadata)
              .name(name)
              .project(project)
              .projectId(projectId)
              .realAssignee(realAssignee)
              .realAssigneeType(realAssigneeType)
              .self(self)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectComponentsApi#updateComponentById");
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
| **id** | **String**| The ID of the component. | |
| **projectComponent** | [**ProjectComponent**](ProjectComponent.md)|  | |

### Return type

[**ProjectComponent**](ProjectComponent.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if:   *  the user is not found.  *  &#x60;assigneeType&#x60; is an invalid value.  *  &#x60;name&#x60; is over 255 characters in length. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have permission to manage the project containing the component or does not have permission to administer Jira. |  -  |
| **404** | Returned if the component is not found or the user does not have permission to browse the project containing the component. |  -  |

