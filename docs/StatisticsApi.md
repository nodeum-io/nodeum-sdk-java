# StatisticsApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statisticsByDate**](StatisticsApi.md#statisticsByDate) | **GET** /statistics/by_date | Get statistics about files, grouped by date
[**statisticsByFileExtension**](StatisticsApi.md#statisticsByFileExtension) | **GET** /statistics/by_file_extension | Get statistics about files, grouped by file extension
[**statisticsByGroupOwner**](StatisticsApi.md#statisticsByGroupOwner) | **GET** /statistics/by_group_owner | Get statistics about files, grouped by owner (group)
[**statisticsByMetadata**](StatisticsApi.md#statisticsByMetadata) | **GET** /statistics/by_metadata | Get statistics about files, grouped by metadata
[**statisticsByPrimaryCloud**](StatisticsApi.md#statisticsByPrimaryCloud) | **GET** /statistics/by_primary_cloud | Get statistics about files, grouped by primary Cloud
[**statisticsByPrimaryName**](StatisticsApi.md#statisticsByPrimaryName) | **GET** /statistics/by_primary_name | Get statistics about files, grouped by primary storages
[**statisticsByPrimaryNas**](StatisticsApi.md#statisticsByPrimaryNas) | **GET** /statistics/by_primary_nas | Get statistics about files, grouped by primary NAS
[**statisticsByPrimaryStorage**](StatisticsApi.md#statisticsByPrimaryStorage) | **GET** /statistics/by_primary_storage | Get statistics about files, grouped by primary storage
[**statisticsBySecondaryCloud**](StatisticsApi.md#statisticsBySecondaryCloud) | **GET** /statistics/by_secondary_cloud | Get statistics about files, grouped by secondary Cloud
[**statisticsBySecondaryNas**](StatisticsApi.md#statisticsBySecondaryNas) | **GET** /statistics/by_secondary_nas | Get statistics about files, grouped by secondary NAS
[**statisticsBySecondaryStorage**](StatisticsApi.md#statisticsBySecondaryStorage) | **GET** /statistics/by_secondary_storage | Get statistics about files, grouped by secondary storage
[**statisticsBySecondaryTape**](StatisticsApi.md#statisticsBySecondaryTape) | **GET** /statistics/by_secondary_tape | Get statistics about files, grouped by secondary Tape
[**statisticsBySize**](StatisticsApi.md#statisticsBySize) | **GET** /statistics/by_size | Get statistics about files, grouped by size
[**statisticsByUserOwner**](StatisticsApi.md#statisticsByUserOwner) | **GET** /statistics/by_user_owner | Get statistics about files, grouped by owner (user)
[**statisticsStorage**](StatisticsApi.md#statisticsStorage) | **GET** /statistics/storage | Get statistics about storages, grouped by types
[**statisticsTaskByMetadata**](StatisticsApi.md#statisticsTaskByMetadata) | **GET** /statistics/task_by_metadata | Get statistics about tasks executions, grouped by metadata
[**statisticsTaskByStatus**](StatisticsApi.md#statisticsTaskByStatus) | **GET** /statistics/task_by_status | Get statistics about tasks executions, grouped by status
[**statisticsTaskByStorage**](StatisticsApi.md#statisticsTaskByStorage) | **GET** /statistics/task_by_storage | Get statistics about tasks executions, grouped by source and destination
[**statisticsTaskByWorkflow**](StatisticsApi.md#statisticsTaskByWorkflow) | **GET** /statistics/task_by_workflow | Get statistics about tasks executions, grouped by workflow


<a name="statisticsByDate"></a>
# **statisticsByDate**
> ByDateFacet statisticsByDate(q, fq, dateAttr)

Get statistics about files, grouped by date

**API Key Scope**: statistics / by_date

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String dateAttr = "dateAttr_example"; // String | Type of date to facet on
    try {
      ByDateFacet result = apiInstance.statisticsByDate(q, fq, dateAttr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsByDate");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **dateAttr** | **String**| Type of date to facet on | [optional] [enum: file_change_dt, file_modification_dt, file_access_dt]

### Return type

[**ByDateFacet**](ByDateFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsByFileExtension"></a>
# **statisticsByFileExtension**
> ByFileExtensionFacet statisticsByFileExtension(q, fq, dateAttr, sort, limit)

Get statistics about files, grouped by file extension

**API Key Scope**: statistics / by_file_extension

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String dateAttr = "dateAttr_example"; // String | Type of date to facet on
    String sort = "count"; // String | Sort results of facet
    Integer limit = 10; // Integer | Limit results of facet
    try {
      ByFileExtensionFacet result = apiInstance.statisticsByFileExtension(q, fq, dateAttr, sort, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsByFileExtension");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **dateAttr** | **String**| Type of date to facet on | [optional] [enum: file_change_dt, file_modification_dt, file_access_dt]
 **sort** | **String**| Sort results of facet | [optional] [default to count] [enum: count, files_count, file_size_sum, cost]
 **limit** | **Integer**| Limit results of facet | [optional] [default to 10]

### Return type

[**ByFileExtensionFacet**](ByFileExtensionFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsByGroupOwner"></a>
# **statisticsByGroupOwner**
> ByGroupOwnerFacet statisticsByGroupOwner(q, fq, dateAttr, sort, limit)

Get statistics about files, grouped by owner (group)

**API Key Scope**: statistics / by_group_owner

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String dateAttr = "dateAttr_example"; // String | Type of date to facet on
    String sort = "count"; // String | Sort results of facet
    Integer limit = 10; // Integer | Limit results of facet
    try {
      ByGroupOwnerFacet result = apiInstance.statisticsByGroupOwner(q, fq, dateAttr, sort, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsByGroupOwner");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **dateAttr** | **String**| Type of date to facet on | [optional] [enum: file_change_dt, file_modification_dt, file_access_dt]
 **sort** | **String**| Sort results of facet | [optional] [default to count] [enum: count, files_count, file_size_sum, cost]
 **limit** | **Integer**| Limit results of facet | [optional] [default to 10]

### Return type

[**ByGroupOwnerFacet**](ByGroupOwnerFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsByMetadata"></a>
# **statisticsByMetadata**
> ByMetadataFacet statisticsByMetadata(q, fq, dateAttr, sort, limit)

Get statistics about files, grouped by metadata

**API Key Scope**: statistics / by_metadata

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String dateAttr = "dateAttr_example"; // String | Type of date to facet on
    String sort = "count"; // String | Sort results of facet
    Integer limit = 10; // Integer | Limit results of facet
    try {
      ByMetadataFacet result = apiInstance.statisticsByMetadata(q, fq, dateAttr, sort, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsByMetadata");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **dateAttr** | **String**| Type of date to facet on | [optional] [enum: file_change_dt, file_modification_dt, file_access_dt]
 **sort** | **String**| Sort results of facet | [optional] [default to count] [enum: count, files_count, file_size_sum, cost]
 **limit** | **Integer**| Limit results of facet | [optional] [default to 10]

### Return type

[**ByMetadataFacet**](ByMetadataFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsByPrimaryCloud"></a>
# **statisticsByPrimaryCloud**
> ByPrimaryCloudFacet statisticsByPrimaryCloud(q, fq, dateAttr, sort, limit)

Get statistics about files, grouped by primary Cloud

**API Key Scope**: statistics / by_primary_cloud

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String dateAttr = "dateAttr_example"; // String | Type of date to facet on
    String sort = "count"; // String | Sort results of facet
    Integer limit = 10; // Integer | Limit results of facet
    try {
      ByPrimaryCloudFacet result = apiInstance.statisticsByPrimaryCloud(q, fq, dateAttr, sort, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsByPrimaryCloud");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **dateAttr** | **String**| Type of date to facet on | [optional] [enum: file_change_dt, file_modification_dt, file_access_dt]
 **sort** | **String**| Sort results of facet | [optional] [default to count] [enum: count, files_count, file_size_sum, cost]
 **limit** | **Integer**| Limit results of facet | [optional] [default to 10]

### Return type

[**ByPrimaryCloudFacet**](ByPrimaryCloudFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsByPrimaryName"></a>
# **statisticsByPrimaryName**
> ByPrimaryFacet statisticsByPrimaryName(q, fq, dateAttr, sort, limit)

Get statistics about files, grouped by primary storages

**API Key Scope**: statistics / by_primary_name

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String dateAttr = "dateAttr_example"; // String | Type of date to facet on
    String sort = "count"; // String | Sort results of facet
    Integer limit = 10; // Integer | Limit results of facet
    try {
      ByPrimaryFacet result = apiInstance.statisticsByPrimaryName(q, fq, dateAttr, sort, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsByPrimaryName");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **dateAttr** | **String**| Type of date to facet on | [optional] [enum: file_change_dt, file_modification_dt, file_access_dt]
 **sort** | **String**| Sort results of facet | [optional] [default to count] [enum: count, files_count, file_size_sum, cost]
 **limit** | **Integer**| Limit results of facet | [optional] [default to 10]

### Return type

[**ByPrimaryFacet**](ByPrimaryFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsByPrimaryNas"></a>
# **statisticsByPrimaryNas**
> ByPrimaryNasFacet statisticsByPrimaryNas(q, fq, dateAttr, sort, limit)

Get statistics about files, grouped by primary NAS

**API Key Scope**: statistics / by_primary_nas

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String dateAttr = "dateAttr_example"; // String | Type of date to facet on
    String sort = "count"; // String | Sort results of facet
    Integer limit = 10; // Integer | Limit results of facet
    try {
      ByPrimaryNasFacet result = apiInstance.statisticsByPrimaryNas(q, fq, dateAttr, sort, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsByPrimaryNas");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **dateAttr** | **String**| Type of date to facet on | [optional] [enum: file_change_dt, file_modification_dt, file_access_dt]
 **sort** | **String**| Sort results of facet | [optional] [default to count] [enum: count, files_count, file_size_sum, cost]
 **limit** | **Integer**| Limit results of facet | [optional] [default to 10]

### Return type

[**ByPrimaryNasFacet**](ByPrimaryNasFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsByPrimaryStorage"></a>
# **statisticsByPrimaryStorage**
> ByPrimaryStorageFacet statisticsByPrimaryStorage(q, fq, dateAttr, sort, limit)

Get statistics about files, grouped by primary storage

**API Key Scope**: statistics / by_primary_storage

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String dateAttr = "dateAttr_example"; // String | Type of date to facet on
    String sort = "count"; // String | Sort results of facet
    Integer limit = 10; // Integer | Limit results of facet
    try {
      ByPrimaryStorageFacet result = apiInstance.statisticsByPrimaryStorage(q, fq, dateAttr, sort, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsByPrimaryStorage");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **dateAttr** | **String**| Type of date to facet on | [optional] [enum: file_change_dt, file_modification_dt, file_access_dt]
 **sort** | **String**| Sort results of facet | [optional] [default to count] [enum: count, files_count, file_size_sum, cost]
 **limit** | **Integer**| Limit results of facet | [optional] [default to 10]

### Return type

[**ByPrimaryStorageFacet**](ByPrimaryStorageFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsBySecondaryCloud"></a>
# **statisticsBySecondaryCloud**
> BySecondaryCloudFacet statisticsBySecondaryCloud(q, fq, dateAttr, sort, limit)

Get statistics about files, grouped by secondary Cloud

**API Key Scope**: statistics / by_secondary_cloud

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String dateAttr = "dateAttr_example"; // String | Type of date to facet on
    String sort = "count"; // String | Sort results of facet
    Integer limit = 10; // Integer | Limit results of facet
    try {
      BySecondaryCloudFacet result = apiInstance.statisticsBySecondaryCloud(q, fq, dateAttr, sort, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsBySecondaryCloud");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **dateAttr** | **String**| Type of date to facet on | [optional] [enum: file_change_dt, file_modification_dt, file_access_dt]
 **sort** | **String**| Sort results of facet | [optional] [default to count] [enum: count, files_count, file_size_sum, cost]
 **limit** | **Integer**| Limit results of facet | [optional] [default to 10]

### Return type

[**BySecondaryCloudFacet**](BySecondaryCloudFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsBySecondaryNas"></a>
# **statisticsBySecondaryNas**
> BySecondaryNasFacet statisticsBySecondaryNas(q, fq, dateAttr, sort, limit)

Get statistics about files, grouped by secondary NAS

**API Key Scope**: statistics / by_secondary_nas

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String dateAttr = "dateAttr_example"; // String | Type of date to facet on
    String sort = "count"; // String | Sort results of facet
    Integer limit = 10; // Integer | Limit results of facet
    try {
      BySecondaryNasFacet result = apiInstance.statisticsBySecondaryNas(q, fq, dateAttr, sort, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsBySecondaryNas");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **dateAttr** | **String**| Type of date to facet on | [optional] [enum: file_change_dt, file_modification_dt, file_access_dt]
 **sort** | **String**| Sort results of facet | [optional] [default to count] [enum: count, files_count, file_size_sum, cost]
 **limit** | **Integer**| Limit results of facet | [optional] [default to 10]

### Return type

[**BySecondaryNasFacet**](BySecondaryNasFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsBySecondaryStorage"></a>
# **statisticsBySecondaryStorage**
> BySecondaryStorageFacet statisticsBySecondaryStorage(q, fq, dateAttr, sort, limit)

Get statistics about files, grouped by secondary storage

**API Key Scope**: statistics / by_secondary_storage

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String dateAttr = "dateAttr_example"; // String | Type of date to facet on
    String sort = "count"; // String | Sort results of facet
    Integer limit = 10; // Integer | Limit results of facet
    try {
      BySecondaryStorageFacet result = apiInstance.statisticsBySecondaryStorage(q, fq, dateAttr, sort, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsBySecondaryStorage");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **dateAttr** | **String**| Type of date to facet on | [optional] [enum: file_change_dt, file_modification_dt, file_access_dt]
 **sort** | **String**| Sort results of facet | [optional] [default to count] [enum: count, files_count, file_size_sum, cost]
 **limit** | **Integer**| Limit results of facet | [optional] [default to 10]

### Return type

[**BySecondaryStorageFacet**](BySecondaryStorageFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsBySecondaryTape"></a>
# **statisticsBySecondaryTape**
> BySecondaryTapeFacet statisticsBySecondaryTape(q, fq, dateAttr, sort, limit)

Get statistics about files, grouped by secondary Tape

**API Key Scope**: statistics / by_secondary_tape

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String dateAttr = "dateAttr_example"; // String | Type of date to facet on
    String sort = "count"; // String | Sort results of facet
    Integer limit = 10; // Integer | Limit results of facet
    try {
      BySecondaryTapeFacet result = apiInstance.statisticsBySecondaryTape(q, fq, dateAttr, sort, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsBySecondaryTape");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **dateAttr** | **String**| Type of date to facet on | [optional] [enum: file_change_dt, file_modification_dt, file_access_dt]
 **sort** | **String**| Sort results of facet | [optional] [default to count] [enum: count, files_count, file_size_sum, cost]
 **limit** | **Integer**| Limit results of facet | [optional] [default to 10]

### Return type

[**BySecondaryTapeFacet**](BySecondaryTapeFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsBySize"></a>
# **statisticsBySize**
> BySizeFacet statisticsBySize(q, fq, dateAttr)

Get statistics about files, grouped by size

**API Key Scope**: statistics / by_size

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String dateAttr = "dateAttr_example"; // String | Type of date to facet on
    try {
      BySizeFacet result = apiInstance.statisticsBySize(q, fq, dateAttr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsBySize");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **dateAttr** | **String**| Type of date to facet on | [optional] [enum: file_change_dt, file_modification_dt, file_access_dt]

### Return type

[**BySizeFacet**](BySizeFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsByUserOwner"></a>
# **statisticsByUserOwner**
> ByUserOwnerFacet statisticsByUserOwner(q, fq, dateAttr, sort, limit)

Get statistics about files, grouped by owner (user)

**API Key Scope**: statistics / by_user_owner

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String dateAttr = "dateAttr_example"; // String | Type of date to facet on
    String sort = "count"; // String | Sort results of facet
    Integer limit = 10; // Integer | Limit results of facet
    try {
      ByUserOwnerFacet result = apiInstance.statisticsByUserOwner(q, fq, dateAttr, sort, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsByUserOwner");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **dateAttr** | **String**| Type of date to facet on | [optional] [enum: file_change_dt, file_modification_dt, file_access_dt]
 **sort** | **String**| Sort results of facet | [optional] [default to count] [enum: count, files_count, file_size_sum, cost]
 **limit** | **Integer**| Limit results of facet | [optional] [default to 10]

### Return type

[**ByUserOwnerFacet**](ByUserOwnerFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsStorage"></a>
# **statisticsStorage**
> StorageFacet statisticsStorage(q, fq)

Get statistics about storages, grouped by types

**API Key Scope**: statistics / storages

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    try {
      StorageFacet result = apiInstance.statisticsStorage(q, fq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsStorage");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]

### Return type

[**StorageFacet**](StorageFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsTaskByMetadata"></a>
# **statisticsTaskByMetadata**
> ByTaskMetadataFacet statisticsTaskByMetadata(q, fq, sort, limit)

Get statistics about tasks executions, grouped by metadata

**API Key Scope**: statistics / task_by_metadata

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    String sort = "count"; // String | Sort results of facet on task
    Integer limit = 10; // Integer | Limit results of facet
    try {
      ByTaskMetadataFacet result = apiInstance.statisticsTaskByMetadata(q, fq, sort, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsTaskByMetadata");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]
 **sort** | **String**| Sort results of facet on task | [optional] [default to count] [enum: count, tasks_count, to_process_size_sum, processed_size_sum, to_process_files_sum, processed_files_sum, finalized_files_sum, bandwidth_avg, bandwidth_count]
 **limit** | **Integer**| Limit results of facet | [optional] [default to 10]

### Return type

[**ByTaskMetadataFacet**](ByTaskMetadataFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsTaskByStatus"></a>
# **statisticsTaskByStatus**
> ByTaskStatusFacet statisticsTaskByStatus(q, fq)

Get statistics about tasks executions, grouped by status

**API Key Scope**: statistics / task_by_status

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    try {
      ByTaskStatusFacet result = apiInstance.statisticsTaskByStatus(q, fq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsTaskByStatus");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]

### Return type

[**ByTaskStatusFacet**](ByTaskStatusFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsTaskByStorage"></a>
# **statisticsTaskByStorage**
> ByTaskStorageFacet statisticsTaskByStorage(q, fq)

Get statistics about tasks executions, grouped by source and destination

**API Key Scope**: statistics / task_by_storage

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    try {
      ByTaskStorageFacet result = apiInstance.statisticsTaskByStorage(q, fq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsTaskByStorage");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]

### Return type

[**ByTaskStorageFacet**](ByTaskStorageFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="statisticsTaskByWorkflow"></a>
# **statisticsTaskByWorkflow**
> ByTaskWorkflowFacet statisticsTaskByWorkflow(q, fq)

Get statistics about tasks executions, grouped by workflow

**API Key Scope**: statistics / task_by_workflow

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.StatisticsApi;

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

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String q = "q_example"; // String | Solr query
    List<String> fq = Arrays.asList(); // List<String> | Solr filter query  Multiple query can be separated by `|`.
    try {
      ByTaskWorkflowFacet result = apiInstance.statisticsTaskByWorkflow(q, fq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsTaskByWorkflow");
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
 **q** | **String**| Solr query | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| Solr filter query  Multiple query can be separated by &#x60;|&#x60;. | [optional]

### Return type

[**ByTaskWorkflowFacet**](ByTaskWorkflowFacet.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

