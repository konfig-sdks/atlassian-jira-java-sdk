# ClassificationLevelsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAll**](ClassificationLevelsApi.md#getAll) | **GET** /rest/api/3/classification-levels | Get all classification levels |


<a name="getAll"></a>
# **getAll**
> DataClassificationLevelsBean getAll().status(status).orderBy(orderBy).execute();

Get all classification levels

Returns all classification levels.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClassificationLevelsApi;
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
    Set<String> status = Arrays.asList(""); // Optional set of statuses to filter by.
    String orderBy = "rank"; // Ordering of the results by a given field. If not provided, values will not be sorted.
    try {
      DataClassificationLevelsBean result = client
              .classificationLevels
              .getAll()
              .status(status)
              .orderBy(orderBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getClassifications());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationLevelsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataClassificationLevelsBean> response = client
              .classificationLevels
              .getAll()
              .status(status)
              .orderBy(orderBy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationLevelsApi#getAll");
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
| **status** | [**Set&lt;String&gt;**](String.md)| Optional set of statuses to filter by. | [optional] [enum: PUBLISHED, ARCHIVED, DRAFT] |
| **orderBy** | **String**| Ordering of the results by a given field. If not provided, values will not be sorted. | [optional] [enum: rank, -rank, +rank] |

### Return type

[**DataClassificationLevelsBean**](DataClassificationLevelsBean.md)

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

