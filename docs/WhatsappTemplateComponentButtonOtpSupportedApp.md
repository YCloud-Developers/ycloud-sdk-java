

# WhatsappTemplateComponentButtonOtpSupportedApp

The supported_apps array allows you define pairs of app package names and signing key hashes for up to 5 apps. This can be useful if you have different app builds and want each of them to be able to initiate the handshake:

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**packageName** | **String** | Your Android app&#39;s package name. |  [optional] |
|**signatureHash** | **String** | Your app signing key hash. See [App Signing Key Hash](https://developers.facebook.com/docs/whatsapp/business-management-api/authentication-templates/zero-tap-authentication-templates#app-signing-key-hash). |  [optional] |



