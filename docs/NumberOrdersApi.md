# NumberOrdersApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNumberOrder**](NumberOrdersApi.md#createNumberOrder) | **POST** /number_orders | Create a number order
[**createNumberOrderWithHttpInfo**](NumberOrdersApi.md#createNumberOrderWithHttpInfo) | **POST** /number_orders | Create a number order
[**listNumberOrders**](NumberOrdersApi.md#listNumberOrders) | **GET** /number_orders | List number orders
[**listNumberOrdersWithHttpInfo**](NumberOrdersApi.md#listNumberOrdersWithHttpInfo) | **GET** /number_orders | List number orders
[**retrieveNumberOrder**](NumberOrdersApi.md#retrieveNumberOrder) | **GET** /number_orders/{number_order_id} | Retrieve a number order
[**retrieveNumberOrderWithHttpInfo**](NumberOrdersApi.md#retrieveNumberOrderWithHttpInfo) | **GET** /number_orders/{number_order_id} | Retrieve a number order
[**updateNumberOrder**](NumberOrdersApi.md#updateNumberOrder) | **PATCH** /number_orders/{number_order_id} | Update a number order
[**updateNumberOrderWithHttpInfo**](NumberOrdersApi.md#updateNumberOrderWithHttpInfo) | **PATCH** /number_orders/{number_order_id} | Update a number order



## createNumberOrder

> CompletableFuture<NumberOrderResponse> createNumberOrder(createNumberOrderRequest)

Create a number order

Creates a phone number order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrdersApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrdersApi apiInstance = new NumberOrdersApi(defaultClient);
        CreateNumberOrderRequest createNumberOrderRequest = new CreateNumberOrderRequest(); // CreateNumberOrderRequest | 
        try {
            CompletableFuture<NumberOrderResponse> result = apiInstance.createNumberOrder(createNumberOrderRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrdersApi#createNumberOrder");
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
 **createNumberOrderRequest** | [**CreateNumberOrderRequest**](CreateNumberOrderRequest.md)|  |

### Return type

CompletableFuture<[**NumberOrderResponse**](NumberOrderResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order. |  -  |
| **0** | Unexpected error |  -  |

## createNumberOrderWithHttpInfo

> CompletableFuture<ApiResponse<NumberOrderResponse>> createNumberOrder createNumberOrderWithHttpInfo(createNumberOrderRequest)

Create a number order

Creates a phone number order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrdersApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrdersApi apiInstance = new NumberOrdersApi(defaultClient);
        CreateNumberOrderRequest createNumberOrderRequest = new CreateNumberOrderRequest(); // CreateNumberOrderRequest | 
        try {
            CompletableFuture<ApiResponse<NumberOrderResponse>> response = apiInstance.createNumberOrderWithHttpInfo(createNumberOrderRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberOrdersApi#createNumberOrder");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrdersApi#createNumberOrder");
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
 **createNumberOrderRequest** | [**CreateNumberOrderRequest**](CreateNumberOrderRequest.md)|  |

### Return type

CompletableFuture<ApiResponse<[**NumberOrderResponse**](NumberOrderResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order. |  -  |
| **0** | Unexpected error |  -  |


## listNumberOrders

> CompletableFuture<ListNumberOrdersResponse> listNumberOrders(listNumberOrdersRequest)

List number orders

Get a paginated list of number orders.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrdersApi;
import com.telnyx.sdk.apis.NumberOrdersApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrdersApi apiInstance = new NumberOrdersApi(defaultClient);
        String filterStatus = "filterStatus_example"; // String | Filter number orders by status.
        String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number orders later than this value.
        String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number orders earlier than this value.
        String filterPhoneNumbersPhoneNumber = "filterPhoneNumbersPhoneNumber_example"; // String | Filter number orders having these phone numbers.
        String filterCustomerReference = "filterCustomerReference_example"; // String | Filter number orders via the customer reference set.
        Boolean filterRequirementsMet = true; // Boolean | Filter number orders by requirements met.
        try {
            APIlistNumberOrdersRequest request = APIlistNumberOrdersRequest.newBuilder()
                .filterStatus(filterStatus)
                .filterCreatedAtGt(filterCreatedAtGt)
                .filterCreatedAtLt(filterCreatedAtLt)
                .filterPhoneNumbersPhoneNumber(filterPhoneNumbersPhoneNumber)
                .filterCustomerReference(filterCustomerReference)
                .filterRequirementsMet(filterRequirementsMet)
                .build();
            CompletableFuture<ListNumberOrdersResponse> result = apiInstance.listNumberOrders(request);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrdersApi#listNumberOrders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| listNumberOrdersRequest | [**APIlistNumberOrdersRequest**](NumberOrdersApi.md#APIlistNumberOrdersRequest)|-|-|

### Return type

CompletableFuture<[**ListNumberOrdersResponse**](ListNumberOrdersResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of number orders. |  -  |
| **0** | Unexpected error |  -  |

## listNumberOrdersWithHttpInfo

> CompletableFuture<ApiResponse<ListNumberOrdersResponse>> listNumberOrders listNumberOrdersWithHttpInfo(listNumberOrdersRequest)

List number orders

Get a paginated list of number orders.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrdersApi;
import com.telnyx.sdk.apis.NumberOrdersApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrdersApi apiInstance = new NumberOrdersApi(defaultClient);
        String filterStatus = "filterStatus_example"; // String | Filter number orders by status.
        String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number orders later than this value.
        String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number orders earlier than this value.
        String filterPhoneNumbersPhoneNumber = "filterPhoneNumbersPhoneNumber_example"; // String | Filter number orders having these phone numbers.
        String filterCustomerReference = "filterCustomerReference_example"; // String | Filter number orders via the customer reference set.
        Boolean filterRequirementsMet = true; // Boolean | Filter number orders by requirements met.
        try {
            APIlistNumberOrdersRequest request = APIlistNumberOrdersRequest.newBuilder()
                .filterStatus(filterStatus)
                .filterCreatedAtGt(filterCreatedAtGt)
                .filterCreatedAtLt(filterCreatedAtLt)
                .filterPhoneNumbersPhoneNumber(filterPhoneNumbersPhoneNumber)
                .filterCustomerReference(filterCustomerReference)
                .filterRequirementsMet(filterRequirementsMet)
                .build();
            CompletableFuture<ApiResponse<ListNumberOrdersResponse>> response = apiInstance.listNumberOrdersWithHttpInfo(request);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberOrdersApi#listNumberOrders");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrdersApi#listNumberOrders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| listNumberOrdersRequest | [**APIlistNumberOrdersRequest**](NumberOrdersApi.md#APIlistNumberOrdersRequest)|-|-|

### Return type

CompletableFuture<ApiResponse<[**ListNumberOrdersResponse**](ListNumberOrdersResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of number orders. |  -  |
| **0** | Unexpected error |  -  |


<a name="APIlistNumberOrdersRequest"></a>
## APIlistNumberOrdersRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
 **filterStatus** | **String** | Filter number orders by status. | [optional]
 **filterCreatedAtGt** | **String** | Filter number orders later than this value. | [optional]
 **filterCreatedAtLt** | **String** | Filter number orders earlier than this value. | [optional]
 **filterPhoneNumbersPhoneNumber** | **String** | Filter number orders having these phone numbers. | [optional]
 **filterCustomerReference** | **String** | Filter number orders via the customer reference set. | [optional]
 **filterRequirementsMet** | **Boolean** | Filter number orders by requirements met. | [optional]



## retrieveNumberOrder

> CompletableFuture<NumberOrderResponse> retrieveNumberOrder(numberOrderId)

Retrieve a number order

Get an existing phone number order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrdersApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrdersApi apiInstance = new NumberOrdersApi(defaultClient);
        String numberOrderId = "numberOrderId_example"; // String | The number order ID.
        try {
            CompletableFuture<NumberOrderResponse> result = apiInstance.retrieveNumberOrder(numberOrderId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrdersApi#retrieveNumberOrder");
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
 **numberOrderId** | **String**| The number order ID. |

### Return type

CompletableFuture<[**NumberOrderResponse**](NumberOrderResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order. |  -  |
| **0** | Unexpected error |  -  |

## retrieveNumberOrderWithHttpInfo

> CompletableFuture<ApiResponse<NumberOrderResponse>> retrieveNumberOrder retrieveNumberOrderWithHttpInfo(numberOrderId)

Retrieve a number order

Get an existing phone number order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrdersApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrdersApi apiInstance = new NumberOrdersApi(defaultClient);
        String numberOrderId = "numberOrderId_example"; // String | The number order ID.
        try {
            CompletableFuture<ApiResponse<NumberOrderResponse>> response = apiInstance.retrieveNumberOrderWithHttpInfo(numberOrderId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberOrdersApi#retrieveNumberOrder");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrdersApi#retrieveNumberOrder");
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
 **numberOrderId** | **String**| The number order ID. |

### Return type

CompletableFuture<ApiResponse<[**NumberOrderResponse**](NumberOrderResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order. |  -  |
| **0** | Unexpected error |  -  |


## updateNumberOrder

> CompletableFuture<NumberOrderResponse> updateNumberOrder(numberOrderId, updateNumberOrderRequest)

Update a number order

Updates a phone number order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrdersApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrdersApi apiInstance = new NumberOrdersApi(defaultClient);
        String numberOrderId = "numberOrderId_example"; // String | The number order ID.
        UpdateNumberOrderRequest updateNumberOrderRequest = new UpdateNumberOrderRequest(); // UpdateNumberOrderRequest | 
        try {
            CompletableFuture<NumberOrderResponse> result = apiInstance.updateNumberOrder(numberOrderId, updateNumberOrderRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrdersApi#updateNumberOrder");
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
 **numberOrderId** | **String**| The number order ID. |
 **updateNumberOrderRequest** | [**UpdateNumberOrderRequest**](UpdateNumberOrderRequest.md)|  |

### Return type

CompletableFuture<[**NumberOrderResponse**](NumberOrderResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order. |  -  |
| **0** | Unexpected error |  -  |

## updateNumberOrderWithHttpInfo

> CompletableFuture<ApiResponse<NumberOrderResponse>> updateNumberOrder updateNumberOrderWithHttpInfo(numberOrderId, updateNumberOrderRequest)

Update a number order

Updates a phone number order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrdersApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrdersApi apiInstance = new NumberOrdersApi(defaultClient);
        String numberOrderId = "numberOrderId_example"; // String | The number order ID.
        UpdateNumberOrderRequest updateNumberOrderRequest = new UpdateNumberOrderRequest(); // UpdateNumberOrderRequest | 
        try {
            CompletableFuture<ApiResponse<NumberOrderResponse>> response = apiInstance.updateNumberOrderWithHttpInfo(numberOrderId, updateNumberOrderRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberOrdersApi#updateNumberOrder");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrdersApi#updateNumberOrder");
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
 **numberOrderId** | **String**| The number order ID. |
 **updateNumberOrderRequest** | [**UpdateNumberOrderRequest**](UpdateNumberOrderRequest.md)|  |

### Return type

CompletableFuture<ApiResponse<[**NumberOrderResponse**](NumberOrderResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order. |  -  |
| **0** | Unexpected error |  -  |

