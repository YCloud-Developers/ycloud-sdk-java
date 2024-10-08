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
import com.ycloud.client.model.WhatsappMessageMedia;
import com.ycloud.client.model.WhatsappMessageOrderAmount;
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
 * WhatsappMessageOrderItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappMessageOrderItem {
  public static final String SERIALIZED_NAME_RETAILER_ID = "retailer_id";
  /**
   * Content ID for an item in the order from your catalog.
  **/
  @SerializedName(SERIALIZED_NAME_RETAILER_ID)
  private String retailerId;

  public static final String SERIALIZED_NAME_NAME = "name";
  /**
   * The item&#39;s name to be displayed to the user. Cannot exceed 60 characters.
  **/
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private WhatsappMessageMedia image;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private WhatsappMessageOrderAmount amount;

  public static final String SERIALIZED_NAME_SALE_AMOUNT = "sale_amount";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_SALE_AMOUNT)
  private WhatsappMessageOrderAmount saleAmount;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  /**
   * The number of items in the order.
  **/
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_COUNTRY_OF_ORIGIN = "country_of_origin";
  /**
   * Required if &#x60;catalog_id&#x60; is not present. The country of origin of the product.
  **/
  @SerializedName(SERIALIZED_NAME_COUNTRY_OF_ORIGIN)
  private String countryOfOrigin;

  public static final String SERIALIZED_NAME_IMPORTER_NAME = "importer_name";
  /**
   * Required if &#x60;catalog_id&#x60; is not present. Name of the importer company.
  **/
  @SerializedName(SERIALIZED_NAME_IMPORTER_NAME)
  private String importerName;

  public static final String SERIALIZED_NAME_IMPORTER_ADDRESS = "importer_address";
  /**
   * Required if &#x60;catalog_id&#x60; is not present. Address of importer company.
  **/
  @SerializedName(SERIALIZED_NAME_IMPORTER_ADDRESS)
  private String importerAddress;

  public WhatsappMessageOrderItem() { 
  }

  public WhatsappMessageOrderItem retailerId(String retailerId) {
    
    this.retailerId = retailerId;
    return this;
  }

   /**
   * Content ID for an item in the order from your catalog.
   * @return retailerId
  **/
  @javax.annotation.Nullable

  public String getRetailerId() {
    return retailerId;
  }


  /**
   * Content ID for an item in the order from your catalog.
   **/
  @ApiModelProperty(value = "Content ID for an item in the order from your catalog.")
  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }


  public WhatsappMessageOrderItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The item&#39;s name to be displayed to the user. Cannot exceed 60 characters.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  /**
   * The item&#39;s name to be displayed to the user. Cannot exceed 60 characters.
   **/
  @ApiModelProperty(required = true, value = "The item's name to be displayed to the user. Cannot exceed 60 characters.")
  public void setName(String name) {
    this.name = name;
  }


  public WhatsappMessageOrderItem image(WhatsappMessageMedia image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable

  public WhatsappMessageMedia getImage() {
    return image;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setImage(WhatsappMessageMedia image) {
    this.image = image;
  }


  public WhatsappMessageOrderItem amount(WhatsappMessageOrderAmount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull

  public WhatsappMessageOrderAmount getAmount() {
    return amount;
  }


  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public void setAmount(WhatsappMessageOrderAmount amount) {
    this.amount = amount;
  }


  public WhatsappMessageOrderItem saleAmount(WhatsappMessageOrderAmount saleAmount) {
    
    this.saleAmount = saleAmount;
    return this;
  }

   /**
   * Get saleAmount
   * @return saleAmount
  **/
  @javax.annotation.Nullable

  public WhatsappMessageOrderAmount getSaleAmount() {
    return saleAmount;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setSaleAmount(WhatsappMessageOrderAmount saleAmount) {
    this.saleAmount = saleAmount;
  }


  public WhatsappMessageOrderItem quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of items in the order.
   * @return quantity
  **/
  @javax.annotation.Nonnull

  public Integer getQuantity() {
    return quantity;
  }


  /**
   * The number of items in the order.
   **/
  @ApiModelProperty(required = true, value = "The number of items in the order.")
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public WhatsappMessageOrderItem countryOfOrigin(String countryOfOrigin) {
    
    this.countryOfOrigin = countryOfOrigin;
    return this;
  }

   /**
   * Required if &#x60;catalog_id&#x60; is not present. The country of origin of the product.
   * @return countryOfOrigin
  **/
  @javax.annotation.Nullable

  public String getCountryOfOrigin() {
    return countryOfOrigin;
  }


  /**
   * Required if &#x60;catalog_id&#x60; is not present. The country of origin of the product.
   **/
  @ApiModelProperty(value = "Required if `catalog_id` is not present. The country of origin of the product.")
  public void setCountryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }


  public WhatsappMessageOrderItem importerName(String importerName) {
    
    this.importerName = importerName;
    return this;
  }

   /**
   * Required if &#x60;catalog_id&#x60; is not present. Name of the importer company.
   * @return importerName
  **/
  @javax.annotation.Nullable

  public String getImporterName() {
    return importerName;
  }


  /**
   * Required if &#x60;catalog_id&#x60; is not present. Name of the importer company.
   **/
  @ApiModelProperty(value = "Required if `catalog_id` is not present. Name of the importer company.")
  public void setImporterName(String importerName) {
    this.importerName = importerName;
  }


  public WhatsappMessageOrderItem importerAddress(String importerAddress) {
    
    this.importerAddress = importerAddress;
    return this;
  }

   /**
   * Required if &#x60;catalog_id&#x60; is not present. Address of importer company.
   * @return importerAddress
  **/
  @javax.annotation.Nullable

  public String getImporterAddress() {
    return importerAddress;
  }


  /**
   * Required if &#x60;catalog_id&#x60; is not present. Address of importer company.
   **/
  @ApiModelProperty(value = "Required if `catalog_id` is not present. Address of importer company.")
  public void setImporterAddress(String importerAddress) {
    this.importerAddress = importerAddress;
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
  public WhatsappMessageOrderItem putAdditionalProperty(String key, Object value) {
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
    WhatsappMessageOrderItem whatsappMessageOrderItem = (WhatsappMessageOrderItem) o;
    return Objects.equals(this.retailerId, whatsappMessageOrderItem.retailerId) &&
        Objects.equals(this.name, whatsappMessageOrderItem.name) &&
        Objects.equals(this.image, whatsappMessageOrderItem.image) &&
        Objects.equals(this.amount, whatsappMessageOrderItem.amount) &&
        Objects.equals(this.saleAmount, whatsappMessageOrderItem.saleAmount) &&
        Objects.equals(this.quantity, whatsappMessageOrderItem.quantity) &&
        Objects.equals(this.countryOfOrigin, whatsappMessageOrderItem.countryOfOrigin) &&
        Objects.equals(this.importerName, whatsappMessageOrderItem.importerName) &&
        Objects.equals(this.importerAddress, whatsappMessageOrderItem.importerAddress)&&
        Objects.equals(this.additionalProperties, whatsappMessageOrderItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retailerId, name, image, amount, saleAmount, quantity, countryOfOrigin, importerName, importerAddress, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappMessageOrderItem {\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    saleAmount: ").append(toIndentedString(saleAmount)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    countryOfOrigin: ").append(toIndentedString(countryOfOrigin)).append("\n");
    sb.append("    importerName: ").append(toIndentedString(importerName)).append("\n");
    sb.append("    importerAddress: ").append(toIndentedString(importerAddress)).append("\n");
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
    openapiFields.add("retailer_id");
    openapiFields.add("name");
    openapiFields.add("image");
    openapiFields.add("amount");
    openapiFields.add("sale_amount");
    openapiFields.add("quantity");
    openapiFields.add("country_of_origin");
    openapiFields.add("importer_name");
    openapiFields.add("importer_address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("quantity");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappMessageOrderItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappMessageOrderItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappMessageOrderItem is not found in the empty JSON string", WhatsappMessageOrderItem.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WhatsappMessageOrderItem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("retailer_id") != null && !jsonObj.get("retailer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retailer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retailer_id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `image`
      if (jsonObj.getAsJsonObject("image") != null) {
        WhatsappMessageMedia.validateJsonObject(jsonObj.getAsJsonObject("image"));
      }
      // validate the optional field `amount`
      if (jsonObj.getAsJsonObject("amount") != null) {
        WhatsappMessageOrderAmount.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      // validate the optional field `sale_amount`
      if (jsonObj.getAsJsonObject("sale_amount") != null) {
        WhatsappMessageOrderAmount.validateJsonObject(jsonObj.getAsJsonObject("sale_amount"));
      }
      if (jsonObj.get("country_of_origin") != null && !jsonObj.get("country_of_origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_of_origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_of_origin").toString()));
      }
      if (jsonObj.get("importer_name") != null && !jsonObj.get("importer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `importer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("importer_name").toString()));
      }
      if (jsonObj.get("importer_address") != null && !jsonObj.get("importer_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `importer_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("importer_address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappMessageOrderItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappMessageOrderItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappMessageOrderItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappMessageOrderItem.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappMessageOrderItem>() {
           @Override
           public void write(JsonWriter out, WhatsappMessageOrderItem value) throws IOException {
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
           public WhatsappMessageOrderItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappMessageOrderItem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappMessageOrderItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappMessageOrderItem
  * @throws IOException if the JSON string is invalid with respect to WhatsappMessageOrderItem
  */
  public static WhatsappMessageOrderItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappMessageOrderItem.class);
  }

 /**
  * Convert an instance of WhatsappMessageOrderItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

