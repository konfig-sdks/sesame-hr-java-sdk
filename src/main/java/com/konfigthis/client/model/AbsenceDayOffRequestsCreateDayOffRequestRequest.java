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
import com.konfigthis.client.model.AbsenceDayOffRequestsCreateDayOffRequestRequestDaysOffInner;
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
 * AbsenceDayOffRequestsCreateDayOffRequestRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AbsenceDayOffRequestsCreateDayOffRequestRequest {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private UUID employeeId;

  public static final String SERIALIZED_NAME_ABSENCE_TYPE_ID = "absenceTypeId";
  @SerializedName(SERIALIZED_NAME_ABSENCE_TYPE_ID)
  private UUID absenceTypeId;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    CREATE("create"),
    
    DELETE("delete");

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

  public static final String SERIALIZED_NAME_DAYS_OFF = "daysOff";
  @SerializedName(SERIALIZED_NAME_DAYS_OFF)
  private List<AbsenceDayOffRequestsCreateDayOffRequestRequestDaysOffInner> daysOff = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public AbsenceDayOffRequestsCreateDayOffRequestRequest() {
  }

  public AbsenceDayOffRequestsCreateDayOffRequestRequest employeeId(UUID employeeId) {
    
    
    
    
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


  public AbsenceDayOffRequestsCreateDayOffRequestRequest absenceTypeId(UUID absenceTypeId) {
    
    
    
    
    this.absenceTypeId = absenceTypeId;
    return this;
  }

   /**
   * Get absenceTypeId
   * @return absenceTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getAbsenceTypeId() {
    return absenceTypeId;
  }


  public void setAbsenceTypeId(UUID absenceTypeId) {
    
    
    
    this.absenceTypeId = absenceTypeId;
  }


  public AbsenceDayOffRequestsCreateDayOffRequestRequest type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public AbsenceDayOffRequestsCreateDayOffRequestRequest daysOff(List<AbsenceDayOffRequestsCreateDayOffRequestRequestDaysOffInner> daysOff) {
    
    
    
    
    this.daysOff = daysOff;
    return this;
  }

  public AbsenceDayOffRequestsCreateDayOffRequestRequest addDaysOffItem(AbsenceDayOffRequestsCreateDayOffRequestRequestDaysOffInner daysOffItem) {
    this.daysOff.add(daysOffItem);
    return this;
  }

   /**
   * Get daysOff
   * @return daysOff
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<AbsenceDayOffRequestsCreateDayOffRequestRequestDaysOffInner> getDaysOff() {
    return daysOff;
  }


  public void setDaysOff(List<AbsenceDayOffRequestsCreateDayOffRequestRequestDaysOffInner> daysOff) {
    
    
    
    this.daysOff = daysOff;
  }


  public AbsenceDayOffRequestsCreateDayOffRequestRequest comment(String comment) {
    
    
    
    
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
   * @return the AbsenceDayOffRequestsCreateDayOffRequestRequest instance itself
   */
  public AbsenceDayOffRequestsCreateDayOffRequestRequest putAdditionalProperty(String key, Object value) {
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
    AbsenceDayOffRequestsCreateDayOffRequestRequest absenceDayOffRequestsCreateDayOffRequestRequest = (AbsenceDayOffRequestsCreateDayOffRequestRequest) o;
    return Objects.equals(this.employeeId, absenceDayOffRequestsCreateDayOffRequestRequest.employeeId) &&
        Objects.equals(this.absenceTypeId, absenceDayOffRequestsCreateDayOffRequestRequest.absenceTypeId) &&
        Objects.equals(this.type, absenceDayOffRequestsCreateDayOffRequestRequest.type) &&
        Objects.equals(this.daysOff, absenceDayOffRequestsCreateDayOffRequestRequest.daysOff) &&
        Objects.equals(this.comment, absenceDayOffRequestsCreateDayOffRequestRequest.comment)&&
        Objects.equals(this.additionalProperties, absenceDayOffRequestsCreateDayOffRequestRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, absenceTypeId, type, daysOff, comment, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbsenceDayOffRequestsCreateDayOffRequestRequest {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    absenceTypeId: ").append(toIndentedString(absenceTypeId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    daysOff: ").append(toIndentedString(daysOff)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
    openapiFields.add("absenceTypeId");
    openapiFields.add("type");
    openapiFields.add("daysOff");
    openapiFields.add("comment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employeeId");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("daysOff");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AbsenceDayOffRequestsCreateDayOffRequestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AbsenceDayOffRequestsCreateDayOffRequestRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AbsenceDayOffRequestsCreateDayOffRequestRequest is not found in the empty JSON string", AbsenceDayOffRequestsCreateDayOffRequestRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AbsenceDayOffRequestsCreateDayOffRequestRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if ((jsonObj.get("absenceTypeId") != null && !jsonObj.get("absenceTypeId").isJsonNull()) && !jsonObj.get("absenceTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `absenceTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("absenceTypeId").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("daysOff").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `daysOff` to be an array in the JSON string but got `%s`", jsonObj.get("daysOff").toString()));
      }

      JsonArray jsonArraydaysOff = jsonObj.getAsJsonArray("daysOff");
      // validate the required field `daysOff` (array)
      for (int i = 0; i < jsonArraydaysOff.size(); i++) {
        AbsenceDayOffRequestsCreateDayOffRequestRequestDaysOffInner.validateJsonObject(jsonArraydaysOff.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AbsenceDayOffRequestsCreateDayOffRequestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AbsenceDayOffRequestsCreateDayOffRequestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AbsenceDayOffRequestsCreateDayOffRequestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AbsenceDayOffRequestsCreateDayOffRequestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AbsenceDayOffRequestsCreateDayOffRequestRequest>() {
           @Override
           public void write(JsonWriter out, AbsenceDayOffRequestsCreateDayOffRequestRequest value) throws IOException {
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
           public AbsenceDayOffRequestsCreateDayOffRequestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AbsenceDayOffRequestsCreateDayOffRequestRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AbsenceDayOffRequestsCreateDayOffRequestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AbsenceDayOffRequestsCreateDayOffRequestRequest
  * @throws IOException if the JSON string is invalid with respect to AbsenceDayOffRequestsCreateDayOffRequestRequest
  */
  public static AbsenceDayOffRequestsCreateDayOffRequestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AbsenceDayOffRequestsCreateDayOffRequestRequest.class);
  }

 /**
  * Convert an instance of AbsenceDayOffRequestsCreateDayOffRequestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

