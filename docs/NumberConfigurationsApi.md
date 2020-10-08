# NumberConfigurationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePhoneNumber**](NumberConfigurationsApi.md#deletePhoneNumber) | **DELETE** /phone_numbers/{id} | Delete a phone number
[**deletePhoneNumberWithHttpInfo**](NumberConfigurationsApi.md#deletePhoneNumberWithHttpInfo) | **DELETE** /phone_numbers/{id} | Delete a phone number
[**enableEmergencyPhoneNumber**](NumberConfigurationsApi.md#enableEmergencyPhoneNumber) | **POST** /phone_numbers/{id}/actions/enable_emergency | Enable emergency for a phone number
[**enableEmergencyPhoneNumberWithHttpInfo**](NumberConfigurationsApi.md#enableEmergencyPhoneNumberWithHttpInfo) | **POST** /phone_numbers/{id}/actions/enable_emergency | Enable emergency for a phone number
[**listPhoneNumbers**](NumberConfigurationsApi.md#listPhoneNumbers) | **GET** /phone_numbers | List phone numbers
[**listPhoneNumbersWithHttpInfo**](NumberConfigurationsApi.md#listPhoneNumbersWithHttpInfo) | **GET** /phone_numbers | List phone numbers
[**listPhoneNumbersWithMessagingSettings**](NumberConfigurationsApi.md#listPhoneNumbersWithMessagingSettings) | **GET** /phone_numbers/messaging | List phone numbers with messaging settings
[**listPhoneNumbersWithMessagingSettingsWithHttpInfo**](NumberConfigurationsApi.md#listPhoneNumbersWithMessagingSettingsWithHttpInfo) | **GET** /phone_numbers/messaging | List phone numbers with messaging settings
[**listPhoneNumbersWithVoiceSettings**](NumberConfigurationsApi.md#listPhoneNumbersWithVoiceSettings) | **GET** /phone_numbers/voice | List phone numbers with voice settings
[**listPhoneNumbersWithVoiceSettingsWithHttpInfo**](NumberConfigurationsApi.md#listPhoneNumbersWithVoiceSettingsWithHttpInfo) | **GET** /phone_numbers/voice | List phone numbers with voice settings
[**retrievePhoneNumber**](NumberConfigurationsApi.md#retrievePhoneNumber) | **GET** /phone_numbers/{id} | Retrieve a phone number
[**retrievePhoneNumberWithHttpInfo**](NumberConfigurationsApi.md#retrievePhoneNumberWithHttpInfo) | **GET** /phone_numbers/{id} | Retrieve a phone number
[**retrievePhoneNumberWithMessagingSettings**](NumberConfigurationsApi.md#retrievePhoneNumberWithMessagingSettings) | **GET** /phone_numbers/{id}/messaging | Retrieve a phone number with messaging settings
[**retrievePhoneNumberWithMessagingSettingsWithHttpInfo**](NumberConfigurationsApi.md#retrievePhoneNumberWithMessagingSettingsWithHttpInfo) | **GET** /phone_numbers/{id}/messaging | Retrieve a phone number with messaging settings
[**retrievePhoneNumberWithVoiceSettings**](NumberConfigurationsApi.md#retrievePhoneNumberWithVoiceSettings) | **GET** /phone_numbers/{id}/voice | Retrieve a phone number with voice settings
[**retrievePhoneNumberWithVoiceSettingsWithHttpInfo**](NumberConfigurationsApi.md#retrievePhoneNumberWithVoiceSettingsWithHttpInfo) | **GET** /phone_numbers/{id}/voice | Retrieve a phone number with voice settings
[**updatePhoneNumber**](NumberConfigurationsApi.md#updatePhoneNumber) | **PATCH** /phone_numbers/{id} | Update a phone number
[**updatePhoneNumberWithHttpInfo**](NumberConfigurationsApi.md#updatePhoneNumberWithHttpInfo) | **PATCH** /phone_numbers/{id} | Update a phone number
[**updatePhoneNumberWithMessagingSettings**](NumberConfigurationsApi.md#updatePhoneNumberWithMessagingSettings) | **PATCH** /phone_numbers/{id}/messaging | Update a phone number with messaging settings
[**updatePhoneNumberWithMessagingSettingsWithHttpInfo**](NumberConfigurationsApi.md#updatePhoneNumberWithMessagingSettingsWithHttpInfo) | **PATCH** /phone_numbers/{id}/messaging | Update a phone number with messaging settings
[**updatePhoneNumberWithVoiceSettings**](NumberConfigurationsApi.md#updatePhoneNumberWithVoiceSettings) | **PATCH** /phone_numbers/{id}/voice | Update a phone number with voice settings
[**updatePhoneNumberWithVoiceSettingsWithHttpInfo**](NumberConfigurationsApi.md#updatePhoneNumberWithVoiceSettingsWithHttpInfo) | **PATCH** /phone_numbers/{id}/voice | Update a phone number with voice settings



## deletePhoneNumber

> CompletableFuture<PhoneNumberResponse> deletePhoneNumber(id)

Delete a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            CompletableFuture<PhoneNumberResponse> result = apiInstance.deletePhoneNumber(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#deletePhoneNumber");
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
 **id** | **String**| Identifies the resource. |

### Return type

CompletableFuture<[**PhoneNumberResponse**](PhoneNumberResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number. |  -  |
| **0** | Unexpected error |  -  |

## deletePhoneNumberWithHttpInfo

> CompletableFuture<ApiResponse<PhoneNumberResponse>> deletePhoneNumber deletePhoneNumberWithHttpInfo(id)

Delete a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            CompletableFuture<ApiResponse<PhoneNumberResponse>> response = apiInstance.deletePhoneNumberWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberConfigurationsApi#deletePhoneNumber");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#deletePhoneNumber");
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
 **id** | **String**| Identifies the resource. |

### Return type

CompletableFuture<ApiResponse<[**PhoneNumberResponse**](PhoneNumberResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number. |  -  |
| **0** | Unexpected error |  -  |


## enableEmergencyPhoneNumber

> CompletableFuture<PhoneNumberEnableEmergency> enableEmergencyPhoneNumber(id, phoneNumberEnableEmergencyRequest)

Enable emergency for a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        PhoneNumberEnableEmergencyRequest phoneNumberEnableEmergencyRequest = new PhoneNumberEnableEmergencyRequest(); // PhoneNumberEnableEmergencyRequest | 
        try {
            CompletableFuture<PhoneNumberEnableEmergency> result = apiInstance.enableEmergencyPhoneNumber(id, phoneNumberEnableEmergencyRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#enableEmergencyPhoneNumber");
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
 **id** | **String**| Identifies the resource. |
 **phoneNumberEnableEmergencyRequest** | [**PhoneNumberEnableEmergencyRequest**](PhoneNumberEnableEmergencyRequest.md)|  |

### Return type

CompletableFuture<[**PhoneNumberEnableEmergency**](PhoneNumberEnableEmergency.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Phone number emergency enabled. |  -  |
| **202** | Phone number emergency requested. |  -  |
| **0** | Unexpected error |  -  |

## enableEmergencyPhoneNumberWithHttpInfo

> CompletableFuture<ApiResponse<PhoneNumberEnableEmergency>> enableEmergencyPhoneNumber enableEmergencyPhoneNumberWithHttpInfo(id, phoneNumberEnableEmergencyRequest)

Enable emergency for a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        PhoneNumberEnableEmergencyRequest phoneNumberEnableEmergencyRequest = new PhoneNumberEnableEmergencyRequest(); // PhoneNumberEnableEmergencyRequest | 
        try {
            CompletableFuture<ApiResponse<PhoneNumberEnableEmergency>> response = apiInstance.enableEmergencyPhoneNumberWithHttpInfo(id, phoneNumberEnableEmergencyRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberConfigurationsApi#enableEmergencyPhoneNumber");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#enableEmergencyPhoneNumber");
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
 **id** | **String**| Identifies the resource. |
 **phoneNumberEnableEmergencyRequest** | [**PhoneNumberEnableEmergencyRequest**](PhoneNumberEnableEmergencyRequest.md)|  |

### Return type

CompletableFuture<ApiResponse<[**PhoneNumberEnableEmergency**](PhoneNumberEnableEmergency.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Phone number emergency enabled. |  -  |
| **202** | Phone number emergency requested. |  -  |
| **0** | Unexpected error |  -  |


## listPhoneNumbers

> CompletableFuture<ListPhoneNumbersResponse> listPhoneNumbers(listPhoneNumbersRequest)

List phone numbers

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import com.telnyx.sdk.apis.NumberConfigurationsApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterTag = "filterTag_example"; // String | Filter by phone number tags.
        String filterPhoneNumber = "filterPhoneNumber_example"; // String | Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned.
        String filterStatus = active; // String | Filter by phone number status.
        String filterVoiceConnectionNameContains = test; // String | Filter contains connection name. Requires at least three characters.
        String filterVoiceConnectionNameStartsWith = test; // String | Filter starts with connection name. Requires at least three characters.
        String filterVoiceConnectionNameEndsWith = test; // String | Filter ends with connection name. Requires at least three characters.
        String filterVoiceConnectionNameEq = test; // String | Filter by connection name.
        String filterUsagePaymentMethod = channel; // String | Filter by usage_payment_method.
        String filterBillingGroupId = 62e4bf2e-c278-4282-b524-488d9c9c43b2; // String | Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string 'null'.
        String sort = connection_name; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            APIlistPhoneNumbersRequest request = APIlistPhoneNumbersRequest.newBuilder()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterTag(filterTag)
                .filterPhoneNumber(filterPhoneNumber)
                .filterStatus(filterStatus)
                .filterVoiceConnectionNameContains(filterVoiceConnectionNameContains)
                .filterVoiceConnectionNameStartsWith(filterVoiceConnectionNameStartsWith)
                .filterVoiceConnectionNameEndsWith(filterVoiceConnectionNameEndsWith)
                .filterVoiceConnectionNameEq(filterVoiceConnectionNameEq)
                .filterUsagePaymentMethod(filterUsagePaymentMethod)
                .filterBillingGroupId(filterBillingGroupId)
                .sort(sort)
                .build();
            CompletableFuture<ListPhoneNumbersResponse> result = apiInstance.listPhoneNumbers(request);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbers");
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
| listPhoneNumbersRequest | [**APIlistPhoneNumbersRequest**](NumberConfigurationsApi.md#APIlistPhoneNumbersRequest)|-|-|

### Return type

CompletableFuture<[**ListPhoneNumbersResponse**](ListPhoneNumbersResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone numbers. |  -  |
| **0** | Unexpected error |  -  |

## listPhoneNumbersWithHttpInfo

> CompletableFuture<ApiResponse<ListPhoneNumbersResponse>> listPhoneNumbers listPhoneNumbersWithHttpInfo(listPhoneNumbersRequest)

List phone numbers

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import com.telnyx.sdk.apis.NumberConfigurationsApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterTag = "filterTag_example"; // String | Filter by phone number tags.
        String filterPhoneNumber = "filterPhoneNumber_example"; // String | Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned.
        String filterStatus = active; // String | Filter by phone number status.
        String filterVoiceConnectionNameContains = test; // String | Filter contains connection name. Requires at least three characters.
        String filterVoiceConnectionNameStartsWith = test; // String | Filter starts with connection name. Requires at least three characters.
        String filterVoiceConnectionNameEndsWith = test; // String | Filter ends with connection name. Requires at least three characters.
        String filterVoiceConnectionNameEq = test; // String | Filter by connection name.
        String filterUsagePaymentMethod = channel; // String | Filter by usage_payment_method.
        String filterBillingGroupId = 62e4bf2e-c278-4282-b524-488d9c9c43b2; // String | Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string 'null'.
        String sort = connection_name; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            APIlistPhoneNumbersRequest request = APIlistPhoneNumbersRequest.newBuilder()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterTag(filterTag)
                .filterPhoneNumber(filterPhoneNumber)
                .filterStatus(filterStatus)
                .filterVoiceConnectionNameContains(filterVoiceConnectionNameContains)
                .filterVoiceConnectionNameStartsWith(filterVoiceConnectionNameStartsWith)
                .filterVoiceConnectionNameEndsWith(filterVoiceConnectionNameEndsWith)
                .filterVoiceConnectionNameEq(filterVoiceConnectionNameEq)
                .filterUsagePaymentMethod(filterUsagePaymentMethod)
                .filterBillingGroupId(filterBillingGroupId)
                .sort(sort)
                .build();
            CompletableFuture<ApiResponse<ListPhoneNumbersResponse>> response = apiInstance.listPhoneNumbersWithHttpInfo(request);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbers");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbers");
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
| listPhoneNumbersRequest | [**APIlistPhoneNumbersRequest**](NumberConfigurationsApi.md#APIlistPhoneNumbersRequest)|-|-|

### Return type

CompletableFuture<ApiResponse<[**ListPhoneNumbersResponse**](ListPhoneNumbersResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone numbers. |  -  |
| **0** | Unexpected error |  -  |


<a name="APIlistPhoneNumbersRequest"></a>
## APIlistPhoneNumbersRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
 **pageNumber** | **Integer** | The page number to load | [optional] [default to 1]
 **pageSize** | **Integer** | The size of the page | [optional] [default to 20]
 **filterTag** | **String** | Filter by phone number tags. | [optional]
 **filterPhoneNumber** | **String** | Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. | [optional]
 **filterStatus** | **String** | Filter by phone number status. | [optional] [enum: purchase_pending, purchase_failed, port_pending, active, deleted, port_failed, emergency_only, ported_out, port_out_pending]
 **filterVoiceConnectionNameContains** | **String** | Filter contains connection name. Requires at least three characters. | [optional]
 **filterVoiceConnectionNameStartsWith** | **String** | Filter starts with connection name. Requires at least three characters. | [optional]
 **filterVoiceConnectionNameEndsWith** | **String** | Filter ends with connection name. Requires at least three characters. | [optional]
 **filterVoiceConnectionNameEq** | **String** | Filter by connection name. | [optional]
 **filterUsagePaymentMethod** | **String** | Filter by usage_payment_method. | [optional] [enum: pay-per-minute, channel]
 **filterBillingGroupId** | **String** | Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string &#39;null&#39;. | [optional]
 **sort** | **String** | Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: purchased_at, phone_number, connection_name, usage_payment_method]



## listPhoneNumbersWithMessagingSettings

> CompletableFuture<ListMessagingSettingsResponse> listPhoneNumbersWithMessagingSettings()

List phone numbers with messaging settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        try {
            CompletableFuture<ListMessagingSettingsResponse> result = apiInstance.listPhoneNumbersWithMessagingSettings();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbersWithMessagingSettings");
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

CompletableFuture<[**ListMessagingSettingsResponse**](ListMessagingSettingsResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone numbers with messaging settings. |  -  |
| **0** | Unexpected error |  -  |

## listPhoneNumbersWithMessagingSettingsWithHttpInfo

> CompletableFuture<ApiResponse<ListMessagingSettingsResponse>> listPhoneNumbersWithMessagingSettings listPhoneNumbersWithMessagingSettingsWithHttpInfo()

List phone numbers with messaging settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<ListMessagingSettingsResponse>> response = apiInstance.listPhoneNumbersWithMessagingSettingsWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbersWithMessagingSettings");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbersWithMessagingSettings");
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

CompletableFuture<ApiResponse<[**ListMessagingSettingsResponse**](ListMessagingSettingsResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone numbers with messaging settings. |  -  |
| **0** | Unexpected error |  -  |


## listPhoneNumbersWithVoiceSettings

> CompletableFuture<ListPhoneNumbersWithVoiceSettingsResponse> listPhoneNumbersWithVoiceSettings(pageNumber, pageSize, filterPhoneNumber, filterConnectionNameContains, filterUsagePaymentMethod, sort)

List phone numbers with voice settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterPhoneNumber = "filterPhoneNumber_example"; // String | Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned.
        String filterConnectionNameContains = test; // String | Filter contains connection name. Requires at least three characters.
        String filterUsagePaymentMethod = channel; // String | Filter by usage_payment_method.
        String sort = connection_name; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            CompletableFuture<ListPhoneNumbersWithVoiceSettingsResponse> result = apiInstance.listPhoneNumbersWithVoiceSettings(pageNumber, pageSize, filterPhoneNumber, filterConnectionNameContains, filterUsagePaymentMethod, sort);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbersWithVoiceSettings");
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
 **filterPhoneNumber** | **String**| Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. | [optional]
 **filterConnectionNameContains** | **String**| Filter contains connection name. Requires at least three characters. | [optional]
 **filterUsagePaymentMethod** | **String**| Filter by usage_payment_method. | [optional] [enum: pay-per-minute, channel]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: purchased_at, phone_number, connection_name, usage_payment_method]

### Return type

CompletableFuture<[**ListPhoneNumbersWithVoiceSettingsResponse**](ListPhoneNumbersWithVoiceSettingsResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone numbers with voice settings. |  -  |
| **0** | Unexpected error |  -  |

## listPhoneNumbersWithVoiceSettingsWithHttpInfo

> CompletableFuture<ApiResponse<ListPhoneNumbersWithVoiceSettingsResponse>> listPhoneNumbersWithVoiceSettings listPhoneNumbersWithVoiceSettingsWithHttpInfo(pageNumber, pageSize, filterPhoneNumber, filterConnectionNameContains, filterUsagePaymentMethod, sort)

List phone numbers with voice settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterPhoneNumber = "filterPhoneNumber_example"; // String | Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned.
        String filterConnectionNameContains = test; // String | Filter contains connection name. Requires at least three characters.
        String filterUsagePaymentMethod = channel; // String | Filter by usage_payment_method.
        String sort = connection_name; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            CompletableFuture<ApiResponse<ListPhoneNumbersWithVoiceSettingsResponse>> response = apiInstance.listPhoneNumbersWithVoiceSettingsWithHttpInfo(pageNumber, pageSize, filterPhoneNumber, filterConnectionNameContains, filterUsagePaymentMethod, sort);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbersWithVoiceSettings");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbersWithVoiceSettings");
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
 **filterPhoneNumber** | **String**| Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. | [optional]
 **filterConnectionNameContains** | **String**| Filter contains connection name. Requires at least three characters. | [optional]
 **filterUsagePaymentMethod** | **String**| Filter by usage_payment_method. | [optional] [enum: pay-per-minute, channel]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: purchased_at, phone_number, connection_name, usage_payment_method]

### Return type

CompletableFuture<ApiResponse<[**ListPhoneNumbersWithVoiceSettingsResponse**](ListPhoneNumbersWithVoiceSettingsResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone numbers with voice settings. |  -  |
| **0** | Unexpected error |  -  |


## retrievePhoneNumber

> CompletableFuture<PhoneNumberResponse> retrievePhoneNumber(id)

Retrieve a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            CompletableFuture<PhoneNumberResponse> result = apiInstance.retrievePhoneNumber(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumber");
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
 **id** | **String**| Identifies the resource. |

### Return type

CompletableFuture<[**PhoneNumberResponse**](PhoneNumberResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number. |  -  |
| **0** | Unexpected error |  -  |

## retrievePhoneNumberWithHttpInfo

> CompletableFuture<ApiResponse<PhoneNumberResponse>> retrievePhoneNumber retrievePhoneNumberWithHttpInfo(id)

Retrieve a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            CompletableFuture<ApiResponse<PhoneNumberResponse>> response = apiInstance.retrievePhoneNumberWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumber");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumber");
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
 **id** | **String**| Identifies the resource. |

### Return type

CompletableFuture<ApiResponse<[**PhoneNumberResponse**](PhoneNumberResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number. |  -  |
| **0** | Unexpected error |  -  |


## retrievePhoneNumberWithMessagingSettings

> CompletableFuture<RetrieveMessagingSettingsResponse> retrievePhoneNumberWithMessagingSettings(id)

Retrieve a phone number with messaging settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        try {
            CompletableFuture<RetrieveMessagingSettingsResponse> result = apiInstance.retrievePhoneNumberWithMessagingSettings(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumberWithMessagingSettings");
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

CompletableFuture<[**RetrieveMessagingSettingsResponse**](RetrieveMessagingSettingsResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number including voice settings. |  -  |
| **0** | Unexpected error |  -  |

## retrievePhoneNumberWithMessagingSettingsWithHttpInfo

> CompletableFuture<ApiResponse<RetrieveMessagingSettingsResponse>> retrievePhoneNumberWithMessagingSettings retrievePhoneNumberWithMessagingSettingsWithHttpInfo(id)

Retrieve a phone number with messaging settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        try {
            CompletableFuture<ApiResponse<RetrieveMessagingSettingsResponse>> response = apiInstance.retrievePhoneNumberWithMessagingSettingsWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumberWithMessagingSettings");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumberWithMessagingSettings");
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

CompletableFuture<ApiResponse<[**RetrieveMessagingSettingsResponse**](RetrieveMessagingSettingsResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number including voice settings. |  -  |
| **0** | Unexpected error |  -  |


## retrievePhoneNumberWithVoiceSettings

> CompletableFuture<RetrievePhoneNumberVoiceResponse> retrievePhoneNumberWithVoiceSettings(id)

Retrieve a phone number with voice settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            CompletableFuture<RetrievePhoneNumberVoiceResponse> result = apiInstance.retrievePhoneNumberWithVoiceSettings(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumberWithVoiceSettings");
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
 **id** | **String**| Identifies the resource. |

### Return type

CompletableFuture<[**RetrievePhoneNumberVoiceResponse**](RetrievePhoneNumberVoiceResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number including voice settings. |  -  |
| **0** | Unexpected error |  -  |

## retrievePhoneNumberWithVoiceSettingsWithHttpInfo

> CompletableFuture<ApiResponse<RetrievePhoneNumberVoiceResponse>> retrievePhoneNumberWithVoiceSettings retrievePhoneNumberWithVoiceSettingsWithHttpInfo(id)

Retrieve a phone number with voice settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            CompletableFuture<ApiResponse<RetrievePhoneNumberVoiceResponse>> response = apiInstance.retrievePhoneNumberWithVoiceSettingsWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumberWithVoiceSettings");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumberWithVoiceSettings");
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
 **id** | **String**| Identifies the resource. |

### Return type

CompletableFuture<ApiResponse<[**RetrievePhoneNumberVoiceResponse**](RetrievePhoneNumberVoiceResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number including voice settings. |  -  |
| **0** | Unexpected error |  -  |


## updatePhoneNumber

> CompletableFuture<PhoneNumberResponse> updatePhoneNumber(id, updatePhoneNumberRequest)

Update a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        UpdatePhoneNumberRequest updatePhoneNumberRequest = new UpdatePhoneNumberRequest(); // UpdatePhoneNumberRequest | Updated settings for the phone number.
        try {
            CompletableFuture<PhoneNumberResponse> result = apiInstance.updatePhoneNumber(id, updatePhoneNumberRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumber");
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
 **id** | **String**| Identifies the resource. |
 **updatePhoneNumberRequest** | [**UpdatePhoneNumberRequest**](UpdatePhoneNumberRequest.md)| Updated settings for the phone number. |

### Return type

CompletableFuture<[**PhoneNumberResponse**](PhoneNumberResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number. |  -  |
| **0** | Unexpected error |  -  |

## updatePhoneNumberWithHttpInfo

> CompletableFuture<ApiResponse<PhoneNumberResponse>> updatePhoneNumber updatePhoneNumberWithHttpInfo(id, updatePhoneNumberRequest)

Update a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        UpdatePhoneNumberRequest updatePhoneNumberRequest = new UpdatePhoneNumberRequest(); // UpdatePhoneNumberRequest | Updated settings for the phone number.
        try {
            CompletableFuture<ApiResponse<PhoneNumberResponse>> response = apiInstance.updatePhoneNumberWithHttpInfo(id, updatePhoneNumberRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumber");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumber");
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
 **id** | **String**| Identifies the resource. |
 **updatePhoneNumberRequest** | [**UpdatePhoneNumberRequest**](UpdatePhoneNumberRequest.md)| Updated settings for the phone number. |

### Return type

CompletableFuture<ApiResponse<[**PhoneNumberResponse**](PhoneNumberResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number. |  -  |
| **0** | Unexpected error |  -  |


## updatePhoneNumberWithMessagingSettings

> CompletableFuture<RetrieveMessagingSettingsResponse> updatePhoneNumberWithMessagingSettings(id, updatePhoneNumberMessagingSettingsRequest)

Update a phone number with messaging settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        UpdatePhoneNumberMessagingSettingsRequest updatePhoneNumberMessagingSettingsRequest = new UpdatePhoneNumberMessagingSettingsRequest(); // UpdatePhoneNumberMessagingSettingsRequest | Updated messaging settings for the phone number
        try {
            CompletableFuture<RetrieveMessagingSettingsResponse> result = apiInstance.updatePhoneNumberWithMessagingSettings(id, updatePhoneNumberMessagingSettingsRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumberWithMessagingSettings");
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
 **updatePhoneNumberMessagingSettingsRequest** | [**UpdatePhoneNumberMessagingSettingsRequest**](UpdatePhoneNumberMessagingSettingsRequest.md)| Updated messaging settings for the phone number |

### Return type

CompletableFuture<[**RetrieveMessagingSettingsResponse**](RetrieveMessagingSettingsResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number including voice settings. |  -  |
| **0** | Unexpected error |  -  |

## updatePhoneNumberWithMessagingSettingsWithHttpInfo

> CompletableFuture<ApiResponse<RetrieveMessagingSettingsResponse>> updatePhoneNumberWithMessagingSettings updatePhoneNumberWithMessagingSettingsWithHttpInfo(id, updatePhoneNumberMessagingSettingsRequest)

Update a phone number with messaging settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        UpdatePhoneNumberMessagingSettingsRequest updatePhoneNumberMessagingSettingsRequest = new UpdatePhoneNumberMessagingSettingsRequest(); // UpdatePhoneNumberMessagingSettingsRequest | Updated messaging settings for the phone number
        try {
            CompletableFuture<ApiResponse<RetrieveMessagingSettingsResponse>> response = apiInstance.updatePhoneNumberWithMessagingSettingsWithHttpInfo(id, updatePhoneNumberMessagingSettingsRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumberWithMessagingSettings");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumberWithMessagingSettings");
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
 **updatePhoneNumberMessagingSettingsRequest** | [**UpdatePhoneNumberMessagingSettingsRequest**](UpdatePhoneNumberMessagingSettingsRequest.md)| Updated messaging settings for the phone number |

### Return type

CompletableFuture<ApiResponse<[**RetrieveMessagingSettingsResponse**](RetrieveMessagingSettingsResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number including voice settings. |  -  |
| **0** | Unexpected error |  -  |


## updatePhoneNumberWithVoiceSettings

> CompletableFuture<RetrievePhoneNumberVoiceResponse> updatePhoneNumberWithVoiceSettings(id, updatePhoneNumberVoiceSettingsRequest)

Update a phone number with voice settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        UpdatePhoneNumberVoiceSettingsRequest updatePhoneNumberVoiceSettingsRequest = new UpdatePhoneNumberVoiceSettingsRequest(); // UpdatePhoneNumberVoiceSettingsRequest | Updated voice settings for the phone number.
        try {
            CompletableFuture<RetrievePhoneNumberVoiceResponse> result = apiInstance.updatePhoneNumberWithVoiceSettings(id, updatePhoneNumberVoiceSettingsRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumberWithVoiceSettings");
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
 **id** | **String**| Identifies the resource. |
 **updatePhoneNumberVoiceSettingsRequest** | [**UpdatePhoneNumberVoiceSettingsRequest**](UpdatePhoneNumberVoiceSettingsRequest.md)| Updated voice settings for the phone number. |

### Return type

CompletableFuture<[**RetrievePhoneNumberVoiceResponse**](RetrievePhoneNumberVoiceResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number including voice settings. |  -  |
| **0** | Unexpected error |  -  |

## updatePhoneNumberWithVoiceSettingsWithHttpInfo

> CompletableFuture<ApiResponse<RetrievePhoneNumberVoiceResponse>> updatePhoneNumberWithVoiceSettings updatePhoneNumberWithVoiceSettingsWithHttpInfo(id, updatePhoneNumberVoiceSettingsRequest)

Update a phone number with voice settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberConfigurationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        UpdatePhoneNumberVoiceSettingsRequest updatePhoneNumberVoiceSettingsRequest = new UpdatePhoneNumberVoiceSettingsRequest(); // UpdatePhoneNumberVoiceSettingsRequest | Updated voice settings for the phone number.
        try {
            CompletableFuture<ApiResponse<RetrievePhoneNumberVoiceResponse>> response = apiInstance.updatePhoneNumberWithVoiceSettingsWithHttpInfo(id, updatePhoneNumberVoiceSettingsRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumberWithVoiceSettings");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumberWithVoiceSettings");
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
 **id** | **String**| Identifies the resource. |
 **updatePhoneNumberVoiceSettingsRequest** | [**UpdatePhoneNumberVoiceSettingsRequest**](UpdatePhoneNumberVoiceSettingsRequest.md)| Updated voice settings for the phone number. |

### Return type

CompletableFuture<ApiResponse<[**RetrievePhoneNumberVoiceResponse**](RetrievePhoneNumberVoiceResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number including voice settings. |  -  |
| **0** | Unexpected error |  -  |

