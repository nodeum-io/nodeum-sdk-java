

# Tape

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional] [readonly]
**tapeLibraryId** | **Integer** |  |  [optional] [readonly]
**tapePoolId** | **Integer** |  |  [optional] [readonly]
**barcode** | **String** |  |  [optional] [readonly]
**location** | **String** |  |  [optional] [readonly]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] [readonly]
**locked** | **Boolean** |  |  [optional] [readonly]
**scratch** | **Boolean** |  |  [optional] [readonly]
**cleaning** | **Boolean** |  |  [optional] [readonly]
**writeProtect** | **Boolean** |  |  [optional] [readonly]
**mounted** | **Boolean** |  |  [optional] [readonly]
**ejected** | **Boolean** |  |  [optional] [readonly]
**known** | **Boolean** |  |  [optional] [readonly]
**mountCount** | **Integer** |  |  [optional] [readonly]
**dateIn** | **String** |  |  [optional] [readonly]
**dateMove** | **String** |  |  [optional] [readonly]
**free** | **Integer** |  |  [optional] [readonly]
**max** | **Integer** |  |  [optional] [readonly]
**lastSizeUpdate** | **String** |  |  [optional] [readonly]
**lastMaintenance** | **String** |  |  [optional] [readonly]
**lastRepack** | **String** |  |  [optional] [readonly]
**repackStatus** | **Boolean** |  |  [optional] [readonly]
**hash** | **String** |  |  [optional] [readonly]
**forceImportType** | **Boolean** |  |  [optional] [readonly]
**needToCheck** | **Boolean** |  |  [optional] [readonly]



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



