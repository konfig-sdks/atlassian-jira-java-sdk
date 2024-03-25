# WorkflowTransitionPropertiesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransitionProperty**](WorkflowTransitionPropertiesApi.md#createTransitionProperty) | **POST** /rest/api/3/workflow/transitions/{transitionId}/properties | Create workflow transition property |
| [**deleteProperty**](WorkflowTransitionPropertiesApi.md#deleteProperty) | **DELETE** /rest/api/3/workflow/transitions/{transitionId}/properties | Delete workflow transition property |
| [**getPropertyById**](WorkflowTransitionPropertiesApi.md#getPropertyById) | **GET** /rest/api/3/workflow/transitions/{transitionId}/properties | Get workflow transition properties |
| [**updateProperty**](WorkflowTransitionPropertiesApi.md#updateProperty) | **PUT** /rest/api/3/workflow/transitions/{transitionId}/properties | Update workflow transition property |


<a name="createTransitionProperty"></a>
# **createTransitionProperty**
> WorkflowTransitionProperty createTransitionProperty(transitionId, key, workflowName, requestBody).workflowMode(workflowMode).execute();

Create workflow transition property

Adds a property to a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowTransitionPropertiesApi;
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
    String value = "value_example"; // The value of the transition property.
    Long transitionId = 56L; // The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
    String key = "key_example"; // The key of the property being added, also known as the name of the property. Set this to the same value as the `key` defined in the request body.
    String workflowName = "workflowName_example"; // The name of the workflow that the transition belongs to.
    String id = "id_example"; // The ID of the transition property.
    String key = "key_example"; // The key of the transition property. Also known as the name of the transition property.
    String workflowMode = "live"; // The workflow status. Set to *live* for inactive workflows or *draft* for draft workflows. Active workflows cannot be edited.
    try {
      WorkflowTransitionProperty result = client
              .workflowTransitionProperties
              .createTransitionProperty(value, transitionId, key, workflowName)
              .id(id)
              .key(key)
              .workflowMode(workflowMode)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getKey());
      System.out.println(result.getValue());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionPropertiesApi#createTransitionProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowTransitionProperty> response = client
              .workflowTransitionProperties
              .createTransitionProperty(value, transitionId, key, workflowName)
              .id(id)
              .key(key)
              .workflowMode(workflowMode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionPropertiesApi#createTransitionProperty");
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
| **transitionId** | **Long**| The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. | |
| **key** | **String**| The key of the property being added, also known as the name of the property. Set this to the same value as the &#x60;key&#x60; defined in the request body. | |
| **workflowName** | **String**| The name of the workflow that the transition belongs to. | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |
| **workflowMode** | **String**| The workflow status. Set to *live* for inactive workflows or *draft* for draft workflows. Active workflows cannot be edited. | [optional] [default to live] [enum: live, draft] |

### Return type

[**WorkflowTransitionProperty**](WorkflowTransitionProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |
| **400** | Returned if a workflow property with the same key is present on the transition. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the workflow transition is not found. |  -  |

<a name="deleteProperty"></a>
# **deleteProperty**
> deleteProperty(transitionId, key, workflowName).workflowMode(workflowMode).execute();

Delete workflow transition property

Deletes a property from a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowTransitionPropertiesApi;
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
    Long transitionId = 56L; // The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
    String key = "key_example"; // The name of the transition property to delete, also known as the name of the property.
    String workflowName = "workflowName_example"; // The name of the workflow that the transition belongs to.
    String workflowMode = "live"; // The workflow status. Set to `live` for inactive workflows or `draft` for draft workflows. Active workflows cannot be edited.
    try {
      client
              .workflowTransitionProperties
              .deleteProperty(transitionId, key, workflowName)
              .workflowMode(workflowMode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionPropertiesApi#deleteProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .workflowTransitionProperties
              .deleteProperty(transitionId, key, workflowName)
              .workflowMode(workflowMode)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionPropertiesApi#deleteProperty");
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
| **transitionId** | **Long**| The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. | |
| **key** | **String**| The name of the transition property to delete, also known as the name of the property. | |
| **workflowName** | **String**| The name of the workflow that the transition belongs to. | |
| **workflowMode** | **String**| The workflow status. Set to &#x60;live&#x60; for inactive workflows or &#x60;draft&#x60; for draft workflows. Active workflows cannot be edited. | [optional] [enum: live, draft] |

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
| **200** | 200 response |  -  |
| **304** | Returned if no changes were made by the request. For example, trying to delete a property that cannot be found. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the workflow transition is not found. |  -  |

<a name="getPropertyById"></a>
# **getPropertyById**
> WorkflowTransitionProperty getPropertyById(transitionId, workflowName).includeReservedKeys(includeReservedKeys).key(key).workflowMode(workflowMode).execute();

Get workflow transition properties

Returns the properties on a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowTransitionPropertiesApi;
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
    Long transitionId = 56L; // The ID of the transition. To get the ID, view the workflow in text mode in the Jira administration console. The ID is shown next to the transition.
    String workflowName = "workflowName_example"; // The name of the workflow that the transition belongs to.
    Boolean includeReservedKeys = false; // Some properties with keys that have the *jira.* prefix are reserved, which means they are not editable. To include these properties in the results, set this parameter to *true*.
    String key = "key_example"; // The key of the property being returned, also known as the name of the property. If this parameter is not specified, all properties on the transition are returned.
    String workflowMode = "live"; // The workflow status. Set to *live* for active and inactive workflows, or *draft* for draft workflows.
    try {
      WorkflowTransitionProperty result = client
              .workflowTransitionProperties
              .getPropertyById(transitionId, workflowName)
              .includeReservedKeys(includeReservedKeys)
              .key(key)
              .workflowMode(workflowMode)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getKey());
      System.out.println(result.getValue());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionPropertiesApi#getPropertyById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowTransitionProperty> response = client
              .workflowTransitionProperties
              .getPropertyById(transitionId, workflowName)
              .includeReservedKeys(includeReservedKeys)
              .key(key)
              .workflowMode(workflowMode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionPropertiesApi#getPropertyById");
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
| **transitionId** | **Long**| The ID of the transition. To get the ID, view the workflow in text mode in the Jira administration console. The ID is shown next to the transition. | |
| **workflowName** | **String**| The name of the workflow that the transition belongs to. | |
| **includeReservedKeys** | **Boolean**| Some properties with keys that have the *jira.* prefix are reserved, which means they are not editable. To include these properties in the results, set this parameter to *true*. | [optional] [default to false] |
| **key** | **String**| The key of the property being returned, also known as the name of the property. If this parameter is not specified, all properties on the transition are returned. | [optional] |
| **workflowMode** | **String**| The workflow status. Set to *live* for active and inactive workflows, or *draft* for draft workflows. | [optional] [default to live] [enum: live, draft] |

### Return type

[**WorkflowTransitionProperty**](WorkflowTransitionProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have admin permission |  -  |
| **404** | Returned if the workflow transition or property is not found. |  -  |

<a name="updateProperty"></a>
# **updateProperty**
> WorkflowTransitionProperty updateProperty(transitionId, key, workflowName, requestBody).workflowMode(workflowMode).execute();

Update workflow transition property

Updates a workflow transition by changing the property value. Trying to update a property that does not exist results in a new property being added to the transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowTransitionPropertiesApi;
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
    String value = "value_example"; // The value of the transition property.
    Long transitionId = 56L; // The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
    String key = "key_example"; // The key of the property being updated, also known as the name of the property. Set this to the same value as the `key` defined in the request body.
    String workflowName = "workflowName_example"; // The name of the workflow that the transition belongs to.
    String id = "id_example"; // The ID of the transition property.
    String key = "key_example"; // The key of the transition property. Also known as the name of the transition property.
    String workflowMode = "live"; // The workflow status. Set to `live` for inactive workflows or `draft` for draft workflows. Active workflows cannot be edited.
    try {
      WorkflowTransitionProperty result = client
              .workflowTransitionProperties
              .updateProperty(value, transitionId, key, workflowName)
              .id(id)
              .key(key)
              .workflowMode(workflowMode)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getKey());
      System.out.println(result.getValue());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionPropertiesApi#updateProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowTransitionProperty> response = client
              .workflowTransitionProperties
              .updateProperty(value, transitionId, key, workflowName)
              .id(id)
              .key(key)
              .workflowMode(workflowMode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionPropertiesApi#updateProperty");
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
| **transitionId** | **Long**| The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. | |
| **key** | **String**| The key of the property being updated, also known as the name of the property. Set this to the same value as the &#x60;key&#x60; defined in the request body. | |
| **workflowName** | **String**| The name of the workflow that the transition belongs to. | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |
| **workflowMode** | **String**| The workflow status. Set to &#x60;live&#x60; for inactive workflows or &#x60;draft&#x60; for draft workflows. Active workflows cannot be edited. | [optional] [enum: live, draft] |

### Return type

[**WorkflowTransitionProperty**](WorkflowTransitionProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |
| **304** | Returned if no changes were made by the request. For example, attempting to update a property with its current value. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the workflow transition is not found. |  -  |

