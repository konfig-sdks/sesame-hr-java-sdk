

# EmployeeManagersAssignResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**manager** | [**EmployeeManagersAssignResponseDataManager**](EmployeeManagersAssignResponseDataManager.md) |  |  [optional] |
|**employee** | [**EmployeeManagersAssignResponseDataEmployee**](EmployeeManagersAssignResponseDataEmployee.md) |  |  [optional] |
|**permission** | [**PermissionEnum**](#PermissionEnum) |  |  [optional] |
|**order** | [**OrderEnum**](#OrderEnum) |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |



## Enum: PermissionEnum

| Name | Value |
|---- | -----|
| CHECK | &quot;check&quot; |
| VACATION | &quot;vacation&quot; |



## Enum: OrderEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



