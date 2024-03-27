

# ProjectsCreateProjectRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the project |  [optional] |
|**companyId** | **UUID** | The id of the company |  |
|**name** | **String** | The name of the project |  |
|**parentProjectId** | **UUID** | The id of the parent project |  [optional] |
|**customerId** | **UUID** | The id of the customer |  [optional] |
|**price** | **Float** | The price of the project |  [optional] |
|**startDate** | **LocalDate** | The start date of the project |  [optional] |
|**endDate** | **LocalDate** | The end date of the project |  [optional] |
|**managerId** | **UUID** | The id of the employee manager |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the project |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| PAUSED | &quot;paused&quot; |



