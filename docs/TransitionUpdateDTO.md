

# TransitionUpdateDTO

The transitions of this workflow.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the transition. |  [optional] |
|**actions** | [**List&lt;WorkflowRuleConfiguration&gt;**](WorkflowRuleConfiguration.md) | The post-functions of the transition. |  [optional] |
|**conditions** | [**ConditionGroupUpdate**](ConditionGroupUpdate.md) |  |  [optional] |
|**customIssueEventId** | **String** | The custom event ID of the transition. |  [optional] |
|**from** | [**List&lt;StatusReferenceAndPort&gt;**](StatusReferenceAndPort.md) | The statuses the transition can start from. |  [optional] |
|**id** | **String** | The ID of the transition. |  |
|**name** | **String** | The name of the transition. |  |
|**properties** | **Map&lt;String, String&gt;** | The properties of the transition. |  [optional] |
|**to** | [**StatusReferenceAndPort**](StatusReferenceAndPort.md) |  |  [optional] |
|**transitionScreen** | [**WorkflowRuleConfiguration**](WorkflowRuleConfiguration.md) |  |  [optional] |
|**triggers** | [**List&lt;WorkflowTrigger&gt;**](WorkflowTrigger.md) | The triggers of the transition. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The transition type. |  |
|**validators** | [**List&lt;WorkflowRuleConfiguration&gt;**](WorkflowRuleConfiguration.md) | The validators of the transition. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INITIAL | &quot;INITIAL&quot; |
| GLOBAL | &quot;GLOBAL&quot; |
| DIRECTED | &quot;DIRECTED&quot; |



