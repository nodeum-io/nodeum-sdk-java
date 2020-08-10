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
import io.nodeum.sdk.client.model.ByDateFacetBuckets;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BySecondaryTapeFacetAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-10T06:37:58.200Z[GMT]")
public class BySecondaryTapeFacetAllOf {
  public static final String SERIALIZED_NAME_SEC_TAPE_LIBRARY_NAME_S = "sec_tape_library_name_s";
  @SerializedName(SERIALIZED_NAME_SEC_TAPE_LIBRARY_NAME_S)
  private ByDateFacetBuckets secTapeLibraryNameS;

  public static final String SERIALIZED_NAME_SEC_TAPE_BARCODE_S = "sec_tape_barcode_s";
  @SerializedName(SERIALIZED_NAME_SEC_TAPE_BARCODE_S)
  private ByDateFacetBuckets secTapeBarcodeS;

  public static final String SERIALIZED_NAME_SEC_POOL_NAME_S = "sec_pool_name_s";
  @SerializedName(SERIALIZED_NAME_SEC_POOL_NAME_S)
  private ByDateFacetBuckets secPoolNameS;


  public BySecondaryTapeFacetAllOf secTapeLibraryNameS(ByDateFacetBuckets secTapeLibraryNameS) {
    
    this.secTapeLibraryNameS = secTapeLibraryNameS;
    return this;
  }

   /**
   * Get secTapeLibraryNameS
   * @return secTapeLibraryNameS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByDateFacetBuckets getSecTapeLibraryNameS() {
    return secTapeLibraryNameS;
  }


  public void setSecTapeLibraryNameS(ByDateFacetBuckets secTapeLibraryNameS) {
    this.secTapeLibraryNameS = secTapeLibraryNameS;
  }


  public BySecondaryTapeFacetAllOf secTapeBarcodeS(ByDateFacetBuckets secTapeBarcodeS) {
    
    this.secTapeBarcodeS = secTapeBarcodeS;
    return this;
  }

   /**
   * Get secTapeBarcodeS
   * @return secTapeBarcodeS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByDateFacetBuckets getSecTapeBarcodeS() {
    return secTapeBarcodeS;
  }


  public void setSecTapeBarcodeS(ByDateFacetBuckets secTapeBarcodeS) {
    this.secTapeBarcodeS = secTapeBarcodeS;
  }


  public BySecondaryTapeFacetAllOf secPoolNameS(ByDateFacetBuckets secPoolNameS) {
    
    this.secPoolNameS = secPoolNameS;
    return this;
  }

   /**
   * Get secPoolNameS
   * @return secPoolNameS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByDateFacetBuckets getSecPoolNameS() {
    return secPoolNameS;
  }


  public void setSecPoolNameS(ByDateFacetBuckets secPoolNameS) {
    this.secPoolNameS = secPoolNameS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BySecondaryTapeFacetAllOf bySecondaryTapeFacetAllOf = (BySecondaryTapeFacetAllOf) o;
    return Objects.equals(this.secTapeLibraryNameS, bySecondaryTapeFacetAllOf.secTapeLibraryNameS) &&
        Objects.equals(this.secTapeBarcodeS, bySecondaryTapeFacetAllOf.secTapeBarcodeS) &&
        Objects.equals(this.secPoolNameS, bySecondaryTapeFacetAllOf.secPoolNameS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secTapeLibraryNameS, secTapeBarcodeS, secPoolNameS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BySecondaryTapeFacetAllOf {\n");
    sb.append("    secTapeLibraryNameS: ").append(toIndentedString(secTapeLibraryNameS)).append("\n");
    sb.append("    secTapeBarcodeS: ").append(toIndentedString(secTapeBarcodeS)).append("\n");
    sb.append("    secPoolNameS: ").append(toIndentedString(secPoolNameS)).append("\n");
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

