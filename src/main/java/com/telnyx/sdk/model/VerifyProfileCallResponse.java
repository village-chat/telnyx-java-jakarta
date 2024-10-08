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
import java.util.UUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * VerifyProfileCallResponse
 */
@JsonPropertyOrder({
  VerifyProfileCallResponse.JSON_PROPERTY_MESSAGING_TEMPLATE_ID,
  VerifyProfileCallResponse.JSON_PROPERTY_APP_NAME,
  VerifyProfileCallResponse.JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS,
  VerifyProfileCallResponse.JSON_PROPERTY_DEFAULT_CALL_TIMEOUT_SECS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class VerifyProfileCallResponse {
  public static final String JSON_PROPERTY_MESSAGING_TEMPLATE_ID = "messaging_template_id";
  private UUID messagingTemplateId;

  public static final String JSON_PROPERTY_APP_NAME = "app_name";
  private String appName;

  public static final String JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS = "default_verification_timeout_secs";
  private Integer defaultVerificationTimeoutSecs;

  public static final String JSON_PROPERTY_DEFAULT_CALL_TIMEOUT_SECS = "default_call_timeout_secs";
  private Integer defaultCallTimeoutSecs = 45;

  public VerifyProfileCallResponse() { 
  }

  public VerifyProfileCallResponse messagingTemplateId(UUID messagingTemplateId) {
    this.messagingTemplateId = messagingTemplateId;
    return this;
  }

   /**
   * The message template identifier selected from /verify_profiles/templates
   * @return messagingTemplateId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0abb5b4f-459f-445a-bfcd-488998b7572d", value = "The message template identifier selected from /verify_profiles/templates")
  @JsonProperty(JSON_PROPERTY_MESSAGING_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getMessagingTemplateId() {
    return messagingTemplateId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGING_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessagingTemplateId(UUID messagingTemplateId) {
    this.messagingTemplateId = messagingTemplateId;
  }


  public VerifyProfileCallResponse appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * The name that identifies the application requesting 2fa in the verification message.
   * @return appName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Example Secure App", value = "The name that identifies the application requesting 2fa in the verification message.")
  @JsonProperty(JSON_PROPERTY_APP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppName() {
    return appName;
  }


  @JsonProperty(JSON_PROPERTY_APP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppName(String appName) {
    this.appName = appName;
  }


  public VerifyProfileCallResponse defaultVerificationTimeoutSecs(Integer defaultVerificationTimeoutSecs) {
    this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs;
    return this;
  }

   /**
   * For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity.
   * @return defaultVerificationTimeoutSecs
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "300", value = "For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDefaultVerificationTimeoutSecs() {
    return defaultVerificationTimeoutSecs;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultVerificationTimeoutSecs(Integer defaultVerificationTimeoutSecs) {
    this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs;
  }


  public VerifyProfileCallResponse defaultCallTimeoutSecs(Integer defaultCallTimeoutSecs) {
    this.defaultCallTimeoutSecs = defaultCallTimeoutSecs;
    return this;
  }

   /**
   * Must be less than default_verification_timeout_secs
   * @return defaultCallTimeoutSecs
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "30", value = "Must be less than default_verification_timeout_secs")
  @JsonProperty(JSON_PROPERTY_DEFAULT_CALL_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDefaultCallTimeoutSecs() {
    return defaultCallTimeoutSecs;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_CALL_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultCallTimeoutSecs(Integer defaultCallTimeoutSecs) {
    this.defaultCallTimeoutSecs = defaultCallTimeoutSecs;
  }


  /**
   * Return true if this VerifyProfileCallResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyProfileCallResponse verifyProfileCallResponse = (VerifyProfileCallResponse) o;
    return Objects.equals(this.messagingTemplateId, verifyProfileCallResponse.messagingTemplateId) &&
        Objects.equals(this.appName, verifyProfileCallResponse.appName) &&
        Objects.equals(this.defaultVerificationTimeoutSecs, verifyProfileCallResponse.defaultVerificationTimeoutSecs) &&
        Objects.equals(this.defaultCallTimeoutSecs, verifyProfileCallResponse.defaultCallTimeoutSecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messagingTemplateId, appName, defaultVerificationTimeoutSecs, defaultCallTimeoutSecs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyProfileCallResponse {\n");
    sb.append("    messagingTemplateId: ").append(toIndentedString(messagingTemplateId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    defaultVerificationTimeoutSecs: ").append(toIndentedString(defaultVerificationTimeoutSecs)).append("\n");
    sb.append("    defaultCallTimeoutSecs: ").append(toIndentedString(defaultCallTimeoutSecs)).append("\n");
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

