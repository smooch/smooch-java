/*
 * Sunshine Conversations API
 * #  <aside class=\"notice\">As a stepping stone to new and greater things, we’ve released an update to the SunCo API, which is v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/\">here</a>.  </aside>  # Introduction  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## API pagination and records limits  Some APIs can be paginated by providing the offset query string parameter. The offset is the number of initial records to skip before picking records to return. Default 0. The limit query string can also be provided to change the number of records to return (maximum 100, default 25)    Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  ## Regions  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |    For more information on regions, visit [the guide](/guide/regions/).    <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside> 
 *
 * The version of the OpenAPI document: 6.0.0-alpha
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
 * To configure a Mailgun integration, visit the API Keys tab in the settings page of the Mailgun dashboard and copy your active API key. Call the Create Integration endpoint with your API Key, a domain you have configured in Mailgun, and the incoming address you would like to use. Must have the same domain as the one specified in the domain parameter. 
 */
@ApiModel(description = "To configure a Mailgun integration, visit the API Keys tab in the settings page of the Mailgun dashboard and copy your active API key. Call the Create Integration endpoint with your API Key, a domain you have configured in Mailgun, and the incoming address you would like to use. Must have the same domain as the one specified in the domain parameter. ")
@JsonPropertyOrder({
  MailgunAllOf.JSON_PROPERTY_API_KEY,
  MailgunAllOf.JSON_PROPERTY_DOMAIN,
  MailgunAllOf.JSON_PROPERTY_INCOMING_ADDRESS,
  MailgunAllOf.JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK,
  MailgunAllOf.JSON_PROPERTY_FROM_ADDRESS
})

public class MailgunAllOf {
  public static final String JSON_PROPERTY_API_KEY = "apiKey";
  private String apiKey;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_INCOMING_ADDRESS = "incomingAddress";
  private String incomingAddress;

  public static final String JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK = "hideUnsubscribeLink";
  private Boolean hideUnsubscribeLink;

  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  private JsonNullable<String> fromAddress = JsonNullable.<String>undefined();


  public MailgunAllOf apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The public API key of your Mailgun account.
   * @return apiKey
  **/
  @ApiModelProperty(required = true, value = "The public API key of your Mailgun account.")
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public MailgunAllOf domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * The domain used to relay email. This domain must be configured and verified in your Mailgun account.
   * @return domain
  **/
  @ApiModelProperty(required = true, value = "The domain used to relay email. This domain must be configured and verified in your Mailgun account.")
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public MailgunAllOf incomingAddress(String incomingAddress) {
    
    this.incomingAddress = incomingAddress;
    return this;
  }

   /**
   * Sunshine Conversations will receive all emails sent to this address. It will also be used as the Reply-To address.
   * @return incomingAddress
  **/
  @ApiModelProperty(required = true, value = "Sunshine Conversations will receive all emails sent to this address. It will also be used as the Reply-To address.")
  @JsonProperty(JSON_PROPERTY_INCOMING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIncomingAddress() {
    return incomingAddress;
  }


  public void setIncomingAddress(String incomingAddress) {
    this.incomingAddress = incomingAddress;
  }


  public MailgunAllOf hideUnsubscribeLink(Boolean hideUnsubscribeLink) {
    
    this.hideUnsubscribeLink = hideUnsubscribeLink;
    return this;
  }

   /**
   * A boolean value indicating whether the unsubscribe link should be omitted from outgoing emails. When enabled, it is expected that the business is providing the user a way to unsubscribe by some other means. By default, the unsubscribe link will be included in all outgoing emails.
   * @return hideUnsubscribeLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean value indicating whether the unsubscribe link should be omitted from outgoing emails. When enabled, it is expected that the business is providing the user a way to unsubscribe by some other means. By default, the unsubscribe link will be included in all outgoing emails.")
  @JsonProperty(JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideUnsubscribeLink() {
    return hideUnsubscribeLink;
  }


  public void setHideUnsubscribeLink(Boolean hideUnsubscribeLink) {
    this.hideUnsubscribeLink = hideUnsubscribeLink;
  }


  public MailgunAllOf fromAddress(String fromAddress) {
    this.fromAddress = JsonNullable.<String>of(fromAddress);
    
    return this;
  }

   /**
   * Email address to use as the From and Reply-To address if it must be different from incomingAddress. Only use this option if the address that you supply is configured to forward emails to the incomingAddress, otherwise user replies will be lost. You must also make sure that the domain is properly configured as a mail provider so as to not be flagged as spam by the user’s email client. May be unset with null.
   * @return fromAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email address to use as the From and Reply-To address if it must be different from incomingAddress. Only use this option if the address that you supply is configured to forward emails to the incomingAddress, otherwise user replies will be lost. You must also make sure that the domain is properly configured as a mail provider so as to not be flagged as spam by the user’s email client. May be unset with null.")
  @JsonIgnore

  public String getFromAddress() {
        return fromAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFromAddress_JsonNullable() {
    return fromAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  public void setFromAddress_JsonNullable(JsonNullable<String> fromAddress) {
    this.fromAddress = fromAddress;
  }

  public void setFromAddress(String fromAddress) {
    this.fromAddress = JsonNullable.<String>of(fromAddress);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailgunAllOf mailgunAllOf = (MailgunAllOf) o;
    return Objects.equals(this.apiKey, mailgunAllOf.apiKey) &&
        Objects.equals(this.domain, mailgunAllOf.domain) &&
        Objects.equals(this.incomingAddress, mailgunAllOf.incomingAddress) &&
        Objects.equals(this.hideUnsubscribeLink, mailgunAllOf.hideUnsubscribeLink) &&
        Objects.equals(this.fromAddress, mailgunAllOf.fromAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, domain, incomingAddress, hideUnsubscribeLink, fromAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailgunAllOf {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    incomingAddress: ").append(toIndentedString(incomingAddress)).append("\n");
    sb.append("    hideUnsubscribeLink: ").append(toIndentedString(hideUnsubscribeLink)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
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

