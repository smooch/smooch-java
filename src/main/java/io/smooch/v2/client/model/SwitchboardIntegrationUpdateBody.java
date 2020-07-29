/*
 * Sunshine Conversations API
 * #  <aside class=\"notice\">As a stepping stone to new and greater things, we’ve released an update to the SunCo API, which is v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/\">here</a>.  </aside>  # Introduction  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## API pagination and records limits  Some APIs can be paginated by providing the `offset` query string parameter.  The `offset` is the number of initial records to skip before picking records to return (default 0).  The `limit` query string can also be provided to change the number of records to return (maximum 100, default 25).  All paginated endpoints will eventually support cursor pagination and `offset` based pagination support will be dropped.  ### Cursor Pagination  Some APIs are paginated through cursor pagination. Rather than providing an `offset`, a `page[after]` or `page[before]` query string parameter may be provided. `page[after]` and `page[before]` are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In cursor pagination, the equivalent to the `limit` query string is the `page[size]` query string parameter.  ## Regions  Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |    For more information on regions, visit [the guide](/guide/regions/).    <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside> 
 *
 * The version of the OpenAPI document: 6.0.0-alpha.5
 * Contact: hello@smooch.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.smooch.v2.client.model;

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
 * SwitchboardIntegrationUpdateBody
 */
@JsonPropertyOrder({
  SwitchboardIntegrationUpdateBody.JSON_PROPERTY_NAME,
  SwitchboardIntegrationUpdateBody.JSON_PROPERTY_INTEGRATION_ID,
  SwitchboardIntegrationUpdateBody.JSON_PROPERTY_INTEGRATION_TYPE,
  SwitchboardIntegrationUpdateBody.JSON_PROPERTY_DELIVER_STANDBY_EVENTS,
  SwitchboardIntegrationUpdateBody.JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID
})

public class SwitchboardIntegrationUpdateBody {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private String integrationId = null;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integrationType";
  private String integrationType = null;

  public static final String JSON_PROPERTY_DELIVER_STANDBY_EVENTS = "deliverStandbyEvents";
  private Boolean deliverStandbyEvents;

  public static final String JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID = "nextSwitchboardIntegrationId";
  private JsonNullable<String> nextSwitchboardIntegrationId = JsonNullable.<String>of(null);


  public SwitchboardIntegrationUpdateBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Identifier for use in control transfer protocols. Restricted to alphanumeric characters, - and _.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bot", value = "Identifier for use in control transfer protocols. Restricted to alphanumeric characters, - and _.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SwitchboardIntegrationUpdateBody integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The id of the integration to link to the switchboard integration. Must be used when linking a custom integration. Can&#39;t provide both integrationId and integrationType.
   * @return integrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the integration to link to the switchboard integration. Must be used when linking a custom integration. Can't provide both integrationId and integrationType.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public SwitchboardIntegrationUpdateBody integrationType(String integrationType) {
    
    this.integrationType = integrationType;
    return this;
  }

   /**
   * The type of the integration to link to the switchboard integration. Must be used when linking an OAuth integration. Can&#39;t provide both integrationId and integrationType.
   * @return integrationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the integration to link to the switchboard integration. Must be used when linking an OAuth integration. Can't provide both integrationId and integrationType.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationType() {
    return integrationType;
  }


  public void setIntegrationType(String integrationType) {
    this.integrationType = integrationType;
  }


  public SwitchboardIntegrationUpdateBody deliverStandbyEvents(Boolean deliverStandbyEvents) {
    
    this.deliverStandbyEvents = deliverStandbyEvents;
    return this;
  }

   /**
   * Setting to determine if webhooks should be sent when the switchboard integration is not in control of a conversation (standby status)
   * @return deliverStandbyEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Setting to determine if webhooks should be sent when the switchboard integration is not in control of a conversation (standby status)")
  @JsonProperty(JSON_PROPERTY_DELIVER_STANDBY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeliverStandbyEvents() {
    return deliverStandbyEvents;
  }


  public void setDeliverStandbyEvents(Boolean deliverStandbyEvents) {
    this.deliverStandbyEvents = deliverStandbyEvents;
  }


  public SwitchboardIntegrationUpdateBody nextSwitchboardIntegrationId(String nextSwitchboardIntegrationId) {
    this.nextSwitchboardIntegrationId = JsonNullable.<String>of(nextSwitchboardIntegrationId);
    
    return this;
  }

   /**
   * Get nextSwitchboardIntegrationId
   * @return nextSwitchboardIntegrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getNextSwitchboardIntegrationId() {
        return nextSwitchboardIntegrationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNextSwitchboardIntegrationId_JsonNullable() {
    return nextSwitchboardIntegrationId;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID)
  public void setNextSwitchboardIntegrationId_JsonNullable(JsonNullable<String> nextSwitchboardIntegrationId) {
    this.nextSwitchboardIntegrationId = nextSwitchboardIntegrationId;
  }

  public void setNextSwitchboardIntegrationId(String nextSwitchboardIntegrationId) {
    this.nextSwitchboardIntegrationId = JsonNullable.<String>of(nextSwitchboardIntegrationId);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchboardIntegrationUpdateBody switchboardIntegrationUpdateBody = (SwitchboardIntegrationUpdateBody) o;
    return Objects.equals(this.name, switchboardIntegrationUpdateBody.name) &&
        Objects.equals(this.integrationId, switchboardIntegrationUpdateBody.integrationId) &&
        Objects.equals(this.integrationType, switchboardIntegrationUpdateBody.integrationType) &&
        Objects.equals(this.deliverStandbyEvents, switchboardIntegrationUpdateBody.deliverStandbyEvents) &&
        Objects.equals(this.nextSwitchboardIntegrationId, switchboardIntegrationUpdateBody.nextSwitchboardIntegrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, integrationId, integrationType, deliverStandbyEvents, nextSwitchboardIntegrationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchboardIntegrationUpdateBody {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    deliverStandbyEvents: ").append(toIndentedString(deliverStandbyEvents)).append("\n");
    sb.append("    nextSwitchboardIntegrationId: ").append(toIndentedString(nextSwitchboardIntegrationId)).append("\n");
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

