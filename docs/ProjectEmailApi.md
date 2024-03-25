# ProjectEmailApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSenderEmail**](ProjectEmailApi.md#getSenderEmail) | **GET** /rest/api/3/project/{projectId}/email | Get project&#39;s sender email |
| [**setSenderEmail**](ProjectEmailApi.md#setSenderEmail) | **PUT** /rest/api/3/project/{projectId}/email | Set project&#39;s sender email |


<a name="getSenderEmail"></a>
# **getSenderEmail**
> ProjectEmailAddress getSenderEmail(projectId).execute();

Get project&#39;s sender email

Returns the [project&#39;s sender email address](https://confluence.atlassian.com/x/dolKLg).  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectEmailApi;
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
    Long projectId = 56L; // The project ID.
    try {
      ProjectEmailAddress result = client
              .projectEmail
              .getSenderEmail(projectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmailAddress());
      System.out.println(result.getEmailAddressStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectEmailApi#getSenderEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectEmailAddress> response = client
              .projectEmail
              .getSenderEmail(projectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectEmailApi#getSenderEmail");
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
| **projectId** | **Long**| The project ID. | |

### Return type

[**ProjectEmailAddress**](ProjectEmailAddress.md)

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
| **403** | Returned if the user does not have permission to read project. |  -  |
| **404** | Returned if the project or project&#39;s sender email address is not found. |  -  |

<a name="setSenderEmail"></a>
# **setSenderEmail**
> Object setSenderEmail(projectId, projectEmailAddress).execute();

Set project&#39;s sender email

Sets the [project&#39;s sender email address](https://confluence.atlassian.com/x/dolKLg).  If &#x60;emailAddress&#x60; is an empty string, the default email address is restored.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectEmailApi;
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
    Long projectId = 56L; // The project ID.
    String emailAddress = "emailAddress_example"; // The email address.
    List<String> emailAddressStatus = Arrays.asList(); // When using a custom domain, the status of the email address.
    try {
      Object result = client
              .projectEmail
              .setSenderEmail(projectId)
              .emailAddress(emailAddress)
              .emailAddressStatus(emailAddressStatus)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectEmailApi#setSenderEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .projectEmail
              .setSenderEmail(projectId)
              .emailAddress(emailAddress)
              .emailAddressStatus(emailAddressStatus)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectEmailApi#setSenderEmail");
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
| **projectId** | **Long**| The project ID. | |
| **projectEmailAddress** | [**ProjectEmailAddress**](ProjectEmailAddress.md)| The project&#39;s sender email address to be set. | |

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
| **204** | Returned if the project&#39;s sender email address is successfully set. |  -  |
| **400** | Returned if the request is not valid, if the email address is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have permission to administer the project. |  -  |
| **404** | Returned if the project is not found. |  -  |

