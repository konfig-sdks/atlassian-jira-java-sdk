

# FieldChangedClause

A clause that asserts whether a field was changed. For example, `status CHANGED AFTER startOfMonth(-1M)`.See [CHANGED](https://confluence.atlassian.com/x/dgiiLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for more information about the CHANGED operator.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | [**JqlQueryField**](JqlQueryField.md) |  |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The operator applied to the field. |  |
|**predicates** | [**List&lt;JqlQueryClauseTimePredicate&gt;**](JqlQueryClauseTimePredicate.md) | The list of time predicates. |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| CHANGED | &quot;changed&quot; |



