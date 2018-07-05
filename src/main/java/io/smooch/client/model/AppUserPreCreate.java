/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 3.11
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
 * AppUserPreCreate
 */

public class AppUserPreCreate {
  @SerializedName("userId")
  private String userId = null;

  @SerializedName("credentialRequired")
  private Boolean credentialRequired = null;

  @SerializedName("givenName")
  private String givenName = null;

  @SerializedName("surname")
  private String surname = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("signedUpAt")
  private String signedUpAt = null;

  @SerializedName("properties")
  private Object properties = null;

  public AppUserPreCreate userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The app user's userId. This ID is specified by the appMaker. 
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The app user's userId. This ID is specified by the appMaker. ")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public AppUserPreCreate credentialRequired(Boolean credentialRequired) {
    this.credentialRequired = credentialRequired;
    return this;
  }

   /**
   * Flag indicating if the appUser is secured by a JSON Web Token or not.
   * @return credentialRequired
  **/
  @ApiModelProperty(value = "Flag indicating if the appUser is secured by a JSON Web Token or not.")
  public Boolean getCredentialRequired() {
    return credentialRequired;
  }

  public void setCredentialRequired(Boolean credentialRequired) {
    this.credentialRequired = credentialRequired;
  }

  public AppUserPreCreate givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * The app user's given name.
   * @return givenName
  **/
  @ApiModelProperty(value = "The app user's given name.")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public AppUserPreCreate surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * The app user's surname.
   * @return surname
  **/
  @ApiModelProperty(value = "The app user's surname.")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public AppUserPreCreate email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The app user's email.
   * @return email
  **/
  @ApiModelProperty(value = "The app user's email.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AppUserPreCreate signedUpAt(String signedUpAt) {
    this.signedUpAt = signedUpAt;
    return this;
  }

   /**
   * A datetime string with the format *yyyy-mm-ddThh:mm:ssZ* representing the moment an appUser was created.
   * @return signedUpAt
  **/
  @ApiModelProperty(value = "A datetime string with the format *yyyy-mm-ddThh:mm:ssZ* representing the moment an appUser was created.")
  public String getSignedUpAt() {
    return signedUpAt;
  }

  public void setSignedUpAt(String signedUpAt) {
    this.signedUpAt = signedUpAt;
  }

  public AppUserPreCreate properties(Object properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Custom properties for the app user.
   * @return properties
  **/
  @ApiModelProperty(value = "Custom properties for the app user.")
  public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUserPreCreate appUserPreCreate = (AppUserPreCreate) o;
    return Objects.equals(this.userId, appUserPreCreate.userId) &&
        Objects.equals(this.credentialRequired, appUserPreCreate.credentialRequired) &&
        Objects.equals(this.givenName, appUserPreCreate.givenName) &&
        Objects.equals(this.surname, appUserPreCreate.surname) &&
        Objects.equals(this.email, appUserPreCreate.email) &&
        Objects.equals(this.signedUpAt, appUserPreCreate.signedUpAt) &&
        Objects.equals(this.properties, appUserPreCreate.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, credentialRequired, givenName, surname, email, signedUpAt, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUserPreCreate {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    credentialRequired: ").append(toIndentedString(credentialRequired)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    signedUpAt: ").append(toIndentedString(signedUpAt)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

