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
import io.swagger.client.model.NodeumFileCollection;
import io.swagger.client.model.NodeumFileWithPath;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilesApi
 */
@Ignore
public class FilesApiTest {

    private final FilesApi api = new FilesApi();

    
    /**
     * Lists files under a specific folder.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filesChildrenTest() throws ApiException {
        Integer fileParentId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.filesChildren(fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files under a specific folder.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filesChildrenByCloudPoolTest() throws ApiException {
        String cloudPoolId = null;
        Integer fileParentId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.filesChildrenByCloudPool(cloudPoolId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files under a specific folder.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filesChildrenByContainerTest() throws ApiException {
        String containerId = null;
        Integer fileParentId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.filesChildrenByContainer(containerId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files under a specific folder.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filesChildrenByNasPoolTest() throws ApiException {
        String nasPoolId = null;
        Integer fileParentId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.filesChildrenByNasPool(nasPoolId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files under a specific folder.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filesChildrenByTapePoolTest() throws ApiException {
        String tapePoolId = null;
        Integer fileParentId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.filesChildrenByTapePool(tapePoolId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files under a specific folder.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filesChildrenByTaskTest() throws ApiException {
        String taskId = null;
        Integer fileParentId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.filesChildrenByTask(taskId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files under a specific folder.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filesChildrenByTaskExecutionTest() throws ApiException {
        Long taskExecutionId = null;
        Integer fileParentId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.filesChildrenByTaskExecution(taskExecutionId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files under a specific folder.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filesChildrenByTaskExecutionByTaskTest() throws ApiException {
        String taskId = null;
        Long taskExecutionId = null;
        Integer fileParentId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.filesChildrenByTaskExecutionByTask(taskId, taskExecutionId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files on root.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexFilesTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.indexFiles(limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files on root.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexFilesByCloudPoolTest() throws ApiException {
        String cloudPoolId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.indexFilesByCloudPool(cloudPoolId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files on root.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexFilesByContainerTest() throws ApiException {
        String containerId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.indexFilesByContainer(containerId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files on root.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexFilesByNasPoolTest() throws ApiException {
        String nasPoolId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.indexFilesByNasPool(nasPoolId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files on root.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexFilesByTapePoolTest() throws ApiException {
        String tapePoolId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.indexFilesByTapePool(tapePoolId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files on root.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexFilesByTaskTest() throws ApiException {
        String taskId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.indexFilesByTask(taskId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files on root.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexFilesByTaskExecutionTest() throws ApiException {
        Long taskExecutionId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.indexFilesByTaskExecution(taskExecutionId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Lists files on root.
     *
     * **API Key Scope**: files / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexFilesByTaskExecutionByTaskTest() throws ApiException {
        String taskId = null;
        Long taskExecutionId = null;
        Integer limit = null;
        Integer offset = null;
        String fileId = null;
        String name = null;
        String type = null;
        String permission = null;
        String size = null;
        String changeDate = null;
        String modificationDate = null;
        String accessDate = null;
        String gid = null;
        String uid = null;
        NodeumFileCollection response = api.indexFilesByTaskExecutionByTask(taskId, taskExecutionId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);

        // TODO: test validations
    }
    
    /**
     * Displays a specific file.
     *
     * **API Key Scope**: files / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showFileTest() throws ApiException {
        Integer fileId = null;
        NodeumFileWithPath response = api.showFile(fileId);

        // TODO: test validations
    }
    
    /**
     * Displays a specific file.
     *
     * **API Key Scope**: files / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showFileByCloudPoolTest() throws ApiException {
        String cloudPoolId = null;
        Integer fileId = null;
        NodeumFileWithPath response = api.showFileByCloudPool(cloudPoolId, fileId);

        // TODO: test validations
    }
    
    /**
     * Displays a specific file.
     *
     * **API Key Scope**: files / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showFileByContainerTest() throws ApiException {
        String containerId = null;
        Integer fileId = null;
        NodeumFileWithPath response = api.showFileByContainer(containerId, fileId);

        // TODO: test validations
    }
    
    /**
     * Displays a specific file.
     *
     * **API Key Scope**: files / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showFileByNasPoolTest() throws ApiException {
        String nasPoolId = null;
        Integer fileId = null;
        NodeumFileWithPath response = api.showFileByNasPool(nasPoolId, fileId);

        // TODO: test validations
    }
    
    /**
     * Displays a specific file.
     *
     * **API Key Scope**: files / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showFileByTapePoolTest() throws ApiException {
        String tapePoolId = null;
        Integer fileId = null;
        NodeumFileWithPath response = api.showFileByTapePool(tapePoolId, fileId);

        // TODO: test validations
    }
    
    /**
     * Displays a specific file.
     *
     * **API Key Scope**: files / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showFileByTaskTest() throws ApiException {
        String taskId = null;
        Integer fileId = null;
        NodeumFileWithPath response = api.showFileByTask(taskId, fileId);

        // TODO: test validations
    }
    
    /**
     * Displays a specific file.
     *
     * **API Key Scope**: files / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showFileByTaskExecutionTest() throws ApiException {
        Long taskExecutionId = null;
        Integer fileId = null;
        NodeumFileWithPath response = api.showFileByTaskExecution(taskExecutionId, fileId);

        // TODO: test validations
    }
    
    /**
     * Displays a specific file.
     *
     * **API Key Scope**: files / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showFileByTaskExecutionByTaskTest() throws ApiException {
        String taskId = null;
        Long taskExecutionId = null;
        Integer fileId = null;
        NodeumFileWithPath response = api.showFileByTaskExecutionByTask(taskId, taskExecutionId, fileId);

        // TODO: test validations
    }
    
}
