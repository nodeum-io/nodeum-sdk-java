/*
 * Nodeum API
 * The Nodeum API makes it easy to tap into the digital data mesh that runs across your organisation. Make requests to our API endpoints and we’ll give you everything you need to interconnect your business workflows with your storage.  All production API requests are made to:  http://nodeumhostname/api/  The current production version of the API is v1.   **REST** The Nodeum API is a RESTful API. This means that the API is designed to allow you to get, create, update, & delete objects with the HTTP verbs GET, POST, PUT, PATCH, & DELETE.  **JSON** The Nodeum API speaks exclusively in JSON. This means that you should always set the Content-Type header to application/json to ensure that your requests are properly accepted and processed by the API.  **Authentication** All API calls require user-password authentication.   **Cross-Origin Resource Sharing** The Nodeum API supports CORS for communicating from Javascript for these endpoints. You will need to specify an Origin URI when creating your application to allow for CORS to be whitelisted for your domain.   **Pagination** Some endpoints such as File Listing return a potentially lengthy array of objects. In order to keep the response sizes manageable the API will take advantage of pagination. Pagination is a mechanism for returning a subset of the results for a request and allowing for subsequent requests to “page” through the rest of the results until the end is reached. Paginated endpoints follow a standard interface that accepts two query parameters, limit and offset, and return a payload that follows a standard form. These parameters names and their behavior are borrowed from SQL LIMIT and OFFSET keywords.  **Versioning** The Nodeum API is constantly being worked on to add features, make improvements, and fix bugs. This means that you should expect changes to be introduced and documented.   However, there are some changes or additions that are considered backwards-compatible and your applications should be flexible enough to handle them. These include:  - Adding new endpoints to the API - Adding new attributes to the response of an existing endpoint - Changing the order of attributes of responses (JSON by definition is an object of unordered key/value pairs)  **Filter parameters** When browsing a list of items, multiple filter parameters may be applied. Some operators can be added to the value as a prefix:  - `=` value is equal. Default operator, may be omitted  - `!=` value is different  - `>` greater than  - `>=` greater than or equal  - `<` lower than  - `>=` lower than or equal  - `><` included in list, items should be separated by `|`  - `!><` not included in list, items should be separated by `|`  - `~` pattern matching, may include `%` (any characters) and `_` (one character)  - `!~` pattern not matching, may include `%` (any characters) and `_` (one character)  
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: info@nodeum.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.nodeum.sdk.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TapeStat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-13T15:00:02.241Z[GMT]")
public class TapeStat {
  public static final String SERIALIZED_NAME_LOG_TIME = "log_time";
  @SerializedName(SERIALIZED_NAME_LOG_TIME)
  private String logTime;

  public static final String SERIALIZED_NAME_BARCODE = "barcode";
  @SerializedName(SERIALIZED_NAME_BARCODE)
  private String barcode;

  public static final String SERIALIZED_NAME_MOUNTS = "mounts";
  @SerializedName(SERIALIZED_NAME_MOUNTS)
  private Integer mounts;

  public static final String SERIALIZED_NAME_DATASETS_WRITTEN = "datasets_written";
  @SerializedName(SERIALIZED_NAME_DATASETS_WRITTEN)
  private Integer datasetsWritten;

  public static final String SERIALIZED_NAME_DATASETS_READ = "datasets_read";
  @SerializedName(SERIALIZED_NAME_DATASETS_READ)
  private Integer datasetsRead;

  public static final String SERIALIZED_NAME_RECOVERED_WRITE_DATA_ERRORS = "recovered_write_data_errors";
  @SerializedName(SERIALIZED_NAME_RECOVERED_WRITE_DATA_ERRORS)
  private Integer recoveredWriteDataErrors;

  public static final String SERIALIZED_NAME_UNRECOVERED_WRITE_DATA_ERRORS = "unrecovered_write_data_errors";
  @SerializedName(SERIALIZED_NAME_UNRECOVERED_WRITE_DATA_ERRORS)
  private Integer unrecoveredWriteDataErrors;

  public static final String SERIALIZED_NAME_WRITE_SERVO_ERRORS = "write_servo_errors";
  @SerializedName(SERIALIZED_NAME_WRITE_SERVO_ERRORS)
  private Integer writeServoErrors;

  public static final String SERIALIZED_NAME_UNRECOVERED_WRITE_SERVO_ERRORS = "unrecovered_write_servo_errors";
  @SerializedName(SERIALIZED_NAME_UNRECOVERED_WRITE_SERVO_ERRORS)
  private Integer unrecoveredWriteServoErrors;

  public static final String SERIALIZED_NAME_RECOVERED_READ_ERRORS = "recovered_read_errors";
  @SerializedName(SERIALIZED_NAME_RECOVERED_READ_ERRORS)
  private Integer recoveredReadErrors;

  public static final String SERIALIZED_NAME_UNRECOVERED_READ_ERRORS = "unrecovered_read_errors";
  @SerializedName(SERIALIZED_NAME_UNRECOVERED_READ_ERRORS)
  private Integer unrecoveredReadErrors;

  public static final String SERIALIZED_NAME_LAST_MOUNT_UNRECOVERED_WRITE_ERRORS = "last_mount_unrecovered_write_errors";
  @SerializedName(SERIALIZED_NAME_LAST_MOUNT_UNRECOVERED_WRITE_ERRORS)
  private Integer lastMountUnrecoveredWriteErrors;

  public static final String SERIALIZED_NAME_LAST_MOUNT_UNRECOVERED_READ_ERRORS = "last_mount_unrecovered_read_errors";
  @SerializedName(SERIALIZED_NAME_LAST_MOUNT_UNRECOVERED_READ_ERRORS)
  private Integer lastMountUnrecoveredReadErrors;

  public static final String SERIALIZED_NAME_LAST_MOUNT_MBYTES_WRITTEN = "last_mount_mbytes_written";
  @SerializedName(SERIALIZED_NAME_LAST_MOUNT_MBYTES_WRITTEN)
  private Integer lastMountMbytesWritten;

  public static final String SERIALIZED_NAME_LAST_MOUNT_MBYTES_READ = "last_mount_mbytes_read";
  @SerializedName(SERIALIZED_NAME_LAST_MOUNT_MBYTES_READ)
  private Integer lastMountMbytesRead;

  public static final String SERIALIZED_NAME_LIFETIME_MBYTES_WRITTEN = "lifetime_mbytes_written";
  @SerializedName(SERIALIZED_NAME_LIFETIME_MBYTES_WRITTEN)
  private Integer lifetimeMbytesWritten;

  public static final String SERIALIZED_NAME_LIFETIME_MBYTES_READ = "lifetime_mbytes_read";
  @SerializedName(SERIALIZED_NAME_LIFETIME_MBYTES_READ)
  private Integer lifetimeMbytesRead;

  public static final String SERIALIZED_NAME_LAST_LOAD_WRITE_COMPRESSION_RATIO = "last_load_write_compression_ratio";
  @SerializedName(SERIALIZED_NAME_LAST_LOAD_WRITE_COMPRESSION_RATIO)
  private Integer lastLoadWriteCompressionRatio;

  public static final String SERIALIZED_NAME_LAST_LOAD_READ_COMPRESSION_RATIO = "last_load_read_compression_ratio";
  @SerializedName(SERIALIZED_NAME_LAST_LOAD_READ_COMPRESSION_RATIO)
  private Integer lastLoadReadCompressionRatio;

  public static final String SERIALIZED_NAME_MEDIUM_MOUNT_TIME = "medium_mount_time";
  @SerializedName(SERIALIZED_NAME_MEDIUM_MOUNT_TIME)
  private Integer mediumMountTime;

  public static final String SERIALIZED_NAME_MEDIUM_READY_TIME = "medium_ready_time";
  @SerializedName(SERIALIZED_NAME_MEDIUM_READY_TIME)
  private Integer mediumReadyTime;

  public static final String SERIALIZED_NAME_TOTAL_NATIVE_CAPACITY = "total_native_capacity";
  @SerializedName(SERIALIZED_NAME_TOTAL_NATIVE_CAPACITY)
  private Integer totalNativeCapacity;

  public static final String SERIALIZED_NAME_TOTAL_USED_NATIVE_CAPACITY = "total_used_native_capacity";
  @SerializedName(SERIALIZED_NAME_TOTAL_USED_NATIVE_CAPACITY)
  private Integer totalUsedNativeCapacity;

  public static final String SERIALIZED_NAME_WRITE_PROTECT = "write_protect";
  @SerializedName(SERIALIZED_NAME_WRITE_PROTECT)
  private Integer writeProtect;

  public static final String SERIALIZED_NAME_WORM = "worm";
  @SerializedName(SERIALIZED_NAME_WORM)
  private Integer worm;

  public static final String SERIALIZED_NAME_BEGINNING_OF_MEDIUM_PASSES = "beginning_of_medium_passes";
  @SerializedName(SERIALIZED_NAME_BEGINNING_OF_MEDIUM_PASSES)
  private Integer beginningOfMediumPasses;

  public static final String SERIALIZED_NAME_MIDDLE_OF_TAPE_PASSES = "middle_of_tape_passes";
  @SerializedName(SERIALIZED_NAME_MIDDLE_OF_TAPE_PASSES)
  private Integer middleOfTapePasses;

  public static final String SERIALIZED_NAME_READ_COMPRESSION_RATIO = "read_compression_ratio";
  @SerializedName(SERIALIZED_NAME_READ_COMPRESSION_RATIO)
  private Integer readCompressionRatio;

  public static final String SERIALIZED_NAME_WRITE_COMPRESSION_RATIO = "write_compression_ratio";
  @SerializedName(SERIALIZED_NAME_WRITE_COMPRESSION_RATIO)
  private Integer writeCompressionRatio;

  public static final String SERIALIZED_NAME_MBYTES_TRANSFERRED_TO_APP_CLIENT = "mbytes_transferred_to_app_client";
  @SerializedName(SERIALIZED_NAME_MBYTES_TRANSFERRED_TO_APP_CLIENT)
  private Integer mbytesTransferredToAppClient;

  public static final String SERIALIZED_NAME_BYTES_TRANSFERRED_TO_APP_CLIENT = "bytes_transferred_to_app_client";
  @SerializedName(SERIALIZED_NAME_BYTES_TRANSFERRED_TO_APP_CLIENT)
  private Integer bytesTransferredToAppClient;

  public static final String SERIALIZED_NAME_MBYTES_READ_FROM_MEDIUM = "mbytes_read_from_medium";
  @SerializedName(SERIALIZED_NAME_MBYTES_READ_FROM_MEDIUM)
  private Integer mbytesReadFromMedium;

  public static final String SERIALIZED_NAME_BYTES_READ_FROM_MEDIUM = "bytes_read_from_medium";
  @SerializedName(SERIALIZED_NAME_BYTES_READ_FROM_MEDIUM)
  private Integer bytesReadFromMedium;

  public static final String SERIALIZED_NAME_MBYTES_TRANSFERRED_FROM_APP_CLIENT = "mbytes_transferred_from_app_client";
  @SerializedName(SERIALIZED_NAME_MBYTES_TRANSFERRED_FROM_APP_CLIENT)
  private Integer mbytesTransferredFromAppClient;

  public static final String SERIALIZED_NAME_BYTES_TRANSFERRED_FROM_APP_CLIENT = "bytes_transferred_from_app_client";
  @SerializedName(SERIALIZED_NAME_BYTES_TRANSFERRED_FROM_APP_CLIENT)
  private Integer bytesTransferredFromAppClient;

  public static final String SERIALIZED_NAME_MBYTES_WRITTEN_TO_MEDIUM = "mbytes_written_to_medium";
  @SerializedName(SERIALIZED_NAME_MBYTES_WRITTEN_TO_MEDIUM)
  private Integer mbytesWrittenToMedium;

  public static final String SERIALIZED_NAME_BYTES_WRITTEN_TO_MEDIUM = "bytes_written_to_medium";
  @SerializedName(SERIALIZED_NAME_BYTES_WRITTEN_TO_MEDIUM)
  private Integer bytesWrittenToMedium;

  public static final String SERIALIZED_NAME_DATA_COMPRESSION_ENABLED = "data_compression_enabled";
  @SerializedName(SERIALIZED_NAME_DATA_COMPRESSION_ENABLED)
  private Integer dataCompressionEnabled;

  public static final String SERIALIZED_NAME_WRITE_RETRIES = "write_retries";
  @SerializedName(SERIALIZED_NAME_WRITE_RETRIES)
  private Integer writeRetries;

  public static final String SERIALIZED_NAME_WRITE_PERMS = "write_perms";
  @SerializedName(SERIALIZED_NAME_WRITE_PERMS)
  private Integer writePerms;

  public static final String SERIALIZED_NAME_SUSPENDED_WRITES = "suspended_writes";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_WRITES)
  private Integer suspendedWrites;

  public static final String SERIALIZED_NAME_FATAL_SUSPENDED_WRITES = "fatal_suspended_writes";
  @SerializedName(SERIALIZED_NAME_FATAL_SUSPENDED_WRITES)
  private Integer fatalSuspendedWrites;

  public static final String SERIALIZED_NAME_READ_RETRIES = "read_retries";
  @SerializedName(SERIALIZED_NAME_READ_RETRIES)
  private Integer readRetries;

  public static final String SERIALIZED_NAME_READ_PERMS = "read_perms";
  @SerializedName(SERIALIZED_NAME_READ_PERMS)
  private Integer readPerms;

  public static final String SERIALIZED_NAME_SUSPENDED_READS = "suspended_reads";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_READS)
  private Integer suspendedReads;

  public static final String SERIALIZED_NAME_FATAL_SUSPENDED_READS = "fatal_suspended_reads";
  @SerializedName(SERIALIZED_NAME_FATAL_SUSPENDED_READS)
  private Integer fatalSuspendedReads;

  public static final String SERIALIZED_NAME_PARTITION0_REMAINING_CAPACITY = "partition_0_remaining_capacity";
  @SerializedName(SERIALIZED_NAME_PARTITION0_REMAINING_CAPACITY)
  private Integer partition0RemainingCapacity;

  public static final String SERIALIZED_NAME_PARTITION1_REMAINING_CAPACITY = "partition_1_remaining_capacity";
  @SerializedName(SERIALIZED_NAME_PARTITION1_REMAINING_CAPACITY)
  private Integer partition1RemainingCapacity;

  public static final String SERIALIZED_NAME_PARTITION0_MAXIMUM_CAPACITY = "partition_0_maximum_capacity";
  @SerializedName(SERIALIZED_NAME_PARTITION0_MAXIMUM_CAPACITY)
  private Integer partition0MaximumCapacity;

  public static final String SERIALIZED_NAME_PARTITION1_MAXIMUM_CAPACITY = "partition_1_maximum_capacity";
  @SerializedName(SERIALIZED_NAME_PARTITION1_MAXIMUM_CAPACITY)
  private Integer partition1MaximumCapacity;


   /**
   * Get logTime
   * @return logTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogTime() {
    return logTime;
  }




   /**
   * Get barcode
   * @return barcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBarcode() {
    return barcode;
  }




   /**
   * Get mounts
   * @return mounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMounts() {
    return mounts;
  }




   /**
   * Get datasetsWritten
   * @return datasetsWritten
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDatasetsWritten() {
    return datasetsWritten;
  }




   /**
   * Get datasetsRead
   * @return datasetsRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDatasetsRead() {
    return datasetsRead;
  }




   /**
   * Get recoveredWriteDataErrors
   * @return recoveredWriteDataErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRecoveredWriteDataErrors() {
    return recoveredWriteDataErrors;
  }




   /**
   * Get unrecoveredWriteDataErrors
   * @return unrecoveredWriteDataErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUnrecoveredWriteDataErrors() {
    return unrecoveredWriteDataErrors;
  }




   /**
   * Get writeServoErrors
   * @return writeServoErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWriteServoErrors() {
    return writeServoErrors;
  }




   /**
   * Get unrecoveredWriteServoErrors
   * @return unrecoveredWriteServoErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUnrecoveredWriteServoErrors() {
    return unrecoveredWriteServoErrors;
  }




   /**
   * Get recoveredReadErrors
   * @return recoveredReadErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRecoveredReadErrors() {
    return recoveredReadErrors;
  }




   /**
   * Get unrecoveredReadErrors
   * @return unrecoveredReadErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUnrecoveredReadErrors() {
    return unrecoveredReadErrors;
  }




   /**
   * Get lastMountUnrecoveredWriteErrors
   * @return lastMountUnrecoveredWriteErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastMountUnrecoveredWriteErrors() {
    return lastMountUnrecoveredWriteErrors;
  }




   /**
   * Get lastMountUnrecoveredReadErrors
   * @return lastMountUnrecoveredReadErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastMountUnrecoveredReadErrors() {
    return lastMountUnrecoveredReadErrors;
  }




   /**
   * Get lastMountMbytesWritten
   * @return lastMountMbytesWritten
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastMountMbytesWritten() {
    return lastMountMbytesWritten;
  }




   /**
   * Get lastMountMbytesRead
   * @return lastMountMbytesRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastMountMbytesRead() {
    return lastMountMbytesRead;
  }




   /**
   * Get lifetimeMbytesWritten
   * @return lifetimeMbytesWritten
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLifetimeMbytesWritten() {
    return lifetimeMbytesWritten;
  }




   /**
   * Get lifetimeMbytesRead
   * @return lifetimeMbytesRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLifetimeMbytesRead() {
    return lifetimeMbytesRead;
  }




   /**
   * Get lastLoadWriteCompressionRatio
   * @return lastLoadWriteCompressionRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastLoadWriteCompressionRatio() {
    return lastLoadWriteCompressionRatio;
  }




   /**
   * Get lastLoadReadCompressionRatio
   * @return lastLoadReadCompressionRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastLoadReadCompressionRatio() {
    return lastLoadReadCompressionRatio;
  }




   /**
   * Get mediumMountTime
   * @return mediumMountTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMediumMountTime() {
    return mediumMountTime;
  }




   /**
   * Get mediumReadyTime
   * @return mediumReadyTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMediumReadyTime() {
    return mediumReadyTime;
  }




   /**
   * Get totalNativeCapacity
   * @return totalNativeCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalNativeCapacity() {
    return totalNativeCapacity;
  }




   /**
   * Get totalUsedNativeCapacity
   * @return totalUsedNativeCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalUsedNativeCapacity() {
    return totalUsedNativeCapacity;
  }




   /**
   * Get writeProtect
   * @return writeProtect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWriteProtect() {
    return writeProtect;
  }




   /**
   * Get worm
   * @return worm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWorm() {
    return worm;
  }




   /**
   * Get beginningOfMediumPasses
   * @return beginningOfMediumPasses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBeginningOfMediumPasses() {
    return beginningOfMediumPasses;
  }




   /**
   * Get middleOfTapePasses
   * @return middleOfTapePasses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMiddleOfTapePasses() {
    return middleOfTapePasses;
  }




   /**
   * Get readCompressionRatio
   * @return readCompressionRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReadCompressionRatio() {
    return readCompressionRatio;
  }




   /**
   * Get writeCompressionRatio
   * @return writeCompressionRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWriteCompressionRatio() {
    return writeCompressionRatio;
  }




   /**
   * Get mbytesTransferredToAppClient
   * @return mbytesTransferredToAppClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMbytesTransferredToAppClient() {
    return mbytesTransferredToAppClient;
  }




   /**
   * Get bytesTransferredToAppClient
   * @return bytesTransferredToAppClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBytesTransferredToAppClient() {
    return bytesTransferredToAppClient;
  }




   /**
   * Get mbytesReadFromMedium
   * @return mbytesReadFromMedium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMbytesReadFromMedium() {
    return mbytesReadFromMedium;
  }




   /**
   * Get bytesReadFromMedium
   * @return bytesReadFromMedium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBytesReadFromMedium() {
    return bytesReadFromMedium;
  }




   /**
   * Get mbytesTransferredFromAppClient
   * @return mbytesTransferredFromAppClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMbytesTransferredFromAppClient() {
    return mbytesTransferredFromAppClient;
  }




   /**
   * Get bytesTransferredFromAppClient
   * @return bytesTransferredFromAppClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBytesTransferredFromAppClient() {
    return bytesTransferredFromAppClient;
  }




   /**
   * Get mbytesWrittenToMedium
   * @return mbytesWrittenToMedium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMbytesWrittenToMedium() {
    return mbytesWrittenToMedium;
  }




   /**
   * Get bytesWrittenToMedium
   * @return bytesWrittenToMedium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBytesWrittenToMedium() {
    return bytesWrittenToMedium;
  }




   /**
   * Get dataCompressionEnabled
   * @return dataCompressionEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDataCompressionEnabled() {
    return dataCompressionEnabled;
  }




   /**
   * Get writeRetries
   * @return writeRetries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWriteRetries() {
    return writeRetries;
  }




   /**
   * Get writePerms
   * @return writePerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWritePerms() {
    return writePerms;
  }




   /**
   * Get suspendedWrites
   * @return suspendedWrites
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuspendedWrites() {
    return suspendedWrites;
  }




   /**
   * Get fatalSuspendedWrites
   * @return fatalSuspendedWrites
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFatalSuspendedWrites() {
    return fatalSuspendedWrites;
  }




   /**
   * Get readRetries
   * @return readRetries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReadRetries() {
    return readRetries;
  }




   /**
   * Get readPerms
   * @return readPerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReadPerms() {
    return readPerms;
  }




   /**
   * Get suspendedReads
   * @return suspendedReads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuspendedReads() {
    return suspendedReads;
  }




   /**
   * Get fatalSuspendedReads
   * @return fatalSuspendedReads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFatalSuspendedReads() {
    return fatalSuspendedReads;
  }




   /**
   * Get partition0RemainingCapacity
   * @return partition0RemainingCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPartition0RemainingCapacity() {
    return partition0RemainingCapacity;
  }




   /**
   * Get partition1RemainingCapacity
   * @return partition1RemainingCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPartition1RemainingCapacity() {
    return partition1RemainingCapacity;
  }




   /**
   * Get partition0MaximumCapacity
   * @return partition0MaximumCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPartition0MaximumCapacity() {
    return partition0MaximumCapacity;
  }




   /**
   * Get partition1MaximumCapacity
   * @return partition1MaximumCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPartition1MaximumCapacity() {
    return partition1MaximumCapacity;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapeStat tapeStat = (TapeStat) o;
    return Objects.equals(this.logTime, tapeStat.logTime) &&
        Objects.equals(this.barcode, tapeStat.barcode) &&
        Objects.equals(this.mounts, tapeStat.mounts) &&
        Objects.equals(this.datasetsWritten, tapeStat.datasetsWritten) &&
        Objects.equals(this.datasetsRead, tapeStat.datasetsRead) &&
        Objects.equals(this.recoveredWriteDataErrors, tapeStat.recoveredWriteDataErrors) &&
        Objects.equals(this.unrecoveredWriteDataErrors, tapeStat.unrecoveredWriteDataErrors) &&
        Objects.equals(this.writeServoErrors, tapeStat.writeServoErrors) &&
        Objects.equals(this.unrecoveredWriteServoErrors, tapeStat.unrecoveredWriteServoErrors) &&
        Objects.equals(this.recoveredReadErrors, tapeStat.recoveredReadErrors) &&
        Objects.equals(this.unrecoveredReadErrors, tapeStat.unrecoveredReadErrors) &&
        Objects.equals(this.lastMountUnrecoveredWriteErrors, tapeStat.lastMountUnrecoveredWriteErrors) &&
        Objects.equals(this.lastMountUnrecoveredReadErrors, tapeStat.lastMountUnrecoveredReadErrors) &&
        Objects.equals(this.lastMountMbytesWritten, tapeStat.lastMountMbytesWritten) &&
        Objects.equals(this.lastMountMbytesRead, tapeStat.lastMountMbytesRead) &&
        Objects.equals(this.lifetimeMbytesWritten, tapeStat.lifetimeMbytesWritten) &&
        Objects.equals(this.lifetimeMbytesRead, tapeStat.lifetimeMbytesRead) &&
        Objects.equals(this.lastLoadWriteCompressionRatio, tapeStat.lastLoadWriteCompressionRatio) &&
        Objects.equals(this.lastLoadReadCompressionRatio, tapeStat.lastLoadReadCompressionRatio) &&
        Objects.equals(this.mediumMountTime, tapeStat.mediumMountTime) &&
        Objects.equals(this.mediumReadyTime, tapeStat.mediumReadyTime) &&
        Objects.equals(this.totalNativeCapacity, tapeStat.totalNativeCapacity) &&
        Objects.equals(this.totalUsedNativeCapacity, tapeStat.totalUsedNativeCapacity) &&
        Objects.equals(this.writeProtect, tapeStat.writeProtect) &&
        Objects.equals(this.worm, tapeStat.worm) &&
        Objects.equals(this.beginningOfMediumPasses, tapeStat.beginningOfMediumPasses) &&
        Objects.equals(this.middleOfTapePasses, tapeStat.middleOfTapePasses) &&
        Objects.equals(this.readCompressionRatio, tapeStat.readCompressionRatio) &&
        Objects.equals(this.writeCompressionRatio, tapeStat.writeCompressionRatio) &&
        Objects.equals(this.mbytesTransferredToAppClient, tapeStat.mbytesTransferredToAppClient) &&
        Objects.equals(this.bytesTransferredToAppClient, tapeStat.bytesTransferredToAppClient) &&
        Objects.equals(this.mbytesReadFromMedium, tapeStat.mbytesReadFromMedium) &&
        Objects.equals(this.bytesReadFromMedium, tapeStat.bytesReadFromMedium) &&
        Objects.equals(this.mbytesTransferredFromAppClient, tapeStat.mbytesTransferredFromAppClient) &&
        Objects.equals(this.bytesTransferredFromAppClient, tapeStat.bytesTransferredFromAppClient) &&
        Objects.equals(this.mbytesWrittenToMedium, tapeStat.mbytesWrittenToMedium) &&
        Objects.equals(this.bytesWrittenToMedium, tapeStat.bytesWrittenToMedium) &&
        Objects.equals(this.dataCompressionEnabled, tapeStat.dataCompressionEnabled) &&
        Objects.equals(this.writeRetries, tapeStat.writeRetries) &&
        Objects.equals(this.writePerms, tapeStat.writePerms) &&
        Objects.equals(this.suspendedWrites, tapeStat.suspendedWrites) &&
        Objects.equals(this.fatalSuspendedWrites, tapeStat.fatalSuspendedWrites) &&
        Objects.equals(this.readRetries, tapeStat.readRetries) &&
        Objects.equals(this.readPerms, tapeStat.readPerms) &&
        Objects.equals(this.suspendedReads, tapeStat.suspendedReads) &&
        Objects.equals(this.fatalSuspendedReads, tapeStat.fatalSuspendedReads) &&
        Objects.equals(this.partition0RemainingCapacity, tapeStat.partition0RemainingCapacity) &&
        Objects.equals(this.partition1RemainingCapacity, tapeStat.partition1RemainingCapacity) &&
        Objects.equals(this.partition0MaximumCapacity, tapeStat.partition0MaximumCapacity) &&
        Objects.equals(this.partition1MaximumCapacity, tapeStat.partition1MaximumCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logTime, barcode, mounts, datasetsWritten, datasetsRead, recoveredWriteDataErrors, unrecoveredWriteDataErrors, writeServoErrors, unrecoveredWriteServoErrors, recoveredReadErrors, unrecoveredReadErrors, lastMountUnrecoveredWriteErrors, lastMountUnrecoveredReadErrors, lastMountMbytesWritten, lastMountMbytesRead, lifetimeMbytesWritten, lifetimeMbytesRead, lastLoadWriteCompressionRatio, lastLoadReadCompressionRatio, mediumMountTime, mediumReadyTime, totalNativeCapacity, totalUsedNativeCapacity, writeProtect, worm, beginningOfMediumPasses, middleOfTapePasses, readCompressionRatio, writeCompressionRatio, mbytesTransferredToAppClient, bytesTransferredToAppClient, mbytesReadFromMedium, bytesReadFromMedium, mbytesTransferredFromAppClient, bytesTransferredFromAppClient, mbytesWrittenToMedium, bytesWrittenToMedium, dataCompressionEnabled, writeRetries, writePerms, suspendedWrites, fatalSuspendedWrites, readRetries, readPerms, suspendedReads, fatalSuspendedReads, partition0RemainingCapacity, partition1RemainingCapacity, partition0MaximumCapacity, partition1MaximumCapacity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapeStat {\n");
    sb.append("    logTime: ").append(toIndentedString(logTime)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    datasetsWritten: ").append(toIndentedString(datasetsWritten)).append("\n");
    sb.append("    datasetsRead: ").append(toIndentedString(datasetsRead)).append("\n");
    sb.append("    recoveredWriteDataErrors: ").append(toIndentedString(recoveredWriteDataErrors)).append("\n");
    sb.append("    unrecoveredWriteDataErrors: ").append(toIndentedString(unrecoveredWriteDataErrors)).append("\n");
    sb.append("    writeServoErrors: ").append(toIndentedString(writeServoErrors)).append("\n");
    sb.append("    unrecoveredWriteServoErrors: ").append(toIndentedString(unrecoveredWriteServoErrors)).append("\n");
    sb.append("    recoveredReadErrors: ").append(toIndentedString(recoveredReadErrors)).append("\n");
    sb.append("    unrecoveredReadErrors: ").append(toIndentedString(unrecoveredReadErrors)).append("\n");
    sb.append("    lastMountUnrecoveredWriteErrors: ").append(toIndentedString(lastMountUnrecoveredWriteErrors)).append("\n");
    sb.append("    lastMountUnrecoveredReadErrors: ").append(toIndentedString(lastMountUnrecoveredReadErrors)).append("\n");
    sb.append("    lastMountMbytesWritten: ").append(toIndentedString(lastMountMbytesWritten)).append("\n");
    sb.append("    lastMountMbytesRead: ").append(toIndentedString(lastMountMbytesRead)).append("\n");
    sb.append("    lifetimeMbytesWritten: ").append(toIndentedString(lifetimeMbytesWritten)).append("\n");
    sb.append("    lifetimeMbytesRead: ").append(toIndentedString(lifetimeMbytesRead)).append("\n");
    sb.append("    lastLoadWriteCompressionRatio: ").append(toIndentedString(lastLoadWriteCompressionRatio)).append("\n");
    sb.append("    lastLoadReadCompressionRatio: ").append(toIndentedString(lastLoadReadCompressionRatio)).append("\n");
    sb.append("    mediumMountTime: ").append(toIndentedString(mediumMountTime)).append("\n");
    sb.append("    mediumReadyTime: ").append(toIndentedString(mediumReadyTime)).append("\n");
    sb.append("    totalNativeCapacity: ").append(toIndentedString(totalNativeCapacity)).append("\n");
    sb.append("    totalUsedNativeCapacity: ").append(toIndentedString(totalUsedNativeCapacity)).append("\n");
    sb.append("    writeProtect: ").append(toIndentedString(writeProtect)).append("\n");
    sb.append("    worm: ").append(toIndentedString(worm)).append("\n");
    sb.append("    beginningOfMediumPasses: ").append(toIndentedString(beginningOfMediumPasses)).append("\n");
    sb.append("    middleOfTapePasses: ").append(toIndentedString(middleOfTapePasses)).append("\n");
    sb.append("    readCompressionRatio: ").append(toIndentedString(readCompressionRatio)).append("\n");
    sb.append("    writeCompressionRatio: ").append(toIndentedString(writeCompressionRatio)).append("\n");
    sb.append("    mbytesTransferredToAppClient: ").append(toIndentedString(mbytesTransferredToAppClient)).append("\n");
    sb.append("    bytesTransferredToAppClient: ").append(toIndentedString(bytesTransferredToAppClient)).append("\n");
    sb.append("    mbytesReadFromMedium: ").append(toIndentedString(mbytesReadFromMedium)).append("\n");
    sb.append("    bytesReadFromMedium: ").append(toIndentedString(bytesReadFromMedium)).append("\n");
    sb.append("    mbytesTransferredFromAppClient: ").append(toIndentedString(mbytesTransferredFromAppClient)).append("\n");
    sb.append("    bytesTransferredFromAppClient: ").append(toIndentedString(bytesTransferredFromAppClient)).append("\n");
    sb.append("    mbytesWrittenToMedium: ").append(toIndentedString(mbytesWrittenToMedium)).append("\n");
    sb.append("    bytesWrittenToMedium: ").append(toIndentedString(bytesWrittenToMedium)).append("\n");
    sb.append("    dataCompressionEnabled: ").append(toIndentedString(dataCompressionEnabled)).append("\n");
    sb.append("    writeRetries: ").append(toIndentedString(writeRetries)).append("\n");
    sb.append("    writePerms: ").append(toIndentedString(writePerms)).append("\n");
    sb.append("    suspendedWrites: ").append(toIndentedString(suspendedWrites)).append("\n");
    sb.append("    fatalSuspendedWrites: ").append(toIndentedString(fatalSuspendedWrites)).append("\n");
    sb.append("    readRetries: ").append(toIndentedString(readRetries)).append("\n");
    sb.append("    readPerms: ").append(toIndentedString(readPerms)).append("\n");
    sb.append("    suspendedReads: ").append(toIndentedString(suspendedReads)).append("\n");
    sb.append("    fatalSuspendedReads: ").append(toIndentedString(fatalSuspendedReads)).append("\n");
    sb.append("    partition0RemainingCapacity: ").append(toIndentedString(partition0RemainingCapacity)).append("\n");
    sb.append("    partition1RemainingCapacity: ").append(toIndentedString(partition1RemainingCapacity)).append("\n");
    sb.append("    partition0MaximumCapacity: ").append(toIndentedString(partition0MaximumCapacity)).append("\n");
    sb.append("    partition1MaximumCapacity: ").append(toIndentedString(partition1MaximumCapacity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
