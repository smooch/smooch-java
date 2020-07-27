/*
 * Sunshine Conversations API
 * #  <aside class=\"notice\">As a stepping stone to new and greater things, we’ve released an update to the SunCo API, which is v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/\">here</a>.  </aside>  # Introduction  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## API pagination and records limits  Some APIs can be paginated by providing the `offset` query string parameter.  The `offset` is the number of initial records to skip before picking records to return (default 0).  The `limit` query string can also be provided to change the number of records to return (maximum 100, default 25).  All paginated endpoints will eventually support cursor pagination and `offset` based pagination support will be dropped.  ### Cursor Pagination  Some APIs are paginated through cursor pagination. Rather than providing an `offset`, a `page[after]` or `page[before]` query string parameter may be provided. `page[after]` and `page[before]` are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In cursor pagination, the equivalent to the `limit` query string is the `page[size]` query string parameter.  ## Regions  Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |    For more information on regions, visit [the guide](/guide/regions/).    <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside> 
 *
 * The version of the OpenAPI document: 6.0.0-alpha.3
 * Contact: hello@smooch.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.smooch.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * IosAllOf
 */
@JsonPropertyOrder({
  IosAllOf.JSON_PROPERTY_CERTIFICATE,
  IosAllOf.JSON_PROPERTY_PASSWORD,
  IosAllOf.JSON_PROPERTY_PRODUCTION,
  IosAllOf.JSON_PROPERTY_AUTO_UPDATE_BADGE,
  IosAllOf.JSON_PROPERTY_CAN_USER_CREATE_CONVERSATION
})

public class IosAllOf {
  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private JsonNullable<String> certificate = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_PRODUCTION = "production";
  private Boolean production;

  public static final String JSON_PROPERTY_AUTO_UPDATE_BADGE = "autoUpdateBadge";
  private Boolean autoUpdateBadge;

  public static final String JSON_PROPERTY_CAN_USER_CREATE_CONVERSATION = "canUserCreateConversation";
  private Boolean canUserCreateConversation;


  public IosAllOf certificate(String certificate) {
    this.certificate = JsonNullable.<String>of(certificate);
    
    return this;
  }

   /**
   * The binary of your APN certificate base64 encoded.
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The binary of your APN certificate base64 encoded.")
  @JsonIgnore

  public String getCertificate() {
        return certificate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCertificate_JsonNullable() {
    return certificate;
  }
  
  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  public void setCertificate_JsonNullable(JsonNullable<String> certificate) {
    this.certificate = certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = JsonNullable.<String>of(certificate);
  }


  public IosAllOf password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The password for your APN certificate.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password for your APN certificate.")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public IosAllOf production(Boolean production) {
    
    this.production = production;
    return this;
  }

   /**
   * The APN environment to connect to (Production, if true, or Sandbox). Defaults to value inferred from certificate if not specified.
   * @return production
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The APN environment to connect to (Production, if true, or Sandbox). Defaults to value inferred from certificate if not specified.")
  @JsonProperty(JSON_PROPERTY_PRODUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getProduction() {
    return production;
  }


  public void setProduction(Boolean production) {
    this.production = production;
  }


  public IosAllOf autoUpdateBadge(Boolean autoUpdateBadge) {
    
    this.autoUpdateBadge = autoUpdateBadge;
    return this;
  }

   /**
   * Use the unread count of the conversation as the application badge.
   * @return autoUpdateBadge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use the unread count of the conversation as the application badge.")
  @JsonProperty(JSON_PROPERTY_AUTO_UPDATE_BADGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoUpdateBadge() {
    return autoUpdateBadge;
  }


  public void setAutoUpdateBadge(Boolean autoUpdateBadge) {
    this.autoUpdateBadge = autoUpdateBadge;
  }


  public IosAllOf canUserCreateConversation(Boolean canUserCreateConversation) {
    
    this.canUserCreateConversation = canUserCreateConversation;
    return this;
  }

   /**
   * Allows users to create more than one conversation on the iOS integration.
   * @return canUserCreateConversation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows users to create more than one conversation on the iOS integration.")
  @JsonProperty(JSON_PROPERTY_CAN_USER_CREATE_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUserCreateConversation() {
    return canUserCreateConversation;
  }


  public void setCanUserCreateConversation(Boolean canUserCreateConversation) {
    this.canUserCreateConversation = canUserCreateConversation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IosAllOf iosAllOf = (IosAllOf) o;
    return Objects.equals(this.certificate, iosAllOf.certificate) &&
        Objects.equals(this.password, iosAllOf.password) &&
        Objects.equals(this.production, iosAllOf.production) &&
        Objects.equals(this.autoUpdateBadge, iosAllOf.autoUpdateBadge) &&
        Objects.equals(this.canUserCreateConversation, iosAllOf.canUserCreateConversation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, password, production, autoUpdateBadge, canUserCreateConversation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IosAllOf {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    production: ").append(toIndentedString(production)).append("\n");
    sb.append("    autoUpdateBadge: ").append(toIndentedString(autoUpdateBadge)).append("\n");
    sb.append("    canUserCreateConversation: ").append(toIndentedString(canUserCreateConversation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
