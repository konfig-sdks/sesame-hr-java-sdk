

# SalariesCreateSalaryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **UUID** | The ID of the employee |  |
|**payPeriod** | [**PayPeriodEnum**](#PayPeriodEnum) | Payment period of contract |  |
|**currency** | **String** | Currency of contract |  |
|**grossSalary** | **Float** | Salary amount |  |
|**payments** | **Integer** | Number of payments |  |
|**contributionGroupId** | **UUID** | Contribution group id |  |
|**startDate** | **LocalDate** | Salary start date |  |
|**endDate** | **LocalDate** | Salary end date |  [optional] |
|**comments** | **String** | Comments |  [optional] |



## Enum: PayPeriodEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;daily&quot; |
| WEEKLY | &quot;weekly&quot; |
| BIWEEKLY | &quot;biweekly&quot; |
| MONTHLY | &quot;monthly&quot; |
| YEARLY | &quot;yearly&quot; |



