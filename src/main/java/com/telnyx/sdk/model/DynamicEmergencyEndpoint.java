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
 * DynamicEmergencyEndpoint
 */
@JsonPropertyOrder({
  DynamicEmergencyEndpoint.JSON_PROPERTY_ID,
  DynamicEmergencyEndpoint.JSON_PROPERTY_RECORD_TYPE,
  DynamicEmergencyEndpoint.JSON_PROPERTY_DYNAMIC_EMERGENCY_ADDRESS_ID,
  DynamicEmergencyEndpoint.JSON_PROPERTY_STATUS,
  DynamicEmergencyEndpoint.JSON_PROPERTY_SIP_FROM_ID,
  DynamicEmergencyEndpoint.JSON_PROPERTY_CALLBACK_NUMBER,
  DynamicEmergencyEndpoint.JSON_PROPERTY_CALLER_NAME,
  DynamicEmergencyEndpoint.JSON_PROPERTY_CREATED_AT,
  DynamicEmergencyEndpoint.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DynamicEmergencyEndpoint {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_DYNAMIC_EMERGENCY_ADDRESS_ID = "dynamic_emergency_address_id";
  private String dynamicEmergencyAddressId;

  /**
   * Status of dynamic emergency address
   */
  public enum StatusEnum {
    PENDING("pending"),
    
    ACTIVATED("activated"),
    
    REJECTED("rejected");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_SIP_FROM_ID = "sip_from_id";
  private String sipFromId;

  public static final String JSON_PROPERTY_CALLBACK_NUMBER = "callback_number";
  private String callbackNumber;

  public static final String JSON_PROPERTY_CALLER_NAME = "caller_name";
  private String callerName;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public DynamicEmergencyEndpoint() { 
  }

  @JsonCreator
  public DynamicEmergencyEndpoint(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status, 
    @JsonProperty(JSON_PROPERTY_SIP_FROM_ID) String sipFromId, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt
  ) {
    this();
    this.id = id;
    this.recordType = recordType;
    this.status = status;
    this.sipFromId = sipFromId;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "dynamic_emergency_endpoint", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  public DynamicEmergencyEndpoint dynamicEmergencyAddressId(String dynamicEmergencyAddressId) {
    this.dynamicEmergencyAddressId = dynamicEmergencyAddressId;
    return this;
  }

   /**
   * An id of a currently active dynamic emergency location.
   * @return dynamicEmergencyAddressId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", required = true, value = "An id of a currently active dynamic emergency location.")
  @JsonProperty(JSON_PROPERTY_DYNAMIC_EMERGENCY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDynamicEmergencyAddressId() {
    return dynamicEmergencyAddressId;
  }


  @JsonProperty(JSON_PROPERTY_DYNAMIC_EMERGENCY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDynamicEmergencyAddressId(String dynamicEmergencyAddressId) {
    this.dynamicEmergencyAddressId = dynamicEmergencyAddressId;
  }


   /**
   * Status of dynamic emergency address
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "pending", value = "Status of dynamic emergency address")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * Get sipFromId
   * @return sipFromId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FXDFWEDF", value = "")
  @JsonProperty(JSON_PROPERTY_SIP_FROM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSipFromId() {
    return sipFromId;
  }




  public DynamicEmergencyEndpoint callbackNumber(String callbackNumber) {
    this.callbackNumber = callbackNumber;
    return this;
  }

   /**
   * Get callbackNumber
   * @return callbackNumber
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "+13125550000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CALLBACK_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCallbackNumber() {
    return callbackNumber;
  }


  @JsonProperty(JSON_PROPERTY_CALLBACK_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCallbackNumber(String callbackNumber) {
    this.callbackNumber = callbackNumber;
  }


  public DynamicEmergencyEndpoint callerName(String callerName) {
    this.callerName = callerName;
    return this;
  }

   /**
   * Get callerName
   * @return callerName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Jane Doe Desk Phone", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CALLER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCallerName() {
    return callerName;
  }


  @JsonProperty(JSON_PROPERTY_CALLER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCallerName(String callerName) {
    this.callerName = callerName;
  }


   /**
   * ISO 8601 formatted date of when the resource was created
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date of when the resource was created")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }




   /**
   * ISO 8601 formatted date of when the resource was last updated
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date of when the resource was last updated")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }




  /**
   * Return true if this DynamicEmergencyEndpoint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicEmergencyEndpoint dynamicEmergencyEndpoint = (DynamicEmergencyEndpoint) o;
    return Objects.equals(this.id, dynamicEmergencyEndpoint.id) &&
        Objects.equals(this.recordType, dynamicEmergencyEndpoint.recordType) &&
        Objects.equals(this.dynamicEmergencyAddressId, dynamicEmergencyEndpoint.dynamicEmergencyAddressId) &&
        Objects.equals(this.status, dynamicEmergencyEndpoint.status) &&
        Objects.equals(this.sipFromId, dynamicEmergencyEndpoint.sipFromId) &&
        Objects.equals(this.callbackNumber, dynamicEmergencyEndpoint.callbackNumber) &&
        Objects.equals(this.callerName, dynamicEmergencyEndpoint.callerName) &&
        Objects.equals(this.createdAt, dynamicEmergencyEndpoint.createdAt) &&
        Objects.equals(this.updatedAt, dynamicEmergencyEndpoint.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, dynamicEmergencyAddressId, status, sipFromId, callbackNumber, callerName, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicEmergencyEndpoint {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    dynamicEmergencyAddressId: ").append(toIndentedString(dynamicEmergencyAddressId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sipFromId: ").append(toIndentedString(sipFromId)).append("\n");
    sb.append("    callbackNumber: ").append(toIndentedString(callbackNumber)).append("\n");
    sb.append("    callerName: ").append(toIndentedString(callerName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

