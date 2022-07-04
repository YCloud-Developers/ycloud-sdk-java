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
  <version>1.0.0</version>
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
     implementation "com.ycloud:ycloud-sdk-java:1.0.0"
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
*VoicesApi* | [**list**](docs/VoicesApi.md#list) | **GET** /voices | List voice records
*VoicesApi* | [**send**](docs/VoicesApi.md#send) | **POST** /voices | Send a voice code
*WebhookEndpointsApi* | [**create**](docs/WebhookEndpointsApi.md#create) | **POST** /webhookEndpoints | Create a webhook endpoint
*WebhookEndpointsApi* | [**delete**](docs/WebhookEndpointsApi.md#delete) | **DELETE** /webhookEndpoints/{id} | Delete a webhook endpoint
*WebhookEndpointsApi* | [**list**](docs/WebhookEndpointsApi.md#list) | **GET** /webhookEndpoints | List webhook endpoints
*WebhookEndpointsApi* | [**retrieve**](docs/WebhookEndpointsApi.md#retrieve) | **GET** /webhookEndpoints/{id} | Retrieve a webhook endpoint
*WebhookEndpointsApi* | [**rotateSecret**](docs/WebhookEndpointsApi.md#rotateSecret) | **POST** /webhookEndpoints/{id}/rotateSecret | Rotate a webhook endpoint secret
*WebhookEndpointsApi* | [**update**](docs/WebhookEndpointsApi.md#update) | **PATCH** /webhookEndpoints/{id} | Update a webhook endpoint


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
 - [Page](docs/Page.md)
 - [Sms](docs/Sms.md)
 - [SmsPage](docs/SmsPage.md)
 - [SmsSendRequest](docs/SmsSendRequest.md)
 - [Voice](docs/Voice.md)
 - [VoicePage](docs/VoicePage.md)
 - [VoiceSendRequest](docs/VoiceSendRequest.md)
 - [WebhookEndpoint](docs/WebhookEndpoint.md)
 - [WebhookEndpointCreateRequest](docs/WebhookEndpointCreateRequest.md)
 - [WebhookEndpointPage](docs/WebhookEndpointPage.md)
 - [WebhookEndpointStatus](docs/WebhookEndpointStatus.md)
 - [WebhookEndpointUpdateRequest](docs/WebhookEndpointUpdateRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header
