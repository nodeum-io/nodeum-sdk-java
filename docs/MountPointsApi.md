# MountPointsApi

All URIs are relative to *https://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMountPoint**](MountPointsApi.md#createMountPoint) | **POST** /mount_points | Creates a new mount point.
[**destroyMountPoint**](MountPointsApi.md#destroyMountPoint) | **DELETE** /mount_points/{mount_point_id} | Destroys a specific mount point.
[**indexMountPoints**](MountPointsApi.md#indexMountPoints) | **GET** /mount_points | Lists all mount points.
[**showMountPoint**](MountPointsApi.md#showMountPoint) | **GET** /mount_points/{mount_point_id} | Displays a specific mount point&#x60;.
[**updateMountPoint**](MountPointsApi.md#updateMountPoint) | **PUT** /mount_points/{mount_point_id} | Updates a specific mount point&#x60;.


<a name="createMountPoint"></a>
# **createMountPoint**
> MountPoint createMountPoint(mountPointBody)

Creates a new mount point.

It **does not** create and mount the file structure. Use API v1 instead.  **API Key Scope**: mount_points / create

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MountPointsApi;

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

MountPointsApi apiInstance = new MountPointsApi();
MountPoint mountPointBody = new MountPoint(); // MountPoint | 
try {
    MountPoint result = apiInstance.createMountPoint(mountPointBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MountPointsApi#createMountPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mountPointBody** | [**MountPoint**](MountPoint.md)|  |

### Return type

[**MountPoint**](MountPoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="destroyMountPoint"></a>
# **destroyMountPoint**
> destroyMountPoint(mountPointId)

Destroys a specific mount point.

**API Key Scope**: mount_points / destroy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MountPointsApi;

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

MountPointsApi apiInstance = new MountPointsApi();
String mountPointId = "mountPointId_example"; // String | Numeric ID or name of mount point.
try {
    apiInstance.destroyMountPoint(mountPointId);
} catch (ApiException e) {
    System.err.println("Exception when calling MountPointsApi#destroyMountPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mountPointId** | **String**| Numeric ID or name of mount point. |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexMountPoints"></a>
# **indexMountPoints**
> MountPointCollection indexMountPoints(limit, offset, sortBy, id, name, target, type, options, username, comment, scanInterval, price)

Lists all mount points.

**API Key Scope**: mount_points / index   Optional API Key Explicit Scope: mount_points / get_password

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MountPointsApi;

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

MountPointsApi apiInstance = new MountPointsApi();
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String name = "name_example"; // String | Filter on name
String target = "target_example"; // String | Filter on mount point target
String type = "type_example"; // String | Filter on type
String options = "options_example"; // String | Filter on options
String username = "username_example"; // String | Filter on username
String comment = "comment_example"; // String | Filter on comment
String scanInterval = "scanInterval_example"; // String | Filter on mount point scan interval
String price = "price_example"; // String | Filter on price
try {
    MountPointCollection result = apiInstance.indexMountPoints(limit, offset, sortBy, id, name, target, type, options, username, comment, scanInterval, price);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MountPointsApi#indexMountPoints");
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
 **target** | **String**| Filter on mount point target | [optional]
 **type** | **String**| Filter on type | [optional]
 **options** | **String**| Filter on options | [optional]
 **username** | **String**| Filter on username | [optional]
 **comment** | **String**| Filter on comment | [optional]
 **scanInterval** | **String**| Filter on mount point scan interval | [optional]
 **price** | **String**| Filter on price | [optional]

### Return type

[**MountPointCollection**](MountPointCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showMountPoint"></a>
# **showMountPoint**
> MountPoint showMountPoint(mountPointId)

Displays a specific mount point&#x60;.

**API Key Scope**: mount_points / show   Optional API Key Explicit Scope: mount_points / get_password

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MountPointsApi;

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

MountPointsApi apiInstance = new MountPointsApi();
String mountPointId = "mountPointId_example"; // String | Numeric ID or name of mount point.
try {
    MountPoint result = apiInstance.showMountPoint(mountPointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MountPointsApi#showMountPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mountPointId** | **String**| Numeric ID or name of mount point. |

### Return type

[**MountPoint**](MountPoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMountPoint"></a>
# **updateMountPoint**
> MountPoint updateMountPoint(mountPointId, mountPointBody)

Updates a specific mount point&#x60;.

It **does not** create and mount the file structure. Use API v1 instead.  **API Key Scope**: mount_points / update

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MountPointsApi;

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

MountPointsApi apiInstance = new MountPointsApi();
String mountPointId = "mountPointId_example"; // String | Numeric ID or name of mount point.
MountPoint mountPointBody = new MountPoint(); // MountPoint | 
try {
    MountPoint result = apiInstance.updateMountPoint(mountPointId, mountPointBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MountPointsApi#updateMountPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mountPointId** | **String**| Numeric ID or name of mount point. |
 **mountPointBody** | [**MountPoint**](MountPoint.md)|  |

### Return type

[**MountPoint**](MountPoint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

