# WorkflowSchemesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkGetWorkflowSchemes**](WorkflowSchemesApi.md#bulkGetWorkflowSchemes) | **POST** /rest/api/3/workflowscheme/read | Bulk get workflow schemes |
| [**createScheme**](WorkflowSchemesApi.md#createScheme) | **POST** /rest/api/3/workflowscheme | Create workflow scheme |
| [**deleteIssueTypeWorkflowMapping**](WorkflowSchemesApi.md#deleteIssueTypeWorkflowMapping) | **DELETE** /rest/api/3/workflowscheme/{id}/issuetype/{issueType} | Delete workflow for issue type in workflow scheme |
| [**deleteIssueTypesForWorkflowInScheme**](WorkflowSchemesApi.md#deleteIssueTypesForWorkflowInScheme) | **DELETE** /rest/api/3/workflowscheme/{id}/workflow | Delete issue types for workflow in workflow scheme |
| [**deleteScheme**](WorkflowSchemesApi.md#deleteScheme) | **DELETE** /rest/api/3/workflowscheme/{id} | Delete workflow scheme |
| [**getAll**](WorkflowSchemesApi.md#getAll) | **GET** /rest/api/3/workflowscheme | Get all workflow schemes |
| [**getDefaultWorkflow**](WorkflowSchemesApi.md#getDefaultWorkflow) | **GET** /rest/api/3/workflowscheme/{id}/default | Get default workflow |
| [**getIssueTypeWorkflow**](WorkflowSchemesApi.md#getIssueTypeWorkflow) | **GET** /rest/api/3/workflowscheme/{id}/issuetype/{issueType} | Get workflow for issue type in workflow scheme |
| [**getIssueTypesForWorkflowsInScheme**](WorkflowSchemesApi.md#getIssueTypesForWorkflowsInScheme) | **GET** /rest/api/3/workflowscheme/{id}/workflow | Get issue types for workflows in workflow scheme |
| [**getRequiredStatusMappings**](WorkflowSchemesApi.md#getRequiredStatusMappings) | **POST** /rest/api/3/workflowscheme/update/mappings | Get required status mappings for workflow scheme update |
| [**getSchemeById**](WorkflowSchemesApi.md#getSchemeById) | **GET** /rest/api/3/workflowscheme/{id} | Get workflow scheme |
| [**resetDefaultWorkflow**](WorkflowSchemesApi.md#resetDefaultWorkflow) | **DELETE** /rest/api/3/workflowscheme/{id}/default | Delete default workflow |
| [**setIssueTypeWorkflow**](WorkflowSchemesApi.md#setIssueTypeWorkflow) | **PUT** /rest/api/3/workflowscheme/{id}/issuetype/{issueType} | Set workflow for issue type in workflow scheme |
| [**setIssueTypesForWorkflowInScheme**](WorkflowSchemesApi.md#setIssueTypesForWorkflowInScheme) | **PUT** /rest/api/3/workflowscheme/{id}/workflow | Set issue types for workflow in workflow scheme |
| [**updateDefaultWorkflow**](WorkflowSchemesApi.md#updateDefaultWorkflow) | **PUT** /rest/api/3/workflowscheme/{id}/default | Update default workflow |
| [**updateScheme**](WorkflowSchemesApi.md#updateScheme) | **POST** /rest/api/3/workflowscheme/update | Update workflow scheme |
| [**updateScheme_0**](WorkflowSchemesApi.md#updateScheme_0) | **PUT** /rest/api/3/workflowscheme/{id} | Classic update workflow scheme |


<a name="bulkGetWorkflowSchemes"></a>
# **bulkGetWorkflowSchemes**
> List&lt;WorkflowSchemeReadResponse&gt; bulkGetWorkflowSchemes(workflowSchemeReadRequest).expand(expand).execute();

Bulk get workflow schemes

Returns a list of workflow schemes by providing workflow scheme IDs or project IDs.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer Jira* global permission to access all, including project-scoped, workflow schemes  *  *Administer projects* project permissions to access project-scoped workflow schemes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    List<String> projectIds = Arrays.asList(); // The list of project IDs to query.
    List<String> workflowSchemeIds = Arrays.asList(); // The list of workflow scheme IDs to query.
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `workflows.usages` Returns the project and issue types that each workflow in the workflow scheme is associated with.
    try {
      List<WorkflowSchemeReadResponse> result = client
              .workflowSchemes
              .bulkGetWorkflowSchemes()
              .projectIds(projectIds)
              .workflowSchemeIds(workflowSchemeIds)
              .expand(expand)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#bulkGetWorkflowSchemes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<WorkflowSchemeReadResponse>> response = client
              .workflowSchemes
              .bulkGetWorkflowSchemes()
              .projectIds(projectIds)
              .workflowSchemeIds(workflowSchemeIds)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#bulkGetWorkflowSchemes");
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
| **workflowSchemeReadRequest** | [**WorkflowSchemeReadRequest**](WorkflowSchemeReadRequest.md)|  | |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;workflows.usages&#x60; Returns the project and issue types that each workflow in the workflow scheme is associated with. | [optional] |

### Return type

[**List&lt;WorkflowSchemeReadResponse&gt;**](WorkflowSchemeReadResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing, or the caller doesn&#39;t have permissions to perform the operation. |  -  |

<a name="createScheme"></a>
# **createScheme**
> WorkflowScheme createScheme(workflowScheme).execute();

Create workflow scheme

Creates a workflow scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    String description = "description_example"; // The description of the workflow scheme.
    String defaultWorkflow = "defaultWorkflow_example"; // The name of the default workflow for the workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira. If `defaultWorkflow` is not specified when creating a workflow scheme, it is set to *Jira Workflow (jira)*.
    Boolean draft = true; // Whether the workflow scheme is a draft or not.
    Long id = 56L; // The ID of the workflow scheme.
    Map<String, String> issueTypeMappings = new HashMap(); // The issue type to workflow mappings, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
    Map<String, IssueTypeDetails> issueTypes = new HashMap(); // The issue types available in Jira.
    String lastModified = "lastModified_example"; // The date-time that the draft workflow scheme was last modified. A modification is a change to the issue type-project mappings only. This property does not apply to non-draft workflows.
    User lastModifiedUser = new User(); // The user that last modified the draft workflow scheme. A modification is a change to the issue type-project mappings only. This property does not apply to non-draft workflows.
    String name = "name_example"; // The name of the workflow scheme. The name must be unique. The maximum length is 255 characters. Required when creating a workflow scheme.
    String originalDefaultWorkflow = "originalDefaultWorkflow_example"; // For draft workflow schemes, this property is the name of the default workflow for the original workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira.
    Map<String, String> originalIssueTypeMappings = new HashMap(); // For draft workflow schemes, this property is the issue type to workflow mappings for the original workflow scheme, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
    URI self = new URI();
    Boolean updateDraftIfNeeded = true; // Whether to create or update a draft workflow scheme when updating an active workflow scheme. An active workflow scheme is a workflow scheme that is used by at least one project. The following examples show how this property works:   *  Update an active workflow scheme with `updateDraftIfNeeded` set to `true`: If a draft workflow scheme exists, it is updated. Otherwise, a draft workflow scheme is created.  *  Update an active workflow scheme with `updateDraftIfNeeded` set to `false`: An error is returned, as active workflow schemes cannot be updated.  *  Update an inactive workflow scheme with `updateDraftIfNeeded` set to `true`: The workflow scheme is updated, as inactive workflow schemes do not require drafts to update.  Defaults to `false`.
    try {
      WorkflowScheme result = client
              .workflowSchemes
              .createScheme()
              .description(description)
              .defaultWorkflow(defaultWorkflow)
              .draft(draft)
              .id(id)
              .issueTypeMappings(issueTypeMappings)
              .issueTypes(issueTypes)
              .lastModified(lastModified)
              .lastModifiedUser(lastModifiedUser)
              .name(name)
              .originalDefaultWorkflow(originalDefaultWorkflow)
              .originalIssueTypeMappings(originalIssueTypeMappings)
              .self(self)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getDefaultWorkflow());
      System.out.println(result.getDraft());
      System.out.println(result.getId());
      System.out.println(result.getIssueTypeMappings());
      System.out.println(result.getIssueTypes());
      System.out.println(result.getLastModified());
      System.out.println(result.getLastModifiedUser());
      System.out.println(result.getName());
      System.out.println(result.getOriginalDefaultWorkflow());
      System.out.println(result.getOriginalIssueTypeMappings());
      System.out.println(result.getSelf());
      System.out.println(result.getUpdateDraftIfNeeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#createScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemes
              .createScheme()
              .description(description)
              .defaultWorkflow(defaultWorkflow)
              .draft(draft)
              .id(id)
              .issueTypeMappings(issueTypeMappings)
              .issueTypes(issueTypes)
              .lastModified(lastModified)
              .lastModifiedUser(lastModifiedUser)
              .name(name)
              .originalDefaultWorkflow(originalDefaultWorkflow)
              .originalIssueTypeMappings(originalIssueTypeMappings)
              .self(self)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#createScheme");
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
| **workflowScheme** | [**WorkflowScheme**](WorkflowScheme.md)|  | |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

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
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |

<a name="deleteIssueTypeWorkflowMapping"></a>
# **deleteIssueTypeWorkflowMapping**
> WorkflowScheme deleteIssueTypeWorkflowMapping(id, issueType).updateDraftIfNeeded(updateDraftIfNeeded).execute();

Delete workflow for issue type in workflow scheme

Deletes the issue type-workflow mapping for an issue type in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the issue type-workflow mapping deleted. The draft workflow scheme can be published in Jira.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    Long id = 56L; // The ID of the workflow scheme.
    String issueType = "issueType_example"; // The ID of the issue type.
    Boolean updateDraftIfNeeded = false; // Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to `false`.
    try {
      WorkflowScheme result = client
              .workflowSchemes
              .deleteIssueTypeWorkflowMapping(id, issueType)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getDefaultWorkflow());
      System.out.println(result.getDraft());
      System.out.println(result.getId());
      System.out.println(result.getIssueTypeMappings());
      System.out.println(result.getIssueTypes());
      System.out.println(result.getLastModified());
      System.out.println(result.getLastModifiedUser());
      System.out.println(result.getName());
      System.out.println(result.getOriginalDefaultWorkflow());
      System.out.println(result.getOriginalIssueTypeMappings());
      System.out.println(result.getSelf());
      System.out.println(result.getUpdateDraftIfNeeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#deleteIssueTypeWorkflowMapping");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemes
              .deleteIssueTypeWorkflowMapping(id, issueType)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#deleteIssueTypeWorkflowMapping");
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
| **id** | **Long**| The ID of the workflow scheme. | |
| **issueType** | **String**| The ID of the issue type. | |
| **updateDraftIfNeeded** | **Boolean**| Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;. | [optional] [default to false] |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the workflow cannot be edited and &#x60;updateDraftIfNeeded&#x60; is false. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the workflow scheme or issue type is not found. |  -  |

<a name="deleteIssueTypesForWorkflowInScheme"></a>
# **deleteIssueTypesForWorkflowInScheme**
> deleteIssueTypesForWorkflowInScheme(id, workflowName).updateDraftIfNeeded(updateDraftIfNeeded).execute();

Delete issue types for workflow in workflow scheme

Deletes the workflow-issue type mapping for a workflow in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the workflow-issue type mapping deleted. The draft workflow scheme can be published in Jira.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    Long id = 56L; // The ID of the workflow scheme.
    String workflowName = "workflowName_example"; // The name of the workflow.
    Boolean updateDraftIfNeeded = false; // Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to `false`.
    try {
      client
              .workflowSchemes
              .deleteIssueTypesForWorkflowInScheme(id, workflowName)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#deleteIssueTypesForWorkflowInScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .workflowSchemes
              .deleteIssueTypesForWorkflowInScheme(id, workflowName)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#deleteIssueTypesForWorkflowInScheme");
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
| **id** | **Long**| The ID of the workflow scheme. | |
| **workflowName** | **String**| The name of the workflow. | |
| **updateDraftIfNeeded** | **Boolean**| Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;. | [optional] [default to false] |

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
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the workflow cannot be edited and &#x60;updateDraftIfNeeded&#x60; is not true. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if any of the following is true:   *  The workflow scheme is not found.  *  The workflow is not found.  *  The workflow is not specified. |  -  |

<a name="deleteScheme"></a>
# **deleteScheme**
> Object deleteScheme(id).execute();

Delete workflow scheme

Deletes a workflow scheme. Note that a workflow scheme cannot be deleted if it is active (that is, being used by at least one project).  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    Long id = 56L; // The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as `schemeId`. For example, *schemeId=10301*.
    try {
      Object result = client
              .workflowSchemes
              .deleteScheme(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#deleteScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .workflowSchemes
              .deleteScheme(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#deleteScheme");
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
| **id** | **Long**| The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*. | |

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
| **400** | Returned if the scheme is active. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the workflow scheme is not found. |  -  |

<a name="getAll"></a>
# **getAll**
> PageBeanWorkflowScheme getAll().startAt(startAt).maxResults(maxResults).execute();

Get all workflow schemes

Returns a [paginated](https://dac-static.atlassian.com) list of all workflow schemes, not including draft workflow schemes.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    try {
      PageBeanWorkflowScheme result = client
              .workflowSchemes
              .getAll()
              .startAt(startAt)
              .maxResults(maxResults)
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
      System.err.println("Exception when calling WorkflowSchemesApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanWorkflowScheme> response = client
              .workflowSchemes
              .getAll()
              .startAt(startAt)
              .maxResults(maxResults)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#getAll");
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

### Return type

[**PageBeanWorkflowScheme**](PageBeanWorkflowScheme.md)

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

<a name="getDefaultWorkflow"></a>
# **getDefaultWorkflow**
> DefaultWorkflow getDefaultWorkflow(id).returnDraftIfExists(returnDraftIfExists).execute();

Get default workflow

Returns the default workflow for a workflow scheme. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    Long id = 56L; // The ID of the workflow scheme.
    Boolean returnDraftIfExists = false; // Set to `true` to return the default workflow for the workflow scheme's draft rather than scheme itself. If the workflow scheme does not have a draft, then the default workflow for the workflow scheme is returned.
    try {
      DefaultWorkflow result = client
              .workflowSchemes
              .getDefaultWorkflow(id)
              .returnDraftIfExists(returnDraftIfExists)
              .execute();
      System.out.println(result);
      System.out.println(result.getUpdateDraftIfNeeded());
      System.out.println(result.getWorkflow());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#getDefaultWorkflow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DefaultWorkflow> response = client
              .workflowSchemes
              .getDefaultWorkflow(id)
              .returnDraftIfExists(returnDraftIfExists)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#getDefaultWorkflow");
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
| **id** | **Long**| The ID of the workflow scheme. | |
| **returnDraftIfExists** | **Boolean**| Set to &#x60;true&#x60; to return the default workflow for the workflow scheme&#39;s draft rather than scheme itself. If the workflow scheme does not have a draft, then the default workflow for the workflow scheme is returned. | [optional] [default to false] |

### Return type

[**DefaultWorkflow**](DefaultWorkflow.md)

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
| **404** | Returned if the workflow scheme is not found. |  -  |

<a name="getIssueTypeWorkflow"></a>
# **getIssueTypeWorkflow**
> IssueTypeWorkflowMapping getIssueTypeWorkflow(id, issueType).returnDraftIfExists(returnDraftIfExists).execute();

Get workflow for issue type in workflow scheme

Returns the issue type-workflow mapping for an issue type in a workflow scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    Long id = 56L; // The ID of the workflow scheme.
    String issueType = "issueType_example"; // The ID of the issue type.
    Boolean returnDraftIfExists = false; // Returns the mapping from the workflow scheme's draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned.
    try {
      IssueTypeWorkflowMapping result = client
              .workflowSchemes
              .getIssueTypeWorkflow(id, issueType)
              .returnDraftIfExists(returnDraftIfExists)
              .execute();
      System.out.println(result);
      System.out.println(result.getIssueType());
      System.out.println(result.getUpdateDraftIfNeeded());
      System.out.println(result.getWorkflow());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#getIssueTypeWorkflow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueTypeWorkflowMapping> response = client
              .workflowSchemes
              .getIssueTypeWorkflow(id, issueType)
              .returnDraftIfExists(returnDraftIfExists)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#getIssueTypeWorkflow");
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
| **id** | **Long**| The ID of the workflow scheme. | |
| **issueType** | **String**| The ID of the issue type. | |
| **returnDraftIfExists** | **Boolean**| Returns the mapping from the workflow scheme&#39;s draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned. | [optional] [default to false] |

### Return type

[**IssueTypeWorkflowMapping**](IssueTypeWorkflowMapping.md)

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
| **404** | Returned if the workflow scheme or issue type is not found. |  -  |

<a name="getIssueTypesForWorkflowsInScheme"></a>
# **getIssueTypesForWorkflowsInScheme**
> IssueTypesWorkflowMapping getIssueTypesForWorkflowsInScheme(id).workflowName(workflowName).returnDraftIfExists(returnDraftIfExists).execute();

Get issue types for workflows in workflow scheme

Returns the workflow-issue type mappings for a workflow scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    Long id = 56L; // The ID of the workflow scheme.
    String workflowName = "workflowName_example"; // The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow.
    Boolean returnDraftIfExists = false; // Returns the mapping from the workflow scheme's draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned.
    try {
      IssueTypesWorkflowMapping result = client
              .workflowSchemes
              .getIssueTypesForWorkflowsInScheme(id)
              .workflowName(workflowName)
              .returnDraftIfExists(returnDraftIfExists)
              .execute();
      System.out.println(result);
      System.out.println(result.getDefaultMapping());
      System.out.println(result.getIssueTypes());
      System.out.println(result.getUpdateDraftIfNeeded());
      System.out.println(result.getWorkflow());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#getIssueTypesForWorkflowsInScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueTypesWorkflowMapping> response = client
              .workflowSchemes
              .getIssueTypesForWorkflowsInScheme(id)
              .workflowName(workflowName)
              .returnDraftIfExists(returnDraftIfExists)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#getIssueTypesForWorkflowsInScheme");
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
| **id** | **Long**| The ID of the workflow scheme. | |
| **workflowName** | **String**| The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow. | [optional] |
| **returnDraftIfExists** | **Boolean**| Returns the mapping from the workflow scheme&#39;s draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned. | [optional] [default to false] |

### Return type

[**IssueTypesWorkflowMapping**](IssueTypesWorkflowMapping.md)

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
| **404** | Returned if either the workflow scheme or workflow is not found. |  -  |

<a name="getRequiredStatusMappings"></a>
# **getRequiredStatusMappings**
> WorkflowSchemeUpdateRequiredMappingsResponse getRequiredStatusMappings(workflowSchemeUpdateRequiredMappingsRequest).execute();

Get required status mappings for workflow scheme update

Gets the required status mappings for the desired changes to a workflow scheme. The results are provided per issue type and workflow. When updating a workflow scheme, status mappings can be provided per issue type, per workflow, or both.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer Jira* permission to update all, including global-scoped, workflow schemes.  *  *Administer projects* project permission to update project-scoped workflow schemes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    String id = "id_example"; // The ID of the workflow scheme.
    List<WorkflowSchemeAssociation> workflowsForIssueTypes = Arrays.asList(); // The new workflow to issue type mappings for this workflow scheme.
    String defaultWorkflowId = "defaultWorkflowId_example"; // The ID of the new default workflow for this workflow scheme. Only used in global-scoped workflow schemes. If it isn't specified, is set to *Jira Workflow (jira)*.
    try {
      WorkflowSchemeUpdateRequiredMappingsResponse result = client
              .workflowSchemes
              .getRequiredStatusMappings(id, workflowsForIssueTypes)
              .defaultWorkflowId(defaultWorkflowId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatusMappingsByIssueTypes());
      System.out.println(result.getStatusMappingsByWorkflows());
      System.out.println(result.getStatuses());
      System.out.println(result.getStatusesPerWorkflow());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#getRequiredStatusMappings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowSchemeUpdateRequiredMappingsResponse> response = client
              .workflowSchemes
              .getRequiredStatusMappings(id, workflowsForIssueTypes)
              .defaultWorkflowId(defaultWorkflowId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#getRequiredStatusMappings");
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
| **workflowSchemeUpdateRequiredMappingsRequest** | [**WorkflowSchemeUpdateRequiredMappingsRequest**](WorkflowSchemeUpdateRequiredMappingsRequest.md)|  | |

### Return type

[**WorkflowSchemeUpdateRequiredMappingsResponse**](WorkflowSchemeUpdateRequiredMappingsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing, or the caller doesn&#39;t have permissions to perform the operation. |  -  |

<a name="getSchemeById"></a>
# **getSchemeById**
> WorkflowScheme getSchemeById(id).returnDraftIfExists(returnDraftIfExists).execute();

Get workflow scheme

Returns a workflow scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    Long id = 56L; // The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as `schemeId`. For example, *schemeId=10301*.
    Boolean returnDraftIfExists = false; // Returns the workflow scheme's draft rather than scheme itself, if set to true. If the workflow scheme does not have a draft, then the workflow scheme is returned.
    try {
      WorkflowScheme result = client
              .workflowSchemes
              .getSchemeById(id)
              .returnDraftIfExists(returnDraftIfExists)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getDefaultWorkflow());
      System.out.println(result.getDraft());
      System.out.println(result.getId());
      System.out.println(result.getIssueTypeMappings());
      System.out.println(result.getIssueTypes());
      System.out.println(result.getLastModified());
      System.out.println(result.getLastModifiedUser());
      System.out.println(result.getName());
      System.out.println(result.getOriginalDefaultWorkflow());
      System.out.println(result.getOriginalIssueTypeMappings());
      System.out.println(result.getSelf());
      System.out.println(result.getUpdateDraftIfNeeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#getSchemeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemes
              .getSchemeById(id)
              .returnDraftIfExists(returnDraftIfExists)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#getSchemeById");
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
| **id** | **Long**| The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*. | |
| **returnDraftIfExists** | **Boolean**| Returns the workflow scheme&#39;s draft rather than scheme itself, if set to true. If the workflow scheme does not have a draft, then the workflow scheme is returned. | [optional] [default to false] |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

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
| **404** | Returned if the workflow scheme is not found. |  -  |

<a name="resetDefaultWorkflow"></a>
# **resetDefaultWorkflow**
> WorkflowScheme resetDefaultWorkflow(id).updateDraftIfNeeded(updateDraftIfNeeded).execute();

Delete default workflow

Resets the default workflow for a workflow scheme. That is, the default workflow is set to Jira&#39;s system workflow (the *jira* workflow).  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the default workflow reset. The draft workflow scheme can be published in Jira.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    Long id = 56L; // The ID of the workflow scheme.
    Boolean updateDraftIfNeeded = true; // Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to `false`.
    try {
      WorkflowScheme result = client
              .workflowSchemes
              .resetDefaultWorkflow(id)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getDefaultWorkflow());
      System.out.println(result.getDraft());
      System.out.println(result.getId());
      System.out.println(result.getIssueTypeMappings());
      System.out.println(result.getIssueTypes());
      System.out.println(result.getLastModified());
      System.out.println(result.getLastModifiedUser());
      System.out.println(result.getName());
      System.out.println(result.getOriginalDefaultWorkflow());
      System.out.println(result.getOriginalIssueTypeMappings());
      System.out.println(result.getSelf());
      System.out.println(result.getUpdateDraftIfNeeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#resetDefaultWorkflow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemes
              .resetDefaultWorkflow(id)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#resetDefaultWorkflow");
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
| **id** | **Long**| The ID of the workflow scheme. | |
| **updateDraftIfNeeded** | **Boolean**| Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;. | [optional] |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the workflow scheme cannot be edited and &#x60;updateDraftIfNeeded&#x60; is not &#x60;true&#x60;. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the workflow scheme is not found. |  -  |

<a name="setIssueTypeWorkflow"></a>
# **setIssueTypeWorkflow**
> WorkflowScheme setIssueTypeWorkflow(id, issueType, issueTypeWorkflowMapping).execute();

Set workflow for issue type in workflow scheme

Sets the workflow for an issue type in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request body and a draft workflow scheme is created or updated with the new issue type-workflow mapping. The draft workflow scheme can be published in Jira.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    Long id = 56L; // The ID of the workflow scheme.
    String issueType = "issueType_example"; // The ID of the issue type.
    String issueType = "issueType_example"; // The ID of the issue type. Not required if updating the issue type-workflow mapping.
    Boolean updateDraftIfNeeded = true; // Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to `false`. Only applicable when updating the workflow-issue types mapping.
    String workflow = "workflow_example"; // The name of the workflow.
    try {
      WorkflowScheme result = client
              .workflowSchemes
              .setIssueTypeWorkflow(id, issueType)
              .issueType(issueType)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .workflow(workflow)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getDefaultWorkflow());
      System.out.println(result.getDraft());
      System.out.println(result.getId());
      System.out.println(result.getIssueTypeMappings());
      System.out.println(result.getIssueTypes());
      System.out.println(result.getLastModified());
      System.out.println(result.getLastModifiedUser());
      System.out.println(result.getName());
      System.out.println(result.getOriginalDefaultWorkflow());
      System.out.println(result.getOriginalIssueTypeMappings());
      System.out.println(result.getSelf());
      System.out.println(result.getUpdateDraftIfNeeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#setIssueTypeWorkflow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemes
              .setIssueTypeWorkflow(id, issueType)
              .issueType(issueType)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .workflow(workflow)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#setIssueTypeWorkflow");
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
| **id** | **Long**| The ID of the workflow scheme. | |
| **issueType** | **String**| The ID of the issue type. | |
| **issueTypeWorkflowMapping** | [**IssueTypeWorkflowMapping**](IssueTypeWorkflowMapping.md)| The issue type-project mapping. | |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the workflow cannot be edited and &#x60;updateDraftIfNeeded&#x60; is false. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the workflow scheme or issue type is not found. |  -  |

<a name="setIssueTypesForWorkflowInScheme"></a>
# **setIssueTypesForWorkflowInScheme**
> WorkflowScheme setIssueTypesForWorkflowInScheme(id, workflowName, issueTypesWorkflowMapping).execute();

Set issue types for workflow in workflow scheme

Sets the issue types for a workflow in a workflow scheme. The workflow can also be set as the default workflow for the workflow scheme. Unmapped issues types are mapped to the default workflow.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request body and a draft workflow scheme is created or updated with the new workflow-issue types mappings. The draft workflow scheme can be published in Jira.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    Long id = 56L; // The ID of the workflow scheme.
    String workflowName = "workflowName_example"; // The name of the workflow.
    Boolean defaultMapping = true; // Whether the workflow is the default workflow for the workflow scheme.
    List<String> issueTypes = Arrays.asList(); // The list of issue type IDs.
    Boolean updateDraftIfNeeded = true; // Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new workflow-issue types mapping. Defaults to `false`.
    String workflow = "workflow_example"; // The name of the workflow. Optional if updating the workflow-issue types mapping.
    try {
      WorkflowScheme result = client
              .workflowSchemes
              .setIssueTypesForWorkflowInScheme(id, workflowName)
              .defaultMapping(defaultMapping)
              .issueTypes(issueTypes)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .workflow(workflow)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getDefaultWorkflow());
      System.out.println(result.getDraft());
      System.out.println(result.getId());
      System.out.println(result.getIssueTypeMappings());
      System.out.println(result.getIssueTypes());
      System.out.println(result.getLastModified());
      System.out.println(result.getLastModifiedUser());
      System.out.println(result.getName());
      System.out.println(result.getOriginalDefaultWorkflow());
      System.out.println(result.getOriginalIssueTypeMappings());
      System.out.println(result.getSelf());
      System.out.println(result.getUpdateDraftIfNeeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#setIssueTypesForWorkflowInScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemes
              .setIssueTypesForWorkflowInScheme(id, workflowName)
              .defaultMapping(defaultMapping)
              .issueTypes(issueTypes)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .workflow(workflow)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#setIssueTypesForWorkflowInScheme");
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
| **id** | **Long**| The ID of the workflow scheme. | |
| **workflowName** | **String**| The name of the workflow. | |
| **issueTypesWorkflowMapping** | [**IssueTypesWorkflowMapping**](IssueTypesWorkflowMapping.md)|  | |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

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
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if any of the following is true:   *  The workflow scheme is not found.  *  The workflow is not found.  *  The workflow is not specified. |  -  |

<a name="updateDefaultWorkflow"></a>
# **updateDefaultWorkflow**
> WorkflowScheme updateDefaultWorkflow(id, defaultWorkflow).execute();

Update default workflow

Sets the default workflow for a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request object and a draft workflow scheme is created or updated with the new default workflow. The draft workflow scheme can be published in Jira.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    String workflow = "workflow_example"; // The name of the workflow to set as the default workflow.
    Long id = 56L; // The ID of the workflow scheme.
    Boolean updateDraftIfNeeded = true; // Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to `false`.
    try {
      WorkflowScheme result = client
              .workflowSchemes
              .updateDefaultWorkflow(workflow, id)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getDefaultWorkflow());
      System.out.println(result.getDraft());
      System.out.println(result.getId());
      System.out.println(result.getIssueTypeMappings());
      System.out.println(result.getIssueTypes());
      System.out.println(result.getLastModified());
      System.out.println(result.getLastModifiedUser());
      System.out.println(result.getName());
      System.out.println(result.getOriginalDefaultWorkflow());
      System.out.println(result.getOriginalIssueTypeMappings());
      System.out.println(result.getSelf());
      System.out.println(result.getUpdateDraftIfNeeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#updateDefaultWorkflow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemes
              .updateDefaultWorkflow(workflow, id)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#updateDefaultWorkflow");
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
| **id** | **Long**| The ID of the workflow scheme. | |
| **defaultWorkflow** | [**DefaultWorkflow**](DefaultWorkflow.md)| The new default workflow. | |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the workflow scheme cannot be edited and &#x60;updateDraftIfNeeded&#x60; is not &#x60;true&#x60;. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the workflow scheme is not found. |  -  |

<a name="updateScheme"></a>
# **updateScheme**
> Object updateScheme(requestBody).execute();

Update workflow scheme

Updates company-managed and team-managed project workflow schemes. This API doesn&#39;t have a concept of draft, so any changes made to a workflow scheme are immediately available. When changing the available statuses for issue types, an [asynchronous task](https://dac-static.atlassian.com) migrates the issues as defined in the provided mappings.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer Jira* project permission to update all, including global-scoped, workflow schemes.  *  *Administer projects* project permission to update project-scoped workflow schemes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    String description = "description_example"; // The new description for this workflow scheme.
    DocumentVersion version = new DocumentVersion();
    String id = "id_example"; // The ID of this workflow scheme.
    String name = "name_example"; // The new name for this workflow scheme.
    String defaultWorkflowId = "defaultWorkflowId_example"; // The ID of the workflow for issue types without having a mapping defined in this workflow scheme. Only used in global-scoped workflow schemes. If the `defaultWorkflowId` isn't specified, this is set to *Jira Workflow (jira)*.
    List<MappingsByIssueTypeOverride> statusMappingsByIssueTypeOverride = Arrays.asList(); // Overrides, for the selected issue types, any status mappings provided in `statusMappingsByWorkflows`. Status mappings are required when the new workflow for an issue type doesn't contain all statuses that the old workflow has. Status mappings can be provided by a combination of `statusMappingsByWorkflows` and `statusMappingsByIssueTypeOverride`.
    List<MappingsByWorkflow> statusMappingsByWorkflows = Arrays.asList(); // The status mappings by workflows. Status mappings are required when the new workflow for an issue type doesn't contain all statuses that the old workflow has. Status mappings can be provided by a combination of `statusMappingsByWorkflows` and `statusMappingsByIssueTypeOverride`.
    List<WorkflowSchemeAssociation> workflowsForIssueTypes = Arrays.asList(); // Mappings from workflows to issue types.
    try {
      Object result = client
              .workflowSchemes
              .updateScheme(description, version, id, name)
              .defaultWorkflowId(defaultWorkflowId)
              .statusMappingsByIssueTypeOverride(statusMappingsByIssueTypeOverride)
              .statusMappingsByWorkflows(statusMappingsByWorkflows)
              .workflowsForIssueTypes(workflowsForIssueTypes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#updateScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .workflowSchemes
              .updateScheme(description, version, id, name)
              .defaultWorkflowId(defaultWorkflowId)
              .statusMappingsByIssueTypeOverride(statusMappingsByIssueTypeOverride)
              .statusMappingsByWorkflows(statusMappingsByWorkflows)
              .workflowsForIssueTypes(workflowsForIssueTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#updateScheme");
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
| **200** | Returned if the request is successful and there is no asynchronous task. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing, or the caller doesn&#39;t have permissions to perform the operation. |  -  |

<a name="updateScheme_0"></a>
# **updateScheme_0**
> WorkflowScheme updateScheme_0(id, workflowScheme).execute();

Classic update workflow scheme

Updates a company-manged project workflow scheme, including the name, default workflow, issue type to project mappings, and more. If the workflow scheme is active (that is, being used by at least one project), then a draft workflow scheme is created or updated instead, provided that &#x60;updateDraftIfNeeded&#x60; is set to &#x60;true&#x60;.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemesApi;
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
    Long id = 56L; // The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as `schemeId`. For example, *schemeId=10301*.
    String description = "description_example"; // The description of the workflow scheme.
    String defaultWorkflow = "defaultWorkflow_example"; // The name of the default workflow for the workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira. If `defaultWorkflow` is not specified when creating a workflow scheme, it is set to *Jira Workflow (jira)*.
    Boolean draft = true; // Whether the workflow scheme is a draft or not.
    Long id = 56L; // The ID of the workflow scheme.
    Map<String, String> issueTypeMappings = new HashMap(); // The issue type to workflow mappings, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
    Map<String, IssueTypeDetails> issueTypes = new HashMap(); // The issue types available in Jira.
    String lastModified = "lastModified_example"; // The date-time that the draft workflow scheme was last modified. A modification is a change to the issue type-project mappings only. This property does not apply to non-draft workflows.
    User lastModifiedUser = new User(); // The user that last modified the draft workflow scheme. A modification is a change to the issue type-project mappings only. This property does not apply to non-draft workflows.
    String name = "name_example"; // The name of the workflow scheme. The name must be unique. The maximum length is 255 characters. Required when creating a workflow scheme.
    String originalDefaultWorkflow = "originalDefaultWorkflow_example"; // For draft workflow schemes, this property is the name of the default workflow for the original workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira.
    Map<String, String> originalIssueTypeMappings = new HashMap(); // For draft workflow schemes, this property is the issue type to workflow mappings for the original workflow scheme, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
    URI self = new URI();
    Boolean updateDraftIfNeeded = true; // Whether to create or update a draft workflow scheme when updating an active workflow scheme. An active workflow scheme is a workflow scheme that is used by at least one project. The following examples show how this property works:   *  Update an active workflow scheme with `updateDraftIfNeeded` set to `true`: If a draft workflow scheme exists, it is updated. Otherwise, a draft workflow scheme is created.  *  Update an active workflow scheme with `updateDraftIfNeeded` set to `false`: An error is returned, as active workflow schemes cannot be updated.  *  Update an inactive workflow scheme with `updateDraftIfNeeded` set to `true`: The workflow scheme is updated, as inactive workflow schemes do not require drafts to update.  Defaults to `false`.
    try {
      WorkflowScheme result = client
              .workflowSchemes
              .updateScheme_0(id)
              .description(description)
              .defaultWorkflow(defaultWorkflow)
              .draft(draft)
              .id(id)
              .issueTypeMappings(issueTypeMappings)
              .issueTypes(issueTypes)
              .lastModified(lastModified)
              .lastModifiedUser(lastModifiedUser)
              .name(name)
              .originalDefaultWorkflow(originalDefaultWorkflow)
              .originalIssueTypeMappings(originalIssueTypeMappings)
              .self(self)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getDefaultWorkflow());
      System.out.println(result.getDraft());
      System.out.println(result.getId());
      System.out.println(result.getIssueTypeMappings());
      System.out.println(result.getIssueTypes());
      System.out.println(result.getLastModified());
      System.out.println(result.getLastModifiedUser());
      System.out.println(result.getName());
      System.out.println(result.getOriginalDefaultWorkflow());
      System.out.println(result.getOriginalIssueTypeMappings());
      System.out.println(result.getSelf());
      System.out.println(result.getUpdateDraftIfNeeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#updateScheme_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemes
              .updateScheme_0(id)
              .description(description)
              .defaultWorkflow(defaultWorkflow)
              .draft(draft)
              .id(id)
              .issueTypeMappings(issueTypeMappings)
              .issueTypes(issueTypes)
              .lastModified(lastModified)
              .lastModifiedUser(lastModifiedUser)
              .name(name)
              .originalDefaultWorkflow(originalDefaultWorkflow)
              .originalIssueTypeMappings(originalIssueTypeMappings)
              .self(self)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemesApi#updateScheme_0");
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
| **id** | **Long**| The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*. | |
| **workflowScheme** | [**WorkflowScheme**](WorkflowScheme.md)|  | |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

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
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the workflow scheme is not found. |  -  |

