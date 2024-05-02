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
import com.telnyx.sdk.model.BrandFeedbackCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * BrandFeedback
 */
@JsonPropertyOrder({
  BrandFeedback.JSON_PROPERTY_BRAND_ID,
  BrandFeedback.JSON_PROPERTY_CATEGORY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class BrandFeedback {
  public static final String JSON_PROPERTY_BRAND_ID = "brandId";
  private String brandId;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private List<BrandFeedbackCategory> category = new ArrayList<>();

  public BrandFeedback() { 
  }

  public BrandFeedback brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * ID of the brand being queried about
   * @return brandId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "d88dd2aa-1bb9-4ef0-9ec8-1752b80316a5", required = true, value = "ID of the brand being queried about")
  @JsonProperty(JSON_PROPERTY_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBrandId() {
    return brandId;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  public BrandFeedback category(List<BrandFeedbackCategory> category) {
    this.category = category;
    return this;
  }

  public BrandFeedback addCategoryItem(BrandFeedbackCategory categoryItem) {
    this.category.add(categoryItem);
    return this;
  }

   /**
   * A list of reasons why brand creation/revetting didn&#39;t go as planned
   * @return category
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of reasons why brand creation/revetting didn't go as planned")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<BrandFeedbackCategory> getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCategory(List<BrandFeedbackCategory> category) {
    this.category = category;
  }


  /**
   * Return true if this BrandFeedback object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandFeedback brandFeedback = (BrandFeedback) o;
    return Objects.equals(this.brandId, brandFeedback.brandId) &&
        Objects.equals(this.category, brandFeedback.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandFeedback {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

