# MessagingUrlDomainsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listMessagingUrlDomains**](MessagingUrlDomainsApi.md#listMessagingUrlDomains) | **GET** /messaging_url_domains | List messaging URL domains
[**listMessagingUrlDomainsWithHttpInfo**](MessagingUrlDomainsApi.md#listMessagingUrlDomainsWithHttpInfo) | **GET** /messaging_url_domains | List messaging URL domains



## listMessagingUrlDomains

> CompletableFuture<ListMessagingProfileUrlDomainsResponse> listMessagingUrlDomains()

List messaging URL domains

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingUrlDomainsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingUrlDomainsApi apiInstance = new MessagingUrlDomainsApi(defaultClient);
        try {
            CompletableFuture<ListMessagingProfileUrlDomainsResponse> result = apiInstance.listMessagingUrlDomains();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingUrlDomainsApi#listMessagingUrlDomains");
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

CompletableFuture<[**ListMessagingProfileUrlDomainsResponse**](ListMessagingProfileUrlDomainsResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging URL domain. |  -  |
| **0** | Unexpected error |  -  |

## listMessagingUrlDomainsWithHttpInfo

> CompletableFuture<ApiResponse<ListMessagingProfileUrlDomainsResponse>> listMessagingUrlDomains listMessagingUrlDomainsWithHttpInfo()

List messaging URL domains

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingUrlDomainsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingUrlDomainsApi apiInstance = new MessagingUrlDomainsApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<ListMessagingProfileUrlDomainsResponse>> response = apiInstance.listMessagingUrlDomainsWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingUrlDomainsApi#listMessagingUrlDomains");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingUrlDomainsApi#listMessagingUrlDomains");
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

CompletableFuture<ApiResponse<[**ListMessagingProfileUrlDomainsResponse**](ListMessagingProfileUrlDomainsResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging URL domain. |  -  |
| **0** | Unexpected error |  -  |

