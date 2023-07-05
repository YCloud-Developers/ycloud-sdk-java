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
import com.ycloud.client.model.WhatsappPhoneNumberProfileVertical;
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
 * WhatsApp Phone Number Business Profile. Customers can view your business profile by clicking your business&#39;s name or number in a conversation thread. See also [Business Profiles](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/business-profiles).
 */
@ApiModel(description = "WhatsApp Phone Number Business Profile. Customers can view your business profile by clicking your business's name or number in a conversation thread. See also [Business Profiles](https://developers.facebook.com/docs/whatsapp/cloud-api/reference/business-profiles).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappPhoneNumberProfileUpdateRequest {
  public static final String SERIALIZED_NAME_ABOUT = "about";
  /**
   * The business&#39;s **About** text. This text appears in the business&#39;s profile, beneath its profile image, phone number, and contact buttons. - String cannot be empty. - Strings must be between 1 and 139 characters. - Rendered emojis are supported however their unicode values are not. Emoji unicode values must be Java- or JavaScript-escape encoded. - Hyperlinks can be included but will not render as clickable links. - Markdown is not supported.
  **/
  @SerializedName(SERIALIZED_NAME_ABOUT)
  private String about;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  /**
   * Address of the business. Character limit 256.
  **/
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  /**
   * Description of the business. Character limit 512.
  **/
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  /**
   * The contact email address (in valid email format) of the business. Character limit 128.
  **/
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PROFILE_PICTURE_URL = "profilePictureUrl";
  /**
   * URL of the profile picture that was uploaded to Meta.
  **/
  @SerializedName(SERIALIZED_NAME_PROFILE_PICTURE_URL)
  private String profilePictureUrl;

  public static final String SERIALIZED_NAME_VERTICAL = "vertical";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_VERTICAL)
  private WhatsappPhoneNumberProfileVertical vertical;

  public static final String SERIALIZED_NAME_WEBSITES = "websites";
  /**
   * The URLs associated with the business. For instance, a website, Facebook Page, or Instagram. You must include the http:// or https:// portion of the URL. There is a maximum of 2 websites with a maximum of 255 characters each.
  **/
  @SerializedName(SERIALIZED_NAME_WEBSITES)
  private List<String> websites = null;

  public WhatsappPhoneNumberProfileUpdateRequest() { 
  }

  public WhatsappPhoneNumberProfileUpdateRequest about(String about) {
    
    this.about = about;
    return this;
  }

   /**
   * The business&#39;s **About** text. This text appears in the business&#39;s profile, beneath its profile image, phone number, and contact buttons. - String cannot be empty. - Strings must be between 1 and 139 characters. - Rendered emojis are supported however their unicode values are not. Emoji unicode values must be Java- or JavaScript-escape encoded. - Hyperlinks can be included but will not render as clickable links. - Markdown is not supported.
   * @return about
  **/
  @javax.annotation.Nullable

  public String getAbout() {
    return about;
  }


  /**
   * The business&#39;s **About** text. This text appears in the business&#39;s profile, beneath its profile image, phone number, and contact buttons. - String cannot be empty. - Strings must be between 1 and 139 characters. - Rendered emojis are supported however their unicode values are not. Emoji unicode values must be Java- or JavaScript-escape encoded. - Hyperlinks can be included but will not render as clickable links. - Markdown is not supported.
   **/
  @ApiModelProperty(example = "ABOUT", value = "The business's **About** text. This text appears in the business's profile, beneath its profile image, phone number, and contact buttons. - String cannot be empty. - Strings must be between 1 and 139 characters. - Rendered emojis are supported however their unicode values are not. Emoji unicode values must be Java- or JavaScript-escape encoded. - Hyperlinks can be included but will not render as clickable links. - Markdown is not supported.")
  public void setAbout(String about) {
    this.about = about;
  }


  public WhatsappPhoneNumberProfileUpdateRequest address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address of the business. Character limit 256.
   * @return address
  **/
  @javax.annotation.Nullable

  public String getAddress() {
    return address;
  }


  /**
   * Address of the business. Character limit 256.
   **/
  @ApiModelProperty(example = "ADDRESS", value = "Address of the business. Character limit 256.")
  public void setAddress(String address) {
    this.address = address;
  }


  public WhatsappPhoneNumberProfileUpdateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the business. Character limit 512.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  /**
   * Description of the business. Character limit 512.
   **/
  @ApiModelProperty(example = "DESCRIPTION", value = "Description of the business. Character limit 512.")
  public void setDescription(String description) {
    this.description = description;
  }


  public WhatsappPhoneNumberProfileUpdateRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The contact email address (in valid email format) of the business. Character limit 128.
   * @return email
  **/
  @javax.annotation.Nullable

  public String getEmail() {
    return email;
  }


  /**
   * The contact email address (in valid email format) of the business. Character limit 128.
   **/
  @ApiModelProperty(example = "tom@example.com", value = "The contact email address (in valid email format) of the business. Character limit 128.")
  public void setEmail(String email) {
    this.email = email;
  }


  public WhatsappPhoneNumberProfileUpdateRequest profilePictureUrl(String profilePictureUrl) {
    
    this.profilePictureUrl = profilePictureUrl;
    return this;
  }

   /**
   * URL of the profile picture that was uploaded to Meta.
   * @return profilePictureUrl
  **/
  @javax.annotation.Nullable

  public String getProfilePictureUrl() {
    return profilePictureUrl;
  }


  /**
   * URL of the profile picture that was uploaded to Meta.
   **/
  @ApiModelProperty(example = "https://URL", value = "URL of the profile picture that was uploaded to Meta.")
  public void setProfilePictureUrl(String profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
  }


  public WhatsappPhoneNumberProfileUpdateRequest vertical(WhatsappPhoneNumberProfileVertical vertical) {
    
    this.vertical = vertical;
    return this;
  }

   /**
   * Get vertical
   * @return vertical
  **/
  @javax.annotation.Nullable

  public WhatsappPhoneNumberProfileVertical getVertical() {
    return vertical;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setVertical(WhatsappPhoneNumberProfileVertical vertical) {
    this.vertical = vertical;
  }


  public WhatsappPhoneNumberProfileUpdateRequest websites(List<String> websites) {
    
    this.websites = websites;
    return this;
  }

  public WhatsappPhoneNumberProfileUpdateRequest addWebsitesItem(String websitesItem) {
    if (this.websites == null) {
      this.websites = new ArrayList<>();
    }
    this.websites.add(websitesItem);
    return this;
  }

   /**
   * The URLs associated with the business. For instance, a website, Facebook Page, or Instagram. You must include the http:// or https:// portion of the URL. There is a maximum of 2 websites with a maximum of 255 characters each.
   * @return websites
  **/
  @javax.annotation.Nullable

  public List<String> getWebsites() {
    return websites;
  }


  /**
   * The URLs associated with the business. For instance, a website, Facebook Page, or Instagram. You must include the http:// or https:// portion of the URL. There is a maximum of 2 websites with a maximum of 255 characters each.
   **/
  @ApiModelProperty(value = "The URLs associated with the business. For instance, a website, Facebook Page, or Instagram. You must include the http:// or https:// portion of the URL. There is a maximum of 2 websites with a maximum of 255 characters each.")
  public void setWebsites(List<String> websites) {
    this.websites = websites;
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
  public WhatsappPhoneNumberProfileUpdateRequest putAdditionalProperty(String key, Object value) {
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
    WhatsappPhoneNumberProfileUpdateRequest whatsappPhoneNumberProfileUpdateRequest = (WhatsappPhoneNumberProfileUpdateRequest) o;
    return Objects.equals(this.about, whatsappPhoneNumberProfileUpdateRequest.about) &&
        Objects.equals(this.address, whatsappPhoneNumberProfileUpdateRequest.address) &&
        Objects.equals(this.description, whatsappPhoneNumberProfileUpdateRequest.description) &&
        Objects.equals(this.email, whatsappPhoneNumberProfileUpdateRequest.email) &&
        Objects.equals(this.profilePictureUrl, whatsappPhoneNumberProfileUpdateRequest.profilePictureUrl) &&
        Objects.equals(this.vertical, whatsappPhoneNumberProfileUpdateRequest.vertical) &&
        Objects.equals(this.websites, whatsappPhoneNumberProfileUpdateRequest.websites)&&
        Objects.equals(this.additionalProperties, whatsappPhoneNumberProfileUpdateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(about, address, description, email, profilePictureUrl, vertical, websites, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappPhoneNumberProfileUpdateRequest {\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    profilePictureUrl: ").append(toIndentedString(profilePictureUrl)).append("\n");
    sb.append("    vertical: ").append(toIndentedString(vertical)).append("\n");
    sb.append("    websites: ").append(toIndentedString(websites)).append("\n");
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
    openapiFields.add("about");
    openapiFields.add("address");
    openapiFields.add("description");
    openapiFields.add("email");
    openapiFields.add("profilePictureUrl");
    openapiFields.add("vertical");
    openapiFields.add("websites");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappPhoneNumberProfileUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappPhoneNumberProfileUpdateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappPhoneNumberProfileUpdateRequest is not found in the empty JSON string", WhatsappPhoneNumberProfileUpdateRequest.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("about") != null && !jsonObj.get("about").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `about` to be a primitive type in the JSON string but got `%s`", jsonObj.get("about").toString()));
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("profilePictureUrl") != null && !jsonObj.get("profilePictureUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profilePictureUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profilePictureUrl").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("websites") != null && !jsonObj.get("websites").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `websites` to be an array in the JSON string but got `%s`", jsonObj.get("websites").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappPhoneNumberProfileUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappPhoneNumberProfileUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappPhoneNumberProfileUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappPhoneNumberProfileUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappPhoneNumberProfileUpdateRequest>() {
           @Override
           public void write(JsonWriter out, WhatsappPhoneNumberProfileUpdateRequest value) throws IOException {
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
           public WhatsappPhoneNumberProfileUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappPhoneNumberProfileUpdateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappPhoneNumberProfileUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappPhoneNumberProfileUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to WhatsappPhoneNumberProfileUpdateRequest
  */
  public static WhatsappPhoneNumberProfileUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappPhoneNumberProfileUpdateRequest.class);
  }

 /**
  * Convert an instance of WhatsappPhoneNumberProfileUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

