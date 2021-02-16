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
import com.zendesk.sunshine_conversations_client.model.UserMergeEventAllOfPayloadMergedConversations;
import com.zendesk.sunshine_conversations_client.model.UserMergeEventAllOfPayloadMergedUsers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The payload of the event. The contents of this object depend on the type of event.
 */
@ApiModel(description = "The payload of the event. The contents of this object depend on the type of event.")
@JsonPropertyOrder({
  UserMergeEventAllOfPayload.JSON_PROPERTY_MERGED_USERS,
  UserMergeEventAllOfPayload.JSON_PROPERTY_MERGED_CONVERSATIONS,
  UserMergeEventAllOfPayload.JSON_PROPERTY_DISCARDED_METADATA
})

public class UserMergeEventAllOfPayload {
  public static final String JSON_PROPERTY_MERGED_USERS = "mergedUsers";
  private UserMergeEventAllOfPayloadMergedUsers mergedUsers;

  public static final String JSON_PROPERTY_MERGED_CONVERSATIONS = "mergedConversations";
  private JsonNullable<UserMergeEventAllOfPayloadMergedConversations> mergedConversations = JsonNullable.<UserMergeEventAllOfPayloadMergedConversations>undefined();

  public static final String JSON_PROPERTY_DISCARDED_METADATA = "discardedMetadata";
  private JsonNullable<Object> discardedMetadata = JsonNullable.<Object>of(null);


  public UserMergeEventAllOfPayload mergedUsers(UserMergeEventAllOfPayloadMergedUsers mergedUsers) {
    
    this.mergedUsers = mergedUsers;
    return this;
  }

   /**
   * Get mergedUsers
   * @return mergedUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MERGED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserMergeEventAllOfPayloadMergedUsers getMergedUsers() {
    return mergedUsers;
  }


  public void setMergedUsers(UserMergeEventAllOfPayloadMergedUsers mergedUsers) {
    this.mergedUsers = mergedUsers;
  }


  public UserMergeEventAllOfPayload mergedConversations(UserMergeEventAllOfPayloadMergedConversations mergedConversations) {
    this.mergedConversations = JsonNullable.<UserMergeEventAllOfPayloadMergedConversations>of(mergedConversations);
    
    return this;
  }

   /**
   * Get mergedConversations
   * @return mergedConversations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UserMergeEventAllOfPayloadMergedConversations getMergedConversations() {
        return mergedConversations.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERGED_CONVERSATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UserMergeEventAllOfPayloadMergedConversations> getMergedConversations_JsonNullable() {
    return mergedConversations;
  }
  
  @JsonProperty(JSON_PROPERTY_MERGED_CONVERSATIONS)
  public void setMergedConversations_JsonNullable(JsonNullable<UserMergeEventAllOfPayloadMergedConversations> mergedConversations) {
    this.mergedConversations = mergedConversations;
  }

  public void setMergedConversations(UserMergeEventAllOfPayloadMergedConversations mergedConversations) {
    this.mergedConversations = JsonNullable.<UserMergeEventAllOfPayloadMergedConversations>of(mergedConversations);
  }


  public UserMergeEventAllOfPayload discardedMetadata(Object discardedMetadata) {
    this.discardedMetadata = JsonNullable.<Object>of(discardedMetadata);
    
    return this;
  }

   /**
   * A flat object with the set of metadata properties that were discarded when merging the two users. This should contain values only if the combined metadata fields exceed the 4KB limit.
   * @return discardedMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flat object with the set of metadata properties that were discarded when merging the two users. This should contain values only if the combined metadata fields exceed the 4KB limit.")
  @JsonIgnore

  public Object getDiscardedMetadata() {
        return discardedMetadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISCARDED_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDiscardedMetadata_JsonNullable() {
    return discardedMetadata;
  }
  
  @JsonProperty(JSON_PROPERTY_DISCARDED_METADATA)
  public void setDiscardedMetadata_JsonNullable(JsonNullable<Object> discardedMetadata) {
    this.discardedMetadata = discardedMetadata;
  }

  public void setDiscardedMetadata(Object discardedMetadata) {
    this.discardedMetadata = JsonNullable.<Object>of(discardedMetadata);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMergeEventAllOfPayload userMergeEventAllOfPayload = (UserMergeEventAllOfPayload) o;
    return Objects.equals(this.mergedUsers, userMergeEventAllOfPayload.mergedUsers) &&
        Objects.equals(this.mergedConversations, userMergeEventAllOfPayload.mergedConversations) &&
        Objects.equals(this.discardedMetadata, userMergeEventAllOfPayload.discardedMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mergedUsers, mergedConversations, discardedMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMergeEventAllOfPayload {\n");
    sb.append("    mergedUsers: ").append(toIndentedString(mergedUsers)).append("\n");
    sb.append("    mergedConversations: ").append(toIndentedString(mergedConversations)).append("\n");
    sb.append("    discardedMetadata: ").append(toIndentedString(discardedMetadata)).append("\n");
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

