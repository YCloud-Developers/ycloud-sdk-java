

# AgentAllowlistEntryDTO

A real Meta allowlist entry. Identity fields are optional and mutually exclusive; an ID-only entry is valid. Phone and BSUID entries are independent and share the WhatsApp limit of 20.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Allowlist entry ID. |  |
|**consumerPhoneNumber** | **String** | Allowlisted consumer phone number in E.164 format. |  [optional] |
|**consumerBsuid** | **String** | Actual BSUID used to create this entry, if returned. |  [optional] |
|**consumerInstagramUsername** | **String** | Optional read-only compatibility field. Instagram management is not supported. |  [optional] |
