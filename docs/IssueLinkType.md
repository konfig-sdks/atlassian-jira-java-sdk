

# IssueLinkType

This object is used as follows:   *  In the [issueLink](https://dac-static.atlassian.com) resource it defines and reports on the type of link between the issues. Find a list of issue link types with [Get issue link types](https://dac-static.atlassian.com).  *  In the [issueLinkType](https://dac-static.atlassian.com) resource it defines and reports on issue link types.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the issue link type and is used as follows:   *  In the [issueLink](https://dac-static.atlassian.com) resource it is the type of issue link. Required on create when &#x60;name&#x60; isn&#39;t provided. Otherwise, read only.  *  In the [issueLinkType](https://dac-static.atlassian.com) resource it is read only. |  [optional] |
|**inward** | **String** | The description of the issue link type inward link and is used as follows:   *  In the [issueLink](https://dac-static.atlassian.com) resource it is read only.  *  In the [issueLinkType](https://dac-static.atlassian.com) resource it is required on create and optional on update. Otherwise, read only. |  [optional] |
|**name** | **String** | The name of the issue link type and is used as follows:   *  In the [issueLink](https://dac-static.atlassian.com) resource it is the type of issue link. Required on create when &#x60;id&#x60; isn&#39;t provided. Otherwise, read only.  *  In the [issueLinkType](https://dac-static.atlassian.com) resource it is required on create and optional on update. Otherwise, read only. |  [optional] |
|**outward** | **String** | The description of the issue link type outward link and is used as follows:   *  In the [issueLink](https://dac-static.atlassian.com) resource it is read only.  *  In the [issueLinkType](https://dac-static.atlassian.com) resource it is required on create and optional on update. Otherwise, read only. |  [optional] |
|**self** | **URI** | The URL of the issue link type. Read only. |  [optional] [readonly] |



