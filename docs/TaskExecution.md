

# TaskExecution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**taskId** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**logTime** | **String** |  |  [optional]
**jobStarted** | **String** |  |  [optional]
**jobFinished** | **String** |  |  [optional]
**toProcessSize** | **Integer** |  |  [optional]
**processedSize** | **Integer** |  |  [optional]
**toProcessFiles** | **Integer** |  |  [optional]
**processedFiles** | **Integer** |  |  [optional]
**finalizedFiles** | **Integer** |  |  [optional]
**estimationTime** | **Integer** |  |  [optional]
**bandwidth** | **Integer** |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
EXPORT_ACTIVE_ARCHIVE_COPY | &quot;export_active_archive_copy&quot;
IMPORT_ACTIVE_ARCHIVE_COPY | &quot;import_active_archive_copy&quot;
EXT_TO_CACHE | &quot;ext_to_cache&quot;
CACHE_TO_PRIMARY | &quot;cache_to_primary&quot;
TO_CLOUD_ACTIVE_ARCHIVE_COPY | &quot;to_cloud_active_archive_copy&quot;
FROM_CLOUD_ACTIVE_ARCHIVE_COPY | &quot;from_cloud_active_archive_copy&quot;
TO_NAS_ACTIVE_ARCHIVE_COPY | &quot;to_nas_active_archive_copy&quot;
FROM_NAS_ACTIVE_ARCHIVE_COPY | &quot;from_nas_active_archive_copy&quot;
EXPORT_ACTIVE_ARCHIVE_MOVE | &quot;export_active_archive_move&quot;
FROM_CLOUD_ACTIVE_ARCHIVE_MOVE | &quot;from_cloud_active_archive_move&quot;
FROM_NAS_ACTIVE_ARCHIVE_MOVE | &quot;from_nas_active_archive_move&quot;
TO_CLOUD_ACTIVE_ARCHIVE_MOVE | &quot;to_cloud_active_archive_move&quot;
FROM_CLOUD_TO_CLOUD_ACTIVE_ARCHIVE_MOVE | &quot;from_cloud_to_cloud_active_archive_move&quot;
FROM_CLOUD_TO_NAS_ACTIVE_ARCHIVE_MOVE | &quot;from_cloud_to_nas_active_archive_move&quot;
TO_NAS_ACTIVE_ARCHIVE_MOVE | &quot;to_nas_active_archive_move&quot;
FROM_NAS_TO_NAS_ACTIVE_ARCHIVE_MOVE | &quot;from_nas_to_nas_active_archive_move&quot;
FROM_NAS_TO_CLOUD_ACTIVE_ARCHIVE_MOVE | &quot;from_nas_to_cloud_active_archive_move&quot;
EXT_TO_CACHE_MOVE | &quot;ext_to_cache_move&quot;
EXPORT_OFFLINE_ARCHIVING_COPY | &quot;export_offline_archiving_copy&quot;
IMPORT_OFFLINE_ARCHIVING_COPY | &quot;import_offline_archiving_copy&quot;
TO_CLOUD_OFFLINE_COPY | &quot;to_cloud_offline_copy&quot;
FROM_CLOUD_OFFLINE_COPY | &quot;from_cloud_offline_copy&quot;
TO_NAS_OFFLINE_COPY | &quot;to_nas_offline_copy&quot;
FROM_NAS_OFFLINE_COPY | &quot;from_nas_offline_copy&quot;
FROM_CLOUD_TO_CLOUD_OFFLINE_ARCHIVE_COPY | &quot;from_cloud_to_cloud_offline_archive_copy&quot;
FROM_NAS_TO_NAS_OFFLINE_ARCHIVE_COPY | &quot;from_nas_to_nas_offline_archive_copy&quot;
RELOAD_COPY | &quot;reload_copy&quot;
EXPORT_OFFLINE_ARCHIVING_MOVE | &quot;export_offline_archiving_move&quot;
TO_CLOUD_OFFLINE_MOVE | &quot;to_cloud_offline_move&quot;
TO_NAS_OFFLINE_MOVE | &quot;to_nas_offline_move&quot;
OFFLINE_SCAN_MEDIA | &quot;offline_scan_media&quot;
FROM_NAS_TO_NAS_OFFLINE_ARCHIVE_MOVE | &quot;from_nas_to_nas_offline_archive_move&quot;
FROM_NAS_OFFLINE_ARCHIVE_MOVE | &quot;from_nas_offline_archive_move&quot;
FROM_CLOUD_TO_CLOUD_OFFLINE_ARCHIVE_MOVE | &quot;from_cloud_to_cloud_offline_archive_move&quot;
FROM_CLOUD_OFFLINE_ARCHIVE_MOVE | &quot;from_cloud_offline_archive_move&quot;
RELOAD_MOVE | &quot;reload_move&quot;
EXPORT_DATA_EXCHANGE_COPY | &quot;export_data_exchange_copy&quot;
IMPORT_DATA_EXCHANGE_COPY | &quot;import_data_exchange_copy&quot;
EXPORT_DATA_EXCHANGE_MOVE | &quot;export_data_exchange_move&quot;
IMPORT_SCAN_MEDIA | &quot;import_scan_media&quot;
REHYDRATATION | &quot;rehydratation&quot;
FORMAT | &quot;format&quot;
CHECK_CONSISTENCY | &quot;check_consistency&quot;
MIGRATION_NEW_LTFS_TO_NEW_LTFS | &quot;migration_new_ltfs_to_new_ltfs&quot;
FULL_BACKUP | &quot;full_backup&quot;
INCREMENTAL_BACKUP | &quot;incremental_backup&quot;
DATA_ENRICHMENT_GOOGLE_VISION | &quot;data_enrichment_google_vision&quot;
DATA_ENRICHMENT_DEPTHEN | &quot;data_enrichment_depthen&quot;



## Enum: StatusEnum

Name | Value
---- | -----
NOT_ACTIVATED | &quot;not_activated&quot;
DONE | &quot;done&quot;
IN_PROGRESS | &quot;in_progress&quot;
ERROR | &quot;error&quot;
PAUSED | &quot;paused&quot;
STOPPED_BY_SYSTEM | &quot;stopped_by_system&quot;
IN_QUEUE | &quot;in_queue&quot;
FINISHED_WITH_WARNINGS | &quot;finished_with_warnings&quot;
CALCULATING | &quot;calculating&quot;
STOPPED_BY_USER | &quot;stopped_by_user&quot;



