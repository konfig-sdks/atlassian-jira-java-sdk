

# IssueBean

Details about an issue.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**changelog** | [**PageOfChangelogs**](PageOfChangelogs.md) | Details of changelogs associated with the issue. |  [optional] |
|**editmeta** | [**IssueUpdateMetadata**](IssueUpdateMetadata.md) | The metadata for the fields on the issue that can be amended. |  [optional] |
|**expand** | **String** | Expand options that include additional issue details in the response. |  [optional] [readonly] |
|**fields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**fieldsToInclude** | [**IncludedFields**](IncludedFields.md) |  |  [optional] |
|**id** | **String** | The ID of the issue. |  [optional] [readonly] |
|**key** | **String** | The key of the issue. |  [optional] [readonly] |
|**names** | **Map&lt;String, String&gt;** | The ID and name of each field present on the issue. |  [optional] [readonly] |
|**operations** | [**Operations**](Operations.md) | The operations that can be performed on the issue. |  [optional] |
|**properties** | **Map&lt;String, Object&gt;** | Details of the issue properties identified in the request. |  [optional] [readonly] |
|**renderedFields** | **Map&lt;String, Object&gt;** | The rendered value of each field present on the issue. |  [optional] [readonly] |
|**schema** | [**Map&lt;String, JsonTypeBean&gt;**](JsonTypeBean.md) | The schema describing each field present on the issue. |  [optional] [readonly] |
|**self** | **URI** | The URL of the issue details. |  [optional] [readonly] |
|**transitions** | [**List&lt;IssueTransition&gt;**](IssueTransition.md) | The transitions that can be performed on the issue. |  [optional] [readonly] |
|**versionedRepresentations** | **Map&lt;String, Map&lt;String, Object&gt;&gt;** | The versions of each field on the issue. |  [optional] [readonly] |



