# MountsApi

All URIs are relative to *https://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**indexMounts**](MountsApi.md#indexMounts) | **GET** /mounts | List all mounted storages


<a name="indexMounts"></a>
# **indexMounts**
> MountCollection indexMounts()

List all mounted storages

**API Key Scope**: mounts / index

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MountsApi;

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

MountsApi apiInstance = new MountsApi();
try {
    MountCollection result = apiInstance.indexMounts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MountsApi#indexMounts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MountCollection**](MountCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

