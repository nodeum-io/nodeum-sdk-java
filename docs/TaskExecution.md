

# TaskExecution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**taskId** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**workflowType** | [**WorkflowTypeEnum**](#WorkflowTypeEnum) |  |  [optional]
**workflowAction** | [**WorkflowActionEnum**](#WorkflowActionEnum) |  |  [optional]
**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  [optional]
**destinationType** | [**DestinationTypeEnum**](#DestinationTypeEnum) |  |  [optional]
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



## Enum: WorkflowTypeEnum

Name | Value
---- | -----
ACTIVE_ARCHIVE | &quot;active_archive&quot;
OFFLINE_ARCHIVE | &quot;offline_archive&quot;
DATA_EXCHANGE | &quot;data_exchange&quot;
DATA_MIGRATION | &quot;data_migration&quot;
MAINTENANCE | &quot;maintenance&quot;
DATA_ENRICHMENT | &quot;data_enrichment&quot;



## Enum: WorkflowActionEnum

Name | Value
---- | -----
COPY | &quot;copy&quot;
MOVE | &quot;move&quot;
ERASE | &quot;erase&quot;
SCAN | &quot;scan&quot;
REHYDRATATION | &quot;rehydratation&quot;
FORMAT | &quot;format&quot;
CHECK_CONSISTENCY | &quot;check_consistency&quot;
DUPLICATION | &quot;duplication&quot;
CACHE_CLEANING | &quot;cache_cleaning&quot;
EJECTION | &quot;ejection&quot;
GET_INDEX | &quot;get_index&quot;
FULL_BACKUP | &quot;full_backup&quot;
INCREMENTAL_BACKUP | &quot;incremental_backup&quot;



## Enum: SourceTypeEnum

Name | Value
---- | -----
CONTAINER | &quot;container&quot;
PRIMARY_NAS | &quot;primary_nas&quot;
SECONDARY_NAS | &quot;secondary_nas&quot;
PRIMARY_CLOUD | &quot;primary_cloud&quot;
SECONDARY_CLOUD | &quot;secondary_cloud&quot;
SECONDARY_TAPE | &quot;secondary_tape&quot;



## Enum: DestinationTypeEnum

Name | Value
---- | -----
CONTAINER | &quot;container&quot;
PRIMARY_NAS | &quot;primary_nas&quot;
SECONDARY_NAS | &quot;secondary_nas&quot;
PRIMARY_CLOUD | &quot;primary_cloud&quot;
SECONDARY_CLOUD | &quot;secondary_cloud&quot;
SECONDARY_TAPE | &quot;secondary_tape&quot;



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



