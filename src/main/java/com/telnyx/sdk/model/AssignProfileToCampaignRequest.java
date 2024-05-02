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
 * AssignProfileToCampaignRequest
 */
@JsonPropertyOrder({
  AssignProfileToCampaignRequest.JSON_PROPERTY_MESSAGING_PROFILE_ID,
  AssignProfileToCampaignRequest.JSON_PROPERTY_TCR_CAMPAIGN_ID,
  AssignProfileToCampaignRequest.JSON_PROPERTY_CAMPAIGN_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class AssignProfileToCampaignRequest {
  public static final String JSON_PROPERTY_MESSAGING_PROFILE_ID = "messagingProfileId";
  private String messagingProfileId;

  public static final String JSON_PROPERTY_TCR_CAMPAIGN_ID = "tcrCampaignId";
  private String tcrCampaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private String campaignId;

  public AssignProfileToCampaignRequest() { 
  }

  public AssignProfileToCampaignRequest messagingProfileId(String messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
    return this;
  }

   /**
   * The ID of the messaging profile that you want to link to the specified campaign.
   * @return messagingProfileId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "4001767e-ce0f-4cae-9d5f-0d5e636e7809", required = true, value = "The ID of the messaging profile that you want to link to the specified campaign.")
  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessagingProfileId() {
    return messagingProfileId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessagingProfileId(String messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
  }


  public AssignProfileToCampaignRequest tcrCampaignId(String tcrCampaignId) {
    this.tcrCampaignId = tcrCampaignId;
    return this;
  }

   /**
   * The TCR ID of the shared campaign you want to link to the specified messaging profile (for campaigns not created using Telnyx 10DLC services only). If you supply this ID in the request, do not also include a campaignId.
   * @return tcrCampaignId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "CWZTFH1", value = "The TCR ID of the shared campaign you want to link to the specified messaging profile (for campaigns not created using Telnyx 10DLC services only). If you supply this ID in the request, do not also include a campaignId.")
  @JsonProperty(JSON_PROPERTY_TCR_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTcrCampaignId() {
    return tcrCampaignId;
  }


  @JsonProperty(JSON_PROPERTY_TCR_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTcrCampaignId(String tcrCampaignId) {
    this.tcrCampaignId = tcrCampaignId;
  }


  public AssignProfileToCampaignRequest campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The ID of the campaign you want to link to the specified messaging profile. If you supply this ID in the request, do not also include a tcrCampaignId.
   * @return campaignId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "4b300178-131c-d902-d54e-72d90ba1620j", value = "The ID of the campaign you want to link to the specified messaging profile. If you supply this ID in the request, do not also include a tcrCampaignId.")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  /**
   * Return true if this AssignProfileToCampaignRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignProfileToCampaignRequest assignProfileToCampaignRequest = (AssignProfileToCampaignRequest) o;
    return Objects.equals(this.messagingProfileId, assignProfileToCampaignRequest.messagingProfileId) &&
        Objects.equals(this.tcrCampaignId, assignProfileToCampaignRequest.tcrCampaignId) &&
        Objects.equals(this.campaignId, assignProfileToCampaignRequest.campaignId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messagingProfileId, tcrCampaignId, campaignId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignProfileToCampaignRequest {\n");
    sb.append("    messagingProfileId: ").append(toIndentedString(messagingProfileId)).append("\n");
    sb.append("    tcrCampaignId: ").append(toIndentedString(tcrCampaignId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
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

