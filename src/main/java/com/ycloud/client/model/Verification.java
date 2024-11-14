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
import com.ycloud.client.model.VerificationFallback;
import com.ycloud.client.model.VerificationStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Date;

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
 * Verification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Verification {
  public static final String SERIALIZED_NAME_ID = "id";
  /**
   * ID of the verification.
  **/
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_STATUS)
  private VerificationStatus status;

  public static final String SERIALIZED_NAME_TO = "to";
  /**
   * Recipient of the verification.
  **/
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private VerificationChannel channel;

  public static final String SERIALIZED_NAME_SEND_TIME = "sendTime";
  /**
   * The time at which this verification was sent, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_SEND_TIME)
  private Date sendTime;

  public static final String SERIALIZED_NAME_TOTAL_PRICE = "totalPrice";
  /**
   * Total price of this verification.
  **/
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private Double totalPrice;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  /**
   * Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217).
  **/
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_SMS_FALLBACK_ENABLED = "smsFallbackEnabled";
  /**
   * Whether sms fallback is enabled or not. Applicable when &#x60;channel&#x60; is &#x60;whatsapp&#x60;. If enabled, we will try to send the verification code via sms when the WhatsApp message is failed.
  **/
  @SerializedName(SERIALIZED_NAME_SMS_FALLBACK_ENABLED)
  private Boolean smsFallbackEnabled;

  public static final String SERIALIZED_NAME_SMS_FALLBACK = "smsFallback";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_SMS_FALLBACK)
  private VerificationFallback smsFallback;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  /**
   * A unique (recommended) string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.
  **/
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public Verification() { 
  }

  public Verification id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the verification.
   * @return id
  **/
  @javax.annotation.Nonnull

  public String getId() {
    return id;
  }


  /**
   * ID of the verification.
   **/
  @ApiModelProperty(example = "ve6j7n8i", required = true, value = "ID of the verification.")
  public void setId(String id) {
    this.id = id;
  }


  public Verification status(VerificationStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable

  public VerificationStatus getStatus() {
    return status;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setStatus(VerificationStatus status) {
    this.status = status;
  }


  public Verification to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Recipient of the verification.
   * @return to
  **/
  @javax.annotation.Nullable

  public String getTo() {
    return to;
  }


  /**
   * Recipient of the verification.
   **/
  @ApiModelProperty(example = "+16315551111", value = "Recipient of the verification.")
  public void setTo(String to) {
    this.to = to;
  }


  public Verification channel(VerificationChannel channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable

  public VerificationChannel getChannel() {
    return channel;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setChannel(VerificationChannel channel) {
    this.channel = channel;
  }


  public Verification sendTime(Date sendTime) {
    
    this.sendTime = sendTime;
    return this;
  }

   /**
   * The time at which this verification was sent, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   * @return sendTime
  **/
  @javax.annotation.Nullable

  public Date getSendTime() {
    return sendTime;
  }


  /**
   * The time at which this verification was sent, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   **/
  @ApiModelProperty(example = "2022-06-01T12:00Z", value = "The time at which this verification was sent, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-06-01T12:00:00.000Z`.")
  public void setSendTime(Date sendTime) {
    this.sendTime = sendTime;
  }


  public Verification totalPrice(Double totalPrice) {
    
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Total price of this verification.
   * @return totalPrice
  **/
  @javax.annotation.Nullable

  public Double getTotalPrice() {
    return totalPrice;
  }


  /**
   * Total price of this verification.
   **/
  @ApiModelProperty(example = "0.0085", value = "Total price of this verification.")
  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }


  public Verification currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217).
   * @return currency
  **/
  @javax.annotation.Nullable

  public String getCurrency() {
    return currency;
  }


  /**
   * Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217).
   **/
  @ApiModelProperty(example = "USD", value = "Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217).")
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Verification smsFallbackEnabled(Boolean smsFallbackEnabled) {
    
    this.smsFallbackEnabled = smsFallbackEnabled;
    return this;
  }

   /**
   * Whether sms fallback is enabled or not. Applicable when &#x60;channel&#x60; is &#x60;whatsapp&#x60;. If enabled, we will try to send the verification code via sms when the WhatsApp message is failed.
   * @return smsFallbackEnabled
  **/
  @javax.annotation.Nullable

  public Boolean getSmsFallbackEnabled() {
    return smsFallbackEnabled;
  }


  /**
   * Whether sms fallback is enabled or not. Applicable when &#x60;channel&#x60; is &#x60;whatsapp&#x60;. If enabled, we will try to send the verification code via sms when the WhatsApp message is failed.
   **/
  @ApiModelProperty(value = "Whether sms fallback is enabled or not. Applicable when `channel` is `whatsapp`. If enabled, we will try to send the verification code via sms when the WhatsApp message is failed.")
  public void setSmsFallbackEnabled(Boolean smsFallbackEnabled) {
    this.smsFallbackEnabled = smsFallbackEnabled;
  }


  public Verification smsFallback(VerificationFallback smsFallback) {
    
    this.smsFallback = smsFallback;
    return this;
  }

   /**
   * Get smsFallback
   * @return smsFallback
  **/
  @javax.annotation.Nullable

  public VerificationFallback getSmsFallback() {
    return smsFallback;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setSmsFallback(VerificationFallback smsFallback) {
    this.smsFallback = smsFallback;
  }


  public Verification externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * A unique (recommended) string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.
   * @return externalId
  **/
  @javax.annotation.Nullable

  public String getExternalId() {
    return externalId;
  }


  /**
   * A unique (recommended) string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.
   **/
  @ApiModelProperty(value = "A unique (recommended) string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.")
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
  public Verification putAdditionalProperty(String key, Object value) {
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
    Verification verification = (Verification) o;
    return Objects.equals(this.id, verification.id) &&
        Objects.equals(this.status, verification.status) &&
        Objects.equals(this.to, verification.to) &&
        Objects.equals(this.channel, verification.channel) &&
        Objects.equals(this.sendTime, verification.sendTime) &&
        Objects.equals(this.totalPrice, verification.totalPrice) &&
        Objects.equals(this.currency, verification.currency) &&
        Objects.equals(this.smsFallbackEnabled, verification.smsFallbackEnabled) &&
        Objects.equals(this.smsFallback, verification.smsFallback) &&
        Objects.equals(this.externalId, verification.externalId)&&
        Objects.equals(this.additionalProperties, verification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, to, channel, sendTime, totalPrice, currency, smsFallbackEnabled, smsFallback, externalId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Verification {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    smsFallbackEnabled: ").append(toIndentedString(smsFallbackEnabled)).append("\n");
    sb.append("    smsFallback: ").append(toIndentedString(smsFallback)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("status");
    openapiFields.add("to");
    openapiFields.add("channel");
    openapiFields.add("sendTime");
    openapiFields.add("totalPrice");
    openapiFields.add("currency");
    openapiFields.add("smsFallbackEnabled");
    openapiFields.add("smsFallback");
    openapiFields.add("externalId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Verification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Verification.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Verification is not found in the empty JSON string", Verification.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Verification.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("to") != null && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the optional field `smsFallback`
      if (jsonObj.getAsJsonObject("smsFallback") != null) {
        VerificationFallback.validateJsonObject(jsonObj.getAsJsonObject("smsFallback"));
      }
      if (jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Verification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Verification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Verification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Verification.class));

       return (TypeAdapter<T>) new TypeAdapter<Verification>() {
           @Override
           public void write(JsonWriter out, Verification value) throws IOException {
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
           public Verification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Verification instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Verification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Verification
  * @throws IOException if the JSON string is invalid with respect to Verification
  */
  public static Verification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Verification.class);
  }

 /**
  * Convert an instance of Verification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

