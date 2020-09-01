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
import io.nodeum.sdk.client.model.ByPrimaryTypeFacet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TypeToPrimaryFacets
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-01T09:57:32.172Z[GMT]")
public class TypeToPrimaryFacets {
  public static final String SERIALIZED_NAME_ON_PRIMARY_CONTAINER = "on_primary_container";
  @SerializedName(SERIALIZED_NAME_ON_PRIMARY_CONTAINER)
  private ByPrimaryTypeFacet onPrimaryContainer = null;

  public static final String SERIALIZED_NAME_ON_PRIMARY_NAS = "on_primary_nas";
  @SerializedName(SERIALIZED_NAME_ON_PRIMARY_NAS)
  private ByPrimaryTypeFacet onPrimaryNas = null;

  public static final String SERIALIZED_NAME_ON_PRIMARY_PUBLIC_CLOUD = "on_primary_public_cloud";
  @SerializedName(SERIALIZED_NAME_ON_PRIMARY_PUBLIC_CLOUD)
  private ByPrimaryTypeFacet onPrimaryPublicCloud = null;

  public static final String SERIALIZED_NAME_ON_PRIMARY_OBJECT_CLOUD = "on_primary_object_cloud";
  @SerializedName(SERIALIZED_NAME_ON_PRIMARY_OBJECT_CLOUD)
  private ByPrimaryTypeFacet onPrimaryObjectCloud = null;


  public TypeToPrimaryFacets onPrimaryContainer(ByPrimaryTypeFacet onPrimaryContainer) {
    
    this.onPrimaryContainer = onPrimaryContainer;
    return this;
  }

   /**
   * Get onPrimaryContainer
   * @return onPrimaryContainer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByPrimaryTypeFacet getOnPrimaryContainer() {
    return onPrimaryContainer;
  }


  public void setOnPrimaryContainer(ByPrimaryTypeFacet onPrimaryContainer) {
    this.onPrimaryContainer = onPrimaryContainer;
  }


  public TypeToPrimaryFacets onPrimaryNas(ByPrimaryTypeFacet onPrimaryNas) {
    
    this.onPrimaryNas = onPrimaryNas;
    return this;
  }

   /**
   * Get onPrimaryNas
   * @return onPrimaryNas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByPrimaryTypeFacet getOnPrimaryNas() {
    return onPrimaryNas;
  }


  public void setOnPrimaryNas(ByPrimaryTypeFacet onPrimaryNas) {
    this.onPrimaryNas = onPrimaryNas;
  }


  public TypeToPrimaryFacets onPrimaryPublicCloud(ByPrimaryTypeFacet onPrimaryPublicCloud) {
    
    this.onPrimaryPublicCloud = onPrimaryPublicCloud;
    return this;
  }

   /**
   * Get onPrimaryPublicCloud
   * @return onPrimaryPublicCloud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByPrimaryTypeFacet getOnPrimaryPublicCloud() {
    return onPrimaryPublicCloud;
  }


  public void setOnPrimaryPublicCloud(ByPrimaryTypeFacet onPrimaryPublicCloud) {
    this.onPrimaryPublicCloud = onPrimaryPublicCloud;
  }


  public TypeToPrimaryFacets onPrimaryObjectCloud(ByPrimaryTypeFacet onPrimaryObjectCloud) {
    
    this.onPrimaryObjectCloud = onPrimaryObjectCloud;
    return this;
  }

   /**
   * Get onPrimaryObjectCloud
   * @return onPrimaryObjectCloud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByPrimaryTypeFacet getOnPrimaryObjectCloud() {
    return onPrimaryObjectCloud;
  }


  public void setOnPrimaryObjectCloud(ByPrimaryTypeFacet onPrimaryObjectCloud) {
    this.onPrimaryObjectCloud = onPrimaryObjectCloud;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeToPrimaryFacets typeToPrimaryFacets = (TypeToPrimaryFacets) o;
    return Objects.equals(this.onPrimaryContainer, typeToPrimaryFacets.onPrimaryContainer) &&
        Objects.equals(this.onPrimaryNas, typeToPrimaryFacets.onPrimaryNas) &&
        Objects.equals(this.onPrimaryPublicCloud, typeToPrimaryFacets.onPrimaryPublicCloud) &&
        Objects.equals(this.onPrimaryObjectCloud, typeToPrimaryFacets.onPrimaryObjectCloud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onPrimaryContainer, onPrimaryNas, onPrimaryPublicCloud, onPrimaryObjectCloud);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeToPrimaryFacets {\n");
    sb.append("    onPrimaryContainer: ").append(toIndentedString(onPrimaryContainer)).append("\n");
    sb.append("    onPrimaryNas: ").append(toIndentedString(onPrimaryNas)).append("\n");
    sb.append("    onPrimaryPublicCloud: ").append(toIndentedString(onPrimaryPublicCloud)).append("\n");
    sb.append("    onPrimaryObjectCloud: ").append(toIndentedString(onPrimaryObjectCloud)).append("\n");
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

