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
import java.util.UUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * DocServiceDocumentLink
 */
@JsonPropertyOrder({
  DocServiceDocumentLink.JSON_PROPERTY_ID,
  DocServiceDocumentLink.JSON_PROPERTY_RECORD_TYPE,
  DocServiceDocumentLink.JSON_PROPERTY_CREATED_AT,
  DocServiceDocumentLink.JSON_PROPERTY_UPDATED_AT,
  DocServiceDocumentLink.JSON_PROPERTY_DOCUMENT_ID,
  DocServiceDocumentLink.JSON_PROPERTY_LINKED_RECORD_TYPE,
  DocServiceDocumentLink.JSON_PROPERTY_LINKED_RESOURCE_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DocServiceDocumentLink {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_DOCUMENT_ID = "document_id";
  private UUID documentId;

  public static final String JSON_PROPERTY_LINKED_RECORD_TYPE = "linked_record_type";
  private String linkedRecordType;

  public static final String JSON_PROPERTY_LINKED_RESOURCE_ID = "linked_resource_id";
  private String linkedResourceId;

  public DocServiceDocumentLink() { 
  }

  @JsonCreator
  public DocServiceDocumentLink(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt, 
    @JsonProperty(JSON_PROPERTY_DOCUMENT_ID) UUID documentId, 
    @JsonProperty(JSON_PROPERTY_LINKED_RECORD_TYPE) String linkedRecordType, 
    @JsonProperty(JSON_PROPERTY_LINKED_RESOURCE_ID) String linkedResourceId
  ) {
    this();
    this.id = id;
    this.recordType = recordType;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.documentId = documentId;
    this.linkedRecordType = linkedRecordType;
    this.linkedResourceId = linkedResourceId;
  }

   /**
   * Identifies the resource.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "Identifies the resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "document_link", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * ISO 8601 formatted date-time indicating when the resource was created.
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date-time indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }




   /**
   * ISO 8601 formatted date-time indicating when the resource was updated.
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date-time indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }




   /**
   * Identifies the associated document.
   * @return documentId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "Identifies the associated document.")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getDocumentId() {
    return documentId;
  }




   /**
   * The linked resource&#39;s record type.
   * @return linkedRecordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "porting_order", value = "The linked resource's record type.")
  @JsonProperty(JSON_PROPERTY_LINKED_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkedRecordType() {
    return linkedRecordType;
  }




   /**
   * Identifies the linked resource.
   * @return linkedResourceId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "132091b4-442b-4a2a-b87f-61e707e46d54", value = "Identifies the linked resource.")
  @JsonProperty(JSON_PROPERTY_LINKED_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkedResourceId() {
    return linkedResourceId;
  }




  /**
   * Return true if this DocServiceDocumentLink object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocServiceDocumentLink docServiceDocumentLink = (DocServiceDocumentLink) o;
    return Objects.equals(this.id, docServiceDocumentLink.id) &&
        Objects.equals(this.recordType, docServiceDocumentLink.recordType) &&
        Objects.equals(this.createdAt, docServiceDocumentLink.createdAt) &&
        Objects.equals(this.updatedAt, docServiceDocumentLink.updatedAt) &&
        Objects.equals(this.documentId, docServiceDocumentLink.documentId) &&
        Objects.equals(this.linkedRecordType, docServiceDocumentLink.linkedRecordType) &&
        Objects.equals(this.linkedResourceId, docServiceDocumentLink.linkedResourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, createdAt, updatedAt, documentId, linkedRecordType, linkedResourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocServiceDocumentLink {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    linkedRecordType: ").append(toIndentedString(linkedRecordType)).append("\n");
    sb.append("    linkedResourceId: ").append(toIndentedString(linkedResourceId)).append("\n");
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

