/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.32
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
import java.util.ArrayList;
import java.util.List;

/**
 * IntegrationProfileUpdate
 */

public class IntegrationProfileUpdate {
  @SerializedName("about")
  private String about = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("photoUrl")
  private String photoUrl = null;

  @SerializedName("vertical")
  private String vertical = null;

  @SerializedName("websites")
  private List<String> websites = null;

  public IntegrationProfileUpdate about(String about) {
    this.about = about;
    return this;
  }

   /**
   * Text to display in your profile's About section. Can be used as a status update. Maximum of 139 characters.
   * @return about
  **/
  @ApiModelProperty(value = "Text to display in your profile's About section. Can be used as a status update. Maximum of 139 characters.")
  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public IntegrationProfileUpdate address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address of the business. Maximum of 256 characters.
   * @return address
  **/
  @ApiModelProperty(value = "Address of the business. Maximum of 256 characters.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public IntegrationProfileUpdate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the business. Maximum of 256 characters.
   * @return description
  **/
  @ApiModelProperty(value = "Description of the business. Maximum of 256 characters.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IntegrationProfileUpdate email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address to contact the business. Maximum of 128 characters.
   * @return email
  **/
  @ApiModelProperty(value = "Email address to contact the business. Maximum of 128 characters.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public IntegrationProfileUpdate photoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
    return this;
  }

   /**
   * URL where the business' profile photo is hosted. WhatsApp recommends an image with dimensions of 640x640 and max size of 63KB.
   * @return photoUrl
  **/
  @ApiModelProperty(value = "URL where the business' profile photo is hosted. WhatsApp recommends an image with dimensions of 640x640 and max size of 63KB.")
  public String getPhotoUrl() {
    return photoUrl;
  }

  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }

  public IntegrationProfileUpdate vertical(String vertical) {
    this.vertical = vertical;
    return this;
  }

   /**
   * Industry of the business. Maximum of 128 characters.
   * @return vertical
  **/
  @ApiModelProperty(value = "Industry of the business. Maximum of 128 characters.")
  public String getVertical() {
    return vertical;
  }

  public void setVertical(String vertical) {
    this.vertical = vertical;
  }

  public IntegrationProfileUpdate websites(List<String> websites) {
    this.websites = websites;
    return this;
  }

  public IntegrationProfileUpdate addWebsitesItem(String websitesItem) {
    if (this.websites == null) {
      this.websites = new ArrayList<String>();
    }
    this.websites.add(websitesItem);
    return this;
  }

   /**
   * URLs associated with the business. Maximum of 2 websites.
   * @return websites
  **/
  @ApiModelProperty(value = "URLs associated with the business. Maximum of 2 websites.")
  public List<String> getWebsites() {
    return websites;
  }

  public void setWebsites(List<String> websites) {
    this.websites = websites;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationProfileUpdate integrationProfileUpdate = (IntegrationProfileUpdate) o;
    return Objects.equals(this.about, integrationProfileUpdate.about) &&
        Objects.equals(this.address, integrationProfileUpdate.address) &&
        Objects.equals(this.description, integrationProfileUpdate.description) &&
        Objects.equals(this.email, integrationProfileUpdate.email) &&
        Objects.equals(this.photoUrl, integrationProfileUpdate.photoUrl) &&
        Objects.equals(this.vertical, integrationProfileUpdate.vertical) &&
        Objects.equals(this.websites, integrationProfileUpdate.websites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(about, address, description, email, photoUrl, vertical, websites);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationProfileUpdate {\n");
    
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    vertical: ").append(toIndentedString(vertical)).append("\n");
    sb.append("    websites: ").append(toIndentedString(websites)).append("\n");
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

