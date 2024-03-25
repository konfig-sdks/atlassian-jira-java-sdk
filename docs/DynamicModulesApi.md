# DynamicModulesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllRegisteredModules**](DynamicModulesApi.md#getAllRegisteredModules) | **GET** /rest/atlassian-connect/1/app/module/dynamic | Get modules |
| [**registerModules**](DynamicModulesApi.md#registerModules) | **POST** /rest/atlassian-connect/1/app/module/dynamic | Register modules |
| [**remove**](DynamicModulesApi.md#remove) | **DELETE** /rest/atlassian-connect/1/app/module/dynamic | Remove modules |


<a name="getAllRegisteredModules"></a>
# **getAllRegisteredModules**
> ConnectModules getAllRegisteredModules().execute();

Get modules

Returns all modules registered dynamically by the calling app.  **[Permissions](https://dac-static.atlassian.com) required:** Only Connect apps can make this request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicModulesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    AtlassianJira client = new AtlassianJira(configuration);
    try {
      ConnectModules result = client
              .dynamicModules
              .getAllRegisteredModules()
              .execute();
      System.out.println(result);
      System.out.println(result.getModules());
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicModulesApi#getAllRegisteredModules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConnectModules> response = client
              .dynamicModules
              .getAllRegisteredModules()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicModulesApi#getAllRegisteredModules");
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

[**ConnectModules**](ConnectModules.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="registerModules"></a>
# **registerModules**
> registerModules(connectModules).execute();

Register modules

Registers a list of modules.  **[Permissions](https://dac-static.atlassian.com) required:** Only Connect apps can make this request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicModulesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    AtlassianJira client = new AtlassianJira(configuration);
    List<Object> modules = null; // A list of app modules in the same format as the `modules` property in the [app descriptor](https://developer.atlassian.com/cloud/jira/platform/app-descriptor/).
    try {
      client
              .dynamicModules
              .registerModules(modules)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicModulesApi#registerModules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicModules
              .registerModules(modules)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicModulesApi#registerModules");
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
| **connectModules** | [**ConnectModules**](ConnectModules.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="remove"></a>
# **remove**
> remove().moduleKey(moduleKey).execute();

Remove modules

Remove all or a list of modules registered by the calling app.  **[Permissions](https://dac-static.atlassian.com) required:** Only Connect apps can make this request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicModulesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    AtlassianJira client = new AtlassianJira(configuration);
    List<String> moduleKey = Arrays.asList(); // The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, `moduleKey=dynamic-attachment-entity-property&moduleKey=dynamic-select-field`. Nonexistent keys are ignored.
    try {
      client
              .dynamicModules
              .remove()
              .moduleKey(moduleKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicModulesApi#remove");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicModules
              .remove()
              .moduleKey(moduleKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicModulesApi#remove");
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
| **moduleKey** | [**List&lt;String&gt;**](String.md)| The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, &#x60;moduleKey&#x3D;dynamic-attachment-entity-property&amp;moduleKey&#x3D;dynamic-select-field&#x60;. Nonexistent keys are ignored. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the request is successful. |  -  |

