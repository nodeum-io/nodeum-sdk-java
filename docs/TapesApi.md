# TapesApi

All URIs are relative to *https://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**indexTapes**](TapesApi.md#indexTapes) | **GET** /tapes | Lists all tapes.
[**indexTapesByTapeLibrary**](TapesApi.md#indexTapesByTapeLibrary) | **GET** /tape_libraries/{tape_library_id}/tapes | Lists all tapes.
[**indexTapesByTapePool**](TapesApi.md#indexTapesByTapePool) | **GET** /tape_pools/{tape_pool_id}/tapes | Lists all tapes.
[**showTape**](TapesApi.md#showTape) | **GET** /tapes/{tape_id} | Displays a specific tape.
[**showTapeByTapeLibrary**](TapesApi.md#showTapeByTapeLibrary) | **GET** /tape_libraries/{tape_library_id}/tapes/{tape_id} | Displays a specific tape.
[**showTapeByTapePool**](TapesApi.md#showTapeByTapePool) | **GET** /tape_pools/{tape_pool_id}/tapes/{tape_id} | Displays a specific tape.


<a name="indexTapes"></a>
# **indexTapes**
> TapeCollection indexTapes(limit, offset, sortBy, id, tapeLibraryId, tapePoolId, barcode, location, type, locked, scratch, cleaning, writeProtect, mounted, ejected, known, mountCount, dateIn, dateMove, free, max, lastSizeUpdate, lastMaintenance, lastRepack, repackStatus, hash, forceImportType, needToCheck)

Lists all tapes.

**API Key Scope**: tapes / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapesApi;

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

TapesApi apiInstance = new TapesApi();
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String tapeLibraryId = "tapeLibraryId_example"; // String | Filter on tape library id
String tapePoolId = "tapePoolId_example"; // String | Filter on tape pool id
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
    TapeCollection result = apiInstance.indexTapes(limit, offset, sortBy, id, tapeLibraryId, tapePoolId, barcode, location, type, locked, scratch, cleaning, writeProtect, mounted, ejected, known, mountCount, dateIn, dateMove, free, max, lastSizeUpdate, lastMaintenance, lastRepack, repackStatus, hash, forceImportType, needToCheck);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TapesApi#indexTapes");
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
 **tapeLibraryId** | **String**| Filter on tape library id | [optional]
 **tapePoolId** | **String**| Filter on tape pool id | [optional]
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexTapesByTapeLibrary"></a>
# **indexTapesByTapeLibrary**
> TapeCollection indexTapesByTapeLibrary(tapeLibraryId, limit, offset, sortBy, id, tapePoolId, barcode, location, type, locked, scratch, cleaning, writeProtect, mounted, ejected, known, mountCount, dateIn, dateMove, free, max, lastSizeUpdate, lastMaintenance, lastRepack, repackStatus, hash, forceImportType, needToCheck)

Lists all tapes.

**API Key Scope**: tapes / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapesApi;

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

TapesApi apiInstance = new TapesApi();
String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String tapePoolId = "tapePoolId_example"; // String | Filter on tape pool id
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
    TapeCollection result = apiInstance.indexTapesByTapeLibrary(tapeLibraryId, limit, offset, sortBy, id, tapePoolId, barcode, location, type, locked, scratch, cleaning, writeProtect, mounted, ejected, known, mountCount, dateIn, dateMove, free, max, lastSizeUpdate, lastMaintenance, lastRepack, repackStatus, hash, forceImportType, needToCheck);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TapesApi#indexTapesByTapeLibrary");
    e.printStackTrace();
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
 **tapePoolId** | **String**| Filter on tape pool id | [optional]
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexTapesByTapePool"></a>
# **indexTapesByTapePool**
> TapeCollection indexTapesByTapePool(tapePoolId, limit, offset, sortBy, id, tapeLibraryId, barcode, location, type, locked, scratch, cleaning, writeProtect, mounted, ejected, known, mountCount, dateIn, dateMove, free, max, lastSizeUpdate, lastMaintenance, lastRepack, repackStatus, hash, forceImportType, needToCheck)

Lists all tapes.

**API Key Scope**: tapes / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapesApi;

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

TapesApi apiInstance = new TapesApi();
String tapePoolId = "tapePoolId_example"; // String | Numeric ID, or name of tape pool.
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
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
    TapeCollection result = apiInstance.indexTapesByTapePool(tapePoolId, limit, offset, sortBy, id, tapeLibraryId, barcode, location, type, locked, scratch, cleaning, writeProtect, mounted, ejected, known, mountCount, dateIn, dateMove, free, max, lastSizeUpdate, lastMaintenance, lastRepack, repackStatus, hash, forceImportType, needToCheck);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TapesApi#indexTapesByTapePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tapePoolId** | **String**| Numeric ID, or name of tape pool. |
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTape"></a>
# **showTape**
> Tape showTape(tapeId)

Displays a specific tape.

**API Key Scope**: tapes / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapesApi;

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

TapesApi apiInstance = new TapesApi();
String tapeId = "tapeId_example"; // String | Numeric ID, or barcode of tape.
try {
    Tape result = apiInstance.showTape(tapeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TapesApi#showTape");
    e.printStackTrace();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTapeByTapeLibrary"></a>
# **showTapeByTapeLibrary**
> Tape showTapeByTapeLibrary(tapeLibraryId, tapeId)

Displays a specific tape.

**API Key Scope**: tapes / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapesApi;

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

TapesApi apiInstance = new TapesApi();
String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
String tapeId = "tapeId_example"; // String | Numeric ID, or barcode of tape.
try {
    Tape result = apiInstance.showTapeByTapeLibrary(tapeLibraryId, tapeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TapesApi#showTapeByTapeLibrary");
    e.printStackTrace();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTapeByTapePool"></a>
# **showTapeByTapePool**
> Tape showTapeByTapePool(tapePoolId, tapeId)

Displays a specific tape.

**API Key Scope**: tapes / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapesApi;

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

TapesApi apiInstance = new TapesApi();
String tapePoolId = "tapePoolId_example"; // String | Numeric ID, or name of tape pool.
String tapeId = "tapeId_example"; // String | Numeric ID, or barcode of tape.
try {
    Tape result = apiInstance.showTapeByTapePool(tapePoolId, tapeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TapesApi#showTapeByTapePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tapePoolId** | **String**| Numeric ID, or name of tape pool. |
 **tapeId** | **String**| Numeric ID, or barcode of tape. |

### Return type

[**Tape**](Tape.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

