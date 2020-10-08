# DebuggingApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCallEvents**](DebuggingApi.md#listCallEvents) | **GET** /call_events | List call events
[**listCallEventsWithHttpInfo**](DebuggingApi.md#listCallEventsWithHttpInfo) | **GET** /call_events | List call events



## listCallEvents

> CompletableFuture<ListCallEventsResponse> listCallEvents(listCallEventsRequest)

List call events

Filters call events by given filter parameters. Events are ordered by &#x60;event_timestamp&#x60;. If filter for &#x60;call_leg_id&#x60; or &#x60;call_session_id&#x60; is not present, it only filters events from the last 24 hours.  **Note**: Only one &#x60;filter[event_timestamp]&#x60; can be passed. 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.DebuggingApi;
import com.telnyx.sdk.apis.DebuggingApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DebuggingApi apiInstance = new DebuggingApi(defaultClient);
        UUID filterCallLegId = new UUID(); // UUID | The unique identifier of an individual call leg.
        UUID filterCallSessionId = new UUID(); // UUID | The unique identifier of the call control session. A session may include multiple call leg events.
        String filterStatus = delivered; // String | Event status
        String filterType = webhook; // String | Event type
        String filterEventTimestampGt = 2019-03-29T11:10:00Z; // String | Event timestamp: greater than
        String filterEventTimestampGte = 2019-03-29T11:10:00Z; // String | Event timestamp: greater than or equal
        String filterEventTimestampLt = 2019-03-29T11:10:00Z; // String | Event timestamp: lower than
        String filterEventTimestampLte = 2019-03-29T11:10:00Z; // String | Event timestamp: lower than or equal
        String filterEventTimestampEq = 2019-03-29T11:10:00Z; // String | Event timestamp: equal
        try {
            APIlistCallEventsRequest request = APIlistCallEventsRequest.newBuilder()
                .filterCallLegId(filterCallLegId)
                .filterCallSessionId(filterCallSessionId)
                .filterStatus(filterStatus)
                .filterType(filterType)
                .filterEventTimestampGt(filterEventTimestampGt)
                .filterEventTimestampGte(filterEventTimestampGte)
                .filterEventTimestampLt(filterEventTimestampLt)
                .filterEventTimestampLte(filterEventTimestampLte)
                .filterEventTimestampEq(filterEventTimestampEq)
                .build();
            CompletableFuture<ListCallEventsResponse> result = apiInstance.listCallEvents(request);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling DebuggingApi#listCallEvents");
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
| listCallEventsRequest | [**APIlistCallEventsRequest**](DebuggingApi.md#APIlistCallEventsRequest)|-|-|

### Return type

CompletableFuture<[**ListCallEventsResponse**](ListCallEventsResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of call events. |  -  |
| **0** | Unexpected error |  -  |

## listCallEventsWithHttpInfo

> CompletableFuture<ApiResponse<ListCallEventsResponse>> listCallEvents listCallEventsWithHttpInfo(listCallEventsRequest)

List call events

Filters call events by given filter parameters. Events are ordered by &#x60;event_timestamp&#x60;. If filter for &#x60;call_leg_id&#x60; or &#x60;call_session_id&#x60; is not present, it only filters events from the last 24 hours.  **Note**: Only one &#x60;filter[event_timestamp]&#x60; can be passed. 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.DebuggingApi;
import com.telnyx.sdk.apis.DebuggingApi.*;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DebuggingApi apiInstance = new DebuggingApi(defaultClient);
        UUID filterCallLegId = new UUID(); // UUID | The unique identifier of an individual call leg.
        UUID filterCallSessionId = new UUID(); // UUID | The unique identifier of the call control session. A session may include multiple call leg events.
        String filterStatus = delivered; // String | Event status
        String filterType = webhook; // String | Event type
        String filterEventTimestampGt = 2019-03-29T11:10:00Z; // String | Event timestamp: greater than
        String filterEventTimestampGte = 2019-03-29T11:10:00Z; // String | Event timestamp: greater than or equal
        String filterEventTimestampLt = 2019-03-29T11:10:00Z; // String | Event timestamp: lower than
        String filterEventTimestampLte = 2019-03-29T11:10:00Z; // String | Event timestamp: lower than or equal
        String filterEventTimestampEq = 2019-03-29T11:10:00Z; // String | Event timestamp: equal
        try {
            APIlistCallEventsRequest request = APIlistCallEventsRequest.newBuilder()
                .filterCallLegId(filterCallLegId)
                .filterCallSessionId(filterCallSessionId)
                .filterStatus(filterStatus)
                .filterType(filterType)
                .filterEventTimestampGt(filterEventTimestampGt)
                .filterEventTimestampGte(filterEventTimestampGte)
                .filterEventTimestampLt(filterEventTimestampLt)
                .filterEventTimestampLte(filterEventTimestampLte)
                .filterEventTimestampEq(filterEventTimestampEq)
                .build();
            CompletableFuture<ApiResponse<ListCallEventsResponse>> response = apiInstance.listCallEventsWithHttpInfo(request);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling DebuggingApi#listCallEvents");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DebuggingApi#listCallEvents");
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
| listCallEventsRequest | [**APIlistCallEventsRequest**](DebuggingApi.md#APIlistCallEventsRequest)|-|-|

### Return type

CompletableFuture<ApiResponse<[**ListCallEventsResponse**](ListCallEventsResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of call events. |  -  |
| **0** | Unexpected error |  -  |


<a name="APIlistCallEventsRequest"></a>
## APIlistCallEventsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
 **filterCallLegId** | [**UUID**](.md) | The unique identifier of an individual call leg. | [optional]
 **filterCallSessionId** | [**UUID**](.md) | The unique identifier of the call control session. A session may include multiple call leg events. | [optional]
 **filterStatus** | **String** | Event status | [optional] [enum: delivered, failed]
 **filterType** | **String** | Event type | [optional] [enum: command, webhook]
 **filterEventTimestampGt** | **String** | Event timestamp: greater than | [optional]
 **filterEventTimestampGte** | **String** | Event timestamp: greater than or equal | [optional]
 **filterEventTimestampLt** | **String** | Event timestamp: lower than | [optional]
 **filterEventTimestampLte** | **String** | Event timestamp: lower than or equal | [optional]
 **filterEventTimestampEq** | **String** | Event timestamp: equal | [optional]


