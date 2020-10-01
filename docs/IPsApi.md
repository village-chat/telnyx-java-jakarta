# IPsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIp**](IPsApi.md#createIp) | **POST** /ips | Create an Ip
[**deleteIp**](IPsApi.md#deleteIp) | **DELETE** /ips/{id} | Delete an Ip
[**listIps**](IPsApi.md#listIps) | **GET** /ips | List Ips
[**retrieveIp**](IPsApi.md#retrieveIp) | **GET** /ips/{id} | Retrieve an Ip
[**updateIp**](IPsApi.md#updateIp) | **PATCH** /ips/{id} | Update an Ip

<a name="createIp"></a>
# **createIp**
> IpResponse createIp(body)

Create an Ip

Create a new IP object.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.IPsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IPsApi apiInstance = new IPsApi();
CreateIpRequest body = new CreateIpRequest(); // CreateIpRequest | 
try {
    IpResponse result = apiInstance.createIp(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IPsApi#createIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateIpRequest**](CreateIpRequest.md)|  | [optional]

### Return type

[**IpResponse**](IpResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIp"></a>
# **deleteIp**
> IpResponse deleteIp(id)

Delete an Ip

Delete an IP.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.IPsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IPsApi apiInstance = new IPsApi();
UUID id = new UUID(); // UUID | Identifies the type of resource.
try {
    IpResponse result = apiInstance.deleteIp(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IPsApi#deleteIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Identifies the type of resource. |

### Return type

[**IpResponse**](IpResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIps"></a>
# **listIps**
> ListIpsResponse listIps(pageNumber, pageSize, filterConnectionId, filterIpAddress, filterPort)

List Ips

Get all IPs belonging to the user that match the given filters.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.IPsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IPsApi apiInstance = new IPsApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
String filterConnectionId = "filterConnectionId_example"; // String | ID of the IP Connection to which this IP should be attached.
String filterIpAddress = "filterIpAddress_example"; // String | IP adddress represented by this resource.
Integer filterPort = 56; // Integer | Port to use when connecting to this IP.
try {
    ListIpsResponse result = apiInstance.listIps(pageNumber, pageSize, filterConnectionId, filterIpAddress, filterPort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IPsApi#listIps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]
 **filterConnectionId** | **String**| ID of the IP Connection to which this IP should be attached. | [optional]
 **filterIpAddress** | **String**| IP adddress represented by this resource. | [optional]
 **filterPort** | **Integer**| Port to use when connecting to this IP. | [optional]

### Return type

[**ListIpsResponse**](ListIpsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveIp"></a>
# **retrieveIp**
> IpResponse retrieveIp(id)

Retrieve an Ip

Return the details regarding a specific IP.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.IPsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IPsApi apiInstance = new IPsApi();
UUID id = new UUID(); // UUID | Identifies the type of resource.
try {
    IpResponse result = apiInstance.retrieveIp(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IPsApi#retrieveIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Identifies the type of resource. |

### Return type

[**IpResponse**](IpResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIp"></a>
# **updateIp**
> IpResponse updateIp(id, body)

Update an Ip

Update the details of a specific IP.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.IPsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IPsApi apiInstance = new IPsApi();
UUID id = new UUID(); // UUID | Identifies the type of resource.
UpdateIpRequest body = new UpdateIpRequest(); // UpdateIpRequest | 
try {
    IpResponse result = apiInstance.updateIp(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IPsApi#updateIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Identifies the type of resource. |
 **body** | [**UpdateIpRequest**](UpdateIpRequest.md)|  | [optional]

### Return type

[**IpResponse**](IpResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

