# UsersApi

All URIs are relative to *https://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApiKey**](UsersApi.md#createApiKey) | **POST** /users/me/api_keys | Creates a new API Key for current user.
[**destroyApiKey**](UsersApi.md#destroyApiKey) | **DELETE** /users/me/api_keys/{api_key_id} | Destroys a specific API Key.
[**indexApiKeys**](UsersApi.md#indexApiKeys) | **GET** /users/me/api_keys | Lists all API keys of current user.
[**showApiKey**](UsersApi.md#showApiKey) | **GET** /users/me/api_keys/{api_key_id} | Displays a specific API Key with its scopes.
[**updateApiKey**](UsersApi.md#updateApiKey) | **PUT** /users/me/api_keys/{api_key_id} | Updates a specific API Key.


<a name="createApiKey"></a>
# **createApiKey**
> ApiKeyFull createApiKey(apiKeyBody)

Creates a new API Key for current user.

**API Key Scope**: api_keys / create

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

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

UsersApi apiInstance = new UsersApi();
ApiKeyFull apiKeyBody = new ApiKeyFull(); // ApiKeyFull | 
try {
    ApiKeyFull result = apiInstance.createApiKey(apiKeyBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#createApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyBody** | [**ApiKeyFull**](ApiKeyFull.md)|  |

### Return type

[**ApiKeyFull**](ApiKeyFull.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="destroyApiKey"></a>
# **destroyApiKey**
> destroyApiKey(apiKeyId)

Destroys a specific API Key.

**API Key Scope**: api_keys / destroy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

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

UsersApi apiInstance = new UsersApi();
Integer apiKeyId = 56; // Integer | Numeric ID of API Key.
try {
    apiInstance.destroyApiKey(apiKeyId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#destroyApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyId** | **Integer**| Numeric ID of API Key. |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexApiKeys"></a>
# **indexApiKeys**
> ApiKeyCollection indexApiKeys(limit, offset)

Lists all API keys of current user.

**API Key Scope**: api_keys / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

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

UsersApi apiInstance = new UsersApi();
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
try {
    ApiKeyCollection result = apiInstance.indexApiKeys(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#indexApiKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]

### Return type

[**ApiKeyCollection**](ApiKeyCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showApiKey"></a>
# **showApiKey**
> ApiKeyFull showApiKey(apiKeyId)

Displays a specific API Key with its scopes.

**API Key Scope**: api_keys / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

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

UsersApi apiInstance = new UsersApi();
Integer apiKeyId = 56; // Integer | Numeric ID of API Key.
try {
    ApiKeyFull result = apiInstance.showApiKey(apiKeyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#showApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyId** | **Integer**| Numeric ID of API Key. |

### Return type

[**ApiKeyFull**](ApiKeyFull.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateApiKey"></a>
# **updateApiKey**
> ApiKeyFull updateApiKey(apiKeyId, apiKeyBody)

Updates a specific API Key.

**API Key Scope**: api_keys / update

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

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

UsersApi apiInstance = new UsersApi();
Integer apiKeyId = 56; // Integer | Numeric ID of API Key.
ApiKeyFull apiKeyBody = new ApiKeyFull(); // ApiKeyFull | 
try {
    ApiKeyFull result = apiInstance.updateApiKey(apiKeyId, apiKeyBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyId** | **Integer**| Numeric ID of API Key. |
 **apiKeyBody** | [**ApiKeyFull**](ApiKeyFull.md)|  |

### Return type

[**ApiKeyFull**](ApiKeyFull.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

