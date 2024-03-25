

# IdSearchResults

Result of your JQL search. Returns a list of issue IDs and a token to fetch the next page if one exists.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**issueIds** | **List&lt;Long&gt;** | The list of issue IDs found by the search. |  [optional] [readonly] |
|**nextPageToken** | **String** | Continuation token to fetch the next page. If this result represents the last or the only page this token will be null. |  [optional] [readonly] |



