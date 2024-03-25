# IssueCustomFieldValuesAppsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateValue**](IssueCustomFieldValuesAppsApi.md#updateValue) | **PUT** /rest/api/3/app/field/{fieldIdOrKey}/value | Update custom field value |
| [**updateValues**](IssueCustomFieldValuesAppsApi.md#updateValues) | **POST** /rest/api/3/app/field/value | Update custom fields |


<a name="updateValue"></a>
# **updateValue**
> Object updateValue(fieldIdOrKey, customFieldValueUpdateDetails).generateChangelog(generateChangelog).execute();

Update custom field value

Updates the value of a custom field on one or more issues.  Apps can only perform this operation on [custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/) and [custom field types](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/) declared in their own manifests.  **[Permissions](https://dac-static.atlassian.com) required:** Only the app that owns the custom field or custom field type can update its values with this operation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCustomFieldValuesAppsApi;
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
    String fieldIdOrKey = "fieldIdOrKey_example"; // The ID or key of the custom field. For example, `customfield_10010`.
    List<CustomFieldValueUpdate> updates = Arrays.asList(); // The list of custom field update details.
    Boolean generateChangelog = true; // Whether to generate a changelog for this update.
    try {
      Object result = client
              .issueCustomFieldValuesApps
              .updateValue(fieldIdOrKey)
              .updates(updates)
              .generateChangelog(generateChangelog)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldValuesAppsApi#updateValue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issueCustomFieldValuesApps
              .updateValue(fieldIdOrKey)
              .updates(updates)
              .generateChangelog(generateChangelog)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldValuesAppsApi#updateValue");
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
| **fieldIdOrKey** | **String**| The ID or key of the custom field. For example, &#x60;customfield_10010&#x60;. | |
| **customFieldValueUpdateDetails** | [**CustomFieldValueUpdateDetails**](CustomFieldValueUpdateDetails.md)|  | |
| **generateChangelog** | **Boolean**| Whether to generate a changelog for this update. | [optional] [default to true] |

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
| **400** | Returned if the request is invalid. |  -  |
| **403** | Returned if the request is not authenticated as the app that provided the field. |  -  |
| **404** | Returned if the field is not found. |  -  |

<a name="updateValues"></a>
# **updateValues**
> Object updateValues(multipleCustomFieldValuesUpdateDetails).generateChangelog(generateChangelog).execute();

Update custom fields

Updates the value of one or more custom fields on one or more issues. Combinations of custom field and issue should be unique within the request.  Apps can only perform this operation on [custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/) and [custom field types](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/) declared in their own manifests.  **[Permissions](https://dac-static.atlassian.com) required:** Only the app that owns the custom field or custom field type can update its values with this operation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueCustomFieldValuesAppsApi;
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
    List<MultipleCustomFieldValuesUpdate> updates = Arrays.asList();
    Boolean generateChangelog = true; // Whether to generate a changelog for this update.
    try {
      Object result = client
              .issueCustomFieldValuesApps
              .updateValues()
              .updates(updates)
              .generateChangelog(generateChangelog)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldValuesAppsApi#updateValues");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .issueCustomFieldValuesApps
              .updateValues()
              .updates(updates)
              .generateChangelog(generateChangelog)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueCustomFieldValuesAppsApi#updateValues");
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
| **multipleCustomFieldValuesUpdateDetails** | [**MultipleCustomFieldValuesUpdateDetails**](MultipleCustomFieldValuesUpdateDetails.md)|  | |
| **generateChangelog** | **Boolean**| Whether to generate a changelog for this update. | [optional] [default to true] |

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
| **400** | Returned if the request is invalid. |  -  |
| **403** | Returned if the request is not authenticated as the app that provided all the fields. |  -  |
| **404** | Returned if any field is not found. |  -  |

