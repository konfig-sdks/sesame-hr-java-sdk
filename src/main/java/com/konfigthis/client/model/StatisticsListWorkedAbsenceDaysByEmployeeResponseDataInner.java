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
import com.konfigthis.client.model.StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInnerDaysInner;
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
 * StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private UUID employeeId;

  public static final String SERIALIZED_NAME_DAYS = "days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  private List<StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInnerDaysInner> days = null;

  public StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner() {
  }

  public StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner employeeId(UUID employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(UUID employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner days(List<StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInnerDaysInner> days) {
    
    
    
    
    this.days = days;
    return this;
  }

  public StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner addDaysItem(StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInnerDaysInner daysItem) {
    if (this.days == null) {
      this.days = new ArrayList<>();
    }
    this.days.add(daysItem);
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInnerDaysInner> getDays() {
    return days;
  }


  public void setDays(List<StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInnerDaysInner> days) {
    
    
    
    this.days = days;
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
   * @return the StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner instance itself
   */
  public StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner putAdditionalProperty(String key, Object value) {
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
    StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner statisticsListWorkedAbsenceDaysByEmployeeResponseDataInner = (StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner) o;
    return Objects.equals(this.employeeId, statisticsListWorkedAbsenceDaysByEmployeeResponseDataInner.employeeId) &&
        Objects.equals(this.days, statisticsListWorkedAbsenceDaysByEmployeeResponseDataInner.days)&&
        Objects.equals(this.additionalProperties, statisticsListWorkedAbsenceDaysByEmployeeResponseDataInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, days, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
    openapiFields.add("days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner is not found in the empty JSON string", StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) && !jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if (jsonObj.get("days") != null && !jsonObj.get("days").isJsonNull()) {
        JsonArray jsonArraydays = jsonObj.getAsJsonArray("days");
        if (jsonArraydays != null) {
          // ensure the json data is an array
          if (!jsonObj.get("days").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `days` to be an array in the JSON string but got `%s`", jsonObj.get("days").toString()));
          }

          // validate the optional field `days` (array)
          for (int i = 0; i < jsonArraydays.size(); i++) {
            StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInnerDaysInner.validateJsonObject(jsonArraydays.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner>() {
           @Override
           public void write(JsonWriter out, StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner value) throws IOException {
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
           public StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner
  */
  public static StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner.class);
  }

 /**
  * Convert an instance of StatisticsListWorkedAbsenceDaysByEmployeeResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

