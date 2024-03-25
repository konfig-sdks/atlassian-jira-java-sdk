

# VersionIssueCounts

Various counts of issues within a version.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customFieldUsage** | [**List&lt;VersionUsageInCustomField&gt;**](VersionUsageInCustomField.md) | List of custom fields using the version. |  [optional] [readonly] |
|**issueCountWithCustomFieldsShowingVersion** | **Long** | Count of issues where a version custom field is set to the version. |  [optional] [readonly] |
|**issuesAffectedCount** | **Long** | Count of issues where the &#x60;affectedVersion&#x60; is set to the version. |  [optional] [readonly] |
|**issuesFixedCount** | **Long** | Count of issues where the &#x60;fixVersion&#x60; is set to the version. |  [optional] [readonly] |
|**self** | **URI** | The URL of these count details. |  [optional] [readonly] |



