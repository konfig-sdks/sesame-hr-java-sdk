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
import com.konfigthis.client.model.AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerAbsenceCalendar;
import com.konfigthis.client.model.AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerDaysOffInner;
import com.konfigthis.client.model.AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerEmployee;
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
 * AbsenceDayOffRequestsListDayOffRequestsResponseDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AbsenceDayOffRequestsListDayOffRequestsResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ABSENCE_CALENDAR = "absenceCalendar";
  @SerializedName(SERIALIZED_NAME_ABSENCE_CALENDAR)
  private AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerAbsenceCalendar absenceCalendar;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerEmployee employee;

  public static final String SERIALIZED_NAME_DAYS_OFF = "daysOff";
  @SerializedName(SERIALIZED_NAME_DAYS_OFF)
  private List<AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerDaysOffInner> daysOff = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    ACCEPTED("accepted"),
    
    REJECTED("rejected"),
    
    PENDING("pending");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

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

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private UUID comment;

  public static final String SERIALIZED_NAME_RESOLUTION_COMMENT = "resolutionComment";
  @SerializedName(SERIALIZED_NAME_RESOLUTION_COMMENT)
  private UUID resolutionComment;

  public static final String SERIALIZED_NAME_RESOLVED_AT = "resolvedAt";
  @SerializedName(SERIALIZED_NAME_RESOLVED_AT)
  private String resolvedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deletedAt";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner() {
  }

  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner id(UUID id) {
    
    
    
    
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


  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner absenceCalendar(AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerAbsenceCalendar absenceCalendar) {
    
    
    
    
    this.absenceCalendar = absenceCalendar;
    return this;
  }

   /**
   * Get absenceCalendar
   * @return absenceCalendar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerAbsenceCalendar getAbsenceCalendar() {
    return absenceCalendar;
  }


  public void setAbsenceCalendar(AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerAbsenceCalendar absenceCalendar) {
    
    
    
    this.absenceCalendar = absenceCalendar;
  }


  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner employee(AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerEmployee employee) {
    
    
    
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerEmployee getEmployee() {
    return employee;
  }


  public void setEmployee(AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerEmployee employee) {
    
    
    
    this.employee = employee;
  }


  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner daysOff(List<AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerDaysOffInner> daysOff) {
    
    
    
    
    this.daysOff = daysOff;
    return this;
  }

  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner addDaysOffItem(AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerDaysOffInner daysOffItem) {
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

  public List<AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerDaysOffInner> getDaysOff() {
    return daysOff;
  }


  public void setDaysOff(List<AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerDaysOffInner> daysOff) {
    
    
    
    this.daysOff = daysOff;
  }


  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner type(TypeEnum type) {
    
    
    
    
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


  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner comment(UUID comment) {
    
    
    
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getComment() {
    return comment;
  }


  public void setComment(UUID comment) {
    
    
    
    this.comment = comment;
  }


  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner resolutionComment(UUID resolutionComment) {
    
    
    
    
    this.resolutionComment = resolutionComment;
    return this;
  }

   /**
   * Get resolutionComment
   * @return resolutionComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getResolutionComment() {
    return resolutionComment;
  }


  public void setResolutionComment(UUID resolutionComment) {
    
    
    
    this.resolutionComment = resolutionComment;
  }


  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner resolvedAt(String resolvedAt) {
    
    
    
    
    this.resolvedAt = resolvedAt;
    return this;
  }

   /**
   * Get resolvedAt
   * @return resolvedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T10:00:00+01:00", value = "")

  public String getResolvedAt() {
    return resolvedAt;
  }


  public void setResolvedAt(String resolvedAt) {
    
    
    
    this.resolvedAt = resolvedAt;
  }


  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner createdAt(String createdAt) {
    
    
    
    
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


  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner updatedAt(String updatedAt) {
    
    
    
    
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


  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner deletedAt(String deletedAt) {
    
    
    
    
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
   * @return the AbsenceDayOffRequestsListDayOffRequestsResponseDataInner instance itself
   */
  public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner putAdditionalProperty(String key, Object value) {
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
    AbsenceDayOffRequestsListDayOffRequestsResponseDataInner absenceDayOffRequestsListDayOffRequestsResponseDataInner = (AbsenceDayOffRequestsListDayOffRequestsResponseDataInner) o;
    return Objects.equals(this.id, absenceDayOffRequestsListDayOffRequestsResponseDataInner.id) &&
        Objects.equals(this.absenceCalendar, absenceDayOffRequestsListDayOffRequestsResponseDataInner.absenceCalendar) &&
        Objects.equals(this.employee, absenceDayOffRequestsListDayOffRequestsResponseDataInner.employee) &&
        Objects.equals(this.daysOff, absenceDayOffRequestsListDayOffRequestsResponseDataInner.daysOff) &&
        Objects.equals(this.status, absenceDayOffRequestsListDayOffRequestsResponseDataInner.status) &&
        Objects.equals(this.type, absenceDayOffRequestsListDayOffRequestsResponseDataInner.type) &&
        Objects.equals(this.comment, absenceDayOffRequestsListDayOffRequestsResponseDataInner.comment) &&
        Objects.equals(this.resolutionComment, absenceDayOffRequestsListDayOffRequestsResponseDataInner.resolutionComment) &&
        Objects.equals(this.resolvedAt, absenceDayOffRequestsListDayOffRequestsResponseDataInner.resolvedAt) &&
        Objects.equals(this.createdAt, absenceDayOffRequestsListDayOffRequestsResponseDataInner.createdAt) &&
        Objects.equals(this.updatedAt, absenceDayOffRequestsListDayOffRequestsResponseDataInner.updatedAt) &&
        Objects.equals(this.deletedAt, absenceDayOffRequestsListDayOffRequestsResponseDataInner.deletedAt)&&
        Objects.equals(this.additionalProperties, absenceDayOffRequestsListDayOffRequestsResponseDataInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, absenceCalendar, employee, daysOff, status, type, comment, resolutionComment, resolvedAt, createdAt, updatedAt, deletedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbsenceDayOffRequestsListDayOffRequestsResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    absenceCalendar: ").append(toIndentedString(absenceCalendar)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    daysOff: ").append(toIndentedString(daysOff)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    resolutionComment: ").append(toIndentedString(resolutionComment)).append("\n");
    sb.append("    resolvedAt: ").append(toIndentedString(resolvedAt)).append("\n");
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
    openapiFields.add("absenceCalendar");
    openapiFields.add("employee");
    openapiFields.add("daysOff");
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("comment");
    openapiFields.add("resolutionComment");
    openapiFields.add("resolvedAt");
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
  * @throws IOException if the JSON Object is invalid with respect to AbsenceDayOffRequestsListDayOffRequestsResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AbsenceDayOffRequestsListDayOffRequestsResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AbsenceDayOffRequestsListDayOffRequestsResponseDataInner is not found in the empty JSON string", AbsenceDayOffRequestsListDayOffRequestsResponseDataInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `absenceCalendar`
      if (jsonObj.get("absenceCalendar") != null && !jsonObj.get("absenceCalendar").isJsonNull()) {
        AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerAbsenceCalendar.validateJsonObject(jsonObj.getAsJsonObject("absenceCalendar"));
      }
      // validate the optional field `employee`
      if (jsonObj.get("employee") != null && !jsonObj.get("employee").isJsonNull()) {
        AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerEmployee.validateJsonObject(jsonObj.getAsJsonObject("employee"));
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
            AbsenceDayOffRequestsListDayOffRequestsResponseDataInnerDaysOffInner.validateJsonObject(jsonArraydaysOff.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("resolutionComment") != null && !jsonObj.get("resolutionComment").isJsonNull()) && !jsonObj.get("resolutionComment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resolutionComment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resolutionComment").toString()));
      }
      if ((jsonObj.get("resolvedAt") != null && !jsonObj.get("resolvedAt").isJsonNull()) && !jsonObj.get("resolvedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resolvedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resolvedAt").toString()));
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
       if (!AbsenceDayOffRequestsListDayOffRequestsResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AbsenceDayOffRequestsListDayOffRequestsResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AbsenceDayOffRequestsListDayOffRequestsResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AbsenceDayOffRequestsListDayOffRequestsResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AbsenceDayOffRequestsListDayOffRequestsResponseDataInner>() {
           @Override
           public void write(JsonWriter out, AbsenceDayOffRequestsListDayOffRequestsResponseDataInner value) throws IOException {
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
           public AbsenceDayOffRequestsListDayOffRequestsResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AbsenceDayOffRequestsListDayOffRequestsResponseDataInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AbsenceDayOffRequestsListDayOffRequestsResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AbsenceDayOffRequestsListDayOffRequestsResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to AbsenceDayOffRequestsListDayOffRequestsResponseDataInner
  */
  public static AbsenceDayOffRequestsListDayOffRequestsResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AbsenceDayOffRequestsListDayOffRequestsResponseDataInner.class);
  }

 /**
  * Convert an instance of AbsenceDayOffRequestsListDayOffRequestsResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

