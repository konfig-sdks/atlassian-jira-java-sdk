

# Worklog

Details of a worklog.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**author** | [**UserDetails**](UserDetails.md) |  |  [optional] |
|**comment** | **Object** | A comment about the worklog in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/). Optional when creating or updating a worklog. |  [optional] |
|**created** | **OffsetDateTime** | The datetime on which the worklog was created. |  [optional] [readonly] |
|**id** | **String** | The ID of the worklog record. |  [optional] [readonly] |
|**issueId** | **String** | The ID of the issue this worklog is for. |  [optional] [readonly] |
|**properties** | [**List&lt;EntityProperty&gt;**](EntityProperty.md) | Details of properties for the worklog. Optional when creating or updating a worklog. |  [optional] |
|**self** | **URI** | The URL of the worklog item. |  [optional] [readonly] |
|**started** | **OffsetDateTime** | The datetime on which the worklog effort was started. Required when creating a worklog. Optional when updating a worklog. |  [optional] |
|**timeSpent** | **String** | The time spent working on the issue as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). Required when creating a worklog if &#x60;timeSpentSeconds&#x60; isn&#39;t provided. Optional when updating a worklog. Cannot be provided if &#x60;timeSpentSecond&#x60; is provided. |  [optional] |
|**timeSpentSeconds** | **Long** | The time in seconds spent working on the issue. Required when creating a worklog if &#x60;timeSpent&#x60; isn&#39;t provided. Optional when updating a worklog. Cannot be provided if &#x60;timeSpent&#x60; is provided. |  [optional] |
|**updateAuthor** | [**UserDetails**](UserDetails.md) |  |  [optional] |
|**updated** | **OffsetDateTime** | The datetime on which the worklog was last updated. |  [optional] [readonly] |
|**visibility** | [**Visibility**](Visibility.md) |  |  [optional] |



