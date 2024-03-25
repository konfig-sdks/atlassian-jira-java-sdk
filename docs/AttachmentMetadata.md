

# AttachmentMetadata

Metadata for an issue attachment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**author** | [**User**](User.md) | Details of the user who attached the file. |  [optional] |
|**content** | **String** | The URL of the attachment. |  [optional] [readonly] |
|**created** | **OffsetDateTime** | The datetime the attachment was created. |  [optional] [readonly] |
|**filename** | **String** | The name of the attachment file. |  [optional] [readonly] |
|**id** | **Long** | The ID of the attachment. |  [optional] [readonly] |
|**mimeType** | **String** | The MIME type of the attachment. |  [optional] [readonly] |
|**properties** | **Map&lt;String, Object&gt;** | Additional properties of the attachment. |  [optional] [readonly] |
|**self** | **URI** | The URL of the attachment metadata details. |  [optional] [readonly] |
|**size** | **Long** | The size of the attachment. |  [optional] [readonly] |
|**thumbnail** | **String** | The URL of a thumbnail representing the attachment. |  [optional] [readonly] |



