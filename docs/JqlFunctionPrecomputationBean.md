

# JqlFunctionPrecomputationBean

Jql function precomputation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**arguments** | **List&lt;String&gt;** | The list of arguments function was invoked with. |  [optional] [readonly] |
|**created** | **OffsetDateTime** | The timestamp of the precomputation creation. |  [optional] [readonly] |
|**error** | **String** | The error message to be displayed to the user. |  [optional] [readonly] |
|**field** | **String** | The field the function was executed against. |  [optional] [readonly] |
|**functionKey** | **String** | The function key. |  [optional] [readonly] |
|**functionName** | **String** | The name of the function. |  [optional] [readonly] |
|**id** | **String** | The id of the precomputation. |  [optional] [readonly] |
|**operator** | **String** | The operator in context of which function was executed. |  [optional] [readonly] |
|**updated** | **OffsetDateTime** | The timestamp of the precomputation last update. |  [optional] [readonly] |
|**used** | **OffsetDateTime** | The timestamp of the precomputation last usage. |  [optional] [readonly] |
|**value** | **String** | The JQL fragment stored as the precomputation. |  [optional] [readonly] |



