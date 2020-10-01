# CredentialConnectionsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCredentialConnection**](CredentialConnectionsApi.md#createCredentialConnection) | **POST** /credential_connections | Create a credential connection
[**deleteCredentialConnection**](CredentialConnectionsApi.md#deleteCredentialConnection) | **DELETE** /credential_connections/{id} | Delete a credential connection
[**listCredentialConnections**](CredentialConnectionsApi.md#listCredentialConnections) | **GET** /credential_connections | List credential connections
[**retrieveCredentialConnection**](CredentialConnectionsApi.md#retrieveCredentialConnection) | **GET** /credential_connections/{id} | Retrieve a connection
[**updateCredentialConnection**](CredentialConnectionsApi.md#updateCredentialConnection) | **PATCH** /credential_connections/{id} | Update a credential connection

<a name="createCredentialConnection"></a>
# **createCredentialConnection**
> CredentialConnectionResponse createCredentialConnection(body)

Create a credential connection

Creates a credential connection.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CredentialConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CredentialConnectionsApi apiInstance = new CredentialConnectionsApi();
CreateCredentialConnectionRequest body = new CreateCredentialConnectionRequest(); // CreateCredentialConnectionRequest | Parameters that can be defined during credential connection creation
try {
    CredentialConnectionResponse result = apiInstance.createCredentialConnection(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CredentialConnectionsApi#createCredentialConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateCredentialConnectionRequest**](CreateCredentialConnectionRequest.md)| Parameters that can be defined during credential connection creation |

### Return type

[**CredentialConnectionResponse**](CredentialConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCredentialConnection"></a>
# **deleteCredentialConnection**
> CredentialConnectionResponse deleteCredentialConnection(id)

Delete a credential connection

Deletes an existing credential connection.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CredentialConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CredentialConnectionsApi apiInstance = new CredentialConnectionsApi();
String id = "id_example"; // String | Identifies the resource.
try {
    CredentialConnectionResponse result = apiInstance.deleteCredentialConnection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CredentialConnectionsApi#deleteCredentialConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the resource. |

### Return type

[**CredentialConnectionResponse**](CredentialConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCredentialConnections"></a>
# **listCredentialConnections**
> ListCredentialConnectionsResponse listCredentialConnections(pageNumber, pageSize, filterConnectionNameContains, filterOutboundOutboundVoiceProfileId, sort)

List credential connections

Returns a list of your credential connections.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CredentialConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CredentialConnectionsApi apiInstance = new CredentialConnectionsApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
String filterConnectionNameContains = "null"; // String | If present, connections with <code>connection_name</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
String filterOutboundOutboundVoiceProfileId = "filterOutboundOutboundVoiceProfileId_example"; // String | Identifies the associated outbound voice profile.
String sort = "created_at"; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>connection_name</code>: sorts the result by the     <code>connection_name</code> field in ascending order.   </li>    <li>     <code>-connection_name</code>: sorts the result by the     <code>connection_name</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
try {
    ListCredentialConnectionsResponse result = apiInstance.listCredentialConnections(pageNumber, pageSize, filterConnectionNameContains, filterOutboundOutboundVoiceProfileId, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CredentialConnectionsApi#listCredentialConnections");
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

[**ListCredentialConnectionsResponse**](ListCredentialConnectionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveCredentialConnection"></a>
# **retrieveCredentialConnection**
> CredentialConnectionResponse retrieveCredentialConnection(id)

Retrieve a connection

Retrieves the details of an existing credential connection.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CredentialConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CredentialConnectionsApi apiInstance = new CredentialConnectionsApi();
String id = "id_example"; // String | Identifies the resource.
try {
    CredentialConnectionResponse result = apiInstance.retrieveCredentialConnection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CredentialConnectionsApi#retrieveCredentialConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the resource. |

### Return type

[**CredentialConnectionResponse**](CredentialConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCredentialConnection"></a>
# **updateCredentialConnection**
> CredentialConnectionResponse updateCredentialConnection(body, id)

Update a credential connection

Updates settings of an existing credential connection.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CredentialConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CredentialConnectionsApi apiInstance = new CredentialConnectionsApi();
UpdateCredentialConnectionRequest body = new UpdateCredentialConnectionRequest(); // UpdateCredentialConnectionRequest | Parameters that can be updated in a credential connection
String id = "id_example"; // String | Identifies the resource.
try {
    CredentialConnectionResponse result = apiInstance.updateCredentialConnection(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CredentialConnectionsApi#updateCredentialConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateCredentialConnectionRequest**](UpdateCredentialConnectionRequest.md)| Parameters that can be updated in a credential connection |
 **id** | **String**| Identifies the resource. |

### Return type

[**CredentialConnectionResponse**](CredentialConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

