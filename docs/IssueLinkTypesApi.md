# IssueLinkTypesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLinkType**](IssueLinkTypesApi.md#createLinkType) | **POST** /rest/api/3/issueLinkType | Create issue link type |
| [**deleteType**](IssueLinkTypesApi.md#deleteType) | **DELETE** /rest/api/3/issueLinkType/{issueLinkTypeId} | Delete issue link type |
| [**getAll**](IssueLinkTypesApi.md#getAll) | **GET** /rest/api/3/issueLinkType | Get issue link types |
| [**getLinkType**](IssueLinkTypesApi.md#getLinkType) | **GET** /rest/api/3/issueLinkType/{issueLinkTypeId} | Get issue link type |
| [**updateType**](IssueLinkTypesApi.md#updateType) | **PUT** /rest/api/3/issueLinkType/{issueLinkTypeId} | Update issue link type |


<a name="createLinkType"></a>
# **createLinkType**
> IssueLinkType createLinkType(issueLinkType).execute();

Create issue link type

Creates an issue link type. Use this operation to create descriptions of the reasons why issues are linked. The issue link type consists of a name and descriptions for a link&#39;s inward and outward relationships.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueLinkTypesApi;
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
    String id = "id_example"; // The ID of the issue link type and is used as follows:   *  In the [issueLink](https://dac-static.atlassian.com) resource it is the type of issue link. Required on create when `name` isn't provided. Otherwise, read only.  *  In the [issueLinkType](https://dac-static.atlassian.com) resource it is read only.
    String inward = "inward_example"; // The description of the issue link type inward link and is used as follows:   *  In the [issueLink](https://dac-static.atlassian.com) resource it is read only.  *  In the [issueLinkType](https://dac-static.atlassian.com) resource it is required on create and optional on update. Otherwise, read only.
    String name = "name_example"; // The name of the issue link type and is used as follows:   *  In the [issueLink](https://dac-static.atlassian.com) resource it is the type of issue link. Required on create when `id` isn't provided. Otherwise, read only.  *  In the [issueLinkType](https://dac-static.atlassian.com) resource it is required on create and optional on update. Otherwise, read only.
    String outward = "outward_example"; // The description of the issue link type outward link and is used as follows:   *  In the [issueLink](https://dac-static.atlassian.com) resource it is read only.  *  In the [issueLinkType](https://dac-static.atlassian.com) resource it is required on create and optional on update. Otherwise, read only.
    URI self = new URI(); // The URL of the issue link type. Read only.
    try {
      IssueLinkType result = client
              .issueLinkTypes
              .createLinkType()
              .id(id)
              .inward(inward)
              .name(name)
              .outward(outward)
              .self(self)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getInward());
      System.out.println(result.getName());
      System.out.println(result.getOutward());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueLinkTypesApi#createLinkType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueLinkType> response = client
              .issueLinkTypes
              .createLinkType()
              .id(id)
              .inward(inward)
              .name(name)
              .outward(outward)
              .self(self)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueLinkTypesApi#createLinkType");
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
| **issueLinkType** | [**IssueLinkType**](IssueLinkType.md)|  | |

### Return type

[**IssueLinkType**](IssueLinkType.md)

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
| **404** | Returned if:   *  issue linking is disabled.  *  the issue link type name is in use.  *  the user does not have the required permissions. |  -  |

<a name="deleteType"></a>
# **deleteType**
> deleteType(issueLinkTypeId).execute();

Delete issue link type

Deletes an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueLinkTypesApi;
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
    String issueLinkTypeId = "issueLinkTypeId_example"; // The ID of the issue link type.
    try {
      client
              .issueLinkTypes
              .deleteType(issueLinkTypeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueLinkTypesApi#deleteType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .issueLinkTypes
              .deleteType(issueLinkTypeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueLinkTypesApi#deleteType");
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
| **issueLinkTypeId** | **String**| The ID of the issue link type. | |

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
| **400** | Returned if the issue link type ID is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if:   *  issue linking is disabled.  *  the issue link type is not found.  *  the user does not have the required permissions. |  -  |

<a name="getAll"></a>
# **getAll**
> IssueLinkTypes getAll().execute();

Get issue link types

Returns a list of all issue link types.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueLinkTypesApi;
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
      IssueLinkTypes result = client
              .issueLinkTypes
              .getAll()
              .execute();
      System.out.println(result);
      System.out.println(result.getIssueLinkTypes());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueLinkTypesApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueLinkTypes> response = client
              .issueLinkTypes
              .getAll()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueLinkTypesApi#getAll");
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

[**IssueLinkTypes**](IssueLinkTypes.md)

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
| **404** | Returned if issue linking is disabled. |  -  |

<a name="getLinkType"></a>
# **getLinkType**
> IssueLinkType getLinkType(issueLinkTypeId).execute();

Get issue link type

Returns an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueLinkTypesApi;
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
    String issueLinkTypeId = "issueLinkTypeId_example"; // The ID of the issue link type.
    try {
      IssueLinkType result = client
              .issueLinkTypes
              .getLinkType(issueLinkTypeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getInward());
      System.out.println(result.getName());
      System.out.println(result.getOutward());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueLinkTypesApi#getLinkType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueLinkType> response = client
              .issueLinkTypes
              .getLinkType(issueLinkTypeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueLinkTypesApi#getLinkType");
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
| **issueLinkTypeId** | **String**| The ID of the issue link type. | |

### Return type

[**IssueLinkType**](IssueLinkType.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the issue link type ID is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if:   *  issue linking is disabled.  *  the issue link type is not found.  *  the user does not have the required permissions. |  -  |

<a name="updateType"></a>
# **updateType**
> IssueLinkType updateType(issueLinkTypeId, issueLinkType).execute();

Update issue link type

Updates an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueLinkTypesApi;
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
    String issueLinkTypeId = "issueLinkTypeId_example"; // The ID of the issue link type.
    String id = "id_example"; // The ID of the issue link type and is used as follows:   *  In the [issueLink](https://dac-static.atlassian.com) resource it is the type of issue link. Required on create when `name` isn't provided. Otherwise, read only.  *  In the [issueLinkType](https://dac-static.atlassian.com) resource it is read only.
    String inward = "inward_example"; // The description of the issue link type inward link and is used as follows:   *  In the [issueLink](https://dac-static.atlassian.com) resource it is read only.  *  In the [issueLinkType](https://dac-static.atlassian.com) resource it is required on create and optional on update. Otherwise, read only.
    String name = "name_example"; // The name of the issue link type and is used as follows:   *  In the [issueLink](https://dac-static.atlassian.com) resource it is the type of issue link. Required on create when `id` isn't provided. Otherwise, read only.  *  In the [issueLinkType](https://dac-static.atlassian.com) resource it is required on create and optional on update. Otherwise, read only.
    String outward = "outward_example"; // The description of the issue link type outward link and is used as follows:   *  In the [issueLink](https://dac-static.atlassian.com) resource it is read only.  *  In the [issueLinkType](https://dac-static.atlassian.com) resource it is required on create and optional on update. Otherwise, read only.
    URI self = new URI(); // The URL of the issue link type. Read only.
    try {
      IssueLinkType result = client
              .issueLinkTypes
              .updateType(issueLinkTypeId)
              .id(id)
              .inward(inward)
              .name(name)
              .outward(outward)
              .self(self)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getInward());
      System.out.println(result.getName());
      System.out.println(result.getOutward());
      System.out.println(result.getSelf());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueLinkTypesApi#updateType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueLinkType> response = client
              .issueLinkTypes
              .updateType(issueLinkTypeId)
              .id(id)
              .inward(inward)
              .name(name)
              .outward(outward)
              .self(self)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueLinkTypesApi#updateType");
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
| **issueLinkTypeId** | **String**| The ID of the issue link type. | |
| **issueLinkType** | [**IssueLinkType**](IssueLinkType.md)|  | |

### Return type

[**IssueLinkType**](IssueLinkType.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the issue link type ID or the request body are invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **404** | Returned if:   *  issue linking is disabled.  *  the issue link type is not found.  *  the user does not have the required permissions. |  -  |

