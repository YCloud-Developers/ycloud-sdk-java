/*
 * YCloud API
 * The [YCloud](https://ycloud.com) API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer). Our API is designed to have predictable, resource-oriented URLs, return [JSON](https://www.json.org) responses, and use standard HTTP response codes and verbs.
 *
 * The version of the OpenAPI document: v2
 * Contact: service@ycloud.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ycloud.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ycloud.client.model.WhatsappTemplateComponentButtonOtpType;
import com.ycloud.client.model.WhatsappTemplateComponentButtonType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ycloud.client.JSON;

/**
 * WhatsappTemplateComponentButton
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappTemplateComponentButton {
  public static final String SERIALIZED_NAME_TYPE = "type";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_TYPE)
  private WhatsappTemplateComponentButtonType type;

  public static final String SERIALIZED_NAME_TEXT = "text";
  /**
   * **Required for button type &#x60;PHONE_NUMBER&#x60; or &#x60;URL&#x60;.** Button text. For &#x60;CODE_CODE&#x60; buttons, the text is a pre-set value and cannot be customized. For &#x60;OTP&#x60; buttons, if omitted, the text will default to a pre-set value localized to the template&#39;s language. For example, &#x60;Copy Code&#x60; for English (US). If your template is using a one-tap autofill button and you supply this value, the authentication template message will display a copy code button with this text if we are unable to validate your [handshake](https://developers.facebook.com/docs/whatsapp/business-management-api/authentication-templates/autofill-button-authentication-templates#handshake). Maximum 25 characters.
  **/
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_URL = "url";
  /**
   * **Required for button type &#x60;URL&#x60;.** URL of website. There can be at most 1 variable at the end of the URL. Example: &#x60;https://www.luckyshrub.com/shop?promo&#x3D;{{1}}&#x60;. 2000 characters maximum.
  **/
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  /**
   * **Required for button type &#x60;PHONE_NUMBER&#x60;.** Alphanumeric string. Business phone number to be (display phone number) called when the user taps the button. 20 characters maximum.
  **/
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_OTP_TYPE = "otp_type";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_OTP_TYPE)
  private WhatsappTemplateComponentButtonOtpType otpType;

  public static final String SERIALIZED_NAME_AUTOFILL_TEXT = "autofill_text";
  /**
   * **One-tap and zero-tap buttons only.** One-tap button text. Maximum 25 characters.
  **/
  @SerializedName(SERIALIZED_NAME_AUTOFILL_TEXT)
  private String autofillText;

  public static final String SERIALIZED_NAME_PACKAGE_NAME = "package_name";
  /**
   * **One-tap and zero-tap buttons only.** Your Android app&#39;s package name.
  **/
  @SerializedName(SERIALIZED_NAME_PACKAGE_NAME)
  private String packageName;

  public static final String SERIALIZED_NAME_SIGNATURE_HASH = "signature_hash";
  /**
   * **One-tap and zero-tap buttons only.** Your app signing key hash. See [App Signing Key Hash](https://developers.facebook.com/docs/whatsapp/business-management-api/authentication-templates/zero-tap-authentication-templates#app-signing-key-hash).
  **/
  @SerializedName(SERIALIZED_NAME_SIGNATURE_HASH)
  private String signatureHash;

  public static final String SERIALIZED_NAME_ZERO_TAP_TERMS_ACCEPTED = "zero_tap_terms_accepted";
  /**
   * **Zero-tap buttons only.** Set to &#x60;true&#x60; to indicate that you understand that your use of zero-tap authentication is subject to the WhatsApp Business Terms of Service, and that it&#39;s your responsibility to ensure your customers expect that the code will be automatically filled in on their behalf when they choose to receive the zero-tap code through WhatsApp. If set to &#x60;false&#x60;, the template will not be created as you need to accept zero-tap terms before creating zero-tap enabled message templates.
  **/
  @SerializedName(SERIALIZED_NAME_ZERO_TAP_TERMS_ACCEPTED)
  private Boolean zeroTapTermsAccepted;

  public static final String SERIALIZED_NAME_EXAMPLE = "example";
  /**
   * Sample full URL for a &#x60;URL&#x60; button with a variable.
  **/
  @SerializedName(SERIALIZED_NAME_EXAMPLE)
  private List<String> example = null;

  public static final String SERIALIZED_NAME_FLOW_ID = "flow_id";
  /**
   * **Conditionally required for button type &#x60;FLOW&#x60;.** The unique ID of the Flow. Cannot be used if &#x60;flow_name&#x60; or &#x60;flow_json&#x60; parameters are provided. Only one of these parameters is allowed.
  **/
  @SerializedName(SERIALIZED_NAME_FLOW_ID)
  private String flowId;

  public static final String SERIALIZED_NAME_FLOW_NAME = "flow_name";
  /**
   * **Conditionally required for button type &#x60;FLOW&#x60;.** The name of the Flow. Cannot be used if &#x60;flow_id&#x60; or &#x60;flow_json&#x60; parameters are provided. Only one of these parameters is allowed. The Flow ID is stored in the message template, not the name, so changing the Flow name will not affect existing message templates.
  **/
  @SerializedName(SERIALIZED_NAME_FLOW_NAME)
  private String flowName;

  public static final String SERIALIZED_NAME_FLOW_JSON = "flow_json";
  /**
   * **Conditionally required for button type &#x60;FLOW&#x60;.** The Flow JSON encoded as string with escaping. The Flow JSON specifies the content of the Flow. Cannot be used if &#x60;flow_id&#x60; or &#x60;flow_name&#x60; parameters are provided. Only one of these parameters is allowed.
  **/
  @SerializedName(SERIALIZED_NAME_FLOW_JSON)
  private String flowJson;

  public static final String SERIALIZED_NAME_FLOW_ACTION = "flow_action";
  /**
   * **Use for button type &#x60;FLOW&#x60;.** Either &#x60;navigate&#x60; or &#x60;data_exchange&#x60;. Defaults to &#x60;navigate&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_FLOW_ACTION)
  private String flowAction;

  public static final String SERIALIZED_NAME_NAVIGATE_SCREEN = "navigate_screen";
  /**
   * **Required if &#x60;flow_action&#x60; is &#x60;navigate&#x60;.** The unique ID of the Screen in the Flow.
  **/
  @SerializedName(SERIALIZED_NAME_NAVIGATE_SCREEN)
  private String navigateScreen;

  public WhatsappTemplateComponentButton() { 
  }

  public WhatsappTemplateComponentButton type(WhatsappTemplateComponentButtonType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull

  public WhatsappTemplateComponentButtonType getType() {
    return type;
  }


  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public void setType(WhatsappTemplateComponentButtonType type) {
    this.type = type;
  }


  public WhatsappTemplateComponentButton text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * **Required for button type &#x60;PHONE_NUMBER&#x60; or &#x60;URL&#x60;.** Button text. For &#x60;CODE_CODE&#x60; buttons, the text is a pre-set value and cannot be customized. For &#x60;OTP&#x60; buttons, if omitted, the text will default to a pre-set value localized to the template&#39;s language. For example, &#x60;Copy Code&#x60; for English (US). If your template is using a one-tap autofill button and you supply this value, the authentication template message will display a copy code button with this text if we are unable to validate your [handshake](https://developers.facebook.com/docs/whatsapp/business-management-api/authentication-templates/autofill-button-authentication-templates#handshake). Maximum 25 characters.
   * @return text
  **/
  @javax.annotation.Nullable

  public String getText() {
    return text;
  }


  /**
   * **Required for button type &#x60;PHONE_NUMBER&#x60; or &#x60;URL&#x60;.** Button text. For &#x60;CODE_CODE&#x60; buttons, the text is a pre-set value and cannot be customized. For &#x60;OTP&#x60; buttons, if omitted, the text will default to a pre-set value localized to the template&#39;s language. For example, &#x60;Copy Code&#x60; for English (US). If your template is using a one-tap autofill button and you supply this value, the authentication template message will display a copy code button with this text if we are unable to validate your [handshake](https://developers.facebook.com/docs/whatsapp/business-management-api/authentication-templates/autofill-button-authentication-templates#handshake). Maximum 25 characters.
   **/
  @ApiModelProperty(value = "**Required for button type `PHONE_NUMBER` or `URL`.** Button text. For `CODE_CODE` buttons, the text is a pre-set value and cannot be customized. For `OTP` buttons, if omitted, the text will default to a pre-set value localized to the template's language. For example, `Copy Code` for English (US). If your template is using a one-tap autofill button and you supply this value, the authentication template message will display a copy code button with this text if we are unable to validate your [handshake](https://developers.facebook.com/docs/whatsapp/business-management-api/authentication-templates/autofill-button-authentication-templates#handshake). Maximum 25 characters.")
  public void setText(String text) {
    this.text = text;
  }


  public WhatsappTemplateComponentButton url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * **Required for button type &#x60;URL&#x60;.** URL of website. There can be at most 1 variable at the end of the URL. Example: &#x60;https://www.luckyshrub.com/shop?promo&#x3D;{{1}}&#x60;. 2000 characters maximum.
   * @return url
  **/
  @javax.annotation.Nullable

  public String getUrl() {
    return url;
  }


  /**
   * **Required for button type &#x60;URL&#x60;.** URL of website. There can be at most 1 variable at the end of the URL. Example: &#x60;https://www.luckyshrub.com/shop?promo&#x3D;{{1}}&#x60;. 2000 characters maximum.
   **/
  @ApiModelProperty(value = "**Required for button type `URL`.** URL of website. There can be at most 1 variable at the end of the URL. Example: `https://www.luckyshrub.com/shop?promo={{1}}`. 2000 characters maximum.")
  public void setUrl(String url) {
    this.url = url;
  }


  public WhatsappTemplateComponentButton phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * **Required for button type &#x60;PHONE_NUMBER&#x60;.** Alphanumeric string. Business phone number to be (display phone number) called when the user taps the button. 20 characters maximum.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable

  public String getPhoneNumber() {
    return phoneNumber;
  }


  /**
   * **Required for button type &#x60;PHONE_NUMBER&#x60;.** Alphanumeric string. Business phone number to be (display phone number) called when the user taps the button. 20 characters maximum.
   **/
  @ApiModelProperty(example = "15550051310", value = "**Required for button type `PHONE_NUMBER`.** Alphanumeric string. Business phone number to be (display phone number) called when the user taps the button. 20 characters maximum.")
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public WhatsappTemplateComponentButton otpType(WhatsappTemplateComponentButtonOtpType otpType) {
    
    this.otpType = otpType;
    return this;
  }

   /**
   * Get otpType
   * @return otpType
  **/
  @javax.annotation.Nullable

  public WhatsappTemplateComponentButtonOtpType getOtpType() {
    return otpType;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setOtpType(WhatsappTemplateComponentButtonOtpType otpType) {
    this.otpType = otpType;
  }


  public WhatsappTemplateComponentButton autofillText(String autofillText) {
    
    this.autofillText = autofillText;
    return this;
  }

   /**
   * **One-tap and zero-tap buttons only.** One-tap button text. Maximum 25 characters.
   * @return autofillText
  **/
  @javax.annotation.Nullable

  public String getAutofillText() {
    return autofillText;
  }


  /**
   * **One-tap and zero-tap buttons only.** One-tap button text. Maximum 25 characters.
   **/
  @ApiModelProperty(example = "Autofill", value = "**One-tap and zero-tap buttons only.** One-tap button text. Maximum 25 characters.")
  public void setAutofillText(String autofillText) {
    this.autofillText = autofillText;
  }


  public WhatsappTemplateComponentButton packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * **One-tap and zero-tap buttons only.** Your Android app&#39;s package name.
   * @return packageName
  **/
  @javax.annotation.Nullable

  public String getPackageName() {
    return packageName;
  }


  /**
   * **One-tap and zero-tap buttons only.** Your Android app&#39;s package name.
   **/
  @ApiModelProperty(example = "com.example.myapplication", value = "**One-tap and zero-tap buttons only.** Your Android app's package name.")
  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  public WhatsappTemplateComponentButton signatureHash(String signatureHash) {
    
    this.signatureHash = signatureHash;
    return this;
  }

   /**
   * **One-tap and zero-tap buttons only.** Your app signing key hash. See [App Signing Key Hash](https://developers.facebook.com/docs/whatsapp/business-management-api/authentication-templates/zero-tap-authentication-templates#app-signing-key-hash).
   * @return signatureHash
  **/
  @javax.annotation.Nullable

  public String getSignatureHash() {
    return signatureHash;
  }


  /**
   * **One-tap and zero-tap buttons only.** Your app signing key hash. See [App Signing Key Hash](https://developers.facebook.com/docs/whatsapp/business-management-api/authentication-templates/zero-tap-authentication-templates#app-signing-key-hash).
   **/
  @ApiModelProperty(example = "K8a%2FAINcGX7", value = "**One-tap and zero-tap buttons only.** Your app signing key hash. See [App Signing Key Hash](https://developers.facebook.com/docs/whatsapp/business-management-api/authentication-templates/zero-tap-authentication-templates#app-signing-key-hash).")
  public void setSignatureHash(String signatureHash) {
    this.signatureHash = signatureHash;
  }


  public WhatsappTemplateComponentButton zeroTapTermsAccepted(Boolean zeroTapTermsAccepted) {
    
    this.zeroTapTermsAccepted = zeroTapTermsAccepted;
    return this;
  }

   /**
   * **Zero-tap buttons only.** Set to &#x60;true&#x60; to indicate that you understand that your use of zero-tap authentication is subject to the WhatsApp Business Terms of Service, and that it&#39;s your responsibility to ensure your customers expect that the code will be automatically filled in on their behalf when they choose to receive the zero-tap code through WhatsApp. If set to &#x60;false&#x60;, the template will not be created as you need to accept zero-tap terms before creating zero-tap enabled message templates.
   * @return zeroTapTermsAccepted
  **/
  @javax.annotation.Nullable

  public Boolean getZeroTapTermsAccepted() {
    return zeroTapTermsAccepted;
  }


  /**
   * **Zero-tap buttons only.** Set to &#x60;true&#x60; to indicate that you understand that your use of zero-tap authentication is subject to the WhatsApp Business Terms of Service, and that it&#39;s your responsibility to ensure your customers expect that the code will be automatically filled in on their behalf when they choose to receive the zero-tap code through WhatsApp. If set to &#x60;false&#x60;, the template will not be created as you need to accept zero-tap terms before creating zero-tap enabled message templates.
   **/
  @ApiModelProperty(value = "**Zero-tap buttons only.** Set to `true` to indicate that you understand that your use of zero-tap authentication is subject to the WhatsApp Business Terms of Service, and that it's your responsibility to ensure your customers expect that the code will be automatically filled in on their behalf when they choose to receive the zero-tap code through WhatsApp. If set to `false`, the template will not be created as you need to accept zero-tap terms before creating zero-tap enabled message templates.")
  public void setZeroTapTermsAccepted(Boolean zeroTapTermsAccepted) {
    this.zeroTapTermsAccepted = zeroTapTermsAccepted;
  }


  public WhatsappTemplateComponentButton example(List<String> example) {
    
    this.example = example;
    return this;
  }

  public WhatsappTemplateComponentButton addExampleItem(String exampleItem) {
    if (this.example == null) {
      this.example = new ArrayList<>();
    }
    this.example.add(exampleItem);
    return this;
  }

   /**
   * Sample full URL for a &#x60;URL&#x60; button with a variable.
   * @return example
  **/
  @javax.annotation.Nullable

  public List<String> getExample() {
    return example;
  }


  /**
   * Sample full URL for a &#x60;URL&#x60; button with a variable.
   **/
  @ApiModelProperty(value = "Sample full URL for a `URL` button with a variable.")
  public void setExample(List<String> example) {
    this.example = example;
  }


  public WhatsappTemplateComponentButton flowId(String flowId) {
    
    this.flowId = flowId;
    return this;
  }

   /**
   * **Conditionally required for button type &#x60;FLOW&#x60;.** The unique ID of the Flow. Cannot be used if &#x60;flow_name&#x60; or &#x60;flow_json&#x60; parameters are provided. Only one of these parameters is allowed.
   * @return flowId
  **/
  @javax.annotation.Nullable

  public String getFlowId() {
    return flowId;
  }


  /**
   * **Conditionally required for button type &#x60;FLOW&#x60;.** The unique ID of the Flow. Cannot be used if &#x60;flow_name&#x60; or &#x60;flow_json&#x60; parameters are provided. Only one of these parameters is allowed.
   **/
  @ApiModelProperty(example = "1", value = "**Conditionally required for button type `FLOW`.** The unique ID of the Flow. Cannot be used if `flow_name` or `flow_json` parameters are provided. Only one of these parameters is allowed.")
  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }


  public WhatsappTemplateComponentButton flowName(String flowName) {
    
    this.flowName = flowName;
    return this;
  }

   /**
   * **Conditionally required for button type &#x60;FLOW&#x60;.** The name of the Flow. Cannot be used if &#x60;flow_id&#x60; or &#x60;flow_json&#x60; parameters are provided. Only one of these parameters is allowed. The Flow ID is stored in the message template, not the name, so changing the Flow name will not affect existing message templates.
   * @return flowName
  **/
  @javax.annotation.Nullable

  public String getFlowName() {
    return flowName;
  }


  /**
   * **Conditionally required for button type &#x60;FLOW&#x60;.** The name of the Flow. Cannot be used if &#x60;flow_id&#x60; or &#x60;flow_json&#x60; parameters are provided. Only one of these parameters is allowed. The Flow ID is stored in the message template, not the name, so changing the Flow name will not affect existing message templates.
   **/
  @ApiModelProperty(value = "**Conditionally required for button type `FLOW`.** The name of the Flow. Cannot be used if `flow_id` or `flow_json` parameters are provided. Only one of these parameters is allowed. The Flow ID is stored in the message template, not the name, so changing the Flow name will not affect existing message templates.")
  public void setFlowName(String flowName) {
    this.flowName = flowName;
  }


  public WhatsappTemplateComponentButton flowJson(String flowJson) {
    
    this.flowJson = flowJson;
    return this;
  }

   /**
   * **Conditionally required for button type &#x60;FLOW&#x60;.** The Flow JSON encoded as string with escaping. The Flow JSON specifies the content of the Flow. Cannot be used if &#x60;flow_id&#x60; or &#x60;flow_name&#x60; parameters are provided. Only one of these parameters is allowed.
   * @return flowJson
  **/
  @javax.annotation.Nullable

  public String getFlowJson() {
    return flowJson;
  }


  /**
   * **Conditionally required for button type &#x60;FLOW&#x60;.** The Flow JSON encoded as string with escaping. The Flow JSON specifies the content of the Flow. Cannot be used if &#x60;flow_id&#x60; or &#x60;flow_name&#x60; parameters are provided. Only one of these parameters is allowed.
   **/
  @ApiModelProperty(value = "**Conditionally required for button type `FLOW`.** The Flow JSON encoded as string with escaping. The Flow JSON specifies the content of the Flow. Cannot be used if `flow_id` or `flow_name` parameters are provided. Only one of these parameters is allowed.")
  public void setFlowJson(String flowJson) {
    this.flowJson = flowJson;
  }


  public WhatsappTemplateComponentButton flowAction(String flowAction) {
    
    this.flowAction = flowAction;
    return this;
  }

   /**
   * **Use for button type &#x60;FLOW&#x60;.** Either &#x60;navigate&#x60; or &#x60;data_exchange&#x60;. Defaults to &#x60;navigate&#x60;.
   * @return flowAction
  **/
  @javax.annotation.Nullable

  public String getFlowAction() {
    return flowAction;
  }


  /**
   * **Use for button type &#x60;FLOW&#x60;.** Either &#x60;navigate&#x60; or &#x60;data_exchange&#x60;. Defaults to &#x60;navigate&#x60;.
   **/
  @ApiModelProperty(example = "navigate", value = "**Use for button type `FLOW`.** Either `navigate` or `data_exchange`. Defaults to `navigate`.")
  public void setFlowAction(String flowAction) {
    this.flowAction = flowAction;
  }


  public WhatsappTemplateComponentButton navigateScreen(String navigateScreen) {
    
    this.navigateScreen = navigateScreen;
    return this;
  }

   /**
   * **Required if &#x60;flow_action&#x60; is &#x60;navigate&#x60;.** The unique ID of the Screen in the Flow.
   * @return navigateScreen
  **/
  @javax.annotation.Nullable

  public String getNavigateScreen() {
    return navigateScreen;
  }


  /**
   * **Required if &#x60;flow_action&#x60; is &#x60;navigate&#x60;.** The unique ID of the Screen in the Flow.
   **/
  @ApiModelProperty(example = "WELCOME_SCREEN", value = "**Required if `flow_action` is `navigate`.** The unique ID of the Screen in the Flow.")
  public void setNavigateScreen(String navigateScreen) {
    this.navigateScreen = navigateScreen;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public WhatsappTemplateComponentButton putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsappTemplateComponentButton whatsappTemplateComponentButton = (WhatsappTemplateComponentButton) o;
    return Objects.equals(this.type, whatsappTemplateComponentButton.type) &&
        Objects.equals(this.text, whatsappTemplateComponentButton.text) &&
        Objects.equals(this.url, whatsappTemplateComponentButton.url) &&
        Objects.equals(this.phoneNumber, whatsappTemplateComponentButton.phoneNumber) &&
        Objects.equals(this.otpType, whatsappTemplateComponentButton.otpType) &&
        Objects.equals(this.autofillText, whatsappTemplateComponentButton.autofillText) &&
        Objects.equals(this.packageName, whatsappTemplateComponentButton.packageName) &&
        Objects.equals(this.signatureHash, whatsappTemplateComponentButton.signatureHash) &&
        Objects.equals(this.zeroTapTermsAccepted, whatsappTemplateComponentButton.zeroTapTermsAccepted) &&
        Objects.equals(this.example, whatsappTemplateComponentButton.example) &&
        Objects.equals(this.flowId, whatsappTemplateComponentButton.flowId) &&
        Objects.equals(this.flowName, whatsappTemplateComponentButton.flowName) &&
        Objects.equals(this.flowJson, whatsappTemplateComponentButton.flowJson) &&
        Objects.equals(this.flowAction, whatsappTemplateComponentButton.flowAction) &&
        Objects.equals(this.navigateScreen, whatsappTemplateComponentButton.navigateScreen)&&
        Objects.equals(this.additionalProperties, whatsappTemplateComponentButton.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, url, phoneNumber, otpType, autofillText, packageName, signatureHash, zeroTapTermsAccepted, example, flowId, flowName, flowJson, flowAction, navigateScreen, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappTemplateComponentButton {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    otpType: ").append(toIndentedString(otpType)).append("\n");
    sb.append("    autofillText: ").append(toIndentedString(autofillText)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    signatureHash: ").append(toIndentedString(signatureHash)).append("\n");
    sb.append("    zeroTapTermsAccepted: ").append(toIndentedString(zeroTapTermsAccepted)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    flowName: ").append(toIndentedString(flowName)).append("\n");
    sb.append("    flowJson: ").append(toIndentedString(flowJson)).append("\n");
    sb.append("    flowAction: ").append(toIndentedString(flowAction)).append("\n");
    sb.append("    navigateScreen: ").append(toIndentedString(navigateScreen)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("type");
    openapiFields.add("text");
    openapiFields.add("url");
    openapiFields.add("phone_number");
    openapiFields.add("otp_type");
    openapiFields.add("autofill_text");
    openapiFields.add("package_name");
    openapiFields.add("signature_hash");
    openapiFields.add("zero_tap_terms_accepted");
    openapiFields.add("example");
    openapiFields.add("flow_id");
    openapiFields.add("flow_name");
    openapiFields.add("flow_json");
    openapiFields.add("flow_action");
    openapiFields.add("navigate_screen");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappTemplateComponentButton
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappTemplateComponentButton.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappTemplateComponentButton is not found in the empty JSON string", WhatsappTemplateComponentButton.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WhatsappTemplateComponentButton.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (jsonObj.get("phone_number") != null && !jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
      if (jsonObj.get("autofill_text") != null && !jsonObj.get("autofill_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `autofill_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("autofill_text").toString()));
      }
      if (jsonObj.get("package_name") != null && !jsonObj.get("package_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_name").toString()));
      }
      if (jsonObj.get("signature_hash") != null && !jsonObj.get("signature_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature_hash").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("example") != null && !jsonObj.get("example").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `example` to be an array in the JSON string but got `%s`", jsonObj.get("example").toString()));
      }
      if (jsonObj.get("flow_id") != null && !jsonObj.get("flow_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flow_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flow_id").toString()));
      }
      if (jsonObj.get("flow_name") != null && !jsonObj.get("flow_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flow_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flow_name").toString()));
      }
      if (jsonObj.get("flow_json") != null && !jsonObj.get("flow_json").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flow_json` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flow_json").toString()));
      }
      if (jsonObj.get("flow_action") != null && !jsonObj.get("flow_action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flow_action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flow_action").toString()));
      }
      if (jsonObj.get("navigate_screen") != null && !jsonObj.get("navigate_screen").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `navigate_screen` to be a primitive type in the JSON string but got `%s`", jsonObj.get("navigate_screen").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappTemplateComponentButton.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappTemplateComponentButton' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappTemplateComponentButton> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappTemplateComponentButton.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappTemplateComponentButton>() {
           @Override
           public void write(JsonWriter out, WhatsappTemplateComponentButton value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public WhatsappTemplateComponentButton read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappTemplateComponentButton instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WhatsappTemplateComponentButton given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappTemplateComponentButton
  * @throws IOException if the JSON string is invalid with respect to WhatsappTemplateComponentButton
  */
  public static WhatsappTemplateComponentButton fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappTemplateComponentButton.class);
  }

 /**
  * Convert an instance of WhatsappTemplateComponentButton to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

