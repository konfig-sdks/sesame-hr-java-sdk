

# VacationDayOffRequestsCreateRequestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **UUID** |  |  |
|**calendarId** | **UUID** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**daysOff** | [**List&lt;VacationCalendarsCreateNewCalendarRequestDaysOffInner&gt;**](VacationCalendarsCreateNewCalendarRequestDaysOffInner.md) |  |  |
|**comment** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;create&quot; |
| DELETE | &quot;delete&quot; |



