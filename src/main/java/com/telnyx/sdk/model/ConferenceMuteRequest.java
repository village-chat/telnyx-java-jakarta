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
 * ConferenceMuteRequest
 */
@JsonPropertyOrder({
  ConferenceMuteRequest.JSON_PROPERTY_CALL_CONTROL_IDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ConferenceMuteRequest {
  public static final String JSON_PROPERTY_CALL_CONTROL_IDS = "call_control_ids";
  private List<String> callControlIds = null;

  public ConferenceMuteRequest() { 
  }

  public ConferenceMuteRequest callControlIds(List<String> callControlIds) {
    this.callControlIds = callControlIds;
    return this;
  }

  public ConferenceMuteRequest addCallControlIdsItem(String callControlIdsItem) {
    if (this.callControlIds == null) {
      this.callControlIds = new ArrayList<>();
    }
    this.callControlIds.add(callControlIdsItem);
    return this;
  }

   /**
   * Array of unique identifiers and tokens for controlling the call. When empty all participants will be muted.
   * @return callControlIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Array of unique identifiers and tokens for controlling the call. When empty all participants will be muted.")
  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCallControlIds() {
    return callControlIds;
  }


  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallControlIds(List<String> callControlIds) {
    this.callControlIds = callControlIds;
  }


  /**
   * Return true if this ConferenceMuteRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferenceMuteRequest conferenceMuteRequest = (ConferenceMuteRequest) o;
    return Objects.equals(this.callControlIds, conferenceMuteRequest.callControlIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceMuteRequest {\n");
    sb.append("    callControlIds: ").append(toIndentedString(callControlIds)).append("\n");
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

