# AppMigrationApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkUpdateEntityProperties**](AppMigrationApi.md#bulkUpdateEntityProperties) | **PUT** /rest/atlassian-connect/1/migration/properties/{entityType} | Bulk update entity properties |
| [**updateCustomFieldValue**](AppMigrationApi.md#updateCustomFieldValue) | **PUT** /rest/atlassian-connect/1/migration/field | Bulk update custom field value |
| [**workflowTransitionRuleConfigurations**](AppMigrationApi.md#workflowTransitionRuleConfigurations) | **POST** /rest/atlassian-connect/1/migration/workflow/rule/search | Get workflow transition rule configurations |


<a name="bulkUpdateEntityProperties"></a>
# **bulkUpdateEntityProperties**
> bulkUpdateEntityProperties(atlassianTransferId, entityType, entityPropertyDetails).execute();

Bulk update entity properties

Updates the values of multiple entity properties for an object, up to 50 updates per request. This operation is for use by Connect apps during app migration.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppMigrationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    AtlassianJira client = new AtlassianJira(configuration);
    UUID atlassianTransferId = UUID.randomUUID(); // The app migration transfer ID.
    String entityType = "IssueProperty"; // The type indicating the object that contains the entity properties.
    try {
      client
              .appMigration
              .bulkUpdateEntityProperties(atlassianTransferId, entityType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppMigrationApi#bulkUpdateEntityProperties");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .appMigration
              .bulkUpdateEntityProperties(atlassianTransferId, entityType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppMigrationApi#bulkUpdateEntityProperties");
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
| **atlassianTransferId** | **UUID**| The app migration transfer ID. | |
| **entityType** | **String**| The type indicating the object that contains the entity properties. | [enum: IssueProperty, CommentProperty, DashboardItemProperty, IssueTypeProperty, ProjectProperty, UserProperty, WorklogProperty, BoardProperty, SprintProperty] |
| **entityPropertyDetails** | [**List&lt;EntityPropertyDetails&gt;**](EntityPropertyDetails.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **403** | Returned if the authorisation credentials are incorrect or missing. |  -  |

<a name="updateCustomFieldValue"></a>
# **updateCustomFieldValue**
> Object updateCustomFieldValue(atlassianTransferId, connectCustomFieldValues).execute();

Bulk update custom field value

Updates the value of a custom field added by Connect apps on one or more issues. The values of up to 200 custom fields can be updated.  **[Permissions](https://dac-static.atlassian.com) required:** Only Connect apps can make this request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppMigrationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    AtlassianJira client = new AtlassianJira(configuration);
    UUID atlassianTransferId = UUID.randomUUID(); // The ID of the transfer.
    List<ConnectCustomFieldValue> updateValueList = Arrays.asList(); // The list of custom field update details.
    try {
      Object result = client
              .appMigration
              .updateCustomFieldValue(atlassianTransferId)
              .updateValueList(updateValueList)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppMigrationApi#updateCustomFieldValue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .appMigration
              .updateCustomFieldValue(atlassianTransferId)
              .updateValueList(updateValueList)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppMigrationApi#updateCustomFieldValue");
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
| **atlassianTransferId** | **UUID**| The ID of the transfer. | |
| **connectCustomFieldValues** | [**ConnectCustomFieldValues**](ConnectCustomFieldValues.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **403** | Returned if: * the transfer ID is not found. * the authorisation credentials are incorrect or missing. |  -  |

<a name="workflowTransitionRuleConfigurations"></a>
# **workflowTransitionRuleConfigurations**
> WorkflowRulesSearchDetails workflowTransitionRuleConfigurations(atlassianTransferId, workflowRulesSearch).execute();

Get workflow transition rule configurations

Returns configurations for workflow transition rules migrated from server to cloud and owned by the calling Connect app.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppMigrationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    AtlassianJira client = new AtlassianJira(configuration);
    List<UUID> ruleIds = Arrays.asList(); // The list of workflow rule IDs.
    UUID workflowEntityId = UUID.randomUUID(); // The workflow ID.
    UUID atlassianTransferId = UUID.randomUUID(); // The app migration transfer ID.
    String expand = "expand_example"; // Use expand to include additional information in the response. This parameter accepts `transition` which, for each rule, returns information about the transition the rule is assigned to.
    try {
      WorkflowRulesSearchDetails result = client
              .appMigration
              .workflowTransitionRuleConfigurations(ruleIds, workflowEntityId, atlassianTransferId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvalidRules());
      System.out.println(result.getValidRules());
      System.out.println(result.getWorkflowEntityId());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppMigrationApi#workflowTransitionRuleConfigurations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowRulesSearchDetails> response = client
              .appMigration
              .workflowTransitionRuleConfigurations(ruleIds, workflowEntityId, atlassianTransferId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppMigrationApi#workflowTransitionRuleConfigurations");
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
| **atlassianTransferId** | **UUID**| The app migration transfer ID. | |
| **workflowRulesSearch** | [**WorkflowRulesSearch**](WorkflowRulesSearch.md)|  | |

### Return type

[**WorkflowRulesSearchDetails**](WorkflowRulesSearchDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **403** | Returned if the authorisation credentials are incorrect or missing. |  -  |

