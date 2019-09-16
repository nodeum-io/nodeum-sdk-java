# CloudBucketsApi

All URIs are relative to *https://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**indexCloudBuckets**](CloudBucketsApi.md#indexCloudBuckets) | **GET** /cloud_buckets | Lists all cloud buckets.
[**indexCloudBucketsByCloudConnector**](CloudBucketsApi.md#indexCloudBucketsByCloudConnector) | **GET** /cloud_connectors/{cloud_connector_id}/cloud_buckets | Lists all cloud buckets.
[**indexCloudBucketsByCloudPool**](CloudBucketsApi.md#indexCloudBucketsByCloudPool) | **GET** /cloud_pools/{cloud_pool_id}/cloud_buckets | Lists all cloud buckets.
[**showCloudBucket**](CloudBucketsApi.md#showCloudBucket) | **GET** /cloud_buckets/{cloud_bucket_id} | Displays a specific cloud bucket.
[**showCloudBucketByCloudConnector**](CloudBucketsApi.md#showCloudBucketByCloudConnector) | **GET** /cloud_connectors/{cloud_connector_id}/cloud_buckets/{cloud_bucket_id} | Displays a specific cloud bucket.
[**showCloudBucketByCloudPool**](CloudBucketsApi.md#showCloudBucketByCloudPool) | **GET** /cloud_pools/{cloud_pool_id}/cloud_buckets/{cloud_bucket_id} | Displays a specific cloud bucket.
[**syncCloudBuckets**](CloudBucketsApi.md#syncCloudBuckets) | **PUT** /cloud_connectors/{cloud_connector_id}/cloud_buckets/-/sync | Synchronize internal cloud buckets with their remote equivalent.
[**syncResultCloudBuckets**](CloudBucketsApi.md#syncResultCloudBuckets) | **GET** /cloud_connectors/{cloud_connector_id}/cloud_buckets/-/sync | Check result of cloud connector sync job.


<a name="indexCloudBuckets"></a>
# **indexCloudBuckets**
> CloudBucketCollection indexCloudBuckets(limit, offset, sortBy, id, cloudConnectorId, cloudPoolId, name, location, price)

Lists all cloud buckets.

**API Key Scope**: cloud_buckets / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudBucketsApi;

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

CloudBucketsApi apiInstance = new CloudBucketsApi();
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String cloudConnectorId = "cloudConnectorId_example"; // String | Filter on cloud connector id
String cloudPoolId = "cloudPoolId_example"; // String | Filter on cloud pool id
String name = "name_example"; // String | Filter on name
String location = "location_example"; // String | Filter on location
String price = "price_example"; // String | Filter on price
try {
    CloudBucketCollection result = apiInstance.indexCloudBuckets(limit, offset, sortBy, id, cloudConnectorId, cloudPoolId, name, location, price);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudBucketsApi#indexCloudBuckets");
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
 **cloudConnectorId** | **String**| Filter on cloud connector id | [optional]
 **cloudPoolId** | **String**| Filter on cloud pool id | [optional]
 **name** | **String**| Filter on name | [optional]
 **location** | **String**| Filter on location | [optional]
 **price** | **String**| Filter on price | [optional]

### Return type

[**CloudBucketCollection**](CloudBucketCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexCloudBucketsByCloudConnector"></a>
# **indexCloudBucketsByCloudConnector**
> CloudBucketCollection indexCloudBucketsByCloudConnector(cloudConnectorId, limit, offset, sortBy, id, cloudPoolId, name, location, price)

Lists all cloud buckets.

**API Key Scope**: cloud_buckets / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudBucketsApi;

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

CloudBucketsApi apiInstance = new CloudBucketsApi();
String cloudConnectorId = "cloudConnectorId_example"; // String | Numeric ID or name of cloud connector.
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String cloudPoolId = "cloudPoolId_example"; // String | Filter on cloud pool id
String name = "name_example"; // String | Filter on name
String location = "location_example"; // String | Filter on location
String price = "price_example"; // String | Filter on price
try {
    CloudBucketCollection result = apiInstance.indexCloudBucketsByCloudConnector(cloudConnectorId, limit, offset, sortBy, id, cloudPoolId, name, location, price);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudBucketsApi#indexCloudBucketsByCloudConnector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudConnectorId** | **String**| Numeric ID or name of cloud connector. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. | [optional]
 **id** | **String**| Filter on id | [optional]
 **cloudPoolId** | **String**| Filter on cloud pool id | [optional]
 **name** | **String**| Filter on name | [optional]
 **location** | **String**| Filter on location | [optional]
 **price** | **String**| Filter on price | [optional]

### Return type

[**CloudBucketCollection**](CloudBucketCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexCloudBucketsByCloudPool"></a>
# **indexCloudBucketsByCloudPool**
> CloudBucketCollection indexCloudBucketsByCloudPool(cloudPoolId, limit, offset, sortBy, id, cloudConnectorId, name, location, price)

Lists all cloud buckets.

**API Key Scope**: cloud_buckets / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudBucketsApi;

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

CloudBucketsApi apiInstance = new CloudBucketsApi();
String cloudPoolId = "cloudPoolId_example"; // String | Numeric ID or name of cloud pool.
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String cloudConnectorId = "cloudConnectorId_example"; // String | Filter on cloud connector id
String name = "name_example"; // String | Filter on name
String location = "location_example"; // String | Filter on location
String price = "price_example"; // String | Filter on price
try {
    CloudBucketCollection result = apiInstance.indexCloudBucketsByCloudPool(cloudPoolId, limit, offset, sortBy, id, cloudConnectorId, name, location, price);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudBucketsApi#indexCloudBucketsByCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudPoolId** | **String**| Numeric ID or name of cloud pool. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. | [optional]
 **id** | **String**| Filter on id | [optional]
 **cloudConnectorId** | **String**| Filter on cloud connector id | [optional]
 **name** | **String**| Filter on name | [optional]
 **location** | **String**| Filter on location | [optional]
 **price** | **String**| Filter on price | [optional]

### Return type

[**CloudBucketCollection**](CloudBucketCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showCloudBucket"></a>
# **showCloudBucket**
> CloudBucket showCloudBucket(cloudBucketId)

Displays a specific cloud bucket.

**API Key Scope**: cloud_buckets / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudBucketsApi;

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

CloudBucketsApi apiInstance = new CloudBucketsApi();
String cloudBucketId = "cloudBucketId_example"; // String | Numeric ID or name of cloud bucket.
try {
    CloudBucket result = apiInstance.showCloudBucket(cloudBucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudBucketsApi#showCloudBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudBucketId** | **String**| Numeric ID or name of cloud bucket. |

### Return type

[**CloudBucket**](CloudBucket.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showCloudBucketByCloudConnector"></a>
# **showCloudBucketByCloudConnector**
> CloudBucket showCloudBucketByCloudConnector(cloudConnectorId, cloudBucketId)

Displays a specific cloud bucket.

**API Key Scope**: cloud_buckets / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudBucketsApi;

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

CloudBucketsApi apiInstance = new CloudBucketsApi();
String cloudConnectorId = "cloudConnectorId_example"; // String | Numeric ID or name of cloud connector.
String cloudBucketId = "cloudBucketId_example"; // String | Numeric ID or name of cloud bucket.
try {
    CloudBucket result = apiInstance.showCloudBucketByCloudConnector(cloudConnectorId, cloudBucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudBucketsApi#showCloudBucketByCloudConnector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudConnectorId** | **String**| Numeric ID or name of cloud connector. |
 **cloudBucketId** | **String**| Numeric ID or name of cloud bucket. |

### Return type

[**CloudBucket**](CloudBucket.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showCloudBucketByCloudPool"></a>
# **showCloudBucketByCloudPool**
> CloudBucket showCloudBucketByCloudPool(cloudPoolId, cloudBucketId)

Displays a specific cloud bucket.

**API Key Scope**: cloud_buckets / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudBucketsApi;

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

CloudBucketsApi apiInstance = new CloudBucketsApi();
String cloudPoolId = "cloudPoolId_example"; // String | Numeric ID or name of cloud pool.
String cloudBucketId = "cloudBucketId_example"; // String | Numeric ID or name of cloud bucket.
try {
    CloudBucket result = apiInstance.showCloudBucketByCloudPool(cloudPoolId, cloudBucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudBucketsApi#showCloudBucketByCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudPoolId** | **String**| Numeric ID or name of cloud pool. |
 **cloudBucketId** | **String**| Numeric ID or name of cloud bucket. |

### Return type

[**CloudBucket**](CloudBucket.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="syncCloudBuckets"></a>
# **syncCloudBuckets**
> ActiveJobStatus syncCloudBuckets(cloudConnectorId)

Synchronize internal cloud buckets with their remote equivalent.

**API Key Scope**: cloud_buckets / sync

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudBucketsApi;

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

CloudBucketsApi apiInstance = new CloudBucketsApi();
String cloudConnectorId = "cloudConnectorId_example"; // String | Numeric ID or name of cloud connector.
try {
    ActiveJobStatus result = apiInstance.syncCloudBuckets(cloudConnectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudBucketsApi#syncCloudBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudConnectorId** | **String**| Numeric ID or name of cloud connector. |

### Return type

[**ActiveJobStatus**](ActiveJobStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="syncResultCloudBuckets"></a>
# **syncResultCloudBuckets**
> CloudBucketSimpleCollection syncResultCloudBuckets(cloudConnectorId, jobId)

Check result of cloud connector sync job.

**API Key Scope**: cloud_buckets / sync

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudBucketsApi;

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

CloudBucketsApi apiInstance = new CloudBucketsApi();
String cloudConnectorId = "cloudConnectorId_example"; // String | Numeric ID or name of cloud connector.
String jobId = "jobId_example"; // String | ID of active job
try {
    CloudBucketSimpleCollection result = apiInstance.syncResultCloudBuckets(cloudConnectorId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudBucketsApi#syncResultCloudBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudConnectorId** | **String**| Numeric ID or name of cloud connector. |
 **jobId** | **String**| ID of active job | [optional]

### Return type

[**CloudBucketSimpleCollection**](CloudBucketSimpleCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

