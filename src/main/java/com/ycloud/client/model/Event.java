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
import com.ycloud.client.model.EmailDelivery;
import com.ycloud.client.model.EventType;
import com.ycloud.client.model.Sms;
import com.ycloud.client.model.SmsInbound;
import com.ycloud.client.model.Voice;
import com.ycloud.client.model.WhatsappBusinessAccount;
import com.ycloud.client.model.WhatsappInboundMessage;
import com.ycloud.client.model.WhatsappMessage;
import com.ycloud.client.model.WhatsappPhoneNumber;
import com.ycloud.client.model.WhatsappTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Date;

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
 * Represents a webhook event payload. Every event contains certain common properties: &#x60;id&#x60;, &#x60;type&#x60;, &#x60;apiVersion&#x60;, &#x60;createTime&#x60;. Each event may also contain some properties unique to the event. For example, &#x60;sms&#x60; is returned when &#x60;type&#x60; is &#x60;sms.message.updated&#x60;.
 */
@ApiModel(description = "Represents a webhook event payload. Every event contains certain common properties: `id`, `type`, `apiVersion`, `createTime`. Each event may also contain some properties unique to the event. For example, `sms` is returned when `type` is `sms.message.updated`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Event {
  public static final String SERIALIZED_NAME_ID = "id";
  /**
   * Unique ID for the object.
  **/
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_TYPE)
  private EventType type;

  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  /**
   * The API version used to render this event.
  **/
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  /**
   * The time at which this event was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Date createTime;

  public static final String SERIALIZED_NAME_EMAIL_DELIVERY = "emailDelivery";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_EMAIL_DELIVERY)
  private EmailDelivery emailDelivery;

  public static final String SERIALIZED_NAME_SMS = "sms";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_SMS)
  private Sms sms;

  public static final String SERIALIZED_NAME_SMS_INBOUND = "smsInbound";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_SMS_INBOUND)
  private SmsInbound smsInbound;

  public static final String SERIALIZED_NAME_VOICE = "voice";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_VOICE)
  private Voice voice;

  public static final String SERIALIZED_NAME_WHATSAPP_BUSINESS_ACCOUNT = "whatsappBusinessAccount";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_WHATSAPP_BUSINESS_ACCOUNT)
  private WhatsappBusinessAccount whatsappBusinessAccount;

  public static final String SERIALIZED_NAME_WHATSAPP_INBOUND_MESSAGE = "whatsappInboundMessage";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_WHATSAPP_INBOUND_MESSAGE)
  private WhatsappInboundMessage whatsappInboundMessage;

  public static final String SERIALIZED_NAME_WHATSAPP_MESSAGE = "whatsappMessage";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_WHATSAPP_MESSAGE)
  private WhatsappMessage whatsappMessage;

  public static final String SERIALIZED_NAME_WHATSAPP_PHONE_NUMBER = "whatsappPhoneNumber";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_WHATSAPP_PHONE_NUMBER)
  private WhatsappPhoneNumber whatsappPhoneNumber;

  public static final String SERIALIZED_NAME_WHATSAPP_TEMPLATE = "whatsappTemplate";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_WHATSAPP_TEMPLATE)
  private WhatsappTemplate whatsappTemplate;

  public Event() { 
  }

  public Event id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID for the object.
   * @return id
  **/
  @javax.annotation.Nonnull

  public String getId() {
    return id;
  }


  /**
   * Unique ID for the object.
   **/
  @ApiModelProperty(required = true, value = "Unique ID for the object.")
  public void setId(String id) {
    this.id = id;
  }


  public Event type(EventType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull

  public EventType getType() {
    return type;
  }


  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public void setType(EventType type) {
    this.type = type;
  }


  public Event apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * The API version used to render this event.
   * @return apiVersion
  **/
  @javax.annotation.Nonnull

  public String getApiVersion() {
    return apiVersion;
  }


  /**
   * The API version used to render this event.
   **/
  @ApiModelProperty(example = "v2", required = true, value = "The API version used to render this event.")
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public Event createTime(Date createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * The time at which this event was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   * @return createTime
  **/
  @javax.annotation.Nonnull

  public Date getCreateTime() {
    return createTime;
  }


  /**
   * The time at which this event was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   **/
  @ApiModelProperty(example = "2022-06-01T12:00Z", required = true, value = "The time at which this event was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-06-01T12:00:00.000Z`.")
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public Event emailDelivery(EmailDelivery emailDelivery) {
    
    this.emailDelivery = emailDelivery;
    return this;
  }

   /**
   * Get emailDelivery
   * @return emailDelivery
  **/
  @javax.annotation.Nullable

  public EmailDelivery getEmailDelivery() {
    return emailDelivery;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setEmailDelivery(EmailDelivery emailDelivery) {
    this.emailDelivery = emailDelivery;
  }


  public Event sms(Sms sms) {
    
    this.sms = sms;
    return this;
  }

   /**
   * Get sms
   * @return sms
  **/
  @javax.annotation.Nullable

  public Sms getSms() {
    return sms;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setSms(Sms sms) {
    this.sms = sms;
  }


  public Event smsInbound(SmsInbound smsInbound) {
    
    this.smsInbound = smsInbound;
    return this;
  }

   /**
   * Get smsInbound
   * @return smsInbound
  **/
  @javax.annotation.Nullable

  public SmsInbound getSmsInbound() {
    return smsInbound;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setSmsInbound(SmsInbound smsInbound) {
    this.smsInbound = smsInbound;
  }


  public Event voice(Voice voice) {
    
    this.voice = voice;
    return this;
  }

   /**
   * Get voice
   * @return voice
  **/
  @javax.annotation.Nullable

  public Voice getVoice() {
    return voice;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setVoice(Voice voice) {
    this.voice = voice;
  }


  public Event whatsappBusinessAccount(WhatsappBusinessAccount whatsappBusinessAccount) {
    
    this.whatsappBusinessAccount = whatsappBusinessAccount;
    return this;
  }

   /**
   * Get whatsappBusinessAccount
   * @return whatsappBusinessAccount
  **/
  @javax.annotation.Nullable

  public WhatsappBusinessAccount getWhatsappBusinessAccount() {
    return whatsappBusinessAccount;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setWhatsappBusinessAccount(WhatsappBusinessAccount whatsappBusinessAccount) {
    this.whatsappBusinessAccount = whatsappBusinessAccount;
  }


  public Event whatsappInboundMessage(WhatsappInboundMessage whatsappInboundMessage) {
    
    this.whatsappInboundMessage = whatsappInboundMessage;
    return this;
  }

   /**
   * Get whatsappInboundMessage
   * @return whatsappInboundMessage
  **/
  @javax.annotation.Nullable

  public WhatsappInboundMessage getWhatsappInboundMessage() {
    return whatsappInboundMessage;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setWhatsappInboundMessage(WhatsappInboundMessage whatsappInboundMessage) {
    this.whatsappInboundMessage = whatsappInboundMessage;
  }


  public Event whatsappMessage(WhatsappMessage whatsappMessage) {
    
    this.whatsappMessage = whatsappMessage;
    return this;
  }

   /**
   * Get whatsappMessage
   * @return whatsappMessage
  **/
  @javax.annotation.Nullable

  public WhatsappMessage getWhatsappMessage() {
    return whatsappMessage;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setWhatsappMessage(WhatsappMessage whatsappMessage) {
    this.whatsappMessage = whatsappMessage;
  }


  public Event whatsappPhoneNumber(WhatsappPhoneNumber whatsappPhoneNumber) {
    
    this.whatsappPhoneNumber = whatsappPhoneNumber;
    return this;
  }

   /**
   * Get whatsappPhoneNumber
   * @return whatsappPhoneNumber
  **/
  @javax.annotation.Nullable

  public WhatsappPhoneNumber getWhatsappPhoneNumber() {
    return whatsappPhoneNumber;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setWhatsappPhoneNumber(WhatsappPhoneNumber whatsappPhoneNumber) {
    this.whatsappPhoneNumber = whatsappPhoneNumber;
  }


  public Event whatsappTemplate(WhatsappTemplate whatsappTemplate) {
    
    this.whatsappTemplate = whatsappTemplate;
    return this;
  }

   /**
   * Get whatsappTemplate
   * @return whatsappTemplate
  **/
  @javax.annotation.Nullable

  public WhatsappTemplate getWhatsappTemplate() {
    return whatsappTemplate;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setWhatsappTemplate(WhatsappTemplate whatsappTemplate) {
    this.whatsappTemplate = whatsappTemplate;
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
  public Event putAdditionalProperty(String key, Object value) {
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
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.type, event.type) &&
        Objects.equals(this.apiVersion, event.apiVersion) &&
        Objects.equals(this.createTime, event.createTime) &&
        Objects.equals(this.emailDelivery, event.emailDelivery) &&
        Objects.equals(this.sms, event.sms) &&
        Objects.equals(this.smsInbound, event.smsInbound) &&
        Objects.equals(this.voice, event.voice) &&
        Objects.equals(this.whatsappBusinessAccount, event.whatsappBusinessAccount) &&
        Objects.equals(this.whatsappInboundMessage, event.whatsappInboundMessage) &&
        Objects.equals(this.whatsappMessage, event.whatsappMessage) &&
        Objects.equals(this.whatsappPhoneNumber, event.whatsappPhoneNumber) &&
        Objects.equals(this.whatsappTemplate, event.whatsappTemplate)&&
        Objects.equals(this.additionalProperties, event.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, apiVersion, createTime, emailDelivery, sms, smsInbound, voice, whatsappBusinessAccount, whatsappInboundMessage, whatsappMessage, whatsappPhoneNumber, whatsappTemplate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    emailDelivery: ").append(toIndentedString(emailDelivery)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    smsInbound: ").append(toIndentedString(smsInbound)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    whatsappBusinessAccount: ").append(toIndentedString(whatsappBusinessAccount)).append("\n");
    sb.append("    whatsappInboundMessage: ").append(toIndentedString(whatsappInboundMessage)).append("\n");
    sb.append("    whatsappMessage: ").append(toIndentedString(whatsappMessage)).append("\n");
    sb.append("    whatsappPhoneNumber: ").append(toIndentedString(whatsappPhoneNumber)).append("\n");
    sb.append("    whatsappTemplate: ").append(toIndentedString(whatsappTemplate)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("apiVersion");
    openapiFields.add("createTime");
    openapiFields.add("emailDelivery");
    openapiFields.add("sms");
    openapiFields.add("smsInbound");
    openapiFields.add("voice");
    openapiFields.add("whatsappBusinessAccount");
    openapiFields.add("whatsappInboundMessage");
    openapiFields.add("whatsappMessage");
    openapiFields.add("whatsappPhoneNumber");
    openapiFields.add("whatsappTemplate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("apiVersion");
    openapiRequiredFields.add("createTime");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Event
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Event.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Event is not found in the empty JSON string", Event.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Event.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      // validate the optional field `emailDelivery`
      if (jsonObj.getAsJsonObject("emailDelivery") != null) {
        EmailDelivery.validateJsonObject(jsonObj.getAsJsonObject("emailDelivery"));
      }
      // validate the optional field `sms`
      if (jsonObj.getAsJsonObject("sms") != null) {
        Sms.validateJsonObject(jsonObj.getAsJsonObject("sms"));
      }
      // validate the optional field `smsInbound`
      if (jsonObj.getAsJsonObject("smsInbound") != null) {
        SmsInbound.validateJsonObject(jsonObj.getAsJsonObject("smsInbound"));
      }
      // validate the optional field `voice`
      if (jsonObj.getAsJsonObject("voice") != null) {
        Voice.validateJsonObject(jsonObj.getAsJsonObject("voice"));
      }
      // validate the optional field `whatsappBusinessAccount`
      if (jsonObj.getAsJsonObject("whatsappBusinessAccount") != null) {
        WhatsappBusinessAccount.validateJsonObject(jsonObj.getAsJsonObject("whatsappBusinessAccount"));
      }
      // validate the optional field `whatsappInboundMessage`
      if (jsonObj.getAsJsonObject("whatsappInboundMessage") != null) {
        WhatsappInboundMessage.validateJsonObject(jsonObj.getAsJsonObject("whatsappInboundMessage"));
      }
      // validate the optional field `whatsappMessage`
      if (jsonObj.getAsJsonObject("whatsappMessage") != null) {
        WhatsappMessage.validateJsonObject(jsonObj.getAsJsonObject("whatsappMessage"));
      }
      // validate the optional field `whatsappPhoneNumber`
      if (jsonObj.getAsJsonObject("whatsappPhoneNumber") != null) {
        WhatsappPhoneNumber.validateJsonObject(jsonObj.getAsJsonObject("whatsappPhoneNumber"));
      }
      // validate the optional field `whatsappTemplate`
      if (jsonObj.getAsJsonObject("whatsappTemplate") != null) {
        WhatsappTemplate.validateJsonObject(jsonObj.getAsJsonObject("whatsappTemplate"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Event.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Event' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Event> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Event.class));

       return (TypeAdapter<T>) new TypeAdapter<Event>() {
           @Override
           public void write(JsonWriter out, Event value) throws IOException {
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
           public Event read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Event instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Event given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Event
  * @throws IOException if the JSON string is invalid with respect to Event
  */
  public static Event fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Event.class);
  }

 /**
  * Convert an instance of Event to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

