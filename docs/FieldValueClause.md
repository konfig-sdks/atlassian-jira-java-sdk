

# FieldValueClause

A clause that asserts the current value of a field. For example, `summary ~ test`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | [**JqlQueryField**](JqlQueryField.md) |  |  |
|**operand** | **LVFKOperand** |  |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The operator between the field and operand. |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUAL | &quot;&#x3D;&quot; |
| NOT_EQUAL | &quot;!&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| LESS_THAN | &quot;&lt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| IN | &quot;in&quot; |
| NOT_IN | &quot;not in&quot; |
| TILDE | &quot;~&quot; |
| TILDE_EQUAL | &quot;~&#x3D;&quot; |
| IS | &quot;is&quot; |
| IS_NOT | &quot;is not&quot; |



