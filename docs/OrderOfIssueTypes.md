

# OrderOfIssueTypes

An ordered list of issue type IDs and information about where to move them.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**after** | **String** | The ID of the issue type to place the moved issue types after. Required if &#x60;position&#x60; isn&#39;t provided. |  [optional] |
|**issueTypeIds** | **List&lt;String&gt;** | A list of the issue type IDs to move. The order of the issue type IDs in the list is the order they are given after the move. |  |
|**position** | [**PositionEnum**](#PositionEnum) | The position the issue types should be moved to. Required if &#x60;after&#x60; isn&#39;t provided. |  [optional] |



## Enum: PositionEnum

| Name | Value |
|---- | -----|
| FIRST | &quot;First&quot; |
| LAST | &quot;Last&quot; |



