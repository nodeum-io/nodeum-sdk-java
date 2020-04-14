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
 * MountInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-14T13:35:16.354Z[GMT]")
public class MountInfo {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MAJOR_MINOR = "major_minor";
  @SerializedName(SERIALIZED_NAME_MAJOR_MINOR)
  private String majorMinor;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private String options;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CIFS("cifs"),
    
    NFS("nfs"),
    
    FUSE_S3FS("fuse.s3fs"),
    
    FUSE_CORE_FUSE("fuse.core_fuse"),
    
    FUSE("fuse");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_POOL_ID = "pool_id";
  @SerializedName(SERIALIZED_NAME_POOL_ID)
  private Integer poolId;

  public static final String SERIALIZED_NAME_POOL_NAME = "pool_name";
  @SerializedName(SERIALIZED_NAME_POOL_NAME)
  private String poolName;

  public static final String SERIALIZED_NAME_NAS_ID = "nas_id";
  @SerializedName(SERIALIZED_NAME_NAS_ID)
  private Integer nasId;

  public static final String SERIALIZED_NAME_NAS_NAME = "nas_name";
  @SerializedName(SERIALIZED_NAME_NAS_NAME)
  private String nasName;

  public static final String SERIALIZED_NAME_NAS_SHARE_ID = "nas_share_id";
  @SerializedName(SERIALIZED_NAME_NAS_SHARE_ID)
  private Integer nasShareId;

  public static final String SERIALIZED_NAME_NAS_SHARE_NAME = "nas_share_name";
  @SerializedName(SERIALIZED_NAME_NAS_SHARE_NAME)
  private String nasShareName;

  public static final String SERIALIZED_NAME_CLOUD_CONNECTOR_ID = "cloud_connector_id";
  @SerializedName(SERIALIZED_NAME_CLOUD_CONNECTOR_ID)
  private Integer cloudConnectorId;

  public static final String SERIALIZED_NAME_CLOUD_CONNECTOR_NAME = "cloud_connector_name";
  @SerializedName(SERIALIZED_NAME_CLOUD_CONNECTOR_NAME)
  private String cloudConnectorName;

  public static final String SERIALIZED_NAME_CLOUD_BUCKET_ID = "cloud_bucket_id";
  @SerializedName(SERIALIZED_NAME_CLOUD_BUCKET_ID)
  private Integer cloudBucketId;

  public static final String SERIALIZED_NAME_CLOUD_BUCKET_NAME = "cloud_bucket_name";
  @SerializedName(SERIALIZED_NAME_CLOUD_BUCKET_NAME)
  private String cloudBucketName;

  public static final String SERIALIZED_NAME_TAPE_ID = "tape_id";
  @SerializedName(SERIALIZED_NAME_TAPE_ID)
  private Integer tapeId;

  public static final String SERIALIZED_NAME_TAPE_BARCODE = "tape_barcode";
  @SerializedName(SERIALIZED_NAME_TAPE_BARCODE)
  private String tapeBarcode;

  public static final String SERIALIZED_NAME_TAPE_LIBRARY_ID = "tape_library_id";
  @SerializedName(SERIALIZED_NAME_TAPE_LIBRARY_ID)
  private Integer tapeLibraryId;

  public static final String SERIALIZED_NAME_TAPE_LIBRARY_NAME = "tape_library_name";
  @SerializedName(SERIALIZED_NAME_TAPE_LIBRARY_NAME)
  private String tapeLibraryName;

  public static final String SERIALIZED_NAME_TAPE_LIBRARY_SERIAL = "tape_library_serial";
  @SerializedName(SERIALIZED_NAME_TAPE_LIBRARY_SERIAL)
  private String tapeLibrarySerial;


  public MountInfo id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public MountInfo majorMinor(String majorMinor) {
    
    this.majorMinor = majorMinor;
    return this;
  }

   /**
   * Get majorMinor
   * @return majorMinor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0:189", value = "")

  public String getMajorMinor() {
    return majorMinor;
  }


  public void setMajorMinor(String majorMinor) {
    this.majorMinor = majorMinor;
  }


  public MountInfo target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/mnt/MOUNT_POINTS/folder", value = "")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public MountInfo source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "//server.local/shared_folder", value = "")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public MountInfo options(String options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "vers=3.0,rsize=1048576,wsize=1048576", value = "")

  public String getOptions() {
    return options;
  }


  public void setOptions(String options) {
    this.options = options;
  }


  public MountInfo type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cifs", value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public MountInfo poolId(Integer poolId) {
    
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


  public MountInfo poolName(String poolName) {
    
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


  public MountInfo nasId(Integer nasId) {
    
    this.nasId = nasId;
    return this;
  }

   /**
   * Get nasId
   * @return nasId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNasId() {
    return nasId;
  }


  public void setNasId(Integer nasId) {
    this.nasId = nasId;
  }


  public MountInfo nasName(String nasName) {
    
    this.nasName = nasName;
    return this;
  }

   /**
   * Get nasName
   * @return nasName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNasName() {
    return nasName;
  }


  public void setNasName(String nasName) {
    this.nasName = nasName;
  }


  public MountInfo nasShareId(Integer nasShareId) {
    
    this.nasShareId = nasShareId;
    return this;
  }

   /**
   * Get nasShareId
   * @return nasShareId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNasShareId() {
    return nasShareId;
  }


  public void setNasShareId(Integer nasShareId) {
    this.nasShareId = nasShareId;
  }


  public MountInfo nasShareName(String nasShareName) {
    
    this.nasShareName = nasShareName;
    return this;
  }

   /**
   * Get nasShareName
   * @return nasShareName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNasShareName() {
    return nasShareName;
  }


  public void setNasShareName(String nasShareName) {
    this.nasShareName = nasShareName;
  }


  public MountInfo cloudConnectorId(Integer cloudConnectorId) {
    
    this.cloudConnectorId = cloudConnectorId;
    return this;
  }

   /**
   * Get cloudConnectorId
   * @return cloudConnectorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCloudConnectorId() {
    return cloudConnectorId;
  }


  public void setCloudConnectorId(Integer cloudConnectorId) {
    this.cloudConnectorId = cloudConnectorId;
  }


  public MountInfo cloudConnectorName(String cloudConnectorName) {
    
    this.cloudConnectorName = cloudConnectorName;
    return this;
  }

   /**
   * Get cloudConnectorName
   * @return cloudConnectorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCloudConnectorName() {
    return cloudConnectorName;
  }


  public void setCloudConnectorName(String cloudConnectorName) {
    this.cloudConnectorName = cloudConnectorName;
  }


  public MountInfo cloudBucketId(Integer cloudBucketId) {
    
    this.cloudBucketId = cloudBucketId;
    return this;
  }

   /**
   * Get cloudBucketId
   * @return cloudBucketId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCloudBucketId() {
    return cloudBucketId;
  }


  public void setCloudBucketId(Integer cloudBucketId) {
    this.cloudBucketId = cloudBucketId;
  }


  public MountInfo cloudBucketName(String cloudBucketName) {
    
    this.cloudBucketName = cloudBucketName;
    return this;
  }

   /**
   * Get cloudBucketName
   * @return cloudBucketName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCloudBucketName() {
    return cloudBucketName;
  }


  public void setCloudBucketName(String cloudBucketName) {
    this.cloudBucketName = cloudBucketName;
  }


  public MountInfo tapeId(Integer tapeId) {
    
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


  public MountInfo tapeBarcode(String tapeBarcode) {
    
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


  public MountInfo tapeLibraryId(Integer tapeLibraryId) {
    
    this.tapeLibraryId = tapeLibraryId;
    return this;
  }

   /**
   * Get tapeLibraryId
   * @return tapeLibraryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTapeLibraryId() {
    return tapeLibraryId;
  }


  public void setTapeLibraryId(Integer tapeLibraryId) {
    this.tapeLibraryId = tapeLibraryId;
  }


  public MountInfo tapeLibraryName(String tapeLibraryName) {
    
    this.tapeLibraryName = tapeLibraryName;
    return this;
  }

   /**
   * Get tapeLibraryName
   * @return tapeLibraryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTapeLibraryName() {
    return tapeLibraryName;
  }


  public void setTapeLibraryName(String tapeLibraryName) {
    this.tapeLibraryName = tapeLibraryName;
  }


  public MountInfo tapeLibrarySerial(String tapeLibrarySerial) {
    
    this.tapeLibrarySerial = tapeLibrarySerial;
    return this;
  }

   /**
   * Get tapeLibrarySerial
   * @return tapeLibrarySerial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTapeLibrarySerial() {
    return tapeLibrarySerial;
  }


  public void setTapeLibrarySerial(String tapeLibrarySerial) {
    this.tapeLibrarySerial = tapeLibrarySerial;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountInfo mountInfo = (MountInfo) o;
    return Objects.equals(this.id, mountInfo.id) &&
        Objects.equals(this.majorMinor, mountInfo.majorMinor) &&
        Objects.equals(this.target, mountInfo.target) &&
        Objects.equals(this.source, mountInfo.source) &&
        Objects.equals(this.options, mountInfo.options) &&
        Objects.equals(this.type, mountInfo.type) &&
        Objects.equals(this.poolId, mountInfo.poolId) &&
        Objects.equals(this.poolName, mountInfo.poolName) &&
        Objects.equals(this.nasId, mountInfo.nasId) &&
        Objects.equals(this.nasName, mountInfo.nasName) &&
        Objects.equals(this.nasShareId, mountInfo.nasShareId) &&
        Objects.equals(this.nasShareName, mountInfo.nasShareName) &&
        Objects.equals(this.cloudConnectorId, mountInfo.cloudConnectorId) &&
        Objects.equals(this.cloudConnectorName, mountInfo.cloudConnectorName) &&
        Objects.equals(this.cloudBucketId, mountInfo.cloudBucketId) &&
        Objects.equals(this.cloudBucketName, mountInfo.cloudBucketName) &&
        Objects.equals(this.tapeId, mountInfo.tapeId) &&
        Objects.equals(this.tapeBarcode, mountInfo.tapeBarcode) &&
        Objects.equals(this.tapeLibraryId, mountInfo.tapeLibraryId) &&
        Objects.equals(this.tapeLibraryName, mountInfo.tapeLibraryName) &&
        Objects.equals(this.tapeLibrarySerial, mountInfo.tapeLibrarySerial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, majorMinor, target, source, options, type, poolId, poolName, nasId, nasName, nasShareId, nasShareName, cloudConnectorId, cloudConnectorName, cloudBucketId, cloudBucketName, tapeId, tapeBarcode, tapeLibraryId, tapeLibraryName, tapeLibrarySerial);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    majorMinor: ").append(toIndentedString(majorMinor)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
    sb.append("    nasId: ").append(toIndentedString(nasId)).append("\n");
    sb.append("    nasName: ").append(toIndentedString(nasName)).append("\n");
    sb.append("    nasShareId: ").append(toIndentedString(nasShareId)).append("\n");
    sb.append("    nasShareName: ").append(toIndentedString(nasShareName)).append("\n");
    sb.append("    cloudConnectorId: ").append(toIndentedString(cloudConnectorId)).append("\n");
    sb.append("    cloudConnectorName: ").append(toIndentedString(cloudConnectorName)).append("\n");
    sb.append("    cloudBucketId: ").append(toIndentedString(cloudBucketId)).append("\n");
    sb.append("    cloudBucketName: ").append(toIndentedString(cloudBucketName)).append("\n");
    sb.append("    tapeId: ").append(toIndentedString(tapeId)).append("\n");
    sb.append("    tapeBarcode: ").append(toIndentedString(tapeBarcode)).append("\n");
    sb.append("    tapeLibraryId: ").append(toIndentedString(tapeLibraryId)).append("\n");
    sb.append("    tapeLibraryName: ").append(toIndentedString(tapeLibraryName)).append("\n");
    sb.append("    tapeLibrarySerial: ").append(toIndentedString(tapeLibrarySerial)).append("\n");
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

