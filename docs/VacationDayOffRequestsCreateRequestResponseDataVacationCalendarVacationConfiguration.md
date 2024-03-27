

# VacationDayOffRequestsCreateRequestResponseDataVacationCalendarVacationConfiguration


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**employeeRequestEnabled** | **Boolean** |  |  [optional] |
|**needsValidation** | **Boolean** |  |  [optional] |
|**company** | [**VacationDayOffRequestsCreateRequestResponseDataVacationCalendarVacationConfigurationCompany**](VacationDayOffRequestsCreateRequestResponseDataVacationCalendarVacationConfigurationCompany.md) |  |  [optional] |
|**dayType** | [**DayTypeEnum**](#DayTypeEnum) |  |  [optional] |
|**maxDaysOff** | **Integer** |  |  [optional] |
|**isDefault** | **Boolean** |  |  [optional] |
|**notAllowedDateRanges** | [**List&lt;VacationConfigurationsListConfigurationsResponseDataInnerNotAllowedDateRangesInner&gt;**](VacationConfigurationsListConfigurationsResponseDataInnerNotAllowedDateRangesInner.md) |  |  [optional] |
|**creationDateNextYear** | **String** |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |
|**deletedAt** | **String** |  |  [optional] |



## Enum: DayTypeEnum

| Name | Value |
|---- | -----|
| BUSINESS_DAY | &quot;business_day&quot; |
| CALENDAR_DAY | &quot;calendar_day&quot; |



