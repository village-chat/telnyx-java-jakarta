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
 * The SIM card individual data limit configuration.
 */
@ApiModel(description = "The SIM card individual data limit configuration.")
@JsonPropertyOrder({
  SimpleSIMCardDataLimit.JSON_PROPERTY_AMOUNT,
  SimpleSIMCardDataLimit.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class SimpleSIMCardDataLimit {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private BigDecimal amount;

  /**
   * Gets or Sets unit
   */
  public enum UnitEnum {
    MB("MB"),
    
    GB("GB");

    private String value;

    UnitEnum(String value) {
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
    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_UNIT = "unit";
  private UnitEnum unit;

  public SimpleSIMCardDataLimit() { 
  }

  public SimpleSIMCardDataLimit amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2048.0", value = "")
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


  public SimpleSIMCardDataLimit unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "MB", value = "")
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UnitEnum getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }


  /**
   * Return true if this SimpleSIMCard_data_limit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleSIMCardDataLimit simpleSIMCardDataLimit = (SimpleSIMCardDataLimit) o;
    return Objects.equals(this.amount, simpleSIMCardDataLimit.amount) &&
        Objects.equals(this.unit, simpleSIMCardDataLimit.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleSIMCardDataLimit {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

