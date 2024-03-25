

# Comment

A comment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**author** | [**UserDetails**](UserDetails.md) |  |  [optional] |
|**body** | **Object** | The comment text in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/). |  [optional] |
|**created** | **OffsetDateTime** | The date and time at which the comment was created. |  [optional] [readonly] |
|**id** | **String** | The ID of the comment. |  [optional] [readonly] |
|**jsdAuthorCanSeeRequest** | **Boolean** | Whether the comment was added from an email sent by a person who is not part of the issue. See [Allow external emails to be added as comments on issues](https://support.atlassian.com/jira-service-management-cloud/docs/allow-external-emails-to-be-added-as-comments-on-issues/)for information on setting up this feature. |  [optional] [readonly] |
|**jsdPublic** | **Boolean** | Whether the comment is visible in Jira Service Desk. Defaults to true when comments are created in the Jira Cloud Platform. This includes when the site doesn&#39;t use Jira Service Desk or the project isn&#39;t a Jira Service Desk project and, therefore, there is no Jira Service Desk for the issue to be visible on. To create a comment with its visibility in Jira Service Desk set to false, use the Jira Service Desk REST API [Create request comment](https://developer.atlassian.com/cloud/jira/service-desk/rest/#api-rest-servicedeskapi-request-issueIdOrKey-comment-post) operation. |  [optional] [readonly] |
|**properties** | [**List&lt;EntityProperty&gt;**](EntityProperty.md) | A list of comment properties. Optional on create and update. |  [optional] |
|**renderedBody** | **String** | The rendered version of the comment. |  [optional] [readonly] |
|**self** | **String** | The URL of the comment. |  [optional] [readonly] |
|**updateAuthor** | [**UserDetails**](UserDetails.md) |  |  [optional] |
|**updated** | **OffsetDateTime** | The date and time at which the comment was updated last. |  [optional] [readonly] |
|**visibility** | [**Visibility**](Visibility.md) |  |  [optional] |



