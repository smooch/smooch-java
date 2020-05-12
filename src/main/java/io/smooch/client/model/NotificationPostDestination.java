/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.27
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
 * NotificationPostDestination
 */

public class NotificationPostDestination {
  @SerializedName("integrationId")
  private String integrationId = null;

  @SerializedName("destinationId")
  private String destinationId = null;

  public NotificationPostDestination integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The ID of the target integration.
   * @return integrationId
  **/
  @ApiModelProperty(required = true, value = "The ID of the target integration.")
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  public NotificationPostDestination destinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

   /**
   * The external ID (channel specific) of the target user.
   * @return destinationId
  **/
  @ApiModelProperty(required = true, value = "The external ID (channel specific) of the target user.")
  public String getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationPostDestination notificationPostDestination = (NotificationPostDestination) o;
    return Objects.equals(this.integrationId, notificationPostDestination.integrationId) &&
        Objects.equals(this.destinationId, notificationPostDestination.destinationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, destinationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationPostDestination {\n");
    
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
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
