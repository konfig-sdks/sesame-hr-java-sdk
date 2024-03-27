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
import com.konfigthis.client.model.AbsenceCalendarsCreateCalendarResponseDataAbsenceTypeCompany;
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
 * AbsenceCalendarsCreateCalendarResponseDataAbsenceType
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AbsenceCalendarsCreateCalendarResponseDataAbsenceType {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEEDS_VALIDATION = "needsValidation";
  @SerializedName(SERIALIZED_NAME_NEEDS_VALIDATION)
  private Boolean needsValidation;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private AbsenceCalendarsCreateCalendarResponseDataAbsenceTypeCompany company;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deletedAt";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    NORMAL("normal"),
    
    PRIVATE("private");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * Gets or Sets pickMode
   */
  @JsonAdapter(PickModeEnum.Adapter.class)
 public enum PickModeEnum {
    DAYS("by_days"),
    
    TIME_RANGE("by_time_range");

    private String value;

    PickModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PickModeEnum fromValue(String value) {
      for (PickModeEnum b : PickModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PickModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PickModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PickModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PickModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PICK_MODE = "pickMode";
  @SerializedName(SERIALIZED_NAME_PICK_MODE)
  private PickModeEnum pickMode;

  public AbsenceCalendarsCreateCalendarResponseDataAbsenceType() {
  }

  public AbsenceCalendarsCreateCalendarResponseDataAbsenceType id(UUID id) {
    
    
    
    
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


  public AbsenceCalendarsCreateCalendarResponseDataAbsenceType name(String name) {
    
    
    
    
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


  public AbsenceCalendarsCreateCalendarResponseDataAbsenceType needsValidation(Boolean needsValidation) {
    
    
    
    
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


  public AbsenceCalendarsCreateCalendarResponseDataAbsenceType company(AbsenceCalendarsCreateCalendarResponseDataAbsenceTypeCompany company) {
    
    
    
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AbsenceCalendarsCreateCalendarResponseDataAbsenceTypeCompany getCompany() {
    return company;
  }


  public void setCompany(AbsenceCalendarsCreateCalendarResponseDataAbsenceTypeCompany company) {
    
    
    
    this.company = company;
  }


  public AbsenceCalendarsCreateCalendarResponseDataAbsenceType createdAt(String createdAt) {
    
    
    
    
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


  public AbsenceCalendarsCreateCalendarResponseDataAbsenceType updatedAt(String updatedAt) {
    
    
    
    
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


  public AbsenceCalendarsCreateCalendarResponseDataAbsenceType deletedAt(String deletedAt) {
    
    
    
    
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


  public AbsenceCalendarsCreateCalendarResponseDataAbsenceType type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public AbsenceCalendarsCreateCalendarResponseDataAbsenceType pickMode(PickModeEnum pickMode) {
    
    
    
    
    this.pickMode = pickMode;
    return this;
  }

   /**
   * Get pickMode
   * @return pickMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PickModeEnum getPickMode() {
    return pickMode;
  }


  public void setPickMode(PickModeEnum pickMode) {
    
    
    
    this.pickMode = pickMode;
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
   * @return the AbsenceCalendarsCreateCalendarResponseDataAbsenceType instance itself
   */
  public AbsenceCalendarsCreateCalendarResponseDataAbsenceType putAdditionalProperty(String key, Object value) {
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
    AbsenceCalendarsCreateCalendarResponseDataAbsenceType absenceCalendarsCreateCalendarResponseDataAbsenceType = (AbsenceCalendarsCreateCalendarResponseDataAbsenceType) o;
    return Objects.equals(this.id, absenceCalendarsCreateCalendarResponseDataAbsenceType.id) &&
        Objects.equals(this.name, absenceCalendarsCreateCalendarResponseDataAbsenceType.name) &&
        Objects.equals(this.needsValidation, absenceCalendarsCreateCalendarResponseDataAbsenceType.needsValidation) &&
        Objects.equals(this.company, absenceCalendarsCreateCalendarResponseDataAbsenceType.company) &&
        Objects.equals(this.createdAt, absenceCalendarsCreateCalendarResponseDataAbsenceType.createdAt) &&
        Objects.equals(this.updatedAt, absenceCalendarsCreateCalendarResponseDataAbsenceType.updatedAt) &&
        Objects.equals(this.deletedAt, absenceCalendarsCreateCalendarResponseDataAbsenceType.deletedAt) &&
        Objects.equals(this.type, absenceCalendarsCreateCalendarResponseDataAbsenceType.type) &&
        Objects.equals(this.pickMode, absenceCalendarsCreateCalendarResponseDataAbsenceType.pickMode)&&
        Objects.equals(this.additionalProperties, absenceCalendarsCreateCalendarResponseDataAbsenceType.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, needsValidation, company, createdAt, updatedAt, deletedAt, type, pickMode, additionalProperties);
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
    sb.append("class AbsenceCalendarsCreateCalendarResponseDataAbsenceType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    needsValidation: ").append(toIndentedString(needsValidation)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pickMode: ").append(toIndentedString(pickMode)).append("\n");
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
    openapiFields.add("needsValidation");
    openapiFields.add("company");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("deletedAt");
    openapiFields.add("type");
    openapiFields.add("pickMode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AbsenceCalendarsCreateCalendarResponseDataAbsenceType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AbsenceCalendarsCreateCalendarResponseDataAbsenceType.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AbsenceCalendarsCreateCalendarResponseDataAbsenceType is not found in the empty JSON string", AbsenceCalendarsCreateCalendarResponseDataAbsenceType.openapiRequiredFields.toString()));
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
        AbsenceCalendarsCreateCalendarResponseDataAbsenceTypeCompany.validateJsonObject(jsonObj.getAsJsonObject("company"));
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
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("pickMode") != null && !jsonObj.get("pickMode").isJsonNull()) && !jsonObj.get("pickMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pickMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pickMode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AbsenceCalendarsCreateCalendarResponseDataAbsenceType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AbsenceCalendarsCreateCalendarResponseDataAbsenceType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AbsenceCalendarsCreateCalendarResponseDataAbsenceType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AbsenceCalendarsCreateCalendarResponseDataAbsenceType.class));

       return (TypeAdapter<T>) new TypeAdapter<AbsenceCalendarsCreateCalendarResponseDataAbsenceType>() {
           @Override
           public void write(JsonWriter out, AbsenceCalendarsCreateCalendarResponseDataAbsenceType value) throws IOException {
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
           public AbsenceCalendarsCreateCalendarResponseDataAbsenceType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AbsenceCalendarsCreateCalendarResponseDataAbsenceType instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AbsenceCalendarsCreateCalendarResponseDataAbsenceType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AbsenceCalendarsCreateCalendarResponseDataAbsenceType
  * @throws IOException if the JSON string is invalid with respect to AbsenceCalendarsCreateCalendarResponseDataAbsenceType
  */
  public static AbsenceCalendarsCreateCalendarResponseDataAbsenceType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AbsenceCalendarsCreateCalendarResponseDataAbsenceType.class);
  }

 /**
  * Convert an instance of AbsenceCalendarsCreateCalendarResponseDataAbsenceType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

