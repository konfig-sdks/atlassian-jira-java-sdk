

# CFVWClause

A JQL query clause that consists of nested clauses. For example, `(labels in (urgent, blocker) OR lastCommentedBy = currentUser()). Note that, where nesting is not defined, the parser nests JQL clauses based on the operator precedence. For example, \"A OR B AND C\" is parsed as \"(A OR B) AND C\". See Setting the precedence of operators for more information about precedence in JQL queries.`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clauses** | **List&lt;CFVWClause&gt;** | The list of nested clauses. |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The operator between the clauses. |  |
|**field** | [**CompoundClauseField**](CompoundClauseField.md) |  |  [optional] |
|**operand** | **LVFKOperand** |  |  [optional] |
|**predicates** | [**List&lt;CompoundClausePredicatesInner&gt;**](CompoundClausePredicatesInner.md) | The list of time predicates. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| AND | &quot;and&quot; |
| OR | &quot;or&quot; |
| NOT | &quot;not&quot; |



