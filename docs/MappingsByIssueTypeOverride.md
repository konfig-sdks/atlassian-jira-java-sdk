

# MappingsByIssueTypeOverride

Overrides, for the selected issue types, any status mappings provided in `statusMappingsByWorkflows`. Status mappings are required when the new workflow for an issue type doesn't contain all statuses that the old workflow has. Status mappings can be provided by a combination of `statusMappingsByWorkflows` and `statusMappingsByIssueTypeOverride`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**issueTypeId** | **String** | The ID of the issue type for this mapping. |  |
|**statusMappings** | [**List&lt;WorkflowAssociationStatusMapping&gt;**](WorkflowAssociationStatusMapping.md) | The list of status mappings. |  |



