

# WhatsappPhoneNumberProfileUpdateRequest

WhatsApp Phone Number Business Profile. Customers can view your business profile by clicking your business's name or number in a conversation thread.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**about** | **String** | The business&#39;s **About** text. This text appears in the business&#39;s profile, beneath its profile image, phone number, and contact buttons. - String cannot be empty. - Strings must be between 1 and 139 characters. - Rendered emojis are supported however their unicode values are not. Emoji unicode values must be Java- or JavaScript-escape encoded. - Hyperlinks can be included but will not render as clickable links. - Markdown is not supported. |  [optional] |
|**address** | **String** | Address of the business. Character limit 256. |  [optional] |
|**description** | **String** | Description of the business. Character limit 512. |  [optional] |
|**email** | **String** | The contact email address (in valid email format) of the business. Character limit 128. |  [optional] |
|**profilePictureUrl** | **String** | URL of the profile picture that was uploaded to Meta. |  [optional] |
|**vertical** | **WhatsappPhoneNumberProfileVertical** |  |  [optional] |
|**websites** | **List&lt;String&gt;** | The URLs associated with the business. For instance, a website, Facebook Page, or Instagram. You must include the http:// or https:// portion of the URL. There is a maximum of 2 websites with a maximum of 255 characters each. |  [optional] |



