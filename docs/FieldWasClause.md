

# FieldWasClause

A clause that asserts a previous value of a field. For example, `status WAS \"Resolved\" BY currentUser() BEFORE \"2019/02/02\"`. See [WAS](https://confluence.atlassian.com/x/dgiiLQ#Advancedsearching-operatorsreference-WASWAS) for more information about the WAS operator.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | [**JqlQueryField**](JqlQueryField.md) |  |  |
|**operand** | **LVFKOperand** |  |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The operator between the field and operand. |  |
|**predicates** | [**List&lt;CompoundClausePredicatesInner&gt;**](CompoundClausePredicatesInner.md) | The list of time predicates. |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| WAS | &quot;was&quot; |
| WAS_IN | &quot;was in&quot; |
| WAS_NOT_IN | &quot;was not in&quot; |
| WAS_NOT | &quot;was not&quot; |



