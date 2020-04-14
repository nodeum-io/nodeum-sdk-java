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
import io.nodeum.sdk.client.model.Error;
import io.nodeum.sdk.client.model.TaskDestinationCollection;
import io.nodeum.sdk.client.model.TaskDestinationDown;
import io.nodeum.sdk.client.model.TaskDestinationUp;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskDestinationsApi
 */
@Ignore
public class TaskDestinationsApiTest {

    private final TaskDestinationsApi api = new TaskDestinationsApi();

    
    /**
     * Creates a new task destination.
     *
     * **API Key Scope**: task_destinations / create
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTaskDestinationTest() throws ApiException {
        String taskId = null;
        TaskDestinationUp taskDestinationBody = null;
        TaskDestinationDown response = api.createTaskDestination(taskId, taskDestinationBody);

        // TODO: test validations
    }
    
    /**
     * Destroys a specific task destination.
     *
     * **API Key Scope**: task_destinations / destroy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void destroyTaskDestinationTest() throws ApiException {
        String taskId = null;
        Integer taskDestinationId = null;
        api.destroyTaskDestination(taskId, taskDestinationId);

        // TODO: test validations
    }
    
    /**
     * Lists all task destinations.
     *
     * **API Key Scope**: task_destinations / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexTaskDestinationsTest() throws ApiException {
        String taskId = null;
        Integer limit = null;
        Integer offset = null;
        List<String> sortBy = null;
        String id = null;
        String folderId = null;
        String tapeId = null;
        String poolId = null;
        TaskDestinationCollection response = api.indexTaskDestinations(taskId, limit, offset, sortBy, id, folderId, tapeId, poolId);

        // TODO: test validations
    }
    
    /**
     * Displays a specific task destination.
     *
     * **API Key Scope**: task_destinations / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showTaskDestinationTest() throws ApiException {
        String taskId = null;
        Integer taskDestinationId = null;
        TaskDestinationDown response = api.showTaskDestination(taskId, taskDestinationId);

        // TODO: test validations
    }
    
    /**
     * Updates a specific task destination.
     *
     * **API Key Scope**: task_destinations / update
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTaskDestinationTest() throws ApiException {
        String taskId = null;
        Integer taskDestinationId = null;
        TaskDestinationUp taskDestinationBody = null;
        TaskDestinationDown response = api.updateTaskDestination(taskId, taskDestinationId, taskDestinationBody);

        // TODO: test validations
    }
    
}