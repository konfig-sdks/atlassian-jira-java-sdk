

# JiraWorkflow

Details of a workflow.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the workflow. |  [optional] |
|**version** | [**DocumentVersion**](DocumentVersion.md) |  |  [optional] |
|**id** | **String** | The ID of the workflow. |  [optional] |
|**isEditable** | **Boolean** | Indicates if the workflow can be edited. |  [optional] |
|**name** | **String** | The name of the workflow. |  [optional] |
|**scope** | [**WorkflowScope**](WorkflowScope.md) |  |  [optional] |
|**startPointLayout** | [**WorkflowLayout**](WorkflowLayout.md) |  |  [optional] |
|**statuses** | [**Set&lt;WorkflowReferenceStatus&gt;**](WorkflowReferenceStatus.md) | The statuses referenced in this workflow. |  [optional] |
|**taskId** | **String** | If there is a current [asynchronous task](https://dac-static.atlassian.com) operation for this workflow. |  [optional] |
|**transitions** | [**Set&lt;WorkflowTransitions&gt;**](WorkflowTransitions.md) | The transitions of the workflow. |  [optional] |
|**usages** | [**Set&lt;ProjectIssueTypes&gt;**](ProjectIssueTypes.md) | Use the optional &#x60;workflows.usages&#x60; expand to get additional information about the projects and issue types associated with the requested workflows. |  [optional] |



