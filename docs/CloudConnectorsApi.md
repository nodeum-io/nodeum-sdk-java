# CloudConnectorsApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCloudConnector**](CloudConnectorsApi.md#createCloudConnector) | **POST** /cloud_connectors | Creates a new cloud connector.
[**destroyCloudConnector**](CloudConnectorsApi.md#destroyCloudConnector) | **DELETE** /cloud_connectors/{cloud_connector_id} | Destroys a specific cloud connector.
[**indexCloudConnectors**](CloudConnectorsApi.md#indexCloudConnectors) | **GET** /cloud_connectors | Lists all cloud connectors.
[**showCloudConnector**](CloudConnectorsApi.md#showCloudConnector) | **GET** /cloud_connectors/{cloud_connector_id} | Displays a specific cloud connector.
[**testCloudConnector**](CloudConnectorsApi.md#testCloudConnector) | **PUT** /cloud_connectors/-/test | Test an unsaved cloud connector.
[**testResultCloudConnector**](CloudConnectorsApi.md#testResultCloudConnector) | **GET** /cloud_connectors/-/test | Check result of cloud connector test job.
[**updateCloudConnector**](CloudConnectorsApi.md#updateCloudConnector) | **PUT** /cloud_connectors/{cloud_connector_id} | Updates a specific cloud connector.


<a name="createCloudConnector"></a>
# **createCloudConnector**
> CloudConnector createCloudConnector(cloudConnectorBody)

Creates a new cloud connector.

**API Key Scope**: cloud_connectors / create

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.CloudConnectorsApi;

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

    CloudConnectorsApi apiInstance = new CloudConnectorsApi(defaultClient);
    CloudConnector cloudConnectorBody = new CloudConnector(); // CloudConnector | 
    try {
      CloudConnector result = apiInstance.createCloudConnector(cloudConnectorBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudConnectorsApi#createCloudConnector");
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
 **cloudConnectorBody** | [**CloudConnector**](CloudConnector.md)|  |

### Return type

[**CloudConnector**](CloudConnector.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A specific cloud connector. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

<a name="destroyCloudConnector"></a>
# **destroyCloudConnector**
> destroyCloudConnector(cloudConnectorId)

Destroys a specific cloud connector.

**API Key Scope**: cloud_connectors / destroy

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.CloudConnectorsApi;

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

    CloudConnectorsApi apiInstance = new CloudConnectorsApi(defaultClient);
    String cloudConnectorId = "cloudConnectorId_example"; // String | Numeric ID or name of cloud connector.
    try {
      apiInstance.destroyCloudConnector(cloudConnectorId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudConnectorsApi#destroyCloudConnector");
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

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Cloud connector destroyed. |  -  |

<a name="indexCloudConnectors"></a>
# **indexCloudConnectors**
> CloudConnectorCollection indexCloudConnectors(limit, offset, sortBy, id, name, url, urlProxy, provider, region, accessKey)

Lists all cloud connectors.

**API Key Scope**: cloud_connectors / index   Optional API Key Explicit Scope: cloud_connectors / get_secret_key

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.CloudConnectorsApi;

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

    CloudConnectorsApi apiInstance = new CloudConnectorsApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String name = "name_example"; // String | Filter on name
    String url = "url_example"; // String | Filter on url
    String urlProxy = "urlProxy_example"; // String | Filter on url proxy
    String provider = "provider_example"; // String | Filter on provider
    String region = "region_example"; // String | Filter on region
    String accessKey = "accessKey_example"; // String | Filter on access key
    try {
      CloudConnectorCollection result = apiInstance.indexCloudConnectors(limit, offset, sortBy, id, name, url, urlProxy, provider, region, accessKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudConnectorsApi#indexCloudConnectors");
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
 **url** | **String**| Filter on url | [optional]
 **urlProxy** | **String**| Filter on url proxy | [optional]
 **provider** | **String**| Filter on provider | [optional]
 **region** | **String**| Filter on region | [optional]
 **accessKey** | **String**| Filter on access key | [optional]

### Return type

[**CloudConnectorCollection**](CloudConnectorCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of cloud connectors. |  -  |

<a name="showCloudConnector"></a>
# **showCloudConnector**
> CloudConnector showCloudConnector(cloudConnectorId)

Displays a specific cloud connector.

**API Key Scope**: cloud_connectors / show   Optional API Key Explicit Scope: cloud_connectors / get_secret_key

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.CloudConnectorsApi;

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

    CloudConnectorsApi apiInstance = new CloudConnectorsApi(defaultClient);
    String cloudConnectorId = "cloudConnectorId_example"; // String | Numeric ID or name of cloud connector.
    try {
      CloudConnector result = apiInstance.showCloudConnector(cloudConnectorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudConnectorsApi#showCloudConnector");
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

[**CloudConnector**](CloudConnector.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific cloud connector. |  -  |

<a name="testCloudConnector"></a>
# **testCloudConnector**
> ActiveJobStatus testCloudConnector(cloudConnectorBody)

Test an unsaved cloud connector.

**API Key Scope**: cloud_connectors / test

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.CloudConnectorsApi;

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

    CloudConnectorsApi apiInstance = new CloudConnectorsApi(defaultClient);
    CloudConnector cloudConnectorBody = new CloudConnector(); // CloudConnector | 
    try {
      ActiveJobStatus result = apiInstance.testCloudConnector(cloudConnectorBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudConnectorsApi#testCloudConnector");
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
 **cloudConnectorBody** | [**CloudConnector**](CloudConnector.md)|  |

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

<a name="testResultCloudConnector"></a>
# **testResultCloudConnector**
> CloudBucketSimpleCollection testResultCloudConnector(jobId)

Check result of cloud connector test job.

**API Key Scope**: cloud_connectors / test

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.CloudConnectorsApi;

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

    CloudConnectorsApi apiInstance = new CloudConnectorsApi(defaultClient);
    String jobId = "jobId_example"; // String | ID of active job
    try {
      CloudBucketSimpleCollection result = apiInstance.testResultCloudConnector(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudConnectorsApi#testResultCloudConnector");
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
 **jobId** | **String**| ID of active job | [optional]

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

<a name="updateCloudConnector"></a>
# **updateCloudConnector**
> CloudConnector updateCloudConnector(cloudConnectorId, cloudConnectorBody)

Updates a specific cloud connector.

**API Key Scope**: cloud_connectors / update

### Example
```java
// Import classes:
import io.nodeum.client.ApiClient;
import io.nodeum.client.ApiException;
import io.nodeum.client.Configuration;
import io.nodeum.client.auth.*;
import io.nodeum.client.models.*;
import io.nodeum.client.api.CloudConnectorsApi;

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

    CloudConnectorsApi apiInstance = new CloudConnectorsApi(defaultClient);
    String cloudConnectorId = "cloudConnectorId_example"; // String | Numeric ID or name of cloud connector.
    CloudConnector cloudConnectorBody = new CloudConnector(); // CloudConnector | 
    try {
      CloudConnector result = apiInstance.updateCloudConnector(cloudConnectorId, cloudConnectorBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudConnectorsApi#updateCloudConnector");
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
 **cloudConnectorBody** | [**CloudConnector**](CloudConnector.md)|  |

### Return type

[**CloudConnector**](CloudConnector.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific cloud connector. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

