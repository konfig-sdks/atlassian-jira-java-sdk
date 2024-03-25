# ProjectAvatarsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAvatar**](ProjectAvatarsApi.md#deleteAvatar) | **DELETE** /rest/api/3/project/{projectIdOrKey}/avatar/{id} | Delete project avatar |
| [**getAllAvatars**](ProjectAvatarsApi.md#getAllAvatars) | **GET** /rest/api/3/project/{projectIdOrKey}/avatars | Get all project avatars |
| [**setAvatar**](ProjectAvatarsApi.md#setAvatar) | **PUT** /rest/api/3/project/{projectIdOrKey}/avatar | Set project avatar |
| [**setAvatar_0**](ProjectAvatarsApi.md#setAvatar_0) | **POST** /rest/api/3/project/{projectIdOrKey}/avatar2 | Load project avatar |


<a name="deleteAvatar"></a>
# **deleteAvatar**
> deleteAvatar(projectIdOrKey, id).execute();

Delete project avatar

Deletes a custom avatar from a project. Note that system avatars cannot be deleted.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectAvatarsApi;
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
    String projectIdOrKey = "projectIdOrKey_example"; // The project ID or (case-sensitive) key.
    Long id = 56L; // The ID of the avatar.
    try {
      client
              .projectAvatars
              .deleteAvatar(projectIdOrKey, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAvatarsApi#deleteAvatar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .projectAvatars
              .deleteAvatar(projectIdOrKey, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAvatarsApi#deleteAvatar");
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
| **projectIdOrKey** | **String**| The project ID or (case-sensitive) key. | |
| **id** | **Long**| The ID of the avatar. | |

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
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the avatar is a system avatar or the user does not have permission to administer the project. |  -  |
| **404** | Returned if the project or avatar is not found or the user does not have permission to view the project. |  -  |

<a name="getAllAvatars"></a>
# **getAllAvatars**
> ProjectAvatars getAllAvatars(projectIdOrKey).execute();

Get all project avatars

Returns all project avatars, grouped by system and custom avatars.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectAvatarsApi;
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
    String projectIdOrKey = "projectIdOrKey_example"; // The ID or (case-sensitive) key of the project.
    try {
      ProjectAvatars result = client
              .projectAvatars
              .getAllAvatars(projectIdOrKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustom());
      System.out.println(result.getSystem());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAvatarsApi#getAllAvatars");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectAvatars> response = client
              .projectAvatars
              .getAllAvatars(projectIdOrKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAvatarsApi#getAllAvatars");
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
| **projectIdOrKey** | **String**| The ID or (case-sensitive) key of the project. | |

### Return type

[**ProjectAvatars**](ProjectAvatars.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if the project is not found or the user does not have permission to view the project. |  -  |

<a name="setAvatar"></a>
# **setAvatar**
> Object setAvatar(projectIdOrKey, requestBody).execute();

Set project avatar

Sets the avatar displayed for a project.  Use [Load project avatar](https://dac-static.atlassian.com) to store avatars against the project, before using this operation to set the displayed avatar.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectAvatarsApi;
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
    String id = "id_example"; // The ID of the avatar.
    String projectIdOrKey = "projectIdOrKey_example"; // The ID or (case-sensitive) key of the project.
    String fileName = "fileName_example"; // The file name of the avatar icon. Returned for system avatars.
    Boolean isDeletable = true; // Whether the avatar can be deleted.
    Boolean isSelected = true; // Whether the avatar is used in Jira. For example, shown as a project's avatar.
    Boolean isSystemAvatar = true; // Whether the avatar is a system avatar.
    String owner = "owner_example"; // The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user.
    Map<String, URI> urls = new HashMap(); // The list of avatar icon URLs.
    try {
      Object result = client
              .projectAvatars
              .setAvatar(id, projectIdOrKey)
              .fileName(fileName)
              .isDeletable(isDeletable)
              .isSelected(isSelected)
              .isSystemAvatar(isSystemAvatar)
              .owner(owner)
              .urls(urls)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAvatarsApi#setAvatar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .projectAvatars
              .setAvatar(id, projectIdOrKey)
              .fileName(fileName)
              .isDeletable(isDeletable)
              .isSelected(isSelected)
              .isSystemAvatar(isSystemAvatar)
              .owner(owner)
              .urls(urls)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAvatarsApi#setAvatar");
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
| **projectIdOrKey** | **String**| The ID or (case-sensitive) key of the project. | |
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
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have permission to administer the project. |  -  |
| **404** | Returned if the project or avatar is not found or the user does not have permission to view the project. |  -  |

<a name="setAvatar_0"></a>
# **setAvatar_0**
> Avatar setAvatar_0(projectIdOrKey, body).x(x).y(y).size(size).execute();

Load project avatar

Loads an avatar for a project.  Specify the avatar&#39;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](https://dac-static.atlassian.com).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST &#x60;  &#x60;--user email@example.com:&lt;api_token&gt; &#x60;  &#x60;--header &#39;X-Atlassian-Token: no-check&#39; &#x60;  &#x60;--header &#39;Content-Type: image/&lt; image_type&gt;&#39; &#x60;  &#x60;--data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; &#x60;  &#x60;--url &#39;https://your-domain.atlassian.net/rest/api/3/project/{projectIdOrKey}/avatar2&#39;&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#39;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar use [Set project avatar](https://dac-static.atlassian.com) to set it as the project&#39;s displayed avatar.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectAvatarsApi;
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
    String projectIdOrKey = "projectIdOrKey_example"; // The ID or (case-sensitive) key of the project.
    Integer x = 0; // The X coordinate of the top-left corner of the crop region.
    Integer y = 0; // The Y coordinate of the top-left corner of the crop region.
    Integer size = 0; // The length of each side of the crop region.
    try {
      Avatar result = client
              .projectAvatars
              .setAvatar_0(projectIdOrKey)
              .x(x)
              .y(y)
              .size(size)
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
      System.err.println("Exception when calling ProjectAvatarsApi#setAvatar_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Avatar> response = client
              .projectAvatars
              .setAvatar_0(projectIdOrKey)
              .x(x)
              .y(y)
              .size(size)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAvatarsApi#setAvatar_0");
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
| **projectIdOrKey** | **String**| The ID or (case-sensitive) key of the project. | |
| **body** | **Object**|  | |
| **x** | **Integer**| The X coordinate of the top-left corner of the crop region. | [optional] [default to 0] |
| **y** | **Integer**| The Y coordinate of the top-left corner of the crop region. | [optional] [default to 0] |
| **size** | **Integer**| The length of each side of the crop region. | [optional] [default to 0] |

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
| **400** | Returned if:   *  an image isn&#39;t included in the request.  *  the image type is unsupported.  *  the crop parameters extend the crop area beyond the edge of the image. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have permission to administer the project or an anonymous call is made to the operation. |  -  |
| **404** | Returned if the project is not found or the user does not have permission to view the project. |  -  |

