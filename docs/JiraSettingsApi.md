# JiraSettingsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAdvancedSettings**](JiraSettingsApi.md#getAdvancedSettings) | **GET** /rest/api/3/application-properties/advanced-settings | Get advanced settings |
| [**getApplicationProperty**](JiraSettingsApi.md#getApplicationProperty) | **GET** /rest/api/3/application-properties | Get application property |
| [**getGlobalSettings**](JiraSettingsApi.md#getGlobalSettings) | **GET** /rest/api/3/configuration | Get global settings |
| [**setApplicationProperty**](JiraSettingsApi.md#setApplicationProperty) | **PUT** /rest/api/3/application-properties/{id} | Set application property |


<a name="getAdvancedSettings"></a>
# **getAdvancedSettings**
> List&lt;ApplicationProperty&gt; getAdvancedSettings().execute();

Get advanced settings

Returns the application properties that are accessible on the *Advanced Settings* page. To navigate to the *Advanced Settings* page in Jira, choose the Jira icon &gt; **Jira settings** &gt; **System**, **General Configuration** and then click **Advanced Settings** (in the upper right).  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JiraSettingsApi;
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
      List<ApplicationProperty> result = client
              .jiraSettings
              .getAdvancedSettings()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JiraSettingsApi#getAdvancedSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ApplicationProperty>> response = client
              .jiraSettings
              .getAdvancedSettings()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JiraSettingsApi#getAdvancedSettings");
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

[**List&lt;ApplicationProperty&gt;**](ApplicationProperty.md)

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
| **403** | Returned if the user is not an administrator. |  -  |

<a name="getApplicationProperty"></a>
# **getApplicationProperty**
> List&lt;ApplicationProperty&gt; getApplicationProperty().key(key).permissionLevel(permissionLevel).keyFilter(keyFilter).execute();

Get application property

Returns all application properties or an application property.  If you specify a value for the &#x60;key&#x60; parameter, then an application property is returned as an object (not in an array). Otherwise, an array of all editable application properties is returned. See [Set application property](https://dac-static.atlassian.com) for descriptions of editable properties.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JiraSettingsApi;
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
    String key = "key_example"; // The key of the application property.
    String permissionLevel = "permissionLevel_example"; // The permission level of all items being returned in the list.
    String keyFilter = "keyFilter_example"; // When a `key` isn't provided, this filters the list of results by the application property `key` using a regular expression. For example, using `jira.lf.*` will return all application properties with keys that start with *jira.lf.*.
    try {
      List<ApplicationProperty> result = client
              .jiraSettings
              .getApplicationProperty()
              .key(key)
              .permissionLevel(permissionLevel)
              .keyFilter(keyFilter)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JiraSettingsApi#getApplicationProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ApplicationProperty>> response = client
              .jiraSettings
              .getApplicationProperty()
              .key(key)
              .permissionLevel(permissionLevel)
              .keyFilter(keyFilter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JiraSettingsApi#getApplicationProperty");
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
| **key** | **String**| The key of the application property. | [optional] |
| **permissionLevel** | **String**| The permission level of all items being returned in the list. | [optional] |
| **keyFilter** | **String**| When a &#x60;key&#x60; isn&#39;t provided, this filters the list of results by the application property &#x60;key&#x60; using a regular expression. For example, using &#x60;jira.lf.*&#x60; will return all application properties with keys that start with *jira.lf.*. | [optional] |

### Return type

[**List&lt;ApplicationProperty&gt;**](ApplicationProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="getGlobalSettings"></a>
# **getGlobalSettings**
> ModelConfiguration getGlobalSettings().execute();

Get global settings

Returns the [global settings](https://confluence.atlassian.com/x/qYXKM) in Jira. These settings determine whether optional features (for example, subtasks, time tracking, and others) are enabled. If time tracking is enabled, this operation also returns the time tracking configuration.  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JiraSettingsApi;
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
      ModelConfiguration result = client
              .jiraSettings
              .getGlobalSettings()
              .execute();
      System.out.println(result);
      System.out.println(result.getAttachmentsEnabled());
      System.out.println(result.getIssueLinkingEnabled());
      System.out.println(result.getSubTasksEnabled());
      System.out.println(result.getTimeTrackingConfiguration());
      System.out.println(result.getTimeTrackingEnabled());
      System.out.println(result.getUnassignedIssuesAllowed());
      System.out.println(result.getVotingEnabled());
      System.out.println(result.getWatchingEnabled());
    } catch (ApiException e) {
      System.err.println("Exception when calling JiraSettingsApi#getGlobalSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelConfiguration> response = client
              .jiraSettings
              .getGlobalSettings()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JiraSettingsApi#getGlobalSettings");
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

[**ModelConfiguration**](ModelConfiguration.md)

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

<a name="setApplicationProperty"></a>
# **setApplicationProperty**
> ApplicationProperty setApplicationProperty(id, simpleApplicationPropertyBean).execute();

Set application property

Changes the value of an application property. For example, you can change the value of the &#x60;jira.clone.prefix&#x60; from its default value of *CLONE -* to *Clone -* if you prefer sentence case capitalization. Editable properties are described below along with their default values.  #### Advanced settings ####  The advanced settings below are also accessible in [Jira](https://confluence.atlassian.com/x/vYXKM).  | Key | Description | Default value |   | -- | -- | -- |   | &#x60;jira.clone.prefix&#x60; | The string of text prefixed to the title of a cloned issue. | &#x60;CLONE -&#x60; |   | &#x60;jira.date.picker.java.format&#x60; | The date format for the Java (server-side) generated dates. This must be the same as the &#x60;jira.date.picker.javascript.format&#x60; format setting. | &#x60;d/MMM/yy&#x60; |   | &#x60;jira.date.picker.javascript.format&#x60; | The date format for the JavaScript (client-side) generated dates. This must be the same as the &#x60;jira.date.picker.java.format&#x60; format setting. | &#x60;%e/%b/%y&#x60; |   | &#x60;jira.date.time.picker.java.format&#x60; | The date format for the Java (server-side) generated date times. This must be the same as the &#x60;jira.date.time.picker.javascript.format&#x60; format setting. | &#x60;dd/MMM/yy h:mm a&#x60; |   | &#x60;jira.date.time.picker.javascript.format&#x60; | The date format for the JavaScript (client-side) generated date times. This must be the same as the &#x60;jira.date.time.picker.java.format&#x60; format setting. | &#x60;%e/%b/%y %I:%M %p&#x60; |   | &#x60;jira.issue.actions.order&#x60; | The default order of actions (such as *Comments* or *Change history*) displayed on the issue view. | &#x60;asc&#x60; |   | &#x60;jira.view.issue.links.sort.order&#x60; | The sort order of the list of issue links on the issue view. | &#x60;type, status, priority&#x60; |   | &#x60;jira.comment.collapsing.minimum.hidden&#x60; | The minimum number of comments required for comment collapsing to occur. A value of &#x60;0&#x60; disables comment collapsing. | &#x60;4&#x60; |   | &#x60;jira.newsletter.tip.delay.days&#x60; | The number of days before a prompt to sign up to the Jira Insiders newsletter is shown. A value of &#x60;-1&#x60; disables this feature. | &#x60;7&#x60; |     #### Look and feel ####  The settings listed below adjust the [look and feel](https://confluence.atlassian.com/x/VwCLLg).  | Key | Description | Default value |   | -- | -- | -- |   | &#x60;jira.lf.date.time&#x60; | The [time format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | &#x60;h:mm a&#x60; |   | &#x60;jira.lf.date.day&#x60; | The [day format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | &#x60;EEEE h:mm a&#x60; |   | &#x60;jira.lf.date.complete&#x60; | The [date and time format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | &#x60;dd/MMM/yy h:mm a&#x60; |   | &#x60;jira.lf.date.dmy&#x60; | The [date format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | &#x60;dd/MMM/yy&#x60; |   | &#x60;jira.date.time.picker.use.iso8061&#x60; | When enabled, sets Monday as the first day of the week in the date picker, as specified by the ISO8601 standard. | &#x60;false&#x60; |   | &#x60;jira.lf.logo.url&#x60; | The URL of the logo image file. | &#x60;/images/icon-jira-logo.png&#x60; |   | &#x60;jira.lf.logo.show.application.title&#x60; | Controls the visibility of the application title on the sidebar. | &#x60;false&#x60; |   | &#x60;jira.lf.favicon.url&#x60; | The URL of the favicon. | &#x60;/favicon.ico&#x60; |   | &#x60;jira.lf.favicon.hires.url&#x60; | The URL of the high-resolution favicon. | &#x60;/images/64jira.png&#x60; |   | &#x60;jira.lf.navigation.bgcolour&#x60; | The background color of the sidebar. | &#x60;#0747A6&#x60; |   | &#x60;jira.lf.navigation.highlightcolour&#x60; | The color of the text and logo of the sidebar. | &#x60;#DEEBFF&#x60; |   | &#x60;jira.lf.hero.button.base.bg.colour&#x60; | The background color of the hero button. | &#x60;#3b7fc4&#x60; |   | &#x60;jira.title&#x60; | The text for the application title. The application title can also be set in *General settings*. | &#x60;Jira&#x60; |   | &#x60;jira.option.globalsharing&#x60; | Whether filters and dashboards can be shared with anyone signed into Jira. | &#x60;true&#x60; |   | &#x60;xflow.product.suggestions.enabled&#x60; | Whether to expose product suggestions for other Atlassian products within Jira. | &#x60;true&#x60; |     #### Other settings ####  | Key | Description | Default value |   | -- | -- | -- |   | &#x60;jira.issuenav.criteria.autoupdate&#x60; | Whether instant updates to search criteria is active. | &#x60;true&#x60; |     *Note: Be careful when changing [application properties and advanced settings](https://confluence.atlassian.com/x/vYXKM).*  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JiraSettingsApi;
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
    String id = "id_example"; // The key of the application property to update.
    String id = "id_example"; // The ID of the application property.
    String value = "value_example"; // The new value.
    try {
      ApplicationProperty result = client
              .jiraSettings
              .setApplicationProperty(id)
              .id(id)
              .value(value)
              .execute();
      System.out.println(result);
      System.out.println(result.getAllowedValues());
      System.out.println(result.getDefaultValue());
      System.out.println(result.getDesc());
      System.out.println(result.getExample());
      System.out.println(result.getId());
      System.out.println(result.getKey());
      System.out.println(result.getName());
      System.out.println(result.getType());
      System.out.println(result.getValue());
      System.out.println(result.getxKonfigOriginalExample());
    } catch (ApiException e) {
      System.err.println("Exception when calling JiraSettingsApi#setApplicationProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationProperty> response = client
              .jiraSettings
              .setApplicationProperty(id)
              .id(id)
              .value(value)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JiraSettingsApi#setApplicationProperty");
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
| **id** | **String**| The key of the application property to update. | |
| **simpleApplicationPropertyBean** | [**SimpleApplicationPropertyBean**](SimpleApplicationPropertyBean.md)|  | |

### Return type

[**ApplicationProperty**](ApplicationProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

