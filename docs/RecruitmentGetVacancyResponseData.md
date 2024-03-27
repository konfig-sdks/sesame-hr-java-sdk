

# RecruitmentGetVacancyResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**companyId** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**department** | **String** |  |  [optional] |
|**contactType** | **String** |  |  [optional] |
|**experience** | **String** |  |  [optional] |
|**createdById** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**openedAt** | **String** |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |
|**_public** | **Boolean** |  |  [optional] |
|**locationVacancy** | [**RecruitmentGetVacancyResponseDataLocationVacancy**](RecruitmentGetVacancyResponseDataLocationVacancy.md) |  |  [optional] |
|**scheduleType** | [**RecruitmentGetVacancyResponseDataScheduleType**](RecruitmentGetVacancyResponseDataScheduleType.md) |  |  [optional] |
|**category** | [**RecruitmentGetVacancyResponseDataCategory**](RecruitmentGetVacancyResponseDataCategory.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |
| DRAFT | &quot;draft&quot; |



