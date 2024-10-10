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
import com.ycloud.client.model.WhatsappMessageOrderPaymentSettingPaymentGatewayBilldesk;
import com.ycloud.client.model.WhatsappMessageOrderPaymentSettingPaymentGatewayPayu;
import com.ycloud.client.model.WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay;
import com.ycloud.client.model.WhatsappMessageOrderPaymentSettingPaymentGatewayZaakpay;
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
 * An object that describes payment account information.
 */
@ApiModel(description = "An object that describes payment account information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappMessageOrderPaymentGateway {
  /**
   * Payment type. Must set this to &#x60;billdesk&#x60;, &#x60;razorpay&#x60;, &#x60;payu&#x60;, or &#x60;zaakpay&#x60;, if you have linked your BillDesk, Razorpay, PayU, or Zaakpay payment gateway to accept payments.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BILLDESK("billdesk"),
    
    RAZORPAY("razorpay"),
    
    PAYU("payu"),
    
    ZAAKPAY("zaakpay");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  /**
   * Payment type. Must set this to &#x60;billdesk&#x60;, &#x60;razorpay&#x60;, &#x60;payu&#x60;, or &#x60;zaakpay&#x60;, if you have linked your BillDesk, Razorpay, PayU, or Zaakpay payment gateway to accept payments.
  **/
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_CONFIGURATION_NAME = "configuration_name";
  /**
   * The name of the pre-configured payment configuration to use for this order and must not exceed 60 characters. This value must match with a payment configuration set up on the WhatsApp Business Manager.
  **/
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_NAME)
  private String configurationName;

  public static final String SERIALIZED_NAME_BILLDESK = "billdesk";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_BILLDESK)
  private WhatsappMessageOrderPaymentSettingPaymentGatewayBilldesk billdesk;

  public static final String SERIALIZED_NAME_PAYU = "payu";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_PAYU)
  private WhatsappMessageOrderPaymentSettingPaymentGatewayPayu payu;

  public static final String SERIALIZED_NAME_RAZORPAY = "razorpay";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_RAZORPAY)
  private WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay razorpay;

  public static final String SERIALIZED_NAME_ZAAKPAY = "zaakpay";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_ZAAKPAY)
  private WhatsappMessageOrderPaymentSettingPaymentGatewayZaakpay zaakpay;

  public WhatsappMessageOrderPaymentGateway() { 
  }

  public WhatsappMessageOrderPaymentGateway type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Payment type. Must set this to &#x60;billdesk&#x60;, &#x60;razorpay&#x60;, &#x60;payu&#x60;, or &#x60;zaakpay&#x60;, if you have linked your BillDesk, Razorpay, PayU, or Zaakpay payment gateway to accept payments.
   * @return type
  **/
  @javax.annotation.Nonnull

  public TypeEnum getType() {
    return type;
  }


  /**
   * Payment type. Must set this to &#x60;billdesk&#x60;, &#x60;razorpay&#x60;, &#x60;payu&#x60;, or &#x60;zaakpay&#x60;, if you have linked your BillDesk, Razorpay, PayU, or Zaakpay payment gateway to accept payments.
   **/
  @ApiModelProperty(required = true, value = "Payment type. Must set this to `billdesk`, `razorpay`, `payu`, or `zaakpay`, if you have linked your BillDesk, Razorpay, PayU, or Zaakpay payment gateway to accept payments.")
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public WhatsappMessageOrderPaymentGateway configurationName(String configurationName) {
    
    this.configurationName = configurationName;
    return this;
  }

   /**
   * The name of the pre-configured payment configuration to use for this order and must not exceed 60 characters. This value must match with a payment configuration set up on the WhatsApp Business Manager.
   * @return configurationName
  **/
  @javax.annotation.Nonnull

  public String getConfigurationName() {
    return configurationName;
  }


  /**
   * The name of the pre-configured payment configuration to use for this order and must not exceed 60 characters. This value must match with a payment configuration set up on the WhatsApp Business Manager.
   **/
  @ApiModelProperty(required = true, value = "The name of the pre-configured payment configuration to use for this order and must not exceed 60 characters. This value must match with a payment configuration set up on the WhatsApp Business Manager.")
  public void setConfigurationName(String configurationName) {
    this.configurationName = configurationName;
  }


  public WhatsappMessageOrderPaymentGateway billdesk(WhatsappMessageOrderPaymentSettingPaymentGatewayBilldesk billdesk) {
    
    this.billdesk = billdesk;
    return this;
  }

   /**
   * Get billdesk
   * @return billdesk
  **/
  @javax.annotation.Nullable

  public WhatsappMessageOrderPaymentSettingPaymentGatewayBilldesk getBilldesk() {
    return billdesk;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setBilldesk(WhatsappMessageOrderPaymentSettingPaymentGatewayBilldesk billdesk) {
    this.billdesk = billdesk;
  }


  public WhatsappMessageOrderPaymentGateway payu(WhatsappMessageOrderPaymentSettingPaymentGatewayPayu payu) {
    
    this.payu = payu;
    return this;
  }

   /**
   * Get payu
   * @return payu
  **/
  @javax.annotation.Nullable

  public WhatsappMessageOrderPaymentSettingPaymentGatewayPayu getPayu() {
    return payu;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setPayu(WhatsappMessageOrderPaymentSettingPaymentGatewayPayu payu) {
    this.payu = payu;
  }


  public WhatsappMessageOrderPaymentGateway razorpay(WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay razorpay) {
    
    this.razorpay = razorpay;
    return this;
  }

   /**
   * Get razorpay
   * @return razorpay
  **/
  @javax.annotation.Nullable

  public WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay getRazorpay() {
    return razorpay;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setRazorpay(WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay razorpay) {
    this.razorpay = razorpay;
  }


  public WhatsappMessageOrderPaymentGateway zaakpay(WhatsappMessageOrderPaymentSettingPaymentGatewayZaakpay zaakpay) {
    
    this.zaakpay = zaakpay;
    return this;
  }

   /**
   * Get zaakpay
   * @return zaakpay
  **/
  @javax.annotation.Nullable

  public WhatsappMessageOrderPaymentSettingPaymentGatewayZaakpay getZaakpay() {
    return zaakpay;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setZaakpay(WhatsappMessageOrderPaymentSettingPaymentGatewayZaakpay zaakpay) {
    this.zaakpay = zaakpay;
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
  public WhatsappMessageOrderPaymentGateway putAdditionalProperty(String key, Object value) {
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
    WhatsappMessageOrderPaymentGateway whatsappMessageOrderPaymentGateway = (WhatsappMessageOrderPaymentGateway) o;
    return Objects.equals(this.type, whatsappMessageOrderPaymentGateway.type) &&
        Objects.equals(this.configurationName, whatsappMessageOrderPaymentGateway.configurationName) &&
        Objects.equals(this.billdesk, whatsappMessageOrderPaymentGateway.billdesk) &&
        Objects.equals(this.payu, whatsappMessageOrderPaymentGateway.payu) &&
        Objects.equals(this.razorpay, whatsappMessageOrderPaymentGateway.razorpay) &&
        Objects.equals(this.zaakpay, whatsappMessageOrderPaymentGateway.zaakpay)&&
        Objects.equals(this.additionalProperties, whatsappMessageOrderPaymentGateway.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, configurationName, billdesk, payu, razorpay, zaakpay, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappMessageOrderPaymentGateway {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
    sb.append("    billdesk: ").append(toIndentedString(billdesk)).append("\n");
    sb.append("    payu: ").append(toIndentedString(payu)).append("\n");
    sb.append("    razorpay: ").append(toIndentedString(razorpay)).append("\n");
    sb.append("    zaakpay: ").append(toIndentedString(zaakpay)).append("\n");
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
    openapiFields.add("configuration_name");
    openapiFields.add("billdesk");
    openapiFields.add("payu");
    openapiFields.add("razorpay");
    openapiFields.add("zaakpay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("configuration_name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappMessageOrderPaymentGateway
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappMessageOrderPaymentGateway.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappMessageOrderPaymentGateway is not found in the empty JSON string", WhatsappMessageOrderPaymentGateway.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WhatsappMessageOrderPaymentGateway.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("configuration_name") != null && !jsonObj.get("configuration_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configuration_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configuration_name").toString()));
      }
      // validate the optional field `billdesk`
      if (jsonObj.getAsJsonObject("billdesk") != null) {
        WhatsappMessageOrderPaymentSettingPaymentGatewayBilldesk.validateJsonObject(jsonObj.getAsJsonObject("billdesk"));
      }
      // validate the optional field `payu`
      if (jsonObj.getAsJsonObject("payu") != null) {
        WhatsappMessageOrderPaymentSettingPaymentGatewayPayu.validateJsonObject(jsonObj.getAsJsonObject("payu"));
      }
      // validate the optional field `razorpay`
      if (jsonObj.getAsJsonObject("razorpay") != null) {
        WhatsappMessageOrderPaymentSettingPaymentGatewayRazorpay.validateJsonObject(jsonObj.getAsJsonObject("razorpay"));
      }
      // validate the optional field `zaakpay`
      if (jsonObj.getAsJsonObject("zaakpay") != null) {
        WhatsappMessageOrderPaymentSettingPaymentGatewayZaakpay.validateJsonObject(jsonObj.getAsJsonObject("zaakpay"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappMessageOrderPaymentGateway.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappMessageOrderPaymentGateway' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappMessageOrderPaymentGateway> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappMessageOrderPaymentGateway.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappMessageOrderPaymentGateway>() {
           @Override
           public void write(JsonWriter out, WhatsappMessageOrderPaymentGateway value) throws IOException {
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
           public WhatsappMessageOrderPaymentGateway read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappMessageOrderPaymentGateway instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappMessageOrderPaymentGateway given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappMessageOrderPaymentGateway
  * @throws IOException if the JSON string is invalid with respect to WhatsappMessageOrderPaymentGateway
  */
  public static WhatsappMessageOrderPaymentGateway fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappMessageOrderPaymentGateway.class);
  }

 /**
  * Convert an instance of WhatsappMessageOrderPaymentGateway to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

