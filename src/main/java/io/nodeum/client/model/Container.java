/*
 * Nodeum API
 * # About  This document describes the Nodeum API version 2:  If you are looking for any information about the product itself, reach the product website https://www.nodeum.io. You can also contact us at this email address : info@nodeum.io  # Filter parameters When browsing a list of items, multiple filter parameters may be applied. Some operators can be added to the value as a prefix:  - `=` value is equal. Default operator, may be omitted  - `!=` value is different  - `>` greater than  - `>=` greater than or equal  - `<` lower than  - `>=` lower than or equal  - `><` included in list, items should be separated by `|`  - `!><` not included in list, items should be separated by `|`  - `~` pattern matching, may include `%` (any characters) and `_` (one character)  - `!~` pattern not matching, may include `%` (any characters) and `_` (one character)  
 *
 * The version of the OpenAPI document: 2.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.nodeum.client.model;

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
 * Container
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-11T14:27:44.769Z[GMT]")
public class Container {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_QUOTA_TOTAL_SIZE = "quota_total_size";
  @SerializedName(SERIALIZED_NAME_QUOTA_TOTAL_SIZE)
  private Integer quotaTotalSize;

  public static final String SERIALIZED_NAME_QUOTA_ON_CACHE = "quota_on_cache";
  @SerializedName(SERIALIZED_NAME_QUOTA_ON_CACHE)
  private Integer quotaOnCache;

  public static final String SERIALIZED_NAME_STAT_TOTAL_FILES = "stat_total_files";
  @SerializedName(SERIALIZED_NAME_STAT_TOTAL_FILES)
  private Integer statTotalFiles;

  public static final String SERIALIZED_NAME_STAT_TOTAL_SIZE = "stat_total_size";
  @SerializedName(SERIALIZED_NAME_STAT_TOTAL_SIZE)
  private Integer statTotalSize;

  public static final String SERIALIZED_NAME_STAT_SIZE_ON_CACHE = "stat_size_on_cache";
  @SerializedName(SERIALIZED_NAME_STAT_SIZE_ON_CACHE)
  private Integer statSizeOnCache;

  /**
   * Gets or Sets guestRight
   */
  @JsonAdapter(GuestRightEnum.Adapter.class)
  public enum GuestRightEnum {
    NONE("none"),
    
    READ("read"),
    
    READ_WRITE("read_write");

    private String value;

    GuestRightEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GuestRightEnum fromValue(String value) {
      for (GuestRightEnum b : GuestRightEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GuestRightEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GuestRightEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GuestRightEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GuestRightEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GUEST_RIGHT = "guest_right";
  @SerializedName(SERIALIZED_NAME_GUEST_RIGHT)
  private GuestRightEnum guestRight;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "last_update";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  private String lastUpdate;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Integer getId() {
    return id;
  }




  public Container name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-container", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Container comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Read only container for random stuff", value = "")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public Container quotaTotalSize(Integer quotaTotalSize) {
    
    this.quotaTotalSize = quotaTotalSize;
    return this;
  }

   /**
   * Get quotaTotalSize
   * @return quotaTotalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuotaTotalSize() {
    return quotaTotalSize;
  }


  public void setQuotaTotalSize(Integer quotaTotalSize) {
    this.quotaTotalSize = quotaTotalSize;
  }


  public Container quotaOnCache(Integer quotaOnCache) {
    
    this.quotaOnCache = quotaOnCache;
    return this;
  }

   /**
   * Get quotaOnCache
   * @return quotaOnCache
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuotaOnCache() {
    return quotaOnCache;
  }


  public void setQuotaOnCache(Integer quotaOnCache) {
    this.quotaOnCache = quotaOnCache;
  }


   /**
   * Get statTotalFiles
   * @return statTotalFiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99301", value = "")

  public Integer getStatTotalFiles() {
    return statTotalFiles;
  }




   /**
   * Get statTotalSize
   * @return statTotalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6145076462", value = "")

  public Integer getStatTotalSize() {
    return statTotalSize;
  }




   /**
   * Get statSizeOnCache
   * @return statSizeOnCache
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6899417088", value = "")

  public Integer getStatSizeOnCache() {
    return statSizeOnCache;
  }




  public Container guestRight(GuestRightEnum guestRight) {
    
    this.guestRight = guestRight;
    return this;
  }

   /**
   * Get guestRight
   * @return guestRight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "read", value = "")

  public GuestRightEnum getGuestRight() {
    return guestRight;
  }


  public void setGuestRight(GuestRightEnum guestRight) {
    this.guestRight = guestRight;
  }


   /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-08-05T14:24:15.000Z", value = "")

  public String getLastUpdate() {
    return lastUpdate;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Container container = (Container) o;
    return Objects.equals(this.id, container.id) &&
        Objects.equals(this.name, container.name) &&
        Objects.equals(this.comment, container.comment) &&
        Objects.equals(this.quotaTotalSize, container.quotaTotalSize) &&
        Objects.equals(this.quotaOnCache, container.quotaOnCache) &&
        Objects.equals(this.statTotalFiles, container.statTotalFiles) &&
        Objects.equals(this.statTotalSize, container.statTotalSize) &&
        Objects.equals(this.statSizeOnCache, container.statSizeOnCache) &&
        Objects.equals(this.guestRight, container.guestRight) &&
        Objects.equals(this.lastUpdate, container.lastUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, comment, quotaTotalSize, quotaOnCache, statTotalFiles, statTotalSize, statSizeOnCache, guestRight, lastUpdate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Container {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    quotaTotalSize: ").append(toIndentedString(quotaTotalSize)).append("\n");
    sb.append("    quotaOnCache: ").append(toIndentedString(quotaOnCache)).append("\n");
    sb.append("    statTotalFiles: ").append(toIndentedString(statTotalFiles)).append("\n");
    sb.append("    statTotalSize: ").append(toIndentedString(statTotalSize)).append("\n");
    sb.append("    statSizeOnCache: ").append(toIndentedString(statSizeOnCache)).append("\n");
    sb.append("    guestRight: ").append(toIndentedString(guestRight)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
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

