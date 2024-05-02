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
 * RegulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria
 */
@JsonPropertyOrder({
  RegulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria.JSON_PROPERTY_LOCALITY_LIMIT,
  RegulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria.JSON_PROPERTY_FIELD_VALUE,
  RegulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria.JSON_PROPERTY_FIELD_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class RegulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria {
  public static final String JSON_PROPERTY_LOCALITY_LIMIT = "locality_limit";
  private String localityLimit;

  public static final String JSON_PROPERTY_FIELD_VALUE = "field_value";
  private String fieldValue;

  public static final String JSON_PROPERTY_FIELD_TYPE = "field_type";
  private String fieldType;

  public RegulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria() { 
  }

  public RegulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria localityLimit(String localityLimit) {
    this.localityLimit = localityLimit;
    return this;
  }

   /**
   * Get localityLimit
   * @return localityLimit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Identical locality as the numbers desired", value = "")
  @JsonProperty(JSON_PROPERTY_LOCALITY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocalityLimit() {
    return localityLimit;
  }


  @JsonProperty(JSON_PROPERTY_LOCALITY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalityLimit(String localityLimit) {
    this.localityLimit = localityLimit;
  }


  public RegulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria fieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

   /**
   * Get fieldValue
   * @return fieldValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "45f45a04-b4be-4592-95b1-9306b9db2b21", value = "")
  @JsonProperty(JSON_PROPERTY_FIELD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldValue() {
    return fieldValue;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }


  public RegulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Get fieldType
   * @return fieldType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "address", value = "")
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldType() {
    return fieldType;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }


  /**
   * Return true if this RegulatoryRequirements_regulatory_requirements_inner_acceptance_criteria object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria regulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria = (RegulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria) o;
    return Objects.equals(this.localityLimit, regulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria.localityLimit) &&
        Objects.equals(this.fieldValue, regulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria.fieldValue) &&
        Objects.equals(this.fieldType, regulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria.fieldType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localityLimit, fieldValue, fieldType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryRequirementsRegulatoryRequirementsInnerAcceptanceCriteria {\n");
    sb.append("    localityLimit: ").append(toIndentedString(localityLimit)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
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

