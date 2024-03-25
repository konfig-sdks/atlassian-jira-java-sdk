# ServerInfoApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInstanceInfo**](ServerInfoApi.md#getInstanceInfo) | **GET** /rest/api/3/serverInfo | Get Jira instance info |


<a name="getInstanceInfo"></a>
# **getInstanceInfo**
> ServerInformation getInstanceInfo().execute();

Get Jira instance info

Returns information about the Jira instance.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServerInfoApi;
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
      ServerInformation result = client
              .serverInfo
              .getInstanceInfo()
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getBaseUrl());
      System.out.println(result.getBuildDate());
      System.out.println(result.getBuildNumber());
      System.out.println(result.getDeploymentType());
      System.out.println(result.getDisplayUrl());
      System.out.println(result.getDisplayUrlServicedeskHelpCenter());
      System.out.println(result.getHealthChecks());
      System.out.println(result.getScmInfo());
      System.out.println(result.getServerTime());
      System.out.println(result.getServerTimeZone());
      System.out.println(result.getServerTitle());
      System.out.println(result.getVersionNumbers());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerInfoApi#getInstanceInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServerInformation> response = client
              .serverInfo
              .getInstanceInfo()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerInfoApi#getInstanceInfo");
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

[**ServerInformation**](ServerInformation.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |

