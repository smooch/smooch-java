/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.13
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ChannelEntityItem
 */

public class ChannelEntityItem {
  @SerializedName("type")
  private String type = null;

  @SerializedName("integrationId")
  private String integrationId = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("chatId")
  private String chatId = null;

  public ChannelEntityItem type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of channel. See [**IntegrationTypeEnum**](Enums.md#IntegrationTypeEnum) for available values.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of channel. See [**IntegrationTypeEnum**](Enums.md#IntegrationTypeEnum) for available values.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ChannelEntityItem integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The ID of the integration.
   * @return integrationId
  **/
  @ApiModelProperty(value = "The ID of the integration.")
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  public ChannelEntityItem phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number for a *twilio* or *messagebird* integration
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The phone number for a *twilio* or *messagebird* integration")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ChannelEntityItem userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The userId for a *messenger*, *viber*, *line*, *wechat* or *twitter* integration
   * @return userId
  **/
  @ApiModelProperty(value = "The userId for a *messenger*, *viber*, *line*, *wechat* or *twitter* integration")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ChannelEntityItem address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The email address for a *mailgun* integration
   * @return address
  **/
  @ApiModelProperty(value = "The email address for a *mailgun* integration")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ChannelEntityItem username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username for a *whatsapp* integration
   * @return username
  **/
  @ApiModelProperty(value = "The username for a *whatsapp* integration")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ChannelEntityItem chatId(String chatId) {
    this.chatId = chatId;
    return this;
  }

   /**
   * The chat id for a *telegram* integration
   * @return chatId
  **/
  @ApiModelProperty(value = "The chat id for a *telegram* integration")
  public String getChatId() {
    return chatId;
  }

  public void setChatId(String chatId) {
    this.chatId = chatId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelEntityItem channelEntityItem = (ChannelEntityItem) o;
    return Objects.equals(this.type, channelEntityItem.type) &&
        Objects.equals(this.integrationId, channelEntityItem.integrationId) &&
        Objects.equals(this.phoneNumber, channelEntityItem.phoneNumber) &&
        Objects.equals(this.userId, channelEntityItem.userId) &&
        Objects.equals(this.address, channelEntityItem.address) &&
        Objects.equals(this.username, channelEntityItem.username) &&
        Objects.equals(this.chatId, channelEntityItem.chatId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, integrationId, phoneNumber, userId, address, username, chatId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelEntityItem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
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

