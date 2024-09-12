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
 * CreatePortingOrder
 */
@JsonPropertyOrder({
  CreatePortingOrder.JSON_PROPERTY_PHONE_NUMBERS,
  CreatePortingOrder.JSON_PROPERTY_CUSTOMER_REFERENCE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CreatePortingOrder {
  public static final String JSON_PROPERTY_PHONE_NUMBERS = "phone_numbers";
  private List<String> phoneNumbers = new ArrayList<>();

  public static final String JSON_PROPERTY_CUSTOMER_REFERENCE = "customer_reference";
  private String customerReference;

  public CreatePortingOrder() { 
  }

  public CreatePortingOrder phoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public CreatePortingOrder addPhoneNumbersItem(String phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * The list of +E.164 formatted phone numbers
   * @return phoneNumbers
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"+13035550000\",\"+13035550001\",\"+13035550002\"]", required = true, value = "The list of +E.164 formatted phone numbers")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getPhoneNumbers() {
    return phoneNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public CreatePortingOrder customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * A customer-specified reference number for customer bookkeeping purposes
   * @return customerReference
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Acct 123abc", value = "A customer-specified reference number for customer bookkeeping purposes")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerReference() {
    return customerReference;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * Return true if this CreatePortingOrder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePortingOrder createPortingOrder = (CreatePortingOrder) o;
    return Objects.equals(this.phoneNumbers, createPortingOrder.phoneNumbers) &&
        Objects.equals(this.customerReference, createPortingOrder.customerReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumbers, customerReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePortingOrder {\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
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

