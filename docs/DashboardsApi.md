# DashboardsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGadgetToDashboard**](DashboardsApi.md#addGadgetToDashboard) | **POST** /rest/api/3/dashboard/{dashboardId}/gadget | Add gadget to dashboard |
| [**copyDashboard**](DashboardsApi.md#copyDashboard) | **POST** /rest/api/3/dashboard/{id}/copy | Copy dashboard |
| [**createDashboard**](DashboardsApi.md#createDashboard) | **POST** /rest/api/3/dashboard | Create dashboard |
| [**deleteItemProperty**](DashboardsApi.md#deleteItemProperty) | **DELETE** /rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey} | Delete dashboard item property |
| [**editBulkDashboards**](DashboardsApi.md#editBulkDashboards) | **PUT** /rest/api/3/dashboard/bulk/edit | Bulk edit dashboards |
| [**getAll**](DashboardsApi.md#getAll) | **GET** /rest/api/3/dashboard | Get all dashboards |
| [**getById**](DashboardsApi.md#getById) | **GET** /rest/api/3/dashboard/{id} | Get dashboard |
| [**getDashboardItemPropertyKeys**](DashboardsApi.md#getDashboardItemPropertyKeys) | **GET** /rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties | Get dashboard item property keys |
| [**getItemProperty**](DashboardsApi.md#getItemProperty) | **GET** /rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey} | Get dashboard item property |
| [**listAvailableGadgets**](DashboardsApi.md#listAvailableGadgets) | **GET** /rest/api/3/dashboard/gadgets | Get available gadgets |
| [**listGadgets**](DashboardsApi.md#listGadgets) | **GET** /rest/api/3/dashboard/{dashboardId}/gadget | Get gadgets |
| [**removeById**](DashboardsApi.md#removeById) | **DELETE** /rest/api/3/dashboard/{id} | Delete dashboard |
| [**removeGadgetFromDashboard**](DashboardsApi.md#removeGadgetFromDashboard) | **DELETE** /rest/api/3/dashboard/{dashboardId}/gadget/{gadgetId} | Remove gadget from dashboard |
| [**search**](DashboardsApi.md#search) | **GET** /rest/api/3/dashboard/search | Search for dashboards |
| [**setItemProperty**](DashboardsApi.md#setItemProperty) | **PUT** /rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey} | Set dashboard item property |
| [**updateDetails**](DashboardsApi.md#updateDetails) | **PUT** /rest/api/3/dashboard/{id} | Update dashboard |
| [**updateGadgetOnDashboard**](DashboardsApi.md#updateGadgetOnDashboard) | **PUT** /rest/api/3/dashboard/{dashboardId}/gadget/{gadgetId} | Update gadget on dashboard |


<a name="addGadgetToDashboard"></a>
# **addGadgetToDashboard**
> DashboardGadget addGadgetToDashboard(dashboardId, dashboardGadgetSettings).execute();

Add gadget to dashboard

Adds a gadget to a dashboard.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    Long dashboardId = 56L; // The ID of the dashboard.
    String title = "title_example"; // The title of the gadget.
    String color = "color_example"; // The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.
    Boolean ignoreUriAndModuleKeyValidation = true; // Whether to ignore the validation of module key and URI. For example, when a gadget is created that is a part of an application that isn't installed.
    String moduleKey = "moduleKey_example"; // The module key of the gadget type. Can't be provided with `uri`.
    DashboardGadgetPosition position = new DashboardGadgetPosition(); // The position of the gadget. When the gadget is placed into the position, other gadgets in the same column are moved down to accommodate it.
    String uri = "uri_example"; // The URI of the gadget type. Can't be provided with `moduleKey`.
    try {
      DashboardGadget result = client
              .dashboards
              .addGadgetToDashboard(dashboardId)
              .title(title)
              .color(color)
              .ignoreUriAndModuleKeyValidation(ignoreUriAndModuleKeyValidation)
              .moduleKey(moduleKey)
              .position(position)
              .uri(uri)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getColor());
      System.out.println(result.getId());
      System.out.println(result.getModuleKey());
      System.out.println(result.getPosition());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#addGadgetToDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DashboardGadget> response = client
              .dashboards
              .addGadgetToDashboard(dashboardId)
              .title(title)
              .color(color)
              .ignoreUriAndModuleKeyValidation(ignoreUriAndModuleKeyValidation)
              .moduleKey(moduleKey)
              .position(position)
              .uri(uri)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#addGadgetToDashboard");
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
| **dashboardId** | **Long**| The ID of the dashboard. | |
| **dashboardGadgetSettings** | [**DashboardGadgetSettings**](DashboardGadgetSettings.md)|  | |

### Return type

[**DashboardGadget**](DashboardGadget.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="copyDashboard"></a>
# **copyDashboard**
> Dashboard copyDashboard(id, dashboardDetails).execute();

Copy dashboard

Copies a dashboard. Any values provided in the &#x60;dashboard&#x60; parameter replace those in the copied dashboard.  **[Permissions](https://dac-static.atlassian.com) required:** None  The dashboard to be copied must be owned by or shared with the user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    List<SharePermission> editPermissions = Arrays.asList(); // The edit permissions for the dashboard.
    String name = "name_example"; // The name of the dashboard.
    List<SharePermission> sharePermissions = Arrays.asList(); // The share permissions for the dashboard.
    String id = "id_example";
    String description = "description_example"; // The description of the dashboard.
    try {
      Dashboard result = client
              .dashboards
              .copyDashboard(editPermissions, name, sharePermissions, id)
              .description(description)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAutomaticRefreshMs());
      System.out.println(result.getEditPermissions());
      System.out.println(result.getId());
      System.out.println(result.getIsFavourite());
      System.out.println(result.getIsWritable());
      System.out.println(result.getName());
      System.out.println(result.getOwner());
      System.out.println(result.getPopularity());
      System.out.println(result.getRank());
      System.out.println(result.getSelf());
      System.out.println(result.getSharePermissions());
      System.out.println(result.getSystemDashboard());
      System.out.println(result.getView());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#copyDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dashboard> response = client
              .dashboards
              .copyDashboard(editPermissions, name, sharePermissions, id)
              .description(description)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#copyDashboard");
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
| **id** | **String**|  | |
| **dashboardDetails** | [**DashboardDetails**](DashboardDetails.md)| Dashboard details. | |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="createDashboard"></a>
# **createDashboard**
> Dashboard createDashboard(dashboardDetails).execute();

Create dashboard

Creates a dashboard.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    List<SharePermission> editPermissions = Arrays.asList(); // The edit permissions for the dashboard.
    String name = "name_example"; // The name of the dashboard.
    List<SharePermission> sharePermissions = Arrays.asList(); // The share permissions for the dashboard.
    String description = "description_example"; // The description of the dashboard.
    try {
      Dashboard result = client
              .dashboards
              .createDashboard(editPermissions, name, sharePermissions)
              .description(description)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAutomaticRefreshMs());
      System.out.println(result.getEditPermissions());
      System.out.println(result.getId());
      System.out.println(result.getIsFavourite());
      System.out.println(result.getIsWritable());
      System.out.println(result.getName());
      System.out.println(result.getOwner());
      System.out.println(result.getPopularity());
      System.out.println(result.getRank());
      System.out.println(result.getSelf());
      System.out.println(result.getSharePermissions());
      System.out.println(result.getSystemDashboard());
      System.out.println(result.getView());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#createDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dashboard> response = client
              .dashboards
              .createDashboard(editPermissions, name, sharePermissions)
              .description(description)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#createDashboard");
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
| **dashboardDetails** | [**DashboardDetails**](DashboardDetails.md)| Dashboard details. | |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="deleteItemProperty"></a>
# **deleteItemProperty**
> Object deleteItemProperty(dashboardId, itemId, propertyKey).execute();

Delete dashboard item property

Deletes a dashboard item property.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    String dashboardId = "dashboardId_example"; // The ID of the dashboard.
    String itemId = "itemId_example"; // The ID of the dashboard item.
    String propertyKey = "propertyKey_example"; // The key of the dashboard item property.
    try {
      Object result = client
              .dashboards
              .deleteItemProperty(dashboardId, itemId, propertyKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#deleteItemProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .dashboards
              .deleteItemProperty(dashboardId, itemId, propertyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#deleteItemProperty");
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
| **dashboardId** | **String**| The ID of the dashboard. | |
| **itemId** | **String**| The ID of the dashboard item. | |
| **propertyKey** | **String**| The key of the dashboard item property. | |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the dashboard item property is deleted. |  -  |

<a name="editBulkDashboards"></a>
# **editBulkDashboards**
> BulkEditShareableEntityResponse editBulkDashboards(bulkEditShareableEntityRequest).execute();

Bulk edit dashboards

Bulk edit dashboards. Maximum number of dashboards to be edited at the same time is 100.  **[Permissions](https://dac-static.atlassian.com) required:** None  The dashboards to be updated must be owned by the user, or the user must be an administrator.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    String action = "changeOwner"; // Allowed action for bulk edit shareable entity
    Set<Long> entityIds = Arrays.asList(); // The id list of shareable entities to be changed.
    BulkChangeOwnerDetails changeOwnerDetails = new BulkChangeOwnerDetails(); // The details of change owner action.
    Boolean extendAdminPermissions = true; // Whether the actions are executed by users with Administer Jira global permission.
    PermissionDetails permissionDetails = new PermissionDetails(); // The permission details to be changed.
    try {
      BulkEditShareableEntityResponse result = client
              .dashboards
              .editBulkDashboards(action, entityIds)
              .changeOwnerDetails(changeOwnerDetails)
              .extendAdminPermissions(extendAdminPermissions)
              .permissionDetails(permissionDetails)
              .execute();
      System.out.println(result);
      System.out.println(result.getAction());
      System.out.println(result.getEntityErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#editBulkDashboards");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BulkEditShareableEntityResponse> response = client
              .dashboards
              .editBulkDashboards(action, entityIds)
              .changeOwnerDetails(changeOwnerDetails)
              .extendAdminPermissions(extendAdminPermissions)
              .permissionDetails(permissionDetails)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#editBulkDashboards");
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
| **bulkEditShareableEntityRequest** | [**BulkEditShareableEntityRequest**](BulkEditShareableEntityRequest.md)| The details of dashboards being updated in bulk. | |

### Return type

[**BulkEditShareableEntityResponse**](BulkEditShareableEntityResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="getAll"></a>
# **getAll**
> PageOfDashboards getAll().filter(filter).startAt(startAt).maxResults(maxResults).execute();

Get all dashboards

Returns a list of dashboards owned by or shared with the user. The list may be filtered to include only favorite or owned dashboards.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    String filter = "my"; // The filter applied to the list of dashboards. Valid values are:   *  `favourite` Returns dashboards the user has marked as favorite.  *  `my` Returns dashboards owned by the user.
    Integer startAt = 0; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 20; // The maximum number of items to return per page.
    try {
      PageOfDashboards result = client
              .dashboards
              .getAll()
              .filter(filter)
              .startAt(startAt)
              .maxResults(maxResults)
              .execute();
      System.out.println(result);
      System.out.println(result.getDashboards());
      System.out.println(result.getMaxResults());
      System.out.println(result.getNext());
      System.out.println(result.getPrev());
      System.out.println(result.getStartAt());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageOfDashboards> response = client
              .dashboards
              .getAll()
              .filter(filter)
              .startAt(startAt)
              .maxResults(maxResults)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getAll");
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
| **filter** | **String**| The filter applied to the list of dashboards. Valid values are:   *  &#x60;favourite&#x60; Returns dashboards the user has marked as favorite.  *  &#x60;my&#x60; Returns dashboards owned by the user. | [optional] [enum: my, favourite] |
| **startAt** | **Integer**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 20] |

### Return type

[**PageOfDashboards**](PageOfDashboards.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="getById"></a>
# **getById**
> Dashboard getById(id).execute();

Get dashboard

Returns a dashboard.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.  However, to get a dashboard, the dashboard must be shared with the user or the user must own it. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    String id = "id_example"; // The ID of the dashboard.
    try {
      Dashboard result = client
              .dashboards
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAutomaticRefreshMs());
      System.out.println(result.getEditPermissions());
      System.out.println(result.getId());
      System.out.println(result.getIsFavourite());
      System.out.println(result.getIsWritable());
      System.out.println(result.getName());
      System.out.println(result.getOwner());
      System.out.println(result.getPopularity());
      System.out.println(result.getRank());
      System.out.println(result.getSelf());
      System.out.println(result.getSharePermissions());
      System.out.println(result.getSystemDashboard());
      System.out.println(result.getView());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dashboard> response = client
              .dashboards
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getById");
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
| **id** | **String**| The ID of the dashboard. | |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **404** | Returned if the dashboard is not found or the dashboard is not owned by or shared with the user. |  -  |

<a name="getDashboardItemPropertyKeys"></a>
# **getDashboardItemPropertyKeys**
> PropertyKeys getDashboardItemPropertyKeys(dashboardId, itemId).execute();

Get dashboard item property keys

Returns the keys of all properties for a dashboard item.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** The user must be the owner of the dashboard or have the dashboard shared with them. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users, and is accessible to anonymous users when Jira\\\\u2019s anonymous access is permitted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    String dashboardId = "dashboardId_example"; // The ID of the dashboard.
    String itemId = "itemId_example"; // The ID of the dashboard item.
    try {
      PropertyKeys result = client
              .dashboards
              .getDashboardItemPropertyKeys(dashboardId, itemId)
              .execute();
      System.out.println(result);
      System.out.println(result.getKeys());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getDashboardItemPropertyKeys");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PropertyKeys> response = client
              .dashboards
              .getDashboardItemPropertyKeys(dashboardId, itemId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getDashboardItemPropertyKeys");
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
| **dashboardId** | **String**| The ID of the dashboard. | |
| **itemId** | **String**| The ID of the dashboard item. | |

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

<a name="getItemProperty"></a>
# **getItemProperty**
> EntityProperty getItemProperty(dashboardId, itemId, propertyKey).execute();

Get dashboard item property

Returns the key and value of a dashboard item property.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item&#39;s content or configuration details. For more information on working with dashboard items, see [Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** The user must be the owner of the dashboard or have the dashboard shared with them. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users, and is accessible to anonymous users when Jira\\\\u2019s anonymous access is permitted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    String dashboardId = "dashboardId_example"; // The ID of the dashboard.
    String itemId = "itemId_example"; // The ID of the dashboard item.
    String propertyKey = "propertyKey_example"; // The key of the dashboard item property.
    try {
      EntityProperty result = client
              .dashboards
              .getItemProperty(dashboardId, itemId, propertyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getKey());
      System.out.println(result.getValue());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getItemProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EntityProperty> response = client
              .dashboards
              .getItemProperty(dashboardId, itemId, propertyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getItemProperty");
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
| **dashboardId** | **String**| The ID of the dashboard. | |
| **itemId** | **String**| The ID of the dashboard item. | |
| **propertyKey** | **String**| The key of the dashboard item property. | |

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

<a name="listAvailableGadgets"></a>
# **listAvailableGadgets**
> AvailableDashboardGadgetsResponse listAvailableGadgets().execute();

Get available gadgets

Gets a list of all available gadgets that can be added to all dashboards.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
      AvailableDashboardGadgetsResponse result = client
              .dashboards
              .listAvailableGadgets()
              .execute();
      System.out.println(result);
      System.out.println(result.getGadgets());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#listAvailableGadgets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AvailableDashboardGadgetsResponse> response = client
              .dashboards
              .listAvailableGadgets()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#listAvailableGadgets");
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

[**AvailableDashboardGadgetsResponse**](AvailableDashboardGadgetsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="listGadgets"></a>
# **listGadgets**
> DashboardGadgetResponse listGadgets(dashboardId).moduleKey(moduleKey).uri(uri).gadgetId(gadgetId).execute();

Get gadgets

Returns a list of dashboard gadgets on a dashboard.  This operation returns:   *  Gadgets from a list of IDs, when &#x60;id&#x60; is set.  *  Gadgets with a module key, when &#x60;moduleKey&#x60; is set.  *  Gadgets from a list of URIs, when &#x60;uri&#x60; is set.  *  All gadgets, when no other parameters are set.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    Long dashboardId = 56L; // The ID of the dashboard.
    List<String> moduleKey = Arrays.asList(""""); // The list of gadgets module keys. To include multiple module keys, separate module keys with ampersand: `moduleKey=key:one&moduleKey=key:two`.
    List<String> uri = Arrays.asList(""""); // The list of gadgets URIs. To include multiple URIs, separate URIs with ampersand: `uri=/rest/example/uri/1&uri=/rest/example/uri/2`.
    List<Long> gadgetId = Arrays.asList(); // The list of gadgets IDs. To include multiple IDs, separate IDs with ampersand: `gadgetId=10000&gadgetId=10001`.
    try {
      DashboardGadgetResponse result = client
              .dashboards
              .listGadgets(dashboardId)
              .moduleKey(moduleKey)
              .uri(uri)
              .gadgetId(gadgetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getGadgets());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#listGadgets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DashboardGadgetResponse> response = client
              .dashboards
              .listGadgets(dashboardId)
              .moduleKey(moduleKey)
              .uri(uri)
              .gadgetId(gadgetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#listGadgets");
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
| **dashboardId** | **Long**| The ID of the dashboard. | |
| **moduleKey** | [**List&lt;String&gt;**](String.md)| The list of gadgets module keys. To include multiple module keys, separate module keys with ampersand: &#x60;moduleKey&#x3D;key:one&amp;moduleKey&#x3D;key:two&#x60;. | [optional] |
| **uri** | [**List&lt;String&gt;**](String.md)| The list of gadgets URIs. To include multiple URIs, separate URIs with ampersand: &#x60;uri&#x3D;/rest/example/uri/1&amp;uri&#x3D;/rest/example/uri/2&#x60;. | [optional] |
| **gadgetId** | [**List&lt;Long&gt;**](Long.md)| The list of gadgets IDs. To include multiple IDs, separate IDs with ampersand: &#x60;gadgetId&#x3D;10000&amp;gadgetId&#x3D;10001&#x60;. | [optional] |

### Return type

[**DashboardGadgetResponse**](DashboardGadgetResponse.md)

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

<a name="removeById"></a>
# **removeById**
> removeById(id).execute();

Delete dashboard

Deletes a dashboard.  **[Permissions](https://dac-static.atlassian.com) required:** None  The dashboard to be deleted must be owned by the user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    String id = "id_example"; // The ID of the dashboard.
    try {
      client
              .dashboards
              .removeById(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dashboards
              .removeById(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#removeById");
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
| **id** | **String**| The ID of the dashboard. | |

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
| **204** | Returned if the dashboard is deleted. |  -  |

<a name="removeGadgetFromDashboard"></a>
# **removeGadgetFromDashboard**
> Object removeGadgetFromDashboard(dashboardId, gadgetId).execute();

Remove gadget from dashboard

Removes a dashboard gadget from a dashboard.  When a gadget is removed from a dashboard, other gadgets in the same column are moved up to fill the emptied position.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    Long dashboardId = 56L; // The ID of the dashboard.
    Long gadgetId = 56L; // The ID of the gadget.
    try {
      Object result = client
              .dashboards
              .removeGadgetFromDashboard(dashboardId, gadgetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#removeGadgetFromDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .dashboards
              .removeGadgetFromDashboard(dashboardId, gadgetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#removeGadgetFromDashboard");
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
| **dashboardId** | **Long**| The ID of the dashboard. | |
| **gadgetId** | **Long**| The ID of the gadget. | |

### Return type

**Object**

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

<a name="search"></a>
# **search**
> PageBeanDashboard search().dashboardName(dashboardName).accountId(accountId).owner(owner).groupname(groupname).groupId(groupId).projectId(projectId).orderBy(orderBy).startAt(startAt).maxResults(maxResults).status(status).expand(expand).execute();

Search for dashboards

Returns a [paginated](https://dac-static.atlassian.com) list of dashboards. This operation is similar to [Get dashboards](https://dac-static.atlassian.com) except that the results can be refined to include dashboards that have specific attributes. For example, dashboards with a particular name. When multiple attributes are specified only filters matching all attributes are returned.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** The following dashboards that match the query parameters are returned:   *  Dashboards owned by the user. Not returned for anonymous users.  *  Dashboards shared with a group that the user is a member of. Not returned for anonymous users.  *  Dashboards shared with a private project that the user can browse. Not returned for anonymous users.  *  Dashboards shared with a public project.  *  Dashboards shared with the public.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    String dashboardName = "dashboardName_example"; // String used to perform a case-insensitive partial match with `name`.
    String accountId = "accountId_example"; // User account ID used to return dashboards with the matching `owner.accountId`. This parameter cannot be used with the `owner` parameter.
    String owner = "owner_example"; // This parameter is deprecated because of privacy changes. Use `accountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return dashboards with the matching `owner.name`. This parameter cannot be used with the `accountId` parameter.
    String groupname = "groupname_example"; // As a group's name can change, use of `groupId` is recommended. Group name used to return dashboards that are shared with a group that matches `sharePermissions.group.name`. This parameter cannot be used with the `groupId` parameter.
    String groupId = "groupId_example"; // Group ID used to return dashboards that are shared with a group that matches `sharePermissions.group.groupId`. This parameter cannot be used with the `groupname` parameter.
    Long projectId = 56L; // Project ID used to returns dashboards that are shared with a project that matches `sharePermissions.project.id`.
    String orderBy = "description"; // [Order](https://dac-static.atlassian.com) the results by a field:   *  `description` Sorts by dashboard description. Note that this sort works independently of whether the expand to display the description field is in use.  *  `favourite_count` Sorts by dashboard popularity.  *  `id` Sorts by dashboard ID.  *  `is_favourite` Sorts by whether the dashboard is marked as a favorite.  *  `name` Sorts by dashboard name.  *  `owner` Sorts by dashboard owner name.
    Long startAt = 0L; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // The maximum number of items to return per page.
    String status = "active"; // The status to filter by. It may be active, archived or deleted.
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information about dashboard in the response. This parameter accepts a comma-separated list. Expand options include:   *  `description` Returns the description of the dashboard.  *  `owner` Returns the owner of the dashboard.  *  `viewUrl` Returns the URL that is used to view the dashboard.  *  `favourite` Returns `isFavourite`, an indicator of whether the user has set the dashboard as a favorite.  *  `favouritedCount` Returns `popularity`, a count of how many users have set this dashboard as a favorite.  *  `sharePermissions` Returns details of the share permissions defined for the dashboard.  *  `editPermissions` Returns details of the edit permissions defined for the dashboard.  *  `isWritable` Returns whether the current user has permission to edit the dashboard.
    try {
      PageBeanDashboard result = client
              .dashboards
              .search()
              .dashboardName(dashboardName)
              .accountId(accountId)
              .owner(owner)
              .groupname(groupname)
              .groupId(groupId)
              .projectId(projectId)
              .orderBy(orderBy)
              .startAt(startAt)
              .maxResults(maxResults)
              .status(status)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getIsLast());
      System.out.println(result.getMaxResults());
      System.out.println(result.getNextPage());
      System.out.println(result.getSelf());
      System.out.println(result.getStartAt());
      System.out.println(result.getTotal());
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#search");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBeanDashboard> response = client
              .dashboards
              .search()
              .dashboardName(dashboardName)
              .accountId(accountId)
              .owner(owner)
              .groupname(groupname)
              .groupId(groupId)
              .projectId(projectId)
              .orderBy(orderBy)
              .startAt(startAt)
              .maxResults(maxResults)
              .status(status)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#search");
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
| **dashboardName** | **String**| String used to perform a case-insensitive partial match with &#x60;name&#x60;. | [optional] |
| **accountId** | **String**| User account ID used to return dashboards with the matching &#x60;owner.accountId&#x60;. This parameter cannot be used with the &#x60;owner&#x60; parameter. | [optional] |
| **owner** | **String**| This parameter is deprecated because of privacy changes. Use &#x60;accountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return dashboards with the matching &#x60;owner.name&#x60;. This parameter cannot be used with the &#x60;accountId&#x60; parameter. | [optional] |
| **groupname** | **String**| As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended. Group name used to return dashboards that are shared with a group that matches &#x60;sharePermissions.group.name&#x60;. This parameter cannot be used with the &#x60;groupId&#x60; parameter. | [optional] |
| **groupId** | **String**| Group ID used to return dashboards that are shared with a group that matches &#x60;sharePermissions.group.groupId&#x60;. This parameter cannot be used with the &#x60;groupname&#x60; parameter. | [optional] |
| **projectId** | **Long**| Project ID used to returns dashboards that are shared with a project that matches &#x60;sharePermissions.project.id&#x60;. | [optional] |
| **orderBy** | **String**| [Order](https://dac-static.atlassian.com) the results by a field:   *  &#x60;description&#x60; Sorts by dashboard description. Note that this sort works independently of whether the expand to display the description field is in use.  *  &#x60;favourite_count&#x60; Sorts by dashboard popularity.  *  &#x60;id&#x60; Sorts by dashboard ID.  *  &#x60;is_favourite&#x60; Sorts by whether the dashboard is marked as a favorite.  *  &#x60;name&#x60; Sorts by dashboard name.  *  &#x60;owner&#x60; Sorts by dashboard owner name. | [optional] [default to name] [enum: description, -description, +description, favorite_count, -favorite_count, +favorite_count, id, -id, +id, is_favorite, -is_favorite, +is_favorite, name, -name, +name, owner, -owner, +owner] |
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |
| **status** | **String**| The status to filter by. It may be active, archived or deleted. | [optional] [default to active] [enum: active, archived, deleted] |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about dashboard in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;description&#x60; Returns the description of the dashboard.  *  &#x60;owner&#x60; Returns the owner of the dashboard.  *  &#x60;viewUrl&#x60; Returns the URL that is used to view the dashboard.  *  &#x60;favourite&#x60; Returns &#x60;isFavourite&#x60;, an indicator of whether the user has set the dashboard as a favorite.  *  &#x60;favouritedCount&#x60; Returns &#x60;popularity&#x60;, a count of how many users have set this dashboard as a favorite.  *  &#x60;sharePermissions&#x60; Returns details of the share permissions defined for the dashboard.  *  &#x60;editPermissions&#x60; Returns details of the edit permissions defined for the dashboard.  *  &#x60;isWritable&#x60; Returns whether the current user has permission to edit the dashboard. | [optional] |

### Return type

[**PageBeanDashboard**](PageBeanDashboard.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="setItemProperty"></a>
# **setItemProperty**
> Object setItemProperty(dashboardId, itemId, propertyKey, body).execute();

Set dashboard item property

Sets the value of a dashboard item property. Use this resource in apps to store custom data against a dashboard item.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item&#39;s content or configuration details. For more information on working with dashboard items, see [Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    String dashboardId = "dashboardId_example"; // The ID of the dashboard.
    String itemId = "itemId_example"; // The ID of the dashboard item.
    String propertyKey = "propertyKey_example"; // The key of the dashboard item property. The maximum length is 255 characters. For dashboard items with a spec URI and no complete module key, if the provided propertyKey is equal to \"config\", the request body's JSON must be an object with all keys and values as strings.
    try {
      Object result = client
              .dashboards
              .setItemProperty(dashboardId, itemId, propertyKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#setItemProperty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .dashboards
              .setItemProperty(dashboardId, itemId, propertyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#setItemProperty");
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
| **dashboardId** | **String**| The ID of the dashboard. | |
| **itemId** | **String**| The ID of the dashboard item. | |
| **propertyKey** | **String**| The key of the dashboard item property. The maximum length is 255 characters. For dashboard items with a spec URI and no complete module key, if the provided propertyKey is equal to \&quot;config\&quot;, the request body&#39;s JSON must be an object with all keys and values as strings. | |
| **body** | **Object**| The value of the property. The value has to be a valid, non-empty [JSON](https://tools.ietf.org/html/rfc4627) value. The maximum length of the property value is 32768 bytes. | |

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
| **200** | Returned if the dashboard item property is updated. |  -  |
| **201** | Returned if the dashboard item property is created. |  -  |

<a name="updateDetails"></a>
# **updateDetails**
> Dashboard updateDetails(id, dashboardDetails).execute();

Update dashboard

Updates a dashboard, replacing all the dashboard details with those provided.  **[Permissions](https://dac-static.atlassian.com) required:** None  The dashboard to be updated must be owned by the user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    List<SharePermission> editPermissions = Arrays.asList(); // The edit permissions for the dashboard.
    String name = "name_example"; // The name of the dashboard.
    List<SharePermission> sharePermissions = Arrays.asList(); // The share permissions for the dashboard.
    String id = "id_example"; // The ID of the dashboard to update.
    String description = "description_example"; // The description of the dashboard.
    try {
      Dashboard result = client
              .dashboards
              .updateDetails(editPermissions, name, sharePermissions, id)
              .description(description)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAutomaticRefreshMs());
      System.out.println(result.getEditPermissions());
      System.out.println(result.getId());
      System.out.println(result.getIsFavourite());
      System.out.println(result.getIsWritable());
      System.out.println(result.getName());
      System.out.println(result.getOwner());
      System.out.println(result.getPopularity());
      System.out.println(result.getRank());
      System.out.println(result.getSelf());
      System.out.println(result.getSharePermissions());
      System.out.println(result.getSystemDashboard());
      System.out.println(result.getView());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#updateDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dashboard> response = client
              .dashboards
              .updateDetails(editPermissions, name, sharePermissions, id)
              .description(description)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#updateDetails");
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
| **id** | **String**| The ID of the dashboard to update. | |
| **dashboardDetails** | [**DashboardDetails**](DashboardDetails.md)| Replacement dashboard details. | |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

<a name="updateGadgetOnDashboard"></a>
# **updateGadgetOnDashboard**
> Object updateGadgetOnDashboard(dashboardId, gadgetId, dashboardGadgetUpdateRequest).execute();

Update gadget on dashboard

Changes the title, position, and color of the gadget on a dashboard.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DashboardsApi;
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
    Long dashboardId = 56L; // The ID of the dashboard.
    Long gadgetId = 56L; // The ID of the gadget.
    String title = "title_example"; // The title of the gadget.
    String color = "color_example"; // The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.
    DashboardGadgetPosition position = new DashboardGadgetPosition(); // The position of the gadget.
    try {
      Object result = client
              .dashboards
              .updateGadgetOnDashboard(dashboardId, gadgetId)
              .title(title)
              .color(color)
              .position(position)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#updateGadgetOnDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .dashboards
              .updateGadgetOnDashboard(dashboardId, gadgetId)
              .title(title)
              .color(color)
              .position(position)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#updateGadgetOnDashboard");
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
| **dashboardId** | **Long**| The ID of the dashboard. | |
| **gadgetId** | **Long**| The ID of the gadget. | |
| **dashboardGadgetUpdateRequest** | [**DashboardGadgetUpdateRequest**](DashboardGadgetUpdateRequest.md)|  | |

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
| **401** | Returned if the authentication credentials are incorrect. |  -  |

