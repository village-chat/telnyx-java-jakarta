# NumberOrderRegulatoryRequirementsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listNumberOrderRegulatoryRequirements**](NumberOrderRegulatoryRequirementsApi.md#listNumberOrderRegulatoryRequirements) | **GET** /regulatory_requirements | List number order regulatory requirements
[**listNumberOrderRegulatoryRequirementsWithHttpInfo**](NumberOrderRegulatoryRequirementsApi.md#listNumberOrderRegulatoryRequirementsWithHttpInfo) | **GET** /regulatory_requirements | List number order regulatory requirements
[**listPhoneNumberRegulatoryRequirements**](NumberOrderRegulatoryRequirementsApi.md#listPhoneNumberRegulatoryRequirements) | **GET** /phone_number_regulatory_requirements | List regulatory requirements per number
[**listPhoneNumberRegulatoryRequirementsWithHttpInfo**](NumberOrderRegulatoryRequirementsApi.md#listPhoneNumberRegulatoryRequirementsWithHttpInfo) | **GET** /phone_number_regulatory_requirements | List regulatory requirements per number
[**retrieveNumberOrderRegulatoryRequirement**](NumberOrderRegulatoryRequirementsApi.md#retrieveNumberOrderRegulatoryRequirement) | **GET** /regulatory_requirements/{requirement_id} | Retrieve a number order regulatory requirement
[**retrieveNumberOrderRegulatoryRequirementWithHttpInfo**](NumberOrderRegulatoryRequirementsApi.md#retrieveNumberOrderRegulatoryRequirementWithHttpInfo) | **GET** /regulatory_requirements/{requirement_id} | Retrieve a number order regulatory requirement



## listNumberOrderRegulatoryRequirements

> CompletableFuture<ListNumberOrderRegulatoryRequirementsResponse> listNumberOrderRegulatoryRequirements(listNumberOrderRegulatoryRequirementsRequest)

List number order regulatory requirements

Gets a paginated list of number order regulatory requirements.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi;
import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi(defaultClient);
        String filterRequirementId = "filterRequirementId_example"; // String | Filter number order regulatory requirements by `requirement_id`.
        String filterFieldType = "filterFieldType_example"; // String | Filter number order regulatory requirements by `field_type`.
        String filterRequirementType = "filterRequirementType_example"; // String | Filter number order regulatory requirements by `requirement_type`.
        try {
            APIlistNumberOrderRegulatoryRequirementsRequest request = APIlistNumberOrderRegulatoryRequirementsRequest.newBuilder()
                .filterRequirementId(filterRequirementId)
                .filterFieldType(filterFieldType)
                .filterRequirementType(filterRequirementType)
                .build();
            CompletableFuture<ListNumberOrderRegulatoryRequirementsResponse> result = apiInstance.listNumberOrderRegulatoryRequirements(request);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#listNumberOrderRegulatoryRequirements");
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
| listNumberOrderRegulatoryRequirementsRequest | [**APIlistNumberOrderRegulatoryRequirementsRequest**](NumberOrderRegulatoryRequirementsApi.md#APIlistNumberOrderRegulatoryRequirementsRequest)|-|-|

### Return type

CompletableFuture<[**ListNumberOrderRegulatoryRequirementsResponse**](ListNumberOrderRegulatoryRequirementsResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of number order regulatory requirements. |  -  |
| **0** | Unexpected error |  -  |

## listNumberOrderRegulatoryRequirementsWithHttpInfo

> CompletableFuture<ApiResponse<ListNumberOrderRegulatoryRequirementsResponse>> listNumberOrderRegulatoryRequirements listNumberOrderRegulatoryRequirementsWithHttpInfo(listNumberOrderRegulatoryRequirementsRequest)

List number order regulatory requirements

Gets a paginated list of number order regulatory requirements.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi;
import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi(defaultClient);
        String filterRequirementId = "filterRequirementId_example"; // String | Filter number order regulatory requirements by `requirement_id`.
        String filterFieldType = "filterFieldType_example"; // String | Filter number order regulatory requirements by `field_type`.
        String filterRequirementType = "filterRequirementType_example"; // String | Filter number order regulatory requirements by `requirement_type`.
        try {
            APIlistNumberOrderRegulatoryRequirementsRequest request = APIlistNumberOrderRegulatoryRequirementsRequest.newBuilder()
                .filterRequirementId(filterRequirementId)
                .filterFieldType(filterFieldType)
                .filterRequirementType(filterRequirementType)
                .build();
            CompletableFuture<ApiResponse<ListNumberOrderRegulatoryRequirementsResponse>> response = apiInstance.listNumberOrderRegulatoryRequirementsWithHttpInfo(request);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#listNumberOrderRegulatoryRequirements");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#listNumberOrderRegulatoryRequirements");
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
| listNumberOrderRegulatoryRequirementsRequest | [**APIlistNumberOrderRegulatoryRequirementsRequest**](NumberOrderRegulatoryRequirementsApi.md#APIlistNumberOrderRegulatoryRequirementsRequest)|-|-|

### Return type

CompletableFuture<ApiResponse<[**ListNumberOrderRegulatoryRequirementsResponse**](ListNumberOrderRegulatoryRequirementsResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of number order regulatory requirements. |  -  |
| **0** | Unexpected error |  -  |


<a name="APIlistNumberOrderRegulatoryRequirementsRequest"></a>
## APIlistNumberOrderRegulatoryRequirementsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
 **filterRequirementId** | **String** | Filter number order regulatory requirements by &#x60;requirement_id&#x60;. | [optional]
 **filterFieldType** | **String** | Filter number order regulatory requirements by &#x60;field_type&#x60;. | [optional]
 **filterRequirementType** | **String** | Filter number order regulatory requirements by &#x60;requirement_type&#x60;. | [optional]



## listPhoneNumberRegulatoryRequirements

> CompletableFuture<ListPhoneNumberRegulatoryRequirementsResponse> listPhoneNumberRegulatoryRequirements(listPhoneNumberRegulatoryRequirementsRequest)

List regulatory requirements per number

Gets a paginated list of phone number regulatory requirements.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi;
import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi(defaultClient);
        List<String> filterPhoneNumber = Arrays.asList(); // List<String> | The list of phone numbers to retrieve regulatory requirements for.
        try {
            APIlistPhoneNumberRegulatoryRequirementsRequest request = APIlistPhoneNumberRegulatoryRequirementsRequest.newBuilder()
                .filterPhoneNumber(filterPhoneNumber)
                .build();
            CompletableFuture<ListPhoneNumberRegulatoryRequirementsResponse> result = apiInstance.listPhoneNumberRegulatoryRequirements(request);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#listPhoneNumberRegulatoryRequirements");
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
| listPhoneNumberRegulatoryRequirementsRequest | [**APIlistPhoneNumberRegulatoryRequirementsRequest**](NumberOrderRegulatoryRequirementsApi.md#APIlistPhoneNumberRegulatoryRequirementsRequest)|-|-|

### Return type

CompletableFuture<[**ListPhoneNumberRegulatoryRequirementsResponse**](ListPhoneNumberRegulatoryRequirementsResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone number regulatory requirements. |  -  |
| **0** | Unexpected error |  -  |

## listPhoneNumberRegulatoryRequirementsWithHttpInfo

> CompletableFuture<ApiResponse<ListPhoneNumberRegulatoryRequirementsResponse>> listPhoneNumberRegulatoryRequirements listPhoneNumberRegulatoryRequirementsWithHttpInfo(listPhoneNumberRegulatoryRequirementsRequest)

List regulatory requirements per number

Gets a paginated list of phone number regulatory requirements.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi;
import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi(defaultClient);
        List<String> filterPhoneNumber = Arrays.asList(); // List<String> | The list of phone numbers to retrieve regulatory requirements for.
        try {
            APIlistPhoneNumberRegulatoryRequirementsRequest request = APIlistPhoneNumberRegulatoryRequirementsRequest.newBuilder()
                .filterPhoneNumber(filterPhoneNumber)
                .build();
            CompletableFuture<ApiResponse<ListPhoneNumberRegulatoryRequirementsResponse>> response = apiInstance.listPhoneNumberRegulatoryRequirementsWithHttpInfo(request);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#listPhoneNumberRegulatoryRequirements");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#listPhoneNumberRegulatoryRequirements");
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
| listPhoneNumberRegulatoryRequirementsRequest | [**APIlistPhoneNumberRegulatoryRequirementsRequest**](NumberOrderRegulatoryRequirementsApi.md#APIlistPhoneNumberRegulatoryRequirementsRequest)|-|-|

### Return type

CompletableFuture<ApiResponse<[**ListPhoneNumberRegulatoryRequirementsResponse**](ListPhoneNumberRegulatoryRequirementsResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone number regulatory requirements. |  -  |
| **0** | Unexpected error |  -  |


<a name="APIlistPhoneNumberRegulatoryRequirementsRequest"></a>
## APIlistPhoneNumberRegulatoryRequirementsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
 **filterPhoneNumber** | [**List&lt;String&gt;**](String.md) | The list of phone numbers to retrieve regulatory requirements for. | [optional]



## retrieveNumberOrderRegulatoryRequirement

> CompletableFuture<NumberOrderRegulatoryRequirementResponse> retrieveNumberOrderRegulatoryRequirement(requirementId)

Retrieve a number order regulatory requirement

Gets a single number order regulatory requirement.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi(defaultClient);
        String requirementId = "requirementId_example"; // String | The number order regulatory requirement ID.
        try {
            CompletableFuture<NumberOrderRegulatoryRequirementResponse> result = apiInstance.retrieveNumberOrderRegulatoryRequirement(requirementId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#retrieveNumberOrderRegulatoryRequirement");
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
 **requirementId** | **String**| The number order regulatory requirement ID. |

### Return type

CompletableFuture<[**NumberOrderRegulatoryRequirementResponse**](NumberOrderRegulatoryRequirementResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order regulatory requirement. |  -  |
| **0** | Unexpected error |  -  |

## retrieveNumberOrderRegulatoryRequirementWithHttpInfo

> CompletableFuture<ApiResponse<NumberOrderRegulatoryRequirementResponse>> retrieveNumberOrderRegulatoryRequirement retrieveNumberOrderRegulatoryRequirementWithHttpInfo(requirementId)

Retrieve a number order regulatory requirement

Gets a single number order regulatory requirement.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi(defaultClient);
        String requirementId = "requirementId_example"; // String | The number order regulatory requirement ID.
        try {
            CompletableFuture<ApiResponse<NumberOrderRegulatoryRequirementResponse>> response = apiInstance.retrieveNumberOrderRegulatoryRequirementWithHttpInfo(requirementId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#retrieveNumberOrderRegulatoryRequirement");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#retrieveNumberOrderRegulatoryRequirement");
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
 **requirementId** | **String**| The number order regulatory requirement ID. |

### Return type

CompletableFuture<ApiResponse<[**NumberOrderRegulatoryRequirementResponse**](NumberOrderRegulatoryRequirementResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order regulatory requirement. |  -  |
| **0** | Unexpected error |  -  |

