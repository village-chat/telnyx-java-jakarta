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
 * UsecaseMetadata
 */
@JsonPropertyOrder({
  UsecaseMetadata.JSON_PROPERTY_ANNUAL_FEE,
  UsecaseMetadata.JSON_PROPERTY_MAX_SUB_USECASES,
  UsecaseMetadata.JSON_PROPERTY_MIN_SUB_USECASES,
  UsecaseMetadata.JSON_PROPERTY_MNO_METADATA,
  UsecaseMetadata.JSON_PROPERTY_MONTHLY_FEE,
  UsecaseMetadata.JSON_PROPERTY_QUARTERLY_FEE,
  UsecaseMetadata.JSON_PROPERTY_USECASE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class UsecaseMetadata {
  public static final String JSON_PROPERTY_ANNUAL_FEE = "annualFee";
  private BigDecimal annualFee;

  public static final String JSON_PROPERTY_MAX_SUB_USECASES = "maxSubUsecases";
  private Integer maxSubUsecases;

  public static final String JSON_PROPERTY_MIN_SUB_USECASES = "minSubUsecases";
  private Integer minSubUsecases;

  public static final String JSON_PROPERTY_MNO_METADATA = "mnoMetadata";
  private Object mnoMetadata;

  public static final String JSON_PROPERTY_MONTHLY_FEE = "monthlyFee";
  private BigDecimal monthlyFee;

  public static final String JSON_PROPERTY_QUARTERLY_FEE = "quarterlyFee";
  private BigDecimal quarterlyFee;

  public static final String JSON_PROPERTY_USECASE = "usecase";
  private String usecase;

  public UsecaseMetadata() { 
  }

  public UsecaseMetadata annualFee(BigDecimal annualFee) {
    this.annualFee = annualFee;
    return this;
  }

   /**
   * Campaign annual subscription fee
   * @return annualFee
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Campaign annual subscription fee")
  @JsonProperty(JSON_PROPERTY_ANNUAL_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAnnualFee() {
    return annualFee;
  }


  @JsonProperty(JSON_PROPERTY_ANNUAL_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnualFee(BigDecimal annualFee) {
    this.annualFee = annualFee;
  }


  public UsecaseMetadata maxSubUsecases(Integer maxSubUsecases) {
    this.maxSubUsecases = maxSubUsecases;
    return this;
  }

   /**
   * Maximum number of sub-usecases declaration required.
   * @return maxSubUsecases
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of sub-usecases declaration required.")
  @JsonProperty(JSON_PROPERTY_MAX_SUB_USECASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxSubUsecases() {
    return maxSubUsecases;
  }


  @JsonProperty(JSON_PROPERTY_MAX_SUB_USECASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxSubUsecases(Integer maxSubUsecases) {
    this.maxSubUsecases = maxSubUsecases;
  }


  public UsecaseMetadata minSubUsecases(Integer minSubUsecases) {
    this.minSubUsecases = minSubUsecases;
    return this;
  }

   /**
   * Minimum number of sub-usecases declaration required.
   * @return minSubUsecases
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Minimum number of sub-usecases declaration required.")
  @JsonProperty(JSON_PROPERTY_MIN_SUB_USECASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinSubUsecases() {
    return minSubUsecases;
  }


  @JsonProperty(JSON_PROPERTY_MIN_SUB_USECASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinSubUsecases(Integer minSubUsecases) {
    this.minSubUsecases = minSubUsecases;
  }


  public UsecaseMetadata mnoMetadata(Object mnoMetadata) {
    this.mnoMetadata = mnoMetadata;
    return this;
  }

   /**
   * Map of usecase metadata for each MNO. Key is the network ID of the MNO (e.g. 10017), Value is the mno metadata for the usecase.
   * @return mnoMetadata
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Map of usecase metadata for each MNO. Key is the network ID of the MNO (e.g. 10017), Value is the mno metadata for the usecase.")
  @JsonProperty(JSON_PROPERTY_MNO_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMnoMetadata() {
    return mnoMetadata;
  }


  @JsonProperty(JSON_PROPERTY_MNO_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMnoMetadata(Object mnoMetadata) {
    this.mnoMetadata = mnoMetadata;
  }


  public UsecaseMetadata monthlyFee(BigDecimal monthlyFee) {
    this.monthlyFee = monthlyFee;
    return this;
  }

   /**
   * Campaign monthly subscription fee
   * @return monthlyFee
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Campaign monthly subscription fee")
  @JsonProperty(JSON_PROPERTY_MONTHLY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMonthlyFee() {
    return monthlyFee;
  }


  @JsonProperty(JSON_PROPERTY_MONTHLY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonthlyFee(BigDecimal monthlyFee) {
    this.monthlyFee = monthlyFee;
  }


  public UsecaseMetadata quarterlyFee(BigDecimal quarterlyFee) {
    this.quarterlyFee = quarterlyFee;
    return this;
  }

   /**
   * Campaign quarterly subscription fee
   * @return quarterlyFee
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Campaign quarterly subscription fee")
  @JsonProperty(JSON_PROPERTY_QUARTERLY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getQuarterlyFee() {
    return quarterlyFee;
  }


  @JsonProperty(JSON_PROPERTY_QUARTERLY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuarterlyFee(BigDecimal quarterlyFee) {
    this.quarterlyFee = quarterlyFee;
  }


  public UsecaseMetadata usecase(String usecase) {
    this.usecase = usecase;
    return this;
  }

   /**
   * Campaign usecase
   * @return usecase
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Campaign usecase")
  @JsonProperty(JSON_PROPERTY_USECASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsecase() {
    return usecase;
  }


  @JsonProperty(JSON_PROPERTY_USECASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsecase(String usecase) {
    this.usecase = usecase;
  }


  /**
   * Return true if this UsecaseMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsecaseMetadata usecaseMetadata = (UsecaseMetadata) o;
    return Objects.equals(this.annualFee, usecaseMetadata.annualFee) &&
        Objects.equals(this.maxSubUsecases, usecaseMetadata.maxSubUsecases) &&
        Objects.equals(this.minSubUsecases, usecaseMetadata.minSubUsecases) &&
        Objects.equals(this.mnoMetadata, usecaseMetadata.mnoMetadata) &&
        Objects.equals(this.monthlyFee, usecaseMetadata.monthlyFee) &&
        Objects.equals(this.quarterlyFee, usecaseMetadata.quarterlyFee) &&
        Objects.equals(this.usecase, usecaseMetadata.usecase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualFee, maxSubUsecases, minSubUsecases, mnoMetadata, monthlyFee, quarterlyFee, usecase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsecaseMetadata {\n");
    sb.append("    annualFee: ").append(toIndentedString(annualFee)).append("\n");
    sb.append("    maxSubUsecases: ").append(toIndentedString(maxSubUsecases)).append("\n");
    sb.append("    minSubUsecases: ").append(toIndentedString(minSubUsecases)).append("\n");
    sb.append("    mnoMetadata: ").append(toIndentedString(mnoMetadata)).append("\n");
    sb.append("    monthlyFee: ").append(toIndentedString(monthlyFee)).append("\n");
    sb.append("    quarterlyFee: ").append(toIndentedString(quarterlyFee)).append("\n");
    sb.append("    usecase: ").append(toIndentedString(usecase)).append("\n");
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

