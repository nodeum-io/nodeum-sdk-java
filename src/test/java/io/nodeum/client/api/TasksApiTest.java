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

import io.nodeum.client.ApiException;
import io.nodeum.client.model.ActiveJobStatus;
import io.nodeum.client.model.Error;
import io.nodeum.client.model.Task;
import io.nodeum.client.model.TaskCollection;
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
