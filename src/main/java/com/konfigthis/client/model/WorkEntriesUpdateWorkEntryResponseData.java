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
import com.konfigthis.client.model.WorkEntriesUpdateWorkEntryResponseDataEmployee;
import com.konfigthis.client.model.WorkEntriesUpdateWorkEntryResponseDataWorkEntryIn;
import com.konfigthis.client.model.WorkEntriesUpdateWorkEntryResponseDataWorkEntryOut;
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
 * WorkEntriesUpdateWorkEntryResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkEntriesUpdateWorkEntryResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_WORK_CHECK_TYPE_ID = "workCheckTypeId";
  @SerializedName(SERIALIZED_NAME_WORK_CHECK_TYPE_ID)
  private UUID workCheckTypeId;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private WorkEntriesUpdateWorkEntryResponseDataEmployee employee;

  public static final String SERIALIZED_NAME_WORK_ENTRY_TYPE = "workEntryType";
  @SerializedName(SERIALIZED_NAME_WORK_ENTRY_TYPE)
  private String workEntryType;

  public static final String SERIALIZED_NAME_WORK_ENTRY_IN = "workEntryIn";
  @SerializedName(SERIALIZED_NAME_WORK_ENTRY_IN)
  private WorkEntriesUpdateWorkEntryResponseDataWorkEntryIn workEntryIn;

  public static final String SERIALIZED_NAME_WORK_ENTRY_OUT = "workEntryOut";
  @SerializedName(SERIALIZED_NAME_WORK_ENTRY_OUT)
  private WorkEntriesUpdateWorkEntryResponseDataWorkEntryOut workEntryOut;

  public static final String SERIALIZED_NAME_WORKED_SECONDS = "workedSeconds";
  @SerializedName(SERIALIZED_NAME_WORKED_SECONDS)
  private Float workedSeconds;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deletedAt";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  public WorkEntriesUpdateWorkEntryResponseData() {
  }

  public WorkEntriesUpdateWorkEntryResponseData id(UUID id) {
    
    
    
    
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


  public WorkEntriesUpdateWorkEntryResponseData workCheckTypeId(UUID workCheckTypeId) {
    
    
    
    
    this.workCheckTypeId = workCheckTypeId;
    return this;
  }

   /**
   * Get workCheckTypeId
   * @return workCheckTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getWorkCheckTypeId() {
    return workCheckTypeId;
  }


  public void setWorkCheckTypeId(UUID workCheckTypeId) {
    
    
    
    this.workCheckTypeId = workCheckTypeId;
  }


  public WorkEntriesUpdateWorkEntryResponseData employee(WorkEntriesUpdateWorkEntryResponseDataEmployee employee) {
    
    
    
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkEntriesUpdateWorkEntryResponseDataEmployee getEmployee() {
    return employee;
  }


  public void setEmployee(WorkEntriesUpdateWorkEntryResponseDataEmployee employee) {
    
    
    
    this.employee = employee;
  }


  public WorkEntriesUpdateWorkEntryResponseData workEntryType(String workEntryType) {
    
    
    
    
    this.workEntryType = workEntryType;
    return this;
  }

   /**
   * Get workEntryType
   * @return workEntryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkEntryType() {
    return workEntryType;
  }


  public void setWorkEntryType(String workEntryType) {
    
    
    
    this.workEntryType = workEntryType;
  }


  public WorkEntriesUpdateWorkEntryResponseData workEntryIn(WorkEntriesUpdateWorkEntryResponseDataWorkEntryIn workEntryIn) {
    
    
    
    
    this.workEntryIn = workEntryIn;
    return this;
  }

   /**
   * Get workEntryIn
   * @return workEntryIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkEntriesUpdateWorkEntryResponseDataWorkEntryIn getWorkEntryIn() {
    return workEntryIn;
  }


  public void setWorkEntryIn(WorkEntriesUpdateWorkEntryResponseDataWorkEntryIn workEntryIn) {
    
    
    
    this.workEntryIn = workEntryIn;
  }


  public WorkEntriesUpdateWorkEntryResponseData workEntryOut(WorkEntriesUpdateWorkEntryResponseDataWorkEntryOut workEntryOut) {
    
    
    
    
    this.workEntryOut = workEntryOut;
    return this;
  }

   /**
   * Get workEntryOut
   * @return workEntryOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkEntriesUpdateWorkEntryResponseDataWorkEntryOut getWorkEntryOut() {
    return workEntryOut;
  }


  public void setWorkEntryOut(WorkEntriesUpdateWorkEntryResponseDataWorkEntryOut workEntryOut) {
    
    
    
    this.workEntryOut = workEntryOut;
  }


  public WorkEntriesUpdateWorkEntryResponseData workedSeconds(Float workedSeconds) {
    
    
    
    
    this.workedSeconds = workedSeconds;
    return this;
  }

   /**
   * Get workedSeconds
   * @return workedSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getWorkedSeconds() {
    return workedSeconds;
  }


  public void setWorkedSeconds(Float workedSeconds) {
    
    
    
    this.workedSeconds = workedSeconds;
  }


  public WorkEntriesUpdateWorkEntryResponseData createdAt(String createdAt) {
    
    
    
    
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


  public WorkEntriesUpdateWorkEntryResponseData updatedAt(String updatedAt) {
    
    
    
    
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


  public WorkEntriesUpdateWorkEntryResponseData deletedAt(String deletedAt) {
    
    
    
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T10:00:00+01:00", value = "")

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
   * @return the WorkEntriesUpdateWorkEntryResponseData instance itself
   */
  public WorkEntriesUpdateWorkEntryResponseData putAdditionalProperty(String key, Object value) {
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
    WorkEntriesUpdateWorkEntryResponseData workEntriesUpdateWorkEntryResponseData = (WorkEntriesUpdateWorkEntryResponseData) o;
    return Objects.equals(this.id, workEntriesUpdateWorkEntryResponseData.id) &&
        Objects.equals(this.workCheckTypeId, workEntriesUpdateWorkEntryResponseData.workCheckTypeId) &&
        Objects.equals(this.employee, workEntriesUpdateWorkEntryResponseData.employee) &&
        Objects.equals(this.workEntryType, workEntriesUpdateWorkEntryResponseData.workEntryType) &&
        Objects.equals(this.workEntryIn, workEntriesUpdateWorkEntryResponseData.workEntryIn) &&
        Objects.equals(this.workEntryOut, workEntriesUpdateWorkEntryResponseData.workEntryOut) &&
        Objects.equals(this.workedSeconds, workEntriesUpdateWorkEntryResponseData.workedSeconds) &&
        Objects.equals(this.createdAt, workEntriesUpdateWorkEntryResponseData.createdAt) &&
        Objects.equals(this.updatedAt, workEntriesUpdateWorkEntryResponseData.updatedAt) &&
        Objects.equals(this.deletedAt, workEntriesUpdateWorkEntryResponseData.deletedAt)&&
        Objects.equals(this.additionalProperties, workEntriesUpdateWorkEntryResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workCheckTypeId, employee, workEntryType, workEntryIn, workEntryOut, workedSeconds, createdAt, updatedAt, deletedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkEntriesUpdateWorkEntryResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workCheckTypeId: ").append(toIndentedString(workCheckTypeId)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    workEntryType: ").append(toIndentedString(workEntryType)).append("\n");
    sb.append("    workEntryIn: ").append(toIndentedString(workEntryIn)).append("\n");
    sb.append("    workEntryOut: ").append(toIndentedString(workEntryOut)).append("\n");
    sb.append("    workedSeconds: ").append(toIndentedString(workedSeconds)).append("\n");
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
    openapiFields.add("workCheckTypeId");
    openapiFields.add("employee");
    openapiFields.add("workEntryType");
    openapiFields.add("workEntryIn");
    openapiFields.add("workEntryOut");
    openapiFields.add("workedSeconds");
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
  * @throws IOException if the JSON Object is invalid with respect to WorkEntriesUpdateWorkEntryResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkEntriesUpdateWorkEntryResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkEntriesUpdateWorkEntryResponseData is not found in the empty JSON string", WorkEntriesUpdateWorkEntryResponseData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("workCheckTypeId") != null && !jsonObj.get("workCheckTypeId").isJsonNull()) && !jsonObj.get("workCheckTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workCheckTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workCheckTypeId").toString()));
      }
      // validate the optional field `employee`
      if (jsonObj.get("employee") != null && !jsonObj.get("employee").isJsonNull()) {
        WorkEntriesUpdateWorkEntryResponseDataEmployee.validateJsonObject(jsonObj.getAsJsonObject("employee"));
      }
      if ((jsonObj.get("workEntryType") != null && !jsonObj.get("workEntryType").isJsonNull()) && !jsonObj.get("workEntryType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workEntryType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workEntryType").toString()));
      }
      // validate the optional field `workEntryIn`
      if (jsonObj.get("workEntryIn") != null && !jsonObj.get("workEntryIn").isJsonNull()) {
        WorkEntriesUpdateWorkEntryResponseDataWorkEntryIn.validateJsonObject(jsonObj.getAsJsonObject("workEntryIn"));
      }
      // validate the optional field `workEntryOut`
      if (jsonObj.get("workEntryOut") != null && !jsonObj.get("workEntryOut").isJsonNull()) {
        WorkEntriesUpdateWorkEntryResponseDataWorkEntryOut.validateJsonObject(jsonObj.getAsJsonObject("workEntryOut"));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if ((jsonObj.get("updatedAt") != null && !jsonObj.get("updatedAt").isJsonNull()) && !jsonObj.get("updatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedAt").toString()));
      }
      if ((jsonObj.get("deletedAt") != null && !jsonObj.get("deletedAt").isJsonNull()) && !jsonObj.get("deletedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deletedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deletedAt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkEntriesUpdateWorkEntryResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkEntriesUpdateWorkEntryResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkEntriesUpdateWorkEntryResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkEntriesUpdateWorkEntryResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkEntriesUpdateWorkEntryResponseData>() {
           @Override
           public void write(JsonWriter out, WorkEntriesUpdateWorkEntryResponseData value) throws IOException {
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
           public WorkEntriesUpdateWorkEntryResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkEntriesUpdateWorkEntryResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkEntriesUpdateWorkEntryResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkEntriesUpdateWorkEntryResponseData
  * @throws IOException if the JSON string is invalid with respect to WorkEntriesUpdateWorkEntryResponseData
  */
  public static WorkEntriesUpdateWorkEntryResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkEntriesUpdateWorkEntryResponseData.class);
  }

 /**
  * Convert an instance of WorkEntriesUpdateWorkEntryResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

