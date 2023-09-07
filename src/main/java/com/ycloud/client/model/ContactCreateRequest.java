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
import com.ycloud.client.model.ContactCreateRequestCustomAttributesInner;
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
 * Contains the properties of the contact to be created.
 */
@ApiModel(description = "Contains the properties of the contact to be created.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContactCreateRequest {
  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  /**
   * Contact&#39;s nickname. Maximum length: 250 characters.
  **/
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  /**
   * Unique Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
  **/
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  /**
   * Two-letter country abbreviation. See [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
  **/
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  /**
   * Contact&#39;s email address. If present, the email address must be unique.
  **/
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  /**
   * Contact&#39;s tags. Max items: 50. Max characters per tag: 50.
  **/
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTES = "customAttributes";
  /**
   * Contact&#39;s custom attributes.
  **/
  @SerializedName(SERIALIZED_NAME_CUSTOM_ATTRIBUTES)
  private List<ContactCreateRequestCustomAttributesInner> customAttributes = null;

  public ContactCreateRequest() { 
  }

  public ContactCreateRequest nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Contact&#39;s nickname. Maximum length: 250 characters.
   * @return nickname
  **/
  @javax.annotation.Nullable

  public String getNickname() {
    return nickname;
  }


  /**
   * Contact&#39;s nickname. Maximum length: 250 characters.
   **/
  @ApiModelProperty(example = "nickname", value = "Contact's nickname. Maximum length: 250 characters.")
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public ContactCreateRequest phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Unique Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * @return phoneNumber
  **/
  @javax.annotation.Nonnull

  public String getPhoneNumber() {
    return phoneNumber;
  }


  /**
   * Unique Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   **/
  @ApiModelProperty(example = "+16315551111", required = true, value = "Unique Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.")
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public ContactCreateRequest countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Two-letter country abbreviation. See [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
   * @return countryCode
  **/
  @javax.annotation.Nullable

  public String getCountryCode() {
    return countryCode;
  }


  /**
   * Two-letter country abbreviation. See [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
   **/
  @ApiModelProperty(example = "GB", value = "Two-letter country abbreviation. See [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).")
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public ContactCreateRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Contact&#39;s email address. If present, the email address must be unique.
   * @return email
  **/
  @javax.annotation.Nullable

  public String getEmail() {
    return email;
  }


  /**
   * Contact&#39;s email address. If present, the email address must be unique.
   **/
  @ApiModelProperty(example = "support@ycloud.com", value = "Contact's email address. If present, the email address must be unique.")
  public void setEmail(String email) {
    this.email = email;
  }


  public ContactCreateRequest tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ContactCreateRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Contact&#39;s tags. Max items: 50. Max characters per tag: 50.
   * @return tags
  **/
  @javax.annotation.Nullable

  public List<String> getTags() {
    return tags;
  }


  /**
   * Contact&#39;s tags. Max items: 50. Max characters per tag: 50.
   **/
  @ApiModelProperty(value = "Contact's tags. Max items: 50. Max characters per tag: 50.")
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public ContactCreateRequest customAttributes(List<ContactCreateRequestCustomAttributesInner> customAttributes) {
    
    this.customAttributes = customAttributes;
    return this;
  }

  public ContactCreateRequest addCustomAttributesItem(ContactCreateRequestCustomAttributesInner customAttributesItem) {
    if (this.customAttributes == null) {
      this.customAttributes = new ArrayList<>();
    }
    this.customAttributes.add(customAttributesItem);
    return this;
  }

   /**
   * Contact&#39;s custom attributes.
   * @return customAttributes
  **/
  @javax.annotation.Nullable

  public List<ContactCreateRequestCustomAttributesInner> getCustomAttributes() {
    return customAttributes;
  }


  /**
   * Contact&#39;s custom attributes.
   **/
  @ApiModelProperty(value = "Contact's custom attributes.")
  public void setCustomAttributes(List<ContactCreateRequestCustomAttributesInner> customAttributes) {
    this.customAttributes = customAttributes;
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
  public ContactCreateRequest putAdditionalProperty(String key, Object value) {
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
    ContactCreateRequest contactCreateRequest = (ContactCreateRequest) o;
    return Objects.equals(this.nickname, contactCreateRequest.nickname) &&
        Objects.equals(this.phoneNumber, contactCreateRequest.phoneNumber) &&
        Objects.equals(this.countryCode, contactCreateRequest.countryCode) &&
        Objects.equals(this.email, contactCreateRequest.email) &&
        Objects.equals(this.tags, contactCreateRequest.tags) &&
        Objects.equals(this.customAttributes, contactCreateRequest.customAttributes)&&
        Objects.equals(this.additionalProperties, contactCreateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nickname, phoneNumber, countryCode, email, tags, customAttributes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactCreateRequest {\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
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
    openapiFields.add("nickname");
    openapiFields.add("phoneNumber");
    openapiFields.add("countryCode");
    openapiFields.add("email");
    openapiFields.add("tags");
    openapiFields.add("customAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("phoneNumber");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContactCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ContactCreateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactCreateRequest is not found in the empty JSON string", ContactCreateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContactCreateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("nickname") != null && !jsonObj.get("nickname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nickname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nickname").toString()));
      }
      if (jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if (jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      JsonArray jsonArraycustomAttributes = jsonObj.getAsJsonArray("customAttributes");
      if (jsonArraycustomAttributes != null) {
        // ensure the json data is an array
        if (!jsonObj.get("customAttributes").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `customAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("customAttributes").toString()));
        }

        // validate the optional field `customAttributes` (array)
        for (int i = 0; i < jsonArraycustomAttributes.size(); i++) {
          ContactCreateRequestCustomAttributesInner.validateJsonObject(jsonArraycustomAttributes.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactCreateRequest>() {
           @Override
           public void write(JsonWriter out, ContactCreateRequest value) throws IOException {
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
           public ContactCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ContactCreateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ContactCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactCreateRequest
  * @throws IOException if the JSON string is invalid with respect to ContactCreateRequest
  */
  public static ContactCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactCreateRequest.class);
  }

 /**
  * Convert an instance of ContactCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

