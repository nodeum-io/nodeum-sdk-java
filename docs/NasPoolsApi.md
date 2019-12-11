# NasPoolsApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNasPool**](NasPoolsApi.md#createNasPool) | **POST** /nas_pools | Creates a new NAS pool.
[**destroyNasPool**](NasPoolsApi.md#destroyNasPool) | **DELETE** /nas_pools/{nas_pool_id} | Destroys a specific NAS pool.
[**indexNasPools**](NasPoolsApi.md#indexNasPools) | **GET** /nas_pools | Lists all NAS pools.
[**mountStatusNasPool**](NasPoolsApi.md#mountStatusNasPool) | **GET** /nas_pools/{nas_pool_id}/mount | Get mount status of NAS pool.
[**showNasPool**](NasPoolsApi.md#showNasPool) | **GET** /nas_pools/{nas_pool_id} | Displays a specific NAS pool.
[**updateNasPool**](NasPoolsApi.md#updateNasPool) | **PUT** /nas_pools/{nas_pool_id} | Updates a specific NAS pool.


<a name="createNasPool"></a>
# **createNasPool**
> NasPool createNasPool(nasPoolBody)

Creates a new NAS pool.

**API Key Scope**: nas_pools / create

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.NasPoolsApi;

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

    NasPoolsApi apiInstance = new NasPoolsApi(defaultClient);
    NasPoolUp nasPoolBody = new NasPoolUp(); // NasPoolUp | 
    try {
      NasPool result = apiInstance.createNasPool(nasPoolBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasPoolsApi#createNasPool");
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
 **nasPoolBody** | [**NasPoolUp**](NasPoolUp.md)|  |

### Return type

[**NasPool**](NasPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A specific NAS pool. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

<a name="destroyNasPool"></a>
# **destroyNasPool**
> destroyNasPool(nasPoolId)

Destroys a specific NAS pool.

**API Key Scope**: nas_pools / destroy

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.NasPoolsApi;

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

    NasPoolsApi apiInstance = new NasPoolsApi(defaultClient);
    String nasPoolId = "nasPoolId_example"; // String | Numeric ID or name of NAS pool.
    try {
      apiInstance.destroyNasPool(nasPoolId);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasPoolsApi#destroyNasPool");
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
**204** | NAS pool destroyed. |  -  |

<a name="indexNasPools"></a>
# **indexNasPools**
> NasPoolCollection indexNasPools(limit, offset, sortBy, id, name, comment, type)

Lists all NAS pools.

**API Key Scope**: nas_pools / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.NasPoolsApi;

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

    NasPoolsApi apiInstance = new NasPoolsApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String name = "name_example"; // String | Filter on name
    String comment = "comment_example"; // String | Filter on comment
    String type = "type_example"; // String | Filter on type
    try {
      NasPoolCollection result = apiInstance.indexNasPools(limit, offset, sortBy, id, name, comment, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasPoolsApi#indexNasPools");
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

[**NasPoolCollection**](NasPoolCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of NAS pools. |  -  |

<a name="mountStatusNasPool"></a>
# **mountStatusNasPool**
> MountStatus mountStatusNasPool(nasPoolId)

Get mount status of NAS pool.

**API Key Scope**: nas_pools / mount_status

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.NasPoolsApi;

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

    NasPoolsApi apiInstance = new NasPoolsApi(defaultClient);
    String nasPoolId = "nasPoolId_example"; // String | Numeric ID or name of NAS pool.
    try {
      MountStatus result = apiInstance.mountStatusNasPool(nasPoolId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasPoolsApi#mountStatusNasPool");
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

<a name="showNasPool"></a>
# **showNasPool**
> NasPool showNasPool(nasPoolId)

Displays a specific NAS pool.

**API Key Scope**: nas_pools / show

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.NasPoolsApi;

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

    NasPoolsApi apiInstance = new NasPoolsApi(defaultClient);
    String nasPoolId = "nasPoolId_example"; // String | Numeric ID or name of NAS pool.
    try {
      NasPool result = apiInstance.showNasPool(nasPoolId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasPoolsApi#showNasPool");
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

### Return type

[**NasPool**](NasPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific NAS pool. |  -  |

<a name="updateNasPool"></a>
# **updateNasPool**
> NasPool updateNasPool(nasPoolId, nasPoolBody)

Updates a specific NAS pool.

**API Key Scope**: nas_pools / update

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.NasPoolsApi;

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

    NasPoolsApi apiInstance = new NasPoolsApi(defaultClient);
    String nasPoolId = "nasPoolId_example"; // String | Numeric ID or name of NAS pool.
    NasPoolUp nasPoolBody = new NasPoolUp(); // NasPoolUp | 
    try {
      NasPool result = apiInstance.updateNasPool(nasPoolId, nasPoolBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasPoolsApi#updateNasPool");
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
 **nasPoolBody** | [**NasPoolUp**](NasPoolUp.md)|  |

### Return type

[**NasPool**](NasPool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific NAS pool. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

