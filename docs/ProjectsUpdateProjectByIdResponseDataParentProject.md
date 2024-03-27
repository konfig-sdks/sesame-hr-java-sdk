

# ProjectsUpdateProjectByIdResponseDataParentProject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**parentProject** | **Object** |  |  [optional] |
|**customer** | [**ProjectsUpdateProjectByIdResponseDataParentProjectCustomer**](ProjectsUpdateProjectByIdResponseDataParentProjectCustomer.md) |  |  [optional] |
|**price** | **Float** |  |  [optional] |
|**startDate** | **LocalDate** |  |  [optional] |
|**endDate** | **LocalDate** |  |  [optional] |
|**manager** | [**ProjectsUpdateProjectByIdResponseDataParentProjectManager**](ProjectsUpdateProjectByIdResponseDataParentProjectManager.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| PAUSED | &quot;paused&quot; |



