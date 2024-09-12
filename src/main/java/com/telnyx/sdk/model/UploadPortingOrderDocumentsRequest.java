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
import com.telnyx.sdk.model.UploadPortingOrderDocumentsRequestDocumentsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * UploadPortingOrderDocumentsRequest
 */
@JsonPropertyOrder({
  UploadPortingOrderDocumentsRequest.JSON_PROPERTY_DOCUMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UploadPortingOrderDocumentsRequest {
  public static final String JSON_PROPERTY_DOCUMENTS = "documents";
  private List<UploadPortingOrderDocumentsRequestDocumentsInner> documents = new ArrayList<>();

  public UploadPortingOrderDocumentsRequest() { 
  }

  public UploadPortingOrderDocumentsRequest documents(List<UploadPortingOrderDocumentsRequestDocumentsInner> documents) {
    this.documents = documents;
    return this;
  }

  public UploadPortingOrderDocumentsRequest addDocumentsItem(UploadPortingOrderDocumentsRequestDocumentsInner documentsItem) {
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * A list of documents to be associated with a porting order.
   * @return documents
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of documents to be associated with a porting order.")
  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<UploadPortingOrderDocumentsRequestDocumentsInner> getDocuments() {
    return documents;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocuments(List<UploadPortingOrderDocumentsRequestDocumentsInner> documents) {
    this.documents = documents;
  }


  /**
   * Return true if this uploadPortingOrderDocuments_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadPortingOrderDocumentsRequest uploadPortingOrderDocumentsRequest = (UploadPortingOrderDocumentsRequest) o;
    return Objects.equals(this.documents, uploadPortingOrderDocumentsRequest.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadPortingOrderDocumentsRequest {\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

