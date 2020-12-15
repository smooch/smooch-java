# Changelog

## [9.4.0] - 2020-12-15

### Added

- Added a new user profile field `locale`.

## [9.3.0] - 2020-11-18

### Added

- Added a new optional field `altText` to the [message schema](https://docs.smooch.io/rest/#operation/postMessage) when sending an image or a file.

## [9.2.0] - 2020-11-16

### Added

- Added support for Instagram Direct

## [9.1.1] - 2020-11-11

### Fixed

- Fixed `bearerToken` issue in some endpoints

## [9.1.0] - 2020-11-11

### Added

- Added Sunshine Conversations Connect and Oauth endpoints

### Changed

- Changed the `mediaUrl` field to be required for `file` and `image` messages
- Changed coordinates fields to be required in `location` messages
- Updated the RESTEasy library to the latest version `4.5.8.Final`

### Fixed

- Fixed the HTTP method used for `/attachments/cookie` from POST to GET
- Fixed the comment headers in the models having a long description
- Fixed generation for endpoints with no parameters

## [9.0.1] - 2020-10-19

### Added

- Added `messageSchema` property to the `POST /messages` endpoint for [whatsapp template messages](https://docs.smooch.io/guide/whatsapp/#post-message-api).

### Changed

- Renamed `canUserCreateConversation` to `canUserCreateMoreConversations` in the Android/Ios integrations.

## [9.0.0] - 2020-10-01

### Added

- API wrappers for the v2 Sunshine Conversations API