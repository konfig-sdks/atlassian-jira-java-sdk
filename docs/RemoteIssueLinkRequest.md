

# RemoteIssueLinkRequest

Details of a remote issue link.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**application** | [**Application**](Application.md) |  |  [optional] |
|**globalId** | **String** | An identifier for the remote item in the remote system. For example, the global ID for a remote item in Confluence would consist of the app ID and page ID, like this: &#x60;appId&#x3D;456&amp;pageId&#x3D;123&#x60;.  Setting this field enables the remote issue link details to be updated or deleted using remote system and item details as the record identifier, rather than using the record&#39;s Jira ID.  The maximum length is 255 characters. |  [optional] |
|**_object** | [**RemoteObject**](RemoteObject.md) |  |  |
|**relationship** | **String** | Description of the relationship between the issue and the linked item. If not set, the relationship description \&quot;links to\&quot; is used in Jira. |  [optional] |



