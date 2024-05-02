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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * StartForkingRequest
 */
@JsonPropertyOrder({
  StartForkingRequest.JSON_PROPERTY_TARGET,
  StartForkingRequest.JSON_PROPERTY_RX,
  StartForkingRequest.JSON_PROPERTY_STREAM_TYPE,
  StartForkingRequest.JSON_PROPERTY_TX,
  StartForkingRequest.JSON_PROPERTY_CLIENT_STATE,
  StartForkingRequest.JSON_PROPERTY_COMMAND_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class StartForkingRequest {
  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_RX = "rx";
  private String rx;

  /**
   * Optionally specify a media type to stream. If &#x60;decrypted&#x60; selected, Telnyx will decrypt incoming SIP media before forking to the target. &#x60;rx&#x60; and &#x60;tx&#x60; are required fields if &#x60;decrypted&#x60; selected.
   */
  public enum StreamTypeEnum {
    RAW("raw"),
    
    DECRYPTED("decrypted");

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
  private StreamTypeEnum streamType = StreamTypeEnum.RAW;

  public static final String JSON_PROPERTY_TX = "tx";
  private String tx;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
  private String commandId;

  public StartForkingRequest() { 
  }

  public StartForkingRequest target(String target) {
    this.target = target;
    return this;
  }

   /**
   * The network target, &lt;udp:ip_address:port&gt;, where the call&#39;s RTP media packets should be forwarded. Both incoming and outgoing media packets will be delivered to the specified target, and information about the stream will be included in the encapsulation protocol header, including the direction (0 &#x3D; inbound; 1 &#x3D; outbound), leg (0 &#x3D; A-leg; 1 &#x3D; B-leg), and call_leg_id.
   * @return target
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "udp:192.0.2.1:9000", value = "The network target, <udp:ip_address:port>, where the call's RTP media packets should be forwarded. Both incoming and outgoing media packets will be delivered to the specified target, and information about the stream will be included in the encapsulation protocol header, including the direction (0 = inbound; 1 = outbound), leg (0 = A-leg; 1 = B-leg), and call_leg_id.")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTarget() {
    return target;
  }


  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTarget(String target) {
    this.target = target;
  }


  public StartForkingRequest rx(String rx) {
    this.rx = rx;
    return this;
  }

   /**
   * The network target, &lt;udp:ip_address:port&gt;, where the call&#39;s incoming RTP media packets should be forwarded.
   * @return rx
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "udp:192.0.2.1:9000", value = "The network target, <udp:ip_address:port>, where the call's incoming RTP media packets should be forwarded.")
  @JsonProperty(JSON_PROPERTY_RX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRx() {
    return rx;
  }


  @JsonProperty(JSON_PROPERTY_RX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRx(String rx) {
    this.rx = rx;
  }


  public StartForkingRequest streamType(StreamTypeEnum streamType) {
    this.streamType = streamType;
    return this;
  }

   /**
   * Optionally specify a media type to stream. If &#x60;decrypted&#x60; selected, Telnyx will decrypt incoming SIP media before forking to the target. &#x60;rx&#x60; and &#x60;tx&#x60; are required fields if &#x60;decrypted&#x60; selected.
   * @return streamType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "decrypted", value = "Optionally specify a media type to stream. If `decrypted` selected, Telnyx will decrypt incoming SIP media before forking to the target. `rx` and `tx` are required fields if `decrypted` selected.")
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


  public StartForkingRequest tx(String tx) {
    this.tx = tx;
    return this;
  }

   /**
   * The network target, &lt;udp:ip_address:port&gt;, where the call&#39;s outgoing RTP media packets should be forwarded.
   * @return tx
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "udp:192.0.2.1:9001", value = "The network target, <udp:ip_address:port>, where the call's outgoing RTP media packets should be forwarded.")
  @JsonProperty(JSON_PROPERTY_TX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTx() {
    return tx;
  }


  @JsonProperty(JSON_PROPERTY_TX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTx(String tx) {
    this.tx = tx;
  }


  public StartForkingRequest clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
   * @return clientState
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.")
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


  public StartForkingRequest commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;.
   * @return commandId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "891510ac-f3e4-11e8-af5b-de00688a4901", value = "Use this field to avoid duplicate commands. Telnyx will ignore any command with the same `command_id` for the same `call_control_id`.")
  @JsonProperty(JSON_PROPERTY_COMMAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommandId() {
    return commandId;
  }


  @JsonProperty(JSON_PROPERTY_COMMAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }


  /**
   * Return true if this StartForkingRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartForkingRequest startForkingRequest = (StartForkingRequest) o;
    return Objects.equals(this.target, startForkingRequest.target) &&
        Objects.equals(this.rx, startForkingRequest.rx) &&
        Objects.equals(this.streamType, startForkingRequest.streamType) &&
        Objects.equals(this.tx, startForkingRequest.tx) &&
        Objects.equals(this.clientState, startForkingRequest.clientState) &&
        Objects.equals(this.commandId, startForkingRequest.commandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, rx, streamType, tx, clientState, commandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartForkingRequest {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    rx: ").append(toIndentedString(rx)).append("\n");
    sb.append("    streamType: ").append(toIndentedString(streamType)).append("\n");
    sb.append("    tx: ").append(toIndentedString(tx)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
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

