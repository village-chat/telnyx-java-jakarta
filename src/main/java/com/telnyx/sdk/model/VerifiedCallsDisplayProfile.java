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
import com.telnyx.sdk.model.VerifiedCallsDisplayProfileBusinessIdentity;
import com.telnyx.sdk.model.VerifiedCallsDisplayProfileCallReasonsInner;
import com.telnyx.sdk.model.VerifiedCallsDisplayProfilePhoneNumbersInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * VerifiedCallsDisplayProfile
 */
@JsonPropertyOrder({
  VerifiedCallsDisplayProfile.JSON_PROPERTY_RECORD_TYPE,
  VerifiedCallsDisplayProfile.JSON_PROPERTY_ID,
  VerifiedCallsDisplayProfile.JSON_PROPERTY_NAME,
  VerifiedCallsDisplayProfile.JSON_PROPERTY_DISPLAY_NAME,
  VerifiedCallsDisplayProfile.JSON_PROPERTY_LOGO_URL,
  VerifiedCallsDisplayProfile.JSON_PROPERTY_STATUS,
  VerifiedCallsDisplayProfile.JSON_PROPERTY_BUSINESS_IDENTITY,
  VerifiedCallsDisplayProfile.JSON_PROPERTY_PHONE_NUMBERS,
  VerifiedCallsDisplayProfile.JSON_PROPERTY_CALL_REASONS,
  VerifiedCallsDisplayProfile.JSON_PROPERTY_CREATED_AT,
  VerifiedCallsDisplayProfile.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class VerifiedCallsDisplayProfile {
  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_LOGO_URL = "logo_url";
  private String logoUrl;

  /**
   * The approval status of the Verified Calls Display Profile in Google
   */
  public enum StatusEnum {
    UNSPECIFIED("VERIFICATION_STATE_UNSPECIFIED"),
    
    UNVERIFIED("VERIFICATION_STATE_UNVERIFIED"),
    
    PENDING("VERIFICATION_STATE_PENDING"),
    
    VERIFIED("VERIFICATION_STATE_VERIFIED"),
    
    SUSPENDED_IN_GMB("VERIFICATION_STATE_SUSPENDED_IN_GMB");

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

  public static final String JSON_PROPERTY_BUSINESS_IDENTITY = "business_identity";
  private VerifiedCallsDisplayProfileBusinessIdentity businessIdentity;

  public static final String JSON_PROPERTY_PHONE_NUMBERS = "phone_numbers";
  private List<VerifiedCallsDisplayProfilePhoneNumbersInner> phoneNumbers = null;

  public static final String JSON_PROPERTY_CALL_REASONS = "call_reasons";
  private List<VerifiedCallsDisplayProfileCallReasonsInner> callReasons = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public VerifiedCallsDisplayProfile() { 
  }

  @JsonCreator
  public VerifiedCallsDisplayProfile(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt
  ) {
    this();
    this.recordType = recordType;
    this.id = id;
    this.status = status;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "verified_calls_display_profile", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "c6feda4e-6501-4db9-a21f-665e5b4ce2ba", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public VerifiedCallsDisplayProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Verified Calls Display Profile&#39;s name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "My Verified Calls Display Profile", value = "The Verified Calls Display Profile's name")
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


  public VerifiedCallsDisplayProfile displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name to be shown as the caller name in phones
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Acme Inc.", value = "The display name to be shown as the caller name in phones")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public VerifiedCallsDisplayProfile logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * The URL pointing to a public image file that will be displayed during calls in phones
   * @return logoUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://acme.com/logo.png", value = "The URL pointing to a public image file that will be displayed during calls in phones")
  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogoUrl() {
    return logoUrl;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


   /**
   * The approval status of the Verified Calls Display Profile in Google
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The approval status of the Verified Calls Display Profile in Google")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




  public VerifiedCallsDisplayProfile businessIdentity(VerifiedCallsDisplayProfileBusinessIdentity businessIdentity) {
    this.businessIdentity = businessIdentity;
    return this;
  }

   /**
   * Get businessIdentity
   * @return businessIdentity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_IDENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VerifiedCallsDisplayProfileBusinessIdentity getBusinessIdentity() {
    return businessIdentity;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_IDENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessIdentity(VerifiedCallsDisplayProfileBusinessIdentity businessIdentity) {
    this.businessIdentity = businessIdentity;
  }


  public VerifiedCallsDisplayProfile phoneNumbers(List<VerifiedCallsDisplayProfilePhoneNumbersInner> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public VerifiedCallsDisplayProfile addPhoneNumbersItem(VerifiedCallsDisplayProfilePhoneNumbersInner phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VerifiedCallsDisplayProfilePhoneNumbersInner> getPhoneNumbers() {
    return phoneNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumbers(List<VerifiedCallsDisplayProfilePhoneNumbersInner> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public VerifiedCallsDisplayProfile callReasons(List<VerifiedCallsDisplayProfileCallReasonsInner> callReasons) {
    this.callReasons = callReasons;
    return this;
  }

  public VerifiedCallsDisplayProfile addCallReasonsItem(VerifiedCallsDisplayProfileCallReasonsInner callReasonsItem) {
    if (this.callReasons == null) {
      this.callReasons = new ArrayList<>();
    }
    this.callReasons.add(callReasonsItem);
    return this;
  }

   /**
   * Get callReasons
   * @return callReasons
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALL_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VerifiedCallsDisplayProfileCallReasonsInner> getCallReasons() {
    return callReasons;
  }


  @JsonProperty(JSON_PROPERTY_CALL_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallReasons(List<VerifiedCallsDisplayProfileCallReasonsInner> callReasons) {
    this.callReasons = callReasons;
  }


   /**
   * An ISO 8601 datetime string for when the display profile was added to the Telnyx platform
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-01-01T00:00:00Z", value = "An ISO 8601 datetime string for when the display profile was added to the Telnyx platform")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }




   /**
   * An ISO 8601 datetime string for when the display profile was updated
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-01-01T00:00:00Z", value = "An ISO 8601 datetime string for when the display profile was updated")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }




  /**
   * Return true if this VerifiedCallsDisplayProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifiedCallsDisplayProfile verifiedCallsDisplayProfile = (VerifiedCallsDisplayProfile) o;
    return Objects.equals(this.recordType, verifiedCallsDisplayProfile.recordType) &&
        Objects.equals(this.id, verifiedCallsDisplayProfile.id) &&
        Objects.equals(this.name, verifiedCallsDisplayProfile.name) &&
        Objects.equals(this.displayName, verifiedCallsDisplayProfile.displayName) &&
        Objects.equals(this.logoUrl, verifiedCallsDisplayProfile.logoUrl) &&
        Objects.equals(this.status, verifiedCallsDisplayProfile.status) &&
        Objects.equals(this.businessIdentity, verifiedCallsDisplayProfile.businessIdentity) &&
        Objects.equals(this.phoneNumbers, verifiedCallsDisplayProfile.phoneNumbers) &&
        Objects.equals(this.callReasons, verifiedCallsDisplayProfile.callReasons) &&
        Objects.equals(this.createdAt, verifiedCallsDisplayProfile.createdAt) &&
        Objects.equals(this.updatedAt, verifiedCallsDisplayProfile.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, id, name, displayName, logoUrl, status, businessIdentity, phoneNumbers, callReasons, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifiedCallsDisplayProfile {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    businessIdentity: ").append(toIndentedString(businessIdentity)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    callReasons: ").append(toIndentedString(callReasons)).append("\n");
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

