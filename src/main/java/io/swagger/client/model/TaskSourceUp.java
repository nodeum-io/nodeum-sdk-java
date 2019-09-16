/*
 * Nodeum API
 * Nodeum API  # Filter parameters When browsing a list of items, multiple filter parameters may be applied. Some operators can be added to the value as a prefix:  - `=` value is equal. Default operator, may be omitted  - `!=` value is different  - `>` greater than  - `>=` greater than or equal  - `<` lower than  - `>=` lower than or equal  - `><` included in list, items should be separated by `|`  - `!><` not included in list, items should be separated by `|`  - `~` pattern matching, may include `%` (any characters) and `_` (one character)  - `!~` pattern not matching, may include `%` (any characters) and `_` (one character)  
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

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
 * TaskSourceUp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T09:57:17.206Z")
public class TaskSourceUp {
  @SerializedName("file_id")
  private Integer fileId = null;

  @SerializedName("file_path")
  private String filePath = null;

  @SerializedName("import_file_id")
  private Integer importFileId = null;

  @SerializedName("import_file_path")
  private String importFilePath = null;

  @SerializedName("tape_id")
  private Integer tapeId = null;

  @SerializedName("tape_barcode")
  private String tapeBarcode = null;

  @SerializedName("tape_pool_id")
  private Integer tapePoolId = null;

  @SerializedName("tape_pool_name")
  private String tapePoolName = null;

  @SerializedName("cloud_pool_id")
  private Integer cloudPoolId = null;

  @SerializedName("cloud_pool_name")
  private String cloudPoolName = null;

  @SerializedName("nas_pool_id")
  private Integer nasPoolId = null;

  @SerializedName("nas_pool_name")
  private String nasPoolName = null;

  public TaskSourceUp fileId(Integer fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * Get fileId
   * @return fileId
  **/
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
  @ApiModelProperty(value = "")
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public TaskSourceUp importFileId(Integer importFileId) {
    this.importFileId = importFileId;
    return this;
  }

   /**
   * Get importFileId
   * @return importFileId
  **/
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
  @ApiModelProperty(value = "")
  public String getTapeBarcode() {
    return tapeBarcode;
  }

  public void setTapeBarcode(String tapeBarcode) {
    this.tapeBarcode = tapeBarcode;
  }

  public TaskSourceUp tapePoolId(Integer tapePoolId) {
    this.tapePoolId = tapePoolId;
    return this;
  }

   /**
   * Get tapePoolId
   * @return tapePoolId
  **/
  @ApiModelProperty(value = "")
  public Integer getTapePoolId() {
    return tapePoolId;
  }

  public void setTapePoolId(Integer tapePoolId) {
    this.tapePoolId = tapePoolId;
  }

  public TaskSourceUp tapePoolName(String tapePoolName) {
    this.tapePoolName = tapePoolName;
    return this;
  }

   /**
   * Get tapePoolName
   * @return tapePoolName
  **/
  @ApiModelProperty(value = "")
  public String getTapePoolName() {
    return tapePoolName;
  }

  public void setTapePoolName(String tapePoolName) {
    this.tapePoolName = tapePoolName;
  }

  public TaskSourceUp cloudPoolId(Integer cloudPoolId) {
    this.cloudPoolId = cloudPoolId;
    return this;
  }

   /**
   * Get cloudPoolId
   * @return cloudPoolId
  **/
  @ApiModelProperty(value = "")
  public Integer getCloudPoolId() {
    return cloudPoolId;
  }

  public void setCloudPoolId(Integer cloudPoolId) {
    this.cloudPoolId = cloudPoolId;
  }

  public TaskSourceUp cloudPoolName(String cloudPoolName) {
    this.cloudPoolName = cloudPoolName;
    return this;
  }

   /**
   * Get cloudPoolName
   * @return cloudPoolName
  **/
  @ApiModelProperty(value = "")
  public String getCloudPoolName() {
    return cloudPoolName;
  }

  public void setCloudPoolName(String cloudPoolName) {
    this.cloudPoolName = cloudPoolName;
  }

  public TaskSourceUp nasPoolId(Integer nasPoolId) {
    this.nasPoolId = nasPoolId;
    return this;
  }

   /**
   * Get nasPoolId
   * @return nasPoolId
  **/
  @ApiModelProperty(value = "")
  public Integer getNasPoolId() {
    return nasPoolId;
  }

  public void setNasPoolId(Integer nasPoolId) {
    this.nasPoolId = nasPoolId;
  }

  public TaskSourceUp nasPoolName(String nasPoolName) {
    this.nasPoolName = nasPoolName;
    return this;
  }

   /**
   * Get nasPoolName
   * @return nasPoolName
  **/
  @ApiModelProperty(value = "")
  public String getNasPoolName() {
    return nasPoolName;
  }

  public void setNasPoolName(String nasPoolName) {
    this.nasPoolName = nasPoolName;
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
        Objects.equals(this.importFileId, taskSourceUp.importFileId) &&
        Objects.equals(this.importFilePath, taskSourceUp.importFilePath) &&
        Objects.equals(this.tapeId, taskSourceUp.tapeId) &&
        Objects.equals(this.tapeBarcode, taskSourceUp.tapeBarcode) &&
        Objects.equals(this.tapePoolId, taskSourceUp.tapePoolId) &&
        Objects.equals(this.tapePoolName, taskSourceUp.tapePoolName) &&
        Objects.equals(this.cloudPoolId, taskSourceUp.cloudPoolId) &&
        Objects.equals(this.cloudPoolName, taskSourceUp.cloudPoolName) &&
        Objects.equals(this.nasPoolId, taskSourceUp.nasPoolId) &&
        Objects.equals(this.nasPoolName, taskSourceUp.nasPoolName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, filePath, importFileId, importFilePath, tapeId, tapeBarcode, tapePoolId, tapePoolName, cloudPoolId, cloudPoolName, nasPoolId, nasPoolName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSourceUp {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    importFileId: ").append(toIndentedString(importFileId)).append("\n");
    sb.append("    importFilePath: ").append(toIndentedString(importFilePath)).append("\n");
    sb.append("    tapeId: ").append(toIndentedString(tapeId)).append("\n");
    sb.append("    tapeBarcode: ").append(toIndentedString(tapeBarcode)).append("\n");
    sb.append("    tapePoolId: ").append(toIndentedString(tapePoolId)).append("\n");
    sb.append("    tapePoolName: ").append(toIndentedString(tapePoolName)).append("\n");
    sb.append("    cloudPoolId: ").append(toIndentedString(cloudPoolId)).append("\n");
    sb.append("    cloudPoolName: ").append(toIndentedString(cloudPoolName)).append("\n");
    sb.append("    nasPoolId: ").append(toIndentedString(nasPoolId)).append("\n");
    sb.append("    nasPoolName: ").append(toIndentedString(nasPoolName)).append("\n");
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

