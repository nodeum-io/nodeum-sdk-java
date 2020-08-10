# CloudBucketsApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**indexCloudBuckets**](CloudBucketsApi.md#indexCloudBuckets) | **GET** /cloud_buckets | Lists all cloud buckets.
[**indexCloudBucketsByCloudConnector**](CloudBucketsApi.md#indexCloudBucketsByCloudConnector) | **GET** /cloud_connectors/{cloud_connector_id}/cloud_buckets | Lists all cloud buckets.
[**indexCloudBucketsByPool**](CloudBucketsApi.md#indexCloudBucketsByPool) | **GET** /pools/{pool_id}/cloud_buckets | Lists all cloud buckets from pool.
[**mountStatusCloudBucket**](CloudBucketsApi.md#mountStatusCloudBucket) | **GET** /cloud_buckets/{cloud_bucket_id}/mount | Get mount status of Cloud bucket.
[**mountStatusCloudBucketByCloudConnector**](CloudBucketsApi.md#mountStatusCloudBucketByCloudConnector) | **GET** /cloud_connectors/{cloud_connector_id}/cloud_buckets/{cloud_bucket_id}/mount | Get mount status of Cloud bucket.
[**mountStatusCloudBucketByPool**](CloudBucketsApi.md#mountStatusCloudBucketByPool) | **GET** /pools/{pool_id}/cloud_buckets/{cloud_bucket_id}/mount | Get mount status of Cloud bucket.
[**showCloudBucket**](CloudBucketsApi.md#showCloudBucket) | **GET** /cloud_buckets/{cloud_bucket_id} | Displays a specific cloud bucket.
[**showCloudBucketByCloudConnector**](CloudBucketsApi.md#showCloudBucketByCloudConnector) | **GET** /cloud_connectors/{cloud_connector_id}/cloud_buckets/{cloud_bucket_id} | Displays a specific cloud bucket.
[**showCloudBucketByPool**](CloudBucketsApi.md#showCloudBucketByPool) | **GET** /pools/{pool_id}/cloud_buckets/{cloud_bucket_id} | Displays a specific cloud bucket.
[**syncCloudBuckets**](CloudBucketsApi.md#syncCloudBuckets) | **PUT** /cloud_connectors/{cloud_connector_id}/cloud_buckets/-/sync | Synchronize internal cloud buckets with their remote equivalent.
[**syncResultCloudBuckets**](CloudBucketsApi.md#syncResultCloudBuckets) | **GET** /cloud_connectors/{cloud_connector_id}/cloud_buckets/-/sync | Check result of cloud connector sync job.
[**updateCloudBucket**](CloudBucketsApi.md#updateCloudBucket) | **PUT** /cloud_buckets/{cloud_bucket_id} | Updates a specific cloud bucket.
[**updateCloudBucketByCloudConnector**](CloudBucketsApi.md#updateCloudBucketByCloudConnector) | **PUT** /cloud_connectors/{cloud_connector_id}/cloud_buckets/{cloud_bucket_id} | Updates a specific cloud bucket.
[**updateCloudBucketByPool**](CloudBucketsApi.md#updateCloudBucketByPool) | **PUT** /pools/{pool_id}/cloud_buckets/{cloud_bucket_id} | Updates a specific cloud bucket.
[**updateConfigFileCloudBucket**](CloudBucketsApi.md#updateConfigFileCloudBucket) | **PUT** /cloud_buckets/{cloud_bucket_id}/config_file | Updates a specific cloud bucket.


<a name="indexCloudBuckets"></a>
# **indexCloudBuckets**
> CloudBucketCollection indexCloudBuckets(limit, offset, sortBy, id, cloudConnectorId, poolId, name, location, price)

Lists all cloud buckets.

**API Key Scope**: cloud_buckets / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String cloudConnectorId = "cloudConnectorId_example"; // String | Filter on cloud connector id
    String poolId = "poolId_example"; // String | Filter on a pool id
    String name = "name_example"; // String | Filter on name
    String location = "location_example"; // String | Filter on location
    String price = "price_example"; // String | Filter on price
    try {
      CloudBucketCollection result = apiInstance.indexCloudBuckets(limit, offset, sortBy, id, cloudConnectorId, poolId, name, location, price);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#indexCloudBuckets");
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
 **cloudConnectorId** | **String**| Filter on cloud connector id | [optional]
 **poolId** | **String**| Filter on a pool id | [optional]
 **name** | **String**| Filter on name | [optional]
 **location** | **String**| Filter on location | [optional]
 **price** | **String**| Filter on price | [optional]

### Return type

[**CloudBucketCollection**](CloudBucketCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of cloud buckets. |  -  |

<a name="indexCloudBucketsByCloudConnector"></a>
# **indexCloudBucketsByCloudConnector**
> CloudBucketCollection indexCloudBucketsByCloudConnector(cloudConnectorId, limit, offset, sortBy, id, poolId, name, location, price)

Lists all cloud buckets.

**API Key Scope**: cloud_buckets / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    String cloudConnectorId = "cloudConnectorId_example"; // String | Numeric ID or name of cloud connector.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String poolId = "poolId_example"; // String | Filter on a pool id
    String name = "name_example"; // String | Filter on name
    String location = "location_example"; // String | Filter on location
    String price = "price_example"; // String | Filter on price
    try {
      CloudBucketCollection result = apiInstance.indexCloudBucketsByCloudConnector(cloudConnectorId, limit, offset, sortBy, id, poolId, name, location, price);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#indexCloudBucketsByCloudConnector");
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
 **cloudConnectorId** | **String**| Numeric ID or name of cloud connector. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. | [optional]
 **id** | **String**| Filter on id | [optional]
 **poolId** | **String**| Filter on a pool id | [optional]
 **name** | **String**| Filter on name | [optional]
 **location** | **String**| Filter on location | [optional]
 **price** | **String**| Filter on price | [optional]

### Return type

[**CloudBucketCollection**](CloudBucketCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of cloud buckets. |  -  |

<a name="indexCloudBucketsByPool"></a>
# **indexCloudBucketsByPool**
> CloudBucketCollection indexCloudBucketsByPool(poolId, limit, offset, sortBy, id, cloudConnectorId, name, location, price)

Lists all cloud buckets from pool.

**API Key Scope**: cloud_buckets / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String cloudConnectorId = "cloudConnectorId_example"; // String | Filter on cloud connector id
    String name = "name_example"; // String | Filter on name
    String location = "location_example"; // String | Filter on location
    String price = "price_example"; // String | Filter on price
    try {
      CloudBucketCollection result = apiInstance.indexCloudBucketsByPool(poolId, limit, offset, sortBy, id, cloudConnectorId, name, location, price);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#indexCloudBucketsByPool");
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
 **cloudConnectorId** | **String**| Filter on cloud connector id | [optional]
 **name** | **String**| Filter on name | [optional]
 **location** | **String**| Filter on location | [optional]
 **price** | **String**| Filter on price | [optional]

### Return type

[**CloudBucketCollection**](CloudBucketCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of cloud buckets. |  -  |

<a name="mountStatusCloudBucket"></a>
# **mountStatusCloudBucket**
> MountStatus mountStatusCloudBucket(cloudBucketId)

Get mount status of Cloud bucket.

**API Key Scope**: cloud_buckets / mount_status

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    String cloudBucketId = "cloudBucketId_example"; // String | Numeric ID or name of cloud bucket.
    try {
      MountStatus result = apiInstance.mountStatusCloudBucket(cloudBucketId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#mountStatusCloudBucket");
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
 **cloudBucketId** | **String**| Numeric ID or name of cloud bucket. |

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

<a name="mountStatusCloudBucketByCloudConnector"></a>
# **mountStatusCloudBucketByCloudConnector**
> MountStatus mountStatusCloudBucketByCloudConnector(cloudConnectorId, cloudBucketId)

Get mount status of Cloud bucket.

**API Key Scope**: cloud_buckets / mount_status

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    String cloudConnectorId = "cloudConnectorId_example"; // String | Numeric ID or name of cloud connector.
    String cloudBucketId = "cloudBucketId_example"; // String | Numeric ID or name of cloud bucket.
    try {
      MountStatus result = apiInstance.mountStatusCloudBucketByCloudConnector(cloudConnectorId, cloudBucketId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#mountStatusCloudBucketByCloudConnector");
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
 **cloudConnectorId** | **String**| Numeric ID or name of cloud connector. |
 **cloudBucketId** | **String**| Numeric ID or name of cloud bucket. |

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

<a name="mountStatusCloudBucketByPool"></a>
# **mountStatusCloudBucketByPool**
> MountStatus mountStatusCloudBucketByPool(poolId, cloudBucketId)

Get mount status of Cloud bucket.

**API Key Scope**: cloud_buckets / mount_status

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    String cloudBucketId = "cloudBucketId_example"; // String | Numeric ID or name of cloud bucket.
    try {
      MountStatus result = apiInstance.mountStatusCloudBucketByPool(poolId, cloudBucketId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#mountStatusCloudBucketByPool");
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
 **cloudBucketId** | **String**| Numeric ID or name of cloud bucket. |

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

<a name="showCloudBucket"></a>
# **showCloudBucket**
> CloudBucket showCloudBucket(cloudBucketId)

Displays a specific cloud bucket.

**API Key Scope**: cloud_buckets / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    String cloudBucketId = "cloudBucketId_example"; // String | Numeric ID or name of cloud bucket.
    try {
      CloudBucket result = apiInstance.showCloudBucket(cloudBucketId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#showCloudBucket");
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
 **cloudBucketId** | **String**| Numeric ID or name of cloud bucket. |

### Return type

[**CloudBucket**](CloudBucket.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific cloud bucket. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

<a name="showCloudBucketByCloudConnector"></a>
# **showCloudBucketByCloudConnector**
> CloudBucket showCloudBucketByCloudConnector(cloudConnectorId, cloudBucketId)

Displays a specific cloud bucket.

**API Key Scope**: cloud_buckets / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    String cloudConnectorId = "cloudConnectorId_example"; // String | Numeric ID or name of cloud connector.
    String cloudBucketId = "cloudBucketId_example"; // String | Numeric ID or name of cloud bucket.
    try {
      CloudBucket result = apiInstance.showCloudBucketByCloudConnector(cloudConnectorId, cloudBucketId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#showCloudBucketByCloudConnector");
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
 **cloudConnectorId** | **String**| Numeric ID or name of cloud connector. |
 **cloudBucketId** | **String**| Numeric ID or name of cloud bucket. |

### Return type

[**CloudBucket**](CloudBucket.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific cloud bucket. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

<a name="showCloudBucketByPool"></a>
# **showCloudBucketByPool**
> CloudBucket showCloudBucketByPool(poolId, cloudBucketId)

Displays a specific cloud bucket.

**API Key Scope**: cloud_buckets / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    String cloudBucketId = "cloudBucketId_example"; // String | Numeric ID or name of cloud bucket.
    try {
      CloudBucket result = apiInstance.showCloudBucketByPool(poolId, cloudBucketId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#showCloudBucketByPool");
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
 **cloudBucketId** | **String**| Numeric ID or name of cloud bucket. |

### Return type

[**CloudBucket**](CloudBucket.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific cloud bucket. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

<a name="syncCloudBuckets"></a>
# **syncCloudBuckets**
> ActiveJobStatus syncCloudBuckets(cloudConnectorId)

Synchronize internal cloud buckets with their remote equivalent.

**API Key Scope**: cloud_buckets / sync

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    String cloudConnectorId = "cloudConnectorId_example"; // String | Numeric ID or name of cloud connector.
    try {
      ActiveJobStatus result = apiInstance.syncCloudBuckets(cloudConnectorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#syncCloudBuckets");
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
 **cloudConnectorId** | **String**| Numeric ID or name of cloud connector. |

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
**202** | An active job that may be queued, working, completed or failed. |  -  |

<a name="syncResultCloudBuckets"></a>
# **syncResultCloudBuckets**
> CloudBucketSimpleCollection syncResultCloudBuckets(cloudConnectorId, jobId)

Check result of cloud connector sync job.

**API Key Scope**: cloud_buckets / sync

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    String cloudConnectorId = "cloudConnectorId_example"; // String | Numeric ID or name of cloud connector.
    String jobId = "jobId_example"; // String | ID of active job
    try {
      CloudBucketSimpleCollection result = apiInstance.syncResultCloudBuckets(cloudConnectorId, jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#syncResultCloudBuckets");
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
 **cloudConnectorId** | **String**| Numeric ID or name of cloud connector. |
 **jobId** | **String**| ID of active job |

### Return type

[**CloudBucketSimpleCollection**](CloudBucketSimpleCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, queued, working, failed, 

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Simple list of cloud buckets. |  -  |
**202** | An active job that may be queued, working, completed or failed. |  -  |

<a name="updateCloudBucket"></a>
# **updateCloudBucket**
> CloudBucket updateCloudBucket(cloudBucketId, cloudBucketBody)

Updates a specific cloud bucket.

**API Key Scope**: cloud_buckets / update

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    String cloudBucketId = "cloudBucketId_example"; // String | Numeric ID or name of cloud bucket.
    CloudBucket cloudBucketBody = new CloudBucket(); // CloudBucket | 
    try {
      CloudBucket result = apiInstance.updateCloudBucket(cloudBucketId, cloudBucketBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#updateCloudBucket");
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
 **cloudBucketId** | **String**| Numeric ID or name of cloud bucket. |
 **cloudBucketBody** | [**CloudBucket**](CloudBucket.md)|  |

### Return type

[**CloudBucket**](CloudBucket.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific cloud bucket. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

<a name="updateCloudBucketByCloudConnector"></a>
# **updateCloudBucketByCloudConnector**
> CloudBucket updateCloudBucketByCloudConnector(cloudConnectorId, cloudBucketId, cloudBucketBody)

Updates a specific cloud bucket.

**API Key Scope**: cloud_buckets / update

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    String cloudConnectorId = "cloudConnectorId_example"; // String | Numeric ID or name of cloud connector.
    String cloudBucketId = "cloudBucketId_example"; // String | Numeric ID or name of cloud bucket.
    CloudBucket cloudBucketBody = new CloudBucket(); // CloudBucket | 
    try {
      CloudBucket result = apiInstance.updateCloudBucketByCloudConnector(cloudConnectorId, cloudBucketId, cloudBucketBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#updateCloudBucketByCloudConnector");
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
 **cloudConnectorId** | **String**| Numeric ID or name of cloud connector. |
 **cloudBucketId** | **String**| Numeric ID or name of cloud bucket. |
 **cloudBucketBody** | [**CloudBucket**](CloudBucket.md)|  |

### Return type

[**CloudBucket**](CloudBucket.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific cloud bucket. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

<a name="updateCloudBucketByPool"></a>
# **updateCloudBucketByPool**
> CloudBucket updateCloudBucketByPool(poolId, cloudBucketId, cloudBucketBody)

Updates a specific cloud bucket.

**API Key Scope**: cloud_buckets / update

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    String cloudBucketId = "cloudBucketId_example"; // String | Numeric ID or name of cloud bucket.
    CloudBucket cloudBucketBody = new CloudBucket(); // CloudBucket | 
    try {
      CloudBucket result = apiInstance.updateCloudBucketByPool(poolId, cloudBucketId, cloudBucketBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#updateCloudBucketByPool");
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
 **cloudBucketId** | **String**| Numeric ID or name of cloud bucket. |
 **cloudBucketBody** | [**CloudBucket**](CloudBucket.md)|  |

### Return type

[**CloudBucket**](CloudBucket.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific cloud bucket. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

<a name="updateConfigFileCloudBucket"></a>
# **updateConfigFileCloudBucket**
> String updateConfigFileCloudBucket(cloudBucketId, configFile)

Updates a specific cloud bucket.

**API Key Scope**: cloud_buckets / update_config_file

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.CloudBucketsApi;

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

    CloudBucketsApi apiInstance = new CloudBucketsApi(defaultClient);
    String cloudBucketId = "cloudBucketId_example"; // String | Numeric ID or name of cloud bucket.
    File configFile = new File("/path/to/file"); // File | Config file to upload.
    try {
      String result = apiInstance.updateConfigFileCloudBucket(cloudBucketId, configFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudBucketsApi#updateConfigFileCloudBucket");
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
 **cloudBucketId** | **String**| Numeric ID or name of cloud bucket. |
 **configFile** | **File**| Config file to upload. |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Remote URI |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

