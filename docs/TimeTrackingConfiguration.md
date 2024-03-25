

# TimeTrackingConfiguration

Details of the time tracking configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultUnit** | [**DefaultUnitEnum**](#DefaultUnitEnum) | The default unit of time applied to logged time. |  |
|**timeFormat** | [**TimeFormatEnum**](#TimeFormatEnum) | The format that will appear on an issue&#39;s *Time Spent* field. |  |
|**workingDaysPerWeek** | **Double** | The number of days in a working week. |  |
|**workingHoursPerDay** | **Double** | The number of hours in a working day. |  |



## Enum: DefaultUnitEnum

| Name | Value |
|---- | -----|
| MINUTE | &quot;minute&quot; |
| HOUR | &quot;hour&quot; |
| DAY | &quot;day&quot; |
| WEEK | &quot;week&quot; |



## Enum: TimeFormatEnum

| Name | Value |
|---- | -----|
| PRETTY | &quot;pretty&quot; |
| DAYS | &quot;days&quot; |
| HOURS | &quot;hours&quot; |



