/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.4.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.zendesk.sunshine_conversations_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zendesk.sunshine_conversations_client.model.Field;
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
  @ApiModelProperty(example = "https://domain.com/images/avatar.png", value = "Sets the URL of the avatar to use for the automatic reply to the prechat capture messages.")
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
  @ApiModelProperty(example = "[{\"type\":\"email\",\"name\":\"email\",\"label\":\"Email\",\"placeholder\":\"your@email.com\"},{\"type\":\"text\",\"name\":\"company-website\",\"label\":\"Company website\",\"placeholder\":\"mycompany.com\"}]", value = "Array of Fields. Overrides the default Prechat Capture fields to define a custom form.")
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
