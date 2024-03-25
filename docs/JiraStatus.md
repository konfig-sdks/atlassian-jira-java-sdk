

# JiraStatus

Details of a status.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the status. |  [optional] |
|**id** | **String** | The ID of the status. |  [optional] |
|**name** | **String** | The name of the status. |  [optional] |
|**scope** | [**StatusScope**](StatusScope.md) |  |  [optional] |
|**statusCategory** | [**StatusCategoryEnum**](#StatusCategoryEnum) | The category of the status. |  [optional] |
|**usages** | [**Set&lt;ProjectIssueTypes&gt;**](ProjectIssueTypes.md) | Projects and issue types where the status is used. Only available if the &#x60;usages&#x60; expand is requested. |  [optional] |
|**workflowUsages** | [**Set&lt;WorkflowUsages&gt;**](WorkflowUsages.md) | The workflows that use this status. Only available if the &#x60;workflowUsages&#x60; expand is requested. |  [optional] |



## Enum: StatusCategoryEnum

| Name | Value |
|---- | -----|
| TODO | &quot;TODO&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| DONE | &quot;DONE&quot; |



