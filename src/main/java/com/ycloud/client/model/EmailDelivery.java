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
 * Represents an email delivery report.
 */
@ApiModel(description = "Represents an email delivery report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EmailDelivery {
  public static final String SERIALIZED_NAME_EMAIL_ID = "emailId";
  /**
   * Unique ID for the related email you&#39;ve previously sent.
  **/
  @SerializedName(SERIALIZED_NAME_EMAIL_ID)
  private String emailId;

  public static final String SERIALIZED_NAME_RECIPIENT_ADDRESS = "recipientAddress";
  /**
   * A recipient&#39;s email address.
  **/
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ADDRESS)
  private String recipientAddress;

  /**
   * Delivery status of the email to the specific recipient address. - &#x60;sending&#x60;: The messaging request is accepted by our system. - &#x60;failed&#x60;: The message failed to be sent from our system. - &#x60;sent&#x60;: The message has been sent from our system. - &#x60;delivered&#x60;: Our system has received a delivery receipt indicating that message is delivered. - &#x60;undelivered&#x60;: Our system has received a delivery receipt indicating that message is not delivered.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SENDING("sending"),
    
    FAILED("failed"),
    
    SENT("sent"),
    
    DELIVERED("delivered"),
    
    UNDELIVERED("undelivered");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  /**
   * Delivery status of the email to the specific recipient address. - &#x60;sending&#x60;: The messaging request is accepted by our system. - &#x60;failed&#x60;: The message failed to be sent from our system. - &#x60;sent&#x60;: The message has been sent from our system. - &#x60;delivered&#x60;: Our system has received a delivery receipt indicating that message is delivered. - &#x60;undelivered&#x60;: Our system has received a delivery receipt indicating that message is not delivered.
  **/
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  /**
   * Error code when the email is undeliverable.
  **/
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  /**
   * Error message when the email is undeliverable.
  **/
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  /**
   * The &#x60;externalId&#x60; you specified when you sent the email.
  **/
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "bizType";
  /**
   * This can be either empty or one of &#x60;email&#x60;, or &#x60;verify&#x60;. Defaults to &#x60;email&#x60;. - &#x60;email&#x60;: Indicates that the message is sent via the **Email** product. - &#x60;verify&#x60;: Indicates that the message is sent via the **Verify** product.
  **/
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verificationId";
  /**
   * The verification ID. Included only when &#x60;bizType&#x60; is &#x60;verify&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public EmailDelivery() { 
  }

  public EmailDelivery emailId(String emailId) {
    
    this.emailId = emailId;
    return this;
  }

   /**
   * Unique ID for the related email you&#39;ve previously sent.
   * @return emailId
  **/
  @javax.annotation.Nonnull

  public String getEmailId() {
    return emailId;
  }


  /**
   * Unique ID for the related email you&#39;ve previously sent.
   **/
  @ApiModelProperty(required = true, value = "Unique ID for the related email you've previously sent.")
  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }


  public EmailDelivery recipientAddress(String recipientAddress) {
    
    this.recipientAddress = recipientAddress;
    return this;
  }

   /**
   * A recipient&#39;s email address.
   * @return recipientAddress
  **/
  @javax.annotation.Nonnull

  public String getRecipientAddress() {
    return recipientAddress;
  }


  /**
   * A recipient&#39;s email address.
   **/
  @ApiModelProperty(example = "tom@example.com", required = true, value = "A recipient's email address.")
  public void setRecipientAddress(String recipientAddress) {
    this.recipientAddress = recipientAddress;
  }


  public EmailDelivery status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Delivery status of the email to the specific recipient address. - &#x60;sending&#x60;: The messaging request is accepted by our system. - &#x60;failed&#x60;: The message failed to be sent from our system. - &#x60;sent&#x60;: The message has been sent from our system. - &#x60;delivered&#x60;: Our system has received a delivery receipt indicating that message is delivered. - &#x60;undelivered&#x60;: Our system has received a delivery receipt indicating that message is not delivered.
   * @return status
  **/
  @javax.annotation.Nullable

  public StatusEnum getStatus() {
    return status;
  }


  /**
   * Delivery status of the email to the specific recipient address. - &#x60;sending&#x60;: The messaging request is accepted by our system. - &#x60;failed&#x60;: The message failed to be sent from our system. - &#x60;sent&#x60;: The message has been sent from our system. - &#x60;delivered&#x60;: Our system has received a delivery receipt indicating that message is delivered. - &#x60;undelivered&#x60;: Our system has received a delivery receipt indicating that message is not delivered.
   **/
  @ApiModelProperty(example = "failed", value = "Delivery status of the email to the specific recipient address. - `sending`: The messaging request is accepted by our system. - `failed`: The message failed to be sent from our system. - `sent`: The message has been sent from our system. - `delivered`: Our system has received a delivery receipt indicating that message is delivered. - `undelivered`: Our system has received a delivery receipt indicating that message is not delivered.")
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public EmailDelivery errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Error code when the email is undeliverable.
   * @return errorCode
  **/
  @javax.annotation.Nullable

  public String getErrorCode() {
    return errorCode;
  }


  /**
   * Error code when the email is undeliverable.
   **/
  @ApiModelProperty(example = "402", value = "Error code when the email is undeliverable.")
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public EmailDelivery errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error message when the email is undeliverable.
   * @return errorMessage
  **/
  @javax.annotation.Nullable

  public String getErrorMessage() {
    return errorMessage;
  }


  /**
   * Error message when the email is undeliverable.
   **/
  @ApiModelProperty(example = "Unsubscribes", value = "Error message when the email is undeliverable.")
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public EmailDelivery externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * The &#x60;externalId&#x60; you specified when you sent the email.
   * @return externalId
  **/
  @javax.annotation.Nullable

  public String getExternalId() {
    return externalId;
  }


  /**
   * The &#x60;externalId&#x60; you specified when you sent the email.
   **/
  @ApiModelProperty(value = "The `externalId` you specified when you sent the email.")
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public EmailDelivery bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * This can be either empty or one of &#x60;email&#x60;, or &#x60;verify&#x60;. Defaults to &#x60;email&#x60;. - &#x60;email&#x60;: Indicates that the message is sent via the **Email** product. - &#x60;verify&#x60;: Indicates that the message is sent via the **Verify** product.
   * @return bizType
  **/
  @javax.annotation.Nullable

  public String getBizType() {
    return bizType;
  }


  /**
   * This can be either empty or one of &#x60;email&#x60;, or &#x60;verify&#x60;. Defaults to &#x60;email&#x60;. - &#x60;email&#x60;: Indicates that the message is sent via the **Email** product. - &#x60;verify&#x60;: Indicates that the message is sent via the **Verify** product.
   **/
  @ApiModelProperty(example = "email", value = "This can be either empty or one of `email`, or `verify`. Defaults to `email`. - `email`: Indicates that the message is sent via the **Email** product. - `verify`: Indicates that the message is sent via the **Verify** product.")
  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public EmailDelivery verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * The verification ID. Included only when &#x60;bizType&#x60; is &#x60;verify&#x60;.
   * @return verificationId
  **/
  @javax.annotation.Nullable

  public String getVerificationId() {
    return verificationId;
  }


  /**
   * The verification ID. Included only when &#x60;bizType&#x60; is &#x60;verify&#x60;.
   **/
  @ApiModelProperty(example = "VERIFICATION-ID", value = "The verification ID. Included only when `bizType` is `verify`.")
  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
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
  public EmailDelivery putAdditionalProperty(String key, Object value) {
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
    EmailDelivery emailDelivery = (EmailDelivery) o;
    return Objects.equals(this.emailId, emailDelivery.emailId) &&
        Objects.equals(this.recipientAddress, emailDelivery.recipientAddress) &&
        Objects.equals(this.status, emailDelivery.status) &&
        Objects.equals(this.errorCode, emailDelivery.errorCode) &&
        Objects.equals(this.errorMessage, emailDelivery.errorMessage) &&
        Objects.equals(this.externalId, emailDelivery.externalId) &&
        Objects.equals(this.bizType, emailDelivery.bizType) &&
        Objects.equals(this.verificationId, emailDelivery.verificationId)&&
        Objects.equals(this.additionalProperties, emailDelivery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailId, recipientAddress, status, errorCode, errorMessage, externalId, bizType, verificationId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailDelivery {\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    recipientAddress: ").append(toIndentedString(recipientAddress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
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
    openapiFields.add("emailId");
    openapiFields.add("recipientAddress");
    openapiFields.add("status");
    openapiFields.add("errorCode");
    openapiFields.add("errorMessage");
    openapiFields.add("externalId");
    openapiFields.add("bizType");
    openapiFields.add("verificationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("emailId");
    openapiRequiredFields.add("recipientAddress");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmailDelivery
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EmailDelivery.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailDelivery is not found in the empty JSON string", EmailDelivery.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmailDelivery.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("emailId") != null && !jsonObj.get("emailId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailId").toString()));
      }
      if (jsonObj.get("recipientAddress") != null && !jsonObj.get("recipientAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientAddress").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("errorCode") != null && !jsonObj.get("errorCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorCode").toString()));
      }
      if (jsonObj.get("errorMessage") != null && !jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
      if (jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      if (jsonObj.get("bizType") != null && !jsonObj.get("bizType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bizType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bizType").toString()));
      }
      if (jsonObj.get("verificationId") != null && !jsonObj.get("verificationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verificationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verificationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailDelivery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailDelivery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailDelivery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailDelivery.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailDelivery>() {
           @Override
           public void write(JsonWriter out, EmailDelivery value) throws IOException {
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
           public EmailDelivery read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmailDelivery instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmailDelivery given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailDelivery
  * @throws IOException if the JSON string is invalid with respect to EmailDelivery
  */
  public static EmailDelivery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailDelivery.class);
  }

 /**
  * Convert an instance of EmailDelivery to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

