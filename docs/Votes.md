

# Votes

The details of votes on an issue.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hasVoted** | **Boolean** | Whether the user making this request has voted on the issue. |  [optional] [readonly] |
|**self** | **URI** | The URL of these issue vote details. |  [optional] [readonly] |
|**voters** | [**List&lt;User&gt;**](User.md) | List of the users who have voted on this issue. An empty list is returned when the calling user doesn&#39;t have the *View voters and watchers* project permission. |  [optional] [readonly] |
|**votes** | **Long** | The number of votes on the issue. |  [optional] [readonly] |



