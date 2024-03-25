# IssueCustomFieldConfigurationAppsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getContextConfiguration**](IssueCustomFieldConfigurationAppsApi.md#getContextConfiguration) | **GET** /rest/api/3/app/field/{fieldIdOrKey}/context/configuration | Get custom field configurations |
| [**updateContextConfiguration**](IssueCustomFieldConfigurationAppsApi.md#updateContextConfiguration) | **PUT** /rest/api/3/app/field/{fieldIdOrKey}/context/configuration | Update custom field configurations |


<a name="getContextConfiguration"></a>
# **getContextConfiguration**
> PageBeanContextualConfiguration getContextConfiguration(fieldIdOrKey).id(id).fieldContextId(fieldContextId).issueId(issueId).projectKeyOrId(projectKeyOrId).issueTypeId(issueTypeId).startAt(startAt).maxResults(maxResults).execute();

Get custom field configurations

Returns a [paginated](https://dac-static.atlassian.com) list of configurations for a custom field of a [type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/) created by a [Forge app](https://developer.atlassian.com/platform/forge/).  The result can be filtered by one of these criteria:   *  &#x60;id&#x60;.  *  &#x60;fieldContextId&#x60;.  *  &#x60;issueId&#x60;.  *  &#x60;projectKeyOrId&#x60; and &#x60;issueTypeId&#x60;.  Otherwise, all configurations are returned.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that provided the custom field type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCustomFieldConfigurationAppsApi;
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
    String fieldIdOrKey = "fieldIdOrKey_example"; // The ID or key of the custom field, for example `customfield_10000`.
    Set<Long> id = Arrays.asList(); // The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: `id=10000&id=10001`. Can't be provided with `fieldContextId`, `issueId`, `projectKeyOrId`, or `issueTypeId`.
    Set<Long> fieldContextId = Arrays.asList(); // The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: `fieldContextId=10000&fieldContextId=10001`. Can't be provided with `id`, `issueId`, `projectKeyOrId`, or `issueTypeId`.
    Long issueId = 56L; // The ID of the issue to filter results by. If the issue doesn't exist, an empty list is returned. Can't be provided with `projectKeyOrId`, or `issueTypeId`.
    String projectKeyOrId = "projectKeyOrId_example"; // The ID or key of the project to filter results by. Must be provided with `issueTypeId`. Can't be provided with `issueId`.
    String issueTypeId = "issueTypeId_example"; // The ID of the issue type to filter results by. Must be provided with `projectKeyOrId`. Can't be provided with `issueId`.
    Long startAt = 0L; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 100; // The maximum number of items to return per page.
    try {
      PageBeanContextualConfiguration result = client
              .issueCustomFieldConfigurationApps
              .getContextConfiguration(fieldIdOrKey)
              .id(id)
              .fieldContextId(fieldContextId)
              .issueId(issueId)
              .projectKeyOrId(projectKeyOrId)
              .issueTypeId(issueTypeId)
              .startAt(startAt)
              .maxResults(maxResults)
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
      System.err.println("Exception when calling IssueCustomFieldConfigurationAppsApi#getContextConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanContextualConfiguration> response = client
              .issueCustomFieldConfigurationApps
              .getContextConfiguration(fieldIdOrKey)
              .id(id)
              .fieldContextId(fieldContextId)
              .issueId(issueId)
              .projectKeyOrId(projectKeyOrId)
              .issueTypeId(issueTypeId)
              .startAt(startAt)
              .maxResults(maxResults)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldConfigurationAppsApi#getContextConfiguration");
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
| **fieldIdOrKey** | **String**| The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. | |
| **id** | [**Set&lt;Long&gt;**](Long.md)| The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. Can&#39;t be provided with &#x60;fieldContextId&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. | [optional] |
| **fieldContextId** | [**Set&lt;Long&gt;**](Long.md)| The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: &#x60;fieldContextId&#x3D;10000&amp;fieldContextId&#x3D;10001&#x60;. Can&#39;t be provided with &#x60;id&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. | [optional] |
| **issueId** | **Long**| The ID of the issue to filter results by. If the issue doesn&#39;t exist, an empty list is returned. Can&#39;t be provided with &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. | [optional] |
| **projectKeyOrId** | **String**| The ID or key of the project to filter results by. Must be provided with &#x60;issueTypeId&#x60;. Can&#39;t be provided with &#x60;issueId&#x60;. | [optional] |
| **issueTypeId** | **String**| The ID of the issue type to filter results by. Must be provided with &#x60;projectKeyOrId&#x60;. Can&#39;t be provided with &#x60;issueId&#x60;. | [optional] |
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 100] |

### Return type

[**PageBeanContextualConfiguration**](PageBeanContextualConfiguration.md)

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
| **403** | Returned if the user is not a Jira admin or the request is not authenticated as from the app that provided the field. |  -  |
| **404** | Returned if the custom field is not found. |  -  |

<a name="updateContextConfiguration"></a>
# **updateContextConfiguration**
> Object updateContextConfiguration(fieldIdOrKey, customFieldConfigurations).execute();

Update custom field configurations

Update the configuration for contexts of a custom field of a [type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/) created by a [Forge app](https://developer.atlassian.com/platform/forge/).  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCustomFieldConfigurationAppsApi;
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
    Set<ContextualConfiguration> configurations = Arrays.asList(); // The list of custom field configuration details.
    String fieldIdOrKey = "fieldIdOrKey_example"; // The ID or key of the custom field, for example `customfield_10000`.
    try {
      Object result = client
              .issueCustomFieldConfigurationApps
              .updateContextConfiguration(configurations, fieldIdOrKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldConfigurationAppsApi#updateContextConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issueCustomFieldConfigurationApps
              .updateContextConfiguration(configurations, fieldIdOrKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldConfigurationAppsApi#updateContextConfiguration");
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
| **fieldIdOrKey** | **String**| The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. | |
| **customFieldConfigurations** | [**CustomFieldConfigurations**](CustomFieldConfigurations.md)|  | |

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
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user is not a Jira admin or the request is not authenticated as from the app that provided the field. |  -  |
| **404** | Returned if the custom field is not found. |  -  |

