

# EmployeeManagersAssignRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **UUID** | The identifier of the employee |  |
|**managerId** | **UUID** | The identifier of the employee manager |  |
|**permission** | [**PermissionEnum**](#PermissionEnum) | Type of validation manager |  |
|**order** | [**OrderEnum**](#OrderEnum) | The validator order |  |



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



