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
import com.ycloud.client.model.CustomEventDefinitionProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
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
 * Represents a custom event definition.
 */
@ApiModel(description = "Represents a custom event definition.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomEventDefinition {
  public static final String SERIALIZED_NAME_NAME = "name";
  /**
   * The name of the custom event definition.
  **/
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LABEL = "label";
  /**
   * The label of the event definition, used for display purposes.
  **/
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  /**
   * The description of the event definition.
  **/
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Type of the object that the event will be associated with. - &#x60;CONTACT&#x60;: Indicates that the object is a &#x60;contact&#x60;.
   */
  @JsonAdapter(ObjectTypeEnum.Adapter.class)
  public enum ObjectTypeEnum {
    CONTACT("CONTACT");

    private String value;

    ObjectTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectTypeEnum fromValue(String value) {
      for (ObjectTypeEnum b : ObjectTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ObjectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "objectType";
  /**
   * Type of the object that the event will be associated with. - &#x60;CONTACT&#x60;: Indicates that the object is a &#x60;contact&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private ObjectTypeEnum objectType;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  /**
   * The time at which this object is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Date createTime;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  /**
   * The list of property definitions for the event definition.
  **/
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<CustomEventDefinitionProperty> properties = null;

  public CustomEventDefinition() { 
  }

  public CustomEventDefinition name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the custom event definition.
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  /**
   * The name of the custom event definition.
   **/
  @ApiModelProperty(example = "propertyName", value = "The name of the custom event definition.")
  public void setName(String name) {
    this.name = name;
  }


  public CustomEventDefinition label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The label of the event definition, used for display purposes.
   * @return label
  **/
  @javax.annotation.Nullable

  public String getLabel() {
    return label;
  }


  /**
   * The label of the event definition, used for display purposes.
   **/
  @ApiModelProperty(example = "Property Label", value = "The label of the event definition, used for display purposes.")
  public void setLabel(String label) {
    this.label = label;
  }


  public CustomEventDefinition description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the event definition.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  /**
   * The description of the event definition.
   **/
  @ApiModelProperty(example = "Describes this property", value = "The description of the event definition.")
  public void setDescription(String description) {
    this.description = description;
  }


  public CustomEventDefinition objectType(ObjectTypeEnum objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * Type of the object that the event will be associated with. - &#x60;CONTACT&#x60;: Indicates that the object is a &#x60;contact&#x60;.
   * @return objectType
  **/
  @javax.annotation.Nullable

  public ObjectTypeEnum getObjectType() {
    return objectType;
  }


  /**
   * Type of the object that the event will be associated with. - &#x60;CONTACT&#x60;: Indicates that the object is a &#x60;contact&#x60;.
   **/
  @ApiModelProperty(example = "CONTACT", value = "Type of the object that the event will be associated with. - `CONTACT`: Indicates that the object is a `contact`.")
  public void setObjectType(ObjectTypeEnum objectType) {
    this.objectType = objectType;
  }


  public CustomEventDefinition createTime(Date createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * The time at which this object is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   * @return createTime
  **/
  @javax.annotation.Nullable

  public Date getCreateTime() {
    return createTime;
  }


  /**
   * The time at which this object is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   **/
  @ApiModelProperty(example = "2024-08-22T00:00Z", value = "The time at which this object is created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-06-01T12:00:00.000Z`.")
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public CustomEventDefinition properties(List<CustomEventDefinitionProperty> properties) {
    
    this.properties = properties;
    return this;
  }

  public CustomEventDefinition addPropertiesItem(CustomEventDefinitionProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * The list of property definitions for the event definition.
   * @return properties
  **/
  @javax.annotation.Nullable

  public List<CustomEventDefinitionProperty> getProperties() {
    return properties;
  }


  /**
   * The list of property definitions for the event definition.
   **/
  @ApiModelProperty(value = "The list of property definitions for the event definition.")
  public void setProperties(List<CustomEventDefinitionProperty> properties) {
    this.properties = properties;
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
  public CustomEventDefinition putAdditionalProperty(String key, Object value) {
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
    CustomEventDefinition customEventDefinition = (CustomEventDefinition) o;
    return Objects.equals(this.name, customEventDefinition.name) &&
        Objects.equals(this.label, customEventDefinition.label) &&
        Objects.equals(this.description, customEventDefinition.description) &&
        Objects.equals(this.objectType, customEventDefinition.objectType) &&
        Objects.equals(this.createTime, customEventDefinition.createTime) &&
        Objects.equals(this.properties, customEventDefinition.properties)&&
        Objects.equals(this.additionalProperties, customEventDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, label, description, objectType, createTime, properties, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEventDefinition {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("description");
    openapiFields.add("objectType");
    openapiFields.add("createTime");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomEventDefinition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomEventDefinition.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomEventDefinition is not found in the empty JSON string", CustomEventDefinition.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("objectType") != null && !jsonObj.get("objectType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectType").toString()));
      }
      JsonArray jsonArrayproperties = jsonObj.getAsJsonArray("properties");
      if (jsonArrayproperties != null) {
        // ensure the json data is an array
        if (!jsonObj.get("properties").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", jsonObj.get("properties").toString()));
        }

        // validate the optional field `properties` (array)
        for (int i = 0; i < jsonArrayproperties.size(); i++) {
          CustomEventDefinitionProperty.validateJsonObject(jsonArrayproperties.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomEventDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomEventDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomEventDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomEventDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomEventDefinition>() {
           @Override
           public void write(JsonWriter out, CustomEventDefinition value) throws IOException {
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
           public CustomEventDefinition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CustomEventDefinition instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CustomEventDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomEventDefinition
  * @throws IOException if the JSON string is invalid with respect to CustomEventDefinition
  */
  public static CustomEventDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomEventDefinition.class);
  }

 /**
  * Convert an instance of CustomEventDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

