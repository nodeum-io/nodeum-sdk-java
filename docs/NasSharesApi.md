# NasSharesApi

All URIs are relative to *https://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNasShareByNas**](NasSharesApi.md#createNasShareByNas) | **POST** /nas/{nas_id}/nas_shares | Creates a new NAS share.
[**destroyNasShare**](NasSharesApi.md#destroyNasShare) | **DELETE** /nas_shares/{nas_share_id} | Destroys a specific NAS share.
[**destroyNasShareByNas**](NasSharesApi.md#destroyNasShareByNas) | **DELETE** /nas/{nas_id}/nas_shares/{nas_share_id} | Destroys a specific NAS share.
[**destroyNasShareByNasPool**](NasSharesApi.md#destroyNasShareByNasPool) | **DELETE** /nas_pools/{nas_pool_id}/nas_shares/{nas_share_id} | Destroys a specific NAS share.
[**indexNasShares**](NasSharesApi.md#indexNasShares) | **GET** /nas_shares | Lists all NAS shares.
[**indexNasSharesByNas**](NasSharesApi.md#indexNasSharesByNas) | **GET** /nas/{nas_id}/nas_shares | Lists all NAS shares.
[**indexNasSharesByNasPool**](NasSharesApi.md#indexNasSharesByNasPool) | **GET** /nas_pools/{nas_pool_id}/nas_shares | Lists all NAS shares.
[**showNasShareByNas**](NasSharesApi.md#showNasShareByNas) | **GET** /nas/{nas_id}/nas_shares/{nas_share_id} | Displays a specific NAS share.
[**showNasShares**](NasSharesApi.md#showNasShares) | **GET** /nas_shares/{nas_share_id} | Displays a specific NAS share.
[**showNasSharesByNasPool**](NasSharesApi.md#showNasSharesByNasPool) | **GET** /nas_pools/{nas_pool_id}/nas_shares/{nas_share_id} | Displays a specific NAS share.
[**testNasShare**](NasSharesApi.md#testNasShare) | **PUT** /nas/{nas_id}/nas_shares/-/test | Test an unsaved NAS Share.
[**testResultNasShare**](NasSharesApi.md#testResultNasShare) | **GET** /nas/{nas_id}/nas_shares/-/test | Check result of a NAS Share test job.
[**updateNasShare**](NasSharesApi.md#updateNasShare) | **PUT** /nas_shares/{nas_share_id} | Updates a specific NAS share.
[**updateNasShareByNas**](NasSharesApi.md#updateNasShareByNas) | **PUT** /nas/{nas_id}/nas_shares/{nas_share_id} | Updates a specific NAS share.
[**updateNasShareByNasPool**](NasSharesApi.md#updateNasShareByNasPool) | **PUT** /nas_pools/{nas_pool_id}/nas_shares/{nas_share_id} | Updates a specific NAS share.


<a name="createNasShareByNas"></a>
# **createNasShareByNas**
> NasShare createNasShareByNas(nasId, nasShareBody)

Creates a new NAS share.

**API Key Scope**: nas_shares / create

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
NasShare nasShareBody = new NasShare(); // NasShare | 
try {
    NasShare result = apiInstance.createNasShareByNas(nasId, nasShareBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#createNasShareByNas");
    e.printStackTrace();
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

<a name="destroyNasShare"></a>
# **destroyNasShare**
> destroyNasShare(nasShareId)

Destroys a specific NAS share.

**API Key Scope**: nas_shares / destroy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
Integer nasShareId = 56; // Integer | Numeric ID of NAS share.
try {
    apiInstance.destroyNasShare(nasShareId);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#destroyNasShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasShareId** | **Integer**| Numeric ID of NAS share. |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="destroyNasShareByNas"></a>
# **destroyNasShareByNas**
> destroyNasShareByNas(nasId, nasShareId)

Destroys a specific NAS share.

**API Key Scope**: nas_shares / destroy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
Integer nasShareId = 56; // Integer | Numeric ID of NAS share.
try {
    apiInstance.destroyNasShareByNas(nasId, nasShareId);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#destroyNasShareByNas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasId** | **String**| Numeric ID or name of NAS. |
 **nasShareId** | **Integer**| Numeric ID of NAS share. |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="destroyNasShareByNasPool"></a>
# **destroyNasShareByNasPool**
> destroyNasShareByNasPool(nasPoolId, nasShareId)

Destroys a specific NAS share.

**API Key Scope**: nas_shares / destroy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
String nasPoolId = "nasPoolId_example"; // String | Numeric ID or name of NAS pool.
Integer nasShareId = 56; // Integer | Numeric ID of NAS share.
try {
    apiInstance.destroyNasShareByNasPool(nasPoolId, nasShareId);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#destroyNasShareByNasPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasPoolId** | **String**| Numeric ID or name of NAS pool. |
 **nasShareId** | **Integer**| Numeric ID of NAS share. |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexNasShares"></a>
# **indexNasShares**
> NasShareCollection indexNasShares(limit, offset, sortBy, id, path, options, username, nasId, nasPoolId)

Lists all NAS shares.

**API Key Scope**: nas_shares / index   Optional API Key Explicit Scope: nas_shares / get_password

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String path = "path_example"; // String | Filter on path
String options = "options_example"; // String | Filter on options
String username = "username_example"; // String | Filter on username
String nasId = "nasId_example"; // String | Filter on NAS id
String nasPoolId = "nasPoolId_example"; // String | Filter on NAS pool id
try {
    NasShareCollection result = apiInstance.indexNasShares(limit, offset, sortBy, id, path, options, username, nasId, nasPoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#indexNasShares");
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
 **path** | **String**| Filter on path | [optional]
 **options** | **String**| Filter on options | [optional]
 **username** | **String**| Filter on username | [optional]
 **nasId** | **String**| Filter on NAS id | [optional]
 **nasPoolId** | **String**| Filter on NAS pool id | [optional]

### Return type

[**NasShareCollection**](NasShareCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexNasSharesByNas"></a>
# **indexNasSharesByNas**
> NasShareCollection indexNasSharesByNas(nasId, limit, offset, sortBy, id, path, options, username, nasPoolId)

Lists all NAS shares.

**API Key Scope**: nas_shares / index   Optional API Key Explicit Scope: nas_shares / get_password

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String path = "path_example"; // String | Filter on path
String options = "options_example"; // String | Filter on options
String username = "username_example"; // String | Filter on username
String nasPoolId = "nasPoolId_example"; // String | Filter on NAS pool id
try {
    NasShareCollection result = apiInstance.indexNasSharesByNas(nasId, limit, offset, sortBy, id, path, options, username, nasPoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#indexNasSharesByNas");
    e.printStackTrace();
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
 **path** | **String**| Filter on path | [optional]
 **options** | **String**| Filter on options | [optional]
 **username** | **String**| Filter on username | [optional]
 **nasPoolId** | **String**| Filter on NAS pool id | [optional]

### Return type

[**NasShareCollection**](NasShareCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexNasSharesByNasPool"></a>
# **indexNasSharesByNasPool**
> NasShareCollection indexNasSharesByNasPool(nasPoolId, limit, offset, sortBy, id, path, options, username, nasId)

Lists all NAS shares.

**API Key Scope**: nas_shares / index   Optional API Key Explicit Scope: nas_shares / get_password

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
String nasPoolId = "nasPoolId_example"; // String | Numeric ID or name of NAS pool.
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String path = "path_example"; // String | Filter on path
String options = "options_example"; // String | Filter on options
String username = "username_example"; // String | Filter on username
String nasId = "nasId_example"; // String | Filter on NAS id
try {
    NasShareCollection result = apiInstance.indexNasSharesByNasPool(nasPoolId, limit, offset, sortBy, id, path, options, username, nasId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#indexNasSharesByNasPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasPoolId** | **String**| Numeric ID or name of NAS pool. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. | [optional]
 **id** | **String**| Filter on id | [optional]
 **path** | **String**| Filter on path | [optional]
 **options** | **String**| Filter on options | [optional]
 **username** | **String**| Filter on username | [optional]
 **nasId** | **String**| Filter on NAS id | [optional]

### Return type

[**NasShareCollection**](NasShareCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showNasShareByNas"></a>
# **showNasShareByNas**
> NasShare showNasShareByNas(nasId, nasShareId)

Displays a specific NAS share.

**API Key Scope**: nas_shares / show   Optional API Key Explicit Scope: nas_shares / get_password

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
Integer nasShareId = 56; // Integer | Numeric ID of NAS share.
try {
    NasShare result = apiInstance.showNasShareByNas(nasId, nasShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#showNasShareByNas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasId** | **String**| Numeric ID or name of NAS. |
 **nasShareId** | **Integer**| Numeric ID of NAS share. |

### Return type

[**NasShare**](NasShare.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showNasShares"></a>
# **showNasShares**
> NasShare showNasShares(nasShareId)

Displays a specific NAS share.

**API Key Scope**: nas_shares / show   Optional API Key Explicit Scope: nas_shares / get_password

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
Integer nasShareId = 56; // Integer | Numeric ID of NAS share.
try {
    NasShare result = apiInstance.showNasShares(nasShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#showNasShares");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasShareId** | **Integer**| Numeric ID of NAS share. |

### Return type

[**NasShare**](NasShare.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showNasSharesByNasPool"></a>
# **showNasSharesByNasPool**
> NasShare showNasSharesByNasPool(nasPoolId, nasShareId)

Displays a specific NAS share.

**API Key Scope**: nas_shares / show   Optional API Key Explicit Scope: nas_shares / get_password

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
String nasPoolId = "nasPoolId_example"; // String | Numeric ID or name of NAS pool.
Integer nasShareId = 56; // Integer | Numeric ID of NAS share.
try {
    NasShare result = apiInstance.showNasSharesByNasPool(nasPoolId, nasShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#showNasSharesByNasPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasPoolId** | **String**| Numeric ID or name of NAS pool. |
 **nasShareId** | **Integer**| Numeric ID of NAS share. |

### Return type

[**NasShare**](NasShare.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testNasShare"></a>
# **testNasShare**
> ActiveJobStatus testNasShare(nasId, nasShareBody)

Test an unsaved NAS Share.

**API Key Scope**: nas_shares / test

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
NasShare nasShareBody = new NasShare(); // NasShare | 
try {
    ActiveJobStatus result = apiInstance.testNasShare(nasId, nasShareBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#testNasShare");
    e.printStackTrace();
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
 - **Accept**: application/json

<a name="testResultNasShare"></a>
# **testResultNasShare**
> ActiveJobStatus testResultNasShare(nasId, jobId)

Check result of a NAS Share test job.

**API Key Scope**: nas_shares / test

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
String jobId = "jobId_example"; // String | ID of active job
try {
    ActiveJobStatus result = apiInstance.testResultNasShare(nasId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#testResultNasShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasId** | **String**| Numeric ID or name of NAS. |
 **jobId** | **String**| ID of active job | [optional]

### Return type

[**ActiveJobStatus**](ActiveJobStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNasShare"></a>
# **updateNasShare**
> NasShare updateNasShare(nasShareId, nasShareBody)

Updates a specific NAS share.

**API Key Scope**: nas_shares / update

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
Integer nasShareId = 56; // Integer | Numeric ID of NAS share.
NasShare nasShareBody = new NasShare(); // NasShare | 
try {
    NasShare result = apiInstance.updateNasShare(nasShareId, nasShareBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#updateNasShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasShareId** | **Integer**| Numeric ID of NAS share. |
 **nasShareBody** | [**NasShare**](NasShare.md)|  |

### Return type

[**NasShare**](NasShare.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNasShareByNas"></a>
# **updateNasShareByNas**
> NasShare updateNasShareByNas(nasId, nasShareId, nasShareBody)

Updates a specific NAS share.

**API Key Scope**: nas_shares / update

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
Integer nasShareId = 56; // Integer | Numeric ID of NAS share.
NasShare nasShareBody = new NasShare(); // NasShare | 
try {
    NasShare result = apiInstance.updateNasShareByNas(nasId, nasShareId, nasShareBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#updateNasShareByNas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasId** | **String**| Numeric ID or name of NAS. |
 **nasShareId** | **Integer**| Numeric ID of NAS share. |
 **nasShareBody** | [**NasShare**](NasShare.md)|  |

### Return type

[**NasShare**](NasShare.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNasShareByNasPool"></a>
# **updateNasShareByNasPool**
> NasShare updateNasShareByNasPool(nasPoolId, nasShareId, nasShareBody)

Updates a specific NAS share.

**API Key Scope**: nas_shares / update

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasSharesApi;

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

NasSharesApi apiInstance = new NasSharesApi();
String nasPoolId = "nasPoolId_example"; // String | Numeric ID or name of NAS pool.
Integer nasShareId = 56; // Integer | Numeric ID of NAS share.
NasShare nasShareBody = new NasShare(); // NasShare | 
try {
    NasShare result = apiInstance.updateNasShareByNasPool(nasPoolId, nasShareId, nasShareBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasSharesApi#updateNasShareByNasPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasPoolId** | **String**| Numeric ID or name of NAS pool. |
 **nasShareId** | **Integer**| Numeric ID of NAS share. |
 **nasShareBody** | [**NasShare**](NasShare.md)|  |

### Return type

[**NasShare**](NasShare.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

