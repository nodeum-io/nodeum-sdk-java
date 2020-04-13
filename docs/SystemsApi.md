# SystemsApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadResetVars**](SystemsApi.md#downloadResetVars) | **POST** /systems/reset/generate_vars | Creates a YAML file with selected tables and downloads it
[**resultDownloadTraces**](SystemsApi.md#resultDownloadTraces) | **GET** /systems/download_traces | Check result of a download traces job.
[**triggerDownloadTraces**](SystemsApi.md#triggerDownloadTraces) | **PUT** /systems/download_traces | Trigger a download traces request.


<a name="downloadResetVars"></a>
# **downloadResetVars**
> File downloadResetVars(resetForm)

Creates a YAML file with selected tables and downloads it

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.SystemsApi;

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

    SystemsApi apiInstance = new SystemsApi(defaultClient);
    Reset resetForm = new Reset(); // Reset | 
    try {
      File result = apiInstance.downloadResetVars(resetForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemsApi#downloadResetVars");
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
 **resetForm** | [**Reset**](Reset.md)|  |

### Return type

[**File**](File.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The var file created |  -  |

<a name="resultDownloadTraces"></a>
# **resultDownloadTraces**
> File resultDownloadTraces(jobId)

Check result of a download traces job.

**API Key Scope**: systems / download_traces

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.SystemsApi;

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

    SystemsApi apiInstance = new SystemsApi(defaultClient);
    String jobId = "jobId_example"; // String | ID of active job
    try {
      File result = apiInstance.resultDownloadTraces(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemsApi#resultDownloadTraces");
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
 **jobId** | **String**| ID of active job |

### Return type

[**File**](File.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/tar+gzip, queued, working, failed, 

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A completed job for downloading traces. |  -  |
**202** | An active job that may be queued, working, completed or failed. |  -  |

<a name="triggerDownloadTraces"></a>
# **triggerDownloadTraces**
> ActiveJobStatus triggerDownloadTraces(type)

Trigger a download traces request.

**API Key Scope**: systems / download_traces

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.SystemsApi;

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

    SystemsApi apiInstance = new SystemsApi(defaultClient);
    String type = "type_example"; // String | Type of traces to download
    try {
      ActiveJobStatus result = apiInstance.triggerDownloadTraces(type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemsApi#triggerDownloadTraces");
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
 **type** | **String**| Type of traces to download | [enum: interface, core, data_mining, fuse, library_manager, manager, watchdog, system, all]

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

