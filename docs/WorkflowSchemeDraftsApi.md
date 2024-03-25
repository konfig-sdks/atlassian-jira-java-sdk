# WorkflowSchemeDraftsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDraftWorkflowScheme**](WorkflowSchemeDraftsApi.md#createDraftWorkflowScheme) | **POST** /rest/api/3/workflowscheme/{id}/createdraft | Create draft workflow scheme |
| [**deleteIssueTypeWorkflowMapping**](WorkflowSchemeDraftsApi.md#deleteIssueTypeWorkflowMapping) | **DELETE** /rest/api/3/workflowscheme/{id}/draft/issuetype/{issueType} | Delete workflow for issue type in draft workflow scheme |
| [**deleteIssueTypesForWorkflowInScheme**](WorkflowSchemeDraftsApi.md#deleteIssueTypesForWorkflowInScheme) | **DELETE** /rest/api/3/workflowscheme/{id}/draft/workflow | Delete issue types for workflow in draft workflow scheme |
| [**deleteSchemeDraft**](WorkflowSchemeDraftsApi.md#deleteSchemeDraft) | **DELETE** /rest/api/3/workflowscheme/{id}/draft | Delete draft workflow scheme |
| [**getDefaultWorkflow**](WorkflowSchemeDraftsApi.md#getDefaultWorkflow) | **GET** /rest/api/3/workflowscheme/{id}/draft/default | Get draft default workflow |
| [**getDraftWorkflowScheme**](WorkflowSchemeDraftsApi.md#getDraftWorkflowScheme) | **GET** /rest/api/3/workflowscheme/{id}/draft | Get draft workflow scheme |
| [**getIssueTypeMappingsForWorkflowInSchemeDraft**](WorkflowSchemeDraftsApi.md#getIssueTypeMappingsForWorkflowInSchemeDraft) | **GET** /rest/api/3/workflowscheme/{id}/draft/workflow | Get issue types for workflows in draft workflow scheme |
| [**getIssueTypeWorkflow**](WorkflowSchemeDraftsApi.md#getIssueTypeWorkflow) | **GET** /rest/api/3/workflowscheme/{id}/draft/issuetype/{issueType} | Get workflow for issue type in draft workflow scheme |
| [**publishDraftWorkflowScheme**](WorkflowSchemeDraftsApi.md#publishDraftWorkflowScheme) | **POST** /rest/api/3/workflowscheme/{id}/draft/publish | Publish draft workflow scheme |
| [**resetDefaultWorkflow**](WorkflowSchemeDraftsApi.md#resetDefaultWorkflow) | **DELETE** /rest/api/3/workflowscheme/{id}/draft/default | Delete draft default workflow |
| [**setIssueTypeWorkflow**](WorkflowSchemeDraftsApi.md#setIssueTypeWorkflow) | **PUT** /rest/api/3/workflowscheme/{id}/draft/issuetype/{issueType} | Set workflow for issue type in draft workflow scheme |
| [**setIssueTypesForWorkflow**](WorkflowSchemeDraftsApi.md#setIssueTypesForWorkflow) | **PUT** /rest/api/3/workflowscheme/{id}/draft/workflow | Set issue types for workflow in workflow scheme |
| [**updateDefaultWorkflowScheme**](WorkflowSchemeDraftsApi.md#updateDefaultWorkflowScheme) | **PUT** /rest/api/3/workflowscheme/{id}/draft/default | Update draft default workflow |
| [**updateDraftWorkflowScheme**](WorkflowSchemeDraftsApi.md#updateDraftWorkflowScheme) | **PUT** /rest/api/3/workflowscheme/{id}/draft | Update draft workflow scheme |


<a name="createDraftWorkflowScheme"></a>
# **createDraftWorkflowScheme**
> WorkflowScheme createDraftWorkflowScheme(id).execute();

Create draft workflow scheme

Create a draft workflow scheme from an active workflow scheme, by copying the active workflow scheme. Note that an active workflow scheme can only have one draft workflow scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemeDraftsApi;
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
    Long id = 56L; // The ID of the active workflow scheme that the draft is created from.
    try {
      WorkflowScheme result = client
              .workflowSchemeDrafts
              .createDraftWorkflowScheme(id)
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
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#createDraftWorkflowScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemeDrafts
              .createDraftWorkflowScheme(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#createDraftWorkflowScheme");
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
| **id** | **Long**| The ID of the active workflow scheme that the draft is created from. | |

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
| **201** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |

<a name="deleteIssueTypeWorkflowMapping"></a>
# **deleteIssueTypeWorkflowMapping**
> WorkflowScheme deleteIssueTypeWorkflowMapping(id, issueType).execute();

Delete workflow for issue type in draft workflow scheme

Deletes the issue type-workflow mapping for an issue type in a workflow scheme&#39;s draft.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemeDraftsApi;
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
    Long id = 56L; // The ID of the workflow scheme that the draft belongs to.
    String issueType = "issueType_example"; // The ID of the issue type.
    try {
      WorkflowScheme result = client
              .workflowSchemeDrafts
              .deleteIssueTypeWorkflowMapping(id, issueType)
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
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#deleteIssueTypeWorkflowMapping");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemeDrafts
              .deleteIssueTypeWorkflowMapping(id, issueType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#deleteIssueTypeWorkflowMapping");
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
| **id** | **Long**| The ID of the workflow scheme that the draft belongs to. | |
| **issueType** | **String**| The ID of the issue type. | |

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
| **404** | Returned if the workflow scheme or issue type is not found. |  -  |

<a name="deleteIssueTypesForWorkflowInScheme"></a>
# **deleteIssueTypesForWorkflowInScheme**
> deleteIssueTypesForWorkflowInScheme(id, workflowName).execute();

Delete issue types for workflow in draft workflow scheme

Deletes the workflow-issue type mapping for a workflow in a workflow scheme&#39;s draft.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemeDraftsApi;
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
    Long id = 56L; // The ID of the workflow scheme that the draft belongs to.
    String workflowName = "workflowName_example"; // The name of the workflow.
    try {
      client
              .workflowSchemeDrafts
              .deleteIssueTypesForWorkflowInScheme(id, workflowName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#deleteIssueTypesForWorkflowInScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .workflowSchemeDrafts
              .deleteIssueTypesForWorkflowInScheme(id, workflowName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#deleteIssueTypesForWorkflowInScheme");
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
| **id** | **Long**| The ID of the workflow scheme that the draft belongs to. | |
| **workflowName** | **String**| The name of the workflow. | |

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
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if any of the following is true:   *  The workflow scheme is not found.  *  The workflow scheme does not have a draft.  *  The workflow is not found.  *  The workflow is not specified. |  -  |

<a name="deleteSchemeDraft"></a>
# **deleteSchemeDraft**
> deleteSchemeDraft(id).execute();

Delete draft workflow scheme

Deletes a draft workflow scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemeDraftsApi;
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
    Long id = 56L; // The ID of the active workflow scheme that the draft was created from.
    try {
      client
              .workflowSchemeDrafts
              .deleteSchemeDraft(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#deleteSchemeDraft");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .workflowSchemeDrafts
              .deleteSchemeDraft(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#deleteSchemeDraft");
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
| **id** | **Long**| The ID of the active workflow scheme that the draft was created from. | |

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
| **403** | Returned if the user does not have the necessary permission.. |  -  |
| **404** | Returned if:   *  the original active workflow scheme is not found.  *  the original active workflow scheme does not have a draft. |  -  |

<a name="getDefaultWorkflow"></a>
# **getDefaultWorkflow**
> DefaultWorkflow getDefaultWorkflow(id).execute();

Get draft default workflow

Returns the default workflow for a workflow scheme&#39;s draft. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemeDraftsApi;
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
    Long id = 56L; // The ID of the workflow scheme that the draft belongs to.
    try {
      DefaultWorkflow result = client
              .workflowSchemeDrafts
              .getDefaultWorkflow(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getUpdateDraftIfNeeded());
      System.out.println(result.getWorkflow());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#getDefaultWorkflow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DefaultWorkflow> response = client
              .workflowSchemeDrafts
              .getDefaultWorkflow(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#getDefaultWorkflow");
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
| **id** | **Long**| The ID of the workflow scheme that the draft belongs to. | |

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
| **403** | Returned if the user does not have the necessary permission.. |  -  |
| **404** | Returned if any of the following is true:   *  The workflow scheme is not found.  *  The workflow scheme does not have a draft. |  -  |

<a name="getDraftWorkflowScheme"></a>
# **getDraftWorkflowScheme**
> WorkflowScheme getDraftWorkflowScheme(id).execute();

Get draft workflow scheme

Returns the draft workflow scheme for an active workflow scheme. Draft workflow schemes allow changes to be made to the active workflow schemes: When an active workflow scheme is updated, a draft copy is created. The draft is modified, then the changes in the draft are copied back to the active workflow scheme. See [Configuring workflow schemes](https://confluence.atlassian.com/x/tohKLg) for more information.   Note that:   *  Only active workflow schemes can have draft workflow schemes.  *  An active workflow scheme can only have one draft workflow scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemeDraftsApi;
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
    Long id = 56L; // The ID of the active workflow scheme that the draft was created from.
    try {
      WorkflowScheme result = client
              .workflowSchemeDrafts
              .getDraftWorkflowScheme(id)
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
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#getDraftWorkflowScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemeDrafts
              .getDraftWorkflowScheme(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#getDraftWorkflowScheme");
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
| **id** | **Long**| The ID of the active workflow scheme that the draft was created from. | |

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
| **404** | Returned if:   *  the original active workflow scheme is not found.  *  the original active workflow scheme does not have a draft. |  -  |

<a name="getIssueTypeMappingsForWorkflowInSchemeDraft"></a>
# **getIssueTypeMappingsForWorkflowInSchemeDraft**
> IssueTypesWorkflowMapping getIssueTypeMappingsForWorkflowInSchemeDraft(id).workflowName(workflowName).execute();

Get issue types for workflows in draft workflow scheme

Returns the workflow-issue type mappings for a workflow scheme&#39;s draft.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemeDraftsApi;
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
    Long id = 56L; // The ID of the workflow scheme that the draft belongs to.
    String workflowName = "workflowName_example"; // The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow.
    try {
      IssueTypesWorkflowMapping result = client
              .workflowSchemeDrafts
              .getIssueTypeMappingsForWorkflowInSchemeDraft(id)
              .workflowName(workflowName)
              .execute();
      System.out.println(result);
      System.out.println(result.getDefaultMapping());
      System.out.println(result.getIssueTypes());
      System.out.println(result.getUpdateDraftIfNeeded());
      System.out.println(result.getWorkflow());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#getIssueTypeMappingsForWorkflowInSchemeDraft");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueTypesWorkflowMapping> response = client
              .workflowSchemeDrafts
              .getIssueTypeMappingsForWorkflowInSchemeDraft(id)
              .workflowName(workflowName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#getIssueTypeMappingsForWorkflowInSchemeDraft");
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
| **id** | **Long**| The ID of the workflow scheme that the draft belongs to. | |
| **workflowName** | **String**| The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow. | [optional] |

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
| **404** | Returned if either the workflow scheme or workflow (if specified) is not found. session. |  -  |

<a name="getIssueTypeWorkflow"></a>
# **getIssueTypeWorkflow**
> IssueTypeWorkflowMapping getIssueTypeWorkflow(id, issueType).execute();

Get workflow for issue type in draft workflow scheme

Returns the issue type-workflow mapping for an issue type in a workflow scheme&#39;s draft.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemeDraftsApi;
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
    Long id = 56L; // The ID of the workflow scheme that the draft belongs to.
    String issueType = "issueType_example"; // The ID of the issue type.
    try {
      IssueTypeWorkflowMapping result = client
              .workflowSchemeDrafts
              .getIssueTypeWorkflow(id, issueType)
              .execute();
      System.out.println(result);
      System.out.println(result.getIssueType());
      System.out.println(result.getUpdateDraftIfNeeded());
      System.out.println(result.getWorkflow());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#getIssueTypeWorkflow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueTypeWorkflowMapping> response = client
              .workflowSchemeDrafts
              .getIssueTypeWorkflow(id, issueType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#getIssueTypeWorkflow");
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
| **id** | **Long**| The ID of the workflow scheme that the draft belongs to. | |
| **issueType** | **String**| The ID of the issue type. | |

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

<a name="publishDraftWorkflowScheme"></a>
# **publishDraftWorkflowScheme**
> publishDraftWorkflowScheme(id, publishDraftWorkflowScheme).validateOnly(validateOnly).execute();

Publish draft workflow scheme

Publishes a draft workflow scheme.  Where the draft workflow includes new workflow statuses for an issue type, mappings are provided to update issues with the original workflow status to the new workflow status.  This operation is [asynchronous](https://dac-static.atlassian.com). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](https://dac-static.atlassian.com) to obtain updates.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemeDraftsApi;
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
    Long id = 56L; // The ID of the workflow scheme that the draft belongs to.
    Set<StatusMapping> statusMappings = Arrays.asList(); // Mappings of statuses to new statuses for issue types.
    Boolean validateOnly = false; // Whether the request only performs a validation.
    try {
      client
              .workflowSchemeDrafts
              .publishDraftWorkflowScheme(id)
              .statusMappings(statusMappings)
              .validateOnly(validateOnly)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#publishDraftWorkflowScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .workflowSchemeDrafts
              .publishDraftWorkflowScheme(id)
              .statusMappings(statusMappings)
              .validateOnly(validateOnly)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#publishDraftWorkflowScheme");
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
| **id** | **Long**| The ID of the workflow scheme that the draft belongs to. | |
| **publishDraftWorkflowScheme** | [**PublishDraftWorkflowScheme**](PublishDraftWorkflowScheme.md)| Details of the status mappings. | |
| **validateOnly** | **Boolean**| Whether the request only performs a validation. | [optional] [default to false] |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the request is only for validation and is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |

<a name="resetDefaultWorkflow"></a>
# **resetDefaultWorkflow**
> WorkflowScheme resetDefaultWorkflow(id).execute();

Delete draft default workflow

Resets the default workflow for a workflow scheme&#39;s draft. That is, the default workflow is set to Jira&#39;s system workflow (the *jira* workflow).  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemeDraftsApi;
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
    Long id = 56L; // The ID of the workflow scheme that the draft belongs to.
    try {
      WorkflowScheme result = client
              .workflowSchemeDrafts
              .resetDefaultWorkflow(id)
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
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#resetDefaultWorkflow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemeDrafts
              .resetDefaultWorkflow(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#resetDefaultWorkflow");
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
| **id** | **Long**| The ID of the workflow scheme that the draft belongs to. | |

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
| **404** | Returned if any of the following is true:   *  The workflow scheme is not found.  *  The workflow scheme does not have a draft. |  -  |

<a name="setIssueTypeWorkflow"></a>
# **setIssueTypeWorkflow**
> WorkflowScheme setIssueTypeWorkflow(id, issueType, issueTypeWorkflowMapping).execute();

Set workflow for issue type in draft workflow scheme

Sets the workflow for an issue type in a workflow scheme&#39;s draft.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemeDraftsApi;
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
    Long id = 56L; // The ID of the workflow scheme that the draft belongs to.
    String issueType = "issueType_example"; // The ID of the issue type.
    String issueType = "issueType_example"; // The ID of the issue type. Not required if updating the issue type-workflow mapping.
    Boolean updateDraftIfNeeded = true; // Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to `false`. Only applicable when updating the workflow-issue types mapping.
    String workflow = "workflow_example"; // The name of the workflow.
    try {
      WorkflowScheme result = client
              .workflowSchemeDrafts
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
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#setIssueTypeWorkflow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemeDrafts
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
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#setIssueTypeWorkflow");
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
| **id** | **Long**| The ID of the workflow scheme that the draft belongs to. | |
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
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the workflow scheme or issue type is not found. |  -  |

<a name="setIssueTypesForWorkflow"></a>
# **setIssueTypesForWorkflow**
> WorkflowScheme setIssueTypesForWorkflow(id, workflowName, issueTypesWorkflowMapping).execute();

Set issue types for workflow in workflow scheme

Sets the issue types for a workflow in a workflow scheme&#39;s draft. The workflow can also be set as the default workflow for the draft workflow scheme. Unmapped issues types are mapped to the default workflow.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemeDraftsApi;
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
    Long id = 56L; // The ID of the workflow scheme that the draft belongs to.
    String workflowName = "workflowName_example"; // The name of the workflow.
    Boolean defaultMapping = true; // Whether the workflow is the default workflow for the workflow scheme.
    List<String> issueTypes = Arrays.asList(); // The list of issue type IDs.
    Boolean updateDraftIfNeeded = true; // Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new workflow-issue types mapping. Defaults to `false`.
    String workflow = "workflow_example"; // The name of the workflow. Optional if updating the workflow-issue types mapping.
    try {
      WorkflowScheme result = client
              .workflowSchemeDrafts
              .setIssueTypesForWorkflow(id, workflowName)
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
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#setIssueTypesForWorkflow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemeDrafts
              .setIssueTypesForWorkflow(id, workflowName)
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
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#setIssueTypesForWorkflow");
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
| **id** | **Long**| The ID of the workflow scheme that the draft belongs to. | |
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
| **404** | Returned if any of the following is true:   *  The workflow scheme is not found.  *  The workflow scheme does not have a draft.  *  The workflow is not found.  *  The workflow is not specified. |  -  |

<a name="updateDefaultWorkflowScheme"></a>
# **updateDefaultWorkflowScheme**
> WorkflowScheme updateDefaultWorkflowScheme(id, defaultWorkflow).execute();

Update draft default workflow

Sets the default workflow for a workflow scheme&#39;s draft.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemeDraftsApi;
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
    Long id = 56L; // The ID of the workflow scheme that the draft belongs to.
    Boolean updateDraftIfNeeded = true; // Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to `false`.
    try {
      WorkflowScheme result = client
              .workflowSchemeDrafts
              .updateDefaultWorkflowScheme(workflow, id)
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
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#updateDefaultWorkflowScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemeDrafts
              .updateDefaultWorkflowScheme(workflow, id)
              .updateDraftIfNeeded(updateDraftIfNeeded)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#updateDefaultWorkflowScheme");
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
| **id** | **Long**| The ID of the workflow scheme that the draft belongs to. | |
| **defaultWorkflow** | [**DefaultWorkflow**](DefaultWorkflow.md)| The object for the new default workflow. | |

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
| **404** | Returned if any of the following is true:   *  The workflow scheme is not found.  *  The workflow scheme does not have a draft. |  -  |

<a name="updateDraftWorkflowScheme"></a>
# **updateDraftWorkflowScheme**
> WorkflowScheme updateDraftWorkflowScheme(id, workflowScheme).execute();

Update draft workflow scheme

Updates a draft workflow scheme. If a draft workflow scheme does not exist for the active workflow scheme, then a draft is created. Note that an active workflow scheme can only have one draft workflow scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowSchemeDraftsApi;
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
    Long id = 56L; // The ID of the active workflow scheme that the draft was created from.
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
              .workflowSchemeDrafts
              .updateDraftWorkflowScheme(id)
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
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#updateDraftWorkflowScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowScheme> response = client
              .workflowSchemeDrafts
              .updateDraftWorkflowScheme(id)
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
      System.err.println("Exception when calling WorkflowSchemeDraftsApi#updateDraftWorkflowScheme");
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
| **id** | **Long**| The ID of the active workflow scheme that the draft was created from. | |
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
| **404** | Returned if:   *  the original active workflow scheme is not found.  *  the original active workflow scheme does not have a draft. |  -  |

