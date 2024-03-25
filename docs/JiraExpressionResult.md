

# JiraExpressionResult

The result of evaluating a Jira expression.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**meta** | [**JiraExpressionEvaluationMetaDataBean**](JiraExpressionEvaluationMetaDataBean.md) | Contains various characteristics of the performed expression evaluation. |  [optional] |
|**value** | **Object** | The value of the evaluated expression. It may be a primitive JSON value or a Jira REST API object. (Some expressions do not produce any meaningful results—for example, an expression that returns a lambda function—if that&#39;s the case a simple string representation is returned. These string representations should not be relied upon and may change without notice.) |  |



