/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.32
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.MessageOverrideLine;
import io.smooch.client.model.MessageOverrideMessenger;
import io.smooch.client.model.MessageOverrideWhatsapp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MessageOverride
 */

public class MessageOverride {
  @SerializedName("whatsapp")
  private MessageOverrideWhatsapp whatsapp = null;

  @SerializedName("line")
  private MessageOverrideLine line = null;

  @SerializedName("messenger")
  private MessageOverrideMessenger messenger = null;

  public MessageOverride whatsapp(MessageOverrideWhatsapp whatsapp) {
    this.whatsapp = whatsapp;
    return this;
  }

   /**
   * Get whatsapp
   * @return whatsapp
  **/
  @ApiModelProperty(value = "")
  public MessageOverrideWhatsapp getWhatsapp() {
    return whatsapp;
  }

  public void setWhatsapp(MessageOverrideWhatsapp whatsapp) {
    this.whatsapp = whatsapp;
  }

  public MessageOverride line(MessageOverrideLine line) {
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @ApiModelProperty(value = "")
  public MessageOverrideLine getLine() {
    return line;
  }

  public void setLine(MessageOverrideLine line) {
    this.line = line;
  }

  public MessageOverride messenger(MessageOverrideMessenger messenger) {
    this.messenger = messenger;
    return this;
  }

   /**
   * Get messenger
   * @return messenger
  **/
  @ApiModelProperty(value = "")
  public MessageOverrideMessenger getMessenger() {
    return messenger;
  }

  public void setMessenger(MessageOverrideMessenger messenger) {
    this.messenger = messenger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageOverride messageOverride = (MessageOverride) o;
    return Objects.equals(this.whatsapp, messageOverride.whatsapp) &&
        Objects.equals(this.line, messageOverride.line) &&
        Objects.equals(this.messenger, messageOverride.messenger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whatsapp, line, messenger);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageOverride {\n");
    
    sb.append("    whatsapp: ").append(toIndentedString(whatsapp)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    messenger: ").append(toIndentedString(messenger)).append("\n");
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

