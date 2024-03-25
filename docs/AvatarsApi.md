# AvatarsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAvatar**](AvatarsApi.md#deleteAvatar) | **DELETE** /rest/api/3/universal_avatar/type/{type}/owner/{owningObjectId}/avatar/{id} | Delete avatar |
| [**getAvatarImageById**](AvatarsApi.md#getAvatarImageById) | **GET** /rest/api/3/universal_avatar/view/type/{type}/avatar/{id} | Get avatar image by ID |
| [**getAvatarImageByOwner**](AvatarsApi.md#getAvatarImageByOwner) | **GET** /rest/api/3/universal_avatar/view/type/{type}/owner/{entityId} | Get avatar image by owner |
| [**getDefaultAvatarImageByType**](AvatarsApi.md#getDefaultAvatarImageByType) | **GET** /rest/api/3/universal_avatar/view/type/{type} | Get avatar image by type |
| [**getSystemAndCustomAvatarsByType**](AvatarsApi.md#getSystemAndCustomAvatarsByType) | **GET** /rest/api/3/universal_avatar/type/{type}/owner/{entityId} | Get avatars |
| [**getSystemAvatarsByType**](AvatarsApi.md#getSystemAvatarsByType) | **GET** /rest/api/3/avatar/{type}/system | Get system avatars by type |
| [**loadCustomAvatarForProjectOrIssueType**](AvatarsApi.md#loadCustomAvatarForProjectOrIssueType) | **POST** /rest/api/3/universal_avatar/type/{type}/owner/{entityId} | Load avatar |


<a name="deleteAvatar"></a>
# **deleteAvatar**
> deleteAvatar(type, owningObjectId, id).execute();

Delete avatar

Deletes an avatar from a project or issue type.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarsApi;
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
    String type = "project"; // The avatar type.
    String owningObjectId = "owningObjectId_example"; // The ID of the item the avatar is associated with.
    Long id = 56L; // The ID of the avatar.
    try {
      client
              .avatars
              .deleteAvatar(type, owningObjectId, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#deleteAvatar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .avatars
              .deleteAvatar(type, owningObjectId, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#deleteAvatar");
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
| **type** | **String**| The avatar type. | [enum: project, issuetype] |
| **owningObjectId** | **String**| The ID of the item the avatar is associated with. | |
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
| **400** | Returned if the request is invalid. |  -  |
| **403** | Returned if the user does not have permission to delete the avatar, the avatar is not deletable. |  -  |
| **404** | Returned if the avatar type, associated item ID, or avatar ID is invalid. |  -  |

<a name="getAvatarImageById"></a>
# **getAvatarImageById**
> Object getAvatarImageById(type, id).size(size).format(format).execute();

Get avatar image by ID

Returns a project or issue type avatar image by ID.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  For system avatars, none.  *  For custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  For custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarsApi;
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
    String type = "issuetype"; // The icon type of the avatar.
    Long id = 56L; // The ID of the avatar.
    String size = "xsmall"; // The size of the avatar image. If not provided the default size is returned.
    String format = "png"; // The format to return the avatar image in. If not provided the original content format is returned.
    try {
      Object result = client
              .avatars
              .getAvatarImageById(type, id)
              .size(size)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getAvatarImageById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .avatars
              .getAvatarImageById(type, id)
              .size(size)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getAvatarImageById");
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
| **type** | **String**| The icon type of the avatar. | [enum: issuetype, project] |
| **id** | **Long**| The ID of the avatar. | |
| **size** | **String**| The size of the avatar image. If not provided the default size is returned. | [optional] [enum: xsmall, small, medium, large, xlarge] |
| **format** | **String**| The format to return the avatar image in. If not provided the original content format is returned. | [optional] [enum: png, svg] |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*, image/png, image/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="getAvatarImageByOwner"></a>
# **getAvatarImageByOwner**
> Object getAvatarImageByOwner(type, entityId).size(size).format(format).execute();

Get avatar image by owner

Returns the avatar image for a project or issue type.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  For system avatars, none.  *  For custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  For custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarsApi;
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
    String type = "issuetype"; // The icon type of the avatar.
    String entityId = "entityId_example"; // The ID of the project or issue type the avatar belongs to.
    String size = "xsmall"; // The size of the avatar image. If not provided the default size is returned.
    String format = "png"; // The format to return the avatar image in. If not provided the original content format is returned.
    try {
      Object result = client
              .avatars
              .getAvatarImageByOwner(type, entityId)
              .size(size)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getAvatarImageByOwner");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .avatars
              .getAvatarImageByOwner(type, entityId)
              .size(size)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getAvatarImageByOwner");
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
| **type** | **String**| The icon type of the avatar. | [enum: issuetype, project] |
| **entityId** | **String**| The ID of the project or issue type the avatar belongs to. | |
| **size** | **String**| The size of the avatar image. If not provided the default size is returned. | [optional] [enum: xsmall, small, medium, large, xlarge] |
| **format** | **String**| The format to return the avatar image in. If not provided the original content format is returned. | [optional] [enum: png, svg] |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*, image/png, image/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="getDefaultAvatarImageByType"></a>
# **getDefaultAvatarImageByType**
> Object getDefaultAvatarImageByType(type).size(size).format(format).execute();

Get avatar image by type

Returns the default project or issue type avatar image.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarsApi;
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
    String type = "issuetype"; // The icon type of the avatar.
    String size = "xsmall"; // The size of the avatar image. If not provided the default size is returned.
    String format = "png"; // The format to return the avatar image in. If not provided the original content format is returned.
    try {
      Object result = client
              .avatars
              .getDefaultAvatarImageByType(type)
              .size(size)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getDefaultAvatarImageByType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .avatars
              .getDefaultAvatarImageByType(type)
              .size(size)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getDefaultAvatarImageByType");
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
| **type** | **String**| The icon type of the avatar. | [enum: issuetype, project] |
| **size** | **String**| The size of the avatar image. If not provided the default size is returned. | [optional] [enum: xsmall, small, medium, large, xlarge] |
| **format** | **String**| The format to return the avatar image in. If not provided the original content format is returned. | [optional] [enum: png, svg] |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*, image/png, image/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="getSystemAndCustomAvatarsByType"></a>
# **getSystemAndCustomAvatarsByType**
> Avatars getSystemAndCustomAvatarsByType(type, entityId).execute();

Get avatars

Returns the system and custom avatars for a project or issue type.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  for custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  for custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.  *  for system avatars, none.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarsApi;
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
    String type = "project"; // The avatar type.
    String entityId = "entityId_example"; // The ID of the item the avatar is associated with.
    try {
      Avatars result = client
              .avatars
              .getSystemAndCustomAvatarsByType(type, entityId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustom());
      System.out.println(result.getSystem());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getSystemAndCustomAvatarsByType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Avatars> response = client
              .avatars
              .getSystemAndCustomAvatarsByType(type, entityId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getSystemAndCustomAvatarsByType");
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
| **type** | **String**| The avatar type. | [enum: project, issuetype] |
| **entityId** | **String**| The ID of the item the avatar is associated with. | |

### Return type

[**Avatars**](Avatars.md)

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
| **404** | Returned if the avatar type is invalid, the associated item ID is missing, or the item is not found. |  -  |

<a name="getSystemAvatarsByType"></a>
# **getSystemAvatarsByType**
> SystemAvatars getSystemAvatarsByType(type).execute();

Get system avatars by type

Returns a list of system avatar details by owner type, where the owner types are issue type, project, or user.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarsApi;
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
    String type = "issuetype"; // The avatar type.
    try {
      SystemAvatars result = client
              .avatars
              .getSystemAvatarsByType(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getSystem());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getSystemAvatarsByType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SystemAvatars> response = client
              .avatars
              .getSystemAvatarsByType(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getSystemAvatarsByType");
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
| **type** | **String**| The avatar type. | [enum: issuetype, project, user] |

### Return type

[**SystemAvatars**](SystemAvatars.md)

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
| **500** | Returned if an error occurs while retrieving the list of avatars. |  -  |

<a name="loadCustomAvatarForProjectOrIssueType"></a>
# **loadCustomAvatarForProjectOrIssueType**
> Avatar loadCustomAvatarForProjectOrIssueType(type, entityId, size, body).x(x).y(y).execute();

Load avatar

Loads a custom avatar for a project or issue type.  Specify the avatar&#39;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](https://dac-static.atlassian.com).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST &#x60;  &#x60;--user email@example.com:&lt;api_token&gt; &#x60;  &#x60;--header &#39;X-Atlassian-Token: no-check&#39; &#x60;  &#x60;--header &#39;Content-Type: image/&lt; image_type&gt;&#39; &#x60;  &#x60;--data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; &#x60;  &#x60;--url &#39;https://your-domain.atlassian.net/rest/api/3/universal_avatar/type/{type}/owner/{entityId}&#39;&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#39;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar use:   *  [Update issue type](https://dac-static.atlassian.com) to set it as the issue type&#39;s displayed avatar.  *  [Set project avatar](https://dac-static.atlassian.com) to set it as the project&#39;s displayed avatar.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarsApi;
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
    String type = "project"; // The avatar type.
    String entityId = "entityId_example"; // The ID of the item the avatar is associated with.
    Integer size = 0; // The length of each side of the crop region.
    Integer x = 0; // The X coordinate of the top-left corner of the crop region.
    Integer y = 0; // The Y coordinate of the top-left corner of the crop region.
    try {
      Avatar result = client
              .avatars
              .loadCustomAvatarForProjectOrIssueType(type, entityId, size)
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
      System.err.println("Exception when calling AvatarsApi#loadCustomAvatarForProjectOrIssueType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Avatar> response = client
              .avatars
              .loadCustomAvatarForProjectOrIssueType(type, entityId, size)
              .x(x)
              .y(y)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#loadCustomAvatarForProjectOrIssueType");
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
| **type** | **String**| The avatar type. | [enum: project, issuetype] |
| **entityId** | **String**| The ID of the item the avatar is associated with. | |
| **size** | **Integer**| The length of each side of the crop region. | [default to 0] |
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
| **400** | Returned if:   *  an image isn&#39;t included in the request.  *  the image type is unsupported.  *  the crop parameters extend the crop area beyond the edge of the image. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permissions. |  -  |
| **404** | Returned if the avatar type is invalid, the associated item ID is missing, or the item is not found. |  -  |

