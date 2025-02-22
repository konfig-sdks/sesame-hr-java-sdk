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
 * RecruitmentUpdateCandidateRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RecruitmentUpdateCandidateRequest {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_LINKEDIN_U_R_L = "linkedinURL";
  @SerializedName(SERIALIZED_NAME_LINKEDIN_U_R_L)
  private String linkedinURL;

  public static final String SERIALIZED_NAME_DESIRED_SALARY = "desiredSalary";
  @SerializedName(SERIALIZED_NAME_DESIRED_SALARY)
  private String desiredSalary;

  public static final String SERIALIZED_NAME_START_WORK_DATE = "startWorkDate";
  @SerializedName(SERIALIZED_NAME_START_WORK_DATE)
  private String startWorkDate;

  public static final String SERIALIZED_NAME_WEB = "web";
  @SerializedName(SERIALIZED_NAME_WEB)
  private String web;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_VACANCY_ID = "vacancyId";
  @SerializedName(SERIALIZED_NAME_VACANCY_ID)
  private UUID vacancyId;

  public static final String SERIALIZED_NAME_STATUS_ID = "statusId";
  @SerializedName(SERIALIZED_NAME_STATUS_ID)
  private UUID statusId;

  public RecruitmentUpdateCandidateRequest() {
  }

  public RecruitmentUpdateCandidateRequest firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the candidate
   * @return firstName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The first name of the candidate")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public RecruitmentUpdateCandidateRequest lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the candidate
   * @return lastName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The last name of the candidate")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public RecruitmentUpdateCandidateRequest email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public RecruitmentUpdateCandidateRequest phone(String phone) {
    
    
    
    
    this.phone = phone;
    return this;
  }

   /**
   * The phone number of the candidate
   * @return phone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The phone number of the candidate")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    
    
    
    this.phone = phone;
  }


  public RecruitmentUpdateCandidateRequest linkedinURL(String linkedinURL) {
    
    
    
    
    this.linkedinURL = linkedinURL;
    return this;
  }

   /**
   * The LinkedIn URL of the candidate
   * @return linkedinURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The LinkedIn URL of the candidate")

  public String getLinkedinURL() {
    return linkedinURL;
  }


  public void setLinkedinURL(String linkedinURL) {
    
    
    
    this.linkedinURL = linkedinURL;
  }


  public RecruitmentUpdateCandidateRequest desiredSalary(String desiredSalary) {
    
    
    
    
    this.desiredSalary = desiredSalary;
    return this;
  }

   /**
   * The desired salary of the candidate
   * @return desiredSalary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The desired salary of the candidate")

  public String getDesiredSalary() {
    return desiredSalary;
  }


  public void setDesiredSalary(String desiredSalary) {
    
    
    
    this.desiredSalary = desiredSalary;
  }


  public RecruitmentUpdateCandidateRequest startWorkDate(String startWorkDate) {
    
    
    
    
    this.startWorkDate = startWorkDate;
    return this;
  }

   /**
   * The start work date of the candidate
   * @return startWorkDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start work date of the candidate")

  public String getStartWorkDate() {
    return startWorkDate;
  }


  public void setStartWorkDate(String startWorkDate) {
    
    
    
    this.startWorkDate = startWorkDate;
  }


  public RecruitmentUpdateCandidateRequest web(String web) {
    
    
    
    
    this.web = web;
    return this;
  }

   /**
   * The web of the candidate
   * @return web
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The web of the candidate")

  public String getWeb() {
    return web;
  }


  public void setWeb(String web) {
    
    
    
    this.web = web;
  }


  public RecruitmentUpdateCandidateRequest location(String location) {
    
    
    
    
    this.location = location;
    return this;
  }

   /**
   * The location of the candidate
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The location of the candidate")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    
    
    
    this.location = location;
  }


  public RecruitmentUpdateCandidateRequest vacancyId(UUID vacancyId) {
    
    
    
    
    this.vacancyId = vacancyId;
    return this;
  }

   /**
   * The identifier of the vacancy where the candidate will be added
   * @return vacancyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier of the vacancy where the candidate will be added")

  public UUID getVacancyId() {
    return vacancyId;
  }


  public void setVacancyId(UUID vacancyId) {
    
    
    
    this.vacancyId = vacancyId;
  }


  public RecruitmentUpdateCandidateRequest statusId(UUID statusId) {
    
    
    
    
    this.statusId = statusId;
    return this;
  }

   /**
   * The identifier of the status of the candidate
   * @return statusId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifier of the status of the candidate")

  public UUID getStatusId() {
    return statusId;
  }


  public void setStatusId(UUID statusId) {
    
    
    
    this.statusId = statusId;
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
   * @return the RecruitmentUpdateCandidateRequest instance itself
   */
  public RecruitmentUpdateCandidateRequest putAdditionalProperty(String key, Object value) {
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
    RecruitmentUpdateCandidateRequest recruitmentUpdateCandidateRequest = (RecruitmentUpdateCandidateRequest) o;
    return Objects.equals(this.firstName, recruitmentUpdateCandidateRequest.firstName) &&
        Objects.equals(this.lastName, recruitmentUpdateCandidateRequest.lastName) &&
        Objects.equals(this.email, recruitmentUpdateCandidateRequest.email) &&
        Objects.equals(this.phone, recruitmentUpdateCandidateRequest.phone) &&
        Objects.equals(this.linkedinURL, recruitmentUpdateCandidateRequest.linkedinURL) &&
        Objects.equals(this.desiredSalary, recruitmentUpdateCandidateRequest.desiredSalary) &&
        Objects.equals(this.startWorkDate, recruitmentUpdateCandidateRequest.startWorkDate) &&
        Objects.equals(this.web, recruitmentUpdateCandidateRequest.web) &&
        Objects.equals(this.location, recruitmentUpdateCandidateRequest.location) &&
        Objects.equals(this.vacancyId, recruitmentUpdateCandidateRequest.vacancyId) &&
        Objects.equals(this.statusId, recruitmentUpdateCandidateRequest.statusId)&&
        Objects.equals(this.additionalProperties, recruitmentUpdateCandidateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, phone, linkedinURL, desiredSalary, startWorkDate, web, location, vacancyId, statusId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitmentUpdateCandidateRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    linkedinURL: ").append(toIndentedString(linkedinURL)).append("\n");
    sb.append("    desiredSalary: ").append(toIndentedString(desiredSalary)).append("\n");
    sb.append("    startWorkDate: ").append(toIndentedString(startWorkDate)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    vacancyId: ").append(toIndentedString(vacancyId)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("linkedinURL");
    openapiFields.add("desiredSalary");
    openapiFields.add("startWorkDate");
    openapiFields.add("web");
    openapiFields.add("location");
    openapiFields.add("vacancyId");
    openapiFields.add("statusId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("phone");
    openapiRequiredFields.add("vacancyId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecruitmentUpdateCandidateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecruitmentUpdateCandidateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecruitmentUpdateCandidateRequest is not found in the empty JSON string", RecruitmentUpdateCandidateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecruitmentUpdateCandidateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (!jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("linkedinURL") != null && !jsonObj.get("linkedinURL").isJsonNull()) && !jsonObj.get("linkedinURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkedinURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkedinURL").toString()));
      }
      if ((jsonObj.get("desiredSalary") != null && !jsonObj.get("desiredSalary").isJsonNull()) && !jsonObj.get("desiredSalary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desiredSalary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desiredSalary").toString()));
      }
      if ((jsonObj.get("startWorkDate") != null && !jsonObj.get("startWorkDate").isJsonNull()) && !jsonObj.get("startWorkDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startWorkDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startWorkDate").toString()));
      }
      if ((jsonObj.get("web") != null && !jsonObj.get("web").isJsonNull()) && !jsonObj.get("web").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `web` to be a primitive type in the JSON string but got `%s`", jsonObj.get("web").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if (!jsonObj.get("vacancyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacancyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacancyId").toString()));
      }
      if ((jsonObj.get("statusId") != null && !jsonObj.get("statusId").isJsonNull()) && !jsonObj.get("statusId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecruitmentUpdateCandidateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecruitmentUpdateCandidateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecruitmentUpdateCandidateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecruitmentUpdateCandidateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RecruitmentUpdateCandidateRequest>() {
           @Override
           public void write(JsonWriter out, RecruitmentUpdateCandidateRequest value) throws IOException {
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
           public RecruitmentUpdateCandidateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RecruitmentUpdateCandidateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RecruitmentUpdateCandidateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecruitmentUpdateCandidateRequest
  * @throws IOException if the JSON string is invalid with respect to RecruitmentUpdateCandidateRequest
  */
  public static RecruitmentUpdateCandidateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecruitmentUpdateCandidateRequest.class);
  }

 /**
  * Convert an instance of RecruitmentUpdateCandidateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

