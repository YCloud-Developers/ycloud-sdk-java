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
  <version>1.4.4</version>
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
     implementation "com.ycloud:ycloud-sdk-java:1.4.4"
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
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

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
*EmailsApi* | [**send**](docs/EmailsApi.md#send) | **POST** /emails | Send an email
*SmsApi* | [**list**](docs/SmsApi.md#list) | **GET** /sms | List SMS records
*SmsApi* | [**send**](docs/SmsApi.md#send) | **POST** /sms | Send an SMS
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
*WhatsappMessagesApi* | [**retrieve**](docs/WhatsappMessagesApi.md#retrieve) | **GET** /whatsapp/messages/{id} | Retrieve a WhatsApp message
*WhatsappMessagesApi* | [**send**](docs/WhatsappMessagesApi.md#send) | **POST** /whatsapp/messages | Send a WhatsApp message
*WhatsappPhoneNumbersApi* | [**list**](docs/WhatsappPhoneNumbersApi.md#list) | **GET** /whatsapp/phoneNumbers | List WhatsApp phone numbers
*WhatsappPhoneNumbersApi* | [**retrieve**](docs/WhatsappPhoneNumbersApi.md#retrieve) | **GET** /whatsapp/phoneNumbers/{wabaId}/{phoneNumber} | Retrieve a WhatsApp phone number
*WhatsappTemplatesApi* | [**create**](docs/WhatsappTemplatesApi.md#create) | **POST** /whatsapp/templates | Create a WhatsApp template
*WhatsappTemplatesApi* | [**deleteByName**](docs/WhatsappTemplatesApi.md#deleteByName) | **DELETE** /whatsapp/templates/{wabaId}/{name} | Delete WhatsApp templates by name
*WhatsappTemplatesApi* | [**editByNameAndLanguage**](docs/WhatsappTemplatesApi.md#editByNameAndLanguage) | **PATCH** /whatsapp/templates/{wabaId}/{name}/{language} | Edit a WhatsApp template
*WhatsappTemplatesApi* | [**list**](docs/WhatsappTemplatesApi.md#list) | **GET** /whatsapp/templates | List WhatsApp templates
*WhatsappTemplatesApi* | [**retrieveByNameAndLanguage**](docs/WhatsappTemplatesApi.md#retrieveByNameAndLanguage) | **GET** /whatsapp/templates/{wabaId}/{name}/{language} | Retrieve a WhatsApp template


## Documentation for Models

 - [Balance](docs/Balance.md)
 - [Email](docs/Email.md)
 - [EmailContentType](docs/EmailContentType.md)
 - [EmailDelivery](docs/EmailDelivery.md)
 - [EmailSendRequest](docs/EmailSendRequest.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Event](docs/Event.md)
 - [EventType](docs/EventType.md)
 - [Mailbox](docs/Mailbox.md)
 - [MetaBusinessAccountVerificationStatus](docs/MetaBusinessAccountVerificationStatus.md)
 - [Page](docs/Page.md)
 - [Sms](docs/Sms.md)
 - [SmsInbound](docs/SmsInbound.md)
 - [SmsPage](docs/SmsPage.md)
 - [SmsSendRequest](docs/SmsSendRequest.md)
 - [Verification](docs/Verification.md)
 - [VerificationChannel](docs/VerificationChannel.md)
 - [VerificationCheck](docs/VerificationCheck.md)
 - [VerificationCheckRequest](docs/VerificationCheckRequest.md)
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
 - [WhatsappBusinessAccount](docs/WhatsappBusinessAccount.md)
 - [WhatsappBusinessAccountBanState](docs/WhatsappBusinessAccountBanState.md)
 - [WhatsappBusinessAccountPage](docs/WhatsappBusinessAccountPage.md)
 - [WhatsappBusinessAccountRestrictionInfo](docs/WhatsappBusinessAccountRestrictionInfo.md)
 - [WhatsappBusinessAccountReviewStatus](docs/WhatsappBusinessAccountReviewStatus.md)
 - [WhatsappBusinessAccountUpdateEventEnum](docs/WhatsappBusinessAccountUpdateEventEnum.md)
 - [WhatsappConversation](docs/WhatsappConversation.md)
 - [WhatsappConversationOriginType](docs/WhatsappConversationOriginType.md)
 - [WhatsappInboundMessage](docs/WhatsappInboundMessage.md)
 - [WhatsappInboundMessageButton](docs/WhatsappInboundMessageButton.md)
 - [WhatsappInboundMessageContext](docs/WhatsappInboundMessageContext.md)
 - [WhatsappInboundMessageError](docs/WhatsappInboundMessageError.md)
 - [WhatsappInboundMessageInteractive](docs/WhatsappInboundMessageInteractive.md)
 - [WhatsappInboundMessageInteractiveButtonReply](docs/WhatsappInboundMessageInteractiveButtonReply.md)
 - [WhatsappInboundMessageInteractiveListReply](docs/WhatsappInboundMessageInteractiveListReply.md)
 - [WhatsappInboundMessageLocation](docs/WhatsappInboundMessageLocation.md)
 - [WhatsappInboundMessageMedia](docs/WhatsappInboundMessageMedia.md)
 - [WhatsappInboundMessageOrder](docs/WhatsappInboundMessageOrder.md)
 - [WhatsappInboundMessageOrderProductItem](docs/WhatsappInboundMessageOrderProductItem.md)
 - [WhatsappInboundMessageReaction](docs/WhatsappInboundMessageReaction.md)
 - [WhatsappInboundMessageReferral](docs/WhatsappInboundMessageReferral.md)
 - [WhatsappInboundMessageReferredProduct](docs/WhatsappInboundMessageReferredProduct.md)
 - [WhatsappInboundMessageSystem](docs/WhatsappInboundMessageSystem.md)
 - [WhatsappInboundMessageText](docs/WhatsappInboundMessageText.md)
 - [WhatsappInboundMessageType](docs/WhatsappInboundMessageType.md)
 - [WhatsappMessage](docs/WhatsappMessage.md)
 - [WhatsappMessageContact](docs/WhatsappMessageContact.md)
 - [WhatsappMessageContactAddressesInner](docs/WhatsappMessageContactAddressesInner.md)
 - [WhatsappMessageContactEmailsInner](docs/WhatsappMessageContactEmailsInner.md)
 - [WhatsappMessageContactName](docs/WhatsappMessageContactName.md)
 - [WhatsappMessageContactOrg](docs/WhatsappMessageContactOrg.md)
 - [WhatsappMessageContactPhonesInner](docs/WhatsappMessageContactPhonesInner.md)
 - [WhatsappMessageContactUrlsInner](docs/WhatsappMessageContactUrlsInner.md)
 - [WhatsappMessageInteractive](docs/WhatsappMessageInteractive.md)
 - [WhatsappMessageInteractiveAction](docs/WhatsappMessageInteractiveAction.md)
 - [WhatsappMessageInteractiveActionButtonsInner](docs/WhatsappMessageInteractiveActionButtonsInner.md)
 - [WhatsappMessageInteractiveActionButtonsInnerReply](docs/WhatsappMessageInteractiveActionButtonsInnerReply.md)
 - [WhatsappMessageInteractiveActionSectionsInner](docs/WhatsappMessageInteractiveActionSectionsInner.md)
 - [WhatsappMessageInteractiveActionSectionsInnerRowsInner](docs/WhatsappMessageInteractiveActionSectionsInnerRowsInner.md)
 - [WhatsappMessageInteractiveBody](docs/WhatsappMessageInteractiveBody.md)
 - [WhatsappMessageInteractiveFooter](docs/WhatsappMessageInteractiveFooter.md)
 - [WhatsappMessageInteractiveHeader](docs/WhatsappMessageInteractiveHeader.md)
 - [WhatsappMessageLocation](docs/WhatsappMessageLocation.md)
 - [WhatsappMessageMedia](docs/WhatsappMessageMedia.md)
 - [WhatsappMessageSendRequest](docs/WhatsappMessageSendRequest.md)
 - [WhatsappMessageStatus](docs/WhatsappMessageStatus.md)
 - [WhatsappMessageTemplate](docs/WhatsappMessageTemplate.md)
 - [WhatsappMessageTemplateComponentsInner](docs/WhatsappMessageTemplateComponentsInner.md)
 - [WhatsappMessageTemplateComponentsInnerParametersInner](docs/WhatsappMessageTemplateComponentsInnerParametersInner.md)
 - [WhatsappMessageTemplateLanguage](docs/WhatsappMessageTemplateLanguage.md)
 - [WhatsappMessageText](docs/WhatsappMessageText.md)
 - [WhatsappMessageType](docs/WhatsappMessageType.md)
 - [WhatsappPhoneNumber](docs/WhatsappPhoneNumber.md)
 - [WhatsappPhoneNumberCodeVerificationStatus](docs/WhatsappPhoneNumberCodeVerificationStatus.md)
 - [WhatsappPhoneNumberNameStatus](docs/WhatsappPhoneNumberNameStatus.md)
 - [WhatsappPhoneNumberPage](docs/WhatsappPhoneNumberPage.md)
 - [WhatsappPhoneNumberQualityRating](docs/WhatsappPhoneNumberQualityRating.md)
 - [WhatsappPhoneNumberStatus](docs/WhatsappPhoneNumberStatus.md)
 - [WhatsappProfile](docs/WhatsappProfile.md)
 - [WhatsappReviewDecision](docs/WhatsappReviewDecision.md)
 - [WhatsappTemplate](docs/WhatsappTemplate.md)
 - [WhatsappTemplateCategory](docs/WhatsappTemplateCategory.md)
 - [WhatsappTemplateComponent](docs/WhatsappTemplateComponent.md)
 - [WhatsappTemplateComponentButton](docs/WhatsappTemplateComponentButton.md)
 - [WhatsappTemplateComponentButtonType](docs/WhatsappTemplateComponentButtonType.md)
 - [WhatsappTemplateComponentExample](docs/WhatsappTemplateComponentExample.md)
 - [WhatsappTemplateCreateRequest](docs/WhatsappTemplateCreateRequest.md)
 - [WhatsappTemplateEditRequest](docs/WhatsappTemplateEditRequest.md)
 - [WhatsappTemplatePage](docs/WhatsappTemplatePage.md)
 - [WhatsappTemplateStatus](docs/WhatsappTemplateStatus.md)
 - [WhatsappTemplateStatusUpdateEventEnum](docs/WhatsappTemplateStatusUpdateEventEnum.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header
