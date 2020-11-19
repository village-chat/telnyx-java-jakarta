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
 * ConnectionRtcpSettings
 */
@JsonPropertyOrder({
  ConnectionRtcpSettings.JSON_PROPERTY_PORT,
  ConnectionRtcpSettings.JSON_PROPERTY_CAPTURE_ENABLED,
  ConnectionRtcpSettings.JSON_PROPERTY_REPORT_FREQUENCY_SECS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionRtcpSettings {
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

  public static final String JSON_PROPERTY_REPORT_FREQUENCY_SECS = "report_frequency_secs";
  private Integer reportFrequencySecs = 10;


  public ConnectionRtcpSettings port(PortEnum port) {
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


  public ConnectionRtcpSettings captureEnabled(Boolean captureEnabled) {
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


  public ConnectionRtcpSettings reportFrequencySecs(Integer reportFrequencySecs) {
    this.reportFrequencySecs = reportFrequencySecs;
    return this;
  }

   /**
   * RTCP reports are sent to customers based on the frequency set. Frequency is in seconds and it can be set to values from 5 to 3000 seconds.
   * @return reportFrequencySecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "RTCP reports are sent to customers based on the frequency set. Frequency is in seconds and it can be set to values from 5 to 3000 seconds.")
  @JsonProperty(JSON_PROPERTY_REPORT_FREQUENCY_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReportFrequencySecs() {
    return reportFrequencySecs;
  }


  public void setReportFrequencySecs(Integer reportFrequencySecs) {
    this.reportFrequencySecs = reportFrequencySecs;
  }


  /**
   * Return true if this ConnectionRtcpSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionRtcpSettings connectionRtcpSettings = (ConnectionRtcpSettings) o;
    return Objects.equals(this.port, connectionRtcpSettings.port) &&
        Objects.equals(this.captureEnabled, connectionRtcpSettings.captureEnabled) &&
        Objects.equals(this.reportFrequencySecs, connectionRtcpSettings.reportFrequencySecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(port, captureEnabled, reportFrequencySecs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionRtcpSettings {\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    captureEnabled: ").append(toIndentedString(captureEnabled)).append("\n");
    sb.append("    reportFrequencySecs: ").append(toIndentedString(reportFrequencySecs)).append("\n");
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

