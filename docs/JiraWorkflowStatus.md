

# JiraWorkflowStatus

Details of a status.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the status. |  [optional] |
|**id** | **String** | The ID of the status. |  [optional] |
|**name** | **String** | The name of the status. |  [optional] |
|**scope** | [**WorkflowScope**](WorkflowScope.md) |  |  [optional] |
|**statusCategory** | [**StatusCategoryEnum**](#StatusCategoryEnum) | The category of the status. |  [optional] |
|**statusReference** | **String** | The reference of the status. |  [optional] |
|**usages** | [**Set&lt;ProjectIssueTypes&gt;**](ProjectIssueTypes.md) | The &#x60;statuses.usages&#x60; expand is an optional parameter that can be used when reading and updating statuses in Jira. It provides additional information about the projects and issue types associated with the requested statuses. |  [optional] |



## Enum: StatusCategoryEnum

| Name | Value |
|---- | -----|
| TODO | &quot;TODO&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| DONE | &quot;DONE&quot; |



