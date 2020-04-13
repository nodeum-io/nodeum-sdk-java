# UsersApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApiKey**](UsersApi.md#createApiKey) | **POST** /users/me/api_keys | Creates a new API Key for current user.
[**destroyApiKey**](UsersApi.md#destroyApiKey) | **DELETE** /users/me/api_keys/{api_key_id} | Destroys a specific API Key.
[**indexApiKeys**](UsersApi.md#indexApiKeys) | **GET** /users/me/api_keys | Lists all API keys of current user.
[**indexSystemGroups**](UsersApi.md#indexSystemGroups) | **GET** /groups/-/systems | List all system groups.
[**indexSystemUsers**](UsersApi.md#indexSystemUsers) | **GET** /users/-/systems | List all system users.
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
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.UsersApi;

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

    UsersApi apiInstance = new UsersApi(defaultClient);
    ApiKeyFull apiKeyBody = new ApiKeyFull(); // ApiKeyFull | 
    try {
      ApiKeyFull result = apiInstance.createApiKey(apiKeyBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createApiKey");
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
 **apiKeyBody** | [**ApiKeyFull**](ApiKeyFull.md)|  |

### Return type

[**ApiKeyFull**](ApiKeyFull.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A specific file. |  -  |

<a name="destroyApiKey"></a>
# **destroyApiKey**
> destroyApiKey(apiKeyId)

Destroys a specific API Key.

**API Key Scope**: api_keys / destroy

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.UsersApi;

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

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer apiKeyId = 56; // Integer | Numeric ID of API Key.
    try {
      apiInstance.destroyApiKey(apiKeyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#destroyApiKey");
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
 **apiKeyId** | **Integer**| Numeric ID of API Key. |

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
**204** | API Key destroyed. |  -  |

<a name="indexApiKeys"></a>
# **indexApiKeys**
> ApiKeyCollection indexApiKeys(limit, offset)

Lists all API keys of current user.

**API Key Scope**: api_keys / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.UsersApi;

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

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    try {
      ApiKeyCollection result = apiInstance.indexApiKeys(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#indexApiKeys");
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

### Return type

[**ApiKeyCollection**](ApiKeyCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of API Keys. |  -  |

<a name="indexSystemGroups"></a>
# **indexSystemGroups**
> SystemGroupCollection indexSystemGroups()

List all system groups.

**API Key Scope**: groups / systems

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.UsersApi;

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

    UsersApi apiInstance = new UsersApi(defaultClient);
    try {
      SystemGroupCollection result = apiInstance.indexSystemGroups();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#indexSystemGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemGroupCollection**](SystemGroupCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="indexSystemUsers"></a>
# **indexSystemUsers**
> SystemUserCollection indexSystemUsers()

List all system users.

**API Key Scope**: users / systems

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.UsersApi;

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

    UsersApi apiInstance = new UsersApi(defaultClient);
    try {
      SystemUserCollection result = apiInstance.indexSystemUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#indexSystemUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemUserCollection**](SystemUserCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="showApiKey"></a>
# **showApiKey**
> ApiKeyFull showApiKey(apiKeyId)

Displays a specific API Key with its scopes.

**API Key Scope**: api_keys / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.UsersApi;

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

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer apiKeyId = 56; // Integer | Numeric ID of API Key.
    try {
      ApiKeyFull result = apiInstance.showApiKey(apiKeyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#showApiKey");
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
 **apiKeyId** | **Integer**| Numeric ID of API Key. |

### Return type

[**ApiKeyFull**](ApiKeyFull.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific file. |  -  |

<a name="updateApiKey"></a>
# **updateApiKey**
> ApiKeyFull updateApiKey(apiKeyId, apiKeyBody)

Updates a specific API Key.

**API Key Scope**: api_keys / update

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.UsersApi;

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

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer apiKeyId = 56; // Integer | Numeric ID of API Key.
    ApiKeyFull apiKeyBody = new ApiKeyFull(); // ApiKeyFull | 
    try {
      ApiKeyFull result = apiInstance.updateApiKey(apiKeyId, apiKeyBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateApiKey");
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
 **apiKeyId** | **Integer**| Numeric ID of API Key. |
 **apiKeyBody** | [**ApiKeyFull**](ApiKeyFull.md)|  |

### Return type

[**ApiKeyFull**](ApiKeyFull.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific file. |  -  |

