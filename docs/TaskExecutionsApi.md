# TaskExecutionsApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**indexTaskExecutions**](TaskExecutionsApi.md#indexTaskExecutions) | **GET** /task_executions | Lists all task executions.
[**indexTaskExecutionsByTask**](TaskExecutionsApi.md#indexTaskExecutionsByTask) | **GET** /tasks/{task_id}/task_executions | Lists all task executions.
[**showTaskExecution**](TaskExecutionsApi.md#showTaskExecution) | **GET** /task_executions/{task_execution_id} | Displays a specific task execution.
[**showTaskExecutionByTask**](TaskExecutionsApi.md#showTaskExecutionByTask) | **GET** /tasks/{task_id}/task_executions/{task_execution_id} | Displays a specific task execution.


<a name="indexTaskExecutions"></a>
# **indexTaskExecutions**
> TaskExecutionCollection indexTaskExecutions(limit, offset, sortBy, completeList, id, taskId, name, workflowType, workflowAction, sourceType, destinationType, status, logTime, jobStarted, jobFinished, creationDate, modificationDate, toProcessSize, processedSize, toProcessFiles, processedFiles, finalizedFiles, estimationTime, bandwidth)

Lists all task executions.

**API Key Scope**: task_executions / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TaskExecutionsApi;

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

    TaskExecutionsApi apiInstance = new TaskExecutionsApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    Boolean completeList = true; // Boolean | If `false`, only includes the last correct execution of a task.
    String id = "id_example"; // String | Filter on id
    String taskId = "taskId_example"; // String | Filter on task id
    String name = "name_example"; // String | Filter on name
    String workflowType = "workflowType_example"; // String | Filter on task workflow type
    String workflowAction = "workflowAction_example"; // String | Filter on task workflow action
    String sourceType = "sourceType_example"; // String | Filter on task source type
    String destinationType = "destinationType_example"; // String | Filter on task destination type
    String status = "status_example"; // String | Filter on status
    String logTime = "logTime_example"; // String | Filter on log time
    String jobStarted = "jobStarted_example"; // String | Filter on job started
    String jobFinished = "jobFinished_example"; // String | Filter on job finished
    String creationDate = "creationDate_example"; // String | Filter on creation date
    String modificationDate = "modificationDate_example"; // String | Filter on modification date
    String toProcessSize = "toProcessSize_example"; // String | Filter on to process size
    String processedSize = "processedSize_example"; // String | Filter on processed size
    String toProcessFiles = "toProcessFiles_example"; // String | Filter on to process files
    String processedFiles = "processedFiles_example"; // String | Filter on processed files
    String finalizedFiles = "finalizedFiles_example"; // String | Filter on finalized files
    String estimationTime = "estimationTime_example"; // String | Filter on estimation time
    String bandwidth = "bandwidth_example"; // String | Filter on bandwidth
    try {
      TaskExecutionCollection result = apiInstance.indexTaskExecutions(limit, offset, sortBy, completeList, id, taskId, name, workflowType, workflowAction, sourceType, destinationType, status, logTime, jobStarted, jobFinished, creationDate, modificationDate, toProcessSize, processedSize, toProcessFiles, processedFiles, finalizedFiles, estimationTime, bandwidth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskExecutionsApi#indexTaskExecutions");
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
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. | [optional]
 **completeList** | **Boolean**| If &#x60;false&#x60;, only includes the last correct execution of a task. | [optional] [default to true]
 **id** | **String**| Filter on id | [optional]
 **taskId** | **String**| Filter on task id | [optional]
 **name** | **String**| Filter on name | [optional]
 **workflowType** | **String**| Filter on task workflow type | [optional]
 **workflowAction** | **String**| Filter on task workflow action | [optional]
 **sourceType** | **String**| Filter on task source type | [optional]
 **destinationType** | **String**| Filter on task destination type | [optional]
 **status** | **String**| Filter on status | [optional]
 **logTime** | **String**| Filter on log time | [optional]
 **jobStarted** | **String**| Filter on job started | [optional]
 **jobFinished** | **String**| Filter on job finished | [optional]
 **creationDate** | **String**| Filter on creation date | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of task executions. |  -  |

<a name="indexTaskExecutionsByTask"></a>
# **indexTaskExecutionsByTask**
> TaskExecutionCollection indexTaskExecutionsByTask(taskId, limit, offset, sortBy, id, name, workflowType, workflowAction, sourceType, destinationType, status, logTime, jobStarted, jobFinished, toProcessSize, processedSize, toProcessFiles, processedFiles, finalizedFiles, estimationTime, bandwidth)

Lists all task executions.

**API Key Scope**: task_executions / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TaskExecutionsApi;

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

    TaskExecutionsApi apiInstance = new TaskExecutionsApi(defaultClient);
    String taskId = "taskId_example"; // String | Filter on task id
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String name = "name_example"; // String | Filter on name
    String workflowType = "workflowType_example"; // String | Filter on task workflow type
    String workflowAction = "workflowAction_example"; // String | Filter on task workflow action
    String sourceType = "sourceType_example"; // String | Filter on task source type
    String destinationType = "destinationType_example"; // String | Filter on task destination type
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
      TaskExecutionCollection result = apiInstance.indexTaskExecutionsByTask(taskId, limit, offset, sortBy, id, name, workflowType, workflowAction, sourceType, destinationType, status, logTime, jobStarted, jobFinished, toProcessSize, processedSize, toProcessFiles, processedFiles, finalizedFiles, estimationTime, bandwidth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskExecutionsApi#indexTaskExecutionsByTask");
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
 **taskId** | **String**| Filter on task id | [optional]
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. | [optional]
 **id** | **String**| Filter on id | [optional]
 **name** | **String**| Filter on name | [optional]
 **workflowType** | **String**| Filter on task workflow type | [optional]
 **workflowAction** | **String**| Filter on task workflow action | [optional]
 **sourceType** | **String**| Filter on task source type | [optional]
 **destinationType** | **String**| Filter on task destination type | [optional]
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of task executions. |  -  |

<a name="showTaskExecution"></a>
# **showTaskExecution**
> TaskExecution showTaskExecution(taskExecutionId)

Displays a specific task execution.

**API Key Scope**: task_executions / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TaskExecutionsApi;

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

    TaskExecutionsApi apiInstance = new TaskExecutionsApi(defaultClient);
    String taskExecutionId = "taskExecutionId_example"; // String | Numeric ID of task execution.
    try {
      TaskExecution result = apiInstance.showTaskExecution(taskExecutionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskExecutionsApi#showTaskExecution");
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

### Return type

[**TaskExecution**](TaskExecution.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific task execution. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

<a name="showTaskExecutionByTask"></a>
# **showTaskExecutionByTask**
> TaskExecution showTaskExecutionByTask(taskId, taskExecutionId)

Displays a specific task execution.

**API Key Scope**: task_executions / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TaskExecutionsApi;

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

    TaskExecutionsApi apiInstance = new TaskExecutionsApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    String taskExecutionId = "taskExecutionId_example"; // String | Numeric ID of task execution.
    try {
      TaskExecution result = apiInstance.showTaskExecutionByTask(taskId, taskExecutionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskExecutionsApi#showTaskExecutionByTask");
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

### Return type

[**TaskExecution**](TaskExecution.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific task execution. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

