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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * UpdateInbouncChannelsData
 */
@JsonPropertyOrder({
  UpdateInbouncChannelsData.JSON_PROPERTY_CHANNELS,
  UpdateInbouncChannelsData.JSON_PROPERTY_RECORD_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateInbouncChannelsData {
  public static final String JSON_PROPERTY_CHANNELS = "channels";
  private Integer channels;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public UpdateInbouncChannelsData() { 
  }

  public UpdateInbouncChannelsData channels(Integer channels) {
    this.channels = channels;
    return this;
  }

   /**
   * The number of channels set for the account
   * @return channels
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "7", value = "The number of channels set for the account")
  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChannels() {
    return channels;
  }


  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannels(Integer channels) {
    this.channels = channels;
  }


  public UpdateInbouncChannelsData recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the response
   * @return recordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "inbound_channels", value = "Identifies the type of the response")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  /**
   * Return true if this Update_Inbounc_Channels_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInbouncChannelsData updateInbouncChannelsData = (UpdateInbouncChannelsData) o;
    return Objects.equals(this.channels, updateInbouncChannelsData.channels) &&
        Objects.equals(this.recordType, updateInbouncChannelsData.recordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, recordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInbouncChannelsData {\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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

