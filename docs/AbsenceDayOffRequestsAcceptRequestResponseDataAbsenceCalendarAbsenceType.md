

# AbsenceDayOffRequestsAcceptRequestResponseDataAbsenceCalendarAbsenceType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**needsValidation** | **Boolean** |  |  [optional] |
|**company** | [**AbsenceDayOffRequestsAcceptRequestResponseDataAbsenceCalendarAbsenceTypeCompany**](AbsenceDayOffRequestsAcceptRequestResponseDataAbsenceCalendarAbsenceTypeCompany.md) |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |
|**deletedAt** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**pickMode** | [**PickModeEnum**](#PickModeEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;normal&quot; |
| PRIVATE | &quot;private&quot; |



## Enum: PickModeEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;by_days&quot; |
| TIME_RANGE | &quot;by_time_range&quot; |



