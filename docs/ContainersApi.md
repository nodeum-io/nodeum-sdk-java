# ContainersApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContainer**](ContainersApi.md#createContainer) | **POST** /containers | Creates a new container.
[**createContainerPrivilege**](ContainersApi.md#createContainerPrivilege) | **POST** /containers/{container_id}/container_privileges | Creates a new privilege on the container.
[**destroyContainer**](ContainersApi.md#destroyContainer) | **DELETE** /containers/{container_id} | Destroys a specific container.
[**destroyContainerPrivilege**](ContainersApi.md#destroyContainerPrivilege) | **DELETE** /containers/{container_id}/container_privileges/{container_privilege_id} | Destroys a specific privilege.
[**indexContainerPrivileges**](ContainersApi.md#indexContainerPrivileges) | **GET** /containers/{container_id}/container_privileges | Lists all privilege on the container.
[**indexContainers**](ContainersApi.md#indexContainers) | **GET** /containers | Lists all containers.
[**showContainer**](ContainersApi.md#showContainer) | **GET** /containers/{container_id} | Displays a specific container.
[**showContainerPrivilege**](ContainersApi.md#showContainerPrivilege) | **GET** /containers/{container_id}/container_privileges/{container_privilege_id} | Displays a specific privilege.
[**updateContainer**](ContainersApi.md#updateContainer) | **PUT** /containers/{container_id} | Updates a specific container.
[**updateContainerPrivilege**](ContainersApi.md#updateContainerPrivilege) | **PUT** /containers/{container_id}/container_privileges/{container_privilege_id} | Updates a specific privilege.


<a name="createContainer"></a>
# **createContainer**
> Container createContainer(containerBody)

Creates a new container.

It **does not** yet create the file structure and configure the samba connection. Use API v1 instead.  **API Key Scope**: containers / create

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.ContainersApi;

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

    ContainersApi apiInstance = new ContainersApi(defaultClient);
    Container containerBody = new Container(); // Container | 
    try {
      Container result = apiInstance.createContainer(containerBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersApi#createContainer");
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
 **containerBody** | [**Container**](Container.md)|  |

### Return type

[**Container**](Container.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A specific container. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

<a name="createContainerPrivilege"></a>
# **createContainerPrivilege**
> ContainerPrivilege createContainerPrivilege(containerId, containerPrivilegeBody)

Creates a new privilege on the container.

**API Key Scope**: container_privileges / create

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.ContainersApi;

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

    ContainersApi apiInstance = new ContainersApi(defaultClient);
    String containerId = "containerId_example"; // String | Numeric ID or name of container.
    ContainerPrivilege containerPrivilegeBody = new ContainerPrivilege(); // ContainerPrivilege | 
    try {
      ContainerPrivilege result = apiInstance.createContainerPrivilege(containerId, containerPrivilegeBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersApi#createContainerPrivilege");
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
 **containerId** | **String**| Numeric ID or name of container. |
 **containerPrivilegeBody** | [**ContainerPrivilege**](ContainerPrivilege.md)|  |

### Return type

[**ContainerPrivilege**](ContainerPrivilege.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A specific container privilege. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

<a name="destroyContainer"></a>
# **destroyContainer**
> destroyContainer(containerId)

Destroys a specific container.

**API Key Scope**: containers / destroy

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.ContainersApi;

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

    ContainersApi apiInstance = new ContainersApi(defaultClient);
    String containerId = "containerId_example"; // String | Numeric ID or name of container.
    try {
      apiInstance.destroyContainer(containerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersApi#destroyContainer");
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
 **containerId** | **String**| Numeric ID or name of container. |

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
**204** | Container destroyed. |  -  |

<a name="destroyContainerPrivilege"></a>
# **destroyContainerPrivilege**
> destroyContainerPrivilege(containerId, containerPrivilegeId)

Destroys a specific privilege.

**API Key Scope**: container_privileges / destroy

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.ContainersApi;

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

    ContainersApi apiInstance = new ContainersApi(defaultClient);
    String containerId = "containerId_example"; // String | Numeric ID or name of container.
    Integer containerPrivilegeId = 56; // Integer | Numeric ID of container privilege.
    try {
      apiInstance.destroyContainerPrivilege(containerId, containerPrivilegeId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersApi#destroyContainerPrivilege");
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
 **containerId** | **String**| Numeric ID or name of container. |
 **containerPrivilegeId** | **Integer**| Numeric ID of container privilege. |

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
**204** | Container privilege destroyed. |  -  |

<a name="indexContainerPrivileges"></a>
# **indexContainerPrivileges**
> ContainerPrivilegeCollection indexContainerPrivileges(containerId, limit, offset, sortBy, id, name, privilege, type)

Lists all privilege on the container.

**API Key Scope**: container_privileges / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.ContainersApi;

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

    ContainersApi apiInstance = new ContainersApi(defaultClient);
    String containerId = "containerId_example"; // String | Numeric ID or name of container.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String name = "name_example"; // String | Filter on name
    String privilege = "privilege_example"; // String | Filter on privilege
    String type = "type_example"; // String | Filter on type
    try {
      ContainerPrivilegeCollection result = apiInstance.indexContainerPrivileges(containerId, limit, offset, sortBy, id, name, privilege, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersApi#indexContainerPrivileges");
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
 **containerId** | **String**| Numeric ID or name of container. |
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. | [optional]
 **id** | **String**| Filter on id | [optional]
 **name** | **String**| Filter on name | [optional]
 **privilege** | **String**| Filter on privilege | [optional]
 **type** | **String**| Filter on type | [optional]

### Return type

[**ContainerPrivilegeCollection**](ContainerPrivilegeCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of container privileges. |  -  |

<a name="indexContainers"></a>
# **indexContainers**
> ContainerCollection indexContainers(limit, offset, sortBy, id, name, comment, quotaTotalSize, quotaOnCache, statTotalFiles, statTotalSize, statSizeOnCache, guestRight, lastUpdate)

Lists all containers.

**API Key Scope**: containers / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.ContainersApi;

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

    ContainersApi apiInstance = new ContainersApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String name = "name_example"; // String | Filter on name
    String comment = "comment_example"; // String | Filter on comment
    String quotaTotalSize = "quotaTotalSize_example"; // String | Filter on quota total size
    String quotaOnCache = "quotaOnCache_example"; // String | Filter on quota on cache
    String statTotalFiles = "statTotalFiles_example"; // String | Filter on stat total files
    String statTotalSize = "statTotalSize_example"; // String | Filter on stat total size
    String statSizeOnCache = "statSizeOnCache_example"; // String | Filter on stat size on cache
    String guestRight = "guestRight_example"; // String | Filter on guest right
    String lastUpdate = "lastUpdate_example"; // String | Filter on last update
    try {
      ContainerCollection result = apiInstance.indexContainers(limit, offset, sortBy, id, name, comment, quotaTotalSize, quotaOnCache, statTotalFiles, statTotalSize, statSizeOnCache, guestRight, lastUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersApi#indexContainers");
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
 **comment** | **String**| Filter on comment | [optional]
 **quotaTotalSize** | **String**| Filter on quota total size | [optional]
 **quotaOnCache** | **String**| Filter on quota on cache | [optional]
 **statTotalFiles** | **String**| Filter on stat total files | [optional]
 **statTotalSize** | **String**| Filter on stat total size | [optional]
 **statSizeOnCache** | **String**| Filter on stat size on cache | [optional]
 **guestRight** | **String**| Filter on guest right | [optional]
 **lastUpdate** | **String**| Filter on last update | [optional]

### Return type

[**ContainerCollection**](ContainerCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of containers. |  -  |

<a name="showContainer"></a>
# **showContainer**
> Container showContainer(containerId)

Displays a specific container.

**API Key Scope**: containers / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.ContainersApi;

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

    ContainersApi apiInstance = new ContainersApi(defaultClient);
    String containerId = "containerId_example"; // String | Numeric ID or name of container.
    try {
      Container result = apiInstance.showContainer(containerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersApi#showContainer");
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
 **containerId** | **String**| Numeric ID or name of container. |

### Return type

[**Container**](Container.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific container. |  -  |

<a name="showContainerPrivilege"></a>
# **showContainerPrivilege**
> ContainerPrivilege showContainerPrivilege(containerId, containerPrivilegeId)

Displays a specific privilege.

**API Key Scope**: container_privileges / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.ContainersApi;

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

    ContainersApi apiInstance = new ContainersApi(defaultClient);
    String containerId = "containerId_example"; // String | Numeric ID or name of container.
    Integer containerPrivilegeId = 56; // Integer | Numeric ID of container privilege.
    try {
      ContainerPrivilege result = apiInstance.showContainerPrivilege(containerId, containerPrivilegeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersApi#showContainerPrivilege");
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
 **containerId** | **String**| Numeric ID or name of container. |
 **containerPrivilegeId** | **Integer**| Numeric ID of container privilege. |

### Return type

[**ContainerPrivilege**](ContainerPrivilege.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific container privilege. |  -  |

<a name="updateContainer"></a>
# **updateContainer**
> Container updateContainer(containerId, containerBody)

Updates a specific container.

It **does not** yet create the file structure and configure the samba connection. Use API v1 instead.  **API Key Scope**: containers / update

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.ContainersApi;

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

    ContainersApi apiInstance = new ContainersApi(defaultClient);
    String containerId = "containerId_example"; // String | Numeric ID or name of container.
    Container containerBody = new Container(); // Container | 
    try {
      Container result = apiInstance.updateContainer(containerId, containerBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersApi#updateContainer");
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
 **containerId** | **String**| Numeric ID or name of container. |
 **containerBody** | [**Container**](Container.md)|  |

### Return type

[**Container**](Container.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific container. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

<a name="updateContainerPrivilege"></a>
# **updateContainerPrivilege**
> ContainerPrivilege updateContainerPrivilege(containerId, containerPrivilegeId, containerPrivilegeBody)

Updates a specific privilege.

**API Key Scope**: container_privileges / update

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.ContainersApi;

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

    ContainersApi apiInstance = new ContainersApi(defaultClient);
    String containerId = "containerId_example"; // String | Numeric ID or name of container.
    Integer containerPrivilegeId = 56; // Integer | Numeric ID of container privilege.
    ContainerPrivilege containerPrivilegeBody = new ContainerPrivilege(); // ContainerPrivilege | 
    try {
      ContainerPrivilege result = apiInstance.updateContainerPrivilege(containerId, containerPrivilegeId, containerPrivilegeBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersApi#updateContainerPrivilege");
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
 **containerId** | **String**| Numeric ID or name of container. |
 **containerPrivilegeId** | **Integer**| Numeric ID of container privilege. |
 **containerPrivilegeBody** | [**ContainerPrivilege**](ContainerPrivilege.md)|  |

### Return type

[**ContainerPrivilege**](ContainerPrivilege.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific container privilege. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

