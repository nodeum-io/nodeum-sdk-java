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
 * TapeDriveAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-01T09:57:32.172Z[GMT]")
public class TapeDriveAllOf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TAPE_LIBRARY_ID = "tape_library_id";
  @SerializedName(SERIALIZED_NAME_TAPE_LIBRARY_ID)
  private Integer tapeLibraryId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_LIBSO = "libso";
  @SerializedName(SERIALIZED_NAME_LIBSO)
  private String libso;

  public static final String SERIALIZED_NAME_ACS = "acs";
  @SerializedName(SERIALIZED_NAME_ACS)
  private Integer acs;

  public static final String SERIALIZED_NAME_LSM = "lsm";
  @SerializedName(SERIALIZED_NAME_LSM)
  private Integer lsm;

  public static final String SERIALIZED_NAME_PANEL = "panel";
  @SerializedName(SERIALIZED_NAME_PANEL)
  private Integer panel;

  public static final String SERIALIZED_NAME_TRANSPORT = "transport";
  @SerializedName(SERIALIZED_NAME_TRANSPORT)
  private Integer transport;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    OFFLINE("offline"),
    
    ONLINE("online");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_FULL = "full";
  @SerializedName(SERIALIZED_NAME_FULL)
  private Integer full;

  public static final String SERIALIZED_NAME_MOUNT_COUNT = "mount_count";
  @SerializedName(SERIALIZED_NAME_MOUNT_COUNT)
  private Integer mountCount;

  public static final String SERIALIZED_NAME_USE_TO = "use_to";
  @SerializedName(SERIALIZED_NAME_USE_TO)
  private String useTo;

  public static final String SERIALIZED_NAME_USE_BY = "use_by";
  @SerializedName(SERIALIZED_NAME_USE_BY)
  private String useBy;

  public static final String SERIALIZED_NAME_BARCODE = "barcode";
  @SerializedName(SERIALIZED_NAME_BARCODE)
  private String barcode;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Integer taskId;

  public static final String SERIALIZED_NAME_USE_FILE_PROCESSED_SIZE = "use_file_processed_size";
  @SerializedName(SERIALIZED_NAME_USE_FILE_PROCESSED_SIZE)
  private Integer useFileProcessedSize;

  public static final String SERIALIZED_NAME_USE_FILE_SIZE_TO_PROCESS = "use_file_size_to_process";
  @SerializedName(SERIALIZED_NAME_USE_FILE_SIZE_TO_PROCESS)
  private Integer useFileSizeToProcess;

  public static final String SERIALIZED_NAME_USE_FILE_NAME_PROCESSED = "use_file_name_processed";
  @SerializedName(SERIALIZED_NAME_USE_FILE_NAME_PROCESSED)
  private String useFileNameProcessed;

  public static final String SERIALIZED_NAME_BANDWIDTH = "bandwidth";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH)
  private Integer bandwidth;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getId() {
    return id;
  }




   /**
   * Get tapeLibraryId
   * @return tapeLibraryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getTapeLibraryId() {
    return tapeLibraryId;
  }




  public TapeDriveAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TapeDriveAllOf comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public TapeDriveAllOf libso(String libso) {
    
    this.libso = libso;
    return this;
  }

   /**
   * Get libso
   * @return libso
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "drive_lto", value = "")

  public String getLibso() {
    return libso;
  }


  public void setLibso(String libso) {
    this.libso = libso;
  }


  public TapeDriveAllOf acs(Integer acs) {
    
    this.acs = acs;
    return this;
  }

   /**
   * Get acs
   * @return acs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAcs() {
    return acs;
  }


  public void setAcs(Integer acs) {
    this.acs = acs;
  }


  public TapeDriveAllOf lsm(Integer lsm) {
    
    this.lsm = lsm;
    return this;
  }

   /**
   * Get lsm
   * @return lsm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLsm() {
    return lsm;
  }


  public void setLsm(Integer lsm) {
    this.lsm = lsm;
  }


  public TapeDriveAllOf panel(Integer panel) {
    
    this.panel = panel;
    return this;
  }

   /**
   * Get panel
   * @return panel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPanel() {
    return panel;
  }


  public void setPanel(Integer panel) {
    this.panel = panel;
  }


  public TapeDriveAllOf transport(Integer transport) {
    
    this.transport = transport;
    return this;
  }

   /**
   * Get transport
   * @return transport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTransport() {
    return transport;
  }


  public void setTransport(Integer transport) {
    this.transport = transport;
  }


   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "online", value = "")

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * Get full
   * @return full
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFull() {
    return full;
  }




   /**
   * Get mountCount
   * @return mountCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMountCount() {
    return mountCount;
  }




   /**
   * Get useTo
   * @return useTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Idle", value = "")

  public String getUseTo() {
    return useTo;
  }




   /**
   * Get useBy
   * @return useBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Idle", value = "")

  public String getUseBy() {
    return useBy;
  }




   /**
   * Get barcode
   * @return barcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NOD407L5", value = "")

  public String getBarcode() {
    return barcode;
  }




   /**
   * Get taskId
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14", value = "")

  public Integer getTaskId() {
    return taskId;
  }




   /**
   * Get useFileProcessedSize
   * @return useFileProcessedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUseFileProcessedSize() {
    return useFileProcessedSize;
  }




   /**
   * Get useFileSizeToProcess
   * @return useFileSizeToProcess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUseFileSizeToProcess() {
    return useFileSizeToProcess;
  }




   /**
   * Get useFileNameProcessed
   * @return useFileNameProcessed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUseFileNameProcessed() {
    return useFileNameProcessed;
  }




   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBandwidth() {
    return bandwidth;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapeDriveAllOf tapeDriveAllOf = (TapeDriveAllOf) o;
    return Objects.equals(this.id, tapeDriveAllOf.id) &&
        Objects.equals(this.tapeLibraryId, tapeDriveAllOf.tapeLibraryId) &&
        Objects.equals(this.name, tapeDriveAllOf.name) &&
        Objects.equals(this.comment, tapeDriveAllOf.comment) &&
        Objects.equals(this.libso, tapeDriveAllOf.libso) &&
        Objects.equals(this.acs, tapeDriveAllOf.acs) &&
        Objects.equals(this.lsm, tapeDriveAllOf.lsm) &&
        Objects.equals(this.panel, tapeDriveAllOf.panel) &&
        Objects.equals(this.transport, tapeDriveAllOf.transport) &&
        Objects.equals(this.status, tapeDriveAllOf.status) &&
        Objects.equals(this.full, tapeDriveAllOf.full) &&
        Objects.equals(this.mountCount, tapeDriveAllOf.mountCount) &&
        Objects.equals(this.useTo, tapeDriveAllOf.useTo) &&
        Objects.equals(this.useBy, tapeDriveAllOf.useBy) &&
        Objects.equals(this.barcode, tapeDriveAllOf.barcode) &&
        Objects.equals(this.taskId, tapeDriveAllOf.taskId) &&
        Objects.equals(this.useFileProcessedSize, tapeDriveAllOf.useFileProcessedSize) &&
        Objects.equals(this.useFileSizeToProcess, tapeDriveAllOf.useFileSizeToProcess) &&
        Objects.equals(this.useFileNameProcessed, tapeDriveAllOf.useFileNameProcessed) &&
        Objects.equals(this.bandwidth, tapeDriveAllOf.bandwidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tapeLibraryId, name, comment, libso, acs, lsm, panel, transport, status, full, mountCount, useTo, useBy, barcode, taskId, useFileProcessedSize, useFileSizeToProcess, useFileNameProcessed, bandwidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapeDriveAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tapeLibraryId: ").append(toIndentedString(tapeLibraryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    libso: ").append(toIndentedString(libso)).append("\n");
    sb.append("    acs: ").append(toIndentedString(acs)).append("\n");
    sb.append("    lsm: ").append(toIndentedString(lsm)).append("\n");
    sb.append("    panel: ").append(toIndentedString(panel)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    full: ").append(toIndentedString(full)).append("\n");
    sb.append("    mountCount: ").append(toIndentedString(mountCount)).append("\n");
    sb.append("    useTo: ").append(toIndentedString(useTo)).append("\n");
    sb.append("    useBy: ").append(toIndentedString(useBy)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    useFileProcessedSize: ").append(toIndentedString(useFileProcessedSize)).append("\n");
    sb.append("    useFileSizeToProcess: ").append(toIndentedString(useFileSizeToProcess)).append("\n");
    sb.append("    useFileNameProcessed: ").append(toIndentedString(useFileNameProcessed)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
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

