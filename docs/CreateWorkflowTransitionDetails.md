

# CreateWorkflowTransitionDetails

The details of a workflow transition.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the transition. The maximum length is 1000 characters. |  [optional] |
|**from** | **List&lt;String&gt;** | The statuses the transition can start from. |  [optional] |
|**name** | **String** | The name of the transition. The maximum length is 60 characters. |  |
|**properties** | **Map&lt;String, String&gt;** | The properties of the transition. |  [optional] |
|**rules** | [**CreateWorkflowTransitionRulesDetails**](CreateWorkflowTransitionRulesDetails.md) | The rules of the transition. |  [optional] |
|**screen** | [**CreateWorkflowTransitionScreenDetails**](CreateWorkflowTransitionScreenDetails.md) | The screen of the transition. |  [optional] |
|**to** | **String** | The status the transition goes to. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the transition. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GLOBAL | &quot;global&quot; |
| INITIAL | &quot;initial&quot; |
| DIRECTED | &quot;directed&quot; |



