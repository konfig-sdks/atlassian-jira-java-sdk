# JqlApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**convertUserIdentifiersToAccountIdsInJqlQueries**](JqlApi.md#convertUserIdentifiersToAccountIdsInJqlQueries) | **POST** /rest/api/3/jql/pdcleaner | Convert user identifiers to account IDs in JQL queries |
| [**getFieldAutoCompleteForQueryString**](JqlApi.md#getFieldAutoCompleteForQueryString) | **GET** /rest/api/3/jql/autocompletedata/suggestions | Get field auto complete suggestions |
| [**getFieldReferenceData**](JqlApi.md#getFieldReferenceData) | **GET** /rest/api/3/jql/autocompletedata | Get field reference data (GET) |
| [**getFieldReferenceDataPost**](JqlApi.md#getFieldReferenceDataPost) | **POST** /rest/api/3/jql/autocompletedata | Get field reference data (POST) |
| [**parseAndValidate**](JqlApi.md#parseAndValidate) | **POST** /rest/api/3/jql/parse | Parse JQL query |
| [**sanitizeJqlQueries**](JqlApi.md#sanitizeJqlQueries) | **POST** /rest/api/3/jql/sanitize | Sanitize JQL queries |


<a name="convertUserIdentifiersToAccountIdsInJqlQueries"></a>
# **convertUserIdentifiersToAccountIdsInJqlQueries**
> ConvertedJQLQueries convertUserIdentifiersToAccountIdsInJqlQueries(jqLPersonalDataMigrationRequest).execute();

Convert user identifiers to account IDs in JQL queries

Converts one or more JQL queries with user identifiers (username or user key) to equivalent JQL queries with account IDs.  You may wish to use this operation if your system stores JQL queries and you want to make them GDPR-compliant. For more information about GDPR-related changes, see the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/).  **[Permissions](https://dac-static.atlassian.com) required:** Permission to access Jira.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JqlApi;
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
    List<String> queryStrings = Arrays.asList(); // A list of queries with user identifiers. Maximum of 100 queries.
    try {
      ConvertedJQLQueries result = client
              .jql
              .convertUserIdentifiersToAccountIdsInJqlQueries()
              .queryStrings(queryStrings)
              .execute();
      System.out.println(result);
      System.out.println(result.getQueriesWithUnknownUsers());
      System.out.println(result.getQueryStrings());
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlApi#convertUserIdentifiersToAccountIdsInJqlQueries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConvertedJQLQueries> response = client
              .jql
              .convertUserIdentifiersToAccountIdsInJqlQueries()
              .queryStrings(queryStrings)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlApi#convertUserIdentifiersToAccountIdsInJqlQueries");
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
| **jqLPersonalDataMigrationRequest** | [**JQLPersonalDataMigrationRequest**](JQLPersonalDataMigrationRequest.md)|  | |

### Return type

[**ConvertedJQLQueries**](ConvertedJQLQueries.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. Note that the JQL queries are returned in the same order that they were passed. |  -  |

<a name="getFieldAutoCompleteForQueryString"></a>
# **getFieldAutoCompleteForQueryString**
> AutoCompleteSuggestions getFieldAutoCompleteForQueryString().fieldName(fieldName).fieldValue(fieldValue).predicateName(predicateName).predicateValue(predicateValue).execute();

Get field auto complete suggestions

Returns the JQL search auto complete suggestions for a field.  Suggestions can be obtained by providing:   *  &#x60;fieldName&#x60; to get a list of all values for the field.  *  &#x60;fieldName&#x60; and &#x60;fieldValue&#x60; to get a list of values containing the text in &#x60;fieldValue&#x60;.  *  &#x60;fieldName&#x60; and &#x60;predicateName&#x60; to get a list of all predicate values for the field.  *  &#x60;fieldName&#x60;, &#x60;predicateName&#x60;, and &#x60;predicateValue&#x60; to get a list of predicate values containing the text in &#x60;predicateValue&#x60;.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JqlApi;
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
    String fieldName = "reporter"; // The name of the field.
    String fieldValue = "fieldValue_example"; // The partial field item name entered by the user.
    String predicateName = "predicateName_example"; // The name of the [CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*.
    String predicateValue = "predicateValue_example"; // The partial predicate item name entered by the user.
    try {
      AutoCompleteSuggestions result = client
              .jql
              .getFieldAutoCompleteForQueryString()
              .fieldName(fieldName)
              .fieldValue(fieldValue)
              .predicateName(predicateName)
              .predicateValue(predicateValue)
              .execute();
      System.out.println(result);
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlApi#getFieldAutoCompleteForQueryString");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AutoCompleteSuggestions> response = client
              .jql
              .getFieldAutoCompleteForQueryString()
              .fieldName(fieldName)
              .fieldValue(fieldValue)
              .predicateName(predicateName)
              .predicateValue(predicateValue)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlApi#getFieldAutoCompleteForQueryString");
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
| **fieldName** | **String**| The name of the field. | [optional] |
| **fieldValue** | **String**| The partial field item name entered by the user. | [optional] |
| **predicateName** | **String**| The name of the [CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*. | [optional] |
| **predicateValue** | **String**| The partial predicate item name entered by the user. | [optional] |

### Return type

[**AutoCompleteSuggestions**](AutoCompleteSuggestions.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if an invalid combination of parameters is passed. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |

<a name="getFieldReferenceData"></a>
# **getFieldReferenceData**
> JQLReferenceData getFieldReferenceData().execute();

Get field reference data (GET)

Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.  To filter visible field details by project or collapse non-unique fields by field type then [Get field reference data (POST)](https://dac-static.atlassian.com) can be used.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JqlApi;
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
      JQLReferenceData result = client
              .jql
              .getFieldReferenceData()
              .execute();
      System.out.println(result);
      System.out.println(result.getJqlReservedWords());
      System.out.println(result.getVisibleFieldNames());
      System.out.println(result.getVisibleFunctionNames());
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlApi#getFieldReferenceData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JQLReferenceData> response = client
              .jql
              .getFieldReferenceData()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlApi#getFieldReferenceData");
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

[**JQLReferenceData**](JQLReferenceData.md)

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

<a name="getFieldReferenceDataPost"></a>
# **getFieldReferenceDataPost**
> JQLReferenceData getFieldReferenceDataPost(searchAutoCompleteFilter).execute();

Get field reference data (POST)

Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.  This operation can filter the custom fields returned by project. Invalid project IDs in &#x60;projectIds&#x60; are ignored. System fields are always returned.  It can also return the collapsed field for custom fields. Collapsed fields enable searches to be performed across all fields with the same name and of the same field type. For example, the collapsed field &#x60;Component - Component[Dropdown]&#x60; enables dropdown fields &#x60;Component - cf[10061]&#x60; and &#x60;Component - cf[10062]&#x60; to be searched simultaneously.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JqlApi;
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
    Boolean includeCollapsedFields = false; // Include collapsed fields for fields that have non-unique names.
    List<Long> projectIds = Arrays.asList(); // List of project IDs used to filter the visible field details returned.
    try {
      JQLReferenceData result = client
              .jql
              .getFieldReferenceDataPost()
              .includeCollapsedFields(includeCollapsedFields)
              .projectIds(projectIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getJqlReservedWords());
      System.out.println(result.getVisibleFieldNames());
      System.out.println(result.getVisibleFunctionNames());
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlApi#getFieldReferenceDataPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JQLReferenceData> response = client
              .jql
              .getFieldReferenceDataPost()
              .includeCollapsedFields(includeCollapsedFields)
              .projectIds(projectIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlApi#getFieldReferenceDataPost");
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
| **searchAutoCompleteFilter** | [**SearchAutoCompleteFilter**](SearchAutoCompleteFilter.md)|  | |

### Return type

[**JQLReferenceData**](JQLReferenceData.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |

<a name="parseAndValidate"></a>
# **parseAndValidate**
> ParsedJqlQueries parseAndValidate(validation, jqlQueriesToParse).execute();

Parse JQL query

Parses and validates JQL queries.  Validation is performed in context of the current user.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JqlApi;
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
    List<String> queries = Arrays.asList(); // A list of queries to parse.
    String validation = "strict"; // How to validate the JQL query and treat the validation results. Validation options include:   *  `strict` Returns all errors. If validation fails, the query structure is not returned.  *  `warn` Returns all errors. If validation fails but the JQL query is correctly formed, the query structure is returned.  *  `none` No validation is performed. If JQL query is correctly formed, the query structure is returned.
    try {
      ParsedJqlQueries result = client
              .jql
              .parseAndValidate(queries, validation)
              .execute();
      System.out.println(result);
      System.out.println(result.getQueries());
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlApi#parseAndValidate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ParsedJqlQueries> response = client
              .jql
              .parseAndValidate(queries, validation)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlApi#parseAndValidate");
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
| **validation** | **String**| How to validate the JQL query and treat the validation results. Validation options include:   *  &#x60;strict&#x60; Returns all errors. If validation fails, the query structure is not returned.  *  &#x60;warn&#x60; Returns all errors. If validation fails but the JQL query is correctly formed, the query structure is returned.  *  &#x60;none&#x60; No validation is performed. If JQL query is correctly formed, the query structure is returned. | [default to strict] [enum: strict, warn, none] |
| **jqlQueriesToParse** | [**JqlQueriesToParse**](JqlQueriesToParse.md)|  | |

### Return type

[**ParsedJqlQueries**](ParsedJqlQueries.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |

<a name="sanitizeJqlQueries"></a>
# **sanitizeJqlQueries**
> SanitizedJqlQueries sanitizeJqlQueries(jqlQueriesToSanitize).execute();

Sanitize JQL queries

Sanitizes one or more JQL queries by converting readable details into IDs where a user doesn&#39;t have permission to view the entity.  For example, if the query contains the clause *project &#x3D; &#39;Secret project&#39;*, and a user does not have browse permission for the project \&quot;Secret project\&quot;, the sanitized query replaces the clause with *project &#x3D; 12345\&quot;* (where 12345 is the ID of the project). If a user has the required permission, the clause is not sanitized. If the account ID is null, sanitizing is performed for an anonymous user.  Note that sanitization doesn&#39;t make the queries GDPR-compliant, because it doesn&#39;t remove user identifiers (username or user key). If you need to make queries GDPR-compliant, use [Convert user identifiers to account IDs in JQL queries](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-jql/#api-rest-api-3-jql-sanitize-post).  Before sanitization each JQL query is parsed. The queries are returned in the same order that they were passed.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JqlApi;
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
    List<JqlQueryToSanitize> queries = Arrays.asList(); // The list of JQL queries to sanitize. Must contain unique values. Maximum of 20 queries.
    try {
      SanitizedJqlQueries result = client
              .jql
              .sanitizeJqlQueries(queries)
              .execute();
      System.out.println(result);
      System.out.println(result.getQueries());
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlApi#sanitizeJqlQueries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SanitizedJqlQueries> response = client
              .jql
              .sanitizeJqlQueries(queries)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlApi#sanitizeJqlQueries");
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
| **jqlQueriesToSanitize** | [**JqlQueriesToSanitize**](JqlQueriesToSanitize.md)|  | |

### Return type

[**SanitizedJqlQueries**](SanitizedJqlQueries.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |

