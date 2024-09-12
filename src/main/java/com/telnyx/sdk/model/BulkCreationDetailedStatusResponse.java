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
import com.telnyx.sdk.model.CampaignRegistryApiSchemasBulkCreationMeta;
import com.telnyx.sdk.model.DetailedTaskStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * BulkCreationDetailedStatusResponse
 */
@JsonPropertyOrder({
  BulkCreationDetailedStatusResponse.JSON_PROPERTY_META,
  BulkCreationDetailedStatusResponse.JSON_PROPERTY_RECORDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class BulkCreationDetailedStatusResponse {
  public static final String JSON_PROPERTY_META = "meta";
  private CampaignRegistryApiSchemasBulkCreationMeta meta;

  public static final String JSON_PROPERTY_RECORDS = "records";
  private List<DetailedTaskStatus> records = new ArrayList<>();

  public BulkCreationDetailedStatusResponse() { 
  }

  public BulkCreationDetailedStatusResponse meta(CampaignRegistryApiSchemasBulkCreationMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CampaignRegistryApiSchemasBulkCreationMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(CampaignRegistryApiSchemasBulkCreationMeta meta) {
    this.meta = meta;
  }


  public BulkCreationDetailedStatusResponse records(List<DetailedTaskStatus> records) {
    this.records = records;
    return this;
  }

  public BulkCreationDetailedStatusResponse addRecordsItem(DetailedTaskStatus recordsItem) {
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RECORDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<DetailedTaskStatus> getRecords() {
    return records;
  }


  @JsonProperty(JSON_PROPERTY_RECORDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecords(List<DetailedTaskStatus> records) {
    this.records = records;
  }


  /**
   * Return true if this BulkCreationDetailedStatusResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkCreationDetailedStatusResponse bulkCreationDetailedStatusResponse = (BulkCreationDetailedStatusResponse) o;
    return Objects.equals(this.meta, bulkCreationDetailedStatusResponse.meta) &&
        Objects.equals(this.records, bulkCreationDetailedStatusResponse.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCreationDetailedStatusResponse {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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

