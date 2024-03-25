

# Filter

Details about a filter.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description of the filter. |  [optional] |
|**approximateLastUsed** | **OffsetDateTime** | \\[Experimental\\] Approximate last used time. Returns the date and time when the filter was last used. Returns &#x60;null&#x60; if the filter hasn&#39;t been used after tracking was enabled. For performance reasons, timestamps aren&#39;t updated in real time and therefore may not be exactly accurate. |  [optional] [readonly] |
|**editPermissions** | [**List&lt;SharePermission&gt;**](SharePermission.md) | The groups and projects that can edit the filter. |  [optional] |
|**favourite** | **Boolean** | Whether the filter is selected as a favorite. |  [optional] |
|**favouritedCount** | **Long** | The count of how many users have selected this filter as a favorite, including the filter owner. |  [optional] [readonly] |
|**id** | **String** | The unique identifier for the filter. |  [optional] [readonly] |
|**jql** | **String** | The JQL query for the filter. For example, *project &#x3D; SSP AND issuetype &#x3D; Bug*. |  [optional] |
|**name** | **String** | The name of the filter. Must be unique. |  |
|**owner** | [**User**](User.md) | The user who owns the filter. This is defaulted to the creator of the filter, however Jira administrators can change the owner of a shared filter in the admin settings. |  [optional] |
|**searchUrl** | **URI** | A URL to view the filter results in Jira, using the [Search for issues using JQL](https://dac-static.atlassian.com) operation with the filter&#39;s JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql&#x3D;project+%3D+SSP+AND+issuetype+%3D+Bug*. |  [optional] [readonly] |
|**self** | **URI** | The URL of the filter. |  [optional] [readonly] |
|**sharePermissions** | [**List&lt;SharePermission&gt;**](SharePermission.md) | The groups and projects that the filter is shared with. |  [optional] |
|**sharedUsers** | [**UserList**](UserList.md) | A paginated list of the users that the filter is shared with. This includes users that are members of the groups or can browse the projects that the filter is shared with. |  [optional] |
|**subscriptions** | [**FilterSubscriptionsList**](FilterSubscriptionsList.md) | A paginated list of the users that are subscribed to the filter. |  [optional] |
|**viewUrl** | **URI** | A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter&#x3D;10100*. |  [optional] [readonly] |



