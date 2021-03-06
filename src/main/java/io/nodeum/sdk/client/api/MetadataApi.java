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


package io.nodeum.sdk.client.api;

import io.nodeum.sdk.client.ApiCallback;
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.ApiResponse;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.Pair;
import io.nodeum.sdk.client.ProgressRequestBody;
import io.nodeum.sdk.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.nodeum.sdk.client.model.FileMetadataDefinition;
import io.nodeum.sdk.client.model.FileMetadataDefinitionCollection;
import io.nodeum.sdk.client.model.TaskMetadataDefinition;
import io.nodeum.sdk.client.model.TaskMetadataDefinitionCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetadataApi {
    private ApiClient localVarApiClient;

    public MetadataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MetadataApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for indexFileMetadataDefinitions
     * @param limit The number of items to display for pagination. (optional)
     * @param offset The number of items to skip for pagination. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of file metadata </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call indexFileMetadataDefinitionsCall(Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/file_metadata_definitions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call indexFileMetadataDefinitionsValidateBeforeCall(Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = indexFileMetadataDefinitionsCall(limit, offset, _callback);
        return localVarCall;

    }

    /**
     * List file metadata definitions
     * **API Key Scope**: file_metadata_definitions / index
     * @param limit The number of items to display for pagination. (optional)
     * @param offset The number of items to skip for pagination. (optional)
     * @return FileMetadataDefinitionCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of file metadata </td><td>  -  </td></tr>
     </table>
     */
    public FileMetadataDefinitionCollection indexFileMetadataDefinitions(Integer limit, Integer offset) throws ApiException {
        ApiResponse<FileMetadataDefinitionCollection> localVarResp = indexFileMetadataDefinitionsWithHttpInfo(limit, offset);
        return localVarResp.getData();
    }

    /**
     * List file metadata definitions
     * **API Key Scope**: file_metadata_definitions / index
     * @param limit The number of items to display for pagination. (optional)
     * @param offset The number of items to skip for pagination. (optional)
     * @return ApiResponse&lt;FileMetadataDefinitionCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of file metadata </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FileMetadataDefinitionCollection> indexFileMetadataDefinitionsWithHttpInfo(Integer limit, Integer offset) throws ApiException {
        okhttp3.Call localVarCall = indexFileMetadataDefinitionsValidateBeforeCall(limit, offset, null);
        Type localVarReturnType = new TypeToken<FileMetadataDefinitionCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List file metadata definitions (asynchronously)
     * **API Key Scope**: file_metadata_definitions / index
     * @param limit The number of items to display for pagination. (optional)
     * @param offset The number of items to skip for pagination. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of file metadata </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call indexFileMetadataDefinitionsAsync(Integer limit, Integer offset, final ApiCallback<FileMetadataDefinitionCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = indexFileMetadataDefinitionsValidateBeforeCall(limit, offset, _callback);
        Type localVarReturnType = new TypeToken<FileMetadataDefinitionCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for indexTaskMetadataDefinitions
     * @param limit The number of items to display for pagination. (optional)
     * @param offset The number of items to skip for pagination. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of task metadata </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call indexTaskMetadataDefinitionsCall(Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/task_metadata_definitions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call indexTaskMetadataDefinitionsValidateBeforeCall(Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = indexTaskMetadataDefinitionsCall(limit, offset, _callback);
        return localVarCall;

    }

    /**
     * List task metadata definitions
     * **API Key Scope**: task_metadata_definitions / index
     * @param limit The number of items to display for pagination. (optional)
     * @param offset The number of items to skip for pagination. (optional)
     * @return TaskMetadataDefinitionCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of task metadata </td><td>  -  </td></tr>
     </table>
     */
    public TaskMetadataDefinitionCollection indexTaskMetadataDefinitions(Integer limit, Integer offset) throws ApiException {
        ApiResponse<TaskMetadataDefinitionCollection> localVarResp = indexTaskMetadataDefinitionsWithHttpInfo(limit, offset);
        return localVarResp.getData();
    }

    /**
     * List task metadata definitions
     * **API Key Scope**: task_metadata_definitions / index
     * @param limit The number of items to display for pagination. (optional)
     * @param offset The number of items to skip for pagination. (optional)
     * @return ApiResponse&lt;TaskMetadataDefinitionCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of task metadata </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskMetadataDefinitionCollection> indexTaskMetadataDefinitionsWithHttpInfo(Integer limit, Integer offset) throws ApiException {
        okhttp3.Call localVarCall = indexTaskMetadataDefinitionsValidateBeforeCall(limit, offset, null);
        Type localVarReturnType = new TypeToken<TaskMetadataDefinitionCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List task metadata definitions (asynchronously)
     * **API Key Scope**: task_metadata_definitions / index
     * @param limit The number of items to display for pagination. (optional)
     * @param offset The number of items to skip for pagination. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of task metadata </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call indexTaskMetadataDefinitionsAsync(Integer limit, Integer offset, final ApiCallback<TaskMetadataDefinitionCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = indexTaskMetadataDefinitionsValidateBeforeCall(limit, offset, _callback);
        Type localVarReturnType = new TypeToken<TaskMetadataDefinitionCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for showFileMetadataDefinition
     * @param metadataDefinitionId Numeric ID or key of a metadata definition (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific file metadata </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call showFileMetadataDefinitionCall(String metadataDefinitionId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/file_metadata_definitions/{metadata_definition_id}"
            .replaceAll("\\{" + "metadata_definition_id" + "\\}", localVarApiClient.escapeString(metadataDefinitionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call showFileMetadataDefinitionValidateBeforeCall(String metadataDefinitionId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'metadataDefinitionId' is set
        if (metadataDefinitionId == null) {
            throw new ApiException("Missing the required parameter 'metadataDefinitionId' when calling showFileMetadataDefinition(Async)");
        }
        

        okhttp3.Call localVarCall = showFileMetadataDefinitionCall(metadataDefinitionId, _callback);
        return localVarCall;

    }

    /**
     * Displays a specific task metadata definition.
     * **API Key Scope**: file_metadata_definitions / show
     * @param metadataDefinitionId Numeric ID or key of a metadata definition (required)
     * @return FileMetadataDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific file metadata </td><td>  -  </td></tr>
     </table>
     */
    public FileMetadataDefinition showFileMetadataDefinition(String metadataDefinitionId) throws ApiException {
        ApiResponse<FileMetadataDefinition> localVarResp = showFileMetadataDefinitionWithHttpInfo(metadataDefinitionId);
        return localVarResp.getData();
    }

    /**
     * Displays a specific task metadata definition.
     * **API Key Scope**: file_metadata_definitions / show
     * @param metadataDefinitionId Numeric ID or key of a metadata definition (required)
     * @return ApiResponse&lt;FileMetadataDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific file metadata </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FileMetadataDefinition> showFileMetadataDefinitionWithHttpInfo(String metadataDefinitionId) throws ApiException {
        okhttp3.Call localVarCall = showFileMetadataDefinitionValidateBeforeCall(metadataDefinitionId, null);
        Type localVarReturnType = new TypeToken<FileMetadataDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Displays a specific task metadata definition. (asynchronously)
     * **API Key Scope**: file_metadata_definitions / show
     * @param metadataDefinitionId Numeric ID or key of a metadata definition (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific file metadata </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call showFileMetadataDefinitionAsync(String metadataDefinitionId, final ApiCallback<FileMetadataDefinition> _callback) throws ApiException {

        okhttp3.Call localVarCall = showFileMetadataDefinitionValidateBeforeCall(metadataDefinitionId, _callback);
        Type localVarReturnType = new TypeToken<FileMetadataDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for showTaskMetadataDefinition
     * @param metadataDefinitionId Numeric ID or key of a metadata definition (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific task metadata </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call showTaskMetadataDefinitionCall(String metadataDefinitionId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/task_metadata_definitions/{metadata_definition_id}"
            .replaceAll("\\{" + "metadata_definition_id" + "\\}", localVarApiClient.escapeString(metadataDefinitionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call showTaskMetadataDefinitionValidateBeforeCall(String metadataDefinitionId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'metadataDefinitionId' is set
        if (metadataDefinitionId == null) {
            throw new ApiException("Missing the required parameter 'metadataDefinitionId' when calling showTaskMetadataDefinition(Async)");
        }
        

        okhttp3.Call localVarCall = showTaskMetadataDefinitionCall(metadataDefinitionId, _callback);
        return localVarCall;

    }

    /**
     * Displays a specific task metadata definition.
     * **API Key Scope**: task_metadata_definitions / show
     * @param metadataDefinitionId Numeric ID or key of a metadata definition (required)
     * @return TaskMetadataDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific task metadata </td><td>  -  </td></tr>
     </table>
     */
    public TaskMetadataDefinition showTaskMetadataDefinition(String metadataDefinitionId) throws ApiException {
        ApiResponse<TaskMetadataDefinition> localVarResp = showTaskMetadataDefinitionWithHttpInfo(metadataDefinitionId);
        return localVarResp.getData();
    }

    /**
     * Displays a specific task metadata definition.
     * **API Key Scope**: task_metadata_definitions / show
     * @param metadataDefinitionId Numeric ID or key of a metadata definition (required)
     * @return ApiResponse&lt;TaskMetadataDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific task metadata </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskMetadataDefinition> showTaskMetadataDefinitionWithHttpInfo(String metadataDefinitionId) throws ApiException {
        okhttp3.Call localVarCall = showTaskMetadataDefinitionValidateBeforeCall(metadataDefinitionId, null);
        Type localVarReturnType = new TypeToken<TaskMetadataDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Displays a specific task metadata definition. (asynchronously)
     * **API Key Scope**: task_metadata_definitions / show
     * @param metadataDefinitionId Numeric ID or key of a metadata definition (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific task metadata </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call showTaskMetadataDefinitionAsync(String metadataDefinitionId, final ApiCallback<TaskMetadataDefinition> _callback) throws ApiException {

        okhttp3.Call localVarCall = showTaskMetadataDefinitionValidateBeforeCall(metadataDefinitionId, _callback);
        Type localVarReturnType = new TypeToken<TaskMetadataDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
