
# Tape

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**tapeLibraryId** | **Integer** |  |  [optional]
**tapePoolId** | **Integer** |  |  [optional]
**barcode** | **String** |  |  [optional]
**location** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**locked** | **Boolean** |  |  [optional]
**scratch** | **Boolean** |  |  [optional]
**cleaning** | **Boolean** |  |  [optional]
**writeProtect** | **Boolean** |  |  [optional]
**mounted** | **Boolean** |  |  [optional]
**ejected** | **Boolean** |  |  [optional]
**known** | **Boolean** |  |  [optional]
**mountCount** | **Integer** |  |  [optional]
**dateIn** | **String** |  |  [optional]
**dateMove** | **String** |  |  [optional]
**free** | **Integer** |  |  [optional]
**max** | **Integer** |  |  [optional]
**lastSizeUpdate** | **String** |  |  [optional]
**lastMaintenance** | **String** |  |  [optional]
**lastRepack** | **String** |  |  [optional]
**repackStatus** | **Boolean** |  |  [optional]
**hash** | **String** |  |  [optional]
**forceImportType** | **Boolean** |  |  [optional]
**needToCheck** | **Boolean** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
DATA | &quot;data&quot;
CLEANING | &quot;cleaning&quot;
DIAGNOSTIC | &quot;diagnostic&quot;
DATA_LTO1 | &quot;data_lto1&quot;
DATA_LTO2 | &quot;data_lto2&quot;
DATA_LTO3 | &quot;data_lto3&quot;
DATA_LTO4 | &quot;data_lto4&quot;
DATA_LTO5 | &quot;data_lto5&quot;
DATA_LTO6 | &quot;data_lto6&quot;
DATA_LTO7 | &quot;data_lto7&quot;
DATA_LTO8 | &quot;data_lto8&quot;
DATA_LTO9 | &quot;data_lto9&quot;
DATA_LTO10 | &quot;data_lto10&quot;
DATA_LTO11 | &quot;data_lto11&quot;
DATA_LTO12 | &quot;data_lto12&quot;



