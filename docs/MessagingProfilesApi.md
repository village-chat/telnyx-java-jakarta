# MessagingProfilesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMessagingProfile**](MessagingProfilesApi.md#createMessagingProfile) | **POST** /messaging_profiles | Create a messaging profile
[**createMessagingProfileWithHttpInfo**](MessagingProfilesApi.md#createMessagingProfileWithHttpInfo) | **POST** /messaging_profiles | Create a messaging profile
[**deleteMessagingProfile**](MessagingProfilesApi.md#deleteMessagingProfile) | **DELETE** /messaging_profiles/{id} | Delete a messaging profile
[**deleteMessagingProfileWithHttpInfo**](MessagingProfilesApi.md#deleteMessagingProfileWithHttpInfo) | **DELETE** /messaging_profiles/{id} | Delete a messaging profile
[**getMessagingProfileDetailedMetrics**](MessagingProfilesApi.md#getMessagingProfileDetailedMetrics) | **GET** /messaging_profiles/{id}/metrics | Retrieve messaging profile metrics
[**getMessagingProfileDetailedMetricsWithHttpInfo**](MessagingProfilesApi.md#getMessagingProfileDetailedMetricsWithHttpInfo) | **GET** /messaging_profiles/{id}/metrics | Retrieve messaging profile metrics
[**listMessagingProfileMetrics**](MessagingProfilesApi.md#listMessagingProfileMetrics) | **GET** /messaging_profile_metrics | List messaging profile metrics
[**listMessagingProfileMetricsWithHttpInfo**](MessagingProfilesApi.md#listMessagingProfileMetricsWithHttpInfo) | **GET** /messaging_profile_metrics | List messaging profile metrics
[**listMessagingProfilePhoneNumbers**](MessagingProfilesApi.md#listMessagingProfilePhoneNumbers) | **GET** /messaging_profiles/{id}/phone_numbers | List phone numbers associated with a messaging profile
[**listMessagingProfilePhoneNumbersWithHttpInfo**](MessagingProfilesApi.md#listMessagingProfilePhoneNumbersWithHttpInfo) | **GET** /messaging_profiles/{id}/phone_numbers | List phone numbers associated with a messaging profile
[**listMessagingProfileShortCodes**](MessagingProfilesApi.md#listMessagingProfileShortCodes) | **GET** /messaging_profiles/{id}/short_codes | List short codes associated with a messaging profile
[**listMessagingProfileShortCodesWithHttpInfo**](MessagingProfilesApi.md#listMessagingProfileShortCodesWithHttpInfo) | **GET** /messaging_profiles/{id}/short_codes | List short codes associated with a messaging profile
[**listMessagingProfiles**](MessagingProfilesApi.md#listMessagingProfiles) | **GET** /messaging_profiles | List messaging profiles
[**listMessagingProfilesWithHttpInfo**](MessagingProfilesApi.md#listMessagingProfilesWithHttpInfo) | **GET** /messaging_profiles | List messaging profiles
[**retrieveMessagingProfile**](MessagingProfilesApi.md#retrieveMessagingProfile) | **GET** /messaging_profiles/{id} | Retrieve a messaging profile
[**retrieveMessagingProfileWithHttpInfo**](MessagingProfilesApi.md#retrieveMessagingProfileWithHttpInfo) | **GET** /messaging_profiles/{id} | Retrieve a messaging profile
[**updateMessagingProfile**](MessagingProfilesApi.md#updateMessagingProfile) | **PATCH** /messaging_profiles/{id} | Update a messaging profile
[**updateMessagingProfileWithHttpInfo**](MessagingProfilesApi.md#updateMessagingProfileWithHttpInfo) | **PATCH** /messaging_profiles/{id} | Update a messaging profile



## createMessagingProfile

> CompletableFuture<MessagingProfileResponse> createMessagingProfile(createMessagingProfileRequest)

Create a messaging profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        CreateMessagingProfileRequest createMessagingProfileRequest = new CreateMessagingProfileRequest(); // CreateMessagingProfileRequest | New Messaging Profile object
        try {
            CompletableFuture<MessagingProfileResponse> result = apiInstance.createMessagingProfile(createMessagingProfileRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#createMessagingProfile");
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
 **createMessagingProfileRequest** | [**CreateMessagingProfileRequest**](CreateMessagingProfileRequest.md)| New Messaging Profile object |

### Return type

CompletableFuture<[**MessagingProfileResponse**](MessagingProfileResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile. |  -  |
| **0** | Unexpected error |  -  |

## createMessagingProfileWithHttpInfo

> CompletableFuture<ApiResponse<MessagingProfileResponse>> createMessagingProfile createMessagingProfileWithHttpInfo(createMessagingProfileRequest)

Create a messaging profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        CreateMessagingProfileRequest createMessagingProfileRequest = new CreateMessagingProfileRequest(); // CreateMessagingProfileRequest | New Messaging Profile object
        try {
            CompletableFuture<ApiResponse<MessagingProfileResponse>> response = apiInstance.createMessagingProfileWithHttpInfo(createMessagingProfileRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingProfilesApi#createMessagingProfile");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#createMessagingProfile");
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
 **createMessagingProfileRequest** | [**CreateMessagingProfileRequest**](CreateMessagingProfileRequest.md)| New Messaging Profile object |

### Return type

CompletableFuture<ApiResponse<[**MessagingProfileResponse**](MessagingProfileResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile. |  -  |
| **0** | Unexpected error |  -  |


## deleteMessagingProfile

> CompletableFuture<MessagingProfileResponse> deleteMessagingProfile(id)

Delete a messaging profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        try {
            CompletableFuture<MessagingProfileResponse> result = apiInstance.deleteMessagingProfile(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#deleteMessagingProfile");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |

### Return type

CompletableFuture<[**MessagingProfileResponse**](MessagingProfileResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile. |  -  |
| **0** | Unexpected error |  -  |

## deleteMessagingProfileWithHttpInfo

> CompletableFuture<ApiResponse<MessagingProfileResponse>> deleteMessagingProfile deleteMessagingProfileWithHttpInfo(id)

Delete a messaging profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        try {
            CompletableFuture<ApiResponse<MessagingProfileResponse>> response = apiInstance.deleteMessagingProfileWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingProfilesApi#deleteMessagingProfile");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#deleteMessagingProfile");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |

### Return type

CompletableFuture<ApiResponse<[**MessagingProfileResponse**](MessagingProfileResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile. |  -  |
| **0** | Unexpected error |  -  |


## getMessagingProfileDetailedMetrics

> CompletableFuture<RetrieveMessagingProfileMetricsResponse> getMessagingProfileDetailedMetrics(id, timeFrame)

Retrieve messaging profile metrics

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        String timeFrame = "24h"; // String | The timeframe for which you'd like to retrieve metrics.
        try {
            CompletableFuture<RetrieveMessagingProfileMetricsResponse> result = apiInstance.getMessagingProfileDetailedMetrics(id, timeFrame);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#getMessagingProfileDetailedMetrics");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
 **timeFrame** | **String**| The timeframe for which you&#39;d like to retrieve metrics. | [optional] [default to 24h] [enum: 1h, 3h, 24h, 3d, 7d, 30d]

### Return type

CompletableFuture<[**RetrieveMessagingProfileMetricsResponse**](RetrieveMessagingProfileMetricsResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile&#39;s metrics. |  -  |
| **0** | Unexpected error |  -  |

## getMessagingProfileDetailedMetricsWithHttpInfo

> CompletableFuture<ApiResponse<RetrieveMessagingProfileMetricsResponse>> getMessagingProfileDetailedMetrics getMessagingProfileDetailedMetricsWithHttpInfo(id, timeFrame)

Retrieve messaging profile metrics

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        String timeFrame = "24h"; // String | The timeframe for which you'd like to retrieve metrics.
        try {
            CompletableFuture<ApiResponse<RetrieveMessagingProfileMetricsResponse>> response = apiInstance.getMessagingProfileDetailedMetricsWithHttpInfo(id, timeFrame);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingProfilesApi#getMessagingProfileDetailedMetrics");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#getMessagingProfileDetailedMetrics");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
 **timeFrame** | **String**| The timeframe for which you&#39;d like to retrieve metrics. | [optional] [default to 24h] [enum: 1h, 3h, 24h, 3d, 7d, 30d]

### Return type

CompletableFuture<ApiResponse<[**RetrieveMessagingProfileMetricsResponse**](RetrieveMessagingProfileMetricsResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile&#39;s metrics. |  -  |
| **0** | Unexpected error |  -  |


## listMessagingProfileMetrics

> CompletableFuture<ListMessagingProfileMetricsResponse> listMessagingProfileMetrics(pageNumber, pageSize, id, timeFrame)

List messaging profile metrics

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        UUID id = new UUID(); // UUID | The id of the messaging profile(s) to retrieve
        String timeFrame = "24h"; // String | The timeframe for which you'd like to retrieve metrics.
        try {
            CompletableFuture<ListMessagingProfileMetricsResponse> result = apiInstance.listMessagingProfileMetrics(pageNumber, pageSize, id, timeFrame);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfileMetrics");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **id** | [**UUID**](.md)| The id of the messaging profile(s) to retrieve | [optional]
 **timeFrame** | **String**| The timeframe for which you&#39;d like to retrieve metrics. | [optional] [default to 24h] [enum: 1h, 3h, 24h, 3d, 7d, 30d]

### Return type

CompletableFuture<[**ListMessagingProfileMetricsResponse**](ListMessagingProfileMetricsResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging profile metrics. |  -  |
| **0** | Unexpected error |  -  |

## listMessagingProfileMetricsWithHttpInfo

> CompletableFuture<ApiResponse<ListMessagingProfileMetricsResponse>> listMessagingProfileMetrics listMessagingProfileMetricsWithHttpInfo(pageNumber, pageSize, id, timeFrame)

List messaging profile metrics

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        UUID id = new UUID(); // UUID | The id of the messaging profile(s) to retrieve
        String timeFrame = "24h"; // String | The timeframe for which you'd like to retrieve metrics.
        try {
            CompletableFuture<ApiResponse<ListMessagingProfileMetricsResponse>> response = apiInstance.listMessagingProfileMetricsWithHttpInfo(pageNumber, pageSize, id, timeFrame);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfileMetrics");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfileMetrics");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **id** | [**UUID**](.md)| The id of the messaging profile(s) to retrieve | [optional]
 **timeFrame** | **String**| The timeframe for which you&#39;d like to retrieve metrics. | [optional] [default to 24h] [enum: 1h, 3h, 24h, 3d, 7d, 30d]

### Return type

CompletableFuture<ApiResponse<[**ListMessagingProfileMetricsResponse**](ListMessagingProfileMetricsResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging profile metrics. |  -  |
| **0** | Unexpected error |  -  |


## listMessagingProfilePhoneNumbers

> CompletableFuture<ListMessagingProfilePhoneNumbersResponse> listMessagingProfilePhoneNumbers(id, pageNumber, pageSize)

List phone numbers associated with a messaging profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            CompletableFuture<ListMessagingProfilePhoneNumbersResponse> result = apiInstance.listMessagingProfilePhoneNumbers(id, pageNumber, pageSize);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfilePhoneNumbers");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

CompletableFuture<[**ListMessagingProfilePhoneNumbersResponse**](ListMessagingProfilePhoneNumbersResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging profile phone numbers. |  -  |
| **0** | Unexpected error |  -  |

## listMessagingProfilePhoneNumbersWithHttpInfo

> CompletableFuture<ApiResponse<ListMessagingProfilePhoneNumbersResponse>> listMessagingProfilePhoneNumbers listMessagingProfilePhoneNumbersWithHttpInfo(id, pageNumber, pageSize)

List phone numbers associated with a messaging profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            CompletableFuture<ApiResponse<ListMessagingProfilePhoneNumbersResponse>> response = apiInstance.listMessagingProfilePhoneNumbersWithHttpInfo(id, pageNumber, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfilePhoneNumbers");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfilePhoneNumbers");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

CompletableFuture<ApiResponse<[**ListMessagingProfilePhoneNumbersResponse**](ListMessagingProfilePhoneNumbersResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging profile phone numbers. |  -  |
| **0** | Unexpected error |  -  |


## listMessagingProfileShortCodes

> CompletableFuture<ListMessagingProfileShortCodesResponse> listMessagingProfileShortCodes(id, pageNumber, pageSize)

List short codes associated with a messaging profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            CompletableFuture<ListMessagingProfileShortCodesResponse> result = apiInstance.listMessagingProfileShortCodes(id, pageNumber, pageSize);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfileShortCodes");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

CompletableFuture<[**ListMessagingProfileShortCodesResponse**](ListMessagingProfileShortCodesResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging profile short codes. |  -  |
| **0** | Unexpected error |  -  |

## listMessagingProfileShortCodesWithHttpInfo

> CompletableFuture<ApiResponse<ListMessagingProfileShortCodesResponse>> listMessagingProfileShortCodes listMessagingProfileShortCodesWithHttpInfo(id, pageNumber, pageSize)

List short codes associated with a messaging profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            CompletableFuture<ApiResponse<ListMessagingProfileShortCodesResponse>> response = apiInstance.listMessagingProfileShortCodesWithHttpInfo(id, pageNumber, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfileShortCodes");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfileShortCodes");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

CompletableFuture<ApiResponse<[**ListMessagingProfileShortCodesResponse**](ListMessagingProfileShortCodesResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging profile short codes. |  -  |
| **0** | Unexpected error |  -  |


## listMessagingProfiles

> CompletableFuture<ListMessagingProfilesResponse> listMessagingProfiles(pageNumber, pageSize)

List messaging profiles

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            CompletableFuture<ListMessagingProfilesResponse> result = apiInstance.listMessagingProfiles(pageNumber, pageSize);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfiles");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

CompletableFuture<[**ListMessagingProfilesResponse**](ListMessagingProfilesResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging profiles. |  -  |
| **0** | Unexpected error |  -  |

## listMessagingProfilesWithHttpInfo

> CompletableFuture<ApiResponse<ListMessagingProfilesResponse>> listMessagingProfiles listMessagingProfilesWithHttpInfo(pageNumber, pageSize)

List messaging profiles

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            CompletableFuture<ApiResponse<ListMessagingProfilesResponse>> response = apiInstance.listMessagingProfilesWithHttpInfo(pageNumber, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfiles");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfiles");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

CompletableFuture<ApiResponse<[**ListMessagingProfilesResponse**](ListMessagingProfilesResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging profiles. |  -  |
| **0** | Unexpected error |  -  |


## retrieveMessagingProfile

> CompletableFuture<MessagingProfileResponse> retrieveMessagingProfile(id)

Retrieve a messaging profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        try {
            CompletableFuture<MessagingProfileResponse> result = apiInstance.retrieveMessagingProfile(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#retrieveMessagingProfile");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |

### Return type

CompletableFuture<[**MessagingProfileResponse**](MessagingProfileResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile. |  -  |
| **0** | Unexpected error |  -  |

## retrieveMessagingProfileWithHttpInfo

> CompletableFuture<ApiResponse<MessagingProfileResponse>> retrieveMessagingProfile retrieveMessagingProfileWithHttpInfo(id)

Retrieve a messaging profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        try {
            CompletableFuture<ApiResponse<MessagingProfileResponse>> response = apiInstance.retrieveMessagingProfileWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingProfilesApi#retrieveMessagingProfile");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#retrieveMessagingProfile");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |

### Return type

CompletableFuture<ApiResponse<[**MessagingProfileResponse**](MessagingProfileResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile. |  -  |
| **0** | Unexpected error |  -  |


## updateMessagingProfile

> CompletableFuture<MessagingProfileResponse> updateMessagingProfile(id, updateMessagingProfileRequest)

Update a messaging profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        UpdateMessagingProfileRequest updateMessagingProfileRequest = new UpdateMessagingProfileRequest(); // UpdateMessagingProfileRequest | New Messaging Profile object
        try {
            CompletableFuture<MessagingProfileResponse> result = apiInstance.updateMessagingProfile(id, updateMessagingProfileRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#updateMessagingProfile");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
 **updateMessagingProfileRequest** | [**UpdateMessagingProfileRequest**](UpdateMessagingProfileRequest.md)| New Messaging Profile object |

### Return type

CompletableFuture<[**MessagingProfileResponse**](MessagingProfileResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile. |  -  |
| **0** | Unexpected error |  -  |

## updateMessagingProfileWithHttpInfo

> CompletableFuture<ApiResponse<MessagingProfileResponse>> updateMessagingProfile updateMessagingProfileWithHttpInfo(id, updateMessagingProfileRequest)

Update a messaging profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        UpdateMessagingProfileRequest updateMessagingProfileRequest = new UpdateMessagingProfileRequest(); // UpdateMessagingProfileRequest | New Messaging Profile object
        try {
            CompletableFuture<ApiResponse<MessagingProfileResponse>> response = apiInstance.updateMessagingProfileWithHttpInfo(id, updateMessagingProfileRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MessagingProfilesApi#updateMessagingProfile");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#updateMessagingProfile");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
 **updateMessagingProfileRequest** | [**UpdateMessagingProfileRequest**](UpdateMessagingProfileRequest.md)| New Messaging Profile object |

### Return type

CompletableFuture<ApiResponse<[**MessagingProfileResponse**](MessagingProfileResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile. |  -  |
| **0** | Unexpected error |  -  |

