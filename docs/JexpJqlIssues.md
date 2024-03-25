

# JexpJqlIssues

The JQL specifying the issues available in the evaluated Jira expression under the `issues` context variable. Not all issues returned by the JQL query are loaded, only those described by the `startAt` and `maxResults` properties. To determine whether it is necessary to iterate to ensure all the issues returned by the JQL query are evaluated, inspect `meta.issues.jql.count` in the response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxResults** | **Integer** | The maximum number of issues to return from the JQL query. Inspect &#x60;meta.issues.jql.maxResults&#x60; in the response to ensure the maximum value has not been exceeded. |  [optional] |
|**query** | **String** | The JQL query. |  [optional] |
|**startAt** | **Long** | The index of the first issue to return from the JQL query. |  [optional] |
|**validation** | [**ValidationEnum**](#ValidationEnum) | Determines how to validate the JQL query and treat the validation results. |  [optional] |



## Enum: ValidationEnum

| Name | Value |
|---- | -----|
| STRICT | &quot;strict&quot; |
| WARN | &quot;warn&quot; |
| NONE | &quot;none&quot; |



