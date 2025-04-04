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
import com.ycloud.client.model.WhatsappMessageInteractiveAction;
import com.ycloud.client.model.WhatsappMessageInteractiveBody;
import com.ycloud.client.model.WhatsappMessageInteractiveFooter;
import com.ycloud.client.model.WhatsappMessageInteractiveHeader;
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
 * Use for &#x60;interactive&#x60; messages.
 */
@ApiModel(description = "Use for `interactive` messages.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappMessageInteractive {
  /**
   * **Required.** The type of interactive message you want to send. - &#x60;button&#x60;: Use for Reply Buttons. - &#x60;list&#x60;: Use for List Messages. - &#x60;cta_url&#x60;: Use for Call-To-Action (CTA) URL Button Messages. - &#x60;product&#x60;: Use for Single Product Messages. - &#x60;product_list&#x60;: Use for Multi-Product Messages. - &#x60;catalog_message&#x60;: Use for Catalog Messages. - &#x60;location_request_message&#x60;: Use for Location Request Messages. - &#x60;order_details&#x60;: Use for Order Details Messages. - &#x60;order_status&#x60;: Use for Order Status Messages. - &#x60;voice_call&#x60;: Use for Voice Call Messages. - &#x60;flow&#x60;: Use for Flow Messages.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BUTTON("button"),
    
    LIST("list"),
    
    CTA_URL("cta_url"),
    
    PRODUCT("product"),
    
    PRODUCT_LIST("product_list"),
    
    CATALOG_MESSAGE("catalog_message"),
    
    LOCATION_REQUEST_MESSAGE("location_request_message"),
    
    ORDER_DETAILS("order_details"),
    
    ORDER_STATUS("order_status"),
    
    VOICE_CALL("voice_call"),
    
    FLOW("flow");

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
   * **Required.** The type of interactive message you want to send. - &#x60;button&#x60;: Use for Reply Buttons. - &#x60;list&#x60;: Use for List Messages. - &#x60;cta_url&#x60;: Use for Call-To-Action (CTA) URL Button Messages. - &#x60;product&#x60;: Use for Single Product Messages. - &#x60;product_list&#x60;: Use for Multi-Product Messages. - &#x60;catalog_message&#x60;: Use for Catalog Messages. - &#x60;location_request_message&#x60;: Use for Location Request Messages. - &#x60;order_details&#x60;: Use for Order Details Messages. - &#x60;order_status&#x60;: Use for Order Status Messages. - &#x60;voice_call&#x60;: Use for Voice Call Messages. - &#x60;flow&#x60;: Use for Flow Messages.
  **/
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_ACTION = "action";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_ACTION)
  private WhatsappMessageInteractiveAction action;

  public static final String SERIALIZED_NAME_BODY = "body";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_BODY)
  private WhatsappMessageInteractiveBody body;

  public static final String SERIALIZED_NAME_HEADER = "header";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_HEADER)
  private WhatsappMessageInteractiveHeader header;

  public static final String SERIALIZED_NAME_FOOTER = "footer";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_FOOTER)
  private WhatsappMessageInteractiveFooter footer;

  public WhatsappMessageInteractive() { 
  }

  public WhatsappMessageInteractive type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **Required.** The type of interactive message you want to send. - &#x60;button&#x60;: Use for Reply Buttons. - &#x60;list&#x60;: Use for List Messages. - &#x60;cta_url&#x60;: Use for Call-To-Action (CTA) URL Button Messages. - &#x60;product&#x60;: Use for Single Product Messages. - &#x60;product_list&#x60;: Use for Multi-Product Messages. - &#x60;catalog_message&#x60;: Use for Catalog Messages. - &#x60;location_request_message&#x60;: Use for Location Request Messages. - &#x60;order_details&#x60;: Use for Order Details Messages. - &#x60;order_status&#x60;: Use for Order Status Messages. - &#x60;voice_call&#x60;: Use for Voice Call Messages. - &#x60;flow&#x60;: Use for Flow Messages.
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  /**
   * **Required.** The type of interactive message you want to send. - &#x60;button&#x60;: Use for Reply Buttons. - &#x60;list&#x60;: Use for List Messages. - &#x60;cta_url&#x60;: Use for Call-To-Action (CTA) URL Button Messages. - &#x60;product&#x60;: Use for Single Product Messages. - &#x60;product_list&#x60;: Use for Multi-Product Messages. - &#x60;catalog_message&#x60;: Use for Catalog Messages. - &#x60;location_request_message&#x60;: Use for Location Request Messages. - &#x60;order_details&#x60;: Use for Order Details Messages. - &#x60;order_status&#x60;: Use for Order Status Messages. - &#x60;voice_call&#x60;: Use for Voice Call Messages. - &#x60;flow&#x60;: Use for Flow Messages.
   **/
  @ApiModelProperty(value = "**Required.** The type of interactive message you want to send. - `button`: Use for Reply Buttons. - `list`: Use for List Messages. - `cta_url`: Use for Call-To-Action (CTA) URL Button Messages. - `product`: Use for Single Product Messages. - `product_list`: Use for Multi-Product Messages. - `catalog_message`: Use for Catalog Messages. - `location_request_message`: Use for Location Request Messages. - `order_details`: Use for Order Details Messages. - `order_status`: Use for Order Status Messages. - `voice_call`: Use for Voice Call Messages. - `flow`: Use for Flow Messages.")
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public WhatsappMessageInteractive action(WhatsappMessageInteractiveAction action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable

  public WhatsappMessageInteractiveAction getAction() {
    return action;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setAction(WhatsappMessageInteractiveAction action) {
    this.action = action;
  }


  public WhatsappMessageInteractive body(WhatsappMessageInteractiveBody body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable

  public WhatsappMessageInteractiveBody getBody() {
    return body;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setBody(WhatsappMessageInteractiveBody body) {
    this.body = body;
  }


  public WhatsappMessageInteractive header(WhatsappMessageInteractiveHeader header) {
    
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable

  public WhatsappMessageInteractiveHeader getHeader() {
    return header;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setHeader(WhatsappMessageInteractiveHeader header) {
    this.header = header;
  }


  public WhatsappMessageInteractive footer(WhatsappMessageInteractiveFooter footer) {
    
    this.footer = footer;
    return this;
  }

   /**
   * Get footer
   * @return footer
  **/
  @javax.annotation.Nullable

  public WhatsappMessageInteractiveFooter getFooter() {
    return footer;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setFooter(WhatsappMessageInteractiveFooter footer) {
    this.footer = footer;
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
  public WhatsappMessageInteractive putAdditionalProperty(String key, Object value) {
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
    WhatsappMessageInteractive whatsappMessageInteractive = (WhatsappMessageInteractive) o;
    return Objects.equals(this.type, whatsappMessageInteractive.type) &&
        Objects.equals(this.action, whatsappMessageInteractive.action) &&
        Objects.equals(this.body, whatsappMessageInteractive.body) &&
        Objects.equals(this.header, whatsappMessageInteractive.header) &&
        Objects.equals(this.footer, whatsappMessageInteractive.footer)&&
        Objects.equals(this.additionalProperties, whatsappMessageInteractive.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, action, body, header, footer, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappMessageInteractive {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("body");
    openapiFields.add("header");
    openapiFields.add("footer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappMessageInteractive
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappMessageInteractive.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappMessageInteractive is not found in the empty JSON string", WhatsappMessageInteractive.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `action`
      if (jsonObj.getAsJsonObject("action") != null) {
        WhatsappMessageInteractiveAction.validateJsonObject(jsonObj.getAsJsonObject("action"));
      }
      // validate the optional field `body`
      if (jsonObj.getAsJsonObject("body") != null) {
        WhatsappMessageInteractiveBody.validateJsonObject(jsonObj.getAsJsonObject("body"));
      }
      // validate the optional field `header`
      if (jsonObj.getAsJsonObject("header") != null) {
        WhatsappMessageInteractiveHeader.validateJsonObject(jsonObj.getAsJsonObject("header"));
      }
      // validate the optional field `footer`
      if (jsonObj.getAsJsonObject("footer") != null) {
        WhatsappMessageInteractiveFooter.validateJsonObject(jsonObj.getAsJsonObject("footer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappMessageInteractive.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappMessageInteractive' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappMessageInteractive> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappMessageInteractive.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappMessageInteractive>() {
           @Override
           public void write(JsonWriter out, WhatsappMessageInteractive value) throws IOException {
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
           public WhatsappMessageInteractive read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappMessageInteractive instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappMessageInteractive given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappMessageInteractive
  * @throws IOException if the JSON string is invalid with respect to WhatsappMessageInteractive
  */
  public static WhatsappMessageInteractive fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappMessageInteractive.class);
  }

 /**
  * Convert an instance of WhatsappMessageInteractive to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

