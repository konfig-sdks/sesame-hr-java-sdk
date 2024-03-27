

# SalariesListResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**payPeriod** | [**PayPeriodEnum**](#PayPeriodEnum) |  |  [optional] |
|**currency** | **String** |  |  [optional] |
|**grossSalary** | **Integer** |  |  [optional] |
|**payments** | **Integer** |  |  [optional] |
|**contributionGroup** | **String** |  |  [optional] |
|**startDate** | **LocalDate** |  |  [optional] |
|**endDate** | **LocalDate** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**monthlyGrossSalary** | **Integer** |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |



## Enum: PayPeriodEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;daily&quot; |
| WEEKLY | &quot;weekly&quot; |
| BIWEEKLY | &quot;biweekly&quot; |
| MONTHLY | &quot;monthly&quot; |
| YEARLY | &quot;yearly&quot; |



