# TapesApi

All URIs are relative to *http://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**indexTapeStats**](TapesApi.md#indexTapeStats) | **GET** /tape_stats | List all tape statistics.
[**indexTapes**](TapesApi.md#indexTapes) | **GET** /tapes | Lists all tapes.
[**indexTapesByPool**](TapesApi.md#indexTapesByPool) | **GET** /pools/{pool_id}/tapes | Lists all tapes.
[**indexTapesByTapeLibrary**](TapesApi.md#indexTapesByTapeLibrary) | **GET** /tape_libraries/{tape_library_id}/tapes | Lists all tapes.
[**mountStatusTape**](TapesApi.md#mountStatusTape) | **GET** /tapes/{tape_id}/mount | Get mount status of Tape.
[**mountStatusTapeByPool**](TapesApi.md#mountStatusTapeByPool) | **GET** /pools/{pool_id}/tapes/{tape_id}/mount | Get mount status of Tape.
[**mountStatusTapeByTapeLibrary**](TapesApi.md#mountStatusTapeByTapeLibrary) | **GET** /tape_libraries/{tape_library_id}/tapes/{tape_id}/mount | Get mount status of Tape.
[**showTape**](TapesApi.md#showTape) | **GET** /tapes/{tape_id} | Displays a specific tape.
[**showTapeByPool**](TapesApi.md#showTapeByPool) | **GET** /pools/{pool_id}/tapes/{tape_id} | Displays a specific tape.
[**showTapeByTapeLibrary**](TapesApi.md#showTapeByTapeLibrary) | **GET** /tape_libraries/{tape_library_id}/tapes/{tape_id} | Displays a specific tape.
[**showTapeStat**](TapesApi.md#showTapeStat) | **GET** /tapes/{tape_id}/tape_stat | Display statistic for a specific tape.
[**showTapeStatByPool**](TapesApi.md#showTapeStatByPool) | **GET** /pools/{pool_id}/tapes/{tape_id}/tape_stat | Display statistic for a specific tape.
[**showTapeStatByTapeLibrary**](TapesApi.md#showTapeStatByTapeLibrary) | **GET** /tape_libraries/{tape_library_id}/tapes/{tape_id}/tape_stat | Display statistic for a specific tape.


<a name="indexTapeStats"></a>
# **indexTapeStats**
> TapeStatCollection indexTapeStats(limit, offset)

List all tape statistics.

**API Key Scope**: tape_stats / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapesApi;

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

    TapesApi apiInstance = new TapesApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    try {
      TapeStatCollection result = apiInstance.indexTapeStats(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapesApi#indexTapeStats");
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

[**TapeStatCollection**](TapeStatCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of tape statistics. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

<a name="indexTapes"></a>
# **indexTapes**
> TapeCollection indexTapes(limit, offset, sortBy, id, tapeLibraryId, poolId, barcode, location, type, locked, scratch, cleaning, writeProtect, mounted, ejected, known, mountCount, dateIn, dateMove, free, max, lastSizeUpdate, lastMaintenance, lastRepack, repackStatus, hash, forceImportType, needToCheck)

Lists all tapes.

**API Key Scope**: tapes / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapesApi;

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

    TapesApi apiInstance = new TapesApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String tapeLibraryId = "tapeLibraryId_example"; // String | Filter on tape library id
    String poolId = "poolId_example"; // String | Filter on a pool id
    String barcode = "barcode_example"; // String | Filter on barcode
    String location = "location_example"; // String | Filter on location
    String type = "type_example"; // String | Filter on type
    String locked = "locked_example"; // String | Filter on locked
    String scratch = "scratch_example"; // String | Filter on scratch
    String cleaning = "cleaning_example"; // String | Filter on cleaning
    String writeProtect = "writeProtect_example"; // String | Filter on write protect
    String mounted = "mounted_example"; // String | Filter on mounted
    String ejected = "ejected_example"; // String | Filter on ejected
    String known = "known_example"; // String | Filter on known
    String mountCount = "mountCount_example"; // String | Filter on mount count
    String dateIn = "dateIn_example"; // String | Filter on date in
    String dateMove = "dateMove_example"; // String | Filter on date move
    String free = "free_example"; // String | Filter on free
    String max = "max_example"; // String | Filter on max
    String lastSizeUpdate = "lastSizeUpdate_example"; // String | Filter on last size update
    String lastMaintenance = "lastMaintenance_example"; // String | Filter on last maintenance
    String lastRepack = "lastRepack_example"; // String | Filter on last repack
    String repackStatus = "repackStatus_example"; // String | Filter on repack status
    String hash = "hash_example"; // String | Filter on hash
    String forceImportType = "forceImportType_example"; // String | Filter on force import type
    String needToCheck = "needToCheck_example"; // String | Filter on need to check
    try {
      TapeCollection result = apiInstance.indexTapes(limit, offset, sortBy, id, tapeLibraryId, poolId, barcode, location, type, locked, scratch, cleaning, writeProtect, mounted, ejected, known, mountCount, dateIn, dateMove, free, max, lastSizeUpdate, lastMaintenance, lastRepack, repackStatus, hash, forceImportType, needToCheck);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapesApi#indexTapes");
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
 **tapeLibraryId** | **String**| Filter on tape library id | [optional]
 **poolId** | **String**| Filter on a pool id | [optional]
 **barcode** | **String**| Filter on barcode | [optional]
 **location** | **String**| Filter on location | [optional]
 **type** | **String**| Filter on type | [optional]
 **locked** | **String**| Filter on locked | [optional]
 **scratch** | **String**| Filter on scratch | [optional]
 **cleaning** | **String**| Filter on cleaning | [optional]
 **writeProtect** | **String**| Filter on write protect | [optional]
 **mounted** | **String**| Filter on mounted | [optional]
 **ejected** | **String**| Filter on ejected | [optional]
 **known** | **String**| Filter on known | [optional]
 **mountCount** | **String**| Filter on mount count | [optional]
 **dateIn** | **String**| Filter on date in | [optional]
 **dateMove** | **String**| Filter on date move | [optional]
 **free** | **String**| Filter on free | [optional]
 **max** | **String**| Filter on max | [optional]
 **lastSizeUpdate** | **String**| Filter on last size update | [optional]
 **lastMaintenance** | **String**| Filter on last maintenance | [optional]
 **lastRepack** | **String**| Filter on last repack | [optional]
 **repackStatus** | **String**| Filter on repack status | [optional]
 **hash** | **String**| Filter on hash | [optional]
 **forceImportType** | **String**| Filter on force import type | [optional]
 **needToCheck** | **String**| Filter on need to check | [optional]

### Return type

[**TapeCollection**](TapeCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of tapes. |  -  |

<a name="indexTapesByPool"></a>
# **indexTapesByPool**
> TapeCollection indexTapesByPool(poolId, limit, offset, sortBy, id, tapeLibraryId, barcode, location, type, locked, scratch, cleaning, writeProtect, mounted, ejected, known, mountCount, dateIn, dateMove, free, max, lastSizeUpdate, lastMaintenance, lastRepack, repackStatus, hash, forceImportType, needToCheck)

Lists all tapes.

**API Key Scope**: tapes / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapesApi;

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

    TapesApi apiInstance = new TapesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String tapeLibraryId = "tapeLibraryId_example"; // String | Filter on tape library id
    String barcode = "barcode_example"; // String | Filter on barcode
    String location = "location_example"; // String | Filter on location
    String type = "type_example"; // String | Filter on type
    String locked = "locked_example"; // String | Filter on locked
    String scratch = "scratch_example"; // String | Filter on scratch
    String cleaning = "cleaning_example"; // String | Filter on cleaning
    String writeProtect = "writeProtect_example"; // String | Filter on write protect
    String mounted = "mounted_example"; // String | Filter on mounted
    String ejected = "ejected_example"; // String | Filter on ejected
    String known = "known_example"; // String | Filter on known
    String mountCount = "mountCount_example"; // String | Filter on mount count
    String dateIn = "dateIn_example"; // String | Filter on date in
    String dateMove = "dateMove_example"; // String | Filter on date move
    String free = "free_example"; // String | Filter on free
    String max = "max_example"; // String | Filter on max
    String lastSizeUpdate = "lastSizeUpdate_example"; // String | Filter on last size update
    String lastMaintenance = "lastMaintenance_example"; // String | Filter on last maintenance
    String lastRepack = "lastRepack_example"; // String | Filter on last repack
    String repackStatus = "repackStatus_example"; // String | Filter on repack status
    String hash = "hash_example"; // String | Filter on hash
    String forceImportType = "forceImportType_example"; // String | Filter on force import type
    String needToCheck = "needToCheck_example"; // String | Filter on need to check
    try {
      TapeCollection result = apiInstance.indexTapesByPool(poolId, limit, offset, sortBy, id, tapeLibraryId, barcode, location, type, locked, scratch, cleaning, writeProtect, mounted, ejected, known, mountCount, dateIn, dateMove, free, max, lastSizeUpdate, lastMaintenance, lastRepack, repackStatus, hash, forceImportType, needToCheck);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapesApi#indexTapesByPool");
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
 **tapeLibraryId** | **String**| Filter on tape library id | [optional]
 **barcode** | **String**| Filter on barcode | [optional]
 **location** | **String**| Filter on location | [optional]
 **type** | **String**| Filter on type | [optional]
 **locked** | **String**| Filter on locked | [optional]
 **scratch** | **String**| Filter on scratch | [optional]
 **cleaning** | **String**| Filter on cleaning | [optional]
 **writeProtect** | **String**| Filter on write protect | [optional]
 **mounted** | **String**| Filter on mounted | [optional]
 **ejected** | **String**| Filter on ejected | [optional]
 **known** | **String**| Filter on known | [optional]
 **mountCount** | **String**| Filter on mount count | [optional]
 **dateIn** | **String**| Filter on date in | [optional]
 **dateMove** | **String**| Filter on date move | [optional]
 **free** | **String**| Filter on free | [optional]
 **max** | **String**| Filter on max | [optional]
 **lastSizeUpdate** | **String**| Filter on last size update | [optional]
 **lastMaintenance** | **String**| Filter on last maintenance | [optional]
 **lastRepack** | **String**| Filter on last repack | [optional]
 **repackStatus** | **String**| Filter on repack status | [optional]
 **hash** | **String**| Filter on hash | [optional]
 **forceImportType** | **String**| Filter on force import type | [optional]
 **needToCheck** | **String**| Filter on need to check | [optional]

### Return type

[**TapeCollection**](TapeCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of tapes. |  -  |

<a name="indexTapesByTapeLibrary"></a>
# **indexTapesByTapeLibrary**
> TapeCollection indexTapesByTapeLibrary(tapeLibraryId, limit, offset, sortBy, id, poolId, barcode, location, type, locked, scratch, cleaning, writeProtect, mounted, ejected, known, mountCount, dateIn, dateMove, free, max, lastSizeUpdate, lastMaintenance, lastRepack, repackStatus, hash, forceImportType, needToCheck)

Lists all tapes.

**API Key Scope**: tapes / index

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapesApi;

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

    TapesApi apiInstance = new TapesApi(defaultClient);
    String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
    Integer limit = 56; // Integer | The number of items to display for pagination.
    Integer offset = 56; // Integer | The number of items to skip for pagination.
    List<String> sortBy = Arrays.asList(); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
    String id = "id_example"; // String | Filter on id
    String poolId = "poolId_example"; // String | Filter on a pool id
    String barcode = "barcode_example"; // String | Filter on barcode
    String location = "location_example"; // String | Filter on location
    String type = "type_example"; // String | Filter on type
    String locked = "locked_example"; // String | Filter on locked
    String scratch = "scratch_example"; // String | Filter on scratch
    String cleaning = "cleaning_example"; // String | Filter on cleaning
    String writeProtect = "writeProtect_example"; // String | Filter on write protect
    String mounted = "mounted_example"; // String | Filter on mounted
    String ejected = "ejected_example"; // String | Filter on ejected
    String known = "known_example"; // String | Filter on known
    String mountCount = "mountCount_example"; // String | Filter on mount count
    String dateIn = "dateIn_example"; // String | Filter on date in
    String dateMove = "dateMove_example"; // String | Filter on date move
    String free = "free_example"; // String | Filter on free
    String max = "max_example"; // String | Filter on max
    String lastSizeUpdate = "lastSizeUpdate_example"; // String | Filter on last size update
    String lastMaintenance = "lastMaintenance_example"; // String | Filter on last maintenance
    String lastRepack = "lastRepack_example"; // String | Filter on last repack
    String repackStatus = "repackStatus_example"; // String | Filter on repack status
    String hash = "hash_example"; // String | Filter on hash
    String forceImportType = "forceImportType_example"; // String | Filter on force import type
    String needToCheck = "needToCheck_example"; // String | Filter on need to check
    try {
      TapeCollection result = apiInstance.indexTapesByTapeLibrary(tapeLibraryId, limit, offset, sortBy, id, poolId, barcode, location, type, locked, scratch, cleaning, writeProtect, mounted, ejected, known, mountCount, dateIn, dateMove, free, max, lastSizeUpdate, lastMaintenance, lastRepack, repackStatus, hash, forceImportType, needToCheck);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapesApi#indexTapesByTapeLibrary");
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
 **limit** | **Integer**| The number of items to display for pagination. | [optional]
 **offset** | **Integer**| The number of items to skip for pagination. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort results by attribute.  Can sort on multiple attributes, separated by &#x60;|&#x60;. Order direction can be suffixing the attribute by either &#x60;:asc&#x60; (default) or &#x60;:desc&#x60;. | [optional]
 **id** | **String**| Filter on id | [optional]
 **poolId** | **String**| Filter on a pool id | [optional]
 **barcode** | **String**| Filter on barcode | [optional]
 **location** | **String**| Filter on location | [optional]
 **type** | **String**| Filter on type | [optional]
 **locked** | **String**| Filter on locked | [optional]
 **scratch** | **String**| Filter on scratch | [optional]
 **cleaning** | **String**| Filter on cleaning | [optional]
 **writeProtect** | **String**| Filter on write protect | [optional]
 **mounted** | **String**| Filter on mounted | [optional]
 **ejected** | **String**| Filter on ejected | [optional]
 **known** | **String**| Filter on known | [optional]
 **mountCount** | **String**| Filter on mount count | [optional]
 **dateIn** | **String**| Filter on date in | [optional]
 **dateMove** | **String**| Filter on date move | [optional]
 **free** | **String**| Filter on free | [optional]
 **max** | **String**| Filter on max | [optional]
 **lastSizeUpdate** | **String**| Filter on last size update | [optional]
 **lastMaintenance** | **String**| Filter on last maintenance | [optional]
 **lastRepack** | **String**| Filter on last repack | [optional]
 **repackStatus** | **String**| Filter on repack status | [optional]
 **hash** | **String**| Filter on hash | [optional]
 **forceImportType** | **String**| Filter on force import type | [optional]
 **needToCheck** | **String**| Filter on need to check | [optional]

### Return type

[**TapeCollection**](TapeCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of tapes. |  -  |

<a name="mountStatusTape"></a>
# **mountStatusTape**
> MountStatus mountStatusTape(tapeId)

Get mount status of Tape.

**API Key Scope**: tapes / mount_status

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapesApi;

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

    TapesApi apiInstance = new TapesApi(defaultClient);
    String tapeId = "tapeId_example"; // String | Numeric ID, or barcode of tape.
    try {
      MountStatus result = apiInstance.mountStatusTape(tapeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapesApi#mountStatusTape");
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
 **tapeId** | **String**| Numeric ID, or barcode of tape. |

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

<a name="mountStatusTapeByPool"></a>
# **mountStatusTapeByPool**
> MountStatus mountStatusTapeByPool(poolId, tapeId)

Get mount status of Tape.

**API Key Scope**: tapes / mount_status

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapesApi;

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

    TapesApi apiInstance = new TapesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    String tapeId = "tapeId_example"; // String | Numeric ID, or barcode of tape.
    try {
      MountStatus result = apiInstance.mountStatusTapeByPool(poolId, tapeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapesApi#mountStatusTapeByPool");
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
 **tapeId** | **String**| Numeric ID, or barcode of tape. |

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

<a name="mountStatusTapeByTapeLibrary"></a>
# **mountStatusTapeByTapeLibrary**
> MountStatus mountStatusTapeByTapeLibrary(tapeLibraryId, tapeId)

Get mount status of Tape.

**API Key Scope**: tapes / mount_status

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapesApi;

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

    TapesApi apiInstance = new TapesApi(defaultClient);
    String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
    String tapeId = "tapeId_example"; // String | Numeric ID, or barcode of tape.
    try {
      MountStatus result = apiInstance.mountStatusTapeByTapeLibrary(tapeLibraryId, tapeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapesApi#mountStatusTapeByTapeLibrary");
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
 **tapeId** | **String**| Numeric ID, or barcode of tape. |

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

<a name="showTape"></a>
# **showTape**
> Tape showTape(tapeId)

Displays a specific tape.

**API Key Scope**: tapes / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapesApi;

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

    TapesApi apiInstance = new TapesApi(defaultClient);
    String tapeId = "tapeId_example"; // String | Numeric ID, or barcode of tape.
    try {
      Tape result = apiInstance.showTape(tapeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapesApi#showTape");
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
 **tapeId** | **String**| Numeric ID, or barcode of tape. |

### Return type

[**Tape**](Tape.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific tape. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

<a name="showTapeByPool"></a>
# **showTapeByPool**
> Tape showTapeByPool(poolId, tapeId)

Displays a specific tape.

**API Key Scope**: tapes / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapesApi;

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

    TapesApi apiInstance = new TapesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    String tapeId = "tapeId_example"; // String | Numeric ID, or barcode of tape.
    try {
      Tape result = apiInstance.showTapeByPool(poolId, tapeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapesApi#showTapeByPool");
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
 **tapeId** | **String**| Numeric ID, or barcode of tape. |

### Return type

[**Tape**](Tape.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific tape. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

<a name="showTapeByTapeLibrary"></a>
# **showTapeByTapeLibrary**
> Tape showTapeByTapeLibrary(tapeLibraryId, tapeId)

Displays a specific tape.

**API Key Scope**: tapes / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapesApi;

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

    TapesApi apiInstance = new TapesApi(defaultClient);
    String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
    String tapeId = "tapeId_example"; // String | Numeric ID, or barcode of tape.
    try {
      Tape result = apiInstance.showTapeByTapeLibrary(tapeLibraryId, tapeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapesApi#showTapeByTapeLibrary");
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
 **tapeId** | **String**| Numeric ID, or barcode of tape. |

### Return type

[**Tape**](Tape.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific tape. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

<a name="showTapeStat"></a>
# **showTapeStat**
> TapeStat showTapeStat(tapeId)

Display statistic for a specific tape.

**API Key Scope**: tape_stats / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapesApi;

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

    TapesApi apiInstance = new TapesApi(defaultClient);
    String tapeId = "tapeId_example"; // String | Numeric ID, or barcode of tape.
    try {
      TapeStat result = apiInstance.showTapeStat(tapeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapesApi#showTapeStat");
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
 **tapeId** | **String**| Numeric ID, or barcode of tape. |

### Return type

[**TapeStat**](TapeStat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific tape statistic. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

<a name="showTapeStatByPool"></a>
# **showTapeStatByPool**
> TapeStat showTapeStatByPool(poolId, tapeId)

Display statistic for a specific tape.

**API Key Scope**: tape_stats / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapesApi;

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

    TapesApi apiInstance = new TapesApi(defaultClient);
    String poolId = "poolId_example"; // String | Numeric ID, or name of pool.
    String tapeId = "tapeId_example"; // String | Numeric ID, or barcode of tape.
    try {
      TapeStat result = apiInstance.showTapeStatByPool(poolId, tapeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapesApi#showTapeStatByPool");
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
 **tapeId** | **String**| Numeric ID, or barcode of tape. |

### Return type

[**TapeStat**](TapeStat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific tape statistic. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

<a name="showTapeStatByTapeLibrary"></a>
# **showTapeStatByTapeLibrary**
> TapeStat showTapeStatByTapeLibrary(tapeLibraryId, tapeId)

Display statistic for a specific tape.

**API Key Scope**: tape_stats / show

### Example
```java
// Import classes:
import io.nodeum.sdk.client.ApiClient;
import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.Configuration;
import io.nodeum.sdk.client.auth.*;
import io.nodeum.sdk.client.models.*;
import io.nodeum.sdk.client.api.TapesApi;

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

    TapesApi apiInstance = new TapesApi(defaultClient);
    String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
    String tapeId = "tapeId_example"; // String | Numeric ID, or barcode of tape.
    try {
      TapeStat result = apiInstance.showTapeStatByTapeLibrary(tapeLibraryId, tapeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TapesApi#showTapeStatByTapeLibrary");
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
 **tapeId** | **String**| Numeric ID, or barcode of tape. |

### Return type

[**TapeStat**](TapeStat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A specific tape statistic. |  -  |
**404** | The requested resource was not found. The detailed error will be of type &#x60;not_found&#x60;. |  -  |

