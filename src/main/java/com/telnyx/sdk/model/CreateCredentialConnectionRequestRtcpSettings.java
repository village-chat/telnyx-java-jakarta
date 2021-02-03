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
 * CreateCredentialConnectionRequestRtcpSettings
 */
@JsonPropertyOrder({
  CreateCredentialConnectionRequestRtcpSettings.JSON_PROPERTY_PORT,
  CreateCredentialConnectionRequestRtcpSettings.JSON_PROPERTY_CAPTURE_ENABLED,
  CreateCredentialConnectionRequestRtcpSettings.JSON_PROPERTY_REPORT_FREQUENCY_SECONDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateCredentialConnectionRequestRtcpSettings {
  /**
   * RTCP port by default is rtp+1, it can also be set to rtcp-mux
   */
  public enum PortEnum {
    RTCP_MUX("rtcp-mux"),
    
    RTP_1("rtp+1");

    private String value;

    PortEnum(String value) {
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
    public static PortEnum fromValue(String value) {
      for (PortEnum b : PortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PORT = "port";
  private PortEnum port = PortEnum.RTP_1;

  public static final String JSON_PROPERTY_CAPTURE_ENABLED = "capture_enabled";
  private Boolean captureEnabled = false;

  public static final String JSON_PROPERTY_REPORT_FREQUENCY_SECONDS = "report_frequency_seconds";
  private Integer reportFrequencySeconds = 10;


  public CreateCredentialConnectionRequestRtcpSettings port(PortEnum port) {
    this.port = port;
    return this;
  }

   /**
   * RTCP port by default is rtp+1, it can also be set to rtcp-mux
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RTCP port by default is rtp+1, it can also be set to rtcp-mux")
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PortEnum getPort() {
    return port;
  }


  public void setPort(PortEnum port) {
    this.port = port;
  }


  public CreateCredentialConnectionRequestRtcpSettings captureEnabled(Boolean captureEnabled) {
    this.captureEnabled = captureEnabled;
    return this;
  }

   /**
   * BETA - Enable the capture and storage of RTCP messages to create QoS reports on the Telnyx Mission Control Portal.
   * @return captureEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "BETA - Enable the capture and storage of RTCP messages to create QoS reports on the Telnyx Mission Control Portal.")
  @JsonProperty(JSON_PROPERTY_CAPTURE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCaptureEnabled() {
    return captureEnabled;
  }


  public void setCaptureEnabled(Boolean captureEnabled) {
    this.captureEnabled = captureEnabled;
  }


  public CreateCredentialConnectionRequestRtcpSettings reportFrequencySeconds(Integer reportFrequencySeconds) {
    this.reportFrequencySeconds = reportFrequencySeconds;
    return this;
  }

   /**
   * RTCP reports are sent to customers based on the frequency set. Frequency is in seconds and it can be set to values from 5 to 3000 seconds.
   * @return reportFrequencySeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RTCP reports are sent to customers based on the frequency set. Frequency is in seconds and it can be set to values from 5 to 3000 seconds.")
  @JsonProperty(JSON_PROPERTY_REPORT_FREQUENCY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReportFrequencySeconds() {
    return reportFrequencySeconds;
  }


  public void setReportFrequencySeconds(Integer reportFrequencySeconds) {
    this.reportFrequencySeconds = reportFrequencySeconds;
  }


  /**
   * Return true if this CreateCredentialConnectionRequest_rtcp_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCredentialConnectionRequestRtcpSettings createCredentialConnectionRequestRtcpSettings = (CreateCredentialConnectionRequestRtcpSettings) o;
    return Objects.equals(this.port, createCredentialConnectionRequestRtcpSettings.port) &&
        Objects.equals(this.captureEnabled, createCredentialConnectionRequestRtcpSettings.captureEnabled) &&
        Objects.equals(this.reportFrequencySeconds, createCredentialConnectionRequestRtcpSettings.reportFrequencySeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(port, captureEnabled, reportFrequencySeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCredentialConnectionRequestRtcpSettings {\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    captureEnabled: ").append(toIndentedString(captureEnabled)).append("\n");
    sb.append("    reportFrequencySeconds: ").append(toIndentedString(reportFrequencySeconds)).append("\n");
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

