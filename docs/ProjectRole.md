

# ProjectRole

Details about the roles in a project.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the project role. |  [optional] [readonly] |
|**actors** | [**List&lt;RoleActor&gt;**](RoleActor.md) | The list of users who act in this role. |  [optional] [readonly] |
|**admin** | **Boolean** | Whether this role is the admin role for the project. |  [optional] [readonly] |
|**currentUserRole** | **Boolean** | Whether the calling user is part of this role. |  [optional] |
|**_default** | **Boolean** | Whether this role is the default role for the project |  [optional] [readonly] |
|**id** | **Long** | The ID of the project role. |  [optional] [readonly] |
|**name** | **String** | The name of the project role. |  [optional] |
|**roleConfigurable** | **Boolean** | Whether the roles are configurable for this project. |  [optional] [readonly] |
|**scope** | [**Scope**](Scope.md) | The scope of the role. Indicated for roles associated with [next-gen projects](https://confluence.atlassian.com/x/loMyO). |  [optional] |
|**self** | **URI** | The URL the project role details. |  [optional] [readonly] |
|**translatedName** | **String** | The translated name of the project role. |  [optional] |



