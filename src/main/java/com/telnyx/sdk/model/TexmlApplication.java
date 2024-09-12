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
import com.telnyx.sdk.model.AnchorsiteOverride;
import com.telnyx.sdk.model.CreateTexmlApplicationRequestInbound;
import com.telnyx.sdk.model.CreateTexmlApplicationRequestOutbound;
import com.telnyx.sdk.model.DtmfType;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * TexmlApplication
 */
@JsonPropertyOrder({
  TexmlApplication.JSON_PROPERTY_ID,
  TexmlApplication.JSON_PROPERTY_RECORD_TYPE,
  TexmlApplication.JSON_PROPERTY_FRIENDLY_NAME,
  TexmlApplication.JSON_PROPERTY_ACTIVE,
  TexmlApplication.JSON_PROPERTY_ANCHORSITE_OVERRIDE,
  TexmlApplication.JSON_PROPERTY_DTMF_TYPE,
  TexmlApplication.JSON_PROPERTY_FIRST_COMMAND_TIMEOUT,
  TexmlApplication.JSON_PROPERTY_FIRST_COMMAND_TIMEOUT_SECS,
  TexmlApplication.JSON_PROPERTY_VOICE_URL,
  TexmlApplication.JSON_PROPERTY_VOICE_FALLBACK_URL,
  TexmlApplication.JSON_PROPERTY_VOICE_METHOD,
  TexmlApplication.JSON_PROPERTY_STATUS_CALLBACK,
  TexmlApplication.JSON_PROPERTY_STATUS_CALLBACK_METHOD,
  TexmlApplication.JSON_PROPERTY_INBOUND,
  TexmlApplication.JSON_PROPERTY_OUTBOUND,
  TexmlApplication.JSON_PROPERTY_CREATED_AT,
  TexmlApplication.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class TexmlApplication {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_FRIENDLY_NAME = "friendly_name";
  private String friendlyName;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active = true;

  public static final String JSON_PROPERTY_ANCHORSITE_OVERRIDE = "anchorsite_override";
  private AnchorsiteOverride anchorsiteOverride = AnchorsiteOverride.LATENCY;

  public static final String JSON_PROPERTY_DTMF_TYPE = "dtmf_type";
  private DtmfType dtmfType = DtmfType.RFC_2833;

  public static final String JSON_PROPERTY_FIRST_COMMAND_TIMEOUT = "first_command_timeout";
  private Boolean firstCommandTimeout = false;

  public static final String JSON_PROPERTY_FIRST_COMMAND_TIMEOUT_SECS = "first_command_timeout_secs";
  private Integer firstCommandTimeoutSecs = 30;

  public static final String JSON_PROPERTY_VOICE_URL = "voice_url";
  private String voiceUrl;

  public static final String JSON_PROPERTY_VOICE_FALLBACK_URL = "voice_fallback_url";
  private String voiceFallbackUrl;

  /**
   * HTTP request method Telnyx will use to interact with your XML Translator webhooks. Either &#39;get&#39; or &#39;post&#39;.
   */
  public enum VoiceMethodEnum {
    GET("get"),
    
    POST("post");

    private String value;

    VoiceMethodEnum(String value) {
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
    public static VoiceMethodEnum fromValue(String value) {
      for (VoiceMethodEnum b : VoiceMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VOICE_METHOD = "voice_method";
  private VoiceMethodEnum voiceMethod = VoiceMethodEnum.POST;

  public static final String JSON_PROPERTY_STATUS_CALLBACK = "status_callback";
  private String statusCallback;

  /**
   * HTTP request method Telnyx should use when requesting the status_callback URL.
   */
  public enum StatusCallbackMethodEnum {
    GET("get"),
    
    POST("post");

    private String value;

    StatusCallbackMethodEnum(String value) {
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
    public static StatusCallbackMethodEnum fromValue(String value) {
      for (StatusCallbackMethodEnum b : StatusCallbackMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS_CALLBACK_METHOD = "status_callback_method";
  private StatusCallbackMethodEnum statusCallbackMethod = StatusCallbackMethodEnum.POST;

  public static final String JSON_PROPERTY_INBOUND = "inbound";
  private CreateTexmlApplicationRequestInbound inbound;

  public static final String JSON_PROPERTY_OUTBOUND = "outbound";
  private CreateTexmlApplicationRequestOutbound outbound;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public TexmlApplication() { 
  }

  @JsonCreator
  public TexmlApplication(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt
  ) {
    this();
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

   /**
   * Identifies the resource.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1293384261075731499", value = "Identifies the resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public TexmlApplication recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "texml_application", value = "Identifies the type of the resource.")
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


  public TexmlApplication friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

   /**
   * A user-assigned name to help manage the application.
   * @return friendlyName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "call-router", value = "A user-assigned name to help manage the application.")
  @JsonProperty(JSON_PROPERTY_FRIENDLY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFriendlyName() {
    return friendlyName;
  }


  @JsonProperty(JSON_PROPERTY_FRIENDLY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }


  public TexmlApplication active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Specifies whether the connection can be used.
   * @return active
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Specifies whether the connection can be used.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public TexmlApplication anchorsiteOverride(AnchorsiteOverride anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
    return this;
  }

   /**
   * Get anchorsiteOverride
   * @return anchorsiteOverride
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AnchorsiteOverride getAnchorsiteOverride() {
    return anchorsiteOverride;
  }


  @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnchorsiteOverride(AnchorsiteOverride anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
  }


  public TexmlApplication dtmfType(DtmfType dtmfType) {
    this.dtmfType = dtmfType;
    return this;
  }

   /**
   * Get dtmfType
   * @return dtmfType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DTMF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DtmfType getDtmfType() {
    return dtmfType;
  }


  @JsonProperty(JSON_PROPERTY_DTMF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDtmfType(DtmfType dtmfType) {
    this.dtmfType = dtmfType;
  }


  public TexmlApplication firstCommandTimeout(Boolean firstCommandTimeout) {
    this.firstCommandTimeout = firstCommandTimeout;
    return this;
  }

   /**
   * Specifies whether calls to phone numbers associated with this connection should hangup after timing out.
   * @return firstCommandTimeout
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Specifies whether calls to phone numbers associated with this connection should hangup after timing out.")
  @JsonProperty(JSON_PROPERTY_FIRST_COMMAND_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFirstCommandTimeout() {
    return firstCommandTimeout;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_COMMAND_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstCommandTimeout(Boolean firstCommandTimeout) {
    this.firstCommandTimeout = firstCommandTimeout;
  }


  public TexmlApplication firstCommandTimeoutSecs(Integer firstCommandTimeoutSecs) {
    this.firstCommandTimeoutSecs = firstCommandTimeoutSecs;
    return this;
  }

   /**
   * Specifies how many seconds to wait before timing out a dial command.
   * @return firstCommandTimeoutSecs
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Specifies how many seconds to wait before timing out a dial command.")
  @JsonProperty(JSON_PROPERTY_FIRST_COMMAND_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFirstCommandTimeoutSecs() {
    return firstCommandTimeoutSecs;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_COMMAND_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstCommandTimeoutSecs(Integer firstCommandTimeoutSecs) {
    this.firstCommandTimeoutSecs = firstCommandTimeoutSecs;
  }


  public TexmlApplication voiceUrl(String voiceUrl) {
    this.voiceUrl = voiceUrl;
    return this;
  }

   /**
   * URL to which Telnyx will deliver your XML Translator webhooks.
   * @return voiceUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://example.com", value = "URL to which Telnyx will deliver your XML Translator webhooks.")
  @JsonProperty(JSON_PROPERTY_VOICE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVoiceUrl() {
    return voiceUrl;
  }


  @JsonProperty(JSON_PROPERTY_VOICE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoiceUrl(String voiceUrl) {
    this.voiceUrl = voiceUrl;
  }


  public TexmlApplication voiceFallbackUrl(String voiceFallbackUrl) {
    this.voiceFallbackUrl = voiceFallbackUrl;
    return this;
  }

   /**
   * URL to which Telnyx will deliver your XML Translator webhooks if we get an error response from your voice_url.
   * @return voiceFallbackUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://fallback.example.com", value = "URL to which Telnyx will deliver your XML Translator webhooks if we get an error response from your voice_url.")
  @JsonProperty(JSON_PROPERTY_VOICE_FALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVoiceFallbackUrl() {
    return voiceFallbackUrl;
  }


  @JsonProperty(JSON_PROPERTY_VOICE_FALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoiceFallbackUrl(String voiceFallbackUrl) {
    this.voiceFallbackUrl = voiceFallbackUrl;
  }


  public TexmlApplication voiceMethod(VoiceMethodEnum voiceMethod) {
    this.voiceMethod = voiceMethod;
    return this;
  }

   /**
   * HTTP request method Telnyx will use to interact with your XML Translator webhooks. Either &#39;get&#39; or &#39;post&#39;.
   * @return voiceMethod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "get", value = "HTTP request method Telnyx will use to interact with your XML Translator webhooks. Either 'get' or 'post'.")
  @JsonProperty(JSON_PROPERTY_VOICE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VoiceMethodEnum getVoiceMethod() {
    return voiceMethod;
  }


  @JsonProperty(JSON_PROPERTY_VOICE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoiceMethod(VoiceMethodEnum voiceMethod) {
    this.voiceMethod = voiceMethod;
  }


  public TexmlApplication statusCallback(String statusCallback) {
    this.statusCallback = statusCallback;
    return this;
  }

   /**
   * URL for Telnyx to send requests to containing information about call progress events.
   * @return statusCallback
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://example.com", value = "URL for Telnyx to send requests to containing information about call progress events.")
  @JsonProperty(JSON_PROPERTY_STATUS_CALLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusCallback() {
    return statusCallback;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_CALLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusCallback(String statusCallback) {
    this.statusCallback = statusCallback;
  }


  public TexmlApplication statusCallbackMethod(StatusCallbackMethodEnum statusCallbackMethod) {
    this.statusCallbackMethod = statusCallbackMethod;
    return this;
  }

   /**
   * HTTP request method Telnyx should use when requesting the status_callback URL.
   * @return statusCallbackMethod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "get", value = "HTTP request method Telnyx should use when requesting the status_callback URL.")
  @JsonProperty(JSON_PROPERTY_STATUS_CALLBACK_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusCallbackMethodEnum getStatusCallbackMethod() {
    return statusCallbackMethod;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_CALLBACK_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusCallbackMethod(StatusCallbackMethodEnum statusCallbackMethod) {
    this.statusCallbackMethod = statusCallbackMethod;
  }


  public TexmlApplication inbound(CreateTexmlApplicationRequestInbound inbound) {
    this.inbound = inbound;
    return this;
  }

   /**
   * Get inbound
   * @return inbound
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateTexmlApplicationRequestInbound getInbound() {
    return inbound;
  }


  @JsonProperty(JSON_PROPERTY_INBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInbound(CreateTexmlApplicationRequestInbound inbound) {
    this.inbound = inbound;
  }


  public TexmlApplication outbound(CreateTexmlApplicationRequestOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

   /**
   * Get outbound
   * @return outbound
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OUTBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateTexmlApplicationRequestOutbound getOutbound() {
    return outbound;
  }


  @JsonProperty(JSON_PROPERTY_OUTBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutbound(CreateTexmlApplicationRequestOutbound outbound) {
    this.outbound = outbound;
  }


   /**
   * ISO 8601 formatted date-time indicating when the resource was created.
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date-time indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }




   /**
   * ISO 8601 formatted date-time indicating when the resource was updated.
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date-time indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }




  /**
   * Return true if this TexmlApplication object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TexmlApplication texmlApplication = (TexmlApplication) o;
    return Objects.equals(this.id, texmlApplication.id) &&
        Objects.equals(this.recordType, texmlApplication.recordType) &&
        Objects.equals(this.friendlyName, texmlApplication.friendlyName) &&
        Objects.equals(this.active, texmlApplication.active) &&
        Objects.equals(this.anchorsiteOverride, texmlApplication.anchorsiteOverride) &&
        Objects.equals(this.dtmfType, texmlApplication.dtmfType) &&
        Objects.equals(this.firstCommandTimeout, texmlApplication.firstCommandTimeout) &&
        Objects.equals(this.firstCommandTimeoutSecs, texmlApplication.firstCommandTimeoutSecs) &&
        Objects.equals(this.voiceUrl, texmlApplication.voiceUrl) &&
        Objects.equals(this.voiceFallbackUrl, texmlApplication.voiceFallbackUrl) &&
        Objects.equals(this.voiceMethod, texmlApplication.voiceMethod) &&
        Objects.equals(this.statusCallback, texmlApplication.statusCallback) &&
        Objects.equals(this.statusCallbackMethod, texmlApplication.statusCallbackMethod) &&
        Objects.equals(this.inbound, texmlApplication.inbound) &&
        Objects.equals(this.outbound, texmlApplication.outbound) &&
        Objects.equals(this.createdAt, texmlApplication.createdAt) &&
        Objects.equals(this.updatedAt, texmlApplication.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, friendlyName, active, anchorsiteOverride, dtmfType, firstCommandTimeout, firstCommandTimeoutSecs, voiceUrl, voiceFallbackUrl, voiceMethod, statusCallback, statusCallbackMethod, inbound, outbound, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TexmlApplication {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    anchorsiteOverride: ").append(toIndentedString(anchorsiteOverride)).append("\n");
    sb.append("    dtmfType: ").append(toIndentedString(dtmfType)).append("\n");
    sb.append("    firstCommandTimeout: ").append(toIndentedString(firstCommandTimeout)).append("\n");
    sb.append("    firstCommandTimeoutSecs: ").append(toIndentedString(firstCommandTimeoutSecs)).append("\n");
    sb.append("    voiceUrl: ").append(toIndentedString(voiceUrl)).append("\n");
    sb.append("    voiceFallbackUrl: ").append(toIndentedString(voiceFallbackUrl)).append("\n");
    sb.append("    voiceMethod: ").append(toIndentedString(voiceMethod)).append("\n");
    sb.append("    statusCallback: ").append(toIndentedString(statusCallback)).append("\n");
    sb.append("    statusCallbackMethod: ").append(toIndentedString(statusCallbackMethod)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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

