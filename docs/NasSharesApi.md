# NasSharesApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNasShareByNas**](NasSharesApi.md#createNasShareByNas) | **POST** /nas/{nas_id}/nas_shares | Creates a new NAS share.
[**destroyNasShare**](NasSharesApi.md#destroyNasShare) | **DELETE** /nas_shares/{nas_share_id} | Destroys a specific NAS share.
[**destroyNasShareByNas**](NasSharesApi.md#destroyNasShareByNas) | **DELETE** /nas/{nas_id}/nas_shares/{nas_share_id} | Destroys a specific NAS share.
[**destroyNasShareByPool**](NasSharesApi.md#destroyNasShareByPool) | **DELETE** /pools/{pool_id}/nas_shares/{nas_share_id} | Destroys a specific NAS share.
[**indexNasShares**](NasSharesApi.md#indexNasShares) | **GET** /nas_shares | Lists all NAS shares.
[**indexNasSharesByNas**](NasSharesApi.md#indexNasSharesByNas) | **GET** /nas/{nas_id}/nas_shares | Lists all NAS shares.
[**indexNasSharesByPool**](NasSharesApi.md#indexNasSharesByPool) | **GET** /pools/{pool_id}/nas_shares | Lists all NAS shares from pool.
[**mountStatusNasShare**](NasSharesApi.md#mountStatusNasShare) | **GET** /nas_shares/{nas_share_id}/mount | Get mount status of NAS Share.
[**mountStatusNasShareByNas**](NasSharesApi.md#mountStatusNasShareByNas) | **GET** /nas/{nas_id}/nas_shares/{nas_share_id}/mount | Get mount status of NAS Share.
[**mountStatusNasShareByPool**](NasSharesApi.md#mountStatusNasShareByPool) | **GET** /pools/{pool_id}/nas_shares/{nas_share_id}/mount | Get mount status of NAS Share.
[**showNasShare**](NasSharesApi.md#showNasShare) | **GET** /nas_shares/{nas_share_id} | Displays a specific NAS share.
[**showNasShareByNas**](NasSharesApi.md#showNasShareByNas) | **GET** /nas/{nas_id}/nas_shares/{nas_share_id} | Displays a specific NAS share.
[**showNasShareByPool**](NasSharesApi.md#showNasShareByPool) | **GET** /pools/{pool_id}/nas_shares/{nas_share_id} | Displays a specific NAS share.
[**testNasShare**](NasSharesApi.md#testNasShare) | **PUT** /nas/{nas_id}/nas_shares/-/test | Test an unsaved NAS Share.
[**testResultNasShare**](NasSharesApi.md#testResultNasShare) | **GET** /nas/{nas_id}/nas_shares/-/test | Check result of a NAS Share test job.
[**updateNasShare**](NasSharesApi.md#updateNasShare) | **PUT** /nas_shares/{nas_share_id} | Updates a specific NAS share.
[**updateNasShareByNas**](NasSharesApi.md#updateNasShareByNas) | **PUT** /nas/{nas_id}/nas_shares/{nas_share_id} | Updates a specific NAS share.
[**updateNasShareByPool**](NasSharesApi.md#updateNasShareByPool) | **PUT** /pools/{pool_id}/nas_shares/{nas_share_id} | Updates a specific NAS share.


<a name="createNasShareByNas"></a>
# **createNasShareByNas**
> NasShare createNasShareByNas(nasId, nasShareBody)

Creates a new NAS share.

**API Key Scope**: nas_shares / create

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
    NasShare nasShareBody = new NasShare(); // NasShare | 
    try {
      NasShare result = apiInstance.createNasShareByNas(nasId, nasShareBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#createNasShareByNas");
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
 **nasId** | **String**| Numeric ID or name of NAS. |
 **nasShareBody** | [**NasShare**](NasShare.md)|  |

### Return type

[**NasShare**](NasShare.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A specific NAS share. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

<a name="destroyNasShare"></a>
# **destroyNasShare**
> destroyNasShare(nasShareId)

Destroys a specific NAS share.

**API Key Scope**: nas_shares / destroy

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String nasShareId = "nasShareId_example"; // String | Numeric ID or name of NAS share.
    try {
      apiInstance.destroyNasShare(nasShareId);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#destroyNasShare");
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
 **nasShareId** | **String**| Numeric ID or name of NAS share. |

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
**204** | NAS share destroyed. |  -  |

<a name="destroyNasShareByNas"></a>
# **destroyNasShareByNas**
> destroyNasShareByNas(nasId, nasShareId)

Destroys a specific NAS share.

**API Key Scope**: nas_shares / destroy

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
    String nasShareId = "nasShareId_example"; // String | Numeric ID or name of NAS share.
    try {
      apiInstance.destroyNasShareByNas(nasId, nasShareId);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#destroyNasShareByNas");
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
 **nasId** | **String**| Numeric ID or name of NAS. |
 **nasShareId** | **String**| Numeric ID or name of NAS share. |

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
**204** | NAS share destroyed. |  -  |

<a name="destroyNasShareByPool"></a>
# **destroyNasShareByPool**
> destroyNasShareByPool(poolId, nasShareId)

Destroys a specific NAS share.

**API Key Scope**: nas_shares / destroy

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    String nasShareId = "nasShareId_example"; // String | Numeric ID or name of NAS share.
    try {
      apiInstance.destroyNasShareByPool(poolId, nasShareId);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#destroyNasShareByPool");
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
 **poolId** | **String**| Numeric ID, or name of pool. |
 **nasShareId** | **String**| Numeric ID or name of NAS share. |

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
**204** | NAS share destroyed. |  -  |

<a name="indexNasShares"></a>
# **indexNasShares**
> NasShareCollection indexNasShares(limit, offset, sortBy, id, name, path, options, username, nasId, poolId)

Lists all NAS shares.

**API Key Scope**: nas_shares / index   Optional API Key Explicit Scope: nas_shares / get_password

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String name = "name_example"; // String | Filter on name
    String path = "path_example"; // String | Filter on path
    String options = "options_example"; // String | Filter on options
    String username = "username_example"; // String | Filter on username
    String nasId = "nasId_example"; // String | Filter on NAS id
    String poolId = "poolId_example"; // String | Filter on a pool id
    try {
      NasShareCollection result = apiInstance.indexNasShares(limit, offset, sortBy, id, name, path, options, username, nasId, poolId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#indexNasShares");
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
 **path** | **String**| Filter on path | [optional]
 **options** | **String**| Filter on options | [optional]
 **username** | **String**| Filter on username | [optional]
 **nasId** | **String**| Filter on NAS id | [optional]
 **poolId** | **String**| Filter on a pool id | [optional]

### Return type

[**NasShareCollection**](NasShareCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of NAS shares. |  -  |

<a name="indexNasSharesByNas"></a>
# **indexNasSharesByNas**
> NasShareCollection indexNasSharesByNas(nasId, limit, offset, sortBy, id, name, path, options, username, poolId)

Lists all NAS shares.

**API Key Scope**: nas_shares / index   Optional API Key Explicit Scope: nas_shares / get_password

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String name = "name_example"; // String | Filter on name
    String path = "path_example"; // String | Filter on path
    String options = "options_example"; // String | Filter on options
    String username = "username_example"; // String | Filter on username
    String poolId = "poolId_example"; // String | Filter on a pool id
    try {
      NasShareCollection result = apiInstance.indexNasSharesByNas(nasId, limit, offset, sortBy, id, name, path, options, username, poolId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#indexNasSharesByNas");
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
 **nasId** | **String**| Numeric ID or name of NAS. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. | [optional]
 **id** | **String**| Filter on id | [optional]
 **name** | **String**| Filter on name | [optional]
 **path** | **String**| Filter on path | [optional]
 **options** | **String**| Filter on options | [optional]
 **username** | **String**| Filter on username | [optional]
 **poolId** | **String**| Filter on a pool id | [optional]

### Return type

[**NasShareCollection**](NasShareCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of NAS shares. |  -  |

<a name="indexNasSharesByPool"></a>
# **indexNasSharesByPool**
> NasShareCollection indexNasSharesByPool(poolId, limit, offset, sortBy, id, name, path, options, username, nasId)

Lists all NAS shares from pool.

**API Key Scope**: nas_shares / index   Optional API Key Explicit Scope: nas_shares / get_password

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String name = "name_example"; // String | Filter on name
    String path = "path_example"; // String | Filter on path
    String options = "options_example"; // String | Filter on options
    String username = "username_example"; // String | Filter on username
    String nasId = "nasId_example"; // String | Filter on NAS id
    try {
      NasShareCollection result = apiInstance.indexNasSharesByPool(poolId, limit, offset, sortBy, id, name, path, options, username, nasId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#indexNasSharesByPool");
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
 **poolId** | **String**| Numeric ID, or name of pool. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. | [optional]
 **id** | **String**| Filter on id | [optional]
 **name** | **String**| Filter on name | [optional]
 **path** | **String**| Filter on path | [optional]
 **options** | **String**| Filter on options | [optional]
 **username** | **String**| Filter on username | [optional]
 **nasId** | **String**| Filter on NAS id | [optional]

### Return type

[**NasShareCollection**](NasShareCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of NAS shares. |  -  |

<a name="mountStatusNasShare"></a>
# **mountStatusNasShare**
> MountStatus mountStatusNasShare(nasShareId)

Get mount status of NAS Share.

**API Key Scope**: nas_shares / mount_status

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String nasShareId = "nasShareId_example"; // String | Numeric ID or name of NAS share.
    try {
      MountStatus result = apiInstance.mountStatusNasShare(nasShareId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#mountStatusNasShare");
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
 **nasShareId** | **String**| Numeric ID or name of NAS share. |

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

<a name="mountStatusNasShareByNas"></a>
# **mountStatusNasShareByNas**
> MountStatus mountStatusNasShareByNas(nasId, nasShareId)

Get mount status of NAS Share.

**API Key Scope**: nas_shares / mount_status

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
    String nasShareId = "nasShareId_example"; // String | Numeric ID or name of NAS share.
    try {
      MountStatus result = apiInstance.mountStatusNasShareByNas(nasId, nasShareId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#mountStatusNasShareByNas");
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
 **nasId** | **String**| Numeric ID or name of NAS. |
 **nasShareId** | **String**| Numeric ID or name of NAS share. |

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

<a name="mountStatusNasShareByPool"></a>
# **mountStatusNasShareByPool**
> MountStatus mountStatusNasShareByPool(poolId, nasShareId)

Get mount status of NAS Share.

**API Key Scope**: nas_shares / mount_status

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    String nasShareId = "nasShareId_example"; // String | Numeric ID or name of NAS share.
    try {
      MountStatus result = apiInstance.mountStatusNasShareByPool(poolId, nasShareId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#mountStatusNasShareByPool");
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
 **poolId** | **String**| Numeric ID, or name of pool. |
 **nasShareId** | **String**| Numeric ID or name of NAS share. |

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

<a name="showNasShare"></a>
# **showNasShare**
> NasShare showNasShare(nasShareId)

Displays a specific NAS share.

**API Key Scope**: nas_shares / show   Optional API Key Explicit Scope: nas_shares / get_password

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String nasShareId = "nasShareId_example"; // String | Numeric ID or name of NAS share.
    try {
      NasShare result = apiInstance.showNasShare(nasShareId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#showNasShare");
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
 **nasShareId** | **String**| Numeric ID or name of NAS share. |

### Return type

[**NasShare**](NasShare.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific NAS share. |  -  |

<a name="showNasShareByNas"></a>
# **showNasShareByNas**
> NasShare showNasShareByNas(nasId, nasShareId)

Displays a specific NAS share.

**API Key Scope**: nas_shares / show   Optional API Key Explicit Scope: nas_shares / get_password

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
    String nasShareId = "nasShareId_example"; // String | Numeric ID or name of NAS share.
    try {
      NasShare result = apiInstance.showNasShareByNas(nasId, nasShareId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#showNasShareByNas");
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
 **nasId** | **String**| Numeric ID or name of NAS. |
 **nasShareId** | **String**| Numeric ID or name of NAS share. |

### Return type

[**NasShare**](NasShare.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific NAS share. |  -  |

<a name="showNasShareByPool"></a>
# **showNasShareByPool**
> NasShare showNasShareByPool(poolId, nasShareId)

Displays a specific NAS share.

**API Key Scope**: nas_shares / show   Optional API Key Explicit Scope: nas_shares / get_password

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    String nasShareId = "nasShareId_example"; // String | Numeric ID or name of NAS share.
    try {
      NasShare result = apiInstance.showNasShareByPool(poolId, nasShareId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#showNasShareByPool");
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
 **poolId** | **String**| Numeric ID, or name of pool. |
 **nasShareId** | **String**| Numeric ID or name of NAS share. |

### Return type

[**NasShare**](NasShare.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific NAS share. |  -  |

<a name="testNasShare"></a>
# **testNasShare**
> ActiveJobStatus testNasShare(nasId, nasShareBody)

Test an unsaved NAS Share.

**API Key Scope**: nas_shares / test

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
    NasShare nasShareBody = new NasShare(); // NasShare | 
    try {
      ActiveJobStatus result = apiInstance.testNasShare(nasId, nasShareBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#testNasShare");
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
 **nasId** | **String**| Numeric ID or name of NAS. |
 **nasShareBody** | [**NasShare**](NasShare.md)|  |

### Return type

[**ActiveJobStatus**](ActiveJobStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, queued, working, failed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | An active job that may be queued, working, completed or failed. |  -  |

<a name="testResultNasShare"></a>
# **testResultNasShare**
> ActiveJobStatus testResultNasShare(nasId, jobId)

Check result of a NAS Share test job.

**API Key Scope**: nas_shares / test

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
    String jobId = "jobId_example"; // String | ID of active job
    try {
      ActiveJobStatus result = apiInstance.testResultNasShare(nasId, jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#testResultNasShare");
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
 **nasId** | **String**| Numeric ID or name of NAS. |
 **jobId** | **String**| ID of active job |

### Return type

[**ActiveJobStatus**](ActiveJobStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, queued, working, failed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An active job that may be queued, working, completed or failed. |  -  |
**202** | An active job that may be queued, working, completed or failed. |  -  |

<a name="updateNasShare"></a>
# **updateNasShare**
> NasShare updateNasShare(nasShareId, nasShareBody)

Updates a specific NAS share.

**API Key Scope**: nas_shares / update

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String nasShareId = "nasShareId_example"; // String | Numeric ID or name of NAS share.
    NasShare nasShareBody = new NasShare(); // NasShare | 
    try {
      NasShare result = apiInstance.updateNasShare(nasShareId, nasShareBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#updateNasShare");
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
 **nasShareId** | **String**| Numeric ID or name of NAS share. |
 **nasShareBody** | [**NasShare**](NasShare.md)|  |

### Return type

[**NasShare**](NasShare.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific NAS share. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

<a name="updateNasShareByNas"></a>
# **updateNasShareByNas**
> NasShare updateNasShareByNas(nasId, nasShareId, nasShareBody)

Updates a specific NAS share.

**API Key Scope**: nas_shares / update

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
    String nasShareId = "nasShareId_example"; // String | Numeric ID or name of NAS share.
    NasShare nasShareBody = new NasShare(); // NasShare | 
    try {
      NasShare result = apiInstance.updateNasShareByNas(nasId, nasShareId, nasShareBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#updateNasShareByNas");
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
 **nasId** | **String**| Numeric ID or name of NAS. |
 **nasShareId** | **String**| Numeric ID or name of NAS share. |
 **nasShareBody** | [**NasShare**](NasShare.md)|  |

### Return type

[**NasShare**](NasShare.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific NAS share. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

<a name="updateNasShareByPool"></a>
# **updateNasShareByPool**
> NasShare updateNasShareByPool(poolId, nasShareId, nasShareBody)

Updates a specific NAS share.

**API Key Scope**: nas_shares / update

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.NasSharesApi;

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

    NasSharesApi apiInstance = new NasSharesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    String nasShareId = "nasShareId_example"; // String | Numeric ID or name of NAS share.
    NasShare nasShareBody = new NasShare(); // NasShare | 
    try {
      NasShare result = apiInstance.updateNasShareByPool(poolId, nasShareId, nasShareBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NasSharesApi#updateNasShareByPool");
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
 **poolId** | **String**| Numeric ID, or name of pool. |
 **nasShareId** | **String**| Numeric ID or name of NAS share. |
 **nasShareBody** | [**NasShare**](NasShare.md)|  |

### Return type

[**NasShare**](NasShare.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific NAS share. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

