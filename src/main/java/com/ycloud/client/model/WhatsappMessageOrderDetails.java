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
import com.ycloud.client.model.WhatsappMessageOrderAmount;
import com.ycloud.client.model.WhatsappMessageOrderInfo;
import com.ycloud.client.model.WhatsappMessageOrderPaymentSetting;
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
 * Contains the order details when sending a template message with a &#x60;order_details&#x60; button.
 */
@ApiModel(description = "Contains the order details when sending a template message with a `order_details` button.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappMessageOrderDetails {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  /**
   * The currency for this order. Currently the only supported value is &#x60;INR&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_ORDER = "order";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_ORDER)
  private WhatsappMessageOrderInfo order;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  /**
   * Unique identifier for the order provided by the business. It is case sensitive and cannot be an empty string and can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters.  The &#x60;reference_id&#x60; must be unique for each order_details message for a given business. If there is a need to send multiple order_details messages for the same order, it is recommended to include a sequence number in the reference_id (for example, \&quot;BM345A-12\&quot;) to ensure reference_id uniqueness.
  **/
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private WhatsappMessageOrderAmount totalAmount;

  public static final String SERIALIZED_NAME_TYPE = "type";
  /**
   * The type of goods being paid for in this order. Current supported options are &#x60;digital-goods&#x60; and &#x60;physical-goods&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PAYMENT_SETTINGS = "payment_settings";
  /**
   * Payment settings for the order.
  **/
  @SerializedName(SERIALIZED_NAME_PAYMENT_SETTINGS)
  private List<WhatsappMessageOrderPaymentSetting> paymentSettings = new ArrayList<>();

  public WhatsappMessageOrderDetails() { 
  }

  public WhatsappMessageOrderDetails currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency for this order. Currently the only supported value is &#x60;INR&#x60;.
   * @return currency
  **/
  @javax.annotation.Nonnull

  public String getCurrency() {
    return currency;
  }


  /**
   * The currency for this order. Currently the only supported value is &#x60;INR&#x60;.
   **/
  @ApiModelProperty(required = true, value = "The currency for this order. Currently the only supported value is `INR`.")
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public WhatsappMessageOrderDetails order(WhatsappMessageOrderInfo order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nonnull

  public WhatsappMessageOrderInfo getOrder() {
    return order;
  }


  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public void setOrder(WhatsappMessageOrderInfo order) {
    this.order = order;
  }


  public WhatsappMessageOrderDetails referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Unique identifier for the order provided by the business. It is case sensitive and cannot be an empty string and can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters.  The &#x60;reference_id&#x60; must be unique for each order_details message for a given business. If there is a need to send multiple order_details messages for the same order, it is recommended to include a sequence number in the reference_id (for example, \&quot;BM345A-12\&quot;) to ensure reference_id uniqueness.
   * @return referenceId
  **/
  @javax.annotation.Nonnull

  public String getReferenceId() {
    return referenceId;
  }


  /**
   * Unique identifier for the order provided by the business. It is case sensitive and cannot be an empty string and can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters.  The &#x60;reference_id&#x60; must be unique for each order_details message for a given business. If there is a need to send multiple order_details messages for the same order, it is recommended to include a sequence number in the reference_id (for example, \&quot;BM345A-12\&quot;) to ensure reference_id uniqueness.
   **/
  @ApiModelProperty(required = true, value = "Unique identifier for the order provided by the business. It is case sensitive and cannot be an empty string and can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters.  The `reference_id` must be unique for each order_details message for a given business. If there is a need to send multiple order_details messages for the same order, it is recommended to include a sequence number in the reference_id (for example, \"BM345A-12\") to ensure reference_id uniqueness.")
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public WhatsappMessageOrderDetails totalAmount(WhatsappMessageOrderAmount totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @javax.annotation.Nonnull

  public WhatsappMessageOrderAmount getTotalAmount() {
    return totalAmount;
  }


  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public void setTotalAmount(WhatsappMessageOrderAmount totalAmount) {
    this.totalAmount = totalAmount;
  }


  public WhatsappMessageOrderDetails type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of goods being paid for in this order. Current supported options are &#x60;digital-goods&#x60; and &#x60;physical-goods&#x60;.
   * @return type
  **/
  @javax.annotation.Nonnull

  public String getType() {
    return type;
  }


  /**
   * The type of goods being paid for in this order. Current supported options are &#x60;digital-goods&#x60; and &#x60;physical-goods&#x60;.
   **/
  @ApiModelProperty(required = true, value = "The type of goods being paid for in this order. Current supported options are `digital-goods` and `physical-goods`.")
  public void setType(String type) {
    this.type = type;
  }


  public WhatsappMessageOrderDetails paymentSettings(List<WhatsappMessageOrderPaymentSetting> paymentSettings) {
    
    this.paymentSettings = paymentSettings;
    return this;
  }

  public WhatsappMessageOrderDetails addPaymentSettingsItem(WhatsappMessageOrderPaymentSetting paymentSettingsItem) {
    this.paymentSettings.add(paymentSettingsItem);
    return this;
  }

   /**
   * Payment settings for the order.
   * @return paymentSettings
  **/
  @javax.annotation.Nonnull

  public List<WhatsappMessageOrderPaymentSetting> getPaymentSettings() {
    return paymentSettings;
  }


  /**
   * Payment settings for the order.
   **/
  @ApiModelProperty(required = true, value = "Payment settings for the order.")
  public void setPaymentSettings(List<WhatsappMessageOrderPaymentSetting> paymentSettings) {
    this.paymentSettings = paymentSettings;
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
  public WhatsappMessageOrderDetails putAdditionalProperty(String key, Object value) {
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
    WhatsappMessageOrderDetails whatsappMessageOrderDetails = (WhatsappMessageOrderDetails) o;
    return Objects.equals(this.currency, whatsappMessageOrderDetails.currency) &&
        Objects.equals(this.order, whatsappMessageOrderDetails.order) &&
        Objects.equals(this.referenceId, whatsappMessageOrderDetails.referenceId) &&
        Objects.equals(this.totalAmount, whatsappMessageOrderDetails.totalAmount) &&
        Objects.equals(this.type, whatsappMessageOrderDetails.type) &&
        Objects.equals(this.paymentSettings, whatsappMessageOrderDetails.paymentSettings)&&
        Objects.equals(this.additionalProperties, whatsappMessageOrderDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, order, referenceId, totalAmount, type, paymentSettings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappMessageOrderDetails {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    paymentSettings: ").append(toIndentedString(paymentSettings)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("order");
    openapiFields.add("reference_id");
    openapiFields.add("total_amount");
    openapiFields.add("type");
    openapiFields.add("payment_settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("order");
    openapiRequiredFields.add("reference_id");
    openapiRequiredFields.add("total_amount");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("payment_settings");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappMessageOrderDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappMessageOrderDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappMessageOrderDetails is not found in the empty JSON string", WhatsappMessageOrderDetails.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WhatsappMessageOrderDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the optional field `order`
      if (jsonObj.getAsJsonObject("order") != null) {
        WhatsappMessageOrderInfo.validateJsonObject(jsonObj.getAsJsonObject("order"));
      }
      if (jsonObj.get("reference_id") != null && !jsonObj.get("reference_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_id").toString()));
      }
      // validate the optional field `total_amount`
      if (jsonObj.getAsJsonObject("total_amount") != null) {
        WhatsappMessageOrderAmount.validateJsonObject(jsonObj.getAsJsonObject("total_amount"));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      JsonArray jsonArraypaymentSettings = jsonObj.getAsJsonArray("payment_settings");
      if (jsonArraypaymentSettings != null) {
        // ensure the json data is an array
        if (!jsonObj.get("payment_settings").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `payment_settings` to be an array in the JSON string but got `%s`", jsonObj.get("payment_settings").toString()));
        }

        // validate the optional field `payment_settings` (array)
        for (int i = 0; i < jsonArraypaymentSettings.size(); i++) {
          WhatsappMessageOrderPaymentSetting.validateJsonObject(jsonArraypaymentSettings.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappMessageOrderDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappMessageOrderDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappMessageOrderDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappMessageOrderDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappMessageOrderDetails>() {
           @Override
           public void write(JsonWriter out, WhatsappMessageOrderDetails value) throws IOException {
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
           public WhatsappMessageOrderDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappMessageOrderDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappMessageOrderDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappMessageOrderDetails
  * @throws IOException if the JSON string is invalid with respect to WhatsappMessageOrderDetails
  */
  public static WhatsappMessageOrderDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappMessageOrderDetails.class);
  }

 /**
  * Convert an instance of WhatsappMessageOrderDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

