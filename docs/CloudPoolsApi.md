# CloudPoolsApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCloudPool**](CloudPoolsApi.md#createCloudPool) | **POST** /cloud_pools | Creates a new cloud pool.
[**destroyCloudPool**](CloudPoolsApi.md#destroyCloudPool) | **DELETE** /cloud_pools/{cloud_pool_id} | Destroys a specific cloud pool.
[**indexCloudPools**](CloudPoolsApi.md#indexCloudPools) | **GET** /cloud_pools | Lists all cloud pools.
[**mountStatusCloudPool**](CloudPoolsApi.md#mountStatusCloudPool) | **GET** /cloud_pools/{cloud_pool_id}/mount | Get mount status of Cloud pool.
[**showCloudPool**](CloudPoolsApi.md#showCloudPool) | **GET** /cloud_pools/{cloud_pool_id} | Displays a specific cloud pool.
[**updateCloudPool**](CloudPoolsApi.md#updateCloudPool) | **PUT** /cloud_pools/{cloud_pool_id} | Updates a specific cloud pool.


<a name="createCloudPool"></a>
# **createCloudPool**
> CloudPool createCloudPool(cloudPoolBody)

Creates a new cloud pool.

**API Key Scope**: cloud_pools / create

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.CloudPoolsApi;

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

    CloudPoolsApi apiInstance = new CloudPoolsApi(defaultClient);
    CloudPoolUp cloudPoolBody = new CloudPoolUp(); // CloudPoolUp | 
    try {
      CloudPool result = apiInstance.createCloudPool(cloudPoolBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudPoolsApi#createCloudPool");
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
 **cloudPoolBody** | [**CloudPoolUp**](CloudPoolUp.md)|  |

### Return type

[**CloudPool**](CloudPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A specific cloud pool. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

<a name="destroyCloudPool"></a>
# **destroyCloudPool**
> destroyCloudPool(cloudPoolId)

Destroys a specific cloud pool.

**API Key Scope**: cloud_pools / destroy

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.CloudPoolsApi;

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

    CloudPoolsApi apiInstance = new CloudPoolsApi(defaultClient);
    String cloudPoolId = "cloudPoolId_example"; // String | Numeric ID or name of cloud pool.
    try {
      apiInstance.destroyCloudPool(cloudPoolId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudPoolsApi#destroyCloudPool");
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
**204** | Cloud pool destroyed. |  -  |

<a name="indexCloudPools"></a>
# **indexCloudPools**
> CloudPoolCollection indexCloudPools(limit, offset, sortBy, id, name, comment, type)

Lists all cloud pools.

**API Key Scope**: cloud_pools / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.CloudPoolsApi;

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

    CloudPoolsApi apiInstance = new CloudPoolsApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String name = "name_example"; // String | Filter on name
    String comment = "comment_example"; // String | Filter on comment
    String type = "type_example"; // String | Filter on type
    try {
      CloudPoolCollection result = apiInstance.indexCloudPools(limit, offset, sortBy, id, name, comment, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudPoolsApi#indexCloudPools");
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
 **id** | **String**| Filter on id | [optional]
 **name** | **String**| Filter on name | [optional]
 **comment** | **String**| Filter on comment | [optional]
 **type** | **String**| Filter on type | [optional]

### Return type

[**CloudPoolCollection**](CloudPoolCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of cloud pools. |  -  |

<a name="mountStatusCloudPool"></a>
# **mountStatusCloudPool**
> MountStatus mountStatusCloudPool(cloudPoolId)

Get mount status of Cloud pool.

**API Key Scope**: cloud_pools / mount_status

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.CloudPoolsApi;

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

    CloudPoolsApi apiInstance = new CloudPoolsApi(defaultClient);
    String cloudPoolId = "cloudPoolId_example"; // String | Numeric ID or name of cloud pool.
    try {
      MountStatus result = apiInstance.mountStatusCloudPool(cloudPoolId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudPoolsApi#mountStatusCloudPool");
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

### Return type

[**MountStatus**](MountStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Mount status of storage. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

<a name="showCloudPool"></a>
# **showCloudPool**
> CloudPool showCloudPool(cloudPoolId)

Displays a specific cloud pool.

**API Key Scope**: cloud_pools / show

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.CloudPoolsApi;

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

    CloudPoolsApi apiInstance = new CloudPoolsApi(defaultClient);
    String cloudPoolId = "cloudPoolId_example"; // String | Numeric ID or name of cloud pool.
    try {
      CloudPool result = apiInstance.showCloudPool(cloudPoolId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudPoolsApi#showCloudPool");
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

### Return type

[**CloudPool**](CloudPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific cloud pool. |  -  |

<a name="updateCloudPool"></a>
# **updateCloudPool**
> CloudPool updateCloudPool(cloudPoolId, cloudPoolBody)

Updates a specific cloud pool.

**API Key Scope**: cloud_pools / update

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.CloudPoolsApi;

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

    CloudPoolsApi apiInstance = new CloudPoolsApi(defaultClient);
    String cloudPoolId = "cloudPoolId_example"; // String | Numeric ID or name of cloud pool.
    CloudPoolUp cloudPoolBody = new CloudPoolUp(); // CloudPoolUp | 
    try {
      CloudPool result = apiInstance.updateCloudPool(cloudPoolId, cloudPoolBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudPoolsApi#updateCloudPool");
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
 **cloudPoolBody** | [**CloudPoolUp**](CloudPoolUp.md)|  |

### Return type

[**CloudPool**](CloudPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific cloud pool. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

