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
 * ValidateAddressRequest
 */
@JsonPropertyOrder({
  ValidateAddressRequest.JSON_PROPERTY_STREET_ADDRESS,
  ValidateAddressRequest.JSON_PROPERTY_EXTENDED_ADDRESS,
  ValidateAddressRequest.JSON_PROPERTY_LOCALITY,
  ValidateAddressRequest.JSON_PROPERTY_ADMINISTRATIVE_AREA,
  ValidateAddressRequest.JSON_PROPERTY_POSTAL_CODE,
  ValidateAddressRequest.JSON_PROPERTY_COUNTRY_CODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ValidateAddressRequest {
  public static final String JSON_PROPERTY_STREET_ADDRESS = "street_address";
  private String streetAddress;

  public static final String JSON_PROPERTY_EXTENDED_ADDRESS = "extended_address";
  private String extendedAddress;

  public static final String JSON_PROPERTY_LOCALITY = "locality";
  private String locality;

  public static final String JSON_PROPERTY_ADMINISTRATIVE_AREA = "administrative_area";
  private String administrativeArea;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postal_code";
  private String postalCode;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public ValidateAddressRequest() { 
  }

  public ValidateAddressRequest streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * The primary street address information about the address.
   * @return streetAddress
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "311 W Superior Street", required = true, value = "The primary street address information about the address.")
  @JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStreetAddress() {
    return streetAddress;
  }


  @JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }


  public ValidateAddressRequest extendedAddress(String extendedAddress) {
    this.extendedAddress = extendedAddress;
    return this;
  }

   /**
   * Additional street address information about the address such as, but not limited to, unit number or apartment number.
   * @return extendedAddress
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "#504", value = "Additional street address information about the address such as, but not limited to, unit number or apartment number.")
  @JsonProperty(JSON_PROPERTY_EXTENDED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExtendedAddress() {
    return extendedAddress;
  }


  @JsonProperty(JSON_PROPERTY_EXTENDED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtendedAddress(String extendedAddress) {
    this.extendedAddress = extendedAddress;
  }


  public ValidateAddressRequest locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * The locality of the address. For US addresses, this corresponds to the city of the address.
   * @return locality
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Chicago", value = "The locality of the address. For US addresses, this corresponds to the city of the address.")
  @JsonProperty(JSON_PROPERTY_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocality() {
    return locality;
  }


  @JsonProperty(JSON_PROPERTY_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocality(String locality) {
    this.locality = locality;
  }


  public ValidateAddressRequest administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * The locality of the address. For US addresses, this corresponds to the state of the address.
   * @return administrativeArea
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "IL", value = "The locality of the address. For US addresses, this corresponds to the state of the address.")
  @JsonProperty(JSON_PROPERTY_ADMINISTRATIVE_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdministrativeArea() {
    return administrativeArea;
  }


  @JsonProperty(JSON_PROPERTY_ADMINISTRATIVE_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }


  public ValidateAddressRequest postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code of the address.
   * @return postalCode
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "60654", required = true, value = "The postal code of the address.")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public ValidateAddressRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The two-character (ISO 3166-1 alpha-2) country code of the address.
   * @return countryCode
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "US", required = true, value = "The two-character (ISO 3166-1 alpha-2) country code of the address.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  /**
   * Return true if this ValidateAddressRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateAddressRequest validateAddressRequest = (ValidateAddressRequest) o;
    return Objects.equals(this.streetAddress, validateAddressRequest.streetAddress) &&
        Objects.equals(this.extendedAddress, validateAddressRequest.extendedAddress) &&
        Objects.equals(this.locality, validateAddressRequest.locality) &&
        Objects.equals(this.administrativeArea, validateAddressRequest.administrativeArea) &&
        Objects.equals(this.postalCode, validateAddressRequest.postalCode) &&
        Objects.equals(this.countryCode, validateAddressRequest.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetAddress, extendedAddress, locality, administrativeArea, postalCode, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateAddressRequest {\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    extendedAddress: ").append(toIndentedString(extendedAddress)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

