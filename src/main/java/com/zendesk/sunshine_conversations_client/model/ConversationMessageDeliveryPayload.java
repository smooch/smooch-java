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
import com.zendesk.sunshine_conversations_client.model.ConversationMessageDeliveryPayloadDestination;
import com.zendesk.sunshine_conversations_client.model.ConversationMessageDeliveryPayloadExternalMessages;
import com.zendesk.sunshine_conversations_client.model.ConversationMessageDeliveryPayloadMessage;
import com.zendesk.sunshine_conversations_client.model.ConversationTruncated;
import com.zendesk.sunshine_conversations_client.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The payload of the event. The contents of this object depend on the type of event.
 */
@ApiModel(description = "The payload of the event. The contents of this object depend on the type of event.")
@JsonPropertyOrder({
  ConversationMessageDeliveryPayload.JSON_PROPERTY_USER,
  ConversationMessageDeliveryPayload.JSON_PROPERTY_CONVERSATION,
  ConversationMessageDeliveryPayload.JSON_PROPERTY_MESSAGE,
  ConversationMessageDeliveryPayload.JSON_PROPERTY_DESTINATION,
  ConversationMessageDeliveryPayload.JSON_PROPERTY_EXTERNAL_MESSAGES,
  ConversationMessageDeliveryPayload.JSON_PROPERTY_IS_FINAL_EVENT
})

public class ConversationMessageDeliveryPayload {
  public static final String JSON_PROPERTY_USER = "user";
  private User user = null;

  public static final String JSON_PROPERTY_CONVERSATION = "conversation";
  private ConversationTruncated conversation = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private ConversationMessageDeliveryPayloadMessage message;

  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private ConversationMessageDeliveryPayloadDestination destination;

  public static final String JSON_PROPERTY_EXTERNAL_MESSAGES = "externalMessages";
  private JsonNullable<List<ConversationMessageDeliveryPayloadExternalMessages>> externalMessages = JsonNullable.<List<ConversationMessageDeliveryPayloadExternalMessages>>undefined();

  public static final String JSON_PROPERTY_IS_FINAL_EVENT = "isFinalEvent";
  private Boolean isFinalEvent;


  public ConversationMessageDeliveryPayload user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * The user associated with the conversation.
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user associated with the conversation.")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  public ConversationMessageDeliveryPayload conversation(ConversationTruncated conversation) {
    
    this.conversation = conversation;
    return this;
  }

   /**
   * The conversation in which the message was sent.
   * @return conversation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The conversation in which the message was sent.")
  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationTruncated getConversation() {
    return conversation;
  }


  public void setConversation(ConversationTruncated conversation) {
    this.conversation = conversation;
  }


  public ConversationMessageDeliveryPayload message(ConversationMessageDeliveryPayloadMessage message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationMessageDeliveryPayloadMessage getMessage() {
    return message;
  }


  public void setMessage(ConversationMessageDeliveryPayloadMessage message) {
    this.message = message;
  }


  public ConversationMessageDeliveryPayload destination(ConversationMessageDeliveryPayloadDestination destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationMessageDeliveryPayloadDestination getDestination() {
    return destination;
  }


  public void setDestination(ConversationMessageDeliveryPayloadDestination destination) {
    this.destination = destination;
  }


  public ConversationMessageDeliveryPayload externalMessages(List<ConversationMessageDeliveryPayloadExternalMessages> externalMessages) {
    this.externalMessages = JsonNullable.<List<ConversationMessageDeliveryPayloadExternalMessages>>of(externalMessages);
    
    return this;
  }

  public ConversationMessageDeliveryPayload addExternalMessagesItem(ConversationMessageDeliveryPayloadExternalMessages externalMessagesItem) {
    if (this.externalMessages == null || !this.externalMessages.isPresent()) {
      this.externalMessages = JsonNullable.<List<ConversationMessageDeliveryPayloadExternalMessages>>of(new ArrayList<ConversationMessageDeliveryPayloadExternalMessages>());
    }
    try {
      this.externalMessages.get().add(externalMessagesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * An array of objects representing the third-party messages associated with the event. The order of the external messages is not guaranteed to be the same across the different triggers. Note that some channels don’t expose message IDs, in which case this field will be unset.
   * @return externalMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects representing the third-party messages associated with the event. The order of the external messages is not guaranteed to be the same across the different triggers. Note that some channels don’t expose message IDs, in which case this field will be unset.")
  @JsonIgnore

  public List<ConversationMessageDeliveryPayloadExternalMessages> getExternalMessages() {
        return externalMessages.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<ConversationMessageDeliveryPayloadExternalMessages>> getExternalMessages_JsonNullable() {
    return externalMessages;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERNAL_MESSAGES)
  public void setExternalMessages_JsonNullable(JsonNullable<List<ConversationMessageDeliveryPayloadExternalMessages>> externalMessages) {
    this.externalMessages = externalMessages;
  }

  public void setExternalMessages(List<ConversationMessageDeliveryPayloadExternalMessages> externalMessages) {
    this.externalMessages = JsonNullable.<List<ConversationMessageDeliveryPayloadExternalMessages>>of(externalMessages);
  }


  public ConversationMessageDeliveryPayload isFinalEvent(Boolean isFinalEvent) {
    
    this.isFinalEvent = isFinalEvent;
    return this;
  }

   /**
   * A boolean indicating whether the webhook is the final one for the &#x60;message.id&#x60; and &#x60;destination.type&#x60; pair.
   * @return isFinalEvent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean indicating whether the webhook is the final one for the `message.id` and `destination.type` pair.")
  @JsonProperty(JSON_PROPERTY_IS_FINAL_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsFinalEvent() {
    return isFinalEvent;
  }


  public void setIsFinalEvent(Boolean isFinalEvent) {
    this.isFinalEvent = isFinalEvent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMessageDeliveryPayload conversationMessageDeliveryPayload = (ConversationMessageDeliveryPayload) o;
    return Objects.equals(this.user, conversationMessageDeliveryPayload.user) &&
        Objects.equals(this.conversation, conversationMessageDeliveryPayload.conversation) &&
        Objects.equals(this.message, conversationMessageDeliveryPayload.message) &&
        Objects.equals(this.destination, conversationMessageDeliveryPayload.destination) &&
        Objects.equals(this.externalMessages, conversationMessageDeliveryPayload.externalMessages) &&
        Objects.equals(this.isFinalEvent, conversationMessageDeliveryPayload.isFinalEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, conversation, message, destination, externalMessages, isFinalEvent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessageDeliveryPayload {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    externalMessages: ").append(toIndentedString(externalMessages)).append("\n");
    sb.append("    isFinalEvent: ").append(toIndentedString(isFinalEvent)).append("\n");
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
