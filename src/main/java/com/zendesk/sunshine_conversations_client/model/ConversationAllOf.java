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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ConversationAllOf
 */
@JsonPropertyOrder({
  ConversationAllOf.JSON_PROPERTY_IS_DEFAULT,
  ConversationAllOf.JSON_PROPERTY_DISPLAY_NAME,
  ConversationAllOf.JSON_PROPERTY_DESCRIPTION,
  ConversationAllOf.JSON_PROPERTY_ICON_URL,
  ConversationAllOf.JSON_PROPERTY_METADATA,
  ConversationAllOf.JSON_PROPERTY_BUSINESS_LAST_READ,
  ConversationAllOf.JSON_PROPERTY_LAST_UPDATED_AT
})

public class ConversationAllOf {
  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ICON_URL = "iconUrl";
  private JsonNullable<URI> iconUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_BUSINESS_LAST_READ = "businessLastRead";
  private JsonNullable<String> businessLastRead = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_UPDATED_AT = "lastUpdatedAt";
  private JsonNullable<String> lastUpdatedAt = JsonNullable.<String>undefined();


  public ConversationAllOf isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Whether the conversation is the default conversation for the user. Will be true for the first personal conversation created for the user, and false in all other cases. 
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the conversation is the default conversation for the user. Will be true for the first personal conversation created for the user, and false in all other cases. ")
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public ConversationAllOf displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A friendly name for the conversation, may be displayed to the business or the user. 
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My conversation", value = "A friendly name for the conversation, may be displayed to the business or the user. ")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ConversationAllOf description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * A short text describing the conversation.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Conversation between Rogers and Carl.", value = "A short text describing the conversation.")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public ConversationAllOf iconUrl(URI iconUrl) {
    this.iconUrl = JsonNullable.<URI>of(iconUrl);
    
    return this;
  }

   /**
   * A custom conversation icon url. The image must be in either JPG, PNG, or GIF format
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.gravatar.com/image.jpg", value = "A custom conversation icon url. The image must be in either JPG, PNG, or GIF format")
  @JsonIgnore

  public URI getIconUrl() {
        return iconUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getIconUrl_JsonNullable() {
    return iconUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_ICON_URL)
  public void setIconUrl_JsonNullable(JsonNullable<URI> iconUrl) {
    this.iconUrl = iconUrl;
  }

  public void setIconUrl(URI iconUrl) {
    this.iconUrl = JsonNullable.<URI>of(iconUrl);
  }


  public ConversationAllOf metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"lang\":\"en-ca\"}", value = "Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. ")
  @JsonIgnore

  public Object getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }


  public ConversationAllOf businessLastRead(String businessLastRead) {
    this.businessLastRead = JsonNullable.<String>of(businessLastRead);
    
    return this;
  }

   /**
   * A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the moment the conversation was last marked as read with role business. 
   * @return businessLastRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-23T14:33:47.492Z", value = "A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the moment the conversation was last marked as read with role business. ")
  @JsonIgnore

  public String getBusinessLastRead() {
        return businessLastRead.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUSINESS_LAST_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBusinessLastRead_JsonNullable() {
    return businessLastRead;
  }
  
  @JsonProperty(JSON_PROPERTY_BUSINESS_LAST_READ)
  public void setBusinessLastRead_JsonNullable(JsonNullable<String> businessLastRead) {
    this.businessLastRead = businessLastRead;
  }

  public void setBusinessLastRead(String businessLastRead) {
    this.businessLastRead = JsonNullable.<String>of(businessLastRead);
  }


  public ConversationAllOf lastUpdatedAt(String lastUpdatedAt) {
    this.lastUpdatedAt = JsonNullable.<String>of(lastUpdatedAt);
    
    return this;
  }

   /**
   * A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the moment the last message was received in the conversation, or the creation time if no messages have been received yet. 
   * @return lastUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-26T14:33:47.120Z", value = "A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the moment the last message was received in the conversation, or the creation time if no messages have been received yet. ")
  @JsonIgnore

  public String getLastUpdatedAt() {
        return lastUpdatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastUpdatedAt_JsonNullable() {
    return lastUpdatedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  public void setLastUpdatedAt_JsonNullable(JsonNullable<String> lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public void setLastUpdatedAt(String lastUpdatedAt) {
    this.lastUpdatedAt = JsonNullable.<String>of(lastUpdatedAt);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationAllOf conversationAllOf = (ConversationAllOf) o;
    return Objects.equals(this.isDefault, conversationAllOf.isDefault) &&
        Objects.equals(this.displayName, conversationAllOf.displayName) &&
        Objects.equals(this.description, conversationAllOf.description) &&
        Objects.equals(this.iconUrl, conversationAllOf.iconUrl) &&
        Objects.equals(this.metadata, conversationAllOf.metadata) &&
        Objects.equals(this.businessLastRead, conversationAllOf.businessLastRead) &&
        Objects.equals(this.lastUpdatedAt, conversationAllOf.lastUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, displayName, description, iconUrl, metadata, businessLastRead, lastUpdatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationAllOf {\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    businessLastRead: ").append(toIndentedString(businessLastRead)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
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
