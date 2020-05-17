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
import java.util.ArrayList;
import java.util.List;

/**
 * TaskSourceUp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-17T20:02:36.953Z[GMT]")
public class TaskSourceUp {
  public static final String SERIALIZED_NAME_FILE_ID = "file_id";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private Integer fileId;

  public static final String SERIALIZED_NAME_FILE_PATH = "file_path";
  @SerializedName(SERIALIZED_NAME_FILE_PATH)
  private String filePath;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private List<Integer> range = null;

  public static final String SERIALIZED_NAME_IMPORT_FILE_ID = "import_file_id";
  @SerializedName(SERIALIZED_NAME_IMPORT_FILE_ID)
  private Integer importFileId;

  public static final String SERIALIZED_NAME_IMPORT_FILE_PATH = "import_file_path";
  @SerializedName(SERIALIZED_NAME_IMPORT_FILE_PATH)
  private String importFilePath;

  public static final String SERIALIZED_NAME_TAPE_ID = "tape_id";
  @SerializedName(SERIALIZED_NAME_TAPE_ID)
  private Integer tapeId;

  public static final String SERIALIZED_NAME_TAPE_BARCODE = "tape_barcode";
  @SerializedName(SERIALIZED_NAME_TAPE_BARCODE)
  private String tapeBarcode;

  public static final String SERIALIZED_NAME_POOL_ID = "pool_id";
  @SerializedName(SERIALIZED_NAME_POOL_ID)
  private Integer poolId;

  public static final String SERIALIZED_NAME_POOL_NAME = "pool_name";
  @SerializedName(SERIALIZED_NAME_POOL_NAME)
  private String poolName;


  public TaskSourceUp fileId(Integer fileId) {
    
    this.fileId = fileId;
    return this;
  }

   /**
   * Get fileId
   * @return fileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFileId() {
    return fileId;
  }


  public void setFileId(Integer fileId) {
    this.fileId = fileId;
  }


  public TaskSourceUp filePath(String filePath) {
    
    this.filePath = filePath;
    return this;
  }

   /**
   * Get filePath
   * @return filePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFilePath() {
    return filePath;
  }


  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }


  public TaskSourceUp range(List<Integer> range) {
    
    this.range = range;
    return this;
  }

  public TaskSourceUp addRangeItem(Integer rangeItem) {
    if (this.range == null) {
      this.range = new ArrayList<Integer>();
    }
    this.range.add(rangeItem);
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[150000, 290000]", value = "")

  public List<Integer> getRange() {
    return range;
  }


  public void setRange(List<Integer> range) {
    this.range = range;
  }


  public TaskSourceUp importFileId(Integer importFileId) {
    
    this.importFileId = importFileId;
    return this;
  }

   /**
   * Get importFileId
   * @return importFileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getImportFileId() {
    return importFileId;
  }


  public void setImportFileId(Integer importFileId) {
    this.importFileId = importFileId;
  }


  public TaskSourceUp importFilePath(String importFilePath) {
    
    this.importFilePath = importFilePath;
    return this;
  }

   /**
   * Get importFilePath
   * @return importFilePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImportFilePath() {
    return importFilePath;
  }


  public void setImportFilePath(String importFilePath) {
    this.importFilePath = importFilePath;
  }


  public TaskSourceUp tapeId(Integer tapeId) {
    
    this.tapeId = tapeId;
    return this;
  }

   /**
   * Get tapeId
   * @return tapeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTapeId() {
    return tapeId;
  }


  public void setTapeId(Integer tapeId) {
    this.tapeId = tapeId;
  }


  public TaskSourceUp tapeBarcode(String tapeBarcode) {
    
    this.tapeBarcode = tapeBarcode;
    return this;
  }

   /**
   * Get tapeBarcode
   * @return tapeBarcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTapeBarcode() {
    return tapeBarcode;
  }


  public void setTapeBarcode(String tapeBarcode) {
    this.tapeBarcode = tapeBarcode;
  }


  public TaskSourceUp poolId(Integer poolId) {
    
    this.poolId = poolId;
    return this;
  }

   /**
   * Get poolId
   * @return poolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPoolId() {
    return poolId;
  }


  public void setPoolId(Integer poolId) {
    this.poolId = poolId;
  }


  public TaskSourceUp poolName(String poolName) {
    
    this.poolName = poolName;
    return this;
  }

   /**
   * Get poolName
   * @return poolName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPoolName() {
    return poolName;
  }


  public void setPoolName(String poolName) {
    this.poolName = poolName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSourceUp taskSourceUp = (TaskSourceUp) o;
    return Objects.equals(this.fileId, taskSourceUp.fileId) &&
        Objects.equals(this.filePath, taskSourceUp.filePath) &&
        Objects.equals(this.range, taskSourceUp.range) &&
        Objects.equals(this.importFileId, taskSourceUp.importFileId) &&
        Objects.equals(this.importFilePath, taskSourceUp.importFilePath) &&
        Objects.equals(this.tapeId, taskSourceUp.tapeId) &&
        Objects.equals(this.tapeBarcode, taskSourceUp.tapeBarcode) &&
        Objects.equals(this.poolId, taskSourceUp.poolId) &&
        Objects.equals(this.poolName, taskSourceUp.poolName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, filePath, range, importFileId, importFilePath, tapeId, tapeBarcode, poolId, poolName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSourceUp {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    importFileId: ").append(toIndentedString(importFileId)).append("\n");
    sb.append("    importFilePath: ").append(toIndentedString(importFilePath)).append("\n");
    sb.append("    tapeId: ").append(toIndentedString(tapeId)).append("\n");
    sb.append("    tapeBarcode: ").append(toIndentedString(tapeBarcode)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
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

