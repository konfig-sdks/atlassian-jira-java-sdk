# ProjectClassificationLevelsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDefaultDataClassificationLevelFromProject**](ProjectClassificationLevelsApi.md#getDefaultDataClassificationLevelFromProject) | **GET** /rest/api/3/project/{projectIdOrKey}/classification-level/default | Get the default data classification level of a project |
| [**removeDefaultDataClassificationLevelFromProject**](ProjectClassificationLevelsApi.md#removeDefaultDataClassificationLevelFromProject) | **DELETE** /rest/api/3/project/{projectIdOrKey}/classification-level/default | Remove the default data classification level from a project |
| [**updateDefaultDataClassificationLevel**](ProjectClassificationLevelsApi.md#updateDefaultDataClassificationLevel) | **PUT** /rest/api/3/project/{projectIdOrKey}/classification-level/default | Update the default data classification level of a project |


<a name="getDefaultDataClassificationLevelFromProject"></a>
# **getDefaultDataClassificationLevelFromProject**
> String getDefaultDataClassificationLevelFromProject(projectIdOrKey).execute();

Get the default data classification level of a project

Returns the default data classification for a project.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectClassificationLevelsApi;
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
    String projectIdOrKey = "projectIdOrKey_example"; // The project ID or project key (case-sensitive).
    try {
      String result = client
              .projectClassificationLevels
              .getDefaultDataClassificationLevelFromProject(projectIdOrKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectClassificationLevelsApi#getDefaultDataClassificationLevelFromProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .projectClassificationLevels
              .getDefaultDataClassificationLevelFromProject(projectIdOrKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectClassificationLevelsApi#getDefaultDataClassificationLevelFromProject");
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
| **projectIdOrKey** | **String**| The project ID or project key (case-sensitive). | |

### Return type

**String**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the project is not found. |  -  |

<a name="removeDefaultDataClassificationLevelFromProject"></a>
# **removeDefaultDataClassificationLevelFromProject**
> Object removeDefaultDataClassificationLevelFromProject(projectIdOrKey).execute();

Remove the default data classification level from a project

Remove the default data classification level for a project.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectClassificationLevelsApi;
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
    String projectIdOrKey = "projectIdOrKey_example"; // The project ID or project key (case-sensitive).
    try {
      Object result = client
              .projectClassificationLevels
              .removeDefaultDataClassificationLevelFromProject(projectIdOrKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectClassificationLevelsApi#removeDefaultDataClassificationLevelFromProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .projectClassificationLevels
              .removeDefaultDataClassificationLevelFromProject(projectIdOrKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectClassificationLevelsApi#removeDefaultDataClassificationLevelFromProject");
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
| **projectIdOrKey** | **String**| The project ID or project key (case-sensitive). | |

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
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the project is not found. |  -  |

<a name="updateDefaultDataClassificationLevel"></a>
# **updateDefaultDataClassificationLevel**
> Object updateDefaultDataClassificationLevel(projectIdOrKey, updateDefaultProjectClassificationBean).execute();

Update the default data classification level of a project

Updates the default data classification level for a project.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectClassificationLevelsApi;
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
    String id = "id_example"; // The ID of the project classification.
    String projectIdOrKey = "projectIdOrKey_example"; // The project ID or project key (case-sensitive).
    try {
      Object result = client
              .projectClassificationLevels
              .updateDefaultDataClassificationLevel(id, projectIdOrKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectClassificationLevelsApi#updateDefaultDataClassificationLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .projectClassificationLevels
              .updateDefaultDataClassificationLevel(id, projectIdOrKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectClassificationLevelsApi#updateDefaultDataClassificationLevel");
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
| **projectIdOrKey** | **String**| The project ID or project key (case-sensitive). | |
| **updateDefaultProjectClassificationBean** | [**UpdateDefaultProjectClassificationBean**](UpdateDefaultProjectClassificationBean.md)|  | |

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
| **204** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the project is not found. |  -  |

