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
import com.konfigthis.client.model.VacationConfigurationsListConfigurationsResponseDataInnerCompany;
import com.konfigthis.client.model.VacationConfigurationsListConfigurationsResponseDataInnerNotAllowedDateRangesInner;
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
 * VacationConfigurationsListConfigurationsResponseDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VacationConfigurationsListConfigurationsResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMPLOYEE_REQUEST_ENABLED = "employeeRequestEnabled";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_REQUEST_ENABLED)
  private Boolean employeeRequestEnabled;

  public static final String SERIALIZED_NAME_NEEDS_VALIDATION = "needsValidation";
  @SerializedName(SERIALIZED_NAME_NEEDS_VALIDATION)
  private Boolean needsValidation;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private VacationConfigurationsListConfigurationsResponseDataInnerCompany company;

  /**
   * Gets or Sets dayType
   */
  @JsonAdapter(DayTypeEnum.Adapter.class)
 public enum DayTypeEnum {
    BUSINESS_DAY("business_day"),
    
    CALENDAR_DAY("calendar_day");

    private String value;

    DayTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DayTypeEnum fromValue(String value) {
      for (DayTypeEnum b : DayTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DayTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DayTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DayTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DayTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DAY_TYPE = "dayType";
  @SerializedName(SERIALIZED_NAME_DAY_TYPE)
  private DayTypeEnum dayType;

  public static final String SERIALIZED_NAME_MAX_DAYS_OFF = "maxDaysOff";
  @SerializedName(SERIALIZED_NAME_MAX_DAYS_OFF)
  private Integer maxDaysOff;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_NOT_ALLOWED_DATE_RANGES = "notAllowedDateRanges";
  @SerializedName(SERIALIZED_NAME_NOT_ALLOWED_DATE_RANGES)
  private List<VacationConfigurationsListConfigurationsResponseDataInnerNotAllowedDateRangesInner> notAllowedDateRanges = null;

  public static final String SERIALIZED_NAME_CREATION_DATE_NEXT_YEAR = "creationDateNextYear";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_NEXT_YEAR)
  private String creationDateNextYear;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deletedAt";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  public VacationConfigurationsListConfigurationsResponseDataInner() {
  }

  public VacationConfigurationsListConfigurationsResponseDataInner id(UUID id) {
    
    
    
    
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


  public VacationConfigurationsListConfigurationsResponseDataInner name(String name) {
    
    
    
    
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


  public VacationConfigurationsListConfigurationsResponseDataInner employeeRequestEnabled(Boolean employeeRequestEnabled) {
    
    
    
    
    this.employeeRequestEnabled = employeeRequestEnabled;
    return this;
  }

   /**
   * Get employeeRequestEnabled
   * @return employeeRequestEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEmployeeRequestEnabled() {
    return employeeRequestEnabled;
  }


  public void setEmployeeRequestEnabled(Boolean employeeRequestEnabled) {
    
    
    
    this.employeeRequestEnabled = employeeRequestEnabled;
  }


  public VacationConfigurationsListConfigurationsResponseDataInner needsValidation(Boolean needsValidation) {
    
    
    
    
    this.needsValidation = needsValidation;
    return this;
  }

   /**
   * Get needsValidation
   * @return needsValidation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNeedsValidation() {
    return needsValidation;
  }


  public void setNeedsValidation(Boolean needsValidation) {
    
    
    
    this.needsValidation = needsValidation;
  }


  public VacationConfigurationsListConfigurationsResponseDataInner company(VacationConfigurationsListConfigurationsResponseDataInnerCompany company) {
    
    
    
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VacationConfigurationsListConfigurationsResponseDataInnerCompany getCompany() {
    return company;
  }


  public void setCompany(VacationConfigurationsListConfigurationsResponseDataInnerCompany company) {
    
    
    
    this.company = company;
  }


  public VacationConfigurationsListConfigurationsResponseDataInner dayType(DayTypeEnum dayType) {
    
    
    
    
    this.dayType = dayType;
    return this;
  }

   /**
   * Get dayType
   * @return dayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DayTypeEnum getDayType() {
    return dayType;
  }


  public void setDayType(DayTypeEnum dayType) {
    
    
    
    this.dayType = dayType;
  }


  public VacationConfigurationsListConfigurationsResponseDataInner maxDaysOff(Integer maxDaysOff) {
    
    
    
    
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


  public VacationConfigurationsListConfigurationsResponseDataInner isDefault(Boolean isDefault) {
    
    
    
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    
    
    
    this.isDefault = isDefault;
  }


  public VacationConfigurationsListConfigurationsResponseDataInner notAllowedDateRanges(List<VacationConfigurationsListConfigurationsResponseDataInnerNotAllowedDateRangesInner> notAllowedDateRanges) {
    
    
    
    
    this.notAllowedDateRanges = notAllowedDateRanges;
    return this;
  }

  public VacationConfigurationsListConfigurationsResponseDataInner addNotAllowedDateRangesItem(VacationConfigurationsListConfigurationsResponseDataInnerNotAllowedDateRangesInner notAllowedDateRangesItem) {
    if (this.notAllowedDateRanges == null) {
      this.notAllowedDateRanges = new ArrayList<>();
    }
    this.notAllowedDateRanges.add(notAllowedDateRangesItem);
    return this;
  }

   /**
   * Get notAllowedDateRanges
   * @return notAllowedDateRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VacationConfigurationsListConfigurationsResponseDataInnerNotAllowedDateRangesInner> getNotAllowedDateRanges() {
    return notAllowedDateRanges;
  }


  public void setNotAllowedDateRanges(List<VacationConfigurationsListConfigurationsResponseDataInnerNotAllowedDateRangesInner> notAllowedDateRanges) {
    
    
    
    this.notAllowedDateRanges = notAllowedDateRanges;
  }


  public VacationConfigurationsListConfigurationsResponseDataInner creationDateNextYear(String creationDateNextYear) {
    
    
    
    
    this.creationDateNextYear = creationDateNextYear;
    return this;
  }

   /**
   * Get creationDateNextYear
   * @return creationDateNextYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreationDateNextYear() {
    return creationDateNextYear;
  }


  public void setCreationDateNextYear(String creationDateNextYear) {
    
    
    
    this.creationDateNextYear = creationDateNextYear;
  }


  public VacationConfigurationsListConfigurationsResponseDataInner createdAt(String createdAt) {
    
    
    
    
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


  public VacationConfigurationsListConfigurationsResponseDataInner updatedAt(String updatedAt) {
    
    
    
    
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


  public VacationConfigurationsListConfigurationsResponseDataInner deletedAt(String deletedAt) {
    
    
    
    
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
   * @return the VacationConfigurationsListConfigurationsResponseDataInner instance itself
   */
  public VacationConfigurationsListConfigurationsResponseDataInner putAdditionalProperty(String key, Object value) {
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
    VacationConfigurationsListConfigurationsResponseDataInner vacationConfigurationsListConfigurationsResponseDataInner = (VacationConfigurationsListConfigurationsResponseDataInner) o;
    return Objects.equals(this.id, vacationConfigurationsListConfigurationsResponseDataInner.id) &&
        Objects.equals(this.name, vacationConfigurationsListConfigurationsResponseDataInner.name) &&
        Objects.equals(this.employeeRequestEnabled, vacationConfigurationsListConfigurationsResponseDataInner.employeeRequestEnabled) &&
        Objects.equals(this.needsValidation, vacationConfigurationsListConfigurationsResponseDataInner.needsValidation) &&
        Objects.equals(this.company, vacationConfigurationsListConfigurationsResponseDataInner.company) &&
        Objects.equals(this.dayType, vacationConfigurationsListConfigurationsResponseDataInner.dayType) &&
        Objects.equals(this.maxDaysOff, vacationConfigurationsListConfigurationsResponseDataInner.maxDaysOff) &&
        Objects.equals(this.isDefault, vacationConfigurationsListConfigurationsResponseDataInner.isDefault) &&
        Objects.equals(this.notAllowedDateRanges, vacationConfigurationsListConfigurationsResponseDataInner.notAllowedDateRanges) &&
        Objects.equals(this.creationDateNextYear, vacationConfigurationsListConfigurationsResponseDataInner.creationDateNextYear) &&
        Objects.equals(this.createdAt, vacationConfigurationsListConfigurationsResponseDataInner.createdAt) &&
        Objects.equals(this.updatedAt, vacationConfigurationsListConfigurationsResponseDataInner.updatedAt) &&
        Objects.equals(this.deletedAt, vacationConfigurationsListConfigurationsResponseDataInner.deletedAt)&&
        Objects.equals(this.additionalProperties, vacationConfigurationsListConfigurationsResponseDataInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, employeeRequestEnabled, needsValidation, company, dayType, maxDaysOff, isDefault, notAllowedDateRanges, creationDateNextYear, createdAt, updatedAt, deletedAt, additionalProperties);
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
    sb.append("class VacationConfigurationsListConfigurationsResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    employeeRequestEnabled: ").append(toIndentedString(employeeRequestEnabled)).append("\n");
    sb.append("    needsValidation: ").append(toIndentedString(needsValidation)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    dayType: ").append(toIndentedString(dayType)).append("\n");
    sb.append("    maxDaysOff: ").append(toIndentedString(maxDaysOff)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    notAllowedDateRanges: ").append(toIndentedString(notAllowedDateRanges)).append("\n");
    sb.append("    creationDateNextYear: ").append(toIndentedString(creationDateNextYear)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("employeeRequestEnabled");
    openapiFields.add("needsValidation");
    openapiFields.add("company");
    openapiFields.add("dayType");
    openapiFields.add("maxDaysOff");
    openapiFields.add("isDefault");
    openapiFields.add("notAllowedDateRanges");
    openapiFields.add("creationDateNextYear");
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
  * @throws IOException if the JSON Object is invalid with respect to VacationConfigurationsListConfigurationsResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VacationConfigurationsListConfigurationsResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VacationConfigurationsListConfigurationsResponseDataInner is not found in the empty JSON string", VacationConfigurationsListConfigurationsResponseDataInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `company`
      if (jsonObj.get("company") != null && !jsonObj.get("company").isJsonNull()) {
        VacationConfigurationsListConfigurationsResponseDataInnerCompany.validateJsonObject(jsonObj.getAsJsonObject("company"));
      }
      if ((jsonObj.get("dayType") != null && !jsonObj.get("dayType").isJsonNull()) && !jsonObj.get("dayType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dayType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dayType").toString()));
      }
      if (jsonObj.get("notAllowedDateRanges") != null && !jsonObj.get("notAllowedDateRanges").isJsonNull()) {
        JsonArray jsonArraynotAllowedDateRanges = jsonObj.getAsJsonArray("notAllowedDateRanges");
        if (jsonArraynotAllowedDateRanges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notAllowedDateRanges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notAllowedDateRanges` to be an array in the JSON string but got `%s`", jsonObj.get("notAllowedDateRanges").toString()));
          }

          // validate the optional field `notAllowedDateRanges` (array)
          for (int i = 0; i < jsonArraynotAllowedDateRanges.size(); i++) {
            VacationConfigurationsListConfigurationsResponseDataInnerNotAllowedDateRangesInner.validateJsonObject(jsonArraynotAllowedDateRanges.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("creationDateNextYear") != null && !jsonObj.get("creationDateNextYear").isJsonNull()) && !jsonObj.get("creationDateNextYear").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creationDateNextYear` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creationDateNextYear").toString()));
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
       if (!VacationConfigurationsListConfigurationsResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VacationConfigurationsListConfigurationsResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VacationConfigurationsListConfigurationsResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VacationConfigurationsListConfigurationsResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<VacationConfigurationsListConfigurationsResponseDataInner>() {
           @Override
           public void write(JsonWriter out, VacationConfigurationsListConfigurationsResponseDataInner value) throws IOException {
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
           public VacationConfigurationsListConfigurationsResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VacationConfigurationsListConfigurationsResponseDataInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VacationConfigurationsListConfigurationsResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VacationConfigurationsListConfigurationsResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to VacationConfigurationsListConfigurationsResponseDataInner
  */
  public static VacationConfigurationsListConfigurationsResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VacationConfigurationsListConfigurationsResponseDataInner.class);
  }

 /**
  * Convert an instance of VacationConfigurationsListConfigurationsResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

