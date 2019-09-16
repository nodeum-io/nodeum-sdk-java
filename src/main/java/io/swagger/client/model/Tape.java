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
 * Tape
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T09:57:17.206Z")
public class Tape {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("tape_library_id")
  private Integer tapeLibraryId = null;

  @SerializedName("tape_pool_id")
  private Integer tapePoolId = null;

  @SerializedName("barcode")
  private String barcode = null;

  @SerializedName("location")
  private String location = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNKNOWN("unknown"),
    
    DATA("data"),
    
    CLEANING("cleaning"),
    
    DIAGNOSTIC("diagnostic"),
    
    DATA_LTO1("data_lto1"),
    
    DATA_LTO2("data_lto2"),
    
    DATA_LTO3("data_lto3"),
    
    DATA_LTO4("data_lto4"),
    
    DATA_LTO5("data_lto5"),
    
    DATA_LTO6("data_lto6"),
    
    DATA_LTO7("data_lto7"),
    
    DATA_LTO8("data_lto8"),
    
    DATA_LTO9("data_lto9"),
    
    DATA_LTO10("data_lto10"),
    
    DATA_LTO11("data_lto11"),
    
    DATA_LTO12("data_lto12");

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

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("scratch")
  private Boolean scratch = null;

  @SerializedName("cleaning")
  private Boolean cleaning = null;

  @SerializedName("write_protect")
  private Boolean writeProtect = null;

  @SerializedName("mounted")
  private Boolean mounted = null;

  @SerializedName("ejected")
  private Boolean ejected = null;

  @SerializedName("known")
  private Boolean known = null;

  @SerializedName("mount_count")
  private Integer mountCount = null;

  @SerializedName("date_in")
  private String dateIn = null;

  @SerializedName("date_move")
  private String dateMove = null;

  @SerializedName("free")
  private Integer free = null;

  @SerializedName("max")
  private Integer max = null;

  @SerializedName("last_size_update")
  private String lastSizeUpdate = null;

  @SerializedName("last_maintenance")
  private String lastMaintenance = null;

  @SerializedName("last_repack")
  private String lastRepack = null;

  @SerializedName("repack_status")
  private Boolean repackStatus = null;

  @SerializedName("hash")
  private String hash = null;

  @SerializedName("force_import_type")
  private Boolean forceImportType = null;

  @SerializedName("need_to_check")
  private Boolean needToCheck = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "10", value = "")
  public Integer getId() {
    return id;
  }

   /**
   * Get tapeLibraryId
   * @return tapeLibraryId
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getTapeLibraryId() {
    return tapeLibraryId;
  }

   /**
   * Get tapePoolId
   * @return tapePoolId
  **/
  @ApiModelProperty(example = "6", value = "")
  public Integer getTapePoolId() {
    return tapePoolId;
  }

   /**
   * Get barcode
   * @return barcode
  **/
  @ApiModelProperty(example = "NOD407L5", value = "")
  public String getBarcode() {
    return barcode;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "Slot 2", value = "")
  public String getLocation() {
    return location;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "data_lto5", value = "")
  public TypeEnum getType() {
    return type;
  }

   /**
   * Get locked
   * @return locked
  **/
  @ApiModelProperty(value = "")
  public Boolean isLocked() {
    return locked;
  }

   /**
   * Get scratch
   * @return scratch
  **/
  @ApiModelProperty(value = "")
  public Boolean isScratch() {
    return scratch;
  }

   /**
   * Get cleaning
   * @return cleaning
  **/
  @ApiModelProperty(value = "")
  public Boolean isCleaning() {
    return cleaning;
  }

   /**
   * Get writeProtect
   * @return writeProtect
  **/
  @ApiModelProperty(value = "")
  public Boolean isWriteProtect() {
    return writeProtect;
  }

   /**
   * Get mounted
   * @return mounted
  **/
  @ApiModelProperty(value = "")
  public Boolean isMounted() {
    return mounted;
  }

   /**
   * Get ejected
   * @return ejected
  **/
  @ApiModelProperty(value = "")
  public Boolean isEjected() {
    return ejected;
  }

   /**
   * Get known
   * @return known
  **/
  @ApiModelProperty(value = "")
  public Boolean isKnown() {
    return known;
  }

   /**
   * Get mountCount
   * @return mountCount
  **/
  @ApiModelProperty(value = "")
  public Integer getMountCount() {
    return mountCount;
  }

   /**
   * Get dateIn
   * @return dateIn
  **/
  @ApiModelProperty(value = "")
  public String getDateIn() {
    return dateIn;
  }

   /**
   * Get dateMove
   * @return dateMove
  **/
  @ApiModelProperty(value = "")
  public String getDateMove() {
    return dateMove;
  }

   /**
   * Get free
   * @return free
  **/
  @ApiModelProperty(value = "")
  public Integer getFree() {
    return free;
  }

   /**
   * Get max
   * @return max
  **/
  @ApiModelProperty(value = "")
  public Integer getMax() {
    return max;
  }

   /**
   * Get lastSizeUpdate
   * @return lastSizeUpdate
  **/
  @ApiModelProperty(value = "")
  public String getLastSizeUpdate() {
    return lastSizeUpdate;
  }

   /**
   * Get lastMaintenance
   * @return lastMaintenance
  **/
  @ApiModelProperty(value = "")
  public String getLastMaintenance() {
    return lastMaintenance;
  }

   /**
   * Get lastRepack
   * @return lastRepack
  **/
  @ApiModelProperty(value = "")
  public String getLastRepack() {
    return lastRepack;
  }

   /**
   * Get repackStatus
   * @return repackStatus
  **/
  @ApiModelProperty(value = "")
  public Boolean isRepackStatus() {
    return repackStatus;
  }

   /**
   * Get hash
   * @return hash
  **/
  @ApiModelProperty(value = "")
  public String getHash() {
    return hash;
  }

   /**
   * Get forceImportType
   * @return forceImportType
  **/
  @ApiModelProperty(value = "")
  public Boolean isForceImportType() {
    return forceImportType;
  }

   /**
   * Get needToCheck
   * @return needToCheck
  **/
  @ApiModelProperty(value = "")
  public Boolean isNeedToCheck() {
    return needToCheck;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tape tape = (Tape) o;
    return Objects.equals(this.id, tape.id) &&
        Objects.equals(this.tapeLibraryId, tape.tapeLibraryId) &&
        Objects.equals(this.tapePoolId, tape.tapePoolId) &&
        Objects.equals(this.barcode, tape.barcode) &&
        Objects.equals(this.location, tape.location) &&
        Objects.equals(this.type, tape.type) &&
        Objects.equals(this.locked, tape.locked) &&
        Objects.equals(this.scratch, tape.scratch) &&
        Objects.equals(this.cleaning, tape.cleaning) &&
        Objects.equals(this.writeProtect, tape.writeProtect) &&
        Objects.equals(this.mounted, tape.mounted) &&
        Objects.equals(this.ejected, tape.ejected) &&
        Objects.equals(this.known, tape.known) &&
        Objects.equals(this.mountCount, tape.mountCount) &&
        Objects.equals(this.dateIn, tape.dateIn) &&
        Objects.equals(this.dateMove, tape.dateMove) &&
        Objects.equals(this.free, tape.free) &&
        Objects.equals(this.max, tape.max) &&
        Objects.equals(this.lastSizeUpdate, tape.lastSizeUpdate) &&
        Objects.equals(this.lastMaintenance, tape.lastMaintenance) &&
        Objects.equals(this.lastRepack, tape.lastRepack) &&
        Objects.equals(this.repackStatus, tape.repackStatus) &&
        Objects.equals(this.hash, tape.hash) &&
        Objects.equals(this.forceImportType, tape.forceImportType) &&
        Objects.equals(this.needToCheck, tape.needToCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tapeLibraryId, tapePoolId, barcode, location, type, locked, scratch, cleaning, writeProtect, mounted, ejected, known, mountCount, dateIn, dateMove, free, max, lastSizeUpdate, lastMaintenance, lastRepack, repackStatus, hash, forceImportType, needToCheck);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tape {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tapeLibraryId: ").append(toIndentedString(tapeLibraryId)).append("\n");
    sb.append("    tapePoolId: ").append(toIndentedString(tapePoolId)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    scratch: ").append(toIndentedString(scratch)).append("\n");
    sb.append("    cleaning: ").append(toIndentedString(cleaning)).append("\n");
    sb.append("    writeProtect: ").append(toIndentedString(writeProtect)).append("\n");
    sb.append("    mounted: ").append(toIndentedString(mounted)).append("\n");
    sb.append("    ejected: ").append(toIndentedString(ejected)).append("\n");
    sb.append("    known: ").append(toIndentedString(known)).append("\n");
    sb.append("    mountCount: ").append(toIndentedString(mountCount)).append("\n");
    sb.append("    dateIn: ").append(toIndentedString(dateIn)).append("\n");
    sb.append("    dateMove: ").append(toIndentedString(dateMove)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    lastSizeUpdate: ").append(toIndentedString(lastSizeUpdate)).append("\n");
    sb.append("    lastMaintenance: ").append(toIndentedString(lastMaintenance)).append("\n");
    sb.append("    lastRepack: ").append(toIndentedString(lastRepack)).append("\n");
    sb.append("    repackStatus: ").append(toIndentedString(repackStatus)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    forceImportType: ").append(toIndentedString(forceImportType)).append("\n");
    sb.append("    needToCheck: ").append(toIndentedString(needToCheck)).append("\n");
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

