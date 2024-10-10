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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * Additional info for Razorpay.
 */
@ApiModel(description = "Additional info for Razorpay.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay {
  public static final String SERIALIZED_NAME_RECEIPT = "receipt";
  /**
   * Receipt number that corresponds to this order, set for your internal reference.  Maximum length of 40 characters supported with minimum length greater than 0 characters.
  **/
  @SerializedName(SERIALIZED_NAME_RECEIPT)
  private String receipt;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  /**
   * The object can be key value pairs with maximum 15 keys and each value limits to 256 characters.
  **/
  @SerializedName(SERIALIZED_NAME_NOTES)
  private Map<String, String> notes = null;

  public WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay() { 
  }

  public WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay receipt(String receipt) {
    
    this.receipt = receipt;
    return this;
  }

   /**
   * Receipt number that corresponds to this order, set for your internal reference.  Maximum length of 40 characters supported with minimum length greater than 0 characters.
   * @return receipt
  **/
  @javax.annotation.Nullable

  public String getReceipt() {
    return receipt;
  }


  /**
   * Receipt number that corresponds to this order, set for your internal reference.  Maximum length of 40 characters supported with minimum length greater than 0 characters.
   **/
  @ApiModelProperty(value = "Receipt number that corresponds to this order, set for your internal reference.  Maximum length of 40 characters supported with minimum length greater than 0 characters.")
  public void setReceipt(String receipt) {
    this.receipt = receipt;
  }


  public WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay notes(Map<String, String> notes) {
    
    this.notes = notes;
    return this;
  }

  public WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay putNotesItem(String key, String notesItem) {
    if (this.notes == null) {
      this.notes = new HashMap<>();
    }
    this.notes.put(key, notesItem);
    return this;
  }

   /**
   * The object can be key value pairs with maximum 15 keys and each value limits to 256 characters.
   * @return notes
  **/
  @javax.annotation.Nullable

  public Map<String, String> getNotes() {
    return notes;
  }


  /**
   * The object can be key value pairs with maximum 15 keys and each value limits to 256 characters.
   **/
  @ApiModelProperty(value = "The object can be key value pairs with maximum 15 keys and each value limits to 256 characters.")
  public void setNotes(Map<String, String> notes) {
    this.notes = notes;
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
  public WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay putAdditionalProperty(String key, Object value) {
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
    WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay whatsappMessageOrderPaymentSettingPaymentGatewayRazorpay = (WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay) o;
    return Objects.equals(this.receipt, whatsappMessageOrderPaymentSettingPaymentGatewayRazorpay.receipt) &&
        Objects.equals(this.notes, whatsappMessageOrderPaymentSettingPaymentGatewayRazorpay.notes)&&
        Objects.equals(this.additionalProperties, whatsappMessageOrderPaymentSettingPaymentGatewayRazorpay.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receipt, notes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay {\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
    openapiFields.add("receipt");
    openapiFields.add("notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay is not found in the empty JSON string", WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("receipt") != null && !jsonObj.get("receipt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receipt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receipt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay>() {
           @Override
           public void write(JsonWriter out, WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay value) throws IOException {
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
           public WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay
  * @throws IOException if the JSON string is invalid with respect to WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay
  */
  public static WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay.class);
  }

 /**
  * Convert an instance of WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

