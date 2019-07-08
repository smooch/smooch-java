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
 * Destination
 */

public class Destination {
  @SerializedName("integrationId")
  private String integrationId = null;

  @SerializedName("integrationType")
  private String integrationType = null;

  public Destination integrationId(String integrationId) {
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

  public Destination integrationType(String integrationType) {
    this.integrationType = integrationType;
    return this;
  }

   /**
   * The type of the target integration. See [**IntegrationTypeEnum**](Enums.md#IntegrationTypeEnum) for available values.
   * @return integrationType
  **/
  @ApiModelProperty(required = true, value = "The type of the target integration. See [**IntegrationTypeEnum**](Enums.md#IntegrationTypeEnum) for available values.")
  public String getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(String integrationType) {
    this.integrationType = integrationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Destination destination = (Destination) o;
    return Objects.equals(this.integrationId, destination.integrationId) &&
        Objects.equals(this.integrationType, destination.integrationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, integrationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Destination {\n");
    
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
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

