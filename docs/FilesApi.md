# FilesApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filesChildren**](FilesApi.md#filesChildren) | **GET** /files/{file_parent_id}/children | Lists files under a specific folder.
[**filesChildrenByContainer**](FilesApi.md#filesChildrenByContainer) | **GET** /containers/{container_id}/files/{file_parent_id}/children | Lists files under a specific folder.
[**filesChildrenByPool**](FilesApi.md#filesChildrenByPool) | **GET** /pools/{pool_id}/files/{file_parent_id}/children | Lists files under a specific folder.
[**filesChildrenByTask**](FilesApi.md#filesChildrenByTask) | **GET** /tasks/{task_id}/files/{file_parent_id}/children | Lists files under a specific folder.
[**filesChildrenByTaskExecution**](FilesApi.md#filesChildrenByTaskExecution) | **GET** /task_executions/{task_execution_id}/files/{file_parent_id}/children | Lists files under a specific folder.
[**filesChildrenByTaskExecutionByTask**](FilesApi.md#filesChildrenByTaskExecutionByTask) | **GET** /tasks/{task_id}/task_executions/{task_execution_id}/files/{file_parent_id}/children | Lists files under a specific folder.
[**importFilesChildrenByPool**](FilesApi.md#importFilesChildrenByPool) | **GET** /pools/{pool_id}/import_files/{file_parent_id}/children | Lists files under a specific folder on tape of pools, specific for Data Exchange.
[**indexFiles**](FilesApi.md#indexFiles) | **GET** /files | Lists files on root.
[**indexFilesByContainer**](FilesApi.md#indexFilesByContainer) | **GET** /containers/{container_id}/files | Lists files on root.
[**indexFilesByPool**](FilesApi.md#indexFilesByPool) | **GET** /pools/{pool_id}/files | Lists files on root.
[**indexFilesByTask**](FilesApi.md#indexFilesByTask) | **GET** /tasks/{task_id}/files | Lists files on root.
[**indexFilesByTaskExecution**](FilesApi.md#indexFilesByTaskExecution) | **GET** /task_executions/{task_execution_id}/files | Lists files on root.
[**indexFilesByTaskExecutionByTask**](FilesApi.md#indexFilesByTaskExecutionByTask) | **GET** /tasks/{task_id}/task_executions/{task_execution_id}/files | Lists files on root.
[**indexImportFilesByPool**](FilesApi.md#indexImportFilesByPool) | **GET** /pools/{pool_id}/import_files | Lists files on root of tape of pools, specific for Data Exchange.
[**indexOnTapesFilesByPool**](FilesApi.md#indexOnTapesFilesByPool) | **GET** /pools/{pool_id}/on_tapes_files | Lists files on root of tape of pools, specific for Active and Offline.
[**indexTapesByFileByPool**](FilesApi.md#indexTapesByFileByPool) | **GET** /pools/{pool_id}/files/{file_id}/tapes | Displays tapes containing specific file, related to the specific pool.
[**indexTapesByFileByTask**](FilesApi.md#indexTapesByFileByTask) | **GET** /tasks/{task_id}/files/{file_id}/tapes | Displays tapes containing specific file, related to the specific task.
[**indexTapesByFileByTaskExecution**](FilesApi.md#indexTapesByFileByTaskExecution) | **GET** /task_executions/{task_execution_id}/files/{file_id}/tapes | Displays tapes containing specific file, related to the specific task.
[**indexTapesByFileByTaskExecutionByTask**](FilesApi.md#indexTapesByFileByTaskExecutionByTask) | **GET** /tasks/{task_id}/task_executions/{task_execution_id}/files/{file_id}/tapes | Displays tapes containing specific file, related to the specific task.
[**onTapesFilesChildrenByPool**](FilesApi.md#onTapesFilesChildrenByPool) | **GET** /pools/{pool_id}/on_tapes_files/{file_parent_id}/children | Lists files under a specific folder on tape of pools, specific for Active and Offline.
[**showFile**](FilesApi.md#showFile) | **GET** /files/{file_id} | Displays a specific file.
[**showFileByContainer**](FilesApi.md#showFileByContainer) | **GET** /containers/{container_id}/files/{file_id} | Displays a specific file.
[**showFileByPool**](FilesApi.md#showFileByPool) | **GET** /pools/{pool_id}/files/{file_id} | Displays a specific file.
[**showFileByTask**](FilesApi.md#showFileByTask) | **GET** /tasks/{task_id}/files/{file_id} | Displays a specific file.
[**showFileByTaskExecution**](FilesApi.md#showFileByTaskExecution) | **GET** /task_executions/{task_execution_id}/files/{file_id} | Displays a specific file.
[**showFileByTaskExecutionByTask**](FilesApi.md#showFileByTaskExecutionByTask) | **GET** /tasks/{task_id}/task_executions/{task_execution_id}/files/{file_id} | Displays a specific file.
[**showImportFileByPool**](FilesApi.md#showImportFileByPool) | **GET** /pools/{pool_id}/import_files/{file_id} | Displays a specific file on tape of pools, specific for Data Exchange.
[**showOnTapeFileByPool**](FilesApi.md#showOnTapeFileByPool) | **GET** /pools/{pool_id}/on_tapes_files/{file_id} | Displays a specific file on tape of pools, specific for Active and Offline.


<a name="filesChildren"></a>
# **filesChildren**
> NodeumFileCollection filesChildren(fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

Lists files under a specific folder.

**API Key Scope**: files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    Integer fileParentId = 56; // Integer | Numeric ID of parent folder.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String fileId = "fileId_example"; // String | Filter on file id
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String permission = "permission_example"; // String | Filter on permission
    String size = "size_example"; // String | Filter on size
    String changeDate = "changeDate_example"; // String | Filter on change date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String accessDate = "accessDate_example"; // String | Filter on access date
    String gid = "gid_example"; // String | Filter on gid
    String uid = "uid_example"; // String | Filter on uid
    try {
      NodeumFileCollection result = apiInstance.filesChildren(fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#filesChildren");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileParentId** | **Integer**| Numeric ID of parent folder. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **permission** | **String**| Filter on permission | [optional]
 **size** | **String**| Filter on size | [optional]
 **changeDate** | **String**| Filter on change date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **accessDate** | **String**| Filter on access date | [optional]
 **gid** | **String**| Filter on gid | [optional]
 **uid** | **String**| Filter on uid | [optional]

### Return type

[**NodeumFileCollection**](NodeumFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of files. |  -  |

<a name="filesChildrenByContainer"></a>
# **filesChildrenByContainer**
> NodeumFileCollection filesChildrenByContainer(containerId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

Lists files under a specific folder.

**API Key Scope**: files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String containerId = "containerId_example"; // String | Numeric ID or name of container.
    Integer fileParentId = 56; // Integer | Numeric ID of parent folder.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String fileId = "fileId_example"; // String | Filter on file id
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String permission = "permission_example"; // String | Filter on permission
    String size = "size_example"; // String | Filter on size
    String changeDate = "changeDate_example"; // String | Filter on change date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String accessDate = "accessDate_example"; // String | Filter on access date
    String gid = "gid_example"; // String | Filter on gid
    String uid = "uid_example"; // String | Filter on uid
    try {
      NodeumFileCollection result = apiInstance.filesChildrenByContainer(containerId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#filesChildrenByContainer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| Numeric ID or name of container. |
 **fileParentId** | **Integer**| Numeric ID of parent folder. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **permission** | **String**| Filter on permission | [optional]
 **size** | **String**| Filter on size | [optional]
 **changeDate** | **String**| Filter on change date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **accessDate** | **String**| Filter on access date | [optional]
 **gid** | **String**| Filter on gid | [optional]
 **uid** | **String**| Filter on uid | [optional]

### Return type

[**NodeumFileCollection**](NodeumFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of files. |  -  |

<a name="filesChildrenByPool"></a>
# **filesChildrenByPool**
> NodeumFileCollection filesChildrenByPool(poolId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

Lists files under a specific folder.

**API Key Scope**: files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    Integer fileParentId = 56; // Integer | Numeric ID of parent folder.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String fileId = "fileId_example"; // String | Filter on file id
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String permission = "permission_example"; // String | Filter on permission
    String size = "size_example"; // String | Filter on size
    String changeDate = "changeDate_example"; // String | Filter on change date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String accessDate = "accessDate_example"; // String | Filter on access date
    String gid = "gid_example"; // String | Filter on gid
    String uid = "uid_example"; // String | Filter on uid
    try {
      NodeumFileCollection result = apiInstance.filesChildrenByPool(poolId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#filesChildrenByPool");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| Numeric ID, or name of pool. |
 **fileParentId** | **Integer**| Numeric ID of parent folder. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **permission** | **String**| Filter on permission | [optional]
 **size** | **String**| Filter on size | [optional]
 **changeDate** | **String**| Filter on change date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **accessDate** | **String**| Filter on access date | [optional]
 **gid** | **String**| Filter on gid | [optional]
 **uid** | **String**| Filter on uid | [optional]

### Return type

[**NodeumFileCollection**](NodeumFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of files. |  -  |

<a name="filesChildrenByTask"></a>
# **filesChildrenByTask**
> NodeumFileCollection filesChildrenByTask(taskId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

Lists files under a specific folder.

**API Key Scope**: files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    Integer fileParentId = 56; // Integer | Numeric ID of parent folder.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String fileId = "fileId_example"; // String | Filter on file id
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String permission = "permission_example"; // String | Filter on permission
    String size = "size_example"; // String | Filter on size
    String changeDate = "changeDate_example"; // String | Filter on change date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String accessDate = "accessDate_example"; // String | Filter on access date
    String gid = "gid_example"; // String | Filter on gid
    String uid = "uid_example"; // String | Filter on uid
    try {
      NodeumFileCollection result = apiInstance.filesChildrenByTask(taskId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#filesChildrenByTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **fileParentId** | **Integer**| Numeric ID of parent folder. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **permission** | **String**| Filter on permission | [optional]
 **size** | **String**| Filter on size | [optional]
 **changeDate** | **String**| Filter on change date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **accessDate** | **String**| Filter on access date | [optional]
 **gid** | **String**| Filter on gid | [optional]
 **uid** | **String**| Filter on uid | [optional]

### Return type

[**NodeumFileCollection**](NodeumFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of files. |  -  |

<a name="filesChildrenByTaskExecution"></a>
# **filesChildrenByTaskExecution**
> NodeumFileCollection filesChildrenByTaskExecution(taskExecutionId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

Lists files under a specific folder.

**API Key Scope**: files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String taskExecutionId = "taskExecutionId_example"; // String | Numeric ID of task execution.
    Integer fileParentId = 56; // Integer | Numeric ID of parent folder.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String fileId = "fileId_example"; // String | Filter on file id
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String permission = "permission_example"; // String | Filter on permission
    String size = "size_example"; // String | Filter on size
    String changeDate = "changeDate_example"; // String | Filter on change date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String accessDate = "accessDate_example"; // String | Filter on access date
    String gid = "gid_example"; // String | Filter on gid
    String uid = "uid_example"; // String | Filter on uid
    try {
      NodeumFileCollection result = apiInstance.filesChildrenByTaskExecution(taskExecutionId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#filesChildrenByTaskExecution");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskExecutionId** | **String**| Numeric ID of task execution. |
 **fileParentId** | **Integer**| Numeric ID of parent folder. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **permission** | **String**| Filter on permission | [optional]
 **size** | **String**| Filter on size | [optional]
 **changeDate** | **String**| Filter on change date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **accessDate** | **String**| Filter on access date | [optional]
 **gid** | **String**| Filter on gid | [optional]
 **uid** | **String**| Filter on uid | [optional]

### Return type

[**NodeumFileCollection**](NodeumFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of files. |  -  |

<a name="filesChildrenByTaskExecutionByTask"></a>
# **filesChildrenByTaskExecutionByTask**
> NodeumFileCollection filesChildrenByTaskExecutionByTask(taskId, taskExecutionId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

Lists files under a specific folder.

**API Key Scope**: files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    String taskExecutionId = "taskExecutionId_example"; // String | Numeric ID of task execution.
    Integer fileParentId = 56; // Integer | Numeric ID of parent folder.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String fileId = "fileId_example"; // String | Filter on file id
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String permission = "permission_example"; // String | Filter on permission
    String size = "size_example"; // String | Filter on size
    String changeDate = "changeDate_example"; // String | Filter on change date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String accessDate = "accessDate_example"; // String | Filter on access date
    String gid = "gid_example"; // String | Filter on gid
    String uid = "uid_example"; // String | Filter on uid
    try {
      NodeumFileCollection result = apiInstance.filesChildrenByTaskExecutionByTask(taskId, taskExecutionId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#filesChildrenByTaskExecutionByTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskExecutionId** | **String**| Numeric ID of task execution. |
 **fileParentId** | **Integer**| Numeric ID of parent folder. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **permission** | **String**| Filter on permission | [optional]
 **size** | **String**| Filter on size | [optional]
 **changeDate** | **String**| Filter on change date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **accessDate** | **String**| Filter on access date | [optional]
 **gid** | **String**| Filter on gid | [optional]
 **uid** | **String**| Filter on uid | [optional]

### Return type

[**NodeumFileCollection**](NodeumFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of files. |  -  |

<a name="importFilesChildrenByPool"></a>
# **importFilesChildrenByPool**
> ImportFileCollection importFilesChildrenByPool(poolId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

Lists files under a specific folder on tape of pools, specific for Data Exchange.

**API Key Scope**: import_files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    Integer fileParentId = 56; // Integer | Numeric ID of parent folder.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String fileId = "fileId_example"; // String | Filter on file id
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String permission = "permission_example"; // String | Filter on permission
    String size = "size_example"; // String | Filter on size
    String changeDate = "changeDate_example"; // String | Filter on change date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String accessDate = "accessDate_example"; // String | Filter on access date
    String gid = "gid_example"; // String | Filter on gid
    String uid = "uid_example"; // String | Filter on uid
    try {
      ImportFileCollection result = apiInstance.importFilesChildrenByPool(poolId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#importFilesChildrenByPool");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| Numeric ID, or name of pool. |
 **fileParentId** | **Integer**| Numeric ID of parent folder. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **permission** | **String**| Filter on permission | [optional]
 **size** | **String**| Filter on size | [optional]
 **changeDate** | **String**| Filter on change date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **accessDate** | **String**| Filter on access date | [optional]
 **gid** | **String**| Filter on gid | [optional]
 **uid** | **String**| Filter on uid | [optional]

### Return type

[**ImportFileCollection**](ImportFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of imported files. |  -  |

<a name="indexFiles"></a>
# **indexFiles**
> NodeumFileCollection indexFiles(limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

Lists files on root.

**API Key Scope**: files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String fileId = "fileId_example"; // String | Filter on file id
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String permission = "permission_example"; // String | Filter on permission
    String size = "size_example"; // String | Filter on size
    String changeDate = "changeDate_example"; // String | Filter on change date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String accessDate = "accessDate_example"; // String | Filter on access date
    String gid = "gid_example"; // String | Filter on gid
    String uid = "uid_example"; // String | Filter on uid
    try {
      NodeumFileCollection result = apiInstance.indexFiles(limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexFiles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **permission** | **String**| Filter on permission | [optional]
 **size** | **String**| Filter on size | [optional]
 **changeDate** | **String**| Filter on change date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **accessDate** | **String**| Filter on access date | [optional]
 **gid** | **String**| Filter on gid | [optional]
 **uid** | **String**| Filter on uid | [optional]

### Return type

[**NodeumFileCollection**](NodeumFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of files. |  -  |

<a name="indexFilesByContainer"></a>
# **indexFilesByContainer**
> NodeumFileCollection indexFilesByContainer(containerId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

Lists files on root.

**API Key Scope**: files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String containerId = "containerId_example"; // String | Numeric ID or name of container.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String fileId = "fileId_example"; // String | Filter on file id
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String permission = "permission_example"; // String | Filter on permission
    String size = "size_example"; // String | Filter on size
    String changeDate = "changeDate_example"; // String | Filter on change date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String accessDate = "accessDate_example"; // String | Filter on access date
    String gid = "gid_example"; // String | Filter on gid
    String uid = "uid_example"; // String | Filter on uid
    try {
      NodeumFileCollection result = apiInstance.indexFilesByContainer(containerId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexFilesByContainer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| Numeric ID or name of container. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **permission** | **String**| Filter on permission | [optional]
 **size** | **String**| Filter on size | [optional]
 **changeDate** | **String**| Filter on change date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **accessDate** | **String**| Filter on access date | [optional]
 **gid** | **String**| Filter on gid | [optional]
 **uid** | **String**| Filter on uid | [optional]

### Return type

[**NodeumFileCollection**](NodeumFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of files. |  -  |

<a name="indexFilesByPool"></a>
# **indexFilesByPool**
> NodeumFileCollection indexFilesByPool(poolId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

Lists files on root.

**API Key Scope**: files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String fileId = "fileId_example"; // String | Filter on file id
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String permission = "permission_example"; // String | Filter on permission
    String size = "size_example"; // String | Filter on size
    String changeDate = "changeDate_example"; // String | Filter on change date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String accessDate = "accessDate_example"; // String | Filter on access date
    String gid = "gid_example"; // String | Filter on gid
    String uid = "uid_example"; // String | Filter on uid
    try {
      NodeumFileCollection result = apiInstance.indexFilesByPool(poolId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexFilesByPool");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| Numeric ID, or name of pool. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **permission** | **String**| Filter on permission | [optional]
 **size** | **String**| Filter on size | [optional]
 **changeDate** | **String**| Filter on change date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **accessDate** | **String**| Filter on access date | [optional]
 **gid** | **String**| Filter on gid | [optional]
 **uid** | **String**| Filter on uid | [optional]

### Return type

[**NodeumFileCollection**](NodeumFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of files. |  -  |

<a name="indexFilesByTask"></a>
# **indexFilesByTask**
> NodeumFileCollection indexFilesByTask(taskId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

Lists files on root.

**API Key Scope**: files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String fileId = "fileId_example"; // String | Filter on file id
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String permission = "permission_example"; // String | Filter on permission
    String size = "size_example"; // String | Filter on size
    String changeDate = "changeDate_example"; // String | Filter on change date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String accessDate = "accessDate_example"; // String | Filter on access date
    String gid = "gid_example"; // String | Filter on gid
    String uid = "uid_example"; // String | Filter on uid
    try {
      NodeumFileCollection result = apiInstance.indexFilesByTask(taskId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexFilesByTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **permission** | **String**| Filter on permission | [optional]
 **size** | **String**| Filter on size | [optional]
 **changeDate** | **String**| Filter on change date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **accessDate** | **String**| Filter on access date | [optional]
 **gid** | **String**| Filter on gid | [optional]
 **uid** | **String**| Filter on uid | [optional]

### Return type

[**NodeumFileCollection**](NodeumFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of files. |  -  |

<a name="indexFilesByTaskExecution"></a>
# **indexFilesByTaskExecution**
> NodeumFileCollection indexFilesByTaskExecution(taskExecutionId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

Lists files on root.

**API Key Scope**: files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String taskExecutionId = "taskExecutionId_example"; // String | Numeric ID of task execution.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String fileId = "fileId_example"; // String | Filter on file id
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String permission = "permission_example"; // String | Filter on permission
    String size = "size_example"; // String | Filter on size
    String changeDate = "changeDate_example"; // String | Filter on change date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String accessDate = "accessDate_example"; // String | Filter on access date
    String gid = "gid_example"; // String | Filter on gid
    String uid = "uid_example"; // String | Filter on uid
    try {
      NodeumFileCollection result = apiInstance.indexFilesByTaskExecution(taskExecutionId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexFilesByTaskExecution");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskExecutionId** | **String**| Numeric ID of task execution. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **permission** | **String**| Filter on permission | [optional]
 **size** | **String**| Filter on size | [optional]
 **changeDate** | **String**| Filter on change date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **accessDate** | **String**| Filter on access date | [optional]
 **gid** | **String**| Filter on gid | [optional]
 **uid** | **String**| Filter on uid | [optional]

### Return type

[**NodeumFileCollection**](NodeumFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of files. |  -  |

<a name="indexFilesByTaskExecutionByTask"></a>
# **indexFilesByTaskExecutionByTask**
> NodeumFileCollection indexFilesByTaskExecutionByTask(taskId, taskExecutionId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

Lists files on root.

**API Key Scope**: files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    String taskExecutionId = "taskExecutionId_example"; // String | Numeric ID of task execution.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String fileId = "fileId_example"; // String | Filter on file id
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String permission = "permission_example"; // String | Filter on permission
    String size = "size_example"; // String | Filter on size
    String changeDate = "changeDate_example"; // String | Filter on change date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String accessDate = "accessDate_example"; // String | Filter on access date
    String gid = "gid_example"; // String | Filter on gid
    String uid = "uid_example"; // String | Filter on uid
    try {
      NodeumFileCollection result = apiInstance.indexFilesByTaskExecutionByTask(taskId, taskExecutionId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexFilesByTaskExecutionByTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskExecutionId** | **String**| Numeric ID of task execution. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **permission** | **String**| Filter on permission | [optional]
 **size** | **String**| Filter on size | [optional]
 **changeDate** | **String**| Filter on change date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **accessDate** | **String**| Filter on access date | [optional]
 **gid** | **String**| Filter on gid | [optional]
 **uid** | **String**| Filter on uid | [optional]

### Return type

[**NodeumFileCollection**](NodeumFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of files. |  -  |

<a name="indexImportFilesByPool"></a>
# **indexImportFilesByPool**
> ImportFileCollection indexImportFilesByPool(poolId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

Lists files on root of tape of pools, specific for Data Exchange.

**API Key Scope**: import_files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String fileId = "fileId_example"; // String | Filter on file id
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String permission = "permission_example"; // String | Filter on permission
    String size = "size_example"; // String | Filter on size
    String changeDate = "changeDate_example"; // String | Filter on change date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String accessDate = "accessDate_example"; // String | Filter on access date
    String gid = "gid_example"; // String | Filter on gid
    String uid = "uid_example"; // String | Filter on uid
    try {
      ImportFileCollection result = apiInstance.indexImportFilesByPool(poolId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexImportFilesByPool");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| Numeric ID, or name of pool. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **permission** | **String**| Filter on permission | [optional]
 **size** | **String**| Filter on size | [optional]
 **changeDate** | **String**| Filter on change date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **accessDate** | **String**| Filter on access date | [optional]
 **gid** | **String**| Filter on gid | [optional]
 **uid** | **String**| Filter on uid | [optional]

### Return type

[**ImportFileCollection**](ImportFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of imported files. |  -  |

<a name="indexOnTapesFilesByPool"></a>
# **indexOnTapesFilesByPool**
> OnTapesFileCollection indexOnTapesFilesByPool(poolId, limit, offset, name, type, size)

Lists files on root of tape of pools, specific for Active and Offline.

**API Key Scope**: on_tapes_files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String size = "size_example"; // String | Filter on size
    try {
      OnTapesFileCollection result = apiInstance.indexOnTapesFilesByPool(poolId, limit, offset, name, type, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexOnTapesFilesByPool");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| Numeric ID, or name of pool. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **size** | **String**| Filter on size | [optional]

### Return type

[**OnTapesFileCollection**](OnTapesFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of files on tapes. |  -  |

<a name="indexTapesByFileByPool"></a>
# **indexTapesByFileByPool**
> TapeCollection indexTapesByFileByPool(poolId, fileId)

Displays tapes containing specific file, related to the specific pool.

**API Key Scope**: files / tapes

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      TapeCollection result = apiInstance.indexTapesByFileByPool(poolId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexTapesByFileByPool");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| Numeric ID, or name of pool. |
 **fileId** | **Integer**| Numeric ID of file. |

### Return type

[**TapeCollection**](TapeCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of tapes. |  -  |

<a name="indexTapesByFileByTask"></a>
# **indexTapesByFileByTask**
> TapeCollection indexTapesByFileByTask(taskId, fileId)

Displays tapes containing specific file, related to the specific task.

**API Key Scope**: files / tapes

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      TapeCollection result = apiInstance.indexTapesByFileByTask(taskId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexTapesByFileByTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **fileId** | **Integer**| Numeric ID of file. |

### Return type

[**TapeCollection**](TapeCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of tapes. |  -  |

<a name="indexTapesByFileByTaskExecution"></a>
# **indexTapesByFileByTaskExecution**
> TapeCollection indexTapesByFileByTaskExecution(taskExecutionId, fileId)

Displays tapes containing specific file, related to the specific task.

**API Key Scope**: files / tapes

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String taskExecutionId = "taskExecutionId_example"; // String | Numeric ID of task execution.
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      TapeCollection result = apiInstance.indexTapesByFileByTaskExecution(taskExecutionId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexTapesByFileByTaskExecution");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskExecutionId** | **String**| Numeric ID of task execution. |
 **fileId** | **Integer**| Numeric ID of file. |

### Return type

[**TapeCollection**](TapeCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of tapes. |  -  |

<a name="indexTapesByFileByTaskExecutionByTask"></a>
# **indexTapesByFileByTaskExecutionByTask**
> TapeCollection indexTapesByFileByTaskExecutionByTask(taskId, taskExecutionId, fileId)

Displays tapes containing specific file, related to the specific task.

**API Key Scope**: files / tapes

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    String taskExecutionId = "taskExecutionId_example"; // String | Numeric ID of task execution.
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      TapeCollection result = apiInstance.indexTapesByFileByTaskExecutionByTask(taskId, taskExecutionId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexTapesByFileByTaskExecutionByTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskExecutionId** | **String**| Numeric ID of task execution. |
 **fileId** | **Integer**| Numeric ID of file. |

### Return type

[**TapeCollection**](TapeCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of tapes. |  -  |

<a name="onTapesFilesChildrenByPool"></a>
# **onTapesFilesChildrenByPool**
> OnTapesFileCollection onTapesFilesChildrenByPool(poolId, fileParentId, limit, offset, name, type, size)

Lists files under a specific folder on tape of pools, specific for Active and Offline.

**API Key Scope**: on_tapes_files / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    Integer fileParentId = 56; // Integer | Numeric ID of parent folder.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    String name = "name_example"; // String | Filter on name
    String type = "type_example"; // String | Filter on type
    String size = "size_example"; // String | Filter on size
    try {
      OnTapesFileCollection result = apiInstance.onTapesFilesChildrenByPool(poolId, fileParentId, limit, offset, name, type, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#onTapesFilesChildrenByPool");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| Numeric ID, or name of pool. |
 **fileParentId** | **Integer**| Numeric ID of parent folder. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **size** | **String**| Filter on size | [optional]

### Return type

[**OnTapesFileCollection**](OnTapesFileCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of files on tapes. |  -  |

<a name="showFile"></a>
# **showFile**
> NodeumFileWithPath showFile(fileId)

Displays a specific file.

**API Key Scope**: files / show

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      NodeumFileWithPath result = apiInstance.showFile(fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#showFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **Integer**| Numeric ID of file. |

### Return type

[**NodeumFileWithPath**](NodeumFileWithPath.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific file. |  -  |

<a name="showFileByContainer"></a>
# **showFileByContainer**
> NodeumFileWithPath showFileByContainer(containerId, fileId)

Displays a specific file.

**API Key Scope**: files / show

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String containerId = "containerId_example"; // String | Numeric ID or name of container.
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      NodeumFileWithPath result = apiInstance.showFileByContainer(containerId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#showFileByContainer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| Numeric ID or name of container. |
 **fileId** | **Integer**| Numeric ID of file. |

### Return type

[**NodeumFileWithPath**](NodeumFileWithPath.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific file. |  -  |

<a name="showFileByPool"></a>
# **showFileByPool**
> NodeumFileWithPath showFileByPool(poolId, fileId)

Displays a specific file.

**API Key Scope**: files / show

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      NodeumFileWithPath result = apiInstance.showFileByPool(poolId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#showFileByPool");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| Numeric ID, or name of pool. |
 **fileId** | **Integer**| Numeric ID of file. |

### Return type

[**NodeumFileWithPath**](NodeumFileWithPath.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific file. |  -  |

<a name="showFileByTask"></a>
# **showFileByTask**
> NodeumFileWithPath showFileByTask(taskId, fileId)

Displays a specific file.

**API Key Scope**: files / show

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      NodeumFileWithPath result = apiInstance.showFileByTask(taskId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#showFileByTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **fileId** | **Integer**| Numeric ID of file. |

### Return type

[**NodeumFileWithPath**](NodeumFileWithPath.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific file. |  -  |

<a name="showFileByTaskExecution"></a>
# **showFileByTaskExecution**
> NodeumFileWithPath showFileByTaskExecution(taskExecutionId, fileId)

Displays a specific file.

**API Key Scope**: files / show

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String taskExecutionId = "taskExecutionId_example"; // String | Numeric ID of task execution.
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      NodeumFileWithPath result = apiInstance.showFileByTaskExecution(taskExecutionId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#showFileByTaskExecution");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskExecutionId** | **String**| Numeric ID of task execution. |
 **fileId** | **Integer**| Numeric ID of file. |

### Return type

[**NodeumFileWithPath**](NodeumFileWithPath.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific file. |  -  |

<a name="showFileByTaskExecutionByTask"></a>
# **showFileByTaskExecutionByTask**
> NodeumFileWithPath showFileByTaskExecutionByTask(taskId, taskExecutionId, fileId)

Displays a specific file.

**API Key Scope**: files / show

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    String taskExecutionId = "taskExecutionId_example"; // String | Numeric ID of task execution.
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      NodeumFileWithPath result = apiInstance.showFileByTaskExecutionByTask(taskId, taskExecutionId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#showFileByTaskExecutionByTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskExecutionId** | **String**| Numeric ID of task execution. |
 **fileId** | **Integer**| Numeric ID of file. |

### Return type

[**NodeumFileWithPath**](NodeumFileWithPath.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific file. |  -  |

<a name="showImportFileByPool"></a>
# **showImportFileByPool**
> ImportFileWithPath showImportFileByPool(poolId, fileId)

Displays a specific file on tape of pools, specific for Data Exchange.

**API Key Scope**: import_files / show

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      ImportFileWithPath result = apiInstance.showImportFileByPool(poolId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#showImportFileByPool");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| Numeric ID, or name of pool. |
 **fileId** | **Integer**| Numeric ID of file. |

### Return type

[**ImportFileWithPath**](ImportFileWithPath.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific imported file. |  -  |

<a name="showOnTapeFileByPool"></a>
# **showOnTapeFileByPool**
> OnTapesFile showOnTapeFileByPool(poolId, fileId)

Displays a specific file on tape of pools, specific for Active and Offline.

**API Key Scope**: on_tapes_files / show

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      OnTapesFile result = apiInstance.showOnTapeFileByPool(poolId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#showOnTapeFileByPool");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **String**| Numeric ID, or name of pool. |
 **fileId** | **Integer**| Numeric ID of file. |

### Return type

[**OnTapesFile**](OnTapesFile.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific file on tapes. |  -  |

