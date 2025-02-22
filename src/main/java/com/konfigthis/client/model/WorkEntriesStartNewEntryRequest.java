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
import com.konfigthis.client.model.WorkEntriesStartNewEntryRequestWorkEntryIn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * WorkEntriesStartNewEntryRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkEntriesStartNewEntryRequest {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private UUID employeeId;

  public static final String SERIALIZED_NAME_WORK_ENTRY_IN = "workEntryIn";
  @SerializedName(SERIALIZED_NAME_WORK_ENTRY_IN)
  private WorkEntriesStartNewEntryRequestWorkEntryIn workEntryIn;

  public static final String SERIALIZED_NAME_WORK_CHECK_TYPE_ID = "workCheckTypeId";
  @SerializedName(SERIALIZED_NAME_WORK_CHECK_TYPE_ID)
  private UUID workCheckTypeId;

  public static final String SERIALIZED_NAME_WORK_BREAK_ID = "workBreakId";
  @SerializedName(SERIALIZED_NAME_WORK_BREAK_ID)
  private UUID workBreakId;

  public WorkEntriesStartNewEntryRequest() {
  }

  public WorkEntriesStartNewEntryRequest employeeId(UUID employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(UUID employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public WorkEntriesStartNewEntryRequest workEntryIn(WorkEntriesStartNewEntryRequestWorkEntryIn workEntryIn) {
    
    
    
    
    this.workEntryIn = workEntryIn;
    return this;
  }

   /**
   * Get workEntryIn
   * @return workEntryIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkEntriesStartNewEntryRequestWorkEntryIn getWorkEntryIn() {
    return workEntryIn;
  }


  public void setWorkEntryIn(WorkEntriesStartNewEntryRequestWorkEntryIn workEntryIn) {
    
    
    
    this.workEntryIn = workEntryIn;
  }


  public WorkEntriesStartNewEntryRequest workCheckTypeId(UUID workCheckTypeId) {
    
    
    
    
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


  public WorkEntriesStartNewEntryRequest workBreakId(UUID workBreakId) {
    
    
    
    
    this.workBreakId = workBreakId;
    return this;
  }

   /**
   * Get workBreakId
   * @return workBreakId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getWorkBreakId() {
    return workBreakId;
  }


  public void setWorkBreakId(UUID workBreakId) {
    
    
    
    this.workBreakId = workBreakId;
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
   * @return the WorkEntriesStartNewEntryRequest instance itself
   */
  public WorkEntriesStartNewEntryRequest putAdditionalProperty(String key, Object value) {
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
    WorkEntriesStartNewEntryRequest workEntriesStartNewEntryRequest = (WorkEntriesStartNewEntryRequest) o;
    return Objects.equals(this.employeeId, workEntriesStartNewEntryRequest.employeeId) &&
        Objects.equals(this.workEntryIn, workEntriesStartNewEntryRequest.workEntryIn) &&
        Objects.equals(this.workCheckTypeId, workEntriesStartNewEntryRequest.workCheckTypeId) &&
        Objects.equals(this.workBreakId, workEntriesStartNewEntryRequest.workBreakId)&&
        Objects.equals(this.additionalProperties, workEntriesStartNewEntryRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, workEntryIn, workCheckTypeId, workBreakId, additionalProperties);
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
    sb.append("class WorkEntriesStartNewEntryRequest {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    workEntryIn: ").append(toIndentedString(workEntryIn)).append("\n");
    sb.append("    workCheckTypeId: ").append(toIndentedString(workCheckTypeId)).append("\n");
    sb.append("    workBreakId: ").append(toIndentedString(workBreakId)).append("\n");
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
    openapiFields.add("employeeId");
    openapiFields.add("workEntryIn");
    openapiFields.add("workCheckTypeId");
    openapiFields.add("workBreakId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employeeId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkEntriesStartNewEntryRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkEntriesStartNewEntryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkEntriesStartNewEntryRequest is not found in the empty JSON string", WorkEntriesStartNewEntryRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkEntriesStartNewEntryRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      // validate the optional field `workEntryIn`
      if (jsonObj.get("workEntryIn") != null && !jsonObj.get("workEntryIn").isJsonNull()) {
        WorkEntriesStartNewEntryRequestWorkEntryIn.validateJsonObject(jsonObj.getAsJsonObject("workEntryIn"));
      }
      if (!jsonObj.get("workCheckTypeId").isJsonNull() && (jsonObj.get("workCheckTypeId") != null && !jsonObj.get("workCheckTypeId").isJsonNull()) && !jsonObj.get("workCheckTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workCheckTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workCheckTypeId").toString()));
      }
      if (!jsonObj.get("workBreakId").isJsonNull() && (jsonObj.get("workBreakId") != null && !jsonObj.get("workBreakId").isJsonNull()) && !jsonObj.get("workBreakId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workBreakId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workBreakId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkEntriesStartNewEntryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkEntriesStartNewEntryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkEntriesStartNewEntryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkEntriesStartNewEntryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkEntriesStartNewEntryRequest>() {
           @Override
           public void write(JsonWriter out, WorkEntriesStartNewEntryRequest value) throws IOException {
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
           public WorkEntriesStartNewEntryRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkEntriesStartNewEntryRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkEntriesStartNewEntryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkEntriesStartNewEntryRequest
  * @throws IOException if the JSON string is invalid with respect to WorkEntriesStartNewEntryRequest
  */
  public static WorkEntriesStartNewEntryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkEntriesStartNewEntryRequest.class);
  }

 /**
  * Convert an instance of WorkEntriesStartNewEntryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

