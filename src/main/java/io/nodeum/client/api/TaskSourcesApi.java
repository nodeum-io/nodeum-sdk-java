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


package io.nodeum.client.api;

import io.nodeum.client.ApiCallback;
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.ApiResponse;
import io.nodeum.client.Configuration;
import io.nodeum.client.Pair;
import io.nodeum.client.ProgressRequestBody;
import io.nodeum.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.nodeum.client.model.Error;
import io.nodeum.client.model.TaskSourceCollection;
import io.nodeum.client.model.TaskSourceDown;
import io.nodeum.client.model.TaskSourceUp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskSourcesApi {
    private ApiClient localVarApiClient;

    public TaskSourcesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaskSourcesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createTaskSource
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A specific task source. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The received resource was not correctly formatted. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTaskSourceCall(String taskId, TaskSourceUp taskSourceBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = taskSourceBody;

        // create path and map variables
        String localVarPath = "/tasks/{task_id}/task_sources"
            .replaceAll("\\{" + "task_id" + "\\}", localVarApiClient.escapeString(taskId.toString()));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createTaskSourceValidateBeforeCall(String taskId, TaskSourceUp taskSourceBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException("Missing the required parameter 'taskId' when calling createTaskSource(Async)");
        }
        
        // verify the required parameter 'taskSourceBody' is set
        if (taskSourceBody == null) {
            throw new ApiException("Missing the required parameter 'taskSourceBody' when calling createTaskSource(Async)");
        }
        

        okhttp3.Call localVarCall = createTaskSourceCall(taskId, taskSourceBody, _callback);
        return localVarCall;

    }

    /**
     * Creates a new task source.
     * **API Key Scope**: task_sources / create
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceBody  (required)
     * @return TaskSourceDown
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A specific task source. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The received resource was not correctly formatted. </td><td>  -  </td></tr>
     </table>
     */
    public TaskSourceDown createTaskSource(String taskId, TaskSourceUp taskSourceBody) throws ApiException {
        ApiResponse<TaskSourceDown> localVarResp = createTaskSourceWithHttpInfo(taskId, taskSourceBody);
        return localVarResp.getData();
    }

    /**
     * Creates a new task source.
     * **API Key Scope**: task_sources / create
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceBody  (required)
     * @return ApiResponse&lt;TaskSourceDown&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A specific task source. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The received resource was not correctly formatted. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskSourceDown> createTaskSourceWithHttpInfo(String taskId, TaskSourceUp taskSourceBody) throws ApiException {
        okhttp3.Call localVarCall = createTaskSourceValidateBeforeCall(taskId, taskSourceBody, null);
        Type localVarReturnType = new TypeToken<TaskSourceDown>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates a new task source. (asynchronously)
     * **API Key Scope**: task_sources / create
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A specific task source. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The received resource was not correctly formatted. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTaskSourceAsync(String taskId, TaskSourceUp taskSourceBody, final ApiCallback<TaskSourceDown> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTaskSourceValidateBeforeCall(taskId, taskSourceBody, _callback);
        Type localVarReturnType = new TypeToken<TaskSourceDown>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for destroyTaskSource
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceId Numeric ID of task source. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Task source destroyed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call destroyTaskSourceCall(String taskId, Integer taskSourceId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/tasks/{task_id}/task_sources/{task_source_id}"
            .replaceAll("\\{" + "task_id" + "\\}", localVarApiClient.escapeString(taskId.toString()))
            .replaceAll("\\{" + "task_source_id" + "\\}", localVarApiClient.escapeString(taskSourceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call destroyTaskSourceValidateBeforeCall(String taskId, Integer taskSourceId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException("Missing the required parameter 'taskId' when calling destroyTaskSource(Async)");
        }
        
        // verify the required parameter 'taskSourceId' is set
        if (taskSourceId == null) {
            throw new ApiException("Missing the required parameter 'taskSourceId' when calling destroyTaskSource(Async)");
        }
        

        okhttp3.Call localVarCall = destroyTaskSourceCall(taskId, taskSourceId, _callback);
        return localVarCall;

    }

    /**
     * Destroys a specific task source.
     * **API Key Scope**: task_sources / destroy
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceId Numeric ID of task source. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Task source destroyed. </td><td>  -  </td></tr>
     </table>
     */
    public void destroyTaskSource(String taskId, Integer taskSourceId) throws ApiException {
        destroyTaskSourceWithHttpInfo(taskId, taskSourceId);
    }

    /**
     * Destroys a specific task source.
     * **API Key Scope**: task_sources / destroy
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceId Numeric ID of task source. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Task source destroyed. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> destroyTaskSourceWithHttpInfo(String taskId, Integer taskSourceId) throws ApiException {
        okhttp3.Call localVarCall = destroyTaskSourceValidateBeforeCall(taskId, taskSourceId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Destroys a specific task source. (asynchronously)
     * **API Key Scope**: task_sources / destroy
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceId Numeric ID of task source. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Task source destroyed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call destroyTaskSourceAsync(String taskId, Integer taskSourceId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = destroyTaskSourceValidateBeforeCall(taskId, taskSourceId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for indexTaskSources
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param limit The number of items to display for pagination. (optional)
     * @param offset The number of items to skip for pagination. (optional)
     * @param sortBy Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. (optional)
     * @param id Filter on id (optional)
     * @param fileId Filter on file id (optional)
     * @param importFileId Filter on import file id (optional)
     * @param tapeId Filter on tape id (optional)
     * @param poolId Filter on a pool id (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of task sources. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call indexTaskSourcesCall(String taskId, Integer limit, Integer offset, List<String> sortBy, String id, String fileId, String importFileId, String tapeId, String poolId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/tasks/{task_id}/task_sources"
            .replaceAll("\\{" + "task_id" + "\\}", localVarApiClient.escapeString(taskId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (sortBy != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("pipe", "sort_by", sortBy));
        }

        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

        if (fileId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("file_id", fileId));
        }

        if (importFileId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("import_file_id", importFileId));
        }

        if (tapeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tape_id", tapeId));
        }

        if (poolId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pool_id", poolId));
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
    private okhttp3.Call indexTaskSourcesValidateBeforeCall(String taskId, Integer limit, Integer offset, List<String> sortBy, String id, String fileId, String importFileId, String tapeId, String poolId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException("Missing the required parameter 'taskId' when calling indexTaskSources(Async)");
        }
        

        okhttp3.Call localVarCall = indexTaskSourcesCall(taskId, limit, offset, sortBy, id, fileId, importFileId, tapeId, poolId, _callback);
        return localVarCall;

    }

    /**
     * Lists all task sources.
     * **API Key Scope**: task_sources / index
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param limit The number of items to display for pagination. (optional)
     * @param offset The number of items to skip for pagination. (optional)
     * @param sortBy Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. (optional)
     * @param id Filter on id (optional)
     * @param fileId Filter on file id (optional)
     * @param importFileId Filter on import file id (optional)
     * @param tapeId Filter on tape id (optional)
     * @param poolId Filter on a pool id (optional)
     * @return TaskSourceCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of task sources. </td><td>  -  </td></tr>
     </table>
     */
    public TaskSourceCollection indexTaskSources(String taskId, Integer limit, Integer offset, List<String> sortBy, String id, String fileId, String importFileId, String tapeId, String poolId) throws ApiException {
        ApiResponse<TaskSourceCollection> localVarResp = indexTaskSourcesWithHttpInfo(taskId, limit, offset, sortBy, id, fileId, importFileId, tapeId, poolId);
        return localVarResp.getData();
    }

    /**
     * Lists all task sources.
     * **API Key Scope**: task_sources / index
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param limit The number of items to display for pagination. (optional)
     * @param offset The number of items to skip for pagination. (optional)
     * @param sortBy Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. (optional)
     * @param id Filter on id (optional)
     * @param fileId Filter on file id (optional)
     * @param importFileId Filter on import file id (optional)
     * @param tapeId Filter on tape id (optional)
     * @param poolId Filter on a pool id (optional)
     * @return ApiResponse&lt;TaskSourceCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of task sources. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskSourceCollection> indexTaskSourcesWithHttpInfo(String taskId, Integer limit, Integer offset, List<String> sortBy, String id, String fileId, String importFileId, String tapeId, String poolId) throws ApiException {
        okhttp3.Call localVarCall = indexTaskSourcesValidateBeforeCall(taskId, limit, offset, sortBy, id, fileId, importFileId, tapeId, poolId, null);
        Type localVarReturnType = new TypeToken<TaskSourceCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Lists all task sources. (asynchronously)
     * **API Key Scope**: task_sources / index
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param limit The number of items to display for pagination. (optional)
     * @param offset The number of items to skip for pagination. (optional)
     * @param sortBy Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. (optional)
     * @param id Filter on id (optional)
     * @param fileId Filter on file id (optional)
     * @param importFileId Filter on import file id (optional)
     * @param tapeId Filter on tape id (optional)
     * @param poolId Filter on a pool id (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of task sources. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call indexTaskSourcesAsync(String taskId, Integer limit, Integer offset, List<String> sortBy, String id, String fileId, String importFileId, String tapeId, String poolId, final ApiCallback<TaskSourceCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = indexTaskSourcesValidateBeforeCall(taskId, limit, offset, sortBy, id, fileId, importFileId, tapeId, poolId, _callback);
        Type localVarReturnType = new TypeToken<TaskSourceCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for showTaskSource
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceId Numeric ID of task source. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific task source. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call showTaskSourceCall(String taskId, Integer taskSourceId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/tasks/{task_id}/task_sources/{task_source_id}"
            .replaceAll("\\{" + "task_id" + "\\}", localVarApiClient.escapeString(taskId.toString()))
            .replaceAll("\\{" + "task_source_id" + "\\}", localVarApiClient.escapeString(taskSourceId.toString()));

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
    private okhttp3.Call showTaskSourceValidateBeforeCall(String taskId, Integer taskSourceId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException("Missing the required parameter 'taskId' when calling showTaskSource(Async)");
        }
        
        // verify the required parameter 'taskSourceId' is set
        if (taskSourceId == null) {
            throw new ApiException("Missing the required parameter 'taskSourceId' when calling showTaskSource(Async)");
        }
        

        okhttp3.Call localVarCall = showTaskSourceCall(taskId, taskSourceId, _callback);
        return localVarCall;

    }

    /**
     * Displays a specific task source.
     * **API Key Scope**: task_sources / show
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceId Numeric ID of task source. (required)
     * @return TaskSourceDown
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific task source. </td><td>  -  </td></tr>
     </table>
     */
    public TaskSourceDown showTaskSource(String taskId, Integer taskSourceId) throws ApiException {
        ApiResponse<TaskSourceDown> localVarResp = showTaskSourceWithHttpInfo(taskId, taskSourceId);
        return localVarResp.getData();
    }

    /**
     * Displays a specific task source.
     * **API Key Scope**: task_sources / show
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceId Numeric ID of task source. (required)
     * @return ApiResponse&lt;TaskSourceDown&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific task source. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskSourceDown> showTaskSourceWithHttpInfo(String taskId, Integer taskSourceId) throws ApiException {
        okhttp3.Call localVarCall = showTaskSourceValidateBeforeCall(taskId, taskSourceId, null);
        Type localVarReturnType = new TypeToken<TaskSourceDown>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Displays a specific task source. (asynchronously)
     * **API Key Scope**: task_sources / show
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceId Numeric ID of task source. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific task source. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call showTaskSourceAsync(String taskId, Integer taskSourceId, final ApiCallback<TaskSourceDown> _callback) throws ApiException {

        okhttp3.Call localVarCall = showTaskSourceValidateBeforeCall(taskId, taskSourceId, _callback);
        Type localVarReturnType = new TypeToken<TaskSourceDown>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateTaskSource
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceId Numeric ID of task source. (required)
     * @param taskSourceBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific task source. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The received resource was not correctly formatted. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateTaskSourceCall(String taskId, Integer taskSourceId, TaskSourceUp taskSourceBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = taskSourceBody;

        // create path and map variables
        String localVarPath = "/tasks/{task_id}/task_sources/{task_source_id}"
            .replaceAll("\\{" + "task_id" + "\\}", localVarApiClient.escapeString(taskId.toString()))
            .replaceAll("\\{" + "task_source_id" + "\\}", localVarApiClient.escapeString(taskSourceId.toString()));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateTaskSourceValidateBeforeCall(String taskId, Integer taskSourceId, TaskSourceUp taskSourceBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException("Missing the required parameter 'taskId' when calling updateTaskSource(Async)");
        }
        
        // verify the required parameter 'taskSourceId' is set
        if (taskSourceId == null) {
            throw new ApiException("Missing the required parameter 'taskSourceId' when calling updateTaskSource(Async)");
        }
        
        // verify the required parameter 'taskSourceBody' is set
        if (taskSourceBody == null) {
            throw new ApiException("Missing the required parameter 'taskSourceBody' when calling updateTaskSource(Async)");
        }
        

        okhttp3.Call localVarCall = updateTaskSourceCall(taskId, taskSourceId, taskSourceBody, _callback);
        return localVarCall;

    }

    /**
     * Updates a specific task source.
     * **API Key Scope**: task_sources / update
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceId Numeric ID of task source. (required)
     * @param taskSourceBody  (required)
     * @return TaskSourceDown
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific task source. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The received resource was not correctly formatted. </td><td>  -  </td></tr>
     </table>
     */
    public TaskSourceDown updateTaskSource(String taskId, Integer taskSourceId, TaskSourceUp taskSourceBody) throws ApiException {
        ApiResponse<TaskSourceDown> localVarResp = updateTaskSourceWithHttpInfo(taskId, taskSourceId, taskSourceBody);
        return localVarResp.getData();
    }

    /**
     * Updates a specific task source.
     * **API Key Scope**: task_sources / update
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceId Numeric ID of task source. (required)
     * @param taskSourceBody  (required)
     * @return ApiResponse&lt;TaskSourceDown&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific task source. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The received resource was not correctly formatted. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskSourceDown> updateTaskSourceWithHttpInfo(String taskId, Integer taskSourceId, TaskSourceUp taskSourceBody) throws ApiException {
        okhttp3.Call localVarCall = updateTaskSourceValidateBeforeCall(taskId, taskSourceId, taskSourceBody, null);
        Type localVarReturnType = new TypeToken<TaskSourceDown>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Updates a specific task source. (asynchronously)
     * **API Key Scope**: task_sources / update
     * @param taskId Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. (required)
     * @param taskSourceId Numeric ID of task source. (required)
     * @param taskSourceBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A specific task source. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The received resource was not correctly formatted. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateTaskSourceAsync(String taskId, Integer taskSourceId, TaskSourceUp taskSourceBody, final ApiCallback<TaskSourceDown> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateTaskSourceValidateBeforeCall(taskId, taskSourceId, taskSourceBody, _callback);
        Type localVarReturnType = new TypeToken<TaskSourceDown>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
