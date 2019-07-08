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
 * GetIntegrationProfileResponse
 */

public class GetIntegrationProfileResponse {
  @SerializedName("profile")
  private Object profile = null;

  public GetIntegrationProfileResponse profile(Object profile) {
    this.profile = profile;
    return this;
  }

   /**
   * JSON object containing the integration profile. [More info](https://docs.smooch.io/rest/#get-integration-profile)
   * @return profile
  **/
  @ApiModelProperty(value = "JSON object containing the integration profile. [More info](https://docs.smooch.io/rest/#get-integration-profile)")
  public Object getProfile() {
    return profile;
  }

  public void setProfile(Object profile) {
    this.profile = profile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIntegrationProfileResponse getIntegrationProfileResponse = (GetIntegrationProfileResponse) o;
    return Objects.equals(this.profile, getIntegrationProfileResponse.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIntegrationProfileResponse {\n");
    
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

