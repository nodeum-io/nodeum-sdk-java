/*
 * Nodeum API
 * Nodeum API  # Filter parameters When browsing a list of items, multiple filter parameters may be applied. Some operators can be added to the value as a prefix:  - `=` value is equal. Default operator, may be omitted  - `!=` value is different  - `>` greater than  - `>=` greater than or equal  - `<` lower than  - `>=` lower than or equal  - `><` included in list, items should be separated by `|`  - `!><` not included in list, items should be separated by `|`  - `~` pattern matching, may include `%` (any characters) and `_` (one character)  - `!~` pattern not matching, may include `%` (any characters) and `_` (one character)  
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Error;
import io.swagger.client.model.TaskSourceCollection;
import io.swagger.client.model.TaskSourceDown;
import io.swagger.client.model.TaskSourceUp;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskSourcesApi
 */
@Ignore
public class TaskSourcesApiTest {

    private final TaskSourcesApi api = new TaskSourcesApi();

    
    /**
     * Creates a new task source.
     *
     * **API Key Scope**: task_sources / create
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTaskSourceTest() throws ApiException {
        String taskId = null;
        TaskSourceUp taskSourceBody = null;
        TaskSourceDown response = api.createTaskSource(taskId, taskSourceBody);

        // TODO: test validations
    }
    
    /**
     * Destroys a specific task source.
     *
     * **API Key Scope**: task_sources / destroy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void destroyTaskSourceTest() throws ApiException {
        String taskId = null;
        Integer taskSourceId = null;
        api.destroyTaskSource(taskId, taskSourceId);

        // TODO: test validations
    }
    
    /**
     * Lists all task sources.
     *
     * **API Key Scope**: task_sources / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexTaskSourcesTest() throws ApiException {
        String taskId = null;
        Integer limit = null;
        Integer offset = null;
        List<String> sortBy = null;
        String id = null;
        String fileId = null;
        String importFileId = null;
        String tapeId = null;
        String tapePoolId = null;
        String cloudPoolId = null;
        String nasPoolId = null;
        TaskSourceCollection response = api.indexTaskSources(taskId, limit, offset, sortBy, id, fileId, importFileId, tapeId, tapePoolId, cloudPoolId, nasPoolId);

        // TODO: test validations
    }
    
    /**
     * Displays a specific task source.
     *
     * **API Key Scope**: task_sources / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showTaskSourceTest() throws ApiException {
        String taskId = null;
        Integer taskSourceId = null;
        TaskSourceDown response = api.showTaskSource(taskId, taskSourceId);

        // TODO: test validations
    }
    
    /**
     * Updates a specific task source.
     *
     * **API Key Scope**: task_sources / update
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTaskSourceTest() throws ApiException {
        String taskId = null;
        Integer taskSourceId = null;
        TaskSourceUp taskSourceBody = null;
        TaskSourceDown response = api.updateTaskSource(taskId, taskSourceId, taskSourceBody);

        // TODO: test validations
    }
    
}
