/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 3.13
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.Client;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * AppUser
 */

public class AppUser {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("userId")
  private String userId = null;

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

  @SerializedName("conversationStarted")
  private Boolean conversationStarted = null;

  @SerializedName("credentialRequired")
  private Boolean credentialRequired = null;

  @SerializedName("clients")
  private List<Client> clients = null;

  @SerializedName("pendingClients")
  private List<Client> pendingClients = null;

  public AppUser id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The app user's ID, generated automatically.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The app user's ID, generated automatically.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AppUser userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The app user's userId. This ID is specified by the appMaker. 
   * @return userId
  **/
  @ApiModelProperty(value = "The app user's userId. This ID is specified by the appMaker. ")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public AppUser givenName(String givenName) {
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

  public AppUser surname(String surname) {
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

  public AppUser email(String email) {
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

  public AppUser signedUpAt(String signedUpAt) {
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

  public AppUser properties(Object properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Custom properties for the app user.
   * @return properties
  **/
  @ApiModelProperty(required = true, value = "Custom properties for the app user.")
  public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }

  public AppUser conversationStarted(Boolean conversationStarted) {
    this.conversationStarted = conversationStarted;
    return this;
  }

   /**
   * Flag indicating if the conversation has started for the app user.
   * @return conversationStarted
  **/
  @ApiModelProperty(required = true, value = "Flag indicating if the conversation has started for the app user.")
  public Boolean getConversationStarted() {
    return conversationStarted;
  }

  public void setConversationStarted(Boolean conversationStarted) {
    this.conversationStarted = conversationStarted;
  }

  public AppUser credentialRequired(Boolean credentialRequired) {
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

  public AppUser clients(List<Client> clients) {
    this.clients = clients;
    return this;
  }

  public AppUser addClientsItem(Client clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<Client>();
    }
    this.clients.add(clientsItem);
    return this;
  }

   /**
   * List of clients associated with the app user.
   * @return clients
  **/
  @ApiModelProperty(value = "List of clients associated with the app user.")
  public List<Client> getClients() {
    return clients;
  }

  public void setClients(List<Client> clients) {
    this.clients = clients;
  }

  public AppUser pendingClients(List<Client> pendingClients) {
    this.pendingClients = pendingClients;
    return this;
  }

  public AppUser addPendingClientsItem(Client pendingClientsItem) {
    if (this.pendingClients == null) {
      this.pendingClients = new ArrayList<Client>();
    }
    this.pendingClients.add(pendingClientsItem);
    return this;
  }

   /**
   * As clients, but containing linked clients which have not been confirmed yet (i.e. Twilio SMS).
   * @return pendingClients
  **/
  @ApiModelProperty(value = "As clients, but containing linked clients which have not been confirmed yet (i.e. Twilio SMS).")
  public List<Client> getPendingClients() {
    return pendingClients;
  }

  public void setPendingClients(List<Client> pendingClients) {
    this.pendingClients = pendingClients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUser appUser = (AppUser) o;
    return Objects.equals(this.id, appUser.id) &&
        Objects.equals(this.userId, appUser.userId) &&
        Objects.equals(this.givenName, appUser.givenName) &&
        Objects.equals(this.surname, appUser.surname) &&
        Objects.equals(this.email, appUser.email) &&
        Objects.equals(this.signedUpAt, appUser.signedUpAt) &&
        Objects.equals(this.properties, appUser.properties) &&
        Objects.equals(this.conversationStarted, appUser.conversationStarted) &&
        Objects.equals(this.credentialRequired, appUser.credentialRequired) &&
        Objects.equals(this.clients, appUser.clients) &&
        Objects.equals(this.pendingClients, appUser.pendingClients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, givenName, surname, email, signedUpAt, properties, conversationStarted, credentialRequired, clients, pendingClients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    signedUpAt: ").append(toIndentedString(signedUpAt)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    conversationStarted: ").append(toIndentedString(conversationStarted)).append("\n");
    sb.append("    credentialRequired: ").append(toIndentedString(credentialRequired)).append("\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    pendingClients: ").append(toIndentedString(pendingClients)).append("\n");
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

