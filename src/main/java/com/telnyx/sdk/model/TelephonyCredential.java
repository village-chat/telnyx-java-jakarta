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
 * TelephonyCredential
 */
@JsonPropertyOrder({
  TelephonyCredential.JSON_PROPERTY_ID,
  TelephonyCredential.JSON_PROPERTY_RECORD_TYPE,
  TelephonyCredential.JSON_PROPERTY_NAME,
  TelephonyCredential.JSON_PROPERTY_RESOURCE_ID,
  TelephonyCredential.JSON_PROPERTY_EXPIRED,
  TelephonyCredential.JSON_PROPERTY_SIP_USERNAME,
  TelephonyCredential.JSON_PROPERTY_SIP_PASSWORD,
  TelephonyCredential.JSON_PROPERTY_CREATED_AT,
  TelephonyCredential.JSON_PROPERTY_UPDATED_AT,
  TelephonyCredential.JSON_PROPERTY_EXPIRES_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class TelephonyCredential {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
  private String resourceId;

  public static final String JSON_PROPERTY_EXPIRED = "expired";
  private Boolean expired;

  public static final String JSON_PROPERTY_SIP_USERNAME = "sip_username";
  private String sipUsername;

  public static final String JSON_PROPERTY_SIP_PASSWORD = "sip_password";
  private String sipPassword;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private String expiresAt;

  public TelephonyCredential() { 
  }

  public TelephonyCredential id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the resource.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "c215ade3-0d39-418e-94be-c5f780760199", value = "Identifies the resource.")
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


  public TelephonyCredential recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "credential", value = "Identifies the type of the resource.")
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


  public TelephonyCredential name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TelephonyCredential resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Identifies the resource this credential is associated with.
   * @return resourceId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "connection:1234567890", value = "Identifies the resource this credential is associated with.")
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceId() {
    return resourceId;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public TelephonyCredential expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

   /**
   * Defaults to false
   * @return expired
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Defaults to false")
  @JsonProperty(JSON_PROPERTY_EXPIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExpired() {
    return expired;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpired(Boolean expired) {
    this.expired = expired;
  }


  public TelephonyCredential sipUsername(String sipUsername) {
    this.sipUsername = sipUsername;
    return this;
  }

   /**
   * The randomly generated SIP username for the credential.
   * @return sipUsername
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "gencrednCvHU5IYpSBPPsXI2iQsDX", value = "The randomly generated SIP username for the credential.")
  @JsonProperty(JSON_PROPERTY_SIP_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSipUsername() {
    return sipUsername;
  }


  @JsonProperty(JSON_PROPERTY_SIP_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSipUsername(String sipUsername) {
    this.sipUsername = sipUsername;
  }


  public TelephonyCredential sipPassword(String sipPassword) {
    this.sipPassword = sipPassword;
    return this;
  }

   /**
   * The randomly generated SIP password for the credential.
   * @return sipPassword
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "a92dbcfb60184a8cb330b0acb2f7617b", value = "The randomly generated SIP password for the credential.")
  @JsonProperty(JSON_PROPERTY_SIP_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSipPassword() {
    return sipPassword;
  }


  @JsonProperty(JSON_PROPERTY_SIP_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSipPassword(String sipPassword) {
    this.sipPassword = sipPassword;
  }


  public TelephonyCredential createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO-8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO-8601 formatted date indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public TelephonyCredential updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO-8601 formatted date indicating when the resource was updated.
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO-8601 formatted date indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public TelephonyCredential expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * ISO-8601 formatted date indicating when the resource will expire.
   * @return expiresAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO-8601 formatted date indicating when the resource will expire.")
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }


  /**
   * Return true if this TelephonyCredential object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelephonyCredential telephonyCredential = (TelephonyCredential) o;
    return Objects.equals(this.id, telephonyCredential.id) &&
        Objects.equals(this.recordType, telephonyCredential.recordType) &&
        Objects.equals(this.name, telephonyCredential.name) &&
        Objects.equals(this.resourceId, telephonyCredential.resourceId) &&
        Objects.equals(this.expired, telephonyCredential.expired) &&
        Objects.equals(this.sipUsername, telephonyCredential.sipUsername) &&
        Objects.equals(this.sipPassword, telephonyCredential.sipPassword) &&
        Objects.equals(this.createdAt, telephonyCredential.createdAt) &&
        Objects.equals(this.updatedAt, telephonyCredential.updatedAt) &&
        Objects.equals(this.expiresAt, telephonyCredential.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, name, resourceId, expired, sipUsername, sipPassword, createdAt, updatedAt, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelephonyCredential {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    sipUsername: ").append(toIndentedString(sipUsername)).append("\n");
    sb.append("    sipPassword: ").append(toIndentedString(sipPassword)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

