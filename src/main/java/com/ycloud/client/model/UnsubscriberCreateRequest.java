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
import com.ycloud.client.model.UnsubscriberChannel;
import com.ycloud.client.model.UnsubscriberType;
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
 * UnsubscriberCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnsubscriberCreateRequest {
  public static final String SERIALIZED_NAME_TYPE = "type";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_TYPE)
  private UnsubscriberType type;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  /**
   * The customer who has opted out. For &#x60;type&#x3D;PHONE_NUMBER&#x60;, it should be a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
  **/
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private String customer;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private UnsubscriberChannel channel;

  public static final String SERIALIZED_NAME_REGION_CODE = "regionCode";
  /**
   * The customer&#39;s region code, formatted in [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
  **/
  @SerializedName(SERIALIZED_NAME_REGION_CODE)
  private String regionCode;

  public UnsubscriberCreateRequest() { 
  }

  public UnsubscriberCreateRequest type(UnsubscriberType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull

  public UnsubscriberType getType() {
    return type;
  }


  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public void setType(UnsubscriberType type) {
    this.type = type;
  }


  public UnsubscriberCreateRequest customer(String customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * The customer who has opted out. For &#x60;type&#x3D;PHONE_NUMBER&#x60;, it should be a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * @return customer
  **/
  @javax.annotation.Nonnull

  public String getCustomer() {
    return customer;
  }


  /**
   * The customer who has opted out. For &#x60;type&#x3D;PHONE_NUMBER&#x60;, it should be a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   **/
  @ApiModelProperty(example = "+447901614024", required = true, value = "The customer who has opted out. For `type=PHONE_NUMBER`, it should be a phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.")
  public void setCustomer(String customer) {
    this.customer = customer;
  }


  public UnsubscriberCreateRequest channel(UnsubscriberChannel channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nonnull

  public UnsubscriberChannel getChannel() {
    return channel;
  }


  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public void setChannel(UnsubscriberChannel channel) {
    this.channel = channel;
  }


  public UnsubscriberCreateRequest regionCode(String regionCode) {
    
    this.regionCode = regionCode;
    return this;
  }

   /**
   * The customer&#39;s region code, formatted in [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
   * @return regionCode
  **/
  @javax.annotation.Nullable

  public String getRegionCode() {
    return regionCode;
  }


  /**
   * The customer&#39;s region code, formatted in [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
   **/
  @ApiModelProperty(example = "GB", value = "The customer's region code, formatted in [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).")
  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
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
  public UnsubscriberCreateRequest putAdditionalProperty(String key, Object value) {
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
    UnsubscriberCreateRequest unsubscriberCreateRequest = (UnsubscriberCreateRequest) o;
    return Objects.equals(this.type, unsubscriberCreateRequest.type) &&
        Objects.equals(this.customer, unsubscriberCreateRequest.customer) &&
        Objects.equals(this.channel, unsubscriberCreateRequest.channel) &&
        Objects.equals(this.regionCode, unsubscriberCreateRequest.regionCode)&&
        Objects.equals(this.additionalProperties, unsubscriberCreateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, customer, channel, regionCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsubscriberCreateRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
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
    openapiFields.add("customer");
    openapiFields.add("channel");
    openapiFields.add("regionCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("customer");
    openapiRequiredFields.add("channel");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UnsubscriberCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UnsubscriberCreateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnsubscriberCreateRequest is not found in the empty JSON string", UnsubscriberCreateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UnsubscriberCreateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer").toString()));
      }
      if (jsonObj.get("regionCode") != null && !jsonObj.get("regionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regionCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnsubscriberCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnsubscriberCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnsubscriberCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnsubscriberCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UnsubscriberCreateRequest>() {
           @Override
           public void write(JsonWriter out, UnsubscriberCreateRequest value) throws IOException {
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
           public UnsubscriberCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UnsubscriberCreateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UnsubscriberCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UnsubscriberCreateRequest
  * @throws IOException if the JSON string is invalid with respect to UnsubscriberCreateRequest
  */
  public static UnsubscriberCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnsubscriberCreateRequest.class);
  }

 /**
  * Convert an instance of UnsubscriberCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
