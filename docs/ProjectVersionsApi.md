# ProjectVersionsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProjectVersion**](ProjectVersionsApi.md#createProjectVersion) | **POST** /rest/api/3/version | Create version |
| [**createRelatedWork**](ProjectVersionsApi.md#createRelatedWork) | **POST** /rest/api/3/version/{id}/relatedwork | Create related work |
| [**deleteAndReplaceVersion**](ProjectVersionsApi.md#deleteAndReplaceVersion) | **POST** /rest/api/3/version/{id}/removeAndSwap | Delete and replace version |
| [**deleteProjectVersion**](ProjectVersionsApi.md#deleteProjectVersion) | **DELETE** /rest/api/3/version/{id} | Delete version |
| [**deleteRelatedWork**](ProjectVersionsApi.md#deleteRelatedWork) | **DELETE** /rest/api/3/version/{versionId}/relatedwork/{relatedWorkId} | Delete related work |
| [**getAllProjectVersions**](ProjectVersionsApi.md#getAllProjectVersions) | **GET** /rest/api/3/project/{projectIdOrKey}/versions | Get project versions |
| [**getProjectVersion**](ProjectVersionsApi.md#getProjectVersion) | **GET** /rest/api/3/version/{id} | Get version |
| [**getRelatedIssueCounts**](ProjectVersionsApi.md#getRelatedIssueCounts) | **GET** /rest/api/3/version/{id}/relatedIssueCounts | Get version&#39;s related issues count |
| [**getRelatedWorkItems**](ProjectVersionsApi.md#getRelatedWorkItems) | **GET** /rest/api/3/version/{id}/relatedwork | Get related work |
| [**getUnresolvedIssueCount**](ProjectVersionsApi.md#getUnresolvedIssueCount) | **GET** /rest/api/3/version/{id}/unresolvedIssueCount | Get version&#39;s unresolved issues count |
| [**listPaginated**](ProjectVersionsApi.md#listPaginated) | **GET** /rest/api/3/project/{projectIdOrKey}/version | Get project versions paginated |
| [**mergeVersions**](ProjectVersionsApi.md#mergeVersions) | **PUT** /rest/api/3/version/{id}/mergeto/{moveIssuesTo} | Merge versions |
| [**updateRelatedWork**](ProjectVersionsApi.md#updateRelatedWork) | **PUT** /rest/api/3/version/{id}/relatedwork | Update related work |
| [**updateSequenceWithinProject**](ProjectVersionsApi.md#updateSequenceWithinProject) | **POST** /rest/api/3/version/{id}/move | Move version |
| [**updateVersion**](ProjectVersionsApi.md#updateVersion) | **PUT** /rest/api/3/version/{id} | Update version |


<a name="createProjectVersion"></a>
# **createProjectVersion**
> Version createProjectVersion(version).execute();

Create version

Creates a project version.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the version is added to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String description = "description_example"; // The description of the version. Optional when creating or updating a version. The maximum size is 16,384 bytes.
    List<VersionApprover> approvers = Arrays.asList(); // If the expand option `approvers` is used, returns a list containing the approvers for this version.
    Boolean archived = true; // Indicates that the version is archived. Optional when creating or updating a version.
    String driver = "driver_example"; // If the expand option `driver` is used, returns the Atlassian account ID of the driver.
    String expand = "expand_example"; // Use [expand](em>#expansion) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:   *  `operations` Returns the list of operations available for this version.  *  `issuesstatus` Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.  *  `driver` Returns the Atlassian account ID of the version driver.  *  `approvers` Returns a list containing approvers for this version.  Optional for create and update.
    String id = "id_example"; // The ID of the version.
    VersionIssuesStatus issuesStatusForFixVersion = new VersionIssuesStatus(); // If the expand option `issuesstatus` is used, returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.
    URI moveUnfixedIssuesTo = new URI(); // The URL of the self link to the version to which all unfixed issues are moved when a version is released. Not applicable when creating a version. Optional when updating a version.
    String name = "name_example"; // The unique name of the version. Required when creating a version. Optional when updating a version. The maximum length is 255 characters.
    List<SimpleLink> operations = Arrays.asList(); // If the expand option `operations` is used, returns the list of operations available for this version.
    Boolean overdue = true; // Indicates that the version is overdue.
    String project = "project_example"; // Deprecated. Use `projectId`.
    Long projectId = 56L; // The ID of the project to which this version is attached. Required when creating a version. Not applicable when updating a version.
    LocalDate releaseDate = LocalDate.now(); // The release date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
    Boolean released = true; // Indicates that the version is released. If the version is released a request to release again is ignored. Not applicable when creating a version. Optional when updating a version.
    URI self = new URI(); // The URL of the version.
    LocalDate startDate = LocalDate.now(); // The start date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
    String userReleaseDate = "userReleaseDate_example"; // The date on which work on this version is expected to finish, expressed in the instance's *Day/Month/Year Format* date format.
    String userStartDate = "userStartDate_example"; // The date on which work on this version is expected to start, expressed in the instance's *Day/Month/Year Format* date format.
    try {
      Version result = client
              .projectVersions
              .createProjectVersion()
              .description(description)
              .approvers(approvers)
              .archived(archived)
              .driver(driver)
              .expand(expand)
              .id(id)
              .issuesStatusForFixVersion(issuesStatusForFixVersion)
              .moveUnfixedIssuesTo(moveUnfixedIssuesTo)
              .name(name)
              .operations(operations)
              .overdue(overdue)
              .project(project)
              .projectId(projectId)
              .releaseDate(releaseDate)
              .released(released)
              .self(self)
              .startDate(startDate)
              .userReleaseDate(userReleaseDate)
              .userStartDate(userStartDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getApprovers());
      System.out.println(result.getArchived());
      System.out.println(result.getDriver());
      System.out.println(result.getExpand());
      System.out.println(result.getId());
      System.out.println(result.getIssuesStatusForFixVersion());
      System.out.println(result.getMoveUnfixedIssuesTo());
      System.out.println(result.getName());
      System.out.println(result.getOperations());
      System.out.println(result.getOverdue());
      System.out.println(result.getProject());
      System.out.println(result.getProjectId());
      System.out.println(result.getReleaseDate());
      System.out.println(result.getReleased());
      System.out.println(result.getSelf());
      System.out.println(result.getStartDate());
      System.out.println(result.getUserReleaseDate());
      System.out.println(result.getUserStartDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#createProjectVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Version> response = client
              .projectVersions
              .createProjectVersion()
              .description(description)
              .approvers(approvers)
              .archived(archived)
              .driver(driver)
              .expand(expand)
              .id(id)
              .issuesStatusForFixVersion(issuesStatusForFixVersion)
              .moveUnfixedIssuesTo(moveUnfixedIssuesTo)
              .name(name)
              .operations(operations)
              .overdue(overdue)
              .project(project)
              .projectId(projectId)
              .releaseDate(releaseDate)
              .released(released)
              .self(self)
              .startDate(startDate)
              .userReleaseDate(userReleaseDate)
              .userStartDate(userStartDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#createProjectVersion");
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
| **version** | [**Version**](Version.md)|  | |

### Return type

[**Version**](Version.md)

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
| **404** | Returned if:   *  the project is not found.  *  the user does not have the required permissions. |  -  |

<a name="createRelatedWork"></a>
# **createRelatedWork**
> VersionRelatedWork createRelatedWork(id, versionRelatedWork).execute();

Create related work

Creates a related work for the given version. You can only create a generic link type of related works via this API. relatedWorkId will be auto-generated UUID, that does not need to be provided.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Resolve issues:* and *Edit issues* [Managing project permissions](https://confluence.atlassian.com/adminjiraserver/managing-project-permissions-938847145.html) for the project that contains the version.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String category = "category_example"; // The category of the related work
    String id = "id_example";
    String title = "title_example"; // The title of the related work
    Long issueId = 56L; // The title of the related work
    String relatedWorkId = "relatedWorkId_example"; // The id of the related work. For the native release note related work item, this will be null, and Rest API does not support updating it.
    URI url = new URI(); // The URL of the related work
    try {
      VersionRelatedWork result = client
              .projectVersions
              .createRelatedWork(category, id)
              .title(title)
              .issueId(issueId)
              .relatedWorkId(relatedWorkId)
              .url(url)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getCategory());
      System.out.println(result.getIssueId());
      System.out.println(result.getRelatedWorkId());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#createRelatedWork");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VersionRelatedWork> response = client
              .projectVersions
              .createRelatedWork(category, id)
              .title(title)
              .issueId(issueId)
              .relatedWorkId(relatedWorkId)
              .url(url)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#createRelatedWork");
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
| **id** | **String**|  | |
| **versionRelatedWork** | [**VersionRelatedWork**](VersionRelatedWork.md)|  | |

### Return type

[**VersionRelatedWork**](VersionRelatedWork.md)

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
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the version is not found. |  -  |

<a name="deleteAndReplaceVersion"></a>
# **deleteAndReplaceVersion**
> Object deleteAndReplaceVersion(id, deleteAndReplaceVersionBean).execute();

Delete and replace version

Deletes a project version.  Alternative versions can be provided to update issues that use the deleted version in &#x60;fixVersion&#x60;, &#x60;affectedVersion&#x60;, or any version picker custom fields. If alternatives are not provided, occurrences of &#x60;fixVersion&#x60;, &#x60;affectedVersion&#x60;, and any version picker custom field, that contain the deleted version, are cleared. Any replacement version must be in the same project as the version being deleted and cannot be the version being deleted.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String id = "id_example"; // The ID of the version.
    List<CustomFieldReplacement> customFieldReplacementList = Arrays.asList(); // An array of custom field IDs (`customFieldId`) and version IDs (`moveTo`) to update when the fields contain the deleted version.
    Long moveAffectedIssuesTo = 56L; // The ID of the version to update `affectedVersion` to when the field contains the deleted version.
    Long moveFixIssuesTo = 56L; // The ID of the version to update `fixVersion` to when the field contains the deleted version.
    try {
      Object result = client
              .projectVersions
              .deleteAndReplaceVersion(id)
              .customFieldReplacementList(customFieldReplacementList)
              .moveAffectedIssuesTo(moveAffectedIssuesTo)
              .moveFixIssuesTo(moveFixIssuesTo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#deleteAndReplaceVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .projectVersions
              .deleteAndReplaceVersion(id)
              .customFieldReplacementList(customFieldReplacementList)
              .moveAffectedIssuesTo(moveAffectedIssuesTo)
              .moveFixIssuesTo(moveFixIssuesTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#deleteAndReplaceVersion");
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
| **id** | **String**| The ID of the version. | |
| **deleteAndReplaceVersionBean** | [**DeleteAndReplaceVersionBean**](DeleteAndReplaceVersionBean.md)|  | |

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
| **204** | Returned if the version is deleted. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if:   *  the version to delete is not found.  *  the user does not have the required permissions. |  -  |

<a name="deleteProjectVersion"></a>
# **deleteProjectVersion**
> deleteProjectVersion(id).moveFixIssuesTo(moveFixIssuesTo).moveAffectedIssuesTo(moveAffectedIssuesTo).execute();

Delete version

Deletes a project version.  Deprecated, use [Delete and replace version](https://dac-static.atlassian.com) that supports swapping version values in custom fields, in addition to the swapping for &#x60;fixVersion&#x60; and &#x60;affectedVersion&#x60; provided in this resource.  Alternative versions can be provided to update issues that use the deleted version in &#x60;fixVersion&#x60; or &#x60;affectedVersion&#x60;. If alternatives are not provided, occurrences of &#x60;fixVersion&#x60; and &#x60;affectedVersion&#x60; that contain the deleted version are cleared.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String id = "id_example"; // The ID of the version.
    String moveFixIssuesTo = "moveFixIssuesTo_example"; // The ID of the version to update `fixVersion` to when the field contains the deleted version. The replacement version must be in the same project as the version being deleted and cannot be the version being deleted.
    String moveAffectedIssuesTo = "moveAffectedIssuesTo_example"; // The ID of the version to update `affectedVersion` to when the field contains the deleted version. The replacement version must be in the same project as the version being deleted and cannot be the version being deleted.
    try {
      client
              .projectVersions
              .deleteProjectVersion(id)
              .moveFixIssuesTo(moveFixIssuesTo)
              .moveAffectedIssuesTo(moveAffectedIssuesTo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#deleteProjectVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .projectVersions
              .deleteProjectVersion(id)
              .moveFixIssuesTo(moveFixIssuesTo)
              .moveAffectedIssuesTo(moveAffectedIssuesTo)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#deleteProjectVersion");
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
| **id** | **String**| The ID of the version. | |
| **moveFixIssuesTo** | **String**| The ID of the version to update &#x60;fixVersion&#x60; to when the field contains the deleted version. The replacement version must be in the same project as the version being deleted and cannot be the version being deleted. | [optional] |
| **moveAffectedIssuesTo** | **String**| The ID of the version to update &#x60;affectedVersion&#x60; to when the field contains the deleted version. The replacement version must be in the same project as the version being deleted and cannot be the version being deleted. | [optional] |

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
| **204** | Returned if the version is deleted. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if:   *  the authentication credentials are incorrect.  *  the user does not have the required permissions. |  -  |
| **404** | Returned if the version is not found. |  -  |

<a name="deleteRelatedWork"></a>
# **deleteRelatedWork**
> deleteRelatedWork(versionId, relatedWorkId).execute();

Delete related work

Deletes the given related work for the given version.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Resolve issues:* and *Edit issues* [Managing project permissions](https://confluence.atlassian.com/adminjiraserver/managing-project-permissions-938847145.html) for the project that contains the version.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String versionId = "versionId_example"; // The ID of the version that the target related work belongs to.
    String relatedWorkId = "relatedWorkId_example"; // The ID of the related work to delete.
    try {
      client
              .projectVersions
              .deleteRelatedWork(versionId, relatedWorkId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#deleteRelatedWork");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .projectVersions
              .deleteRelatedWork(versionId, relatedWorkId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#deleteRelatedWork");
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
| **versionId** | **String**| The ID of the version that the target related work belongs to. | |
| **relatedWorkId** | **String**| The ID of the related work to delete. | |

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
| **204** | Returned if the related work is deleted. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if  the authentication credentials are incorrect. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the version/related work is not found. |  -  |

<a name="getAllProjectVersions"></a>
# **getAllProjectVersions**
> List&lt;Version&gt; getAllProjectVersions(projectIdOrKey).expand(expand).execute();

Get project versions

Returns all versions in a project. The response is not paginated. Use [Get project versions paginated](https://dac-static.atlassian.com) if you want to get the versions in a project with pagination.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String projectIdOrKey = "projectIdOrKey_example"; // The project ID or project key (case sensitive).
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts `operations`, which returns actions that can be performed on the version.
    try {
      List<Version> result = client
              .projectVersions
              .getAllProjectVersions(projectIdOrKey)
              .expand(expand)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#getAllProjectVersions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Version>> response = client
              .projectVersions
              .getAllProjectVersions(projectIdOrKey)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#getAllProjectVersions");
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
| **projectIdOrKey** | **String**| The project ID or project key (case sensitive). | |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts &#x60;operations&#x60;, which returns actions that can be performed on the version. | [optional] |

### Return type

[**List&lt;Version&gt;**](Version.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **404** | Returned if the project is not found or the user does not have permission to view it. |  -  |

<a name="getProjectVersion"></a>
# **getProjectVersion**
> Version getProjectVersion(id).expand(expand).execute();

Get version

Returns a project version.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the version.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String id = "id_example"; // The ID of the version.
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:   *  `operations` Returns the list of operations available for this version.  *  `issuesstatus` Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property represents the number of issues with a status other than *to do*, *in progress*, and *done*.  *  `driver` Returns the Atlassian account ID of the version driver.  *  `approvers` Returns a list containing the Atlassian account IDs of approvers for this version.
    try {
      Version result = client
              .projectVersions
              .getProjectVersion(id)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getApprovers());
      System.out.println(result.getArchived());
      System.out.println(result.getDriver());
      System.out.println(result.getExpand());
      System.out.println(result.getId());
      System.out.println(result.getIssuesStatusForFixVersion());
      System.out.println(result.getMoveUnfixedIssuesTo());
      System.out.println(result.getName());
      System.out.println(result.getOperations());
      System.out.println(result.getOverdue());
      System.out.println(result.getProject());
      System.out.println(result.getProjectId());
      System.out.println(result.getReleaseDate());
      System.out.println(result.getReleased());
      System.out.println(result.getSelf());
      System.out.println(result.getStartDate());
      System.out.println(result.getUserReleaseDate());
      System.out.println(result.getUserStartDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#getProjectVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Version> response = client
              .projectVersions
              .getProjectVersion(id)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#getProjectVersion");
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
| **id** | **String**| The ID of the version. | |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;operations&#x60; Returns the list of operations available for this version.  *  &#x60;issuesstatus&#x60; Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property represents the number of issues with a status other than *to do*, *in progress*, and *done*.  *  &#x60;driver&#x60; Returns the Atlassian account ID of the version driver.  *  &#x60;approvers&#x60; Returns a list containing the Atlassian account IDs of approvers for this version. | [optional] |

### Return type

[**Version**](Version.md)

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
| **404** | Returned if the version is not found or the user does not have the necessary permission. |  -  |

<a name="getRelatedIssueCounts"></a>
# **getRelatedIssueCounts**
> VersionIssueCounts getRelatedIssueCounts(id).execute();

Get version&#39;s related issues count

Returns the following counts for a version:   *  Number of issues where the &#x60;fixVersion&#x60; is set to the version.  *  Number of issues where the &#x60;affectedVersion&#x60; is set to the version.  *  Number of issues where a version custom field is set to the version.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* project permission for the project that contains the version.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String id = "id_example"; // The ID of the version.
    try {
      VersionIssueCounts result = client
              .projectVersions
              .getRelatedIssueCounts(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomFieldUsage());
      System.out.println(result.getIssueCountWithCustomFieldsShowingVersion());
      System.out.println(result.getIssuesAffectedCount());
      System.out.println(result.getIssuesFixedCount());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#getRelatedIssueCounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VersionIssueCounts> response = client
              .projectVersions
              .getRelatedIssueCounts(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#getRelatedIssueCounts");
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
| **id** | **String**| The ID of the version. | |

### Return type

[**VersionIssueCounts**](VersionIssueCounts.md)

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
| **404** | Returned if:   *  the version is not found.  *  the user does not have the required permissions. |  -  |

<a name="getRelatedWorkItems"></a>
# **getRelatedWorkItems**
> List&lt;VersionRelatedWork&gt; getRelatedWorkItems(id).execute();

Get related work

Returns related work items for the given version id.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the version.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String id = "id_example"; // The ID of the version.
    try {
      List<VersionRelatedWork> result = client
              .projectVersions
              .getRelatedWorkItems(id)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#getRelatedWorkItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<VersionRelatedWork>> response = client
              .projectVersions
              .getRelatedWorkItems(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#getRelatedWorkItems");
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
| **id** | **String**| The ID of the version. | |

### Return type

[**List&lt;VersionRelatedWork&gt;**](VersionRelatedWork.md)

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
| **404** | Returned if the version is not found or the user does not have the necessary permission. |  -  |
| **500** | Returned if reading related work fails |  -  |

<a name="getUnresolvedIssueCount"></a>
# **getUnresolvedIssueCount**
> VersionUnresolvedIssuesCount getUnresolvedIssueCount(id).execute();

Get version&#39;s unresolved issues count

Returns counts of the issues and unresolved issues for the project version.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* project permission for the project that contains the version.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String id = "id_example"; // The ID of the version.
    try {
      VersionUnresolvedIssuesCount result = client
              .projectVersions
              .getUnresolvedIssueCount(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getIssuesCount());
      System.out.println(result.getIssuesUnresolvedCount());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#getUnresolvedIssueCount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VersionUnresolvedIssuesCount> response = client
              .projectVersions
              .getUnresolvedIssueCount(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#getUnresolvedIssueCount");
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
| **id** | **String**| The ID of the version. | |

### Return type

[**VersionUnresolvedIssuesCount**](VersionUnresolvedIssuesCount.md)

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
| **404** | Returned if:   *  the version is not found.  *  the user does not have the required permissions. |  -  |

<a name="listPaginated"></a>
# **listPaginated**
> PageBeanVersion listPaginated(projectIdOrKey).startAt(startAt).maxResults(maxResults).orderBy(orderBy).query(query).status(status).expand(expand).execute();

Get project versions paginated

Returns a [paginated](https://dac-static.atlassian.com) list of all versions in a project. See the [Get project versions](https://dac-static.atlassian.com) resource if you want to get a full list of versions without pagination.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String projectIdOrKey = "projectIdOrKey_example"; // The project ID or project key (case sensitive).
    Long startAt = 0L; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // The maximum number of items to return per page.
    String orderBy = "description"; // [Order](https://dac-static.atlassian.com) the results by a field:   *  `description` Sorts by version description.  *  `name` Sorts by version name.  *  `releaseDate` Sorts by release date, starting with the oldest date. Versions with no release date are listed last.  *  `sequence` Sorts by the order of appearance in the user interface.  *  `startDate` Sorts by start date, starting with the oldest date. Versions with no start date are listed last.
    String query = "query_example"; // Filter the results using a literal string. Versions with matching `name` or `description` are returned (case insensitive).
    String status = "status_example"; // A list of status values used to filter the results by version status. This parameter accepts a comma-separated list. The status values are `released`, `unreleased`, and `archived`.
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `issuesstatus` Returns the number of issues in each status category for each version.  *  `operations` Returns actions that can be performed on the specified version.  *  `driver` Returns the Atlassian account ID of the version driver.  *  `approvers` Returns a list containing the approvers for this version.
    try {
      PageBeanVersion result = client
              .projectVersions
              .listPaginated(projectIdOrKey)
              .startAt(startAt)
              .maxResults(maxResults)
              .orderBy(orderBy)
              .query(query)
              .status(status)
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
      System.err.println("Exception when calling ProjectVersionsApi#listPaginated");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanVersion> response = client
              .projectVersions
              .listPaginated(projectIdOrKey)
              .startAt(startAt)
              .maxResults(maxResults)
              .orderBy(orderBy)
              .query(query)
              .status(status)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#listPaginated");
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
| **projectIdOrKey** | **String**| The project ID or project key (case sensitive). | |
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |
| **orderBy** | **String**| [Order](https://dac-static.atlassian.com) the results by a field:   *  &#x60;description&#x60; Sorts by version description.  *  &#x60;name&#x60; Sorts by version name.  *  &#x60;releaseDate&#x60; Sorts by release date, starting with the oldest date. Versions with no release date are listed last.  *  &#x60;sequence&#x60; Sorts by the order of appearance in the user interface.  *  &#x60;startDate&#x60; Sorts by start date, starting with the oldest date. Versions with no start date are listed last. | [optional] [enum: description, -description, +description, name, -name, +name, releaseDate, -releaseDate, +releaseDate, sequence, -sequence, +sequence, startDate, -startDate, +startDate] |
| **query** | **String**| Filter the results using a literal string. Versions with matching &#x60;name&#x60; or &#x60;description&#x60; are returned (case insensitive). | [optional] |
| **status** | **String**| A list of status values used to filter the results by version status. This parameter accepts a comma-separated list. The status values are &#x60;released&#x60;, &#x60;unreleased&#x60;, and &#x60;archived&#x60;. | [optional] |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;issuesstatus&#x60; Returns the number of issues in each status category for each version.  *  &#x60;operations&#x60; Returns actions that can be performed on the specified version.  *  &#x60;driver&#x60; Returns the Atlassian account ID of the version driver.  *  &#x60;approvers&#x60; Returns a list containing the approvers for this version. | [optional] |

### Return type

[**PageBeanVersion**](PageBeanVersion.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **404** | Returned if the project is not found or the user does not have permission to view it. |  -  |

<a name="mergeVersions"></a>
# **mergeVersions**
> Object mergeVersions(id, moveIssuesTo).execute();

Merge versions

Merges two project versions. The merge is completed by deleting the version specified in &#x60;id&#x60; and replacing any occurrences of its ID in &#x60;fixVersion&#x60; with the version ID specified in &#x60;moveIssuesTo&#x60;.  Consider using [Delete and replace version](https://dac-static.atlassian.com) instead. This resource supports swapping version values in &#x60;fixVersion&#x60;, &#x60;affectedVersion&#x60;, and custom fields.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String id = "id_example"; // The ID of the version to delete.
    String moveIssuesTo = "moveIssuesTo_example"; // The ID of the version to merge into.
    try {
      Object result = client
              .projectVersions
              .mergeVersions(id, moveIssuesTo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#mergeVersions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .projectVersions
              .mergeVersions(id, moveIssuesTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#mergeVersions");
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
| **id** | **String**| The ID of the version to delete. | |
| **moveIssuesTo** | **String**| The ID of the version to merge into. | |

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
| **204** | Returned if the version is deleted. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if:   *  the authentication credentials are incorrect or missing.  *  the user does not have the required permissions. |  -  |
| **404** | Returned if the version to be deleted or the version to merge to are not found. |  -  |

<a name="updateRelatedWork"></a>
# **updateRelatedWork**
> VersionRelatedWork updateRelatedWork(id, versionRelatedWork).execute();

Update related work

Updates the given related work. You can only update generic link related works via Rest APIs. Any archived version related works can&#39;t be edited.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Resolve issues:* and *Edit issues* [Managing project permissions](https://confluence.atlassian.com/adminjiraserver/managing-project-permissions-938847145.html) for the project that contains the version.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String category = "category_example"; // The category of the related work
    String id = "id_example"; // The ID of the version to update the related work on. For the related work id, pass it to the input JSON.
    String title = "title_example"; // The title of the related work
    Long issueId = 56L; // The title of the related work
    String relatedWorkId = "relatedWorkId_example"; // The id of the related work. For the native release note related work item, this will be null, and Rest API does not support updating it.
    URI url = new URI(); // The URL of the related work
    try {
      VersionRelatedWork result = client
              .projectVersions
              .updateRelatedWork(category, id)
              .title(title)
              .issueId(issueId)
              .relatedWorkId(relatedWorkId)
              .url(url)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getCategory());
      System.out.println(result.getIssueId());
      System.out.println(result.getRelatedWorkId());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#updateRelatedWork");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VersionRelatedWork> response = client
              .projectVersions
              .updateRelatedWork(category, id)
              .title(title)
              .issueId(issueId)
              .relatedWorkId(relatedWorkId)
              .url(url)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#updateRelatedWork");
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
| **id** | **String**| The ID of the version to update the related work on. For the related work id, pass it to the input JSON. | |
| **versionRelatedWork** | [**VersionRelatedWork**](VersionRelatedWork.md)|  | |

### Return type

[**VersionRelatedWork**](VersionRelatedWork.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful together with updated related work. |  -  |
| **400** | Returned if the request data is invalid |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the version or the related work is not found. |  -  |

<a name="updateSequenceWithinProject"></a>
# **updateSequenceWithinProject**
> Version updateSequenceWithinProject(id, versionMoveBean).execute();

Move version

Modifies the version&#39;s sequence within the project, which affects the display order of the versions in Jira.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* project permission for the project that contains the version.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String id = "id_example"; // The ID of the version to be moved.
    URI after = new URI(); // The URL (self link) of the version after which to place the moved version. Cannot be used with `position`.
    String position = "Earlier"; // An absolute position in which to place the moved version. Cannot be used with `after`.
    try {
      Version result = client
              .projectVersions
              .updateSequenceWithinProject(id)
              .after(after)
              .position(position)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getApprovers());
      System.out.println(result.getArchived());
      System.out.println(result.getDriver());
      System.out.println(result.getExpand());
      System.out.println(result.getId());
      System.out.println(result.getIssuesStatusForFixVersion());
      System.out.println(result.getMoveUnfixedIssuesTo());
      System.out.println(result.getName());
      System.out.println(result.getOperations());
      System.out.println(result.getOverdue());
      System.out.println(result.getProject());
      System.out.println(result.getProjectId());
      System.out.println(result.getReleaseDate());
      System.out.println(result.getReleased());
      System.out.println(result.getSelf());
      System.out.println(result.getStartDate());
      System.out.println(result.getUserReleaseDate());
      System.out.println(result.getUserStartDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#updateSequenceWithinProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Version> response = client
              .projectVersions
              .updateSequenceWithinProject(id)
              .after(after)
              .position(position)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#updateSequenceWithinProject");
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
| **id** | **String**| The ID of the version to be moved. | |
| **versionMoveBean** | [**VersionMoveBean**](VersionMoveBean.md)|  | |

### Return type

[**Version**](Version.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if:   *  no body parameters are provided.  *  &#x60;after&#x60; and &#x60;position&#x60; are provided.  *  &#x60;position&#x60; is invalid. |  -  |
| **401** | Returned if:   *  the authentication credentials are incorrect or missing  *  the user does not have the required commissions. |  -  |
| **404** | Returned if the version or move after version are not found. |  -  |

<a name="updateVersion"></a>
# **updateVersion**
> Version updateVersion(id, version).execute();

Update version

Updates a project version.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectVersionsApi;
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
    String id = "id_example"; // The ID of the version.
    String description = "description_example"; // The description of the version. Optional when creating or updating a version. The maximum size is 16,384 bytes.
    List<VersionApprover> approvers = Arrays.asList(); // If the expand option `approvers` is used, returns a list containing the approvers for this version.
    Boolean archived = true; // Indicates that the version is archived. Optional when creating or updating a version.
    String driver = "driver_example"; // If the expand option `driver` is used, returns the Atlassian account ID of the driver.
    String expand = "expand_example"; // Use [expand](em>#expansion) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:   *  `operations` Returns the list of operations available for this version.  *  `issuesstatus` Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.  *  `driver` Returns the Atlassian account ID of the version driver.  *  `approvers` Returns a list containing approvers for this version.  Optional for create and update.
    String id = "id_example"; // The ID of the version.
    VersionIssuesStatus issuesStatusForFixVersion = new VersionIssuesStatus(); // If the expand option `issuesstatus` is used, returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.
    URI moveUnfixedIssuesTo = new URI(); // The URL of the self link to the version to which all unfixed issues are moved when a version is released. Not applicable when creating a version. Optional when updating a version.
    String name = "name_example"; // The unique name of the version. Required when creating a version. Optional when updating a version. The maximum length is 255 characters.
    List<SimpleLink> operations = Arrays.asList(); // If the expand option `operations` is used, returns the list of operations available for this version.
    Boolean overdue = true; // Indicates that the version is overdue.
    String project = "project_example"; // Deprecated. Use `projectId`.
    Long projectId = 56L; // The ID of the project to which this version is attached. Required when creating a version. Not applicable when updating a version.
    LocalDate releaseDate = LocalDate.now(); // The release date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
    Boolean released = true; // Indicates that the version is released. If the version is released a request to release again is ignored. Not applicable when creating a version. Optional when updating a version.
    URI self = new URI(); // The URL of the version.
    LocalDate startDate = LocalDate.now(); // The start date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
    String userReleaseDate = "userReleaseDate_example"; // The date on which work on this version is expected to finish, expressed in the instance's *Day/Month/Year Format* date format.
    String userStartDate = "userStartDate_example"; // The date on which work on this version is expected to start, expressed in the instance's *Day/Month/Year Format* date format.
    try {
      Version result = client
              .projectVersions
              .updateVersion(id)
              .description(description)
              .approvers(approvers)
              .archived(archived)
              .driver(driver)
              .expand(expand)
              .id(id)
              .issuesStatusForFixVersion(issuesStatusForFixVersion)
              .moveUnfixedIssuesTo(moveUnfixedIssuesTo)
              .name(name)
              .operations(operations)
              .overdue(overdue)
              .project(project)
              .projectId(projectId)
              .releaseDate(releaseDate)
              .released(released)
              .self(self)
              .startDate(startDate)
              .userReleaseDate(userReleaseDate)
              .userStartDate(userStartDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getApprovers());
      System.out.println(result.getArchived());
      System.out.println(result.getDriver());
      System.out.println(result.getExpand());
      System.out.println(result.getId());
      System.out.println(result.getIssuesStatusForFixVersion());
      System.out.println(result.getMoveUnfixedIssuesTo());
      System.out.println(result.getName());
      System.out.println(result.getOperations());
      System.out.println(result.getOverdue());
      System.out.println(result.getProject());
      System.out.println(result.getProjectId());
      System.out.println(result.getReleaseDate());
      System.out.println(result.getReleased());
      System.out.println(result.getSelf());
      System.out.println(result.getStartDate());
      System.out.println(result.getUserReleaseDate());
      System.out.println(result.getUserStartDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#updateVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Version> response = client
              .projectVersions
              .updateVersion(id)
              .description(description)
              .approvers(approvers)
              .archived(archived)
              .driver(driver)
              .expand(expand)
              .id(id)
              .issuesStatusForFixVersion(issuesStatusForFixVersion)
              .moveUnfixedIssuesTo(moveUnfixedIssuesTo)
              .name(name)
              .operations(operations)
              .overdue(overdue)
              .project(project)
              .projectId(projectId)
              .releaseDate(releaseDate)
              .released(released)
              .self(self)
              .startDate(startDate)
              .userReleaseDate(userReleaseDate)
              .userStartDate(userStartDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectVersionsApi#updateVersion");
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
| **id** | **String**| The ID of the version. | |
| **version** | [**Version**](Version.md)|  | |

### Return type

[**Version**](Version.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if:   *  the request is invalid.  *  the user does not have the required permissions. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **404** | Returned if the version is not found. |  -  |

