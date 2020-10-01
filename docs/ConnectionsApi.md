# ConnectionsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listConnections**](ConnectionsApi.md#listConnections) | **GET** /connections | List connections
[**retrieveConnection**](ConnectionsApi.md#retrieveConnection) | **GET** /connections/{id} | Retrieve a connection

<a name="listConnections"></a>
# **listConnections**
> ListConnectionsResponse listConnections(pageNumber, pageSize, filterConnectionNameContains, filterOutboundVoiceProfileId, sort)

List connections

Returns a list of your connections irrespective of type.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConnectionsApi apiInstance = new ConnectionsApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
String filterConnectionNameContains = "null"; // String | If present, connections with <code>connection_name</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
String filterOutboundVoiceProfileId = "filterOutboundVoiceProfileId_example"; // String | Identifies the associated outbound voice profile.
String sort = "created_at"; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>connection_name</code>: sorts the result by the     <code>connection_name</code> field in ascending order.   </li>    <li>     <code>-connection_name</code>: sorts the result by the     <code>connection_name</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
try {
    ListConnectionsResponse result = apiInstance.listConnections(pageNumber, pageSize, filterConnectionNameContains, filterOutboundVoiceProfileId, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#listConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]
 **filterConnectionNameContains** | **String**| If present, connections with &lt;code&gt;connection_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to null]
 **filterOutboundVoiceProfileId** | **String**| Identifies the associated outbound voice profile. | [optional]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, connection_name, active]

### Return type

[**ListConnectionsResponse**](ListConnectionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveConnection"></a>
# **retrieveConnection**
> ConnectionResponse retrieveConnection(id)

Retrieve a connection

Retrieves the high-level details of an existing connection. To retrieve specific authentication information, use the endpoint for the specific connection type.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConnectionsApi apiInstance = new ConnectionsApi();
String id = "id_example"; // String | IP Connection ID
try {
    ConnectionResponse result = apiInstance.retrieveConnection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#retrieveConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| IP Connection ID |

### Return type

[**ConnectionResponse**](ConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

