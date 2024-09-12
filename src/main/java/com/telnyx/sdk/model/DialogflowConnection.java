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
 * DialogflowConnection
 */
@JsonPropertyOrder({
  DialogflowConnection.JSON_PROPERTY_RECORD_TYPE,
  DialogflowConnection.JSON_PROPERTY_CONNECTION_ID,
  DialogflowConnection.JSON_PROPERTY_CONVERSATION_PROFILE_ID,
  DialogflowConnection.JSON_PROPERTY_ENVIRONMENT,
  DialogflowConnection.JSON_PROPERTY_SERVICE_ACCOUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DialogflowConnection {
  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CONVERSATION_PROFILE_ID = "conversation_profile_id";
  private String conversationProfileId;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private String environment;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT = "service_account";
  private String serviceAccount;

  public DialogflowConnection() { 
  }

  public DialogflowConnection recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "dialogflow_connections", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  public DialogflowConnection connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Uniquely identifies a Telnyx application (Call Control).
   * @return connectionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1234541231", value = "Uniquely identifies a Telnyx application (Call Control).")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public DialogflowConnection conversationProfileId(String conversationProfileId) {
    this.conversationProfileId = conversationProfileId;
    return this;
  }

   /**
   * The id of a configured conversation profile on your Dialogflow account. (If you use Dialogflow CX, this param is required)
   * @return conversationProfileId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "a-VMHLWzTmKjiJw5S6O0-w", value = "The id of a configured conversation profile on your Dialogflow account. (If you use Dialogflow CX, this param is required)")
  @JsonProperty(JSON_PROPERTY_CONVERSATION_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversationProfileId() {
    return conversationProfileId;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSATION_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversationProfileId(String conversationProfileId) {
    this.conversationProfileId = conversationProfileId;
  }


  public DialogflowConnection environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Which Dialogflow environment will be used.
   * @return environment
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "development", value = "Which Dialogflow environment will be used.")
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnvironment() {
    return environment;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public DialogflowConnection serviceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

   /**
   * The JSON map to connect your Dialoglow account.
   * @return serviceAccount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "****", value = "The JSON map to connect your Dialoglow account.")
  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceAccount() {
    return serviceAccount;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
  }


  /**
   * Return true if this Dialogflow_Connection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialogflowConnection dialogflowConnection = (DialogflowConnection) o;
    return Objects.equals(this.recordType, dialogflowConnection.recordType) &&
        Objects.equals(this.connectionId, dialogflowConnection.connectionId) &&
        Objects.equals(this.conversationProfileId, dialogflowConnection.conversationProfileId) &&
        Objects.equals(this.environment, dialogflowConnection.environment) &&
        Objects.equals(this.serviceAccount, dialogflowConnection.serviceAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, connectionId, conversationProfileId, environment, serviceAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialogflowConnection {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    conversationProfileId: ").append(toIndentedString(conversationProfileId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
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

