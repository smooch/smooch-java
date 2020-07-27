/*
 * Sunshine Conversations API
 * #  <aside class=\"notice\">As a stepping stone to new and greater things, we’ve released an update to the SunCo API, which is v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/\">here</a>.  </aside>  # Introduction  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## API pagination and records limits  Some APIs can be paginated by providing the `offset` query string parameter.  The `offset` is the number of initial records to skip before picking records to return (default 0).  The `limit` query string can also be provided to change the number of records to return (maximum 100, default 25).  All paginated endpoints will eventually support cursor pagination and `offset` based pagination support will be dropped.  ### Cursor Pagination  Some APIs are paginated through cursor pagination. Rather than providing an `offset`, a `page[after]` or `page[before]` query string parameter may be provided. `page[after]` and `page[before]` are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In cursor pagination, the equivalent to the `limit` query string is the `page[size]` query string parameter.  ## Regions  Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |    For more information on regions, visit [the guide](/guide/regions/).    <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside> 
 *
 * The version of the OpenAPI document: 6.0.0-alpha.3
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
import io.smooch.v2.client.model.AndroidAllOf;
import io.smooch.v2.client.model.IntegrationBase;
import io.smooch.v2.client.model.Status;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import io.smooch.v2.client.model.Integration;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Android
 */
@JsonPropertyOrder({
  Android.JSON_PROPERTY_ID,
  Android.JSON_PROPERTY_TYPE,
  Android.JSON_PROPERTY_STATUS,
  Android.JSON_PROPERTY_ERROR,
  Android.JSON_PROPERTY_DISPLAY_NAME,
  Android.JSON_PROPERTY_SERVER_KEY,
  Android.JSON_PROPERTY_SENDER_ID,
  Android.JSON_PROPERTY_CAN_USER_CREATE_CONVERSATION
})

public class Android implements Integration {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Status status;

  public static final String JSON_PROPERTY_ERROR = "error";
  private JsonNullable<String> error = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERVER_KEY = "serverKey";
  private JsonNullable<String> serverKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SENDER_ID = "senderId";
  private JsonNullable<String> senderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CAN_USER_CREATE_CONVERSATION = "canUserCreateConversation";
  private Boolean canUserCreateConversation;


   /**
   * The unique ID of the integration.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the integration.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public Android type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of integration.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of integration.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Android status(Status status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Status getStatus() {
    return status;
  }


  public void setStatus(Status status) {
    this.status = status;
  }


   /**
   * If the integration status is error, contains a description of the problem.
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the integration status is error, contains a description of the problem.")
  @JsonIgnore

  public String getError() {
    
    if (error == null) {
      error = JsonNullable.<String>undefined();
    }
    return error.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getError_JsonNullable() {
    return error;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR)
  private void setError_JsonNullable(JsonNullable<String> error) {
    this.error = error;
  }



  public Android displayName(String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
    
    return this;
  }

   /**
   * A human-friendly name used to identify the integration.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Channel name", value = "A human-friendly name used to identify the integration.")
  @JsonIgnore

  public String getDisplayName() {
        return displayName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDisplayName_JsonNullable() {
    return displayName;
  }
  
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  public void setDisplayName_JsonNullable(JsonNullable<String> displayName) {
    this.displayName = displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
  }


  public Android serverKey(String serverKey) {
    this.serverKey = JsonNullable.<String>of(serverKey);
    
    return this;
  }

   /**
   * Your server key from the fcm console.
   * @return serverKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your server key from the fcm console.")
  @JsonIgnore

  public String getServerKey() {
        return serverKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SERVER_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getServerKey_JsonNullable() {
    return serverKey;
  }
  
  @JsonProperty(JSON_PROPERTY_SERVER_KEY)
  public void setServerKey_JsonNullable(JsonNullable<String> serverKey) {
    this.serverKey = serverKey;
  }

  public void setServerKey(String serverKey) {
    this.serverKey = JsonNullable.<String>of(serverKey);
  }


  public Android senderId(String senderId) {
    this.senderId = JsonNullable.<String>of(senderId);
    
    return this;
  }

   /**
   * Your sender id from the fcm console.
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your sender id from the fcm console.")
  @JsonIgnore

  public String getSenderId() {
        return senderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSenderId_JsonNullable() {
    return senderId;
  }
  
  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  public void setSenderId_JsonNullable(JsonNullable<String> senderId) {
    this.senderId = senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = JsonNullable.<String>of(senderId);
  }


  public Android canUserCreateConversation(Boolean canUserCreateConversation) {
    
    this.canUserCreateConversation = canUserCreateConversation;
    return this;
  }

   /**
   * Allows users to create more than one conversation on the android integration.
   * @return canUserCreateConversation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows users to create more than one conversation on the android integration.")
  @JsonProperty(JSON_PROPERTY_CAN_USER_CREATE_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUserCreateConversation() {
    return canUserCreateConversation;
  }


  public void setCanUserCreateConversation(Boolean canUserCreateConversation) {
    this.canUserCreateConversation = canUserCreateConversation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Android android = (Android) o;
    return Objects.equals(this.id, android.id) &&
        Objects.equals(this.type, android.type) &&
        Objects.equals(this.status, android.status) &&
        Objects.equals(this.error, android.error) &&
        Objects.equals(this.displayName, android.displayName) &&
        Objects.equals(this.serverKey, android.serverKey) &&
        Objects.equals(this.senderId, android.senderId) &&
        Objects.equals(this.canUserCreateConversation, android.canUserCreateConversation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, status, error, displayName, serverKey, senderId, canUserCreateConversation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Android {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    serverKey: ").append(toIndentedString(serverKey)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    canUserCreateConversation: ").append(toIndentedString(canUserCreateConversation)).append("\n");
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

