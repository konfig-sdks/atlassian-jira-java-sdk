

# PermissionScheme

Details of a permission scheme.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for the permission scheme. |  [optional] |
|**expand** | **String** | The expand options available for the permission scheme. |  [optional] [readonly] |
|**id** | **Long** | The ID of the permission scheme. |  [optional] [readonly] |
|**name** | **String** | The name of the permission scheme. Must be unique. |  |
|**permissions** | [**List&lt;PermissionGrant&gt;**](PermissionGrant.md) | The permission scheme to create or update. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more information. |  [optional] |
|**scope** | [**Scope**](Scope.md) |  |  [optional] |
|**self** | **URI** | The URL of the permission scheme. |  [optional] [readonly] |



