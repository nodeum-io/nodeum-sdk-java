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

import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.model.ActiveJobStatus;
import io.nodeum.sdk.client.model.Error;
import io.nodeum.sdk.client.model.Task;
import io.nodeum.sdk.client.model.TaskCollection;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TasksApi
 */
@Ignore
public class TasksApiTest {

    private final TasksApi api = new TasksApi();

    
    /**
     * Creates a new task.
     *
     * **API Key Scope**: tasks / create 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTaskTest() throws ApiException {
        Task taskBody = null;
        Task response = api.createTask(taskBody);

        // TODO: test validations
    }
    
    /**
     * Destroys a specific task.
     *
     * **API Key Scope**: tasks / destroy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void destroyTaskTest() throws ApiException {
        String taskId = null;
        api.destroyTask(taskId);

        // TODO: test validations
    }
    
    /**
     * Lists all tasks.
     *
     * **API Key Scope**: tasks / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexTasksTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        List<String> sortBy = null;
        String id = null;
        String name = null;
        String comment = null;
        String workflowType = null;
        String workflowAction = null;
        String sourceType = null;
        String destinationType = null;
        String priority = null;
        String conflictResolution = null;
        String action = null;
        String activate = null;
        String creationDate = null;
        String creationUsername = null;
        String modificationDate = null;
        String modificationUsername = null;
        String jobStarted = null;
        String jobFinished = null;
        String status = null;
        String processedSize = null;
        String toProcessSize = null;
        String sourcePoolId = null;
        String sourcePoolName = null;
        String sourceTapeId = null;
        String sourceTapeBarcode = null;
        String destinationPoolId = null;
        String destinationPoolName = null;
        String destinationTapeId = null;
        String destinationTapeBarcode = null;
        TaskCollection response = api.indexTasks(limit, offset, sortBy, id, name, comment, workflowType, workflowAction, sourceType, destinationType, priority, conflictResolution, action, activate, creationDate, creationUsername, modificationDate, modificationUsername, jobStarted, jobFinished, status, processedSize, toProcessSize, sourcePoolId, sourcePoolName, sourceTapeId, sourceTapeBarcode, destinationPoolId, destinationPoolName, destinationTapeId, destinationTapeBarcode);

        // TODO: test validations
    }
    
    /**
     * Pause a task.
     *
     * **API Key Scope**: tasks / action
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pauseTaskTest() throws ApiException {
        String taskId = null;
        ActiveJobStatus response = api.pauseTask(taskId);

        // TODO: test validations
    }
    
    /**
     * Check result of a task pause request.
     *
     * **API Key Scope**: tasks / action
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pauseTaskResultTest() throws ApiException {
        String taskId = null;
        String jobId = null;
        ActiveJobStatus response = api.pauseTaskResult(taskId, jobId);

        // TODO: test validations
    }
    
    /**
     * Resume a task.
     *
     * **API Key Scope**: tasks / action
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resumeTaskTest() throws ApiException {
        String taskId = null;
        ActiveJobStatus response = api.resumeTask(taskId);

        // TODO: test validations
    }
    
    /**
     * Check result of a task resume request.
     *
     * **API Key Scope**: tasks / action
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resumeTaskResultTest() throws ApiException {
        String taskId = null;
        String jobId = null;
        ActiveJobStatus response = api.resumeTaskResult(taskId, jobId);

        // TODO: test validations
    }
    
    /**
     * Run a task.
     *
     * **API Key Scope**: tasks / action
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void runTaskTest() throws ApiException {
        String taskId = null;
        ActiveJobStatus response = api.runTask(taskId);

        // TODO: test validations
    }
    
    /**
     * Check result of a task run request.
     *
     * **API Key Scope**: tasks / action
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void runTaskResultTest() throws ApiException {
        String taskId = null;
        String jobId = null;
        ActiveJobStatus response = api.runTaskResult(taskId, jobId);

        // TODO: test validations
    }
    
    /**
     * Displays a specific task.
     *
     * **API Key Scope**: tasks / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showTaskTest() throws ApiException {
        String taskId = null;
        Task response = api.showTask(taskId);

        // TODO: test validations
    }
    
    /**
     * Stop a task.
     *
     * **API Key Scope**: tasks / action
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopTaskTest() throws ApiException {
        String taskId = null;
        ActiveJobStatus response = api.stopTask(taskId);

        // TODO: test validations
    }
    
    /**
     * Check result of a task stop request.
     *
     * **API Key Scope**: tasks / action
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopTaskResultTest() throws ApiException {
        String taskId = null;
        String jobId = null;
        ActiveJobStatus response = api.stopTaskResult(taskId, jobId);

        // TODO: test validations
    }
    
    /**
     * Updates a specific task.
     *
     * **API Key Scope**: tasks / update
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTaskTest() throws ApiException {
        String taskId = null;
        Task taskBody = null;
        Task response = api.updateTask(taskId, taskBody);

        // TODO: test validations
    }
    
}
