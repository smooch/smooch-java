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
import io.smooch.v2.client.model.Field;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PrechatCapture
 */
@JsonPropertyOrder({
  PrechatCapture.JSON_PROPERTY_AVATAR_URL,
  PrechatCapture.JSON_PROPERTY_ENABLED,
  PrechatCapture.JSON_PROPERTY_ENABLE_EMAIL_LINKING,
  PrechatCapture.JSON_PROPERTY_FIELDS
})

public class PrechatCapture {
  public static final String JSON_PROPERTY_AVATAR_URL = "avatarUrl";
  private String avatarUrl = "undefined";

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled = false;

  public static final String JSON_PROPERTY_ENABLE_EMAIL_LINKING = "enableEmailLinking";
  private Boolean enableEmailLinking = false;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<Field> fields = null;


  public PrechatCapture avatarUrl(String avatarUrl) {
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Sets the URL of the avatar to use for the automatic reply to the prechat capture messages.
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets the URL of the avatar to use for the automatic reply to the prechat capture messages.")
  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvatarUrl() {
    return avatarUrl;
  }


  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public PrechatCapture enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * If true, enables the Prechat Capture add-on when the Web Messenger is initialized.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, enables the Prechat Capture add-on when the Web Messenger is initialized.")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public PrechatCapture enableEmailLinking(Boolean enableEmailLinking) {
    
    this.enableEmailLinking = enableEmailLinking;
    return this;
  }

   /**
   * f true and Mailgun is integrated, will automatically link submitted emails.
   * @return enableEmailLinking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "f true and Mailgun is integrated, will automatically link submitted emails.")
  @JsonProperty(JSON_PROPERTY_ENABLE_EMAIL_LINKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableEmailLinking() {
    return enableEmailLinking;
  }


  public void setEnableEmailLinking(Boolean enableEmailLinking) {
    this.enableEmailLinking = enableEmailLinking;
  }


  public PrechatCapture fields(List<Field> fields) {
    
    this.fields = fields;
    return this;
  }

  public PrechatCapture addFieldsItem(Field fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<Field>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Array of Fields. Overrides the default Prechat Capture fields to define a custom form.
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of Fields. Overrides the default Prechat Capture fields to define a custom form.")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Field> getFields() {
    return fields;
  }


  public void setFields(List<Field> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrechatCapture prechatCapture = (PrechatCapture) o;
    return Objects.equals(this.avatarUrl, prechatCapture.avatarUrl) &&
        Objects.equals(this.enabled, prechatCapture.enabled) &&
        Objects.equals(this.enableEmailLinking, prechatCapture.enableEmailLinking) &&
        Objects.equals(this.fields, prechatCapture.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, enabled, enableEmailLinking, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrechatCapture {\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    enableEmailLinking: ").append(toIndentedString(enableEmailLinking)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

