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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PostbackWebhook
 */
@JsonPropertyOrder({
  PostbackWebhook.JSON_PROPERTY_PAYLOAD,
  PostbackWebhook.JSON_PROPERTY_METADATA
})

public class PostbackWebhook {
  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private String payload;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();


  public PostbackWebhook payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * The payload associated with the postback.
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payload associated with the postback.")
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  public PostbackWebhook metadata(Object metadata) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostbackWebhook postbackWebhook = (PostbackWebhook) o;
    return Objects.equals(this.payload, postbackWebhook.payload) &&
        Objects.equals(this.metadata, postbackWebhook.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostbackWebhook {\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

