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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * GcbChannelZone
 */
@JsonPropertyOrder({
  GcbChannelZone.JSON_PROPERTY_RECORD_TYPE,
  GcbChannelZone.JSON_PROPERTY_COUNTRIES,
  GcbChannelZone.JSON_PROPERTY_ID,
  GcbChannelZone.JSON_PROPERTY_NAME,
  GcbChannelZone.JSON_PROPERTY_CHANNELS,
  GcbChannelZone.JSON_PROPERTY_CREATED_AT,
  GcbChannelZone.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GcbChannelZone {
  /**
   * Gets or Sets recordType
   */
  public enum RecordTypeEnum {
    CHANNEL_ZONE("channel_zone");

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

  public static final String JSON_PROPERTY_COUNTRIES = "countries";
  private List<String> countries = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CHANNELS = "channels";
  private Long channels;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public GcbChannelZone() { 
  }

  public GcbChannelZone recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "channel_zone", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RecordTypeEnum getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }


  public GcbChannelZone countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  public GcbChannelZone addCountriesItem(String countriesItem) {
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * List of countries (in ISO 3166-2, capitalized) members of the billing channel zone
   * @return countries
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"BE\",\"EL\",\"LT\",\"PT\",\"BG\",\"ES\",\"LU\",\"RO\",\"CZ\",\"FR\",\"HU\",\"SI\",\"DK\",\"HR\",\"MT\",\"SK\",\"DE\",\"IT\",\"NL\",\"FI\",\"EE\",\"CY\",\"AT\",\"SE\",\"IE\",\"LV\",\"PL\"]", required = true, value = "List of countries (in ISO 3166-2, capitalized) members of the billing channel zone")
  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getCountries() {
    return countries;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountries(List<String> countries) {
    this.countries = countries;
  }


  public GcbChannelZone id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1653e6a1-4bfd-4857-97c6-6a51e1c34477", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public GcbChannelZone name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Euro channel zone", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public GcbChannelZone channels(Long channels) {
    this.channels = channels;
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "7", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getChannels() {
    return channels;
  }


  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannels(Long channels) {
    this.channels = channels;
  }


  public GcbChannelZone createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date of when the channel zone was created
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2019-01-23T18:10:02.574Z", value = "ISO 8601 formatted date of when the channel zone was created")
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


  public GcbChannelZone updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date of when the channel zone was updated
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2019-01-23T18:10:02.574Z", value = "ISO 8601 formatted date of when the channel zone was updated")
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


  /**
   * Return true if this GcbChannelZone object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcbChannelZone gcbChannelZone = (GcbChannelZone) o;
    return Objects.equals(this.recordType, gcbChannelZone.recordType) &&
        Objects.equals(this.countries, gcbChannelZone.countries) &&
        Objects.equals(this.id, gcbChannelZone.id) &&
        Objects.equals(this.name, gcbChannelZone.name) &&
        Objects.equals(this.channels, gcbChannelZone.channels) &&
        Objects.equals(this.createdAt, gcbChannelZone.createdAt) &&
        Objects.equals(this.updatedAt, gcbChannelZone.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, countries, id, name, channels, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcbChannelZone {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

