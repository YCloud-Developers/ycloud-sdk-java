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
import com.ycloud.client.model.WhatsappMessageTemplateComponentParameterAction;
import com.ycloud.client.model.WhatsappMessageTemplateComponentParameterLimitedTimeOffer;
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
 * WhatsappMessageTemplateComponentParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappMessageTemplateComponentParameter {
  /**
   * **Required.** Component parameter type. - &#x60;text&#x60;: Used when the template component type is &#x60;BODY&#x60;, or the &#x60;HEADER&#x60; component format is &#x60;TEXT&#x60;. - &#x60;image&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;IMAGE&#x60;. - &#x60;video&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;VIDEO&#x60;. - &#x60;document&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;DOCUMENT&#x60;. - &#x60;payload&#x60;: Used when the template component button type is &#x60;QUICK_REPLY&#x60;. - &#x60;coupon_code&#x60;: Used when the template component button type is &#x60;COPY_CODE&#x60;. - &#x60;limited_time_offer&#x60;: Used when the template component type is &#x60;LIMITED_TIME_OFFER&#x60;. - &#x60;action&#x60;: Used when the template component button type is &#x60;CATALOG&#x60;, &#x60;MPM&#x60; or &#x60;FLOW&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TEXT("text"),
    
    IMAGE("image"),
    
    VIDEO("video"),
    
    DOCUMENT("document"),
    
    PAYLOAD("payload"),
    
    COUPON_CODE("coupon_code"),
    
    LIMITED_TIME_OFFER("limited_time_offer"),
    
    ACTION("action");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  /**
   * **Required.** Component parameter type. - &#x60;text&#x60;: Used when the template component type is &#x60;BODY&#x60;, or the &#x60;HEADER&#x60; component format is &#x60;TEXT&#x60;. - &#x60;image&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;IMAGE&#x60;. - &#x60;video&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;VIDEO&#x60;. - &#x60;document&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;DOCUMENT&#x60;. - &#x60;payload&#x60;: Used when the template component button type is &#x60;QUICK_REPLY&#x60;. - &#x60;coupon_code&#x60;: Used when the template component button type is &#x60;COPY_CODE&#x60;. - &#x60;limited_time_offer&#x60;: Used when the template component type is &#x60;LIMITED_TIME_OFFER&#x60;. - &#x60;action&#x60;: Used when the template component button type is &#x60;CATALOG&#x60;, &#x60;MPM&#x60; or &#x60;FLOW&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_TEXT = "text";
  /**
   * **Required when &#x60;type&#x60; &#x3D; &#x60;text&#x60;.** The message&#39;s text. For the header component, the character limit is 60 characters. For the body component, the character limit is 1024 characters. For url buttons, it indicates the developer-provided suffix that is appended to the predefined prefix URL in the template.
  **/
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  /**
   * Required for &#x60;quick_reply&#x60; buttons. Developer-defined payload that is returned when the button is clicked in addition to the display text on the button.
  **/
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public static final String SERIALIZED_NAME_COUPON_CODE = "coupon_code";
  /**
   * **Required when &#x60;type&#x60; &#x3D; &#x60;coupon_code&#x60;.** The coupon code to be copied when the customer taps the button.
  **/
  @SerializedName(SERIALIZED_NAME_COUPON_CODE)
  private String couponCode;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private WhatsappMessageMedia image;

  public static final String SERIALIZED_NAME_VIDEO = "video";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private WhatsappMessageMedia video;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private WhatsappMessageMedia document;

  public static final String SERIALIZED_NAME_LIMITED_TIME_OFFER = "limited_time_offer";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_LIMITED_TIME_OFFER)
  private WhatsappMessageTemplateComponentParameterLimitedTimeOffer limitedTimeOffer;

  public static final String SERIALIZED_NAME_ACTION = "action";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_ACTION)
  private WhatsappMessageTemplateComponentParameterAction action;

  public WhatsappMessageTemplateComponentParameter() { 
  }

  public WhatsappMessageTemplateComponentParameter type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **Required.** Component parameter type. - &#x60;text&#x60;: Used when the template component type is &#x60;BODY&#x60;, or the &#x60;HEADER&#x60; component format is &#x60;TEXT&#x60;. - &#x60;image&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;IMAGE&#x60;. - &#x60;video&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;VIDEO&#x60;. - &#x60;document&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;DOCUMENT&#x60;. - &#x60;payload&#x60;: Used when the template component button type is &#x60;QUICK_REPLY&#x60;. - &#x60;coupon_code&#x60;: Used when the template component button type is &#x60;COPY_CODE&#x60;. - &#x60;limited_time_offer&#x60;: Used when the template component type is &#x60;LIMITED_TIME_OFFER&#x60;. - &#x60;action&#x60;: Used when the template component button type is &#x60;CATALOG&#x60;, &#x60;MPM&#x60; or &#x60;FLOW&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  /**
   * **Required.** Component parameter type. - &#x60;text&#x60;: Used when the template component type is &#x60;BODY&#x60;, or the &#x60;HEADER&#x60; component format is &#x60;TEXT&#x60;. - &#x60;image&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;IMAGE&#x60;. - &#x60;video&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;VIDEO&#x60;. - &#x60;document&#x60;: Used when the template &#x60;HEADER&#x60; component is &#x60;DOCUMENT&#x60;. - &#x60;payload&#x60;: Used when the template component button type is &#x60;QUICK_REPLY&#x60;. - &#x60;coupon_code&#x60;: Used when the template component button type is &#x60;COPY_CODE&#x60;. - &#x60;limited_time_offer&#x60;: Used when the template component type is &#x60;LIMITED_TIME_OFFER&#x60;. - &#x60;action&#x60;: Used when the template component button type is &#x60;CATALOG&#x60;, &#x60;MPM&#x60; or &#x60;FLOW&#x60;.
   **/
  @ApiModelProperty(value = "**Required.** Component parameter type. - `text`: Used when the template component type is `BODY`, or the `HEADER` component format is `TEXT`. - `image`: Used when the template `HEADER` component is `IMAGE`. - `video`: Used when the template `HEADER` component is `VIDEO`. - `document`: Used when the template `HEADER` component is `DOCUMENT`. - `payload`: Used when the template component button type is `QUICK_REPLY`. - `coupon_code`: Used when the template component button type is `COPY_CODE`. - `limited_time_offer`: Used when the template component type is `LIMITED_TIME_OFFER`. - `action`: Used when the template component button type is `CATALOG`, `MPM` or `FLOW`.")
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public WhatsappMessageTemplateComponentParameter text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * **Required when &#x60;type&#x60; &#x3D; &#x60;text&#x60;.** The message&#39;s text. For the header component, the character limit is 60 characters. For the body component, the character limit is 1024 characters. For url buttons, it indicates the developer-provided suffix that is appended to the predefined prefix URL in the template.
   * @return text
  **/
  @javax.annotation.Nullable

  public String getText() {
    return text;
  }


  /**
   * **Required when &#x60;type&#x60; &#x3D; &#x60;text&#x60;.** The message&#39;s text. For the header component, the character limit is 60 characters. For the body component, the character limit is 1024 characters. For url buttons, it indicates the developer-provided suffix that is appended to the predefined prefix URL in the template.
   **/
  @ApiModelProperty(value = "**Required when `type` = `text`.** The message's text. For the header component, the character limit is 60 characters. For the body component, the character limit is 1024 characters. For url buttons, it indicates the developer-provided suffix that is appended to the predefined prefix URL in the template.")
  public void setText(String text) {
    this.text = text;
  }


  public WhatsappMessageTemplateComponentParameter payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Required for &#x60;quick_reply&#x60; buttons. Developer-defined payload that is returned when the button is clicked in addition to the display text on the button.
   * @return payload
  **/
  @javax.annotation.Nullable

  public String getPayload() {
    return payload;
  }


  /**
   * Required for &#x60;quick_reply&#x60; buttons. Developer-defined payload that is returned when the button is clicked in addition to the display text on the button.
   **/
  @ApiModelProperty(value = "Required for `quick_reply` buttons. Developer-defined payload that is returned when the button is clicked in addition to the display text on the button.")
  public void setPayload(String payload) {
    this.payload = payload;
  }


  public WhatsappMessageTemplateComponentParameter couponCode(String couponCode) {
    
    this.couponCode = couponCode;
    return this;
  }

   /**
   * **Required when &#x60;type&#x60; &#x3D; &#x60;coupon_code&#x60;.** The coupon code to be copied when the customer taps the button.
   * @return couponCode
  **/
  @javax.annotation.Nullable

  public String getCouponCode() {
    return couponCode;
  }


  /**
   * **Required when &#x60;type&#x60; &#x3D; &#x60;coupon_code&#x60;.** The coupon code to be copied when the customer taps the button.
   **/
  @ApiModelProperty(value = "**Required when `type` = `coupon_code`.** The coupon code to be copied when the customer taps the button.")
  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }


  public WhatsappMessageTemplateComponentParameter image(WhatsappMessageMedia image) {
    
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


  public WhatsappMessageTemplateComponentParameter video(WhatsappMessageMedia video) {
    
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable

  public WhatsappMessageMedia getVideo() {
    return video;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setVideo(WhatsappMessageMedia video) {
    this.video = video;
  }


  public WhatsappMessageTemplateComponentParameter document(WhatsappMessageMedia document) {
    
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nullable

  public WhatsappMessageMedia getDocument() {
    return document;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setDocument(WhatsappMessageMedia document) {
    this.document = document;
  }


  public WhatsappMessageTemplateComponentParameter limitedTimeOffer(WhatsappMessageTemplateComponentParameterLimitedTimeOffer limitedTimeOffer) {
    
    this.limitedTimeOffer = limitedTimeOffer;
    return this;
  }

   /**
   * Get limitedTimeOffer
   * @return limitedTimeOffer
  **/
  @javax.annotation.Nullable

  public WhatsappMessageTemplateComponentParameterLimitedTimeOffer getLimitedTimeOffer() {
    return limitedTimeOffer;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setLimitedTimeOffer(WhatsappMessageTemplateComponentParameterLimitedTimeOffer limitedTimeOffer) {
    this.limitedTimeOffer = limitedTimeOffer;
  }


  public WhatsappMessageTemplateComponentParameter action(WhatsappMessageTemplateComponentParameterAction action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable

  public WhatsappMessageTemplateComponentParameterAction getAction() {
    return action;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setAction(WhatsappMessageTemplateComponentParameterAction action) {
    this.action = action;
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
  public WhatsappMessageTemplateComponentParameter putAdditionalProperty(String key, Object value) {
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
    WhatsappMessageTemplateComponentParameter whatsappMessageTemplateComponentParameter = (WhatsappMessageTemplateComponentParameter) o;
    return Objects.equals(this.type, whatsappMessageTemplateComponentParameter.type) &&
        Objects.equals(this.text, whatsappMessageTemplateComponentParameter.text) &&
        Objects.equals(this.payload, whatsappMessageTemplateComponentParameter.payload) &&
        Objects.equals(this.couponCode, whatsappMessageTemplateComponentParameter.couponCode) &&
        Objects.equals(this.image, whatsappMessageTemplateComponentParameter.image) &&
        Objects.equals(this.video, whatsappMessageTemplateComponentParameter.video) &&
        Objects.equals(this.document, whatsappMessageTemplateComponentParameter.document) &&
        Objects.equals(this.limitedTimeOffer, whatsappMessageTemplateComponentParameter.limitedTimeOffer) &&
        Objects.equals(this.action, whatsappMessageTemplateComponentParameter.action)&&
        Objects.equals(this.additionalProperties, whatsappMessageTemplateComponentParameter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, payload, couponCode, image, video, document, limitedTimeOffer, action, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappMessageTemplateComponentParameter {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    limitedTimeOffer: ").append(toIndentedString(limitedTimeOffer)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
    openapiFields.add("text");
    openapiFields.add("payload");
    openapiFields.add("coupon_code");
    openapiFields.add("image");
    openapiFields.add("video");
    openapiFields.add("document");
    openapiFields.add("limited_time_offer");
    openapiFields.add("action");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappMessageTemplateComponentParameter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappMessageTemplateComponentParameter.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappMessageTemplateComponentParameter is not found in the empty JSON string", WhatsappMessageTemplateComponentParameter.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payload").toString()));
      }
      if (jsonObj.get("coupon_code") != null && !jsonObj.get("coupon_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coupon_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coupon_code").toString()));
      }
      // validate the optional field `image`
      if (jsonObj.getAsJsonObject("image") != null) {
        WhatsappMessageMedia.validateJsonObject(jsonObj.getAsJsonObject("image"));
      }
      // validate the optional field `video`
      if (jsonObj.getAsJsonObject("video") != null) {
        WhatsappMessageMedia.validateJsonObject(jsonObj.getAsJsonObject("video"));
      }
      // validate the optional field `document`
      if (jsonObj.getAsJsonObject("document") != null) {
        WhatsappMessageMedia.validateJsonObject(jsonObj.getAsJsonObject("document"));
      }
      // validate the optional field `limited_time_offer`
      if (jsonObj.getAsJsonObject("limited_time_offer") != null) {
        WhatsappMessageTemplateComponentParameterLimitedTimeOffer.validateJsonObject(jsonObj.getAsJsonObject("limited_time_offer"));
      }
      // validate the optional field `action`
      if (jsonObj.getAsJsonObject("action") != null) {
        WhatsappMessageTemplateComponentParameterAction.validateJsonObject(jsonObj.getAsJsonObject("action"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappMessageTemplateComponentParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappMessageTemplateComponentParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappMessageTemplateComponentParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappMessageTemplateComponentParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappMessageTemplateComponentParameter>() {
           @Override
           public void write(JsonWriter out, WhatsappMessageTemplateComponentParameter value) throws IOException {
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
           public WhatsappMessageTemplateComponentParameter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappMessageTemplateComponentParameter instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappMessageTemplateComponentParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappMessageTemplateComponentParameter
  * @throws IOException if the JSON string is invalid with respect to WhatsappMessageTemplateComponentParameter
  */
  public static WhatsappMessageTemplateComponentParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappMessageTemplateComponentParameter.class);
  }

 /**
  * Convert an instance of WhatsappMessageTemplateComponentParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

