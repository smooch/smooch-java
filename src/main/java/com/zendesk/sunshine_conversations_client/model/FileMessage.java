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
import java.math.BigDecimal;
import java.net.URI;
import com.zendesk.sunshine_conversations_client.model.Content;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * FileMessage
 */
@JsonPropertyOrder({
  FileMessage.JSON_PROPERTY_TYPE,
  FileMessage.JSON_PROPERTY_MEDIA_URL,
  FileMessage.JSON_PROPERTY_MEDIA_SIZE,
  FileMessage.JSON_PROPERTY_MEDIA_TYPE,
  FileMessage.JSON_PROPERTY_ALT_TEXT,
  FileMessage.JSON_PROPERTY_TEXT
})

public class FileMessage implements Content {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "file";

  public static final String JSON_PROPERTY_MEDIA_URL = "mediaUrl";
  private URI mediaUrl;

  public static final String JSON_PROPERTY_MEDIA_SIZE = "mediaSize";
  private BigDecimal mediaSize;

  public static final String JSON_PROPERTY_MEDIA_TYPE = "mediaType";
  private String mediaType;

  public static final String JSON_PROPERTY_ALT_TEXT = "altText";
  private String altText;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;


  public FileMessage type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of message.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of message.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public FileMessage mediaUrl(URI mediaUrl) {
    
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The URL for media, such as an image, attached to the message.
   * @return mediaUrl
  **/
  @ApiModelProperty(required = true, value = "The URL for media, such as an image, attached to the message.")
  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getMediaUrl() {
    return mediaUrl;
  }


  public void setMediaUrl(URI mediaUrl) {
    this.mediaUrl = mediaUrl;
  }


   /**
   * The size of the media.
   * @return mediaSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the media.")
  @JsonProperty(JSON_PROPERTY_MEDIA_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMediaSize() {
    return mediaSize;
  }




   /**
   * The media type of the file.
   * @return mediaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The media type of the file.")
  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaType() {
    return mediaType;
  }




  public FileMessage altText(String altText) {
    
    this.altText = altText;
    return this;
  }

   /**
   * An optional description of the file for accessibility purposes. The field will be saved by default with the file name as the value.
   * @return altText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional description of the file for accessibility purposes. The field will be saved by default with the file name as the value.")
  @JsonProperty(JSON_PROPERTY_ALT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAltText() {
    return altText;
  }


  public void setAltText(String altText) {
    this.altText = altText;
  }


  public FileMessage text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The text content of the message.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The text content of the message.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMessage fileMessage = (FileMessage) o;
    return Objects.equals(this.type, fileMessage.type) &&
        Objects.equals(this.mediaUrl, fileMessage.mediaUrl) &&
        Objects.equals(this.mediaSize, fileMessage.mediaSize) &&
        Objects.equals(this.mediaType, fileMessage.mediaType) &&
        Objects.equals(this.altText, fileMessage.altText) &&
        Objects.equals(this.text, fileMessage.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, mediaUrl, mediaSize, mediaType, altText, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileMessage {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    mediaSize: ").append(toIndentedString(mediaSize)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

