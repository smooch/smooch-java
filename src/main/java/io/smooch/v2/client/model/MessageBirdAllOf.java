/*
 * Sunshine Conversations API
 * #  <aside class=\"notice\">As a stepping stone to new and greater things, we’ve released an update to the SunCo API, which is v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/\">here</a>.  </aside>  # Introduction  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## API pagination and records limits  Some APIs can be paginated by providing the offset query string parameter. The offset is the number of initial records to skip before picking records to return. Default 0. The limit query string can also be provided to change the number of records to return (maximum 100, default 25)    Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  ## Regions  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |    For more information on regions, visit [the guide](/guide/regions/).    <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside> 
 *
 * The version of the OpenAPI document: 6.0.0-alpha
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * To configure a MessageBird integration, acquire the accessKey, the signingKey and the MessageBird number you would like to use, then call the Create Integration endpoint. The response will include the integration’s _id and webhookSecret, which must be used to configure the webhook in MessageBird. In the Flow Builder for the MessageBird number you’ve used to integrate, add a new step with the following settings: * Create a new Call HTTP endpoint with SMS flow. * Select your desired SMS number for Incoming SMS. * Click on Forward to URL and set its method to POST. * Then, using the integration _id and webhookSecret returned from the create integration call, enter the following into the URL field:  &#x60;https://app.smooch.io/api/messagebird/webhooks/{appId}/{integrationId}/{webhookSecret}&#x60; * Select application/json for the Set Content-Type header field. * Save and publish your changes. 
 */
@ApiModel(description = "To configure a MessageBird integration, acquire the accessKey, the signingKey and the MessageBird number you would like to use, then call the Create Integration endpoint. The response will include the integration’s _id and webhookSecret, which must be used to configure the webhook in MessageBird. In the Flow Builder for the MessageBird number you’ve used to integrate, add a new step with the following settings: * Create a new Call HTTP endpoint with SMS flow. * Select your desired SMS number for Incoming SMS. * Click on Forward to URL and set its method to POST. * Then, using the integration _id and webhookSecret returned from the create integration call, enter the following into the URL field:  `https://app.smooch.io/api/messagebird/webhooks/{appId}/{integrationId}/{webhookSecret}` * Select application/json for the Set Content-Type header field. * Save and publish your changes. ")
@JsonPropertyOrder({
  MessageBirdAllOf.JSON_PROPERTY_ACCESS_KEY,
  MessageBirdAllOf.JSON_PROPERTY_SIGNING_KEY,
  MessageBirdAllOf.JSON_PROPERTY_ORIGINATOR,
  MessageBirdAllOf.JSON_PROPERTY_WEBHOOK_SECRET
})

public class MessageBirdAllOf {
  public static final String JSON_PROPERTY_ACCESS_KEY = "accessKey";
  private String accessKey;

  public static final String JSON_PROPERTY_SIGNING_KEY = "signingKey";
  private String signingKey;

  public static final String JSON_PROPERTY_ORIGINATOR = "originator";
  private String originator;

  public static final String JSON_PROPERTY_WEBHOOK_SECRET = "webhookSecret";
  private String webhookSecret;


  public MessageBirdAllOf accessKey(String accessKey) {
    
    this.accessKey = accessKey;
    return this;
  }

   /**
   * The public API key of your MessageBird account.
   * @return accessKey
  **/
  @ApiModelProperty(required = true, value = "The public API key of your MessageBird account.")
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccessKey() {
    return accessKey;
  }


  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  public MessageBirdAllOf signingKey(String signingKey) {
    
    this.signingKey = signingKey;
    return this;
  }

   /**
   * The signing key of your MessageBird account. Used to validate the webhooks&#39; origin.
   * @return signingKey
  **/
  @ApiModelProperty(required = true, value = "The signing key of your MessageBird account. Used to validate the webhooks' origin.")
  @JsonProperty(JSON_PROPERTY_SIGNING_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSigningKey() {
    return signingKey;
  }


  public void setSigningKey(String signingKey) {
    this.signingKey = signingKey;
  }


  public MessageBirdAllOf originator(String originator) {
    
    this.originator = originator;
    return this;
  }

   /**
   * Sunshine Conversations will receive all messages sent to this phone number.
   * @return originator
  **/
  @ApiModelProperty(required = true, value = "Sunshine Conversations will receive all messages sent to this phone number.")
  @JsonProperty(JSON_PROPERTY_ORIGINATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOriginator() {
    return originator;
  }


  public void setOriginator(String originator) {
    this.originator = originator;
  }


   /**
   * The secret that is used to configure webhooks in MessageBird.
   * @return webhookSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The secret that is used to configure webhooks in MessageBird.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookSecret() {
    return webhookSecret;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageBirdAllOf messageBirdAllOf = (MessageBirdAllOf) o;
    return Objects.equals(this.accessKey, messageBirdAllOf.accessKey) &&
        Objects.equals(this.signingKey, messageBirdAllOf.signingKey) &&
        Objects.equals(this.originator, messageBirdAllOf.originator) &&
        Objects.equals(this.webhookSecret, messageBirdAllOf.webhookSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, signingKey, originator, webhookSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageBirdAllOf {\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    signingKey: ").append(toIndentedString(signingKey)).append("\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
    sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
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

