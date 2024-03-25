# IssueWorklogPropertiesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteProperty**](IssueWorklogPropertiesApi.md#deleteProperty) | **DELETE** /rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey} | Delete worklog property |
| [**getPropertyKeys**](IssueWorklogPropertiesApi.md#getPropertyKeys) | **GET** /rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties | Get worklog property keys |
| [**getWorklogProperty**](IssueWorklogPropertiesApi.md#getWorklogProperty) | **GET** /rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey} | Get worklog property |
| [**setWorklogProperty**](IssueWorklogPropertiesApi.md#setWorklogProperty) | **PUT** /rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey} | Set worklog property |


<a name="deleteProperty"></a>
# **deleteProperty**
> deleteProperty(issueIdOrKey, worklogId, propertyKey).execute();

Delete worklog property

Deletes a worklog property.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueWorklogPropertiesApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key of the issue.
    String worklogId = "worklogId_example"; // The ID of the worklog.
    String propertyKey = "propertyKey_example"; // The key of the property.
    try {
      client
              .issueWorklogProperties
              .deleteProperty(issueIdOrKey, worklogId, propertyKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogPropertiesApi#deleteProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .issueWorklogProperties
              .deleteProperty(issueIdOrKey, worklogId, propertyKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogPropertiesApi#deleteProperty");
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
| **issueIdOrKey** | **String**| The ID or key of the issue. | |
| **worklogId** | **String**| The ID of the worklog. | |
| **propertyKey** | **String**| The key of the property. | |

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
| **204** | Returned if the worklog property is removed. |  -  |
| **400** | Returned if the worklog key or id is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have permission to edit the worklog. |  -  |
| **404** | Returned if:   *  the issue, worklog, or property is not found.  *  the user does not have permission to view the issue or worklog. |  -  |

<a name="getPropertyKeys"></a>
# **getPropertyKeys**
> PropertyKeys getPropertyKeys(issueIdOrKey, worklogId).execute();

Get worklog property keys

Returns the keys of all properties for a worklog.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueWorklogPropertiesApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key of the issue.
    String worklogId = "worklogId_example"; // The ID of the worklog.
    try {
      PropertyKeys result = client
              .issueWorklogProperties
              .getPropertyKeys(issueIdOrKey, worklogId)
              .execute();
      System.out.println(result);
      System.out.println(result.getKeys());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogPropertiesApi#getPropertyKeys");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PropertyKeys> response = client
              .issueWorklogProperties
              .getPropertyKeys(issueIdOrKey, worklogId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogPropertiesApi#getPropertyKeys");
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
| **issueIdOrKey** | **String**| The ID or key of the issue. | |
| **worklogId** | **String**| The ID of the worklog. | |

### Return type

[**PropertyKeys**](PropertyKeys.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the worklog ID is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if:   *  the issue or worklog is not found.  *  the user does not have permission to view the issue or worklog. |  -  |

<a name="getWorklogProperty"></a>
# **getWorklogProperty**
> EntityProperty getWorklogProperty(issueIdOrKey, worklogId, propertyKey).execute();

Get worklog property

Returns the value of a worklog property.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueWorklogPropertiesApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key of the issue.
    String worklogId = "worklogId_example"; // The ID of the worklog.
    String propertyKey = "propertyKey_example"; // The key of the property.
    try {
      EntityProperty result = client
              .issueWorklogProperties
              .getWorklogProperty(issueIdOrKey, worklogId, propertyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getKey());
      System.out.println(result.getValue());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogPropertiesApi#getWorklogProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EntityProperty> response = client
              .issueWorklogProperties
              .getWorklogProperty(issueIdOrKey, worklogId, propertyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogPropertiesApi#getWorklogProperty");
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
| **issueIdOrKey** | **String**| The ID or key of the issue. | |
| **worklogId** | **String**| The ID of the worklog. | |
| **propertyKey** | **String**| The key of the property. | |

### Return type

[**EntityProperty**](EntityProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the worklog ID is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if:   *  the issue, worklog, or property is not found.  *  the user does not have permission to view the issue or worklog. |  -  |

<a name="setWorklogProperty"></a>
# **setWorklogProperty**
> Object setWorklogProperty(issueIdOrKey, worklogId, propertyKey, body).execute();

Set worklog property

Sets the value of a worklog property. Use this operation to store custom data against the worklog.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all worklogs*[project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueWorklogPropertiesApi;
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
    String issueIdOrKey = "issueIdOrKey_example"; // The ID or key of the issue.
    String worklogId = "worklogId_example"; // The ID of the worklog.
    String propertyKey = "propertyKey_example"; // The key of the issue property. The maximum length is 255 characters.
    try {
      Object result = client
              .issueWorklogProperties
              .setWorklogProperty(issueIdOrKey, worklogId, propertyKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogPropertiesApi#setWorklogProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issueWorklogProperties
              .setWorklogProperty(issueIdOrKey, worklogId, propertyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueWorklogPropertiesApi#setWorklogProperty");
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
| **issueIdOrKey** | **String**| The ID or key of the issue. | |
| **worklogId** | **String**| The ID of the worklog. | |
| **propertyKey** | **String**| The key of the issue property. The maximum length is 255 characters. | |
| **body** | **Object**| The value of the property. The value has to be a valid, non-empty [JSON](https://tools.ietf.org/html/rfc4627) value. The maximum length of the property value is 32768 bytes. | |

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
| **200** | Returned if the worklog property is updated. |  -  |
| **201** | Returned if the worklog property is created. |  -  |
| **400** | Returned if the worklog ID is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have permission to edit the worklog. |  -  |
| **404** | Returned if:   *  the issue or worklog is not found.  *  the user does not have permission to view the issue or worklog. |  -  |

