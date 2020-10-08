# CallInformationApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveCallStatus**](CallInformationApi.md#retrieveCallStatus) | **GET** /calls/{call_control_id} | Retrieve a call status
[**retrieveCallStatusWithHttpInfo**](CallInformationApi.md#retrieveCallStatusWithHttpInfo) | **GET** /calls/{call_control_id} | Retrieve a call status



## retrieveCallStatus

> CompletableFuture<RetrieveCallStatusResponse> retrieveCallStatus(callControlId)

Retrieve a call status

Returns the status of a call (data is available 10 minutes after call ended).

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallInformationApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallInformationApi apiInstance = new CallInformationApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        try {
            CompletableFuture<RetrieveCallStatusResponse> result = apiInstance.retrieveCallStatus(callControlId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallInformationApi#retrieveCallStatus");
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
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

CompletableFuture<[**RetrieveCallStatusResponse**](RetrieveCallStatusResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a call status. |  -  |
| **0** | Unexpected error |  -  |

## retrieveCallStatusWithHttpInfo

> CompletableFuture<ApiResponse<RetrieveCallStatusResponse>> retrieveCallStatus retrieveCallStatusWithHttpInfo(callControlId)

Retrieve a call status

Returns the status of a call (data is available 10 minutes after call ended).

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallInformationApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallInformationApi apiInstance = new CallInformationApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        try {
            CompletableFuture<ApiResponse<RetrieveCallStatusResponse>> response = apiInstance.retrieveCallStatusWithHttpInfo(callControlId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallInformationApi#retrieveCallStatus");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallInformationApi#retrieveCallStatus");
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
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

CompletableFuture<ApiResponse<[**RetrieveCallStatusResponse**](RetrieveCallStatusResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a call status. |  -  |
| **0** | Unexpected error |  -  |

