# TaskMetadataApi

All URIs are relative to *https://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaskMetadatum**](TaskMetadataApi.md#createTaskMetadatum) | **POST** /tasks/{task_id}/task_metadata | Creates a new task metadatum.
[**destroyTaskMetadatum**](TaskMetadataApi.md#destroyTaskMetadatum) | **DELETE** /tasks/{task_id}/task_metadata/{task_metadatum_id} | Destroys a specific task metadatum.
[**indexTaskMetadata**](TaskMetadataApi.md#indexTaskMetadata) | **GET** /tasks/{task_id}/task_metadata | Lists all task metadata.
[**showTaskMetadat**](TaskMetadataApi.md#showTaskMetadat) | **GET** /tasks/{task_id}/task_metadata/{task_metadatum_id} | Displays a specific task metadatum.
[**updateTaskMetadatum**](TaskMetadataApi.md#updateTaskMetadatum) | **PUT** /tasks/{task_id}/task_metadata/{task_metadatum_id} | Updates a specific task metadatum.


<a name="createTaskMetadatum"></a>
# **createTaskMetadatum**
> TaskMetadatum createTaskMetadatum(taskId, taskMetadatumBody)

Creates a new task metadatum.

**API Key Scope**: task_metadata / create

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskMetadataApi;

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

TaskMetadataApi apiInstance = new TaskMetadataApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
TaskMetadatum taskMetadatumBody = new TaskMetadatum(); // TaskMetadatum | 
try {
    TaskMetadatum result = apiInstance.createTaskMetadatum(taskId, taskMetadatumBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskMetadataApi#createTaskMetadatum");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskMetadatumBody** | [**TaskMetadatum**](TaskMetadatum.md)|  |

### Return type

[**TaskMetadatum**](TaskMetadatum.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="destroyTaskMetadatum"></a>
# **destroyTaskMetadatum**
> destroyTaskMetadatum(taskId, taskMetadatumId)

Destroys a specific task metadatum.

**API Key Scope**: task_metadata / destroy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskMetadataApi;

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

TaskMetadataApi apiInstance = new TaskMetadataApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
Integer taskMetadatumId = 56; // Integer | Numeric ID of task metadatum.
try {
    apiInstance.destroyTaskMetadatum(taskId, taskMetadatumId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskMetadataApi#destroyTaskMetadatum");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskMetadatumId** | **Integer**| Numeric ID of task metadatum. |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexTaskMetadata"></a>
# **indexTaskMetadata**
> TaskMetadatumCollection indexTaskMetadata(taskId, limit, offset, sortBy, id, key, value)

Lists all task metadata.

**API Key Scope**: task_metadata / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskMetadataApi;

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

TaskMetadataApi apiInstance = new TaskMetadataApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String key = "key_example"; // String | Filter on key
String value = "value_example"; // String | Filter on value
try {
    TaskMetadatumCollection result = apiInstance.indexTaskMetadata(taskId, limit, offset, sortBy, id, key, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskMetadataApi#indexTaskMetadata");
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
 **key** | **String**| Filter on key | [optional]
 **value** | **String**| Filter on value | [optional]

### Return type

[**TaskMetadatumCollection**](TaskMetadatumCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTaskMetadat"></a>
# **showTaskMetadat**
> TaskMetadatum showTaskMetadat(taskId, taskMetadatumId)

Displays a specific task metadatum.

**API Key Scope**: task_metadata / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskMetadataApi;

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

TaskMetadataApi apiInstance = new TaskMetadataApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
Integer taskMetadatumId = 56; // Integer | Numeric ID of task metadatum.
try {
    TaskMetadatum result = apiInstance.showTaskMetadat(taskId, taskMetadatumId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskMetadataApi#showTaskMetadat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskMetadatumId** | **Integer**| Numeric ID of task metadatum. |

### Return type

[**TaskMetadatum**](TaskMetadatum.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaskMetadatum"></a>
# **updateTaskMetadatum**
> TaskMetadatum updateTaskMetadatum(taskId, taskMetadatumId, taskMetadatumBody)

Updates a specific task metadatum.

**API Key Scope**: task_metadata / update

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaskMetadataApi;

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

TaskMetadataApi apiInstance = new TaskMetadataApi();
String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
Integer taskMetadatumId = 56; // Integer | Numeric ID of task metadatum.
TaskMetadatum taskMetadatumBody = new TaskMetadatum(); // TaskMetadatum | 
try {
    TaskMetadatum result = apiInstance.updateTaskMetadatum(taskId, taskMetadatumId, taskMetadatumBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskMetadataApi#updateTaskMetadatum");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Numeric ID or name of task. Task names are not unique, it&#39;s recommanded to use numeric ID. |
 **taskMetadatumId** | **Integer**| Numeric ID of task metadatum. |
 **taskMetadatumBody** | [**TaskMetadatum**](TaskMetadatum.md)|  |

### Return type

[**TaskMetadatum**](TaskMetadatum.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

