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
import io.nodeum.sdk.client.model.ByDateFacet;
import io.nodeum.sdk.client.model.FileFacet;
import io.nodeum.sdk.client.model.SizeToDateFacets;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * BySizeFacet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-01T09:57:32.172Z[GMT]")
public class BySizeFacet {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_FILES_COUNT = "files_count";
  @SerializedName(SERIALIZED_NAME_FILES_COUNT)
  private Integer filesCount;

  public static final String SERIALIZED_NAME_FILE_SIZE_SUM = "file_size_sum";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE_SUM)
  private Integer fileSizeSum;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private BigDecimal cost;

  public static final String SERIALIZED_NAME_LESS100_KB = "less_100_kb";
  @SerializedName(SERIALIZED_NAME_LESS100_KB)
  private ByDateFacet less100Kb = null;

  public static final String SERIALIZED_NAME_LESS1_MB = "less_1_mb";
  @SerializedName(SERIALIZED_NAME_LESS1_MB)
  private ByDateFacet less1Mb = null;

  public static final String SERIALIZED_NAME_LESS10_MB = "less_10_mb";
  @SerializedName(SERIALIZED_NAME_LESS10_MB)
  private ByDateFacet less10Mb = null;

  public static final String SERIALIZED_NAME_LESS100_MB = "less_100_mb";
  @SerializedName(SERIALIZED_NAME_LESS100_MB)
  private ByDateFacet less100Mb = null;

  public static final String SERIALIZED_NAME_LESS1_GB = "less_1_gb";
  @SerializedName(SERIALIZED_NAME_LESS1_GB)
  private ByDateFacet less1Gb = null;

  public static final String SERIALIZED_NAME_LESS10_GB = "less_10_gb";
  @SerializedName(SERIALIZED_NAME_LESS10_GB)
  private ByDateFacet less10Gb = null;

  public static final String SERIALIZED_NAME_LESS100_GB = "less_100_gb";
  @SerializedName(SERIALIZED_NAME_LESS100_GB)
  private ByDateFacet less100Gb = null;

  public static final String SERIALIZED_NAME_MORE100_GB = "more_100_gb";
  @SerializedName(SERIALIZED_NAME_MORE100_GB)
  private ByDateFacet more100Gb = null;


   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }




   /**
   * Get filesCount
   * @return filesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFilesCount() {
    return filesCount;
  }




   /**
   * Get fileSizeSum
   * @return fileSizeSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFileSizeSum() {
    return fileSizeSum;
  }




   /**
   * Get cost
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCost() {
    return cost;
  }




  public BySizeFacet less100Kb(ByDateFacet less100Kb) {
    
    this.less100Kb = less100Kb;
    return this;
  }

   /**
   * Get less100Kb
   * @return less100Kb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByDateFacet getLess100Kb() {
    return less100Kb;
  }


  public void setLess100Kb(ByDateFacet less100Kb) {
    this.less100Kb = less100Kb;
  }


  public BySizeFacet less1Mb(ByDateFacet less1Mb) {
    
    this.less1Mb = less1Mb;
    return this;
  }

   /**
   * Get less1Mb
   * @return less1Mb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByDateFacet getLess1Mb() {
    return less1Mb;
  }


  public void setLess1Mb(ByDateFacet less1Mb) {
    this.less1Mb = less1Mb;
  }


  public BySizeFacet less10Mb(ByDateFacet less10Mb) {
    
    this.less10Mb = less10Mb;
    return this;
  }

   /**
   * Get less10Mb
   * @return less10Mb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByDateFacet getLess10Mb() {
    return less10Mb;
  }


  public void setLess10Mb(ByDateFacet less10Mb) {
    this.less10Mb = less10Mb;
  }


  public BySizeFacet less100Mb(ByDateFacet less100Mb) {
    
    this.less100Mb = less100Mb;
    return this;
  }

   /**
   * Get less100Mb
   * @return less100Mb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByDateFacet getLess100Mb() {
    return less100Mb;
  }


  public void setLess100Mb(ByDateFacet less100Mb) {
    this.less100Mb = less100Mb;
  }


  public BySizeFacet less1Gb(ByDateFacet less1Gb) {
    
    this.less1Gb = less1Gb;
    return this;
  }

   /**
   * Get less1Gb
   * @return less1Gb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByDateFacet getLess1Gb() {
    return less1Gb;
  }


  public void setLess1Gb(ByDateFacet less1Gb) {
    this.less1Gb = less1Gb;
  }


  public BySizeFacet less10Gb(ByDateFacet less10Gb) {
    
    this.less10Gb = less10Gb;
    return this;
  }

   /**
   * Get less10Gb
   * @return less10Gb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByDateFacet getLess10Gb() {
    return less10Gb;
  }


  public void setLess10Gb(ByDateFacet less10Gb) {
    this.less10Gb = less10Gb;
  }


  public BySizeFacet less100Gb(ByDateFacet less100Gb) {
    
    this.less100Gb = less100Gb;
    return this;
  }

   /**
   * Get less100Gb
   * @return less100Gb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByDateFacet getLess100Gb() {
    return less100Gb;
  }


  public void setLess100Gb(ByDateFacet less100Gb) {
    this.less100Gb = less100Gb;
  }


  public BySizeFacet more100Gb(ByDateFacet more100Gb) {
    
    this.more100Gb = more100Gb;
    return this;
  }

   /**
   * Get more100Gb
   * @return more100Gb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByDateFacet getMore100Gb() {
    return more100Gb;
  }


  public void setMore100Gb(ByDateFacet more100Gb) {
    this.more100Gb = more100Gb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BySizeFacet bySizeFacet = (BySizeFacet) o;
    return Objects.equals(this.count, bySizeFacet.count) &&
        Objects.equals(this.filesCount, bySizeFacet.filesCount) &&
        Objects.equals(this.fileSizeSum, bySizeFacet.fileSizeSum) &&
        Objects.equals(this.cost, bySizeFacet.cost) &&
        Objects.equals(this.less100Kb, bySizeFacet.less100Kb) &&
        Objects.equals(this.less1Mb, bySizeFacet.less1Mb) &&
        Objects.equals(this.less10Mb, bySizeFacet.less10Mb) &&
        Objects.equals(this.less100Mb, bySizeFacet.less100Mb) &&
        Objects.equals(this.less1Gb, bySizeFacet.less1Gb) &&
        Objects.equals(this.less10Gb, bySizeFacet.less10Gb) &&
        Objects.equals(this.less100Gb, bySizeFacet.less100Gb) &&
        Objects.equals(this.more100Gb, bySizeFacet.more100Gb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, filesCount, fileSizeSum, cost, less100Kb, less1Mb, less10Mb, less100Mb, less1Gb, less10Gb, less100Gb, more100Gb);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BySizeFacet {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
    sb.append("    fileSizeSum: ").append(toIndentedString(fileSizeSum)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    less100Kb: ").append(toIndentedString(less100Kb)).append("\n");
    sb.append("    less1Mb: ").append(toIndentedString(less1Mb)).append("\n");
    sb.append("    less10Mb: ").append(toIndentedString(less10Mb)).append("\n");
    sb.append("    less100Mb: ").append(toIndentedString(less100Mb)).append("\n");
    sb.append("    less1Gb: ").append(toIndentedString(less1Gb)).append("\n");
    sb.append("    less10Gb: ").append(toIndentedString(less10Gb)).append("\n");
    sb.append("    less100Gb: ").append(toIndentedString(less100Gb)).append("\n");
    sb.append("    more100Gb: ").append(toIndentedString(more100Gb)).append("\n");
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

