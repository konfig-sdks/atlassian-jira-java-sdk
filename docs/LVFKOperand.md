

# LVFKOperand

An operand that is a list of values.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encodedOperand** | **String** | Encoded operand, which can be used directly in a JQL query. |  [optional] |
|**values** | **List&lt;VFKOperand&gt;** | The list of operand values. |  [optional] |
|**encodedValue** | **String** | Encoded value, which can be used directly in a JQL query. |  [optional] |
|**value** | **String** | The operand value. |  [optional] |
|**arguments** | **List&lt;String&gt;** | The list of function arguments. |  [optional] |
|**function** | **String** | The name of the function. |  [optional] |
|**keyword** | [**KeywordEnum**](#KeywordEnum) | The keyword that is the operand value. |  [optional] |



## Enum: KeywordEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;empty&quot; |



