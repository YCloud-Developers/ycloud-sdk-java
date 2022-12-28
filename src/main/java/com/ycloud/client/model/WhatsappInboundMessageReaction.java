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
 * When a user reacts to messages with an emoji, the message type is set to &#x60;reaction&#x60;, and this field is included.
 */
@ApiModel(description = "When a user reacts to messages with an emoji, the message type is set to `reaction`, and this field is included.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappInboundMessageReaction {
  public static final String SERIALIZED_NAME_MESSAGE_ID = "message_id";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_EMOJI = "emoji";
  @SerializedName(SERIALIZED_NAME_EMOJI)
  private String emoji;

  public WhatsappInboundMessageReaction() { 
  }

  public WhatsappInboundMessageReaction messageId(String messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Specifies the &#x60;wamid&#x60; of the message received that contained the reaction.
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "wamid.BgNODYxN...", value = "Specifies the `wamid` of the message received that contained the reaction.")

  public String getMessageId() {
    return messageId;
  }


  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public WhatsappInboundMessageReaction emoji(String emoji) {
    
    this.emoji = emoji;
    return this;
  }

   /**
   * This field is included when a user reacts to messages with an emoji. Otherwise, it indicates a user removed the emoji.
   * @return emoji
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is included when a user reacts to messages with an emoji. Otherwise, it indicates a user removed the emoji.")

  public String getEmoji() {
    return emoji;
  }


  public void setEmoji(String emoji) {
    this.emoji = emoji;
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
  public WhatsappInboundMessageReaction putAdditionalProperty(String key, Object value) {
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
    WhatsappInboundMessageReaction whatsappInboundMessageReaction = (WhatsappInboundMessageReaction) o;
    return Objects.equals(this.messageId, whatsappInboundMessageReaction.messageId) &&
        Objects.equals(this.emoji, whatsappInboundMessageReaction.emoji)&&
        Objects.equals(this.additionalProperties, whatsappInboundMessageReaction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, emoji, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappInboundMessageReaction {\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    emoji: ").append(toIndentedString(emoji)).append("\n");
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
    openapiFields.add("message_id");
    openapiFields.add("emoji");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappInboundMessageReaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappInboundMessageReaction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappInboundMessageReaction is not found in the empty JSON string", WhatsappInboundMessageReaction.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("message_id") != null && !jsonObj.get("message_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_id").toString()));
      }
      if (jsonObj.get("emoji") != null && !jsonObj.get("emoji").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emoji` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emoji").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappInboundMessageReaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappInboundMessageReaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappInboundMessageReaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappInboundMessageReaction.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappInboundMessageReaction>() {
           @Override
           public void write(JsonWriter out, WhatsappInboundMessageReaction value) throws IOException {
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
           public WhatsappInboundMessageReaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappInboundMessageReaction instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappInboundMessageReaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappInboundMessageReaction
  * @throws IOException if the JSON string is invalid with respect to WhatsappInboundMessageReaction
  */
  public static WhatsappInboundMessageReaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappInboundMessageReaction.class);
  }

 /**
  * Convert an instance of WhatsappInboundMessageReaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
