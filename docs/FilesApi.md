# FilesApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filesChildren**](FilesApi.md#filesChildren) | **GET** /files/{file_parent_id}/children | Lists files under a specific folder.
[**filesChildrenByCloudPool**](FilesApi.md#filesChildrenByCloudPool) | **GET** /cloud_pools/{cloud_pool_id}/files/{file_parent_id}/children | Lists files under a specific folder.
[**filesChildrenByContainer**](FilesApi.md#filesChildrenByContainer) | **GET** /containers/{container_id}/files/{file_parent_id}/children | Lists files under a specific folder.
[**filesChildrenByNasPool**](FilesApi.md#filesChildrenByNasPool) | **GET** /nas_pools/{nas_pool_id}/files/{file_parent_id}/children | Lists files under a specific folder.
[**filesChildrenByTapePool**](FilesApi.md#filesChildrenByTapePool) | **GET** /tape_pools/{tape_pool_id}/files/{file_parent_id}/children | Lists files under a specific folder.
[**filesChildrenByTask**](FilesApi.md#filesChildrenByTask) | **GET** /tasks/{task_id}/files/{file_parent_id}/children | Lists files under a specific folder.
[**filesChildrenByTaskExecution**](FilesApi.md#filesChildrenByTaskExecution) | **GET** /task_executions/{task_execution_id}/files/{file_parent_id}/children | Lists files under a specific folder.
[**filesChildrenByTaskExecutionByTask**](FilesApi.md#filesChildrenByTaskExecutionByTask) | **GET** /tasks/{task_id}/task_executions/{task_execution_id}/files/{file_parent_id}/children | Lists files under a specific folder.
[**indexFiles**](FilesApi.md#indexFiles) | **GET** /files | Lists files on root.
[**indexFilesByCloudPool**](FilesApi.md#indexFilesByCloudPool) | **GET** /cloud_pools/{cloud_pool_id}/files | Lists files on root.
[**indexFilesByContainer**](FilesApi.md#indexFilesByContainer) | **GET** /containers/{container_id}/files | Lists files on root.
[**indexFilesByNasPool**](FilesApi.md#indexFilesByNasPool) | **GET** /nas_pools/{nas_pool_id}/files | Lists files on root.
[**indexFilesByTapePool**](FilesApi.md#indexFilesByTapePool) | **GET** /tape_pools/{tape_pool_id}/files | Lists files on root.
[**indexFilesByTask**](FilesApi.md#indexFilesByTask) | **GET** /tasks/{task_id}/files | Lists files on root.
[**indexFilesByTaskExecution**](FilesApi.md#indexFilesByTaskExecution) | **GET** /task_executions/{task_execution_id}/files | Lists files on root.
[**indexFilesByTaskExecutionByTask**](FilesApi.md#indexFilesByTaskExecutionByTask) | **GET** /tasks/{task_id}/task_executions/{task_execution_id}/files | Lists files on root.
[**showFile**](FilesApi.md#showFile) | **GET** /files/{file_id} | Displays a specific file.
[**showFileByCloudPool**](FilesApi.md#showFileByCloudPool) | **GET** /cloud_pools/{cloud_pool_id}/files/{file_id} | Displays a specific file.
[**showFileByContainer**](FilesApi.md#showFileByContainer) | **GET** /containers/{container_id}/files/{file_id} | Displays a specific file.
[**showFileByNasPool**](FilesApi.md#showFileByNasPool) | **GET** /nas_pools/{nas_pool_id}/files/{file_id} | Displays a specific file.
[**showFileByTapePool**](FilesApi.md#showFileByTapePool) | **GET** /tape_pools/{tape_pool_id}/files/{file_id} | Displays a specific file.
[**showFileByTask**](FilesApi.md#showFileByTask) | **GET** /tasks/{task_id}/files/{file_id} | Displays a specific file.
[**showFileByTaskExecution**](FilesApi.md#showFileByTaskExecution) | **GET** /task_executions/{task_execution_id}/files/{file_id} | Displays a specific file.
[**showFileByTaskExecutionByTask**](FilesApi.md#showFileByTaskExecutionByTask) | **GET** /tasks/{task_id}/task_executions/{task_execution_id}/files/{file_id} | Displays a specific file.


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

<a name="filesChildrenByCloudPool"></a>
# **filesChildrenByCloudPool**
> NodeumFileCollection filesChildrenByCloudPool(cloudPoolId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

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
    String cloudPoolId = "cloudPoolId_example"; // String | Numeric ID or name of cloud pool.
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
      NodeumFileCollection result = apiInstance.filesChildrenByCloudPool(cloudPoolId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#filesChildrenByCloudPool");
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
 **cloudPoolId** | **String**| Numeric ID or name of cloud pool. |
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

<a name="filesChildrenByNasPool"></a>
# **filesChildrenByNasPool**
> NodeumFileCollection filesChildrenByNasPool(nasPoolId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

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
    String nasPoolId = "nasPoolId_example"; // String | Numeric ID or name of NAS pool.
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
      NodeumFileCollection result = apiInstance.filesChildrenByNasPool(nasPoolId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#filesChildrenByNasPool");
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
 **nasPoolId** | **String**| Numeric ID or name of NAS pool. |
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

<a name="filesChildrenByTapePool"></a>
# **filesChildrenByTapePool**
> NodeumFileCollection filesChildrenByTapePool(tapePoolId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

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
    String tapePoolId = "tapePoolId_example"; // String | Numeric ID, or name of tape pool.
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
      NodeumFileCollection result = apiInstance.filesChildrenByTapePool(tapePoolId, fileParentId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#filesChildrenByTapePool");
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
 **tapePoolId** | **String**| Numeric ID, or name of tape pool. |
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
    Long taskExecutionId = 56L; // Long | Numeric ID of task execution.
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
 **taskExecutionId** | **Long**| Numeric ID of task execution. |
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
    Long taskExecutionId = 56L; // Long | Numeric ID of task execution.
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
 **taskExecutionId** | **Long**| Numeric ID of task execution. |
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

<a name="indexFilesByCloudPool"></a>
# **indexFilesByCloudPool**
> NodeumFileCollection indexFilesByCloudPool(cloudPoolId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

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
    String cloudPoolId = "cloudPoolId_example"; // String | Numeric ID or name of cloud pool.
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
      NodeumFileCollection result = apiInstance.indexFilesByCloudPool(cloudPoolId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexFilesByCloudPool");
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
 **cloudPoolId** | **String**| Numeric ID or name of cloud pool. |
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

<a name="indexFilesByNasPool"></a>
# **indexFilesByNasPool**
> NodeumFileCollection indexFilesByNasPool(nasPoolId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

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
    String nasPoolId = "nasPoolId_example"; // String | Numeric ID or name of NAS pool.
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
      NodeumFileCollection result = apiInstance.indexFilesByNasPool(nasPoolId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexFilesByNasPool");
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
 **nasPoolId** | **String**| Numeric ID or name of NAS pool. |
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

<a name="indexFilesByTapePool"></a>
# **indexFilesByTapePool**
> NodeumFileCollection indexFilesByTapePool(tapePoolId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid)

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
    String tapePoolId = "tapePoolId_example"; // String | Numeric ID, or name of tape pool.
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
      NodeumFileCollection result = apiInstance.indexFilesByTapePool(tapePoolId, limit, offset, fileId, name, type, permission, size, changeDate, modificationDate, accessDate, gid, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#indexFilesByTapePool");
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
 **tapePoolId** | **String**| Numeric ID, or name of tape pool. |
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
    Long taskExecutionId = 56L; // Long | Numeric ID of task execution.
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
 **taskExecutionId** | **Long**| Numeric ID of task execution. |
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
    Long taskExecutionId = 56L; // Long | Numeric ID of task execution.
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
 **taskExecutionId** | **Long**| Numeric ID of task execution. |
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

<a name="showFileByCloudPool"></a>
# **showFileByCloudPool**
> NodeumFileWithPath showFileByCloudPool(cloudPoolId, fileId)

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
    String cloudPoolId = "cloudPoolId_example"; // String | Numeric ID or name of cloud pool.
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      NodeumFileWithPath result = apiInstance.showFileByCloudPool(cloudPoolId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#showFileByCloudPool");
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
 **cloudPoolId** | **String**| Numeric ID or name of cloud pool. |
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

<a name="showFileByNasPool"></a>
# **showFileByNasPool**
> NodeumFileWithPath showFileByNasPool(nasPoolId, fileId)

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
    String nasPoolId = "nasPoolId_example"; // String | Numeric ID or name of NAS pool.
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      NodeumFileWithPath result = apiInstance.showFileByNasPool(nasPoolId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#showFileByNasPool");
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
 **nasPoolId** | **String**| Numeric ID or name of NAS pool. |
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

<a name="showFileByTapePool"></a>
# **showFileByTapePool**
> NodeumFileWithPath showFileByTapePool(tapePoolId, fileId)

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
    String tapePoolId = "tapePoolId_example"; // String | Numeric ID, or name of tape pool.
    Integer fileId = 56; // Integer | Numeric ID of file.
    try {
      NodeumFileWithPath result = apiInstance.showFileByTapePool(tapePoolId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#showFileByTapePool");
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
 **tapePoolId** | **String**| Numeric ID, or name of tape pool. |
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
    Long taskExecutionId = 56L; // Long | Numeric ID of task execution.
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
 **taskExecutionId** | **Long**| Numeric ID of task execution. |
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
    Long taskExecutionId = 56L; // Long | Numeric ID of task execution.
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
 **taskExecutionId** | **Long**| Numeric ID of task execution. |
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

