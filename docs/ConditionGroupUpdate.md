

# ConditionGroupUpdate

The conditions group associated with the transition.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditionGroups** | [**List&lt;ConditionGroupUpdate&gt;**](ConditionGroupUpdate.md) | The nested conditions of the condition group. |  [optional] |
|**conditions** | [**List&lt;WorkflowRuleConfiguration&gt;**](WorkflowRuleConfiguration.md) | The rules for this condition. |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | Determines how the conditions in the group are evaluated. Accepts either &#x60;ANY&#x60; or &#x60;ALL&#x60;. If &#x60;ANY&#x60; is used, at least one condition in the group must be true for the group to evaluate to true. If &#x60;ALL&#x60; is used, all conditions in the group must be true for the group to evaluate to true. |  |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| ANY | &quot;ANY&quot; |
| ALL | &quot;ALL&quot; |



