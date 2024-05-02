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
import com.telnyx.sdk.model.InterfaceStatus;
import com.telnyx.sdk.model.RegionOutRegion;
import java.util.Arrays;
import java.util.UUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PublicInternetGatewayRead
 */
@JsonPropertyOrder({
  PublicInternetGatewayRead.JSON_PROPERTY_ID,
  PublicInternetGatewayRead.JSON_PROPERTY_RECORD_TYPE,
  PublicInternetGatewayRead.JSON_PROPERTY_CREATED_AT,
  PublicInternetGatewayRead.JSON_PROPERTY_UPDATED_AT,
  PublicInternetGatewayRead.JSON_PROPERTY_NETWORK_ID,
  PublicInternetGatewayRead.JSON_PROPERTY_NAME,
  PublicInternetGatewayRead.JSON_PROPERTY_STATUS,
  PublicInternetGatewayRead.JSON_PROPERTY_PUBLIC_IP,
  PublicInternetGatewayRead.JSON_PROPERTY_REGION_CODE,
  PublicInternetGatewayRead.JSON_PROPERTY_REGION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PublicInternetGatewayRead {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_NETWORK_ID = "network_id";
  private UUID networkId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private InterfaceStatus status;

  public static final String JSON_PROPERTY_PUBLIC_IP = "public_ip";
  private String publicIp;

  public static final String JSON_PROPERTY_REGION_CODE = "region_code";
  private String regionCode;

  public static final String JSON_PROPERTY_REGION = "region";
  private RegionOutRegion region;

  public PublicInternetGatewayRead() { 
  }

  @JsonCreator
  public PublicInternetGatewayRead(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_IP) String publicIp
  ) {
    this();
    this.id = id;
    this.recordType = recordType;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.publicIp = publicIp;
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
  @ApiModelProperty(example = "public_internet_gateway", value = "Identifies the type of the resource.")
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




  public PublicInternetGatewayRead networkId(UUID networkId) {
    this.networkId = networkId;
    return this;
  }

   /**
   * The id of the network associated with the interface.
   * @return networkId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "The id of the network associated with the interface.")
  @JsonProperty(JSON_PROPERTY_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getNetworkId() {
    return networkId;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkId(UUID networkId) {
    this.networkId = networkId;
  }


  public PublicInternetGatewayRead name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A user specified name for the interface.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "test interface", value = "A user specified name for the interface.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public PublicInternetGatewayRead status(InterfaceStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterfaceStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(InterfaceStatus status) {
    this.status = status;
  }


   /**
   * The publically accessible ip for this interface.
   * @return publicIp
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "127.0.0.1", value = "The publically accessible ip for this interface.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicIp() {
    return publicIp;
  }




  public PublicInternetGatewayRead regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

   /**
   * The region interface is deployed to.
   * @return regionCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ashburn-va", value = "The region interface is deployed to.")
  @JsonProperty(JSON_PROPERTY_REGION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegionCode() {
    return regionCode;
  }


  @JsonProperty(JSON_PROPERTY_REGION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  public PublicInternetGatewayRead region(RegionOutRegion region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RegionOutRegion getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(RegionOutRegion region) {
    this.region = region;
  }


  /**
   * Return true if this PublicInternetGatewayRead object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicInternetGatewayRead publicInternetGatewayRead = (PublicInternetGatewayRead) o;
    return Objects.equals(this.id, publicInternetGatewayRead.id) &&
        Objects.equals(this.recordType, publicInternetGatewayRead.recordType) &&
        Objects.equals(this.createdAt, publicInternetGatewayRead.createdAt) &&
        Objects.equals(this.updatedAt, publicInternetGatewayRead.updatedAt) &&
        Objects.equals(this.networkId, publicInternetGatewayRead.networkId) &&
        Objects.equals(this.name, publicInternetGatewayRead.name) &&
        Objects.equals(this.status, publicInternetGatewayRead.status) &&
        Objects.equals(this.publicIp, publicInternetGatewayRead.publicIp) &&
        Objects.equals(this.regionCode, publicInternetGatewayRead.regionCode) &&
        Objects.equals(this.region, publicInternetGatewayRead.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, createdAt, updatedAt, networkId, name, status, publicIp, regionCode, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicInternetGatewayRead {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

