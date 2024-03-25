# IssueSecuritySchemesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addMembersToLevel**](IssueSecuritySchemesApi.md#addMembersToLevel) | **PUT** /rest/api/3/issuesecurityschemes/{schemeId}/level/{levelId}/member | Add issue security level members |
| [**addSecurityLevels**](IssueSecuritySchemesApi.md#addSecurityLevels) | **PUT** /rest/api/3/issuesecurityschemes/{schemeId}/level | Add issue security levels |
| [**associateSchemeToProject**](IssueSecuritySchemesApi.md#associateSchemeToProject) | **PUT** /rest/api/3/issuesecurityschemes/project | Associate security scheme to project |
| [**createSecurityScheme**](IssueSecuritySchemesApi.md#createSecurityScheme) | **POST** /rest/api/3/issuesecurityschemes | Create issue security scheme |
| [**deleteSecurityScheme**](IssueSecuritySchemesApi.md#deleteSecurityScheme) | **DELETE** /rest/api/3/issuesecurityschemes/{schemeId} | Delete issue security scheme |
| [**getLevelMembers**](IssueSecuritySchemesApi.md#getLevelMembers) | **GET** /rest/api/3/issuesecurityschemes/level/member | Get issue security level members |
| [**getProjectSecuritySchemes**](IssueSecuritySchemesApi.md#getProjectSecuritySchemes) | **GET** /rest/api/3/issuesecurityschemes/project | Get projects using issue security schemes |
| [**getSchemeSecurityLevels**](IssueSecuritySchemesApi.md#getSchemeSecurityLevels) | **GET** /rest/api/3/issuesecurityschemes/{id} | Get issue security scheme |
| [**getSecurityLevels**](IssueSecuritySchemesApi.md#getSecurityLevels) | **GET** /rest/api/3/issuesecurityschemes/level | Get issue security levels |
| [**getSecuritySchemes**](IssueSecuritySchemesApi.md#getSecuritySchemes) | **GET** /rest/api/3/issuesecurityschemes | Get issue security schemes |
| [**removeLevel**](IssueSecuritySchemesApi.md#removeLevel) | **DELETE** /rest/api/3/issuesecurityschemes/{schemeId}/level/{levelId} | Remove issue security level |
| [**removeSecurityLevelMember**](IssueSecuritySchemesApi.md#removeSecurityLevelMember) | **DELETE** /rest/api/3/issuesecurityschemes/{schemeId}/level/{levelId}/member/{memberId} | Remove member from issue security level |
| [**searchSecuritySchemes**](IssueSecuritySchemesApi.md#searchSecuritySchemes) | **GET** /rest/api/3/issuesecurityschemes/search | Search issue security schemes |
| [**setDefaultLevels**](IssueSecuritySchemesApi.md#setDefaultLevels) | **PUT** /rest/api/3/issuesecurityschemes/level/default | Set default issue security levels |
| [**updateSecurityLevel**](IssueSecuritySchemesApi.md#updateSecurityLevel) | **PUT** /rest/api/3/issuesecurityschemes/{schemeId}/level/{levelId} | Update issue security level |
| [**updateSecurityScheme**](IssueSecuritySchemesApi.md#updateSecurityScheme) | **PUT** /rest/api/3/issuesecurityschemes/{id} | Update issue security scheme |


<a name="addMembersToLevel"></a>
# **addMembersToLevel**
> Object addMembersToLevel(schemeId, levelId, securitySchemeMembersRequest).execute();

Add issue security level members

Adds members to the issue security level. You can add up to 100 members per request.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    String schemeId = "schemeId_example"; // The ID of the issue security scheme.
    String levelId = "levelId_example"; // The ID of the issue security level.
    List<SecuritySchemeLevelMemberBean> members = Arrays.asList(); // The list of level members which should be added to the issue security scheme level.
    try {
      Object result = client
              .issueSecuritySchemes
              .addMembersToLevel(schemeId, levelId)
              .members(members)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#addMembersToLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issueSecuritySchemes
              .addMembersToLevel(schemeId, levelId)
              .members(members)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#addMembersToLevel");
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
| **schemeId** | **String**| The ID of the issue security scheme. | |
| **levelId** | **String**| The ID of the issue security level. | |
| **securitySchemeMembersRequest** | [**SecuritySchemeMembersRequest**](SecuritySchemeMembersRequest.md)|  | |

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

<a name="addSecurityLevels"></a>
# **addSecurityLevels**
> Object addSecurityLevels(schemeId, addSecuritySchemeLevelsRequestBean).execute();

Add issue security levels

Adds levels and levels&#39; members to the issue security scheme. You can add up to 100 levels per request.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    String schemeId = "schemeId_example"; // The ID of the issue security scheme.
    List<SecuritySchemeLevelBean> levels = Arrays.asList(); // The list of scheme levels which should be added to the security scheme.
    try {
      Object result = client
              .issueSecuritySchemes
              .addSecurityLevels(schemeId)
              .levels(levels)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#addSecurityLevels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issueSecuritySchemes
              .addSecurityLevels(schemeId)
              .levels(levels)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#addSecurityLevels");
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
| **schemeId** | **String**| The ID of the issue security scheme. | |
| **addSecuritySchemeLevelsRequestBean** | [**AddSecuritySchemeLevelsRequestBean**](AddSecuritySchemeLevelsRequestBean.md)|  | |

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

<a name="associateSchemeToProject"></a>
# **associateSchemeToProject**
> associateSchemeToProject(associateSecuritySchemeWithProjectDetails).execute();

Associate security scheme to project

Associates an issue security scheme with a project and remaps security levels of issues to the new levels, if provided.  This operation is [asynchronous](https://dac-static.atlassian.com). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](https://dac-static.atlassian.com) to obtain subsequent updates.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    String projectId = "projectId_example"; // The ID of the project.
    String schemeId = "schemeId_example"; // The ID of the issue security scheme. Providing null will clear the association with the issue security scheme.
    List<OldToNewSecurityLevelMappingsBean> oldToNewSecurityLevelMappings = Arrays.asList(); // The list of scheme levels which should be remapped to new levels of the issue security scheme.
    try {
      client
              .issueSecuritySchemes
              .associateSchemeToProject(projectId, schemeId)
              .oldToNewSecurityLevelMappings(oldToNewSecurityLevelMappings)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#associateSchemeToProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .issueSecuritySchemes
              .associateSchemeToProject(projectId, schemeId)
              .oldToNewSecurityLevelMappings(oldToNewSecurityLevelMappings)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#associateSchemeToProject");
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
| **associateSecuritySchemeWithProjectDetails** | [**AssociateSecuritySchemeWithProjectDetails**](AssociateSecuritySchemeWithProjectDetails.md)|  | |

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
| **200** | OK |  -  |

<a name="createSecurityScheme"></a>
# **createSecurityScheme**
> SecuritySchemeId createSecurityScheme(requestBody).execute();

Create issue security scheme

Creates a security scheme with security scheme levels and levels&#39; members. You can create up to 100 security scheme levels and security scheme levels&#39; members per request.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    String name = "name_example"; // The name of the issue security scheme. Must be unique (case-insensitive).
    String description = "description_example"; // The description of the issue security scheme.
    List<SecuritySchemeLevelBean> levels = Arrays.asList(); // The list of scheme levels which should be added to the security scheme.
    try {
      SecuritySchemeId result = client
              .issueSecuritySchemes
              .createSecurityScheme(name)
              .description(description)
              .levels(levels)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#createSecurityScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SecuritySchemeId> response = client
              .issueSecuritySchemes
              .createSecurityScheme(name)
              .description(description)
              .levels(levels)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#createSecurityScheme");
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

[**SecuritySchemeId**](SecuritySchemeId.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is successful. |  -  |

<a name="deleteSecurityScheme"></a>
# **deleteSecurityScheme**
> Object deleteSecurityScheme(schemeId).execute();

Delete issue security scheme

Deletes an issue security scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    String schemeId = "schemeId_example"; // The ID of the issue security scheme.
    try {
      Object result = client
              .issueSecuritySchemes
              .deleteSecurityScheme(schemeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#deleteSecurityScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issueSecuritySchemes
              .deleteSecurityScheme(schemeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#deleteSecurityScheme");
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
| **schemeId** | **String**| The ID of the issue security scheme. | |

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

<a name="getLevelMembers"></a>
# **getLevelMembers**
> PageBeanSecurityLevelMember getLevelMembers().startAt(startAt).maxResults(maxResults).id(id).schemeId(schemeId).levelId(levelId).expand(expand).execute();

Get issue security level members

Returns a [paginated](https://dac-static.atlassian.com) list of issue security level members.  Only issue security level members in the context of classic projects are returned.  Filtering using parameters is inclusive: if you specify both security scheme IDs and level IDs, the result will include all issue security level members from the specified schemes and levels.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    String startAt = "0"; // The index of the first item to return in a page of results (page offset).
    String maxResults = "50"; // The maximum number of items to return per page.
    Set<String> id = Arrays.asList(); // The list of issue security level member IDs. To include multiple issue security level members separate IDs with an ampersand: `id=10000&id=10001`.
    Set<String> schemeId = Arrays.asList(); // The list of issue security scheme IDs. To include multiple issue security schemes separate IDs with an ampersand: `schemeId=10000&schemeId=10001`.
    Set<String> levelId = Arrays.asList(); // The list of issue security level IDs. To include multiple issue security levels separate IDs with an ampersand: `levelId=10000&levelId=10001`.
    String expand = "expand_example"; // Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `all` Returns all expandable information  *  `field` Returns information about the custom field granted the permission  *  `group` Returns information about the group that is granted the permission  *  `projectRole` Returns information about the project role granted the permission  *  `user` Returns information about the user who is granted the permission
    try {
      PageBeanSecurityLevelMember result = client
              .issueSecuritySchemes
              .getLevelMembers()
              .startAt(startAt)
              .maxResults(maxResults)
              .id(id)
              .schemeId(schemeId)
              .levelId(levelId)
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
      System.err.println("Exception when calling IssueSecuritySchemesApi#getLevelMembers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanSecurityLevelMember> response = client
              .issueSecuritySchemes
              .getLevelMembers()
              .startAt(startAt)
              .maxResults(maxResults)
              .id(id)
              .schemeId(schemeId)
              .levelId(levelId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#getLevelMembers");
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
| **startAt** | **String**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **String**| The maximum number of items to return per page. | [optional] [default to 50] |
| **id** | [**Set&lt;String&gt;**](String.md)| The list of issue security level member IDs. To include multiple issue security level members separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. | [optional] |
| **schemeId** | [**Set&lt;String&gt;**](String.md)| The list of issue security scheme IDs. To include multiple issue security schemes separate IDs with an ampersand: &#x60;schemeId&#x3D;10000&amp;schemeId&#x3D;10001&#x60;. | [optional] |
| **levelId** | [**Set&lt;String&gt;**](String.md)| The list of issue security level IDs. To include multiple issue security levels separate IDs with an ampersand: &#x60;levelId&#x3D;10000&amp;levelId&#x3D;10001&#x60;. | [optional] |
| **expand** | **String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information  *  &#x60;field&#x60; Returns information about the custom field granted the permission  *  &#x60;group&#x60; Returns information about the group that is granted the permission  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission  *  &#x60;user&#x60; Returns information about the user who is granted the permission | [optional] |

### Return type

[**PageBeanSecurityLevelMember**](PageBeanSecurityLevelMember.md)

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

<a name="getProjectSecuritySchemes"></a>
# **getProjectSecuritySchemes**
> PageBeanIssueSecuritySchemeToProjectMapping getProjectSecuritySchemes().startAt(startAt).maxResults(maxResults).issueSecuritySchemeId(issueSecuritySchemeId).projectId(projectId).execute();

Get projects using issue security schemes

Returns a [paginated](https://dac-static.atlassian.com) mapping of projects that are using security schemes. You can provide either one or multiple security scheme IDs or project IDs to filter by. If you don&#39;t provide any, this will return a list of all mappings. Only issue security schemes in the context of classic projects are supported. **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    String startAt = "0"; // The index of the first item to return in a page of results (page offset).
    String maxResults = "50"; // The maximum number of items to return per page.
    Set<String> issueSecuritySchemeId = Arrays.asList(); // The list of security scheme IDs to be filtered out.
    Set<String> projectId = Arrays.asList(); // The list of project IDs to be filtered out.
    try {
      PageBeanIssueSecuritySchemeToProjectMapping result = client
              .issueSecuritySchemes
              .getProjectSecuritySchemes()
              .startAt(startAt)
              .maxResults(maxResults)
              .issueSecuritySchemeId(issueSecuritySchemeId)
              .projectId(projectId)
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
      System.err.println("Exception when calling IssueSecuritySchemesApi#getProjectSecuritySchemes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanIssueSecuritySchemeToProjectMapping> response = client
              .issueSecuritySchemes
              .getProjectSecuritySchemes()
              .startAt(startAt)
              .maxResults(maxResults)
              .issueSecuritySchemeId(issueSecuritySchemeId)
              .projectId(projectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#getProjectSecuritySchemes");
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
| **startAt** | **String**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **String**| The maximum number of items to return per page. | [optional] [default to 50] |
| **issueSecuritySchemeId** | [**Set&lt;String&gt;**](String.md)| The list of security scheme IDs to be filtered out. | [optional] |
| **projectId** | [**Set&lt;String&gt;**](String.md)| The list of project IDs to be filtered out. | [optional] |

### Return type

[**PageBeanIssueSecuritySchemeToProjectMapping**](PageBeanIssueSecuritySchemeToProjectMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="getSchemeSecurityLevels"></a>
# **getSchemeSecurityLevels**
> SecurityScheme getSchemeSecurityLevels(id).execute();

Get issue security scheme

Returns an issue security scheme along with its security levels.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project that uses the requested issue security scheme.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    Long id = 56L; // The ID of the issue security scheme. Use the [Get issue security schemes](https://dac-static.atlassian.com) operation to get a list of issue security scheme IDs.
    try {
      SecurityScheme result = client
              .issueSecuritySchemes
              .getSchemeSecurityLevels(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getDefaultSecurityLevelId());
      System.out.println(result.getId());
      System.out.println(result.getLevels());
      System.out.println(result.getName());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#getSchemeSecurityLevels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SecurityScheme> response = client
              .issueSecuritySchemes
              .getSchemeSecurityLevels(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#getSchemeSecurityLevels");
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
| **id** | **Long**| The ID of the issue security scheme. Use the [Get issue security schemes](https://dac-static.atlassian.com) operation to get a list of issue security scheme IDs. | |

### Return type

[**SecurityScheme**](SecurityScheme.md)

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
| **403** | Returned if the user does not have the administrator permission and the scheme is not used in any project where the user has administrative permission. |  -  |

<a name="getSecurityLevels"></a>
# **getSecurityLevels**
> PageBeanSecurityLevel getSecurityLevels().startAt(startAt).maxResults(maxResults).id(id).schemeId(schemeId).onlyDefault(onlyDefault).execute();

Get issue security levels

Returns a [paginated](https://dac-static.atlassian.com) list of issue security levels.  Only issue security levels in the context of classic projects are returned.  Filtering using IDs is inclusive: if you specify both security scheme IDs and level IDs, the result will include both specified issue security levels and all issue security levels from the specified schemes.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    String startAt = "0"; // The index of the first item to return in a page of results (page offset).
    String maxResults = "50"; // The maximum number of items to return per page.
    Set<String> id = Arrays.asList(); // The list of issue security scheme level IDs. To include multiple issue security levels, separate IDs with an ampersand: `id=10000&id=10001`.
    Set<String> schemeId = Arrays.asList(); // The list of issue security scheme IDs. To include multiple issue security schemes, separate IDs with an ampersand: `schemeId=10000&schemeId=10001`.
    Boolean onlyDefault = false; // When set to true, returns multiple default levels for each security scheme containing a default. If you provide scheme and level IDs not associated with the default, returns an empty page. The default value is false.
    try {
      PageBeanSecurityLevel result = client
              .issueSecuritySchemes
              .getSecurityLevels()
              .startAt(startAt)
              .maxResults(maxResults)
              .id(id)
              .schemeId(schemeId)
              .onlyDefault(onlyDefault)
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
      System.err.println("Exception when calling IssueSecuritySchemesApi#getSecurityLevels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanSecurityLevel> response = client
              .issueSecuritySchemes
              .getSecurityLevels()
              .startAt(startAt)
              .maxResults(maxResults)
              .id(id)
              .schemeId(schemeId)
              .onlyDefault(onlyDefault)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#getSecurityLevels");
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
| **startAt** | **String**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **String**| The maximum number of items to return per page. | [optional] [default to 50] |
| **id** | [**Set&lt;String&gt;**](String.md)| The list of issue security scheme level IDs. To include multiple issue security levels, separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. | [optional] |
| **schemeId** | [**Set&lt;String&gt;**](String.md)| The list of issue security scheme IDs. To include multiple issue security schemes, separate IDs with an ampersand: &#x60;schemeId&#x3D;10000&amp;schemeId&#x3D;10001&#x60;. | [optional] |
| **onlyDefault** | **Boolean**| When set to true, returns multiple default levels for each security scheme containing a default. If you provide scheme and level IDs not associated with the default, returns an empty page. The default value is false. | [optional] [default to false] |

### Return type

[**PageBeanSecurityLevel**](PageBeanSecurityLevel.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="getSecuritySchemes"></a>
# **getSecuritySchemes**
> SecuritySchemes getSecuritySchemes().execute();

Get issue security schemes

Returns all [issue security schemes](https://confluence.atlassian.com/x/J4lKLg).  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
      SecuritySchemes result = client
              .issueSecuritySchemes
              .getSecuritySchemes()
              .execute();
      System.out.println(result);
      System.out.println(result.getIssueSecuritySchemes());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#getSecuritySchemes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SecuritySchemes> response = client
              .issueSecuritySchemes
              .getSecuritySchemes()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#getSecuritySchemes");
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

[**SecuritySchemes**](SecuritySchemes.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **403** | Returned if the user does not have permission to administer issue security schemes. |  -  |

<a name="removeLevel"></a>
# **removeLevel**
> removeLevel(schemeId, levelId).replaceWith(replaceWith).execute();

Remove issue security level

Deletes an issue security level.  This operation is [asynchronous](https://dac-static.atlassian.com). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](https://dac-static.atlassian.com) to obtain subsequent updates.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    String schemeId = "schemeId_example"; // The ID of the issue security scheme.
    String levelId = "levelId_example"; // The ID of the issue security level to remove.
    String replaceWith = "replaceWith_example"; // The ID of the issue security level that will replace the currently selected level.
    try {
      client
              .issueSecuritySchemes
              .removeLevel(schemeId, levelId)
              .replaceWith(replaceWith)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#removeLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .issueSecuritySchemes
              .removeLevel(schemeId, levelId)
              .replaceWith(replaceWith)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#removeLevel");
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
| **schemeId** | **String**| The ID of the issue security scheme. | |
| **levelId** | **String**| The ID of the issue security level to remove. | |
| **replaceWith** | **String**| The ID of the issue security level that will replace the currently selected level. | [optional] |

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

<a name="removeSecurityLevelMember"></a>
# **removeSecurityLevelMember**
> Object removeSecurityLevelMember(schemeId, levelId, memberId).execute();

Remove member from issue security level

Removes an issue security level member from an issue security scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    String schemeId = "schemeId_example"; // The ID of the issue security scheme.
    String levelId = "levelId_example"; // The ID of the issue security level.
    String memberId = "memberId_example"; // The ID of the issue security level member to be removed.
    try {
      Object result = client
              .issueSecuritySchemes
              .removeSecurityLevelMember(schemeId, levelId, memberId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#removeSecurityLevelMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issueSecuritySchemes
              .removeSecurityLevelMember(schemeId, levelId, memberId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#removeSecurityLevelMember");
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
| **schemeId** | **String**| The ID of the issue security scheme. | |
| **levelId** | **String**| The ID of the issue security level. | |
| **memberId** | **String**| The ID of the issue security level member to be removed. | |

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

<a name="searchSecuritySchemes"></a>
# **searchSecuritySchemes**
> PageBeanSecuritySchemeWithProjects searchSecuritySchemes().startAt(startAt).maxResults(maxResults).id(id).projectId(projectId).execute();

Search issue security schemes

Returns a [paginated](https://dac-static.atlassian.com) list of issue security schemes.   If you specify the project ID parameter, the result will contain issue security schemes and related project IDs you filter by. Use \\{@link IssueSecuritySchemeResource\\#searchProjectsUsingSecuritySchemes(String, String, Set, Set)\\} to obtain all projects related to scheme.  Only issue security schemes in the context of classic projects are returned.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    String startAt = "0"; // The index of the first item to return in a page of results (page offset).
    String maxResults = "50"; // The maximum number of items to return per page.
    Set<String> id = Arrays.asList(); // The list of issue security scheme IDs. To include multiple issue security scheme IDs, separate IDs with an ampersand: `id=10000&id=10001`.
    Set<String> projectId = Arrays.asList(); // The list of project IDs. To include multiple project IDs, separate IDs with an ampersand: `projectId=10000&projectId=10001`.
    try {
      PageBeanSecuritySchemeWithProjects result = client
              .issueSecuritySchemes
              .searchSecuritySchemes()
              .startAt(startAt)
              .maxResults(maxResults)
              .id(id)
              .projectId(projectId)
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
      System.err.println("Exception when calling IssueSecuritySchemesApi#searchSecuritySchemes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanSecuritySchemeWithProjects> response = client
              .issueSecuritySchemes
              .searchSecuritySchemes()
              .startAt(startAt)
              .maxResults(maxResults)
              .id(id)
              .projectId(projectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#searchSecuritySchemes");
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
| **startAt** | **String**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **String**| The maximum number of items to return per page. | [optional] [default to 50] |
| **id** | [**Set&lt;String&gt;**](String.md)| The list of issue security scheme IDs. To include multiple issue security scheme IDs, separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. | [optional] |
| **projectId** | [**Set&lt;String&gt;**](String.md)| The list of project IDs. To include multiple project IDs, separate IDs with an ampersand: &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. | [optional] |

### Return type

[**PageBeanSecuritySchemeWithProjects**](PageBeanSecuritySchemeWithProjects.md)

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

<a name="setDefaultLevels"></a>
# **setDefaultLevels**
> Object setDefaultLevels(requestBody).execute();

Set default issue security levels

Sets default issue security levels for schemes.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    List<DefaultLevelValue> defaultValues = Arrays.asList(); // List of objects with issue security scheme ID and new default level ID.
    try {
      Object result = client
              .issueSecuritySchemes
              .setDefaultLevels(defaultValues)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#setDefaultLevels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issueSecuritySchemes
              .setDefaultLevels(defaultValues)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#setDefaultLevels");
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
| **204** | Returned if the request is successful. |  -  |

<a name="updateSecurityLevel"></a>
# **updateSecurityLevel**
> Object updateSecurityLevel(schemeId, levelId, requestBody).execute();

Update issue security level

Updates the issue security level.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    String schemeId = "schemeId_example"; // The ID of the issue security scheme level belongs to.
    String levelId = "levelId_example"; // The ID of the issue security level to update.
    String description = "description_example"; // The description of the issue security scheme level.
    String name = "name_example"; // The name of the issue security scheme level. Must be unique.
    try {
      Object result = client
              .issueSecuritySchemes
              .updateSecurityLevel(schemeId, levelId)
              .description(description)
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#updateSecurityLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issueSecuritySchemes
              .updateSecurityLevel(schemeId, levelId)
              .description(description)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#updateSecurityLevel");
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
| **schemeId** | **String**| The ID of the issue security scheme level belongs to. | |
| **levelId** | **String**| The ID of the issue security level to update. | |
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
| **204** | Returned if the request is successful. |  -  |

<a name="updateSecurityScheme"></a>
# **updateSecurityScheme**
> Object updateSecurityScheme(id, updateIssueSecuritySchemeRequestBean).execute();

Update issue security scheme

Updates the issue security scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSecuritySchemesApi;
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
    String id = "id_example"; // The ID of the issue security scheme.
    String description = "description_example"; // The description of the security scheme scheme.
    String name = "name_example"; // The name of the security scheme scheme. Must be unique.
    try {
      Object result = client
              .issueSecuritySchemes
              .updateSecurityScheme(id)
              .description(description)
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#updateSecurityScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issueSecuritySchemes
              .updateSecurityScheme(id)
              .description(description)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecuritySchemesApi#updateSecurityScheme");
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
| **id** | **String**| The ID of the issue security scheme. | |
| **updateIssueSecuritySchemeRequestBean** | [**UpdateIssueSecuritySchemeRequestBean**](UpdateIssueSecuritySchemeRequestBean.md)|  | |

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

