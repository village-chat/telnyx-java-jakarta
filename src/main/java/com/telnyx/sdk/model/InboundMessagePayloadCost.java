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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * InboundMessagePayloadCost
 */
@JsonPropertyOrder({
  InboundMessagePayloadCost.JSON_PROPERTY_AMOUNT,
  InboundMessagePayloadCost.JSON_PROPERTY_CURRENCY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class InboundMessagePayloadCost {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private BigDecimal amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public InboundMessagePayloadCost() { 
  }

  public InboundMessagePayloadCost amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount deducted from your account.
   * @return amount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The amount deducted from your account.")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public InboundMessagePayloadCost currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The ISO 4217 currency identifier.
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The ISO 4217 currency identifier.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  /**
   * Return true if this InboundMessagePayload_cost object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundMessagePayloadCost inboundMessagePayloadCost = (InboundMessagePayloadCost) o;
    return Objects.equals(this.amount, inboundMessagePayloadCost.amount) &&
        Objects.equals(this.currency, inboundMessagePayloadCost.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundMessagePayloadCost {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

