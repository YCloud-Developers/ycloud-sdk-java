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
import com.ycloud.client.model.VerificationChannel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * VerificationSendRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VerificationSendRequest {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private VerificationChannel channel;

  public static final String SERIALIZED_NAME_TO = "to";
  /**
   * The recipient&#39;s phone number or email address depending on &#x60;channel&#x60;. - Phone number: In [E.164](https://en.wikipedia.org/wiki/E.164) format. Applicable when &#x60;channel&#x60; is &#x60;sms&#x60; or &#x60;voice&#x60;. - Email address: For example, &#x60;tom@example.com&#x60;. Applicable when &#x60;channel&#x60; is &#x60;email_code&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_CODE = "code";
  /**
   * Verification code to be sent. This field is optional. If not provided, we will automatically generate a code.
  **/
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_SENDER_ID = "senderId";
  /**
   * [Sender ID](https://help.ycloud.com/en/articles/3080386) to be used.
  **/
  @SerializedName(SERIALIZED_NAME_SENDER_ID)
  private String senderId;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  /**
   * This parameter is only required for Chinese mainland SMS messages. You must specify an approved signature such as &#x60;Brand&#x60;. It will be added to the beginning of SMS body and wrapped with &#x60;【】&#x60;, e.g. &#x60;【Brand】Your verification code is 123456&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  /**
   * [ISO 639 Language Code](https://www.iso.org/iso-639-language-codes.html). If not specified, language will be set as &#x60;en&#x60; by default. Notably, in certain countries or regions, language will be automatically set as the local language due to the regional restrictions. Applicable languages: &#x60;ar&#x60;: Arabic &#x60;de&#x60;: German &#x60;en&#x60;: English &#x60;es&#x60;: Spanish &#x60;fr&#x60;: French &#x60;id&#x60;: Indonesian &#x60;it&#x60;: Italian &#x60;pt_BR&#x60;: Portuguese &#x60;ru&#x60;: Russian &#x60;tr&#x60;: Turkish &#x60;vi&#x60;: Vietnamese &#x60;zh_CN&#x60;: Simplified Chinese &#x60;zh_HK&#x60;: Traditional Chinese
  **/
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  /**
   * A unique (recommended) string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems. If present, this value will also be attached to the &#x60;externalId&#x60; of message objects.
  **/
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public VerificationSendRequest() { 
  }

  public VerificationSendRequest channel(VerificationChannel channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nonnull

  public VerificationChannel getChannel() {
    return channel;
  }


  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public void setChannel(VerificationChannel channel) {
    this.channel = channel;
  }


  public VerificationSendRequest to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The recipient&#39;s phone number or email address depending on &#x60;channel&#x60;. - Phone number: In [E.164](https://en.wikipedia.org/wiki/E.164) format. Applicable when &#x60;channel&#x60; is &#x60;sms&#x60; or &#x60;voice&#x60;. - Email address: For example, &#x60;tom@example.com&#x60;. Applicable when &#x60;channel&#x60; is &#x60;email_code&#x60;.
   * @return to
  **/
  @javax.annotation.Nonnull

  public String getTo() {
    return to;
  }


  /**
   * The recipient&#39;s phone number or email address depending on &#x60;channel&#x60;. - Phone number: In [E.164](https://en.wikipedia.org/wiki/E.164) format. Applicable when &#x60;channel&#x60; is &#x60;sms&#x60; or &#x60;voice&#x60;. - Email address: For example, &#x60;tom@example.com&#x60;. Applicable when &#x60;channel&#x60; is &#x60;email_code&#x60;.
   **/
  @ApiModelProperty(example = "+16315551111", required = true, value = "The recipient's phone number or email address depending on `channel`. - Phone number: In [E.164](https://en.wikipedia.org/wiki/E.164) format. Applicable when `channel` is `sms` or `voice`. - Email address: For example, `tom@example.com`. Applicable when `channel` is `email_code`.")
  public void setTo(String to) {
    this.to = to;
  }


  public VerificationSendRequest code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Verification code to be sent. This field is optional. If not provided, we will automatically generate a code.
   * @return code
  **/
  @javax.annotation.Nullable

  public String getCode() {
    return code;
  }


  /**
   * Verification code to be sent. This field is optional. If not provided, we will automatically generate a code.
   **/
  @ApiModelProperty(example = "123456", value = "Verification code to be sent. This field is optional. If not provided, we will automatically generate a code.")
  public void setCode(String code) {
    this.code = code;
  }


  public VerificationSendRequest senderId(String senderId) {
    
    this.senderId = senderId;
    return this;
  }

   /**
   * [Sender ID](https://help.ycloud.com/en/articles/3080386) to be used.
   * @return senderId
  **/
  @javax.annotation.Nullable

  public String getSenderId() {
    return senderId;
  }


  /**
   * [Sender ID](https://help.ycloud.com/en/articles/3080386) to be used.
   **/
  @ApiModelProperty(example = "Brand", value = "[Sender ID](https://help.ycloud.com/en/articles/3080386) to be used.")
  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }


  public VerificationSendRequest signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * This parameter is only required for Chinese mainland SMS messages. You must specify an approved signature such as &#x60;Brand&#x60;. It will be added to the beginning of SMS body and wrapped with &#x60;【】&#x60;, e.g. &#x60;【Brand】Your verification code is 123456&#x60;.
   * @return signature
  **/
  @javax.annotation.Nullable

  public String getSignature() {
    return signature;
  }


  /**
   * This parameter is only required for Chinese mainland SMS messages. You must specify an approved signature such as &#x60;Brand&#x60;. It will be added to the beginning of SMS body and wrapped with &#x60;【】&#x60;, e.g. &#x60;【Brand】Your verification code is 123456&#x60;.
   **/
  @ApiModelProperty(example = "Brand", value = "This parameter is only required for Chinese mainland SMS messages. You must specify an approved signature such as `Brand`. It will be added to the beginning of SMS body and wrapped with `【】`, e.g. `【Brand】Your verification code is 123456`.")
  public void setSignature(String signature) {
    this.signature = signature;
  }


  public VerificationSendRequest language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * [ISO 639 Language Code](https://www.iso.org/iso-639-language-codes.html). If not specified, language will be set as &#x60;en&#x60; by default. Notably, in certain countries or regions, language will be automatically set as the local language due to the regional restrictions. Applicable languages: &#x60;ar&#x60;: Arabic &#x60;de&#x60;: German &#x60;en&#x60;: English &#x60;es&#x60;: Spanish &#x60;fr&#x60;: French &#x60;id&#x60;: Indonesian &#x60;it&#x60;: Italian &#x60;pt_BR&#x60;: Portuguese &#x60;ru&#x60;: Russian &#x60;tr&#x60;: Turkish &#x60;vi&#x60;: Vietnamese &#x60;zh_CN&#x60;: Simplified Chinese &#x60;zh_HK&#x60;: Traditional Chinese
   * @return language
  **/
  @javax.annotation.Nullable

  public String getLanguage() {
    return language;
  }


  /**
   * [ISO 639 Language Code](https://www.iso.org/iso-639-language-codes.html). If not specified, language will be set as &#x60;en&#x60; by default. Notably, in certain countries or regions, language will be automatically set as the local language due to the regional restrictions. Applicable languages: &#x60;ar&#x60;: Arabic &#x60;de&#x60;: German &#x60;en&#x60;: English &#x60;es&#x60;: Spanish &#x60;fr&#x60;: French &#x60;id&#x60;: Indonesian &#x60;it&#x60;: Italian &#x60;pt_BR&#x60;: Portuguese &#x60;ru&#x60;: Russian &#x60;tr&#x60;: Turkish &#x60;vi&#x60;: Vietnamese &#x60;zh_CN&#x60;: Simplified Chinese &#x60;zh_HK&#x60;: Traditional Chinese
   **/
  @ApiModelProperty(example = "en", value = "[ISO 639 Language Code](https://www.iso.org/iso-639-language-codes.html). If not specified, language will be set as `en` by default. Notably, in certain countries or regions, language will be automatically set as the local language due to the regional restrictions. Applicable languages: `ar`: Arabic `de`: German `en`: English `es`: Spanish `fr`: French `id`: Indonesian `it`: Italian `pt_BR`: Portuguese `ru`: Russian `tr`: Turkish `vi`: Vietnamese `zh_CN`: Simplified Chinese `zh_HK`: Traditional Chinese")
  public void setLanguage(String language) {
    this.language = language;
  }


  public VerificationSendRequest externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * A unique (recommended) string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems. If present, this value will also be attached to the &#x60;externalId&#x60; of message objects.
   * @return externalId
  **/
  @javax.annotation.Nullable

  public String getExternalId() {
    return externalId;
  }


  /**
   * A unique (recommended) string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems. If present, this value will also be attached to the &#x60;externalId&#x60; of message objects.
   **/
  @ApiModelProperty(value = "A unique (recommended) string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems. If present, this value will also be attached to the `externalId` of message objects.")
  public void setExternalId(String externalId) {
    this.externalId = externalId;
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
  public VerificationSendRequest putAdditionalProperty(String key, Object value) {
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
    VerificationSendRequest verificationSendRequest = (VerificationSendRequest) o;
    return Objects.equals(this.channel, verificationSendRequest.channel) &&
        Objects.equals(this.to, verificationSendRequest.to) &&
        Objects.equals(this.code, verificationSendRequest.code) &&
        Objects.equals(this.senderId, verificationSendRequest.senderId) &&
        Objects.equals(this.signature, verificationSendRequest.signature) &&
        Objects.equals(this.language, verificationSendRequest.language) &&
        Objects.equals(this.externalId, verificationSendRequest.externalId)&&
        Objects.equals(this.additionalProperties, verificationSendRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, to, code, senderId, signature, language, externalId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationSendRequest {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
    openapiFields.add("channel");
    openapiFields.add("to");
    openapiFields.add("code");
    openapiFields.add("senderId");
    openapiFields.add("signature");
    openapiFields.add("language");
    openapiFields.add("externalId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel");
    openapiRequiredFields.add("to");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerificationSendRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VerificationSendRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerificationSendRequest is not found in the empty JSON string", VerificationSendRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VerificationSendRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("to") != null && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("senderId") != null && !jsonObj.get("senderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `senderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("senderId").toString()));
      }
      if (jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerificationSendRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerificationSendRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerificationSendRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerificationSendRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<VerificationSendRequest>() {
           @Override
           public void write(JsonWriter out, VerificationSendRequest value) throws IOException {
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
           public VerificationSendRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VerificationSendRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VerificationSendRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerificationSendRequest
  * @throws IOException if the JSON string is invalid with respect to VerificationSendRequest
  */
  public static VerificationSendRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerificationSendRequest.class);
  }

 /**
  * Convert an instance of VerificationSendRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

