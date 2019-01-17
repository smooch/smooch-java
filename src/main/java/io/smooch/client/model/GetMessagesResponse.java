/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.Conversation;
import io.smooch.client.model.Message;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * GetMessagesResponse
 */

public class GetMessagesResponse {
  @SerializedName("conversation")
  private Conversation conversation = null;

  @SerializedName("messages")
  private List<Message> messages = null;

  @SerializedName("next")
  private String next = null;

  public GetMessagesResponse conversation(Conversation conversation) {
    this.conversation = conversation;
    return this;
  }

   /**
   * The conversation.
   * @return conversation
  **/
  @ApiModelProperty(value = "The conversation.")
  public Conversation getConversation() {
    return conversation;
  }

  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }

  public GetMessagesResponse messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public GetMessagesResponse addMessagesItem(Message messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<Message>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * The messages.
   * @return messages
  **/
  @ApiModelProperty(value = "The messages.")
  public List<Message> getMessages() {
    return messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  public GetMessagesResponse next(String next) {
    this.next = next;
    return this;
  }

   /**
   * The URI for the next set of messages in the conversation.
   * @return next
  **/
  @ApiModelProperty(value = "The URI for the next set of messages in the conversation.")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMessagesResponse getMessagesResponse = (GetMessagesResponse) o;
    return Objects.equals(this.conversation, getMessagesResponse.conversation) &&
        Objects.equals(this.messages, getMessagesResponse.messages) &&
        Objects.equals(this.next, getMessagesResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, messages, next);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMessagesResponse {\n");
    
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

