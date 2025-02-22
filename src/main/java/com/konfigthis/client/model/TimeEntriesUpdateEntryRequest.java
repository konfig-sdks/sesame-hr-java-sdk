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
import com.konfigthis.client.model.TimeEntriesUpdateEntryRequestTimeEntryIn;
import com.konfigthis.client.model.TimeEntriesUpdateEntryRequestTimeEntryOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * TimeEntriesUpdateEntryRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TimeEntriesUpdateEntryRequest {
  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_TAG_IDS = "tagIds";
  @SerializedName(SERIALIZED_NAME_TAG_IDS)
  private List<UUID> tagIds = null;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_TIME_ENTRY_IN = "timeEntryIn";
  @SerializedName(SERIALIZED_NAME_TIME_ENTRY_IN)
  private TimeEntriesUpdateEntryRequestTimeEntryIn timeEntryIn;

  public static final String SERIALIZED_NAME_TIME_ENTRY_OUT = "timeEntryOut";
  @SerializedName(SERIALIZED_NAME_TIME_ENTRY_OUT)
  private TimeEntriesUpdateEntryRequestTimeEntryOut timeEntryOut;

  public TimeEntriesUpdateEntryRequest() {
  }

  public TimeEntriesUpdateEntryRequest projectId(UUID projectId) {
    
    
    
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    
    
    
    this.projectId = projectId;
  }


  public TimeEntriesUpdateEntryRequest tagIds(List<UUID> tagIds) {
    
    
    
    
    this.tagIds = tagIds;
    return this;
  }

  public TimeEntriesUpdateEntryRequest addTagIdsItem(UUID tagIdsItem) {
    if (this.tagIds == null) {
      this.tagIds = new ArrayList<>();
    }
    this.tagIds.add(tagIdsItem);
    return this;
  }

   /**
   * Get tagIds
   * @return tagIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UUID> getTagIds() {
    return tagIds;
  }


  public void setTagIds(List<UUID> tagIds) {
    
    
    
    this.tagIds = tagIds;
  }


  public TimeEntriesUpdateEntryRequest comment(String comment) {
    
    
    
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    
    
    
    this.comment = comment;
  }


  public TimeEntriesUpdateEntryRequest timeEntryIn(TimeEntriesUpdateEntryRequestTimeEntryIn timeEntryIn) {
    
    
    
    
    this.timeEntryIn = timeEntryIn;
    return this;
  }

   /**
   * Get timeEntryIn
   * @return timeEntryIn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TimeEntriesUpdateEntryRequestTimeEntryIn getTimeEntryIn() {
    return timeEntryIn;
  }


  public void setTimeEntryIn(TimeEntriesUpdateEntryRequestTimeEntryIn timeEntryIn) {
    
    
    
    this.timeEntryIn = timeEntryIn;
  }


  public TimeEntriesUpdateEntryRequest timeEntryOut(TimeEntriesUpdateEntryRequestTimeEntryOut timeEntryOut) {
    
    
    
    
    this.timeEntryOut = timeEntryOut;
    return this;
  }

   /**
   * Get timeEntryOut
   * @return timeEntryOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeEntriesUpdateEntryRequestTimeEntryOut getTimeEntryOut() {
    return timeEntryOut;
  }


  public void setTimeEntryOut(TimeEntriesUpdateEntryRequestTimeEntryOut timeEntryOut) {
    
    
    
    this.timeEntryOut = timeEntryOut;
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
   * @return the TimeEntriesUpdateEntryRequest instance itself
   */
  public TimeEntriesUpdateEntryRequest putAdditionalProperty(String key, Object value) {
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
    TimeEntriesUpdateEntryRequest timeEntriesUpdateEntryRequest = (TimeEntriesUpdateEntryRequest) o;
    return Objects.equals(this.projectId, timeEntriesUpdateEntryRequest.projectId) &&
        Objects.equals(this.tagIds, timeEntriesUpdateEntryRequest.tagIds) &&
        Objects.equals(this.comment, timeEntriesUpdateEntryRequest.comment) &&
        Objects.equals(this.timeEntryIn, timeEntriesUpdateEntryRequest.timeEntryIn) &&
        Objects.equals(this.timeEntryOut, timeEntriesUpdateEntryRequest.timeEntryOut)&&
        Objects.equals(this.additionalProperties, timeEntriesUpdateEntryRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, tagIds, comment, timeEntryIn, timeEntryOut, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeEntriesUpdateEntryRequest {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    timeEntryIn: ").append(toIndentedString(timeEntryIn)).append("\n");
    sb.append("    timeEntryOut: ").append(toIndentedString(timeEntryOut)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("tagIds");
    openapiFields.add("comment");
    openapiFields.add("timeEntryIn");
    openapiFields.add("timeEntryOut");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("timeEntryIn");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeEntriesUpdateEntryRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimeEntriesUpdateEntryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeEntriesUpdateEntryRequest is not found in the empty JSON string", TimeEntriesUpdateEntryRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimeEntriesUpdateEntryRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tagIds") != null && !jsonObj.get("tagIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagIds` to be an array in the JSON string but got `%s`", jsonObj.get("tagIds").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      // validate the required field `timeEntryIn`
      TimeEntriesUpdateEntryRequestTimeEntryIn.validateJsonObject(jsonObj.getAsJsonObject("timeEntryIn"));
      // validate the optional field `timeEntryOut`
      if (jsonObj.get("timeEntryOut") != null && !jsonObj.get("timeEntryOut").isJsonNull()) {
        TimeEntriesUpdateEntryRequestTimeEntryOut.validateJsonObject(jsonObj.getAsJsonObject("timeEntryOut"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeEntriesUpdateEntryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeEntriesUpdateEntryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeEntriesUpdateEntryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeEntriesUpdateEntryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeEntriesUpdateEntryRequest>() {
           @Override
           public void write(JsonWriter out, TimeEntriesUpdateEntryRequest value) throws IOException {
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
           public TimeEntriesUpdateEntryRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TimeEntriesUpdateEntryRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TimeEntriesUpdateEntryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeEntriesUpdateEntryRequest
  * @throws IOException if the JSON string is invalid with respect to TimeEntriesUpdateEntryRequest
  */
  public static TimeEntriesUpdateEntryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeEntriesUpdateEntryRequest.class);
  }

 /**
  * Convert an instance of TimeEntriesUpdateEntryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

