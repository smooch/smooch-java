/*
 * Sunshine Conversations API
 * #  <aside class=\"notice\">As a stepping stone to new and greater things, we’ve released an update to the SunCo API, which is v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/\">here</a>.  </aside>  # Introduction  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## API pagination and records limits  Some APIs can be paginated by providing the `offset` query string parameter.  The `offset` is the number of initial records to skip before picking records to return (default 0).  The `limit` query string can also be provided to change the number of records to return (maximum 100, default 25).  All paginated endpoints will eventually support cursor pagination and `offset` based pagination support will be dropped.  ### Cursor Pagination  Some APIs are paginated through cursor pagination. Rather than providing an `offset`, a `page[after]` or `page[before]` query string parameter may be provided. `page[after]` and `page[before]` are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In cursor pagination, the equivalent to the `limit` query string is the `page[size]` query string parameter.  ## Regions  Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |    For more information on regions, visit [the guide](/guide/regions/).    <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside> 
 *
 * The version of the OpenAPI document: 6.0.0-alpha.5
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
 * WhatsAppUpdateAllOf
 */
@JsonPropertyOrder({
  WhatsAppUpdateAllOf.JSON_PROPERTY_HSM_FALLBACK_LANGUAGE,
  WhatsAppUpdateAllOf.JSON_PROPERTY_ACCOUNT_ID,
  WhatsAppUpdateAllOf.JSON_PROPERTY_ACCOUNT_MANAGEMENT_ACCESS_TOKEN
})

public class WhatsAppUpdateAllOf {
  public static final String JSON_PROPERTY_HSM_FALLBACK_LANGUAGE = "hsmFallbackLanguage";
  private JsonNullable<String> hsmFallbackLanguage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private JsonNullable<String> accountId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACCOUNT_MANAGEMENT_ACCESS_TOKEN = "accountManagementAccessToken";
  private JsonNullable<String> accountManagementAccessToken = JsonNullable.<String>undefined();


  public WhatsAppUpdateAllOf hsmFallbackLanguage(String hsmFallbackLanguage) {
    this.hsmFallbackLanguage = JsonNullable.<String>of(hsmFallbackLanguage);
    
    return this;
  }

   /**
   * Specify a fallback language to use when sending WhatsApp message template using the short hand syntax. Defaults to en_US. See WhatsApp documentation for more info.
   * @return hsmFallbackLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify a fallback language to use when sending WhatsApp message template using the short hand syntax. Defaults to en_US. See WhatsApp documentation for more info.")
  @JsonIgnore

  public String getHsmFallbackLanguage() {
        return hsmFallbackLanguage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HSM_FALLBACK_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHsmFallbackLanguage_JsonNullable() {
    return hsmFallbackLanguage;
  }
  
  @JsonProperty(JSON_PROPERTY_HSM_FALLBACK_LANGUAGE)
  public void setHsmFallbackLanguage_JsonNullable(JsonNullable<String> hsmFallbackLanguage) {
    this.hsmFallbackLanguage = hsmFallbackLanguage;
  }

  public void setHsmFallbackLanguage(String hsmFallbackLanguage) {
    this.hsmFallbackLanguage = JsonNullable.<String>of(hsmFallbackLanguage);
  }


  public WhatsAppUpdateAllOf accountId(String accountId) {
    this.accountId = JsonNullable.<String>of(accountId);
    
    return this;
  }

   /**
   * The business ID associated with the WhatsApp account. In combination with accountManagementAccessToken, it’s used for Message Template Reconstruction.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The business ID associated with the WhatsApp account. In combination with accountManagementAccessToken, it’s used for Message Template Reconstruction.")
  @JsonIgnore

  public String getAccountId() {
        return accountId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAccountId_JsonNullable() {
    return accountId;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  public void setAccountId_JsonNullable(JsonNullable<String> accountId) {
    this.accountId = accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = JsonNullable.<String>of(accountId);
  }


  public WhatsAppUpdateAllOf accountManagementAccessToken(String accountManagementAccessToken) {
    this.accountManagementAccessToken = JsonNullable.<String>of(accountManagementAccessToken);
    
    return this;
  }

   /**
   * An access token associated with the accountId used to query the WhatsApp Account Management API. In combination with accountId, it’s used for Message Template Reconstruction.
   * @return accountManagementAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An access token associated with the accountId used to query the WhatsApp Account Management API. In combination with accountId, it’s used for Message Template Reconstruction.")
  @JsonIgnore

  public String getAccountManagementAccessToken() {
        return accountManagementAccessToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_MANAGEMENT_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAccountManagementAccessToken_JsonNullable() {
    return accountManagementAccessToken;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCOUNT_MANAGEMENT_ACCESS_TOKEN)
  public void setAccountManagementAccessToken_JsonNullable(JsonNullable<String> accountManagementAccessToken) {
    this.accountManagementAccessToken = accountManagementAccessToken;
  }

  public void setAccountManagementAccessToken(String accountManagementAccessToken) {
    this.accountManagementAccessToken = JsonNullable.<String>of(accountManagementAccessToken);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppUpdateAllOf whatsAppUpdateAllOf = (WhatsAppUpdateAllOf) o;
    return Objects.equals(this.hsmFallbackLanguage, whatsAppUpdateAllOf.hsmFallbackLanguage) &&
        Objects.equals(this.accountId, whatsAppUpdateAllOf.accountId) &&
        Objects.equals(this.accountManagementAccessToken, whatsAppUpdateAllOf.accountManagementAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hsmFallbackLanguage, accountId, accountManagementAccessToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppUpdateAllOf {\n");
    sb.append("    hsmFallbackLanguage: ").append(toIndentedString(hsmFallbackLanguage)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountManagementAccessToken: ").append(toIndentedString(accountManagementAccessToken)).append("\n");
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

