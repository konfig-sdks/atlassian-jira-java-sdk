

# AnnouncementBannerConfiguration

Announcement banner configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hashId** | **String** | Hash of the banner data. The client detects updates by comparing hash IDs. |  [optional] [readonly] |
|**isDismissible** | **Boolean** | Flag indicating if the announcement banner can be dismissed by the user. |  [optional] [readonly] |
|**isEnabled** | **Boolean** | Flag indicating if the announcement banner is enabled or not. |  [optional] [readonly] |
|**message** | **String** | The text on the announcement banner. |  [optional] [readonly] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Visibility of the announcement banner. |  [optional] [readonly] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;PUBLIC&quot; |
| PRIVATE | &quot;PRIVATE&quot; |



