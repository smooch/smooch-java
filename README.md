# smooch-java

The Java package for the Smooch API

The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).

This SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project using the [Smooch api spec](https://github.com/smooch/api-spec).

## Smooch API Version

The Smooch API offers multiple [versions](https://docs.smooch.io/guide/versioning/). Each release of this project targets one and only one Smooch API version. If you depend on an older version of the Smooch API, you may need to use an older release of this library. Use the table below as your guide:

| Smooch API version | `smooch-java` version to use |
|--------------------|------------------------------|
| `v1.1` [Upgrade guide](https://docs.smooch.io/guide/versioning/#upgrading-to-v11-from-v1) | `4.0.0` or newer      |
| `v1`               | `3.*` or older               |

## Installation

### Maven users

Add the following remote repo to your project's POM:

```xml
<project ...>
<repositories>
    <repository>
      <id>smooch.io</id>
      <url>https://smoochorg.bintray.com/maven/</url>
    </repository>
 </repositories>
</project>
```

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.smooch</groupId>
    <artifactId>api</artifactId>
    <version>5.30.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.smooch:api:5.30.0"
```

## Getting Started

Familiarity with [Smooch API authentication](https://docs.smooch.io/guide/authentication-overview) is recommended.

### Basic Authentication (recommended)

With [basic authentication](https://docs.smooch.io/guide/basic-authentication), you can use your API key ID and secret to authenticate API requests. See below for a code sample.

### Authentication with JSON Web Tokens (JWTs)

See the [JSON Web Tokens (JWTs)](https://docs.smooch.io/guide/jwt) guide for more information and guidelines on when to use this method. In general, you'll want to favor using basic authentication.

To generate a JWT, use your API key ID and secret.

Using the [jjwt](https://github.com/jwtk/jjwt) package:

```java
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import io.jsonwebtoken.security.Keys;

import static io.jsonwebtoken.JwsHeader.KEY_ID;

// ...

String jwt = Jwts.builder()
    .claim("scope", "app")
    .setHeaderParam(KEY_ID, "YOUR_KEY_ID")
    .signWith(
        Keys.hmacShaKeyFor("YOUR_SECRET".getBytes()),
        SignatureAlgorithm.HS256
    )
    .compact();
```

### Running the code

```java

import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppApi;

import java.io.File;
import java.util.*;

public class AppApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization (recommended): basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("API_KEY_ID");
        basicAuth.setPassword("API_KEY_SECRET");


        // OR

        // Configure JWT authorization (alternative method): jwt
        ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
        jwt.setApiKey("YOUR JWT");
        jwt.setApiKeyPrefix("Bearer");

        AppApi apiInstance = new AppApi();
        AppCreate appCreateBody = new AppCreate(); // AppCreate | Body for a createApp request.
        try {
            AppResponse result = apiInstance.createApp(appCreateBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#createApp");
            e.printStackTrace();
        }
    }
}

```

### Region

Smooch is available in the following [regions](https://docs.smooch.io/rest/#region). The US region will be used by default. To target any other region, specify the region [API host](https://docs.smooch.io/rest/#region) in `setBasePath()`. For example:

```java
defaultClient.setBasePath("https://api.eu-1.smooch.io");
```

## Documentation for API Endpoints

All URIs are relative to *https://api.smooch.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppApi* | [**createApp**](docs/AppApi.md#createApp) | **POST** /v1.1/apps | 
*AppApi* | [**createSecretKey**](docs/AppApi.md#createSecretKey) | **POST** /v1.1/apps/{appId}/keys | 
*AppApi* | [**deleteApp**](docs/AppApi.md#deleteApp) | **DELETE** /v1.1/apps/{appId} | 
*AppApi* | [**deleteSecretKey**](docs/AppApi.md#deleteSecretKey) | **DELETE** /v1.1/apps/{appId}/keys/{keyId} | 
*AppApi* | [**getApp**](docs/AppApi.md#getApp) | **GET** /v1.1/apps/{appId} | 
*AppApi* | [**getAppJwt**](docs/AppApi.md#getAppJwt) | **GET** /v1.1/apps/{appId}/keys/{keyId}/jwt | 
*AppApi* | [**getSdkIds**](docs/AppApi.md#getSdkIds) | **GET** /v1.1/apps/{appId}/sdks | 
*AppApi* | [**getSecretKey**](docs/AppApi.md#getSecretKey) | **GET** /v1.1/apps/{appId}/keys/{keyId} | 
*AppApi* | [**listApps**](docs/AppApi.md#listApps) | **GET** /v1.1/apps | 
*AppApi* | [**listSecretKeys**](docs/AppApi.md#listSecretKeys) | **GET** /v1.1/apps/{appId}/keys | 
*AppApi* | [**updateApp**](docs/AppApi.md#updateApp) | **PUT** /v1.1/apps/{appId} | 
*AppUserApi* | [**deleteAppUser**](docs/AppUserApi.md#deleteAppUser) | **DELETE** /v1.1/apps/{appId}/appusers/{userId} | 
*AppUserApi* | [**deleteAppUserProfile**](docs/AppUserApi.md#deleteAppUserProfile) | **DELETE** /v1.1/apps/{appId}/appusers/{userId}/profile | 
*AppUserApi* | [**getAppUser**](docs/AppUserApi.md#getAppUser) | **GET** /v1.1/apps/{appId}/appusers/{userId} | 
*AppUserApi* | [**getAppUserAuthCode**](docs/AppUserApi.md#getAppUserAuthCode) | **GET** /v1.1/apps/{appId}/appusers/{userId}/authcode | 
*AppUserApi* | [**getAppUserBusinessSystemIds**](docs/AppUserApi.md#getAppUserBusinessSystemIds) | **GET** /v1.1/apps/{appId}/appusers/{userId}/businesssystems | 
*AppUserApi* | [**getAppUserEntityIds**](docs/AppUserApi.md#getAppUserEntityIds) | **GET** /v1.1/apps/{appId}/appusers/{userId}/channels | 
*AppUserApi* | [**getLinkRequests**](docs/AppUserApi.md#getLinkRequests) | **GET** /v1.1/apps/{appId}/appusers/{userId}/linkrequest | 
*AppUserApi* | [**linkAppUser**](docs/AppUserApi.md#linkAppUser) | **POST** /v1.1/apps/{appId}/appusers/{userId}/channels | 
*AppUserApi* | [**mergeUsers**](docs/AppUserApi.md#mergeUsers) | **POST** /v1.1/apps/{appId}/appusers/merge | 
*AppUserApi* | [**postImageMessage**](docs/AppUserApi.md#postImageMessage) | **POST** /v1.1/apps/{appId}/appusers/{userId}/images | 
*AppUserApi* | [**preCreateAppUser**](docs/AppUserApi.md#preCreateAppUser) | **POST** /v1.1/apps/{appId}/appusers | 
*AppUserApi* | [**unlinkAppUser**](docs/AppUserApi.md#unlinkAppUser) | **DELETE** /v1.1/apps/{appId}/appusers/{userId}/channels/{channel} | 
*AppUserApi* | [**updateAppUser**](docs/AppUserApi.md#updateAppUser) | **PUT** /v1.1/apps/{appId}/appusers/{userId} | 
*AttachmentsApi* | [**removeAttachment**](docs/AttachmentsApi.md#removeAttachment) | **POST** /v1.1/apps/{appId}/attachments/remove | 
*AttachmentsApi* | [**uploadAttachment**](docs/AttachmentsApi.md#uploadAttachment) | **POST** /v1.1/apps/{appId}/attachments | 
*ConversationApi* | [**conversationActivity**](docs/ConversationApi.md#conversationActivity) | **POST** /v1.1/apps/{appId}/appusers/{userId}/conversation/activity | 
*ConversationApi* | [**deleteMessage**](docs/ConversationApi.md#deleteMessage) | **DELETE** /v1.1/apps/{appId}/appusers/{userId}/messages/{messageId} | 
*ConversationApi* | [**deleteMessages**](docs/ConversationApi.md#deleteMessages) | **DELETE** /v1.1/apps/{appId}/appusers/{userId}/messages | 
*ConversationApi* | [**getMessages**](docs/ConversationApi.md#getMessages) | **GET** /v1.1/apps/{appId}/appusers/{userId}/messages | 
*ConversationApi* | [**postMessage**](docs/ConversationApi.md#postMessage) | **POST** /v1.1/apps/{appId}/appusers/{userId}/messages | 
*ConversationApi* | [**resetUnreadCount**](docs/ConversationApi.md#resetUnreadCount) | **POST** /v1.1/apps/{appId}/appusers/{userId}/conversation/read | 
*DeploymentApi* | [**activatePhoneNumber**](docs/DeploymentApi.md#activatePhoneNumber) | **POST** /v1.1/whatsapp/deployments/{deploymentId}/activate | 
*DeploymentApi* | [**confirmCode**](docs/DeploymentApi.md#confirmCode) | **POST** /v1.1/whatsapp/deployments/{deploymentId}/code/confirm | 
*DeploymentApi* | [**createDeployment**](docs/DeploymentApi.md#createDeployment) | **POST** /v1.1/whatsapp/deployments | 
*DeploymentApi* | [**deleteDeployment**](docs/DeploymentApi.md#deleteDeployment) | **DELETE** /v1.1/whatsapp/deployments/{deploymentId} | 
*DeploymentApi* | [**getDeployment**](docs/DeploymentApi.md#getDeployment) | **GET** /v1.1/whatsapp/deployments/{deploymentId} | 
*DeploymentApi* | [**listDeployments**](docs/DeploymentApi.md#listDeployments) | **GET** /v1.1/whatsapp/deployments | 
*IntegrationApi* | [**createIntegration**](docs/IntegrationApi.md#createIntegration) | **POST** /v1.1/apps/{appId}/integrations | 
*IntegrationApi* | [**createIntegrationMenu**](docs/IntegrationApi.md#createIntegrationMenu) | **POST** /v1.1/apps/{appId}/integrations/{integrationId}/menu | 
*IntegrationApi* | [**deleteIntegration**](docs/IntegrationApi.md#deleteIntegration) | **DELETE** /v1.1/apps/{appId}/integrations/{integrationId} | 
*IntegrationApi* | [**deleteIntegrationMenu**](docs/IntegrationApi.md#deleteIntegrationMenu) | **DELETE** /v1.1/apps/{appId}/integrations/{integrationId}/menu | 
*IntegrationApi* | [**getIntegration**](docs/IntegrationApi.md#getIntegration) | **GET** /v1.1/apps/{appId}/integrations/{integrationId} | 
*IntegrationApi* | [**getIntegrationMenu**](docs/IntegrationApi.md#getIntegrationMenu) | **GET** /v1.1/apps/{appId}/integrations/{integrationId}/menu | 
*IntegrationApi* | [**getIntegrationProfile**](docs/IntegrationApi.md#getIntegrationProfile) | **GET** /v1.1/apps/{appId}/integrations/{integrationId}/profile | 
*IntegrationApi* | [**listIntegrations**](docs/IntegrationApi.md#listIntegrations) | **GET** /v1.1/apps/{appId}/integrations | 
*IntegrationApi* | [**updateIntegration**](docs/IntegrationApi.md#updateIntegration) | **PUT** /v1.1/apps/{appId}/integrations/{integrationId} | 
*IntegrationApi* | [**updateIntegrationMenu**](docs/IntegrationApi.md#updateIntegrationMenu) | **PUT** /v1.1/apps/{appId}/integrations/{integrationId}/menu | 
*IntegrationApi* | [**updateIntegrationProfile**](docs/IntegrationApi.md#updateIntegrationProfile) | **PUT** /v1.1/apps/{appId}/integrations/{integrationId}/profile | 
*IntegrationApi* | [**uploadIntegrationProfilePhoto**](docs/IntegrationApi.md#uploadIntegrationProfilePhoto) | **PUT** /v1.1/apps/{appId}/integrations/{integrationId}/profile/photo | 
*MenuApi* | [**deleteMenu**](docs/MenuApi.md#deleteMenu) | **DELETE** /v1.1/apps/{appId}/menu | 
*MenuApi* | [**getMenu**](docs/MenuApi.md#getMenu) | **GET** /v1.1/apps/{appId}/menu | 
*MenuApi* | [**updateMenu**](docs/MenuApi.md#updateMenu) | **PUT** /v1.1/apps/{appId}/menu | 
*NotificationApi* | [**postNotification**](docs/NotificationApi.md#postNotification) | **POST** /v1/apps/{appId}/notifications | 
*ServiceAccountApi* | [**createSecretKey**](docs/ServiceAccountApi.md#createSecretKey) | **POST** /v1.1/serviceaccounts/{serviceAccountId}/keys | 
*ServiceAccountApi* | [**createServiceAccount**](docs/ServiceAccountApi.md#createServiceAccount) | **POST** /v1.1/serviceaccounts | 
*ServiceAccountApi* | [**deleteSecretKey**](docs/ServiceAccountApi.md#deleteSecretKey) | **DELETE** /v1.1/serviceaccounts/{serviceAccountId}/keys/{keyId} | 
*ServiceAccountApi* | [**deleteServiceAccount**](docs/ServiceAccountApi.md#deleteServiceAccount) | **DELETE** /v1.1/serviceaccounts/{serviceAccountId} | 
*ServiceAccountApi* | [**getJwt**](docs/ServiceAccountApi.md#getJwt) | **GET** /v1.1/serviceaccounts/{serviceAccountId}/keys/{keyId}/jwt | 
*ServiceAccountApi* | [**getSecretKey**](docs/ServiceAccountApi.md#getSecretKey) | **GET** /v1.1/serviceaccounts/{serviceAccountId}/keys/{keyId} | 
*ServiceAccountApi* | [**getServiceAccount**](docs/ServiceAccountApi.md#getServiceAccount) | **GET** /v1.1/serviceaccounts/{serviceAccountId} | 
*ServiceAccountApi* | [**listSecretKeys**](docs/ServiceAccountApi.md#listSecretKeys) | **GET** /v1.1/serviceaccounts/{serviceAccountId}/keys | 
*ServiceAccountApi* | [**listServiceAccounts**](docs/ServiceAccountApi.md#listServiceAccounts) | **GET** /v1.1/serviceaccounts | 
*ServiceAccountApi* | [**updateServiceAccount**](docs/ServiceAccountApi.md#updateServiceAccount) | **PUT** /v1.1/serviceaccounts/{serviceAccountId} | 
*TemplateApi* | [**createTemplate**](docs/TemplateApi.md#createTemplate) | **POST** /v1.1/apps/{appId}/templates | 
*TemplateApi* | [**deleteTemplate**](docs/TemplateApi.md#deleteTemplate) | **DELETE** /v1.1/apps/{appId}/templates/{templateId} | 
*TemplateApi* | [**getTemplate**](docs/TemplateApi.md#getTemplate) | **GET** /v1.1/apps/{appId}/templates/{templateId} | 
*TemplateApi* | [**listTemplates**](docs/TemplateApi.md#listTemplates) | **GET** /v1.1/apps/{appId}/templates | 
*TemplateApi* | [**updateTemplate**](docs/TemplateApi.md#updateTemplate) | **PUT** /v1.1/apps/{appId}/templates/{templateId} | 
*WebhookApi* | [**createWebhook**](docs/WebhookApi.md#createWebhook) | **POST** /v1.1/apps/{appId}/webhooks | 
*WebhookApi* | [**deleteWebhook**](docs/WebhookApi.md#deleteWebhook) | **DELETE** /v1.1/apps/{appId}/webhooks/{webhookId} | 
*WebhookApi* | [**getWebhook**](docs/WebhookApi.md#getWebhook) | **GET** /v1.1/apps/{appId}/webhooks/{webhookId} | 
*WebhookApi* | [**listWebhooks**](docs/WebhookApi.md#listWebhooks) | **GET** /v1.1/apps/{appId}/webhooks | 
*WebhookApi* | [**updateWebhook**](docs/WebhookApi.md#updateWebhook) | **PUT** /v1.1/apps/{appId}/webhooks/{webhookId} | 


## Documentation for Models

 - [Action](docs/Action.md)
 - [ActivityResponse](docs/ActivityResponse.md)
 - [App](docs/App.md)
 - [AppCreate](docs/AppCreate.md)
 - [AppResponse](docs/AppResponse.md)
 - [AppSettings](docs/AppSettings.md)
 - [AppUpdate](docs/AppUpdate.md)
 - [AppUser](docs/AppUser.md)
 - [AppUserBusinessSystemsResponse](docs/AppUserBusinessSystemsResponse.md)
 - [AppUserChannelsResponse](docs/AppUserChannelsResponse.md)
 - [AppUserLink](docs/AppUserLink.md)
 - [AppUserMerge](docs/AppUserMerge.md)
 - [AppUserPreCreate](docs/AppUserPreCreate.md)
 - [AppUserResponse](docs/AppUserResponse.md)
 - [AppUserUpdate](docs/AppUserUpdate.md)
 - [AttachmentRemove](docs/AttachmentRemove.md)
 - [AttachmentResponse](docs/AttachmentResponse.md)
 - [AuthCodeResponse](docs/AuthCodeResponse.md)
 - [Author](docs/Author.md)
 - [BusinessSystemItem](docs/BusinessSystemItem.md)
 - [ChannelEntityItem](docs/ChannelEntityItem.md)
 - [Client](docs/Client.md)
 - [ClientInfo](docs/ClientInfo.md)
 - [Confirmation](docs/Confirmation.md)
 - [Conversation](docs/Conversation.md)
 - [ConversationActivity](docs/ConversationActivity.md)
 - [Coordinates](docs/Coordinates.md)
 - [Deployment](docs/Deployment.md)
 - [DeploymentActivatePhoneNumber](docs/DeploymentActivatePhoneNumber.md)
 - [DeploymentConfirmCode](docs/DeploymentConfirmCode.md)
 - [DeploymentCreate](docs/DeploymentCreate.md)
 - [DeploymentResponse](docs/DeploymentResponse.md)
 - [Destination](docs/Destination.md)
 - [DisplaySettings](docs/DisplaySettings.md)
 - [Enums](docs/Enums.md)
 - [Field](docs/Field.md)
 - [FieldPost](docs/FieldPost.md)
 - [GetIntegrationProfileResponse](docs/GetIntegrationProfileResponse.md)
 - [GetMessagesResponse](docs/GetMessagesResponse.md)
 - [GetSdkIdsResponse](docs/GetSdkIdsResponse.md)
 - [Integration](docs/Integration.md)
 - [IntegrationCreate](docs/IntegrationCreate.md)
 - [IntegrationProfileUpdate](docs/IntegrationProfileUpdate.md)
 - [IntegrationResponse](docs/IntegrationResponse.md)
 - [IntegrationUpdate](docs/IntegrationUpdate.md)
 - [JwtResponse](docs/JwtResponse.md)
 - [LinkRequestResponse](docs/LinkRequestResponse.md)
 - [LinkRequestResponseLinkRequests](docs/LinkRequestResponseLinkRequests.md)
 - [ListAppsResponse](docs/ListAppsResponse.md)
 - [ListDeploymentsResponse](docs/ListDeploymentsResponse.md)
 - [ListIntegrationsResponse](docs/ListIntegrationsResponse.md)
 - [ListSecretKeysResponse](docs/ListSecretKeysResponse.md)
 - [ListServiceAccountsResponse](docs/ListServiceAccountsResponse.md)
 - [ListTemplatesResponse](docs/ListTemplatesResponse.md)
 - [ListWebhooksResponse](docs/ListWebhooksResponse.md)
 - [Location](docs/Location.md)
 - [Menu](docs/Menu.md)
 - [MenuItem](docs/MenuItem.md)
 - [MenuResponse](docs/MenuResponse.md)
 - [MergedUser](docs/MergedUser.md)
 - [Message](docs/Message.md)
 - [MessageItem](docs/MessageItem.md)
 - [MessageOverride](docs/MessageOverride.md)
 - [MessageOverrideLine](docs/MessageOverrideLine.md)
 - [MessageOverrideMessenger](docs/MessageOverrideMessenger.md)
 - [MessageOverrideWhatsapp](docs/MessageOverrideWhatsapp.md)
 - [MessagePost](docs/MessagePost.md)
 - [MessageResponse](docs/MessageResponse.md)
 - [NotificationPost](docs/NotificationPost.md)
 - [NotificationPostDestination](docs/NotificationPostDestination.md)
 - [NotificationResponse](docs/NotificationResponse.md)
 - [NotificationResponseNotification](docs/NotificationResponseNotification.md)
 - [Option](docs/Option.md)
 - [QuotedMessage](docs/QuotedMessage.md)
 - [SecretKey](docs/SecretKey.md)
 - [SecretKeyCreate](docs/SecretKeyCreate.md)
 - [SecretKeyResponse](docs/SecretKeyResponse.md)
 - [Select](docs/Select.md)
 - [ServiceAccount](docs/ServiceAccount.md)
 - [ServiceAccountCreate](docs/ServiceAccountCreate.md)
 - [ServiceAccountResponse](docs/ServiceAccountResponse.md)
 - [ServiceAccountUpdate](docs/ServiceAccountUpdate.md)
 - [Source](docs/Source.md)
 - [SubMenuItem](docs/SubMenuItem.md)
 - [Template](docs/Template.md)
 - [TemplateCreate](docs/TemplateCreate.md)
 - [TemplateResponse](docs/TemplateResponse.md)
 - [TemplateUpdate](docs/TemplateUpdate.md)
 - [UploadIntegrationProfilePhotoResponse](docs/UploadIntegrationProfilePhotoResponse.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookCreate](docs/WebhookCreate.md)
 - [WebhookResponse](docs/WebhookResponse.md)
 - [WebhookUpdate](docs/WebhookUpdate.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication

### jwt

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Copyright and license

Copyright 2018 Zendesk, Inc.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
