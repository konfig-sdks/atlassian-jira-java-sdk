# ProjectsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archiveProject**](ProjectsApi.md#archiveProject) | **POST** /rest/api/3/project/{projectIdOrKey}/archive | Archive project |
| [**createProjectBasedOnTemplate**](ProjectsApi.md#createProjectBasedOnTemplate) | **POST** /rest/api/3/project | Create project |
| [**deleteProjectAsync**](ProjectsApi.md#deleteProjectAsync) | **POST** /rest/api/3/project/{projectIdOrKey}/delete | Delete project asynchronously |
| [**deleteProjectByIdOrKey**](ProjectsApi.md#deleteProjectByIdOrKey) | **DELETE** /rest/api/3/project/{projectIdOrKey} | Delete project |
| [**getAll**](ProjectsApi.md#getAll) | **GET** /rest/api/3/project | Get all projects |
| [**getIssueTypeHierarchy**](ProjectsApi.md#getIssueTypeHierarchy) | **GET** /rest/api/3/project/{projectId}/hierarchy | Get project issue type hierarchy |
| [**getNotificationScheme**](ProjectsApi.md#getNotificationScheme) | **GET** /rest/api/3/project/{projectKeyOrId}/notificationscheme | Get project notification scheme |
| [**getProjectDetailsByIdOrKey**](ProjectsApi.md#getProjectDetailsByIdOrKey) | **GET** /rest/api/3/project/{projectIdOrKey} | Get project |
| [**getStatusesForProject**](ProjectsApi.md#getStatusesForProject) | **GET** /rest/api/3/project/{projectIdOrKey}/statuses | Get all statuses for project |
| [**listRecentProjects**](ProjectsApi.md#listRecentProjects) | **GET** /rest/api/3/project/recent | Get recent projects |
| [**listVisibleProjects**](ProjectsApi.md#listVisibleProjects) | **GET** /rest/api/3/project/search | Get projects paginated |
| [**restoreProject**](ProjectsApi.md#restoreProject) | **POST** /rest/api/3/project/{projectIdOrKey}/restore | Restore deleted or archived project |
| [**updateProjectDetails**](ProjectsApi.md#updateProjectDetails) | **PUT** /rest/api/3/project/{projectIdOrKey} | Update project |


<a name="archiveProject"></a>
# **archiveProject**
> Object archiveProject(projectIdOrKey).execute();

Archive project

Archives a project. You can&#39;t delete a project if it&#39;s archived. To delete an archived project, restore the project and then delete it. To restore a project, use the Jira UI.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
      Object result = client
              .projects
              .archiveProject(projectIdOrKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#archiveProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .projects
              .archiveProject(projectIdOrKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#archiveProject");
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

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permissions. |  -  |
| **404** | Returned if the project is not found. |  -  |

<a name="createProjectBasedOnTemplate"></a>
# **createProjectBasedOnTemplate**
> ProjectIdentifiers createProjectBasedOnTemplate(createProjectDetails).execute();

Create project

Creates a project based on a project type template, as shown in the following table:  | Project Type Key | Project Template Key |   |--|--|   | &#x60;business&#x60; | &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-content-management&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-process-control&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-procurement&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-project-management&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-task-tracking&#x60; |   | &#x60;service_desk&#x60; | &#x60;com.atlassian.servicedesk:simplified-it-service-management&#x60;, &#x60;com.atlassian.servicedesk:simplified-general-service-desk-it&#x60;, &#x60;com.atlassian.servicedesk:simplified-general-service-desk-business&#x60;, &#x60;com.atlassian.servicedesk:simplified-external-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-hr-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-facilities-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-legal-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-analytics-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-marketing-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-design-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-sales-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-blank-project-business&#x60;, &#x60;com.atlassian.servicedesk:simplified-blank-project-it&#x60;, &#x60;com.atlassian.servicedesk:simplified-finance-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-it-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-hr-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-legal-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-marketing-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-facilities-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-general-it-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-general-business-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-analytics-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-finance-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-design-service-desk&#x60;, &#x60;com.atlassian.servicedesk:next-gen-sales-service-desk&#x60; |   | &#x60;software&#x60; | &#x60;com.pyxis.greenhopper.jira:gh-simplified-agility-kanban&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-agility-scrum&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-basic&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-kanban-classic&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-scrum-classic&#x60; |   The project types are available according to the installed Jira features as follows:   *  Jira Core, the default, enables &#x60;business&#x60; projects.  *  Jira Service Management enables &#x60;service_desk&#x60; projects.  *  Jira Software enables &#x60;software&#x60; projects.  To determine which features are installed, go to **Jira settings** &gt; **Apps** &gt; **Manage apps** and review the System Apps list. To add Jira Software or Jira Service Management into a JIRA instance, use **Jira settings** &gt; **Apps** &gt; **Finding new apps**. For more information, see [Managing add-ons](https://confluence.atlassian.com/x/S31NLg).  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    String key = "key_example"; // Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
    String name = "name_example"; // The name of the project.
    String description = "description_example"; // A brief description of the project.
    String assigneeType = "PROJECT_LEAD"; // The default assignee when creating issues for this project.
    Long avatarId = 56L; // An integer value for the project's avatar.
    Long categoryId = 56L; // The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](https://dac-static.atlassian.com) operation.
    Long fieldConfigurationScheme = 56L; // The ID of the field configuration scheme for the project. Use the [Get all field configuration schemes](https://dac-static.atlassian.com) operation to get a list of field configuration scheme IDs. If you specify the field configuration scheme you cannot specify the project template key.
    Long issueSecurityScheme = 56L; // The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](https://dac-static.atlassian.com) resource to get all issue security scheme IDs.
    Long issueTypeScheme = 56L; // The ID of the issue type scheme for the project. Use the [Get all issue type schemes](https://dac-static.atlassian.com) operation to get a list of issue type scheme IDs. If you specify the issue type scheme you cannot specify the project template key.
    Long issueTypeScreenScheme = 56L; // The ID of the issue type screen scheme for the project. Use the [Get all issue type screen schemes](https://dac-static.atlassian.com) operation to get a list of issue type screen scheme IDs. If you specify the issue type screen scheme you cannot specify the project template key.
    String lead = "lead_example"; // This parameter is deprecated because of privacy changes. Use `leadAccountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Either `lead` or `leadAccountId` must be set when creating a project. Cannot be provided with `leadAccountId`.
    String leadAccountId = "leadAccountId_example"; // The account ID of the project lead. Either `lead` or `leadAccountId` must be set when creating a project. Cannot be provided with `lead`.
    Long notificationScheme = 56L; // The ID of the notification scheme for the project. Use the [Get notification schemes](https://dac-static.atlassian.com) resource to get a list of notification scheme IDs.
    Long permissionScheme = 56L; // The ID of the permission scheme for the project. Use the [Get all permission schemes](https://dac-static.atlassian.com) resource to see a list of all permission scheme IDs.
    String projectTemplateKey = "com.pyxis.greenhopper.jira:gh-simplified-agility-kanban"; // A predefined configuration for a project. The type of the `projectTemplateKey` must match with the type of the `projectTypeKey`.
    String projectTypeKey = "software"; // The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which defines the application-specific feature set. If you don't specify the project template you have to specify the project type.
    String url = "url_example"; // A link to information about this project, such as project documentation
    Long workflowScheme = 56L; // The ID of the workflow scheme for the project. Use the [Get all workflow schemes](https://dac-static.atlassian.com) operation to get a list of workflow scheme IDs. If you specify the workflow scheme you cannot specify the project template key.
    try {
      ProjectIdentifiers result = client
              .projects
              .createProjectBasedOnTemplate(key, name)
              .description(description)
              .assigneeType(assigneeType)
              .avatarId(avatarId)
              .categoryId(categoryId)
              .fieldConfigurationScheme(fieldConfigurationScheme)
              .issueSecurityScheme(issueSecurityScheme)
              .issueTypeScheme(issueTypeScheme)
              .issueTypeScreenScheme(issueTypeScreenScheme)
              .lead(lead)
              .leadAccountId(leadAccountId)
              .notificationScheme(notificationScheme)
              .permissionScheme(permissionScheme)
              .projectTemplateKey(projectTemplateKey)
              .projectTypeKey(projectTypeKey)
              .url(url)
              .workflowScheme(workflowScheme)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getKey());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProjectBasedOnTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectIdentifiers> response = client
              .projects
              .createProjectBasedOnTemplate(key, name)
              .description(description)
              .assigneeType(assigneeType)
              .avatarId(avatarId)
              .categoryId(categoryId)
              .fieldConfigurationScheme(fieldConfigurationScheme)
              .issueSecurityScheme(issueSecurityScheme)
              .issueTypeScheme(issueTypeScheme)
              .issueTypeScreenScheme(issueTypeScreenScheme)
              .lead(lead)
              .leadAccountId(leadAccountId)
              .notificationScheme(notificationScheme)
              .permissionScheme(permissionScheme)
              .projectTemplateKey(projectTemplateKey)
              .projectTypeKey(projectTypeKey)
              .url(url)
              .workflowScheme(workflowScheme)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProjectBasedOnTemplate");
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
| **createProjectDetails** | [**CreateProjectDetails**](CreateProjectDetails.md)| The JSON representation of the project being created. | |

### Return type

[**ProjectIdentifiers**](ProjectIdentifiers.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the project is created. |  -  |
| **400** | Returned if the request is not valid and the project could not be created. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have permission to create projects. |  -  |

<a name="deleteProjectAsync"></a>
# **deleteProjectAsync**
> deleteProjectAsync(projectIdOrKey).execute();

Delete project asynchronously

Deletes a project asynchronously.  This operation is:   *  transactional, that is, if part of the delete fails the project is not deleted.  *  [asynchronous](https://dac-static.atlassian.com). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](https://dac-static.atlassian.com) to obtain subsequent updates.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
      client
              .projects
              .deleteProjectAsync(projectIdOrKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProjectAsync");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .projects
              .deleteProjectAsync(projectIdOrKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProjectAsync");
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

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if the project is not found or the user does not have the necessary permission. |  -  |

<a name="deleteProjectByIdOrKey"></a>
# **deleteProjectByIdOrKey**
> deleteProjectByIdOrKey(projectIdOrKey).enableUndo(enableUndo).execute();

Delete project

Deletes a project.  You can&#39;t delete a project if it&#39;s archived. To delete an archived project, restore the project and then delete it. To restore a project, use the Jira UI.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    String projectIdOrKey = "10001"; // The project ID or project key (case sensitive).
    Boolean enableUndo = true; // Whether this project is placed in the Jira recycle bin where it will be available for restoration.
    try {
      client
              .projects
              .deleteProjectByIdOrKey(projectIdOrKey)
              .enableUndo(enableUndo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProjectByIdOrKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .projects
              .deleteProjectByIdOrKey(projectIdOrKey)
              .enableUndo(enableUndo)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProjectByIdOrKey");
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
| **enableUndo** | **Boolean**| Whether this project is placed in the Jira recycle bin where it will be available for restoration. | [optional] [default to true] |

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
| **204** | Returned if the project is deleted. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if the project is not found or the user does not have permission to delete it. |  -  |

<a name="getAll"></a>
# **getAll**
> List&lt;Project&gt; getAll().expand(expand).recent(recent).properties(properties).execute();

Get all projects

Returns all projects visible to the user. Deprecated, use [Get projects paginated](https://dac-static.atlassian.com) that supports search and pagination.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Projects are returned only where the user has *Browse Projects* or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  `description` Returns the project description.  *  `issueTypes` Returns all issue types associated with the project.  *  `lead` Returns information about the project lead.  *  `projectKeys` Returns all project keys associated with the project.
    Integer recent = 56; // Returns the user's most recently accessed projects. You may specify the number of results to return up to a maximum of 20. If access is anonymous, then the recently accessed projects are based on the current HTTP session.
    List<String> properties = Arrays.asList(""""); // A list of project properties to return for the project. This parameter accepts a comma-separated list.
    try {
      List<Project> result = client
              .projects
              .getAll()
              .expand(expand)
              .recent(recent)
              .properties(properties)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Project>> response = client
              .projects
              .getAll()
              .expand(expand)
              .recent(recent)
              .properties(properties)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getAll");
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
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  &#x60;description&#x60; Returns the project description.  *  &#x60;issueTypes&#x60; Returns all issue types associated with the project.  *  &#x60;lead&#x60; Returns information about the project lead.  *  &#x60;projectKeys&#x60; Returns all project keys associated with the project. | [optional] |
| **recent** | **Integer**| Returns the user&#39;s most recently accessed projects. You may specify the number of results to return up to a maximum of 20. If access is anonymous, then the recently accessed projects are based on the current HTTP session. | [optional] |
| **properties** | [**List&lt;String&gt;**](String.md)| A list of project properties to return for the project. This parameter accepts a comma-separated list. | [optional] |

### Return type

[**List&lt;Project&gt;**](Project.md)

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

<a name="getIssueTypeHierarchy"></a>
# **getIssueTypeHierarchy**
> ProjectIssueTypeHierarchy getIssueTypeHierarchy(projectId).execute();

Get project issue type hierarchy

Get the issue type hierarchy for a next-gen project.  The issue type hierarchy for a project consists of:   *  *Epic* at level 1 (optional).  *  One or more issue types at level 0 such as *Story*, *Task*, or *Bug*. Where the issue type *Epic* is defined, these issue types are used to break down the content of an epic.  *  *Subtask* at level -1 (optional). This issue type enables level 0 issue types to be broken down into components. Issues based on a level -1 issue type must have a parent issue.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    Long projectId = 56L; // The ID of the project.
    try {
      ProjectIssueTypeHierarchy result = client
              .projects
              .getIssueTypeHierarchy(projectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getHierarchy());
      System.out.println(result.getProjectId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getIssueTypeHierarchy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectIssueTypeHierarchy> response = client
              .projects
              .getIssueTypeHierarchy(projectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getIssueTypeHierarchy");
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
| **projectId** | **Long**| The ID of the project. | |

### Return type

[**ProjectIssueTypeHierarchy**](ProjectIssueTypeHierarchy.md)

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
| **404** | Returned if the project is not found or the user does not have the necessary permission. |  -  |

<a name="getNotificationScheme"></a>
# **getNotificationScheme**
> NotificationScheme getNotificationScheme(projectKeyOrId).expand(expand).execute();

Get project notification scheme

Gets a [notification scheme](https://confluence.atlassian.com/x/8YdKLg) associated with the project.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `all` Returns all expandable information  *  `field` Returns information about any custom fields assigned to receive an event  *  `group` Returns information about any groups assigned to receive an event  *  `notificationSchemeEvents` Returns a list of event associations. This list is returned for all expandable information  *  `projectRole` Returns information about any project roles assigned to receive an event  *  `user` Returns information about any users assigned to receive an event
    try {
      NotificationScheme result = client
              .projects
              .getNotificationScheme(projectKeyOrId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getExpand());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getNotificationSchemeEvents());
      System.out.println(result.getProjects());
      System.out.println(result.getScope());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getNotificationScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NotificationScheme> response = client
              .projects
              .getNotificationScheme(projectKeyOrId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getNotificationScheme");
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
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event  *  &#x60;user&#x60; Returns information about any users assigned to receive an event | [optional] |

### Return type

[**NotificationScheme**](NotificationScheme.md)

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
| **404** | Returned if the project is not found or the user is not an administrator. |  -  |

<a name="getProjectDetailsByIdOrKey"></a>
# **getProjectDetailsByIdOrKey**
> Project getProjectDetailsByIdOrKey(projectIdOrKey).expand(expand).properties(properties).execute();

Get project

Returns the [project details](https://confluence.atlassian.com/x/ahLpNw) for a project.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Note that the project description, issue types, and project lead are included in all responses by default. Expand options include:   *  `description` The project description.  *  `issueTypes` The issue types associated with the project.  *  `lead` The project lead.  *  `projectKeys` All project keys associated with the project.  *  `issueTypeHierarchy` The project issue type hierarchy.
    List<String> properties = Arrays.asList(""""); // A list of project properties to return for the project. This parameter accepts a comma-separated list.
    try {
      Project result = client
              .projects
              .getProjectDetailsByIdOrKey(projectIdOrKey)
              .expand(expand)
              .properties(properties)
              .execute();
      System.out.println(result);
      System.out.println(result.getComponents());
      System.out.println(result.getDescription());
      System.out.println(result.getArchived());
      System.out.println(result.getArchivedBy());
      System.out.println(result.getArchivedDate());
      System.out.println(result.getAssigneeType());
      System.out.println(result.getAvatarUrls());
      System.out.println(result.getDeleted());
      System.out.println(result.getDeletedBy());
      System.out.println(result.getDeletedDate());
      System.out.println(result.getEmail());
      System.out.println(result.getExpand());
      System.out.println(result.getFavourite());
      System.out.println(result.getId());
      System.out.println(result.getInsight());
      System.out.println(result.getIsPrivate());
      System.out.println(result.getIssueTypeHierarchy());
      System.out.println(result.getIssueTypes());
      System.out.println(result.getKey());
      System.out.println(result.getLandingPageInfo());
      System.out.println(result.getLead());
      System.out.println(result.getName());
      System.out.println(result.getPermissions());
      System.out.println(result.getProjectCategory());
      System.out.println(result.getProjectTypeKey());
      System.out.println(result.getProperties());
      System.out.println(result.getRetentionTillDate());
      System.out.println(result.getRoles());
      System.out.println(result.getSelf());
      System.out.println(result.getSimplified());
      System.out.println(result.getStyle());
      System.out.println(result.getUrl());
      System.out.println(result.getUuid());
      System.out.println(result.getVersions());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectDetailsByIdOrKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Project> response = client
              .projects
              .getProjectDetailsByIdOrKey(projectIdOrKey)
              .expand(expand)
              .properties(properties)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectDetailsByIdOrKey");
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
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Note that the project description, issue types, and project lead are included in all responses by default. Expand options include:   *  &#x60;description&#x60; The project description.  *  &#x60;issueTypes&#x60; The issue types associated with the project.  *  &#x60;lead&#x60; The project lead.  *  &#x60;projectKeys&#x60; All project keys associated with the project.  *  &#x60;issueTypeHierarchy&#x60; The project issue type hierarchy. | [optional] |
| **properties** | [**List&lt;String&gt;**](String.md)| A list of project properties to return for the project. This parameter accepts a comma-separated list. | [optional] |

### Return type

[**Project**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if the project is not found or the user does not have permission to view it. |  -  |

<a name="getStatusesForProject"></a>
# **getStatusesForProject**
> List&lt;IssueTypeWithStatus&gt; getStatusesForProject(projectIdOrKey).execute();

Get all statuses for project

Returns the valid statuses for a project. The statuses are grouped by issue type, as each project has a set of valid issue types and each issue type has a set of valid statuses.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
      List<IssueTypeWithStatus> result = client
              .projects
              .getStatusesForProject(projectIdOrKey)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getStatusesForProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<IssueTypeWithStatus>> response = client
              .projects
              .getStatusesForProject(projectIdOrKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getStatusesForProject");
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

[**List&lt;IssueTypeWithStatus&gt;**](IssueTypeWithStatus.md)

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

<a name="listRecentProjects"></a>
# **listRecentProjects**
> List&lt;Project&gt; listRecentProjects().expand(expand).properties(properties).execute();

Get recent projects

Returns a list of up to 20 projects recently viewed by the user that are still visible to the user.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Projects are returned only where the user has one of:   *  *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  `description` Returns the project description.  *  `projectKeys` Returns all project keys associated with a project.  *  `lead` Returns information about the project lead.  *  `issueTypes` Returns all issue types associated with the project.  *  `url` Returns the URL associated with the project.  *  `permissions` Returns the permissions associated with the project.  *  `insight` EXPERIMENTAL. Returns the insight details of total issue count and last issue update time for the project.  *  `*` Returns the project with all available expand options.
    List<Object> properties = null; // EXPERIMENTAL. A list of project properties to return for the project. This parameter accepts a comma-separated list. Invalid property names are ignored.
    try {
      List<Project> result = client
              .projects
              .listRecentProjects()
              .expand(expand)
              .properties(properties)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listRecentProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Project>> response = client
              .projects
              .listRecentProjects()
              .expand(expand)
              .properties(properties)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listRecentProjects");
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
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  &#x60;description&#x60; Returns the project description.  *  &#x60;projectKeys&#x60; Returns all project keys associated with a project.  *  &#x60;lead&#x60; Returns information about the project lead.  *  &#x60;issueTypes&#x60; Returns all issue types associated with the project.  *  &#x60;url&#x60; Returns the URL associated with the project.  *  &#x60;permissions&#x60; Returns the permissions associated with the project.  *  &#x60;insight&#x60; EXPERIMENTAL. Returns the insight details of total issue count and last issue update time for the project.  *  &#x60;*&#x60; Returns the project with all available expand options. | [optional] |
| **properties** | [**List&lt;Object&gt;**](Object.md)| EXPERIMENTAL. A list of project properties to return for the project. This parameter accepts a comma-separated list. Invalid property names are ignored. | [optional] |

### Return type

[**List&lt;Project&gt;**](Project.md)

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

<a name="listVisibleProjects"></a>
# **listVisibleProjects**
> PageBeanProject listVisibleProjects().startAt(startAt).maxResults(maxResults).orderBy(orderBy).id(id).keys(keys).query(query).typeKey(typeKey).categoryId(categoryId).action(action).expand(expand).status(status).properties(properties).propertyQuery(propertyQuery).execute();

Get projects paginated

Returns a [paginated](https://dac-static.atlassian.com) list of projects visible to the user.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Projects are returned only where the user has one of:   *  *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    Long startAt = 0L; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // The maximum number of items to return per page.
    String orderBy = "category"; // [Order](https://dac-static.atlassian.com) the results by a field.   *  `category` Sorts by project category. A complete list of category IDs is found using [Get all project categories](https://dac-static.atlassian.com).  *  `issueCount` Sorts by the total number of issues in each project.  *  `key` Sorts by project key.  *  `lastIssueUpdatedTime` Sorts by the last issue update time.  *  `name` Sorts by project name.  *  `owner` Sorts by project lead.  *  `archivedDate` EXPERIMENTAL. Sorts by project archived date.  *  `deletedDate` EXPERIMENTAL. Sorts by project deleted date.
    Set<Long> id = Arrays.asList(); // The project IDs to filter the results by. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&id=10001`. Up to 50 project IDs can be provided.
    Set<String> keys = Arrays.asList(""""); // The project keys to filter the results by. To include multiple keys, provide an ampersand-separated list. For example, `keys=PA&keys=PB`. Up to 50 project keys can be provided.
    String query = "query_example"; // Filter the results using a literal string. Projects with a matching `key` or `name` are returned (case insensitive).
    String typeKey = "typeKey_example"; // Orders results by the [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes). This parameter accepts a comma-separated list. Valid values are `business`, `service_desk`, and `software`.
    Long categoryId = 56L; // The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](https://dac-static.atlassian.com) operation.
    String action = "view"; // Filter results by projects for which the user can:   *  `view` the project, meaning that they have one of the following permissions:           *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  `browse` the project, meaning that they have the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  `edit` the project, meaning that they have one of the following permissions:           *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  `create` the project, meaning that they have the *Create issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the issue is created.
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  `description` Returns the project description.  *  `projectKeys` Returns all project keys associated with a project.  *  `lead` Returns information about the project lead.  *  `issueTypes` Returns all issue types associated with the project.  *  `url` Returns the URL associated with the project.  *  `insight` EXPERIMENTAL. Returns the insight details of total issue count and last issue update time for the project.
    List<String> status = Arrays.asList("live"); // EXPERIMENTAL. Filter results by project status:   *  `live` Search live projects.  *  `archived` Search archived projects.  *  `deleted` Search deleted projects, those in the recycle bin.
    List<Object> properties = null; // EXPERIMENTAL. A list of project properties to return for the project. This parameter accepts a comma-separated list.
    String propertyQuery = "propertyQuery_example"; // EXPERIMENTAL. A query string used to search properties. The query string cannot be specified using a JSON object. For example, to search for the value of `nested` from `{\"something\":{\"nested\":1,\"other\":2}}` use `[thepropertykey].something.nested=1`. Note that the propertyQuery key is enclosed in square brackets to enable searching where the propertyQuery key includes dot (.) or equals (=) characters. Note that `thepropertykey` is only returned when included in `properties`.
    try {
      PageBeanProject result = client
              .projects
              .listVisibleProjects()
              .startAt(startAt)
              .maxResults(maxResults)
              .orderBy(orderBy)
              .id(id)
              .keys(keys)
              .query(query)
              .typeKey(typeKey)
              .categoryId(categoryId)
              .action(action)
              .expand(expand)
              .status(status)
              .properties(properties)
              .propertyQuery(propertyQuery)
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
      System.err.println("Exception when calling ProjectsApi#listVisibleProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanProject> response = client
              .projects
              .listVisibleProjects()
              .startAt(startAt)
              .maxResults(maxResults)
              .orderBy(orderBy)
              .id(id)
              .keys(keys)
              .query(query)
              .typeKey(typeKey)
              .categoryId(categoryId)
              .action(action)
              .expand(expand)
              .status(status)
              .properties(properties)
              .propertyQuery(propertyQuery)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listVisibleProjects");
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
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |
| **orderBy** | **String**| [Order](https://dac-static.atlassian.com) the results by a field.   *  &#x60;category&#x60; Sorts by project category. A complete list of category IDs is found using [Get all project categories](https://dac-static.atlassian.com).  *  &#x60;issueCount&#x60; Sorts by the total number of issues in each project.  *  &#x60;key&#x60; Sorts by project key.  *  &#x60;lastIssueUpdatedTime&#x60; Sorts by the last issue update time.  *  &#x60;name&#x60; Sorts by project name.  *  &#x60;owner&#x60; Sorts by project lead.  *  &#x60;archivedDate&#x60; EXPERIMENTAL. Sorts by project archived date.  *  &#x60;deletedDate&#x60; EXPERIMENTAL. Sorts by project deleted date. | [optional] [default to key] [enum: category, -category, +category, key, -key, +key, name, -name, +name, owner, -owner, +owner, issueCount, -issueCount, +issueCount, lastIssueUpdatedDate, -lastIssueUpdatedDate, +lastIssueUpdatedDate, archivedDate, +archivedDate, -archivedDate, deletedDate, +deletedDate, -deletedDate] |
| **id** | [**Set&lt;Long&gt;**](Long.md)| The project IDs to filter the results by. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. Up to 50 project IDs can be provided. | [optional] |
| **keys** | [**Set&lt;String&gt;**](String.md)| The project keys to filter the results by. To include multiple keys, provide an ampersand-separated list. For example, &#x60;keys&#x3D;PA&amp;keys&#x3D;PB&#x60;. Up to 50 project keys can be provided. | [optional] |
| **query** | **String**| Filter the results using a literal string. Projects with a matching &#x60;key&#x60; or &#x60;name&#x60; are returned (case insensitive). | [optional] |
| **typeKey** | **String**| Orders results by the [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes). This parameter accepts a comma-separated list. Valid values are &#x60;business&#x60;, &#x60;service_desk&#x60;, and &#x60;software&#x60;. | [optional] |
| **categoryId** | **Long**| The ID of the project&#39;s category. A complete list of category IDs is found using the [Get all project categories](https://dac-static.atlassian.com) operation. | [optional] |
| **action** | **String**| Filter results by projects for which the user can:   *  &#x60;view&#x60; the project, meaning that they have one of the following permissions:           *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  &#x60;browse&#x60; the project, meaning that they have the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  &#x60;edit&#x60; the project, meaning that they have one of the following permissions:           *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  &#x60;create&#x60; the project, meaning that they have the *Create issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the issue is created. | [optional] [default to view] [enum: view, browse, edit, create] |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  &#x60;description&#x60; Returns the project description.  *  &#x60;projectKeys&#x60; Returns all project keys associated with a project.  *  &#x60;lead&#x60; Returns information about the project lead.  *  &#x60;issueTypes&#x60; Returns all issue types associated with the project.  *  &#x60;url&#x60; Returns the URL associated with the project.  *  &#x60;insight&#x60; EXPERIMENTAL. Returns the insight details of total issue count and last issue update time for the project. | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)| EXPERIMENTAL. Filter results by project status:   *  &#x60;live&#x60; Search live projects.  *  &#x60;archived&#x60; Search archived projects.  *  &#x60;deleted&#x60; Search deleted projects, those in the recycle bin. | [optional] [enum: live, archived, deleted] |
| **properties** | [**List&lt;Object&gt;**](Object.md)| EXPERIMENTAL. A list of project properties to return for the project. This parameter accepts a comma-separated list. | [optional] |
| **propertyQuery** | **String**| EXPERIMENTAL. A query string used to search properties. The query string cannot be specified using a JSON object. For example, to search for the value of &#x60;nested&#x60; from &#x60;{\&quot;something\&quot;:{\&quot;nested\&quot;:1,\&quot;other\&quot;:2}}&#x60; use &#x60;[thepropertykey].something.nested&#x3D;1&#x60;. Note that the propertyQuery key is enclosed in square brackets to enable searching where the propertyQuery key includes dot (.) or equals (&#x3D;) characters. Note that &#x60;thepropertykey&#x60; is only returned when included in &#x60;properties&#x60;. | [optional] |

### Return type

[**PageBeanProject**](PageBeanProject.md)

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
| **404** | Returned if no projects matching the search criteria are found. |  -  |

<a name="restoreProject"></a>
# **restoreProject**
> Project restoreProject(projectIdOrKey).execute();

Restore deleted or archived project

Restores a project that has been archived or placed in the Jira recycle bin.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg)for Company managed projects.  *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project for Team managed projects.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
      Project result = client
              .projects
              .restoreProject(projectIdOrKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getComponents());
      System.out.println(result.getDescription());
      System.out.println(result.getArchived());
      System.out.println(result.getArchivedBy());
      System.out.println(result.getArchivedDate());
      System.out.println(result.getAssigneeType());
      System.out.println(result.getAvatarUrls());
      System.out.println(result.getDeleted());
      System.out.println(result.getDeletedBy());
      System.out.println(result.getDeletedDate());
      System.out.println(result.getEmail());
      System.out.println(result.getExpand());
      System.out.println(result.getFavourite());
      System.out.println(result.getId());
      System.out.println(result.getInsight());
      System.out.println(result.getIsPrivate());
      System.out.println(result.getIssueTypeHierarchy());
      System.out.println(result.getIssueTypes());
      System.out.println(result.getKey());
      System.out.println(result.getLandingPageInfo());
      System.out.println(result.getLead());
      System.out.println(result.getName());
      System.out.println(result.getPermissions());
      System.out.println(result.getProjectCategory());
      System.out.println(result.getProjectTypeKey());
      System.out.println(result.getProperties());
      System.out.println(result.getRetentionTillDate());
      System.out.println(result.getRoles());
      System.out.println(result.getSelf());
      System.out.println(result.getSimplified());
      System.out.println(result.getStyle());
      System.out.println(result.getUrl());
      System.out.println(result.getUuid());
      System.out.println(result.getVersions());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#restoreProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Project> response = client
              .projects
              .restoreProject(projectIdOrKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#restoreProject");
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

[**Project**](Project.md)

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
| **404** | Returned if the project is not found or the user does not have the necessary permission. |  -  |

<a name="updateProjectDetails"></a>
# **updateProjectDetails**
> Project updateProjectDetails(projectIdOrKey, updateProjectDetails).expand(expand).execute();

Update project

Updates the [project details](https://confluence.atlassian.com/x/ahLpNw) of a project.  All parameters are optional in the body of the request. Schemes will only be updated if they are included in the request, any omitted schemes will be left unchanged.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). is only needed when changing the schemes or project key. Otherwise you will only need *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    String projectIdOrKey = "10001"; // The project ID or project key (case sensitive).
    String description = "description_example"; // A brief description of the project.
    String assigneeType = "PROJECT_LEAD"; // The default assignee when creating issues for this project.
    Long avatarId = 56L; // An integer value for the project's avatar.
    Long categoryId = 56L; // The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](https://dac-static.atlassian.com) operation. To remove the project category from the project, set the value to `-1.`
    Long issueSecurityScheme = 56L; // The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](https://dac-static.atlassian.com) resource to get all issue security scheme IDs.
    String key = "key_example"; // Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
    String lead = "lead_example"; // This parameter is deprecated because of privacy changes. Use `leadAccountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with `leadAccountId`.
    String leadAccountId = "leadAccountId_example"; // The account ID of the project lead. Cannot be provided with `lead`.
    String name = "name_example"; // The name of the project.
    Long notificationScheme = 56L; // The ID of the notification scheme for the project. Use the [Get notification schemes](https://dac-static.atlassian.com) resource to get a list of notification scheme IDs.
    Long permissionScheme = 56L; // The ID of the permission scheme for the project. Use the [Get all permission schemes](https://dac-static.atlassian.com) resource to see a list of all permission scheme IDs.
    String url = "url_example"; // A link to information about this project, such as project documentation
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Note that the project description, issue types, and project lead are included in all responses by default. Expand options include:   *  `description` The project description.  *  `issueTypes` The issue types associated with the project.  *  `lead` The project lead.  *  `projectKeys` All project keys associated with the project.
    try {
      Project result = client
              .projects
              .updateProjectDetails(projectIdOrKey)
              .description(description)
              .assigneeType(assigneeType)
              .avatarId(avatarId)
              .categoryId(categoryId)
              .issueSecurityScheme(issueSecurityScheme)
              .key(key)
              .lead(lead)
              .leadAccountId(leadAccountId)
              .name(name)
              .notificationScheme(notificationScheme)
              .permissionScheme(permissionScheme)
              .url(url)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getComponents());
      System.out.println(result.getDescription());
      System.out.println(result.getArchived());
      System.out.println(result.getArchivedBy());
      System.out.println(result.getArchivedDate());
      System.out.println(result.getAssigneeType());
      System.out.println(result.getAvatarUrls());
      System.out.println(result.getDeleted());
      System.out.println(result.getDeletedBy());
      System.out.println(result.getDeletedDate());
      System.out.println(result.getEmail());
      System.out.println(result.getExpand());
      System.out.println(result.getFavourite());
      System.out.println(result.getId());
      System.out.println(result.getInsight());
      System.out.println(result.getIsPrivate());
      System.out.println(result.getIssueTypeHierarchy());
      System.out.println(result.getIssueTypes());
      System.out.println(result.getKey());
      System.out.println(result.getLandingPageInfo());
      System.out.println(result.getLead());
      System.out.println(result.getName());
      System.out.println(result.getPermissions());
      System.out.println(result.getProjectCategory());
      System.out.println(result.getProjectTypeKey());
      System.out.println(result.getProperties());
      System.out.println(result.getRetentionTillDate());
      System.out.println(result.getRoles());
      System.out.println(result.getSelf());
      System.out.println(result.getSimplified());
      System.out.println(result.getStyle());
      System.out.println(result.getUrl());
      System.out.println(result.getUuid());
      System.out.println(result.getVersions());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateProjectDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Project> response = client
              .projects
              .updateProjectDetails(projectIdOrKey)
              .description(description)
              .assigneeType(assigneeType)
              .avatarId(avatarId)
              .categoryId(categoryId)
              .issueSecurityScheme(issueSecurityScheme)
              .key(key)
              .lead(lead)
              .leadAccountId(leadAccountId)
              .name(name)
              .notificationScheme(notificationScheme)
              .permissionScheme(permissionScheme)
              .url(url)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateProjectDetails");
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
| **updateProjectDetails** | [**UpdateProjectDetails**](UpdateProjectDetails.md)| The project details to be updated. | |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Note that the project description, issue types, and project lead are included in all responses by default. Expand options include:   *  &#x60;description&#x60; The project description.  *  &#x60;issueTypes&#x60; The issue types associated with the project.  *  &#x60;lead&#x60; The project lead.  *  &#x60;projectKeys&#x60; All project keys associated with the project. | [optional] |

### Return type

[**Project**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the project is updated. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if:   *  the user does not have the necessary permission to update project details.  *  the permission scheme is being changed and the Jira instance is Jira Core Free or Jira Software Free. Permission schemes cannot be changed on free plans. |  -  |
| **404** | Returned if the project is not found. |  -  |

