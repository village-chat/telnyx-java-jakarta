# NumberOrderDocumentsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNumberOrderDocument**](NumberOrderDocumentsApi.md#createNumberOrderDocument) | **POST** /number_order_documents | Create a number order document
[**createNumberOrderDocumentWithHttpInfo**](NumberOrderDocumentsApi.md#createNumberOrderDocumentWithHttpInfo) | **POST** /number_order_documents | Create a number order document
[**listNumberOrderDocuments**](NumberOrderDocumentsApi.md#listNumberOrderDocuments) | **GET** /number_order_documents | List number order documents
[**listNumberOrderDocumentsWithHttpInfo**](NumberOrderDocumentsApi.md#listNumberOrderDocumentsWithHttpInfo) | **GET** /number_order_documents | List number order documents
[**retrieveNumberOrderDocument**](NumberOrderDocumentsApi.md#retrieveNumberOrderDocument) | **GET** /number_order_documents/{number_order_document_id} | Retrieve a number order document
[**retrieveNumberOrderDocumentWithHttpInfo**](NumberOrderDocumentsApi.md#retrieveNumberOrderDocumentWithHttpInfo) | **GET** /number_order_documents/{number_order_document_id} | Retrieve a number order document
[**updateNumberOrderDocument**](NumberOrderDocumentsApi.md#updateNumberOrderDocument) | **PATCH** /number_order_documents/{number_order_document_id} | Update a number order document
[**updateNumberOrderDocumentWithHttpInfo**](NumberOrderDocumentsApi.md#updateNumberOrderDocumentWithHttpInfo) | **PATCH** /number_order_documents/{number_order_document_id} | Update a number order document



## createNumberOrderDocument

> CompletableFuture<NumberOrderDocumentResponse> createNumberOrderDocument(createNumberOrderDocumentRequest)

Create a number order document

Upload a phone number order document.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderDocumentsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi(defaultClient);
        CreateNumberOrderDocumentRequest createNumberOrderDocumentRequest = new CreateNumberOrderDocumentRequest(); // CreateNumberOrderDocumentRequest | 
        try {
            CompletableFuture<NumberOrderDocumentResponse> result = apiInstance.createNumberOrderDocument(createNumberOrderDocumentRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderDocumentsApi#createNumberOrderDocument");
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
 **createNumberOrderDocumentRequest** | [**CreateNumberOrderDocumentRequest**](CreateNumberOrderDocumentRequest.md)|  |

### Return type

CompletableFuture<[**NumberOrderDocumentResponse**](NumberOrderDocumentResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order document. |  -  |
| **0** | Unexpected error |  -  |

## createNumberOrderDocumentWithHttpInfo

> CompletableFuture<ApiResponse<NumberOrderDocumentResponse>> createNumberOrderDocument createNumberOrderDocumentWithHttpInfo(createNumberOrderDocumentRequest)

Create a number order document

Upload a phone number order document.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderDocumentsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi(defaultClient);
        CreateNumberOrderDocumentRequest createNumberOrderDocumentRequest = new CreateNumberOrderDocumentRequest(); // CreateNumberOrderDocumentRequest | 
        try {
            CompletableFuture<ApiResponse<NumberOrderDocumentResponse>> response = apiInstance.createNumberOrderDocumentWithHttpInfo(createNumberOrderDocumentRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberOrderDocumentsApi#createNumberOrderDocument");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderDocumentsApi#createNumberOrderDocument");
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
 **createNumberOrderDocumentRequest** | [**CreateNumberOrderDocumentRequest**](CreateNumberOrderDocumentRequest.md)|  |

### Return type

CompletableFuture<ApiResponse<[**NumberOrderDocumentResponse**](NumberOrderDocumentResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order document. |  -  |
| **0** | Unexpected error |  -  |


## listNumberOrderDocuments

> CompletableFuture<ListNumberOrderDocumentsResponse> listNumberOrderDocuments(listNumberOrderDocumentsRequest)

List number order documents

Gets a paginated list of number order documents.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderDocumentsApi;
import com.telnyx.sdk.apis.NumberOrderDocumentsApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi(defaultClient);
        String filterRequirementId = "filterRequirementId_example"; // String | Filter number order documents by `requirement_id`.
        String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number order documents after this datetime.
        String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number order documents from before this datetime.
        try {
            APIlistNumberOrderDocumentsRequest request = APIlistNumberOrderDocumentsRequest.newBuilder()
                .filterRequirementId(filterRequirementId)
                .filterCreatedAtGt(filterCreatedAtGt)
                .filterCreatedAtLt(filterCreatedAtLt)
                .build();
            CompletableFuture<ListNumberOrderDocumentsResponse> result = apiInstance.listNumberOrderDocuments(request);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderDocumentsApi#listNumberOrderDocuments");
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
| listNumberOrderDocumentsRequest | [**APIlistNumberOrderDocumentsRequest**](NumberOrderDocumentsApi.md#APIlistNumberOrderDocumentsRequest)|-|-|

### Return type

CompletableFuture<[**ListNumberOrderDocumentsResponse**](ListNumberOrderDocumentsResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of number order documents. |  -  |
| **0** | Unexpected error |  -  |

## listNumberOrderDocumentsWithHttpInfo

> CompletableFuture<ApiResponse<ListNumberOrderDocumentsResponse>> listNumberOrderDocuments listNumberOrderDocumentsWithHttpInfo(listNumberOrderDocumentsRequest)

List number order documents

Gets a paginated list of number order documents.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderDocumentsApi;
import com.telnyx.sdk.apis.NumberOrderDocumentsApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi(defaultClient);
        String filterRequirementId = "filterRequirementId_example"; // String | Filter number order documents by `requirement_id`.
        String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number order documents after this datetime.
        String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number order documents from before this datetime.
        try {
            APIlistNumberOrderDocumentsRequest request = APIlistNumberOrderDocumentsRequest.newBuilder()
                .filterRequirementId(filterRequirementId)
                .filterCreatedAtGt(filterCreatedAtGt)
                .filterCreatedAtLt(filterCreatedAtLt)
                .build();
            CompletableFuture<ApiResponse<ListNumberOrderDocumentsResponse>> response = apiInstance.listNumberOrderDocumentsWithHttpInfo(request);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberOrderDocumentsApi#listNumberOrderDocuments");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderDocumentsApi#listNumberOrderDocuments");
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
| listNumberOrderDocumentsRequest | [**APIlistNumberOrderDocumentsRequest**](NumberOrderDocumentsApi.md#APIlistNumberOrderDocumentsRequest)|-|-|

### Return type

CompletableFuture<ApiResponse<[**ListNumberOrderDocumentsResponse**](ListNumberOrderDocumentsResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of number order documents. |  -  |
| **0** | Unexpected error |  -  |


<a name="APIlistNumberOrderDocumentsRequest"></a>
## APIlistNumberOrderDocumentsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
 **filterRequirementId** | **String** | Filter number order documents by &#x60;requirement_id&#x60;. | [optional]
 **filterCreatedAtGt** | **String** | Filter number order documents after this datetime. | [optional]
 **filterCreatedAtLt** | **String** | Filter number order documents from before this datetime. | [optional]



## retrieveNumberOrderDocument

> CompletableFuture<NumberOrderDocumentResponse> retrieveNumberOrderDocument(numberOrderDocumentId)

Retrieve a number order document

Gets a single number order document.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderDocumentsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi(defaultClient);
        String numberOrderDocumentId = "numberOrderDocumentId_example"; // String | The number order document ID.
        try {
            CompletableFuture<NumberOrderDocumentResponse> result = apiInstance.retrieveNumberOrderDocument(numberOrderDocumentId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderDocumentsApi#retrieveNumberOrderDocument");
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
 **numberOrderDocumentId** | **String**| The number order document ID. |

### Return type

CompletableFuture<[**NumberOrderDocumentResponse**](NumberOrderDocumentResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order document. |  -  |
| **0** | Unexpected error |  -  |

## retrieveNumberOrderDocumentWithHttpInfo

> CompletableFuture<ApiResponse<NumberOrderDocumentResponse>> retrieveNumberOrderDocument retrieveNumberOrderDocumentWithHttpInfo(numberOrderDocumentId)

Retrieve a number order document

Gets a single number order document.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderDocumentsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi(defaultClient);
        String numberOrderDocumentId = "numberOrderDocumentId_example"; // String | The number order document ID.
        try {
            CompletableFuture<ApiResponse<NumberOrderDocumentResponse>> response = apiInstance.retrieveNumberOrderDocumentWithHttpInfo(numberOrderDocumentId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberOrderDocumentsApi#retrieveNumberOrderDocument");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderDocumentsApi#retrieveNumberOrderDocument");
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
 **numberOrderDocumentId** | **String**| The number order document ID. |

### Return type

CompletableFuture<ApiResponse<[**NumberOrderDocumentResponse**](NumberOrderDocumentResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order document. |  -  |
| **0** | Unexpected error |  -  |


## updateNumberOrderDocument

> CompletableFuture<NumberOrderDocumentResponse> updateNumberOrderDocument(numberOrderDocumentId, updateNumberOrderDocumentRequest)

Update a number order document

Updates a number order document.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderDocumentsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi(defaultClient);
        String numberOrderDocumentId = "numberOrderDocumentId_example"; // String | The number order document ID.
        UpdateNumberOrderDocumentRequest updateNumberOrderDocumentRequest = new UpdateNumberOrderDocumentRequest(); // UpdateNumberOrderDocumentRequest | 
        try {
            CompletableFuture<NumberOrderDocumentResponse> result = apiInstance.updateNumberOrderDocument(numberOrderDocumentId, updateNumberOrderDocumentRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderDocumentsApi#updateNumberOrderDocument");
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
 **numberOrderDocumentId** | **String**| The number order document ID. |
 **updateNumberOrderDocumentRequest** | [**UpdateNumberOrderDocumentRequest**](UpdateNumberOrderDocumentRequest.md)|  |

### Return type

CompletableFuture<[**NumberOrderDocumentResponse**](NumberOrderDocumentResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order document. |  -  |
| **0** | Unexpected error |  -  |

## updateNumberOrderDocumentWithHttpInfo

> CompletableFuture<ApiResponse<NumberOrderDocumentResponse>> updateNumberOrderDocument updateNumberOrderDocumentWithHttpInfo(numberOrderDocumentId, updateNumberOrderDocumentRequest)

Update a number order document

Updates a number order document.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderDocumentsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrderDocumentsApi apiInstance = new NumberOrderDocumentsApi(defaultClient);
        String numberOrderDocumentId = "numberOrderDocumentId_example"; // String | The number order document ID.
        UpdateNumberOrderDocumentRequest updateNumberOrderDocumentRequest = new UpdateNumberOrderDocumentRequest(); // UpdateNumberOrderDocumentRequest | 
        try {
            CompletableFuture<ApiResponse<NumberOrderDocumentResponse>> response = apiInstance.updateNumberOrderDocumentWithHttpInfo(numberOrderDocumentId, updateNumberOrderDocumentRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberOrderDocumentsApi#updateNumberOrderDocument");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrderDocumentsApi#updateNumberOrderDocument");
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
 **numberOrderDocumentId** | **String**| The number order document ID. |
 **updateNumberOrderDocumentRequest** | [**UpdateNumberOrderDocumentRequest**](UpdateNumberOrderDocumentRequest.md)|  |

### Return type

CompletableFuture<ApiResponse<[**NumberOrderDocumentResponse**](NumberOrderDocumentResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order document. |  -  |
| **0** | Unexpected error |  -  |

