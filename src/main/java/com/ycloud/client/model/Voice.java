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
 * Voice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Voice {
  public static final String SERIALIZED_NAME_ID = "id";
  /**
   * Unique ID for the object.
  **/
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TO = "to";
  /**
   * The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
  **/
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_VERIFICATION_CODE = "verificationCode";
  /**
   * The verification code to be sent, 4 to 6 digits.
  **/
  @SerializedName(SERIALIZED_NAME_VERIFICATION_CODE)
  private String verificationCode;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  /**
   * [ISO 639 Language Code](https://www.iso.org/iso-639-language-codes.html).
  **/
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_REGION_CODE = "regionCode";
  /**
   * [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
  **/
  @SerializedName(SERIALIZED_NAME_REGION_CODE)
  private String regionCode;

  public static final String SERIALIZED_NAME_TOTAL_SEGMENTS = "totalSegments";
  /**
   * Number of message segments. It&#39;s always 1 for voice calls.
  **/
  @SerializedName(SERIALIZED_NAME_TOTAL_SEGMENTS)
  private Integer totalSegments;

  public static final String SERIALIZED_NAME_TOTAL_PRICE = "totalPrice";
  /**
   * Total price of this message.
  **/
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private Double totalPrice;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  /**
   * Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217).
  **/
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  /**
   * Delivery status. One of &#x60;accepted&#x60;, &#x60;sent&#x60;, &#x60;delivered&#x60;, &#x60;undelivered&#x60;, or &#x60;failed&#x60;. - &#x60;accepted&#x60;: The messaging request is accepted by our system. - &#x60;failed&#x60;: The message failed to be sent from our system. - &#x60;sent&#x60;: The message has been sent from our system. - &#x60;delivered&#x60;: Our system has received a delivery receipt indicating that message is delivered. - &#x60;undelivered&#x60;: Our system has received a delivery receipt indicating that message is not delivered.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACCEPTED("accepted"),
    
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
   * Delivery status. One of &#x60;accepted&#x60;, &#x60;sent&#x60;, &#x60;delivered&#x60;, &#x60;undelivered&#x60;, or &#x60;failed&#x60;. - &#x60;accepted&#x60;: The messaging request is accepted by our system. - &#x60;failed&#x60;: The message failed to be sent from our system. - &#x60;sent&#x60;: The message has been sent from our system. - &#x60;delivered&#x60;: Our system has received a delivery receipt indicating that message is delivered. - &#x60;undelivered&#x60;: Our system has received a delivery receipt indicating that message is not delivered.
  **/
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  /**
   * Error code when the message is undeliverable.
  **/
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  /**
   * The time at which this message was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-03-01T12:00:00.000Z&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Date createTime;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  /**
   * The time at which the delivery report for this message was updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-03-01T12:00:00.000Z&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private Date updateTime;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  /**
   * A unique (recommended) string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.
  **/
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  /**
   * Delivery report URL. You can provide a URL, and we will push the updated status report to your server in time. e.g., https://httpbin.org/anything?tag&#x3D;api. Note: We recommend configuring Webhook Endpoints instead.
  **/
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "bizType";
  /**
   * This can be either empty or one of &#x60;voice&#x60;, or &#x60;verify&#x60;. Defaults to &#x60;voice&#x60;. - &#x60;voice&#x60;: Indicates that the message is sent via the **Voice** product. - &#x60;verify&#x60;: Indicates that the message is sent via **Verify** product.
  **/
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verificationId";
  /**
   * The verification ID. Included only when &#x60;bizType&#x60; is &#x60;verify&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public Voice() { 
  }

  public Voice id(String id) {
    
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


  public Voice to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * @return to
  **/
  @javax.annotation.Nonnull

  public String getTo() {
    return to;
  }


  /**
   * The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   **/
  @ApiModelProperty(example = "+16315551111", required = true, value = "The recipient's phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.")
  public void setTo(String to) {
    this.to = to;
  }


  public Voice verificationCode(String verificationCode) {
    
    this.verificationCode = verificationCode;
    return this;
  }

   /**
   * The verification code to be sent, 4 to 6 digits.
   * @return verificationCode
  **/
  @javax.annotation.Nullable

  public String getVerificationCode() {
    return verificationCode;
  }


  /**
   * The verification code to be sent, 4 to 6 digits.
   **/
  @ApiModelProperty(example = "123456", value = "The verification code to be sent, 4 to 6 digits.")
  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }


  public Voice language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * [ISO 639 Language Code](https://www.iso.org/iso-639-language-codes.html).
   * @return language
  **/
  @javax.annotation.Nullable

  public String getLanguage() {
    return language;
  }


  /**
   * [ISO 639 Language Code](https://www.iso.org/iso-639-language-codes.html).
   **/
  @ApiModelProperty(example = "en", value = "[ISO 639 Language Code](https://www.iso.org/iso-639-language-codes.html).")
  public void setLanguage(String language) {
    this.language = language;
  }


  public Voice regionCode(String regionCode) {
    
    this.regionCode = regionCode;
    return this;
  }

   /**
   * [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
   * @return regionCode
  **/
  @javax.annotation.Nullable

  public String getRegionCode() {
    return regionCode;
  }


  /**
   * [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
   **/
  @ApiModelProperty(example = "US", value = "[ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).")
  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  public Voice totalSegments(Integer totalSegments) {
    
    this.totalSegments = totalSegments;
    return this;
  }

   /**
   * Number of message segments. It&#39;s always 1 for voice calls.
   * minimum: 1
   * @return totalSegments
  **/
  @javax.annotation.Nullable

  public Integer getTotalSegments() {
    return totalSegments;
  }


  /**
   * Number of message segments. It&#39;s always 1 for voice calls.
   **/
  @ApiModelProperty(example = "1", value = "Number of message segments. It's always 1 for voice calls.")
  public void setTotalSegments(Integer totalSegments) {
    this.totalSegments = totalSegments;
  }


  public Voice totalPrice(Double totalPrice) {
    
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Total price of this message.
   * @return totalPrice
  **/
  @javax.annotation.Nullable

  public Double getTotalPrice() {
    return totalPrice;
  }


  /**
   * Total price of this message.
   **/
  @ApiModelProperty(example = "0.05", value = "Total price of this message.")
  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }


  public Voice currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217).
   * @return currency
  **/
  @javax.annotation.Nullable

  public String getCurrency() {
    return currency;
  }


  /**
   * Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217).
   **/
  @ApiModelProperty(example = "USD", value = "Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217).")
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Voice status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Delivery status. One of &#x60;accepted&#x60;, &#x60;sent&#x60;, &#x60;delivered&#x60;, &#x60;undelivered&#x60;, or &#x60;failed&#x60;. - &#x60;accepted&#x60;: The messaging request is accepted by our system. - &#x60;failed&#x60;: The message failed to be sent from our system. - &#x60;sent&#x60;: The message has been sent from our system. - &#x60;delivered&#x60;: Our system has received a delivery receipt indicating that message is delivered. - &#x60;undelivered&#x60;: Our system has received a delivery receipt indicating that message is not delivered.
   * @return status
  **/
  @javax.annotation.Nullable

  public StatusEnum getStatus() {
    return status;
  }


  /**
   * Delivery status. One of &#x60;accepted&#x60;, &#x60;sent&#x60;, &#x60;delivered&#x60;, &#x60;undelivered&#x60;, or &#x60;failed&#x60;. - &#x60;accepted&#x60;: The messaging request is accepted by our system. - &#x60;failed&#x60;: The message failed to be sent from our system. - &#x60;sent&#x60;: The message has been sent from our system. - &#x60;delivered&#x60;: Our system has received a delivery receipt indicating that message is delivered. - &#x60;undelivered&#x60;: Our system has received a delivery receipt indicating that message is not delivered.
   **/
  @ApiModelProperty(example = "sent", value = "Delivery status. One of `accepted`, `sent`, `delivered`, `undelivered`, or `failed`. - `accepted`: The messaging request is accepted by our system. - `failed`: The message failed to be sent from our system. - `sent`: The message has been sent from our system. - `delivered`: Our system has received a delivery receipt indicating that message is delivered. - `undelivered`: Our system has received a delivery receipt indicating that message is not delivered.")
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Voice errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Error code when the message is undeliverable.
   * @return errorCode
  **/
  @javax.annotation.Nullable

  public String getErrorCode() {
    return errorCode;
  }


  /**
   * Error code when the message is undeliverable.
   **/
  @ApiModelProperty(value = "Error code when the message is undeliverable.")
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public Voice createTime(Date createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * The time at which this message was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-03-01T12:00:00.000Z&#x60;.
   * @return createTime
  **/
  @javax.annotation.Nullable

  public Date getCreateTime() {
    return createTime;
  }


  /**
   * The time at which this message was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-03-01T12:00:00.000Z&#x60;.
   **/
  @ApiModelProperty(example = "2022-03-01T12:00Z", value = "The time at which this message was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-03-01T12:00:00.000Z`.")
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public Voice updateTime(Date updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The time at which the delivery report for this message was updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-03-01T12:00:00.000Z&#x60;.
   * @return updateTime
  **/
  @javax.annotation.Nullable

  public Date getUpdateTime() {
    return updateTime;
  }


  /**
   * The time at which the delivery report for this message was updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-03-01T12:00:00.000Z&#x60;.
   **/
  @ApiModelProperty(example = "2022-03-01T12:00Z", value = "The time at which the delivery report for this message was updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-03-01T12:00:00.000Z`.")
  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }


  public Voice externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * A unique (recommended) string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.
   * @return externalId
  **/
  @javax.annotation.Nullable

  public String getExternalId() {
    return externalId;
  }


  /**
   * A unique (recommended) string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.
   **/
  @ApiModelProperty(value = "A unique (recommended) string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.")
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public Voice callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Delivery report URL. You can provide a URL, and we will push the updated status report to your server in time. e.g., https://httpbin.org/anything?tag&#x3D;api. Note: We recommend configuring Webhook Endpoints instead.
   * @return callbackUrl
  **/
  @javax.annotation.Nullable

  public String getCallbackUrl() {
    return callbackUrl;
  }


  /**
   * Delivery report URL. You can provide a URL, and we will push the updated status report to your server in time. e.g., https://httpbin.org/anything?tag&#x3D;api. Note: We recommend configuring Webhook Endpoints instead.
   **/
  @ApiModelProperty(example = "https://httpbin.org/anything?tag=api-voice", value = "Delivery report URL. You can provide a URL, and we will push the updated status report to your server in time. e.g., https://httpbin.org/anything?tag=api. Note: We recommend configuring Webhook Endpoints instead.")
  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public Voice bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * This can be either empty or one of &#x60;voice&#x60;, or &#x60;verify&#x60;. Defaults to &#x60;voice&#x60;. - &#x60;voice&#x60;: Indicates that the message is sent via the **Voice** product. - &#x60;verify&#x60;: Indicates that the message is sent via **Verify** product.
   * @return bizType
  **/
  @javax.annotation.Nullable

  public String getBizType() {
    return bizType;
  }


  /**
   * This can be either empty or one of &#x60;voice&#x60;, or &#x60;verify&#x60;. Defaults to &#x60;voice&#x60;. - &#x60;voice&#x60;: Indicates that the message is sent via the **Voice** product. - &#x60;verify&#x60;: Indicates that the message is sent via **Verify** product.
   **/
  @ApiModelProperty(example = "voice", value = "This can be either empty or one of `voice`, or `verify`. Defaults to `voice`. - `voice`: Indicates that the message is sent via the **Voice** product. - `verify`: Indicates that the message is sent via **Verify** product.")
  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public Voice verificationId(String verificationId) {
    
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
  public Voice putAdditionalProperty(String key, Object value) {
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
    Voice voice = (Voice) o;
    return Objects.equals(this.id, voice.id) &&
        Objects.equals(this.to, voice.to) &&
        Objects.equals(this.verificationCode, voice.verificationCode) &&
        Objects.equals(this.language, voice.language) &&
        Objects.equals(this.regionCode, voice.regionCode) &&
        Objects.equals(this.totalSegments, voice.totalSegments) &&
        Objects.equals(this.totalPrice, voice.totalPrice) &&
        Objects.equals(this.currency, voice.currency) &&
        Objects.equals(this.status, voice.status) &&
        Objects.equals(this.errorCode, voice.errorCode) &&
        Objects.equals(this.createTime, voice.createTime) &&
        Objects.equals(this.updateTime, voice.updateTime) &&
        Objects.equals(this.externalId, voice.externalId) &&
        Objects.equals(this.callbackUrl, voice.callbackUrl) &&
        Objects.equals(this.bizType, voice.bizType) &&
        Objects.equals(this.verificationId, voice.verificationId)&&
        Objects.equals(this.additionalProperties, voice.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, to, verificationCode, language, regionCode, totalSegments, totalPrice, currency, status, errorCode, createTime, updateTime, externalId, callbackUrl, bizType, verificationId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Voice {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    totalSegments: ").append(toIndentedString(totalSegments)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("to");
    openapiFields.add("verificationCode");
    openapiFields.add("language");
    openapiFields.add("regionCode");
    openapiFields.add("totalSegments");
    openapiFields.add("totalPrice");
    openapiFields.add("currency");
    openapiFields.add("status");
    openapiFields.add("errorCode");
    openapiFields.add("createTime");
    openapiFields.add("updateTime");
    openapiFields.add("externalId");
    openapiFields.add("callbackUrl");
    openapiFields.add("bizType");
    openapiFields.add("verificationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("to");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Voice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Voice.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Voice is not found in the empty JSON string", Voice.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Voice.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("to") != null && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if (jsonObj.get("verificationCode") != null && !jsonObj.get("verificationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verificationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verificationCode").toString()));
      }
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (jsonObj.get("regionCode") != null && !jsonObj.get("regionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regionCode").toString()));
      }
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("errorCode") != null && !jsonObj.get("errorCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorCode").toString()));
      }
      if (jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      if (jsonObj.get("callbackUrl") != null && !jsonObj.get("callbackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callbackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callbackUrl").toString()));
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
       if (!Voice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Voice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Voice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Voice.class));

       return (TypeAdapter<T>) new TypeAdapter<Voice>() {
           @Override
           public void write(JsonWriter out, Voice value) throws IOException {
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
           public Voice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Voice instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Voice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Voice
  * @throws IOException if the JSON string is invalid with respect to Voice
  */
  public static Voice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Voice.class);
  }

 /**
  * Convert an instance of Voice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

