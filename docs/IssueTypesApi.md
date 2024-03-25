# IssueTypesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createIssueType**](IssueTypesApi.md#createIssueType) | **POST** /rest/api/3/issuetype | Create issue type |
| [**deleteById**](IssueTypesApi.md#deleteById) | **DELETE** /rest/api/3/issuetype/{id} | Delete issue type |
| [**getAllForUser**](IssueTypesApi.md#getAllForUser) | **GET** /rest/api/3/issuetype | Get all issue types for user |
| [**getById**](IssueTypesApi.md#getById) | **GET** /rest/api/3/issuetype/{id} | Get issue type |
| [**getProjectIssueTypes**](IssueTypesApi.md#getProjectIssueTypes) | **GET** /rest/api/3/issuetype/project | Get issue types for project |
| [**listAlternativeIssueTypes**](IssueTypesApi.md#listAlternativeIssueTypes) | **GET** /rest/api/3/issuetype/{id}/alternatives | Get alternative issue types |
| [**loadIssueTypeAvatar**](IssueTypesApi.md#loadIssueTypeAvatar) | **POST** /rest/api/3/issuetype/{id}/avatar2 | Load issue type avatar |
| [**updateIssueType**](IssueTypesApi.md#updateIssueType) | **PUT** /rest/api/3/issuetype/{id} | Update issue type |


<a name="createIssueType"></a>
# **createIssueType**
> IssueTypeDetails createIssueType(issueTypeCreateBean).execute();

Create issue type

Creates an issue type and adds it to the default issue type scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueTypesApi;
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
    String name = "name_example"; // The unique name for the issue type. The maximum length is 60 characters.
    String description = "description_example"; // The description of the issue type.
    Integer hierarchyLevel = 56; // The hierarchy level of the issue type. Use:   *  `-1` for Subtask.  *  `0` for Base.  Defaults to `0`.
    String type = "subtask"; // Deprecated. Use `hierarchyLevel` instead. See the [deprecation notice](https://community.developer.atlassian.com/t/deprecation-of-the-epic-link-parent-link-and-other-related-fields-in-rest-apis-and-webhooks/54048) for details.  Whether the issue type is `subtype` or `standard`. Defaults to `standard`.
    try {
      IssueTypeDetails result = client
              .issueTypes
              .createIssueType(name)
              .description(description)
              .hierarchyLevel(hierarchyLevel)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAvatarId());
      System.out.println(result.getEntityId());
      System.out.println(result.getHierarchyLevel());
      System.out.println(result.getIconUrl());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getScope());
      System.out.println(result.getSelf());
      System.out.println(result.getSubtask());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#createIssueType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueTypeDetails> response = client
              .issueTypes
              .createIssueType(name)
              .description(description)
              .hierarchyLevel(hierarchyLevel)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#createIssueType");
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
| **issueTypeCreateBean** | [**IssueTypeCreateBean**](IssueTypeCreateBean.md)|  | |

### Return type

[**IssueTypeDetails**](IssueTypeDetails.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid because:   *  no content is sent.  *  the issue type name exceeds 60 characters.  *  a subtask issue type is requested on an instance where subtasks are disabled. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **409** | Returned if the issue type name is in use. |  -  |

<a name="deleteById"></a>
# **deleteById**
> deleteById(id).alternativeIssueTypeId(alternativeIssueTypeId).execute();

Delete issue type

Deletes the issue type. If the issue type is in use, all uses are updated with the alternative issue type (&#x60;alternativeIssueTypeId&#x60;). A list of alternative issue types are obtained from the [Get alternative issue types](https://dac-static.atlassian.com) resource.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueTypesApi;
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
    String id = "id_example"; // The ID of the issue type.
    String alternativeIssueTypeId = "alternativeIssueTypeId_example"; // The ID of the replacement issue type.
    try {
      client
              .issueTypes
              .deleteById(id)
              .alternativeIssueTypeId(alternativeIssueTypeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .issueTypes
              .deleteById(id)
              .alternativeIssueTypeId(alternativeIssueTypeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#deleteById");
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
| **id** | **String**| The ID of the issue type. | |
| **alternativeIssueTypeId** | **String**| The ID of the replacement issue type. | [optional] |

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
| **400** | Returned if any issues cannot be updated with the alternative issue type. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if:   *  the issue type is in use and an alternative issue type is not specified.  *  the issue type or alternative issue type is not found. |  -  |
| **409** | Returned if the issue type is in use and:   *  also specified as the alternative issue type.  *  is a *standard* issue type and the alternative issue type is a *subtask*. |  -  |

<a name="getAllForUser"></a>
# **getAllForUser**
> List&lt;IssueTypeDetails&gt; getAllForUser().execute();

Get all issue types for user

Returns all issue types.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Issue types are only returned as follows:   *  if the user has the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), all issue types are returned.  *  if the user has the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, the issue types associated with the projects the user has permission to browse are returned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueTypesApi;
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
      List<IssueTypeDetails> result = client
              .issueTypes
              .getAllForUser()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#getAllForUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<IssueTypeDetails>> response = client
              .issueTypes
              .getAllForUser()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#getAllForUser");
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

[**List&lt;IssueTypeDetails&gt;**](IssueTypeDetails.md)

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

<a name="getById"></a>
# **getById**
> IssueTypeDetails getById(id).execute();

Get issue type

Returns an issue type.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) in a project the issue type is associated with or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueTypesApi;
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
    String id = "id_example"; // The ID of the issue type.
    try {
      IssueTypeDetails result = client
              .issueTypes
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAvatarId());
      System.out.println(result.getEntityId());
      System.out.println(result.getHierarchyLevel());
      System.out.println(result.getIconUrl());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getScope());
      System.out.println(result.getSelf());
      System.out.println(result.getSubtask());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueTypeDetails> response = client
              .issueTypes
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#getById");
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
| **id** | **String**| The ID of the issue type. | |

### Return type

[**IssueTypeDetails**](IssueTypeDetails.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the issue type ID is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if:   *  the issue type is not found.  *  the user does not have the required permissions. |  -  |

<a name="getProjectIssueTypes"></a>
# **getProjectIssueTypes**
> List&lt;IssueTypeDetails&gt; getProjectIssueTypes(projectId).level(level).execute();

Get issue types for project

Returns issue types for a project.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) in the relevant project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueTypesApi;
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
    Integer level = 56; // The level of the issue type to filter by. Use:   *  `-1` for Subtask.  *  `0` for Base.  *  `1` for Epic.
    try {
      List<IssueTypeDetails> result = client
              .issueTypes
              .getProjectIssueTypes(projectId)
              .level(level)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#getProjectIssueTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<IssueTypeDetails>> response = client
              .issueTypes
              .getProjectIssueTypes(projectId)
              .level(level)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#getProjectIssueTypes");
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
| **level** | **Integer**| The level of the issue type to filter by. Use:   *  &#x60;-1&#x60; for Subtask.  *  &#x60;0&#x60; for Base.  *  &#x60;1&#x60; for Epic. | [optional] |

### Return type

[**List&lt;IssueTypeDetails&gt;**](IssueTypeDetails.md)

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
| **404** | Returned if:   *  the project is not found.  *  the user does not have the necessary permission. |  -  |

<a name="listAlternativeIssueTypes"></a>
# **listAlternativeIssueTypes**
> List&lt;IssueTypeDetails&gt; listAlternativeIssueTypes(id).execute();

Get alternative issue types

Returns a list of issue types that can be used to replace the issue type. The alternative issue types are those assigned to the same workflow scheme, field configuration scheme, and screen scheme.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueTypesApi;
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
    String id = "id_example"; // The ID of the issue type.
    try {
      List<IssueTypeDetails> result = client
              .issueTypes
              .listAlternativeIssueTypes(id)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#listAlternativeIssueTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<IssueTypeDetails>> response = client
              .issueTypes
              .listAlternativeIssueTypes(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#listAlternativeIssueTypes");
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
| **id** | **String**| The ID of the issue type. | |

### Return type

[**List&lt;IssueTypeDetails&gt;**](IssueTypeDetails.md)

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
| **404** | Returned if:   *  the issue type is not found.  *  the user does not have the required permissions. |  -  |

<a name="loadIssueTypeAvatar"></a>
# **loadIssueTypeAvatar**
> Avatar loadIssueTypeAvatar(id, size, body).x(x).y(y).execute();

Load issue type avatar

Loads an avatar for the issue type.  Specify the avatar&#39;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](https://dac-static.atlassian.com).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST \\ --user email@example.com:&lt;api_token&gt; \\ --header &#39;X-Atlassian-Token: no-check&#39; \\ --header &#39;Content-Type: image/&lt; image_type&gt;&#39; \\ --data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; \\ --url &#39;https://your-domain.atlassian.net/rest/api/3/issuetype/{issueTypeId}&#39;This&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#39;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar, use [Update issue type](https://dac-static.atlassian.com) to set it as the issue type&#39;s displayed avatar.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueTypesApi;
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
    String id = "id_example"; // The ID of the issue type.
    Integer size = 56; // The length of each side of the crop region.
    Integer x = 0; // The X coordinate of the top-left corner of the crop region.
    Integer y = 0; // The Y coordinate of the top-left corner of the crop region.
    try {
      Avatar result = client
              .issueTypes
              .loadIssueTypeAvatar(id, size)
              .x(x)
              .y(y)
              .execute();
      System.out.println(result);
      System.out.println(result.getFileName());
      System.out.println(result.getId());
      System.out.println(result.getIsDeletable());
      System.out.println(result.getIsSelected());
      System.out.println(result.getIsSystemAvatar());
      System.out.println(result.getOwner());
      System.out.println(result.getUrls());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#loadIssueTypeAvatar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Avatar> response = client
              .issueTypes
              .loadIssueTypeAvatar(id, size)
              .x(x)
              .y(y)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#loadIssueTypeAvatar");
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
| **id** | **String**| The ID of the issue type. | |
| **size** | **Integer**| The length of each side of the crop region. | |
| **body** | **Object**|  | |
| **x** | **Integer**| The X coordinate of the top-left corner of the crop region. | [optional] [default to 0] |
| **y** | **Integer**| The Y coordinate of the top-left corner of the crop region. | [optional] [default to 0] |

### Return type

[**Avatar**](Avatar.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is successful. |  -  |
| **400** | Returned if:   *  an image isn&#39;t included in the request.  *  the image type is unsupported.  *  the crop parameters extend the crop area beyond the edge of the image.  *  &#x60;cropSize&#x60; is missing.  *  the issue type ID is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the issue type is not found. |  -  |

<a name="updateIssueType"></a>
# **updateIssueType**
> IssueTypeDetails updateIssueType(id, issueTypeUpdateBean).execute();

Update issue type

Updates the issue type.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueTypesApi;
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
    String id = "id_example"; // The ID of the issue type.
    String description = "description_example"; // The description of the issue type.
    Long avatarId = 56L; // The ID of an issue type avatar.
    String name = "name_example"; // The unique name for the issue type. The maximum length is 60 characters.
    try {
      IssueTypeDetails result = client
              .issueTypes
              .updateIssueType(id)
              .description(description)
              .avatarId(avatarId)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAvatarId());
      System.out.println(result.getEntityId());
      System.out.println(result.getHierarchyLevel());
      System.out.println(result.getIconUrl());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getScope());
      System.out.println(result.getSelf());
      System.out.println(result.getSubtask());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#updateIssueType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueTypeDetails> response = client
              .issueTypes
              .updateIssueType(id)
              .description(description)
              .avatarId(avatarId)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypesApi#updateIssueType");
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
| **id** | **String**| The ID of the issue type. | |
| **issueTypeUpdateBean** | [**IssueTypeUpdateBean**](IssueTypeUpdateBean.md)|  | |

### Return type

[**IssueTypeDetails**](IssueTypeDetails.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid because:   *  no content is sent.  *  the issue type name exceeds 60 characters.  *  the avatar is not associated with this issue type. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the issue type is not found. |  -  |
| **409** | Returned if the issue type name is in use. |  -  |

