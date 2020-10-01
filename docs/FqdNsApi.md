# FqdNsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFqdn**](FqdNsApi.md#createFqdn) | **POST** /fqdns | Create an Fqdn
[**deleteFqdn**](FqdNsApi.md#deleteFqdn) | **DELETE** /fqdns/{id} | Delete an Fqdn
[**listFqdns**](FqdNsApi.md#listFqdns) | **GET** /fqdns | List Fqdns
[**retrieveFqdn**](FqdNsApi.md#retrieveFqdn) | **GET** /fqdns/{id} | Retrieve an Fqdn
[**updateFqdn**](FqdNsApi.md#updateFqdn) | **PATCH** /fqdns/{id} | Update an Fqdn

<a name="createFqdn"></a>
# **createFqdn**
> FqdnResponse createFqdn(body)

Create an Fqdn

Create a new FQDN object.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.FqdNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FqdNsApi apiInstance = new FqdNsApi();
CreateFqdnRequest body = new CreateFqdnRequest(); // CreateFqdnRequest | 
try {
    FqdnResponse result = apiInstance.createFqdn(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FqdNsApi#createFqdn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateFqdnRequest**](CreateFqdnRequest.md)|  | [optional]

### Return type

[**FqdnResponse**](FqdnResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFqdn"></a>
# **deleteFqdn**
> FqdnResponse deleteFqdn(id)

Delete an Fqdn

Delete an FQDN.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.FqdNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FqdNsApi apiInstance = new FqdNsApi();
UUID id = new UUID(); // UUID | Identifies the resource.
try {
    FqdnResponse result = apiInstance.deleteFqdn(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FqdNsApi#deleteFqdn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Identifies the resource. |

### Return type

[**FqdnResponse**](FqdnResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFqdns"></a>
# **listFqdns**
> ListFqdnsResponse listFqdns(pageNumber, pageSize, filterConnectionId, filterFqdn, filterPort, filterDnsRecordType)

List Fqdns

Get all FQDNs belonging to the user that match the given filters.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.FqdNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FqdNsApi apiInstance = new FqdNsApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
String filterConnectionId = "filterConnectionId_example"; // String | ID of the FQDN connection to which the FQDN belongs.
String filterFqdn = "filterFqdn_example"; // String | FQDN represented by the resource.
Integer filterPort = 56; // Integer | Port to use when connecting to the FQDN.
String filterDnsRecordType = "filterDnsRecordType_example"; // String | DNS record type used by the FQDN.
try {
    ListFqdnsResponse result = apiInstance.listFqdns(pageNumber, pageSize, filterConnectionId, filterFqdn, filterPort, filterDnsRecordType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FqdNsApi#listFqdns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]
 **filterConnectionId** | **String**| ID of the FQDN connection to which the FQDN belongs. | [optional]
 **filterFqdn** | **String**| FQDN represented by the resource. | [optional]
 **filterPort** | **Integer**| Port to use when connecting to the FQDN. | [optional]
 **filterDnsRecordType** | **String**| DNS record type used by the FQDN. | [optional]

### Return type

[**ListFqdnsResponse**](ListFqdnsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveFqdn"></a>
# **retrieveFqdn**
> FqdnResponse retrieveFqdn(id)

Retrieve an Fqdn

Return the details regarding a specific FQDN.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.FqdNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FqdNsApi apiInstance = new FqdNsApi();
UUID id = new UUID(); // UUID | Identifies the resource.
try {
    FqdnResponse result = apiInstance.retrieveFqdn(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FqdNsApi#retrieveFqdn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Identifies the resource. |

### Return type

[**FqdnResponse**](FqdnResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFqdn"></a>
# **updateFqdn**
> FqdnResponse updateFqdn(id, body)

Update an Fqdn

Update the details of a specific FQDN.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.FqdNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FqdNsApi apiInstance = new FqdNsApi();
UUID id = new UUID(); // UUID | Identifies the resource.
UpdateFqdnRequest body = new UpdateFqdnRequest(); // UpdateFqdnRequest | 
try {
    FqdnResponse result = apiInstance.updateFqdn(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FqdNsApi#updateFqdn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Identifies the resource. |
 **body** | [**UpdateFqdnRequest**](UpdateFqdnRequest.md)|  | [optional]

### Return type

[**FqdnResponse**](FqdnResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

