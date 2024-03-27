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
import com.konfigthis.client.model.TimeEntriesStopTimeEntryOutResponseDataEmployee;
import com.konfigthis.client.model.TimeEntriesStopTimeEntryOutResponseDataTimeEntryIn;
import com.konfigthis.client.model.TimeEntriesStopTimeEntryOutResponseDataTimeEntryOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * TimeEntriesStopTimeEntryOutResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TimeEntriesStopTimeEntryOutResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private TimeEntriesStopTimeEntryOutResponseDataEmployee employee;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_TAG_IDS = "tagIds";
  @SerializedName(SERIALIZED_NAME_TAG_IDS)
  private List<UUID> tagIds = null;

  public static final String SERIALIZED_NAME_TIME_ENTRY_IN = "timeEntryIn";
  @SerializedName(SERIALIZED_NAME_TIME_ENTRY_IN)
  private TimeEntriesStopTimeEntryOutResponseDataTimeEntryIn timeEntryIn;

  public static final String SERIALIZED_NAME_TIME_ENTRY_OUT = "timeEntryOut";
  @SerializedName(SERIALIZED_NAME_TIME_ENTRY_OUT)
  private TimeEntriesStopTimeEntryOutResponseDataTimeEntryOut timeEntryOut;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deletedAt";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  public TimeEntriesStopTimeEntryOutResponseData() {
  }

  public TimeEntriesStopTimeEntryOutResponseData id(UUID id) {
    
    
    
    
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


  public TimeEntriesStopTimeEntryOutResponseData employee(TimeEntriesStopTimeEntryOutResponseDataEmployee employee) {
    
    
    
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeEntriesStopTimeEntryOutResponseDataEmployee getEmployee() {
    return employee;
  }


  public void setEmployee(TimeEntriesStopTimeEntryOutResponseDataEmployee employee) {
    
    
    
    this.employee = employee;
  }


  public TimeEntriesStopTimeEntryOutResponseData projectId(UUID projectId) {
    
    
    
    
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


  public TimeEntriesStopTimeEntryOutResponseData tagIds(List<UUID> tagIds) {
    
    
    
    
    this.tagIds = tagIds;
    return this;
  }

  public TimeEntriesStopTimeEntryOutResponseData addTagIdsItem(UUID tagIdsItem) {
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


  public TimeEntriesStopTimeEntryOutResponseData timeEntryIn(TimeEntriesStopTimeEntryOutResponseDataTimeEntryIn timeEntryIn) {
    
    
    
    
    this.timeEntryIn = timeEntryIn;
    return this;
  }

   /**
   * Get timeEntryIn
   * @return timeEntryIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeEntriesStopTimeEntryOutResponseDataTimeEntryIn getTimeEntryIn() {
    return timeEntryIn;
  }


  public void setTimeEntryIn(TimeEntriesStopTimeEntryOutResponseDataTimeEntryIn timeEntryIn) {
    
    
    
    this.timeEntryIn = timeEntryIn;
  }


  public TimeEntriesStopTimeEntryOutResponseData timeEntryOut(TimeEntriesStopTimeEntryOutResponseDataTimeEntryOut timeEntryOut) {
    
    
    
    
    this.timeEntryOut = timeEntryOut;
    return this;
  }

   /**
   * Get timeEntryOut
   * @return timeEntryOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeEntriesStopTimeEntryOutResponseDataTimeEntryOut getTimeEntryOut() {
    return timeEntryOut;
  }


  public void setTimeEntryOut(TimeEntriesStopTimeEntryOutResponseDataTimeEntryOut timeEntryOut) {
    
    
    
    this.timeEntryOut = timeEntryOut;
  }


  public TimeEntriesStopTimeEntryOutResponseData comment(String comment) {
    
    
    
    
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


  public TimeEntriesStopTimeEntryOutResponseData createdAt(String createdAt) {
    
    
    
    
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


  public TimeEntriesStopTimeEntryOutResponseData updatedAt(String updatedAt) {
    
    
    
    
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


  public TimeEntriesStopTimeEntryOutResponseData deletedAt(String deletedAt) {
    
    
    
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(String deletedAt) {
    
    
    
    this.deletedAt = deletedAt;
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
   * @return the TimeEntriesStopTimeEntryOutResponseData instance itself
   */
  public TimeEntriesStopTimeEntryOutResponseData putAdditionalProperty(String key, Object value) {
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
    TimeEntriesStopTimeEntryOutResponseData timeEntriesStopTimeEntryOutResponseData = (TimeEntriesStopTimeEntryOutResponseData) o;
    return Objects.equals(this.id, timeEntriesStopTimeEntryOutResponseData.id) &&
        Objects.equals(this.employee, timeEntriesStopTimeEntryOutResponseData.employee) &&
        Objects.equals(this.projectId, timeEntriesStopTimeEntryOutResponseData.projectId) &&
        Objects.equals(this.tagIds, timeEntriesStopTimeEntryOutResponseData.tagIds) &&
        Objects.equals(this.timeEntryIn, timeEntriesStopTimeEntryOutResponseData.timeEntryIn) &&
        Objects.equals(this.timeEntryOut, timeEntriesStopTimeEntryOutResponseData.timeEntryOut) &&
        Objects.equals(this.comment, timeEntriesStopTimeEntryOutResponseData.comment) &&
        Objects.equals(this.createdAt, timeEntriesStopTimeEntryOutResponseData.createdAt) &&
        Objects.equals(this.updatedAt, timeEntriesStopTimeEntryOutResponseData.updatedAt) &&
        Objects.equals(this.deletedAt, timeEntriesStopTimeEntryOutResponseData.deletedAt)&&
        Objects.equals(this.additionalProperties, timeEntriesStopTimeEntryOutResponseData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employee, projectId, tagIds, timeEntryIn, timeEntryOut, comment, createdAt, updatedAt, deletedAt, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeEntriesStopTimeEntryOutResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    timeEntryIn: ").append(toIndentedString(timeEntryIn)).append("\n");
    sb.append("    timeEntryOut: ").append(toIndentedString(timeEntryOut)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
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
    openapiFields.add("employee");
    openapiFields.add("projectId");
    openapiFields.add("tagIds");
    openapiFields.add("timeEntryIn");
    openapiFields.add("timeEntryOut");
    openapiFields.add("comment");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("deletedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeEntriesStopTimeEntryOutResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimeEntriesStopTimeEntryOutResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeEntriesStopTimeEntryOutResponseData is not found in the empty JSON string", TimeEntriesStopTimeEntryOutResponseData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `employee`
      if (jsonObj.get("employee") != null && !jsonObj.get("employee").isJsonNull()) {
        TimeEntriesStopTimeEntryOutResponseDataEmployee.validateJsonObject(jsonObj.getAsJsonObject("employee"));
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tagIds") != null && !jsonObj.get("tagIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagIds` to be an array in the JSON string but got `%s`", jsonObj.get("tagIds").toString()));
      }
      // validate the optional field `timeEntryIn`
      if (jsonObj.get("timeEntryIn") != null && !jsonObj.get("timeEntryIn").isJsonNull()) {
        TimeEntriesStopTimeEntryOutResponseDataTimeEntryIn.validateJsonObject(jsonObj.getAsJsonObject("timeEntryIn"));
      }
      // validate the optional field `timeEntryOut`
      if (jsonObj.get("timeEntryOut") != null && !jsonObj.get("timeEntryOut").isJsonNull()) {
        TimeEntriesStopTimeEntryOutResponseDataTimeEntryOut.validateJsonObject(jsonObj.getAsJsonObject("timeEntryOut"));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if ((jsonObj.get("updatedAt") != null && !jsonObj.get("updatedAt").isJsonNull()) && !jsonObj.get("updatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedAt").toString()));
      }
      if (!jsonObj.get("deletedAt").isJsonNull() && (jsonObj.get("deletedAt") != null && !jsonObj.get("deletedAt").isJsonNull()) && !jsonObj.get("deletedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deletedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deletedAt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeEntriesStopTimeEntryOutResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeEntriesStopTimeEntryOutResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeEntriesStopTimeEntryOutResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeEntriesStopTimeEntryOutResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeEntriesStopTimeEntryOutResponseData>() {
           @Override
           public void write(JsonWriter out, TimeEntriesStopTimeEntryOutResponseData value) throws IOException {
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
           public TimeEntriesStopTimeEntryOutResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TimeEntriesStopTimeEntryOutResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TimeEntriesStopTimeEntryOutResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeEntriesStopTimeEntryOutResponseData
  * @throws IOException if the JSON string is invalid with respect to TimeEntriesStopTimeEntryOutResponseData
  */
  public static TimeEntriesStopTimeEntryOutResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeEntriesStopTimeEntryOutResponseData.class);
  }

 /**
  * Convert an instance of TimeEntriesStopTimeEntryOutResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

