

# UiModificationContextDetails

The details of a UI modification's context, which define where to activate the UI modification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the UI modification context. |  [optional] [readonly] |
|**isAvailable** | **Boolean** | Whether a context is available. For example, when a project is deleted the context becomes unavailable. |  [optional] [readonly] |
|**issueTypeId** | **String** | The issue type ID of the context. Null is treated as a wildcard, meaning the UI modification will be applied to all issue types. Each UI modification context can have a maximum of one wildcard. |  [optional] |
|**projectId** | **String** | The project ID of the context. Null is treated as a wildcard, meaning the UI modification will be applied to all projects. Each UI modification context can have a maximum of one wildcard. |  [optional] |
|**viewType** | [**ViewTypeEnum**](#ViewTypeEnum) | The view type of the context. Only &#x60;GIC&#x60;(Global Issue Create) and &#x60;IssueView&#x60; are supported. Null is treated as a wildcard, meaning the UI modification will be applied to all view types. Each UI modification context can have a maximum of one wildcard. |  [optional] |



## Enum: ViewTypeEnum

| Name | Value |
|---- | -----|
| GIC | &quot;GIC&quot; |
| ISSUEVIEW | &quot;IssueView&quot; |



