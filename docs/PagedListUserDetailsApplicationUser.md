

# PagedListUserDetailsApplicationUser

A paged list. To access additional details append `[start-index:end-index]` to the expand request. For example, `?expand=sharedUsers[10:40]` returns a list starting at item 10 and finishing at item 40.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endIndex** | **Integer** | The index of the last item returned on the page. |  [optional] [readonly] |
|**items** | [**List&lt;UserDetails&gt;**](UserDetails.md) | The list of items. |  [optional] [readonly] |
|**maxResults** | **Integer** | The maximum number of results that could be on the page. |  [optional] [readonly] |
|**size** | **Integer** | The number of items on the page. |  [optional] [readonly] |
|**startIndex** | **Integer** | The index of the first item returned on the page. |  [optional] [readonly] |



