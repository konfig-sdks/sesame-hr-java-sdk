/*
 * Sesame Public API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

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
import java.util.UUID;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTIFICATION_EMAIL = "notificationEmail";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_EMAIL)
  private String notificationEmail;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany() {
  }

  public AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany id(UUID id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    
    
    this.id = id;
  }


  public AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany notificationEmail(String notificationEmail) {
    
    
    
    
    this.notificationEmail = notificationEmail;
    return this;
  }

   /**
   * Get notificationEmail
   * @return notificationEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNotificationEmail() {
    return notificationEmail;
  }


  public void setNotificationEmail(String notificationEmail) {
    
    
    
    this.notificationEmail = notificationEmail;
  }


  public AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany language(String language) {
    
    
    
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    
    
    
    this.language = language;
  }


  public AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T10:00:00+01:00", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany updatedAt(String updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T10:00:00+01:00", value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
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
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany instance itself
   */
  public AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
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
    AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany absenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany = (AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany) o;
    return Objects.equals(this.id, absenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany.id) &&
        Objects.equals(this.name, absenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany.name) &&
        Objects.equals(this.notificationEmail, absenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany.notificationEmail) &&
        Objects.equals(this.language, absenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany.language) &&
        Objects.equals(this.createdAt, absenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany.createdAt) &&
        Objects.equals(this.updatedAt, absenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany.updatedAt)&&
        Objects.equals(this.additionalProperties, absenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, notificationEmail, language, createdAt, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationEmail: ").append(toIndentedString(notificationEmail)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("notificationEmail");
    openapiFields.add("language");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany is not found in the empty JSON string", AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("notificationEmail") != null && !jsonObj.get("notificationEmail").isJsonNull()) && !jsonObj.get("notificationEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notificationEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notificationEmail").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if ((jsonObj.get("updatedAt") != null && !jsonObj.get("updatedAt").isJsonNull()) && !jsonObj.get("updatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedAt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany.class));

       return (TypeAdapter<T>) new TypeAdapter<AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany>() {
           @Override
           public void write(JsonWriter out, AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany value) throws IOException {
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
           public AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany instance = thisAdapter.fromJsonTree(jsonObj);
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
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
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
  * Create an instance of AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany
  * @throws IOException if the JSON string is invalid with respect to AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany
  */
  public static AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany.class);
  }

 /**
  * Convert an instance of AbsenceDayOffRequestsAcceptRequestResponseDataEmployeeCompany to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

