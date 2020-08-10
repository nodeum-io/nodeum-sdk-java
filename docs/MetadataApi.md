# MetadataApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**indexFileMetadataDefinitions**](MetadataApi.md#indexFileMetadataDefinitions) | **GET** /file_metadata_definitions | List file metadata definitions
[**indexTaskMetadataDefinitions**](MetadataApi.md#indexTaskMetadataDefinitions) | **GET** /task_metadata_definitions | List task metadata definitions
[**showFileMetadataDefinition**](MetadataApi.md#showFileMetadataDefinition) | **GET** /file_metadata_definitions/{metadata_definition_id} | Displays a specific task metadata definition.
[**showTaskMetadataDefinition**](MetadataApi.md#showTaskMetadataDefinition) | **GET** /task_metadata_definitions/{metadata_definition_id} | Displays a specific task metadata definition.


<a name="indexFileMetadataDefinitions"></a>
# **indexFileMetadataDefinitions**
> FileMetadataDefinitionCollection indexFileMetadataDefinitions(limit, offset)

List file metadata definitions

**API Key Scope**: file_metadata_definitions / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.MetadataApi;

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

    MetadataApi apiInstance = new MetadataApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    try {
      FileMetadataDefinitionCollection result = apiInstance.indexFileMetadataDefinitions(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#indexFileMetadataDefinitions");
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

[**FileMetadataDefinitionCollection**](FileMetadataDefinitionCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of file metadata |  -  |

<a name="indexTaskMetadataDefinitions"></a>
# **indexTaskMetadataDefinitions**
> TaskMetadataDefinitionCollection indexTaskMetadataDefinitions(limit, offset)

List task metadata definitions

**API Key Scope**: task_metadata_definitions / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.MetadataApi;

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

    MetadataApi apiInstance = new MetadataApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    try {
      TaskMetadataDefinitionCollection result = apiInstance.indexTaskMetadataDefinitions(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#indexTaskMetadataDefinitions");
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

[**TaskMetadataDefinitionCollection**](TaskMetadataDefinitionCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of task metadata |  -  |

<a name="showFileMetadataDefinition"></a>
# **showFileMetadataDefinition**
> FileMetadataDefinition showFileMetadataDefinition(metadataDefinitionId)

Displays a specific task metadata definition.

**API Key Scope**: file_metadata_definitions / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.MetadataApi;

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

    MetadataApi apiInstance = new MetadataApi(defaultClient);
    String metadataDefinitionId = "metadataDefinitionId_example"; // String | Numeric ID or key of a metadata definition
    try {
      FileMetadataDefinition result = apiInstance.showFileMetadataDefinition(metadataDefinitionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#showFileMetadataDefinition");
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
 **metadataDefinitionId** | **String**| Numeric ID or key of a metadata definition |

### Return type

[**FileMetadataDefinition**](FileMetadataDefinition.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific file metadata |  -  |

<a name="showTaskMetadataDefinition"></a>
# **showTaskMetadataDefinition**
> TaskMetadataDefinition showTaskMetadataDefinition(metadataDefinitionId)

Displays a specific task metadata definition.

**API Key Scope**: task_metadata_definitions / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.MetadataApi;

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

    MetadataApi apiInstance = new MetadataApi(defaultClient);
    String metadataDefinitionId = "metadataDefinitionId_example"; // String | Numeric ID or key of a metadata definition
    try {
      TaskMetadataDefinition result = apiInstance.showTaskMetadataDefinition(metadataDefinitionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#showTaskMetadataDefinition");
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
 **metadataDefinitionId** | **String**| Numeric ID or key of a metadata definition |

### Return type

[**TaskMetadataDefinition**](TaskMetadataDefinition.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific task metadata |  -  |

