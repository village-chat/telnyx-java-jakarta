# IpConnectionsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIpConnection**](IpConnectionsApi.md#createIpConnection) | **POST** /ip_connections | Create an Ip connection
[**deleteIpConnection**](IpConnectionsApi.md#deleteIpConnection) | **DELETE** /ip_connections/{id} | Delete an Ip connection
[**listIpConnections**](IpConnectionsApi.md#listIpConnections) | **GET** /ip_connections | List Ip connections
[**retrieveIpConnection**](IpConnectionsApi.md#retrieveIpConnection) | **GET** /ip_connections/{id} | Retrieve an Ip connection
[**updateIpConnection**](IpConnectionsApi.md#updateIpConnection) | **PATCH** /ip_connections/{id} | Update an Ip connection

<a name="createIpConnection"></a>
# **createIpConnection**
> IpConnectionResponse createIpConnection(body)

Create an Ip connection

Creates an IP connection.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.IpConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IpConnectionsApi apiInstance = new IpConnectionsApi();
CreateIpConnectionRequest body = new CreateIpConnectionRequest(); // CreateIpConnectionRequest | Parameters that can be defined during IP connection creation
try {
    IpConnectionResponse result = apiInstance.createIpConnection(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpConnectionsApi#createIpConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateIpConnectionRequest**](CreateIpConnectionRequest.md)| Parameters that can be defined during IP connection creation |

### Return type

[**IpConnectionResponse**](IpConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIpConnection"></a>
# **deleteIpConnection**
> IpConnectionResponse deleteIpConnection(id)

Delete an Ip connection

Deletes an existing IP connection.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.IpConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IpConnectionsApi apiInstance = new IpConnectionsApi();
String id = "id_example"; // String | Identifies the type of resource.
try {
    IpConnectionResponse result = apiInstance.deleteIpConnection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpConnectionsApi#deleteIpConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the type of resource. |

### Return type

[**IpConnectionResponse**](IpConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIpConnections"></a>
# **listIpConnections**
> ListIpConnectionsResponse listIpConnections(pageNumber, pageSize, filterConnectionNameContains, filterOutboundOutboundVoiceProfileId, sort)

List Ip connections

Returns a list of your IP connections.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.IpConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IpConnectionsApi apiInstance = new IpConnectionsApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
String filterConnectionNameContains = "null"; // String | If present, connections with <code>connection_name</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
String filterOutboundOutboundVoiceProfileId = "filterOutboundOutboundVoiceProfileId_example"; // String | Identifies the associated outbound voice profile.
String sort = "created_at"; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>connection_name</code>: sorts the result by the     <code>connection_name</code> field in ascending order.   </li>    <li>     <code>-connection_name</code>: sorts the result by the     <code>connection_name</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
try {
    ListIpConnectionsResponse result = apiInstance.listIpConnections(pageNumber, pageSize, filterConnectionNameContains, filterOutboundOutboundVoiceProfileId, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpConnectionsApi#listIpConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]
 **filterConnectionNameContains** | **String**| If present, connections with &lt;code&gt;connection_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to null]
 **filterOutboundOutboundVoiceProfileId** | **String**| Identifies the associated outbound voice profile. | [optional]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, connection_name, active]

### Return type

[**ListIpConnectionsResponse**](ListIpConnectionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveIpConnection"></a>
# **retrieveIpConnection**
> IpConnectionResponse retrieveIpConnection(id)

Retrieve an Ip connection

Retrieves the details of an existing ip connection.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.IpConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IpConnectionsApi apiInstance = new IpConnectionsApi();
String id = "id_example"; // String | IP Connection ID
try {
    IpConnectionResponse result = apiInstance.retrieveIpConnection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpConnectionsApi#retrieveIpConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| IP Connection ID |

### Return type

[**IpConnectionResponse**](IpConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIpConnection"></a>
# **updateIpConnection**
> IpConnectionResponse updateIpConnection(body, id)

Update an Ip connection

Updates settings of an existing IP connection.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.IpConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IpConnectionsApi apiInstance = new IpConnectionsApi();
UpdateIpConnectionRequest body = new UpdateIpConnectionRequest(); // UpdateIpConnectionRequest | Parameters that can be updated in a IP connection
String id = "id_example"; // String | Identifies the type of resource.
try {
    IpConnectionResponse result = apiInstance.updateIpConnection(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpConnectionsApi#updateIpConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateIpConnectionRequest**](UpdateIpConnectionRequest.md)| Parameters that can be updated in a IP connection |
 **id** | **String**| Identifies the type of resource. |

### Return type

[**IpConnectionResponse**](IpConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

