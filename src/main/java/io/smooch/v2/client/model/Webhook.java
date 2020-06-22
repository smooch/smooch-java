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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Webhook
 */
@JsonPropertyOrder({
  Webhook.JSON_PROPERTY_VERSION,
  Webhook.JSON_PROPERTY_TARGET,
  Webhook.JSON_PROPERTY_TRIGGERS,
  Webhook.JSON_PROPERTY_SECRET,
  Webhook.JSON_PROPERTY_INCLUDE_FULL_USER,
  Webhook.JSON_PROPERTY_INCLUDE_FULL_SOURCE
})

public class Webhook {
  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TRIGGERS = "triggers";
  private List<String> triggers = new ArrayList<String>();

  public static final String JSON_PROPERTY_SECRET = "secret";
  private String secret;

  public static final String JSON_PROPERTY_INCLUDE_FULL_USER = "includeFullUser";
  private Boolean includeFullUser = false;

  public static final String JSON_PROPERTY_INCLUDE_FULL_SOURCE = "includeFullSource";
  private Boolean includeFullSource = false;


   /**
   * Schema version of the payload delivered to this webhook. Can be v1, v1.1 or v2.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Schema version of the payload delivered to this webhook. Can be v1, v1.1 or v2.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }




  public Webhook target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * URL to be called when the webhook is triggered.
   * @return target
  **/
  @ApiModelProperty(required = true, value = "URL to be called when the webhook is triggered.")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public Webhook triggers(List<String> triggers) {
    
    this.triggers = triggers;
    return this;
  }

  public Webhook addTriggersItem(String triggersItem) {
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * An array of triggers the integration is subscribed to. Current supported triggers in v2 are conversation:message, conversation:read, conversation:typing, and user:merge
   * @return triggers
  **/
  @ApiModelProperty(required = true, value = "An array of triggers the integration is subscribed to. Current supported triggers in v2 are conversation:message, conversation:read, conversation:typing, and user:merge")
  @JsonProperty(JSON_PROPERTY_TRIGGERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getTriggers() {
    return triggers;
  }


  public void setTriggers(List<String> triggers) {
    this.triggers = triggers;
  }


  public Webhook secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Webhook secret, used to verify the origin of incoming requests.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Webhook secret, used to verify the origin of incoming requests.")
  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public Webhook includeFullUser(Boolean includeFullUser) {
    
    this.includeFullUser = includeFullUser;
    return this;
  }

   /**
   * A boolean specifying whether webhook payloads should include the complete user schema for events involving a specific user
   * @return includeFullUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether webhook payloads should include the complete user schema for events involving a specific user")
  @JsonProperty(JSON_PROPERTY_INCLUDE_FULL_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeFullUser() {
    return includeFullUser;
  }


  public void setIncludeFullUser(Boolean includeFullUser) {
    this.includeFullUser = includeFullUser;
  }


  public Webhook includeFullSource(Boolean includeFullSource) {
    
    this.includeFullSource = includeFullSource;
    return this;
  }

   /**
   * A boolean specifying whether webhook payloads should include the client and device object (when applicable).
   * @return includeFullSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether webhook payloads should include the client and device object (when applicable).")
  @JsonProperty(JSON_PROPERTY_INCLUDE_FULL_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeFullSource() {
    return includeFullSource;
  }


  public void setIncludeFullSource(Boolean includeFullSource) {
    this.includeFullSource = includeFullSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.version, webhook.version) &&
        Objects.equals(this.target, webhook.target) &&
        Objects.equals(this.triggers, webhook.triggers) &&
        Objects.equals(this.secret, webhook.secret) &&
        Objects.equals(this.includeFullUser, webhook.includeFullUser) &&
        Objects.equals(this.includeFullSource, webhook.includeFullSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, target, triggers, secret, includeFullUser, includeFullSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    includeFullUser: ").append(toIndentedString(includeFullUser)).append("\n");
    sb.append("    includeFullSource: ").append(toIndentedString(includeFullSource)).append("\n");
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

