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
 * The media object containing audio details.
 */
@ApiModel(description = "The media object containing audio details.")
@JsonPropertyOrder({
  Audio.JSON_PROPERTY_ID,
  Audio.JSON_PROPERTY_LINK
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Audio {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link;

  public Audio() { 
  }

  public Audio id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The media object ID returned when the media is successfully uploaded to the media endpoint.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your-media-id", value = "The media object ID returned when the media is successfully uploaded to the media endpoint.")
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


  public Audio link(String link) {
    this.link = link;
    return this;
  }

   /**
   * The protocol and URL of the media to be sent. Use only with HTTP/HTTPS URLs. Either id or link must be provided, not both.
   * @return link
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "http://www.example.com/file", value = "The protocol and URL of the media to be sent. Use only with HTTP/HTTPS URLs. Either id or link must be provided, not both.")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(String link) {
    this.link = link;
  }


  /**
   * Return true if this Audio object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Audio audio = (Audio) o;
    return Objects.equals(this.id, audio.id) &&
        Objects.equals(this.link, audio.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Audio {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

