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
import io.smooch.v2.client.model.IntegrationBase;
import io.smooch.v2.client.model.PrechatCapture;
import io.smooch.v2.client.model.Status;
import io.smooch.v2.client.model.WebAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import io.smooch.v2.client.model.Integration;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Web
 */
@JsonPropertyOrder({
  Web.JSON_PROPERTY_ID,
  Web.JSON_PROPERTY_TYPE,
  Web.JSON_PROPERTY_STATUS,
  Web.JSON_PROPERTY_ERROR,
  Web.JSON_PROPERTY_DISPLAY_NAME,
  Web.JSON_PROPERTY_BRAND_COLOR,
  Web.JSON_PROPERTY_FIXED_INTRO_PANE,
  Web.JSON_PROPERTY_CONVERSATION_COLOR,
  Web.JSON_PROPERTY_ACTION_COLOR,
  Web.JSON_PROPERTY_DISPLAY_STYLE,
  Web.JSON_PROPERTY_BUTTON_ICON_URL,
  Web.JSON_PROPERTY_BUTTON_WIDTH,
  Web.JSON_PROPERTY_BUTTON_HEIGHT,
  Web.JSON_PROPERTY_INTEGRATION_ORDER,
  Web.JSON_PROPERTY_BUSINESS_NAME,
  Web.JSON_PROPERTY_BUSINESS_ICON_URL,
  Web.JSON_PROPERTY_BACKGROUND_IMAGE_URL,
  Web.JSON_PROPERTY_ORIGIN_WHITELIST,
  Web.JSON_PROPERTY_PRECHAT_CAPTURE,
  Web.JSON_PROPERTY_CAN_USER_CREATE_CONVERSATION
})

public class Web implements Integration {
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

  public static final String JSON_PROPERTY_BRAND_COLOR = "brandColor";
  private String brandColor = "65758e";

  public static final String JSON_PROPERTY_FIXED_INTRO_PANE = "fixedIntroPane";
  private Boolean fixedIntroPane = false;

  public static final String JSON_PROPERTY_CONVERSATION_COLOR = "conversationColor";
  private String conversationColor = "0099ff";

  public static final String JSON_PROPERTY_ACTION_COLOR = "actionColor";
  private String actionColor = "0099ff";

  public static final String JSON_PROPERTY_DISPLAY_STYLE = "displayStyle";
  private String displayStyle = "button";

  public static final String JSON_PROPERTY_BUTTON_ICON_URL = "buttonIconUrl";
  private JsonNullable<String> buttonIconUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BUTTON_WIDTH = "buttonWidth";
  private String buttonWidth = "58";

  public static final String JSON_PROPERTY_BUTTON_HEIGHT = "buttonHeight";
  private String buttonHeight = "58";

  public static final String JSON_PROPERTY_INTEGRATION_ORDER = "integrationOrder";
  private JsonNullable<List<String>> integrationOrder = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_BUSINESS_NAME = "businessName";
  private String businessName;

  public static final String JSON_PROPERTY_BUSINESS_ICON_URL = "businessIconUrl";
  private String businessIconUrl;

  public static final String JSON_PROPERTY_BACKGROUND_IMAGE_URL = "backgroundImageUrl";
  private String backgroundImageUrl;

  public static final String JSON_PROPERTY_ORIGIN_WHITELIST = "originWhitelist";
  private JsonNullable<List<String>> originWhitelist = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_PRECHAT_CAPTURE = "prechatCapture";
  private PrechatCapture prechatCapture = null;

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




  public Web type(String type) {
    
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


  public Web status(Status status) {
    
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



  public Web displayName(String displayName) {
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


  public Web brandColor(String brandColor) {
    
    this.brandColor = brandColor;
    return this;
  }

   /**
   * This color will be used in the messenger header and the button or tab in idle state. Must be a 3 or 6-character hexadecimal color.
   * @return brandColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This color will be used in the messenger header and the button or tab in idle state. Must be a 3 or 6-character hexadecimal color.")
  @JsonProperty(JSON_PROPERTY_BRAND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandColor() {
    return brandColor;
  }


  public void setBrandColor(String brandColor) {
    this.brandColor = brandColor;
  }


  public Web fixedIntroPane(Boolean fixedIntroPane) {
    
    this.fixedIntroPane = fixedIntroPane;
    return this;
  }

   /**
   * When true, the introduction pane will be pinned at the top of the conversation instead of scrolling with it.
   * @return fixedIntroPane
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When true, the introduction pane will be pinned at the top of the conversation instead of scrolling with it.")
  @JsonProperty(JSON_PROPERTY_FIXED_INTRO_PANE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFixedIntroPane() {
    return fixedIntroPane;
  }


  public void setFixedIntroPane(Boolean fixedIntroPane) {
    this.fixedIntroPane = fixedIntroPane;
  }


  public Web conversationColor(String conversationColor) {
    
    this.conversationColor = conversationColor;
    return this;
  }

   /**
   * This color will be used for customer messages, quick replies and actions in the footer. Must be a 3 or 6-character hexadecimal color.
   * @return conversationColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This color will be used for customer messages, quick replies and actions in the footer. Must be a 3 or 6-character hexadecimal color.")
  @JsonProperty(JSON_PROPERTY_CONVERSATION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversationColor() {
    return conversationColor;
  }


  public void setConversationColor(String conversationColor) {
    this.conversationColor = conversationColor;
  }


  public Web actionColor(String actionColor) {
    
    this.actionColor = actionColor;
    return this;
  }

   /**
   * This color will be used for call-to-actions inside your messages. Must be a 3 or 6-character hexadecimal color.
   * @return actionColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This color will be used for call-to-actions inside your messages. Must be a 3 or 6-character hexadecimal color.")
  @JsonProperty(JSON_PROPERTY_ACTION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActionColor() {
    return actionColor;
  }


  public void setActionColor(String actionColor) {
    this.actionColor = actionColor;
  }


  public Web displayStyle(String displayStyle) {
    
    this.displayStyle = displayStyle;
    return this;
  }

   /**
   * Choose how the messenger will appear on your website. Must be either button or tab.
   * @return displayStyle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Choose how the messenger will appear on your website. Must be either button or tab.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayStyle() {
    return displayStyle;
  }


  public void setDisplayStyle(String displayStyle) {
    this.displayStyle = displayStyle;
  }


  public Web buttonIconUrl(String buttonIconUrl) {
    this.buttonIconUrl = JsonNullable.<String>of(buttonIconUrl);
    
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of selecting your own button icon. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.
   * @return buttonIconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of selecting your own button icon. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.")
  @JsonIgnore

  public String getButtonIconUrl() {
        return buttonIconUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUTTON_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getButtonIconUrl_JsonNullable() {
    return buttonIconUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_BUTTON_ICON_URL)
  public void setButtonIconUrl_JsonNullable(JsonNullable<String> buttonIconUrl) {
    this.buttonIconUrl = buttonIconUrl;
  }

  public void setButtonIconUrl(String buttonIconUrl) {
    this.buttonIconUrl = JsonNullable.<String>of(buttonIconUrl);
  }


  public Web buttonWidth(String buttonWidth) {
    
    this.buttonWidth = buttonWidth;
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of specifying the button width.
   * @return buttonWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of specifying the button width.")
  @JsonProperty(JSON_PROPERTY_BUTTON_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButtonWidth() {
    return buttonWidth;
  }


  public void setButtonWidth(String buttonWidth) {
    this.buttonWidth = buttonWidth;
  }


  public Web buttonHeight(String buttonHeight) {
    
    this.buttonHeight = buttonHeight;
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of specifying the button height.
   * @return buttonHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of specifying the button height.")
  @JsonProperty(JSON_PROPERTY_BUTTON_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButtonHeight() {
    return buttonHeight;
  }


  public void setButtonHeight(String buttonHeight) {
    this.buttonHeight = buttonHeight;
  }


  public Web integrationOrder(List<String> integrationOrder) {
    this.integrationOrder = JsonNullable.<List<String>>of(integrationOrder);
    
    return this;
  }

  public Web addIntegrationOrderItem(String integrationOrderItem) {
    if (this.integrationOrder == null || !this.integrationOrder.isPresent()) {
      this.integrationOrder = JsonNullable.<List<String>>of(new ArrayList<String>());
    }
    try {
      this.integrationOrder.get().add(integrationOrderItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Array of integration IDs, order will be reflected in the Web Messenger. When set, only integrations from this list will be displayed in the Web Messenger. If unset, all integrations will be displayed.
   * @return integrationOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of integration IDs, order will be reflected in the Web Messenger. When set, only integrations from this list will be displayed in the Web Messenger. If unset, all integrations will be displayed.")
  @JsonIgnore

  public List<String> getIntegrationOrder() {
        return integrationOrder.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEGRATION_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getIntegrationOrder_JsonNullable() {
    return integrationOrder;
  }
  
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ORDER)
  public void setIntegrationOrder_JsonNullable(JsonNullable<List<String>> integrationOrder) {
    this.integrationOrder = integrationOrder;
  }

  public void setIntegrationOrder(List<String> integrationOrder) {
    this.integrationOrder = JsonNullable.<List<String>>of(integrationOrder);
  }


  public Web businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * A custom business name for the Web Messenger.
   * @return businessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A custom business name for the Web Messenger.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public Web businessIconUrl(String businessIconUrl) {
    
    this.businessIconUrl = businessIconUrl;
    return this;
  }

   /**
   * A custom business icon url for the Web Messenger. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.
   * @return businessIconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A custom business icon url for the Web Messenger. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessIconUrl() {
    return businessIconUrl;
  }


  public void setBusinessIconUrl(String businessIconUrl) {
    this.businessIconUrl = businessIconUrl;
  }


  public Web backgroundImageUrl(String backgroundImageUrl) {
    
    this.backgroundImageUrl = backgroundImageUrl;
    return this;
  }

   /**
   * A background image url for the conversation. Image will be tiled to fit the window.
   * @return backgroundImageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A background image url for the conversation. Image will be tiled to fit the window.")
  @JsonProperty(JSON_PROPERTY_BACKGROUND_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBackgroundImageUrl() {
    return backgroundImageUrl;
  }


  public void setBackgroundImageUrl(String backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
  }


  public Web originWhitelist(List<String> originWhitelist) {
    this.originWhitelist = JsonNullable.<List<String>>of(originWhitelist);
    
    return this;
  }

  public Web addOriginWhitelistItem(String originWhitelistItem) {
    if (this.originWhitelist == null || !this.originWhitelist.isPresent()) {
      this.originWhitelist = JsonNullable.<List<String>>of(new ArrayList<String>());
    }
    try {
      this.originWhitelist.get().add(originWhitelistItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * A list of origins to whitelist. When set, only the origins from this list will be able to initialize the Web Messenger. If unset, all origins are whitelisted. The elements in the list should follow the serialized-origin format from RFC 6454: scheme \&quot;://\&quot; host [ \&quot;:\&quot; port ], where scheme is http or https. 
   * @return originWhitelist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of origins to whitelist. When set, only the origins from this list will be able to initialize the Web Messenger. If unset, all origins are whitelisted. The elements in the list should follow the serialized-origin format from RFC 6454: scheme \"://\" host [ \":\" port ], where scheme is http or https. ")
  @JsonIgnore

  public List<String> getOriginWhitelist() {
        return originWhitelist.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORIGIN_WHITELIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getOriginWhitelist_JsonNullable() {
    return originWhitelist;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGIN_WHITELIST)
  public void setOriginWhitelist_JsonNullable(JsonNullable<List<String>> originWhitelist) {
    this.originWhitelist = originWhitelist;
  }

  public void setOriginWhitelist(List<String> originWhitelist) {
    this.originWhitelist = JsonNullable.<List<String>>of(originWhitelist);
  }


  public Web prechatCapture(PrechatCapture prechatCapture) {
    
    this.prechatCapture = prechatCapture;
    return this;
  }

   /**
   * Object whose properties can be set to specify the add-on’s options. See the guide to learn more about Prechat Capture.
   * @return prechatCapture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Object whose properties can be set to specify the add-on’s options. See the guide to learn more about Prechat Capture.")
  @JsonProperty(JSON_PROPERTY_PRECHAT_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrechatCapture getPrechatCapture() {
    return prechatCapture;
  }


  public void setPrechatCapture(PrechatCapture prechatCapture) {
    this.prechatCapture = prechatCapture;
  }


  public Web canUserCreateConversation(Boolean canUserCreateConversation) {
    
    this.canUserCreateConversation = canUserCreateConversation;
    return this;
  }

   /**
   * Allows users to create more than one conversation on the web messenger integration.
   * @return canUserCreateConversation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows users to create more than one conversation on the web messenger integration.")
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
    Web web = (Web) o;
    return Objects.equals(this.id, web.id) &&
        Objects.equals(this.type, web.type) &&
        Objects.equals(this.status, web.status) &&
        Objects.equals(this.error, web.error) &&
        Objects.equals(this.displayName, web.displayName) &&
        Objects.equals(this.brandColor, web.brandColor) &&
        Objects.equals(this.fixedIntroPane, web.fixedIntroPane) &&
        Objects.equals(this.conversationColor, web.conversationColor) &&
        Objects.equals(this.actionColor, web.actionColor) &&
        Objects.equals(this.displayStyle, web.displayStyle) &&
        Objects.equals(this.buttonIconUrl, web.buttonIconUrl) &&
        Objects.equals(this.buttonWidth, web.buttonWidth) &&
        Objects.equals(this.buttonHeight, web.buttonHeight) &&
        Objects.equals(this.integrationOrder, web.integrationOrder) &&
        Objects.equals(this.businessName, web.businessName) &&
        Objects.equals(this.businessIconUrl, web.businessIconUrl) &&
        Objects.equals(this.backgroundImageUrl, web.backgroundImageUrl) &&
        Objects.equals(this.originWhitelist, web.originWhitelist) &&
        Objects.equals(this.prechatCapture, web.prechatCapture) &&
        Objects.equals(this.canUserCreateConversation, web.canUserCreateConversation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, status, error, displayName, brandColor, fixedIntroPane, conversationColor, actionColor, displayStyle, buttonIconUrl, buttonWidth, buttonHeight, integrationOrder, businessName, businessIconUrl, backgroundImageUrl, originWhitelist, prechatCapture, canUserCreateConversation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Web {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    brandColor: ").append(toIndentedString(brandColor)).append("\n");
    sb.append("    fixedIntroPane: ").append(toIndentedString(fixedIntroPane)).append("\n");
    sb.append("    conversationColor: ").append(toIndentedString(conversationColor)).append("\n");
    sb.append("    actionColor: ").append(toIndentedString(actionColor)).append("\n");
    sb.append("    displayStyle: ").append(toIndentedString(displayStyle)).append("\n");
    sb.append("    buttonIconUrl: ").append(toIndentedString(buttonIconUrl)).append("\n");
    sb.append("    buttonWidth: ").append(toIndentedString(buttonWidth)).append("\n");
    sb.append("    buttonHeight: ").append(toIndentedString(buttonHeight)).append("\n");
    sb.append("    integrationOrder: ").append(toIndentedString(integrationOrder)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessIconUrl: ").append(toIndentedString(businessIconUrl)).append("\n");
    sb.append("    backgroundImageUrl: ").append(toIndentedString(backgroundImageUrl)).append("\n");
    sb.append("    originWhitelist: ").append(toIndentedString(originWhitelist)).append("\n");
    sb.append("    prechatCapture: ").append(toIndentedString(prechatCapture)).append("\n");
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

