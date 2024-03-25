

# WorkflowSchemeReadResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the workflow scheme. |  [optional] |
|**version** | [**DocumentVersion**](DocumentVersion.md) |  |  |
|**defaultWorkflow** | [**WorkflowMetadataRestModel**](WorkflowMetadataRestModel.md) |  |  [optional] |
|**id** | **String** | The ID of the workflow scheme. |  |
|**name** | **String** | The name of the workflow scheme. |  |
|**projectIdsUsingScheme** | **List&lt;String&gt;** | The IDs of projects using the workflow scheme. |  |
|**scope** | [**WorkflowScope**](WorkflowScope.md) |  |  |
|**taskId** | **String** | Indicates if there&#39;s an [asynchronous task](https://dac-static.atlassian.com) for this workflow scheme. |  [optional] |
|**workflowsForIssueTypes** | [**List&lt;WorkflowMetadataAndIssueTypeRestModel&gt;**](WorkflowMetadataAndIssueTypeRestModel.md) | Mappings from workflows to issue types. |  |



