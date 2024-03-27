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
 * AgreementsGetAgreementResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AgreementsGetAgreementResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private UUID companyId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_ANNUAL_HOURS = "annualHours";
  @SerializedName(SERIALIZED_NAME_ANNUAL_HOURS)
  private Double annualHours;

  public static final String SERIALIZED_NAME_ADDITIONAL_HOURS_PERCENT = "additionalHoursPercent";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_HOURS_PERCENT)
  private Double additionalHoursPercent;

  public static final String SERIALIZED_NAME_TOTAL_ADDITIONAL_HOURS = "totalAdditionalHours";
  @SerializedName(SERIALIZED_NAME_TOTAL_ADDITIONAL_HOURS)
  private Double totalAdditionalHours;

  public static final String SERIALIZED_NAME_MAX_DAYS_TO_WORK = "maxDaysToWork";
  @SerializedName(SERIALIZED_NAME_MAX_DAYS_TO_WORK)
  private Double maxDaysToWork;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public AgreementsGetAgreementResponse() {
  }

  public AgreementsGetAgreementResponse id(UUID id) {
    
    
    
    
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


  public AgreementsGetAgreementResponse companyId(UUID companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getCompanyId() {
    return companyId;
  }


  public void setCompanyId(UUID companyId) {
    
    
    
    this.companyId = companyId;
  }


  public AgreementsGetAgreementResponse name(String name) {
    
    
    
    
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


  public AgreementsGetAgreementResponse code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public AgreementsGetAgreementResponse color(String color) {
    
    
    
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    
    
    
    this.color = color;
  }


  public AgreementsGetAgreementResponse annualHours(Double annualHours) {
    
    
    
    
    this.annualHours = annualHours;
    return this;
  }

  public AgreementsGetAgreementResponse annualHours(Integer annualHours) {
    
    
    
    
    this.annualHours = annualHours.doubleValue();
    return this;
  }

   /**
   * Get annualHours
   * @return annualHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getAnnualHours() {
    return annualHours;
  }


  public void setAnnualHours(Double annualHours) {
    
    
    
    this.annualHours = annualHours;
  }


  public AgreementsGetAgreementResponse additionalHoursPercent(Double additionalHoursPercent) {
    
    
    
    
    this.additionalHoursPercent = additionalHoursPercent;
    return this;
  }

  public AgreementsGetAgreementResponse additionalHoursPercent(Integer additionalHoursPercent) {
    
    
    
    
    this.additionalHoursPercent = additionalHoursPercent.doubleValue();
    return this;
  }

   /**
   * Get additionalHoursPercent
   * @return additionalHoursPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getAdditionalHoursPercent() {
    return additionalHoursPercent;
  }


  public void setAdditionalHoursPercent(Double additionalHoursPercent) {
    
    
    
    this.additionalHoursPercent = additionalHoursPercent;
  }


  public AgreementsGetAgreementResponse totalAdditionalHours(Double totalAdditionalHours) {
    
    
    
    
    this.totalAdditionalHours = totalAdditionalHours;
    return this;
  }

  public AgreementsGetAgreementResponse totalAdditionalHours(Integer totalAdditionalHours) {
    
    
    
    
    this.totalAdditionalHours = totalAdditionalHours.doubleValue();
    return this;
  }

   /**
   * Get totalAdditionalHours
   * @return totalAdditionalHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTotalAdditionalHours() {
    return totalAdditionalHours;
  }


  public void setTotalAdditionalHours(Double totalAdditionalHours) {
    
    
    
    this.totalAdditionalHours = totalAdditionalHours;
  }


  public AgreementsGetAgreementResponse maxDaysToWork(Double maxDaysToWork) {
    
    
    
    
    this.maxDaysToWork = maxDaysToWork;
    return this;
  }

  public AgreementsGetAgreementResponse maxDaysToWork(Integer maxDaysToWork) {
    
    
    
    
    this.maxDaysToWork = maxDaysToWork.doubleValue();
    return this;
  }

   /**
   * Get maxDaysToWork
   * @return maxDaysToWork
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMaxDaysToWork() {
    return maxDaysToWork;
  }


  public void setMaxDaysToWork(Double maxDaysToWork) {
    
    
    
    this.maxDaysToWork = maxDaysToWork;
  }


  public AgreementsGetAgreementResponse createdAt(String createdAt) {
    
    
    
    
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


  public AgreementsGetAgreementResponse updatedAt(String updatedAt) {
    
    
    
    
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
   * @return the AgreementsGetAgreementResponse instance itself
   */
  public AgreementsGetAgreementResponse putAdditionalProperty(String key, Object value) {
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
    AgreementsGetAgreementResponse agreementsGetAgreementResponse = (AgreementsGetAgreementResponse) o;
    return Objects.equals(this.id, agreementsGetAgreementResponse.id) &&
        Objects.equals(this.companyId, agreementsGetAgreementResponse.companyId) &&
        Objects.equals(this.name, agreementsGetAgreementResponse.name) &&
        Objects.equals(this.code, agreementsGetAgreementResponse.code) &&
        Objects.equals(this.color, agreementsGetAgreementResponse.color) &&
        Objects.equals(this.annualHours, agreementsGetAgreementResponse.annualHours) &&
        Objects.equals(this.additionalHoursPercent, agreementsGetAgreementResponse.additionalHoursPercent) &&
        Objects.equals(this.totalAdditionalHours, agreementsGetAgreementResponse.totalAdditionalHours) &&
        Objects.equals(this.maxDaysToWork, agreementsGetAgreementResponse.maxDaysToWork) &&
        Objects.equals(this.createdAt, agreementsGetAgreementResponse.createdAt) &&
        Objects.equals(this.updatedAt, agreementsGetAgreementResponse.updatedAt)&&
        Objects.equals(this.additionalProperties, agreementsGetAgreementResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, name, code, color, annualHours, additionalHoursPercent, totalAdditionalHours, maxDaysToWork, createdAt, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementsGetAgreementResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    annualHours: ").append(toIndentedString(annualHours)).append("\n");
    sb.append("    additionalHoursPercent: ").append(toIndentedString(additionalHoursPercent)).append("\n");
    sb.append("    totalAdditionalHours: ").append(toIndentedString(totalAdditionalHours)).append("\n");
    sb.append("    maxDaysToWork: ").append(toIndentedString(maxDaysToWork)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("companyId");
    openapiFields.add("name");
    openapiFields.add("code");
    openapiFields.add("color");
    openapiFields.add("annualHours");
    openapiFields.add("additionalHoursPercent");
    openapiFields.add("totalAdditionalHours");
    openapiFields.add("maxDaysToWork");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AgreementsGetAgreementResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AgreementsGetAgreementResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgreementsGetAgreementResponse is not found in the empty JSON string", AgreementsGetAgreementResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if ((jsonObj.get("updatedAt") != null && !jsonObj.get("updatedAt").isJsonNull()) && !jsonObj.get("updatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedAt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgreementsGetAgreementResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgreementsGetAgreementResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgreementsGetAgreementResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgreementsGetAgreementResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AgreementsGetAgreementResponse>() {
           @Override
           public void write(JsonWriter out, AgreementsGetAgreementResponse value) throws IOException {
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
           public AgreementsGetAgreementResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AgreementsGetAgreementResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AgreementsGetAgreementResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgreementsGetAgreementResponse
  * @throws IOException if the JSON string is invalid with respect to AgreementsGetAgreementResponse
  */
  public static AgreementsGetAgreementResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgreementsGetAgreementResponse.class);
  }

 /**
  * Convert an instance of AgreementsGetAgreementResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

