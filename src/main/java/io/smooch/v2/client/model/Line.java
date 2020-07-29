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
import io.smooch.v2.client.model.IntegrationBase;
import io.smooch.v2.client.model.LineAllOf;
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
 * Line
 */
@JsonPropertyOrder({
  Line.JSON_PROPERTY_ID,
  Line.JSON_PROPERTY_TYPE,
  Line.JSON_PROPERTY_STATUS,
  Line.JSON_PROPERTY_ERROR,
  Line.JSON_PROPERTY_DISPLAY_NAME,
  Line.JSON_PROPERTY_CHANNEL_ID,
  Line.JSON_PROPERTY_CHANNEL_SECRET,
  Line.JSON_PROPERTY_CHANNEL_ACCESS_TOKEN,
  Line.JSON_PROPERTY_SERVICE_CODE,
  Line.JSON_PROPERTY_SWITCHER_SECRET,
  Line.JSON_PROPERTY_QR_CODE_URL,
  Line.JSON_PROPERTY_LINE_ID
})

public class Line implements Integration {
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

  public static final String JSON_PROPERTY_CHANNEL_ID = "channelId";
  private String channelId;

  public static final String JSON_PROPERTY_CHANNEL_SECRET = "channelSecret";
  private String channelSecret;

  public static final String JSON_PROPERTY_CHANNEL_ACCESS_TOKEN = "channelAccessToken";
  private String channelAccessToken;

  public static final String JSON_PROPERTY_SERVICE_CODE = "serviceCode";
  private String serviceCode;

  public static final String JSON_PROPERTY_SWITCHER_SECRET = "switcherSecret";
  private String switcherSecret;

  public static final String JSON_PROPERTY_QR_CODE_URL = "qrCodeUrl";
  private String qrCodeUrl;

  public static final String JSON_PROPERTY_LINE_ID = "lineId";
  private String lineId;


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




  public Line type(String type) {
    
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


  public Line status(Status status) {
    
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



  public Line displayName(String displayName) {
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


  public Line channelId(String channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * LINE Channel ID.
   * @return channelId
  **/
  @ApiModelProperty(required = true, value = "LINE Channel ID.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelId() {
    return channelId;
  }


  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public Line channelSecret(String channelSecret) {
    
    this.channelSecret = channelSecret;
    return this;
  }

   /**
   * LINE Channel Secret.
   * @return channelSecret
  **/
  @ApiModelProperty(required = true, value = "LINE Channel Secret.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelSecret() {
    return channelSecret;
  }


  public void setChannelSecret(String channelSecret) {
    this.channelSecret = channelSecret;
  }


  public Line channelAccessToken(String channelAccessToken) {
    
    this.channelAccessToken = channelAccessToken;
    return this;
  }

   /**
   * LINE Channel Access Token.
   * @return channelAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LINE Channel Access Token.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelAccessToken() {
    return channelAccessToken;
  }


  public void setChannelAccessToken(String channelAccessToken) {
    this.channelAccessToken = channelAccessToken;
  }


  public Line serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * LINE Service Code.
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LINE Service Code.")
  @JsonProperty(JSON_PROPERTY_SERVICE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public Line switcherSecret(String switcherSecret) {
    
    this.switcherSecret = switcherSecret;
    return this;
  }

   /**
   * LINE Switcher Secret.
   * @return switcherSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LINE Switcher Secret.")
  @JsonProperty(JSON_PROPERTY_SWITCHER_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSwitcherSecret() {
    return switcherSecret;
  }


  public void setSwitcherSecret(String switcherSecret) {
    this.switcherSecret = switcherSecret;
  }


  public Line qrCodeUrl(String qrCodeUrl) {
    
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

   /**
   * URL provided by LINE in the [Developer Console](https://developers.line.biz/console/).
   * @return qrCodeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL provided by LINE in the [Developer Console](https://developers.line.biz/console/).")
  @JsonProperty(JSON_PROPERTY_QR_CODE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQrCodeUrl() {
    return qrCodeUrl;
  }


  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }


   /**
   * LINE Basic ID. Is automatically set when qrCodeUrl is updated.
   * @return lineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LINE Basic ID. Is automatically set when qrCodeUrl is updated.")
  @JsonProperty(JSON_PROPERTY_LINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLineId() {
    return lineId;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Line line = (Line) o;
    return Objects.equals(this.id, line.id) &&
        Objects.equals(this.type, line.type) &&
        Objects.equals(this.status, line.status) &&
        Objects.equals(this.error, line.error) &&
        Objects.equals(this.displayName, line.displayName) &&
        Objects.equals(this.channelId, line.channelId) &&
        Objects.equals(this.channelSecret, line.channelSecret) &&
        Objects.equals(this.channelAccessToken, line.channelAccessToken) &&
        Objects.equals(this.serviceCode, line.serviceCode) &&
        Objects.equals(this.switcherSecret, line.switcherSecret) &&
        Objects.equals(this.qrCodeUrl, line.qrCodeUrl) &&
        Objects.equals(this.lineId, line.lineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, status, error, displayName, channelId, channelSecret, channelAccessToken, serviceCode, switcherSecret, qrCodeUrl, lineId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Line {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelSecret: ").append(toIndentedString(channelSecret)).append("\n");
    sb.append("    channelAccessToken: ").append(toIndentedString(channelAccessToken)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    switcherSecret: ").append(toIndentedString(switcherSecret)).append("\n");
    sb.append("    qrCodeUrl: ").append(toIndentedString(qrCodeUrl)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
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

