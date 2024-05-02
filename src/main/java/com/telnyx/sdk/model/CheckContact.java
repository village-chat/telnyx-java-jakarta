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
 * 
 */
@ApiModel(description = "")
@JsonPropertyOrder({
  CheckContact.JSON_PROPERTY_RECORD_TYPE,
  CheckContact.JSON_PROPERTY_INPUT,
  CheckContact.JSON_PROPERTY_STATUS,
  CheckContact.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CheckContact {
  /**
   * Identifies the type of the resource.
   */
  public enum RecordTypeEnum {
    WHATSAPP_CONTACT("whatsapp_contact");

    private String value;

    RecordTypeEnum(String value) {
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
    public static RecordTypeEnum fromValue(String value) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private RecordTypeEnum recordType;

  public static final String JSON_PROPERTY_INPUT = "input";
  private String input;

  /**
   * Status of the user.
   */
  public enum StatusEnum {
    /**
     * processing: Input is still being processed.
     */
    PROCESSING("processing"),
    
    /**
     * valid: Input determined to be a valid WhatsApp user.
     */
    VALID("valid"),
    
    /**
     * invalid: Input determined to not be a valid WhatsApp user or the phone number is in a bad format.
     */
    INVALID("invalid");

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

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public CheckContact() { 
  }

  @JsonCreator
  public CheckContact(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) RecordTypeEnum recordType
  ) {
    this();
    this.recordType = recordType;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecordTypeEnum getRecordType() {
    return recordType;
  }




  public CheckContact input(String input) {
    this.input = input;
    return this;
  }

   /**
   * The value you sent in the contacts field of the JSON request.
   * @return input
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The value you sent in the contacts field of the JSON request.")
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInput() {
    return input;
  }


  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInput(String input) {
    this.input = input;
  }


  public CheckContact status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the user.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Status of the user.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CheckContact id(String id) {
    this.id = id;
    return this;
  }

   /**
   * WhatsApp user identifier that can be used in other API calls. Only returned if the status is valid.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "WhatsApp user identifier that can be used in other API calls. Only returned if the status is valid.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Return true if this CheckContact object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckContact checkContact = (CheckContact) o;
    return Objects.equals(this.recordType, checkContact.recordType) &&
        Objects.equals(this.input, checkContact.input) &&
        Objects.equals(this.status, checkContact.status) &&
        Objects.equals(this.id, checkContact.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, input, status, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckContact {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

