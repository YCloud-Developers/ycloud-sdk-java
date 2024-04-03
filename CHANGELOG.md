# Changelog

## 1.12.2 (2024-04-03)

- Add `regionCode` to the WhatsApp message object.

## 1.12.1 (2024-02-26)

- Rename WhatsApp template status `PENDING_DELETION` to `DELETED`.

## 1.12.0 (2024-02-22)

- Add WhatsApp [Mark message as read](https://docs.ycloud.com/reference/whatsapp_inbound_message-mark-as-read) endpoint.

## 1.11.2 (2024-01-30)

- Support WhatsApp [Interactive Location Request message](https://docs.ycloud.com/reference/whatsapp-messaging-examples#interactive-location-request-message).
- Support WhatsApp [Inbound Request Welcome message](https://docs.ycloud.com/reference/whatsapp-inbound-message-webhook-examples#inbound-request-welcome-message).

## 1.11.1 (2024-01-17)

- Add [Register a phone number](https://docs.ycloud.com/reference/whatsapp_phone_number-register) endpoint.
- Add parameter `externalId` to [Start a verification](https://docs.ycloud.com/reference/verification-send) endpoint.

## 1.11.0 (2023-12-25)

- Add Unsubscribers API.
- Add parameter `filterUnsubscribed` to the `POST /v2/whatsapp/messages` endpoint.

## 1.10.3 (2023-11-27)

- Support WhatsApp [Catalog template](https://docs.ycloud.com/reference/whatsapp-template-creation-examples#catalog-template) and [Catalog template message](https://docs.ycloud.com/reference/whatsapp-messaging-examples#catalog-template-message).
- Support WhatsApp [Multi-Product Message template](https://docs.ycloud.com/reference/whatsapp-template-creation-examples#multi-product-message-template) and [MPM template message](https://docs.ycloud.com/reference/whatsapp-messaging-examples#mpm-template-message).
- Support WhatsApp [Interactive Catalog message](https://docs.ycloud.com/reference/whatsapp-messaging-examples#interactive-catalog-message).
- Add the [Update commerce settings](https://docs.ycloud.com/reference/whatsapp_phone_number-update-commerce-settings) endpoint to enable or disable the shopping cart or the product catalog for a specific business phone number.

## 1.10.2 (2023-11-14)

- Rename some models for the WhatsApp carousel template and message.

## 1.10.1 (2023-11-02)

- Support WhatsApp Interactive CTA URL Button messages. See also [Interactive CTA URL Message Example](https://docs.ycloud.com/reference/whatsapp-messaging-examples#interactive-cta-url-message).
- Support WhatsApp [Limited-Time Offer template](https://docs.ycloud.com/reference/whatsapp-template-creation-examples#limited-time-offer-template) and [Limited-Time Offer template message](https://docs.ycloud.com/reference/whatsapp-messaging-examples#limited-time-offer-template-message).
- Support WhatsApp [Carousel template](https://docs.ycloud.com/reference/whatsapp-template-creation-examples#carousel-template) and [Carousel template message](https://docs.ycloud.com/reference/whatsapp-messaging-examples#carousel-template-message).
- Support WhatsApp [Zero-Tap Authentication template](https://docs.ycloud.com/reference/whatsapp-template-creation-examples#zero-tap-authentication-template).
- Add message time-to-live for authentication templates. Defaults to 600 seconds for newly created authentication templates.

## 1.10.0 (2023-10-19)

- Add webhook event type `whatsapp.business_account.deleted`, `whatsapp.phone_number.deleted`;
- Support WhatsApp [Coupon Templates](https://docs.ycloud.com/reference/whatsapp-template-creation-examples#marketing-template-with-copy-code-button);
- Support WhatsApp [Interactive CTA URL Button messages](https://docs.ycloud.com/reference/whatsapp-messaging-examples#interactive-cta-url-message);

## 1.9.1 (2023-09-14)

- Minor breaking changes: Models with `inner` in their name are renamed;

## 1.9.0 (2023-09-07)

- Add Contacts API.

## 1.8.3 (2023-07-05)

- Add `conversation.type` to the WhatsApp message object. If present, possible values are `FREE_ENTRY`, `FREE_TIER`, and `REGULAR`.
- Add `isOfficialBusinessAccount` to the WhatsApp phone number object.

## 1.8.2 (2023-05-26)

- Add webhook event type `whatsapp.template.quality_updated` to help you keep track of WhatsApp [Template Quality Rating](https://developers.facebook.com/docs/whatsapp/message-templates/guidelines/#quality-rating) updates.
- Add `quaityRating` to the WhatsApp Template object.

## 1.8.1 (2023-05-16)

- Support deleting a WhatsApp template by name and language.

## 1.8.0 (2023-05-15)

- Add WhatsApp messaging API `/v2/whatsapp/messages/sendDirectly`.
- Add `whatsappApiError` to response body `error` object.
- Add `qualityUpdateEvent` to WhatsApp Phone Number object.
- Add `sendTime`, `deliverTime` and `readTime` to WhatsApp Message object.
- Add new value `TIER_NOT_SET` to enum WhatsApp Phone Number `messagingLimit`.

## 1.7.0 (2023-3-28)

- Add webhook event type `whatsapp.template.category_updated` to keep track of template category changes. See also [First template category migration](https://developers.facebook.com/docs/whatsapp/updates-to-pricing/launch-timeline#first-template-category-migration).
- Add `previousCategory` field to WhatsApp template object.
- Add new WhatsApp conversation origin types: `authentication`, `marketing`, `utility`, and `service`. The switch to the new pricing model will be performed June 1, 2023. See also [New conversation rates](https://developers.facebook.com/docs/whatsapp/updates-to-pricing/launch-timeline#new-conversation-rates), effective June 1, 2023.
- Support creation for [Authentication Templates](https://developers.facebook.com/docs/whatsapp/business-management-api/authentication-templates), which will be available starting May 1, 2023.

## 1.6.1 (2023-03-09)

- Add WhatsApp template category `AUTHENTICATION` and `UTILITY`.
- Add `requestId` to response body `error` object.

## 1.6.0 (2023-03-03)

- Support WhatsApp `sticker` and `reaction` messages;
- Minor breaking changes: Models with `inner` in their name are renamed;

## 1.5.0 (2023-02-20)

- Add WhatsApp Business Phone Number Profile APIs.
- Add `bizType` for SMS, Voice, Email, and WhatsApp messages. 

## 1.4.4 (2023-02-07)

- Add `smsInbound` for webhook events.
- Add `whatsappApiError` for WhatsApp templates and messages.

## 1.4.2 (2022-12-28)

- Fix WhatsApp Business Accounts API response body.

## 1.4.1 (2022-12-27)

- Add `failed` status for SMS, Voice.
- Add `undelivered` status for Email.
- Add `pending` status for Webhook Endpoint.

## 1.4.0 (2022-12-13)

- Add WhatsApp Business Account APIs and webhooks.

## 1.3.0 (2022-11-18)

- Add [WhatsApp](https://www.ycloud.com/whatsapp) Edit Template API.
- Add `customerProfile` for WhatsApp inbound message webhooks.
- Add `conversation` for WhatsApp outbound message status webhooks.

## 1.2.0 (2022-10-27)

- Add [WhatsApp](https://www.ycloud.com/whatsapp) templates API.
- Add [WhatsApp](https://www.ycloud.com/whatsapp) phone numbers API.

## 1.1.0 (2022-10-14)

- Add [Verify](https://www.ycloud.com/verify) API.
- Add [WhatsApp](https://www.ycloud.com/whatsapp) Messages API.

## 1.0.0 (2022-07-04)

- Add SMS, Voice, and Email APIs.
