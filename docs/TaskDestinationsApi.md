# TaskDestinationsApi

All URIs are relative to *https://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaskDestination**](TaskDestinationsApi.md#createTaskDestination) | **POST** /tasks/{task_id}/task_destinations | Creates a new task destination.
[**destroyTaskDestination**](TaskDestinationsApi.md#destroyTaskDestination) | **DELETE** /tasks/{task_id}/task_destinations/{task_destination_id} | Destroys a specific task destination.
[**indexTaskDestinations**](TaskDestinationsApi.md#indexTaskDestinations) | **GET** /tasks/{task_id}/task_destinations | Lists all task destinations.
[**showTaskDestination**](TaskDestinationsApi.md#showTaskDestination) | **GET** /tasks/{task_id}/task_destinations/{task_destination_id} | Displays a specific task destination.
[**updateTaskDestination**](TaskDestinationsApi.md#updateTaskDestination) | **PUT** /tasks/{task_id}/task_destinations/{task_destination_id} | Updates a specific task destination.


<a name="createTaskDestination"></a>
# **createTaskDestination**
> TaskDestinationDown createTaskDestination(taskId, taskDestinationBody)

Creates a new task destination.

**API Key Scope**: task_destinations / create

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskDestinationsApi;

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

TaskDestinationsApi apiInstance = new TaskDestinationsApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
TaskDestinationUp taskDestinationBody = new TaskDestinationUp(); // TaskDestinationUp | 
try {
    TaskDestinationDown result = apiInstance.createTaskDestination(taskId, taskDestinationBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskDestinationsApi#createTaskDestination");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskDestinationBody** | [**TaskDestinationUp**](TaskDestinationUp.md)|  |

### Return type

[**TaskDestinationDown**](TaskDestinationDown.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="destroyTaskDestination"></a>
# **destroyTaskDestination**
> destroyTaskDestination(taskId, taskDestinationId)

Destroys a specific task destination.

**API Key Scope**: task_destinations / destroy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskDestinationsApi;

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

TaskDestinationsApi apiInstance = new TaskDestinationsApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
Integer taskDestinationId = 56; // Integer | Numeric ID of task destination.
try {
    apiInstance.destroyTaskDestination(taskId, taskDestinationId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskDestinationsApi#destroyTaskDestination");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskDestinationId** | **Integer**| Numeric ID of task destination. |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexTaskDestinations"></a>
# **indexTaskDestinations**
> TaskDestinationCollection indexTaskDestinations(taskId)

Lists all task destinations.

Filter and pagination parameters are not available for this API.  **API Key Scope**: task_destinations / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskDestinationsApi;

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

TaskDestinationsApi apiInstance = new TaskDestinationsApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
try {
    TaskDestinationCollection result = apiInstance.indexTaskDestinations(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskDestinationsApi#indexTaskDestinations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |

### Return type

[**TaskDestinationCollection**](TaskDestinationCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTaskDestination"></a>
# **showTaskDestination**
> TaskDestinationDown showTaskDestination(taskId, taskDestinationId)

Displays a specific task destination.

**API Key Scope**: task_destinations / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskDestinationsApi;

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

TaskDestinationsApi apiInstance = new TaskDestinationsApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
Integer taskDestinationId = 56; // Integer | Numeric ID of task destination.
try {
    TaskDestinationDown result = apiInstance.showTaskDestination(taskId, taskDestinationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskDestinationsApi#showTaskDestination");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskDestinationId** | **Integer**| Numeric ID of task destination. |

### Return type

[**TaskDestinationDown**](TaskDestinationDown.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaskDestination"></a>
# **updateTaskDestination**
> TaskDestinationDown updateTaskDestination(taskId, taskDestinationId, taskDestinationBody)

Updates a specific task destination.

**API Key Scope**: task_destinations / update

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskDestinationsApi;

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

TaskDestinationsApi apiInstance = new TaskDestinationsApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
Integer taskDestinationId = 56; // Integer | Numeric ID of task destination.
TaskDestinationUp taskDestinationBody = new TaskDestinationUp(); // TaskDestinationUp | 
try {
    TaskDestinationDown result = apiInstance.updateTaskDestination(taskId, taskDestinationId, taskDestinationBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskDestinationsApi#updateTaskDestination");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskDestinationId** | **Integer**| Numeric ID of task destination. |
 **taskDestinationBody** | [**TaskDestinationUp**](TaskDestinationUp.md)|  |

### Return type

[**TaskDestinationDown**](TaskDestinationDown.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

