# TaskDestinationsApi

All URIs are relative to *http://localhost/api/v2*

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
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.TaskDestinationsApi;

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

    TaskDestinationsApi apiInstance = new TaskDestinationsApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    TaskDestinationUp taskDestinationBody = new TaskDestinationUp(); // TaskDestinationUp | 
    try {
      TaskDestinationDown result = apiInstance.createTaskDestination(taskId, taskDestinationBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskDestinationsApi#createTaskDestination");
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
 **taskDestinationBody** | [**TaskDestinationUp**](TaskDestinationUp.md)|  |

### Return type

[**TaskDestinationDown**](TaskDestinationDown.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A specific task destination. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

<a name="destroyTaskDestination"></a>
# **destroyTaskDestination**
> destroyTaskDestination(taskId, taskDestinationId)

Destroys a specific task destination.

**API Key Scope**: task_destinations / destroy

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.TaskDestinationsApi;

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

    TaskDestinationsApi apiInstance = new TaskDestinationsApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    Integer taskDestinationId = 56; // Integer | Numeric ID of task destination.
    try {
      apiInstance.destroyTaskDestination(taskId, taskDestinationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskDestinationsApi#destroyTaskDestination");
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
 **taskDestinationId** | **Integer**| Numeric ID of task destination. |

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
**204** | Task destination destroyed. |  -  |

<a name="indexTaskDestinations"></a>
# **indexTaskDestinations**
> TaskDestinationCollection indexTaskDestinations(taskId)

Lists all task destinations.

Filter and pagination parameters are not available for this API.  **API Key Scope**: task_destinations / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.TaskDestinationsApi;

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

    TaskDestinationsApi apiInstance = new TaskDestinationsApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    try {
      TaskDestinationCollection result = apiInstance.indexTaskDestinations(taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskDestinationsApi#indexTaskDestinations");
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

### Return type

[**TaskDestinationCollection**](TaskDestinationCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of task destinations. |  -  |

<a name="showTaskDestination"></a>
# **showTaskDestination**
> TaskDestinationDown showTaskDestination(taskId, taskDestinationId)

Displays a specific task destination.

**API Key Scope**: task_destinations / show

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.TaskDestinationsApi;

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

    TaskDestinationsApi apiInstance = new TaskDestinationsApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    Integer taskDestinationId = 56; // Integer | Numeric ID of task destination.
    try {
      TaskDestinationDown result = apiInstance.showTaskDestination(taskId, taskDestinationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskDestinationsApi#showTaskDestination");
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
 **taskDestinationId** | **Integer**| Numeric ID of task destination. |

### Return type

[**TaskDestinationDown**](TaskDestinationDown.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific task destination. |  -  |

<a name="updateTaskDestination"></a>
# **updateTaskDestination**
> TaskDestinationDown updateTaskDestination(taskId, taskDestinationId, taskDestinationBody)

Updates a specific task destination.

**API Key Scope**: task_destinations / update

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.TaskDestinationsApi;

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

    TaskDestinationsApi apiInstance = new TaskDestinationsApi(defaultClient);
    String taskId = "taskId_example"; // String | Numeric ID or name of task. Task names are not unique, it's recommanded to use numeric ID.
    Integer taskDestinationId = 56; // Integer | Numeric ID of task destination.
    TaskDestinationUp taskDestinationBody = new TaskDestinationUp(); // TaskDestinationUp | 
    try {
      TaskDestinationDown result = apiInstance.updateTaskDestination(taskId, taskDestinationId, taskDestinationBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskDestinationsApi#updateTaskDestination");
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
 **taskDestinationId** | **Integer**| Numeric ID of task destination. |
 **taskDestinationBody** | [**TaskDestinationUp**](TaskDestinationUp.md)|  |

### Return type

[**TaskDestinationDown**](TaskDestinationDown.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific task destination. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

