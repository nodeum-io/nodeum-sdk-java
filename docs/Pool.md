

# Pool

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional] [readonly]
**name** | **String** |  |  [optional]
**comment** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**content** | [**ContentEnum**](#ContentEnum) |  |  [optional]
**primaryId** | **Integer** |  |  [optional] [readonly]
**storageId** | **Integer** | For pool of tapes, used to link to a tape library id |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
ACTIVE_ARCHIVE | &quot;active_archive&quot;
OFFLINE_ARCHIVE | &quot;offline_archive&quot;
DATA_EXCHANGE | &quot;data_exchange&quot;
SCRATCH | &quot;scratch&quot;
DATA_ENRICHMENT | &quot;data_enrichment&quot;
PRIMARY | &quot;primary&quot;



## Enum: ContentEnum

Name | Value
---- | -----
TAPE | &quot;tape&quot;
CLOUD | &quot;cloud&quot;
NAS | &quot;nas&quot;



