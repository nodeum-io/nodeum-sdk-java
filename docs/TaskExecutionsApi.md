# TaskExecutionsApi

All URIs are relative to *https://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**indexTaskExecutions**](TaskExecutionsApi.md#indexTaskExecutions) | **GET** /task_executions | Lists all task executions.
[**indexTaskExecutionsByTask**](TaskExecutionsApi.md#indexTaskExecutionsByTask) | **GET** /tasks/{task_id}/task_executions | Lists all task executions.
[**showTaskExecution**](TaskExecutionsApi.md#showTaskExecution) | **GET** /task_executions/{task_execution_id} | Displays a specific task execution.
[**showTaskExecutionByTask**](TaskExecutionsApi.md#showTaskExecutionByTask) | **GET** /tasks/{task_id}/task_executions/{task_execution_id} | Displays a specific task execution.


<a name="indexTaskExecutions"></a>
# **indexTaskExecutions**
> TaskExecutionCollection indexTaskExecutions(limit, offset, sortBy, id, taskId, name, type, status, logTime, jobStarted, jobFinished, toProcessSize, processedSize, toProcessFiles, processedFiles, finalizedFiles, estimationTime, bandwidth)

Lists all task executions.

**API Key Scope**: task_executions / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskExecutionsApi;

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

TaskExecutionsApi apiInstance = new TaskExecutionsApi();
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String taskId = "taskId_example"; // String | Filter on task id
String name = "name_example"; // String | Filter on name
String type = "type_example"; // String | Filter on type
String status = "status_example"; // String | Filter on status
String logTime = "logTime_example"; // String | Filter on log time
String jobStarted = "jobStarted_example"; // String | Filter on job started
String jobFinished = "jobFinished_example"; // String | Filter on job finished
String toProcessSize = "toProcessSize_example"; // String | Filter on to process size
String processedSize = "processedSize_example"; // String | Filter on processed size
String toProcessFiles = "toProcessFiles_example"; // String | Filter on to process files
String processedFiles = "processedFiles_example"; // String | Filter on processed files
String finalizedFiles = "finalizedFiles_example"; // String | Filter on finalized files
String estimationTime = "estimationTime_example"; // String | Filter on estimation time
String bandwidth = "bandwidth_example"; // String | Filter on bandwidth
try {
    TaskExecutionCollection result = apiInstance.indexTaskExecutions(limit, offset, sortBy, id, taskId, name, type, status, logTime, jobStarted, jobFinished, toProcessSize, processedSize, toProcessFiles, processedFiles, finalizedFiles, estimationTime, bandwidth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskExecutionsApi#indexTaskExecutions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. | [optional]
 **id** | **String**| Filter on id | [optional]
 **taskId** | **String**| Filter on task id | [optional]
 **name** | **String**| Filter on name | [optional]
 **type** | **String**| Filter on type | [optional]
 **status** | **String**| Filter on status | [optional]
 **logTime** | **String**| Filter on log time | [optional]
 **jobStarted** | **String**| Filter on job started | [optional]
 **jobFinished** | **String**| Filter on job finished | [optional]
 **toProcessSize** | **String**| Filter on to process size | [optional]
 **processedSize** | **String**| Filter on processed size | [optional]
 **toProcessFiles** | **String**| Filter on to process files | [optional]
 **processedFiles** | **String**| Filter on processed files | [optional]
 **finalizedFiles** | **String**| Filter on finalized files | [optional]
 **estimationTime** | **String**| Filter on estimation time | [optional]
 **bandwidth** | **String**| Filter on bandwidth | [optional]

### Return type

[**TaskExecutionCollection**](TaskExecutionCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexTaskExecutionsByTask"></a>
# **indexTaskExecutionsByTask**
> TaskExecutionCollection indexTaskExecutionsByTask(taskId)

Lists all task executions.

**API Key Scope**: task_executions / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskExecutionsApi;

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

TaskExecutionsApi apiInstance = new TaskExecutionsApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
try {
    TaskExecutionCollection result = apiInstance.indexTaskExecutionsByTask(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskExecutionsApi#indexTaskExecutionsByTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |

### Return type

[**TaskExecutionCollection**](TaskExecutionCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTaskExecution"></a>
# **showTaskExecution**
> TaskExecution showTaskExecution(taskExecutionId)

Displays a specific task execution.

**API Key Scope**: task_executions / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskExecutionsApi;

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

TaskExecutionsApi apiInstance = new TaskExecutionsApi();
Long taskExecutionId = 789L; // Long | Numeric ID of task execution.
try {
    TaskExecution result = apiInstance.showTaskExecution(taskExecutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskExecutionsApi#showTaskExecution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskExecutionId** | **Long**| Numeric ID of task execution. |

### Return type

[**TaskExecution**](TaskExecution.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTaskExecutionByTask"></a>
# **showTaskExecutionByTask**
> TaskExecution showTaskExecutionByTask(taskId, taskExecutionId)

Displays a specific task execution.

**API Key Scope**: task_executions / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskExecutionsApi;

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

TaskExecutionsApi apiInstance = new TaskExecutionsApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
Long taskExecutionId = 789L; // Long | Numeric ID of task execution.
try {
    TaskExecution result = apiInstance.showTaskExecutionByTask(taskId, taskExecutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskExecutionsApi#showTaskExecutionByTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskExecutionId** | **Long**| Numeric ID of task execution. |

### Return type

[**TaskExecution**](TaskExecution.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

