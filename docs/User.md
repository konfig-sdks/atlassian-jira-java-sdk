

# User

A user with details as permitted by the user's Atlassian Account privacy settings. However, be aware of these exceptions:   *  User record deleted from Atlassian: This occurs as the result of a right to be forgotten request. In this case, `displayName` provides an indication and other parameters have default values or are blank (for example, email is blank).  *  User record corrupted: This occurs as a results of events such as a server import and can only happen to deleted users. In this case, `accountId` returns *unknown* and all other parameters have fallback values.  *  User record unavailable: This usually occurs due to an internal service outage. In this case, all parameters have fallback values.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests. |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk |  [optional] [readonly] |
|**active** | **Boolean** | Whether the user is active. |  [optional] [readonly] |
|**applicationRoles** | [**SimpleListWrapperApplicationRole**](SimpleListWrapperApplicationRole.md) | The application roles the user is assigned to. |  [optional] |
|**avatarUrls** | [**AvatarUrlsBean**](AvatarUrlsBean.md) | The avatars of the user. |  [optional] |
|**displayName** | **String** | The display name of the user. Depending on the user’s privacy setting, this may return an alternative value. |  [optional] [readonly] |
|**emailAddress** | **String** | The email address of the user. Depending on the user’s privacy setting, this may be returned as null. |  [optional] [readonly] |
|**expand** | **String** | Expand options that include additional user details in the response. |  [optional] [readonly] |
|**groups** | [**SimpleListWrapperGroupName**](SimpleListWrapperGroupName.md) | The groups that the user belongs to. |  [optional] |
|**key** | **String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional] |
|**locale** | **String** | The locale of the user. Depending on the user’s privacy setting, this may be returned as null. |  [optional] [readonly] |
|**name** | **String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional] |
|**self** | **URI** | The URL of the user. |  [optional] [readonly] |
|**timeZone** | **String** | The time zone specified in the user&#39;s profile. Depending on the user’s privacy setting, this may be returned as null. |  [optional] [readonly] |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| ATLASSIAN | &quot;atlassian&quot; |
| APP | &quot;app&quot; |
| CUSTOMER | &quot;customer&quot; |
| UNKNOWN | &quot;unknown&quot; |



