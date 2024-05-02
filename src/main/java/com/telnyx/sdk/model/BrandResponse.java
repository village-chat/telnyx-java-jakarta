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
import com.telnyx.sdk.model.AltBusinessIdType;
import com.telnyx.sdk.model.BrandRelationship;
import com.telnyx.sdk.model.EntityType;
import com.telnyx.sdk.model.StockExchange;
import com.telnyx.sdk.model.Vertical;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * BrandResponse
 */
@JsonPropertyOrder({
  BrandResponse.JSON_PROPERTY_ENTITY_TYPE,
  BrandResponse.JSON_PROPERTY_CSP_ID,
  BrandResponse.JSON_PROPERTY_BRAND_ID,
  BrandResponse.JSON_PROPERTY_DISPLAY_NAME,
  BrandResponse.JSON_PROPERTY_COMPANY_NAME,
  BrandResponse.JSON_PROPERTY_EIN,
  BrandResponse.JSON_PROPERTY_PHONE,
  BrandResponse.JSON_PROPERTY_STREET,
  BrandResponse.JSON_PROPERTY_CITY,
  BrandResponse.JSON_PROPERTY_STATE,
  BrandResponse.JSON_PROPERTY_POSTAL_CODE,
  BrandResponse.JSON_PROPERTY_COUNTRY,
  BrandResponse.JSON_PROPERTY_EMAIL,
  BrandResponse.JSON_PROPERTY_STOCK_SYMBOL,
  BrandResponse.JSON_PROPERTY_STOCK_EXCHANGE,
  BrandResponse.JSON_PROPERTY_IP_ADDRESS,
  BrandResponse.JSON_PROPERTY_WEBSITE,
  BrandResponse.JSON_PROPERTY_BRAND_RELATIONSHIP,
  BrandResponse.JSON_PROPERTY_VERTICAL,
  BrandResponse.JSON_PROPERTY_ALT_BUSINESS_ID,
  BrandResponse.JSON_PROPERTY_ALT_BUSINESS_ID_TYPE,
  BrandResponse.JSON_PROPERTY_UNIVERSAL_EIN,
  BrandResponse.JSON_PROPERTY_IDENTITY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class BrandResponse {
  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private EntityType entityType;

  public static final String JSON_PROPERTY_CSP_ID = "cspId";
  private String cspId;

  public static final String JSON_PROPERTY_BRAND_ID = "brandId";
  private String brandId;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;

  public static final String JSON_PROPERTY_EIN = "ein";
  private String ein;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_STREET = "street";
  private String street;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_STOCK_SYMBOL = "stockSymbol";
  private String stockSymbol;

  public static final String JSON_PROPERTY_STOCK_EXCHANGE = "stockExchange";
  private StockExchange stockExchange;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_WEBSITE = "website";
  private String website;

  public static final String JSON_PROPERTY_BRAND_RELATIONSHIP = "brandRelationship";
  private BrandRelationship brandRelationship;

  public static final String JSON_PROPERTY_VERTICAL = "vertical";
  private Vertical vertical;

  public static final String JSON_PROPERTY_ALT_BUSINESS_ID = "altBusinessId";
  private String altBusinessId;

  public static final String JSON_PROPERTY_ALT_BUSINESS_ID_TYPE = "altBusinessIdType";
  private AltBusinessIdType altBusinessIdType;

  public static final String JSON_PROPERTY_UNIVERSAL_EIN = "universalEin";
  private String universalEin;

  public static final String JSON_PROPERTY_IDENTITY_STATUS = "identityStatus";
  private String identityStatus;

  public BrandResponse() { 
  }

  public BrandResponse entityType(EntityType entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EntityType getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }


  public BrandResponse cspId(String cspId) {
    this.cspId = cspId;
    return this;
  }

   /**
   * Unique identifier assigned to the csp by the registry.
   * @return cspId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier assigned to the csp by the registry.")
  @JsonProperty(JSON_PROPERTY_CSP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCspId() {
    return cspId;
  }


  @JsonProperty(JSON_PROPERTY_CSP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCspId(String cspId) {
    this.cspId = cspId;
  }


  public BrandResponse brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * Unique identifier assigned to the brand.
   * @return brandId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "4b206179-f731-8ab7-f19c-34e19d22ide9", value = "Unique identifier assigned to the brand.")
  @JsonProperty(JSON_PROPERTY_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandId() {
    return brandId;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  public BrandResponse displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display or marketing name of the brand.
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Example Company", required = true, value = "Display or marketing name of the brand.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public BrandResponse companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * (Required for Non-profit/private/public) Legal company name.
   * @return companyName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Example Company Inc.", value = "(Required for Non-profit/private/public) Legal company name.")
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public BrandResponse ein(String ein) {
    this.ein = ein;
    return this;
  }

   /**
   * (Required for Non-profit/private/public) Government assigned corporate tax ID. EIN is 9-digits in U.S. The only entity type which does not require an EIN is a Sole Proprietor.
   * @return ein
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "142536893", value = "(Required for Non-profit/private/public) Government assigned corporate tax ID. EIN is 9-digits in U.S. The only entity type which does not require an EIN is a Sole Proprietor.")
  @JsonProperty(JSON_PROPERTY_EIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEin() {
    return ein;
  }


  @JsonProperty(JSON_PROPERTY_EIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEin(String ein) {
    this.ein = ein;
  }


  public BrandResponse phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Valid phone number in e.164 international format.
   * @return phone
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "+13259390512", value = "Valid phone number in e.164 international format.")
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(String phone) {
    this.phone = phone;
  }


  public BrandResponse street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Street number and name.
   * @return street
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "123 Example St.", value = "Street number and name.")
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet() {
    return street;
  }


  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet(String street) {
    this.street = street;
  }


  public BrandResponse city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City name
   * @return city
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Chicago", value = "City name")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public BrandResponse state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State. Must be 2 letters code for United States.
   * @return state
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "IL", value = "State. Must be 2 letters code for United States.")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public BrandResponse postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal codes. Use 5 digit zipcode for United States
   * @return postalCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "60654", value = "Postal codes. Use 5 digit zipcode for United States")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public BrandResponse country(String country) {
    this.country = country;
    return this;
  }

   /**
   * ISO2 2 characters country code. Example: US - United States
   * @return country
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "US", required = true, value = "ISO2 2 characters country code. Example: US - United States")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountry(String country) {
    this.country = country;
  }


  public BrandResponse email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Valid email address of brand support contact.
   * @return email
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "examplename@examplecompany.com", required = true, value = "Valid email address of brand support contact.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public BrandResponse stockSymbol(String stockSymbol) {
    this.stockSymbol = stockSymbol;
    return this;
  }

   /**
   * (Required for public company) stock symbol.
   * @return stockSymbol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ABC", value = "(Required for public company) stock symbol.")
  @JsonProperty(JSON_PROPERTY_STOCK_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStockSymbol() {
    return stockSymbol;
  }


  @JsonProperty(JSON_PROPERTY_STOCK_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStockSymbol(String stockSymbol) {
    this.stockSymbol = stockSymbol;
  }


  public BrandResponse stockExchange(StockExchange stockExchange) {
    this.stockExchange = stockExchange;
    return this;
  }

   /**
   * Get stockExchange
   * @return stockExchange
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STOCK_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockExchange getStockExchange() {
    return stockExchange;
  }


  @JsonProperty(JSON_PROPERTY_STOCK_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStockExchange(StockExchange stockExchange) {
    this.stockExchange = stockExchange;
  }


  public BrandResponse ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the browser requesting to create brand identity.
   * @return ipAddress
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "IP address of the browser requesting to create brand identity.")
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public BrandResponse website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Brand website URL.
   * @return website
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "www.examplecompany.com", value = "Brand website URL.")
  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebsite() {
    return website;
  }


  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebsite(String website) {
    this.website = website;
  }


  public BrandResponse brandRelationship(BrandRelationship brandRelationship) {
    this.brandRelationship = brandRelationship;
    return this;
  }

   /**
   * Get brandRelationship
   * @return brandRelationship
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAND_RELATIONSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BrandRelationship getBrandRelationship() {
    return brandRelationship;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_RELATIONSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandRelationship(BrandRelationship brandRelationship) {
    this.brandRelationship = brandRelationship;
  }


  public BrandResponse vertical(Vertical vertical) {
    this.vertical = vertical;
    return this;
  }

   /**
   * Get vertical
   * @return vertical
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VERTICAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Vertical getVertical() {
    return vertical;
  }


  @JsonProperty(JSON_PROPERTY_VERTICAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVertical(Vertical vertical) {
    this.vertical = vertical;
  }


  public BrandResponse altBusinessId(String altBusinessId) {
    this.altBusinessId = altBusinessId;
    return this;
  }

   /**
   * Alternate business identifier such as DUNS, LEI, or GIIN
   * @return altBusinessId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Alternate business identifier such as DUNS, LEI, or GIIN")
  @JsonProperty(JSON_PROPERTY_ALT_BUSINESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAltBusinessId() {
    return altBusinessId;
  }


  @JsonProperty(JSON_PROPERTY_ALT_BUSINESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAltBusinessId(String altBusinessId) {
    this.altBusinessId = altBusinessId;
  }


  public BrandResponse altBusinessIdType(AltBusinessIdType altBusinessIdType) {
    this.altBusinessIdType = altBusinessIdType;
    return this;
  }

   /**
   * Get altBusinessIdType
   * @return altBusinessIdType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALT_BUSINESS_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AltBusinessIdType getAltBusinessIdType() {
    return altBusinessIdType;
  }


  @JsonProperty(JSON_PROPERTY_ALT_BUSINESS_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAltBusinessIdType(AltBusinessIdType altBusinessIdType) {
    this.altBusinessIdType = altBusinessIdType;
  }


  public BrandResponse universalEin(String universalEin) {
    this.universalEin = universalEin;
    return this;
  }

   /**
   * Universal EIN of Brand, Read Only.
   * @return universalEin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Universal EIN of Brand, Read Only.")
  @JsonProperty(JSON_PROPERTY_UNIVERSAL_EIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniversalEin() {
    return universalEin;
  }


  @JsonProperty(JSON_PROPERTY_UNIVERSAL_EIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniversalEin(String universalEin) {
    this.universalEin = universalEin;
  }


  public BrandResponse identityStatus(String identityStatus) {
    this.identityStatus = identityStatus;
    return this;
  }

   /**
   * TCR assessment of the brand identification status.
   * @return identityStatus
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "VERIFIED", value = "TCR assessment of the brand identification status.")
  @JsonProperty(JSON_PROPERTY_IDENTITY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentityStatus() {
    return identityStatus;
  }


  @JsonProperty(JSON_PROPERTY_IDENTITY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentityStatus(String identityStatus) {
    this.identityStatus = identityStatus;
  }


  /**
   * Return true if this BrandResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandResponse brandResponse = (BrandResponse) o;
    return Objects.equals(this.entityType, brandResponse.entityType) &&
        Objects.equals(this.cspId, brandResponse.cspId) &&
        Objects.equals(this.brandId, brandResponse.brandId) &&
        Objects.equals(this.displayName, brandResponse.displayName) &&
        Objects.equals(this.companyName, brandResponse.companyName) &&
        Objects.equals(this.ein, brandResponse.ein) &&
        Objects.equals(this.phone, brandResponse.phone) &&
        Objects.equals(this.street, brandResponse.street) &&
        Objects.equals(this.city, brandResponse.city) &&
        Objects.equals(this.state, brandResponse.state) &&
        Objects.equals(this.postalCode, brandResponse.postalCode) &&
        Objects.equals(this.country, brandResponse.country) &&
        Objects.equals(this.email, brandResponse.email) &&
        Objects.equals(this.stockSymbol, brandResponse.stockSymbol) &&
        Objects.equals(this.stockExchange, brandResponse.stockExchange) &&
        Objects.equals(this.ipAddress, brandResponse.ipAddress) &&
        Objects.equals(this.website, brandResponse.website) &&
        Objects.equals(this.brandRelationship, brandResponse.brandRelationship) &&
        Objects.equals(this.vertical, brandResponse.vertical) &&
        Objects.equals(this.altBusinessId, brandResponse.altBusinessId) &&
        Objects.equals(this.altBusinessIdType, brandResponse.altBusinessIdType) &&
        Objects.equals(this.universalEin, brandResponse.universalEin) &&
        Objects.equals(this.identityStatus, brandResponse.identityStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, cspId, brandId, displayName, companyName, ein, phone, street, city, state, postalCode, country, email, stockSymbol, stockExchange, ipAddress, website, brandRelationship, vertical, altBusinessId, altBusinessIdType, universalEin, identityStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandResponse {\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    cspId: ").append(toIndentedString(cspId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    stockSymbol: ").append(toIndentedString(stockSymbol)).append("\n");
    sb.append("    stockExchange: ").append(toIndentedString(stockExchange)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    brandRelationship: ").append(toIndentedString(brandRelationship)).append("\n");
    sb.append("    vertical: ").append(toIndentedString(vertical)).append("\n");
    sb.append("    altBusinessId: ").append(toIndentedString(altBusinessId)).append("\n");
    sb.append("    altBusinessIdType: ").append(toIndentedString(altBusinessIdType)).append("\n");
    sb.append("    universalEin: ").append(toIndentedString(universalEin)).append("\n");
    sb.append("    identityStatus: ").append(toIndentedString(identityStatus)).append("\n");
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

