# WorkflowTransitionRulesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTransitionConfigurations**](WorkflowTransitionRulesApi.md#deleteTransitionConfigurations) | **PUT** /rest/api/3/workflow/rule/config/delete | Delete workflow transition rule configurations |
| [**getConfigurations**](WorkflowTransitionRulesApi.md#getConfigurations) | **GET** /rest/api/3/workflow/rule/config | Get workflow transition rule configurations |
| [**updateTransitionRuleConfigurations**](WorkflowTransitionRulesApi.md#updateTransitionRuleConfigurations) | **PUT** /rest/api/3/workflow/rule/config | Update workflow transition rule configurations |


<a name="deleteTransitionConfigurations"></a>
# **deleteTransitionConfigurations**
> WorkflowTransitionRulesUpdateErrors deleteTransitionConfigurations(workflowsWithTransitionRulesDetails).execute();

Delete workflow transition rule configurations

Deletes workflow transition rules from one or more workflows. These rule types are supported:   *  [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)  *  [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)  *  [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)  Only rules created by the calling Connect app can be deleted.  **[Permissions](https://dac-static.atlassian.com) required:** Only Connect apps can use this operation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowTransitionRulesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    AtlassianJira client = new AtlassianJira(configuration);
    List<WorkflowTransitionRulesDetails> workflows = Arrays.asList(); // The list of workflows with transition rules to delete.
    try {
      WorkflowTransitionRulesUpdateErrors result = client
              .workflowTransitionRules
              .deleteTransitionConfigurations(workflows)
              .execute();
      System.out.println(result);
      System.out.println(result.getUpdateResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionRulesApi#deleteTransitionConfigurations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowTransitionRulesUpdateErrors> response = client
              .workflowTransitionRules
              .deleteTransitionConfigurations(workflows)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionRulesApi#deleteTransitionConfigurations");
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
| **workflowsWithTransitionRulesDetails** | [**WorkflowsWithTransitionRulesDetails**](WorkflowsWithTransitionRulesDetails.md)|  | |

### Return type

[**WorkflowTransitionRulesUpdateErrors**](WorkflowTransitionRulesUpdateErrors.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="getConfigurations"></a>
# **getConfigurations**
> PageBeanWorkflowTransitionRules getConfigurations(types).startAt(startAt).maxResults(maxResults).keys(keys).workflowNames(workflowNames).withTags(withTags).draft(draft).expand(expand).execute();

Get workflow transition rule configurations

Returns a [paginated](https://dac-static.atlassian.com) list of workflows with transition rules. The workflows can be filtered to return only those containing workflow transition rules:   *  of one or more transition rule types, such as [workflow post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/).  *  matching one or more transition rule keys.  Only workflows containing transition rules created by the calling [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) app are returned.  Due to server-side optimizations, workflows with an empty list of rules may be returned; these workflows can be ignored.  **[Permissions](https://dac-static.atlassian.com) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) apps can use this operation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowTransitionRulesApi;
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
    Set<String> types = Arrays.asList(""); // The types of the transition rules to return.
    Long startAt = 0L; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 10; // The maximum number of items to return per page.
    Set<String> keys = Arrays.asList(""""); // The transition rule class keys, as defined in the Connect or the Forge app descriptor, of the transition rules to return.
    Set<String> workflowNames = Arrays.asList(""""); // The list of workflow names to filter by.
    Set<String> withTags = Arrays.asList(""""); // The list of `tags` to filter by.
    Boolean draft = true; // Whether draft or published workflows are returned. If not provided, both workflow types are returned.
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts `transition`, which, for each rule, returns information about the transition the rule is assigned to.
    try {
      PageBeanWorkflowTransitionRules result = client
              .workflowTransitionRules
              .getConfigurations(types)
              .startAt(startAt)
              .maxResults(maxResults)
              .keys(keys)
              .workflowNames(workflowNames)
              .withTags(withTags)
              .draft(draft)
              .expand(expand)
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
      System.err.println("Exception when calling WorkflowTransitionRulesApi#getConfigurations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanWorkflowTransitionRules> response = client
              .workflowTransitionRules
              .getConfigurations(types)
              .startAt(startAt)
              .maxResults(maxResults)
              .keys(keys)
              .workflowNames(workflowNames)
              .withTags(withTags)
              .draft(draft)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionRulesApi#getConfigurations");
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
| **types** | [**Set&lt;String&gt;**](String.md)| The types of the transition rules to return. | [enum: postfunction, condition, validator] |
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 10] |
| **keys** | [**Set&lt;String&gt;**](String.md)| The transition rule class keys, as defined in the Connect or the Forge app descriptor, of the transition rules to return. | [optional] |
| **workflowNames** | [**Set&lt;String&gt;**](String.md)| The list of workflow names to filter by. | [optional] |
| **withTags** | [**Set&lt;String&gt;**](String.md)| The list of &#x60;tags&#x60; to filter by. | [optional] |
| **draft** | **Boolean**| Whether draft or published workflows are returned. If not provided, both workflow types are returned. | [optional] |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts &#x60;transition&#x60;, which, for each rule, returns information about the transition the rule is assigned to. | [optional] |

### Return type

[**PageBeanWorkflowTransitionRules**](PageBeanWorkflowTransitionRules.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **404** | Returned if any transition rule type is not supported. |  -  |
| **503** | Returned if we encounter a problem while trying to access the required data. |  -  |

<a name="updateTransitionRuleConfigurations"></a>
# **updateTransitionRuleConfigurations**
> WorkflowTransitionRulesUpdateErrors updateTransitionRuleConfigurations(workflowTransitionRulesUpdate).execute();

Update workflow transition rule configurations

Updates configuration of workflow transition rules. The following rule types are supported:   *  [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)  *  [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)  *  [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)  Only rules created by the calling [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) app can be updated.  To assist with app migration, this operation can be used to:   *  Disable a rule.  *  Add a &#x60;tag&#x60;. Use this to filter rules in the [Get workflow transition rule configurations](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-workflow-transition-rules/#api-rest-api-3-workflow-rule-config-get).  Rules are enabled if the &#x60;disabled&#x60; parameter is not provided.  **[Permissions](https://dac-static.atlassian.com) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) apps can use this operation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowTransitionRulesApi;
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
    List<WorkflowTransitionRules> workflows = Arrays.asList(); // The list of workflows with transition rules to update.
    try {
      WorkflowTransitionRulesUpdateErrors result = client
              .workflowTransitionRules
              .updateTransitionRuleConfigurations(workflows)
              .execute();
      System.out.println(result);
      System.out.println(result.getUpdateResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionRulesApi#updateTransitionRuleConfigurations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowTransitionRulesUpdateErrors> response = client
              .workflowTransitionRules
              .updateTransitionRuleConfigurations(workflows)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionRulesApi#updateTransitionRuleConfigurations");
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
| **workflowTransitionRulesUpdate** | [**WorkflowTransitionRulesUpdate**](WorkflowTransitionRulesUpdate.md)|  | |

### Return type

[**WorkflowTransitionRulesUpdateErrors**](WorkflowTransitionRulesUpdateErrors.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **503** | Returned if we encounter a problem while trying to access the required data. |  -  |

