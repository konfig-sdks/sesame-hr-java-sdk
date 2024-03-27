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
import com.konfigthis.client.model.VacationCalendarsCreateNewCalendarResponseDataEmployee;
import com.konfigthis.client.model.VacationCalendarsCreateNewCalendarResponseDataVacationConfiguration;
import com.konfigthis.client.model.VacationCalendarsListCalendarsResponseDataInnerDaysOffInner;
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
 * VacationCalendarsCreateNewCalendarResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VacationCalendarsCreateNewCalendarResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private VacationCalendarsCreateNewCalendarResponseDataEmployee employee;

  public static final String SERIALIZED_NAME_DAYS_OFF = "daysOff";
  @SerializedName(SERIALIZED_NAME_DAYS_OFF)
  private List<VacationCalendarsListCalendarsResponseDataInnerDaysOffInner> daysOff = null;

  public static final String SERIALIZED_NAME_MAX_DAYS_OFF = "maxDaysOff";
  @SerializedName(SERIALIZED_NAME_MAX_DAYS_OFF)
  private Integer maxDaysOff;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;

  public static final String SERIALIZED_NAME_VACATION_CONFIGURATION = "vacationConfiguration";
  @SerializedName(SERIALIZED_NAME_VACATION_CONFIGURATION)
  private VacationCalendarsCreateNewCalendarResponseDataVacationConfiguration vacationConfiguration;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deletedAt";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  public VacationCalendarsCreateNewCalendarResponseData() {
  }

  public VacationCalendarsCreateNewCalendarResponseData id(UUID id) {
    
    
    
    
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


  public VacationCalendarsCreateNewCalendarResponseData employee(VacationCalendarsCreateNewCalendarResponseDataEmployee employee) {
    
    
    
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VacationCalendarsCreateNewCalendarResponseDataEmployee getEmployee() {
    return employee;
  }


  public void setEmployee(VacationCalendarsCreateNewCalendarResponseDataEmployee employee) {
    
    
    
    this.employee = employee;
  }


  public VacationCalendarsCreateNewCalendarResponseData daysOff(List<VacationCalendarsListCalendarsResponseDataInnerDaysOffInner> daysOff) {
    
    
    
    
    this.daysOff = daysOff;
    return this;
  }

  public VacationCalendarsCreateNewCalendarResponseData addDaysOffItem(VacationCalendarsListCalendarsResponseDataInnerDaysOffInner daysOffItem) {
    if (this.daysOff == null) {
      this.daysOff = new ArrayList<>();
    }
    this.daysOff.add(daysOffItem);
    return this;
  }

   /**
   * Get daysOff
   * @return daysOff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VacationCalendarsListCalendarsResponseDataInnerDaysOffInner> getDaysOff() {
    return daysOff;
  }


  public void setDaysOff(List<VacationCalendarsListCalendarsResponseDataInnerDaysOffInner> daysOff) {
    
    
    
    this.daysOff = daysOff;
  }


  public VacationCalendarsCreateNewCalendarResponseData maxDaysOff(Integer maxDaysOff) {
    
    
    
    
    this.maxDaysOff = maxDaysOff;
    return this;
  }

   /**
   * Get maxDaysOff
   * @return maxDaysOff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxDaysOff() {
    return maxDaysOff;
  }


  public void setMaxDaysOff(Integer maxDaysOff) {
    
    
    
    this.maxDaysOff = maxDaysOff;
  }


  public VacationCalendarsCreateNewCalendarResponseData year(Integer year) {
    
    
    
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    
    
    
    this.year = year;
  }


  public VacationCalendarsCreateNewCalendarResponseData vacationConfiguration(VacationCalendarsCreateNewCalendarResponseDataVacationConfiguration vacationConfiguration) {
    
    
    
    
    this.vacationConfiguration = vacationConfiguration;
    return this;
  }

   /**
   * Get vacationConfiguration
   * @return vacationConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VacationCalendarsCreateNewCalendarResponseDataVacationConfiguration getVacationConfiguration() {
    return vacationConfiguration;
  }


  public void setVacationConfiguration(VacationCalendarsCreateNewCalendarResponseDataVacationConfiguration vacationConfiguration) {
    
    
    
    this.vacationConfiguration = vacationConfiguration;
  }


  public VacationCalendarsCreateNewCalendarResponseData createdAt(String createdAt) {
    
    
    
    
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


  public VacationCalendarsCreateNewCalendarResponseData updatedAt(String updatedAt) {
    
    
    
    
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


  public VacationCalendarsCreateNewCalendarResponseData deletedAt(String deletedAt) {
    
    
    
    
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
   * @return the VacationCalendarsCreateNewCalendarResponseData instance itself
   */
  public VacationCalendarsCreateNewCalendarResponseData putAdditionalProperty(String key, Object value) {
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
    VacationCalendarsCreateNewCalendarResponseData vacationCalendarsCreateNewCalendarResponseData = (VacationCalendarsCreateNewCalendarResponseData) o;
    return Objects.equals(this.id, vacationCalendarsCreateNewCalendarResponseData.id) &&
        Objects.equals(this.employee, vacationCalendarsCreateNewCalendarResponseData.employee) &&
        Objects.equals(this.daysOff, vacationCalendarsCreateNewCalendarResponseData.daysOff) &&
        Objects.equals(this.maxDaysOff, vacationCalendarsCreateNewCalendarResponseData.maxDaysOff) &&
        Objects.equals(this.year, vacationCalendarsCreateNewCalendarResponseData.year) &&
        Objects.equals(this.vacationConfiguration, vacationCalendarsCreateNewCalendarResponseData.vacationConfiguration) &&
        Objects.equals(this.createdAt, vacationCalendarsCreateNewCalendarResponseData.createdAt) &&
        Objects.equals(this.updatedAt, vacationCalendarsCreateNewCalendarResponseData.updatedAt) &&
        Objects.equals(this.deletedAt, vacationCalendarsCreateNewCalendarResponseData.deletedAt)&&
        Objects.equals(this.additionalProperties, vacationCalendarsCreateNewCalendarResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employee, daysOff, maxDaysOff, year, vacationConfiguration, createdAt, updatedAt, deletedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacationCalendarsCreateNewCalendarResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    daysOff: ").append(toIndentedString(daysOff)).append("\n");
    sb.append("    maxDaysOff: ").append(toIndentedString(maxDaysOff)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    vacationConfiguration: ").append(toIndentedString(vacationConfiguration)).append("\n");
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
    openapiFields.add("daysOff");
    openapiFields.add("maxDaysOff");
    openapiFields.add("year");
    openapiFields.add("vacationConfiguration");
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
  * @throws IOException if the JSON Object is invalid with respect to VacationCalendarsCreateNewCalendarResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VacationCalendarsCreateNewCalendarResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VacationCalendarsCreateNewCalendarResponseData is not found in the empty JSON string", VacationCalendarsCreateNewCalendarResponseData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `employee`
      if (jsonObj.get("employee") != null && !jsonObj.get("employee").isJsonNull()) {
        VacationCalendarsCreateNewCalendarResponseDataEmployee.validateJsonObject(jsonObj.getAsJsonObject("employee"));
      }
      if (jsonObj.get("daysOff") != null && !jsonObj.get("daysOff").isJsonNull()) {
        JsonArray jsonArraydaysOff = jsonObj.getAsJsonArray("daysOff");
        if (jsonArraydaysOff != null) {
          // ensure the json data is an array
          if (!jsonObj.get("daysOff").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `daysOff` to be an array in the JSON string but got `%s`", jsonObj.get("daysOff").toString()));
          }

          // validate the optional field `daysOff` (array)
          for (int i = 0; i < jsonArraydaysOff.size(); i++) {
            VacationCalendarsListCalendarsResponseDataInnerDaysOffInner.validateJsonObject(jsonArraydaysOff.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `vacationConfiguration`
      if (jsonObj.get("vacationConfiguration") != null && !jsonObj.get("vacationConfiguration").isJsonNull()) {
        VacationCalendarsCreateNewCalendarResponseDataVacationConfiguration.validateJsonObject(jsonObj.getAsJsonObject("vacationConfiguration"));
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
       if (!VacationCalendarsCreateNewCalendarResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VacationCalendarsCreateNewCalendarResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VacationCalendarsCreateNewCalendarResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VacationCalendarsCreateNewCalendarResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<VacationCalendarsCreateNewCalendarResponseData>() {
           @Override
           public void write(JsonWriter out, VacationCalendarsCreateNewCalendarResponseData value) throws IOException {
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
           public VacationCalendarsCreateNewCalendarResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VacationCalendarsCreateNewCalendarResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VacationCalendarsCreateNewCalendarResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VacationCalendarsCreateNewCalendarResponseData
  * @throws IOException if the JSON string is invalid with respect to VacationCalendarsCreateNewCalendarResponseData
  */
  public static VacationCalendarsCreateNewCalendarResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VacationCalendarsCreateNewCalendarResponseData.class);
  }

 /**
  * Convert an instance of VacationCalendarsCreateNewCalendarResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

