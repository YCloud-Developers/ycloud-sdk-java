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
 * A beneficiary is an intended recipient for shipping the physical goods in the order. Beneficiary information isn&#39;t shown to users but is needed for legal and compliance reasons.
 */
@ApiModel(description = "A beneficiary is an intended recipient for shipping the physical goods in the order. Beneficiary information isn't shown to users but is needed for legal and compliance reasons.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappMessageOrderBeneficiary {
  public static final String SERIALIZED_NAME_NAME = "name";
  /**
   * Name of the individual or business receiving the physical goods. Cannot exceed 200 characters.
  **/
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "address_line1";
  /**
   * Shipping address (Door/Tower Number, Street Name etc.). Cannot exceed 100 characters.
  **/
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "address_line2";
  /**
   * Shipping address (Landmark, Area, etc.). Cannot exceed 100 characters.
  **/
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_CITY = "city";
  /**
   * Name of the city.
  **/
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  /**
   * Name of the state.
  **/
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  /**
   * Name of the country. Currently the only supported value is &#x60;India&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  /**
   * 6-digit zipcode of shipping address.
  **/
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public WhatsappMessageOrderBeneficiary() { 
  }

  public WhatsappMessageOrderBeneficiary name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the individual or business receiving the physical goods. Cannot exceed 200 characters.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  /**
   * Name of the individual or business receiving the physical goods. Cannot exceed 200 characters.
   **/
  @ApiModelProperty(required = true, value = "Name of the individual or business receiving the physical goods. Cannot exceed 200 characters.")
  public void setName(String name) {
    this.name = name;
  }


  public WhatsappMessageOrderBeneficiary addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Shipping address (Door/Tower Number, Street Name etc.). Cannot exceed 100 characters.
   * @return addressLine1
  **/
  @javax.annotation.Nonnull

  public String getAddressLine1() {
    return addressLine1;
  }


  /**
   * Shipping address (Door/Tower Number, Street Name etc.). Cannot exceed 100 characters.
   **/
  @ApiModelProperty(required = true, value = "Shipping address (Door/Tower Number, Street Name etc.). Cannot exceed 100 characters.")
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public WhatsappMessageOrderBeneficiary addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Shipping address (Landmark, Area, etc.). Cannot exceed 100 characters.
   * @return addressLine2
  **/
  @javax.annotation.Nullable

  public String getAddressLine2() {
    return addressLine2;
  }


  /**
   * Shipping address (Landmark, Area, etc.). Cannot exceed 100 characters.
   **/
  @ApiModelProperty(value = "Shipping address (Landmark, Area, etc.). Cannot exceed 100 characters.")
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public WhatsappMessageOrderBeneficiary city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Name of the city.
   * @return city
  **/
  @javax.annotation.Nonnull

  public String getCity() {
    return city;
  }


  /**
   * Name of the city.
   **/
  @ApiModelProperty(required = true, value = "Name of the city.")
  public void setCity(String city) {
    this.city = city;
  }


  public WhatsappMessageOrderBeneficiary state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Name of the state.
   * @return state
  **/
  @javax.annotation.Nonnull

  public String getState() {
    return state;
  }


  /**
   * Name of the state.
   **/
  @ApiModelProperty(required = true, value = "Name of the state.")
  public void setState(String state) {
    this.state = state;
  }


  public WhatsappMessageOrderBeneficiary country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Name of the country. Currently the only supported value is &#x60;India&#x60;.
   * @return country
  **/
  @javax.annotation.Nonnull

  public String getCountry() {
    return country;
  }


  /**
   * Name of the country. Currently the only supported value is &#x60;India&#x60;.
   **/
  @ApiModelProperty(required = true, value = "Name of the country. Currently the only supported value is `India`.")
  public void setCountry(String country) {
    this.country = country;
  }


  public WhatsappMessageOrderBeneficiary postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * 6-digit zipcode of shipping address.
   * @return postalCode
  **/
  @javax.annotation.Nonnull

  public String getPostalCode() {
    return postalCode;
  }


  /**
   * 6-digit zipcode of shipping address.
   **/
  @ApiModelProperty(required = true, value = "6-digit zipcode of shipping address.")
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
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
  public WhatsappMessageOrderBeneficiary putAdditionalProperty(String key, Object value) {
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
    WhatsappMessageOrderBeneficiary whatsappMessageOrderBeneficiary = (WhatsappMessageOrderBeneficiary) o;
    return Objects.equals(this.name, whatsappMessageOrderBeneficiary.name) &&
        Objects.equals(this.addressLine1, whatsappMessageOrderBeneficiary.addressLine1) &&
        Objects.equals(this.addressLine2, whatsappMessageOrderBeneficiary.addressLine2) &&
        Objects.equals(this.city, whatsappMessageOrderBeneficiary.city) &&
        Objects.equals(this.state, whatsappMessageOrderBeneficiary.state) &&
        Objects.equals(this.country, whatsappMessageOrderBeneficiary.country) &&
        Objects.equals(this.postalCode, whatsappMessageOrderBeneficiary.postalCode)&&
        Objects.equals(this.additionalProperties, whatsappMessageOrderBeneficiary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, addressLine1, addressLine2, city, state, country, postalCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappMessageOrderBeneficiary {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("address_line1");
    openapiFields.add("address_line2");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("country");
    openapiFields.add("postal_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("address_line1");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("postal_code");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappMessageOrderBeneficiary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappMessageOrderBeneficiary.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappMessageOrderBeneficiary is not found in the empty JSON string", WhatsappMessageOrderBeneficiary.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WhatsappMessageOrderBeneficiary.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("address_line1") != null && !jsonObj.get("address_line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line1").toString()));
      }
      if (jsonObj.get("address_line2") != null && !jsonObj.get("address_line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line2").toString()));
      }
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappMessageOrderBeneficiary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappMessageOrderBeneficiary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappMessageOrderBeneficiary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappMessageOrderBeneficiary.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappMessageOrderBeneficiary>() {
           @Override
           public void write(JsonWriter out, WhatsappMessageOrderBeneficiary value) throws IOException {
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
           public WhatsappMessageOrderBeneficiary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappMessageOrderBeneficiary instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappMessageOrderBeneficiary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappMessageOrderBeneficiary
  * @throws IOException if the JSON string is invalid with respect to WhatsappMessageOrderBeneficiary
  */
  public static WhatsappMessageOrderBeneficiary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappMessageOrderBeneficiary.class);
  }

 /**
  * Convert an instance of WhatsappMessageOrderBeneficiary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

