

# WhatsappMessageInteractiveActionCardAction

A button object in `interactive` messages. Cards must include either one URL button, or one or more quick-reply buttons. Button types and numbers must match across all cards (for example, if you define a card with 2 quick-reply buttons, all cards must define exactly 2 quick-reply buttons).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Required when card action is url button. Must be \&quot;cta_url\&quot;. |  [optional] |
|**parameters** | [**WhatsappMessageInteractiveActionCardActionParameters**](WhatsappMessageInteractiveActionCardActionParameters.md) |  |  [optional] |
|**buttons** | [**List&lt;WhatsappMessageInteractiveActionCardActionButton&gt;**](WhatsappMessageInteractiveActionCardActionButton.md) | Required when card action is quick reply button. |  [optional] |



