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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.model.TFPhoneNumber;
import com.telnyx.sdk.model.Url;
import com.telnyx.sdk.model.UseCaseCategories;
import com.telnyx.sdk.model.Volume;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * The body of a tollfree verification request
 */
@ApiModel(description = "The body of a tollfree verification request")
@JsonPropertyOrder({
  TFVerificationRequest.JSON_PROPERTY_BUSINESS_NAME,
  TFVerificationRequest.JSON_PROPERTY_CORPORATE_WEBSITE,
  TFVerificationRequest.JSON_PROPERTY_BUSINESS_ADDR1,
  TFVerificationRequest.JSON_PROPERTY_BUSINESS_ADDR2,
  TFVerificationRequest.JSON_PROPERTY_BUSINESS_CITY,
  TFVerificationRequest.JSON_PROPERTY_BUSINESS_STATE,
  TFVerificationRequest.JSON_PROPERTY_BUSINESS_ZIP,
  TFVerificationRequest.JSON_PROPERTY_BUSINESS_CONTACT_FIRST_NAME,
  TFVerificationRequest.JSON_PROPERTY_BUSINESS_CONTACT_LAST_NAME,
  TFVerificationRequest.JSON_PROPERTY_BUSINESS_CONTACT_EMAIL,
  TFVerificationRequest.JSON_PROPERTY_BUSINESS_CONTACT_PHONE,
  TFVerificationRequest.JSON_PROPERTY_MESSAGE_VOLUME,
  TFVerificationRequest.JSON_PROPERTY_PHONE_NUMBERS,
  TFVerificationRequest.JSON_PROPERTY_USE_CASE,
  TFVerificationRequest.JSON_PROPERTY_USE_CASE_SUMMARY,
  TFVerificationRequest.JSON_PROPERTY_PRODUCTION_MESSAGE_CONTENT,
  TFVerificationRequest.JSON_PROPERTY_OPT_IN_WORKFLOW,
  TFVerificationRequest.JSON_PROPERTY_OPT_IN_WORKFLOW_IMAGE_U_R_LS,
  TFVerificationRequest.JSON_PROPERTY_ADDITIONAL_INFORMATION,
  TFVerificationRequest.JSON_PROPERTY_ISV_RESELLER,
  TFVerificationRequest.JSON_PROPERTY_WEBHOOK_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TFVerificationRequest {
  public static final String JSON_PROPERTY_BUSINESS_NAME = "businessName";
  private String businessName;

  public static final String JSON_PROPERTY_CORPORATE_WEBSITE = "corporateWebsite";
  private String corporateWebsite;

  public static final String JSON_PROPERTY_BUSINESS_ADDR1 = "businessAddr1";
  private String businessAddr1;

  public static final String JSON_PROPERTY_BUSINESS_ADDR2 = "businessAddr2";
  private String businessAddr2;

  public static final String JSON_PROPERTY_BUSINESS_CITY = "businessCity";
  private String businessCity;

  public static final String JSON_PROPERTY_BUSINESS_STATE = "businessState";
  private String businessState;

  public static final String JSON_PROPERTY_BUSINESS_ZIP = "businessZip";
  private String businessZip;

  public static final String JSON_PROPERTY_BUSINESS_CONTACT_FIRST_NAME = "businessContactFirstName";
  private String businessContactFirstName;

  public static final String JSON_PROPERTY_BUSINESS_CONTACT_LAST_NAME = "businessContactLastName";
  private String businessContactLastName;

  public static final String JSON_PROPERTY_BUSINESS_CONTACT_EMAIL = "businessContactEmail";
  private String businessContactEmail;

  public static final String JSON_PROPERTY_BUSINESS_CONTACT_PHONE = "businessContactPhone";
  private String businessContactPhone;

  public static final String JSON_PROPERTY_MESSAGE_VOLUME = "messageVolume";
  private Volume messageVolume;

  public static final String JSON_PROPERTY_PHONE_NUMBERS = "phoneNumbers";
  private List<TFPhoneNumber> phoneNumbers = new ArrayList<>();

  public static final String JSON_PROPERTY_USE_CASE = "useCase";
  private UseCaseCategories useCase;

  public static final String JSON_PROPERTY_USE_CASE_SUMMARY = "useCaseSummary";
  private String useCaseSummary;

  public static final String JSON_PROPERTY_PRODUCTION_MESSAGE_CONTENT = "productionMessageContent";
  private String productionMessageContent;

  public static final String JSON_PROPERTY_OPT_IN_WORKFLOW = "optInWorkflow";
  private String optInWorkflow;

  public static final String JSON_PROPERTY_OPT_IN_WORKFLOW_IMAGE_U_R_LS = "optInWorkflowImageURLs";
  private List<Url> optInWorkflowImageURLs = new ArrayList<>();

  public static final String JSON_PROPERTY_ADDITIONAL_INFORMATION = "additionalInformation";
  private String additionalInformation;

  public static final String JSON_PROPERTY_ISV_RESELLER = "isvReseller";
  private String isvReseller;

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhookUrl";
  private String webhookUrl;

  public TFVerificationRequest() { 
  }

  public TFVerificationRequest businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Get businessName
   * @return businessName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Telnyx LLC", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBusinessName() {
    return businessName;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public TFVerificationRequest corporateWebsite(String corporateWebsite) {
    this.corporateWebsite = corporateWebsite;
    return this;
  }

   /**
   * Get corporateWebsite
   * @return corporateWebsite
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "http://example.com", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CORPORATE_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCorporateWebsite() {
    return corporateWebsite;
  }


  @JsonProperty(JSON_PROPERTY_CORPORATE_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCorporateWebsite(String corporateWebsite) {
    this.corporateWebsite = corporateWebsite;
  }


  public TFVerificationRequest businessAddr1(String businessAddr1) {
    this.businessAddr1 = businessAddr1;
    return this;
  }

   /**
   * Get businessAddr1
   * @return businessAddr1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "311 W Superior St", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_ADDR1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBusinessAddr1() {
    return businessAddr1;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_ADDR1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBusinessAddr1(String businessAddr1) {
    this.businessAddr1 = businessAddr1;
  }


  public TFVerificationRequest businessAddr2(String businessAddr2) {
    this.businessAddr2 = businessAddr2;
    return this;
  }

   /**
   * Get businessAddr2
   * @return businessAddr2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "121 W Superior St", value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_ADDR2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessAddr2() {
    return businessAddr2;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_ADDR2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessAddr2(String businessAddr2) {
    this.businessAddr2 = businessAddr2;
  }


  public TFVerificationRequest businessCity(String businessCity) {
    this.businessCity = businessCity;
    return this;
  }

   /**
   * Get businessCity
   * @return businessCity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Chicago", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_CITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBusinessCity() {
    return businessCity;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_CITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBusinessCity(String businessCity) {
    this.businessCity = businessCity;
  }


  public TFVerificationRequest businessState(String businessState) {
    this.businessState = businessState;
    return this;
  }

   /**
   * Get businessState
   * @return businessState
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Illinois", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBusinessState() {
    return businessState;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBusinessState(String businessState) {
    this.businessState = businessState;
  }


  public TFVerificationRequest businessZip(String businessZip) {
    this.businessZip = businessZip;
    return this;
  }

   /**
   * Get businessZip
   * @return businessZip
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "60654", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_ZIP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBusinessZip() {
    return businessZip;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_ZIP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBusinessZip(String businessZip) {
    this.businessZip = businessZip;
  }


  public TFVerificationRequest businessContactFirstName(String businessContactFirstName) {
    this.businessContactFirstName = businessContactFirstName;
    return this;
  }

   /**
   * Get businessContactFirstName
   * @return businessContactFirstName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "John", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBusinessContactFirstName() {
    return businessContactFirstName;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBusinessContactFirstName(String businessContactFirstName) {
    this.businessContactFirstName = businessContactFirstName;
  }


  public TFVerificationRequest businessContactLastName(String businessContactLastName) {
    this.businessContactLastName = businessContactLastName;
    return this;
  }

   /**
   * Get businessContactLastName
   * @return businessContactLastName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Doe", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBusinessContactLastName() {
    return businessContactLastName;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBusinessContactLastName(String businessContactLastName) {
    this.businessContactLastName = businessContactLastName;
  }


  public TFVerificationRequest businessContactEmail(String businessContactEmail) {
    this.businessContactEmail = businessContactEmail;
    return this;
  }

   /**
   * Get businessContactEmail
   * @return businessContactEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "email@example.com", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBusinessContactEmail() {
    return businessContactEmail;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBusinessContactEmail(String businessContactEmail) {
    this.businessContactEmail = businessContactEmail;
  }


  public TFVerificationRequest businessContactPhone(String businessContactPhone) {
    this.businessContactPhone = businessContactPhone;
    return this;
  }

   /**
   * Get businessContactPhone
   * @return businessContactPhone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "+18005550100", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_PHONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBusinessContactPhone() {
    return businessContactPhone;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_PHONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBusinessContactPhone(String businessContactPhone) {
    this.businessContactPhone = businessContactPhone;
  }


  public TFVerificationRequest messageVolume(Volume messageVolume) {
    this.messageVolume = messageVolume;
    return this;
  }

   /**
   * Get messageVolume
   * @return messageVolume
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_VOLUME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Volume getMessageVolume() {
    return messageVolume;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_VOLUME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessageVolume(Volume messageVolume) {
    this.messageVolume = messageVolume;
  }


  public TFVerificationRequest phoneNumbers(List<TFPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public TFVerificationRequest addPhoneNumbersItem(TFPhoneNumber phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[{\"phoneNumber\":\"+18773554398\"},{\"phoneNumber\":\"+18773554399\"}]", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TFPhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhoneNumbers(List<TFPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public TFVerificationRequest useCase(UseCaseCategories useCase) {
    this.useCase = useCase;
    return this;
  }

   /**
   * Get useCase
   * @return useCase
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_USE_CASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UseCaseCategories getUseCase() {
    return useCase;
  }


  @JsonProperty(JSON_PROPERTY_USE_CASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUseCase(UseCaseCategories useCase) {
    this.useCase = useCase;
  }


  public TFVerificationRequest useCaseSummary(String useCaseSummary) {
    this.useCaseSummary = useCaseSummary;
    return this;
  }

   /**
   * Get useCaseSummary
   * @return useCaseSummary
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "This is a use case where Telnyx sends out 2FA codes to portal users to verify their identity in order to sign into the portal", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_USE_CASE_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUseCaseSummary() {
    return useCaseSummary;
  }


  @JsonProperty(JSON_PROPERTY_USE_CASE_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUseCaseSummary(String useCaseSummary) {
    this.useCaseSummary = useCaseSummary;
  }


  public TFVerificationRequest productionMessageContent(String productionMessageContent) {
    this.productionMessageContent = productionMessageContent;
    return this;
  }

   /**
   * Get productionMessageContent
   * @return productionMessageContent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Your Telnyx OTP is XXXX", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCTION_MESSAGE_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProductionMessageContent() {
    return productionMessageContent;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCTION_MESSAGE_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductionMessageContent(String productionMessageContent) {
    this.productionMessageContent = productionMessageContent;
  }


  public TFVerificationRequest optInWorkflow(String optInWorkflow) {
    this.optInWorkflow = optInWorkflow;
    return this;
  }

   /**
   * Get optInWorkflow
   * @return optInWorkflow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "User signs into the Telnyx portal, enters a number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OPT_IN_WORKFLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOptInWorkflow() {
    return optInWorkflow;
  }


  @JsonProperty(JSON_PROPERTY_OPT_IN_WORKFLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOptInWorkflow(String optInWorkflow) {
    this.optInWorkflow = optInWorkflow;
  }


  public TFVerificationRequest optInWorkflowImageURLs(List<Url> optInWorkflowImageURLs) {
    this.optInWorkflowImageURLs = optInWorkflowImageURLs;
    return this;
  }

  public TFVerificationRequest addOptInWorkflowImageURLsItem(Url optInWorkflowImageURLsItem) {
    this.optInWorkflowImageURLs.add(optInWorkflowImageURLsItem);
    return this;
  }

   /**
   * Get optInWorkflowImageURLs
   * @return optInWorkflowImageURLs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[{\"url\":\"https://telnyx.com/sign-up\"},{\"url\":\"https://telnyx.com/company/data-privacy\"}]", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OPT_IN_WORKFLOW_IMAGE_U_R_LS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Url> getOptInWorkflowImageURLs() {
    return optInWorkflowImageURLs;
  }


  @JsonProperty(JSON_PROPERTY_OPT_IN_WORKFLOW_IMAGE_U_R_LS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOptInWorkflowImageURLs(List<Url> optInWorkflowImageURLs) {
    this.optInWorkflowImageURLs = optInWorkflowImageURLs;
  }


  public TFVerificationRequest additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "This is for security purposes, blah blah blah", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAdditionalInformation() {
    return additionalInformation;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  public TFVerificationRequest isvReseller(String isvReseller) {
    this.isvReseller = isvReseller;
    return this;
  }

   /**
   * Get isvReseller
   * @return isvReseller
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Yes", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ISV_RESELLER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIsvReseller() {
    return isvReseller;
  }


  @JsonProperty(JSON_PROPERTY_ISV_RESELLER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsvReseller(String isvReseller) {
    this.isvReseller = isvReseller;
  }


  public TFVerificationRequest webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Get webhookUrl
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://example-webhook.com", value = "")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookUrl() {
    return webhookUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  /**
   * Return true if this TFVerificationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TFVerificationRequest tfVerificationRequest = (TFVerificationRequest) o;
    return Objects.equals(this.businessName, tfVerificationRequest.businessName) &&
        Objects.equals(this.corporateWebsite, tfVerificationRequest.corporateWebsite) &&
        Objects.equals(this.businessAddr1, tfVerificationRequest.businessAddr1) &&
        Objects.equals(this.businessAddr2, tfVerificationRequest.businessAddr2) &&
        Objects.equals(this.businessCity, tfVerificationRequest.businessCity) &&
        Objects.equals(this.businessState, tfVerificationRequest.businessState) &&
        Objects.equals(this.businessZip, tfVerificationRequest.businessZip) &&
        Objects.equals(this.businessContactFirstName, tfVerificationRequest.businessContactFirstName) &&
        Objects.equals(this.businessContactLastName, tfVerificationRequest.businessContactLastName) &&
        Objects.equals(this.businessContactEmail, tfVerificationRequest.businessContactEmail) &&
        Objects.equals(this.businessContactPhone, tfVerificationRequest.businessContactPhone) &&
        Objects.equals(this.messageVolume, tfVerificationRequest.messageVolume) &&
        Objects.equals(this.phoneNumbers, tfVerificationRequest.phoneNumbers) &&
        Objects.equals(this.useCase, tfVerificationRequest.useCase) &&
        Objects.equals(this.useCaseSummary, tfVerificationRequest.useCaseSummary) &&
        Objects.equals(this.productionMessageContent, tfVerificationRequest.productionMessageContent) &&
        Objects.equals(this.optInWorkflow, tfVerificationRequest.optInWorkflow) &&
        Objects.equals(this.optInWorkflowImageURLs, tfVerificationRequest.optInWorkflowImageURLs) &&
        Objects.equals(this.additionalInformation, tfVerificationRequest.additionalInformation) &&
        Objects.equals(this.isvReseller, tfVerificationRequest.isvReseller) &&
        Objects.equals(this.webhookUrl, tfVerificationRequest.webhookUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessName, corporateWebsite, businessAddr1, businessAddr2, businessCity, businessState, businessZip, businessContactFirstName, businessContactLastName, businessContactEmail, businessContactPhone, messageVolume, phoneNumbers, useCase, useCaseSummary, productionMessageContent, optInWorkflow, optInWorkflowImageURLs, additionalInformation, isvReseller, webhookUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TFVerificationRequest {\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    corporateWebsite: ").append(toIndentedString(corporateWebsite)).append("\n");
    sb.append("    businessAddr1: ").append(toIndentedString(businessAddr1)).append("\n");
    sb.append("    businessAddr2: ").append(toIndentedString(businessAddr2)).append("\n");
    sb.append("    businessCity: ").append(toIndentedString(businessCity)).append("\n");
    sb.append("    businessState: ").append(toIndentedString(businessState)).append("\n");
    sb.append("    businessZip: ").append(toIndentedString(businessZip)).append("\n");
    sb.append("    businessContactFirstName: ").append(toIndentedString(businessContactFirstName)).append("\n");
    sb.append("    businessContactLastName: ").append(toIndentedString(businessContactLastName)).append("\n");
    sb.append("    businessContactEmail: ").append(toIndentedString(businessContactEmail)).append("\n");
    sb.append("    businessContactPhone: ").append(toIndentedString(businessContactPhone)).append("\n");
    sb.append("    messageVolume: ").append(toIndentedString(messageVolume)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    useCase: ").append(toIndentedString(useCase)).append("\n");
    sb.append("    useCaseSummary: ").append(toIndentedString(useCaseSummary)).append("\n");
    sb.append("    productionMessageContent: ").append(toIndentedString(productionMessageContent)).append("\n");
    sb.append("    optInWorkflow: ").append(toIndentedString(optInWorkflow)).append("\n");
    sb.append("    optInWorkflowImageURLs: ").append(toIndentedString(optInWorkflowImageURLs)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    isvReseller: ").append(toIndentedString(isvReseller)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
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

