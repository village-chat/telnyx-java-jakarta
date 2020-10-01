# TeXmlApplicationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTexmlApplication**](TeXmlApplicationsApi.md#createTexmlApplication) | **POST** /texml_applications | Creates a TeXML Application
[**deleteTexmlApplication**](TeXmlApplicationsApi.md#deleteTexmlApplication) | **DELETE** /texml_applications/{id} | Deletes a TeXML Application
[**findTexmlApplications**](TeXmlApplicationsApi.md#findTexmlApplications) | **GET** /texml_applications | List all TeXML Applications
[**getTexmlApplication**](TeXmlApplicationsApi.md#getTexmlApplication) | **GET** /texml_applications/{id} | Retrieve a TeXML Application
[**updateTexmlApplication**](TeXmlApplicationsApi.md#updateTexmlApplication) | **PATCH** /texml_applications/{id} | Update a TeXML Application

<a name="createTexmlApplication"></a>
# **createTexmlApplication**
> InlineResponse201 createTexmlApplication(body)

Creates a TeXML Application

Creates a TeXML Application.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.TeXmlApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TeXmlApplicationsApi apiInstance = new TeXmlApplicationsApi();
CreateTexmlApplicationRequest body = new CreateTexmlApplicationRequest(); // CreateTexmlApplicationRequest | Parameters that can be set when creating a TeXML Application
try {
    InlineResponse201 result = apiInstance.createTexmlApplication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeXmlApplicationsApi#createTexmlApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateTexmlApplicationRequest**](CreateTexmlApplicationRequest.md)| Parameters that can be set when creating a TeXML Application |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTexmlApplication"></a>
# **deleteTexmlApplication**
> InlineResponse201 deleteTexmlApplication(id)

Deletes a TeXML Application

Deletes a TeXML Application.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.TeXmlApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TeXmlApplicationsApi apiInstance = new TeXmlApplicationsApi();
String id = "id_example"; // String | Identifies the resource.
try {
    InlineResponse201 result = apiInstance.deleteTexmlApplication(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeXmlApplicationsApi#deleteTexmlApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the resource. |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findTexmlApplications"></a>
# **findTexmlApplications**
> InlineResponse200 findTexmlApplications(pageNumber, pageSize, filterFriendlyNameContains, filterOutboundOutboundVoiceProfileId, sort)

List all TeXML Applications

Returns a list of your TeXML Applications.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.TeXmlApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TeXmlApplicationsApi apiInstance = new TeXmlApplicationsApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
String filterFriendlyNameContains = "null"; // String | If present, applications with <code>friendly_name</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
String filterOutboundOutboundVoiceProfileId = "filterOutboundOutboundVoiceProfileId_example"; // String | Identifies the associated outbound voice profile.
String sort = "created_at"; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>connection_name</code>: sorts the result by the     <code>connection_name</code> field in ascending order.   </li>    <li>     <code>-connection_name</code>: sorts the result by the     <code>connection_name</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
try {
    InlineResponse200 result = apiInstance.findTexmlApplications(pageNumber, pageSize, filterFriendlyNameContains, filterOutboundOutboundVoiceProfileId, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeXmlApplicationsApi#findTexmlApplications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]
 **filterFriendlyNameContains** | **String**| If present, applications with &lt;code&gt;friendly_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to null]
 **filterOutboundOutboundVoiceProfileId** | **String**| Identifies the associated outbound voice profile. | [optional]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, connection_name, active]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTexmlApplication"></a>
# **getTexmlApplication**
> InlineResponse201 getTexmlApplication(id)

Retrieve a TeXML Application

Retrieves the details of an existing TeXML Application.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.TeXmlApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TeXmlApplicationsApi apiInstance = new TeXmlApplicationsApi();
String id = "id_example"; // String | Identifies the resource.
try {
    InlineResponse201 result = apiInstance.getTexmlApplication(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeXmlApplicationsApi#getTexmlApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the resource. |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTexmlApplication"></a>
# **updateTexmlApplication**
> InlineResponse201 updateTexmlApplication(body, id)

Update a TeXML Application

Updates settings of an existing TeXML Application.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.TeXmlApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TeXmlApplicationsApi apiInstance = new TeXmlApplicationsApi();
UpdateTexmlApplicationRequest body = new UpdateTexmlApplicationRequest(); // UpdateTexmlApplicationRequest | Parameters that can be updated in a TeXML Application
String id = "id_example"; // String | Identifies the resource.
try {
    InlineResponse201 result = apiInstance.updateTexmlApplication(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeXmlApplicationsApi#updateTexmlApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateTexmlApplicationRequest**](UpdateTexmlApplicationRequest.md)| Parameters that can be updated in a TeXML Application |
 **id** | **String**| Identifies the resource. |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

