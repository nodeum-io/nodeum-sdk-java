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
 * CloudBucket
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-01T09:57:32.172Z[GMT]")
public class CloudBucket {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CLOUD_CONNECTOR_ID = "cloud_connector_id";
  @SerializedName(SERIALIZED_NAME_CLOUD_CONNECTOR_ID)
  private Integer cloudConnectorId;

  public static final String SERIALIZED_NAME_POOL_ID = "pool_id";
  @SerializedName(SERIALIZED_NAME_POOL_ID)
  private Integer poolId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FILE_COUNT = "file_count";
  @SerializedName(SERIALIZED_NAME_FILE_COUNT)
  private Integer fileCount;

  public static final String SERIALIZED_NAME_FILE_SIZE_SUM = "file_size_sum";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE_SUM)
  private Integer fileSizeSum;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private String options;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
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




   /**
   * Get poolId
   * @return poolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPoolId() {
    return poolId;
  }




   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }




   /**
   * Get fileCount
   * @return fileCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFileCount() {
    return fileCount;
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
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocation() {
    return location;
  }




  public CloudBucket price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public CloudBucket options(String options) {
    
    this.options = options;
    return this;
  }

   /**
   * S3FS mounting options, separated by comma
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "S3FS mounting options, separated by comma")

  public String getOptions() {
    return options;
  }


  public void setOptions(String options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudBucket cloudBucket = (CloudBucket) o;
    return Objects.equals(this.id, cloudBucket.id) &&
        Objects.equals(this.cloudConnectorId, cloudBucket.cloudConnectorId) &&
        Objects.equals(this.poolId, cloudBucket.poolId) &&
        Objects.equals(this.name, cloudBucket.name) &&
        Objects.equals(this.fileCount, cloudBucket.fileCount) &&
        Objects.equals(this.fileSizeSum, cloudBucket.fileSizeSum) &&
        Objects.equals(this.location, cloudBucket.location) &&
        Objects.equals(this.price, cloudBucket.price) &&
        Objects.equals(this.options, cloudBucket.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cloudConnectorId, poolId, name, fileCount, fileSizeSum, location, price, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudBucket {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cloudConnectorId: ").append(toIndentedString(cloudConnectorId)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileCount: ").append(toIndentedString(fileCount)).append("\n");
    sb.append("    fileSizeSum: ").append(toIndentedString(fileSizeSum)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

