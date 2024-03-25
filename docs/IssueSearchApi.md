# IssueSearchApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkAgainstJql**](IssueSearchApi.md#checkAgainstJql) | **POST** /rest/api/3/jql/match | Check issues against JQL |
| [**jqlGet**](IssueSearchApi.md#jqlGet) | **GET** /rest/api/3/search | Search for issues using JQL (GET) |
| [**pickerSuggestionsGet**](IssueSearchApi.md#pickerSuggestionsGet) | **GET** /rest/api/3/issue/picker | Get issue picker suggestions |
| [**searchIssueIdsUsingJqlPost**](IssueSearchApi.md#searchIssueIdsUsingJqlPost) | **POST** /rest/api/3/search/id | Search issue IDs using JQL |
| [**usingJqlPost**](IssueSearchApi.md#usingJqlPost) | **POST** /rest/api/3/search | Search for issues using JQL (POST) |


<a name="checkAgainstJql"></a>
# **checkAgainstJql**
> IssueMatches checkAgainstJql(issuesAndJQLQueries).execute();

Check issues against JQL

Checks whether one or more issues would be returned by one or more JQL queries.  **[Permissions](https://dac-static.atlassian.com) required:** None, however, issues are only matched against JQL queries where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSearchApi;
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
    Set<Long> issueIds = Arrays.asList(); // A list of issue IDs.
    List<String> jqls = Arrays.asList(); // A list of JQL queries.
    try {
      IssueMatches result = client
              .issueSearch
              .checkAgainstJql(issueIds, jqls)
              .execute();
      System.out.println(result);
      System.out.println(result.getMatches());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSearchApi#checkAgainstJql");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssueMatches> response = client
              .issueSearch
              .checkAgainstJql(issueIds, jqls)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSearchApi#checkAgainstJql");
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
| **issuesAndJQLQueries** | [**IssuesAndJQLQueries**](IssuesAndJQLQueries.md)|  | |

### Return type

[**IssueMatches**](IssueMatches.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if &#x60;jqls&#x60; exceeds the maximum number of JQL queries or &#x60;issueIds&#x60; exceeds the maximum number of issue IDs. |  -  |

<a name="jqlGet"></a>
# **jqlGet**
> SearchResults jqlGet().jql(jql).startAt(startAt).maxResults(maxResults).validateQuery(validateQuery).fields(fields).expand(expand).properties(properties).fieldsByKeys(fieldsByKeys).execute();

Search for issues using JQL (GET)

Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ).  If the JQL query expression is too large to be encoded as a query parameter, use the [POST](https://dac-static.atlassian.com) version of this resource.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Issues are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSearchApi;
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
    String jql = "project = HSP"; // The [JQL](https://confluence.atlassian.com/x/egORLQ) that defines the search. Note:   *  If no JQL expression is provided, all issues are returned.  *  `username` and `userkey` cannot be used as search terms due to privacy reasons. Use `accountId` instead.  *  If a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required.
    Integer startAt = 0; // The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // The maximum number of items to return per page. To manage page size, Jira may return fewer items per page where a large number of fields are requested. The greatest number of items returned per page is achieved when requesting `id` or `key` only.
    String validateQuery = "strict"; // Determines how to validate the JQL query and treat the validation results. Supported values are:   *  `strict` Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  `warn` Returns all errors as warnings.  *  `none` No validation is performed.  *  `true` *Deprecated* A legacy synonym for `strict`.  *  `false` *Deprecated* A legacy synonym for `warn`.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value.
    List<String> fields = Arrays.asList(""*navigable""); // A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  `*all` Returns all fields.  *  `*navigable` Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  `summary,comment` Returns only the summary and comments fields.  *  `-description` Returns all navigable (default) fields except description.  *  `*all,-comment` Returns all fields except comments.  This parameter may be specified multiple times. For example, `fields=field1,field2&fields=field3`.  Note: All navigable fields are returned by default. This differs from [GET issue](https://dac-static.atlassian.com) where the default is all fields.
    String expand = "expand_example"; // Use [expand](https://dac-static.atlassian.com) to include additional information about issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  `renderedFields` Returns field values rendered in HTML format.  *  `names` Returns the display name of each field.  *  `schema` Returns the schema describing a field type.  *  `transitions` Returns all possible transitions for the issue.  *  `operations` Returns all possible operations for the issue.  *  `editmeta` Returns information about how each field can be edited.  *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  `versionedRepresentations` Instead of `fields`, returns `versionedRepresentations` a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version.
    List<String> properties = Arrays.asList(); // A list of issue property keys for issue properties to include in the results. This parameter accepts a comma-separated list. Multiple properties can also be provided using an ampersand separated list. For example, `properties=prop1,prop2&properties=prop3`. A maximum of 5 issue property keys can be specified.
    Boolean fieldsByKeys = false; // Reference fields by their key (rather than ID).
    try {
      SearchResults result = client
              .issueSearch
              .jqlGet()
              .jql(jql)
              .startAt(startAt)
              .maxResults(maxResults)
              .validateQuery(validateQuery)
              .fields(fields)
              .expand(expand)
              .properties(properties)
              .fieldsByKeys(fieldsByKeys)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpand());
      System.out.println(result.getIssues());
      System.out.println(result.getMaxResults());
      System.out.println(result.getNames());
      System.out.println(result.getSchema());
      System.out.println(result.getStartAt());
      System.out.println(result.getTotal());
      System.out.println(result.getWarningMessages());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSearchApi#jqlGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SearchResults> response = client
              .issueSearch
              .jqlGet()
              .jql(jql)
              .startAt(startAt)
              .maxResults(maxResults)
              .validateQuery(validateQuery)
              .fields(fields)
              .expand(expand)
              .properties(properties)
              .fieldsByKeys(fieldsByKeys)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSearchApi#jqlGet");
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
| **jql** | **String**| The [JQL](https://confluence.atlassian.com/x/egORLQ) that defines the search. Note:   *  If no JQL expression is provided, all issues are returned.  *  &#x60;username&#x60; and &#x60;userkey&#x60; cannot be used as search terms due to privacy reasons. Use &#x60;accountId&#x60; instead.  *  If a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required. | [optional] |
| **startAt** | **Integer**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. To manage page size, Jira may return fewer items per page where a large number of fields are requested. The greatest number of items returned per page is achieved when requesting &#x60;id&#x60; or &#x60;key&#x60; only. | [optional] [default to 50] |
| **validateQuery** | **String**| Determines how to validate the JQL query and treat the validation results. Supported values are:   *  &#x60;strict&#x60; Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  &#x60;warn&#x60; Returns all errors as warnings.  *  &#x60;none&#x60; No validation is performed.  *  &#x60;true&#x60; *Deprecated* A legacy synonym for &#x60;strict&#x60;.  *  &#x60;false&#x60; *Deprecated* A legacy synonym for &#x60;warn&#x60;.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the &#x60;validateQuery&#x60; value. | [optional] [default to strict] [enum: strict, warn, none, true, false] |
| **fields** | [**List&lt;String&gt;**](String.md)| A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;*all&#x60; Returns all fields.  *  &#x60;*navigable&#x60; Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  &#x60;summary,comment&#x60; Returns only the summary and comments fields.  *  &#x60;-description&#x60; Returns all navigable (default) fields except description.  *  &#x60;*all,-comment&#x60; Returns all fields except comments.  This parameter may be specified multiple times. For example, &#x60;fields&#x3D;field1,field2&amp;fields&#x3D;field3&#x60;.  Note: All navigable fields are returned by default. This differs from [GET issue](https://dac-static.atlassian.com) where the default is all fields. | [optional] |
| **expand** | **String**| Use [expand](https://dac-static.atlassian.com) to include additional information about issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;renderedFields&#x60; Returns field values rendered in HTML format.  *  &#x60;names&#x60; Returns the display name of each field.  *  &#x60;schema&#x60; Returns the schema describing a field type.  *  &#x60;transitions&#x60; Returns all possible transitions for the issue.  *  &#x60;operations&#x60; Returns all possible operations for the issue.  *  &#x60;editmeta&#x60; Returns information about how each field can be edited.  *  &#x60;changelog&#x60; Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  &#x60;versionedRepresentations&#x60; Instead of &#x60;fields&#x60;, returns &#x60;versionedRepresentations&#x60; a JSON array containing each version of a field&#39;s value, with the highest numbered item representing the most recent version. | [optional] |
| **properties** | [**List&lt;String&gt;**](String.md)| A list of issue property keys for issue properties to include in the results. This parameter accepts a comma-separated list. Multiple properties can also be provided using an ampersand separated list. For example, &#x60;properties&#x3D;prop1,prop2&amp;properties&#x3D;prop3&#x60;. A maximum of 5 issue property keys can be specified. | [optional] |
| **fieldsByKeys** | **Boolean**| Reference fields by their key (rather than ID). | [optional] [default to false] |

### Return type

[**SearchResults**](SearchResults.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the JQL query is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a name="pickerSuggestionsGet"></a>
# **pickerSuggestionsGet**
> IssuePickerSuggestions pickerSuggestionsGet().query(query).currentJQL(currentJQL).currentIssueKey(currentIssueKey).currentProjectId(currentProjectId).showSubTasks(showSubTasks).showSubTaskParent(showSubTaskParent).execute();

Get issue picker suggestions

Returns lists of issues matching a query string. Use this resource to provide auto-completion suggestions when the user is looking for an issue using a word or string.  This operation returns two lists:   *  &#x60;History Search&#x60; which includes issues from the user&#39;s history of created, edited, or viewed issues that contain the string in the &#x60;query&#x60; parameter.  *  &#x60;Current Search&#x60; which includes issues that match the JQL expression in &#x60;currentJQL&#x60; and contain the string in the &#x60;query&#x60; parameter.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSearchApi;
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
    String query = "query"; // A string to match against text fields in the issue such as title, description, or comments.
    String currentJQL = "currentJQL_example"; // A JQL query defining a list of issues to search for the query term. Note that `username` and `userkey` cannot be used as search terms for this parameter, due to privacy reasons. Use `accountId` instead.
    String currentIssueKey = "currentIssueKey_example"; // The key of an issue to exclude from search results. For example, the issue the user is viewing when they perform this query.
    String currentProjectId = "currentProjectId_example"; // The ID of a project that suggested issues must belong to.
    Boolean showSubTasks = true; // Indicate whether to include subtasks in the suggestions list.
    Boolean showSubTaskParent = true; // When `currentIssueKey` is a subtask, whether to include the parent issue in the suggestions if it matches the query.
    try {
      IssuePickerSuggestions result = client
              .issueSearch
              .pickerSuggestionsGet()
              .query(query)
              .currentJQL(currentJQL)
              .currentIssueKey(currentIssueKey)
              .currentProjectId(currentProjectId)
              .showSubTasks(showSubTasks)
              .showSubTaskParent(showSubTaskParent)
              .execute();
      System.out.println(result);
      System.out.println(result.getSections());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSearchApi#pickerSuggestionsGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssuePickerSuggestions> response = client
              .issueSearch
              .pickerSuggestionsGet()
              .query(query)
              .currentJQL(currentJQL)
              .currentIssueKey(currentIssueKey)
              .currentProjectId(currentProjectId)
              .showSubTasks(showSubTasks)
              .showSubTaskParent(showSubTaskParent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSearchApi#pickerSuggestionsGet");
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
| **query** | **String**| A string to match against text fields in the issue such as title, description, or comments. | [optional] |
| **currentJQL** | **String**| A JQL query defining a list of issues to search for the query term. Note that &#x60;username&#x60; and &#x60;userkey&#x60; cannot be used as search terms for this parameter, due to privacy reasons. Use &#x60;accountId&#x60; instead. | [optional] |
| **currentIssueKey** | **String**| The key of an issue to exclude from search results. For example, the issue the user is viewing when they perform this query. | [optional] |
| **currentProjectId** | **String**| The ID of a project that suggested issues must belong to. | [optional] |
| **showSubTasks** | **Boolean**| Indicate whether to include subtasks in the suggestions list. | [optional] |
| **showSubTaskParent** | **Boolean**| When &#x60;currentIssueKey&#x60; is a subtask, whether to include the parent issue in the suggestions if it matches the query. | [optional] |

### Return type

[**IssuePickerSuggestions**](IssuePickerSuggestions.md)

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

<a name="searchIssueIdsUsingJqlPost"></a>
# **searchIssueIdsUsingJqlPost**
> IdSearchResults searchIssueIdsUsingJqlPost(idSearchRequestBean).execute();

Search issue IDs using JQL

Searches for IDs of issues using [JQL](https://confluence.atlassian.com/x/egORLQ).  Use the [Search](https://dac-static.atlassian.com) endpoint if you need to fetch more than just issue IDs. The Search endpoint returns more information, but may take much longer to respond to requests. This is because it uses a different mechanism for ordering results than this endpoint and doesn&#39;t provide the total number of results for your query.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Issues are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSearchApi;
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
    String jql = "jql_example"; // A [JQL](https://confluence.atlassian.com/x/egORLQ) expression. Order by clauses are not allowed.
    Integer maxResults = 1000; // The maximum number of items to return per page.
    String nextPageToken = "nextPageToken_example"; // The continuation token to fetch the next page. This token is provided by the response of this endpoint.
    try {
      IdSearchResults result = client
              .issueSearch
              .searchIssueIdsUsingJqlPost()
              .jql(jql)
              .maxResults(maxResults)
              .nextPageToken(nextPageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getIssueIds());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSearchApi#searchIssueIdsUsingJqlPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IdSearchResults> response = client
              .issueSearch
              .searchIssueIdsUsingJqlPost()
              .jql(jql)
              .maxResults(maxResults)
              .nextPageToken(nextPageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSearchApi#searchIssueIdsUsingJqlPost");
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
| **idSearchRequestBean** | [**IdSearchRequestBean**](IdSearchRequestBean.md)| A JSON object containing the search request. | |

### Return type

[**IdSearchResults**](IdSearchResults.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the JQL query is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |

<a name="usingJqlPost"></a>
# **usingJqlPost**
> SearchResults usingJqlPost(searchRequestBean).execute();

Search for issues using JQL (POST)

Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ).  There is a [GET](https://dac-static.atlassian.com) version of this resource that can be used for smaller JQL query expressions.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Issues are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AtlassianJira;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssueSearchApi;
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
    List<String> expand = Arrays.asList(); // Use [expand](em>#expansion) to include additional information about issues in the response. Note that, unlike the majority of instances where `expand` is specified, `expand` is defined as a list of values. The expand options are:   *  `renderedFields` Returns field values rendered in HTML format.  *  `names` Returns the display name of each field.  *  `schema` Returns the schema describing a field type.  *  `transitions` Returns all possible transitions for the issue.  *  `operations` Returns all possible operations for the issue.  *  `editmeta` Returns information about how each field can be edited.  *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  `versionedRepresentations` Instead of `fields`, returns `versionedRepresentations` a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version.
    List<String> fields = Arrays.asList(); // A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  `*all` Returns all fields.  *  `*navigable` Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  The default is `*navigable`.  Examples:   *  `summary,comment` Returns the summary and comments fields only.  *  `-description` Returns all navigable (default) fields except description.  *  `*all,-comment` Returns all fields except comments.  Multiple `fields` parameters can be included in a request.  Note: All navigable fields are returned by default. This differs from [GET issue](https://dac-static.atlassian.com) where the default is all fields.
    Boolean fieldsByKeys = true; // Reference fields by their key (rather than ID). The default is `false`.
    String jql = "jql_example"; // A [JQL](https://confluence.atlassian.com/x/egORLQ) expression.
    Integer maxResults = 50; // The maximum number of items to return per page.
    List<String> properties = Arrays.asList(); // A list of up to 5 issue properties to include in the results. This parameter accepts a comma-separated list.
    Integer startAt = 56; // The index of the first item to return in the page of results (page offset). The base index is `0`.
    String validateQuery = "strict"; // Determines how to validate the JQL query and treat the validation results. Supported values:   *  `strict` Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  `warn` Returns all errors as warnings.  *  `none` No validation is performed.  *  `true` *Deprecated* A legacy synonym for `strict`.  *  `false` *Deprecated* A legacy synonym for `warn`.  The default is `strict`.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value.
    try {
      SearchResults result = client
              .issueSearch
              .usingJqlPost()
              .expand(expand)
              .fields(fields)
              .fieldsByKeys(fieldsByKeys)
              .jql(jql)
              .maxResults(maxResults)
              .properties(properties)
              .startAt(startAt)
              .validateQuery(validateQuery)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpand());
      System.out.println(result.getIssues());
      System.out.println(result.getMaxResults());
      System.out.println(result.getNames());
      System.out.println(result.getSchema());
      System.out.println(result.getStartAt());
      System.out.println(result.getTotal());
      System.out.println(result.getWarningMessages());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSearchApi#usingJqlPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SearchResults> response = client
              .issueSearch
              .usingJqlPost()
              .expand(expand)
              .fields(fields)
              .fieldsByKeys(fieldsByKeys)
              .jql(jql)
              .maxResults(maxResults)
              .properties(properties)
              .startAt(startAt)
              .validateQuery(validateQuery)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSearchApi#usingJqlPost");
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
| **searchRequestBean** | [**SearchRequestBean**](SearchRequestBean.md)| A JSON object containing the search request. | |

### Return type

[**SearchResults**](SearchResults.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the JQL query is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

