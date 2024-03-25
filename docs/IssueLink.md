

# IssueLink

Details of a link between issues.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the issue link. |  [optional] [readonly] |
|**inwardIssue** | [**LinkedIssue**](LinkedIssue.md) | Provides details about the linked issue. If presenting this link in a user interface, use the &#x60;inward&#x60; field of the issue link type to label the link. |  |
|**outwardIssue** | [**LinkedIssue**](LinkedIssue.md) | Provides details about the linked issue. If presenting this link in a user interface, use the &#x60;outward&#x60; field of the issue link type to label the link. |  |
|**self** | **URI** | The URL of the issue link. |  [optional] [readonly] |
|**type** | [**IssueLinkType**](IssueLinkType.md) | The type of link between the issues. |  |



