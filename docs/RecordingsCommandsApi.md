# RecordingsCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listRecordings**](RecordingsCommandsApi.md#listRecordings) | **GET** /recordings | List recordings
[**listRecordingsWithHttpInfo**](RecordingsCommandsApi.md#listRecordingsWithHttpInfo) | **GET** /recordings | List recordings
[**retrieveRecording**](RecordingsCommandsApi.md#retrieveRecording) | **GET** /recordings/{id} | Retrieve a recording
[**retrieveRecordingWithHttpInfo**](RecordingsCommandsApi.md#retrieveRecordingWithHttpInfo) | **GET** /recordings/{id} | Retrieve a recording



## listRecordings

> CompletableFuture<ListRecordingsResponse> listRecordings(listRecordingsRequest)

List recordings

Lists recordings for the authenticated user

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.RecordingsCommandsApi;
import com.telnyx.sdk.apis.RecordingsCommandsApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RecordingsCommandsApi apiInstance = new RecordingsCommandsApi(defaultClient);
        String filterConferenceId = 428c31b6-7af4-4bcb-b7f5-5013ef9657c1; // String | Return only recordings associated with a given conference
        String filterCreatedAtGte = 2019-03-29T11:10:00Z; // String | Return only recordings created later than or at given ISO 8601 datetime
        String filterCreatedAtLte = 2019-03-29T11:10:00Z; // String | Return only recordings created earlier than or at given ISO 8601 datetime
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            APIlistRecordingsRequest request = APIlistRecordingsRequest.newBuilder()
                .filterConferenceId(filterConferenceId)
                .filterCreatedAtGte(filterCreatedAtGte)
                .filterCreatedAtLte(filterCreatedAtLte)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .build();
            CompletableFuture<ListRecordingsResponse> result = apiInstance.listRecordings(request);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordingsCommandsApi#listRecordings");
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
| listRecordingsRequest | [**APIlistRecordingsRequest**](RecordingsCommandsApi.md#APIlistRecordingsRequest)|-|-|

### Return type

CompletableFuture<[**ListRecordingsResponse**](ListRecordingsResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of recordings. |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity |  -  |

## listRecordingsWithHttpInfo

> CompletableFuture<ApiResponse<ListRecordingsResponse>> listRecordings listRecordingsWithHttpInfo(listRecordingsRequest)

List recordings

Lists recordings for the authenticated user

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.RecordingsCommandsApi;
import com.telnyx.sdk.apis.RecordingsCommandsApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RecordingsCommandsApi apiInstance = new RecordingsCommandsApi(defaultClient);
        String filterConferenceId = 428c31b6-7af4-4bcb-b7f5-5013ef9657c1; // String | Return only recordings associated with a given conference
        String filterCreatedAtGte = 2019-03-29T11:10:00Z; // String | Return only recordings created later than or at given ISO 8601 datetime
        String filterCreatedAtLte = 2019-03-29T11:10:00Z; // String | Return only recordings created earlier than or at given ISO 8601 datetime
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            APIlistRecordingsRequest request = APIlistRecordingsRequest.newBuilder()
                .filterConferenceId(filterConferenceId)
                .filterCreatedAtGte(filterCreatedAtGte)
                .filterCreatedAtLte(filterCreatedAtLte)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .build();
            CompletableFuture<ApiResponse<ListRecordingsResponse>> response = apiInstance.listRecordingsWithHttpInfo(request);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RecordingsCommandsApi#listRecordings");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordingsCommandsApi#listRecordings");
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
| listRecordingsRequest | [**APIlistRecordingsRequest**](RecordingsCommandsApi.md#APIlistRecordingsRequest)|-|-|

### Return type

CompletableFuture<ApiResponse<[**ListRecordingsResponse**](ListRecordingsResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of recordings. |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity |  -  |


<a name="APIlistRecordingsRequest"></a>
## APIlistRecordingsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
 **filterConferenceId** | **String** | Return only recordings associated with a given conference | [optional]
 **filterCreatedAtGte** | **String** | Return only recordings created later than or at given ISO 8601 datetime | [optional]
 **filterCreatedAtLte** | **String** | Return only recordings created earlier than or at given ISO 8601 datetime | [optional]
 **pageNumber** | **Integer** | The page number to load | [optional] [default to 1]
 **pageSize** | **Integer** | The size of the page | [optional] [default to 20]



## retrieveRecording

> CompletableFuture<GetRecordingResponse> retrieveRecording(id)

Retrieve a recording

Retrieve a recording from the authenticated user&#39;s recordings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.RecordingsCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RecordingsCommandsApi apiInstance = new RecordingsCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the recording
        try {
            CompletableFuture<GetRecordingResponse> result = apiInstance.retrieveRecording(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordingsCommandsApi#retrieveRecording");
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
 **id** | **String**| Uniquely identifies the recording |

### Return type

CompletableFuture<[**GetRecordingResponse**](GetRecordingResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a recording. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |

## retrieveRecordingWithHttpInfo

> CompletableFuture<ApiResponse<GetRecordingResponse>> retrieveRecording retrieveRecordingWithHttpInfo(id)

Retrieve a recording

Retrieve a recording from the authenticated user&#39;s recordings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.RecordingsCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RecordingsCommandsApi apiInstance = new RecordingsCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the recording
        try {
            CompletableFuture<ApiResponse<GetRecordingResponse>> response = apiInstance.retrieveRecordingWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling RecordingsCommandsApi#retrieveRecording");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordingsCommandsApi#retrieveRecording");
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
 **id** | **String**| Uniquely identifies the recording |

### Return type

CompletableFuture<ApiResponse<[**GetRecordingResponse**](GetRecordingResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a recording. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |

