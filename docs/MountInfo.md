

# MountInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**majorMinor** | **String** |  |  [optional]
**target** | **String** |  |  [optional]
**source** | **String** |  |  [optional]
**options** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**poolId** | **Integer** |  |  [optional]
**poolName** | **String** |  |  [optional]
**nasId** | **Integer** |  |  [optional]
**nasName** | **String** |  |  [optional]
**nasShareId** | **Integer** |  |  [optional]
**nasShareName** | **String** |  |  [optional]
**cloudConnectorId** | **Integer** |  |  [optional]
**cloudConnectorName** | **String** |  |  [optional]
**cloudBucketId** | **Integer** |  |  [optional]
**cloudBucketName** | **String** |  |  [optional]
**tapeId** | **Integer** |  |  [optional]
**tapeBarcode** | **String** |  |  [optional]
**tapeLibraryId** | **Integer** |  |  [optional]
**tapeLibraryName** | **String** |  |  [optional]
**tapeLibrarySerial** | **String** |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
CIFS | &quot;cifs&quot;
NFS | &quot;nfs&quot;
FUSE_S3FS | &quot;fuse.s3fs&quot;
FUSE_CORE_FUSE | &quot;fuse.core_fuse&quot;
FUSE | &quot;fuse&quot;



