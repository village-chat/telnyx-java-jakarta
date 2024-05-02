/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.CallStreamingFailedPayloadStreamParams;
import java.util.Arrays;
import java.util.UUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CallStreamingFailedPayload
 */
@JsonPropertyOrder({
  CallStreamingFailedPayload.JSON_PROPERTY_CALL_CONTROL_ID,
  CallStreamingFailedPayload.JSON_PROPERTY_CONNECTION_ID,
  CallStreamingFailedPayload.JSON_PROPERTY_CALL_LEG_ID,
  CallStreamingFailedPayload.JSON_PROPERTY_CALL_SESSION_ID,
  CallStreamingFailedPayload.JSON_PROPERTY_CLIENT_STATE,
  CallStreamingFailedPayload.JSON_PROPERTY_FAILURE_REASON,
  CallStreamingFailedPayload.JSON_PROPERTY_STREAM_ID,
  CallStreamingFailedPayload.JSON_PROPERTY_STREAM_PARAMS,
  CallStreamingFailedPayload.JSON_PROPERTY_STREAM_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CallStreamingFailedPayload {
  public static final String JSON_PROPERTY_CALL_CONTROL_ID = "call_control_id";
  private String callControlId;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CALL_LEG_ID = "call_leg_id";
  private String callLegId;

  public static final String JSON_PROPERTY_CALL_SESSION_ID = "call_session_id";
  private String callSessionId;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_FAILURE_REASON = "failure_reason";
  private String failureReason;

  public static final String JSON_PROPERTY_STREAM_ID = "stream_id";
  private UUID streamId;

  public static final String JSON_PROPERTY_STREAM_PARAMS = "stream_params";
  private CallStreamingFailedPayloadStreamParams streamParams;

  /**
   * The type of stream connection the stream is performing.
   */
  public enum StreamTypeEnum {
    WEBSOCKET("websocket"),
    
    DIALOGFLOW("dialogflow");

    private String value;

    StreamTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StreamTypeEnum fromValue(String value) {
      for (StreamTypeEnum b : StreamTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STREAM_TYPE = "stream_type";
  private StreamTypeEnum streamType;

  public CallStreamingFailedPayload() { 
  }

  public CallStreamingFailedPayload callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Call ID used to issue commands via Call Control API.
   * @return callControlId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "31f19208-5db0-11ec-9ea7-02420a0d3a69", value = "Call ID used to issue commands via Call Control API.")
  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallControlId() {
    return callControlId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallControlId(String callControlId) {
    this.callControlId = callControlId;
  }


  public CallStreamingFailedPayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Call Control App ID (formerly Telnyx connection ID) used in the call.
   * @return connectionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "7267xxxxxxxxxxxxxx", value = "Call Control App ID (formerly Telnyx connection ID) used in the call.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public CallStreamingFailedPayload callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * ID that is unique to the call and can be used to correlate webhook events.
   * @return callLegId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "31f19208-5db0-11ec-9ea7-02420a0d3a69", value = "ID that is unique to the call and can be used to correlate webhook events.")
  @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallLegId() {
    return callLegId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }


  public CallStreamingFailedPayload callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call.
   * @return callSessionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "31f19208-5db0-11ec-9ea7-02420a0d3a69", value = "ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call.")
  @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallSessionId() {
    return callSessionId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
  }


  public CallStreamingFailedPayload clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * State received from a command.
   * @return clientState
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "State received from a command.")
  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientState() {
    return clientState;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientState(String clientState) {
    this.clientState = clientState;
  }


  public CallStreamingFailedPayload failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

   /**
   * A short description explaning why the media streaming failed.
   * @return failureReason
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "connection_failed", value = "A short description explaning why the media streaming failed.")
  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailureReason() {
    return failureReason;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  public CallStreamingFailedPayload streamId(UUID streamId) {
    this.streamId = streamId;
    return this;
  }

   /**
   * Identifies the streaming.
   * @return streamId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1edb94f9-7ef0-4150-b502-e0ebadfd9491", value = "Identifies the streaming.")
  @JsonProperty(JSON_PROPERTY_STREAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getStreamId() {
    return streamId;
  }


  @JsonProperty(JSON_PROPERTY_STREAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreamId(UUID streamId) {
    this.streamId = streamId;
  }


  public CallStreamingFailedPayload streamParams(CallStreamingFailedPayloadStreamParams streamParams) {
    this.streamParams = streamParams;
    return this;
  }

   /**
   * Get streamParams
   * @return streamParams
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STREAM_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallStreamingFailedPayloadStreamParams getStreamParams() {
    return streamParams;
  }


  @JsonProperty(JSON_PROPERTY_STREAM_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreamParams(CallStreamingFailedPayloadStreamParams streamParams) {
    this.streamParams = streamParams;
  }


  public CallStreamingFailedPayload streamType(StreamTypeEnum streamType) {
    this.streamType = streamType;
    return this;
  }

   /**
   * The type of stream connection the stream is performing.
   * @return streamType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "websocket", value = "The type of stream connection the stream is performing.")
  @JsonProperty(JSON_PROPERTY_STREAM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StreamTypeEnum getStreamType() {
    return streamType;
  }


  @JsonProperty(JSON_PROPERTY_STREAM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreamType(StreamTypeEnum streamType) {
    this.streamType = streamType;
  }


  /**
   * Return true if this CallStreamingFailed_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallStreamingFailedPayload callStreamingFailedPayload = (CallStreamingFailedPayload) o;
    return Objects.equals(this.callControlId, callStreamingFailedPayload.callControlId) &&
        Objects.equals(this.connectionId, callStreamingFailedPayload.connectionId) &&
        Objects.equals(this.callLegId, callStreamingFailedPayload.callLegId) &&
        Objects.equals(this.callSessionId, callStreamingFailedPayload.callSessionId) &&
        Objects.equals(this.clientState, callStreamingFailedPayload.clientState) &&
        Objects.equals(this.failureReason, callStreamingFailedPayload.failureReason) &&
        Objects.equals(this.streamId, callStreamingFailedPayload.streamId) &&
        Objects.equals(this.streamParams, callStreamingFailedPayload.streamParams) &&
        Objects.equals(this.streamType, callStreamingFailedPayload.streamType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, connectionId, callLegId, callSessionId, clientState, failureReason, streamId, streamParams, streamType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallStreamingFailedPayload {\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    streamParams: ").append(toIndentedString(streamParams)).append("\n");
    sb.append("    streamType: ").append(toIndentedString(streamType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

