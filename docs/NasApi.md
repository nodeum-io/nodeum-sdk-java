# NasApi

All URIs are relative to *https://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNas**](NasApi.md#createNas) | **POST** /nas | Creates a new NAS.
[**destroyNas**](NasApi.md#destroyNas) | **DELETE** /nas/{nas_id} | Destroys a specific NAS.
[**indexNas**](NasApi.md#indexNas) | **GET** /nas | Lists all NAS.
[**showNas**](NasApi.md#showNas) | **GET** /nas/{nas_id} | Displays a specific NAS.
[**updateNas**](NasApi.md#updateNas) | **PUT** /nas/{nas_id} | Updates a specific NAS.


<a name="createNas"></a>
# **createNas**
> Nas createNas(nasBody)

Creates a new NAS.

**API Key Scope**: nas / create

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasApi;

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

NasApi apiInstance = new NasApi();
Nas nasBody = new Nas(); // Nas | 
try {
    Nas result = apiInstance.createNas(nasBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasApi#createNas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasBody** | [**Nas**](Nas.md)|  |

### Return type

[**Nas**](Nas.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="destroyNas"></a>
# **destroyNas**
> destroyNas(nasId)

Destroys a specific NAS.

**API Key Scope**: nas / destroy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasApi;

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

NasApi apiInstance = new NasApi();
String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
try {
    apiInstance.destroyNas(nasId);
} catch (ApiException e) {
    System.err.println("Exception when calling NasApi#destroyNas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasId** | **String**| Numeric ID or name of NAS. |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexNas"></a>
# **indexNas**
> NasCollection indexNas(limit, offset, sortBy, id, name, comment, host, type, price)

Lists all NAS.

**API Key Scope**: nas / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasApi;

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

NasApi apiInstance = new NasApi();
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String name = "name_example"; // String | Filter on name
String comment = "comment_example"; // String | Filter on comment
String host = "host_example"; // String | Filter on host
String type = "type_example"; // String | Filter on type
String price = "price_example"; // String | Filter on price
try {
    NasCollection result = apiInstance.indexNas(limit, offset, sortBy, id, name, comment, host, type, price);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasApi#indexNas");
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
 **name** | **String**| Filter on name | [optional]
 **comment** | **String**| Filter on comment | [optional]
 **host** | **String**| Filter on host | [optional]
 **type** | **String**| Filter on type | [optional]
 **price** | **String**| Filter on price | [optional]

### Return type

[**NasCollection**](NasCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showNas"></a>
# **showNas**
> Nas showNas(nasId)

Displays a specific NAS.

**API Key Scope**: nas / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasApi;

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

NasApi apiInstance = new NasApi();
String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
try {
    Nas result = apiInstance.showNas(nasId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasApi#showNas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasId** | **String**| Numeric ID or name of NAS. |

### Return type

[**Nas**](Nas.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNas"></a>
# **updateNas**
> Nas updateNas(nasId, nasBody)

Updates a specific NAS.

**API Key Scope**: nas / update

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NasApi;

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

NasApi apiInstance = new NasApi();
String nasId = "nasId_example"; // String | Numeric ID or name of NAS.
Nas nasBody = new Nas(); // Nas | 
try {
    Nas result = apiInstance.updateNas(nasId, nasBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NasApi#updateNas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nasId** | **String**| Numeric ID or name of NAS. |
 **nasBody** | [**Nas**](Nas.md)|  |

### Return type

[**Nas**](Nas.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

