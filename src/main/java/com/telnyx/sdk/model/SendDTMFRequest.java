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
 * SendDTMFRequest
 */
@JsonPropertyOrder({
  SendDTMFRequest.JSON_PROPERTY_DIGITS,
  SendDTMFRequest.JSON_PROPERTY_DURATION_MILLIS,
  SendDTMFRequest.JSON_PROPERTY_CLIENT_STATE,
  SendDTMFRequest.JSON_PROPERTY_COMMAND_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class SendDTMFRequest {
  public static final String JSON_PROPERTY_DIGITS = "digits";
  private String digits;

  public static final String JSON_PROPERTY_DURATION_MILLIS = "duration_millis";
  private Integer durationMillis = 250;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
  private String commandId;

  public SendDTMFRequest() { 
  }

  public SendDTMFRequest digits(String digits) {
    this.digits = digits;
    return this;
  }

   /**
   * DTMF digits to send. Valid digits are 0-9, A-D, *, and #. Pauses can be added using w (0.5s) and W (1s).
   * @return digits
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1www2WABCDw9", required = true, value = "DTMF digits to send. Valid digits are 0-9, A-D, *, and #. Pauses can be added using w (0.5s) and W (1s).")
  @JsonProperty(JSON_PROPERTY_DIGITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDigits() {
    return digits;
  }


  @JsonProperty(JSON_PROPERTY_DIGITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDigits(String digits) {
    this.digits = digits;
  }


  public SendDTMFRequest durationMillis(Integer durationMillis) {
    this.durationMillis = durationMillis;
    return this;
  }

   /**
   * Specifies for how many milliseconds each digit will be played in the audio stream. Ranges from 100 to 500ms
   * @return durationMillis
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "500", value = "Specifies for how many milliseconds each digit will be played in the audio stream. Ranges from 100 to 500ms")
  @JsonProperty(JSON_PROPERTY_DURATION_MILLIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDurationMillis() {
    return durationMillis;
  }


  @JsonProperty(JSON_PROPERTY_DURATION_MILLIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDurationMillis(Integer durationMillis) {
    this.durationMillis = durationMillis;
  }


  public SendDTMFRequest clientState(String clientState) {
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


  public SendDTMFRequest commandId(String commandId) {
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
   * Return true if this SendDTMFRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendDTMFRequest sendDTMFRequest = (SendDTMFRequest) o;
    return Objects.equals(this.digits, sendDTMFRequest.digits) &&
        Objects.equals(this.durationMillis, sendDTMFRequest.durationMillis) &&
        Objects.equals(this.clientState, sendDTMFRequest.clientState) &&
        Objects.equals(this.commandId, sendDTMFRequest.commandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digits, durationMillis, clientState, commandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendDTMFRequest {\n");
    sb.append("    digits: ").append(toIndentedString(digits)).append("\n");
    sb.append("    durationMillis: ").append(toIndentedString(durationMillis)).append("\n");
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

