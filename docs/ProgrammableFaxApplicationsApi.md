# ProgrammableFaxApplicationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFaxApplication**](ProgrammableFaxApplicationsApi.md#createFaxApplication) | **POST** /fax_applications | Creates a Fax Application
[**deleteFaxApplication**](ProgrammableFaxApplicationsApi.md#deleteFaxApplication) | **DELETE** /fax_applications/{id} | Deletes a Fax Application
[**getFaxApplication**](ProgrammableFaxApplicationsApi.md#getFaxApplication) | **GET** /fax_applications/{id} | Retrieve a Fax Application
[**listFaxApplications**](ProgrammableFaxApplicationsApi.md#listFaxApplications) | **GET** /fax_applications | List all Fax Applications
[**updateFaxApplication**](ProgrammableFaxApplicationsApi.md#updateFaxApplication) | **PATCH** /fax_applications/{id} | Update a Fax Application

<a name="createFaxApplication"></a>
# **createFaxApplication**
> InlineResponse2011 createFaxApplication(body)

Creates a Fax Application

Creates a new Fax Application based on the parameters sent in the request. The application name and webhook URL are required. Once created, you can assign phone numbers to your application using the &#x60;/phone_numbers&#x60; endpoint.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ProgrammableFaxApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProgrammableFaxApplicationsApi apiInstance = new ProgrammableFaxApplicationsApi();
CreateFaxApplicationRequest body = new CreateFaxApplicationRequest(); // CreateFaxApplicationRequest | Parameters that can be set when creating a Fax Application
try {
    InlineResponse2011 result = apiInstance.createFaxApplication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgrammableFaxApplicationsApi#createFaxApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateFaxApplicationRequest**](CreateFaxApplicationRequest.md)| Parameters that can be set when creating a Fax Application |

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFaxApplication"></a>
# **deleteFaxApplication**
> InlineResponse2011 deleteFaxApplication(id)

Deletes a Fax Application

Permanently deletes a Fax Application. Deletion may be prevented if the application is in use by phone numbers.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ProgrammableFaxApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProgrammableFaxApplicationsApi apiInstance = new ProgrammableFaxApplicationsApi();
String id = "id_example"; // String | Identifies the resource.
try {
    InlineResponse2011 result = apiInstance.deleteFaxApplication(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgrammableFaxApplicationsApi#deleteFaxApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the resource. |

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFaxApplication"></a>
# **getFaxApplication**
> InlineResponse2011 getFaxApplication(id)

Retrieve a Fax Application

Return the details of an existing Fax Application inside the &#x27;data&#x27; attribute of the response.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ProgrammableFaxApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProgrammableFaxApplicationsApi apiInstance = new ProgrammableFaxApplicationsApi();
String id = "id_example"; // String | Identifies the resource.
try {
    InlineResponse2011 result = apiInstance.getFaxApplication(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgrammableFaxApplicationsApi#getFaxApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the resource. |

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFaxApplications"></a>
# **listFaxApplications**
> InlineResponse2001 listFaxApplications(pageNumber, pageSize, filterApplicationNameContains, filterOutboundOutboundVoiceProfileId, sort)

List all Fax Applications

This endpoint returns a list of your Fax Applications inside the &#x27;data&#x27; attribute of the response. You can adjust which applications are listed by using filters. Fax Applications are used to configure how you send and receive faxes using the Programmable Fax API with Telnyx.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ProgrammableFaxApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProgrammableFaxApplicationsApi apiInstance = new ProgrammableFaxApplicationsApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
String filterApplicationNameContains = "null"; // String | If present, applications with <code>application_name</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
String filterOutboundOutboundVoiceProfileId = "filterOutboundOutboundVoiceProfileId_example"; // String | Identifies the associated outbound voice profile.
String sort = "created_at"; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>connection_name</code>: sorts the result by the     <code>connection_name</code> field in ascending order.   </li>    <li>     <code>-connection_name</code>: sorts the result by the     <code>connection_name</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
try {
    InlineResponse2001 result = apiInstance.listFaxApplications(pageNumber, pageSize, filterApplicationNameContains, filterOutboundOutboundVoiceProfileId, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgrammableFaxApplicationsApi#listFaxApplications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]
 **filterApplicationNameContains** | **String**| If present, applications with &lt;code&gt;application_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to null]
 **filterOutboundOutboundVoiceProfileId** | **String**| Identifies the associated outbound voice profile. | [optional]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, connection_name, active]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFaxApplication"></a>
# **updateFaxApplication**
> InlineResponse2011 updateFaxApplication(body, id)

Update a Fax Application

Updates settings of an existing Fax Application based on the parameters of the request.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ProgrammableFaxApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProgrammableFaxApplicationsApi apiInstance = new ProgrammableFaxApplicationsApi();
UpdateFaxApplicationRequest body = new UpdateFaxApplicationRequest(); // UpdateFaxApplicationRequest | Parameters to be updated for the Fax Application
String id = "id_example"; // String | Identifies the resource.
try {
    InlineResponse2011 result = apiInstance.updateFaxApplication(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgrammableFaxApplicationsApi#updateFaxApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateFaxApplicationRequest**](UpdateFaxApplicationRequest.md)| Parameters to be updated for the Fax Application |
 **id** | **String**| Identifies the resource. |

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

