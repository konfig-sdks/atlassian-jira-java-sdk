

# Dashboard

Details of a dashboard.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**automaticRefreshMs** | **Integer** | The automatic refresh interval for the dashboard in milliseconds. |  [optional] [readonly] |
|**editPermissions** | [**List&lt;SharePermission&gt;**](SharePermission.md) | The details of any edit share permissions for the dashboard. |  [optional] [readonly] |
|**id** | **String** | The ID of the dashboard. |  [optional] [readonly] |
|**isFavourite** | **Boolean** | Whether the dashboard is selected as a favorite by the user. |  [optional] [readonly] |
|**isWritable** | **Boolean** | Whether the current user has permission to edit the dashboard. |  [optional] [readonly] |
|**name** | **String** | The name of the dashboard. |  [optional] [readonly] |
|**owner** | [**UserBean**](UserBean.md) | The owner of the dashboard. |  [optional] |
|**popularity** | **Long** | The number of users who have this dashboard as a favorite. |  [optional] [readonly] |
|**rank** | **Integer** | The rank of this dashboard. |  [optional] [readonly] |
|**self** | **URI** | The URL of these dashboard details. |  [optional] [readonly] |
|**sharePermissions** | [**List&lt;SharePermission&gt;**](SharePermission.md) | The details of any view share permissions for the dashboard. |  [optional] [readonly] |
|**systemDashboard** | **Boolean** | Whether the current dashboard is system dashboard. |  [optional] [readonly] |
|**view** | **String** | The URL of the dashboard. |  [optional] [readonly] |



