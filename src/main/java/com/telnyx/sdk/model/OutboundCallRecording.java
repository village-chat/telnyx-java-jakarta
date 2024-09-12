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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * OutboundCallRecording
 */
@JsonPropertyOrder({
  OutboundCallRecording.JSON_PROPERTY_CALL_RECORDING_TYPE,
  OutboundCallRecording.JSON_PROPERTY_CALL_RECORDING_CALLER_PHONE_NUMBERS,
  OutboundCallRecording.JSON_PROPERTY_CALL_RECORDING_CHANNELS,
  OutboundCallRecording.JSON_PROPERTY_CALL_RECORDING_FORMAT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class OutboundCallRecording {
  /**
   * Specifies which calls are recorded.
   */
  public enum CallRecordingTypeEnum {
    ALL("all"),
    
    NONE("none"),
    
    BY_CALLER_PHONE_NUMBER("by_caller_phone_number");

    private String value;

    CallRecordingTypeEnum(String value) {
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
    public static CallRecordingTypeEnum fromValue(String value) {
      for (CallRecordingTypeEnum b : CallRecordingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CALL_RECORDING_TYPE = "call_recording_type";
  private CallRecordingTypeEnum callRecordingType;

  public static final String JSON_PROPERTY_CALL_RECORDING_CALLER_PHONE_NUMBERS = "call_recording_caller_phone_numbers";
  private List<String> callRecordingCallerPhoneNumbers = null;

  /**
   * When using &#39;dual&#39; channels, the final audio file will be a stereo recording with the first leg on channel A, and the rest on channel B.
   */
  public enum CallRecordingChannelsEnum {
    SINGLE("single"),
    
    DUAL("dual");

    private String value;

    CallRecordingChannelsEnum(String value) {
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
    public static CallRecordingChannelsEnum fromValue(String value) {
      for (CallRecordingChannelsEnum b : CallRecordingChannelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CALL_RECORDING_CHANNELS = "call_recording_channels";
  private CallRecordingChannelsEnum callRecordingChannels = CallRecordingChannelsEnum.SINGLE;

  /**
   * The audio file format for calls being recorded.
   */
  public enum CallRecordingFormatEnum {
    WAV("wav"),
    
    MP3("mp3");

    private String value;

    CallRecordingFormatEnum(String value) {
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
    public static CallRecordingFormatEnum fromValue(String value) {
      for (CallRecordingFormatEnum b : CallRecordingFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CALL_RECORDING_FORMAT = "call_recording_format";
  private CallRecordingFormatEnum callRecordingFormat = CallRecordingFormatEnum.WAV;

  public OutboundCallRecording() { 
  }

  public OutboundCallRecording callRecordingType(CallRecordingTypeEnum callRecordingType) {
    this.callRecordingType = callRecordingType;
    return this;
  }

   /**
   * Specifies which calls are recorded.
   * @return callRecordingType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies which calls are recorded.")
  @JsonProperty(JSON_PROPERTY_CALL_RECORDING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallRecordingTypeEnum getCallRecordingType() {
    return callRecordingType;
  }


  @JsonProperty(JSON_PROPERTY_CALL_RECORDING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallRecordingType(CallRecordingTypeEnum callRecordingType) {
    this.callRecordingType = callRecordingType;
  }


  public OutboundCallRecording callRecordingCallerPhoneNumbers(List<String> callRecordingCallerPhoneNumbers) {
    this.callRecordingCallerPhoneNumbers = callRecordingCallerPhoneNumbers;
    return this;
  }

  public OutboundCallRecording addCallRecordingCallerPhoneNumbersItem(String callRecordingCallerPhoneNumbersItem) {
    if (this.callRecordingCallerPhoneNumbers == null) {
      this.callRecordingCallerPhoneNumbers = new ArrayList<>();
    }
    this.callRecordingCallerPhoneNumbers.add(callRecordingCallerPhoneNumbersItem);
    return this;
  }

   /**
   * When call_recording_type is &#39;by_caller_phone_number&#39;, only outbound calls using one of these numbers will be recorded. Numbers must be specified in E164 format.
   * @return callRecordingCallerPhoneNumbers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"+19705555098\"]", value = "When call_recording_type is 'by_caller_phone_number', only outbound calls using one of these numbers will be recorded. Numbers must be specified in E164 format.")
  @JsonProperty(JSON_PROPERTY_CALL_RECORDING_CALLER_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCallRecordingCallerPhoneNumbers() {
    return callRecordingCallerPhoneNumbers;
  }


  @JsonProperty(JSON_PROPERTY_CALL_RECORDING_CALLER_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallRecordingCallerPhoneNumbers(List<String> callRecordingCallerPhoneNumbers) {
    this.callRecordingCallerPhoneNumbers = callRecordingCallerPhoneNumbers;
  }


  public OutboundCallRecording callRecordingChannels(CallRecordingChannelsEnum callRecordingChannels) {
    this.callRecordingChannels = callRecordingChannels;
    return this;
  }

   /**
   * When using &#39;dual&#39; channels, the final audio file will be a stereo recording with the first leg on channel A, and the rest on channel B.
   * @return callRecordingChannels
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "dual", value = "When using 'dual' channels, the final audio file will be a stereo recording with the first leg on channel A, and the rest on channel B.")
  @JsonProperty(JSON_PROPERTY_CALL_RECORDING_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallRecordingChannelsEnum getCallRecordingChannels() {
    return callRecordingChannels;
  }


  @JsonProperty(JSON_PROPERTY_CALL_RECORDING_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallRecordingChannels(CallRecordingChannelsEnum callRecordingChannels) {
    this.callRecordingChannels = callRecordingChannels;
  }


  public OutboundCallRecording callRecordingFormat(CallRecordingFormatEnum callRecordingFormat) {
    this.callRecordingFormat = callRecordingFormat;
    return this;
  }

   /**
   * The audio file format for calls being recorded.
   * @return callRecordingFormat
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "mp3", value = "The audio file format for calls being recorded.")
  @JsonProperty(JSON_PROPERTY_CALL_RECORDING_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallRecordingFormatEnum getCallRecordingFormat() {
    return callRecordingFormat;
  }


  @JsonProperty(JSON_PROPERTY_CALL_RECORDING_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallRecordingFormat(CallRecordingFormatEnum callRecordingFormat) {
    this.callRecordingFormat = callRecordingFormat;
  }


  /**
   * Return true if this OutboundCallRecording object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundCallRecording outboundCallRecording = (OutboundCallRecording) o;
    return Objects.equals(this.callRecordingType, outboundCallRecording.callRecordingType) &&
        Objects.equals(this.callRecordingCallerPhoneNumbers, outboundCallRecording.callRecordingCallerPhoneNumbers) &&
        Objects.equals(this.callRecordingChannels, outboundCallRecording.callRecordingChannels) &&
        Objects.equals(this.callRecordingFormat, outboundCallRecording.callRecordingFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callRecordingType, callRecordingCallerPhoneNumbers, callRecordingChannels, callRecordingFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundCallRecording {\n");
    sb.append("    callRecordingType: ").append(toIndentedString(callRecordingType)).append("\n");
    sb.append("    callRecordingCallerPhoneNumbers: ").append(toIndentedString(callRecordingCallerPhoneNumbers)).append("\n");
    sb.append("    callRecordingChannels: ").append(toIndentedString(callRecordingChannels)).append("\n");
    sb.append("    callRecordingFormat: ").append(toIndentedString(callRecordingFormat)).append("\n");
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

