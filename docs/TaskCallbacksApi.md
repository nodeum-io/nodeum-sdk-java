# TaskCallbacksApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaskCallback**](TaskCallbacksApi.md#createTaskCallback) | **POST** /tasks/{task_id}/task_callbacks | Creates a new task callback.
[**destroyTaskCallback**](TaskCallbacksApi.md#destroyTaskCallback) | **DELETE** /tasks/{task_id}/task_callbacks/{task_callback_id} | Destroys a specific task callback.
[**indexTaskCallbacks**](TaskCallbacksApi.md#indexTaskCallbacks) | **GET** /tasks/{task_id}/task_callbacks | Lists all task callbacks.
[**showTaskCallback**](TaskCallbacksApi.md#showTaskCallback) | **GET** /tasks/{task_id}/task_callbacks/{task_callback_id} | Displays a specific task callback.
[**updateTaskCallback**](TaskCallbacksApi.md#updateTaskCallback) | **PUT** /tasks/{task_id}/task_callbacks/{task_callback_id} | Updates a specific task callback.


<a name="createTaskCallback"></a>
# **createTaskCallback**
> TaskCallback createTaskCallback(taskId, taskCallbackBody)

Creates a new task callback.

**API Key Scope**: task_callbacks / create

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TaskCallbacksApi;

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

    TaskCallbacksApi apiInstance = new TaskCallbacksApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    TaskCallback taskCallbackBody = new TaskCallback(); // TaskCallback | 
    try {
      TaskCallback result = apiInstance.createTaskCallback(taskId, taskCallbackBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCallbacksApi#createTaskCallback");
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
 **taskCallbackBody** | [**TaskCallback**](TaskCallback.md)|  |

### Return type

[**TaskCallback**](TaskCallback.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A specific task callback. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

<a name="destroyTaskCallback"></a>
# **destroyTaskCallback**
> destroyTaskCallback(taskId, taskCallbackId)

Destroys a specific task callback.

**API Key Scope**: task_callbacks / destroy

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TaskCallbacksApi;

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

    TaskCallbacksApi apiInstance = new TaskCallbacksApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    Integer taskCallbackId = 56; // Integer | Numeric ID of task callback.
    try {
      apiInstance.destroyTaskCallback(taskId, taskCallbackId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCallbacksApi#destroyTaskCallback");
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
 **taskCallbackId** | **Integer**| Numeric ID of task callback. |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Task callback destroyed. |  -  |

<a name="indexTaskCallbacks"></a>
# **indexTaskCallbacks**
> TaskCallbackCollection indexTaskCallbacks(taskId, limit, offset, sortBy, id, type, script)

Lists all task callbacks.

**API Key Scope**: task_callbacks / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TaskCallbacksApi;

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

    TaskCallbacksApi apiInstance = new TaskCallbacksApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String type = "type_example"; // String | Filter on type
    String script = "script_example"; // String | Filter on task callback script
    try {
      TaskCallbackCollection result = apiInstance.indexTaskCallbacks(taskId, limit, offset, sortBy, id, type, script);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCallbacksApi#indexTaskCallbacks");
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
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. | [optional]
 **id** | **String**| Filter on id | [optional]
 **type** | **String**| Filter on type | [optional]
 **script** | **String**| Filter on task callback script | [optional]

### Return type

[**TaskCallbackCollection**](TaskCallbackCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of task callbacks. |  -  |

<a name="showTaskCallback"></a>
# **showTaskCallback**
> TaskCallback showTaskCallback(taskId, taskCallbackId)

Displays a specific task callback.

**API Key Scope**: task_callbacks / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TaskCallbacksApi;

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

    TaskCallbacksApi apiInstance = new TaskCallbacksApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    Integer taskCallbackId = 56; // Integer | Numeric ID of task callback.
    try {
      TaskCallback result = apiInstance.showTaskCallback(taskId, taskCallbackId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCallbacksApi#showTaskCallback");
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
 **taskCallbackId** | **Integer**| Numeric ID of task callback. |

### Return type

[**TaskCallback**](TaskCallback.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific task callback. |  -  |

<a name="updateTaskCallback"></a>
# **updateTaskCallback**
> TaskCallback updateTaskCallback(taskId, taskCallbackId, taskCallbackBody)

Updates a specific task callback.

**API Key Scope**: task_callbacks / update

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TaskCallbacksApi;

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

    TaskCallbacksApi apiInstance = new TaskCallbacksApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    Integer taskCallbackId = 56; // Integer | Numeric ID of task callback.
    TaskCallback taskCallbackBody = new TaskCallback(); // TaskCallback | 
    try {
      TaskCallback result = apiInstance.updateTaskCallback(taskId, taskCallbackId, taskCallbackBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCallbacksApi#updateTaskCallback");
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
 **taskCallbackId** | **Integer**| Numeric ID of task callback. |
 **taskCallbackBody** | [**TaskCallback**](TaskCallback.md)|  |

### Return type

[**TaskCallback**](TaskCallback.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific task callback. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

