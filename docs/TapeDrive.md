

# TapeDrive

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serial** | **String** |  |  [optional] [readonly]
**scsiAddress** | **Integer** |  |  [optional] [readonly]
**vendor** | **String** |  |  [optional] [readonly]
**product** | **String** |  |  [optional] [readonly]
**firmware** | **String** |  |  [optional] [readonly]
**device** | **String** | When saved, device may be prefixed by *n* (eg. &#x60;/dev/nst5&#x60;) |  [optional] [readonly]
**sgdevice** | **String** |  |  [optional] [readonly]
**id** | **Integer** |  |  [optional] [readonly]
**tapeLibraryId** | **Integer** |  |  [optional] [readonly]
**name** | **String** |  |  [optional]
**comment** | **String** |  |  [optional]
**libso** | **String** |  |  [optional]
**acs** | **Integer** |  |  [optional]
**lsm** | **Integer** |  |  [optional]
**panel** | **Integer** |  |  [optional]
**transport** | **Integer** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] [readonly]
**full** | **Integer** |  |  [optional] [readonly]
**mountCount** | **Integer** |  |  [optional] [readonly]
**useTo** | **String** |  |  [optional] [readonly]
**useBy** | **String** |  |  [optional] [readonly]
**useFileProcessedSize** | **Integer** |  |  [optional] [readonly]
**useFileSizeToProcess** | **Integer** |  |  [optional] [readonly]
**useFileNameProcessed** | **String** |  |  [optional] [readonly]
**bandwidth** | **Integer** |  |  [optional] [readonly]



## Enum: StatusEnum

Name | Value
---- | -----
OFFLINE | &quot;offline&quot;
ONLINE | &quot;online&quot;



