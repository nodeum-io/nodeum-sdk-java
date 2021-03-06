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


import io.nodeum.sdk.client.model.ActiveJobStatus;
import java.io.File;
import io.nodeum.sdk.client.model.Reset;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemsApi {
    private ApiClient localVarApiClient;

    public SystemsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SystemsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for downloadResetVars
     * @param resetForm  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The var file created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadResetVarsCall(Reset resetForm, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = resetForm;

        // create path and map variables
        String localVarPath = "/systems/reset/generate_vars";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/x-yaml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call downloadResetVarsValidateBeforeCall(Reset resetForm, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'resetForm' is set
        if (resetForm == null) {
            throw new ApiException("Missing the required parameter 'resetForm' when calling downloadResetVars(Async)");
        }
        

        okhttp3.Call localVarCall = downloadResetVarsCall(resetForm, _callback);
        return localVarCall;

    }

    /**
     * Creates a YAML file with selected tables and downloads it
     * 
     * @param resetForm  (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The var file created </td><td>  -  </td></tr>
     </table>
     */
    public File downloadResetVars(Reset resetForm) throws ApiException {
        ApiResponse<File> localVarResp = downloadResetVarsWithHttpInfo(resetForm);
        return localVarResp.getData();
    }

    /**
     * Creates a YAML file with selected tables and downloads it
     * 
     * @param resetForm  (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The var file created </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> downloadResetVarsWithHttpInfo(Reset resetForm) throws ApiException {
        okhttp3.Call localVarCall = downloadResetVarsValidateBeforeCall(resetForm, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates a YAML file with selected tables and downloads it (asynchronously)
     * 
     * @param resetForm  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The var file created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadResetVarsAsync(Reset resetForm, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadResetVarsValidateBeforeCall(resetForm, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for resultDownloadTraces
     * @param jobId ID of active job (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A completed job for downloading traces. </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> An active job that may be queued, working, completed or failed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resultDownloadTracesCall(String jobId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/systems/download_traces";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (jobId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("job_id", jobId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/tar+gzip", "queued", "working", "failed", 
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
    private okhttp3.Call resultDownloadTracesValidateBeforeCall(String jobId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling resultDownloadTraces(Async)");
        }
        

        okhttp3.Call localVarCall = resultDownloadTracesCall(jobId, _callback);
        return localVarCall;

    }

    /**
     * Check result of a download traces job.
     * **API Key Scope**: systems / download_traces
     * @param jobId ID of active job (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A completed job for downloading traces. </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> An active job that may be queued, working, completed or failed. </td><td>  -  </td></tr>
     </table>
     */
    public File resultDownloadTraces(String jobId) throws ApiException {
        ApiResponse<File> localVarResp = resultDownloadTracesWithHttpInfo(jobId);
        return localVarResp.getData();
    }

    /**
     * Check result of a download traces job.
     * **API Key Scope**: systems / download_traces
     * @param jobId ID of active job (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A completed job for downloading traces. </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> An active job that may be queued, working, completed or failed. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> resultDownloadTracesWithHttpInfo(String jobId) throws ApiException {
        okhttp3.Call localVarCall = resultDownloadTracesValidateBeforeCall(jobId, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check result of a download traces job. (asynchronously)
     * **API Key Scope**: systems / download_traces
     * @param jobId ID of active job (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A completed job for downloading traces. </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> An active job that may be queued, working, completed or failed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resultDownloadTracesAsync(String jobId, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = resultDownloadTracesValidateBeforeCall(jobId, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for triggerDownloadTraces
     * @param type Type of traces to download (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> An active job that may be queued, working, completed or failed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call triggerDownloadTracesCall(String type, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/systems/download_traces";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "queued", "working", "failed"
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
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call triggerDownloadTracesValidateBeforeCall(String type, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling triggerDownloadTraces(Async)");
        }
        

        okhttp3.Call localVarCall = triggerDownloadTracesCall(type, _callback);
        return localVarCall;

    }

    /**
     * Trigger a download traces request.
     * **API Key Scope**: systems / download_traces
     * @param type Type of traces to download (required)
     * @return ActiveJobStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> An active job that may be queued, working, completed or failed. </td><td>  -  </td></tr>
     </table>
     */
    public ActiveJobStatus triggerDownloadTraces(String type) throws ApiException {
        ApiResponse<ActiveJobStatus> localVarResp = triggerDownloadTracesWithHttpInfo(type);
        return localVarResp.getData();
    }

    /**
     * Trigger a download traces request.
     * **API Key Scope**: systems / download_traces
     * @param type Type of traces to download (required)
     * @return ApiResponse&lt;ActiveJobStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> An active job that may be queued, working, completed or failed. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ActiveJobStatus> triggerDownloadTracesWithHttpInfo(String type) throws ApiException {
        okhttp3.Call localVarCall = triggerDownloadTracesValidateBeforeCall(type, null);
        Type localVarReturnType = new TypeToken<ActiveJobStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Trigger a download traces request. (asynchronously)
     * **API Key Scope**: systems / download_traces
     * @param type Type of traces to download (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> An active job that may be queued, working, completed or failed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call triggerDownloadTracesAsync(String type, final ApiCallback<ActiveJobStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = triggerDownloadTracesValidateBeforeCall(type, _callback);
        Type localVarReturnType = new TypeToken<ActiveJobStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
