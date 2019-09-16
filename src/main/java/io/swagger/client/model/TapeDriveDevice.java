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
 * TapeDriveDevice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T09:57:17.206Z")
public class TapeDriveDevice {
  @SerializedName("serial")
  private String serial = null;

  @SerializedName("scsi_address")
  private Integer scsiAddress = null;

  @SerializedName("vendor")
  private String vendor = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("firmware")
  private String firmware = null;

  @SerializedName("device")
  private String device = null;

  @SerializedName("sgdevice")
  private String sgdevice = null;

   /**
   * Get serial
   * @return serial
  **/
  @ApiModelProperty(example = "C0F9000A01", value = "")
  public String getSerial() {
    return serial;
  }

   /**
   * Get scsiAddress
   * @return scsiAddress
  **/
  @ApiModelProperty(example = "256", value = "")
  public Integer getScsiAddress() {
    return scsiAddress;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @ApiModelProperty(example = "IBM", value = "")
  public String getVendor() {
    return vendor;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(example = "ULT3580-TD5", value = "")
  public String getProduct() {
    return product;
  }

   /**
   * Get firmware
   * @return firmware
  **/
  @ApiModelProperty(example = "D711", value = "")
  public String getFirmware() {
    return firmware;
  }

   /**
   * When saved, device may be prefixed by *n* (eg. &#x60;/dev/nst5&#x60;)
   * @return device
  **/
  @ApiModelProperty(example = "/dev/st5", value = "When saved, device may be prefixed by *n* (eg. `/dev/nst5`)")
  public String getDevice() {
    return device;
  }

   /**
   * Get sgdevice
   * @return sgdevice
  **/
  @ApiModelProperty(example = "/dev/sg8", value = "")
  public String getSgdevice() {
    return sgdevice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapeDriveDevice tapeDriveDevice = (TapeDriveDevice) o;
    return Objects.equals(this.serial, tapeDriveDevice.serial) &&
        Objects.equals(this.scsiAddress, tapeDriveDevice.scsiAddress) &&
        Objects.equals(this.vendor, tapeDriveDevice.vendor) &&
        Objects.equals(this.product, tapeDriveDevice.product) &&
        Objects.equals(this.firmware, tapeDriveDevice.firmware) &&
        Objects.equals(this.device, tapeDriveDevice.device) &&
        Objects.equals(this.sgdevice, tapeDriveDevice.sgdevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serial, scsiAddress, vendor, product, firmware, device, sgdevice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapeDriveDevice {\n");
    
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    scsiAddress: ").append(toIndentedString(scsiAddress)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    sgdevice: ").append(toIndentedString(sgdevice)).append("\n");
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

