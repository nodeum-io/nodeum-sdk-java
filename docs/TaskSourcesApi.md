# TaskSourcesApi

All URIs are relative to *https://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaskSource**](TaskSourcesApi.md#createTaskSource) | **POST** /tasks/{task_id}/task_sources | Creates a new task source.
[**destroyTaskSource**](TaskSourcesApi.md#destroyTaskSource) | **DELETE** /tasks/{task_id}/task_sources/{task_source_id} | Destroys a specific task source.
[**indexTaskSources**](TaskSourcesApi.md#indexTaskSources) | **GET** /tasks/{task_id}/task_sources | Lists all task sources.
[**showTaskSource**](TaskSourcesApi.md#showTaskSource) | **GET** /tasks/{task_id}/task_sources/{task_source_id} | Displays a specific task source.
[**updateTaskSource**](TaskSourcesApi.md#updateTaskSource) | **PUT** /tasks/{task_id}/task_sources/{task_source_id} | Updates a specific task source.


<a name="createTaskSource"></a>
# **createTaskSource**
> TaskSourceDown createTaskSource(taskId, taskSourceBody)

Creates a new task source.

**API Key Scope**: task_sources / create

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskSourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: BearerAuth
ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
BearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerAuth.setApiKeyPrefix("Token");

TaskSourcesApi apiInstance = new TaskSourcesApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
TaskSourceUp taskSourceBody = new TaskSourceUp(); // TaskSourceUp | 
try {
    TaskSourceDown result = apiInstance.createTaskSource(taskId, taskSourceBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskSourcesApi#createTaskSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskSourceBody** | [**TaskSourceUp**](TaskSourceUp.md)|  |

### Return type

[**TaskSourceDown**](TaskSourceDown.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="destroyTaskSource"></a>
# **destroyTaskSource**
> destroyTaskSource(taskId, taskSourceId)

Destroys a specific task source.

**API Key Scope**: task_sources / destroy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskSourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: BearerAuth
ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
BearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerAuth.setApiKeyPrefix("Token");

TaskSourcesApi apiInstance = new TaskSourcesApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
Integer taskSourceId = 56; // Integer | Numeric ID of task source.
try {
    apiInstance.destroyTaskSource(taskId, taskSourceId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskSourcesApi#destroyTaskSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskSourceId** | **Integer**| Numeric ID of task source. |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexTaskSources"></a>
# **indexTaskSources**
> TaskSourceCollection indexTaskSources(taskId, limit, offset, sortBy, id, fileId, importFileId, tapeId, tapePoolId, cloudPoolId, nasPoolId)

Lists all task sources.

**API Key Scope**: task_sources / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskSourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: BearerAuth
ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
BearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerAuth.setApiKeyPrefix("Token");

TaskSourcesApi apiInstance = new TaskSourcesApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String fileId = "fileId_example"; // String | Filter on file id
String importFileId = "importFileId_example"; // String | Filter on import file id
String tapeId = "tapeId_example"; // String | Filter on tape id
String tapePoolId = "tapePoolId_example"; // String | Filter on tape pool id
String cloudPoolId = "cloudPoolId_example"; // String | Filter on cloud pool id
String nasPoolId = "nasPoolId_example"; // String | Filter on NAS pool id
try {
    TaskSourceCollection result = apiInstance.indexTaskSources(taskId, limit, offset, sortBy, id, fileId, importFileId, tapeId, tapePoolId, cloudPoolId, nasPoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskSourcesApi#indexTaskSources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. | [optional]
 **id** | **String**| Filter on id | [optional]
 **fileId** | **String**| Filter on file id | [optional]
 **importFileId** | **String**| Filter on import file id | [optional]
 **tapeId** | **String**| Filter on tape id | [optional]
 **tapePoolId** | **String**| Filter on tape pool id | [optional]
 **cloudPoolId** | **String**| Filter on cloud pool id | [optional]
 **nasPoolId** | **String**| Filter on NAS pool id | [optional]

### Return type

[**TaskSourceCollection**](TaskSourceCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTaskSource"></a>
# **showTaskSource**
> TaskSourceDown showTaskSource(taskId, taskSourceId)

Displays a specific task source.

**API Key Scope**: task_sources / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskSourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: BearerAuth
ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
BearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerAuth.setApiKeyPrefix("Token");

TaskSourcesApi apiInstance = new TaskSourcesApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
Integer taskSourceId = 56; // Integer | Numeric ID of task source.
try {
    TaskSourceDown result = apiInstance.showTaskSource(taskId, taskSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskSourcesApi#showTaskSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskSourceId** | **Integer**| Numeric ID of task source. |

### Return type

[**TaskSourceDown**](TaskSourceDown.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaskSource"></a>
# **updateTaskSource**
> TaskSourceDown updateTaskSource(taskId, taskSourceId, taskSourceBody)

Updates a specific task source.

**API Key Scope**: task_sources / update

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskSourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: BearerAuth
ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
BearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerAuth.setApiKeyPrefix("Token");

TaskSourcesApi apiInstance = new TaskSourcesApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
Integer taskSourceId = 56; // Integer | Numeric ID of task source.
TaskSourceUp taskSourceBody = new TaskSourceUp(); // TaskSourceUp | 
try {
    TaskSourceDown result = apiInstance.updateTaskSource(taskId, taskSourceId, taskSourceBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskSourcesApi#updateTaskSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskSourceId** | **Integer**| Numeric ID of task source. |
 **taskSourceBody** | [**TaskSourceUp**](TaskSourceUp.md)|  |

### Return type

[**TaskSourceDown**](TaskSourceDown.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

