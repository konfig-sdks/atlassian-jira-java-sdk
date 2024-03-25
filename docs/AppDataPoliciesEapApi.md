# AppDataPoliciesEapApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDataPolicyProjects**](AppDataPoliciesEapApi.md#getDataPolicyProjects) | **GET** /rest/api/3/data-policy/project | Get data policy for projects (EAP) |
| [**getDataPolicyWorkspace**](AppDataPoliciesEapApi.md#getDataPolicyWorkspace) | **GET** /rest/api/3/data-policy | Get data policy for the workspace (EAP) |


<a name="getDataPolicyProjects"></a>
# **getDataPolicyProjects**
> ProjectDataPolicies getDataPolicyProjects().ids(ids).execute();

Get data policy for projects (EAP)

Returns data policies for the projects specified in the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppDataPoliciesEapApi;
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
    String ids = "ids_example"; // A list of project identifiers. This parameter accepts a comma-separated list.
    try {
      ProjectDataPolicies result = client
              .appDataPoliciesEap
              .getDataPolicyProjects()
              .ids(ids)
              .execute();
      System.out.println(result);
      System.out.println(result.getProjectDataPolicies());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataPoliciesEapApi#getDataPolicyProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectDataPolicies> response = client
              .appDataPoliciesEap
              .getDataPolicyProjects()
              .ids(ids)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataPoliciesEapApi#getDataPolicyProjects");
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
| **ids** | **String**| A list of project identifiers. This parameter accepts a comma-separated list. | [optional] |

### Return type

[**ProjectDataPolicies**](ProjectDataPolicies.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="getDataPolicyWorkspace"></a>
# **getDataPolicyWorkspace**
> WorkspaceDataPolicy getDataPolicyWorkspace().execute();

Get data policy for the workspace (EAP)

Returns data policy for the workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppDataPoliciesEapApi;
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
    try {
      WorkspaceDataPolicy result = client
              .appDataPoliciesEap
              .getDataPolicyWorkspace()
              .execute();
      System.out.println(result);
      System.out.println(result.getAnyContentBlocked());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataPoliciesEapApi#getDataPolicyWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkspaceDataPolicy> response = client
              .appDataPoliciesEap
              .getDataPolicyWorkspace()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDataPoliciesEapApi#getDataPolicyWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WorkspaceDataPolicy**](WorkspaceDataPolicy.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful |  -  |

