# IssueCustomFieldOptionsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomFieldOption**](IssueCustomFieldOptionsApi.md#createCustomFieldOption) | **POST** /rest/api/3/field/{fieldId}/context/{contextId}/option | Create custom field options (context) |
| [**deleteCustomFieldOption**](IssueCustomFieldOptionsApi.md#deleteCustomFieldOption) | **DELETE** /rest/api/3/field/{fieldId}/context/{contextId}/option/{optionId} | Delete custom field options (context) |
| [**getContextOptions**](IssueCustomFieldOptionsApi.md#getContextOptions) | **GET** /rest/api/3/field/{fieldId}/context/{contextId}/option | Get custom field options (context) |
| [**getOptionById**](IssueCustomFieldOptionsApi.md#getOptionById) | **GET** /rest/api/3/customFieldOption/{id} | Get custom field option |
| [**reorderCustomFieldOptions**](IssueCustomFieldOptionsApi.md#reorderCustomFieldOptions) | **PUT** /rest/api/3/field/{fieldId}/context/{contextId}/option/move | Reorder custom field options (context) |
| [**replaceOptions**](IssueCustomFieldOptionsApi.md#replaceOptions) | **DELETE** /rest/api/3/field/{fieldId}/context/{contextId}/option/{optionId}/issue | Replace custom field options |
| [**updateContextOption**](IssueCustomFieldOptionsApi.md#updateContextOption) | **PUT** /rest/api/3/field/{fieldId}/context/{contextId}/option | Update custom field options (context) |


<a name="createCustomFieldOption"></a>
# **createCustomFieldOption**
> CustomFieldCreatedContextOptionsList createCustomFieldOption(fieldId, contextId, bulkCustomFieldOptionCreateRequest).execute();

Create custom field options (context)

Creates options and, where the custom select field is of the type Select List (cascading), cascading options for a custom select field. The options are added to a context of the field.  The maximum number of options that can be created per request is 1000 and each field can have a maximum of 10000 options.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](https://dac-static.atlassian.com) operations.**  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCustomFieldOptionsApi;
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
    String fieldId = "fieldId_example"; // The ID of the custom field.
    Long contextId = 56L; // The ID of the context.
    List<CustomFieldOptionCreate> options = Arrays.asList(); // Details of options to create.
    try {
      CustomFieldCreatedContextOptionsList result = client
              .issueCustomFieldOptions
              .createCustomFieldOption(fieldId, contextId)
              .options(options)
              .execute();
      System.out.println(result);
      System.out.println(result.getOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldOptionsApi#createCustomFieldOption");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldCreatedContextOptionsList> response = client
              .issueCustomFieldOptions
              .createCustomFieldOption(fieldId, contextId)
              .options(options)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldOptionsApi#createCustomFieldOption");
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
| **fieldId** | **String**| The ID of the custom field. | |
| **contextId** | **Long**| The ID of the context. | |
| **bulkCustomFieldOptionCreateRequest** | [**BulkCustomFieldOptionCreateRequest**](BulkCustomFieldOptionCreateRequest.md)|  | |

### Return type

[**CustomFieldCreatedContextOptionsList**](CustomFieldCreatedContextOptionsList.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="deleteCustomFieldOption"></a>
# **deleteCustomFieldOption**
> deleteCustomFieldOption(fieldId, contextId, optionId).execute();

Delete custom field options (context)

Deletes a custom field option.  Options with cascading options cannot be deleted without deleting the cascading options first.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](https://dac-static.atlassian.com) operations.**  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCustomFieldOptionsApi;
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
    String fieldId = "fieldId_example"; // The ID of the custom field.
    Long contextId = 56L; // The ID of the context from which an option should be deleted.
    Long optionId = 56L; // The ID of the option to delete.
    try {
      client
              .issueCustomFieldOptions
              .deleteCustomFieldOption(fieldId, contextId, optionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldOptionsApi#deleteCustomFieldOption");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .issueCustomFieldOptions
              .deleteCustomFieldOption(fieldId, contextId, optionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldOptionsApi#deleteCustomFieldOption");
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
| **fieldId** | **String**| The ID of the custom field. | |
| **contextId** | **Long**| The ID of the context from which an option should be deleted. | |
| **optionId** | **Long**| The ID of the option to delete. | |

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
| **204** | Returned if the option is deleted. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="getContextOptions"></a>
# **getContextOptions**
> PageBeanCustomFieldContextOption getContextOptions(fieldId, contextId).optionId(optionId).onlyOptions(onlyOptions).startAt(startAt).maxResults(maxResults).execute();

Get custom field options (context)

Returns a [paginated](https://dac-static.atlassian.com) list of all custom field option for a context. Options are returned first then cascading options, in the order they display in Jira.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](https://dac-static.atlassian.com) operations.**  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCustomFieldOptionsApi;
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
    String fieldId = "fieldId_example"; // The ID of the custom field.
    Long contextId = 56L; // The ID of the context.
    Long optionId = 56L; // The ID of the option.
    Boolean onlyOptions = false; // Whether only options are returned.
    Long startAt = 0L; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 100; // The maximum number of items to return per page.
    try {
      PageBeanCustomFieldContextOption result = client
              .issueCustomFieldOptions
              .getContextOptions(fieldId, contextId)
              .optionId(optionId)
              .onlyOptions(onlyOptions)
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
      System.err.println("Exception when calling IssueCustomFieldOptionsApi#getContextOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanCustomFieldContextOption> response = client
              .issueCustomFieldOptions
              .getContextOptions(fieldId, contextId)
              .optionId(optionId)
              .onlyOptions(onlyOptions)
              .startAt(startAt)
              .maxResults(maxResults)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldOptionsApi#getContextOptions");
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
| **fieldId** | **String**| The ID of the custom field. | |
| **contextId** | **Long**| The ID of the context. | |
| **optionId** | **Long**| The ID of the option. | [optional] |
| **onlyOptions** | **Boolean**| Whether only options are returned. | [optional] [default to false] |
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 100] |

### Return type

[**PageBeanCustomFieldContextOption**](PageBeanCustomFieldContextOption.md)

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

<a name="getOptionById"></a>
# **getOptionById**
> CustomFieldOption getOptionById(id).execute();

Get custom field option

Returns a custom field option. For example, an option in a select list.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](https://dac-static.atlassian.com) resource**, it cannot be used with issue field select list options created by Connect apps.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** The custom field option is returned as follows:   *  if the user has the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  if the user has the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the custom field is used in, and the field is visible in at least one layout the user has permission to view.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCustomFieldOptionsApi;
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
    String id = "id_example"; // The ID of the custom field option.
    try {
      CustomFieldOption result = client
              .issueCustomFieldOptions
              .getOptionById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSelf());
      System.out.println(result.getValue());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldOptionsApi#getOptionById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldOption> response = client
              .issueCustomFieldOptions
              .getOptionById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldOptionsApi#getOptionById");
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
| **id** | **String**| The ID of the custom field option. | |

### Return type

[**CustomFieldOption**](CustomFieldOption.md)

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
| **404** | Returned if:   *  the custom field option is not found.  *  the user does not have permission to view the custom field. |  -  |

<a name="reorderCustomFieldOptions"></a>
# **reorderCustomFieldOptions**
> Object reorderCustomFieldOptions(fieldId, contextId, orderOfCustomFieldOptions).execute();

Reorder custom field options (context)

Changes the order of custom field options or cascading options in a context.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](https://dac-static.atlassian.com) operations.**  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCustomFieldOptionsApi;
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
    List<String> customFieldOptionIds = Arrays.asList(); // A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.
    String fieldId = "fieldId_example"; // The ID of the custom field.
    Long contextId = 56L; // The ID of the context.
    String after = "after_example"; // The ID of the custom field option or cascading option to place the moved options after. Required if `position` isn't provided.
    String position = "First"; // The position the custom field options should be moved to. Required if `after` isn't provided.
    try {
      Object result = client
              .issueCustomFieldOptions
              .reorderCustomFieldOptions(customFieldOptionIds, fieldId, contextId)
              .after(after)
              .position(position)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldOptionsApi#reorderCustomFieldOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issueCustomFieldOptions
              .reorderCustomFieldOptions(customFieldOptionIds, fieldId, contextId)
              .after(after)
              .position(position)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldOptionsApi#reorderCustomFieldOptions");
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
| **fieldId** | **String**| The ID of the custom field. | |
| **contextId** | **Long**| The ID of the context. | |
| **orderOfCustomFieldOptions** | [**OrderOfCustomFieldOptions**](OrderOfCustomFieldOptions.md)|  | |

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
| **204** | Returned if options are reordered. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="replaceOptions"></a>
# **replaceOptions**
> replaceOptions(fieldId, optionId, contextId).replaceWith(replaceWith).jql(jql).execute();

Replace custom field options

Replaces the options of a custom field.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](https://dac-static.atlassian.com) resource**, it cannot be used with issue field select list options created by Connect or Forge apps.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCustomFieldOptionsApi;
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
    String fieldId = "fieldId_example"; // The ID of the custom field.
    Long optionId = 56L; // The ID of the option to be deselected.
    Long contextId = 56L; // The ID of the context.
    Long replaceWith = 56L; // The ID of the option that will replace the currently selected option.
    String jql = "jql_example"; // A JQL query that specifies the issues to be updated. For example, *project=10000*.
    try {
      client
              .issueCustomFieldOptions
              .replaceOptions(fieldId, optionId, contextId)
              .replaceWith(replaceWith)
              .jql(jql)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldOptionsApi#replaceOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .issueCustomFieldOptions
              .replaceOptions(fieldId, optionId, contextId)
              .replaceWith(replaceWith)
              .jql(jql)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldOptionsApi#replaceOptions");
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
| **fieldId** | **String**| The ID of the custom field. | |
| **optionId** | **Long**| The ID of the option to be deselected. | |
| **contextId** | **Long**| The ID of the context. | |
| **replaceWith** | **Long**| The ID of the option that will replace the currently selected option. | [optional] |
| **jql** | **String**| A JQL query that specifies the issues to be updated. For example, *project&#x3D;10000*. | [optional] |

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
| **400** | Returned if the request is not valid. |  -  |
| **404** | Returned if the field is not found or does not support options, or the options to be replaced are not found. |  -  |

<a name="updateContextOption"></a>
# **updateContextOption**
> CustomFieldUpdatedContextOptionsList updateContextOption(fieldId, contextId, bulkCustomFieldOptionUpdateRequest).execute();

Update custom field options (context)

Updates the options of a custom field.  If any of the options are not found, no options are updated. Options where the values in the request match the current values aren&#39;t updated and aren&#39;t reported in the response.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](https://dac-static.atlassian.com) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCustomFieldOptionsApi;
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
    String fieldId = "fieldId_example"; // The ID of the custom field.
    Long contextId = 56L; // The ID of the context.
    List<CustomFieldOptionUpdate> options = Arrays.asList(); // Details of the options to update.
    try {
      CustomFieldUpdatedContextOptionsList result = client
              .issueCustomFieldOptions
              .updateContextOption(fieldId, contextId)
              .options(options)
              .execute();
      System.out.println(result);
      System.out.println(result.getOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldOptionsApi#updateContextOption");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldUpdatedContextOptionsList> response = client
              .issueCustomFieldOptions
              .updateContextOption(fieldId, contextId)
              .options(options)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldOptionsApi#updateContextOption");
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
| **fieldId** | **String**| The ID of the custom field. | |
| **contextId** | **Long**| The ID of the context. | |
| **bulkCustomFieldOptionUpdateRequest** | [**BulkCustomFieldOptionUpdateRequest**](BulkCustomFieldOptionUpdateRequest.md)|  | |

### Return type

[**CustomFieldUpdatedContextOptionsList**](CustomFieldUpdatedContextOptionsList.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

