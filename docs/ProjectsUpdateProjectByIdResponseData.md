

# ProjectsUpdateProjectByIdResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**parentProject** | [**ProjectsUpdateProjectByIdResponseDataParentProject**](ProjectsUpdateProjectByIdResponseDataParentProject.md) |  |  [optional] |
|**customer** | [**ProjectsUpdateProjectByIdResponseDataCustomer**](ProjectsUpdateProjectByIdResponseDataCustomer.md) |  |  [optional] |
|**price** | **Float** |  |  [optional] |
|**startDate** | **LocalDate** |  |  [optional] |
|**endDate** | **LocalDate** |  |  [optional] |
|**manager** | [**ProjectsUpdateProjectByIdResponseDataManager**](ProjectsUpdateProjectByIdResponseDataManager.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| PAUSED | &quot;paused&quot; |



