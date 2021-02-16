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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SwitchboardIntegrationWebhook
 */
@JsonPropertyOrder({
  SwitchboardIntegrationWebhook.JSON_PROPERTY_ID,
  SwitchboardIntegrationWebhook.JSON_PROPERTY_NAME,
  SwitchboardIntegrationWebhook.JSON_PROPERTY_INTEGRATION_ID,
  SwitchboardIntegrationWebhook.JSON_PROPERTY_INTEGRATION_TYPE
})

public class SwitchboardIntegrationWebhook {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private String integrationId;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integrationType";
  private String integrationType;


  public SwitchboardIntegrationWebhook id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the switchboard integration.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5ef21b86e933b7355c11c604", value = "The unique ID of the switchboard integration.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SwitchboardIntegrationWebhook name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Identifier for use in control transfer protocols. Restricted to alphanumeric characters, &#x60;-&#x60; and &#x60;_&#x60;.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bot", value = "Identifier for use in control transfer protocols. Restricted to alphanumeric characters, `-` and `_`.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SwitchboardIntegrationWebhook integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Id of the integration that should deliver events routed by the switchboard.
   * @return integrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5ef21b86e933b7355c11c605", value = "Id of the integration that should deliver events routed by the switchboard.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public SwitchboardIntegrationWebhook integrationType(String integrationType) {
    
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Type of integration that should deliver events routed by the switchboard. If referencing an OAuth integration, the clientId issued by Sunshine Conversations during the OAuth partnership process will be the value of integrationType.
   * @return integrationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "zd:agentWorkspace", value = "Type of integration that should deliver events routed by the switchboard. If referencing an OAuth integration, the clientId issued by Sunshine Conversations during the OAuth partnership process will be the value of integrationType.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
    SwitchboardIntegrationWebhook switchboardIntegrationWebhook = (SwitchboardIntegrationWebhook) o;
    return Objects.equals(this.id, switchboardIntegrationWebhook.id) &&
        Objects.equals(this.name, switchboardIntegrationWebhook.name) &&
        Objects.equals(this.integrationId, switchboardIntegrationWebhook.integrationId) &&
        Objects.equals(this.integrationType, switchboardIntegrationWebhook.integrationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, integrationId, integrationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchboardIntegrationWebhook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

