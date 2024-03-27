

# EmployeesUpdateByIdRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**firstName** | **String** | The first name of the employee |  |
|**lastName** | **String** | The last name of the employee |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**email** | **String** | The email for the employee access and notifications (required if invitation is true) |  [optional] |
|**contractId** | **UUID** | The identifier of your internal employee contract |  [optional] |
|**code** | **Integer** | The code of the employee |  [optional] |
|**pin** | **Integer** | The pin of the employee |  [optional] |
|**nid** | **String** | The National Identity Document of the employee |  [optional] |
|**identityNumberType** | [**IdentityNumberTypeEnum**](#IdentityNumberTypeEnum) |  |  [optional] |
|**ssn** | **String** | The Social Security Number of the employee |  [optional] |
|**phone** | **String** |  |  [optional] |
|**dateOfBirth** | **LocalDate** |  |  [optional] |
|**customFields** | [**List&lt;EmployeesUpdateByIdRequestCustomFieldsInner&gt;**](EmployeesUpdateByIdRequestCustomFieldsInner.md) | Custom Fields to fill |  [optional] |
|**nationality** | **String** |  |  [optional] |
|**maritalStatus** | **String** |  |  [optional] |
|**address** | **String** |  |  [optional] |
|**postalCode** | **String** |  |  [optional] |
|**emergencyPhone** | **String** |  |  [optional] |
|**childrenCount** | **Integer** |  |  [optional] |
|**disability** | **Integer** |  |  [optional] |
|**personalEmail** | **String** |  |  [optional] |
|**city** | **String** |  |  [optional] |
|**province** | **String** |  |  [optional] |
|**country** | **String** |  |  [optional] |
|**salaryRange** | **String** |  |  [optional] |
|**studyLevel** | **String** |  |  [optional] |
|**professionalCategoryCode** | **String** |  |  [optional] |
|**professionalCategoryDescription** | **String** |  |  [optional] |
|**bic** | **String** |  |  [optional] |
|**accountNumber** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| FEMALE | &quot;female&quot; |
| MALE | &quot;male&quot; |
| NO_RESPONSE | &quot;no_response&quot; |



## Enum: IdentityNumberTypeEnum

| Name | Value |
|---- | -----|
| DNI | &quot;dni&quot; |
| NIE | &quot;nie&quot; |
| RUT | &quot;rut&quot; |
| OTHER | &quot;other&quot; |



