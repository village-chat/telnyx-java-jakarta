# MessagingHostedNumberApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMessagingHostedNumberOrder**](MessagingHostedNumberApi.md#createMessagingHostedNumberOrder) | **POST** /messaging_hosted_number_orders | Create a messaging hosted number order
[**createMessagingHostedNumberOrderWithHttpInfo**](MessagingHostedNumberApi.md#createMessagingHostedNumberOrderWithHttpInfo) | **POST** /messaging_hosted_number_orders | Create a messaging hosted number order
[**deleteMessagingHostedNumber**](MessagingHostedNumberApi.md#deleteMessagingHostedNumber) | **DELETE** /messaging_hosted_numbers/{id} | Delete a messaging hosted number
[**deleteMessagingHostedNumberWithHttpInfo**](MessagingHostedNumberApi.md#deleteMessagingHostedNumberWithHttpInfo) | **DELETE** /messaging_hosted_numbers/{id} | Delete a messaging hosted number
[**listMessagingHostedNumberOrder**](MessagingHostedNumberApi.md#listMessagingHostedNumberOrder) | **GET** /messaging_hosted_number_orders | List messaging hosted number orders
[**listMessagingHostedNumberOrderWithHttpInfo**](MessagingHostedNumberApi.md#listMessagingHostedNumberOrderWithHttpInfo) | **GET** /messaging_hosted_number_orders | List messaging hosted number orders
[**retrieveMessagingHostedNumberOrder**](MessagingHostedNumberApi.md#retrieveMessagingHostedNumberOrder) | **GET** /messaging_hosted_number_orders/{id} | Retrieve a messaging hosted number order
[**retrieveMessagingHostedNumberOrderWithHttpInfo**](MessagingHostedNumberApi.md#retrieveMessagingHostedNumberOrderWithHttpInfo) | **GET** /messaging_hosted_number_orders/{id} | Retrieve a messaging hosted number order
[**uploadFileMessagingHostedNumberOrder**](MessagingHostedNumberApi.md#uploadFileMessagingHostedNumberOrder) | **POST** /messaging_hosted_number_orders/{id}/actions/file_upload | Upload file required for a messaging hosted number order
[**uploadFileMessagingHostedNumberOrderWithHttpInfo**](MessagingHostedNumberApi.md#uploadFileMessagingHostedNumberOrderWithHttpInfo) | **POST** /messaging_hosted_number_orders/{id}/actions/file_upload | Upload file required for a messaging hosted number order



## createMessagingHostedNumberOrder

> CompletableFuture<RetrieveMessagingHostedNumberOrderResponse> createMessagingHostedNumberOrder(createMessagingHostedNumberOrderRequest)

Create a messaging hosted number order

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingHostedNumberApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        CreateMessagingHostedNumberOrderRequest createMessagingHostedNumberOrderRequest = new CreateMessagingHostedNumberOrderRequest(); // CreateMessagingHostedNumberOrderRequest | Message payload
        try {
            CompletableFuture<RetrieveMessagingHostedNumberOrderResponse> result = apiInstance.createMessagingHostedNumberOrder(createMessagingHostedNumberOrderRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#createMessagingHostedNumberOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createMessagingHostedNumberOrderRequest** | [**CreateMessagingHostedNumberOrderRequest**](CreateMessagingHostedNumberOrderRequest.md)| Message payload | [optional]

### Return type

CompletableFuture<[**RetrieveMessagingHostedNumberOrderResponse**](RetrieveMessagingHostedNumberOrderResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging hosted number order. |  -  |
| **0** | Unexpected error |  -  |

## createMessagingHostedNumberOrderWithHttpInfo

> CompletableFuture<ApiResponse<RetrieveMessagingHostedNumberOrderResponse>> createMessagingHostedNumberOrder createMessagingHostedNumberOrderWithHttpInfo(createMessagingHostedNumberOrderRequest)

Create a messaging hosted number order

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingHostedNumberApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        CreateMessagingHostedNumberOrderRequest createMessagingHostedNumberOrderRequest = new CreateMessagingHostedNumberOrderRequest(); // CreateMessagingHostedNumberOrderRequest | Message payload
        try {
            CompletableFuture<ApiResponse<RetrieveMessagingHostedNumberOrderResponse>> response = apiInstance.createMessagingHostedNumberOrderWithHttpInfo(createMessagingHostedNumberOrderRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingHostedNumberApi#createMessagingHostedNumberOrder");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#createMessagingHostedNumberOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createMessagingHostedNumberOrderRequest** | [**CreateMessagingHostedNumberOrderRequest**](CreateMessagingHostedNumberOrderRequest.md)| Message payload | [optional]

### Return type

CompletableFuture<ApiResponse<[**RetrieveMessagingHostedNumberOrderResponse**](RetrieveMessagingHostedNumberOrderResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging hosted number order. |  -  |
| **0** | Unexpected error |  -  |


## deleteMessagingHostedNumber

> CompletableFuture<RetrieveMessagingHostedNumberResponse> deleteMessagingHostedNumber(id)

Delete a messaging hosted number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingHostedNumberApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        try {
            CompletableFuture<RetrieveMessagingHostedNumberResponse> result = apiInstance.deleteMessagingHostedNumber(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#deleteMessagingHostedNumber");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the type of resource. |

### Return type

CompletableFuture<[**RetrieveMessagingHostedNumberResponse**](RetrieveMessagingHostedNumberResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging hosted number. |  -  |
| **0** | Unexpected error |  -  |

## deleteMessagingHostedNumberWithHttpInfo

> CompletableFuture<ApiResponse<RetrieveMessagingHostedNumberResponse>> deleteMessagingHostedNumber deleteMessagingHostedNumberWithHttpInfo(id)

Delete a messaging hosted number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingHostedNumberApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        try {
            CompletableFuture<ApiResponse<RetrieveMessagingHostedNumberResponse>> response = apiInstance.deleteMessagingHostedNumberWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingHostedNumberApi#deleteMessagingHostedNumber");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#deleteMessagingHostedNumber");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the type of resource. |

### Return type

CompletableFuture<ApiResponse<[**RetrieveMessagingHostedNumberResponse**](RetrieveMessagingHostedNumberResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging hosted number. |  -  |
| **0** | Unexpected error |  -  |


## listMessagingHostedNumberOrder

> CompletableFuture<ListMessagingHostedNumberOrderResponse> listMessagingHostedNumberOrder()

List messaging hosted number orders

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingHostedNumberApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        try {
            CompletableFuture<ListMessagingHostedNumberOrderResponse> result = apiInstance.listMessagingHostedNumberOrder();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#listMessagingHostedNumberOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<[**ListMessagingHostedNumberOrderResponse**](ListMessagingHostedNumberOrderResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging hosted number orders. |  -  |
| **0** | Unexpected error |  -  |

## listMessagingHostedNumberOrderWithHttpInfo

> CompletableFuture<ApiResponse<ListMessagingHostedNumberOrderResponse>> listMessagingHostedNumberOrder listMessagingHostedNumberOrderWithHttpInfo()

List messaging hosted number orders

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingHostedNumberApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<ListMessagingHostedNumberOrderResponse>> response = apiInstance.listMessagingHostedNumberOrderWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingHostedNumberApi#listMessagingHostedNumberOrder");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#listMessagingHostedNumberOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**ListMessagingHostedNumberOrderResponse**](ListMessagingHostedNumberOrderResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging hosted number orders. |  -  |
| **0** | Unexpected error |  -  |


## retrieveMessagingHostedNumberOrder

> CompletableFuture<RetrieveMessagingHostedNumberOrderResponse> retrieveMessagingHostedNumberOrder(id)

Retrieve a messaging hosted number order

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingHostedNumberApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        try {
            CompletableFuture<RetrieveMessagingHostedNumberOrderResponse> result = apiInstance.retrieveMessagingHostedNumberOrder(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#retrieveMessagingHostedNumberOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the type of resource. |

### Return type

CompletableFuture<[**RetrieveMessagingHostedNumberOrderResponse**](RetrieveMessagingHostedNumberOrderResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging hosted number order. |  -  |
| **0** | Unexpected error |  -  |

## retrieveMessagingHostedNumberOrderWithHttpInfo

> CompletableFuture<ApiResponse<RetrieveMessagingHostedNumberOrderResponse>> retrieveMessagingHostedNumberOrder retrieveMessagingHostedNumberOrderWithHttpInfo(id)

Retrieve a messaging hosted number order

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingHostedNumberApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        try {
            CompletableFuture<ApiResponse<RetrieveMessagingHostedNumberOrderResponse>> response = apiInstance.retrieveMessagingHostedNumberOrderWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingHostedNumberApi#retrieveMessagingHostedNumberOrder");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#retrieveMessagingHostedNumberOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the type of resource. |

### Return type

CompletableFuture<ApiResponse<[**RetrieveMessagingHostedNumberOrderResponse**](RetrieveMessagingHostedNumberOrderResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging hosted number order. |  -  |
| **0** | Unexpected error |  -  |


## uploadFileMessagingHostedNumberOrder

> CompletableFuture<RetrieveMessagingHostedNumberOrderResponse> uploadFileMessagingHostedNumberOrder(id, loa, bill)

Upload file required for a messaging hosted number order

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingHostedNumberApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        File loa = new File("/path/to/file"); // File | Must be a signed LOA for the numbers in the order in PDF format.
        File bill = new File("/path/to/file"); // File | Must be the last month's bill with proof of ownership of all of the numbers in the order in PDF format.
        try {
            CompletableFuture<RetrieveMessagingHostedNumberOrderResponse> result = apiInstance.uploadFileMessagingHostedNumberOrder(id, loa, bill);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#uploadFileMessagingHostedNumberOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the type of resource. |
 **loa** | **File**| Must be a signed LOA for the numbers in the order in PDF format. | [optional]
 **bill** | **File**| Must be the last month&#39;s bill with proof of ownership of all of the numbers in the order in PDF format. | [optional]

### Return type

CompletableFuture<[**RetrieveMessagingHostedNumberOrderResponse**](RetrieveMessagingHostedNumberOrderResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging hosted number order. |  -  |
| **0** | Unexpected error |  -  |

## uploadFileMessagingHostedNumberOrderWithHttpInfo

> CompletableFuture<ApiResponse<RetrieveMessagingHostedNumberOrderResponse>> uploadFileMessagingHostedNumberOrder uploadFileMessagingHostedNumberOrderWithHttpInfo(id, loa, bill)

Upload file required for a messaging hosted number order

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingHostedNumberApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        File loa = new File("/path/to/file"); // File | Must be a signed LOA for the numbers in the order in PDF format.
        File bill = new File("/path/to/file"); // File | Must be the last month's bill with proof of ownership of all of the numbers in the order in PDF format.
        try {
            CompletableFuture<ApiResponse<RetrieveMessagingHostedNumberOrderResponse>> response = apiInstance.uploadFileMessagingHostedNumberOrderWithHttpInfo(id, loa, bill);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingHostedNumberApi#uploadFileMessagingHostedNumberOrder");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#uploadFileMessagingHostedNumberOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the type of resource. |
 **loa** | **File**| Must be a signed LOA for the numbers in the order in PDF format. | [optional]
 **bill** | **File**| Must be the last month&#39;s bill with proof of ownership of all of the numbers in the order in PDF format. | [optional]

### Return type

CompletableFuture<ApiResponse<[**RetrieveMessagingHostedNumberOrderResponse**](RetrieveMessagingHostedNumberOrderResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging hosted number order. |  -  |
| **0** | Unexpected error |  -  |

