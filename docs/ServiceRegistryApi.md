# ServiceRegistryApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAttributesOfServiceRegistries**](ServiceRegistryApi.md#getAttributesOfServiceRegistries) | **GET** /rest/atlassian-connect/1/service-registry | Retrieve the attributes of service registries |


<a name="getAttributesOfServiceRegistries"></a>
# **getAttributesOfServiceRegistries**
> List&lt;ServiceRegistry&gt; getAttributesOfServiceRegistries(serviceIds).execute();

Retrieve the attributes of service registries

Retrieve the attributes of given service registries.  **[Permissions](https://dac-static.atlassian.com) required:** Only Connect apps can make this request and the servicesIds belong to the tenant you are requesting

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceRegistryApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.atlassian.net";
    AtlassianJira client = new AtlassianJira(configuration);
    List<String> serviceIds = Arrays.asList(); // The ID of the services (the strings starting with \"b:\" need to be decoded in Base64).
    try {
      List<ServiceRegistry> result = client
              .serviceRegistry
              .getAttributesOfServiceRegistries(serviceIds)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceRegistryApi#getAttributesOfServiceRegistries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ServiceRegistry>> response = client
              .serviceRegistry
              .getAttributesOfServiceRegistries(serviceIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceRegistryApi#getAttributesOfServiceRegistries");
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
| **serviceIds** | [**List&lt;String&gt;**](String.md)| The ID of the services (the strings starting with \&quot;b:\&quot; need to be decoded in Base64). | |

### Return type

[**List&lt;ServiceRegistry&gt;**](ServiceRegistry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | The request needs to be authenticated. |  -  |
| **403** | The request isn&#39;t authorized. |  -  |
| **500** | The endpoint failed internally. |  -  |
| **501** | The endpoint isn&#39;t ready for receiving requests. |  -  |
| **504** | The upstream service is busy. |  -  |

