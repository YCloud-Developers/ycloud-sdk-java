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
import com.ycloud.client.model.WhatsappMessageInteractiveActionButton;
import com.ycloud.client.model.WhatsappMessageInteractiveActionParameters;
import com.ycloud.client.model.WhatsappMessageInteractiveActionSection;
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
 * **Required.** Action you want the user to perform after reading the &#x60;interactive&#x60; message.
 */
@ApiModel(description = "**Required.** Action you want the user to perform after reading the `interactive` message.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappMessageInteractiveAction {
  public static final String SERIALIZED_NAME_BUTTONS = "buttons";
  /**
   * Required for Reply Buttons. You can have up to 3 buttons.
  **/
  @SerializedName(SERIALIZED_NAME_BUTTONS)
  private List<WhatsappMessageInteractiveActionButton> buttons = null;

  public static final String SERIALIZED_NAME_BUTTON = "button";
  /**
   * Required for List Messages. Button content. It cannot be an empty string and must be unique within the message. Emojis are supported, markdown is not. Maximum length: 20 characters.
  **/
  @SerializedName(SERIALIZED_NAME_BUTTON)
  private String button;

  public static final String SERIALIZED_NAME_CATALOG_ID = "catalog_id";
  /**
   * Required for Single Product Messages and Multi-Product Messages. Unique identifier of the Facebook catalog linked to your WhatsApp Business Account. This ID can be retrieved via the [Meta Commerce Manager](https://business.facebook.com/commerce).
  **/
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private String catalogId;

  public static final String SERIALIZED_NAME_PRODUCT_RETAILER_ID = "product_retailer_id";
  /**
   * Required for Single Product Messages and Multi-Product Messages. Unique identifier of the product in a catalog.
  **/
  @SerializedName(SERIALIZED_NAME_PRODUCT_RETAILER_ID)
  private String productRetailerId;

  public static final String SERIALIZED_NAME_SECTIONS = "sections";
  /**
   * Required for List Messages and Multi-Product Messages. Array of section objects. Minimum of 1, maximum of 10.
  **/
  @SerializedName(SERIALIZED_NAME_SECTIONS)
  private List<WhatsappMessageInteractiveActionSection> sections = null;

  /**
   * Action name. Required for Call-To-Action (CTA) buttons. - &#x60;cta_url&#x60;: Use for Call-To-Action (CTA) URL buttons. - &#x60;send_location&#x60;: Use for Location Request buttons. - &#x60;flow&#x60;: Use for Flow buttons. - &#x60;review_and_pay&#x60;: Use for Order Details buttons. - &#x60;review_order&#x60;: Use for Order Status buttons. - &#x60;voice_call&#x60;: Use for Voice Call buttons.
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    CTA_URL("cta_url"),
    
    SEND_LOCATION("send_location"),
    
    FLOW("flow"),
    
    REVIEW_AND_PAY("review_and_pay"),
    
    REVIEW_ORDER("review_order"),
    
    VOICE_CALL("voice_call");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NAME = "name";
  /**
   * Action name. Required for Call-To-Action (CTA) buttons. - &#x60;cta_url&#x60;: Use for Call-To-Action (CTA) URL buttons. - &#x60;send_location&#x60;: Use for Location Request buttons. - &#x60;flow&#x60;: Use for Flow buttons. - &#x60;review_and_pay&#x60;: Use for Order Details buttons. - &#x60;review_order&#x60;: Use for Order Status buttons. - &#x60;voice_call&#x60;: Use for Voice Call buttons.
  **/
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameEnum name;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private WhatsappMessageInteractiveActionParameters parameters;

  public WhatsappMessageInteractiveAction() { 
  }

  public WhatsappMessageInteractiveAction buttons(List<WhatsappMessageInteractiveActionButton> buttons) {
    
    this.buttons = buttons;
    return this;
  }

  public WhatsappMessageInteractiveAction addButtonsItem(WhatsappMessageInteractiveActionButton buttonsItem) {
    if (this.buttons == null) {
      this.buttons = new ArrayList<>();
    }
    this.buttons.add(buttonsItem);
    return this;
  }

   /**
   * Required for Reply Buttons. You can have up to 3 buttons.
   * @return buttons
  **/
  @javax.annotation.Nullable

  public List<WhatsappMessageInteractiveActionButton> getButtons() {
    return buttons;
  }


  /**
   * Required for Reply Buttons. You can have up to 3 buttons.
   **/
  @ApiModelProperty(value = "Required for Reply Buttons. You can have up to 3 buttons.")
  public void setButtons(List<WhatsappMessageInteractiveActionButton> buttons) {
    this.buttons = buttons;
  }


  public WhatsappMessageInteractiveAction button(String button) {
    
    this.button = button;
    return this;
  }

   /**
   * Required for List Messages. Button content. It cannot be an empty string and must be unique within the message. Emojis are supported, markdown is not. Maximum length: 20 characters.
   * @return button
  **/
  @javax.annotation.Nullable

  public String getButton() {
    return button;
  }


  /**
   * Required for List Messages. Button content. It cannot be an empty string and must be unique within the message. Emojis are supported, markdown is not. Maximum length: 20 characters.
   **/
  @ApiModelProperty(value = "Required for List Messages. Button content. It cannot be an empty string and must be unique within the message. Emojis are supported, markdown is not. Maximum length: 20 characters.")
  public void setButton(String button) {
    this.button = button;
  }


  public WhatsappMessageInteractiveAction catalogId(String catalogId) {
    
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Required for Single Product Messages and Multi-Product Messages. Unique identifier of the Facebook catalog linked to your WhatsApp Business Account. This ID can be retrieved via the [Meta Commerce Manager](https://business.facebook.com/commerce).
   * @return catalogId
  **/
  @javax.annotation.Nullable

  public String getCatalogId() {
    return catalogId;
  }


  /**
   * Required for Single Product Messages and Multi-Product Messages. Unique identifier of the Facebook catalog linked to your WhatsApp Business Account. This ID can be retrieved via the [Meta Commerce Manager](https://business.facebook.com/commerce).
   **/
  @ApiModelProperty(value = "Required for Single Product Messages and Multi-Product Messages. Unique identifier of the Facebook catalog linked to your WhatsApp Business Account. This ID can be retrieved via the [Meta Commerce Manager](https://business.facebook.com/commerce).")
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  public WhatsappMessageInteractiveAction productRetailerId(String productRetailerId) {
    
    this.productRetailerId = productRetailerId;
    return this;
  }

   /**
   * Required for Single Product Messages and Multi-Product Messages. Unique identifier of the product in a catalog.
   * @return productRetailerId
  **/
  @javax.annotation.Nullable

  public String getProductRetailerId() {
    return productRetailerId;
  }


  /**
   * Required for Single Product Messages and Multi-Product Messages. Unique identifier of the product in a catalog.
   **/
  @ApiModelProperty(value = "Required for Single Product Messages and Multi-Product Messages. Unique identifier of the product in a catalog.")
  public void setProductRetailerId(String productRetailerId) {
    this.productRetailerId = productRetailerId;
  }


  public WhatsappMessageInteractiveAction sections(List<WhatsappMessageInteractiveActionSection> sections) {
    
    this.sections = sections;
    return this;
  }

  public WhatsappMessageInteractiveAction addSectionsItem(WhatsappMessageInteractiveActionSection sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * Required for List Messages and Multi-Product Messages. Array of section objects. Minimum of 1, maximum of 10.
   * @return sections
  **/
  @javax.annotation.Nullable

  public List<WhatsappMessageInteractiveActionSection> getSections() {
    return sections;
  }


  /**
   * Required for List Messages and Multi-Product Messages. Array of section objects. Minimum of 1, maximum of 10.
   **/
  @ApiModelProperty(value = "Required for List Messages and Multi-Product Messages. Array of section objects. Minimum of 1, maximum of 10.")
  public void setSections(List<WhatsappMessageInteractiveActionSection> sections) {
    this.sections = sections;
  }


  public WhatsappMessageInteractiveAction name(NameEnum name) {
    
    this.name = name;
    return this;
  }

   /**
   * Action name. Required for Call-To-Action (CTA) buttons. - &#x60;cta_url&#x60;: Use for Call-To-Action (CTA) URL buttons. - &#x60;send_location&#x60;: Use for Location Request buttons. - &#x60;flow&#x60;: Use for Flow buttons. - &#x60;review_and_pay&#x60;: Use for Order Details buttons. - &#x60;review_order&#x60;: Use for Order Status buttons. - &#x60;voice_call&#x60;: Use for Voice Call buttons.
   * @return name
  **/
  @javax.annotation.Nullable

  public NameEnum getName() {
    return name;
  }


  /**
   * Action name. Required for Call-To-Action (CTA) buttons. - &#x60;cta_url&#x60;: Use for Call-To-Action (CTA) URL buttons. - &#x60;send_location&#x60;: Use for Location Request buttons. - &#x60;flow&#x60;: Use for Flow buttons. - &#x60;review_and_pay&#x60;: Use for Order Details buttons. - &#x60;review_order&#x60;: Use for Order Status buttons. - &#x60;voice_call&#x60;: Use for Voice Call buttons.
   **/
  @ApiModelProperty(value = "Action name. Required for Call-To-Action (CTA) buttons. - `cta_url`: Use for Call-To-Action (CTA) URL buttons. - `send_location`: Use for Location Request buttons. - `flow`: Use for Flow buttons. - `review_and_pay`: Use for Order Details buttons. - `review_order`: Use for Order Status buttons. - `voice_call`: Use for Voice Call buttons.")
  public void setName(NameEnum name) {
    this.name = name;
  }


  public WhatsappMessageInteractiveAction parameters(WhatsappMessageInteractiveActionParameters parameters) {
    
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable

  public WhatsappMessageInteractiveActionParameters getParameters() {
    return parameters;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setParameters(WhatsappMessageInteractiveActionParameters parameters) {
    this.parameters = parameters;
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
  public WhatsappMessageInteractiveAction putAdditionalProperty(String key, Object value) {
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
    WhatsappMessageInteractiveAction whatsappMessageInteractiveAction = (WhatsappMessageInteractiveAction) o;
    return Objects.equals(this.buttons, whatsappMessageInteractiveAction.buttons) &&
        Objects.equals(this.button, whatsappMessageInteractiveAction.button) &&
        Objects.equals(this.catalogId, whatsappMessageInteractiveAction.catalogId) &&
        Objects.equals(this.productRetailerId, whatsappMessageInteractiveAction.productRetailerId) &&
        Objects.equals(this.sections, whatsappMessageInteractiveAction.sections) &&
        Objects.equals(this.name, whatsappMessageInteractiveAction.name) &&
        Objects.equals(this.parameters, whatsappMessageInteractiveAction.parameters)&&
        Objects.equals(this.additionalProperties, whatsappMessageInteractiveAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttons, button, catalogId, productRetailerId, sections, name, parameters, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappMessageInteractiveAction {\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    button: ").append(toIndentedString(button)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    productRetailerId: ").append(toIndentedString(productRetailerId)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiFields.add("buttons");
    openapiFields.add("button");
    openapiFields.add("catalog_id");
    openapiFields.add("product_retailer_id");
    openapiFields.add("sections");
    openapiFields.add("name");
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappMessageInteractiveAction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappMessageInteractiveAction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappMessageInteractiveAction is not found in the empty JSON string", WhatsappMessageInteractiveAction.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArraybuttons = jsonObj.getAsJsonArray("buttons");
      if (jsonArraybuttons != null) {
        // ensure the json data is an array
        if (!jsonObj.get("buttons").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `buttons` to be an array in the JSON string but got `%s`", jsonObj.get("buttons").toString()));
        }

        // validate the optional field `buttons` (array)
        for (int i = 0; i < jsonArraybuttons.size(); i++) {
          WhatsappMessageInteractiveActionButton.validateJsonObject(jsonArraybuttons.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("button") != null && !jsonObj.get("button").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `button` to be a primitive type in the JSON string but got `%s`", jsonObj.get("button").toString()));
      }
      if (jsonObj.get("catalog_id") != null && !jsonObj.get("catalog_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `catalog_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("catalog_id").toString()));
      }
      if (jsonObj.get("product_retailer_id") != null && !jsonObj.get("product_retailer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_retailer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_retailer_id").toString()));
      }
      JsonArray jsonArraysections = jsonObj.getAsJsonArray("sections");
      if (jsonArraysections != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sections").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sections` to be an array in the JSON string but got `%s`", jsonObj.get("sections").toString()));
        }

        // validate the optional field `sections` (array)
        for (int i = 0; i < jsonArraysections.size(); i++) {
          WhatsappMessageInteractiveActionSection.validateJsonObject(jsonArraysections.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `parameters`
      if (jsonObj.getAsJsonObject("parameters") != null) {
        WhatsappMessageInteractiveActionParameters.validateJsonObject(jsonObj.getAsJsonObject("parameters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappMessageInteractiveAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappMessageInteractiveAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappMessageInteractiveAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappMessageInteractiveAction.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappMessageInteractiveAction>() {
           @Override
           public void write(JsonWriter out, WhatsappMessageInteractiveAction value) throws IOException {
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
           public WhatsappMessageInteractiveAction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappMessageInteractiveAction instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappMessageInteractiveAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappMessageInteractiveAction
  * @throws IOException if the JSON string is invalid with respect to WhatsappMessageInteractiveAction
  */
  public static WhatsappMessageInteractiveAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappMessageInteractiveAction.class);
  }

 /**
  * Convert an instance of WhatsappMessageInteractiveAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

