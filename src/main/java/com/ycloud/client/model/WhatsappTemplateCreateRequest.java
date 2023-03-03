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
import com.ycloud.client.model.WhatsappTemplateCategory;
import com.ycloud.client.model.WhatsappTemplateComponent;
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
 * See [WhatsApp Templates](https://developers.facebook.com/docs/whatsapp/business-management-api/message-templates).
 */
@ApiModel(description = "See [WhatsApp Templates](https://developers.facebook.com/docs/whatsapp/business-management-api/message-templates).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappTemplateCreateRequest {
  public static final String SERIALIZED_NAME_WABA_ID = "wabaId";
  /**
   * WhatsApp Business Account ID.
  **/
  @SerializedName(SERIALIZED_NAME_WABA_ID)
  private String wabaId;

  public static final String SERIALIZED_NAME_NAME = "name";
  /**
   * Name of the template.
  **/
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  /**
   * Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages-) for all codes.
  **/
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private WhatsappTemplateCategory category;

  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private List<WhatsappTemplateComponent> components = new ArrayList<>();

  public WhatsappTemplateCreateRequest() { 
  }

  public WhatsappTemplateCreateRequest wabaId(String wabaId) {
    
    this.wabaId = wabaId;
    return this;
  }

   /**
   * WhatsApp Business Account ID.
   * @return wabaId
  **/
  @javax.annotation.Nonnull

  public String getWabaId() {
    return wabaId;
  }


  /**
   * WhatsApp Business Account ID.
   **/
  @ApiModelProperty(example = "whatsapp-business-account-id", required = true, value = "WhatsApp Business Account ID.")
  public void setWabaId(String wabaId) {
    this.wabaId = wabaId;
  }


  public WhatsappTemplateCreateRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the template.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  /**
   * Name of the template.
   **/
  @ApiModelProperty(example = "sample_whatsapp_template", required = true, value = "Name of the template.")
  public void setName(String name) {
    this.name = name;
  }


  public WhatsappTemplateCreateRequest language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages-) for all codes.
   * @return language
  **/
  @javax.annotation.Nonnull

  public String getLanguage() {
    return language;
  }


  /**
   * Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages-) for all codes.
   **/
  @ApiModelProperty(example = "en", required = true, value = "Language code of the template. See [Supported Languages](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates#supported-languages-) for all codes.")
  public void setLanguage(String language) {
    this.language = language;
  }


  public WhatsappTemplateCreateRequest category(WhatsappTemplateCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nonnull

  public WhatsappTemplateCategory getCategory() {
    return category;
  }


  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public void setCategory(WhatsappTemplateCategory category) {
    this.category = category;
  }


  public WhatsappTemplateCreateRequest components(List<WhatsappTemplateComponent> components) {
    
    this.components = components;
    return this;
  }

  public WhatsappTemplateCreateRequest addComponentsItem(WhatsappTemplateComponent componentsItem) {
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Get components
   * @return components
  **/
  @javax.annotation.Nonnull

  public List<WhatsappTemplateComponent> getComponents() {
    return components;
  }


  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public void setComponents(List<WhatsappTemplateComponent> components) {
    this.components = components;
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
  public WhatsappTemplateCreateRequest putAdditionalProperty(String key, Object value) {
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
    WhatsappTemplateCreateRequest whatsappTemplateCreateRequest = (WhatsappTemplateCreateRequest) o;
    return Objects.equals(this.wabaId, whatsappTemplateCreateRequest.wabaId) &&
        Objects.equals(this.name, whatsappTemplateCreateRequest.name) &&
        Objects.equals(this.language, whatsappTemplateCreateRequest.language) &&
        Objects.equals(this.category, whatsappTemplateCreateRequest.category) &&
        Objects.equals(this.components, whatsappTemplateCreateRequest.components)&&
        Objects.equals(this.additionalProperties, whatsappTemplateCreateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wabaId, name, language, category, components, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappTemplateCreateRequest {\n");
    sb.append("    wabaId: ").append(toIndentedString(wabaId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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
    openapiFields.add("wabaId");
    openapiFields.add("name");
    openapiFields.add("language");
    openapiFields.add("category");
    openapiFields.add("components");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("wabaId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("language");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("components");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappTemplateCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappTemplateCreateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappTemplateCreateRequest is not found in the empty JSON string", WhatsappTemplateCreateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WhatsappTemplateCreateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("wabaId") != null && !jsonObj.get("wabaId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wabaId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wabaId").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      JsonArray jsonArraycomponents = jsonObj.getAsJsonArray("components");
      if (jsonArraycomponents != null) {
        // ensure the json data is an array
        if (!jsonObj.get("components").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `components` to be an array in the JSON string but got `%s`", jsonObj.get("components").toString()));
        }

        // validate the optional field `components` (array)
        for (int i = 0; i < jsonArraycomponents.size(); i++) {
          WhatsappTemplateComponent.validateJsonObject(jsonArraycomponents.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappTemplateCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappTemplateCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappTemplateCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappTemplateCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappTemplateCreateRequest>() {
           @Override
           public void write(JsonWriter out, WhatsappTemplateCreateRequest value) throws IOException {
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
           public WhatsappTemplateCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappTemplateCreateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappTemplateCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappTemplateCreateRequest
  * @throws IOException if the JSON string is invalid with respect to WhatsappTemplateCreateRequest
  */
  public static WhatsappTemplateCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappTemplateCreateRequest.class);
  }

 /**
  * Convert an instance of WhatsappTemplateCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

