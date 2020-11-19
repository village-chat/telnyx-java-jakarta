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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * Connection
 */
@JsonPropertyOrder({
  Connection.JSON_PROPERTY_ID,
  Connection.JSON_PROPERTY_RECORD_TYPE,
  Connection.JSON_PROPERTY_ACTIVE,
  Connection.JSON_PROPERTY_ANCHORSITE_OVERRIDE,
  Connection.JSON_PROPERTY_CONNECTION_NAME,
  Connection.JSON_PROPERTY_CREATED_AT,
  Connection.JSON_PROPERTY_UPDATED_AT,
  Connection.JSON_PROPERTY_WEBHOOK_EVENT_URL,
  Connection.JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL,
  Connection.JSON_PROPERTY_WEBHOOK_API_VERSION,
  Connection.JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Connection {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  /**
   * &#x60;Latency&#x60; directs Telnyx to route media through the site with the lowest round-trip time to the user&#39;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media.
   */
  public enum AnchorsiteOverrideEnum {
    LATENCY("Latency"),
    
    CHICAGO_IL("Chicago, IL"),
    
    ASHBURN_VA("Ashburn, VA"),
    
    SAN_JOSE_CA("San Jose, CA"),
    
    SYDNEY_AUSTRALIA("Sydney, Australia"),
    
    AMSTERDAM_NETHERLANDS("Amsterdam, Netherlands"),
    
    LONDON_UK("London, UK"),
    
    TORONTO_CANADA("Toronto, Canada"),
    
    VANCOUVER_CANADA("Vancouver, Canada"),
    
    FRANKFURT_GERMANY("Frankfurt, Germany");

    private String value;

    AnchorsiteOverrideEnum(String value) {
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
    public static AnchorsiteOverrideEnum fromValue(String value) {
      for (AnchorsiteOverrideEnum b : AnchorsiteOverrideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ANCHORSITE_OVERRIDE = "anchorsite_override";
  private AnchorsiteOverrideEnum anchorsiteOverride;

  public static final String JSON_PROPERTY_CONNECTION_NAME = "connection_name";
  private String connectionName;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_WEBHOOK_EVENT_URL = "webhook_event_url";
  private JsonNullable<String> webhookEventUrl = JsonNullable.<String>of("");

  public static final String JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL = "webhook_event_failover_url";
  private JsonNullable<String> webhookEventFailoverUrl = JsonNullable.<String>of("");

  /**
   * Determines which webhook format will be used, Telnyx API v1 or v2.
   */
  public enum WebhookApiVersionEnum {
    _1("1"),
    
    _2("2");

    private String value;

    WebhookApiVersionEnum(String value) {
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
    public static WebhookApiVersionEnum fromValue(String value) {
      for (WebhookApiVersionEnum b : WebhookApiVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WEBHOOK_API_VERSION = "webhook_api_version";
  private WebhookApiVersionEnum webhookApiVersion = WebhookApiVersionEnum._1;

  public static final String JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID = "outbound_voice_profile_id";
  private String outboundVoiceProfileId;


  public Connection id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the specific resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "Identifies the specific resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Connection recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ip_connection", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }


  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  public Connection active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Defaults to true
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Defaults to true")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Connection anchorsiteOverride(AnchorsiteOverrideEnum anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
    return this;
  }

   /**
   * &#x60;Latency&#x60; directs Telnyx to route media through the site with the lowest round-trip time to the user&#39;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media.
   * @return anchorsiteOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Latency", value = "`Latency` directs Telnyx to route media through the site with the lowest round-trip time to the user's connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media.")
  @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AnchorsiteOverrideEnum getAnchorsiteOverride() {
    return anchorsiteOverride;
  }


  public void setAnchorsiteOverride(AnchorsiteOverrideEnum anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
  }


  public Connection connectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

   /**
   * Get connectionName
   * @return connectionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionName() {
    return connectionName;
  }


  public void setConnectionName(String connectionName) {
    this.connectionName = connectionName;
  }


  public Connection createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Connection updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Connection webhookEventUrl(String webhookEventUrl) {
    this.webhookEventUrl = JsonNullable.<String>of(webhookEventUrl);
    return this;
  }

   /**
   * The URL where webhooks related to this connection will be sent.
   * @return webhookEventUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com", value = "The URL where webhooks related to this connection will be sent.")
  @JsonIgnore

  public String getWebhookEventUrl() {
        return webhookEventUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookEventUrl_JsonNullable() {
    return webhookEventUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_URL)
  public void setWebhookEventUrl_JsonNullable(JsonNullable<String> webhookEventUrl) {
    this.webhookEventUrl = webhookEventUrl;
  }

  public void setWebhookEventUrl(String webhookEventUrl) {
    this.webhookEventUrl = JsonNullable.<String>of(webhookEventUrl);
  }


  public Connection webhookEventFailoverUrl(String webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = JsonNullable.<String>of(webhookEventFailoverUrl);
    return this;
  }

   /**
   * The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails.
   * @return webhookEventFailoverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://failover.example.com", value = "The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails.")
  @JsonIgnore

  public String getWebhookEventFailoverUrl() {
        return webhookEventFailoverUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookEventFailoverUrl_JsonNullable() {
    return webhookEventFailoverUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL)
  public void setWebhookEventFailoverUrl_JsonNullable(JsonNullable<String> webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = webhookEventFailoverUrl;
  }

  public void setWebhookEventFailoverUrl(String webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = JsonNullable.<String>of(webhookEventFailoverUrl);
  }


  public Connection webhookApiVersion(WebhookApiVersionEnum webhookApiVersion) {
    this.webhookApiVersion = webhookApiVersion;
    return this;
  }

   /**
   * Determines which webhook format will be used, Telnyx API v1 or v2.
   * @return webhookApiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Determines which webhook format will be used, Telnyx API v1 or v2.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_API_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhookApiVersionEnum getWebhookApiVersion() {
    return webhookApiVersion;
  }


  public void setWebhookApiVersion(WebhookApiVersionEnum webhookApiVersion) {
    this.webhookApiVersion = webhookApiVersion;
  }


  public Connection outboundVoiceProfileId(String outboundVoiceProfileId) {
    this.outboundVoiceProfileId = outboundVoiceProfileId;
    return this;
  }

   /**
   * Identifies the associated outbound voice profile.
   * @return outboundVoiceProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1293384261075731499", value = "Identifies the associated outbound voice profile.")
  @JsonProperty(JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOutboundVoiceProfileId() {
    return outboundVoiceProfileId;
  }


  public void setOutboundVoiceProfileId(String outboundVoiceProfileId) {
    this.outboundVoiceProfileId = outboundVoiceProfileId;
  }


  /**
   * Return true if this Connection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connection connection = (Connection) o;
    return Objects.equals(this.id, connection.id) &&
        Objects.equals(this.recordType, connection.recordType) &&
        Objects.equals(this.active, connection.active) &&
        Objects.equals(this.anchorsiteOverride, connection.anchorsiteOverride) &&
        Objects.equals(this.connectionName, connection.connectionName) &&
        Objects.equals(this.createdAt, connection.createdAt) &&
        Objects.equals(this.updatedAt, connection.updatedAt) &&
        Objects.equals(this.webhookEventUrl, connection.webhookEventUrl) &&
        Objects.equals(this.webhookEventFailoverUrl, connection.webhookEventFailoverUrl) &&
        Objects.equals(this.webhookApiVersion, connection.webhookApiVersion) &&
        Objects.equals(this.outboundVoiceProfileId, connection.outboundVoiceProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, active, anchorsiteOverride, connectionName, createdAt, updatedAt, webhookEventUrl, webhookEventFailoverUrl, webhookApiVersion, outboundVoiceProfileId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    anchorsiteOverride: ").append(toIndentedString(anchorsiteOverride)).append("\n");
    sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    webhookEventUrl: ").append(toIndentedString(webhookEventUrl)).append("\n");
    sb.append("    webhookEventFailoverUrl: ").append(toIndentedString(webhookEventFailoverUrl)).append("\n");
    sb.append("    webhookApiVersion: ").append(toIndentedString(webhookApiVersion)).append("\n");
    sb.append("    outboundVoiceProfileId: ").append(toIndentedString(outboundVoiceProfileId)).append("\n");
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

