

# WorkflowSchemeUpdateRequiredMappingsRequest

The request payload to get the required mappings for updating a workflow scheme.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultWorkflowId** | **String** | The ID of the new default workflow for this workflow scheme. Only used in global-scoped workflow schemes. If it isn&#39;t specified, is set to *Jira Workflow (jira)*. |  [optional] |
|**id** | **String** | The ID of the workflow scheme. |  |
|**workflowsForIssueTypes** | [**List&lt;WorkflowSchemeAssociation&gt;**](WorkflowSchemeAssociation.md) | The new workflow to issue type mappings for this workflow scheme. |  |



