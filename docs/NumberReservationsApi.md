# NumberReservationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNumberReservation**](NumberReservationsApi.md#createNumberReservation) | **POST** /number_reservations | Create a number reservation
[**createNumberReservationWithHttpInfo**](NumberReservationsApi.md#createNumberReservationWithHttpInfo) | **POST** /number_reservations | Create a number reservation
[**extendNumberReservationExpiryTime**](NumberReservationsApi.md#extendNumberReservationExpiryTime) | **POST** /number_reservations/{number_reservation_id}/actions/extend | Extend a number reservation
[**extendNumberReservationExpiryTimeWithHttpInfo**](NumberReservationsApi.md#extendNumberReservationExpiryTimeWithHttpInfo) | **POST** /number_reservations/{number_reservation_id}/actions/extend | Extend a number reservation
[**listNumberReservations**](NumberReservationsApi.md#listNumberReservations) | **GET** /number_reservations | List number reservations
[**listNumberReservationsWithHttpInfo**](NumberReservationsApi.md#listNumberReservationsWithHttpInfo) | **GET** /number_reservations | List number reservations
[**retrieveNumberReservation**](NumberReservationsApi.md#retrieveNumberReservation) | **GET** /number_reservations/{number_reservation_id} | Retrieve a number reservation
[**retrieveNumberReservationWithHttpInfo**](NumberReservationsApi.md#retrieveNumberReservationWithHttpInfo) | **GET** /number_reservations/{number_reservation_id} | Retrieve a number reservation



## createNumberReservation

> CompletableFuture<NumberReservationResponse> createNumberReservation(createNumberReservationRequest)

Create a number reservation

Creates a Phone Number Reservation for multiple numbers.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberReservationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberReservationsApi apiInstance = new NumberReservationsApi(defaultClient);
        CreateNumberReservationRequest createNumberReservationRequest = new CreateNumberReservationRequest(); // CreateNumberReservationRequest | 
        try {
            CompletableFuture<NumberReservationResponse> result = apiInstance.createNumberReservation(createNumberReservationRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberReservationsApi#createNumberReservation");
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
 **createNumberReservationRequest** | [**CreateNumberReservationRequest**](CreateNumberReservationRequest.md)|  |

### Return type

CompletableFuture<[**NumberReservationResponse**](NumberReservationResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number reservation. |  -  |
| **0** | Unexpected error |  -  |

## createNumberReservationWithHttpInfo

> CompletableFuture<ApiResponse<NumberReservationResponse>> createNumberReservation createNumberReservationWithHttpInfo(createNumberReservationRequest)

Create a number reservation

Creates a Phone Number Reservation for multiple numbers.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberReservationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberReservationsApi apiInstance = new NumberReservationsApi(defaultClient);
        CreateNumberReservationRequest createNumberReservationRequest = new CreateNumberReservationRequest(); // CreateNumberReservationRequest | 
        try {
            CompletableFuture<ApiResponse<NumberReservationResponse>> response = apiInstance.createNumberReservationWithHttpInfo(createNumberReservationRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberReservationsApi#createNumberReservation");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberReservationsApi#createNumberReservation");
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
 **createNumberReservationRequest** | [**CreateNumberReservationRequest**](CreateNumberReservationRequest.md)|  |

### Return type

CompletableFuture<ApiResponse<[**NumberReservationResponse**](NumberReservationResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number reservation. |  -  |
| **0** | Unexpected error |  -  |


## extendNumberReservationExpiryTime

> CompletableFuture<NumberReservationResponse> extendNumberReservationExpiryTime(numberReservationId)

Extend a number reservation

Extends reservation expiry time on all phone numbers.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberReservationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberReservationsApi apiInstance = new NumberReservationsApi(defaultClient);
        String numberReservationId = "numberReservationId_example"; // String | The number reservation ID.
        try {
            CompletableFuture<NumberReservationResponse> result = apiInstance.extendNumberReservationExpiryTime(numberReservationId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberReservationsApi#extendNumberReservationExpiryTime");
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
 **numberReservationId** | **String**| The number reservation ID. |

### Return type

CompletableFuture<[**NumberReservationResponse**](NumberReservationResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number reservation. |  -  |
| **0** | Unexpected error |  -  |

## extendNumberReservationExpiryTimeWithHttpInfo

> CompletableFuture<ApiResponse<NumberReservationResponse>> extendNumberReservationExpiryTime extendNumberReservationExpiryTimeWithHttpInfo(numberReservationId)

Extend a number reservation

Extends reservation expiry time on all phone numbers.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberReservationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberReservationsApi apiInstance = new NumberReservationsApi(defaultClient);
        String numberReservationId = "numberReservationId_example"; // String | The number reservation ID.
        try {
            CompletableFuture<ApiResponse<NumberReservationResponse>> response = apiInstance.extendNumberReservationExpiryTimeWithHttpInfo(numberReservationId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberReservationsApi#extendNumberReservationExpiryTime");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberReservationsApi#extendNumberReservationExpiryTime");
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
 **numberReservationId** | **String**| The number reservation ID. |

### Return type

CompletableFuture<ApiResponse<[**NumberReservationResponse**](NumberReservationResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number reservation. |  -  |
| **0** | Unexpected error |  -  |


## listNumberReservations

> CompletableFuture<ListNumberReservationsResponse> listNumberReservations(listNumberReservationsRequest)

List number reservations

Gets a paginated list of phone number reservations.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberReservationsApi;
import com.telnyx.sdk.apis.NumberReservationsApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberReservationsApi apiInstance = new NumberReservationsApi(defaultClient);
        String filterStatus = "filterStatus_example"; // String | Filter number reservations by status.
        String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number reservations later than this value.
        String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number reservations earlier than this value.
        String filterPhoneNumbersPhoneNumber = "filterPhoneNumbersPhoneNumber_example"; // String | Filter number reservations having these phone numbers.
        String filterCustomerReference = "filterCustomerReference_example"; // String | Filter number reservations via the customer reference set.
        try {
            APIlistNumberReservationsRequest request = APIlistNumberReservationsRequest.newBuilder()
                .filterStatus(filterStatus)
                .filterCreatedAtGt(filterCreatedAtGt)
                .filterCreatedAtLt(filterCreatedAtLt)
                .filterPhoneNumbersPhoneNumber(filterPhoneNumbersPhoneNumber)
                .filterCustomerReference(filterCustomerReference)
                .build();
            CompletableFuture<ListNumberReservationsResponse> result = apiInstance.listNumberReservations(request);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberReservationsApi#listNumberReservations");
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
| listNumberReservationsRequest | [**APIlistNumberReservationsRequest**](NumberReservationsApi.md#APIlistNumberReservationsRequest)|-|-|

### Return type

CompletableFuture<[**ListNumberReservationsResponse**](ListNumberReservationsResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of number reservations. |  -  |
| **0** | Unexpected error |  -  |

## listNumberReservationsWithHttpInfo

> CompletableFuture<ApiResponse<ListNumberReservationsResponse>> listNumberReservations listNumberReservationsWithHttpInfo(listNumberReservationsRequest)

List number reservations

Gets a paginated list of phone number reservations.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberReservationsApi;
import com.telnyx.sdk.apis.NumberReservationsApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberReservationsApi apiInstance = new NumberReservationsApi(defaultClient);
        String filterStatus = "filterStatus_example"; // String | Filter number reservations by status.
        String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number reservations later than this value.
        String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number reservations earlier than this value.
        String filterPhoneNumbersPhoneNumber = "filterPhoneNumbersPhoneNumber_example"; // String | Filter number reservations having these phone numbers.
        String filterCustomerReference = "filterCustomerReference_example"; // String | Filter number reservations via the customer reference set.
        try {
            APIlistNumberReservationsRequest request = APIlistNumberReservationsRequest.newBuilder()
                .filterStatus(filterStatus)
                .filterCreatedAtGt(filterCreatedAtGt)
                .filterCreatedAtLt(filterCreatedAtLt)
                .filterPhoneNumbersPhoneNumber(filterPhoneNumbersPhoneNumber)
                .filterCustomerReference(filterCustomerReference)
                .build();
            CompletableFuture<ApiResponse<ListNumberReservationsResponse>> response = apiInstance.listNumberReservationsWithHttpInfo(request);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberReservationsApi#listNumberReservations");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberReservationsApi#listNumberReservations");
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
| listNumberReservationsRequest | [**APIlistNumberReservationsRequest**](NumberReservationsApi.md#APIlistNumberReservationsRequest)|-|-|

### Return type

CompletableFuture<ApiResponse<[**ListNumberReservationsResponse**](ListNumberReservationsResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of number reservations. |  -  |
| **0** | Unexpected error |  -  |


<a name="APIlistNumberReservationsRequest"></a>
## APIlistNumberReservationsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
 **filterStatus** | **String** | Filter number reservations by status. | [optional]
 **filterCreatedAtGt** | **String** | Filter number reservations later than this value. | [optional]
 **filterCreatedAtLt** | **String** | Filter number reservations earlier than this value. | [optional]
 **filterPhoneNumbersPhoneNumber** | **String** | Filter number reservations having these phone numbers. | [optional]
 **filterCustomerReference** | **String** | Filter number reservations via the customer reference set. | [optional]



## retrieveNumberReservation

> CompletableFuture<NumberReservationResponse> retrieveNumberReservation(numberReservationId)

Retrieve a number reservation

Gets a single phone number reservation.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberReservationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberReservationsApi apiInstance = new NumberReservationsApi(defaultClient);
        String numberReservationId = "numberReservationId_example"; // String | The number reservation ID.
        try {
            CompletableFuture<NumberReservationResponse> result = apiInstance.retrieveNumberReservation(numberReservationId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberReservationsApi#retrieveNumberReservation");
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
 **numberReservationId** | **String**| The number reservation ID. |

### Return type

CompletableFuture<[**NumberReservationResponse**](NumberReservationResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number reservation. |  -  |
| **0** | Unexpected error |  -  |

## retrieveNumberReservationWithHttpInfo

> CompletableFuture<ApiResponse<NumberReservationResponse>> retrieveNumberReservation retrieveNumberReservationWithHttpInfo(numberReservationId)

Retrieve a number reservation

Gets a single phone number reservation.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberReservationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberReservationsApi apiInstance = new NumberReservationsApi(defaultClient);
        String numberReservationId = "numberReservationId_example"; // String | The number reservation ID.
        try {
            CompletableFuture<ApiResponse<NumberReservationResponse>> response = apiInstance.retrieveNumberReservationWithHttpInfo(numberReservationId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberReservationsApi#retrieveNumberReservation");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberReservationsApi#retrieveNumberReservation");
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
 **numberReservationId** | **String**| The number reservation ID. |

### Return type

CompletableFuture<ApiResponse<[**NumberReservationResponse**](NumberReservationResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number reservation. |  -  |
| **0** | Unexpected error |  -  |

