

# WorkflowMetadataRestModel

Workflow metadata and usage detail.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the workflow. |  |
|**version** | [**DocumentVersion**](DocumentVersion.md) |  |  |
|**id** | **String** | The ID of the workflow. |  |
|**name** | **String** | The name of the workflow. |  |
|**usage** | [**List&lt;SimpleUsage&gt;**](SimpleUsage.md) | Use the optional &#x60;workflows.usages&#x60; expand to get additional information about the projects and issue types associated with the workflows in the workflow scheme. |  |



