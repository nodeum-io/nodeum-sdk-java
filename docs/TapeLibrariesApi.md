# TapeLibrariesApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTapeLibrary**](TapeLibrariesApi.md#createTapeLibrary) | **POST** /tape_libraries | Creates a new tape library.
[**destroyTapeLibrary**](TapeLibrariesApi.md#destroyTapeLibrary) | **DELETE** /tape_libraries/{tape_library_id} | Destroys a specific tape library.
[**indexTapeLibraries**](TapeLibrariesApi.md#indexTapeLibraries) | **GET** /tape_libraries | Lists all tape libraries.
[**indexTapeLibraryDevices**](TapeLibrariesApi.md#indexTapeLibraryDevices) | **GET** /tape_libraries/-/devices | Lists tape libraries devices.
[**showTapeLibrary**](TapeLibrariesApi.md#showTapeLibrary) | **GET** /tape_libraries/{tape_library_id} | Displays a specific tape library.
[**updateTapeLibrary**](TapeLibrariesApi.md#updateTapeLibrary) | **PUT** /tape_libraries/{tape_library_id} | Updates a specific tape library.


<a name="createTapeLibrary"></a>
# **createTapeLibrary**
> TapeLibrary createTapeLibrary(tapeLibraryBody)

Creates a new tape library.

**API Key Scope**: tape_libraries / create

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapeLibrariesApi;

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

    TapeLibrariesApi apiInstance = new TapeLibrariesApi(defaultClient);
    TapeLibrary tapeLibraryBody = new TapeLibrary(); // TapeLibrary | 
    try {
      TapeLibrary result = apiInstance.createTapeLibrary(tapeLibraryBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapeLibrariesApi#createTapeLibrary");
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
 **tapeLibraryBody** | [**TapeLibrary**](TapeLibrary.md)|  |

### Return type

[**TapeLibrary**](TapeLibrary.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A specific tape library. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

<a name="destroyTapeLibrary"></a>
# **destroyTapeLibrary**
> destroyTapeLibrary(tapeLibraryId)

Destroys a specific tape library.

**API Key Scope**: tape_libraries / destroy

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapeLibrariesApi;

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

    TapeLibrariesApi apiInstance = new TapeLibrariesApi(defaultClient);
    String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
    try {
      apiInstance.destroyTapeLibrary(tapeLibraryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapeLibrariesApi#destroyTapeLibrary");
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
 **tapeLibraryId** | **String**| Numeric ID, serial, or name of tape library. |

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
**204** | Tape library destroyed. |  -  |

<a name="indexTapeLibraries"></a>
# **indexTapeLibraries**
> TapeLibraryCollection indexTapeLibraries(limit, offset, sortBy, id, name, serial, comment, protocol, vendor, product, firmware, device, libso, acs, status, storageSlots, storageSlotsAddress, ioSlots, ioSlotsAddress, price)

Lists all tape libraries.

**API Key Scope**: tape_libraries / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapeLibrariesApi;

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

    TapeLibrariesApi apiInstance = new TapeLibrariesApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String name = "name_example"; // String | Filter on name
    String serial = "serial_example"; // String | Filter on serial
    String comment = "comment_example"; // String | Filter on comment
    String protocol = "protocol_example"; // String | Filter on protocol
    String vendor = "vendor_example"; // String | Filter on vendor
    String product = "product_example"; // String | Filter on product
    String firmware = "firmware_example"; // String | Filter on firmware
    String device = "device_example"; // String | Filter on device
    String libso = "libso_example"; // String | Filter on libso
    String acs = "acs_example"; // String | Filter on acs
    String status = "status_example"; // String | Filter on status
    String storageSlots = "storageSlots_example"; // String | Filter on storage slots
    String storageSlotsAddress = "storageSlotsAddress_example"; // String | Filter on storage slots address
    String ioSlots = "ioSlots_example"; // String | Filter on io slots
    String ioSlotsAddress = "ioSlotsAddress_example"; // String | Filter on io slots address
    String price = "price_example"; // String | Filter on price
    try {
      TapeLibraryCollection result = apiInstance.indexTapeLibraries(limit, offset, sortBy, id, name, serial, comment, protocol, vendor, product, firmware, device, libso, acs, status, storageSlots, storageSlotsAddress, ioSlots, ioSlotsAddress, price);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapeLibrariesApi#indexTapeLibraries");
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
 **serial** | **String**| Filter on serial | [optional]
 **comment** | **String**| Filter on comment | [optional]
 **protocol** | **String**| Filter on protocol | [optional]
 **vendor** | **String**| Filter on vendor | [optional]
 **product** | **String**| Filter on product | [optional]
 **firmware** | **String**| Filter on firmware | [optional]
 **device** | **String**| Filter on device | [optional]
 **libso** | **String**| Filter on libso | [optional]
 **acs** | **String**| Filter on acs | [optional]
 **status** | **String**| Filter on status | [optional]
 **storageSlots** | **String**| Filter on storage slots | [optional]
 **storageSlotsAddress** | **String**| Filter on storage slots address | [optional]
 **ioSlots** | **String**| Filter on io slots | [optional]
 **ioSlotsAddress** | **String**| Filter on io slots address | [optional]
 **price** | **String**| Filter on price | [optional]

### Return type

[**TapeLibraryCollection**](TapeLibraryCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of tape libraries. |  -  |

<a name="indexTapeLibraryDevices"></a>
# **indexTapeLibraryDevices**
> TapeLibraryDeviceCollection indexTapeLibraryDevices(jobId)

Lists tape libraries devices.

**API Key Scope**: tape_libraries / devices

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapeLibrariesApi;

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

    TapeLibrariesApi apiInstance = new TapeLibrariesApi(defaultClient);
    String jobId = "jobId_example"; // String | ID of active job
    try {
      TapeLibraryDeviceCollection result = apiInstance.indexTapeLibraryDevices(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapeLibrariesApi#indexTapeLibraryDevices");
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

[**TapeLibraryDeviceCollection**](TapeLibraryDeviceCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, queued, working, failed, 

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of tape libraries devices. |  -  |
**202** | An active job that may be queued, working, completed or failed. |  -  |
**500** | An active job that may be queued, working, completed or failed. |  -  |

<a name="showTapeLibrary"></a>
# **showTapeLibrary**
> TapeLibrary showTapeLibrary(tapeLibraryId)

Displays a specific tape library.

**API Key Scope**: tape_libraries / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapeLibrariesApi;

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

    TapeLibrariesApi apiInstance = new TapeLibrariesApi(defaultClient);
    String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
    try {
      TapeLibrary result = apiInstance.showTapeLibrary(tapeLibraryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapeLibrariesApi#showTapeLibrary");
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
 **tapeLibraryId** | **String**| Numeric ID, serial, or name of tape library. |

### Return type

[**TapeLibrary**](TapeLibrary.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific tape library. |  -  |

<a name="updateTapeLibrary"></a>
# **updateTapeLibrary**
> TapeLibrary updateTapeLibrary(tapeLibraryId, tapeLibraryBody)

Updates a specific tape library.

**API Key Scope**: tape_libraries / update

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapeLibrariesApi;

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

    TapeLibrariesApi apiInstance = new TapeLibrariesApi(defaultClient);
    String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
    TapeLibrary tapeLibraryBody = new TapeLibrary(); // TapeLibrary | 
    try {
      TapeLibrary result = apiInstance.updateTapeLibrary(tapeLibraryId, tapeLibraryBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapeLibrariesApi#updateTapeLibrary");
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
 **tapeLibraryId** | **String**| Numeric ID, serial, or name of tape library. |
 **tapeLibraryBody** | [**TapeLibrary**](TapeLibrary.md)|  |

### Return type

[**TapeLibrary**](TapeLibrary.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific tape library. |  -  |
**422** | The received resource was not correctly formatted. |  -  |

