

# Avatar

Details of an avatar.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileName** | **String** | The file name of the avatar icon. Returned for system avatars. |  [optional] [readonly] |
|**id** | **String** | The ID of the avatar. |  |
|**isDeletable** | **Boolean** | Whether the avatar can be deleted. |  [optional] [readonly] |
|**isSelected** | **Boolean** | Whether the avatar is used in Jira. For example, shown as a project&#39;s avatar. |  [optional] [readonly] |
|**isSystemAvatar** | **Boolean** | Whether the avatar is a system avatar. |  [optional] [readonly] |
|**owner** | **String** | The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user. |  [optional] [readonly] |
|**urls** | **Map&lt;String, URI&gt;** | The list of avatar icon URLs. |  [optional] [readonly] |



