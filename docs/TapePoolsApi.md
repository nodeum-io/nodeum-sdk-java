# TapePoolsApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTapePool**](TapePoolsApi.md#createTapePool) | **POST** /tape_pools | Creates a new tape pool.
[**destroyTapePool**](TapePoolsApi.md#destroyTapePool) | **DELETE** /tape_pools/{tape_pool_id} | Destroys a specific tape pool.
[**indexTapePools**](TapePoolsApi.md#indexTapePools) | **GET** /tape_pools | Lists all tape pools.
[**showTapePool**](TapePoolsApi.md#showTapePool) | **GET** /tape_pools/{tape_pool_id} | Displays a specific tape pool.
[**updateTapePool**](TapePoolsApi.md#updateTapePool) | **PUT** /tape_pools/{tape_pool_id} | Updates a specific tape pool.


<a name="createTapePool"></a>
# **createTapePool**
> TapePool createTapePool(tapePoolBody)

Creates a new tape pool.

**API Key Scope**: tape_pools / create

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.TapePoolsApi;

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

    TapePoolsApi apiInstance = new TapePoolsApi(defaultClient);
    TapePoolUp tapePoolBody = new TapePoolUp(); // TapePoolUp | 
    try {
      TapePool result = apiInstance.createTapePool(tapePoolBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapePoolsApi#createTapePool");
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
 **tapePoolBody** | [**TapePoolUp**](TapePoolUp.md)|  |

### Return type

[**TapePool**](TapePool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A specific tape pool. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

<a name="destroyTapePool"></a>
# **destroyTapePool**
> destroyTapePool(tapePoolId)

Destroys a specific tape pool.

**API Key Scope**: tape_pools / destroy

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.TapePoolsApi;

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

    TapePoolsApi apiInstance = new TapePoolsApi(defaultClient);
    String tapePoolId = "tapePoolId_example"; // String | Numeric ID, or name of tape pool.
    try {
      apiInstance.destroyTapePool(tapePoolId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapePoolsApi#destroyTapePool");
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
 **tapePoolId** | **String**| Numeric ID, or name of tape pool. |

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
**204** | Tape pool destroyed. |  -  |

<a name="indexTapePools"></a>
# **indexTapePools**
> TapePoolCollection indexTapePools(limit, offset, sortBy, id, name, comment, type)

Lists all tape pools.

**API Key Scope**: tape_pools / index

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.TapePoolsApi;

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

    TapePoolsApi apiInstance = new TapePoolsApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String name = "name_example"; // String | Filter on name
    String comment = "comment_example"; // String | Filter on comment
    String type = "type_example"; // String | Filter on type
    try {
      TapePoolCollection result = apiInstance.indexTapePools(limit, offset, sortBy, id, name, comment, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapePoolsApi#indexTapePools");
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

[**TapePoolCollection**](TapePoolCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of tape pools. |  -  |

<a name="showTapePool"></a>
# **showTapePool**
> TapePool showTapePool(tapePoolId)

Displays a specific tape pool.

**API Key Scope**: tape_pools / show

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.TapePoolsApi;

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

    TapePoolsApi apiInstance = new TapePoolsApi(defaultClient);
    String tapePoolId = "tapePoolId_example"; // String | Numeric ID, or name of tape pool.
    try {
      TapePool result = apiInstance.showTapePool(tapePoolId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapePoolsApi#showTapePool");
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
 **tapePoolId** | **String**| Numeric ID, or name of tape pool. |

### Return type

[**TapePool**](TapePool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific tape pool. |  -  |

<a name="updateTapePool"></a>
# **updateTapePool**
> TapePool updateTapePool(tapePoolId, tapePoolBody)

Updates a specific tape pool.

**API Key Scope**: tape_pools / update

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.TapePoolsApi;

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

    TapePoolsApi apiInstance = new TapePoolsApi(defaultClient);
    String tapePoolId = "tapePoolId_example"; // String | Numeric ID, or name of tape pool.
    TapePoolUp tapePoolBody = new TapePoolUp(); // TapePoolUp | 
    try {
      TapePool result = apiInstance.updateTapePool(tapePoolId, tapePoolBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapePoolsApi#updateTapePool");
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
 **tapePoolId** | **String**| Numeric ID, or name of tape pool. |
 **tapePoolBody** | [**TapePoolUp**](TapePoolUp.md)|  |

### Return type

[**TapePool**](TapePool.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific tape pool. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

