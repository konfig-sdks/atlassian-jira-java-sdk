

# CreateWorkflowTransitionRulesDetails

The details of a workflow transition rules.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditions** | [**CreateWorkflowCondition**](CreateWorkflowCondition.md) | The workflow conditions. |  [optional] |
|**postFunctions** | [**List&lt;CreateWorkflowTransitionRule&gt;**](CreateWorkflowTransitionRule.md) | The workflow post functions.  **Note:** The default post functions are always added to the *initial* transition, as in:      \&quot;postFunctions\&quot;: [         {             \&quot;type\&quot;: \&quot;IssueCreateFunction\&quot;         },         {             \&quot;type\&quot;: \&quot;IssueReindexFunction\&quot;         },         {             \&quot;type\&quot;: \&quot;FireIssueEventFunction\&quot;,             \&quot;configuration\&quot;: {                 \&quot;event\&quot;: {                     \&quot;id\&quot;: \&quot;1\&quot;,                     \&quot;name\&quot;: \&quot;issue_created\&quot;                 }             }         }     ]  **Note:** The default post functions are always added to the *global* and *directed* transitions, as in:      \&quot;postFunctions\&quot;: [         {             \&quot;type\&quot;: \&quot;UpdateIssueStatusFunction\&quot;         },         {             \&quot;type\&quot;: \&quot;CreateCommentFunction\&quot;         },         {             \&quot;type\&quot;: \&quot;GenerateChangeHistoryFunction\&quot;         },         {             \&quot;type\&quot;: \&quot;IssueReindexFunction\&quot;         },         {             \&quot;type\&quot;: \&quot;FireIssueEventFunction\&quot;,             \&quot;configuration\&quot;: {                 \&quot;event\&quot;: {                     \&quot;id\&quot;: \&quot;13\&quot;,                     \&quot;name\&quot;: \&quot;issue_generic\&quot;                 }             }         }     ] |  [optional] |
|**validators** | [**List&lt;CreateWorkflowTransitionRule&gt;**](CreateWorkflowTransitionRule.md) | The workflow validators.  **Note:** The default permission validator is always added to the *initial* transition, as in:      \&quot;validators\&quot;: [         {             \&quot;type\&quot;: \&quot;PermissionValidator\&quot;,             \&quot;configuration\&quot;: {                 \&quot;permissionKey\&quot;: \&quot;CREATE_ISSUES\&quot;             }         }     ] |  [optional] |



