

# Unsubscriber

An unsubscriber is a configuration item representing that customers opt out of receiving messages from your business. **A customer and a channel form a unique identifier for an unsubscriber.**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **UnsubscriberType** |  |  [optional] |
|**customer** | **String** | The customer who has opted out. For &#x60;type&#x3D;PHONE_NUMBER&#x60;, it should be a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. |  [optional] |
|**channel** | **UnsubscriberChannel** |  |  [optional] |
|**regionCode** | **String** | The customer&#39;s region code, formatted in [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). |  [optional] |
|**source** | [**SourceEnum**](#SourceEnum) | The source from which a customer resumed their subscription - &#x60;Whatsapp&#x60;: The customer resumed their subscription on the whatsapp client - &#x60;API&#x60;: You remove the customer from the unsubscribe list through the OpenAPI of YCloud - &#x60;Manual&#x60;: You remove the customer from the unsubscribe list on the Contact page of YCloud. |  [optional] |
|**createTime** | **Date** | The time at which this object was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;. |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| WHATSAPP | &quot;Whatsapp&quot; |
| API | &quot;API&quot; |
| MANUAL | &quot;Manual&quot; |



