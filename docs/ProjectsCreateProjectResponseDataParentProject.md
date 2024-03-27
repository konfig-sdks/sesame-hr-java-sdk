

# ProjectsCreateProjectResponseDataParentProject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**parentProject** | **Object** |  |  [optional] |
|**customer** | [**ProjectsCreateProjectResponseDataParentProjectCustomer**](ProjectsCreateProjectResponseDataParentProjectCustomer.md) |  |  [optional] |
|**price** | **Float** |  |  [optional] |
|**startDate** | **LocalDate** |  |  [optional] |
|**endDate** | **LocalDate** |  |  [optional] |
|**manager** | [**ProjectsCreateProjectResponseDataParentProjectManager**](ProjectsCreateProjectResponseDataParentProjectManager.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| PAUSED | &quot;paused&quot; |



