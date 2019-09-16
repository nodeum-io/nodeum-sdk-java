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
import io.swagger.client.model.TapeDriveDevice;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TapeDriveDeviceCollection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T09:57:17.206Z")
public class TapeDriveDeviceCollection {
  @SerializedName("tape_drives")
  private List<TapeDriveDevice> tapeDrives = null;

  public TapeDriveDeviceCollection tapeDrives(List<TapeDriveDevice> tapeDrives) {
    this.tapeDrives = tapeDrives;
    return this;
  }

  public TapeDriveDeviceCollection addTapeDrivesItem(TapeDriveDevice tapeDrivesItem) {
    if (this.tapeDrives == null) {
      this.tapeDrives = new ArrayList<TapeDriveDevice>();
    }
    this.tapeDrives.add(tapeDrivesItem);
    return this;
  }

   /**
   * Get tapeDrives
   * @return tapeDrives
  **/
  @ApiModelProperty(value = "")
  public List<TapeDriveDevice> getTapeDrives() {
    return tapeDrives;
  }

  public void setTapeDrives(List<TapeDriveDevice> tapeDrives) {
    this.tapeDrives = tapeDrives;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapeDriveDeviceCollection tapeDriveDeviceCollection = (TapeDriveDeviceCollection) o;
    return Objects.equals(this.tapeDrives, tapeDriveDeviceCollection.tapeDrives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tapeDrives);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapeDriveDeviceCollection {\n");
    
    sb.append("    tapeDrives: ").append(toIndentedString(tapeDrives)).append("\n");
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

