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
import com.ycloud.client.model.WhatsappPhoneNumberCodeVerificationStatus;
import com.ycloud.client.model.WhatsappPhoneNumberNameStatus;
import com.ycloud.client.model.WhatsappPhoneNumberQualityRating;
import com.ycloud.client.model.WhatsappPhoneNumberQualityUpdateEventEnum;
import com.ycloud.client.model.WhatsappPhoneNumberStatus;
import com.ycloud.client.model.WhatsappReviewDecision;
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
 * A WhatsApp Business Account (WABA) phone number. See also [WhatsApp Retrieve Phone Numbers](https://developers.facebook.com/docs/whatsapp/business-management-api/manage-phone-numbers).
 */
@ApiModel(description = "A WhatsApp Business Account (WABA) phone number. See also [WhatsApp Retrieve Phone Numbers](https://developers.facebook.com/docs/whatsapp/business-management-api/manage-phone-numbers).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappPhoneNumber {
  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  /**
   * Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
  **/
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_DISPLAY_PHONE_NUMBER = "displayPhoneNumber";
  /**
   * Display phone number.
  **/
  @SerializedName(SERIALIZED_NAME_DISPLAY_PHONE_NUMBER)
  private String displayPhoneNumber;

  public static final String SERIALIZED_NAME_WABA_ID = "wabaId";
  /**
   * WhatsApp Business Account ID.
  **/
  @SerializedName(SERIALIZED_NAME_WABA_ID)
  private String wabaId;

  public static final String SERIALIZED_NAME_QUALITY_RATING = "qualityRating";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_QUALITY_RATING)
  private WhatsappPhoneNumberQualityRating qualityRating;

  public static final String SERIALIZED_NAME_MESSAGING_LIMIT = "messagingLimit";
  /**
   * Messaging limits determine the maximum number of business-initiated conversations each phone number can start in a rolling 24-hour period. See also [Messaging Limits](https://developers.facebook.com/docs/whatsapp/messaging-limits#messaging-limits). - &#x60;TIER_NOT_SET&#x60;: Unknown limit. - &#x60;TIER_50&#x60;: 50 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_250&#x60;: 250 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_1K&#x60;: 1K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_10K&#x60;: 10K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_100K&#x60;: 100K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_UNLIMITED&#x60;: An unlimited number of business-initiated conversations in a rolling 24-hour period.
  **/
  @SerializedName(SERIALIZED_NAME_MESSAGING_LIMIT)
  private String messagingLimit;

  public static final String SERIALIZED_NAME_VERIFIED_NAME = "verifiedName";
  /**
   * Verified name.
  **/
  @SerializedName(SERIALIZED_NAME_VERIFIED_NAME)
  private String verifiedName;

  public static final String SERIALIZED_NAME_CODE_VERIFICATION_STATUS = "codeVerificationStatus";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_CODE_VERIFICATION_STATUS)
  private WhatsappPhoneNumberCodeVerificationStatus codeVerificationStatus;

  public static final String SERIALIZED_NAME_IS_OFFICIAL_BUSINESS_ACCOUNT = "isOfficialBusinessAccount";
  /**
   * Whether this phone number is an official business account or not. An official business account has a green checkmark badge in its profile and chat thread headers. See [Official Business Account](https://developers.facebook.com/docs/whatsapp/overview/business-accounts#official-business-account) for more information.
  **/
  @SerializedName(SERIALIZED_NAME_IS_OFFICIAL_BUSINESS_ACCOUNT)
  private Boolean isOfficialBusinessAccount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_STATUS)
  private WhatsappPhoneNumberStatus status;

  public static final String SERIALIZED_NAME_NAME_STATUS = "nameStatus";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_NAME_STATUS)
  private WhatsappPhoneNumberNameStatus nameStatus;

  public static final String SERIALIZED_NAME_NEW_NAME_STATUS = "newNameStatus";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_NEW_NAME_STATUS)
  private WhatsappPhoneNumberNameStatus newNameStatus;

  public static final String SERIALIZED_NAME_DECISION = "decision";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_DECISION)
  private WhatsappReviewDecision decision;

  public static final String SERIALIZED_NAME_REQUESTED_VERIFIED_NAME = "requestedVerifiedName";
  /**
   * Last requested verified name. See [Phone Number Name Update](https://developers.facebook.com/docs/graph-api/webhooks/reference/whatsapp-business-account/#phone_number_name_update).
  **/
  @SerializedName(SERIALIZED_NAME_REQUESTED_VERIFIED_NAME)
  private String requestedVerifiedName;

  public static final String SERIALIZED_NAME_REJECTION_REASON = "rejectionReason";
  /**
   * Rejection reason. See [Phone Number Name Update](https://developers.facebook.com/docs/graph-api/webhooks/reference/whatsapp-business-account/#phone_number_name_update).
  **/
  @SerializedName(SERIALIZED_NAME_REJECTION_REASON)
  private String rejectionReason;

  public static final String SERIALIZED_NAME_QUALITY_UPDATE_EVENT = "qualityUpdateEvent";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_QUALITY_UPDATE_EVENT)
  private WhatsappPhoneNumberQualityUpdateEventEnum qualityUpdateEvent;

  public WhatsappPhoneNumber() { 
  }

  public WhatsappPhoneNumber phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable

  public String getPhoneNumber() {
    return phoneNumber;
  }


  /**
   * Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   **/
  @ApiModelProperty(example = "+16315551111", value = "Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.")
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public WhatsappPhoneNumber displayPhoneNumber(String displayPhoneNumber) {
    
    this.displayPhoneNumber = displayPhoneNumber;
    return this;
  }

   /**
   * Display phone number.
   * @return displayPhoneNumber
  **/
  @javax.annotation.Nullable

  public String getDisplayPhoneNumber() {
    return displayPhoneNumber;
  }


  /**
   * Display phone number.
   **/
  @ApiModelProperty(example = "+1 631-555-1111", value = "Display phone number.")
  public void setDisplayPhoneNumber(String displayPhoneNumber) {
    this.displayPhoneNumber = displayPhoneNumber;
  }


  public WhatsappPhoneNumber wabaId(String wabaId) {
    
    this.wabaId = wabaId;
    return this;
  }

   /**
   * WhatsApp Business Account ID.
   * @return wabaId
  **/
  @javax.annotation.Nullable

  public String getWabaId() {
    return wabaId;
  }


  /**
   * WhatsApp Business Account ID.
   **/
  @ApiModelProperty(example = "whatsapp-business-account-id", value = "WhatsApp Business Account ID.")
  public void setWabaId(String wabaId) {
    this.wabaId = wabaId;
  }


  public WhatsappPhoneNumber qualityRating(WhatsappPhoneNumberQualityRating qualityRating) {
    
    this.qualityRating = qualityRating;
    return this;
  }

   /**
   * Get qualityRating
   * @return qualityRating
  **/
  @javax.annotation.Nullable

  public WhatsappPhoneNumberQualityRating getQualityRating() {
    return qualityRating;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setQualityRating(WhatsappPhoneNumberQualityRating qualityRating) {
    this.qualityRating = qualityRating;
  }


  public WhatsappPhoneNumber messagingLimit(String messagingLimit) {
    
    this.messagingLimit = messagingLimit;
    return this;
  }

   /**
   * Messaging limits determine the maximum number of business-initiated conversations each phone number can start in a rolling 24-hour period. See also [Messaging Limits](https://developers.facebook.com/docs/whatsapp/messaging-limits#messaging-limits). - &#x60;TIER_NOT_SET&#x60;: Unknown limit. - &#x60;TIER_50&#x60;: 50 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_250&#x60;: 250 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_1K&#x60;: 1K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_10K&#x60;: 10K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_100K&#x60;: 100K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_UNLIMITED&#x60;: An unlimited number of business-initiated conversations in a rolling 24-hour period.
   * @return messagingLimit
  **/
  @javax.annotation.Nullable

  public String getMessagingLimit() {
    return messagingLimit;
  }


  /**
   * Messaging limits determine the maximum number of business-initiated conversations each phone number can start in a rolling 24-hour period. See also [Messaging Limits](https://developers.facebook.com/docs/whatsapp/messaging-limits#messaging-limits). - &#x60;TIER_NOT_SET&#x60;: Unknown limit. - &#x60;TIER_50&#x60;: 50 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_250&#x60;: 250 business-initiated conversations in a rolling 24-hour period. - &#x60;TIER_1K&#x60;: 1K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_10K&#x60;: 10K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_100K&#x60;: 100K business-initiated conversations with unique customers in a rolling 24-hour period. - &#x60;TIER_UNLIMITED&#x60;: An unlimited number of business-initiated conversations in a rolling 24-hour period.
   **/
  @ApiModelProperty(example = "TIER_1K", value = "Messaging limits determine the maximum number of business-initiated conversations each phone number can start in a rolling 24-hour period. See also [Messaging Limits](https://developers.facebook.com/docs/whatsapp/messaging-limits#messaging-limits). - `TIER_NOT_SET`: Unknown limit. - `TIER_50`: 50 business-initiated conversations in a rolling 24-hour period. - `TIER_250`: 250 business-initiated conversations in a rolling 24-hour period. - `TIER_1K`: 1K business-initiated conversations with unique customers in a rolling 24-hour period. - `TIER_10K`: 10K business-initiated conversations with unique customers in a rolling 24-hour period. - `TIER_100K`: 100K business-initiated conversations with unique customers in a rolling 24-hour period. - `TIER_UNLIMITED`: An unlimited number of business-initiated conversations in a rolling 24-hour period.")
  public void setMessagingLimit(String messagingLimit) {
    this.messagingLimit = messagingLimit;
  }


  public WhatsappPhoneNumber verifiedName(String verifiedName) {
    
    this.verifiedName = verifiedName;
    return this;
  }

   /**
   * Verified name.
   * @return verifiedName
  **/
  @javax.annotation.Nullable

  public String getVerifiedName() {
    return verifiedName;
  }


  /**
   * Verified name.
   **/
  @ApiModelProperty(example = "John’s Cake Shop", value = "Verified name.")
  public void setVerifiedName(String verifiedName) {
    this.verifiedName = verifiedName;
  }


  public WhatsappPhoneNumber codeVerificationStatus(WhatsappPhoneNumberCodeVerificationStatus codeVerificationStatus) {
    
    this.codeVerificationStatus = codeVerificationStatus;
    return this;
  }

   /**
   * Get codeVerificationStatus
   * @return codeVerificationStatus
  **/
  @javax.annotation.Nullable

  public WhatsappPhoneNumberCodeVerificationStatus getCodeVerificationStatus() {
    return codeVerificationStatus;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setCodeVerificationStatus(WhatsappPhoneNumberCodeVerificationStatus codeVerificationStatus) {
    this.codeVerificationStatus = codeVerificationStatus;
  }


  public WhatsappPhoneNumber isOfficialBusinessAccount(Boolean isOfficialBusinessAccount) {
    
    this.isOfficialBusinessAccount = isOfficialBusinessAccount;
    return this;
  }

   /**
   * Whether this phone number is an official business account or not. An official business account has a green checkmark badge in its profile and chat thread headers. See [Official Business Account](https://developers.facebook.com/docs/whatsapp/overview/business-accounts#official-business-account) for more information.
   * @return isOfficialBusinessAccount
  **/
  @javax.annotation.Nullable

  public Boolean getIsOfficialBusinessAccount() {
    return isOfficialBusinessAccount;
  }


  /**
   * Whether this phone number is an official business account or not. An official business account has a green checkmark badge in its profile and chat thread headers. See [Official Business Account](https://developers.facebook.com/docs/whatsapp/overview/business-accounts#official-business-account) for more information.
   **/
  @ApiModelProperty(value = "Whether this phone number is an official business account or not. An official business account has a green checkmark badge in its profile and chat thread headers. See [Official Business Account](https://developers.facebook.com/docs/whatsapp/overview/business-accounts#official-business-account) for more information.")
  public void setIsOfficialBusinessAccount(Boolean isOfficialBusinessAccount) {
    this.isOfficialBusinessAccount = isOfficialBusinessAccount;
  }


  public WhatsappPhoneNumber status(WhatsappPhoneNumberStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable

  public WhatsappPhoneNumberStatus getStatus() {
    return status;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setStatus(WhatsappPhoneNumberStatus status) {
    this.status = status;
  }


  public WhatsappPhoneNumber nameStatus(WhatsappPhoneNumberNameStatus nameStatus) {
    
    this.nameStatus = nameStatus;
    return this;
  }

   /**
   * Get nameStatus
   * @return nameStatus
  **/
  @javax.annotation.Nullable

  public WhatsappPhoneNumberNameStatus getNameStatus() {
    return nameStatus;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setNameStatus(WhatsappPhoneNumberNameStatus nameStatus) {
    this.nameStatus = nameStatus;
  }


  public WhatsappPhoneNumber newNameStatus(WhatsappPhoneNumberNameStatus newNameStatus) {
    
    this.newNameStatus = newNameStatus;
    return this;
  }

   /**
   * Get newNameStatus
   * @return newNameStatus
  **/
  @javax.annotation.Nullable

  public WhatsappPhoneNumberNameStatus getNewNameStatus() {
    return newNameStatus;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setNewNameStatus(WhatsappPhoneNumberNameStatus newNameStatus) {
    this.newNameStatus = newNameStatus;
  }


  public WhatsappPhoneNumber decision(WhatsappReviewDecision decision) {
    
    this.decision = decision;
    return this;
  }

   /**
   * Get decision
   * @return decision
  **/
  @javax.annotation.Nullable

  public WhatsappReviewDecision getDecision() {
    return decision;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setDecision(WhatsappReviewDecision decision) {
    this.decision = decision;
  }


  public WhatsappPhoneNumber requestedVerifiedName(String requestedVerifiedName) {
    
    this.requestedVerifiedName = requestedVerifiedName;
    return this;
  }

   /**
   * Last requested verified name. See [Phone Number Name Update](https://developers.facebook.com/docs/graph-api/webhooks/reference/whatsapp-business-account/#phone_number_name_update).
   * @return requestedVerifiedName
  **/
  @javax.annotation.Nullable

  public String getRequestedVerifiedName() {
    return requestedVerifiedName;
  }


  /**
   * Last requested verified name. See [Phone Number Name Update](https://developers.facebook.com/docs/graph-api/webhooks/reference/whatsapp-business-account/#phone_number_name_update).
   **/
  @ApiModelProperty(value = "Last requested verified name. See [Phone Number Name Update](https://developers.facebook.com/docs/graph-api/webhooks/reference/whatsapp-business-account/#phone_number_name_update).")
  public void setRequestedVerifiedName(String requestedVerifiedName) {
    this.requestedVerifiedName = requestedVerifiedName;
  }


  public WhatsappPhoneNumber rejectionReason(String rejectionReason) {
    
    this.rejectionReason = rejectionReason;
    return this;
  }

   /**
   * Rejection reason. See [Phone Number Name Update](https://developers.facebook.com/docs/graph-api/webhooks/reference/whatsapp-business-account/#phone_number_name_update).
   * @return rejectionReason
  **/
  @javax.annotation.Nullable

  public String getRejectionReason() {
    return rejectionReason;
  }


  /**
   * Rejection reason. See [Phone Number Name Update](https://developers.facebook.com/docs/graph-api/webhooks/reference/whatsapp-business-account/#phone_number_name_update).
   **/
  @ApiModelProperty(value = "Rejection reason. See [Phone Number Name Update](https://developers.facebook.com/docs/graph-api/webhooks/reference/whatsapp-business-account/#phone_number_name_update).")
  public void setRejectionReason(String rejectionReason) {
    this.rejectionReason = rejectionReason;
  }


  public WhatsappPhoneNumber qualityUpdateEvent(WhatsappPhoneNumberQualityUpdateEventEnum qualityUpdateEvent) {
    
    this.qualityUpdateEvent = qualityUpdateEvent;
    return this;
  }

   /**
   * Get qualityUpdateEvent
   * @return qualityUpdateEvent
  **/
  @javax.annotation.Nullable

  public WhatsappPhoneNumberQualityUpdateEventEnum getQualityUpdateEvent() {
    return qualityUpdateEvent;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setQualityUpdateEvent(WhatsappPhoneNumberQualityUpdateEventEnum qualityUpdateEvent) {
    this.qualityUpdateEvent = qualityUpdateEvent;
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
  public WhatsappPhoneNumber putAdditionalProperty(String key, Object value) {
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
    WhatsappPhoneNumber whatsappPhoneNumber = (WhatsappPhoneNumber) o;
    return Objects.equals(this.phoneNumber, whatsappPhoneNumber.phoneNumber) &&
        Objects.equals(this.displayPhoneNumber, whatsappPhoneNumber.displayPhoneNumber) &&
        Objects.equals(this.wabaId, whatsappPhoneNumber.wabaId) &&
        Objects.equals(this.qualityRating, whatsappPhoneNumber.qualityRating) &&
        Objects.equals(this.messagingLimit, whatsappPhoneNumber.messagingLimit) &&
        Objects.equals(this.verifiedName, whatsappPhoneNumber.verifiedName) &&
        Objects.equals(this.codeVerificationStatus, whatsappPhoneNumber.codeVerificationStatus) &&
        Objects.equals(this.isOfficialBusinessAccount, whatsappPhoneNumber.isOfficialBusinessAccount) &&
        Objects.equals(this.status, whatsappPhoneNumber.status) &&
        Objects.equals(this.nameStatus, whatsappPhoneNumber.nameStatus) &&
        Objects.equals(this.newNameStatus, whatsappPhoneNumber.newNameStatus) &&
        Objects.equals(this.decision, whatsappPhoneNumber.decision) &&
        Objects.equals(this.requestedVerifiedName, whatsappPhoneNumber.requestedVerifiedName) &&
        Objects.equals(this.rejectionReason, whatsappPhoneNumber.rejectionReason) &&
        Objects.equals(this.qualityUpdateEvent, whatsappPhoneNumber.qualityUpdateEvent)&&
        Objects.equals(this.additionalProperties, whatsappPhoneNumber.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, displayPhoneNumber, wabaId, qualityRating, messagingLimit, verifiedName, codeVerificationStatus, isOfficialBusinessAccount, status, nameStatus, newNameStatus, decision, requestedVerifiedName, rejectionReason, qualityUpdateEvent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappPhoneNumber {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    displayPhoneNumber: ").append(toIndentedString(displayPhoneNumber)).append("\n");
    sb.append("    wabaId: ").append(toIndentedString(wabaId)).append("\n");
    sb.append("    qualityRating: ").append(toIndentedString(qualityRating)).append("\n");
    sb.append("    messagingLimit: ").append(toIndentedString(messagingLimit)).append("\n");
    sb.append("    verifiedName: ").append(toIndentedString(verifiedName)).append("\n");
    sb.append("    codeVerificationStatus: ").append(toIndentedString(codeVerificationStatus)).append("\n");
    sb.append("    isOfficialBusinessAccount: ").append(toIndentedString(isOfficialBusinessAccount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    nameStatus: ").append(toIndentedString(nameStatus)).append("\n");
    sb.append("    newNameStatus: ").append(toIndentedString(newNameStatus)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    requestedVerifiedName: ").append(toIndentedString(requestedVerifiedName)).append("\n");
    sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
    sb.append("    qualityUpdateEvent: ").append(toIndentedString(qualityUpdateEvent)).append("\n");
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
    openapiFields.add("phoneNumber");
    openapiFields.add("displayPhoneNumber");
    openapiFields.add("wabaId");
    openapiFields.add("qualityRating");
    openapiFields.add("messagingLimit");
    openapiFields.add("verifiedName");
    openapiFields.add("codeVerificationStatus");
    openapiFields.add("isOfficialBusinessAccount");
    openapiFields.add("status");
    openapiFields.add("nameStatus");
    openapiFields.add("newNameStatus");
    openapiFields.add("decision");
    openapiFields.add("requestedVerifiedName");
    openapiFields.add("rejectionReason");
    openapiFields.add("qualityUpdateEvent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappPhoneNumber
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappPhoneNumber.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappPhoneNumber is not found in the empty JSON string", WhatsappPhoneNumber.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if (jsonObj.get("displayPhoneNumber") != null && !jsonObj.get("displayPhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayPhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayPhoneNumber").toString()));
      }
      if (jsonObj.get("wabaId") != null && !jsonObj.get("wabaId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wabaId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wabaId").toString()));
      }
      if (jsonObj.get("messagingLimit") != null && !jsonObj.get("messagingLimit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messagingLimit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messagingLimit").toString()));
      }
      if (jsonObj.get("verifiedName") != null && !jsonObj.get("verifiedName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verifiedName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verifiedName").toString()));
      }
      if (jsonObj.get("requestedVerifiedName") != null && !jsonObj.get("requestedVerifiedName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestedVerifiedName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestedVerifiedName").toString()));
      }
      if (jsonObj.get("rejectionReason") != null && !jsonObj.get("rejectionReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rejectionReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rejectionReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappPhoneNumber.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappPhoneNumber' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappPhoneNumber> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappPhoneNumber.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappPhoneNumber>() {
           @Override
           public void write(JsonWriter out, WhatsappPhoneNumber value) throws IOException {
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
           public WhatsappPhoneNumber read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappPhoneNumber instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappPhoneNumber given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappPhoneNumber
  * @throws IOException if the JSON string is invalid with respect to WhatsappPhoneNumber
  */
  public static WhatsappPhoneNumber fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappPhoneNumber.class);
  }

 /**
  * Convert an instance of WhatsappPhoneNumber to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

