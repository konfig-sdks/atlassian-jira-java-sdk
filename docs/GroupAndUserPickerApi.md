# GroupAndUserPickerApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findMatchingUsersAndGroups**](GroupAndUserPickerApi.md#findMatchingUsersAndGroups) | **GET** /rest/api/3/groupuserpicker | Find users and groups |


<a name="findMatchingUsersAndGroups"></a>
# **findMatchingUsersAndGroups**
> FoundUsersAndGroups findMatchingUsersAndGroups(query).maxResults(maxResults).showAvatar(showAvatar).fieldId(fieldId).projectId(projectId).issueTypeId(issueTypeId).avatarSize(avatarSize).caseInsensitive(caseInsensitive).excludeConnectAddons(excludeConnectAddons).execute();

Find users and groups

Returns a list of users and groups matching a string. The string is used:   *  for users, to find a case-insensitive match with display name and e-mail address. Note that if a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required.  *  for groups, to find a case-sensitive match with group name.  For example, if the string *tin* is used, records with the display name *Tina*, email address *sarah@tinplatetraining.com*, and the group *accounting* would be returned.  Optionally, the search can be refined to:   *  the projects and issue types associated with a custom field, such as a user picker. The search can then be further refined to return only users and groups that have permission to view specific:           *  projects.      *  issue types.          If multiple projects or issue types are specified, they must be a subset of those enabled for the custom field or no results are returned. For example, if a field is enabled for projects A, B, and C then the search could be limited to projects B and C. However, if the search is limited to projects B and D, nothing is returned.  *  not return Connect app users and groups.  *  return groups that have a case-insensitive match with the query.  The primary use case for this resource is to populate a picker field suggestion list with users or groups. To this end, the returned object includes an &#x60;html&#x60; field for each list. This field highlights the matched query term in the item name with the HTML strong tag. Also, each list is wrapped in a response object that contains a header for use in a picker, specifically *Showing X of Y matching groups*.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/yodKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupAndUserPickerApi;
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
    String query = "query_example"; // The search string.
    Integer maxResults = 50; // The maximum number of items to return in each list.
    Boolean showAvatar = false; // Whether the user avatar should be returned. If an invalid value is provided, the default value is used.
    String fieldId = "fieldId_example"; // The custom field ID of the field this request is for.
    List<String> projectId = Arrays.asList(); // The ID of a project that returned users and groups must have permission to view. To include multiple projects, provide an ampersand-separated list. For example, `projectId=10000&projectId=10001`. This parameter is only used when `fieldId` is present.
    List<String> issueTypeId = Arrays.asList(); // The ID of an issue type that returned users and groups must have permission to view. To include multiple issue types, provide an ampersand-separated list. For example, `issueTypeId=10000&issueTypeId=10001`. Special values, such as `-1` (all standard issue types) and `-2` (all subtask issue types), are supported. This parameter is only used when `fieldId` is present.
    String avatarSize = "xsmall"; // The size of the avatar to return. If an invalid value is provided, the default value is used.
    Boolean caseInsensitive = false; // Whether the search for groups should be case insensitive.
    Boolean excludeConnectAddons = false; // Whether Connect app users and groups should be excluded from the search results. If an invalid value is provided, the default value is used.
    try {
      FoundUsersAndGroups result = client
              .groupAndUserPicker
              .findMatchingUsersAndGroups(query)
              .maxResults(maxResults)
              .showAvatar(showAvatar)
              .fieldId(fieldId)
              .projectId(projectId)
              .issueTypeId(issueTypeId)
              .avatarSize(avatarSize)
              .caseInsensitive(caseInsensitive)
              .excludeConnectAddons(excludeConnectAddons)
              .execute();
      System.out.println(result);
      System.out.println(result.getGroups());
      System.out.println(result.getUsers());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupAndUserPickerApi#findMatchingUsersAndGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FoundUsersAndGroups> response = client
              .groupAndUserPicker
              .findMatchingUsersAndGroups(query)
              .maxResults(maxResults)
              .showAvatar(showAvatar)
              .fieldId(fieldId)
              .projectId(projectId)
              .issueTypeId(issueTypeId)
              .avatarSize(avatarSize)
              .caseInsensitive(caseInsensitive)
              .excludeConnectAddons(excludeConnectAddons)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupAndUserPickerApi#findMatchingUsersAndGroups");
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
| **query** | **String**| The search string. | |
| **maxResults** | **Integer**| The maximum number of items to return in each list. | [optional] [default to 50] |
| **showAvatar** | **Boolean**| Whether the user avatar should be returned. If an invalid value is provided, the default value is used. | [optional] [default to false] |
| **fieldId** | **String**| The custom field ID of the field this request is for. | [optional] |
| **projectId** | [**List&lt;String&gt;**](String.md)| The ID of a project that returned users and groups must have permission to view. To include multiple projects, provide an ampersand-separated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. This parameter is only used when &#x60;fieldId&#x60; is present. | [optional] |
| **issueTypeId** | [**List&lt;String&gt;**](String.md)| The ID of an issue type that returned users and groups must have permission to view. To include multiple issue types, provide an ampersand-separated list. For example, &#x60;issueTypeId&#x3D;10000&amp;issueTypeId&#x3D;10001&#x60;. Special values, such as &#x60;-1&#x60; (all standard issue types) and &#x60;-2&#x60; (all subtask issue types), are supported. This parameter is only used when &#x60;fieldId&#x60; is present. | [optional] |
| **avatarSize** | **String**| The size of the avatar to return. If an invalid value is provided, the default value is used. | [optional] [default to xsmall] [enum: xsmall, xsmall@2x, xsmall@3x, small, small@2x, small@3x, medium, medium@2x, medium@3x, large, large@2x, large@3x, xlarge, xlarge@2x, xlarge@3x, xxlarge, xxlarge@2x, xxlarge@3x, xxxlarge, xxxlarge@2x, xxxlarge@3x] |
| **caseInsensitive** | **Boolean**| Whether the search for groups should be case insensitive. | [optional] [default to false] |
| **excludeConnectAddons** | **Boolean**| Whether Connect app users and groups should be excluded from the search results. If an invalid value is provided, the default value is used. | [optional] [default to false] |

### Return type

[**FoundUsersAndGroups**](FoundUsersAndGroups.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the query parameter is not provided. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **429** | Returned if the rate limit is exceeded. User search endpoints share a collective rate limit for the tenant, in addition to Jira&#39;s normal rate limiting you may receive a rate limit for user search. Please respect the Retry-After header. |  -  |

