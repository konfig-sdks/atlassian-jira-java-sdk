# StatusApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkCreateStatuses**](StatusApi.md#bulkCreateStatuses) | **POST** /rest/api/3/statuses | Bulk create statuses |
| [**bulkDeleteById**](StatusApi.md#bulkDeleteById) | **DELETE** /rest/api/3/statuses | Bulk delete Statuses |
| [**bulkGetStatuses**](StatusApi.md#bulkGetStatuses) | **GET** /rest/api/3/statuses | Bulk get statuses |
| [**bulkUpdateStatusesById**](StatusApi.md#bulkUpdateStatusesById) | **PUT** /rest/api/3/statuses | Bulk update statuses |
| [**searchPaginated**](StatusApi.md#searchPaginated) | **GET** /rest/api/3/statuses/search | Search statuses paginated |


<a name="bulkCreateStatuses"></a>
# **bulkCreateStatuses**
> List&lt;JiraStatus&gt; bulkCreateStatuses(statusCreateRequest).execute();

Bulk create statuses

Creates statuses for a global or project scope.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusApi;
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
    StatusScope scope = new StatusScope();
    List<StatusCreate> statuses = Arrays.asList(); // Details of the statuses being created.
    try {
      List<JiraStatus> result = client
              .status
              .bulkCreateStatuses(scope, statuses)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#bulkCreateStatuses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<JiraStatus>> response = client
              .status
              .bulkCreateStatuses(scope, statuses)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#bulkCreateStatuses");
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
| **statusCreateRequest** | [**StatusCreateRequest**](StatusCreateRequest.md)| Details of the statuses being created and their scope. | |

### Return type

[**List&lt;JiraStatus&gt;**](JiraStatus.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing, or the caller doesn&#39;t have permissions to perform the operation. |  -  |
| **409** | Returned if another workflow configuration update task is ongoing. |  -  |

<a name="bulkDeleteById"></a>
# **bulkDeleteById**
> Object bulkDeleteById(id).execute();

Bulk delete Statuses

Deletes statuses by ID.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusApi;
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
    List<String> id = Arrays.asList(); // The list of status IDs. To include multiple IDs, provide an ampersand-separated list. For example, id=10000&id=10001.  Min items `1`, Max items `50`
    try {
      Object result = client
              .status
              .bulkDeleteById(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#bulkDeleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .status
              .bulkDeleteById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#bulkDeleteById");
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
| **id** | [**List&lt;String&gt;**](String.md)| The list of status IDs. To include multiple IDs, provide an ampersand-separated list. For example, id&#x3D;10000&amp;id&#x3D;10001.  Min items &#x60;1&#x60;, Max items &#x60;50&#x60; | |

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
| **401** | Returned if the authentication credentials are incorrect or missing, or the caller doesn&#39;t have permissions to perform the operation. |  -  |

<a name="bulkGetStatuses"></a>
# **bulkGetStatuses**
> List&lt;JiraStatus&gt; bulkGetStatuses(id).expand(expand).execute();

Bulk get statuses

Returns a list of the statuses specified by one or more status IDs.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusApi;
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
    List<String> id = Arrays.asList(); // The list of status IDs. To include multiple IDs, provide an ampersand-separated list. For example, id=10000&id=10001.  Min items `1`, Max items `50`
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `usages` Returns the project and issue types that use the status in their workflow.  *  `workflowUsages` Returns the workflows that use the status.
    try {
      List<JiraStatus> result = client
              .status
              .bulkGetStatuses(id)
              .expand(expand)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#bulkGetStatuses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<JiraStatus>> response = client
              .status
              .bulkGetStatuses(id)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#bulkGetStatuses");
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
| **id** | [**List&lt;String&gt;**](String.md)| The list of status IDs. To include multiple IDs, provide an ampersand-separated list. For example, id&#x3D;10000&amp;id&#x3D;10001.  Min items &#x60;1&#x60;, Max items &#x60;50&#x60; | |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;usages&#x60; Returns the project and issue types that use the status in their workflow.  *  &#x60;workflowUsages&#x60; Returns the workflows that use the status. | [optional] |

### Return type

[**List&lt;JiraStatus&gt;**](JiraStatus.md)

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
| **401** | Returned if the authentication credentials are incorrect or missing, or the caller doesn&#39;t have permissions to perform the operation. |  -  |

<a name="bulkUpdateStatusesById"></a>
# **bulkUpdateStatusesById**
> Object bulkUpdateStatusesById(statusUpdateRequest).execute();

Bulk update statuses

Updates statuses by ID.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusApi;
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
    List<StatusUpdate> statuses = Arrays.asList(); // The list of statuses that will be updated.
    try {
      Object result = client
              .status
              .bulkUpdateStatusesById(statuses)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#bulkUpdateStatusesById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .status
              .bulkUpdateStatusesById(statuses)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#bulkUpdateStatusesById");
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
| **statusUpdateRequest** | [**StatusUpdateRequest**](StatusUpdateRequest.md)| The list of statuses that will be updated. | |

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
| **401** | Returned if the authentication credentials are incorrect or missing, or the caller doesn&#39;t have permissions to perform the operation. |  -  |
| **409** | Returned if another workflow configuration update task is ongoing. |  -  |

<a name="searchPaginated"></a>
# **searchPaginated**
> PageOfStatuses searchPaginated().expand(expand).projectId(projectId).startAt(startAt).maxResults(maxResults).searchString(searchString).statusCategory(statusCategory).execute();

Search statuses paginated

Returns a [paginated](https://developer.atlassian.com/cloud/jira/platform/rest/v3/intro/#pagination) list of statuses that match a search on name or project.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusApi;
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
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `usages` Returns the project and issue types that use the status in their workflow.  *  `workflowUsages` Returns the workflows that use the status.
    String projectId = "projectId_example"; // The project the status is part of or null for global statuses.
    Long startAt = 0L; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 200; // The maximum number of items to return per page.
    String searchString = "searchString_example"; // Term to match status names against or null to search for all statuses in the search scope.
    String statusCategory = "statusCategory_example"; // Category of the status to filter by. The supported values are: `TODO`, `IN_PROGRESS`, and `DONE`.
    try {
      PageOfStatuses result = client
              .status
              .searchPaginated()
              .expand(expand)
              .projectId(projectId)
              .startAt(startAt)
              .maxResults(maxResults)
              .searchString(searchString)
              .statusCategory(statusCategory)
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
      System.err.println("Exception when calling StatusApi#searchPaginated");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageOfStatuses> response = client
              .status
              .searchPaginated()
              .expand(expand)
              .projectId(projectId)
              .startAt(startAt)
              .maxResults(maxResults)
              .searchString(searchString)
              .statusCategory(statusCategory)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#searchPaginated");
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
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;usages&#x60; Returns the project and issue types that use the status in their workflow.  *  &#x60;workflowUsages&#x60; Returns the workflows that use the status. | [optional] |
| **projectId** | **String**| The project the status is part of or null for global statuses. | [optional] |
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 200] |
| **searchString** | **String**| Term to match status names against or null to search for all statuses in the search scope. | [optional] |
| **statusCategory** | **String**| Category of the status to filter by. The supported values are: &#x60;TODO&#x60;, &#x60;IN_PROGRESS&#x60;, and &#x60;DONE&#x60;. | [optional] |

### Return type

[**PageOfStatuses**](PageOfStatuses.md)

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
| **401** | Returned if the authentication credentials are incorrect or missing, or the caller doesn&#39;t have permissions to perform the operation. |  -  |

