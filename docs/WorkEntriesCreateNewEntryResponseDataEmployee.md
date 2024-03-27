

# WorkEntriesCreateNewEntryResponseDataEmployee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the employee |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**workStatus** | [**WorkStatusEnum**](#WorkStatusEnum) |  |  [optional] |
|**imageProfileURL** | **String** |  |  [optional] |
|**code** | **Integer** |  |  [optional] |
|**pin** | **Integer** |  |  [optional] |
|**phone** | **String** |  |  [optional] |
|**company** | [**WorkEntriesCreateNewEntryResponseDataEmployeeCompany**](WorkEntriesCreateNewEntryResponseDataEmployeeCompany.md) |  |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**contractId** | **String** | The identifier of your internal employee contract |  [optional] |
|**nid** | **String** | The National Identity Document of the employee |  [optional] |
|**identityNumberType** | [**IdentityNumberTypeEnum**](#IdentityNumberTypeEnum) |  |  [optional] |
|**ssn** | **String** | The Social Security Number of the employee |  [optional] |
|**pricePerHour** | **Float** | The Price per hour of the employee |  [optional] |
|**accountNumber** | **String** | The Account Number of the employee |  [optional] |
|**dateOfBirth** | **LocalDate** |  |  [optional] |
|**customFields** | [**List&lt;CoreV3EmployeeCustomFieldsInner&gt;**](CoreV3EmployeeCustomFieldsInner.md) |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**children** | **Integer** |  |  [optional] |
|**disability** | **Integer** |  |  [optional] |
|**address** | **String** | The Address of the employee |  [optional] |
|**postalCode** | **String** | The postal code of the employee |  [optional] |
|**city** | **String** | The city of the employee |  [optional] |
|**province** | **String** | The province of the employee |  [optional] |
|**country** | **String** | The country of the employee |  [optional] |
|**nationality** | **String** | The nationality of the employee |  [optional] |
|**personalMail** | **String** |  |  [optional] |
|**maritalStatus** | **String** |  |  [optional] |
|**emergencyPhone** | **String** | The emergency phone of the employee |  [optional] |
|**salaryRange** | **String** | The salary range of the employee |  [optional] |
|**studyLevel** | **String** | The study level of the employee |  [optional] |
|**professionalCategoryCode** | **String** | The professional category code of the employee |  [optional] |
|**professionalCategoryDescription** | **String** | The professional category description of the employee |  [optional] |
|**bic** | **String** |  |  [optional] |



## Enum: WorkStatusEnum

| Name | Value |
|---- | -----|
| ONLINE | &quot;online&quot; |
| OFFLINE | &quot;offline&quot; |
| PAUSED | &quot;paused&quot; |
| REMOTE | &quot;remote&quot; |



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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



