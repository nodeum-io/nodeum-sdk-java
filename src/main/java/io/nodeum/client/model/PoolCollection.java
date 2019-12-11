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
import io.nodeum.client.model.Pool;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PoolCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-11T14:27:44.769Z[GMT]")
public class PoolCollection {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_POOLS = "pools";
  @SerializedName(SERIALIZED_NAME_POOLS)
  private List<Pool> pools = null;


   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getCount() {
    return count;
  }




   /**
   * Get pools
   * @return pools
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Pool> getPools() {
    return pools;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolCollection poolCollection = (PoolCollection) o;
    return Objects.equals(this.count, poolCollection.count) &&
        Objects.equals(this.pools, poolCollection.pools);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, pools);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolCollection {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
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

