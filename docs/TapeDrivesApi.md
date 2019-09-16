# TapeDrivesApi

All URIs are relative to *https://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTapeDriveByTapeLibrary**](TapeDrivesApi.md#createTapeDriveByTapeLibrary) | **POST** /tape_libraries/{tape_library_id}/tape_drives | Creates a new tape drive.
[**destroyTapeDrive**](TapeDrivesApi.md#destroyTapeDrive) | **DELETE** /tape_drives/{tape_drive_id} | Destroys a specific tape drive.
[**destroyTapeDriveByTapeLibrary**](TapeDrivesApi.md#destroyTapeDriveByTapeLibrary) | **DELETE** /tape_libraries/{tape_library_id}/tape_drives/{tape_drive_id} | Destroys a specific tape drive.
[**indexTapeDriveDevices**](TapeDrivesApi.md#indexTapeDriveDevices) | **GET** /tape_libraries/{tape_library_id}/tape_drives/-/devices | Lists tape drives devices.
[**indexTapeDrives**](TapeDrivesApi.md#indexTapeDrives) | **GET** /tape_drives | Lists all tape drives.
[**indexTapeDrivesByTapeLibrary**](TapeDrivesApi.md#indexTapeDrivesByTapeLibrary) | **GET** /tape_libraries/{tape_library_id}/tape_drives | Lists all tape drives.
[**showTapeDrive**](TapeDrivesApi.md#showTapeDrive) | **GET** /tape_drives/{tape_drive_id} | Displays a specific tape drive.
[**showTapeDriveByTapeLibrary**](TapeDrivesApi.md#showTapeDriveByTapeLibrary) | **GET** /tape_libraries/{tape_library_id}/tape_drives/{tape_drive_id} | Displays a specific tape drive.
[**updateTapeDrive**](TapeDrivesApi.md#updateTapeDrive) | **PUT** /tape_drives/{tape_drive_id} | Updates a specific tape drive.
[**updateTapeDriveByTapeLibrary**](TapeDrivesApi.md#updateTapeDriveByTapeLibrary) | **PUT** /tape_libraries/{tape_library_id}/tape_drives/{tape_drive_id} | Updates a specific tape drive.


<a name="createTapeDriveByTapeLibrary"></a>
# **createTapeDriveByTapeLibrary**
> TapeDrive createTapeDriveByTapeLibrary(tapeLibraryId, tapeDriveBody)

Creates a new tape drive.

**API Key Scope**: tape_drives / create

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapeDrivesApi;

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

TapeDrivesApi apiInstance = new TapeDrivesApi();
String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
TapeDrive tapeDriveBody = new TapeDrive(); // TapeDrive | 
try {
    TapeDrive result = apiInstance.createTapeDriveByTapeLibrary(tapeLibraryId, tapeDriveBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TapeDrivesApi#createTapeDriveByTapeLibrary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tapeLibraryId** | **String**| Numeric ID, serial, or name of tape library. |
 **tapeDriveBody** | [**TapeDrive**](TapeDrive.md)|  |

### Return type

[**TapeDrive**](TapeDrive.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="destroyTapeDrive"></a>
# **destroyTapeDrive**
> destroyTapeDrive(tapeDriveId)

Destroys a specific tape drive.

**API Key Scope**: tape_drives / destroy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapeDrivesApi;

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

TapeDrivesApi apiInstance = new TapeDrivesApi();
String tapeDriveId = "tapeDriveId_example"; // String | Numeric ID, serial, or name of tape drive.
try {
    apiInstance.destroyTapeDrive(tapeDriveId);
} catch (ApiException e) {
    System.err.println("Exception when calling TapeDrivesApi#destroyTapeDrive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tapeDriveId** | **String**| Numeric ID, serial, or name of tape drive. |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="destroyTapeDriveByTapeLibrary"></a>
# **destroyTapeDriveByTapeLibrary**
> destroyTapeDriveByTapeLibrary(tapeLibraryId, tapeDriveId)

Destroys a specific tape drive.

**API Key Scope**: tape_drives / destroy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapeDrivesApi;

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

TapeDrivesApi apiInstance = new TapeDrivesApi();
String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
String tapeDriveId = "tapeDriveId_example"; // String | Numeric ID, serial, or name of tape drive.
try {
    apiInstance.destroyTapeDriveByTapeLibrary(tapeLibraryId, tapeDriveId);
} catch (ApiException e) {
    System.err.println("Exception when calling TapeDrivesApi#destroyTapeDriveByTapeLibrary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tapeLibraryId** | **String**| Numeric ID, serial, or name of tape library. |
 **tapeDriveId** | **String**| Numeric ID, serial, or name of tape drive. |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexTapeDriveDevices"></a>
# **indexTapeDriveDevices**
> TapeDriveDeviceCollection indexTapeDriveDevices(tapeLibraryId, jobId)

Lists tape drives devices.

**API Key Scope**: tape_drives / devices

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapeDrivesApi;

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

TapeDrivesApi apiInstance = new TapeDrivesApi();
String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
String jobId = "jobId_example"; // String | ID of active job
try {
    TapeDriveDeviceCollection result = apiInstance.indexTapeDriveDevices(tapeLibraryId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TapeDrivesApi#indexTapeDriveDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tapeLibraryId** | **String**| Numeric ID, serial, or name of tape library. |
 **jobId** | **String**| ID of active job | [optional]

### Return type

[**TapeDriveDeviceCollection**](TapeDriveDeviceCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexTapeDrives"></a>
# **indexTapeDrives**
> TapeDriveCollection indexTapeDrives(limit, offset, sortBy, id, tapeLibraryId, name, serial, comment, scsiAddress, vendor, product, firmware, device, sgdevice, libso, acs, lsm, panel, transport, status, full, mountCount, useTo, useBy, useFileProcessedSize, useFileSizeToProcess, useFileNameProcessed, bandwidth)

Lists all tape drives.

**API Key Scope**: tape_drives / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapeDrivesApi;

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

TapeDrivesApi apiInstance = new TapeDrivesApi();
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String tapeLibraryId = "tapeLibraryId_example"; // String | Filter on tape library id
String name = "name_example"; // String | Filter on name
String serial = "serial_example"; // String | Filter on serial
String comment = "comment_example"; // String | Filter on comment
String scsiAddress = "scsiAddress_example"; // String | Filter on scsi address
String vendor = "vendor_example"; // String | Filter on vendor
String product = "product_example"; // String | Filter on product
String firmware = "firmware_example"; // String | Filter on firmware
String device = "device_example"; // String | Filter on device
String sgdevice = "sgdevice_example"; // String | Filter on sgdevice
String libso = "libso_example"; // String | Filter on libso
String acs = "acs_example"; // String | Filter on acs
String lsm = "lsm_example"; // String | Filter on lsm
String panel = "panel_example"; // String | Filter on panel
String transport = "transport_example"; // String | Filter on transport
String status = "status_example"; // String | Filter on status
String full = "full_example"; // String | Filter on full
String mountCount = "mountCount_example"; // String | Filter on mount count
String useTo = "useTo_example"; // String | Filter on use to
String useBy = "useBy_example"; // String | Filter on use by
String useFileProcessedSize = "useFileProcessedSize_example"; // String | Filter on use file processed size
String useFileSizeToProcess = "useFileSizeToProcess_example"; // String | Filter on use file size to process
String useFileNameProcessed = "useFileNameProcessed_example"; // String | Filter on use file name processed
String bandwidth = "bandwidth_example"; // String | Filter on bandwidth
try {
    TapeDriveCollection result = apiInstance.indexTapeDrives(limit, offset, sortBy, id, tapeLibraryId, name, serial, comment, scsiAddress, vendor, product, firmware, device, sgdevice, libso, acs, lsm, panel, transport, status, full, mountCount, useTo, useBy, useFileProcessedSize, useFileSizeToProcess, useFileNameProcessed, bandwidth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TapeDrivesApi#indexTapeDrives");
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
 **name** | **String**| Filter on name | [optional]
 **serial** | **String**| Filter on serial | [optional]
 **comment** | **String**| Filter on comment | [optional]
 **scsiAddress** | **String**| Filter on scsi address | [optional]
 **vendor** | **String**| Filter on vendor | [optional]
 **product** | **String**| Filter on product | [optional]
 **firmware** | **String**| Filter on firmware | [optional]
 **device** | **String**| Filter on device | [optional]
 **sgdevice** | **String**| Filter on sgdevice | [optional]
 **libso** | **String**| Filter on libso | [optional]
 **acs** | **String**| Filter on acs | [optional]
 **lsm** | **String**| Filter on lsm | [optional]
 **panel** | **String**| Filter on panel | [optional]
 **transport** | **String**| Filter on transport | [optional]
 **status** | **String**| Filter on status | [optional]
 **full** | **String**| Filter on full | [optional]
 **mountCount** | **String**| Filter on mount count | [optional]
 **useTo** | **String**| Filter on use to | [optional]
 **useBy** | **String**| Filter on use by | [optional]
 **useFileProcessedSize** | **String**| Filter on use file processed size | [optional]
 **useFileSizeToProcess** | **String**| Filter on use file size to process | [optional]
 **useFileNameProcessed** | **String**| Filter on use file name processed | [optional]
 **bandwidth** | **String**| Filter on bandwidth | [optional]

### Return type

[**TapeDriveCollection**](TapeDriveCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexTapeDrivesByTapeLibrary"></a>
# **indexTapeDrivesByTapeLibrary**
> TapeDriveCollection indexTapeDrivesByTapeLibrary(tapeLibraryId, limit, offset, sortBy, id, name, serial, comment, scsiAddress, vendor, product, firmware, device, sgdevice, libso, acs, lsm, panel, transport, status, full, mountCount, useTo, useBy, useFileProcessedSize, useFileSizeToProcess, useFileNameProcessed, bandwidth)

Lists all tape drives.

**API Key Scope**: tape_drives / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapeDrivesApi;

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

TapeDrivesApi apiInstance = new TapeDrivesApi();
String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
Integer limit = 56; // Integer | The number of items to display for pagination.
Integer offset = 56; // Integer | The number of items to skip for pagination.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort results by attribute.  Can sort on multiple attributes, separated by `|`. Order direction can be suffixing the attribute by either `:asc` (default) or `:desc`.
String id = "id_example"; // String | Filter on id
String name = "name_example"; // String | Filter on name
String serial = "serial_example"; // String | Filter on serial
String comment = "comment_example"; // String | Filter on comment
String scsiAddress = "scsiAddress_example"; // String | Filter on scsi address
String vendor = "vendor_example"; // String | Filter on vendor
String product = "product_example"; // String | Filter on product
String firmware = "firmware_example"; // String | Filter on firmware
String device = "device_example"; // String | Filter on device
String sgdevice = "sgdevice_example"; // String | Filter on sgdevice
String libso = "libso_example"; // String | Filter on libso
String acs = "acs_example"; // String | Filter on acs
String lsm = "lsm_example"; // String | Filter on lsm
String panel = "panel_example"; // String | Filter on panel
String transport = "transport_example"; // String | Filter on transport
String status = "status_example"; // String | Filter on status
String full = "full_example"; // String | Filter on full
String mountCount = "mountCount_example"; // String | Filter on mount count
String useTo = "useTo_example"; // String | Filter on use to
String useBy = "useBy_example"; // String | Filter on use by
String useFileProcessedSize = "useFileProcessedSize_example"; // String | Filter on use file processed size
String useFileSizeToProcess = "useFileSizeToProcess_example"; // String | Filter on use file size to process
String useFileNameProcessed = "useFileNameProcessed_example"; // String | Filter on use file name processed
String bandwidth = "bandwidth_example"; // String | Filter on bandwidth
try {
    TapeDriveCollection result = apiInstance.indexTapeDrivesByTapeLibrary(tapeLibraryId, limit, offset, sortBy, id, name, serial, comment, scsiAddress, vendor, product, firmware, device, sgdevice, libso, acs, lsm, panel, transport, status, full, mountCount, useTo, useBy, useFileProcessedSize, useFileSizeToProcess, useFileNameProcessed, bandwidth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TapeDrivesApi#indexTapeDrivesByTapeLibrary");
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
 **name** | **String**| Filter on name | [optional]
 **serial** | **String**| Filter on serial | [optional]
 **comment** | **String**| Filter on comment | [optional]
 **scsiAddress** | **String**| Filter on scsi address | [optional]
 **vendor** | **String**| Filter on vendor | [optional]
 **product** | **String**| Filter on product | [optional]
 **firmware** | **String**| Filter on firmware | [optional]
 **device** | **String**| Filter on device | [optional]
 **sgdevice** | **String**| Filter on sgdevice | [optional]
 **libso** | **String**| Filter on libso | [optional]
 **acs** | **String**| Filter on acs | [optional]
 **lsm** | **String**| Filter on lsm | [optional]
 **panel** | **String**| Filter on panel | [optional]
 **transport** | **String**| Filter on transport | [optional]
 **status** | **String**| Filter on status | [optional]
 **full** | **String**| Filter on full | [optional]
 **mountCount** | **String**| Filter on mount count | [optional]
 **useTo** | **String**| Filter on use to | [optional]
 **useBy** | **String**| Filter on use by | [optional]
 **useFileProcessedSize** | **String**| Filter on use file processed size | [optional]
 **useFileSizeToProcess** | **String**| Filter on use file size to process | [optional]
 **useFileNameProcessed** | **String**| Filter on use file name processed | [optional]
 **bandwidth** | **String**| Filter on bandwidth | [optional]

### Return type

[**TapeDriveCollection**](TapeDriveCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTapeDrive"></a>
# **showTapeDrive**
> TapeDrive showTapeDrive(tapeDriveId)

Displays a specific tape drive.

**API Key Scope**: tape_drives / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapeDrivesApi;

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

TapeDrivesApi apiInstance = new TapeDrivesApi();
String tapeDriveId = "tapeDriveId_example"; // String | Numeric ID, serial, or name of tape drive.
try {
    TapeDrive result = apiInstance.showTapeDrive(tapeDriveId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TapeDrivesApi#showTapeDrive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tapeDriveId** | **String**| Numeric ID, serial, or name of tape drive. |

### Return type

[**TapeDrive**](TapeDrive.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTapeDriveByTapeLibrary"></a>
# **showTapeDriveByTapeLibrary**
> TapeDrive showTapeDriveByTapeLibrary(tapeLibraryId, tapeDriveId)

Displays a specific tape drive.

**API Key Scope**: tape_drives / show

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapeDrivesApi;

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

TapeDrivesApi apiInstance = new TapeDrivesApi();
String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
String tapeDriveId = "tapeDriveId_example"; // String | Numeric ID, serial, or name of tape drive.
try {
    TapeDrive result = apiInstance.showTapeDriveByTapeLibrary(tapeLibraryId, tapeDriveId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TapeDrivesApi#showTapeDriveByTapeLibrary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tapeLibraryId** | **String**| Numeric ID, serial, or name of tape library. |
 **tapeDriveId** | **String**| Numeric ID, serial, or name of tape drive. |

### Return type

[**TapeDrive**](TapeDrive.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTapeDrive"></a>
# **updateTapeDrive**
> TapeDrive updateTapeDrive(tapeDriveId, tapeDriveBody)

Updates a specific tape drive.

**API Key Scope**: tape_drives / update

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapeDrivesApi;

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

TapeDrivesApi apiInstance = new TapeDrivesApi();
String tapeDriveId = "tapeDriveId_example"; // String | Numeric ID, serial, or name of tape drive.
TapeDrive tapeDriveBody = new TapeDrive(); // TapeDrive | 
try {
    TapeDrive result = apiInstance.updateTapeDrive(tapeDriveId, tapeDriveBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TapeDrivesApi#updateTapeDrive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tapeDriveId** | **String**| Numeric ID, serial, or name of tape drive. |
 **tapeDriveBody** | [**TapeDrive**](TapeDrive.md)|  |

### Return type

[**TapeDrive**](TapeDrive.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTapeDriveByTapeLibrary"></a>
# **updateTapeDriveByTapeLibrary**
> TapeDrive updateTapeDriveByTapeLibrary(tapeLibraryId, tapeDriveId, tapeDriveBody)

Updates a specific tape drive.

**API Key Scope**: tape_drives / update

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TapeDrivesApi;

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

TapeDrivesApi apiInstance = new TapeDrivesApi();
String tapeLibraryId = "tapeLibraryId_example"; // String | Numeric ID, serial, or name of tape library.
String tapeDriveId = "tapeDriveId_example"; // String | Numeric ID, serial, or name of tape drive.
TapeDrive tapeDriveBody = new TapeDrive(); // TapeDrive | 
try {
    TapeDrive result = apiInstance.updateTapeDriveByTapeLibrary(tapeLibraryId, tapeDriveId, tapeDriveBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TapeDrivesApi#updateTapeDriveByTapeLibrary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tapeLibraryId** | **String**| Numeric ID, serial, or name of tape library. |
 **tapeDriveId** | **String**| Numeric ID, serial, or name of tape drive. |
 **tapeDriveBody** | [**TapeDrive**](TapeDrive.md)|  |

### Return type

[**TapeDrive**](TapeDrive.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

