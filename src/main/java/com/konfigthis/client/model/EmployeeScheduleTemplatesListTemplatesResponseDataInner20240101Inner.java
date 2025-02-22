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
import com.konfigthis.client.model.EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101InnerWeekdaysRanges;
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
 * EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MONDAY_MINUTES = "mondayMinutes";
  @SerializedName(SERIALIZED_NAME_MONDAY_MINUTES)
  private Integer mondayMinutes;

  public static final String SERIALIZED_NAME_TUESDAY_MINUTES = "tuesdayMinutes";
  @SerializedName(SERIALIZED_NAME_TUESDAY_MINUTES)
  private Integer tuesdayMinutes;

  public static final String SERIALIZED_NAME_WEDNESDAY_MINUTES = "wednesdayMinutes";
  @SerializedName(SERIALIZED_NAME_WEDNESDAY_MINUTES)
  private Integer wednesdayMinutes;

  public static final String SERIALIZED_NAME_THURSDAY_MINUTES = "thursdayMinutes";
  @SerializedName(SERIALIZED_NAME_THURSDAY_MINUTES)
  private Integer thursdayMinutes;

  public static final String SERIALIZED_NAME_FRIDAY_MINUTES = "fridayMinutes";
  @SerializedName(SERIALIZED_NAME_FRIDAY_MINUTES)
  private Integer fridayMinutes;

  public static final String SERIALIZED_NAME_SATURDAY_MINUTES = "saturdayMinutes";
  @SerializedName(SERIALIZED_NAME_SATURDAY_MINUTES)
  private Integer saturdayMinutes;

  public static final String SERIALIZED_NAME_SUNDAY_MINUTES = "sundayMinutes";
  @SerializedName(SERIALIZED_NAME_SUNDAY_MINUTES)
  private Integer sundayMinutes;

  public static final String SERIALIZED_NAME_CURRENT_DAY_MINUTES = "currentDayMinutes";
  @SerializedName(SERIALIZED_NAME_CURRENT_DAY_MINUTES)
  private Integer currentDayMinutes;

  public static final String SERIALIZED_NAME_WEEKDAYS_RANGES = "weekdaysRanges";
  @SerializedName(SERIALIZED_NAME_WEEKDAYS_RANGES)
  private EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101InnerWeekdaysRanges weekdaysRanges;

  public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner() {
  }

  public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner id(UUID id) {
    
    
    
    
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


  public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner name(String name) {
    
    
    
    
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


  public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner mondayMinutes(Integer mondayMinutes) {
    
    
    
    
    this.mondayMinutes = mondayMinutes;
    return this;
  }

   /**
   * Get mondayMinutes
   * @return mondayMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "")

  public Integer getMondayMinutes() {
    return mondayMinutes;
  }


  public void setMondayMinutes(Integer mondayMinutes) {
    
    
    
    this.mondayMinutes = mondayMinutes;
  }


  public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner tuesdayMinutes(Integer tuesdayMinutes) {
    
    
    
    
    this.tuesdayMinutes = tuesdayMinutes;
    return this;
  }

   /**
   * Get tuesdayMinutes
   * @return tuesdayMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "")

  public Integer getTuesdayMinutes() {
    return tuesdayMinutes;
  }


  public void setTuesdayMinutes(Integer tuesdayMinutes) {
    
    
    
    this.tuesdayMinutes = tuesdayMinutes;
  }


  public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner wednesdayMinutes(Integer wednesdayMinutes) {
    
    
    
    
    this.wednesdayMinutes = wednesdayMinutes;
    return this;
  }

   /**
   * Get wednesdayMinutes
   * @return wednesdayMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "")

  public Integer getWednesdayMinutes() {
    return wednesdayMinutes;
  }


  public void setWednesdayMinutes(Integer wednesdayMinutes) {
    
    
    
    this.wednesdayMinutes = wednesdayMinutes;
  }


  public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner thursdayMinutes(Integer thursdayMinutes) {
    
    
    
    
    this.thursdayMinutes = thursdayMinutes;
    return this;
  }

   /**
   * Get thursdayMinutes
   * @return thursdayMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "")

  public Integer getThursdayMinutes() {
    return thursdayMinutes;
  }


  public void setThursdayMinutes(Integer thursdayMinutes) {
    
    
    
    this.thursdayMinutes = thursdayMinutes;
  }


  public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner fridayMinutes(Integer fridayMinutes) {
    
    
    
    
    this.fridayMinutes = fridayMinutes;
    return this;
  }

   /**
   * Get fridayMinutes
   * @return fridayMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "")

  public Integer getFridayMinutes() {
    return fridayMinutes;
  }


  public void setFridayMinutes(Integer fridayMinutes) {
    
    
    
    this.fridayMinutes = fridayMinutes;
  }


  public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner saturdayMinutes(Integer saturdayMinutes) {
    
    
    
    
    this.saturdayMinutes = saturdayMinutes;
    return this;
  }

   /**
   * Get saturdayMinutes
   * @return saturdayMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSaturdayMinutes() {
    return saturdayMinutes;
  }


  public void setSaturdayMinutes(Integer saturdayMinutes) {
    
    
    
    this.saturdayMinutes = saturdayMinutes;
  }


  public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner sundayMinutes(Integer sundayMinutes) {
    
    
    
    
    this.sundayMinutes = sundayMinutes;
    return this;
  }

   /**
   * Get sundayMinutes
   * @return sundayMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSundayMinutes() {
    return sundayMinutes;
  }


  public void setSundayMinutes(Integer sundayMinutes) {
    
    
    
    this.sundayMinutes = sundayMinutes;
  }


  public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner currentDayMinutes(Integer currentDayMinutes) {
    
    
    
    
    this.currentDayMinutes = currentDayMinutes;
    return this;
  }

   /**
   * Get currentDayMinutes
   * @return currentDayMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCurrentDayMinutes() {
    return currentDayMinutes;
  }


  public void setCurrentDayMinutes(Integer currentDayMinutes) {
    
    
    
    this.currentDayMinutes = currentDayMinutes;
  }


  public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner weekdaysRanges(EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101InnerWeekdaysRanges weekdaysRanges) {
    
    
    
    
    this.weekdaysRanges = weekdaysRanges;
    return this;
  }

   /**
   * Get weekdaysRanges
   * @return weekdaysRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101InnerWeekdaysRanges getWeekdaysRanges() {
    return weekdaysRanges;
  }


  public void setWeekdaysRanges(EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101InnerWeekdaysRanges weekdaysRanges) {
    
    
    
    this.weekdaysRanges = weekdaysRanges;
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
   * @return the EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner instance itself
   */
  public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner putAdditionalProperty(String key, Object value) {
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
    EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner employeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner = (EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner) o;
    return Objects.equals(this.id, employeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.id) &&
        Objects.equals(this.name, employeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.name) &&
        Objects.equals(this.mondayMinutes, employeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.mondayMinutes) &&
        Objects.equals(this.tuesdayMinutes, employeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.tuesdayMinutes) &&
        Objects.equals(this.wednesdayMinutes, employeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.wednesdayMinutes) &&
        Objects.equals(this.thursdayMinutes, employeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.thursdayMinutes) &&
        Objects.equals(this.fridayMinutes, employeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.fridayMinutes) &&
        Objects.equals(this.saturdayMinutes, employeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.saturdayMinutes) &&
        Objects.equals(this.sundayMinutes, employeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.sundayMinutes) &&
        Objects.equals(this.currentDayMinutes, employeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.currentDayMinutes) &&
        Objects.equals(this.weekdaysRanges, employeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.weekdaysRanges)&&
        Objects.equals(this.additionalProperties, employeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, mondayMinutes, tuesdayMinutes, wednesdayMinutes, thursdayMinutes, fridayMinutes, saturdayMinutes, sundayMinutes, currentDayMinutes, weekdaysRanges, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mondayMinutes: ").append(toIndentedString(mondayMinutes)).append("\n");
    sb.append("    tuesdayMinutes: ").append(toIndentedString(tuesdayMinutes)).append("\n");
    sb.append("    wednesdayMinutes: ").append(toIndentedString(wednesdayMinutes)).append("\n");
    sb.append("    thursdayMinutes: ").append(toIndentedString(thursdayMinutes)).append("\n");
    sb.append("    fridayMinutes: ").append(toIndentedString(fridayMinutes)).append("\n");
    sb.append("    saturdayMinutes: ").append(toIndentedString(saturdayMinutes)).append("\n");
    sb.append("    sundayMinutes: ").append(toIndentedString(sundayMinutes)).append("\n");
    sb.append("    currentDayMinutes: ").append(toIndentedString(currentDayMinutes)).append("\n");
    sb.append("    weekdaysRanges: ").append(toIndentedString(weekdaysRanges)).append("\n");
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
    openapiFields.add("mondayMinutes");
    openapiFields.add("tuesdayMinutes");
    openapiFields.add("wednesdayMinutes");
    openapiFields.add("thursdayMinutes");
    openapiFields.add("fridayMinutes");
    openapiFields.add("saturdayMinutes");
    openapiFields.add("sundayMinutes");
    openapiFields.add("currentDayMinutes");
    openapiFields.add("weekdaysRanges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner is not found in the empty JSON string", EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `weekdaysRanges`
      if (jsonObj.get("weekdaysRanges") != null && !jsonObj.get("weekdaysRanges").isJsonNull()) {
        EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101InnerWeekdaysRanges.validateJsonObject(jsonObj.getAsJsonObject("weekdaysRanges"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner>() {
           @Override
           public void write(JsonWriter out, EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner value) throws IOException {
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
           public EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner
  * @throws IOException if the JSON string is invalid with respect to EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner
  */
  public static EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner.class);
  }

 /**
  * Convert an instance of EmployeeScheduleTemplatesListTemplatesResponseDataInner20240101Inner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

