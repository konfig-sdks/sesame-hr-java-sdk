

# AbsenceDayOffRequestsCreateDayOffRequestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **UUID** |  |  |
|**absenceTypeId** | **UUID** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**daysOff** | [**List&lt;AbsenceDayOffRequestsCreateDayOffRequestRequestDaysOffInner&gt;**](AbsenceDayOffRequestsCreateDayOffRequestRequestDaysOffInner.md) |  |  |
|**comment** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;create&quot; |
| DELETE | &quot;delete&quot; |



