# CallCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callAnswer**](CallCommandsApi.md#callAnswer) | **POST** /calls/{call_control_id}/actions/answer | Answer call
[**callAnswerWithHttpInfo**](CallCommandsApi.md#callAnswerWithHttpInfo) | **POST** /calls/{call_control_id}/actions/answer | Answer call
[**callBridge**](CallCommandsApi.md#callBridge) | **POST** /calls/{call_control_id}/actions/bridge | Bridge calls
[**callBridgeWithHttpInfo**](CallCommandsApi.md#callBridgeWithHttpInfo) | **POST** /calls/{call_control_id}/actions/bridge | Bridge calls
[**callDial**](CallCommandsApi.md#callDial) | **POST** /calls | Dial
[**callDialWithHttpInfo**](CallCommandsApi.md#callDialWithHttpInfo) | **POST** /calls | Dial
[**callForkStart**](CallCommandsApi.md#callForkStart) | **POST** /calls/{call_control_id}/actions/fork_start | Forking start
[**callForkStartWithHttpInfo**](CallCommandsApi.md#callForkStartWithHttpInfo) | **POST** /calls/{call_control_id}/actions/fork_start | Forking start
[**callForkStop**](CallCommandsApi.md#callForkStop) | **POST** /calls/{call_control_id}/actions/fork_stop | Forking stop
[**callForkStopWithHttpInfo**](CallCommandsApi.md#callForkStopWithHttpInfo) | **POST** /calls/{call_control_id}/actions/fork_stop | Forking stop
[**callGatherStop**](CallCommandsApi.md#callGatherStop) | **POST** /calls/{call_control_id}/actions/gather_stop | Gather stop
[**callGatherStopWithHttpInfo**](CallCommandsApi.md#callGatherStopWithHttpInfo) | **POST** /calls/{call_control_id}/actions/gather_stop | Gather stop
[**callGatherUsingAudio**](CallCommandsApi.md#callGatherUsingAudio) | **POST** /calls/{call_control_id}/actions/gather_using_audio | Gather using audio
[**callGatherUsingAudioWithHttpInfo**](CallCommandsApi.md#callGatherUsingAudioWithHttpInfo) | **POST** /calls/{call_control_id}/actions/gather_using_audio | Gather using audio
[**callGatherUsingSpeak**](CallCommandsApi.md#callGatherUsingSpeak) | **POST** /calls/{call_control_id}/actions/gather_using_speak | Gather using speak
[**callGatherUsingSpeakWithHttpInfo**](CallCommandsApi.md#callGatherUsingSpeakWithHttpInfo) | **POST** /calls/{call_control_id}/actions/gather_using_speak | Gather using speak
[**callHangup**](CallCommandsApi.md#callHangup) | **POST** /calls/{call_control_id}/actions/hangup | Hangup call
[**callHangupWithHttpInfo**](CallCommandsApi.md#callHangupWithHttpInfo) | **POST** /calls/{call_control_id}/actions/hangup | Hangup call
[**callPlaybackStart**](CallCommandsApi.md#callPlaybackStart) | **POST** /calls/{call_control_id}/actions/playback_start | Play audio URL
[**callPlaybackStartWithHttpInfo**](CallCommandsApi.md#callPlaybackStartWithHttpInfo) | **POST** /calls/{call_control_id}/actions/playback_start | Play audio URL
[**callPlaybackStop**](CallCommandsApi.md#callPlaybackStop) | **POST** /calls/{call_control_id}/actions/playback_stop | Stop audio playback
[**callPlaybackStopWithHttpInfo**](CallCommandsApi.md#callPlaybackStopWithHttpInfo) | **POST** /calls/{call_control_id}/actions/playback_stop | Stop audio playback
[**callRecordStart**](CallCommandsApi.md#callRecordStart) | **POST** /calls/{call_control_id}/actions/record_start | Recording start
[**callRecordStartWithHttpInfo**](CallCommandsApi.md#callRecordStartWithHttpInfo) | **POST** /calls/{call_control_id}/actions/record_start | Recording start
[**callRecordStop**](CallCommandsApi.md#callRecordStop) | **POST** /calls/{call_control_id}/actions/record_stop | Recording stop
[**callRecordStopWithHttpInfo**](CallCommandsApi.md#callRecordStopWithHttpInfo) | **POST** /calls/{call_control_id}/actions/record_stop | Recording stop
[**callReject**](CallCommandsApi.md#callReject) | **POST** /calls/{call_control_id}/actions/reject | Reject a call
[**callRejectWithHttpInfo**](CallCommandsApi.md#callRejectWithHttpInfo) | **POST** /calls/{call_control_id}/actions/reject | Reject a call
[**callSendDTMF**](CallCommandsApi.md#callSendDTMF) | **POST** /calls/{call_control_id}/actions/send_dtmf | Send DTMF
[**callSendDTMFWithHttpInfo**](CallCommandsApi.md#callSendDTMFWithHttpInfo) | **POST** /calls/{call_control_id}/actions/send_dtmf | Send DTMF
[**callSpeak**](CallCommandsApi.md#callSpeak) | **POST** /calls/{call_control_id}/actions/speak | Speak text
[**callSpeakWithHttpInfo**](CallCommandsApi.md#callSpeakWithHttpInfo) | **POST** /calls/{call_control_id}/actions/speak | Speak text
[**callTransfer**](CallCommandsApi.md#callTransfer) | **POST** /calls/{call_control_id}/actions/transfer | Transfer call
[**callTransferWithHttpInfo**](CallCommandsApi.md#callTransferWithHttpInfo) | **POST** /calls/{call_control_id}/actions/transfer | Transfer call



## callAnswer

> CompletableFuture<CallControlCommandResponse> callAnswer(callControlId, answerRequest)

Answer call

Answer an incoming call. You must issue this command before executing subsequent commands on an incoming call.  **Expected Webhooks:**  - &#x60;call.answered&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        AnswerRequest answerRequest = new AnswerRequest(); // AnswerRequest | Answer call request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callAnswer(callControlId, answerRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callAnswer");
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
 **answerRequest** | [**AnswerRequest**](AnswerRequest.md)| Answer call request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callAnswerWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callAnswer callAnswerWithHttpInfo(callControlId, answerRequest)

Answer call

Answer an incoming call. You must issue this command before executing subsequent commands on an incoming call.  **Expected Webhooks:**  - &#x60;call.answered&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        AnswerRequest answerRequest = new AnswerRequest(); // AnswerRequest | Answer call request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callAnswerWithHttpInfo(callControlId, answerRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callAnswer");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callAnswer");
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
 **answerRequest** | [**AnswerRequest**](AnswerRequest.md)| Answer call request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callBridge

> CompletableFuture<CallControlCommandResponse> callBridge(callControlId, bridgeRequest)

Bridge calls

Bridge two call control calls.  **Expected Webhooks:**  - &#x60;call.bridged&#x60; for Leg A - &#x60;call.bridged&#x60; for Leg B 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        BridgeRequest bridgeRequest = new BridgeRequest(); // BridgeRequest | Bridge call request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callBridge(callControlId, bridgeRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callBridge");
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
 **bridgeRequest** | [**BridgeRequest**](BridgeRequest.md)| Bridge call request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callBridgeWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callBridge callBridgeWithHttpInfo(callControlId, bridgeRequest)

Bridge calls

Bridge two call control calls.  **Expected Webhooks:**  - &#x60;call.bridged&#x60; for Leg A - &#x60;call.bridged&#x60; for Leg B 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        BridgeRequest bridgeRequest = new BridgeRequest(); // BridgeRequest | Bridge call request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callBridgeWithHttpInfo(callControlId, bridgeRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callBridge");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callBridge");
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
 **bridgeRequest** | [**BridgeRequest**](BridgeRequest.md)| Bridge call request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callDial

> CompletableFuture<RetrieveCallStatusResponse> callDial(callRequest)

Dial

Dial a number or SIP URI from a given connection. A successful response will include a &#x60;call_leg_id&#x60; which can be used to correlate the command with subsequent webhooks.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        CallRequest callRequest = new CallRequest(); // CallRequest | Call request
        try {
            CompletableFuture<RetrieveCallStatusResponse> result = apiInstance.callDial(callRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callDial");
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
 **callRequest** | [**CallRequest**](CallRequest.md)| Call request |

### Return type

CompletableFuture<[**RetrieveCallStatusResponse**](RetrieveCallStatusResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a call status. |  -  |
| **0** | Unexpected error |  -  |

## callDialWithHttpInfo

> CompletableFuture<ApiResponse<RetrieveCallStatusResponse>> callDial callDialWithHttpInfo(callRequest)

Dial

Dial a number or SIP URI from a given connection. A successful response will include a &#x60;call_leg_id&#x60; which can be used to correlate the command with subsequent webhooks.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        CallRequest callRequest = new CallRequest(); // CallRequest | Call request
        try {
            CompletableFuture<ApiResponse<RetrieveCallStatusResponse>> response = apiInstance.callDialWithHttpInfo(callRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callDial");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callDial");
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
 **callRequest** | [**CallRequest**](CallRequest.md)| Call request |

### Return type

CompletableFuture<ApiResponse<[**RetrieveCallStatusResponse**](RetrieveCallStatusResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a call status. |  -  |
| **0** | Unexpected error |  -  |


## callForkStart

> CompletableFuture<CallControlCommandResponse> callForkStart(callControlId, startForkingRequest)

Forking start

Call forking allows you to stream the media from a call to a specific target in realtime.  This stream can be used to enable realtime audio analysis to support a  variety of use cases, including fraud detection, or the creation of AI-generated audio responses.  Requests must specify either the &#x60;target&#x60; attribute or the &#x60;rx&#x60; and &#x60;tx&#x60; attributes.  **Expected Webhooks:**  - &#x60;call.fork.started&#x60; - &#x60;call.fork.stopped&#x60;  **Simple Telnyx RTP Encapsulation Protocol (STREP)**  *Note: This header/encapsulation is not used when the &#x60;rx&#x60; and &#x60;tx&#x60; parameters have been specified; it only applies when media is forked using the &#x60;target&#x60; attribute.*  If the destination for forked media is specified using the \&quot;target\&quot; attribute, the RTP will be encapsulated in an extra Telnyx protocol, which adds a 24 byte header to the RTP payload in each packet. The STREP header includes the Call Control &#x60;call_leg_id&#x60; for stream identification, along with bits that represent the direction (inbound or outbound) of the media. This 24-byte header sits between the UDP header and the RTP header.  The STREP header makes it possible to fork RTP for multiple calls (or two RTP streams for the same call) to the same IP:port, where the streams can be demultiplexed by your application using the information in the header. Of course, it&#39;s still possible to ignore this header completely, for example, if sending forked media for different calls to different ports or IP addresses. In this case, simply strip 24 bytes (or use the second byte to find the header length) from the received UDP payload to get the RTP (RTP header and payload).  &#x60;&#x60;&#x60; STREP Specification    0                   1                   2                   3   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |1 1|Version|L|D|    HeaderLen  |  reserved (2 bytes)           |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |       reserved (4 bytes, for UDP ports or anything else)      |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |               The call_leg_id                                 |  |                   from Call Control                           |  |                       (128 bits / 16 bytes)                   |  |                           (this is binary data)               |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+   11    Static bits 11, always set to 11 to easily distinguish forked media    from RTP (10) and T.38 media (usually 00) and SIP (which begins    with a capital letter, so begins with bits 01). This is a magic number.   Version    Four bits to indicate the version number of the protocol, starting at 0001.   L    One bit to represent the leg of the call (A or B).    0 represents the A (first) leg of the call.    1 represents the B (second) leg of the call.   D    One bit to represent the direction of this RTP stream.    0 represents media received by Telnyx.    1 represents media transmitted by Telnyx.   HeaderLen (1 byte)    The length of the header in bytes.    Note that this value does not include the length of the payload. The total    size of the RTP can be calculated by subtracting the HeaderLen from the UDP    length (minus 8 for the UDP header).    In version 1, this value will always be 24.   Reserved (6 bytes)    Reserved for future use and to make sure that the header is a multiple of 32 bits   Call Leg ID    A 128-bit identifier for the call leg.    This is the call_leg_id from Call Control. &#x60;&#x60;&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        StartForkingRequest startForkingRequest = new StartForkingRequest(); // StartForkingRequest | Fork media request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callForkStart(callControlId, startForkingRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callForkStart");
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
 **startForkingRequest** | [**StartForkingRequest**](StartForkingRequest.md)| Fork media request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callForkStartWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callForkStart callForkStartWithHttpInfo(callControlId, startForkingRequest)

Forking start

Call forking allows you to stream the media from a call to a specific target in realtime.  This stream can be used to enable realtime audio analysis to support a  variety of use cases, including fraud detection, or the creation of AI-generated audio responses.  Requests must specify either the &#x60;target&#x60; attribute or the &#x60;rx&#x60; and &#x60;tx&#x60; attributes.  **Expected Webhooks:**  - &#x60;call.fork.started&#x60; - &#x60;call.fork.stopped&#x60;  **Simple Telnyx RTP Encapsulation Protocol (STREP)**  *Note: This header/encapsulation is not used when the &#x60;rx&#x60; and &#x60;tx&#x60; parameters have been specified; it only applies when media is forked using the &#x60;target&#x60; attribute.*  If the destination for forked media is specified using the \&quot;target\&quot; attribute, the RTP will be encapsulated in an extra Telnyx protocol, which adds a 24 byte header to the RTP payload in each packet. The STREP header includes the Call Control &#x60;call_leg_id&#x60; for stream identification, along with bits that represent the direction (inbound or outbound) of the media. This 24-byte header sits between the UDP header and the RTP header.  The STREP header makes it possible to fork RTP for multiple calls (or two RTP streams for the same call) to the same IP:port, where the streams can be demultiplexed by your application using the information in the header. Of course, it&#39;s still possible to ignore this header completely, for example, if sending forked media for different calls to different ports or IP addresses. In this case, simply strip 24 bytes (or use the second byte to find the header length) from the received UDP payload to get the RTP (RTP header and payload).  &#x60;&#x60;&#x60; STREP Specification    0                   1                   2                   3   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |1 1|Version|L|D|    HeaderLen  |  reserved (2 bytes)           |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |       reserved (4 bytes, for UDP ports or anything else)      |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |               The call_leg_id                                 |  |                   from Call Control                           |  |                       (128 bits / 16 bytes)                   |  |                           (this is binary data)               |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+   11    Static bits 11, always set to 11 to easily distinguish forked media    from RTP (10) and T.38 media (usually 00) and SIP (which begins    with a capital letter, so begins with bits 01). This is a magic number.   Version    Four bits to indicate the version number of the protocol, starting at 0001.   L    One bit to represent the leg of the call (A or B).    0 represents the A (first) leg of the call.    1 represents the B (second) leg of the call.   D    One bit to represent the direction of this RTP stream.    0 represents media received by Telnyx.    1 represents media transmitted by Telnyx.   HeaderLen (1 byte)    The length of the header in bytes.    Note that this value does not include the length of the payload. The total    size of the RTP can be calculated by subtracting the HeaderLen from the UDP    length (minus 8 for the UDP header).    In version 1, this value will always be 24.   Reserved (6 bytes)    Reserved for future use and to make sure that the header is a multiple of 32 bits   Call Leg ID    A 128-bit identifier for the call leg.    This is the call_leg_id from Call Control. &#x60;&#x60;&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        StartForkingRequest startForkingRequest = new StartForkingRequest(); // StartForkingRequest | Fork media request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callForkStartWithHttpInfo(callControlId, startForkingRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callForkStart");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callForkStart");
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
 **startForkingRequest** | [**StartForkingRequest**](StartForkingRequest.md)| Fork media request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callForkStop

> CompletableFuture<CallControlCommandResponse> callForkStop(callControlId, stopForkingRequest)

Forking stop

Stop forking a call.  **Expected Webhooks:**  - &#x60;call.fork.stopped&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        StopForkingRequest stopForkingRequest = new StopForkingRequest(); // StopForkingRequest | Stop forking media request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callForkStop(callControlId, stopForkingRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callForkStop");
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
 **stopForkingRequest** | [**StopForkingRequest**](StopForkingRequest.md)| Stop forking media request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callForkStopWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callForkStop callForkStopWithHttpInfo(callControlId, stopForkingRequest)

Forking stop

Stop forking a call.  **Expected Webhooks:**  - &#x60;call.fork.stopped&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        StopForkingRequest stopForkingRequest = new StopForkingRequest(); // StopForkingRequest | Stop forking media request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callForkStopWithHttpInfo(callControlId, stopForkingRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callForkStop");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callForkStop");
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
 **stopForkingRequest** | [**StopForkingRequest**](StopForkingRequest.md)| Stop forking media request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callGatherStop

> CompletableFuture<CallControlCommandResponse> callGatherStop(callControlId, stopGatherRequest)

Gather stop

Stop current gather.  **Expected Webhooks:**  - &#x60;call.gather.ended&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        StopGatherRequest stopGatherRequest = new StopGatherRequest(); // StopGatherRequest | Stop current gather
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callGatherStop(callControlId, stopGatherRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callGatherStop");
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
 **stopGatherRequest** | [**StopGatherRequest**](StopGatherRequest.md)| Stop current gather |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callGatherStopWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callGatherStop callGatherStopWithHttpInfo(callControlId, stopGatherRequest)

Gather stop

Stop current gather.  **Expected Webhooks:**  - &#x60;call.gather.ended&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        StopGatherRequest stopGatherRequest = new StopGatherRequest(); // StopGatherRequest | Stop current gather
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callGatherStopWithHttpInfo(callControlId, stopGatherRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callGatherStop");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callGatherStop");
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
 **stopGatherRequest** | [**StopGatherRequest**](StopGatherRequest.md)| Stop current gather |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callGatherUsingAudio

> CompletableFuture<CallControlCommandResponse> callGatherUsingAudio(callControlId, gatherUsingAudioRequest)

Gather using audio

Play an audio file on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_audio_url&#39;, which will be played back at the beginning of each prompt. Playback will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_audio&#x60; command.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        GatherUsingAudioRequest gatherUsingAudioRequest = new GatherUsingAudioRequest(); // GatherUsingAudioRequest | Gather using audio request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callGatherUsingAudio(callControlId, gatherUsingAudioRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callGatherUsingAudio");
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
 **gatherUsingAudioRequest** | [**GatherUsingAudioRequest**](GatherUsingAudioRequest.md)| Gather using audio request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callGatherUsingAudioWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callGatherUsingAudio callGatherUsingAudioWithHttpInfo(callControlId, gatherUsingAudioRequest)

Gather using audio

Play an audio file on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_audio_url&#39;, which will be played back at the beginning of each prompt. Playback will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_audio&#x60; command.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        GatherUsingAudioRequest gatherUsingAudioRequest = new GatherUsingAudioRequest(); // GatherUsingAudioRequest | Gather using audio request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callGatherUsingAudioWithHttpInfo(callControlId, gatherUsingAudioRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callGatherUsingAudio");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callGatherUsingAudio");
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
 **gatherUsingAudioRequest** | [**GatherUsingAudioRequest**](GatherUsingAudioRequest.md)| Gather using audio request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callGatherUsingSpeak

> CompletableFuture<CallControlCommandResponse> callGatherUsingSpeak(callControlId, gatherUsingSpeakRequest)

Gather using speak

Convert text to speech and play it on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_payload&#39;, which will be played back at the beginning of each prompt. Speech will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_speak&#x60; command.  **Expected Webhooks:**  - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        GatherUsingSpeakRequest gatherUsingSpeakRequest = new GatherUsingSpeakRequest(); // GatherUsingSpeakRequest | Gather using speak request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callGatherUsingSpeak(callControlId, gatherUsingSpeakRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callGatherUsingSpeak");
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
 **gatherUsingSpeakRequest** | [**GatherUsingSpeakRequest**](GatherUsingSpeakRequest.md)| Gather using speak request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callGatherUsingSpeakWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callGatherUsingSpeak callGatherUsingSpeakWithHttpInfo(callControlId, gatherUsingSpeakRequest)

Gather using speak

Convert text to speech and play it on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_payload&#39;, which will be played back at the beginning of each prompt. Speech will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_speak&#x60; command.  **Expected Webhooks:**  - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        GatherUsingSpeakRequest gatherUsingSpeakRequest = new GatherUsingSpeakRequest(); // GatherUsingSpeakRequest | Gather using speak request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callGatherUsingSpeakWithHttpInfo(callControlId, gatherUsingSpeakRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callGatherUsingSpeak");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callGatherUsingSpeak");
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
 **gatherUsingSpeakRequest** | [**GatherUsingSpeakRequest**](GatherUsingSpeakRequest.md)| Gather using speak request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callHangup

> CompletableFuture<CallControlCommandResponse> callHangup(callControlId, hangupRequest)

Hangup call

Hang up the call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.recording.saved&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        HangupRequest hangupRequest = new HangupRequest(); // HangupRequest | Hangup request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callHangup(callControlId, hangupRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callHangup");
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
 **hangupRequest** | [**HangupRequest**](HangupRequest.md)| Hangup request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callHangupWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callHangup callHangupWithHttpInfo(callControlId, hangupRequest)

Hangup call

Hang up the call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.recording.saved&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        HangupRequest hangupRequest = new HangupRequest(); // HangupRequest | Hangup request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callHangupWithHttpInfo(callControlId, hangupRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callHangup");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callHangup");
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
 **hangupRequest** | [**HangupRequest**](HangupRequest.md)| Hangup request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callPlaybackStart

> CompletableFuture<CallControlCommandResponse> callPlaybackStart(callControlId, playAudioUrlRequest)

Play audio URL

Play an audio file on the call. If multiple play audio commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  *Notes:*  - When &#x60;overlay&#x60; is enabled, &#x60;loop&#x60; is limited to 1, and &#x60;target_legs&#x60; is limited to &#x60;self&#x60;. - A customer cannot Play Audio with &#x60;overlay&#x3D;true&#x60; unless there is a Play Audio with &#x60;overlay&#x3D;false&#x60; actively playing.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        PlayAudioUrlRequest playAudioUrlRequest = new PlayAudioUrlRequest(); // PlayAudioUrlRequest | Play audio URL request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callPlaybackStart(callControlId, playAudioUrlRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callPlaybackStart");
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
 **playAudioUrlRequest** | [**PlayAudioUrlRequest**](PlayAudioUrlRequest.md)| Play audio URL request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callPlaybackStartWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callPlaybackStart callPlaybackStartWithHttpInfo(callControlId, playAudioUrlRequest)

Play audio URL

Play an audio file on the call. If multiple play audio commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  *Notes:*  - When &#x60;overlay&#x60; is enabled, &#x60;loop&#x60; is limited to 1, and &#x60;target_legs&#x60; is limited to &#x60;self&#x60;. - A customer cannot Play Audio with &#x60;overlay&#x3D;true&#x60; unless there is a Play Audio with &#x60;overlay&#x3D;false&#x60; actively playing.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        PlayAudioUrlRequest playAudioUrlRequest = new PlayAudioUrlRequest(); // PlayAudioUrlRequest | Play audio URL request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callPlaybackStartWithHttpInfo(callControlId, playAudioUrlRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callPlaybackStart");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callPlaybackStart");
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
 **playAudioUrlRequest** | [**PlayAudioUrlRequest**](PlayAudioUrlRequest.md)| Play audio URL request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callPlaybackStop

> CompletableFuture<CallControlCommandResponse> callPlaybackStop(callControlId, playbackStopRequest)

Stop audio playback

Stop audio being played on the call.  **Expected Webhooks:**  - &#x60;call.playback.ended&#x60; or &#x60;call.speak.ended&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        PlaybackStopRequest playbackStopRequest = new PlaybackStopRequest(); // PlaybackStopRequest | Stop audio playback request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callPlaybackStop(callControlId, playbackStopRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callPlaybackStop");
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
 **playbackStopRequest** | [**PlaybackStopRequest**](PlaybackStopRequest.md)| Stop audio playback request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callPlaybackStopWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callPlaybackStop callPlaybackStopWithHttpInfo(callControlId, playbackStopRequest)

Stop audio playback

Stop audio being played on the call.  **Expected Webhooks:**  - &#x60;call.playback.ended&#x60; or &#x60;call.speak.ended&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        PlaybackStopRequest playbackStopRequest = new PlaybackStopRequest(); // PlaybackStopRequest | Stop audio playback request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callPlaybackStopWithHttpInfo(callControlId, playbackStopRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callPlaybackStop");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callPlaybackStop");
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
 **playbackStopRequest** | [**PlaybackStopRequest**](PlaybackStopRequest.md)| Stop audio playback request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callRecordStart

> CompletableFuture<CallControlCommandResponse> callRecordStart(callControlId, startRecordingRequest)

Recording start

Start recording the call. Recording will stop on call hang-up, or can be initiated via the Stop Recording command.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        StartRecordingRequest startRecordingRequest = new StartRecordingRequest(); // StartRecordingRequest | Start recording audio request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callRecordStart(callControlId, startRecordingRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callRecordStart");
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
 **startRecordingRequest** | [**StartRecordingRequest**](StartRecordingRequest.md)| Start recording audio request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callRecordStartWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callRecordStart callRecordStartWithHttpInfo(callControlId, startRecordingRequest)

Recording start

Start recording the call. Recording will stop on call hang-up, or can be initiated via the Stop Recording command.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        StartRecordingRequest startRecordingRequest = new StartRecordingRequest(); // StartRecordingRequest | Start recording audio request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callRecordStartWithHttpInfo(callControlId, startRecordingRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callRecordStart");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callRecordStart");
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
 **startRecordingRequest** | [**StartRecordingRequest**](StartRecordingRequest.md)| Start recording audio request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callRecordStop

> CompletableFuture<CallControlCommandResponse> callRecordStop(callControlId, stopRecordingRequest)

Recording stop

Stop recording the call.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        StopRecordingRequest stopRecordingRequest = new StopRecordingRequest(); // StopRecordingRequest | Stop recording call request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callRecordStop(callControlId, stopRecordingRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callRecordStop");
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
 **stopRecordingRequest** | [**StopRecordingRequest**](StopRecordingRequest.md)| Stop recording call request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callRecordStopWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callRecordStop callRecordStopWithHttpInfo(callControlId, stopRecordingRequest)

Recording stop

Stop recording the call.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        StopRecordingRequest stopRecordingRequest = new StopRecordingRequest(); // StopRecordingRequest | Stop recording call request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callRecordStopWithHttpInfo(callControlId, stopRecordingRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callRecordStop");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callRecordStop");
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
 **stopRecordingRequest** | [**StopRecordingRequest**](StopRecordingRequest.md)| Stop recording call request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callReject

> CompletableFuture<CallControlCommandResponse> callReject(callControlId, rejectRequest)

Reject a call

Reject an incoming call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        RejectRequest rejectRequest = new RejectRequest(); // RejectRequest | Reject request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callReject(callControlId, rejectRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callReject");
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
 **rejectRequest** | [**RejectRequest**](RejectRequest.md)| Reject request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callRejectWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callReject callRejectWithHttpInfo(callControlId, rejectRequest)

Reject a call

Reject an incoming call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        RejectRequest rejectRequest = new RejectRequest(); // RejectRequest | Reject request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callRejectWithHttpInfo(callControlId, rejectRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callReject");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callReject");
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
 **rejectRequest** | [**RejectRequest**](RejectRequest.md)| Reject request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callSendDTMF

> CompletableFuture<CallControlCommandResponse> callSendDTMF(callControlId, sendDTMFRequest)

Send DTMF

Sends DTMF tones from this leg. DTMF tones will be heard by the other end of the call.  **Expected Webhooks:**  There are no webhooks associated with this command. 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        SendDTMFRequest sendDTMFRequest = new SendDTMFRequest(); // SendDTMFRequest | Send DTMF request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callSendDTMF(callControlId, sendDTMFRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callSendDTMF");
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
 **sendDTMFRequest** | [**SendDTMFRequest**](SendDTMFRequest.md)| Send DTMF request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callSendDTMFWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callSendDTMF callSendDTMFWithHttpInfo(callControlId, sendDTMFRequest)

Send DTMF

Sends DTMF tones from this leg. DTMF tones will be heard by the other end of the call.  **Expected Webhooks:**  There are no webhooks associated with this command. 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        SendDTMFRequest sendDTMFRequest = new SendDTMFRequest(); // SendDTMFRequest | Send DTMF request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callSendDTMFWithHttpInfo(callControlId, sendDTMFRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callSendDTMF");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callSendDTMF");
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
 **sendDTMFRequest** | [**SendDTMFRequest**](SendDTMFRequest.md)| Send DTMF request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callSpeak

> CompletableFuture<CallControlCommandResponse> callSpeak(callControlId, speakRequest)

Speak text

Convert text to speech and play it back on the call. If multiple speak text commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  **Expected Webhooks:**  - &#x60;call.speak.started&#x60; - &#x60;call.speak.ended&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        SpeakRequest speakRequest = new SpeakRequest(); // SpeakRequest | Speak request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callSpeak(callControlId, speakRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callSpeak");
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
 **speakRequest** | [**SpeakRequest**](SpeakRequest.md)| Speak request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callSpeakWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callSpeak callSpeakWithHttpInfo(callControlId, speakRequest)

Speak text

Convert text to speech and play it back on the call. If multiple speak text commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  **Expected Webhooks:**  - &#x60;call.speak.started&#x60; - &#x60;call.speak.ended&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        SpeakRequest speakRequest = new SpeakRequest(); // SpeakRequest | Speak request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callSpeakWithHttpInfo(callControlId, speakRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callSpeak");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callSpeak");
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
 **speakRequest** | [**SpeakRequest**](SpeakRequest.md)| Speak request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## callTransfer

> CompletableFuture<CallControlCommandResponse> callTransfer(callControlId, transferCallRequest)

Transfer call

Transfer a call to a new destination. If the transfer is unsuccessful, a &#x60;call.hangup&#x60; webhook for the other call (Leg B) will be sent indicating that the transfer could not be completed. The original call will remain active and may be issued additional commands, potentially transfering the call to an alternate destination.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.bridged&#x60; to Leg B - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        TransferCallRequest transferCallRequest = new TransferCallRequest(); // TransferCallRequest | Transfer call request
        try {
            CompletableFuture<CallControlCommandResponse> result = apiInstance.callTransfer(callControlId, transferCallRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callTransfer");
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
 **transferCallRequest** | [**TransferCallRequest**](TransferCallRequest.md)| Transfer call request |

### Return type

CompletableFuture<[**CallControlCommandResponse**](CallControlCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

## callTransferWithHttpInfo

> CompletableFuture<ApiResponse<CallControlCommandResponse>> callTransfer callTransferWithHttpInfo(callControlId, transferCallRequest)

Transfer call

Transfer a call to a new destination. If the transfer is unsuccessful, a &#x60;call.hangup&#x60; webhook for the other call (Leg B) will be sent indicating that the transfer could not be completed. The original call will remain active and may be issued additional commands, potentially transfering the call to an alternate destination.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.bridged&#x60; to Leg B - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        TransferCallRequest transferCallRequest = new TransferCallRequest(); // TransferCallRequest | Transfer call request
        try {
            CompletableFuture<ApiResponse<CallControlCommandResponse>> response = apiInstance.callTransferWithHttpInfo(callControlId, transferCallRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CallCommandsApi#callTransfer");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#callTransfer");
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
 **transferCallRequest** | [**TransferCallRequest**](TransferCallRequest.md)| Transfer call request |

### Return type

CompletableFuture<ApiResponse<[**CallControlCommandResponse**](CallControlCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

