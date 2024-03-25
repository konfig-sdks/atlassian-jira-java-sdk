# AnnouncementBannerApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConfiguration**](AnnouncementBannerApi.md#getConfiguration) | **GET** /rest/api/3/announcementBanner | Get announcement banner configuration |
| [**updateConfiguration**](AnnouncementBannerApi.md#updateConfiguration) | **PUT** /rest/api/3/announcementBanner | Update announcement banner configuration |


<a name="getConfiguration"></a>
# **getConfiguration**
> AnnouncementBannerConfiguration getConfiguration().execute();

Get announcement banner configuration

Returns the current announcement banner configuration.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AnnouncementBannerApi;
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
      AnnouncementBannerConfiguration result = client
              .announcementBanner
              .getConfiguration()
              .execute();
      System.out.println(result);
      System.out.println(result.getHashId());
      System.out.println(result.getIsDismissible());
      System.out.println(result.getIsEnabled());
      System.out.println(result.getMessage());
      System.out.println(result.getVisibility());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementBannerApi#getConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AnnouncementBannerConfiguration> response = client
              .announcementBanner
              .getConfiguration()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementBannerApi#getConfiguration");
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

[**AnnouncementBannerConfiguration**](AnnouncementBannerConfiguration.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="updateConfiguration"></a>
# **updateConfiguration**
> Object updateConfiguration(announcementBannerConfigurationUpdate).execute();

Update announcement banner configuration

Updates the announcement banner configuration.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AnnouncementBannerApi;
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
    Boolean isDismissible = true; // Flag indicating if the announcement banner can be dismissed by the user.
    Boolean isEnabled = true; // Flag indicating if the announcement banner is enabled or not.
    String message = "message_example"; // The text on the announcement banner.
    String visibility = "visibility_example"; // Visibility of the announcement banner. Can be public or private.
    try {
      Object result = client
              .announcementBanner
              .updateConfiguration()
              .isDismissible(isDismissible)
              .isEnabled(isEnabled)
              .message(message)
              .visibility(visibility)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementBannerApi#updateConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .announcementBanner
              .updateConfiguration()
              .isDismissible(isDismissible)
              .isEnabled(isEnabled)
              .message(message)
              .visibility(visibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementBannerApi#updateConfiguration");
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
| **announcementBannerConfigurationUpdate** | [**AnnouncementBannerConfigurationUpdate**](AnnouncementBannerConfigurationUpdate.md)|  | |

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

