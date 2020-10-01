# FqdnConnectionsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFqdnConnection**](FqdnConnectionsApi.md#createFqdnConnection) | **POST** /fqdn_connections | Create an Fqdn connection
[**deleteFqdnConnection**](FqdnConnectionsApi.md#deleteFqdnConnection) | **DELETE** /fqdn_connections/{id} | Delete an Fqdn connection
[**listFqdnConnections**](FqdnConnectionsApi.md#listFqdnConnections) | **GET** /fqdn_connections | List Fqdn connections
[**retrieveFqdnConnection**](FqdnConnectionsApi.md#retrieveFqdnConnection) | **GET** /fqdn_connections/{id} | Retrieve an Fqdn connection
[**updateFqdnConnection**](FqdnConnectionsApi.md#updateFqdnConnection) | **PATCH** /fqdn_connections/{id} | Update an Fqdn connection

<a name="createFqdnConnection"></a>
# **createFqdnConnection**
> FqdnConnectionResponse createFqdnConnection(body)

Create an Fqdn connection

Creates a FQDN connection.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.FqdnConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FqdnConnectionsApi apiInstance = new FqdnConnectionsApi();
CreateFqdnConnectionRequest body = new CreateFqdnConnectionRequest(); // CreateFqdnConnectionRequest | Parameters that can be defined during FQDN connection creation
try {
    FqdnConnectionResponse result = apiInstance.createFqdnConnection(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FqdnConnectionsApi#createFqdnConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateFqdnConnectionRequest**](CreateFqdnConnectionRequest.md)| Parameters that can be defined during FQDN connection creation |

### Return type

[**FqdnConnectionResponse**](FqdnConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFqdnConnection"></a>
# **deleteFqdnConnection**
> FqdnConnectionResponse deleteFqdnConnection(id)

Delete an Fqdn connection

Deletes an FQDN connection.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.FqdnConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FqdnConnectionsApi apiInstance = new FqdnConnectionsApi();
String id = "id_example"; // String | FQDN Connection ID
try {
    FqdnConnectionResponse result = apiInstance.deleteFqdnConnection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FqdnConnectionsApi#deleteFqdnConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| FQDN Connection ID |

### Return type

[**FqdnConnectionResponse**](FqdnConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFqdnConnections"></a>
# **listFqdnConnections**
> ListFqdnConnectionsResponse listFqdnConnections(pageNumber, pageSize, filterConnectionNameContains, sort)

List Fqdn connections

Returns a list of your FQDN connections.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.FqdnConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FqdnConnectionsApi apiInstance = new FqdnConnectionsApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
String filterConnectionNameContains = "null"; // String | If present, connections with <code>connection_name</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
String sort = "created_at"; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>connection_name</code>: sorts the result by the     <code>connection_name</code> field in ascending order.   </li>    <li>     <code>-connection_name</code>: sorts the result by the     <code>connection_name</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
try {
    ListFqdnConnectionsResponse result = apiInstance.listFqdnConnections(pageNumber, pageSize, filterConnectionNameContains, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FqdnConnectionsApi#listFqdnConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]
 **filterConnectionNameContains** | **String**| If present, connections with &lt;code&gt;connection_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to null]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, connection_name, active]

### Return type

[**ListFqdnConnectionsResponse**](ListFqdnConnectionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveFqdnConnection"></a>
# **retrieveFqdnConnection**
> FqdnConnectionResponse retrieveFqdnConnection(id)

Retrieve an Fqdn connection

Retrieves the details of an existing FQDN connection.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.FqdnConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FqdnConnectionsApi apiInstance = new FqdnConnectionsApi();
String id = "id_example"; // String | FQDN Connection ID
try {
    FqdnConnectionResponse result = apiInstance.retrieveFqdnConnection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FqdnConnectionsApi#retrieveFqdnConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| FQDN Connection ID |

### Return type

[**FqdnConnectionResponse**](FqdnConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFqdnConnection"></a>
# **updateFqdnConnection**
> FqdnConnectionResponse updateFqdnConnection(body, id)

Update an Fqdn connection

Updates settings of an existing FQDN connection.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.FqdnConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FqdnConnectionsApi apiInstance = new FqdnConnectionsApi();
UpdateFqdnConnectionRequest body = new UpdateFqdnConnectionRequest(); // UpdateFqdnConnectionRequest | Parameters that can be updated in a FQDN connection
String id = "id_example"; // String | FQDN Connection ID
try {
    FqdnConnectionResponse result = apiInstance.updateFqdnConnection(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FqdnConnectionsApi#updateFqdnConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateFqdnConnectionRequest**](UpdateFqdnConnectionRequest.md)| Parameters that can be updated in a FQDN connection |
 **id** | **String**| FQDN Connection ID |

### Return type

[**FqdnConnectionResponse**](FqdnConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

