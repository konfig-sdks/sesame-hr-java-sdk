

# AbsenceDayOffRequestsAcceptRequestResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**absenceCalendar** | [**AbsenceDayOffRequestsAcceptRequestResponseDataAbsenceCalendar**](AbsenceDayOffRequestsAcceptRequestResponseDataAbsenceCalendar.md) |  |  [optional] |
|**employee** | [**AbsenceDayOffRequestsAcceptRequestResponseDataEmployee**](AbsenceDayOffRequestsAcceptRequestResponseDataEmployee.md) |  |  [optional] |
|**daysOff** | [**List&lt;AbsenceDayOffRequestsAcceptRequestResponseDataDaysOffInner&gt;**](AbsenceDayOffRequestsAcceptRequestResponseDataDaysOffInner.md) |  |  [optional] |
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



