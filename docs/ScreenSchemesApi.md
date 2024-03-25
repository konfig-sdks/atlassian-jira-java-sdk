# ScreenSchemesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createScreenScheme**](ScreenSchemesApi.md#createScreenScheme) | **POST** /rest/api/3/screenscheme | Create screen scheme |
| [**deleteSchemeById**](ScreenSchemesApi.md#deleteSchemeById) | **DELETE** /rest/api/3/screenscheme/{screenSchemeId} | Delete screen scheme |
| [**listScreenSchemes**](ScreenSchemesApi.md#listScreenSchemes) | **GET** /rest/api/3/screenscheme | Get screen schemes |
| [**updateSchemeById**](ScreenSchemesApi.md#updateSchemeById) | **PUT** /rest/api/3/screenscheme/{screenSchemeId} | Update screen scheme |


<a name="createScreenScheme"></a>
# **createScreenScheme**
> ScreenSchemeId createScreenScheme(screenSchemeDetails).execute();

Create screen scheme

Creates a screen scheme.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScreenSchemesApi;
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
    String name = "name_example"; // The name of the screen scheme. The name must be unique. The maximum length is 255 characters.
    ScreenTypes screens = new ScreenTypes(); // The IDs of the screens for the screen types of the screen scheme. Only screens used in classic projects are accepted.
    String description = "description_example"; // The description of the screen scheme. The maximum length is 255 characters.
    try {
      ScreenSchemeId result = client
              .screenSchemes
              .createScreenScheme(name, screens)
              .description(description)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreenSchemesApi#createScreenScheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScreenSchemeId> response = client
              .screenSchemes
              .createScreenScheme(name, screens)
              .description(description)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreenSchemesApi#createScreenScheme");
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
| **screenSchemeDetails** | [**ScreenSchemeDetails**](ScreenSchemeDetails.md)|  | |

### Return type

[**ScreenSchemeId**](ScreenSchemeId.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="deleteSchemeById"></a>
# **deleteSchemeById**
> deleteSchemeById(screenSchemeId).execute();

Delete screen scheme

Deletes a screen scheme. A screen scheme cannot be deleted if it is used in an issue type screen scheme.  Only screens schemes used in classic projects can be deleted.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScreenSchemesApi;
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
    String screenSchemeId = "screenSchemeId_example"; // The ID of the screen scheme.
    try {
      client
              .screenSchemes
              .deleteSchemeById(screenSchemeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreenSchemesApi#deleteSchemeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .screenSchemes
              .deleteSchemeById(screenSchemeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreenSchemesApi#deleteSchemeById");
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
| **screenSchemeId** | **String**| The ID of the screen scheme. | |

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
| **204** | Returned if the screen scheme is deleted. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="listScreenSchemes"></a>
# **listScreenSchemes**
> PageBeanScreenScheme listScreenSchemes().startAt(startAt).maxResults(maxResults).id(id).expand(expand).queryString(queryString).orderBy(orderBy).execute();

Get screen schemes

Returns a [paginated](https://dac-static.atlassian.com) list of screen schemes.  Only screen schemes used in classic projects are returned.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScreenSchemesApi;
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
    Long startAt = 0L; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 25; // The maximum number of items to return per page.
    Set<Long> id = Arrays.asList(); // The list of screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&id=10001`.
    String expand = ""; // Use [expand](https://dac-static.atlassian.com) include additional information in the response. This parameter accepts `issueTypeScreenSchemes` that, for each screen schemes, returns information about the issue type screen scheme the screen scheme is assigned to.
    String queryString = ""; // String used to perform a case-insensitive partial match with screen scheme name.
    String orderBy = "name"; // [Order](https://dac-static.atlassian.com) the results by a field:   *  `id` Sorts by screen scheme ID.  *  `name` Sorts by screen scheme name.
    try {
      PageBeanScreenScheme result = client
              .screenSchemes
              .listScreenSchemes()
              .startAt(startAt)
              .maxResults(maxResults)
              .id(id)
              .expand(expand)
              .queryString(queryString)
              .orderBy(orderBy)
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
      System.err.println("Exception when calling ScreenSchemesApi#listScreenSchemes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanScreenScheme> response = client
              .screenSchemes
              .listScreenSchemes()
              .startAt(startAt)
              .maxResults(maxResults)
              .id(id)
              .expand(expand)
              .queryString(queryString)
              .orderBy(orderBy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreenSchemesApi#listScreenSchemes");
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
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 25] |
| **id** | [**Set&lt;Long&gt;**](Long.md)| The list of screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. | [optional] |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) include additional information in the response. This parameter accepts &#x60;issueTypeScreenSchemes&#x60; that, for each screen schemes, returns information about the issue type screen scheme the screen scheme is assigned to. | [optional] [default to ] |
| **queryString** | **String**| String used to perform a case-insensitive partial match with screen scheme name. | [optional] [default to ] |
| **orderBy** | **String**| [Order](https://dac-static.atlassian.com) the results by a field:   *  &#x60;id&#x60; Sorts by screen scheme ID.  *  &#x60;name&#x60; Sorts by screen scheme name. | [optional] [enum: name, -name, +name, id, -id, +id] |

### Return type

[**PageBeanScreenScheme**](PageBeanScreenScheme.md)

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
| **403** | Returned if the user does not have the necessary permission. |  -  |

<a name="updateSchemeById"></a>
# **updateSchemeById**
> Object updateSchemeById(screenSchemeId, updateScreenSchemeDetails).execute();

Update screen scheme

Updates a screen scheme. Only screen schemes used in classic projects can be updated.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScreenSchemesApi;
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
    String screenSchemeId = "screenSchemeId_example"; // The ID of the screen scheme.
    String description = "description_example"; // The description of the screen scheme. The maximum length is 255 characters.
    String name = "name_example"; // The name of the screen scheme. The name must be unique. The maximum length is 255 characters.
    UpdateScreenTypes screens = new UpdateScreenTypes(); // The IDs of the screens for the screen types of the screen scheme. Only screens used in classic projects are accepted.
    try {
      Object result = client
              .screenSchemes
              .updateSchemeById(screenSchemeId)
              .description(description)
              .name(name)
              .screens(screens)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreenSchemesApi#updateSchemeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .screenSchemes
              .updateSchemeById(screenSchemeId)
              .description(description)
              .name(name)
              .screens(screens)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreenSchemesApi#updateSchemeById");
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
| **screenSchemeId** | **String**| The ID of the screen scheme. | |
| **updateScreenSchemeDetails** | [**UpdateScreenSchemeDetails**](UpdateScreenSchemeDetails.md)| The screen scheme update details. | |

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
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

