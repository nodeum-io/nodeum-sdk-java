

# Container

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional] [readonly]
**name** | **String** |  |  [optional]
**comment** | **String** |  |  [optional]
**quotaTotalSize** | **Integer** |  |  [optional]
**quotaOnCache** | **Integer** |  |  [optional]
**statTotalFiles** | **Integer** |  |  [optional] [readonly]
**onlyOnCacheFileCount** | **Integer** |  |  [optional] [readonly]
**statTotalSize** | **Integer** |  |  [optional] [readonly]
**statSizeOnCache** | **Integer** |  |  [optional] [readonly]
**onlyOnCacheFileSizeSum** | **Integer** |  |  [optional] [readonly]
**guestRight** | [**GuestRightEnum**](#GuestRightEnum) |  |  [optional]
**lastUpdate** | **String** |  |  [optional] [readonly]



## Enum: GuestRightEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
READ | &quot;read&quot;
READ_WRITE | &quot;read_write&quot;



