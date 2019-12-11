

# TapeLibrary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serial** | **String** |  |  [optional] [readonly]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) |  |  [optional] [readonly]
**vendor** | **String** |  |  [optional] [readonly]
**product** | **String** |  |  [optional] [readonly]
**firmware** | **String** |  |  [optional] [readonly]
**device** | **String** |  |  [optional] [readonly]
**acs** | **Integer** |  |  [optional] [readonly]
**storageSlots** | **Integer** |  |  [optional] [readonly]
**storageSlotsAddress** | **Integer** |  |  [optional] [readonly]
**ioSlots** | **Integer** |  |  [optional] [readonly]
**ioSlotsAddress** | **Integer** |  |  [optional] [readonly]
**id** | **Integer** |  |  [optional] [readonly]
**name** | **String** |  |  [optional]
**comment** | **String** |  |  [optional]
**libso** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] [readonly]
**price** | **String** |  |  [optional]



## Enum: ProtocolEnum

Name | Value
---- | -----
SCSI | &quot;scsi&quot;
ACSLS | &quot;acsls&quot;



## Enum: StatusEnum

Name | Value
---- | -----
OFFLINE | &quot;offline&quot;
ONLINE | &quot;online&quot;



