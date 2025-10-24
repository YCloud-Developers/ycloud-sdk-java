# YCloud SDK for Java

YCloud API
- API version: v2

The [YCloud](https://ycloud.com) API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer). Our API is designed to have predictable, resource-oriented URLs, return [JSON](https://www.json.org) responses, and use standard HTTP response codes and verbs.


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.ycloud</groupId>
  <artifactId>ycloud-sdk-java</artifactId>
  <version>1.15.7</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'ycloud-sdk-java' jar has been published to maven central.
    mavenLocal()       // Needed if the 'ycloud-sdk-java' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.ycloud:ycloud-sdk-java:1.15.7"
  }
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.Configuration;
import com.ycloud.client.auth.*;
import com.ycloud.client.models.*;
import com.ycloud.client.api.BalanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ycloud.com/v2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");

    BalanceApi apiInstance = new BalanceApi(defaultClient);
    try {
      Balance result = apiInstance.retrieve();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceApi#retrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.ycloud.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BalanceApi* | [**retrieve**](docs/BalanceApi.md#retrieve) | **GET** /balance | Retrieve balance
*ContactsApi* | [**attributesList**](docs/ContactsApi.md#attributesList) | **GET** /contact/contacts/attributes | List contact attributes
*ContactsApi* | [**create**](docs/ContactsApi.md#create) | **POST** /contact/contacts | Create a contact
*ContactsApi* | [**delete**](docs/ContactsApi.md#delete) | **DELETE** /contact/contacts/{id} | Delete a contact
*ContactsApi* | [**list**](docs/ContactsApi.md#list) | **GET** /contact/contacts | List contacts
*ContactsApi* | [**retrieve**](docs/ContactsApi.md#retrieve) | **GET** /contact/contacts/{id} | Retrieve a contact
*ContactsApi* | [**update**](docs/ContactsApi.md#update) | **PATCH** /contact/contacts/{id} | Update a contact
*CustomEventsApi* | [**createDefinition**](docs/CustomEventsApi.md#createDefinition) | **POST** /event/definitions | Create an event definition
*CustomEventsApi* | [**createPropertyDefinition**](docs/CustomEventsApi.md#createPropertyDefinition) | **POST** /event/definitions/{name}/properties | Create an event property definition
*CustomEventsApi* | [**propertyDefinition**](docs/CustomEventsApi.md#propertyDefinition) | **DELETE** /event/definitions/{name}/properties/{propertyName} | Delete an event property definition
*CustomEventsApi* | [**propertyDefinition_0**](docs/CustomEventsApi.md#propertyDefinition_0) | **PATCH** /event/definitions/{name}/properties/{propertyName} | Update an event property definition
*CustomEventsApi* | [**retrieveDefinition**](docs/CustomEventsApi.md#retrieveDefinition) | **GET** /event/definitions/{name} | Retrieve an event definition
*CustomEventsApi* | [**sendEvent**](docs/CustomEventsApi.md#sendEvent) | **POST** /event/events | Send an event
*CustomEventsApi* | [**updateDefinition**](docs/CustomEventsApi.md#updateDefinition) | **PATCH** /event/definitions/{name} | Update an event definition
*EmailsApi* | [**send**](docs/EmailsApi.md#send) | **POST** /emails | Send an email
*SmsApi* | [**list**](docs/SmsApi.md#list) | **GET** /sms | List SMS records
*SmsApi* | [**send**](docs/SmsApi.md#send) | **POST** /sms | Send an SMS
*UnsubscribersApi* | [**create**](docs/UnsubscribersApi.md#create) | **POST** /unsubscribers | Create an unsubscriber
*UnsubscribersApi* | [**deleteByCustomerAndChannel**](docs/UnsubscribersApi.md#deleteByCustomerAndChannel) | **DELETE** /unsubscribers/{customer}/{channel} | Delete an unsubscriber
*UnsubscribersApi* | [**list**](docs/UnsubscribersApi.md#list) | **GET** /unsubscribers | List unsubscribers
*UnsubscribersApi* | [**listAllByCustomer**](docs/UnsubscribersApi.md#listAllByCustomer) | **GET** /unsubscribers/{customer} | List all unsubscribers by customer
*UnsubscribersApi* | [**retrieveByCustomerAndChannel**](docs/UnsubscribersApi.md#retrieveByCustomerAndChannel) | **GET** /unsubscribers/{customer}/{channel} | Retrieve an unsubscriber
*VerifyApi* | [**check**](docs/VerifyApi.md#check) | **POST** /verify/verificationChecks | Check a verification
*VerifyApi* | [**send**](docs/VerifyApi.md#send) | **POST** /verify/verifications | Start a verification
*VoicesApi* | [**list**](docs/VoicesApi.md#list) | **GET** /voices | List voice records
*VoicesApi* | [**send**](docs/VoicesApi.md#send) | **POST** /voices | Send a voice code
*WebhookEndpointsApi* | [**create**](docs/WebhookEndpointsApi.md#create) | **POST** /webhookEndpoints | Create a webhook endpoint
*WebhookEndpointsApi* | [**delete**](docs/WebhookEndpointsApi.md#delete) | **DELETE** /webhookEndpoints/{id} | Delete a webhook endpoint
*WebhookEndpointsApi* | [**list**](docs/WebhookEndpointsApi.md#list) | **GET** /webhookEndpoints | List webhook endpoints
*WebhookEndpointsApi* | [**retrieve**](docs/WebhookEndpointsApi.md#retrieve) | **GET** /webhookEndpoints/{id} | Retrieve a webhook endpoint
*WebhookEndpointsApi* | [**rotateSecret**](docs/WebhookEndpointsApi.md#rotateSecret) | **POST** /webhookEndpoints/{id}/rotateSecret | Rotate a webhook endpoint secret
*WebhookEndpointsApi* | [**update**](docs/WebhookEndpointsApi.md#update) | **PATCH** /webhookEndpoints/{id} | Update a webhook endpoint
*WhatsappBusinessAccountsApi* | [**list**](docs/WhatsappBusinessAccountsApi.md#list) | **GET** /whatsapp/businessAccounts | List WABAs
*WhatsappBusinessAccountsApi* | [**retrieve**](docs/WhatsappBusinessAccountsApi.md#retrieve) | **GET** /whatsapp/businessAccounts/{id} | Retrieve a WABA
*WhatsappCallingApi* | [**accept**](docs/WhatsappCallingApi.md#accept) | **POST** /whatsapp/calls/accept | Accept a call
*WhatsappCallingApi* | [**connect**](docs/WhatsappCallingApi.md#connect) | **POST** /whatsapp/calls/connect | Connect a call
*WhatsappCallingApi* | [**preAccept**](docs/WhatsappCallingApi.md#preAccept) | **POST** /whatsapp/calls/preAccept | Pre-accept a call
*WhatsappCallingApi* | [**reject**](docs/WhatsappCallingApi.md#reject) | **POST** /whatsapp/calls/reject | Reject a call
*WhatsappCallingApi* | [**terminate**](docs/WhatsappCallingApi.md#terminate) | **POST** /whatsapp/calls/terminate | Terminate a call
*WhatsappFlowsApi* | [**create**](docs/WhatsappFlowsApi.md#create) | **POST** /whatsapp/flows | Create a flow
*WhatsappFlowsApi* | [**delete**](docs/WhatsappFlowsApi.md#delete) | **DELETE** /whatsapp/flows/{flowId} | Delete a flow
*WhatsappFlowsApi* | [**deprecate**](docs/WhatsappFlowsApi.md#deprecate) | **POST** /whatsapp/flows/{flowId}/deprecate | Deprecate a flow
*WhatsappFlowsApi* | [**list**](docs/WhatsappFlowsApi.md#list) | **GET** /whatsapp/flows | List flows
*WhatsappFlowsApi* | [**preview**](docs/WhatsappFlowsApi.md#preview) | **GET** /whatsapp/flows/{flowId}/preview | generate a web preview URL with this flow.
*WhatsappFlowsApi* | [**publish**](docs/WhatsappFlowsApi.md#publish) | **POST** /whatsapp/flows/{flowId}/publish | Publish a flow
*WhatsappFlowsApi* | [**retrieve**](docs/WhatsappFlowsApi.md#retrieve) | **GET** /whatsapp/flows/{flowId} | Retrieve a flow
*WhatsappFlowsApi* | [**updateMetadata**](docs/WhatsappFlowsApi.md#updateMetadata) | **PATCH** /whatsapp/flows/{flowId}/metadata | Update flow metadata
*WhatsappFlowsApi* | [**updateStructure**](docs/WhatsappFlowsApi.md#updateStructure) | **PATCH** /whatsapp/flows/{flowId}/assets | Update flow structure
*WhatsappInboundMessagesApi* | [**markAsRead**](docs/WhatsappInboundMessagesApi.md#markAsRead) | **POST** /whatsapp/inboundMessages/{id}/markAsRead | Mark message as read
*WhatsappInboundMessagesApi* | [**typingIndicator**](docs/WhatsappInboundMessagesApi.md#typingIndicator) | **POST** /whatsapp/inboundMessages/{id}/typingIndicator | Mark message as read and display a typing indicator
*WhatsappMediaApi* | [**upload**](docs/WhatsappMediaApi.md#upload) | **POST** /whatsapp/media/{phoneNumber}/upload | Upload media
*WhatsappMessagesApi* | [**retrieve**](docs/WhatsappMessagesApi.md#retrieve) | **GET** /whatsapp/messages/{id} | Retrieve a message
*WhatsappMessagesApi* | [**send**](docs/WhatsappMessagesApi.md#send) | **POST** /whatsapp/messages | Enqueue a message
*WhatsappMessagesApi* | [**sendDirectly**](docs/WhatsappMessagesApi.md#sendDirectly) | **POST** /whatsapp/messages/sendDirectly | Send a message directly
*WhatsappPhoneNumbersApi* | [**list**](docs/WhatsappPhoneNumbersApi.md#list) | **GET** /whatsapp/phoneNumbers | List phone numbers
*WhatsappPhoneNumbersApi* | [**register**](docs/WhatsappPhoneNumbersApi.md#register) | **POST** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/register | Register a phone number
*WhatsappPhoneNumbersApi* | [**retrieve**](docs/WhatsappPhoneNumbersApi.md#retrieve) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber} | Retrieve a phone number
*WhatsappPhoneNumbersApi* | [**retrieveCommerceSettings**](docs/WhatsappPhoneNumbersApi.md#retrieveCommerceSettings) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/whatsappCommerceSettings | Retrieve commerce settings
*WhatsappPhoneNumbersApi* | [**retrieveProfile**](docs/WhatsappPhoneNumbersApi.md#retrieveProfile) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/profile | Retrieve a phone number profile
*WhatsappPhoneNumbersApi* | [**retrieveSettings**](docs/WhatsappPhoneNumbersApi.md#retrieveSettings) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/settings | Retrieve phone number settings
*WhatsappPhoneNumbersApi* | [**saveSettings**](docs/WhatsappPhoneNumbersApi.md#saveSettings) | **POST** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/settings | Save phone number settings
*WhatsappPhoneNumbersApi* | [**updateCommerceSettings**](docs/WhatsappPhoneNumbersApi.md#updateCommerceSettings) | **PATCH** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/whatsappCommerceSettings | Update commerce settings
*WhatsappPhoneNumbersApi* | [**updateDisplayName**](docs/WhatsappPhoneNumbersApi.md#updateDisplayName) | **PATCH** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/displayName | Update a phone number display name
*WhatsappPhoneNumbersApi* | [**updateProfile**](docs/WhatsappPhoneNumbersApi.md#updateProfile) | **PATCH** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber}/profile | Update a phone number profile
*WhatsappTemplatesApi* | [**create**](docs/WhatsappTemplatesApi.md#create) | **POST** /whatsapp/templates | Create a template
*WhatsappTemplatesApi* | [**deleteByName**](docs/WhatsappTemplatesApi.md#deleteByName) | **DELETE** /whatsapp/templates/{wabaId}/{name} | Delete templates by name
*WhatsappTemplatesApi* | [**deleteByNameAndLanguage**](docs/WhatsappTemplatesApi.md#deleteByNameAndLanguage) | **DELETE** /whatsapp/templates/{wabaId}/{name}/{language} | Delete a template
*WhatsappTemplatesApi* | [**editByNameAndLanguage**](docs/WhatsappTemplatesApi.md#editByNameAndLanguage) | **PATCH** /whatsapp/templates/{wabaId}/{name}/{language} | Edit a template
*WhatsappTemplatesApi* | [**list**](docs/WhatsappTemplatesApi.md#list) | **GET** /whatsapp/templates | List templates
*WhatsappTemplatesApi* | [**retrieveByNameAndLanguage**](docs/WhatsappTemplatesApi.md#retrieveByNameAndLanguage) | **GET** /whatsapp/templates/{wabaId}/{name}/{language} | Retrieve a template


## Documentation for Models

 - [AttributeChangeAction](docs/AttributeChangeAction.md)
 - [Balance](docs/Balance.md)
 - [Contact](docs/Contact.md)
 - [ContactAttribute](docs/ContactAttribute.md)
 - [ContactAttributeChange](docs/ContactAttributeChange.md)
 - [ContactAttributesChanged](docs/ContactAttributesChanged.md)
 - [ContactCreateRequest](docs/ContactCreateRequest.md)
 - [ContactCreated](docs/ContactCreated.md)
 - [ContactCustomAttribute](docs/ContactCustomAttribute.md)
 - [ContactDeleted](docs/ContactDeleted.md)
 - [ContactPage](docs/ContactPage.md)
 - [ContactSourceType](docs/ContactSourceType.md)
 - [ContactUnsubscribeCreated](docs/ContactUnsubscribeCreated.md)
 - [ContactUnsubscribeDeleted](docs/ContactUnsubscribeDeleted.md)
 - [ContactUpdateRequest](docs/ContactUpdateRequest.md)
 - [CustomEventDefinition](docs/CustomEventDefinition.md)
 - [CustomEventDefinitionCreateRequest](docs/CustomEventDefinitionCreateRequest.md)
 - [CustomEventDefinitionProperty](docs/CustomEventDefinitionProperty.md)
 - [CustomEventDefinitionPropertyCreateRequest](docs/CustomEventDefinitionPropertyCreateRequest.md)
 - [CustomEventDefinitionPropertyUpdateRequest](docs/CustomEventDefinitionPropertyUpdateRequest.md)
 - [CustomEventDefinitionUpdateRequest](docs/CustomEventDefinitionUpdateRequest.md)
 - [CustomEventSendRequest](docs/CustomEventSendRequest.md)
 - [Email](docs/Email.md)
 - [EmailContentType](docs/EmailContentType.md)
 - [EmailDelivery](docs/EmailDelivery.md)
 - [EmailSendRequest](docs/EmailSendRequest.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Event](docs/Event.md)
 - [EventProperty](docs/EventProperty.md)
 - [EventType](docs/EventType.md)
 - [Mailbox](docs/Mailbox.md)
 - [MetaBusinessAccountVerificationStatus](docs/MetaBusinessAccountVerificationStatus.md)
 - [Page](docs/Page.md)
 - [PageCursor](docs/PageCursor.md)
 - [Sms](docs/Sms.md)
 - [SmsInbound](docs/SmsInbound.md)
 - [SmsPage](docs/SmsPage.md)
 - [SmsSendRequest](docs/SmsSendRequest.md)
 - [Unsubscriber](docs/Unsubscriber.md)
 - [UnsubscriberChannel](docs/UnsubscriberChannel.md)
 - [UnsubscriberCreateRequest](docs/UnsubscriberCreateRequest.md)
 - [UnsubscriberPage](docs/UnsubscriberPage.md)
 - [UnsubscriberType](docs/UnsubscriberType.md)
 - [Verification](docs/Verification.md)
 - [VerificationChannel](docs/VerificationChannel.md)
 - [VerificationCheck](docs/VerificationCheck.md)
 - [VerificationCheckRequest](docs/VerificationCheckRequest.md)
 - [VerificationFallback](docs/VerificationFallback.md)
 - [VerificationSendRequest](docs/VerificationSendRequest.md)
 - [VerificationStatus](docs/VerificationStatus.md)
 - [Voice](docs/Voice.md)
 - [VoicePage](docs/VoicePage.md)
 - [VoiceSendRequest](docs/VoiceSendRequest.md)
 - [WebhookEndpoint](docs/WebhookEndpoint.md)
 - [WebhookEndpointCreateRequest](docs/WebhookEndpointCreateRequest.md)
 - [WebhookEndpointPage](docs/WebhookEndpointPage.md)
 - [WebhookEndpointStatus](docs/WebhookEndpointStatus.md)
 - [WebhookEndpointUpdateRequest](docs/WebhookEndpointUpdateRequest.md)
 - [WhatsappApiError](docs/WhatsappApiError.md)
 - [WhatsappAuthIntlRateEligibilityCountry](docs/WhatsappAuthIntlRateEligibilityCountry.md)
 - [WhatsappBusinessAccount](docs/WhatsappBusinessAccount.md)
 - [WhatsappBusinessAccountBanState](docs/WhatsappBusinessAccountBanState.md)
 - [WhatsappBusinessAccountPage](docs/WhatsappBusinessAccountPage.md)
 - [WhatsappBusinessAccountRestrictionInfo](docs/WhatsappBusinessAccountRestrictionInfo.md)
 - [WhatsappBusinessAccountReviewStatus](docs/WhatsappBusinessAccountReviewStatus.md)
 - [WhatsappBusinessAccountUpdateEventEnum](docs/WhatsappBusinessAccountUpdateEventEnum.md)
 - [WhatsappCallingConnectRequest](docs/WhatsappCallingConnectRequest.md)
 - [WhatsappCallingPreAcceptRequest](docs/WhatsappCallingPreAcceptRequest.md)
 - [WhatsappCallingRequest](docs/WhatsappCallingRequest.md)
 - [WhatsappCallingResponse](docs/WhatsappCallingResponse.md)
 - [WhatsappCallingTerminateRequest](docs/WhatsappCallingTerminateRequest.md)
 - [WhatsappCommerceSettings](docs/WhatsappCommerceSettings.md)
 - [WhatsappCommerceSettingsUpdateRequest](docs/WhatsappCommerceSettingsUpdateRequest.md)
 - [WhatsappConversation](docs/WhatsappConversation.md)
 - [WhatsappConversationOriginType](docs/WhatsappConversationOriginType.md)
 - [WhatsappConversationType](docs/WhatsappConversationType.md)
 - [WhatsappFlow](docs/WhatsappFlow.md)
 - [WhatsappFlowCategory](docs/WhatsappFlowCategory.md)
 - [WhatsappFlowCreate200Response](docs/WhatsappFlowCreate200Response.md)
 - [WhatsappFlowCreate400Response](docs/WhatsappFlowCreate400Response.md)
 - [WhatsappFlowCreateRequest](docs/WhatsappFlowCreateRequest.md)
 - [WhatsappFlowList200Response](docs/WhatsappFlowList200Response.md)
 - [WhatsappFlowPreviewUrl](docs/WhatsappFlowPreviewUrl.md)
 - [WhatsappFlowStatus](docs/WhatsappFlowStatus.md)
 - [WhatsappFlowUpdateMetadata200Response](docs/WhatsappFlowUpdateMetadata200Response.md)
 - [WhatsappFlowUpdateMetadataRequest](docs/WhatsappFlowUpdateMetadataRequest.md)
 - [WhatsappFlowValidationError](docs/WhatsappFlowValidationError.md)
 - [WhatsappFlowValidationErrorPointersInner](docs/WhatsappFlowValidationErrorPointersInner.md)
 - [WhatsappFlowWhatsappBusinessAccount](docs/WhatsappFlowWhatsappBusinessAccount.md)
 - [WhatsappInboundMessage](docs/WhatsappInboundMessage.md)
 - [WhatsappInboundMessageButton](docs/WhatsappInboundMessageButton.md)
 - [WhatsappInboundMessageContext](docs/WhatsappInboundMessageContext.md)
 - [WhatsappInboundMessageError](docs/WhatsappInboundMessageError.md)
 - [WhatsappInboundMessageInteractive](docs/WhatsappInboundMessageInteractive.md)
 - [WhatsappInboundMessageInteractiveButtonReply](docs/WhatsappInboundMessageInteractiveButtonReply.md)
 - [WhatsappInboundMessageInteractiveCallPermissionReply](docs/WhatsappInboundMessageInteractiveCallPermissionReply.md)
 - [WhatsappInboundMessageInteractiveListReply](docs/WhatsappInboundMessageInteractiveListReply.md)
 - [WhatsappInboundMessageInteractiveNfmReply](docs/WhatsappInboundMessageInteractiveNfmReply.md)
 - [WhatsappInboundMessageLocation](docs/WhatsappInboundMessageLocation.md)
 - [WhatsappInboundMessageMedia](docs/WhatsappInboundMessageMedia.md)
 - [WhatsappInboundMessageOrder](docs/WhatsappInboundMessageOrder.md)
 - [WhatsappInboundMessageOrderProductItem](docs/WhatsappInboundMessageOrderProductItem.md)
 - [WhatsappInboundMessageReferral](docs/WhatsappInboundMessageReferral.md)
 - [WhatsappInboundMessageReferredProduct](docs/WhatsappInboundMessageReferredProduct.md)
 - [WhatsappInboundMessageSystem](docs/WhatsappInboundMessageSystem.md)
 - [WhatsappInboundMessageText](docs/WhatsappInboundMessageText.md)
 - [WhatsappInboundMessageType](docs/WhatsappInboundMessageType.md)
 - [WhatsappListFlowItem](docs/WhatsappListFlowItem.md)
 - [WhatsappMedia](docs/WhatsappMedia.md)
 - [WhatsappMediaUpload200Response](docs/WhatsappMediaUpload200Response.md)
 - [WhatsappMessage](docs/WhatsappMessage.md)
 - [WhatsappMessageContact](docs/WhatsappMessageContact.md)
 - [WhatsappMessageContactAddress](docs/WhatsappMessageContactAddress.md)
 - [WhatsappMessageContactEmail](docs/WhatsappMessageContactEmail.md)
 - [WhatsappMessageContactName](docs/WhatsappMessageContactName.md)
 - [WhatsappMessageContactOrg](docs/WhatsappMessageContactOrg.md)
 - [WhatsappMessageContactPhone](docs/WhatsappMessageContactPhone.md)
 - [WhatsappMessageContactUrl](docs/WhatsappMessageContactUrl.md)
 - [WhatsappMessageContext](docs/WhatsappMessageContext.md)
 - [WhatsappMessageInteractive](docs/WhatsappMessageInteractive.md)
 - [WhatsappMessageInteractiveAction](docs/WhatsappMessageInteractiveAction.md)
 - [WhatsappMessageInteractiveActionButton](docs/WhatsappMessageInteractiveActionButton.md)
 - [WhatsappMessageInteractiveActionButtonReply](docs/WhatsappMessageInteractiveActionButtonReply.md)
 - [WhatsappMessageInteractiveActionParameters](docs/WhatsappMessageInteractiveActionParameters.md)
 - [WhatsappMessageInteractiveActionParametersFlowActionPayload](docs/WhatsappMessageInteractiveActionParametersFlowActionPayload.md)
 - [WhatsappMessageInteractiveActionSection](docs/WhatsappMessageInteractiveActionSection.md)
 - [WhatsappMessageInteractiveActionSectionProductItem](docs/WhatsappMessageInteractiveActionSectionProductItem.md)
 - [WhatsappMessageInteractiveActionSectionRow](docs/WhatsappMessageInteractiveActionSectionRow.md)
 - [WhatsappMessageInteractiveBody](docs/WhatsappMessageInteractiveBody.md)
 - [WhatsappMessageInteractiveFooter](docs/WhatsappMessageInteractiveFooter.md)
 - [WhatsappMessageInteractiveHeader](docs/WhatsappMessageInteractiveHeader.md)
 - [WhatsappMessageLocation](docs/WhatsappMessageLocation.md)
 - [WhatsappMessageMedia](docs/WhatsappMessageMedia.md)
 - [WhatsappMessageMediaAllOf](docs/WhatsappMessageMediaAllOf.md)
 - [WhatsappMessageOrderAmount](docs/WhatsappMessageOrderAmount.md)
 - [WhatsappMessageOrderBeneficiary](docs/WhatsappMessageOrderBeneficiary.md)
 - [WhatsappMessageOrderDetails](docs/WhatsappMessageOrderDetails.md)
 - [WhatsappMessageOrderExpiration](docs/WhatsappMessageOrderExpiration.md)
 - [WhatsappMessageOrderInfo](docs/WhatsappMessageOrderInfo.md)
 - [WhatsappMessageOrderItem](docs/WhatsappMessageOrderItem.md)
 - [WhatsappMessageOrderPaymentGateway](docs/WhatsappMessageOrderPaymentGateway.md)
 - [WhatsappMessageOrderPaymentSetting](docs/WhatsappMessageOrderPaymentSetting.md)
 - [WhatsappMessageOrderPaymentSettingPaymentGatewayBilldesk](docs/WhatsappMessageOrderPaymentSettingPaymentGatewayBilldesk.md)
 - [WhatsappMessageOrderPaymentSettingPaymentGatewayPayu](docs/WhatsappMessageOrderPaymentSettingPaymentGatewayPayu.md)
 - [WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay](docs/WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay.md)
 - [WhatsappMessageOrderPaymentSettingPaymentGatewayZaakpay](docs/WhatsappMessageOrderPaymentSettingPaymentGatewayZaakpay.md)
 - [WhatsappMessageOrderStatus](docs/WhatsappMessageOrderStatus.md)
 - [WhatsappMessageOrderStatusEnum](docs/WhatsappMessageOrderStatusEnum.md)
 - [WhatsappMessageReaction](docs/WhatsappMessageReaction.md)
 - [WhatsappMessageSendRequest](docs/WhatsappMessageSendRequest.md)
 - [WhatsappMessageStatus](docs/WhatsappMessageStatus.md)
 - [WhatsappMessageTemplate](docs/WhatsappMessageTemplate.md)
 - [WhatsappMessageTemplateComponent](docs/WhatsappMessageTemplateComponent.md)
 - [WhatsappMessageTemplateComponentCard](docs/WhatsappMessageTemplateComponentCard.md)
 - [WhatsappMessageTemplateComponentCardComponent](docs/WhatsappMessageTemplateComponentCardComponent.md)
 - [WhatsappMessageTemplateComponentParameter](docs/WhatsappMessageTemplateComponentParameter.md)
 - [WhatsappMessageTemplateComponentParameterAction](docs/WhatsappMessageTemplateComponentParameterAction.md)
 - [WhatsappMessageTemplateComponentParameterActionSection](docs/WhatsappMessageTemplateComponentParameterActionSection.md)
 - [WhatsappMessageTemplateComponentParameterActionSectionProductItem](docs/WhatsappMessageTemplateComponentParameterActionSectionProductItem.md)
 - [WhatsappMessageTemplateComponentParameterLimitedTimeOffer](docs/WhatsappMessageTemplateComponentParameterLimitedTimeOffer.md)
 - [WhatsappMessageTemplateLanguage](docs/WhatsappMessageTemplateLanguage.md)
 - [WhatsappMessageText](docs/WhatsappMessageText.md)
 - [WhatsappMessageType](docs/WhatsappMessageType.md)
 - [WhatsappPayment](docs/WhatsappPayment.md)
 - [WhatsappPaymentStatus](docs/WhatsappPaymentStatus.md)
 - [WhatsappPaymentTransaction](docs/WhatsappPaymentTransaction.md)
 - [WhatsappPaymentTransactionError](docs/WhatsappPaymentTransactionError.md)
 - [WhatsappPhoneNameUpdateRequest](docs/WhatsappPhoneNameUpdateRequest.md)
 - [WhatsappPhoneNameUpdateResponse](docs/WhatsappPhoneNameUpdateResponse.md)
 - [WhatsappPhoneNumber](docs/WhatsappPhoneNumber.md)
 - [WhatsappPhoneNumberCodeVerificationStatus](docs/WhatsappPhoneNumberCodeVerificationStatus.md)
 - [WhatsappPhoneNumberNameStatus](docs/WhatsappPhoneNumberNameStatus.md)
 - [WhatsappPhoneNumberPage](docs/WhatsappPhoneNumberPage.md)
 - [WhatsappPhoneNumberProfile](docs/WhatsappPhoneNumberProfile.md)
 - [WhatsappPhoneNumberProfileUpdateRequest](docs/WhatsappPhoneNumberProfileUpdateRequest.md)
 - [WhatsappPhoneNumberProfileVertical](docs/WhatsappPhoneNumberProfileVertical.md)
 - [WhatsappPhoneNumberQualityRating](docs/WhatsappPhoneNumberQualityRating.md)
 - [WhatsappPhoneNumberQualityUpdateEventEnum](docs/WhatsappPhoneNumberQualityUpdateEventEnum.md)
 - [WhatsappPhoneNumberSettings](docs/WhatsappPhoneNumberSettings.md)
 - [WhatsappPhoneNumberSettingsCalling](docs/WhatsappPhoneNumberSettingsCalling.md)
 - [WhatsappPhoneNumberStatus](docs/WhatsappPhoneNumberStatus.md)
 - [WhatsappPricingCategory](docs/WhatsappPricingCategory.md)
 - [WhatsappPricingModel](docs/WhatsappPricingModel.md)
 - [WhatsappPricingType](docs/WhatsappPricingType.md)
 - [WhatsappProfile](docs/WhatsappProfile.md)
 - [WhatsappReviewDecision](docs/WhatsappReviewDecision.md)
 - [WhatsappTemplate](docs/WhatsappTemplate.md)
 - [WhatsappTemplateCategory](docs/WhatsappTemplateCategory.md)
 - [WhatsappTemplateComponent](docs/WhatsappTemplateComponent.md)
 - [WhatsappTemplateComponentButton](docs/WhatsappTemplateComponentButton.md)
 - [WhatsappTemplateComponentButtonOtpSupportedApp](docs/WhatsappTemplateComponentButtonOtpSupportedApp.md)
 - [WhatsappTemplateComponentButtonOtpType](docs/WhatsappTemplateComponentButtonOtpType.md)
 - [WhatsappTemplateComponentButtonType](docs/WhatsappTemplateComponentButtonType.md)
 - [WhatsappTemplateComponentCard](docs/WhatsappTemplateComponentCard.md)
 - [WhatsappTemplateComponentCardComponent](docs/WhatsappTemplateComponentCardComponent.md)
 - [WhatsappTemplateComponentExample](docs/WhatsappTemplateComponentExample.md)
 - [WhatsappTemplateComponentLimitedTimeOffer](docs/WhatsappTemplateComponentLimitedTimeOffer.md)
 - [WhatsappTemplateCreateRequest](docs/WhatsappTemplateCreateRequest.md)
 - [WhatsappTemplateEditRequest](docs/WhatsappTemplateEditRequest.md)
 - [WhatsappTemplatePage](docs/WhatsappTemplatePage.md)
 - [WhatsappTemplateQualityRating](docs/WhatsappTemplateQualityRating.md)
 - [WhatsappTemplateStatus](docs/WhatsappTemplateStatus.md)
 - [WhatsappTemplateStatusUpdateEventEnum](docs/WhatsappTemplateStatusUpdateEventEnum.md)
 - [WhatsappTemplateSubCategory](docs/WhatsappTemplateSubCategory.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header
