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
import io.nodeum.sdk.client.model.ByDateFacetBuckets;
import io.nodeum.sdk.client.model.ByPrimaryFacetAllOf;
import io.nodeum.sdk.client.model.FileFacet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ByPrimaryTypeFacet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-17T20:02:36.953Z[GMT]")
public class ByPrimaryTypeFacet {
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

  public static final String SERIALIZED_NAME_IN_CACHE = "in_cache";
  @SerializedName(SERIALIZED_NAME_IN_CACHE)
  private FileFacet inCache = null;

  public static final String SERIALIZED_NAME_LESS1_WEEK = "less_1_week";
  @SerializedName(SERIALIZED_NAME_LESS1_WEEK)
  private FileFacet less1Week = null;

  public static final String SERIALIZED_NAME_LESS1_MONTH = "less_1_month";
  @SerializedName(SERIALIZED_NAME_LESS1_MONTH)
  private FileFacet less1Month = null;

  public static final String SERIALIZED_NAME_LESS3_MONTHS = "less_3_months";
  @SerializedName(SERIALIZED_NAME_LESS3_MONTHS)
  private FileFacet less3Months = null;

  public static final String SERIALIZED_NAME_LESS6_MONTHS = "less_6_months";
  @SerializedName(SERIALIZED_NAME_LESS6_MONTHS)
  private FileFacet less6Months = null;

  public static final String SERIALIZED_NAME_LESS1_YEAR = "less_1_year";
  @SerializedName(SERIALIZED_NAME_LESS1_YEAR)
  private FileFacet less1Year = null;

  public static final String SERIALIZED_NAME_LESS2_YEARS = "less_2_years";
  @SerializedName(SERIALIZED_NAME_LESS2_YEARS)
  private FileFacet less2Years = null;

  public static final String SERIALIZED_NAME_MORE2_YEARS = "more_2_years";
  @SerializedName(SERIALIZED_NAME_MORE2_YEARS)
  private FileFacet more2Years = null;

  public static final String SERIALIZED_NAME_PRIM_NAME_S = "prim_name_s";
  @SerializedName(SERIALIZED_NAME_PRIM_NAME_S)
  private ByDateFacetBuckets primNameS;


  public ByPrimaryTypeFacet count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public ByPrimaryTypeFacet filesCount(Integer filesCount) {
    
    this.filesCount = filesCount;
    return this;
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


  public void setFilesCount(Integer filesCount) {
    this.filesCount = filesCount;
  }


  public ByPrimaryTypeFacet fileSizeSum(Integer fileSizeSum) {
    
    this.fileSizeSum = fileSizeSum;
    return this;
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


  public void setFileSizeSum(Integer fileSizeSum) {
    this.fileSizeSum = fileSizeSum;
  }


  public ByPrimaryTypeFacet cost(BigDecimal cost) {
    
    this.cost = cost;
    return this;
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


  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }


  public ByPrimaryTypeFacet inCache(FileFacet inCache) {
    
    this.inCache = inCache;
    return this;
  }

   /**
   * Get inCache
   * @return inCache
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileFacet getInCache() {
    return inCache;
  }


  public void setInCache(FileFacet inCache) {
    this.inCache = inCache;
  }


  public ByPrimaryTypeFacet less1Week(FileFacet less1Week) {
    
    this.less1Week = less1Week;
    return this;
  }

   /**
   * Get less1Week
   * @return less1Week
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileFacet getLess1Week() {
    return less1Week;
  }


  public void setLess1Week(FileFacet less1Week) {
    this.less1Week = less1Week;
  }


  public ByPrimaryTypeFacet less1Month(FileFacet less1Month) {
    
    this.less1Month = less1Month;
    return this;
  }

   /**
   * Get less1Month
   * @return less1Month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileFacet getLess1Month() {
    return less1Month;
  }


  public void setLess1Month(FileFacet less1Month) {
    this.less1Month = less1Month;
  }


  public ByPrimaryTypeFacet less3Months(FileFacet less3Months) {
    
    this.less3Months = less3Months;
    return this;
  }

   /**
   * Get less3Months
   * @return less3Months
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileFacet getLess3Months() {
    return less3Months;
  }


  public void setLess3Months(FileFacet less3Months) {
    this.less3Months = less3Months;
  }


  public ByPrimaryTypeFacet less6Months(FileFacet less6Months) {
    
    this.less6Months = less6Months;
    return this;
  }

   /**
   * Get less6Months
   * @return less6Months
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileFacet getLess6Months() {
    return less6Months;
  }


  public void setLess6Months(FileFacet less6Months) {
    this.less6Months = less6Months;
  }


  public ByPrimaryTypeFacet less1Year(FileFacet less1Year) {
    
    this.less1Year = less1Year;
    return this;
  }

   /**
   * Get less1Year
   * @return less1Year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileFacet getLess1Year() {
    return less1Year;
  }


  public void setLess1Year(FileFacet less1Year) {
    this.less1Year = less1Year;
  }


  public ByPrimaryTypeFacet less2Years(FileFacet less2Years) {
    
    this.less2Years = less2Years;
    return this;
  }

   /**
   * Get less2Years
   * @return less2Years
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileFacet getLess2Years() {
    return less2Years;
  }


  public void setLess2Years(FileFacet less2Years) {
    this.less2Years = less2Years;
  }


  public ByPrimaryTypeFacet more2Years(FileFacet more2Years) {
    
    this.more2Years = more2Years;
    return this;
  }

   /**
   * Get more2Years
   * @return more2Years
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileFacet getMore2Years() {
    return more2Years;
  }


  public void setMore2Years(FileFacet more2Years) {
    this.more2Years = more2Years;
  }


  public ByPrimaryTypeFacet primNameS(ByDateFacetBuckets primNameS) {
    
    this.primNameS = primNameS;
    return this;
  }

   /**
   * Get primNameS
   * @return primNameS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByDateFacetBuckets getPrimNameS() {
    return primNameS;
  }


  public void setPrimNameS(ByDateFacetBuckets primNameS) {
    this.primNameS = primNameS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ByPrimaryTypeFacet byPrimaryTypeFacet = (ByPrimaryTypeFacet) o;
    return Objects.equals(this.count, byPrimaryTypeFacet.count) &&
        Objects.equals(this.filesCount, byPrimaryTypeFacet.filesCount) &&
        Objects.equals(this.fileSizeSum, byPrimaryTypeFacet.fileSizeSum) &&
        Objects.equals(this.cost, byPrimaryTypeFacet.cost) &&
        Objects.equals(this.inCache, byPrimaryTypeFacet.inCache) &&
        Objects.equals(this.less1Week, byPrimaryTypeFacet.less1Week) &&
        Objects.equals(this.less1Month, byPrimaryTypeFacet.less1Month) &&
        Objects.equals(this.less3Months, byPrimaryTypeFacet.less3Months) &&
        Objects.equals(this.less6Months, byPrimaryTypeFacet.less6Months) &&
        Objects.equals(this.less1Year, byPrimaryTypeFacet.less1Year) &&
        Objects.equals(this.less2Years, byPrimaryTypeFacet.less2Years) &&
        Objects.equals(this.more2Years, byPrimaryTypeFacet.more2Years) &&
        Objects.equals(this.primNameS, byPrimaryTypeFacet.primNameS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, filesCount, fileSizeSum, cost, inCache, less1Week, less1Month, less3Months, less6Months, less1Year, less2Years, more2Years, primNameS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ByPrimaryTypeFacet {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
    sb.append("    fileSizeSum: ").append(toIndentedString(fileSizeSum)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    inCache: ").append(toIndentedString(inCache)).append("\n");
    sb.append("    less1Week: ").append(toIndentedString(less1Week)).append("\n");
    sb.append("    less1Month: ").append(toIndentedString(less1Month)).append("\n");
    sb.append("    less3Months: ").append(toIndentedString(less3Months)).append("\n");
    sb.append("    less6Months: ").append(toIndentedString(less6Months)).append("\n");
    sb.append("    less1Year: ").append(toIndentedString(less1Year)).append("\n");
    sb.append("    less2Years: ").append(toIndentedString(less2Years)).append("\n");
    sb.append("    more2Years: ").append(toIndentedString(more2Years)).append("\n");
    sb.append("    primNameS: ").append(toIndentedString(primNameS)).append("\n");
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

