/*
 * Nodeum API Reference
 * The Nodeum API makes it easy to tap into the digital data mesh that runs across your organisation. Make requests to our API endpoints and we’ll give you everything you need to interconnect your business workflows with your storage.  All production API requests are made to:  http://nodeumhostname/api/  The current production version of the API is v1.   **REST** The Nodeum API is a RESTful API. This means that the API is designed to allow you to get, create, update, & delete objects with the HTTP verbs GET, POST, PUT, PATCH, & DELETE.  **JSON** The Nodeum API speaks exclusively in JSON. This means that you should always set the Content-Type header to application/json to ensure that your requests are properly accepted and processed by the API.  **Authentication** All API calls require user-password authentication.   **Cross-Origin Resource Sharing** The Nodeum API supports CORS for communicating from Javascript for these endpoints. You will need to specify an Origin URI when creating your application to allow for CORS to be whitelisted for your domain.   **Pagination** Some endpoints such as File Listing return a potentially lengthy array of objects. In order to keep the response sizes manageable the API will take advantage of pagination. Pagination is a mechanism for returning a subset of the results for a request and allowing for subsequent requests to “page” through the rest of the results until the end is reached. Paginated endpoints follow a standard interface that accepts two query parameters, limit and offset, and return a payload that follows a standard form. These parameters names and their behavior are borrowed from SQL LIMIT and OFFSET keywords.  **Versioning** The Nodeum API is constantly being worked on to add features, make improvements, and fix bugs. This means that you should expect changes to be introduced and documented.   However, there are some changes or additions that are considered backwards-compatible and your applications should be flexible enough to handle them. These include:  - Adding new endpoints to the API - Adding new attributes to the response of an existing endpoint - Changing the order of attributes of responses (JSON by definition is an object of unordered key/value pairs)   **Filter parameters** When browsing a list of items, multiple filter parameters may be applied. Some operators can be added to the value as a prefix:  - `=` value is equal. Default operator, may be omitted  - `!=` value is different  - `>` greater than  - `>=` greater than or equal  - `<` lower than  - `>=` lower than or equal  - `><` included in list, items should be separated by `|`  - `!><` not included in list, items should be separated by `|`  - `~` pattern matching, may include `%` (any characters) and `_` (one character)  - `!~` pattern not matching, may include `%` (any characters) and `_` (one character)
 *
 * The version of the OpenAPI document: 2.0.0
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
import io.nodeum.client.model.NodeumFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TaskDestinationDown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-11T14:24:52.440Z[GMT]")
public class TaskDestinationDown {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_FOLDER = "folder";
  @SerializedName(SERIALIZED_NAME_FOLDER)
  private NodeumFile folder;

  public static final String SERIALIZED_NAME_TAPE_ID = "tape_id";
  @SerializedName(SERIALIZED_NAME_TAPE_ID)
  private Integer tapeId;

  public static final String SERIALIZED_NAME_TAPE_POOL_ID = "tape_pool_id";
  @SerializedName(SERIALIZED_NAME_TAPE_POOL_ID)
  private Integer tapePoolId;

  public static final String SERIALIZED_NAME_CLOUD_POOL_ID = "cloud_pool_id";
  @SerializedName(SERIALIZED_NAME_CLOUD_POOL_ID)
  private Integer cloudPoolId;

  public static final String SERIALIZED_NAME_NAS_POOL_ID = "nas_pool_id";
  @SerializedName(SERIALIZED_NAME_NAS_POOL_ID)
  private Integer nasPoolId;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }




  public TaskDestinationDown folder(NodeumFile folder) {
    
    this.folder = folder;
    return this;
  }

   /**
   * Get folder
   * @return folder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NodeumFile getFolder() {
    return folder;
  }


  public void setFolder(NodeumFile folder) {
    this.folder = folder;
  }


  public TaskDestinationDown tapeId(Integer tapeId) {
    
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


  public TaskDestinationDown tapePoolId(Integer tapePoolId) {
    
    this.tapePoolId = tapePoolId;
    return this;
  }

   /**
   * Get tapePoolId
   * @return tapePoolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTapePoolId() {
    return tapePoolId;
  }


  public void setTapePoolId(Integer tapePoolId) {
    this.tapePoolId = tapePoolId;
  }


  public TaskDestinationDown cloudPoolId(Integer cloudPoolId) {
    
    this.cloudPoolId = cloudPoolId;
    return this;
  }

   /**
   * Get cloudPoolId
   * @return cloudPoolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCloudPoolId() {
    return cloudPoolId;
  }


  public void setCloudPoolId(Integer cloudPoolId) {
    this.cloudPoolId = cloudPoolId;
  }


  public TaskDestinationDown nasPoolId(Integer nasPoolId) {
    
    this.nasPoolId = nasPoolId;
    return this;
  }

   /**
   * Get nasPoolId
   * @return nasPoolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNasPoolId() {
    return nasPoolId;
  }


  public void setNasPoolId(Integer nasPoolId) {
    this.nasPoolId = nasPoolId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDestinationDown taskDestinationDown = (TaskDestinationDown) o;
    return Objects.equals(this.id, taskDestinationDown.id) &&
        Objects.equals(this.folder, taskDestinationDown.folder) &&
        Objects.equals(this.tapeId, taskDestinationDown.tapeId) &&
        Objects.equals(this.tapePoolId, taskDestinationDown.tapePoolId) &&
        Objects.equals(this.cloudPoolId, taskDestinationDown.cloudPoolId) &&
        Objects.equals(this.nasPoolId, taskDestinationDown.nasPoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, folder, tapeId, tapePoolId, cloudPoolId, nasPoolId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDestinationDown {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    tapeId: ").append(toIndentedString(tapeId)).append("\n");
    sb.append("    tapePoolId: ").append(toIndentedString(tapePoolId)).append("\n");
    sb.append("    cloudPoolId: ").append(toIndentedString(cloudPoolId)).append("\n");
    sb.append("    nasPoolId: ").append(toIndentedString(nasPoolId)).append("\n");
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

