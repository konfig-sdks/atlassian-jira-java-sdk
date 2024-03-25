

# ValueOperand

An operand that is a user-provided value.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encodedValue** | **String** | Encoded value, which can be used directly in a JQL query. |  [optional] |
|**value** | **String** | The operand value. |  [optional] |
|**arguments** | **List&lt;String&gt;** | The list of function arguments. |  [optional] |
|**encodedOperand** | **String** | Encoded operand, which can be used directly in a JQL query. |  [optional] |
|**function** | **String** | The name of the function. |  [optional] |
|**keyword** | [**KeywordEnum**](#KeywordEnum) | The keyword that is the operand value. |  [optional] |



## Enum: KeywordEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;empty&quot; |



