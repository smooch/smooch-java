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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.smooch.v2.client.model.ActionSubset;
import io.smooch.v2.client.model.CarouselMessage;
import io.smooch.v2.client.model.CarouselMessageDisplaySettings;
import io.smooch.v2.client.model.Field;
import io.smooch.v2.client.model.FileMessage;
import io.smooch.v2.client.model.FormMessage;
import io.smooch.v2.client.model.FormResponseMessage;
import io.smooch.v2.client.model.ImageMessage;
import io.smooch.v2.client.model.Item;
import io.smooch.v2.client.model.ListMessage;
import io.smooch.v2.client.model.LocationMessage;
import io.smooch.v2.client.model.LocationMessageCoordinates;
import io.smooch.v2.client.model.LocationMessageLocation;
import io.smooch.v2.client.model.QuotedMessage;
import io.smooch.v2.client.model.TextMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CarouselMessage.class, name = "carousel"),
  @JsonSubTypes.Type(value = CarouselMessage.class, name = "carouselMessage"),
  @JsonSubTypes.Type(value = FileMessage.class, name = "file"),
  @JsonSubTypes.Type(value = FileMessage.class, name = "fileMessage"),
  @JsonSubTypes.Type(value = FormMessage.class, name = "form"),
  @JsonSubTypes.Type(value = FormMessage.class, name = "formMessage"),
  @JsonSubTypes.Type(value = FormResponseMessage.class, name = "formResponse"),
  @JsonSubTypes.Type(value = FormResponseMessage.class, name = "formResponseMessage"),
  @JsonSubTypes.Type(value = ImageMessage.class, name = "image"),
  @JsonSubTypes.Type(value = ImageMessage.class, name = "imageMessage"),
  @JsonSubTypes.Type(value = ListMessage.class, name = "list"),
  @JsonSubTypes.Type(value = ListMessage.class, name = "listMessage"),
  @JsonSubTypes.Type(value = LocationMessage.class, name = "location"),
  @JsonSubTypes.Type(value = LocationMessage.class, name = "locationMessage"),
  @JsonSubTypes.Type(value = TextMessage.class, name = "text"),
  @JsonSubTypes.Type(value = TextMessage.class, name = "textMessage"),
})

public interface Content  {
    public String getType();
}

