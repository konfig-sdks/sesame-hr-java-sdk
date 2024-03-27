

# ProjectsListResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**parentProject** | [**ProjectsListResponseDataInnerParentProject**](ProjectsListResponseDataInnerParentProject.md) |  |  [optional] |
|**customer** | [**ProjectsListResponseDataInnerCustomer**](ProjectsListResponseDataInnerCustomer.md) |  |  [optional] |
|**price** | **Float** |  |  [optional] |
|**startDate** | **LocalDate** |  |  [optional] |
|**endDate** | **LocalDate** |  |  [optional] |
|**manager** | [**ProjectsListResponseDataInnerManager**](ProjectsListResponseDataInnerManager.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| PAUSED | &quot;paused&quot; |



