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
import com.telnyx.sdk.model.CallForwarding;
import com.telnyx.sdk.model.CallRecording;
import com.telnyx.sdk.model.CnamListing;
import com.telnyx.sdk.model.EmergencySettings;
import com.telnyx.sdk.model.MediaFeatures;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * PhoneNumberWithVoiceSettings
 */
@JsonPropertyOrder({
  PhoneNumberWithVoiceSettings.JSON_PROPERTY_ID,
  PhoneNumberWithVoiceSettings.JSON_PROPERTY_RECORD_TYPE,
  PhoneNumberWithVoiceSettings.JSON_PROPERTY_PHONE_NUMBER,
  PhoneNumberWithVoiceSettings.JSON_PROPERTY_CONNECTION_ID,
  PhoneNumberWithVoiceSettings.JSON_PROPERTY_CUSTOMER_REFERENCE,
  PhoneNumberWithVoiceSettings.JSON_PROPERTY_TECH_PREFIX_ENABLED,
  PhoneNumberWithVoiceSettings.JSON_PROPERTY_TRANSLATED_NUMBER,
  PhoneNumberWithVoiceSettings.JSON_PROPERTY_CALL_FORWARDING,
  PhoneNumberWithVoiceSettings.JSON_PROPERTY_CNAM_LISTING,
  PhoneNumberWithVoiceSettings.JSON_PROPERTY_EMERGENCY,
  PhoneNumberWithVoiceSettings.JSON_PROPERTY_USAGE_PAYMENT_METHOD,
  PhoneNumberWithVoiceSettings.JSON_PROPERTY_MEDIA_FEATURES,
  PhoneNumberWithVoiceSettings.JSON_PROPERTY_CALL_RECORDING,
  PhoneNumberWithVoiceSettings.JSON_PROPERTY_INBOUND_CALL_SCREENING
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PhoneNumberWithVoiceSettings {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CUSTOMER_REFERENCE = "customer_reference";
  private String customerReference;

  public static final String JSON_PROPERTY_TECH_PREFIX_ENABLED = "tech_prefix_enabled";
  private Boolean techPrefixEnabled = false;

  public static final String JSON_PROPERTY_TRANSLATED_NUMBER = "translated_number";
  private String translatedNumber = "";

  public static final String JSON_PROPERTY_CALL_FORWARDING = "call_forwarding";
  private CallForwarding callForwarding;

  public static final String JSON_PROPERTY_CNAM_LISTING = "cnam_listing";
  private CnamListing cnamListing;

  public static final String JSON_PROPERTY_EMERGENCY = "emergency";
  private EmergencySettings emergency;

  /**
   * Controls whether a number is billed per minute or uses your concurrent channels.
   */
  public enum UsagePaymentMethodEnum {
    PAY_PER_MINUTE("pay-per-minute"),
    
    CHANNEL("channel");

    private String value;

    UsagePaymentMethodEnum(String value) {
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
    public static UsagePaymentMethodEnum fromValue(String value) {
      for (UsagePaymentMethodEnum b : UsagePaymentMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_USAGE_PAYMENT_METHOD = "usage_payment_method";
  private UsagePaymentMethodEnum usagePaymentMethod = UsagePaymentMethodEnum.PAY_PER_MINUTE;

  public static final String JSON_PROPERTY_MEDIA_FEATURES = "media_features";
  private MediaFeatures mediaFeatures;

  public static final String JSON_PROPERTY_CALL_RECORDING = "call_recording";
  private CallRecording callRecording;

  /**
   * The inbound_call_screening setting is a phone number configuration option variable that allows users to configure their settings to block or flag fraudulent calls. It can be set to disabled, reject_calls, or flag_calls. This feature has an additional per-number monthly cost associated with it.
   */
  public enum InboundCallScreeningEnum {
    DISABLED("disabled"),
    
    REJECT_CALLS("reject_calls"),
    
    FLAG_CALLS("flag_calls");

    private String value;

    InboundCallScreeningEnum(String value) {
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
    public static InboundCallScreeningEnum fromValue(String value) {
      for (InboundCallScreeningEnum b : InboundCallScreeningEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INBOUND_CALL_SCREENING = "inbound_call_screening";
  private InboundCallScreeningEnum inboundCallScreening = InboundCallScreeningEnum.DISABLED;

  public PhoneNumberWithVoiceSettings() { 
  }

  @JsonCreator
  public PhoneNumberWithVoiceSettings(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER) String phoneNumber
  ) {
    this();
    this.id = id;
    this.recordType = recordType;
    this.phoneNumber = phoneNumber;
  }

   /**
   * Identifies the type of resource.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1293384261075731499", value = "Identifies the type of resource.")
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
  @ApiModelProperty(example = "voice_settings", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * The phone number in +E164 format.
   * @return phoneNumber
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "+13035551234", value = "The phone number in +E164 format.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }




  public PhoneNumberWithVoiceSettings connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Identifies the connection associated with this phone number.
   * @return connectionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1d0e6cb8-8668-462e-94c6-49ae0f0ed48b", value = "Identifies the connection associated with this phone number.")
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


  public PhoneNumberWithVoiceSettings customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * A customer reference string for customer look ups.
   * @return customerReference
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "MY REF 001", value = "A customer reference string for customer look ups.")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerReference() {
    return customerReference;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  public PhoneNumberWithVoiceSettings techPrefixEnabled(Boolean techPrefixEnabled) {
    this.techPrefixEnabled = techPrefixEnabled;
    return this;
  }

   /**
   * Controls whether a tech prefix is enabled for this phone number.
   * @return techPrefixEnabled
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Controls whether a tech prefix is enabled for this phone number.")
  @JsonProperty(JSON_PROPERTY_TECH_PREFIX_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTechPrefixEnabled() {
    return techPrefixEnabled;
  }


  @JsonProperty(JSON_PROPERTY_TECH_PREFIX_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTechPrefixEnabled(Boolean techPrefixEnabled) {
    this.techPrefixEnabled = techPrefixEnabled;
  }


  public PhoneNumberWithVoiceSettings translatedNumber(String translatedNumber) {
    this.translatedNumber = translatedNumber;
    return this;
  }

   /**
   * This field allows you to rewrite the destination number of an inbound call before the call is routed to you. The value of this field may be any alphanumeric value, and the value will replace the number originally dialed.
   * @return translatedNumber
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "+13035559999", value = "This field allows you to rewrite the destination number of an inbound call before the call is routed to you. The value of this field may be any alphanumeric value, and the value will replace the number originally dialed.")
  @JsonProperty(JSON_PROPERTY_TRANSLATED_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTranslatedNumber() {
    return translatedNumber;
  }


  @JsonProperty(JSON_PROPERTY_TRANSLATED_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranslatedNumber(String translatedNumber) {
    this.translatedNumber = translatedNumber;
  }


  public PhoneNumberWithVoiceSettings callForwarding(CallForwarding callForwarding) {
    this.callForwarding = callForwarding;
    return this;
  }

   /**
   * Get callForwarding
   * @return callForwarding
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALL_FORWARDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallForwarding getCallForwarding() {
    return callForwarding;
  }


  @JsonProperty(JSON_PROPERTY_CALL_FORWARDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallForwarding(CallForwarding callForwarding) {
    this.callForwarding = callForwarding;
  }


  public PhoneNumberWithVoiceSettings cnamListing(CnamListing cnamListing) {
    this.cnamListing = cnamListing;
    return this;
  }

   /**
   * Get cnamListing
   * @return cnamListing
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CNAM_LISTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CnamListing getCnamListing() {
    return cnamListing;
  }


  @JsonProperty(JSON_PROPERTY_CNAM_LISTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCnamListing(CnamListing cnamListing) {
    this.cnamListing = cnamListing;
  }


  public PhoneNumberWithVoiceSettings emergency(EmergencySettings emergency) {
    this.emergency = emergency;
    return this;
  }

   /**
   * Get emergency
   * @return emergency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMERGENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmergencySettings getEmergency() {
    return emergency;
  }


  @JsonProperty(JSON_PROPERTY_EMERGENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmergency(EmergencySettings emergency) {
    this.emergency = emergency;
  }


  public PhoneNumberWithVoiceSettings usagePaymentMethod(UsagePaymentMethodEnum usagePaymentMethod) {
    this.usagePaymentMethod = usagePaymentMethod;
    return this;
  }

   /**
   * Controls whether a number is billed per minute or uses your concurrent channels.
   * @return usagePaymentMethod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "pay-per-minute", value = "Controls whether a number is billed per minute or uses your concurrent channels.")
  @JsonProperty(JSON_PROPERTY_USAGE_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsagePaymentMethodEnum getUsagePaymentMethod() {
    return usagePaymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_USAGE_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsagePaymentMethod(UsagePaymentMethodEnum usagePaymentMethod) {
    this.usagePaymentMethod = usagePaymentMethod;
  }


  public PhoneNumberWithVoiceSettings mediaFeatures(MediaFeatures mediaFeatures) {
    this.mediaFeatures = mediaFeatures;
    return this;
  }

   /**
   * Get mediaFeatures
   * @return mediaFeatures
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MediaFeatures getMediaFeatures() {
    return mediaFeatures;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaFeatures(MediaFeatures mediaFeatures) {
    this.mediaFeatures = mediaFeatures;
  }


  public PhoneNumberWithVoiceSettings callRecording(CallRecording callRecording) {
    this.callRecording = callRecording;
    return this;
  }

   /**
   * Get callRecording
   * @return callRecording
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALL_RECORDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallRecording getCallRecording() {
    return callRecording;
  }


  @JsonProperty(JSON_PROPERTY_CALL_RECORDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallRecording(CallRecording callRecording) {
    this.callRecording = callRecording;
  }


  public PhoneNumberWithVoiceSettings inboundCallScreening(InboundCallScreeningEnum inboundCallScreening) {
    this.inboundCallScreening = inboundCallScreening;
    return this;
  }

   /**
   * The inbound_call_screening setting is a phone number configuration option variable that allows users to configure their settings to block or flag fraudulent calls. It can be set to disabled, reject_calls, or flag_calls. This feature has an additional per-number monthly cost associated with it.
   * @return inboundCallScreening
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The inbound_call_screening setting is a phone number configuration option variable that allows users to configure their settings to block or flag fraudulent calls. It can be set to disabled, reject_calls, or flag_calls. This feature has an additional per-number monthly cost associated with it.")
  @JsonProperty(JSON_PROPERTY_INBOUND_CALL_SCREENING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InboundCallScreeningEnum getInboundCallScreening() {
    return inboundCallScreening;
  }


  @JsonProperty(JSON_PROPERTY_INBOUND_CALL_SCREENING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInboundCallScreening(InboundCallScreeningEnum inboundCallScreening) {
    this.inboundCallScreening = inboundCallScreening;
  }


  /**
   * Return true if this PhoneNumberWithVoiceSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberWithVoiceSettings phoneNumberWithVoiceSettings = (PhoneNumberWithVoiceSettings) o;
    return Objects.equals(this.id, phoneNumberWithVoiceSettings.id) &&
        Objects.equals(this.recordType, phoneNumberWithVoiceSettings.recordType) &&
        Objects.equals(this.phoneNumber, phoneNumberWithVoiceSettings.phoneNumber) &&
        Objects.equals(this.connectionId, phoneNumberWithVoiceSettings.connectionId) &&
        Objects.equals(this.customerReference, phoneNumberWithVoiceSettings.customerReference) &&
        Objects.equals(this.techPrefixEnabled, phoneNumberWithVoiceSettings.techPrefixEnabled) &&
        Objects.equals(this.translatedNumber, phoneNumberWithVoiceSettings.translatedNumber) &&
        Objects.equals(this.callForwarding, phoneNumberWithVoiceSettings.callForwarding) &&
        Objects.equals(this.cnamListing, phoneNumberWithVoiceSettings.cnamListing) &&
        Objects.equals(this.emergency, phoneNumberWithVoiceSettings.emergency) &&
        Objects.equals(this.usagePaymentMethod, phoneNumberWithVoiceSettings.usagePaymentMethod) &&
        Objects.equals(this.mediaFeatures, phoneNumberWithVoiceSettings.mediaFeatures) &&
        Objects.equals(this.callRecording, phoneNumberWithVoiceSettings.callRecording) &&
        Objects.equals(this.inboundCallScreening, phoneNumberWithVoiceSettings.inboundCallScreening);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, phoneNumber, connectionId, customerReference, techPrefixEnabled, translatedNumber, callForwarding, cnamListing, emergency, usagePaymentMethod, mediaFeatures, callRecording, inboundCallScreening);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberWithVoiceSettings {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    techPrefixEnabled: ").append(toIndentedString(techPrefixEnabled)).append("\n");
    sb.append("    translatedNumber: ").append(toIndentedString(translatedNumber)).append("\n");
    sb.append("    callForwarding: ").append(toIndentedString(callForwarding)).append("\n");
    sb.append("    cnamListing: ").append(toIndentedString(cnamListing)).append("\n");
    sb.append("    emergency: ").append(toIndentedString(emergency)).append("\n");
    sb.append("    usagePaymentMethod: ").append(toIndentedString(usagePaymentMethod)).append("\n");
    sb.append("    mediaFeatures: ").append(toIndentedString(mediaFeatures)).append("\n");
    sb.append("    callRecording: ").append(toIndentedString(callRecording)).append("\n");
    sb.append("    inboundCallScreening: ").append(toIndentedString(inboundCallScreening)).append("\n");
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

