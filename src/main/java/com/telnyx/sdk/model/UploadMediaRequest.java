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
 * UploadMediaRequest
 */
@JsonPropertyOrder({
  UploadMediaRequest.JSON_PROPERTY_MEDIA_URL,
  UploadMediaRequest.JSON_PROPERTY_TTL_SECS,
  UploadMediaRequest.JSON_PROPERTY_MEDIA_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class UploadMediaRequest {
  public static final String JSON_PROPERTY_MEDIA_URL = "media_url";
  private String mediaUrl;

  public static final String JSON_PROPERTY_TTL_SECS = "ttl_secs";
  private Integer ttlSecs;

  public static final String JSON_PROPERTY_MEDIA_NAME = "media_name";
  private String mediaName;

  public UploadMediaRequest() { 
  }

  public UploadMediaRequest mediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The URL where the media to be stored in Telnyx network is currently hosted. The maximum allowed size is 20 MB.
   * @return mediaUrl
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "http://www.example.com/audio.mp3", required = true, value = "The URL where the media to be stored in Telnyx network is currently hosted. The maximum allowed size is 20 MB.")
  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMediaUrl() {
    return mediaUrl;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }


  public UploadMediaRequest ttlSecs(Integer ttlSecs) {
    this.ttlSecs = ttlSecs;
    return this;
  }

   /**
   * The number of seconds after which the media resource will be deleted, defaults to 2 days. The maximum allowed vale is 630720000, which translates to 20 years.
   * @return ttlSecs
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "86400", value = "The number of seconds after which the media resource will be deleted, defaults to 2 days. The maximum allowed vale is 630720000, which translates to 20 years.")
  @JsonProperty(JSON_PROPERTY_TTL_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTtlSecs() {
    return ttlSecs;
  }


  @JsonProperty(JSON_PROPERTY_TTL_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTtlSecs(Integer ttlSecs) {
    this.ttlSecs = ttlSecs;
  }


  public UploadMediaRequest mediaName(String mediaName) {
    this.mediaName = mediaName;
    return this;
  }

   /**
   * The unique identifier of a file.
   * @return mediaName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "my_file", value = "The unique identifier of a file.")
  @JsonProperty(JSON_PROPERTY_MEDIA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaName() {
    return mediaName;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaName(String mediaName) {
    this.mediaName = mediaName;
  }


  /**
   * Return true if this UploadMediaRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadMediaRequest uploadMediaRequest = (UploadMediaRequest) o;
    return Objects.equals(this.mediaUrl, uploadMediaRequest.mediaUrl) &&
        Objects.equals(this.ttlSecs, uploadMediaRequest.ttlSecs) &&
        Objects.equals(this.mediaName, uploadMediaRequest.mediaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaUrl, ttlSecs, mediaName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadMediaRequest {\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    ttlSecs: ").append(toIndentedString(ttlSecs)).append("\n");
    sb.append("    mediaName: ").append(toIndentedString(mediaName)).append("\n");
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

