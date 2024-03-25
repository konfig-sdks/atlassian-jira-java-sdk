

# MappingsByWorkflow

The status mappings by workflows. Status mappings are required when the new workflow for an issue type doesn't contain all statuses that the old workflow has. Status mappings can be provided by a combination of `statusMappingsByWorkflows` and `statusMappingsByIssueTypeOverride`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**newWorkflowId** | **String** | The ID of the new workflow. |  |
|**oldWorkflowId** | **String** | The ID of the old workflow. |  |
|**statusMappings** | [**List&lt;WorkflowAssociationStatusMapping&gt;**](WorkflowAssociationStatusMapping.md) | The list of status mappings. |  |



