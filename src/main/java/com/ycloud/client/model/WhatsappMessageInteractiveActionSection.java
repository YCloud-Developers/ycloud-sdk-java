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
import com.ycloud.client.model.WhatsappMessageInteractiveActionSectionProductItem;
import com.ycloud.client.model.WhatsappMessageInteractiveActionSectionRow;
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
 * WhatsApp Message Interactive Section Object.
 */
@ApiModel(description = "WhatsApp Message Interactive Section Object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappMessageInteractiveActionSection {
  public static final String SERIALIZED_NAME_TITLE = "title";
  /**
   * **Required if the message has more than one section.** Title of the section. Maximum length: 24 characters.
  **/
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  /**
   * Contains a list of rows. You can have a total of 10 rows across your sections. Each row must have a title (Maximum length: 24 characters) and an ID (Maximum length: 200 characters). You can add a description (Maximum length: 72 characters), but it is optional.
  **/
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<WhatsappMessageInteractiveActionSectionRow> rows = null;

  public static final String SERIALIZED_NAME_PRODUCT_ITEMS = "product_items";
  /**
   * Required for Multi-Product Messages. Array of product objects. There is a minimum of 1 product per section and a maximum of 30 products across all sections.
  **/
  @SerializedName(SERIALIZED_NAME_PRODUCT_ITEMS)
  private List<WhatsappMessageInteractiveActionSectionProductItem> productItems = null;

  public WhatsappMessageInteractiveActionSection() { 
  }

  public WhatsappMessageInteractiveActionSection title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * **Required if the message has more than one section.** Title of the section. Maximum length: 24 characters.
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  /**
   * **Required if the message has more than one section.** Title of the section. Maximum length: 24 characters.
   **/
  @ApiModelProperty(value = "**Required if the message has more than one section.** Title of the section. Maximum length: 24 characters.")
  public void setTitle(String title) {
    this.title = title;
  }


  public WhatsappMessageInteractiveActionSection rows(List<WhatsappMessageInteractiveActionSectionRow> rows) {
    
    this.rows = rows;
    return this;
  }

  public WhatsappMessageInteractiveActionSection addRowsItem(WhatsappMessageInteractiveActionSectionRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Contains a list of rows. You can have a total of 10 rows across your sections. Each row must have a title (Maximum length: 24 characters) and an ID (Maximum length: 200 characters). You can add a description (Maximum length: 72 characters), but it is optional.
   * @return rows
  **/
  @javax.annotation.Nullable

  public List<WhatsappMessageInteractiveActionSectionRow> getRows() {
    return rows;
  }


  /**
   * Contains a list of rows. You can have a total of 10 rows across your sections. Each row must have a title (Maximum length: 24 characters) and an ID (Maximum length: 200 characters). You can add a description (Maximum length: 72 characters), but it is optional.
   **/
  @ApiModelProperty(value = "Contains a list of rows. You can have a total of 10 rows across your sections. Each row must have a title (Maximum length: 24 characters) and an ID (Maximum length: 200 characters). You can add a description (Maximum length: 72 characters), but it is optional.")
  public void setRows(List<WhatsappMessageInteractiveActionSectionRow> rows) {
    this.rows = rows;
  }


  public WhatsappMessageInteractiveActionSection productItems(List<WhatsappMessageInteractiveActionSectionProductItem> productItems) {
    
    this.productItems = productItems;
    return this;
  }

  public WhatsappMessageInteractiveActionSection addProductItemsItem(WhatsappMessageInteractiveActionSectionProductItem productItemsItem) {
    if (this.productItems == null) {
      this.productItems = new ArrayList<>();
    }
    this.productItems.add(productItemsItem);
    return this;
  }

   /**
   * Required for Multi-Product Messages. Array of product objects. There is a minimum of 1 product per section and a maximum of 30 products across all sections.
   * @return productItems
  **/
  @javax.annotation.Nullable

  public List<WhatsappMessageInteractiveActionSectionProductItem> getProductItems() {
    return productItems;
  }


  /**
   * Required for Multi-Product Messages. Array of product objects. There is a minimum of 1 product per section and a maximum of 30 products across all sections.
   **/
  @ApiModelProperty(value = "Required for Multi-Product Messages. Array of product objects. There is a minimum of 1 product per section and a maximum of 30 products across all sections.")
  public void setProductItems(List<WhatsappMessageInteractiveActionSectionProductItem> productItems) {
    this.productItems = productItems;
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
  public WhatsappMessageInteractiveActionSection putAdditionalProperty(String key, Object value) {
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
    WhatsappMessageInteractiveActionSection whatsappMessageInteractiveActionSection = (WhatsappMessageInteractiveActionSection) o;
    return Objects.equals(this.title, whatsappMessageInteractiveActionSection.title) &&
        Objects.equals(this.rows, whatsappMessageInteractiveActionSection.rows) &&
        Objects.equals(this.productItems, whatsappMessageInteractiveActionSection.productItems)&&
        Objects.equals(this.additionalProperties, whatsappMessageInteractiveActionSection.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, rows, productItems, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappMessageInteractiveActionSection {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    productItems: ").append(toIndentedString(productItems)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("rows");
    openapiFields.add("product_items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappMessageInteractiveActionSection
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappMessageInteractiveActionSection.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappMessageInteractiveActionSection is not found in the empty JSON string", WhatsappMessageInteractiveActionSection.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      JsonArray jsonArrayrows = jsonObj.getAsJsonArray("rows");
      if (jsonArrayrows != null) {
        // ensure the json data is an array
        if (!jsonObj.get("rows").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `rows` to be an array in the JSON string but got `%s`", jsonObj.get("rows").toString()));
        }

        // validate the optional field `rows` (array)
        for (int i = 0; i < jsonArrayrows.size(); i++) {
          WhatsappMessageInteractiveActionSectionRow.validateJsonObject(jsonArrayrows.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayproductItems = jsonObj.getAsJsonArray("product_items");
      if (jsonArrayproductItems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("product_items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `product_items` to be an array in the JSON string but got `%s`", jsonObj.get("product_items").toString()));
        }

        // validate the optional field `product_items` (array)
        for (int i = 0; i < jsonArrayproductItems.size(); i++) {
          WhatsappMessageInteractiveActionSectionProductItem.validateJsonObject(jsonArrayproductItems.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappMessageInteractiveActionSection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappMessageInteractiveActionSection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappMessageInteractiveActionSection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappMessageInteractiveActionSection.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappMessageInteractiveActionSection>() {
           @Override
           public void write(JsonWriter out, WhatsappMessageInteractiveActionSection value) throws IOException {
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
           public WhatsappMessageInteractiveActionSection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappMessageInteractiveActionSection instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappMessageInteractiveActionSection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappMessageInteractiveActionSection
  * @throws IOException if the JSON string is invalid with respect to WhatsappMessageInteractiveActionSection
  */
  public static WhatsappMessageInteractiveActionSection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappMessageInteractiveActionSection.class);
  }

 /**
  * Convert an instance of WhatsappMessageInteractiveActionSection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

