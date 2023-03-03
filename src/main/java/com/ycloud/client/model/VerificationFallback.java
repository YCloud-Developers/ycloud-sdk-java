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
 * Contains information about verification fallback. For example, you can enable sms fallback for WhatsApp verification messages.
 */
@ApiModel(description = "Contains information about verification fallback. For example, you can enable sms fallback for WhatsApp verification messages.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VerificationFallback {
  public static final String SERIALIZED_NAME_SUPPORTED = "supported";
  /**
   * Whether this fallback you requested is supported. If &#x60;false&#x60; is returned, it means that there are errors for this fallback, and this fallback will not be triggered.
  **/
  @SerializedName(SERIALIZED_NAME_SUPPORTED)
  private Boolean supported;

  public static final String SERIALIZED_NAME_UNSUPPORTED_REASON = "unsupportedReason";
  /**
   * The reason why the fallback is unsupported, e.g, &#x60;PARAM_INVALID&#x60;, &#x60;SMS_SIGNATURE_UNAVAILABLE&#x60;, &#x60;SENDER_ID_UNAVAILABLE&#x60;, or &#x60;MESSAGING_REGION_UNSUPPORTED&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_UNSUPPORTED_REASON)
  private String unsupportedReason;

  public static final String SERIALIZED_NAME_UNSUPPORTED_DETAIL = "unsupportedDetail";
  /**
   * The detail message why the fallback is unsupported.
  **/
  @SerializedName(SERIALIZED_NAME_UNSUPPORTED_DETAIL)
  private String unsupportedDetail;

  public VerificationFallback() { 
  }

  public VerificationFallback supported(Boolean supported) {
    
    this.supported = supported;
    return this;
  }

   /**
   * Whether this fallback you requested is supported. If &#x60;false&#x60; is returned, it means that there are errors for this fallback, and this fallback will not be triggered.
   * @return supported
  **/
  @javax.annotation.Nullable

  public Boolean getSupported() {
    return supported;
  }


  /**
   * Whether this fallback you requested is supported. If &#x60;false&#x60; is returned, it means that there are errors for this fallback, and this fallback will not be triggered.
   **/
  @ApiModelProperty(value = "Whether this fallback you requested is supported. If `false` is returned, it means that there are errors for this fallback, and this fallback will not be triggered.")
  public void setSupported(Boolean supported) {
    this.supported = supported;
  }


  public VerificationFallback unsupportedReason(String unsupportedReason) {
    
    this.unsupportedReason = unsupportedReason;
    return this;
  }

   /**
   * The reason why the fallback is unsupported, e.g, &#x60;PARAM_INVALID&#x60;, &#x60;SMS_SIGNATURE_UNAVAILABLE&#x60;, &#x60;SENDER_ID_UNAVAILABLE&#x60;, or &#x60;MESSAGING_REGION_UNSUPPORTED&#x60;.
   * @return unsupportedReason
  **/
  @javax.annotation.Nullable

  public String getUnsupportedReason() {
    return unsupportedReason;
  }


  /**
   * The reason why the fallback is unsupported, e.g, &#x60;PARAM_INVALID&#x60;, &#x60;SMS_SIGNATURE_UNAVAILABLE&#x60;, &#x60;SENDER_ID_UNAVAILABLE&#x60;, or &#x60;MESSAGING_REGION_UNSUPPORTED&#x60;.
   **/
  @ApiModelProperty(example = "SENDER_ID_UNAVAILABLE", value = "The reason why the fallback is unsupported, e.g, `PARAM_INVALID`, `SMS_SIGNATURE_UNAVAILABLE`, `SENDER_ID_UNAVAILABLE`, or `MESSAGING_REGION_UNSUPPORTED`.")
  public void setUnsupportedReason(String unsupportedReason) {
    this.unsupportedReason = unsupportedReason;
  }


  public VerificationFallback unsupportedDetail(String unsupportedDetail) {
    
    this.unsupportedDetail = unsupportedDetail;
    return this;
  }

   /**
   * The detail message why the fallback is unsupported.
   * @return unsupportedDetail
  **/
  @javax.annotation.Nullable

  public String getUnsupportedDetail() {
    return unsupportedDetail;
  }


  /**
   * The detail message why the fallback is unsupported.
   **/
  @ApiModelProperty(example = "This Sender ID is not registered.", value = "The detail message why the fallback is unsupported.")
  public void setUnsupportedDetail(String unsupportedDetail) {
    this.unsupportedDetail = unsupportedDetail;
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
  public VerificationFallback putAdditionalProperty(String key, Object value) {
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
    VerificationFallback verificationFallback = (VerificationFallback) o;
    return Objects.equals(this.supported, verificationFallback.supported) &&
        Objects.equals(this.unsupportedReason, verificationFallback.unsupportedReason) &&
        Objects.equals(this.unsupportedDetail, verificationFallback.unsupportedDetail)&&
        Objects.equals(this.additionalProperties, verificationFallback.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supported, unsupportedReason, unsupportedDetail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationFallback {\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    unsupportedReason: ").append(toIndentedString(unsupportedReason)).append("\n");
    sb.append("    unsupportedDetail: ").append(toIndentedString(unsupportedDetail)).append("\n");
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
    openapiFields.add("supported");
    openapiFields.add("unsupportedReason");
    openapiFields.add("unsupportedDetail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerificationFallback
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VerificationFallback.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerificationFallback is not found in the empty JSON string", VerificationFallback.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("unsupportedReason") != null && !jsonObj.get("unsupportedReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unsupportedReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unsupportedReason").toString()));
      }
      if (jsonObj.get("unsupportedDetail") != null && !jsonObj.get("unsupportedDetail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unsupportedDetail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unsupportedDetail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerificationFallback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerificationFallback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerificationFallback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerificationFallback.class));

       return (TypeAdapter<T>) new TypeAdapter<VerificationFallback>() {
           @Override
           public void write(JsonWriter out, VerificationFallback value) throws IOException {
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
           public VerificationFallback read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VerificationFallback instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VerificationFallback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerificationFallback
  * @throws IOException if the JSON string is invalid with respect to VerificationFallback
  */
  public static VerificationFallback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerificationFallback.class);
  }

 /**
  * Convert an instance of VerificationFallback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

