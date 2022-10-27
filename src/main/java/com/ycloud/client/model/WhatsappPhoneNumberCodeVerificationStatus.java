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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * To see if a phone number has been verified via OTP (one-time password), check that number&#39;s &#x60;code_verification_status&#x60; field.
 */
@JsonAdapter(WhatsappPhoneNumberCodeVerificationStatus.Adapter.class)
public enum WhatsappPhoneNumberCodeVerificationStatus {
  
  VERIFIED("VERIFIED"),
  
  NOT_VERIFIED("NOT_VERIFIED");

  private String value;

  WhatsappPhoneNumberCodeVerificationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WhatsappPhoneNumberCodeVerificationStatus fromValue(String value) {
    for (WhatsappPhoneNumberCodeVerificationStatus b : WhatsappPhoneNumberCodeVerificationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WhatsappPhoneNumberCodeVerificationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final WhatsappPhoneNumberCodeVerificationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WhatsappPhoneNumberCodeVerificationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WhatsappPhoneNumberCodeVerificationStatus.fromValue(value);
    }
  }
}

