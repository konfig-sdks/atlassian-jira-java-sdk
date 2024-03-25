# AuditRecordsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuditRecords**](AuditRecordsApi.md#getAuditRecords) | **GET** /rest/api/3/auditing/record | Get audit records |


<a name="getAuditRecords"></a>
# **getAuditRecords**
> AuditRecords getAuditRecords().offset(offset).limit(limit).filter(filter).from(from).to(to).execute();

Get audit records

Returns a list of audit records. The list can be filtered to include items:   *  where each item in &#x60;filter&#x60; has at least one match in any of these fields:           *  &#x60;summary&#x60;      *  &#x60;category&#x60;      *  &#x60;eventSource&#x60;      *  &#x60;objectItem.name&#x60; If the object is a user, account ID is available to filter.      *  &#x60;objectItem.parentName&#x60;      *  &#x60;objectItem.typeName&#x60;      *  &#x60;changedValues.changedFrom&#x60;      *  &#x60;changedValues.changedTo&#x60;      *  &#x60;remoteAddress&#x60;          For example, if &#x60;filter&#x60; contains *man ed*, an audit record containing &#x60;summary\&quot;: \&quot;User added to group\&quot;&#x60; and &#x60;\&quot;category\&quot;: \&quot;group management\&quot;&#x60; is returned.  *  created on or after a date and time.  *  created or or before a date and time.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuditRecordsApi;
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
    Integer offset = 0; // The number of records to skip before returning the first result.
    Integer limit = 1000; // The maximum number of results to return.
    String filter = "filter_example"; // The strings to match with audit field content, space separated.
    String from = "from_example"; // The date and time on or after which returned audit records must have been created. If `to` is provided `from` must be before `to` or no audit records are returned.
    String to = "to_example"; // The date and time on or before which returned audit results must have been created. If `from` is provided `to` must be after `from` or no audit records are returned.
    try {
      AuditRecords result = client
              .auditRecords
              .getAuditRecords()
              .offset(offset)
              .limit(limit)
              .filter(filter)
              .from(from)
              .to(to)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getOffset());
      System.out.println(result.getRecords());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditRecordsApi#getAuditRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuditRecords> response = client
              .auditRecords
              .getAuditRecords()
              .offset(offset)
              .limit(limit)
              .filter(filter)
              .from(from)
              .to(to)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditRecordsApi#getAuditRecords");
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
| **offset** | **Integer**| The number of records to skip before returning the first result. | [optional] [default to 0] |
| **limit** | **Integer**| The maximum number of results to return. | [optional] [default to 1000] |
| **filter** | **String**| The strings to match with audit field content, space separated. | [optional] |
| **from** | **String**| The date and time on or after which returned audit records must have been created. If &#x60;to&#x60; is provided &#x60;from&#x60; must be before &#x60;to&#x60; or no audit records are returned. | [optional] |
| **to** | **String**| The date and time on or before which returned audit results must have been created. If &#x60;from&#x60; is provided &#x60;to&#x60; must be after &#x60;from&#x60; or no audit records are returned. | [optional] |

### Return type

[**AuditRecords**](AuditRecords.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

