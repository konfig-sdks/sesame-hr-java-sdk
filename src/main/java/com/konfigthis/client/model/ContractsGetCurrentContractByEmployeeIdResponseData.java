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
import com.konfigthis.client.model.ContractsGetCurrentContractByEmployeeIdResponseDataContractType;
import com.konfigthis.client.model.ContractsGetCurrentContractByEmployeeIdResponseDataDegree;
import com.konfigthis.client.model.ContractsGetCurrentContractByEmployeeIdResponseDataHolidays;
import com.konfigthis.client.model.ContractsGetCurrentContractByEmployeeIdResponseDataJobCharge;
import com.konfigthis.client.model.ContractsGetCurrentContractByEmployeeIdResponseDataTrialPeriod;
import com.konfigthis.client.model.ContractsGetCurrentContractByEmployeeIdResponseDataWorkdayType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * ContractsGetCurrentContractByEmployeeIdResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ContractsGetCurrentContractByEmployeeIdResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_JOB_CHARGE = "jobCharge";
  @SerializedName(SERIALIZED_NAME_JOB_CHARGE)
  private ContractsGetCurrentContractByEmployeeIdResponseDataJobCharge jobCharge;

  public static final String SERIALIZED_NAME_WORKDAY_TYPE = "workdayType";
  @SerializedName(SERIALIZED_NAME_WORKDAY_TYPE)
  private ContractsGetCurrentContractByEmployeeIdResponseDataWorkdayType workdayType;

  public static final String SERIALIZED_NAME_CONTRACT_TYPE = "contractType";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TYPE)
  private ContractsGetCurrentContractByEmployeeIdResponseDataContractType contractType;

  public static final String SERIALIZED_NAME_DEGREE = "degree";
  @SerializedName(SERIALIZED_NAME_DEGREE)
  private ContractsGetCurrentContractByEmployeeIdResponseDataDegree degree;

  public static final String SERIALIZED_NAME_AGREEMENT = "agreement";
  @SerializedName(SERIALIZED_NAME_AGREEMENT)
  private String agreement;

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private String startAt;

  public static final String SERIALIZED_NAME_END_AT = "endAt";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private String endAt;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_TRIAL_PERIOD = "trialPeriod";
  @SerializedName(SERIALIZED_NAME_TRIAL_PERIOD)
  private ContractsGetCurrentContractByEmployeeIdResponseDataTrialPeriod trialPeriod;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_SOCIAL_SECURITY_NUMBER = "socialSecurityNumber";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SECURITY_NUMBER)
  private String socialSecurityNumber;

  public static final String SERIALIZED_NAME_HOLIDAYS = "holidays";
  @SerializedName(SERIALIZED_NAME_HOLIDAYS)
  private ContractsGetCurrentContractByEmployeeIdResponseDataHolidays holidays;

  public ContractsGetCurrentContractByEmployeeIdResponseData() {
  }

  public ContractsGetCurrentContractByEmployeeIdResponseData id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8c642543-8971-4763-8ebc-7549a382cab2", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ContractsGetCurrentContractByEmployeeIdResponseData status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "current", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public ContractsGetCurrentContractByEmployeeIdResponseData jobCharge(ContractsGetCurrentContractByEmployeeIdResponseDataJobCharge jobCharge) {
    
    
    
    
    this.jobCharge = jobCharge;
    return this;
  }

   /**
   * Get jobCharge
   * @return jobCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContractsGetCurrentContractByEmployeeIdResponseDataJobCharge getJobCharge() {
    return jobCharge;
  }


  public void setJobCharge(ContractsGetCurrentContractByEmployeeIdResponseDataJobCharge jobCharge) {
    
    
    
    this.jobCharge = jobCharge;
  }


  public ContractsGetCurrentContractByEmployeeIdResponseData workdayType(ContractsGetCurrentContractByEmployeeIdResponseDataWorkdayType workdayType) {
    
    
    
    
    this.workdayType = workdayType;
    return this;
  }

   /**
   * Get workdayType
   * @return workdayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContractsGetCurrentContractByEmployeeIdResponseDataWorkdayType getWorkdayType() {
    return workdayType;
  }


  public void setWorkdayType(ContractsGetCurrentContractByEmployeeIdResponseDataWorkdayType workdayType) {
    
    
    
    this.workdayType = workdayType;
  }


  public ContractsGetCurrentContractByEmployeeIdResponseData contractType(ContractsGetCurrentContractByEmployeeIdResponseDataContractType contractType) {
    
    
    
    
    this.contractType = contractType;
    return this;
  }

   /**
   * Get contractType
   * @return contractType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContractsGetCurrentContractByEmployeeIdResponseDataContractType getContractType() {
    return contractType;
  }


  public void setContractType(ContractsGetCurrentContractByEmployeeIdResponseDataContractType contractType) {
    
    
    
    this.contractType = contractType;
  }


  public ContractsGetCurrentContractByEmployeeIdResponseData degree(ContractsGetCurrentContractByEmployeeIdResponseDataDegree degree) {
    
    
    
    
    this.degree = degree;
    return this;
  }

   /**
   * Get degree
   * @return degree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContractsGetCurrentContractByEmployeeIdResponseDataDegree getDegree() {
    return degree;
  }


  public void setDegree(ContractsGetCurrentContractByEmployeeIdResponseDataDegree degree) {
    
    
    
    this.degree = degree;
  }


  public ContractsGetCurrentContractByEmployeeIdResponseData agreement(String agreement) {
    
    
    
    
    this.agreement = agreement;
    return this;
  }

   /**
   * Get agreement
   * @return agreement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAgreement() {
    return agreement;
  }


  public void setAgreement(String agreement) {
    
    
    
    this.agreement = agreement;
  }


  public ContractsGetCurrentContractByEmployeeIdResponseData startAt(String startAt) {
    
    
    
    
    this.startAt = startAt;
    return this;
  }

   /**
   * Get startAt
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-07-01", value = "")

  public String getStartAt() {
    return startAt;
  }


  public void setStartAt(String startAt) {
    
    
    
    this.startAt = startAt;
  }


  public ContractsGetCurrentContractByEmployeeIdResponseData endAt(String endAt) {
    
    
    
    
    this.endAt = endAt;
    return this;
  }

   /**
   * Get endAt
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-09-30", value = "")

  public String getEndAt() {
    return endAt;
  }


  public void setEndAt(String endAt) {
    
    
    
    this.endAt = endAt;
  }


  public ContractsGetCurrentContractByEmployeeIdResponseData comment(String comment) {
    
    
    
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Revisar contrato.", value = "")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    
    
    
    this.comment = comment;
  }


  public ContractsGetCurrentContractByEmployeeIdResponseData trialPeriod(ContractsGetCurrentContractByEmployeeIdResponseDataTrialPeriod trialPeriod) {
    
    
    
    
    this.trialPeriod = trialPeriod;
    return this;
  }

   /**
   * Get trialPeriod
   * @return trialPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContractsGetCurrentContractByEmployeeIdResponseDataTrialPeriod getTrialPeriod() {
    return trialPeriod;
  }


  public void setTrialPeriod(ContractsGetCurrentContractByEmployeeIdResponseDataTrialPeriod trialPeriod) {
    
    
    
    this.trialPeriod = trialPeriod;
  }


  public ContractsGetCurrentContractByEmployeeIdResponseData code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "001", value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public ContractsGetCurrentContractByEmployeeIdResponseData socialSecurityNumber(String socialSecurityNumber) {
    
    
    
    
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

   /**
   * Get socialSecurityNumber
   * @return socialSecurityNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345678", value = "")

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }


  public void setSocialSecurityNumber(String socialSecurityNumber) {
    
    
    
    this.socialSecurityNumber = socialSecurityNumber;
  }


  public ContractsGetCurrentContractByEmployeeIdResponseData holidays(ContractsGetCurrentContractByEmployeeIdResponseDataHolidays holidays) {
    
    
    
    
    this.holidays = holidays;
    return this;
  }

   /**
   * Get holidays
   * @return holidays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContractsGetCurrentContractByEmployeeIdResponseDataHolidays getHolidays() {
    return holidays;
  }


  public void setHolidays(ContractsGetCurrentContractByEmployeeIdResponseDataHolidays holidays) {
    
    
    
    this.holidays = holidays;
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
   * @return the ContractsGetCurrentContractByEmployeeIdResponseData instance itself
   */
  public ContractsGetCurrentContractByEmployeeIdResponseData putAdditionalProperty(String key, Object value) {
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
    ContractsGetCurrentContractByEmployeeIdResponseData contractsGetCurrentContractByEmployeeIdResponseData = (ContractsGetCurrentContractByEmployeeIdResponseData) o;
    return Objects.equals(this.id, contractsGetCurrentContractByEmployeeIdResponseData.id) &&
        Objects.equals(this.status, contractsGetCurrentContractByEmployeeIdResponseData.status) &&
        Objects.equals(this.jobCharge, contractsGetCurrentContractByEmployeeIdResponseData.jobCharge) &&
        Objects.equals(this.workdayType, contractsGetCurrentContractByEmployeeIdResponseData.workdayType) &&
        Objects.equals(this.contractType, contractsGetCurrentContractByEmployeeIdResponseData.contractType) &&
        Objects.equals(this.degree, contractsGetCurrentContractByEmployeeIdResponseData.degree) &&
        Objects.equals(this.agreement, contractsGetCurrentContractByEmployeeIdResponseData.agreement) &&
        Objects.equals(this.startAt, contractsGetCurrentContractByEmployeeIdResponseData.startAt) &&
        Objects.equals(this.endAt, contractsGetCurrentContractByEmployeeIdResponseData.endAt) &&
        Objects.equals(this.comment, contractsGetCurrentContractByEmployeeIdResponseData.comment) &&
        Objects.equals(this.trialPeriod, contractsGetCurrentContractByEmployeeIdResponseData.trialPeriod) &&
        Objects.equals(this.code, contractsGetCurrentContractByEmployeeIdResponseData.code) &&
        Objects.equals(this.socialSecurityNumber, contractsGetCurrentContractByEmployeeIdResponseData.socialSecurityNumber) &&
        Objects.equals(this.holidays, contractsGetCurrentContractByEmployeeIdResponseData.holidays)&&
        Objects.equals(this.additionalProperties, contractsGetCurrentContractByEmployeeIdResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, jobCharge, workdayType, contractType, degree, agreement, startAt, endAt, comment, trialPeriod, code, socialSecurityNumber, holidays, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractsGetCurrentContractByEmployeeIdResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    jobCharge: ").append(toIndentedString(jobCharge)).append("\n");
    sb.append("    workdayType: ").append(toIndentedString(workdayType)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    trialPeriod: ").append(toIndentedString(trialPeriod)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    holidays: ").append(toIndentedString(holidays)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("jobCharge");
    openapiFields.add("workdayType");
    openapiFields.add("contractType");
    openapiFields.add("degree");
    openapiFields.add("agreement");
    openapiFields.add("startAt");
    openapiFields.add("endAt");
    openapiFields.add("comment");
    openapiFields.add("trialPeriod");
    openapiFields.add("code");
    openapiFields.add("socialSecurityNumber");
    openapiFields.add("holidays");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContractsGetCurrentContractByEmployeeIdResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContractsGetCurrentContractByEmployeeIdResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractsGetCurrentContractByEmployeeIdResponseData is not found in the empty JSON string", ContractsGetCurrentContractByEmployeeIdResponseData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `jobCharge`
      if (jsonObj.get("jobCharge") != null && !jsonObj.get("jobCharge").isJsonNull()) {
        ContractsGetCurrentContractByEmployeeIdResponseDataJobCharge.validateJsonObject(jsonObj.getAsJsonObject("jobCharge"));
      }
      // validate the optional field `workdayType`
      if (jsonObj.get("workdayType") != null && !jsonObj.get("workdayType").isJsonNull()) {
        ContractsGetCurrentContractByEmployeeIdResponseDataWorkdayType.validateJsonObject(jsonObj.getAsJsonObject("workdayType"));
      }
      // validate the optional field `contractType`
      if (jsonObj.get("contractType") != null && !jsonObj.get("contractType").isJsonNull()) {
        ContractsGetCurrentContractByEmployeeIdResponseDataContractType.validateJsonObject(jsonObj.getAsJsonObject("contractType"));
      }
      // validate the optional field `degree`
      if (jsonObj.get("degree") != null && !jsonObj.get("degree").isJsonNull()) {
        ContractsGetCurrentContractByEmployeeIdResponseDataDegree.validateJsonObject(jsonObj.getAsJsonObject("degree"));
      }
      if ((jsonObj.get("agreement") != null && !jsonObj.get("agreement").isJsonNull()) && !jsonObj.get("agreement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement").toString()));
      }
      if ((jsonObj.get("startAt") != null && !jsonObj.get("startAt").isJsonNull()) && !jsonObj.get("startAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startAt").toString()));
      }
      if ((jsonObj.get("endAt") != null && !jsonObj.get("endAt").isJsonNull()) && !jsonObj.get("endAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endAt").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      // validate the optional field `trialPeriod`
      if (jsonObj.get("trialPeriod") != null && !jsonObj.get("trialPeriod").isJsonNull()) {
        ContractsGetCurrentContractByEmployeeIdResponseDataTrialPeriod.validateJsonObject(jsonObj.getAsJsonObject("trialPeriod"));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("socialSecurityNumber") != null && !jsonObj.get("socialSecurityNumber").isJsonNull()) && !jsonObj.get("socialSecurityNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `socialSecurityNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("socialSecurityNumber").toString()));
      }
      // validate the optional field `holidays`
      if (jsonObj.get("holidays") != null && !jsonObj.get("holidays").isJsonNull()) {
        ContractsGetCurrentContractByEmployeeIdResponseDataHolidays.validateJsonObject(jsonObj.getAsJsonObject("holidays"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractsGetCurrentContractByEmployeeIdResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractsGetCurrentContractByEmployeeIdResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractsGetCurrentContractByEmployeeIdResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractsGetCurrentContractByEmployeeIdResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractsGetCurrentContractByEmployeeIdResponseData>() {
           @Override
           public void write(JsonWriter out, ContractsGetCurrentContractByEmployeeIdResponseData value) throws IOException {
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
           public ContractsGetCurrentContractByEmployeeIdResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ContractsGetCurrentContractByEmployeeIdResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ContractsGetCurrentContractByEmployeeIdResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContractsGetCurrentContractByEmployeeIdResponseData
  * @throws IOException if the JSON string is invalid with respect to ContractsGetCurrentContractByEmployeeIdResponseData
  */
  public static ContractsGetCurrentContractByEmployeeIdResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractsGetCurrentContractByEmployeeIdResponseData.class);
  }

 /**
  * Convert an instance of ContractsGetCurrentContractByEmployeeIdResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

