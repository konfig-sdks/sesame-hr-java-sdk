

# WorkEntriesCreateNewEntryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **UUID** |  |  |
|**workEntryType** | [**WorkEntryTypeEnum**](#WorkEntryTypeEnum) |  |  |
|**workBreakId** | **UUID** |  |  [optional] |
|**workCheckTypeId** | **UUID** |  |  [optional] |
|**workEntryIn** | [**WorkEntriesCreateNewEntryRequestWorkEntryIn**](WorkEntriesCreateNewEntryRequestWorkEntryIn.md) |  |  |
|**workEntryOut** | [**WorkEntriesCreateNewEntryRequestWorkEntryOut**](WorkEntriesCreateNewEntryRequestWorkEntryOut.md) |  |  [optional] |



## Enum: WorkEntryTypeEnum

| Name | Value |
|---- | -----|
| WORK | &quot;work&quot; |
| PAUSE | &quot;pause&quot; |



