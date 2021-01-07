/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.4.2
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
 * Page1
 */
@JsonPropertyOrder({
  Page1.JSON_PROPERTY_AFTER,
  Page1.JSON_PROPERTY_BEFORE
})

public class Page1 {
  public static final String JSON_PROPERTY_AFTER = "after";
  private String after;

  public static final String JSON_PROPERTY_BEFORE = "before";
  private String before;


  public Page1 after(String after) {
    
    this.after = after;
    return this;
  }

   /**
   * A record id. Results will only contain the records that come after the specified record.  Only one of &#x60;after&#x60; or &#x60;before&#x60; can be provided, not both. 
   * @return after
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5e1606762556d93e9c176f69", value = "A record id. Results will only contain the records that come after the specified record.  Only one of `after` or `before` can be provided, not both. ")
  @JsonProperty(JSON_PROPERTY_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAfter() {
    return after;
  }


  public void setAfter(String after) {
    this.after = after;
  }


  public Page1 before(String before) {
    
    this.before = before;
    return this;
  }

   /**
   * A record id. Results will only contain the records that come before the specified record. Only one of &#x60;after&#x60; or &#x60;before&#x60; can be provided, not both. 
   * @return before
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5e1606762556d93e9c176f69", value = "A record id. Results will only contain the records that come before the specified record. Only one of `after` or `before` can be provided, not both. ")
  @JsonProperty(JSON_PROPERTY_BEFORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBefore() {
    return before;
  }


  public void setBefore(String before) {
    this.before = before;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Page1 page1 = (Page1) o;
    return Objects.equals(this.after, page1.after) &&
        Objects.equals(this.before, page1.before);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page1 {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
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
