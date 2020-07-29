# smooch-java

The Java package for the Sunshine Conversations API

This SDK is automatically generated by the [OpenAPI Generator Codegen](https://github.com/OpenAPITools/openapi-generator) project using the [Smooch api spec](https://github.com/smooch/api-spec).

## Smooch API Version

The Smooch API offers multiple [versions](https://docs.smooch.io/guide/versioning/). Each release of this project targets one and only one Smooch API version. If you depend on an older version of the Smooch API, you may need to use an older release of this library. Use the table below as your guide:

| Smooch API version | `smooch-java` version to use |
|--------------------|------------------------------|
| `v2` [Early access only](https://docs.smooch.io/eap/v2-api-changelog.pdf) | `6.0.0-alpha` or newer      |
| `v1.1` [Upgrade guide](https://docs.smooch.io/guide/versioning/#upgrading-to-v11-from-v1) | `4.0.0` or `5.*`      |
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
    <version>6.0.0-alpha.5</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.smooch:api:6.0.0-alpha.5"
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

import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.api.ActivitiesApi;

import java.io.File;
import java.util.*;

public class ActivitiesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization (recommended): basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("API_KEY_ID");
        basicAuth.setPassword("API_KEY_SECRET");

        // Configure HTTP basic authorization (recommended): bearerAuth
        HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setUsername("API_KEY_ID");
        bearerAuth.setPassword("API_KEY_SECRET");

        ActivitiesApi apiInstance = new ActivitiesApi();
        ActivityPost activityPost = new ActivityPost(); // ActivityPost | 
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String conversationId = 029c31f25a21b47effd7be90; // String | Identifies the conversation.
        try {
            Object result = apiInstance.postActivity(activityPost, appId, conversationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#postActivity");
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
*ActivitiesApi* | [**postActivity**](docs/ActivitiesApi.md#postActivity) | **POST** /v2/apps/{appId}/conversations/{conversationId}/activity | Post Activity
*AppKeysApi* | [**createAppKey**](docs/AppKeysApi.md#createAppKey) | **POST** /v2/apps/{appId}/keys | Create App Key
*AppKeysApi* | [**deleteAppKey**](docs/AppKeysApi.md#deleteAppKey) | **DELETE** /v2/apps/{appId}/keys/{keyId} | Delete App Key
*AppKeysApi* | [**getAppKey**](docs/AppKeysApi.md#getAppKey) | **GET** /v2/apps/{appId}/keys/{keyId} | Get App Key
*AppKeysApi* | [**listAppKeys**](docs/AppKeysApi.md#listAppKeys) | **GET** /v2/apps/{appId}/keys | List App Keys
*AppsApi* | [**createApp**](docs/AppsApi.md#createApp) | **POST** /v2/apps | Create App
*AppsApi* | [**deleteApp**](docs/AppsApi.md#deleteApp) | **DELETE** /v2/apps/{appId} | Delete App
*AppsApi* | [**getApp**](docs/AppsApi.md#getApp) | **GET** /v2/apps/{appId} | Get App
*AppsApi* | [**listApps**](docs/AppsApi.md#listApps) | **GET** /v2/apps | List Apps
*AppsApi* | [**updateApp**](docs/AppsApi.md#updateApp) | **PUT** /v2/apps/{appId} | Update App
*ClientsApi* | [**createClient**](docs/ClientsApi.md#createClient) | **POST** /v2/apps/{appId}/users/{userId}/clients | Create Client
*ClientsApi* | [**listClients**](docs/ClientsApi.md#listClients) | **GET** /v2/apps/{appId}/users/{userId}/clients | List Clients
*ClientsApi* | [**removeClient**](docs/ClientsApi.md#removeClient) | **DELETE** /v2/apps/{appId}/users/{userId}/clients/{clientId} | Remove Client
*ConversationsApi* | [**createConversation**](docs/ConversationsApi.md#createConversation) | **POST** /v2/apps/{appId}/conversations | Create Conversation
*ConversationsApi* | [**deleteConversation**](docs/ConversationsApi.md#deleteConversation) | **DELETE** /v2/apps/{appId}/conversations/{conversationId} | Delete Conversation
*ConversationsApi* | [**getConversation**](docs/ConversationsApi.md#getConversation) | **GET** /v2/apps/{appId}/conversations/{conversationId} | Get Conversation
*ConversationsApi* | [**listConversations**](docs/ConversationsApi.md#listConversations) | **GET** /v2/apps/{appId}/conversations | List Conversations
*ConversationsApi* | [**updateConversation**](docs/ConversationsApi.md#updateConversation) | **PUT** /v2/apps/{appId}/conversations/{conversationId} | Update Conversation
*CustomIntegrationApiKeysApi* | [**createCustomIntegrationKey**](docs/CustomIntegrationApiKeysApi.md#createCustomIntegrationKey) | **POST** /v2/apps/{appId}/integrations/{integrationId}/keys | Create Integration Key
*CustomIntegrationApiKeysApi* | [**deleteCustomIntegrationKey**](docs/CustomIntegrationApiKeysApi.md#deleteCustomIntegrationKey) | **DELETE** /v2/apps/{appId}/integrations/{integrationId}/keys/{keyId} | Delete Integration Key
*CustomIntegrationApiKeysApi* | [**getCustomIntegrationKey**](docs/CustomIntegrationApiKeysApi.md#getCustomIntegrationKey) | **GET** /v2/apps/{appId}/integrations/{integrationId}/keys/{keyId} | Get Integration Key
*CustomIntegrationApiKeysApi* | [**listCustomIntegrationKeys**](docs/CustomIntegrationApiKeysApi.md#listCustomIntegrationKeys) | **GET** /v2/apps/{appId}/integrations/{integrationId}/keys | List Integration Keys
*IntegrationsApi* | [**createIntegration**](docs/IntegrationsApi.md#createIntegration) | **POST** /v2/apps/{appId}/integrations | Create Integration
*IntegrationsApi* | [**deleteIntegration**](docs/IntegrationsApi.md#deleteIntegration) | **DELETE** /v2/apps/{appId}/integrations/{integrationId} | Delete Integration
*IntegrationsApi* | [**getIntegration**](docs/IntegrationsApi.md#getIntegration) | **GET** /v2/apps/{appId}/integrations/{integrationId} | Get Integration
*IntegrationsApi* | [**listIntegrations**](docs/IntegrationsApi.md#listIntegrations) | **GET** /v2/apps/{appId}/integrations | List Integrations
*IntegrationsApi* | [**updateIntegration**](docs/IntegrationsApi.md#updateIntegration) | **PUT** /v2/apps/{appId}/integrations/{integrationId} | Update Integration
*MessagesApi* | [**deleteAllMessages**](docs/MessagesApi.md#deleteAllMessages) | **DELETE** /v2/apps/{appId}/conversations/{conversationId}/messages | Delete All Messages
*MessagesApi* | [**deleteMessage**](docs/MessagesApi.md#deleteMessage) | **DELETE** /v2/apps/{appId}/conversations/{conversationId}/messages/{messageId} | Delete Message
*MessagesApi* | [**listMessages**](docs/MessagesApi.md#listMessages) | **GET** /v2/apps/{appId}/conversations/{conversationId}/messages | List Messages
*MessagesApi* | [**postMessage**](docs/MessagesApi.md#postMessage) | **POST** /v2/apps/{appId}/conversations/{conversationId}/messages | Post Message
*ParticipantsApi* | [**joinConversation**](docs/ParticipantsApi.md#joinConversation) | **POST** /v2/apps/{appId}/conversations/{conversationId}/join | Join Conversation
*ParticipantsApi* | [**leaveConversation**](docs/ParticipantsApi.md#leaveConversation) | **POST** /v2/apps/{appId}/conversations/{conversationId}/leave | Leave Conversation
*ParticipantsApi* | [**listParticipants**](docs/ParticipantsApi.md#listParticipants) | **GET** /v2/apps/{appId}/conversations/{conversationId}/participants | List Participants
*SwitchboardActionsApi* | [**acceptControl**](docs/SwitchboardActionsApi.md#acceptControl) | **POST** /v2/apps/{appId}/conversations/{conversationId}/acceptControl | Accept Control
*SwitchboardActionsApi* | [**offerControl**](docs/SwitchboardActionsApi.md#offerControl) | **POST** /v2/apps/{appId}/conversations/{conversationId}/offerControl | Offer Control
*SwitchboardActionsApi* | [**passControl**](docs/SwitchboardActionsApi.md#passControl) | **POST** /v2/apps/{appId}/conversations/{conversationId}/passControl | Pass Control
*SwitchboardIntegrationsApi* | [**createSwitchboardIntegration**](docs/SwitchboardIntegrationsApi.md#createSwitchboardIntegration) | **POST** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations | Create Switchboard Integration
*SwitchboardIntegrationsApi* | [**deleteSwitchboardIntegration**](docs/SwitchboardIntegrationsApi.md#deleteSwitchboardIntegration) | **DELETE** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations/{switchboardIntegrationId} | Delete Switchboard Integration
*SwitchboardIntegrationsApi* | [**listSwitchboardIntegrations**](docs/SwitchboardIntegrationsApi.md#listSwitchboardIntegrations) | **GET** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations | List Switchboard Integrations
*SwitchboardIntegrationsApi* | [**updateSwitchboardIntegration**](docs/SwitchboardIntegrationsApi.md#updateSwitchboardIntegration) | **PATCH** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations/{switchboardIntegrationId} | Update Switchboard Integration
*SwitchboardsApi* | [**createSwitchboard**](docs/SwitchboardsApi.md#createSwitchboard) | **POST** /v2/apps/{appId}/switchboards | Create Switchboard
*SwitchboardsApi* | [**deleteSwitchboard**](docs/SwitchboardsApi.md#deleteSwitchboard) | **DELETE** /v2/apps/{appId}/switchboards/{switchboardId} | Delete Switchboard
*SwitchboardsApi* | [**listSwitchboards**](docs/SwitchboardsApi.md#listSwitchboards) | **GET** /v2/apps/{appId}/switchboards | List Switchboards
*SwitchboardsApi* | [**updateSwitchboard**](docs/SwitchboardsApi.md#updateSwitchboard) | **PATCH** /v2/apps/{appId}/switchboards/{switchboardId} | Update Switchboard


## Documentation for Models

 - [AcceptControlBody](docs/AcceptControlBody.md)
 - [Action](docs/Action.md)
 - [ActionSubset](docs/ActionSubset.md)
 - [ActivityPost](docs/ActivityPost.md)
 - [Android](docs/Android.md)
 - [AndroidAllOf](docs/AndroidAllOf.md)
 - [AndroidUpdate](docs/AndroidUpdate.md)
 - [ApiKey](docs/ApiKey.md)
 - [App](docs/App.md)
 - [AppCreateBody](docs/AppCreateBody.md)
 - [AppKey](docs/AppKey.md)
 - [AppKeyCreateBody](docs/AppKeyCreateBody.md)
 - [AppKeyListResponse](docs/AppKeyListResponse.md)
 - [AppKeyResponse](docs/AppKeyResponse.md)
 - [AppListResponse](docs/AppListResponse.md)
 - [AppResponse](docs/AppResponse.md)
 - [AppSettings](docs/AppSettings.md)
 - [AppUpdateBody](docs/AppUpdateBody.md)
 - [Author](docs/Author.md)
 - [Buy](docs/Buy.md)
 - [CarouselMessage](docs/CarouselMessage.md)
 - [CarouselMessageDisplaySettings](docs/CarouselMessageDisplaySettings.md)
 - [Client](docs/Client.md)
 - [ClientAssociation](docs/ClientAssociation.md)
 - [ClientCreate](docs/ClientCreate.md)
 - [ClientListResponse](docs/ClientListResponse.md)
 - [ClientResponse](docs/ClientResponse.md)
 - [ClientType](docs/ClientType.md)
 - [Confirmation](docs/Confirmation.md)
 - [Content](docs/Content.md)
 - [Conversation](docs/Conversation.md)
 - [ConversationCreateBody](docs/ConversationCreateBody.md)
 - [ConversationListResponse](docs/ConversationListResponse.md)
 - [ConversationResponse](docs/ConversationResponse.md)
 - [ConversationType](docs/ConversationType.md)
 - [ConversationUpdateBody](docs/ConversationUpdateBody.md)
 - [Custom](docs/Custom.md)
 - [CustomAllOf](docs/CustomAllOf.md)
 - [CustomUpdate](docs/CustomUpdate.md)
 - [CustomUpdateAllOf](docs/CustomUpdateAllOf.md)
 - [Destination](docs/Destination.md)
 - [Device](docs/Device.md)
 - [DeviceInfo](docs/DeviceInfo.md)
 - [ExtraChannelOptions](docs/ExtraChannelOptions.md)
 - [ExtraChannelOptionsMessenger](docs/ExtraChannelOptionsMessenger.md)
 - [Field](docs/Field.md)
 - [FileMessage](docs/FileMessage.md)
 - [Filter](docs/Filter.md)
 - [FormMessage](docs/FormMessage.md)
 - [FormResponseMessage](docs/FormResponseMessage.md)
 - [ImageMessage](docs/ImageMessage.md)
 - [Integration](docs/Integration.md)
 - [IntegrationApiKey](docs/IntegrationApiKey.md)
 - [IntegrationApiKeyListResponse](docs/IntegrationApiKeyListResponse.md)
 - [IntegrationApiKeyResponse](docs/IntegrationApiKeyResponse.md)
 - [IntegrationBase](docs/IntegrationBase.md)
 - [IntegrationId1](docs/IntegrationId1.md)
 - [IntegrationListResponse](docs/IntegrationListResponse.md)
 - [IntegrationResponse](docs/IntegrationResponse.md)
 - [IntegrationType1](docs/IntegrationType1.md)
 - [IntegrationUpdate](docs/IntegrationUpdate.md)
 - [IntegrationUpdateBase](docs/IntegrationUpdateBase.md)
 - [Ios](docs/Ios.md)
 - [IosAllOf](docs/IosAllOf.md)
 - [IosUpdate](docs/IosUpdate.md)
 - [Item](docs/Item.md)
 - [Line](docs/Line.md)
 - [LineAllOf](docs/LineAllOf.md)
 - [LineUpdate](docs/LineUpdate.md)
 - [Link](docs/Link.md)
 - [Links](docs/Links.md)
 - [ListMessage](docs/ListMessage.md)
 - [LocationMessage](docs/LocationMessage.md)
 - [LocationMessageCoordinates](docs/LocationMessageCoordinates.md)
 - [LocationMessageLocation](docs/LocationMessageLocation.md)
 - [LocationRequest](docs/LocationRequest.md)
 - [Mailgun](docs/Mailgun.md)
 - [MailgunAllOf](docs/MailgunAllOf.md)
 - [MailgunUpdate](docs/MailgunUpdate.md)
 - [MailgunUpdateAllOf](docs/MailgunUpdateAllOf.md)
 - [MatchCriteria](docs/MatchCriteria.md)
 - [Message](docs/Message.md)
 - [MessageBird](docs/MessageBird.md)
 - [MessageBirdAllOf](docs/MessageBirdAllOf.md)
 - [MessageBirdUpdate](docs/MessageBirdUpdate.md)
 - [MessageListResponse](docs/MessageListResponse.md)
 - [MessagePost](docs/MessagePost.md)
 - [MessagePostResponse](docs/MessagePostResponse.md)
 - [Messenger](docs/Messenger.md)
 - [MessengerAllOf](docs/MessengerAllOf.md)
 - [MessengerUpdate](docs/MessengerUpdate.md)
 - [MessengerUpdateAllOf](docs/MessengerUpdateAllOf.md)
 - [Meta](docs/Meta.md)
 - [OfferControlBody](docs/OfferControlBody.md)
 - [Page](docs/Page.md)
 - [Participant](docs/Participant.md)
 - [ParticipantJoinBody](docs/ParticipantJoinBody.md)
 - [ParticipantLeaveBody](docs/ParticipantLeaveBody.md)
 - [ParticipantLeaveBodyParticipantId](docs/ParticipantLeaveBodyParticipantId.md)
 - [ParticipantLeaveBodyUserExternalId](docs/ParticipantLeaveBodyUserExternalId.md)
 - [ParticipantLeaveBodyUserId](docs/ParticipantLeaveBodyUserId.md)
 - [ParticipantListResponse](docs/ParticipantListResponse.md)
 - [ParticipantResponse](docs/ParticipantResponse.md)
 - [ParticipantSubSchema](docs/ParticipantSubSchema.md)
 - [PassControlBody](docs/PassControlBody.md)
 - [Postback](docs/Postback.md)
 - [PrechatCapture](docs/PrechatCapture.md)
 - [QuotedMessage](docs/QuotedMessage.md)
 - [Reply](docs/Reply.md)
 - [Source](docs/Source.md)
 - [Status](docs/Status.md)
 - [Switchboard](docs/Switchboard.md)
 - [SwitchboardIntegration](docs/SwitchboardIntegration.md)
 - [SwitchboardIntegrationCreateBody](docs/SwitchboardIntegrationCreateBody.md)
 - [SwitchboardIntegrationListResponse](docs/SwitchboardIntegrationListResponse.md)
 - [SwitchboardIntegrationResponse](docs/SwitchboardIntegrationResponse.md)
 - [SwitchboardIntegrationUpdateBody](docs/SwitchboardIntegrationUpdateBody.md)
 - [SwitchboardListResponse](docs/SwitchboardListResponse.md)
 - [SwitchboardResponse](docs/SwitchboardResponse.md)
 - [SwitchboardUpdateBody](docs/SwitchboardUpdateBody.md)
 - [Target](docs/Target.md)
 - [Telegram](docs/Telegram.md)
 - [TelegramAllOf](docs/TelegramAllOf.md)
 - [TelegramUpdate](docs/TelegramUpdate.md)
 - [TextMessage](docs/TextMessage.md)
 - [Twilio](docs/Twilio.md)
 - [TwilioAllOf](docs/TwilioAllOf.md)
 - [TwilioUpdate](docs/TwilioUpdate.md)
 - [Twitter](docs/Twitter.md)
 - [TwitterAllOf](docs/TwitterAllOf.md)
 - [TwitterUpdate](docs/TwitterUpdate.md)
 - [Viber](docs/Viber.md)
 - [ViberAllOf](docs/ViberAllOf.md)
 - [ViberUpdate](docs/ViberUpdate.md)
 - [WeChat](docs/WeChat.md)
 - [WeChatAllOf](docs/WeChatAllOf.md)
 - [WeChatUpdate](docs/WeChatUpdate.md)
 - [Web](docs/Web.md)
 - [WebAllOf](docs/WebAllOf.md)
 - [WebUpdate](docs/WebUpdate.md)
 - [Webhook](docs/Webhook.md)
 - [Webview](docs/Webview.md)
 - [WhatsAppUpdate](docs/WhatsAppUpdate.md)
 - [WhatsAppUpdateAllOf](docs/WhatsAppUpdateAllOf.md)
 - [Whatsapp](docs/Whatsapp.md)
 - [WhatsappAllOf](docs/WhatsappAllOf.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication

### bearerAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues. Alternatively, configure the connectionPool to use a number of threads for the ApiClient. The default number is 20, but can be configured through the constructor `new ApiClient(30);`

## Copyright and license

Copyright 2018 Zendesk, Inc.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.