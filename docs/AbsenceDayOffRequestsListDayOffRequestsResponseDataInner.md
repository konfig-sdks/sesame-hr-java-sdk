

# AbsenceDayOffRequestsListDayOffRequestsResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**absenceCalendar** | [**AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerAbsenceCalendar**](AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerAbsenceCalendar.md) |  |  [optional] |
|**employee** | [**AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerEmployee**](AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerEmployee.md) |  |  [optional] |
|**daysOff** | [**List&lt;AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerDaysOffInner&gt;**](AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerDaysOffInner.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**comment** | **UUID** |  |  [optional] |
|**resolutionComment** | **UUID** |  |  [optional] |
|**resolvedAt** | **String** |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |
|**deletedAt** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| REJECTED | &quot;rejected&quot; |
| PENDING | &quot;pending&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;create&quot; |
| DELETE | &quot;delete&quot; |



