

# RecruitmentCreateCandidateResponseDataVacancy


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
|**locationVacancy** | [**RecruitmentCreateCandidateResponseDataVacancyLocationVacancy**](RecruitmentCreateCandidateResponseDataVacancyLocationVacancy.md) |  |  [optional] |
|**scheduleType** | [**RecruitmentCreateCandidateResponseDataVacancyScheduleType**](RecruitmentCreateCandidateResponseDataVacancyScheduleType.md) |  |  [optional] |
|**category** | [**RecruitmentCreateCandidateResponseDataVacancyCategory**](RecruitmentCreateCandidateResponseDataVacancyCategory.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |
| DRAFT | &quot;draft&quot; |



