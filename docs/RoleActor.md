

# RoleActor

Details about a user assigned to a project role.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actorGroup** | [**ProjectRoleGroup**](ProjectRoleGroup.md) |  |  [optional] |
|**actorUser** | [**ProjectRoleUser**](ProjectRoleUser.md) |  |  [optional] |
|**avatarUrl** | **URI** | The avatar of the role actor. |  [optional] [readonly] |
|**displayName** | **String** | The display name of the role actor. For users, depending on the user’s privacy setting, this may return an alternative value for the user&#39;s name. |  [optional] [readonly] |
|**id** | **Long** | The ID of the role actor. |  [optional] [readonly] |
|**name** | **String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of role actor. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GROUP_ROLE_ACTOR | &quot;atlassian-group-role-actor&quot; |
| USER_ROLE_ACTOR | &quot;atlassian-user-role-actor&quot; |



