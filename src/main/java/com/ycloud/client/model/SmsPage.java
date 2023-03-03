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
import com.ycloud.client.model.Page;
import com.ycloud.client.model.Sms;
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
 * Represents a given page of SMS messages.
 */
@ApiModel(description = "Represents a given page of SMS messages.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SmsPage {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  /**
   * An array containing SMS objects.
  **/
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Sms> items = null;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  /**
   * The position of the item this page starts from, zero-based. e.g., the 11th item is at offset 10.
  **/
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  /**
   * A limit on the number of items to be returned, between 1 and 100, defaults to 10.
  **/
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_LENGTH = "length";
  /**
   * The actual number of items in the page.
  **/
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Integer length;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  /**
   * The total number of items. This field is returned only when the request parameter &#x60;includeTotal&#x60; is set to &#x60;true&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public SmsPage() { 
  }

  public SmsPage items(List<Sms> items) {
    
    this.items = items;
    return this;
  }

  public SmsPage addItemsItem(Sms itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * An array containing SMS objects.
   * @return items
  **/
  @javax.annotation.Nullable

  public List<Sms> getItems() {
    return items;
  }


  /**
   * An array containing SMS objects.
   **/
  @ApiModelProperty(value = "An array containing SMS objects.")
  public void setItems(List<Sms> items) {
    this.items = items;
  }


  public SmsPage offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The position of the item this page starts from, zero-based. e.g., the 11th item is at offset 10.
   * minimum: 0
   * @return offset
  **/
  @javax.annotation.Nonnull

  public Integer getOffset() {
    return offset;
  }


  /**
   * The position of the item this page starts from, zero-based. e.g., the 11th item is at offset 10.
   **/
  @ApiModelProperty(required = true, value = "The position of the item this page starts from, zero-based. e.g., the 11th item is at offset 10.")
  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public SmsPage limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * A limit on the number of items to be returned, between 1 and 100, defaults to 10.
   * minimum: 1
   * @return limit
  **/
  @javax.annotation.Nonnull

  public Integer getLimit() {
    return limit;
  }


  /**
   * A limit on the number of items to be returned, between 1 and 100, defaults to 10.
   **/
  @ApiModelProperty(required = true, value = "A limit on the number of items to be returned, between 1 and 100, defaults to 10.")
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public SmsPage length(Integer length) {
    
    this.length = length;
    return this;
  }

   /**
   * The actual number of items in the page.
   * minimum: 0
   * @return length
  **/
  @javax.annotation.Nonnull

  public Integer getLength() {
    return length;
  }


  /**
   * The actual number of items in the page.
   **/
  @ApiModelProperty(required = true, value = "The actual number of items in the page.")
  public void setLength(Integer length) {
    this.length = length;
  }


  public SmsPage total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total number of items. This field is returned only when the request parameter &#x60;includeTotal&#x60; is set to &#x60;true&#x60;.
   * minimum: 0
   * @return total
  **/
  @javax.annotation.Nullable

  public Integer getTotal() {
    return total;
  }


  /**
   * The total number of items. This field is returned only when the request parameter &#x60;includeTotal&#x60; is set to &#x60;true&#x60;.
   **/
  @ApiModelProperty(value = "The total number of items. This field is returned only when the request parameter `includeTotal` is set to `true`.")
  public void setTotal(Integer total) {
    this.total = total;
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
  public SmsPage putAdditionalProperty(String key, Object value) {
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
    SmsPage smsPage = (SmsPage) o;
    return Objects.equals(this.items, smsPage.items) &&
        Objects.equals(this.offset, smsPage.offset) &&
        Objects.equals(this.limit, smsPage.limit) &&
        Objects.equals(this.length, smsPage.length) &&
        Objects.equals(this.total, smsPage.total)&&
        Objects.equals(this.additionalProperties, smsPage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, offset, limit, length, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsPage {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("offset");
    openapiFields.add("limit");
    openapiFields.add("length");
    openapiFields.add("total");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("offset");
    openapiRequiredFields.add("limit");
    openapiRequiredFields.add("length");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SmsPage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SmsPage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SmsPage is not found in the empty JSON string", SmsPage.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SmsPage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      if (jsonArrayitems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
        }

        // validate the optional field `items` (array)
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          Sms.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SmsPage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SmsPage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SmsPage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SmsPage.class));

       return (TypeAdapter<T>) new TypeAdapter<SmsPage>() {
           @Override
           public void write(JsonWriter out, SmsPage value) throws IOException {
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
           public SmsPage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SmsPage instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SmsPage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SmsPage
  * @throws IOException if the JSON string is invalid with respect to SmsPage
  */
  public static SmsPage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SmsPage.class);
  }

 /**
  * Convert an instance of SmsPage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

