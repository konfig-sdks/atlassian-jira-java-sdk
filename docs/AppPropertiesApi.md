# AppPropertiesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteForgeProperty**](AppPropertiesApi.md#deleteForgeProperty) | **DELETE** /rest/forge/1/app/properties/{propertyKey} | Delete app property (Forge) |
| [**deleteProperty**](AppPropertiesApi.md#deleteProperty) | **DELETE** /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey} | Delete app property |
| [**getAllProperties**](AppPropertiesApi.md#getAllProperties) | **GET** /rest/atlassian-connect/1/addons/{addonKey}/properties | Get app properties |
| [**getByKeyAndValue**](AppPropertiesApi.md#getByKeyAndValue) | **GET** /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey} | Get app property |
| [**setAppProperty**](AppPropertiesApi.md#setAppProperty) | **PUT** /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey} | Set app property |
| [**setForgeProperty**](AppPropertiesApi.md#setForgeProperty) | **PUT** /rest/forge/1/app/properties/{propertyKey} | Set app property (Forge) |


<a name="deleteForgeProperty"></a>
# **deleteForgeProperty**
> deleteForgeProperty(propertyKey).execute();

Delete app property (Forge)

Deletes a Forge app&#39;s property.  **[Permissions](https://dac-static.atlassian.com) required:** Only Forge apps can make this request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppPropertiesApi;
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
    String propertyKey = "propertyKey_example"; // The key of the property.
    try {
      client
              .appProperties
              .deleteForgeProperty(propertyKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppPropertiesApi#deleteForgeProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .appProperties
              .deleteForgeProperty(propertyKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppPropertiesApi#deleteForgeProperty");
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
| **propertyKey** | **String**| The key of the property. | |

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
| **204** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="deleteProperty"></a>
# **deleteProperty**
> deleteProperty(addonKey, propertyKey).execute();

Delete app property

Deletes an app&#39;s property.  **[Permissions](https://dac-static.atlassian.com) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request. Additionally, Forge apps can access Connect app properties (stored against the same &#x60;app.connect.key&#x60;).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppPropertiesApi;
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
    String addonKey = "addonKey_example"; // The key of the app, as defined in its descriptor.
    String propertyKey = "propertyKey_example"; // The key of the property.
    try {
      client
              .appProperties
              .deleteProperty(addonKey, propertyKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppPropertiesApi#deleteProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .appProperties
              .deleteProperty(addonKey, propertyKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppPropertiesApi#deleteProperty");
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
| **addonKey** | **String**| The key of the app, as defined in its descriptor. | |
| **propertyKey** | **String**| The key of the property. | |

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
| **204** | Returned if the request is successful. |  -  |

<a name="getAllProperties"></a>
# **getAllProperties**
> PropertyKeys getAllProperties(addonKey).execute();

Get app properties

Gets all the properties of an app.  **[Permissions](https://dac-static.atlassian.com) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request. Additionally, Forge apps can access Connect app properties (stored against the same &#x60;app.connect.key&#x60;).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppPropertiesApi;
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
    String addonKey = "addonKey_example"; // The key of the app, as defined in its descriptor.
    try {
      PropertyKeys result = client
              .appProperties
              .getAllProperties(addonKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getKeys());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppPropertiesApi#getAllProperties");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PropertyKeys> response = client
              .appProperties
              .getAllProperties(addonKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppPropertiesApi#getAllProperties");
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
| **addonKey** | **String**| The key of the app, as defined in its descriptor. | |

### Return type

[**PropertyKeys**](PropertyKeys.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="getByKeyAndValue"></a>
# **getByKeyAndValue**
> EntityProperty getByKeyAndValue(addonKey, propertyKey).execute();

Get app property

Returns the key and value of an app&#39;s property.  **[Permissions](https://dac-static.atlassian.com) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request. Additionally, Forge apps can access Connect app properties (stored against the same &#x60;app.connect.key&#x60;).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppPropertiesApi;
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
    String addonKey = "addonKey_example"; // The key of the app, as defined in its descriptor.
    String propertyKey = "propertyKey_example"; // The key of the property.
    try {
      EntityProperty result = client
              .appProperties
              .getByKeyAndValue(addonKey, propertyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getKey());
      System.out.println(result.getValue());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppPropertiesApi#getByKeyAndValue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EntityProperty> response = client
              .appProperties
              .getByKeyAndValue(addonKey, propertyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppPropertiesApi#getByKeyAndValue");
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
| **addonKey** | **String**| The key of the app, as defined in its descriptor. | |
| **propertyKey** | **String**| The key of the property. | |

### Return type

[**EntityProperty**](EntityProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="setAppProperty"></a>
# **setAppProperty**
> OperationMessage setAppProperty(addonKey, propertyKey, body).execute();

Set app property

Sets the value of an app&#39;s property. Use this resource to store custom data for your app.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](https://dac-static.atlassian.com) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request. Additionally, Forge apps can access Connect app properties (stored against the same &#x60;app.connect.key&#x60;).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppPropertiesApi;
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
    String addonKey = "addonKey_example"; // The key of the app, as defined in its descriptor.
    String propertyKey = "propertyKey_example"; // The key of the property.
    try {
      OperationMessage result = client
              .appProperties
              .setAppProperty(addonKey, propertyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getStatusCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppPropertiesApi#setAppProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OperationMessage> response = client
              .appProperties
              .setAppProperty(addonKey, propertyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppPropertiesApi#setAppProperty");
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
| **addonKey** | **String**| The key of the app, as defined in its descriptor. | |
| **propertyKey** | **String**| The key of the property. | |
| **body** | **Object**|  | |

### Return type

[**OperationMessage**](OperationMessage.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the property is updated. |  -  |
| **201** | Returned is the property is created. |  -  |

<a name="setForgeProperty"></a>
# **setForgeProperty**
> OperationMessage setForgeProperty(propertyKey, body).execute();

Set app property (Forge)

Sets the value of a Forge app&#39;s property. These values can be retrieved in [Jira expressions](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/) through the &#x60;app&#x60; [context variable](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables).  For other use cases, use the [Storage API](https://developer.atlassian.com/platform/forge/runtime-reference/storage-api/).  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](https://dac-static.atlassian.com) required:** Only Forge apps can make this request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppPropertiesApi;
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
    String propertyKey = "propertyKey_example"; // The key of the property.
    try {
      OperationMessage result = client
              .appProperties
              .setForgeProperty(propertyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getStatusCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppPropertiesApi#setForgeProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OperationMessage> response = client
              .appProperties
              .setForgeProperty(propertyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppPropertiesApi#setForgeProperty");
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
| **propertyKey** | **String**| The key of the property. | |
| **body** | **Object**|  | |

### Return type

[**OperationMessage**](OperationMessage.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the property is updated. |  -  |
| **201** | Returned is the property is created. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

