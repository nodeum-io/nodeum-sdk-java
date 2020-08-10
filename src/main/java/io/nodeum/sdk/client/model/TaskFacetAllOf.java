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
 * TaskFacetAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-10T06:37:58.200Z[GMT]")
public class TaskFacetAllOf {
  public static final String SERIALIZED_NAME_TO_PROCESS_SIZE_SUM = "to_process_size_sum";
  @SerializedName(SERIALIZED_NAME_TO_PROCESS_SIZE_SUM)
  private Integer toProcessSizeSum;

  public static final String SERIALIZED_NAME_PROCESSED_SIZE_SUM = "processed_size_sum";
  @SerializedName(SERIALIZED_NAME_PROCESSED_SIZE_SUM)
  private Integer processedSizeSum;

  public static final String SERIALIZED_NAME_TO_PROCESS_FILES_SUM = "to_process_files_sum";
  @SerializedName(SERIALIZED_NAME_TO_PROCESS_FILES_SUM)
  private Integer toProcessFilesSum;

  public static final String SERIALIZED_NAME_PROCESSED_FILES_SUM = "processed_files_sum";
  @SerializedName(SERIALIZED_NAME_PROCESSED_FILES_SUM)
  private Integer processedFilesSum;

  public static final String SERIALIZED_NAME_FINALIZED_FILES_SUM = "finalized_files_sum";
  @SerializedName(SERIALIZED_NAME_FINALIZED_FILES_SUM)
  private Integer finalizedFilesSum;

  public static final String SERIALIZED_NAME_BANDWIDTH_AVG = "bandwidth_avg";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH_AVG)
  private Integer bandwidthAvg;

  public static final String SERIALIZED_NAME_BANDWIDTH_COUNT = "bandwidth_count";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH_COUNT)
  private Integer bandwidthCount;

  public static final String SERIALIZED_NAME_TASKS_COUNT = "tasks_count";
  @SerializedName(SERIALIZED_NAME_TASKS_COUNT)
  private Integer tasksCount;


   /**
   * Get toProcessSizeSum
   * @return toProcessSizeSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getToProcessSizeSum() {
    return toProcessSizeSum;
  }




   /**
   * Get processedSizeSum
   * @return processedSizeSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProcessedSizeSum() {
    return processedSizeSum;
  }




   /**
   * Get toProcessFilesSum
   * @return toProcessFilesSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getToProcessFilesSum() {
    return toProcessFilesSum;
  }




   /**
   * Get processedFilesSum
   * @return processedFilesSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProcessedFilesSum() {
    return processedFilesSum;
  }




   /**
   * Get finalizedFilesSum
   * @return finalizedFilesSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFinalizedFilesSum() {
    return finalizedFilesSum;
  }




   /**
   * Get bandwidthAvg
   * @return bandwidthAvg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBandwidthAvg() {
    return bandwidthAvg;
  }




   /**
   * Get bandwidthCount
   * @return bandwidthCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBandwidthCount() {
    return bandwidthCount;
  }




   /**
   * Get tasksCount
   * @return tasksCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTasksCount() {
    return tasksCount;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskFacetAllOf taskFacetAllOf = (TaskFacetAllOf) o;
    return Objects.equals(this.toProcessSizeSum, taskFacetAllOf.toProcessSizeSum) &&
        Objects.equals(this.processedSizeSum, taskFacetAllOf.processedSizeSum) &&
        Objects.equals(this.toProcessFilesSum, taskFacetAllOf.toProcessFilesSum) &&
        Objects.equals(this.processedFilesSum, taskFacetAllOf.processedFilesSum) &&
        Objects.equals(this.finalizedFilesSum, taskFacetAllOf.finalizedFilesSum) &&
        Objects.equals(this.bandwidthAvg, taskFacetAllOf.bandwidthAvg) &&
        Objects.equals(this.bandwidthCount, taskFacetAllOf.bandwidthCount) &&
        Objects.equals(this.tasksCount, taskFacetAllOf.tasksCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toProcessSizeSum, processedSizeSum, toProcessFilesSum, processedFilesSum, finalizedFilesSum, bandwidthAvg, bandwidthCount, tasksCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskFacetAllOf {\n");
    sb.append("    toProcessSizeSum: ").append(toIndentedString(toProcessSizeSum)).append("\n");
    sb.append("    processedSizeSum: ").append(toIndentedString(processedSizeSum)).append("\n");
    sb.append("    toProcessFilesSum: ").append(toIndentedString(toProcessFilesSum)).append("\n");
    sb.append("    processedFilesSum: ").append(toIndentedString(processedFilesSum)).append("\n");
    sb.append("    finalizedFilesSum: ").append(toIndentedString(finalizedFilesSum)).append("\n");
    sb.append("    bandwidthAvg: ").append(toIndentedString(bandwidthAvg)).append("\n");
    sb.append("    bandwidthCount: ").append(toIndentedString(bandwidthCount)).append("\n");
    sb.append("    tasksCount: ").append(toIndentedString(tasksCount)).append("\n");
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
