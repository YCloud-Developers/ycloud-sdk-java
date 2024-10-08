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
import java.util.Date;
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
 * Contains the properties of the custom event data to be sent.
 */
@ApiModel(description = "Contains the properties of the custom event data to be sent.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomEventSendRequest {
  public static final String SERIALIZED_NAME_EVENT_NAME = "eventName";
  /**
   * Name of the event. One of the custom event names you previously defined.
  **/
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  public static final String SERIALIZED_NAME_OCCUR_TIME = "occurTime";
  /**
   * The time at which the event occurred, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;, if not provided, the current time will be used.
  **/
  @SerializedName(SERIALIZED_NAME_OCCUR_TIME)
  private Date occurTime;

  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  /**
   * ID of the object that the event is associated with. For events defined with &#x60;objectType&#x60; as &#x60;CONTACT&#x60;, the &#x60;objectId&#x60; should be a &#x60;contact&#x60; ID. Alternatively, you can use the &#x60;contactPhoneNumber&#x60; field to specify the contact.
  **/
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_CONTACT_PHONE_NUMBER = "contactPhoneNumber";
  /**
   * The phone number of the contact for events defined with &#x60;objectType&#x60; as &#x60;CONTACT&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_CONTACT_PHONE_NUMBER)
  private String contactPhoneNumber;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  /**
   * The properties of the custom event.
  **/
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Object> properties = null;

  public CustomEventSendRequest() { 
  }

  public CustomEventSendRequest eventName(String eventName) {
    
    this.eventName = eventName;
    return this;
  }

   /**
   * Name of the event. One of the custom event names you previously defined.
   * @return eventName
  **/
  @javax.annotation.Nonnull

  public String getEventName() {
    return eventName;
  }


  /**
   * Name of the event. One of the custom event names you previously defined.
   **/
  @ApiModelProperty(example = "unique_event_name", required = true, value = "Name of the event. One of the custom event names you previously defined.")
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  public CustomEventSendRequest occurTime(Date occurTime) {
    
    this.occurTime = occurTime;
    return this;
  }

   /**
   * The time at which the event occurred, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;, if not provided, the current time will be used.
   * @return occurTime
  **/
  @javax.annotation.Nullable

  public Date getOccurTime() {
    return occurTime;
  }


  /**
   * The time at which the event occurred, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;, if not provided, the current time will be used.
   **/
  @ApiModelProperty(example = "2022-06-01T12:00Z", value = "The time at which the event occurred, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-06-01T12:00:00.000Z`, if not provided, the current time will be used.")
  public void setOccurTime(Date occurTime) {
    this.occurTime = occurTime;
  }


  public CustomEventSendRequest objectId(String objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * ID of the object that the event is associated with. For events defined with &#x60;objectType&#x60; as &#x60;CONTACT&#x60;, the &#x60;objectId&#x60; should be a &#x60;contact&#x60; ID. Alternatively, you can use the &#x60;contactPhoneNumber&#x60; field to specify the contact.
   * @return objectId
  **/
  @javax.annotation.Nullable

  public String getObjectId() {
    return objectId;
  }


  /**
   * ID of the object that the event is associated with. For events defined with &#x60;objectType&#x60; as &#x60;CONTACT&#x60;, the &#x60;objectId&#x60; should be a &#x60;contact&#x60; ID. Alternatively, you can use the &#x60;contactPhoneNumber&#x60; field to specify the contact.
   **/
  @ApiModelProperty(value = "ID of the object that the event is associated with. For events defined with `objectType` as `CONTACT`, the `objectId` should be a `contact` ID. Alternatively, you can use the `contactPhoneNumber` field to specify the contact.")
  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  public CustomEventSendRequest contactPhoneNumber(String contactPhoneNumber) {
    
    this.contactPhoneNumber = contactPhoneNumber;
    return this;
  }

   /**
   * The phone number of the contact for events defined with &#x60;objectType&#x60; as &#x60;CONTACT&#x60;.
   * @return contactPhoneNumber
  **/
  @javax.annotation.Nullable

  public String getContactPhoneNumber() {
    return contactPhoneNumber;
  }


  /**
   * The phone number of the contact for events defined with &#x60;objectType&#x60; as &#x60;CONTACT&#x60;.
   **/
  @ApiModelProperty(value = "The phone number of the contact for events defined with `objectType` as `CONTACT`.")
  public void setContactPhoneNumber(String contactPhoneNumber) {
    this.contactPhoneNumber = contactPhoneNumber;
  }


  public CustomEventSendRequest properties(Map<String, Object> properties) {
    
    this.properties = properties;
    return this;
  }

  public CustomEventSendRequest putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties of the custom event.
   * @return properties
  **/
  @javax.annotation.Nullable

  public Map<String, Object> getProperties() {
    return properties;
  }


  /**
   * The properties of the custom event.
   **/
  @ApiModelProperty(example = "{\"property1\":\"value1\",\"property2\":\"value2\"}", value = "The properties of the custom event.")
  public void setProperties(Map<String, Object> properties) {
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
  public CustomEventSendRequest putAdditionalProperty(String key, Object value) {
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
    CustomEventSendRequest customEventSendRequest = (CustomEventSendRequest) o;
    return Objects.equals(this.eventName, customEventSendRequest.eventName) &&
        Objects.equals(this.occurTime, customEventSendRequest.occurTime) &&
        Objects.equals(this.objectId, customEventSendRequest.objectId) &&
        Objects.equals(this.contactPhoneNumber, customEventSendRequest.contactPhoneNumber) &&
        Objects.equals(this.properties, customEventSendRequest.properties)&&
        Objects.equals(this.additionalProperties, customEventSendRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, occurTime, objectId, contactPhoneNumber, properties, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEventSendRequest {\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    occurTime: ").append(toIndentedString(occurTime)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    contactPhoneNumber: ").append(toIndentedString(contactPhoneNumber)).append("\n");
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
    openapiFields.add("eventName");
    openapiFields.add("occurTime");
    openapiFields.add("objectId");
    openapiFields.add("contactPhoneNumber");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("eventName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomEventSendRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomEventSendRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomEventSendRequest is not found in the empty JSON string", CustomEventSendRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomEventSendRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("eventName") != null && !jsonObj.get("eventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventName").toString()));
      }
      if (jsonObj.get("objectId") != null && !jsonObj.get("objectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectId").toString()));
      }
      if (jsonObj.get("contactPhoneNumber") != null && !jsonObj.get("contactPhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contactPhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contactPhoneNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomEventSendRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomEventSendRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomEventSendRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomEventSendRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomEventSendRequest>() {
           @Override
           public void write(JsonWriter out, CustomEventSendRequest value) throws IOException {
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
           public CustomEventSendRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CustomEventSendRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CustomEventSendRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomEventSendRequest
  * @throws IOException if the JSON string is invalid with respect to CustomEventSendRequest
  */
  public static CustomEventSendRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomEventSendRequest.class);
  }

 /**
  * Convert an instance of CustomEventSendRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

