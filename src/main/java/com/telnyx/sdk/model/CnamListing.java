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
 * The CNAM listing settings for a phone number.
 */
@ApiModel(description = "The CNAM listing settings for a phone number.")
@JsonPropertyOrder({
  CnamListing.JSON_PROPERTY_CNAM_LISTING_ENABLED,
  CnamListing.JSON_PROPERTY_CNAM_LISTING_DETAILS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CnamListing {
  public static final String JSON_PROPERTY_CNAM_LISTING_ENABLED = "cnam_listing_enabled";
  private Boolean cnamListingEnabled = false;

  public static final String JSON_PROPERTY_CNAM_LISTING_DETAILS = "cnam_listing_details";
  private String cnamListingDetails;

  public CnamListing() { 
  }

  public CnamListing cnamListingEnabled(Boolean cnamListingEnabled) {
    this.cnamListingEnabled = cnamListingEnabled;
    return this;
  }

   /**
   * Enables CNAM listings for this number. Requires cnam_listing_details to also be set.
   * @return cnamListingEnabled
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Enables CNAM listings for this number. Requires cnam_listing_details to also be set.")
  @JsonProperty(JSON_PROPERTY_CNAM_LISTING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCnamListingEnabled() {
    return cnamListingEnabled;
  }


  @JsonProperty(JSON_PROPERTY_CNAM_LISTING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCnamListingEnabled(Boolean cnamListingEnabled) {
    this.cnamListingEnabled = cnamListingEnabled;
  }


  public CnamListing cnamListingDetails(String cnamListingDetails) {
    this.cnamListingDetails = cnamListingDetails;
    return this;
  }

   /**
   * The CNAM listing details for this number. Must be alphanumeric characters or spaces with a maximum length of 15. Requires cnam_listing_enabled to also be set to true.
   * @return cnamListingDetails
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The CNAM listing details for this number. Must be alphanumeric characters or spaces with a maximum length of 15. Requires cnam_listing_enabled to also be set to true.")
  @JsonProperty(JSON_PROPERTY_CNAM_LISTING_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCnamListingDetails() {
    return cnamListingDetails;
  }


  @JsonProperty(JSON_PROPERTY_CNAM_LISTING_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCnamListingDetails(String cnamListingDetails) {
    this.cnamListingDetails = cnamListingDetails;
  }


  /**
   * Return true if this CnamListing object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CnamListing cnamListing = (CnamListing) o;
    return Objects.equals(this.cnamListingEnabled, cnamListing.cnamListingEnabled) &&
        Objects.equals(this.cnamListingDetails, cnamListing.cnamListingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cnamListingEnabled, cnamListingDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CnamListing {\n");
    sb.append("    cnamListingEnabled: ").append(toIndentedString(cnamListingEnabled)).append("\n");
    sb.append("    cnamListingDetails: ").append(toIndentedString(cnamListingDetails)).append("\n");
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

