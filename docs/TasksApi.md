# TasksApi

All URIs are relative to *https://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTask**](TasksApi.md#createTask) | **POST** /tasks | Creates a new task.
[**destroyTask**](TasksApi.md#destroyTask) | **DELETE** /tasks/{task_id} | Destroys a specific task.
[**indexTasks**](TasksApi.md#indexTasks) | **GET** /tasks | Lists all tasks.
[**showTask**](TasksApi.md#showTask) | **GET** /tasks/{task_id} | Displays a specific task.
[**updateTask**](TasksApi.md#updateTask) | **PUT** /tasks/{task_id} | Updates a specific task.


<a name="createTask"></a>
# **createTask**
> Task createTask(taskBody)

Creates a new task.

**API Key Scope**: tasks / create

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksApi;

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

TasksApi apiInstance = new TasksApi();
Task taskBody = new Task(); // Task | 
try {
    Task result = apiInstance.createTask(taskBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#createTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskBody** | [**Task**](Task.md)|  |

### Return type

[**Task**](Task.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="destroyTask"></a>
# **destroyTask**
> destroyTask(taskId)

Destroys a specific task.

**API Key Scope**: tasks / destroy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksApi;

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

TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
try {
    apiInstance.destroyTask(taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#destroyTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexTasks"></a>
# **indexTasks**
> TaskCollection indexTasks(limit, offset, sortBy, id, name, comment, type, priority, conflictResolution, action, activate, creationDate, creationUsername, modificationDate, modificationUsername, jobStarted, jobFinished, status, processedSize, toProcessSize)

Lists all tasks.

**API Key Scope**: tasks / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksApi;

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

TasksApi apiInstance = new TasksApi();
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String name = "name_example"; // String | Filter on name
String comment = "comment_example"; // String | Filter on comment
String type = "type_example"; // String | Filter on type
String priority = "priority_example"; // String | Filter on priority
String conflictResolution = "conflictResolution_example"; // String | Filter on conflict resolution
String action = "action_example"; // String | Filter on action
String activate = "activate_example"; // String | Filter on activate
String creationDate = "creationDate_example"; // String | Filter on creation date
String creationUsername = "creationUsername_example"; // String | Filter on creation username
String modificationDate = "modificationDate_example"; // String | Filter on modification date
String modificationUsername = "modificationUsername_example"; // String | Filter on modification username
String jobStarted = "jobStarted_example"; // String | Filter on job started
String jobFinished = "jobFinished_example"; // String | Filter on job finished
String status = "status_example"; // String | Filter on status
String processedSize = "processedSize_example"; // String | Filter on processed size
String toProcessSize = "toProcessSize_example"; // String | Filter on to process size
try {
    TaskCollection result = apiInstance.indexTasks(limit, offset, sortBy, id, name, comment, type, priority, conflictResolution, action, activate, creationDate, creationUsername, modificationDate, modificationUsername, jobStarted, jobFinished, status, processedSize, toProcessSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#indexTasks");
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
 **name** | **String**| Filter on name | [optional]
 **comment** | **String**| Filter on comment | [optional]
 **type** | **String**| Filter on type | [optional]
 **priority** | **String**| Filter on priority | [optional]
 **conflictResolution** | **String**| Filter on conflict resolution | [optional]
 **action** | **String**| Filter on action | [optional]
 **activate** | **String**| Filter on activate | [optional]
 **creationDate** | **String**| Filter on creation date | [optional]
 **creationUsername** | **String**| Filter on creation username | [optional]
 **modificationDate** | **String**| Filter on modification date | [optional]
 **modificationUsername** | **String**| Filter on modification username | [optional]
 **jobStarted** | **String**| Filter on job started | [optional]
 **jobFinished** | **String**| Filter on job finished | [optional]
 **status** | **String**| Filter on status | [optional]
 **processedSize** | **String**| Filter on processed size | [optional]
 **toProcessSize** | **String**| Filter on to process size | [optional]

### Return type

[**TaskCollection**](TaskCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTask"></a>
# **showTask**
> Task showTask(taskId)

Displays a specific task.

**API Key Scope**: tasks / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksApi;

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

TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
try {
    Task result = apiInstance.showTask(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#showTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |

### Return type

[**Task**](Task.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTask"></a>
# **updateTask**
> Task updateTask(taskId, taskBody)

Updates a specific task.

**API Key Scope**: tasks / update

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksApi;

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

TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
Task taskBody = new Task(); // Task | 
try {
    Task result = apiInstance.updateTask(taskId, taskBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#updateTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskBody** | [**Task**](Task.md)|  |

### Return type

[**Task**](Task.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

